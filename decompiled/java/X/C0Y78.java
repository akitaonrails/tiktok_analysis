package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Y78, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.processmessage.BatchProcessMessageBodyUseCase$saveNormalMessages$2", f = "BatchProcessMessageBodyUseCase.kt", l = {}, m = "invokeSuspend")
public final class C0Y78 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<C0Y7T>>, Object> {
    public final /* synthetic */ C0Y7J LL;
    public final /* synthetic */ List<MessageBody> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y78(int i, C0Y7J c0y7j, String str, List list, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y7j;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = map;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0Y7J c0y7j = this.LL;
        List<MessageBody> list = this.LLILLJJLI;
        return new C0Y78(this.LLILLL, c0y7j, this.LLILZIL, list, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C0Y73 c0y73;
        boolean z2;
        Object next;
        boolean z3;
        String str;
        HashMap<String, String> mapLIZ;
        C869590Y9l c869590Y9l;
        boolean z4;
        String str2;
        C869590Y9l c869590Y9lLIZIZ;
        List<C0YC6> attachments;
        C1C7U.LIZ("BatchProcessMessageBodyUseCase@cd62.saveNormalMessages$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveOrHandleNormalMessages save msg begin: body msgId ");
        sbLIZ.append(new C08LY(new C1939607ik(this.LLILLJJLI), AFwS248S0000000_14.get$arr$(529)));
        sbLIZ.append(" msgSource ");
        sbLIZ.append(this.LLILLL);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SaveMessageBodyToDBUseCase", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (!this.LLILLJJLI.isEmpty()) {
            long uid = this.LL.LIZ.getUid();
            List<MessageBody> list = this.LLILLJJLI;
            C0Y7J c0y7j = this.LL;
            ArrayList<C0Y7I> arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (MessageBody messageBody : list) {
                c0y7j.getClass();
                Map<String, String> map = messageBody.ext;
                if (map == null || (str2 = map.get("s:client_message_id")) == null) {
                    str2 = "";
                }
                if (messageBody.server_message_id.longValue() <= 0 && str2.length() == 0) {
                    c869590Y9lLIZIZ = null;
                } else if (str2.length() == 0) {
                    c869590Y9lLIZIZ = c0y7j.LIZIZ.LIZJ(messageBody.server_message_id.longValue());
                } else if (messageBody.server_message_id.longValue() <= 0) {
                    c869590Y9lLIZIZ = c0y7j.LIZIZ.LJJIIZI(str2);
                } else {
                    c869590Y9lLIZIZ = c0y7j.LIZIZ.LIZIZ(messageBody.server_message_id.longValue(), str2);
                }
                if (c869590Y9lLIZIZ != null) {
                    attachments = c869590Y9lLIZIZ.getAttachments();
                } else {
                    attachments = null;
                }
                arrayList2.add(new C0Y7I(messageBody, c869590Y9lLIZIZ, attachments));
            }
            C0Y7J c0y7j2 = this.LL;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (C0Y7I c0y7i : arrayList2) {
                arrayList3.add(new Pair(c0y7i, C868510Y5h.LJ(c0y7j2.LIZ, c0y7i.LIZIZ, c0y7i.LIZ, 5)));
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((C0Y72) ((Pair) obj2).getSecond()).LIZ == EnumC868520Y5i.OK) {
                    arrayList4.add(obj2);
                } else {
                    arrayList5.add(obj2);
                }
            }
            Pair pair = new Pair(arrayList4, arrayList5);
            List list2 = (List) pair.getFirst();
            List<Pair> list3 = (List) pair.getSecond();
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (Pair pair2 : list3) {
                C0Y7I c0y7i2 = (C0Y7I) pair2.getFirst();
                C0Y72 c0y72 = (C0Y72) pair2.getSecond();
                C0Y76 c0y76 = C0Y76.LL;
                if (c0y7i2.LIZIZ == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList6.add(new C0Y7T(c0y76, null, z4, c0y72, false, null, c0y7i2.LIZ, 32));
            }
            arrayList.addAll(arrayList6);
            boolean z5 = this.LL.LIZ.LJIIIZ().LJJLIIIIJ.LJJJ;
            C0Y7J c0y7j3 = this.LL;
            int i = this.LLILLL;
            Map<String, String> map2 = this.LLILZ;
            ArrayList<C0Y7F> arrayList7 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C0Y7I c0y7i3 = (C0Y7I) ((Pair) it2.next()).getFirst();
                Map<String, String> map3 = c0y7i3.LIZ.ext;
                if (map3 == null || (str = map3.get("s:client_message_id")) == null) {
                    str = "";
                }
                if (z5 && (c869590Y9l = c0y7i3.LIZIZ) != null) {
                    mapLIZ = C867960Y3e.LIZ(c869590Y9l, C867960Y3e.LIZ);
                } else {
                    mapLIZ = null;
                }
                C869590Y9l c869590Y9lLIZ = C0Y8V.LIZ(c0y7j3.LIZ, str, c0y7i3.LIZIZ, c0y7i3.LIZ, 5, i);
                c869590Y9lLIZ.updateMentionLocalExt(uid);
                if (map2 != null && !map2.isEmpty()) {
                    c869590Y9lLIZ.putLocalExt(map2);
                }
                arrayList7.add(new C0Y7F(c869590Y9lLIZ, c0y7i3.LIZIZ, mapLIZ, c0y7i3.LIZJ, c0y7i3.LIZ));
            }
            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(arrayList7, 10));
            for (C0Y7F c0y7f : arrayList7) {
                arrayList8.add(new Pair(c0y7f.LIZ, c0y7f.LIZIZ));
            }
            HashMap map4 = new HashMap(arrayList7.size());
            for (C0Y7F c0y7f2 : arrayList7) {
                Map<String, String> map5 = c0y7f2.LIZJ;
                if (map5 != null) {
                    C07ZY c07zyLIZ = C07ZZ.LIZ(map5, c0y7f2.LIZ.getLocalExt(), this.LLILZ);
                    if (!c07zyLIZ.LIZ.isEmpty() || !c07zyLIZ.LIZIZ.isEmpty()) {
                        map4.put(c0y7f2.LIZ.getUuid(), c07zyLIZ);
                    }
                }
            }
            List<T> list4 = this.LL.LIZIZ.LJFF(this.LLILZIL, arrayList8, map4).LIZ;
            ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList9.add(((Pair) it3.next()).getFirst());
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList9);
            C0Y7J c0y7j4 = this.LL;
            int i2 = this.LLILLL;
            ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(arrayList7, 10));
            for (C0Y7F c0y7f3 : arrayList7) {
                if (setLLIIJI.contains(c0y7f3.LIZ)) {
                    C869590Y9l c869590Y9l2 = c0y7f3.LIZ;
                    Iterator it4 = arrayList7.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.LJFF(((C0Y7F) next).LIZ.getUuid(), c869590Y9l2.getUuid())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C0Y7F c0y7f4 = (C0Y7F) next;
                    if (c0y7f4 != null) {
                        C870360YCk.LIZLLL(c0y7j4.LIZ, c0y7f4.LIZLLL, c869590Y9l2, i2);
                    }
                    c0y7j4.LIZ.LJIIZILJ().getMessage().LIZIZ().LIZLLL(c869590Y9l2);
                    c0y7j4.LIZ.LJIIZILJ().getDomain().LIZIZ.LJII(c869590Y9l2.getUuid());
                    C868780Y6i c868780Y6iLIZLLL2 = c0y7j4.LIZ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("save message success, svrId ");
                    sbLIZ2.append(c869590Y9l2.getMsgId());
                    sbLIZ2.append(", isNew ");
                    if (c0y7f4 != null && c0y7f4.LIZIZ != null) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    sbLIZ2.append(z3);
                    C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "SaveMessageBodyToDBUseCase", C2188811AlT.LIZIZ(sbLIZ2), 4);
                    c0y73 = C0Y76.LL;
                } else {
                    C0YLL eventTracker = c0y7j4.LIZ.LJIIZILJ().LJFF().getEventTracker();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("save message failed, svrId ");
                    sbLIZ3.append(c0y7f3.LIZ.getMsgId());
                    sbLIZ3.append(", isNew ");
                    if (c0y7f3.LIZIZ == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ3.append(z);
                    sbLIZ3.append(", source: ");
                    sbLIZ3.append(i2);
                    eventTracker.LIZLLL("SaveMessageBodyToDBUseCase", new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3)));
                    c0y73 = C0Y71.INSERT_MSG_INTO_DB_FAIL;
                }
                C869590Y9l c869590Y9l3 = c0y7f3.LIZ;
                if (c0y7f3.LIZIZ == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList10.add(new C0Y7T(c0y73, c869590Y9l3, z2, C0Y72.LIZ(), false, null, c0y7f3.LJ, 32));
            }
            arrayList.addAll(arrayList10);
        }
        C1C7U.LIZIZ("BatchProcessMessageBodyUseCase@cd62.saveNormalMessages$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<C0Y7T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
