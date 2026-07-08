package X;

import android.os.Build;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.infra.riskapi.FeedRiskApiConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.lang.StackWalker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1AVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180561AVq implements InterfaceC2180591AVt<View> {
    public static final C2180561AVq LIZ = new C2180561AVq();

    public static final Set<EnumC2180541AVo> LIZJ() {
        return C13LQ.LJLIIL(new EnumC2180541AVo[]{EnumC2180541AVo.V_VISIBLITY, EnumC2180541AVo.V_ALPHA, EnumC2180541AVo.V_ANIMATE});
    }

    public static boolean LIZLLL(EnumC2180541AVo enumC2180541AVo, Object obj) {
        if (enumC2180541AVo != EnumC2180541AVo.V_VISIBLITY || !C13LP.LJJJJ(obj, (Iterable) FeedRiskApiConfig.LJI.getValue())) {
            if ((enumC2180541AVo != EnumC2180541AVo.V_ALPHA || !C13LP.LJJJJ(obj, (Iterable) FeedRiskApiConfig.LJIIJJI.getValue())) && enumC2180541AVo != EnumC2180541AVo.V_ANIMATE) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC2180591AVt
    public final void LIZ(EnumC2180541AVo enumC2180541AVo, Object obj) {
        C1AV2 c1av2LIZLLL;
        View view = (View) obj;
        if (view.getParent() != null) {
            Object tag = view.getTag(enumC2180541AVo.getTagKey());
            if (tag == null) {
                tag = view.getTag(EnumC2180541AVo.V_ALL.getTagKey());
            }
            if (tag instanceof C1AV2) {
                C1AV2 c1av2 = (C1AV2) tag;
                if (!Intrinsics.LJFF(c1av2.LIZJ, "?")) {
                    if (enumC2180541AVo == EnumC2180541AVo.V_ALPHA && Intrinsics.LJFF(c1av2.LJ, Boolean.TRUE)) {
                        c1av2.LJFF++;
                        return;
                    }
                } else {
                    return;
                }
            }
            int i = C2180581AVs.LIZ[enumC2180541AVo.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        c1av2LIZLLL = new C1AV2(EnumC2180541AVo.UNKNOW, "?", false, null, 120);
                    } else {
                        c1av2LIZLLL = C1AV3.LIZLLL(EnumC2180541AVo.V_ANIMATE);
                    }
                } else {
                    c1av2LIZLLL = C1AV3.LIZLLL(EnumC2180541AVo.V_ALPHA);
                }
            } else {
                c1av2LIZLLL = C1AV3.LIZLLL(EnumC2180541AVo.V_VISIBLITY);
            }
            view.setTag(enumC2180541AVo.getTagKey(), c1av2LIZLLL);
        }
    }

    @Override // X.InterfaceC2180591AVt
    public final void LIZIZ(EnumC2180541AVo enumC2180541AVo, View view, Object obj) {
        IFeedDebugService iFeedDebugService;
        boolean z;
        boolean z2;
        View view2 = view;
        if (view2.getParent() != null) {
            Object tag = view2.getTag(enumC2180541AVo.getTagKey());
            if (tag == null) {
                tag = view2.getTag(EnumC2180541AVo.V_ALL.getTagKey());
            }
            if (tag instanceof C1AV2) {
                C1AV2 c1av2 = (C1AV2) tag;
                if (c1av2.LIZ == EnumC2180541AVo.V_ALL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1av2.LIZJ);
                    sbLIZ.append('&');
                    sbLIZ.append(obj);
                    sbLIZ.append('_');
                    sbLIZ.append(enumC2180541AVo.getType());
                    c1av2.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    c1av2.LIZJ = obj;
                }
                view2.setTag(enumC2180541AVo.getTagKey(), tag);
                boolean z3 = true;
                if (C695630RQj.LIZ() || (C695630RQj.LIZJ() && FeedRiskApiConfig.LIZ().disableChannel != 2)) {
                    if (LIZLLL(enumC2180541AVo, obj) && !(!c1av2.LIZLLL)) {
                        final ArrayList arrayList = new ArrayList();
                        if (((Boolean) FeedRiskApiConfig.LJIIIZ.getValue()).booleanValue()) {
                            try {
                                final C118300cf c118300cf = new C118300cf();
                                c118300cf.element = ((Number) FeedRiskApiConfig.LJIILIIL.getValue()).intValue();
                                final C118300cf c118300cf2 = new C118300cf();
                                c118300cf2.element = ((Number) FeedRiskApiConfig.LJIILJJIL.getValue()).intValue();
                                System.nanoTime();
                                if (C695630RQj.LIZ()) {
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        if (FeedRiskApiConfig.LIZIZ()) {
                                            StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE).walk(new Function() { // from class: X.1AVy
                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj2) {
                                                    Stream<T> streamLimit = ((Stream) obj2).skip(c118300cf.element).limit(c118300cf2.element);
                                                    final List<C2180621AVw> list = arrayList;
                                                    Stream<T> streamTakeWhile = streamLimit.takeWhile(new Predicate() { // from class: X.1AW0
                                                        @Override // java.util.function.Predicate
                                                        public final boolean test(Object obj3) {
                                                            boolean z4;
                                                            StackWalker.StackFrame stackFrame = (StackWalker.StackFrame) obj3;
                                                            List<C2180621AVw> list2 = list;
                                                            String className = stackFrame.getClassName();
                                                            stackFrame.getMethodName();
                                                            if (C2180571AVr.LJ(className)) {
                                                                String simpleName = stackFrame.getDeclaringClass().getSimpleName();
                                                                String methodName = stackFrame.getMethodName();
                                                                stackFrame.getLineNumber();
                                                                list2.add(new C2180621AVw(simpleName, methodName));
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            return !z4;
                                                        }
                                                    });
                                                    final List<C2180621AVw> list2 = arrayList;
                                                    streamTakeWhile.forEach(new Consumer() { // from class: X.1AVz
                                                        @Override // java.util.function.Consumer
                                                        public final void accept(Object obj3) {
                                                            StackWalker.StackFrame stackFrame = (StackWalker.StackFrame) obj3;
                                                            List<C2180621AVw> list3 = list2;
                                                            if (!u.LJJIIJZLJL(stackFrame.getMethodName(), "INVOKEVIRTUAL", false)) {
                                                                String simpleName = stackFrame.getDeclaringClass().getSimpleName();
                                                                String methodName = stackFrame.getMethodName();
                                                                stackFrame.getLineNumber();
                                                                list3.add(new C2180621AVw(simpleName, methodName));
                                                            }
                                                        }
                                                    });
                                                    return Unit.LIZ;
                                                }
                                            });
                                        }
                                    } else if (FeedRiskApiConfig.LIZIZ()) {
                                        arrayList.addAll(C2180571AVr.LIZJ(c118300cf2.element));
                                    }
                                } else {
                                    if (FeedRiskApiConfig.LIZIZ == null) {
                                        if (AbstractC19994813Le.Default.nextDouble() >= 1.0d / ((double) ((Number) FeedRiskApiConfig.LJIIIIZZ.getValue()).intValue())) {
                                            z3 = false;
                                        }
                                        FeedRiskApiConfig.LIZIZ = Boolean.valueOf(z3);
                                    }
                                    Boolean bool = FeedRiskApiConfig.LIZIZ;
                                    if (bool != null && bool.booleanValue()) {
                                        String strLIZ = C2180571AVr.LIZ(view2, c1av2, null);
                                        C2180601AVu c2180601AVu = C2180601AVu.LIZ;
                                        Throwable th = new Throwable();
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("local/");
                                        sbLIZ2.append(strLIZ);
                                        c2180601AVu.LIZ(C2188811AlT.LIZIZ(sbLIZ2), th);
                                    }
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C2180601AVu.LIZ.logException(th2);
                            }
                        }
                        String strLIZ2 = C2180571AVr.LIZ(view2, c1av2, arrayList);
                        C1871270ynN c1871270ynN = C1871270ynN.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        strLIZ2.toString();
                        linkedHashMap.put("risk_id", strLIZ2);
                        linkedHashMap.put("stack_info", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS279S0000000_33.get$arr$(270), 30));
                        c1871270ynN.getClass();
                        Set<String> set = C1871270ynN.LIZIZ;
                        if (!C13LP.LJJJJ(linkedHashMap.get("risk_id"), set)) {
                            Object obj2 = linkedHashMap.get("risk_id");
                            if (obj2 == null) {
                                obj2 = "";
                            }
                            set.add((String) obj2);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("stackId ");
                            sbLIZ3.append((String) linkedHashMap.get("risk_id"));
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) C708120Rq6.LIZ.getValue();
                            boolean z4 = AbstractC1604130rqV.LIZLLL;
                            abstractC1604130rqV.LJIIIIZZ(null, "FeedRiskApiManager", strLIZIZ);
                            if (C695630RQj.LIZIZ() && (iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null)) != null) {
                                iFeedDebugService.LJ();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (C1E7D.LIZ && ((Boolean) C1AW1.LIZLLL.getValue()).booleanValue() && LIZLLL(enumC2180541AVo, obj)) {
                    if (!(!c1av2.LIZLLL)) {
                        C01GW c01gw = FeedRiskApiConfig.LJIIZILJ;
                        if (!((Set) c01gw.getValue()).isEmpty()) {
                            String strLIZLLL = C2180571AVr.LIZLLL(view2, AFwS224S0000000_33.get$arr$(534));
                            if (C123100dR.LIZ(strLIZLLL)) {
                                if (FeedRiskApiConfig.LIZLLL == null) {
                                    if (AbstractC19994813Le.Default.nextDouble() < 1.0d / ((double) ((Number) FeedRiskApiConfig.LJIJ.getValue()).intValue())) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    FeedRiskApiConfig.LIZLLL = Boolean.valueOf(z2);
                                }
                                Boolean bool2 = FeedRiskApiConfig.LIZLLL;
                                if (bool2 != null && bool2.booleanValue()) {
                                    Set set2 = (Set) c01gw.getValue();
                                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                        Iterator it2 = set2.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            if (u.LJJIIJZLJL(strLIZLLL, (String) it2.next(), false)) {
                                                String strLIZ3 = C2180571AVr.LIZ(view2, c1av2, null);
                                                C2180601AVu c2180601AVu2 = C2180601AVu.LIZ;
                                                Throwable th3 = new Throwable();
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("empty/");
                                                sbLIZ4.append(strLIZ3);
                                                c2180601AVu2.LIZ(C2188811AlT.LIZIZ(sbLIZ4), th3);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C01GW c01gw2 = FeedRiskApiConfig.LJIILL;
                    if (!((Set) c01gw2.getValue()).isEmpty()) {
                        String strLIZ4 = C2180571AVr.LIZ(view2, c1av2, null);
                        if (C123100dR.LIZ(strLIZ4)) {
                            if (FeedRiskApiConfig.LIZJ == null) {
                                if (AbstractC19994813Le.Default.nextDouble() < 1.0d / ((double) ((Number) FeedRiskApiConfig.LJIILLIIL.getValue()).intValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                FeedRiskApiConfig.LIZJ = Boolean.valueOf(z);
                            }
                            Boolean bool3 = FeedRiskApiConfig.LIZJ;
                            if (bool3 != null && bool3.booleanValue()) {
                                Set set3 = (Set) c01gw2.getValue();
                                if ((set3 instanceof Collection) && set3.isEmpty()) {
                                    return;
                                }
                                Iterator it3 = set3.iterator();
                                while (it3.hasNext()) {
                                    if (u.LJJIIJZLJL(strLIZ4, (String) it3.next(), false)) {
                                        String strLIZ5 = C2180571AVr.LIZ(view2, c1av2, null);
                                        C2180601AVu c2180601AVu3 = C2180601AVu.LIZ;
                                        Throwable th4 = new Throwable();
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("dynamic/");
                                        sbLIZ5.append(strLIZ5);
                                        c2180601AVu3.LIZ(C2188811AlT.LIZIZ(sbLIZ5), th4);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
