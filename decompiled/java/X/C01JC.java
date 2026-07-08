package X;

import com.bytedance.effectcreatormobile.ckeapi.api.facestretch.LocalFaceStretchData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01JC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.ckeapi.api.facestretch.LocalFaceStretchData$Companion$fromStr$2", f = "FaceStretchData.kt", l = {}, m = "invokeSuspend")
public final class C01JC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super LocalFaceStretchData>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01JC(String str, InterfaceC1364105Vn<? super C01JC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01JC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LocalFaceStretchData localFaceStretchData;
        C1C7U.LIZ("LocalFaceStretchData$Companion@2821.fromStr$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String str = this.LL;
            c1227904rF.getClass();
            localFaceStretchData = (LocalFaceStretchData) C1227904rF.LIZIZ(str, LocalFaceStretchData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            localFaceStretchData = new LocalFaceStretchData(new ArrayList());
        }
        C1C7U.LIZIZ("LocalFaceStretchData$Companion@2821.fromStr$2");
        return localFaceStretchData;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super LocalFaceStretchData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
