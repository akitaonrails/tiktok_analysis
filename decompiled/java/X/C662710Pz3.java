package X;

import android.text.Spannable;
import android.text.SpannableString;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662710Pz3 {
    public static final C01GW<WeakHashMap<Object, Map<String, HighlightInfo>>> LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(713));
    public final InterfaceC662700Pz2 LIZ;

    public C662710Pz3(InterfaceC662700Pz2 interfaceC662700Pz2) {
        this.LIZ = interfaceC662700Pz2;
    }

    public static SpannableString LIZIZ(C662710Pz3 c662710Pz3, String str) {
        c662710Pz3.getClass();
        SpannableString spannableString = new SpannableString(str);
        c662710Pz3.LIZ(spannableString, "search_desc", 0);
        return spannableString;
    }

    public final void LIZ(Spannable spannable, String str, int i) {
        List<HighlightInfo> listLIZ;
        HighlightInfo highlightInfo;
        List<Position> positions;
        List<HighlightInfo> listLIZ2 = this.LIZ.LIZ();
        if (listLIZ2 != null && !listLIZ2.isEmpty()) {
            C01GW<WeakHashMap<Object, Map<String, HighlightInfo>>> c01gw = LIZIZ;
            Map<String, HighlightInfo> map = c01gw.getValue().get(listLIZ2);
            if ((map == null || map.isEmpty()) && (listLIZ = this.LIZ.LIZ()) != null && (!listLIZ.isEmpty())) {
                Map<String, HighlightInfo> linkedHashMap = c01gw.getValue().get(listLIZ);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                for (HighlightInfo highlightInfo2 : listLIZ) {
                    String field = highlightInfo2.getField();
                    if (field != null) {
                        linkedHashMap.put(field, highlightInfo2);
                    }
                }
                LIZIZ.getValue().put(listLIZ, linkedHashMap);
            }
            Map<String, HighlightInfo> map2 = LIZIZ.getValue().get(listLIZ2);
            if (map2 != null && (highlightInfo = map2.get(str)) != null && (positions = highlightInfo.getPositions()) != null) {
                for (Position position : positions) {
                    String string = spannable.toString();
                    int iCodePointCount = string.codePointCount(0, string.length());
                    int iCodePointCount2 = string.codePointCount(0, i);
                    int begin = position.getBegin() + iCodePointCount2;
                    int end = position.getEnd() + iCodePointCount2;
                    if (begin >= 0 && begin <= iCodePointCount && end >= 0 && end <= iCodePointCount) {
                        int iOffsetByCodePoints = string.offsetByCodePoints(0, begin);
                        int iOffsetByCodePoints2 = string.offsetByCodePoints(0, end);
                        InterfaceC662700Pz2 interfaceC662700Pz2 = this.LIZ;
                        Position position2 = new Position();
                        position2.setBegin(iOffsetByCodePoints);
                        position2.setEnd(iOffsetByCodePoints2);
                        List listLIZIZ = interfaceC662700Pz2.LIZIZ(str);
                        if (listLIZIZ != null) {
                            Iterator it2 = listLIZIZ.iterator();
                            while (it2.hasNext()) {
                                C786410Ut5.o2(spannable, it2.next(), iOffsetByCodePoints, iOffsetByCodePoints2, 33);
                            }
                        }
                    }
                }
            }
        }
    }
}
