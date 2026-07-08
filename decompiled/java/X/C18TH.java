package X;

import Y.ARunnableS101S0200000_32;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18TH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.room.component.AiChatRoomMobComponent$onCreate$1", f = "AiChatRoomMobComponent.kt", l = {}, m = "invokeSuspend")
public final class C18TH extends C09AX implements Function2<C18TR<? extends C869590Y9l>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C18TG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18TH(C18TG c18tg, InterfaceC1364105Vn<? super C18TH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c18tg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18TH c18th = new C18TH(this.LLILLJJLI, interfaceC1364105Vn);
        c18th.LL = obj;
        return c18th;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatRoomMobComponent@2185.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C18TR<? extends C869590Y9l> c18tr = (C18TR) this.LL;
        C18TG c18tg = this.LLILLJJLI;
        c18tg.LLILZ = c18tr;
        Long lLJFF = null;
        if (c18tr instanceof C18TO) {
            C869590Y9l c869590Y9l = ((C18TO) c18tr).LIZIZ.LIZ;
            if (c869590Y9l != null) {
                lLJFF = C2286608xc.LJFF(c869590Y9l.getMsgId());
            }
            C21289818Tg.LIZ(lLJFF, "generate_success", new ARunnableS101S0200000_32(this.LLILLJJLI, c18tr, 20));
        } else if (c18tr instanceof C18TP) {
            C18TP c18tp = (C18TP) c18tr;
            if (c18tp.LIZJ != EnumC1778740wO8.GENERATE_FAILED) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AiChatRoomMobComponent@2185.onCreate$1");
                return unit;
            }
            C869590Y9l c869590Y9l2 = c18tp.LIZLLL.LIZ;
            if (c869590Y9l2 != null) {
                lLJFF = C2286608xc.LJFF(c869590Y9l2.getMsgId());
            }
            C21289818Tg.LIZ(lLJFF, "generate_failed", new ARunnableS101S0200000_32(this.LLILLJJLI, c18tr, 21));
        } else if (c18tr instanceof C18TQ) {
            C18UJ c18ujZ1 = c18tg.Z1();
            C869590Y9l c869590Y9l3 = ((C18TQ) c18tr).LIZ.LIZ;
            if (c869590Y9l3 != null) {
                lLJFF = Long.valueOf(c869590Y9l3.getMsgId());
            }
            C21289818Tg.LIZ(lLJFF, "generate_start", new ARunnableS101S0200000_32(c869590Y9l3, c18ujZ1, 19));
        } else if (c18tr instanceof C18TM) {
            C869590Y9l c869590Y9l4 = ((C18TM) c18tr).LIZ.LIZ;
            if (c869590Y9l4 != null) {
                lLJFF = C2286608xc.LJFF(c869590Y9l4.getMsgId());
            }
            C21289818Tg.LIZ(lLJFF, "generate_failed", new ARunnableS101S0200000_32(this.LLILLJJLI, c18tr, 22));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatRoomMobComponent@2185.onCreate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C18TR<? extends C869590Y9l> c18tr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c18tr, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
