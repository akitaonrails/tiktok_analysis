package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS438S0200000_2;

/* JADX INFO: renamed from: X.05Xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {586}, m = "invokeSuspend")
public final class C1369805Xs extends C09AX implements InterfaceC1631620sYq<C05RG, Map<Object, ? extends Float>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ C05RG LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1381605aw<Object> LLILZIL;
    public final /* synthetic */ float LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369805Xs(float f, C1381605aw c1381605aw, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = obj;
        this.LLILZIL = c1381605aw;
        this.LLILZLL = f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float fLIZLLL;
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
            C05RG c05rg = this.LLILLJJLI;
            Float f = (Float) ((Map) this.LLILLL).get(this.LLILZ);
            if (f != null) {
                C817403Hg c817403Hg = new C817403Hg();
                if (Float.isNaN(this.LLILZIL.LIZLLL())) {
                    fLIZLLL = 0.0f;
                } else {
                    fLIZLLL = this.LLILZIL.LIZLLL();
                }
                c817403Hg.element = fLIZLLL;
                float fFloatValue = f.floatValue();
                float f2 = this.LLILZLL;
                InterfaceC1677030tk5<Float> interfaceC1677030tk5 = this.LLILZIL.LIZJ;
                AwS438S0200000_2 awS438S0200000_2 = new AwS438S0200000_2(c05rg, c817403Hg, 0);
                this.LLILLJJLI = null;
                this.LL = 1;
                if (C1677810tlL.LIZ(fLIZLLL, fFloatValue, f2, interfaceC1677030tk5, awS438S0200000_2, this) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C05RG c05rg, Map<Object, ? extends Float> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object obj = this.LLILZ;
        C1381605aw<Object> c1381605aw = this.LLILZIL;
        C1369805Xs c1369805Xs = new C1369805Xs(this.LLILZLL, c1381605aw, obj, interfaceC1364105Vn);
        c1369805Xs.LLILLJJLI = c05rg;
        c1369805Xs.LLILLL = map;
        return c1369805Xs.invokeSuspend(Unit.LIZ);
    }
}
