package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.UcpMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DBE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DBE {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            return string;
        }
        return null;
    }

    public static String LIZ(String str, String str2, List list) {
        String lowerCase;
        String string;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            UcpMessage ucpMessage = (UcpMessage) obj;
            if (str != null) {
                String str3 = ucpMessage.type;
                if (str3 == null || (string = a0.LJLIIIL(str3).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null) {
                    lowerCase = "";
                }
                if (Intrinsics.LJFF(lowerCase, str)) {
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strLIZIZ = LIZIZ(((UcpMessage) it2.next()).content);
            if (strLIZIZ != null) {
                arrayList2.add(strLIZIZ);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return C13LP.LJJLIIIJ(arrayList2, str2, null, null, 0, null, null, 62);
    }

    public static String LIZJ(C0DBM c0dbm, String str, List list) {
        List<UcpMessage> list2;
        String strLIZJ;
        String strLIZIZ;
        List list3;
        List<UcpMessage> list4;
        String lowerCase;
        String string;
        List list5 = list;
        String strLIZIZ2 = LIZIZ(str);
        if (Intrinsics.LJFF(c0dbm, C0DBD.LIZ)) {
            if (list5 == null) {
                list4 = C13BV.INSTANCE;
            } else {
                list4 = list5;
            }
            for (UcpMessage ucpMessage : list4) {
                String str2 = ucpMessage.type;
                if (str2 == null || (string = a0.LJLIIIL(str2).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null) {
                    lowerCase = "";
                }
                if (Intrinsics.LJFF(lowerCase, "error") && (strLIZJ = LIZIZ(ucpMessage.content)) != null) {
                    return strLIZJ;
                }
            }
            if (list5 == null) {
                list5 = C13BV.INSTANCE;
            }
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                String strLIZIZ3 = LIZIZ(((UcpMessage) it2.next()).content);
                if (strLIZIZ3 != null) {
                    return strLIZIZ3;
                }
            }
            return strLIZIZ2;
        }
        if (c0dbm instanceof C0DBG) {
            strLIZJ = LIZ("error", ((C0DBG) c0dbm).LIZ, list5);
        } else if (c0dbm instanceof C0DBI) {
            strLIZJ = LIZ("warning", ((C0DBI) c0dbm).LIZ, list5);
        } else if (c0dbm instanceof C0DBH) {
            strLIZJ = LIZ(null, ((C0DBH) c0dbm).LIZ, list5);
        } else if (c0dbm instanceof C0DBJ) {
            c0dbm.getClass();
            if (list5 == null) {
                list3 = C13BV.INSTANCE;
            } else {
                list3 = list5;
            }
            Iterator it3 = list3.iterator();
            if (it3.hasNext()) {
                String str3 = ((UcpMessage) it3.next()).code;
                if (str3 != null) {
                    a0.LJLIIIL(str3).toString();
                    throw null;
                }
                throw null;
            }
            strLIZJ = LIZJ(null, strLIZIZ2, list5);
        } else {
            if (c0dbm instanceof C0DBF) {
                C0DBF c0dbf = (C0DBF) c0dbm;
                Map<String, String> map = c0dbf.LIZ;
                C0DBL c0dbl = c0dbf.LIZIZ;
                String str4 = c0dbf.LIZJ;
                ArrayList arrayList = new ArrayList();
                if (list5 == null) {
                    list2 = C13BV.INSTANCE;
                } else {
                    list2 = list5;
                }
                for (UcpMessage ucpMessage2 : list2) {
                    String strLIZIZ4 = LIZIZ(ucpMessage2.code);
                    if (strLIZIZ4 != null && map.containsKey(strLIZIZ4)) {
                        int i = C0DBK.LIZ[c0dbl.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                strLIZIZ = LIZIZ(ucpMessage2.content);
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            strLIZIZ = LIZIZ(map.get(strLIZIZ4));
                        }
                        if (strLIZIZ != null && !arrayList.contains(strLIZIZ)) {
                            arrayList.add(strLIZIZ);
                        }
                    }
                }
                if (!(!arrayList.isEmpty()) || (strLIZJ = C13LP.LJJLIIIJ(arrayList, str4, null, null, 0, null, null, 62)) == null) {
                    C0DBM c0dbm2 = c0dbf.LIZLLL;
                    if (c0dbm2 != null) {
                        strLIZJ = LIZJ(c0dbm2, strLIZIZ2, list5);
                    }
                    return strLIZIZ2;
                }
                return strLIZJ;
            }
            throw new C1954807lC();
        }
        if (strLIZJ != null) {
            return strLIZJ;
        }
        return strLIZIZ2;
    }
}
