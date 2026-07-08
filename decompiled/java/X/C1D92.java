package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.1D92, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D92 extends RoundedFrameLayout {
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    public C1D92(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final C422850Gi3 getImageView1() {
        return (C422850Gi3) this.LLILLL.getValue();
    }

    public final C422850Gi3 getImageView2() {
        return (C422850Gi3) this.LLILZ.getValue();
    }

    public final C422850Gi3 getImageView3() {
        return (C422850Gi3) this.LLILZIL.getValue();
    }

    public final C422850Gi3 getImageView4() {
        return (C422850Gi3) this.LLILZLL.getValue();
    }

    public final void LIZIZ(List<? extends C1331670kl3> list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        C337180DJs.LIZJ(getImageView1());
                        C337180DJs.LIZJ(getImageView2());
                        C337180DJs.LIZJ(getImageView3());
                        C337180DJs.LIZJ(getImageView4());
                        getImageView1().setPortionCode(C1D90.QUARTER_TOP_START);
                        getImageView2().setPortionCode(C1D90.QUARTER_TOP_END);
                        getImageView3().setPortionCode(C1D90.QUARTER_BOTTOM_START);
                        getImageView4().setPortionCode(C1D90.QUARTER_BOTTOM_END);
                        C1331670kl3 c1331670kl3 = (C1331670kl3) ListProtector.get(list, 0);
                        c1331670kl3.LJJ(getImageView1());
                        c1331670kl3.LJIIJJI();
                        C1331670kl3 c1331670kl32 = (C1331670kl3) ListProtector.get(list, 1);
                        c1331670kl32.LJJ(getImageView2());
                        c1331670kl32.LJIIJJI();
                        C1331670kl3 c1331670kl33 = (C1331670kl3) ListProtector.get(list, 2);
                        c1331670kl33.LJJ(getImageView3());
                        c1331670kl33.LJIIJJI();
                        C1331670kl3 c1331670kl34 = (C1331670kl3) ListProtector.get(list, 3);
                        c1331670kl34.LJJ(getImageView4());
                        c1331670kl34.LJIIJJI();
                        return;
                    }
                    C337180DJs.LIZJ(getImageView1());
                    C337180DJs.LIZJ(getImageView2());
                    C337180DJs.LIZJ(getImageView3());
                    C337180DJs.LIZ(getImageView4());
                    getImageView1().setPortionCode(C1D90.HALF_START);
                    getImageView2().setPortionCode(C1D90.QUARTER_TOP_END);
                    getImageView3().setPortionCode(C1D90.QUARTER_BOTTOM_END);
                    C1331670kl3 c1331670kl35 = (C1331670kl3) ListProtector.get(list, 0);
                    c1331670kl35.LJJ(getImageView1());
                    c1331670kl35.LJIIJJI();
                    C1331670kl3 c1331670kl36 = (C1331670kl3) ListProtector.get(list, 1);
                    c1331670kl36.LJJ(getImageView2());
                    c1331670kl36.LJIIJJI();
                    C1331670kl3 c1331670kl37 = (C1331670kl3) ListProtector.get(list, 2);
                    c1331670kl37.LJJ(getImageView3());
                    c1331670kl37.LJIIJJI();
                    return;
                }
                C337180DJs.LIZJ(getImageView1());
                C337180DJs.LIZJ(getImageView2());
                C337180DJs.LIZ(getImageView3());
                C337180DJs.LIZ(getImageView4());
                getImageView1().setPortionCode(C1D90.HALF_START);
                getImageView2().setPortionCode(C1D90.HALF_END);
                C1331670kl3 c1331670kl38 = (C1331670kl3) ListProtector.get(list, 0);
                c1331670kl38.LJJ(getImageView1());
                c1331670kl38.LJIIJJI();
                C1331670kl3 c1331670kl39 = (C1331670kl3) ListProtector.get(list, 1);
                c1331670kl39.LJJ(getImageView2());
                c1331670kl39.LJIIJJI();
                return;
            }
            C337180DJs.LIZJ(getImageView1());
            C337180DJs.LIZ(getImageView2());
            C337180DJs.LIZ(getImageView3());
            C337180DJs.LIZ(getImageView4());
            getImageView1().setPortionCode(null);
            C1331670kl3 c1331670kl310 = (C1331670kl3) ListProtector.get(list, 0);
            c1331670kl310.LJJ(getImageView1());
            c1331670kl310.LJIIJJI();
            return;
        }
        C337180DJs.LIZ(getImageView1());
        C337180DJs.LIZ(getImageView2());
        C337180DJs.LIZ(getImageView3());
        C337180DJs.LIZ(getImageView4());
    }

    public C1D92(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        FrameLayout.inflate(getContext(), R.layout.dpd, this);
        this.LLILLL = C452501pT.LIZIZ(new C1D93(this));
        this.LLILZ = C452501pT.LIZIZ(new C1D94(this));
        this.LLILZIL = C452501pT.LIZIZ(new C1D95(this));
        this.LLILZLL = C452501pT.LIZIZ(new C1D96(this));
    }
}
