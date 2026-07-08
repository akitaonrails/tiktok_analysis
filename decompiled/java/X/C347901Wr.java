package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.PackageExecutionNode$starshipRunPitayaTask$1", f = "PackageExecutionNode.kt", l = {96}, m = "invokeSuspend")
public final class C347901Wr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<JSONObject> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C347901Wr(C259800zU<JSONObject> c259800zU, String str, Map<String, ? extends Object> map, long j, InterfaceC1364105Vn<? super C347901Wr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = str;
        this.LLILZIL = map;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C347901Wr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<JSONObject> c259800zU;
        T t;
        C1C7U.LIZ("PackageExecutionNode@d1e9.starshipRunPitayaTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
                t = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = this.LLILLL;
            C348501Wx c348501Wx = C348501Wx.LIZ;
            String str = this.LLILZ;
            Map<String, Object> map = this.LLILZIL;
            long j = this.LLILZLL;
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            Object objLIZ = c348501Wx.LIZ(str, map, j, this);
            t = objLIZ;
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PackageExecutionNode@d1e9.starshipRunPitayaTask$1");
                return objLJFF;
            }
        }
        c259800zU.element = t;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PackageExecutionNode@d1e9.starshipRunPitayaTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
