package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.share.dislike.FilteredKeywords;
import com.ss.android.ugc.aweme.share.dislike.Keyword;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NB4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NB4 {
    public static Function2<? super List<Keyword>, ? super Integer, Unit> LIZJ;
    public static Function0<Unit> LIZLLL;
    public static Function1<? super Throwable, Unit> LJ;
    public static Function0<Unit> LJFF;
    public static Function1<? super Throwable, Unit> LJI;
    public static FilteredKeywords LJII;
    public static Map<String, String> LIZ = new LinkedHashMap();
    public static final Gson LIZIZ = new Gson();
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(566));

    public static void LIZ(List list) {
        List listSingletonList = Collections.singletonList(0);
        if (((ArrayList) list).isEmpty()) {
            Function0<Unit> function0 = LJFF;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        InterfaceC596400NaI interfaceC596400NaI = (InterfaceC596400NaI) LJIIIIZZ.getValue();
        Gson gson = LIZIZ;
        interfaceC596400NaI.LIZ(GsonProtectorUtils.toJson(gson, list), GsonProtectorUtils.toJson(gson, listSingletonList)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0NB2
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ChooseReasonAPI@c47a.createKeyWords$disable$1");
                Function0<Unit> function02 = C0NB4.LJFF;
                if (function02 != null) {
                    function02.invoke();
                }
                C1C7U.LIZIZ("ChooseReasonAPI@c47a.createKeyWords$disable$1");
            }
        }, new C09JN() { // from class: X.0NB3
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ChooseReasonAPI@c47a.createKeyWords$disable$2");
                Function1<? super Throwable, Unit> function1 = C0NB4.LJI;
                if (function1 != null) {
                    function1.invoke(obj);
                }
                C1C7U.LIZIZ("ChooseReasonAPI@c47a.createKeyWords$disable$2");
            }
        });
    }

    public static void LIZIZ(String str, String str2, List list, List list2) {
        if (!list.isEmpty()) {
            ((ArrayList) list2).add(6);
        }
        InterfaceC596400NaI interfaceC596400NaI = (InterfaceC596400NaI) LJIIIIZZ.getValue();
        Map<String, String> map = LIZ;
        Gson gson = LIZIZ;
        interfaceC596400NaI.LIZJ(str, str2, map, GsonProtectorUtils.toJson(gson, list), GsonProtectorUtils.toJson(gson, list2)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0NB5
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ChooseReasonAPI@c47a.dislikeAweme$disable$1");
                Function0<Unit> function0 = C0NB4.LIZLLL;
                if (function0 != null) {
                    function0.invoke();
                }
                C1C7U.LIZIZ("ChooseReasonAPI@c47a.dislikeAweme$disable$1");
            }
        }, new C09JN() { // from class: X.0NB6
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ChooseReasonAPI@c47a.dislikeAweme$disable$2");
                Function1<? super Throwable, Unit> function1 = C0NB4.LJ;
                if (function1 != null) {
                    function1.invoke(obj);
                }
                C1C7U.LIZIZ("ChooseReasonAPI@c47a.dislikeAweme$disable$2");
            }
        });
    }
}
