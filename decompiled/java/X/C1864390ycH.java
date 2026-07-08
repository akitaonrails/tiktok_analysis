package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ycH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoImageUploadManager$fetchValidUploadAuthConfig$fetchRemoteAuthConfig$1", f = "TakoImageUploadManager.kt", l = {88}, m = "invokeSuspend")
public final class C1864390ycH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ Function1<TakoImageUploadAuthConfig, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864390ycH(Integer num, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = num;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1864390ycH(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJI;
        C1C7U.LIZ("TakoImageUploadManager@928f.fetchValidUploadAuthConfig$fetchRemoteAuthConfig$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            this.LL = 1;
            obj = c1863980ybc.LJIIIIZZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoImageUploadManager@928f.fetchValidUploadAuthConfig$fetchRemoteAuthConfig$1");
                return objLJFF;
            }
        }
        TakoImageUploadAuthConfig takoImageUploadAuthConfig = (TakoImageUploadAuthConfig) obj;
        if (C20188913z5.LIZJ(takoImageUploadAuthConfig, this.LLILLJJLI)) {
            C1860520yW2.LIZ.getClass();
            Keva kevaLJIIL = C1860520yW2.LJIIL();
            if (takoImageUploadAuthConfig != null) {
                try {
                    C1227904rF.LIZ.getClass();
                    strLJI = C1227904rF.LJI(takoImageUploadAuthConfig);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (strLJI == null) {
                    strLJI = "";
                }
                kevaLJIIL.storeString("image_upload_auth_config", strLJI);
                Function1<TakoImageUploadAuthConfig, Unit> function1 = this.LLILLL;
                C1864400ycI.LIZIZ = takoImageUploadAuthConfig;
                function1.invoke(takoImageUploadAuthConfig);
            } else {
                strLJI = "";
                kevaLJIIL.storeString("image_upload_auth_config", strLJI);
                Function1<TakoImageUploadAuthConfig, Unit> function12 = this.LLILLL;
                C1864400ycI.LIZIZ = takoImageUploadAuthConfig;
                function12.invoke(takoImageUploadAuthConfig);
            }
        } else {
            this.LLILLL.invoke(takoImageUploadAuthConfig);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageUploadManager@928f.fetchValidUploadAuthConfig$fetchRemoteAuthConfig$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
