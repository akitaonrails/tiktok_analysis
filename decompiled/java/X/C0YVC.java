package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YVC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamDataRepositoryImpl$deletePersistedData$1", f = "StreamDataRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class C0YVC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Set<String> LLILLJJLI;
    public final /* synthetic */ C0YVE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YVC(Set<String> set, C0YVE c0yve, InterfaceC1364105Vn<? super C0YVC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = set;
        this.LLILLL = c0yve;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0YVC c0yvc = new C0YVC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0yvc.LL = obj;
        return c0yvc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamDataRepositoryImpl@36bb.deletePersistedData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set<String> set = this.LLILLJJLI;
        C0YVE c0yve = this.LLILLL;
        try {
            for (String str : set) {
                c0yve.getClass();
                InterfaceC870590YDh interfaceC870590YDhLJIIJ = C0YVE.LJIIJ();
                if (interfaceC870590YDhLJIIJ != null) {
                    Boolean.valueOf(interfaceC870590YDhLJIIJ.LLJJIJI(str, "im_streaming_data"));
                }
                InterfaceC870590YDh interfaceC870590YDhLJIIJ2 = C0YVE.LJIIJ();
                if (interfaceC870590YDhLJIIJ2 != null) {
                    Boolean.valueOf(interfaceC870590YDhLJIIJ2.LLJJIJI(str, "im_streaming_business_scene"));
                }
                InterfaceC870590YDh interfaceC870590YDhLJIIJ3 = C0YVE.LJIIJ();
                if (interfaceC870590YDhLJIIJ3 != null) {
                    Boolean.valueOf(interfaceC870590YDhLJIIJ3.LLJJIJI(str, "im_streaming_cancelled"));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamDataRepositoryImpl@36bb.deletePersistedData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
