package X;

import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.AFwS340S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0els, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101540els implements InterfaceC1101550elt {
    public static final void LIZ(String str) {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        if (C1537060q6K.LJI(str) != null) {
            return;
        }
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = str;
        c1097680efe.LJIJ = 1;
        c1097680efe.LJJ = true;
        c1097680efe.LJIJJ = AFwS340S0000000_17.get$arr$(1);
        c1097680efe.LJIIIIZZ = AFwS301S0000000_17.get$arr$(16);
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
    }

    public static final void LIZIZ(String str, String str2) {
        C1546500qLY c1546500qLY = C1546560qLe.LIZ;
        C1546510qLZ c1546510qLZ = new C1546510qLZ();
        c1546510qLZ.LIZ = true;
        c1546510qLZ.LJFF = str;
        c1546510qLZ.LIZLLL = 1;
        c1546510qLZ.LJI = 120;
        c1546510qLZ.LJIIIZ = AFwS301S0000000_17.get$arr$(17);
        c1546510qLZ.LJIIL = Collections.singletonList(str2);
        Boolean bool = Boolean.FALSE;
        c1546500qLY.getClass();
        C1546500qLY.LJI(c1546510qLZ, bool);
    }

    public static final void LIZJ(Map map, Type type, final Function1 function1, final Function2 function2) {
        InterfaceC1936307iD c1933007hg;
        if (Intrinsics.LJFF(type, Integer.TYPE)) {
            c1933007hg = new C1932907hf();
        } else if (Intrinsics.LJFF(type, Double.TYPE)) {
            c1933007hg = new InterfaceC1936307iD<Double>() { // from class: X.07hh
                @Override // X.InterfaceC1936307iD
                public final Double parse(String str) {
                    return C2327809Ae.LJII(str);
                }
            };
        } else if (Intrinsics.LJFF(type, Float.TYPE)) {
            c1933007hg = new C1089100eRo();
        } else if (Intrinsics.LJFF(type, String.class)) {
            c1933007hg = new C1089010eRf();
        } else if (Intrinsics.LJFF(type, Integer[].class)) {
            c1933007hg = new InterfaceC1936307iD<List<? extends Integer>>() { // from class: X.07he
                public final C1932907hf LIZ = new C1932907hf();

                @Override // X.InterfaceC1936307iD
                public final List<? extends Integer> parse(String str) {
                    List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                    for (String str2 : listLJJLIIIJILLIZJL) {
                        this.LIZ.getClass();
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI(str2);
                        if (numLJIIJJI != null) {
                            arrayList.add(Integer.valueOf(numLJIIJJI.intValue()));
                        } else {
                            return null;
                        }
                    }
                    return arrayList;
                }
            };
        } else if (Intrinsics.LJFF(type, Long.TYPE)) {
            c1933007hg = new C1089990eTF();
        } else if (Intrinsics.LJFF(type, Boolean.TYPE)) {
            c1933007hg = new C1933007hg();
        } else {
            c1933007hg = new C1933007hg();
        }
        C1092980eY4 c1092980eY4 = new C1092980eY4();
        c1092980eY4.LIZ = C0J0P.APP;
        c1092980eY4.LIZ(new C1092780eXk(c1933007hg));
        C1092970eY3 c1092970eY3LIZIZ = c1092980eY4.LIZIZ();
        C1094570ead c1094570ead = new C1094570ead();
        c1094570ead.LIZ = new LinkedHashMap(map);
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).fR1(new InterfaceC1092860eXs() { // from class: X.0Ibo
            public final /* synthetic */ String LIZJ = "live_info_preload";

            @Override // X.InterfaceC1092860eXs
            public final void LIZ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LJ(C1092890eXv c1092890eXv) {
                Object c098200Yq;
                C1093210eYR c1093210eYR;
                JSONObject jSONObject;
                Boolean boolValueOf;
                C0J0M c0j0m = c1092890eXv.LIZIZ;
                if (c0j0m != null) {
                    Function2<Integer, String, Unit> function22 = function2;
                    Function1<Object, Unit> function12 = function1;
                    try {
                        Object obj = c0j0m.LIZ;
                        if ((obj instanceof C1093210eYR) && (c1093210eYR = (C1093210eYR) obj) != null && (jSONObject = c1093210eYR.LIZIZ) != null && (boolValueOf = Boolean.valueOf(jSONObject.optBoolean("need_preload", false))) != null) {
                            function12.invoke(boolValueOf);
                        } else {
                            function22.invoke(-1, "need_preload is null");
                        }
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        function22.invoke(-1, thM5exceptionOrNullimpl.getMessage());
                    }
                    C189200o6.m1boximpl(c098200Yq);
                }
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZLLL(String str, C477840IoY c477840IoY) {
                if (Intrinsics.LJFF(str, this.LIZJ)) {
                    function2.invoke(Integer.valueOf(c477840IoY.LIZ), c477840IoY.LIZIZ);
                }
            }
        }, c1092970eY3LIZIZ, c1094570ead, "live_info_preload");
    }
}
