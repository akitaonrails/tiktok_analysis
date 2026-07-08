package X;

import android.graphics.drawable.Drawable;
import com.bytedance.touchpoint.api.model.FeedToast;
import kotlin.Pair;

/* JADX INFO: renamed from: X.189n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@InterfaceC20647615qs("coin_incentive_share")
public final class C212385189n extends AbstractC20660815t0 {
    public final FeedToast LL;
    public final boolean LLILLJJLI;
    public final int[] LLILLL;
    public final Pair<Integer, Integer> LLILZ;
    public final Drawable LLILZIL;
    public final InterfaceC212382189k LLILZLL;
    public final int LLIZ;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        int[] iArr = this.LLILLL;
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i <= 0) {
                return false;
            }
        }
        Pair<Integer, Integer> pair = this.LLILZ;
        return pair != null && pair.getFirst().intValue() > 0 && this.LLILZ.getSecond().intValue() > 0 && this.LLILLJJLI && this.LL != null && this.LLILZIL != null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLIZ;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.189m] */
    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        int[] iArr;
        Pair<Integer, Integer> pair;
        FeedToast feedToast;
        Drawable drawable;
        if (canShow() && (iArr = this.LLILLL) != null && (pair = this.LLILZ) != null && (feedToast = this.LL) != null && (drawable = this.LLILZIL) != null) {
            new C212381189j(c688120Qyw.LIZ, feedToast, pair, iArr, drawable, new InterfaceC212382189k() { // from class: X.189m
                @Override // X.InterfaceC212382189k
                public final void LIZIZ() {
                    InterfaceC212382189k interfaceC212382189k = this.LIZ.LLILZLL;
                    if (interfaceC212382189k != null) {
                        interfaceC212382189k.LIZIZ();
                    }
                }

                @Override // X.InterfaceC212382189k
                public final void onShow() {
                    InterfaceC212382189k interfaceC212382189k = this.LIZ.LLILZLL;
                    if (interfaceC212382189k != null) {
                        interfaceC212382189k.onShow();
                    }
                }

                @Override // X.InterfaceC212382189k
                public final void LIZ(boolean z) {
                    InterfaceC212382189k interfaceC212382189k = this.LIZ.LLILZLL;
                    if (interfaceC212382189k != null) {
                        interfaceC212382189k.LIZ(z);
                    }
                    c20656615sK.LIZ();
                }
            }).LIZLLL();
        } else {
            c20656615sK.LIZ();
        }
    }

    public C212385189n(InterfaceC20660615sy interfaceC20660615sy, FeedToast feedToast, boolean z, int[] iArr, Pair pair, Drawable drawable, C733610Sq7 c733610Sq7) {
        super(interfaceC20660615sy);
        this.LL = feedToast;
        this.LLILLJJLI = z;
        this.LLILLL = iArr;
        this.LLILZ = pair;
        this.LLILZIL = drawable;
        this.LLILZLL = c733610Sq7;
        this.LLIZ = 220;
    }
}
