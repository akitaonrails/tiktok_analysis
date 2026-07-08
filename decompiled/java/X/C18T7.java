package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18T7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.component.AiChatMessageFeatureComponent$init$2", f = "AiChatMessageFeatureComponent.kt", l = {}, m = "invokeSuspend")
public final class C18T7 extends C09AX implements Function2<InterfaceC1157570gEF<? extends C909930Zmp>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C18T7(InterfaceC1364105Vn<? super C18T7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18T7 c18t7 = new C18T7(interfaceC1364105Vn);
        c18t7.LL = obj;
        return c18t7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatMessageFeatureComponent@a7b8.init$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1157570gEF interfaceC1157570gEF = (InterfaceC1157570gEF) this.LL;
        if (interfaceC1157570gEF instanceof C1157450gE3) {
            C869590Y9l c869590Y9l = ((C909930Zmp) ((C1157450gE3) interfaceC1157570gEF).LIZ).LIZ;
            Keva keva = C21289818Tg.LIZ;
            if (c869590Y9l != null && (!C0ZDX.LJJJJIZL(c869590Y9l) || c869590Y9l.getMsgId() > 0)) {
                long jLIZIZ = C21289818Tg.LIZIZ(c869590Y9l);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("markConversationLastReadTime index=");
                sbLIZ.append(c869590Y9l.getIndex());
                sbLIZ.append(", lastReadTime=");
                sbLIZ.append(jLIZIZ);
                C21290818Tq.LIZJ("vp_message_read_time", C2188811AlT.LIZIZ(sbLIZ));
                Keva keva2 = C21289818Tg.LIZ;
                keva2.storeLong("last_read_time", jLIZIZ);
                keva2.storeLong("last_read_index", c869590Y9l.getIndex());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatMessageFeatureComponent@a7b8.init$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends C909930Zmp> interfaceC1157570gEF, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
