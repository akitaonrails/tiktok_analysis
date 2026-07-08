package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1602, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1602 implements C160K {
    public final InterfaceC20703115zp LL;
    public final Function1<C160Z, Unit> LLILLJJLI;
    public final Function0<C160B> LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // X.C160K
    public final void EK() {
    }

    @Override // X.C160K
    public final void cL2(boolean z) {
    }

    @Override // X.C160K
    public final void vD2(C0Q69 c0q69) {
    }

    @Override // X.C160K
    public final void En1(VideoItemParams videoItemParams) {
        LIZ(false);
    }

    public final void LIZ(boolean z) {
        this.LLILZIL = z;
        this.LLILLJJLI.invoke(new C160Z(z));
    }

    @Override // X.C160K
    public final void PU1(Context context) {
        boolean z;
        Aweme aweme;
        if (C0A7T.LIZ()) {
            if (context != null && C0SXF.LJIL(context)) {
                z = true;
            } else {
                z = false;
            }
            if (this.LLILLL.invoke() != C160B.EXPANDED) {
                C20703015zo c20703015zo = C20703015zo.LIZ;
                VideoItemParams videoItemParams = this.LL.getVideoItemParams();
                if (videoItemParams != null) {
                    aweme = videoItemParams.getAweme();
                } else {
                    aweme = null;
                }
                boolean z2 = this.LLILZIL;
                boolean z3 = this.LLILZ;
                c20703015zo.getClass();
                if (C20703015zo.LIZ(aweme, z2, z, z3)) {
                    LIZ(true);
                    C746760TRa.LIZ().LJJJLL(C746760TRa.LIZ().LJIILIIL() + 1);
                    C746760TRa.LIZ().LJJII(System.currentTimeMillis());
                }
            }
        }
    }

    public AnonymousClass1602(InterfaceC20703115zp interfaceC20703115zp, C160P c160p, C160N c160n) {
        this.LL = interfaceC20703115zp;
        this.LLILLJJLI = c160n;
        this.LLILLL = c160p;
    }
}
