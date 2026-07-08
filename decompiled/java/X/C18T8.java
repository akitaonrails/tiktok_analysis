package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18T8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.room.component.AiChatRoomLogicComponent$handleQuota$1", f = "AiChatRoomLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C18T8 extends C09AX implements Function2<C18TR<? extends C869590Y9l>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C18T8(InterfaceC1364105Vn<? super C18T8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18T8 c18t8 = new C18T8(interfaceC1364105Vn);
        c18t8.LL = obj;
        return c18t8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatRoomLogicComponent@1dfd.handleQuota$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C18TR c18tr = (C18TR) this.LL;
        Long lLJFF = null;
        if (c18tr instanceof C18TP) {
            C18TP c18tp = (C18TP) c18tr;
            if (c18tp.LIZJ != EnumC1778740wO8.GENERATE_FAILED) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AiChatRoomLogicComponent@1dfd.handleQuota$1");
                return unit;
            }
            C869590Y9l c869590Y9l = c18tp.LIZLLL.LIZ;
            if (c869590Y9l != null) {
                lLJFF = C2286608xc.LJFF(c869590Y9l.getMsgId());
            }
            Keva keva = C21289818Tg.LIZ;
            if (lLJFF != null) {
                lLJFF.longValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(lLJFF);
                sbLIZ.append("deduct_quota");
                if (C21289818Tg.LIZIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                    C869590Y9l c869590Y9l2 = c18tp.LIZLLL.LIZ;
                    if (c869590Y9l2 != null) {
                        C21289818Tg.LIZ(C2286608xc.LJFF(c869590Y9l2.getMsgId()), "refund_quota", new Runnable() { // from class: X.18T9
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("AiChatRoomLogicComponent@1dfd.handleQuota$1$1$1");
                                try {
                                    C1727006pY.LIZ.getClass();
                                    C1727006pY.LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("AiChatRoomLogicComponent@1dfd.handleQuota$1$1$1");
                            }
                        });
                    }
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AiChatRoomLogicComponent@1dfd.handleQuota$1");
            return unit2;
        }
        if (c18tr instanceof C18TN) {
            C869590Y9l c869590Y9l3 = ((C18TN) c18tr).LIZIZ.LIZ;
            if (c869590Y9l3 != null) {
                lLJFF = C2286608xc.LJFF(c869590Y9l3.getMsgId());
            }
            C21289818Tg.LIZ(lLJFF, "deduct_quota", new Runnable() { // from class: X.18TA
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AiChatRoomLogicComponent@1dfd.handleQuota$1$2");
                    try {
                        C1727006pY.LIZ.getClass();
                        C1727006pY.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AiChatRoomLogicComponent@1dfd.handleQuota$1$2");
                }
            });
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatRoomLogicComponent@1dfd.handleQuota$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C18TR<? extends C869590Y9l> c18tr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c18tr, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
