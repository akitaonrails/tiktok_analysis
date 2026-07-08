package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel$onMessageEvent$1", f = "QuotedMessageViewModel.kt", l = {145, 149, 153, 157, 160, 191}, m = "invokeSuspend")
public final class C460880I5m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC904740ZeS LLILLL;
    public final /* synthetic */ QuotedMessageViewModel LLILZ;
    public final /* synthetic */ List<C869590Y9l> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C460880I5m(InterfaceC904740ZeS interfaceC904740ZeS, QuotedMessageViewModel quotedMessageViewModel, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C460880I5m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC904740ZeS;
        this.LLILZ = quotedMessageViewModel;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C460880I5m c460880I5m = new C460880I5m(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c460880I5m.LLILLJJLI = obj;
        return c460880I5m;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        Integer numLJ;
        boolean z;
        Long l2;
        Integer numLJ2;
        Long l3;
        C869590Y9l next;
        boolean z2;
        Long l4;
        C1C7U.LIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
        Object objLJFF = C099R.LJFF();
        switch (this.LL) {
            case 0:
                C155000ia.LIZIZ(obj);
                Object obj2 = this.LLILLJJLI;
                InterfaceC904740ZeS interfaceC904740ZeS = this.LLILLL;
                boolean z3 = true;
                C869590Y9l c869590Y9l = null;
                String conversationId = null;
                if (interfaceC904740ZeS instanceof C1509705vb) {
                    List<C869590Y9l> list = ((C1509705vb) interfaceC904740ZeS).LIZ;
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list == null) {
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                        return unit;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    QuotedMessageViewModel quotedMessageViewModel = this.LLILZ;
                    for (C869590Y9l c869590Y9l2 : list) {
                        List<Integer> list2 = quotedMessageViewModel.LLILZ;
                        ReferenceInfo referenceInfo = c869590Y9l2.getReferenceInfo();
                        if (referenceInfo != null && (l4 = referenceInfo.ref_message_type) != null) {
                            numLJ2 = C2286608xc.LJ((int) l4.longValue());
                        } else {
                            numLJ2 = null;
                        }
                        if (C13LP.LJJJJ(numLJ2, list2)) {
                            ReferenceInfo referenceInfo2 = c869590Y9l2.getReferenceInfo();
                            if (referenceInfo2 != null) {
                                l3 = referenceInfo2.referenced_message_id;
                            } else {
                                l3 = null;
                            }
                            if (l3 != null && l3.longValue() > 0) {
                                synchronized (quotedMessageViewModel) {
                                    try {
                                        ConcurrentHashMap<Long, List<C869590Y9l>> concurrentHashMap = quotedMessageViewModel.LLILLL;
                                        List<C869590Y9l> list3 = concurrentHashMap.get(l3);
                                        if (list3 == null) {
                                            list3 = C13BV.INSTANCE;
                                        }
                                        concurrentHashMap.put(l3, C13LP.LJLILLLLZI(c869590Y9l2, list3));
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                if (quotedMessageViewModel.LLILLJJLI.get(l3) == null) {
                                    Iterator<C869590Y9l> it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (next.getMsgId() == l3.longValue()) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    C869590Y9l c869590Y9l3 = next;
                                    if (c869590Y9l3 == null) {
                                        Boolean.valueOf(linkedHashSet.add(l3));
                                    } else {
                                        QuotedMessageInfo.Companion.getClass();
                                        QuotedMessageInfo quotedMessageInfoLIZ = C0I82.LIZ(c869590Y9l3);
                                        if (quotedMessageInfoLIZ != null) {
                                            quotedMessageViewModel.LLILLJJLI.put(l3, quotedMessageInfoLIZ);
                                            String strLJ = C051M.LJ(quotedMessageInfoLIZ, false);
                                            List<C869590Y9l> list4 = quotedMessageViewModel.LLILLL.get(l3);
                                            if (list4 != null) {
                                                Iterator<C869590Y9l> it3 = list4.iterator();
                                                while (it3.hasNext()) {
                                                    Pair pairVQ2 = QuotedMessageViewModel.vQ2(it3.next(), strLJ);
                                                    if (pairVQ2 != null) {
                                                        C869590Y9l c869590Y9l4 = (C869590Y9l) pairVQ2.getFirst();
                                                        linkedHashMap.put(c869590Y9l4.getUuid(), new Pair(c869590Y9l4, pairVQ2.getSecond()));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (linkedHashSet.contains(C2286608xc.LJFF(c869590Y9l2.getMsgId()))) {
                            linkedHashSet.remove(C2286608xc.LJFF(c869590Y9l2.getMsgId()));
                            QuotedMessageInfo.Companion.getClass();
                            QuotedMessageInfo quotedMessageInfoLIZ2 = C0I82.LIZ(c869590Y9l2);
                            if (quotedMessageInfoLIZ2 != null) {
                                quotedMessageViewModel.LLILLJJLI.put(C2286608xc.LJFF(c869590Y9l2.getMsgId()), quotedMessageInfoLIZ2);
                                String strLJ2 = C051M.LJ(quotedMessageInfoLIZ2, false);
                                List<C869590Y9l> list5 = quotedMessageViewModel.LLILLL.get(C2286608xc.LJFF(c869590Y9l2.getMsgId()));
                                if (list5 != null) {
                                    Iterator<C869590Y9l> it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        Pair pairVQ22 = QuotedMessageViewModel.vQ2(it4.next(), strLJ2);
                                        if (pairVQ22 != null) {
                                            C869590Y9l c869590Y9l5 = (C869590Y9l) pairVQ22.getFirst();
                                            linkedHashMap.put(c869590Y9l5.getUuid(), new Pair(c869590Y9l5, pairVQ22.getSecond()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(C13LP.LLIIII(linkedHashMap.values()), true, new C0Y3I("QuotedTemplateViewModel"));
                    }
                    C869590Y9l c869590Y9l6 = (C869590Y9l) C13LP.LJJJLL(list);
                    if (c869590Y9l6 != null) {
                        conversationId = c869590Y9l6.getConversationId();
                    }
                    if (conversationId != null) {
                        QuotedMessageViewModel quotedMessageViewModel2 = this.LLILZ;
                        List listLLIIII = C13LP.LLIIII(linkedHashSet);
                        this.LL = 1;
                        if (quotedMessageViewModel2.xQ2(conversationId, listLLIIII, this) == objLJFF) {
                            C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                            return objLJFF;
                        }
                    }
                } else if (interfaceC904740ZeS instanceof C1761906vB) {
                    C1761906vB c1761906vB = (C1761906vB) interfaceC904740ZeS;
                    if (!c1761906vB.LIZIZ) {
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                        return unit2;
                    }
                    QuotedMessageViewModel quotedMessageViewModel3 = this.LLILZ;
                    List<C869590Y9l> list6 = c1761906vB.LIZ;
                    this.LL = 2;
                    if (quotedMessageViewModel3.yQ2(list6, this) == objLJFF) {
                        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                        return objLJFF;
                    }
                } else if (interfaceC904740ZeS instanceof C1762006vC) {
                    if (((C1762006vC) interfaceC904740ZeS).LIZIZ != EnumC1762106vD.SUCCESS) {
                        z3 = false;
                    }
                    if (!z3) {
                        Unit unit3 = Unit.LIZ;
                        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                        return unit3;
                    }
                    QuotedMessageViewModel quotedMessageViewModel4 = this.LLILZ;
                    List<C869590Y9l> list7 = ((C1762006vC) interfaceC904740ZeS).LIZ;
                    this.LL = 3;
                    if (quotedMessageViewModel4.yQ2(list7, this) == objLJFF) {
                        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                        return objLJFF;
                    }
                } else if (interfaceC904740ZeS instanceof C1746006sc) {
                    if (((C1746006sc) interfaceC904740ZeS).LIZ.isEmpty()) {
                        Unit unit4 = Unit.LIZ;
                        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                        return unit4;
                    }
                    QuotedMessageViewModel quotedMessageViewModel5 = this.LLILZ;
                    List<C869590Y9l> list8 = ((C1746006sc) this.LLILLL).LIZ;
                    this.LL = 4;
                    if (quotedMessageViewModel5.yQ2(list8, this) == objLJFF) {
                        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                        return objLJFF;
                    }
                } else if (interfaceC904740ZeS instanceof C1758306ub) {
                    QuotedMessageViewModel quotedMessageViewModel6 = this.LLILZ;
                    List<C869590Y9l> list9 = ((C1758306ub) interfaceC904740ZeS).LIZ;
                    this.LL = 5;
                    if (quotedMessageViewModel6.yQ2(list9, this) == objLJFF) {
                        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                        return objLJFF;
                    }
                } else if (interfaceC904740ZeS instanceof C06SA) {
                    C869590Y9l c869590Y9l7 = ((C06SA) interfaceC904740ZeS).LIZJ;
                    ReferenceInfo referenceInfo3 = c869590Y9l7.getReferenceInfo();
                    if (referenceInfo3 != null && (l = referenceInfo3.referenced_message_id) != null) {
                        long jLongValue = l.longValue();
                        List<Integer> list10 = this.LLILZ.LLILZ;
                        ReferenceInfo referenceInfo4 = c869590Y9l7.getReferenceInfo();
                        if (referenceInfo4 != null && (l2 = referenceInfo4.ref_message_type) != null) {
                            numLJ = C2286608xc.LJ((int) l2.longValue());
                        } else {
                            numLJ = null;
                        }
                        if (!C13LP.LJJJJ(numLJ, list10)) {
                            Unit unit5 = Unit.LIZ;
                            C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                            return unit5;
                        }
                        QuotedMessageViewModel quotedMessageViewModel7 = this.LLILZ;
                        synchronized (obj2) {
                            try {
                                ConcurrentHashMap<Long, List<C869590Y9l>> concurrentHashMap2 = quotedMessageViewModel7.LLILLL;
                                Long lLJFF = C2286608xc.LJFF(jLongValue);
                                List<C869590Y9l> list11 = quotedMessageViewModel7.LLILLL.get(C2286608xc.LJFF(jLongValue));
                                if (list11 == null) {
                                    list11 = C13BV.INSTANCE;
                                }
                                concurrentHashMap2.put(lLJFF, C13LP.LJLILLLLZI(c869590Y9l7, list11));
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                        QuotedMessageInfo quotedMessageInfo = this.LLILZ.LLILLJJLI.get(C2286608xc.LJFF(jLongValue));
                        if (quotedMessageInfo != null) {
                            String strLJ3 = C051M.LJ(quotedMessageInfo, false);
                            c869590Y9l7.getLocalExt().put("REPLIED_TEMPLATE", strLJ3);
                            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(Collections.singletonList(new Pair(c869590Y9l7, C2097908Jt.LIZJ(new Pair("REPLIED_TEMPLATE", new C0Y3R(strLJ3))))), false, new C0Y3I("QuotedTemplateViewModel"));
                            Unit unit6 = Unit.LIZ;
                            C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                            return unit6;
                        }
                        Iterator<C869590Y9l> it5 = this.LLILZIL.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                C869590Y9l next2 = it5.next();
                                if (next2.getMsgId() == jLongValue) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    c869590Y9l = next2;
                                }
                            }
                        }
                        C869590Y9l c869590Y9l8 = c869590Y9l;
                        if (c869590Y9l8 != null) {
                            QuotedMessageInfo.Companion.getClass();
                            QuotedMessageInfo quotedMessageInfoLIZ3 = C0I82.LIZ(c869590Y9l8);
                            if (quotedMessageInfoLIZ3 != null) {
                                this.LLILZ.LLILLJJLI.put(C2286608xc.LJFF(jLongValue), quotedMessageInfoLIZ3);
                                QuotedMessageViewModel.vQ2(c869590Y9l7, C051M.LJ(quotedMessageInfoLIZ3, false));
                            }
                            Unit unit7 = Unit.LIZ;
                            C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                            return unit7;
                        }
                        QuotedMessageViewModel quotedMessageViewModel8 = this.LLILZ;
                        List listSingletonList = Collections.singletonList(C2286608xc.LJFF(jLongValue));
                        String conversationId2 = c869590Y9l7.getConversationId();
                        this.LL = 6;
                        if (quotedMessageViewModel8.xQ2(conversationId2, listSingletonList, this) == objLJFF) {
                            C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                            return objLJFF;
                        }
                    } else {
                        Unit unit8 = Unit.LIZ;
                        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
                        return unit8;
                    }
                } else {
                    if (interfaceC904740ZeS instanceof C06S8) {
                        QuotedMessageViewModel quotedMessageViewModel9 = this.LLILZ;
                        List<C869590Y9l> list12 = ((C06S8) interfaceC904740ZeS).LIZIZ;
                        ArrayList arrayList = new ArrayList();
                        for (C869590Y9l c869590Y9l9 : list12) {
                            if (quotedMessageViewModel9.LLILLJJLI.containsKey(C2286608xc.LJFF(c869590Y9l9.getMsgId()))) {
                                arrayList.add(c869590Y9l9);
                            }
                        }
                        quotedMessageViewModel9.zQ2(arrayList, null);
                    }
                    break;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C155000ia.LIZIZ(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Unit unit9 = Unit.LIZ;
        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.onMessageEvent$1");
        return unit9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
