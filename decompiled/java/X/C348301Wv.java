package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.ExpressionNode$run$evalContext$1$7$deferred$1", f = "ExpressionNode.kt", l = {109}, m = "invokeSuspend")
public final class C348301Wv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super JSONObject>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C348301Wv(String str, Object obj, long j, InterfaceC1364105Vn<? super C348301Wv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = obj;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C348301Wv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExpressionNode@8dd8.run$evalContext$1$7$deferred$1");
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
            C348501Wx c348501Wx = C348501Wx.LIZ;
            String str = this.LLILLJJLI;
            Object obj2 = this.LLILLL;
            long j = this.LLILZ;
            this.LL = 1;
            obj = c348501Wx.LIZ(str, obj2, j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ExpressionNode@8dd8.run$evalContext$1$7$deferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ExpressionNode@8dd8.run$evalContext$1$7$deferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super JSONObject> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
