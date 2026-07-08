package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HBZ {
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public Bitmap LIZJ;
    public int LIZLLL;

    public C0HBZ() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZ = C452501pT.LIZ(enumC452301pR, AFwS192S0000000_6.get$arr$(590));
        this.LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS192S0000000_6.get$arr$(589));
        this.LIZLLL = -1;
    }

    public static Object LIZ(UrlModel urlModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (urlModel == null) {
            Integer numLJ = C2286608xc.LJ(1);
            C189200o6.m2constructorimpl(numLJ);
            c23260099m.resumeWith(numLJ);
        } else {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LJIIIIZZ.LJIILJJIL(new InterfaceC605070NoH() { // from class: X.01sb
                @Override // X.InterfaceC605070NoH
                public final void onCanceled() {
                }

                @Override // X.InterfaceC605070NoH
                public final void LIZ(File file) {
                    InterfaceC1364105Vn<Integer> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(2);
                    interfaceC1364105Vn2.resumeWith(2);
                }

                @Override // X.InterfaceC605070NoH
                public final void onFailed(Throwable th) {
                    InterfaceC1364105Vn<Integer> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(1);
                    interfaceC1364105Vn2.resumeWith(1);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
