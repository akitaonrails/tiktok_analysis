package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05G2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.StudioGetStudioInappSettings$getVideoInspirationSetting$1", f = "StudioGetStudioInappSettings.kt", l = {35}, m = "invokeSuspend")
public final class C05G2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C05G2(InterfaceC1364105Vn<? super C05G2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05G2(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("StudioGetStudioInappSettings@cfa9.getVideoInspirationSetting$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1891120zJO c1891120zJO = C1891120zJO.LIZ;
                this.LL = 1;
                obj = c1891120zJO.LIZIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StudioGetStudioInappSettings@cfa9.getVideoInspirationSetting$1");
                    return objLJFF;
                }
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inspiration_setting_");
            sbLIZ.append(C0XQ7.LJFF().getCurUserId());
            zBooleanValue = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getBoolean("inspiration_setting_enable", true);
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("StudioGetStudioInappSettings@cfa9.getVideoInspirationSetting$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C05G2(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
