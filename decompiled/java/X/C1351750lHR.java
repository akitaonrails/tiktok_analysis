package X;

import com.ss.android.ugc.aweme.comment.model.HolidayModel;
import com.ss.android.ugc.aweme.comment.model.Keyword;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0lHR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351750lHR {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list, Map map) {
        int start;
        int end;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) it2.next();
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(textExtraStruct.getStart()));
                if (num != null) {
                    start = num.intValue();
                } else {
                    start = textExtraStruct.getStart();
                }
                Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(textExtraStruct.getEnd()));
                if (num2 != null) {
                    end = num2.intValue();
                } else {
                    end = textExtraStruct.getEnd();
                }
                TextExtraStruct textExtraStructM271clone = textExtraStruct.m271clone();
                textExtraStructM271clone.setStart(start);
                textExtraStructM271clone.setEnd(end);
                arrayList.add(textExtraStructM271clone);
            }
            return arrayList;
        }
        return null;
    }

    public static Map LIZIZ(CharSequence charSequence, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = charSequence.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!z && C1244080iTm.LJ(charSequence.charAt(i2))) {
                linkedHashMap.put(Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                linkedHashMap.put(Integer.valueOf(i2), Integer.valueOf(i));
                i++;
            }
        }
        return linkedHashMap;
    }

    public static String LIZLLL(HolidayModel holidayModel, CharSequence charSequence, List list) {
        Keyword keyword;
        CharSequence charSequenceLJJIFFI = charSequence;
        if (charSequenceLJJIFFI != null && holidayModel != null) {
            Boolean bool = holidayModel.caseSensitive;
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                charSequenceLJJIFFI = charSequenceLJJIFFI.toString().toLowerCase(Locale.ROOT);
            }
            Map mapLIZIZ = LIZIZ(charSequenceLJJIFFI, Intrinsics.LJFF(holidayModel.spaceSensitive, bool2));
            List listLIZ = LIZ(list, mapLIZIZ);
            if (!Intrinsics.LJFF(holidayModel.spaceSensitive, bool2)) {
                charSequenceLJJIFFI = u.LJJIFFI(charSequenceLJJIFFI.toString(), " ", "", false);
            }
            C443120HZe c443120HZeLIZJ = LIZJ(charSequenceLJJIFFI, holidayModel.keywords, listLIZ, mapLIZIZ, Intrinsics.LJFF(holidayModel.caseSensitive, bool2), Intrinsics.LJFF(holidayModel.spaceSensitive, bool2));
            if (c443120HZeLIZJ != null && (keyword = (Keyword) c443120HZeLIZJ.getThird()) != null) {
                return keyword.content;
            }
        }
        return null;
    }

    public static C443120HZe LIZJ(CharSequence charSequence, List list, List list2, Map map, boolean z, boolean z2) {
        String str;
        int length;
        Integer num;
        Integer num2;
        if (list == null) {
            return null;
        }
        List listLJJJJLI = C13LP.LJJJJLI(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
        for (Keyword keyword : (ArrayList) listLJJJJLI) {
            String strLJJIFFI = keyword.content;
            if (!z) {
                if (strLJJIFFI != null) {
                    strLJJIFFI = strLJJIFFI.toLowerCase(Locale.ROOT);
                } else {
                    strLJJIFFI = null;
                }
            }
            String str2 = "";
            if (!z2) {
                if (strLJJIFFI != null) {
                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, " ", "", false);
                } else {
                    strLJJIFFI = null;
                }
            }
            if (strLJJIFFI != null) {
                str2 = strLJJIFFI;
            }
            arrayList.add(new Pair(str2, keyword));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((CharSequence) ((Pair) obj).getFirst()).length() > 0) {
                arrayList2.add(obj);
            }
        }
        List<Pair> listLJLLLL = C13LP.LJLLLL(new C512401z8(29), arrayList2);
        int length2 = charSequence.length();
        for (int i = 0; i < length2; i++) {
            for (Pair pair : listLJLLLL) {
                String str3 = (String) pair.getFirst();
                Keyword keyword2 = (Keyword) pair.getSecond();
                if (str3 != null && str3.length() != 0 && (str = keyword2.content) != null && str.length() != 0 && (length = str3.length() + i) <= charSequence.length() && Intrinsics.LJFF(charSequence.subSequence(i, length).toString(), str3)) {
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            TextExtraStruct textExtraStruct = (TextExtraStruct) it2.next();
                            if (textExtraStruct.getStart() >= length || textExtraStruct.getEnd() <= i) {
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    Object obj2 = null;
                    for (Object obj3 : linkedHashMap.entrySet()) {
                        if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i) {
                            obj2 = obj3;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj2;
                    if (entry != null) {
                        num = (Integer) entry.getKey();
                    } else {
                        num = null;
                    }
                    Object obj4 = null;
                    for (Object obj5 : linkedHashMap.entrySet()) {
                        if (((Number) ((Map.Entry) obj5).getValue()).intValue() == length - 1) {
                            obj4 = obj5;
                        }
                    }
                    Map.Entry entry2 = (Map.Entry) obj4;
                    if (entry2 != null) {
                        num2 = (Integer) entry2.getKey();
                    } else {
                        num2 = null;
                    }
                    if (num == null) {
                        return null;
                    }
                    num.intValue();
                    if (num2 == null) {
                        return null;
                    }
                    num2.intValue();
                    return new C443120HZe(num, Integer.valueOf(num2.intValue() + 1), keyword2);
                }
            }
        }
        return null;
    }
}
