package X;

import com.ss.android.ugc.aweme.creatortools.api.ShowCaseModel;
import com.ss.android.ugc.aweme.creatortools.api.ShowCaseRespModel;

/* JADX INFO: renamed from: X.10de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19291610de {
    public static final C19291610de LIZ = new C19291610de();
    public static ShowCaseModel LIZIZ;

    public static void LIZ(final C19291510dd c19291510dd, final C11NJ c11nj, final boolean z) {
        Object objCreate;
        if (C306500Bzs.LIZ() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            InterfaceC19291810dg.LIZ.getClass();
            InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ("https://oec-api.tiktokv.com");
            if (interfaceC2661011fLIZ != null) {
                objCreate = interfaceC2661011fLIZ.create(InterfaceC19291810dg.class);
            } else {
                objCreate = null;
            }
            ((InterfaceC19291810dg) objCreate).LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<ShowCaseRespModel>() { // from class: X.10df
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    if (z) {
                        C19291610de.LIZ.getClass();
                        C19291610de.LIZIZ = null;
                    }
                    InterfaceC19292010di interfaceC19292010di = c19291510dd;
                    if (interfaceC19292010di != null) {
                        interfaceC19292010di.LIZ(null);
                    }
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(ShowCaseRespModel showCaseRespModel) {
                    ShowCaseModel showCaseModel = showCaseRespModel.data;
                    if (z) {
                        C19291610de.LIZ.getClass();
                        C19291610de.LIZIZ = showCaseModel;
                    }
                    InterfaceC19292010di interfaceC19292010di = c19291510dd;
                    if (interfaceC19292010di != null) {
                        interfaceC19292010di.LIZ(showCaseModel);
                    }
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    c11nj.LIZ(interfaceC420801kM);
                }
            });
        }
    }
}
