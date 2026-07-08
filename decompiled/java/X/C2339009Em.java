package X;

import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.artifact.AIGCWorkflowArtifactFactoryImpl$getValue$2$deserializedValue$1", f = "AIGCWorkflowArtifactFactoryImpl.kt", l = {}, m = "invokeSuspend")
public final class C2339009Em extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Type LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2339009Em(String str, Type type, InterfaceC1364105Vn<? super C2339009Em> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = type;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2339009Em(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowArtifactFactoryImpl@9f6e.getValue$2$deserializedValue$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ConcurrentHashMap<Class<?>, Boolean> concurrentHashMap = C2338909El.LIZ;
        Object objLIZ = C2338909El.LIZ(this.LL, this.LLILLJJLI);
        C1C7U.LIZIZ("AIGCWorkflowArtifactFactoryImpl@9f6e.getValue$2$deserializedValue$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
