package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import njp.a;

/* JADX INFO: renamed from: X.0Dtq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.EffectRestoreNodesKt$reverseTemplateNode$1", f = "EffectRestoreNodes.kt", l = {54}, m = "invokeSuspend")
public final class C353720Dtq extends C09AX implements Function2<C353730Dtr, InterfaceC1364105Vn<? super NLETemplateModel>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C353720Dtq(InterfaceC1364105Vn<? super C353720Dtq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353720Dtq c353720Dtq = new C353720Dtq(interfaceC1364105Vn);
        c353720Dtq.LLILLJJLI = obj;
        return c353720Dtq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("EffectRestoreNodesKt@b332.reverseTemplateNode$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                Object obj3 = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
                obj2 = obj3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C353730Dtr c353730Dtr = (C353730Dtr) this.LLILLJJLI;
            NLETemplateModel nLETemplateModel = c353730Dtr.LIZ;
            boolean zLLIIIILZ = C351220Dpo.LLIIIILZ(nLETemplateModel);
            obj2 = nLETemplateModel;
            if (zLLIIIILZ) {
                C353570Dtb c353570Dtb = new C353570Dtb(c353730Dtr.LIZIZ);
                AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(423);
                this.LLILLJJLI = nLETemplateModel;
                this.LL = 1;
                Object objLIZIZ = c353570Dtb.LIZIZ(nLETemplateModel, aFwS234S0000000_5, this);
                obj2 = nLETemplateModel;
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("EffectRestoreNodesKt@b332.reverseTemplateNode$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("EffectRestoreNodesKt@b332.reverseTemplateNode$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C353730Dtr c353730Dtr, InterfaceC1364105Vn<? super NLETemplateModel> interfaceC1364105Vn) {
        return ((a) create(c353730Dtr, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
