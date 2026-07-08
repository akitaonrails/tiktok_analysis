package X;

import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.16Hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20749416Hk implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$0(C20749416Hk c20749416Hk) {
    }

    public static final /* synthetic */ void LIZIZ$1(C20749416Hk c20749416Hk) {
    }

    public static final /* synthetic */ void LIZIZ$2(C20749416Hk c20749416Hk) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
        }
    }

    public static final void LIZ$0(C20749416Hk c20749416Hk) {
        C204599154b c204599154b = (C204599154b) c20749416Hk.l0;
        c204599154b.getClass();
        C20440014yU.LJIIJ.LIZ = new C204603154f(c204599154b);
        c204599154b.LLJILLL.LJI = null;
        c204599154b.LJ(false);
    }

    public static final void LIZ$1(C20749416Hk c20749416Hk) {
        ((C204605154h) c20749416Hk.l0).LJII();
    }

    public static final void LIZ$2(C20749416Hk c20749416Hk) {
        InterfaceC207241167r interfaceC207241167r = (InterfaceC207241167r) c20749416Hk.l0;
        final User userLIZLLL = C20639815pc.LIZLLL(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser());
        final C207242167s c207242167s = (C207242167s) interfaceC207241167r;
        C207245167v c207245167v = c207242167s.LIZ;
        if (c207245167v.LJIIIZ != null) {
            c207245167v.LIZIZ = userLIZLLL;
            c207245167v.LJIIL("UserCenter_loginCallback").LIZ(new InterfaceC19474811He<InterfaceC2262081DgM>() { // from class: X.167t
                @Override // X.InterfaceC19474811He
                public final void onError(Throwable th) {
                }

                @Override // X.InterfaceC19474811He
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC19474811He
                public final void onSuccess(InterfaceC2262081DgM interfaceC2262081DgM) {
                    InterfaceC2262081DgM interfaceC2262081DgM2 = interfaceC2262081DgM;
                    C11RK<InterfaceC2262081DgM> c11rk = c207242167s.LIZ.LJIIIZ;
                    if (c11rk != null) {
                        c11rk.onNext(interfaceC2262081DgM2);
                        c207242167s.LIZ.LJIIIZ.onComplete();
                        c207242167s.LIZ.LJIIIZ = null;
                    }
                    C0KXI c0kxi = new C0KXI();
                    c0kxi.LIZ = true;
                    c0kxi.LIZIZ = userLIZLLL;
                    C784440Upu.LIZ().LIZIZ(c0kxi);
                    c207242167s.LIZ.LJI.onNext(new C784060UpI(EnumC1098720ehK.Login, userLIZLLL));
                    c207242167s.LIZ.LJJI(interfaceC2262081DgM2);
                }
            });
        }
    }

    public C20749416Hk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
