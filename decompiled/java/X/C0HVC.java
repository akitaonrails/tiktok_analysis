package X;

import Y.AgS165S0300000_6;
import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HVC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordInputUiExtKt$blockUserInputWhenRecordActivated$1", f = "RecordInputUiExt.kt", l = {194}, m = "invokeSuspend")
public final class C0HVC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EditText LLILLJJLI;
    public final /* synthetic */ C05YD<EnumC430090Gtj> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HVC(EditText editText, C05YD<? extends EnumC430090Gtj> c05yd, InterfaceC1364105Vn<? super C0HVC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editText;
        this.LLILLL = c05yd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HVC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, android.text.InputFilter[]] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordInputUiExtKt@d679.blockUserInputWhenRecordActivated$1");
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
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = this.LLILLJJLI.getFilters();
            C013C c013c = new C013C();
            C1629806Zs c1629806Zs = new C1629806Zs(C09IC.LJIILL(new C463000IDq(this.LLILLL, 51)));
            AgS165S0300000_6 agS165S0300000_6 = new AgS165S0300000_6(c259800zU, this.LLILLJJLI, c013c, 4);
            this.LL = 1;
            if (c1629806Zs.collect(agS165S0300000_6, this) == objLJFF) {
                C1C7U.LIZIZ("RecordInputUiExtKt@d679.blockUserInputWhenRecordActivated$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordInputUiExtKt@d679.blockUserInputWhenRecordActivated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
