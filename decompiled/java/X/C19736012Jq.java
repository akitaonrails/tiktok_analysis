package X;

import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12Jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19736012Jq {
    public final C01GW LIZ;
    public final /* synthetic */ C19735912Jp LIZIZ;

    public final boolean LIZJ() {
        return ((Boolean) this.LIZ.getValue()).booleanValue();
    }

    public C19736012Jq(C19735912Jp c19735912Jp) {
        this.LIZIZ = c19735912Jp;
        this.LIZ = C452501pT.LIZIZ(new AwS573S0100000_29(c19735912Jp, 518));
    }

    public final float LIZ(int i) {
        float mPercentRange;
        float mAttrsBarPadding;
        int iMin = Math.min(this.LIZIZ.getMMaxPercent(), Math.max(this.LIZIZ.getMMinPercent(), i));
        boolean zLIZJ = LIZJ();
        if (!zLIZJ) {
            mPercentRange = (iMin - this.LIZIZ.getMMinPercent()) * this.LIZIZ.getMPercentStepLength();
            mAttrsBarPadding = this.LIZIZ.getMAttrsBarPadding();
        } else if (zLIZJ) {
            mPercentRange = ((this.LIZIZ.getMPercentRange() - iMin) + this.LIZIZ.getMMinPercent()) * this.LIZIZ.getMPercentStepLength();
            mAttrsBarPadding = this.LIZIZ.getMAttrsBarPadding();
        } else {
            throw new C1954807lC();
        }
        return mPercentRange + mAttrsBarPadding;
    }

    public final int LIZIZ(float f) {
        int mPercentRange;
        int mMinPercent;
        int mMaxPercent;
        int i;
        if (f < this.LIZIZ.getMAttrsBarPadding() - C11VU.LIZIZ(10.0f, this.LIZIZ.getContext())) {
            if (LIZJ()) {
                mMaxPercent = this.LIZIZ.getMMaxPercent();
            } else {
                mMaxPercent = this.LIZIZ.getMMinPercent();
            }
        } else if (f > ScreenUtils.getScreenWidth(C786410Ut5.N3(this.LIZIZ.getContext())) - (this.LIZIZ.getMAttrsBarPadding() - C11VU.LIZIZ(10.0f, this.LIZIZ.getContext()))) {
            if (LIZJ()) {
                mMaxPercent = this.LIZIZ.getMMinPercent();
            } else {
                mMaxPercent = this.LIZIZ.getMMaxPercent();
            }
        } else {
            boolean zLIZJ = LIZJ();
            if (!zLIZJ) {
                mMinPercent = (int) ((f - this.LIZIZ.getMAttrsBarPadding()) / this.LIZIZ.getMPercentStepLength());
                mPercentRange = this.LIZIZ.getMMinPercent();
            } else if (zLIZJ) {
                mPercentRange = this.LIZIZ.getMPercentRange() - ((int) ((f - this.LIZIZ.getMAttrsBarPadding()) / this.LIZIZ.getMPercentStepLength()));
                mMinPercent = this.LIZIZ.getMMinPercent();
            } else {
                throw new C1954807lC();
            }
            mMaxPercent = mMinPercent + mPercentRange;
        }
        C19735912Jp c19735912Jp = this.LIZIZ;
        int i2 = c19735912Jp.LLILLJJLI;
        if ((i2 != 0 || ((i = c19735912Jp.LLIZLLLIL) != i2 && i != c19735912Jp.LLILLL)) && mMaxPercent >= c19735912Jp.getMDefaultPercent() - 2 && mMaxPercent <= this.LIZIZ.getMDefaultPercent() + 2) {
            mMaxPercent = this.LIZIZ.getMDefaultPercent();
        }
        return Math.min(Math.max(this.LIZIZ.getMMinPercent(), mMaxPercent), this.LIZIZ.getMMaxPercent());
    }
}
