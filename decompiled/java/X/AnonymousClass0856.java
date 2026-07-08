package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0856, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0856 implements InterfaceC1548390qOb {
    public final C01GW LL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 200));
    public Function2<? super String, ? super Map<String, ? extends Object>, Unit> LLILLJJLI;
    public Function1<? super Map<String, ? extends Object>, Unit> LLILLL;

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onVisualSearchResultShown(C2036207yK c2036207yK) {
        if (AnonymousClass0855.LIZ[c2036207yK.LIZ.ordinal()] == 1) {
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("source", c2036207yK.LIZ.getValue());
            String str = c2036207yK.LIZIZ;
            if (str == null) {
                str = "";
            }
            pairArr[1] = new Pair("source_id", str);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            Function1<? super Map<String, ? extends Object>, Unit> function1 = this.LLILLL;
            if (function1 != null) {
                function1.invoke(mapLJIIIIZZ);
                return;
            }
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1548390qOb
    public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str) {
        Map<String, Object> mapLIZ;
        if (Intrinsics.LJFF(str, "visualSearchMiddlePageBannerClicked")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (interfaceC1107590evd != null && (mapLIZ = interfaceC1107590evd.LIZ()) != null) {
                for (Map.Entry<String, Object> entry : mapLIZ.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        linkedHashMap.put(entry.getKey(), value);
                    }
                }
            }
            Object obj = linkedHashMap.get("blankpage_id");
            if (!(obj instanceof String) || obj == null) {
                obj = "";
            }
            Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2 = this.LLILLJJLI;
            if (function2 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (Intrinsics.LJFF(entry2.getKey(), "words_content") || Intrinsics.LJFF(entry2.getKey(), "banner_id")) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                function2.invoke(obj, linkedHashMap2);
            }
        }
    }
}
