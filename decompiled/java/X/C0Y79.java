package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Y79, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.processmessage.BatchProcessMessageBodyUseCase$batchSaveNormalMessages$2", f = "BatchProcessMessageBodyUseCase.kt", l = {100}, m = "invokeSuspend")
public final class C0Y79 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0Y7T>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0Y7J LLILLL;
    public final /* synthetic */ List<MessageBody> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y79(int i, C0Y7J c0y7j, String str, List list, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0y7j;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y79(this.LLILZIL, this.LLILLL, this.LLILZLL, this.LLILZ, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Long l;
        Collection collection;
        Object objLJI = obj;
        C1C7U.LIZ("BatchProcessMessageBodyUseCase@cd62.batchSaveNormalMessages$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Collection collection2 = (Collection) this.LL;
                C155000ia.LIZIZ(objLJI);
                collection = collection2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            ArrayList arrayList = new ArrayList();
            C868780Y6i c868780Y6iLIZLLL = this.LLILLL.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveOrHandleWithBadgeInfo save msg begin: body msgId ");
            sbLIZ.append(new C08LY(new C1939607ik(this.LLILZ), AFwS248S0000000_14.get$arr$(528)));
            sbLIZ.append(" msgSource ");
            sbLIZ.append(this.LLILZIL);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SaveMessageBodyToDBUseCase", C2188811AlT.LIZIZ(sbLIZ), 4);
            List<MessageBody> list = this.LLILZ;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (MessageBody messageBody : list) {
                if (messageBody == null) {
                    arrayList2.add(messageBody);
                } else {
                    arrayList3.add(messageBody);
                }
            }
            Pair pair = new Pair(arrayList2, arrayList3);
            List<MessageBody> list2 = (List) pair.getFirst();
            List list3 = (List) pair.getSecond();
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new C0Y7T(C0Y71.EMPTY_MSG_BODY, null, false, new C0Y72(EnumC868520Y5i.MESSAGE_BODY_NULL, "process_msg_body_use_case"), false, null, (MessageBody) it2.next(), 32));
            }
            arrayList.addAll(arrayList4);
            C868780Y6i c868780Y6iLIZLLL2 = this.LLILLL.LIZ.LIZLLL();
            StringBuilder sb = new StringBuilder("saveOrHandleWithBadgeInfo save body null: body msgId ");
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (MessageBody messageBody2 : list2) {
                if (messageBody2 != null) {
                    l = messageBody2.server_message_id;
                } else {
                    l = null;
                }
                arrayList5.add(l);
            }
            sb.append(arrayList5);
            sb.append(" msgSource ");
            sb.append(this.LLILZIL);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "SaveMessageBodyToDBUseCase", sb.toString(), 4);
            ArrayList<MessageBody> arrayList6 = new ArrayList();
            for (Object obj2 : list3) {
                if (obj2 != null) {
                    arrayList6.add(obj2);
                }
            }
            ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
            for (MessageBody messageBody3 : arrayList6) {
                arrayList7.add(new Pair(messageBody3, C868510Y5h.LIZJ(messageBody3)));
            }
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            for (Object obj3 : arrayList7) {
                if (((C0Y72) ((Pair) obj3).getSecond()).LIZ == EnumC868520Y5i.OK) {
                    arrayList8.add(obj3);
                } else {
                    arrayList9.add(obj3);
                }
            }
            Pair pair2 = new Pair(arrayList8, arrayList9);
            List list4 = (List) pair2.getFirst();
            List<Pair> list5 = (List) pair2.getSecond();
            C0Y7J c0y7j = this.LLILLL;
            int i2 = this.LLILZIL;
            ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(list5, 10));
            for (Pair pair3 : list5) {
                MessageBody messageBody4 = (MessageBody) pair3.getFirst();
                C0Y72 c0y72 = (C0Y72) pair3.getSecond();
                C868780Y6i c868780Y6iLIZLLL3 = c0y7j.LIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("saveOrHandleWithBadgeInfo save not enable: body msgId ");
                sbLIZ2.append(messageBody4.server_message_id);
                sbLIZ2.append(" msgSource ");
                sbLIZ2.append(i2);
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "SaveMessageBodyToDBUseCase", C2188811AlT.LIZIZ(sbLIZ2), 4);
                arrayList10.add(new C0Y7T(C0Y71.MSG_NOT_ENABLED, null, false, c0y72, false, null, messageBody4, 32));
            }
            arrayList.addAll(arrayList10);
            C0Y7J c0y7j2 = this.LLILLL;
            ArrayList arrayList11 = new ArrayList(C15438062q.LJIJJ(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList11.add(((Pair) it3.next()).getFirst());
            }
            String str = this.LLILZLL;
            int i3 = this.LLILZIL;
            Map<String, String> map = this.LLIZ;
            this.LL = arrayList;
            this.LLILLJJLI = 1;
            objLJI = C23250099c.LJI(this, c0y7j2.LIZ.LJIIIIZZ().LIZIZ(), new C0Y78(i3, c0y7j2, str, arrayList11, map, null));
            collection = arrayList;
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("BatchProcessMessageBodyUseCase@cd62.batchSaveNormalMessages$2");
                return objLJFF;
            }
        }
        List listLJLIL = C13LP.LJLIL((Iterable) objLJI, collection);
        C1C7U.LIZIZ("BatchProcessMessageBodyUseCase@cd62.batchSaveNormalMessages$2");
        return listLJLIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0Y7T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
