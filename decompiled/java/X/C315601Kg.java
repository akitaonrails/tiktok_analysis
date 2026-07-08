package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.chain.DecorationAigcWarningDialogCheckHandler$launchNextHandler$1", f = "DecorationAigcWarningDialogCheckHandler.kt", l = {95}, m = "invokeSuspend")
public final class C315601Kg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1816340xMm LLILLJJLI;
    public final /* synthetic */ C1816270xMf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315601Kg(C1816340xMm c1816340xMm, C1816270xMf c1816270xMf, InterfaceC1364105Vn<? super C315601Kg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1816340xMm;
        this.LLILLL = c1816270xMf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315601Kg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DecorationAigcWarningDialogCheckHandler@d215.launchNextHandler$1");
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
            AbstractC233200vC abstractC233200vC = this.LLILLJJLI.LIZ;
            if (abstractC233200vC != null) {
                C1816270xMf c1816270xMf = this.LLILLL;
                this.LL = 1;
                if (abstractC233200vC.LIZ(c1816270xMf, this) == objLJFF) {
                    C1C7U.LIZIZ("DecorationAigcWarningDialogCheckHandler@d215.launchNextHandler$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DecorationAigcWarningDialogCheckHandler@d215.launchNextHandler$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
