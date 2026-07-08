package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.TakoServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$Companion$initInternal$1", f = "TakoServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1615306Ud extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1615306Ud(InterfaceC1364105Vn<? super C1615306Ud> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1615306Ud(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoServiceImpl$Companion@eb68.initInternal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C20232914Et c20232914Et = TakoServiceImpl.LJIIIIZZ;
            if (!TakoServiceImpl.LJIILLIIL) {
                TakoServiceImpl.LJIILLIIL = true;
                C0XQ7.LJFF().getCurUserId();
                C0XQ7.LJFF().LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0yZA
                    @Override // X.InterfaceC427710Gpt
                    public final void LLLLLLZZ(int i, User user, User user2) {
                        String uid;
                        String uid2;
                        if (i == 4) {
                            C18090076q.LIZ.getClass();
                            boolean z = true;
                            if (((Number) C18090076q.LIZIZ.getValue()).intValue() != 1) {
                                z = false;
                            }
                            if (z) {
                                if (user != null) {
                                    uid = user.getUid();
                                } else {
                                    uid = null;
                                }
                                if (user2 != null) {
                                    uid2 = user2.getUid();
                                } else {
                                    uid2 = null;
                                }
                                ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                                if (!TextUtils.equals(uid, uid2)) {
                                    C1863400yag.LIZ.getClass();
                                    C1863400yag.LIZ(null);
                                    C20232914Et c20232914Et2 = TakoServiceImpl.LJIIIIZZ;
                                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C112H(null), 2);
                                    if ((C07I5.LIZ() || C298780BnQ.LIZ()) && C14FR.LIZ.LJIIIIZZ()) {
                                        C20231914Ej.LIZIZ(null, null, false);
                                    }
                                    if (C20235814Fw.LIZ()) {
                                        C1862420yZ6.LIZ.getClass();
                                        C1862420yZ6.LIZJ = C1862420yZ6.LIZIZ.LJIIJ().getCurUserId();
                                    }
                                    if (C14FR.LIZ.LJIIIIZZ()) {
                                        C1860410yVr.LIZ();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C1863400yag.LIZ.getClass();
                            C1863400yag.LIZ(null);
                            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C112I(null), 2);
                            if ((C07I5.LIZ() || C298780BnQ.LIZ()) && C14FR.LIZ.LJIIIIZZ()) {
                                C20231914Ej.LIZIZ(null, null, false);
                            }
                            if (C20235814Fw.LIZ()) {
                                C1862420yZ6.LIZ.getClass();
                                C1862420yZ6.LIZJ = C1862420yZ6.LIZIZ.LJIIJ().getCurUserId();
                            }
                            if (!C14FR.LIZ.LJIIIIZZ()) {
                                return;
                            }
                            C1860410yVr.LIZ();
                        }
                    }
                });
            }
            if (!TakoServiceImpl.LJIIZILJ) {
                TakoServiceImpl.LJIIZILJ = true;
                ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).observerNetworkChange(new C0CSC() { // from class: X.06Ue
                    @Override // X.C0CSC
                    public final void LIZ(EnumC325100Com enumC325100Com) {
                        if (TakoServiceImpl.LJIJ == enumC325100Com) {
                            return;
                        }
                        C20232914Et c20232914Et2 = TakoServiceImpl.LJIIIIZZ;
                        TakoServiceImpl.LJIJ = enumC325100Com;
                        if (enumC325100Com != EnumC325100Com.STRONG) {
                            return;
                        }
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C320430ChF(null), 2);
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoServiceImpl$Companion@eb68.initInternal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1615306Ud(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
