package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y70, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.processmessage.ProcessMessageBodyUseCase$saveOrHandleMessages$2", f = "ProcessMessageBodyUseCase.kt", l = {}, m = "invokeSuspend")
public final class C0Y70 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y7T>, Object> {
    public final /* synthetic */ C0Y77 LL;
    public final /* synthetic */ MessageBody LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ C0Y82 LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y70(C0Y77 c0y77, MessageBody messageBody, String str, int i, String str2, int i2, Map<String, String> map, C0Y82 c0y82, long j, int i3, InterfaceC1364105Vn<? super C0Y70> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y77;
        this.LLILLJJLI = messageBody;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = str2;
        this.LLILZLL = i2;
        this.LLIZ = map;
        this.LLIZLLLIL = c0y82;
        this.LLJ = j;
        this.LLJI = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y70(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y7T c0y7t;
        C0Y73 c0y73;
        C0Y73 c0y732;
        C0Y72 c0y72LIZ;
        C0Y7K c0y7kInvoke;
        C0Y73 c0y733;
        C0Y72 c0y72LIZ2;
        C1C7U.LIZ("ProcessMessageBodyUseCase@da90.saveOrHandleMessages$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Y77 c0y77 = this.LL;
        MessageBody messageBody = this.LLILLJJLI;
        String str = this.LLILLL;
        int i = this.LLILZ;
        String str2 = this.LLILZIL;
        int i2 = this.LLILZLL;
        Map<String, String> map = this.LLIZ;
        C0Y82 c0y82 = this.LLIZLLLIL;
        long j = this.LLJ;
        int i3 = this.LLJI;
        C868780Y6i c868780Y6iLIZLLL = c0y77.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveOrHandleWithBadgeInfo save msg begin: body msgId ");
        sbLIZ.append(messageBody.server_message_id);
        sbLIZ.append(" msgSource ");
        sbLIZ.append(i);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SaveMessageBodyToDBUseCase", C2188811AlT.LIZIZ(sbLIZ), 4);
        C0Y72 c0y72LIZJ = C868510Y5h.LIZJ(messageBody);
        EnumC868520Y5i enumC868520Y5i = c0y72LIZJ.LIZ;
        EnumC868520Y5i enumC868520Y5i2 = EnumC868520Y5i.OK;
        if (enumC868520Y5i == enumC868520Y5i2) {
            if (c0y77.LIZ.LJIIIZ().LJJLIIIIJ.LJIILIIL.isEnabled()) {
                if (C0Y5Y.LIZIZ(messageBody)) {
                    c0y7kInvoke = c0y77.LJI.invoke(messageBody, Integer.valueOf(i2), Integer.valueOf(i), str2, c0y82, Long.valueOf(j));
                } else if (C0Y5X.LIZJ(messageBody)) {
                    c0y7kInvoke = c0y77.LJFF.invoke(messageBody, Integer.valueOf(i), str2, Integer.valueOf(i2), c0y82, Long.valueOf(j));
                } else {
                    c0y7t = c0y77.LIZJ(messageBody, str, i, map, i3);
                }
                boolean z = c0y7kInvoke instanceof C867580Y1s;
                if (z) {
                    c0y733 = C0Y76.LL;
                } else if (c0y7kInvoke instanceof C0Y3A) {
                    if (((C0Y3A) c0y7kInvoke).LJ == EnumC868890Y6t.ENTITY_MISSING) {
                        c0y733 = C0Y71.MISSING_ENTITY;
                    } else {
                        c0y733 = C0Y71.CMD_MSG_NOT_HANDLED;
                    }
                } else if (c0y7kInvoke instanceof C867630Y1x) {
                    c0y733 = C0Y75.LL;
                } else {
                    throw new C1954807lC();
                }
                if (!z && !(c0y7kInvoke instanceof C867630Y1x)) {
                    if (c0y7kInvoke instanceof C0Y3A) {
                        C0Y3A c0y3a = (C0Y3A) c0y7kInvoke;
                        int i4 = C868880Y6s.LIZIZ[c0y3a.LJ.ordinal()];
                        if (i4 != 1) {
                            String str3 = "";
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    EnumC868520Y5i enumC868520Y5i3 = EnumC868520Y5i.UNKNOWN;
                                    String str4 = c0y3a.LJFF;
                                    if (str4 == null) {
                                        str4 = "Unknown error";
                                    }
                                    c0y72LIZ2 = new C0Y72(enumC868520Y5i3, str4);
                                } else {
                                    EnumC868520Y5i enumC868520Y5i4 = EnumC868520Y5i.PROCESS_MSG_CMD_UNSUPPORTED_TYPE;
                                    String str5 = c0y3a.LJFF;
                                    if (str5 != null) {
                                        str3 = str5;
                                    }
                                    c0y72LIZ2 = new C0Y72(enumC868520Y5i4, str3);
                                }
                            } else {
                                EnumC868520Y5i enumC868520Y5i5 = EnumC868520Y5i.PROCESS_MSG_STATUS_DECODE_FAILED;
                                String str6 = c0y3a.LJFF;
                                if (str6 != null) {
                                    str3 = str6;
                                }
                                c0y72LIZ2 = new C0Y72(enumC868520Y5i5, str3);
                            }
                        } else {
                            c0y72LIZ2 = new C0Y72(EnumC868520Y5i.PROCESS_MSG_MISSING_ENTITY, c0y3a.LJFF);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c0y72LIZ2 = C0Y72.LIZ();
                }
                c0y7t = new C0Y7T(c0y733, null, false, c0y72LIZ2, true, c0y7kInvoke, null, 64);
            } else if (C0Y5Y.LIZIZ(messageBody)) {
                Pair<EnumC868870Y6r, String> pairInvoke = c0y77.LJ.invoke(messageBody, Integer.valueOf(i2), Integer.valueOf(i), str2, c0y82, Long.valueOf(j));
                EnumC868870Y6r first = pairInvoke.getFirst();
                int[] iArr = C868880Y6s.LIZ;
                int i5 = iArr[first.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        c0y732 = C0Y71.CMD_MSG_NOT_HANDLED;
                    } else {
                        c0y732 = C0Y71.MISSING_ENTITY;
                    }
                } else {
                    c0y732 = C0Y76.LL;
                }
                int i6 = iArr[pairInvoke.getFirst().ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                c0y72LIZ = new C0Y72(EnumC868520Y5i.UNKNOWN, pairInvoke.getSecond());
                            } else {
                                c0y72LIZ = new C0Y72(EnumC868520Y5i.PROCESS_MSG_CMD_UNSUPPORTED_TYPE, pairInvoke.getSecond());
                            }
                        } else {
                            c0y72LIZ = new C0Y72(EnumC868520Y5i.PROCESS_MSG_STATUS_DECODE_FAILED, pairInvoke.getSecond());
                        }
                    } else {
                        c0y72LIZ = new C0Y72(EnumC868520Y5i.PROCESS_MSG_MISSING_ENTITY, pairInvoke.getSecond());
                    }
                } else {
                    c0y72LIZ = C0Y72.LIZ();
                }
                c0y7t = new C0Y7T(c0y732, null, false, c0y72LIZ, true, null, null, 96);
            } else if (C0Y5X.LIZJ(messageBody)) {
                C0Y72 c0y72Invoke = c0y77.LIZLLL.invoke(messageBody, Integer.valueOf(i), str2, Integer.valueOf(i2), c0y82, Long.valueOf(j));
                if (c0y72Invoke.LIZ == enumC868520Y5i2) {
                    c0y73 = C0Y76.LL;
                } else {
                    c0y73 = C0Y71.CMD_MSG_NOT_HANDLED;
                }
                c0y7t = new C0Y7T(c0y73, null, false, c0y72Invoke, true, null, null, 96);
            } else {
                c0y7t = c0y77.LIZJ(messageBody, str, i, map, i3);
            }
        } else {
            C868780Y6i c868780Y6iLIZLLL2 = c0y77.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveOrHandleWithBadgeInfo save not enable: body msgId ");
            sbLIZ2.append(messageBody.server_message_id);
            sbLIZ2.append(" msgSource ");
            sbLIZ2.append(i);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "SaveMessageBodyToDBUseCase", C2188811AlT.LIZIZ(sbLIZ2), 4);
            c0y7t = new C0Y7T(C0Y71.MSG_NOT_ENABLED, null, false, c0y72LIZJ, C0Y5X.LIZJ(messageBody), null, null, 96);
        }
        C1C7U.LIZIZ("ProcessMessageBodyUseCase@da90.saveOrHandleMessages$2");
        return c0y7t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y7T> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
