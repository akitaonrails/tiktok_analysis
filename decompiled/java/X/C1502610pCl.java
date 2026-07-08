package X;

import com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile;
import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.userportrait.impl.service.standard.StandardAbility$storeRemotePortrait$1", f = "StandardAbility.kt", l = {}, m = "invokeSuspend")
public final class C1502610pCl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1502680pCs LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502610pCl(C1502680pCs c1502680pCs, InterfaceC1364105Vn<? super C1502610pCl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1502680pCs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1502610pCl(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJIILIIL;
        C1C7U.LIZ("StandardAbility@4d49.storeRemotePortrait$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C1502650pCp c1502650pCp : this.LL.LIZ) {
            IStarshipSolariaProfile iStarshipSolariaProfile = C0CP7.LIZ;
            c1502650pCp.getClass();
            String strLIZLLL = iStarshipSolariaProfile.LIZLLL(null);
            if (strLIZLLL != null) {
                C1502630pCn c1502630pCn = c1502650pCp.LIZ;
                if (c1502630pCn == null) {
                    synchronized (c1502650pCp) {
                        c1502630pCn = c1502650pCp.LIZ;
                        if (c1502630pCn == null) {
                            c1502630pCn = new C1502630pCn();
                            c1502650pCp.LIZ = c1502630pCn;
                        }
                    }
                }
                C087T c087t = (C087T) c1502630pCn.LIZJ.getValue();
                String str = c1502630pCn.LIZ;
                Keva keva = c087t.LIZ;
                strLIZLLL.toString();
                keva.storeString(str, strLIZLLL);
            }
        }
        for (C1502660pCq c1502660pCq : this.LL.LIZIZ) {
            String strLIZLLL2 = C0CP7.LIZ.LIZLLL(c1502660pCq.LIZ);
            if (strLIZLLL2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZLLL2)) != null) {
                c1502660pCq.LIZ(lLJIILIIL.longValue());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StandardAbility@4d49.storeRemotePortrait$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
