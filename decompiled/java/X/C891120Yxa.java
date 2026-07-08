package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.MuteCallActionKt$toggleMuteCall$1", f = "MuteCallAction.kt", l = {90}, m = "invokeSuspend")
public final class C891120Yxa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891120Yxa(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C891120Yxa(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            String str = this.LLILLJJLI;
            EnumC889640YvC enumC889640YvC = EnumC889640YvC.SettingPersistentExtFieldID_VoipNotification;
            C891190Yxh c891190Yxh = new C891190Yxh();
            C891210Yxj c891210Yxj = new C891210Yxj();
            c891210Yxj.LIZLLL = C2286608xc.LJ(this.LLILLL);
            c891190Yxh.LJ = c891210Yxj.build();
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair(enumC889640YvC, c891190Yxh.build()));
            this.LL = 1;
            if (C889590Yv7.LIZJ(str, mapLIZJ, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
