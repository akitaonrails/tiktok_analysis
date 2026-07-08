package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Ym9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884030Ym9 extends C09AY implements Function0<C884040YmA> {
    public final /* synthetic */ AbstractC883730Ylf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884030Ym9(AbstractC883730Ylf abstractC883730Ylf) {
        super(0);
        this.LL = abstractC883730Ylf;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0YmA] */
    @Override // kotlin.jvm.functions.Function0
    public final C884040YmA invoke() {
        final AbstractC883730Ylf abstractC883730Ylf = this.LL;
        return new InterfaceC884050YmB() { // from class: X.0YmA
            @Override // X.InterfaceC884050YmB
            public final String LIZ() {
                return "common_inbox_chat_list_bridge";
            }

            @Override // X.InterfaceC884050YmB
            public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
                boolean z2;
                C885040Ynm c885040Ynm;
                C878950Ydx c878950Ydx;
                InterfaceC884640Yn8 config;
                C885040Ynm c885040Ynm2;
                C878950Ydx c878950Ydx2;
                Set<EnumC880480YgQ> setSingleton;
                int i;
                boolean z3;
                boolean z4;
                Object c098200Yq;
                boolean z5;
                C885040Ynm c885040Ynm3;
                String strLJIJ = abstractC883730Ylf.LJIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onChatListDataUpdate size=");
                sbLIZ.append(list.size());
                sbLIZ.append(", source=");
                sbLIZ.append(str);
                sbLIZ.append(", page=");
                sbLIZ.append(interfaceC884020Ym8.getConfig().getKey());
                sbLIZ.append(", hasMore=");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZLLL(strLJIJ);
                Set<String> set = C869290Y8h.LJIIL;
                AbstractC883730Ylf abstractC883730Ylf2 = abstractC883730Ylf;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z2 = false;
                } else {
                    for (String str2 : set) {
                        if (u.LJIIZILJ(str, str2, false) && abstractC883730Ylf2.LJIIIIZZ(str2)) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                }
                CopyOnWriteArrayList<InterfaceC884050YmB> copyOnWriteArrayList = (CopyOnWriteArrayList) abstractC883730Ylf.LIZIZ.getValue();
                AbstractC883730Ylf abstractC883730Ylf3 = abstractC883730Ylf;
                for (InterfaceC884050YmB interfaceC884050YmB : copyOnWriteArrayList) {
                    try {
                        interfaceC884050YmB.LIZJ(interfaceC884020Ym8, list, z, str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (z2) {
                            C885850Yp5 c885850Yp5 = C885850Yp5.LIZ;
                            String strLIZ = interfaceC884050YmB.LIZ();
                            c885850Yp5.getClass();
                            if (C1207204nu.LIZ()) {
                                ((C823170WQx) C885850Yp5.LJIL.getValue()).add(strLIZ);
                            }
                        }
                        C309160C9y.LIZJ(abstractC883730Ylf3.LJIJ(), e);
                    }
                }
                InterfaceC884640Yn8 config2 = interfaceC884020Ym8.getConfig();
                InterfaceC884640Yn8 config3 = null;
                if ((config2 instanceof C885040Ynm) && (c885040Ynm = (C885040Ynm) config2) != null && (c878950Ydx = c885040Ynm.LIZ) != null) {
                    InterfaceC884020Ym8 interfaceC884020Ym82 = abstractC883730Ylf.LJ;
                    if (interfaceC884020Ym82 != null) {
                        config = interfaceC884020Ym82.getConfig();
                    } else {
                        config = null;
                    }
                    if (!(config instanceof C885040Ynm) || (c885040Ynm3 = (C885040Ynm) config) == null || (c878950Ydx2 = c885040Ynm3.LIZ) == null) {
                        AbstractC883730Ylf abstractC883730Ylf4 = abstractC883730Ylf;
                        if (((Number) C270450Aip.LIZ.getValue()).intValue() == 1) {
                            abstractC883730Ylf4.LJIJJLI();
                        }
                        InterfaceC884020Ym8 interfaceC884020Ym83 = abstractC883730Ylf4.LJ;
                        if (interfaceC884020Ym83 != null) {
                            config3 = interfaceC884020Ym83.getConfig();
                        }
                        if (!(config3 instanceof C885040Ynm) || (c885040Ynm2 = (C885040Ynm) config3) == null || (c878950Ydx2 = c885040Ynm2.LIZ) == null) {
                            if (z2) {
                                C885850Yp5.LIZ.getClass();
                                C885850Yp5.LJIJ("currentKey");
                                return;
                            }
                            return;
                        }
                    }
                    if (c878950Ydx.LLILLL == c878950Ydx2.LLILLL && Intrinsics.LJFF(c878950Ydx.LLILZ, c878950Ydx2.LLILZ)) {
                        if (C1207204nu.LIZ() && z2) {
                            C885850Yp5 c885850Yp52 = C885850Yp5.LIZ;
                            int size = list.size();
                            c885850Yp52.getClass();
                            if (C1207204nu.LIZ()) {
                                ((C563400M7u) C885850Yp5.LJJI.getValue()).LJ(size);
                            }
                        }
                        C11PQ<C885880Yp8> c11pqLJIILLIIL = abstractC883730Ylf.LJIILLIIL();
                        ArrayList<InterfaceC885810Yp1> arrayList = new ArrayList();
                        for (InterfaceC884440Ymo interfaceC884440Ymo : list) {
                            if (interfaceC884440Ymo instanceof InterfaceC885810Yp1) {
                                arrayList.add(interfaceC884440Ymo);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (InterfaceC885810Yp1 interfaceC885810Yp1 : arrayList) {
                            try {
                                if (!Intrinsics.LJFF(str, "snapshot") && !Intrinsics.LJFF(str, "register_snapshot")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                c098200Yq = C0Z8J.LIZIZ(interfaceC885810Yp1, z5);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                                arrayList2.add(c098200Yq);
                            } else if (z2) {
                                C885850Yp5.LIZ.getClass();
                                if (C1207204nu.LIZ()) {
                                    ((C563400M7u) C885850Yp5.LJJIFFI.getValue()).LIZLLL();
                                }
                            }
                        }
                        FilterTabType filterTabType = c878950Ydx2.LLILLL;
                        if (Intrinsics.LJFF(c878950Ydx2.LLILZ, Collections.singleton(EnumC880480YgQ.SAME_WITH_TAB))) {
                            setSingleton = Collections.singleton(C880510YgT.LIZ(c878950Ydx2.LLILLL));
                        } else {
                            setSingleton = c878950Ydx2.LLILZ;
                        }
                        if (!Intrinsics.LJFF(str, "empty_notify") && !Intrinsics.LJFF(str, "page_cache")) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (!Intrinsics.LJFF(str, "snapshot") && !Intrinsics.LJFF(str, "register_snapshot")) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        Iterator<? extends InterfaceC884440Ymo> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            InterfaceC884440Ymo next = it2.next();
                            InterfaceC884440Ymo interfaceC884440Ymo2 = next;
                            if ((interfaceC884440Ymo2 instanceof C887190YrF) && C880320YgA.LIZ(((C887190YrF) interfaceC884440Ymo2).getUnreadViewState())) {
                                if (next != null) {
                                    z4 = true;
                                }
                            }
                        }
                        z4 = false;
                        c11pqLJIILLIIL.onNext(new C885880Yp8(arrayList2, z, filterTabType, setSingleton, i, z4, z3));
                        return;
                    }
                    if (z2) {
                        C885850Yp5 c885850Yp53 = C885850Yp5.LIZ;
                        StringBuilder sb = new StringBuilder();
                        sb.append(c878950Ydx.LLILLL);
                        sb.append('_');
                        sb.append(c878950Ydx2.LLILLL);
                        sb.append('_');
                        sb.append(c878950Ydx.LLILZ);
                        sb.append('_');
                        sb.append(c878950Ydx2.LLILZ);
                        String string = sb.toString();
                        c885850Yp53.getClass();
                        C885850Yp5.LJIJ(string);
                        return;
                    }
                    return;
                }
                if (z2) {
                    C885850Yp5.LIZ.getClass();
                    C885850Yp5.LJIJ("target_key");
                }
            }
        };
    }
}
