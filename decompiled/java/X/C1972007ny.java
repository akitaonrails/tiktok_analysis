package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1972007ny {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(Object obj, String str) {
        LazyDataBase lazyDataBase;
        String lazyDataKey;
        if ((obj instanceof LazyDataBase) && (lazyDataKey = (lazyDataBase = (LazyDataBase) obj).getLazyDataKey()) != null && lazyDataKey.length() != 0) {
            Boolean bool = lazyDataBase.getLazyDataInitializedMarkMap().get(str);
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                lazyDataBase.getLazyDataInitializedMarkMap().put(str, bool2);
            }
        }
    }

    public static Object LIZIZ(Object obj, String str, Object obj2) {
        LazyDataBase lazyDataBase;
        String lazyDataKey;
        if ((obj instanceof LazyDataBase) && (lazyDataKey = (lazyDataBase = (LazyDataBase) obj).getLazyDataKey()) != null && lazyDataKey.length() != 0) {
            Boolean bool = lazyDataBase.getLazyDataInitializedMarkMap().get(str);
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(lazyDataBase.getLazyDataKey());
                sbLIZ.append('-');
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Keva kevaLIZJ = C1971707nv.LIZJ(lazyDataBase.getLazyDataRootKey());
                if (obj2 != null) {
                    if (obj2 instanceof Integer) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append("-int");
                        obj2 = Integer.valueOf(kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ2), ((Number) obj2).intValue()));
                    } else if (obj2 instanceof Float) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append("-float");
                        obj2 = Float.valueOf(kevaLIZJ.getFloat(C2188811AlT.LIZIZ(sbLIZ3), ((Number) obj2).floatValue()));
                    } else if (obj2 instanceof Boolean) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(strLIZIZ);
                        sbLIZ4.append("-boolean");
                        obj2 = Boolean.valueOf(kevaLIZJ.getBoolean(C2188811AlT.LIZIZ(sbLIZ4), ((Boolean) obj2).booleanValue()));
                    } else if (obj2 instanceof Double) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(strLIZIZ);
                        sbLIZ5.append("-double");
                        obj2 = Double.valueOf(kevaLIZJ.getDouble(C2188811AlT.LIZIZ(sbLIZ5), ((Number) obj2).doubleValue()));
                    } else if (obj2 instanceof Long) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(strLIZIZ);
                        sbLIZ6.append("-long");
                        obj2 = Long.valueOf(kevaLIZJ.getLong(C2188811AlT.LIZIZ(sbLIZ6), ((Number) obj2).longValue()));
                    } else if (obj2 instanceof String) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(strLIZIZ);
                        sbLIZ7.append("-string");
                        obj2 = kevaLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ7), (String) obj2);
                    }
                } else {
                    obj2 = null;
                }
                lazyDataBase.getLazyDataInitializedMarkMap().put(str, bool2);
            }
        }
        return obj2;
    }

    public static ArrayList LIZ(Object obj, List list, Class cls, String str) {
        ArrayList arrayList;
        if (obj instanceof LazyDataBase) {
            LazyDataBase lazyDataBase = (LazyDataBase) obj;
            String lazyDataKey = lazyDataBase.getLazyDataKey();
            int i = 0;
            if (lazyDataKey != null && lazyDataKey.length() != 0) {
                Boolean bool = lazyDataBase.getLazyDataInitializedMarkMap().get(str);
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.LJFF(bool, bool2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(lazyDataBase.getLazyDataKey());
                    sbLIZ.append('-');
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    Keva kevaLIZJ = C1971707nv.LIZJ(lazyDataBase.getLazyDataRootKey());
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append("-size");
                    int i2 = kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
                    if (i2 <= 0) {
                        lazyDataBase.getLazyDataInitializedMarkMap().put(str, bool2);
                        if (!(list instanceof ArrayList) || (arrayList = (ArrayList) list) == null) {
                            return new ArrayList();
                        }
                        return arrayList;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (Intrinsics.LJFF(cls, Integer.TYPE)) {
                        int i3 = 0;
                        do {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ);
                            sbLIZ3.append('-');
                            sbLIZ3.append(i3);
                            sbLIZ3.append("-int");
                            arrayList2.add(Integer.valueOf(kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ3), 0)));
                            i3++;
                        } while (i3 < i2);
                    } else if (!Intrinsics.LJFF(cls, Float.TYPE)) {
                        if (Intrinsics.LJFF(cls, Boolean.TYPE)) {
                            int i4 = 0;
                            do {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(strLIZIZ);
                                sbLIZ4.append('-');
                                sbLIZ4.append(i4);
                                sbLIZ4.append("-boolean");
                                arrayList2.add(Boolean.valueOf(kevaLIZJ.getBoolean(C2188811AlT.LIZIZ(sbLIZ4), false)));
                                i4++;
                            } while (i4 < i2);
                        } else if (!Intrinsics.LJFF(cls, Double.TYPE)) {
                            if (!Intrinsics.LJFF(cls, Long.TYPE)) {
                                if (!Intrinsics.LJFF(cls, String.class)) {
                                    if (!Intrinsics.LJFF(cls, Collection.class) && !Intrinsics.LJFF(cls, Map.class) && !Intrinsics.LJFF(cls, Object[].class)) {
                                        do {
                                            Object objNewInstance = cls.newInstance();
                                            if (objNewInstance instanceof LazyDataBase) {
                                                LIZLLL(lazyDataBase.getLazyDataRootKey(), strLIZIZ, (LazyDataBase) objNewInstance, String.valueOf(i));
                                            }
                                            arrayList2.add(objNewInstance);
                                            i++;
                                        } while (i < i2);
                                    }
                                } else {
                                    do {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append(strLIZIZ);
                                        sbLIZ5.append('-');
                                        sbLIZ5.append(i);
                                        sbLIZ5.append("-string");
                                        arrayList2.add(kevaLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ5), ""));
                                        i++;
                                    } while (i < i2);
                                }
                            } else {
                                do {
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append(strLIZIZ);
                                    sbLIZ6.append('-');
                                    sbLIZ6.append(i);
                                    sbLIZ6.append("-long");
                                    arrayList2.add(Long.valueOf(kevaLIZJ.getLong(C2188811AlT.LIZIZ(sbLIZ6), 0L)));
                                    i++;
                                } while (i < i2);
                            }
                        } else {
                            do {
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append(strLIZIZ);
                                sbLIZ7.append('-');
                                sbLIZ7.append(i);
                                sbLIZ7.append("-double");
                                arrayList2.add(Double.valueOf(kevaLIZJ.getDouble(C2188811AlT.LIZIZ(sbLIZ7), 0.0d)));
                                i++;
                            } while (i < i2);
                        }
                    } else {
                        do {
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append(strLIZIZ);
                            sbLIZ8.append('-');
                            sbLIZ8.append(i);
                            sbLIZ8.append("-float");
                            arrayList2.add(Float.valueOf(kevaLIZJ.getFloat(C2188811AlT.LIZIZ(sbLIZ8), 0.0f)));
                            i++;
                        } while (i < i2);
                    }
                    lazyDataBase.getLazyDataInitializedMarkMap().put(str, Boolean.TRUE);
                    return arrayList2;
                }
            }
        }
        if (list == null) {
            return new ArrayList();
        }
        if (list instanceof ArrayList) {
            return (ArrayList) list;
        }
        ArrayList arrayList3 = new ArrayList();
        C13LP.LLFII(list, arrayList3);
        return arrayList3;
    }

    public static void LIZLLL(String str, String str2, LazyDataBase lazyDataBase, String str3) {
        if (str2 != null && str2.length() != 0 && lazyDataBase.getLazyDataKey().length() == 0) {
            lazyDataBase.setLazyDataInitializedMarkMap(new ConcurrentHashMap<>());
            lazyDataBase.setLazyDataRootKey(str);
            if (str3.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('-');
                sbLIZ.append(str3);
                str2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            lazyDataBase.setLazyDataKey(str2);
        }
    }
}
