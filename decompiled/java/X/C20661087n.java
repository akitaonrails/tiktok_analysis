package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.087n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20661087n {
    public static boolean LIZ(Context context, ClassLoader classLoader, String str, boolean z, boolean z2) {
        int i;
        InterfaceC20662087o interfaceC20662087o;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (Build.VERSION.PREVIEW_SDK_INT != 0) {
            i = Build.VERSION.SDK_INT + 1;
        } else {
            i = Build.VERSION.SDK_INT;
        }
        if (i >= 26) {
            interfaceC20662087o = new InterfaceC20662087o() { // from class: X.087m
                @Override // X.InterfaceC20662087o
                public final boolean LIZ(ClassLoader classLoader2, String str2, boolean z3) {
                    List arrayList;
                    List list;
                    List arrayList2;
                    try {
                        Object obj = C1968507nP.LIZ(BaseDexClassLoader.class, "pathList").get(classLoader2);
                        Field fieldLIZ = C1968507nP.LIZ(obj.getClass(), "nativeLibraryDirectories");
                        Object obj2 = fieldLIZ.get(obj);
                        if (obj2 == null) {
                            arrayList = new ArrayList();
                        } else {
                            arrayList = (List) obj2;
                        }
                        String[] strArrSplit = str2.split(":");
                        ArrayList arrayList3 = new ArrayList(strArrSplit.length);
                        for (String str3 : strArrSplit) {
                            C0VSJ c0vsj = new C0VSJ(str3);
                            if ((c0vsj.exists() || c0vsj.mkdirs()) && !arrayList.contains(c0vsj)) {
                                arrayList3.add(c0vsj);
                            }
                        }
                        if (z3) {
                            if (arrayList instanceof CopyOnWriteArrayList) {
                                arrayList.addAll(0, arrayList3);
                                list = arrayList;
                            } else {
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                copyOnWriteArrayList.addAll(arrayList3);
                                copyOnWriteArrayList.addAll(arrayList);
                                fieldLIZ.set(obj, copyOnWriteArrayList);
                                list = copyOnWriteArrayList;
                            }
                        } else if (arrayList instanceof CopyOnWriteArrayList) {
                            arrayList.addAll(arrayList3);
                            list = arrayList;
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                            copyOnWriteArrayList2.addAll(arrayList);
                            copyOnWriteArrayList2.addAll(arrayList3);
                            fieldLIZ.set(obj, copyOnWriteArrayList2);
                            list = copyOnWriteArrayList2;
                        }
                        Object obj3 = C1968507nP.LIZ(obj.getClass(), "systemNativeLibraryDirectories").get(obj);
                        if (obj3 == null) {
                            arrayList2 = new ArrayList(2);
                        } else {
                            arrayList2 = (List) obj3;
                        }
                        ArrayList arrayList4 = new ArrayList(list.size() + arrayList2.size() + 1);
                        if (z3) {
                            arrayList4.addAll(arrayList3);
                            arrayList4.addAll(arrayList);
                            arrayList4.addAll(arrayList2);
                        } else {
                            arrayList4.addAll(arrayList);
                            arrayList4.addAll(arrayList3);
                            arrayList4.addAll(arrayList2);
                        }
                        C1968507nP.LIZ(obj.getClass(), "nativeLibraryPathElements").set(obj, (Object[]) C2204961BRm.a0(C1968507nP.LIZIZ(obj, List.class), obj, new Object[]{arrayList4}, new C0WZX("dzBzEgAjS8/YVFkiQFyeaXBVebGLNwp5+fZq6/zOq4kPNqjdJjpkzZm4HI0=", null)));
                        return true;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }
            };
        } else if (i >= 24) {
            interfaceC20662087o = new InterfaceC20662087o() { // from class: X.087l
                @Override // X.InterfaceC20662087o
                public final boolean LIZ(ClassLoader classLoader2, String str2, boolean z3) {
                    List arrayList;
                    List list;
                    List arrayList2;
                    try {
                        Object obj = C1968507nP.LIZ(BaseDexClassLoader.class, "pathList").get(classLoader2);
                        Field fieldLIZ = C1968507nP.LIZ(obj.getClass(), "nativeLibraryDirectories");
                        Object obj2 = fieldLIZ.get(obj);
                        if (obj2 == null) {
                            arrayList = new ArrayList();
                        } else {
                            arrayList = (List) obj2;
                        }
                        String[] strArrSplit = str2.split(":");
                        ArrayList arrayList3 = new ArrayList(strArrSplit.length);
                        for (String str3 : strArrSplit) {
                            C0VSJ c0vsj = new C0VSJ(str3);
                            if ((c0vsj.exists() || c0vsj.mkdirs()) && !arrayList.contains(c0vsj)) {
                                arrayList3.add(c0vsj);
                            }
                        }
                        if (z3) {
                            if (arrayList instanceof CopyOnWriteArrayList) {
                                arrayList.addAll(0, arrayList3);
                                list = arrayList;
                            } else {
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                copyOnWriteArrayList.addAll(arrayList3);
                                copyOnWriteArrayList.addAll(arrayList);
                                fieldLIZ.set(obj, copyOnWriteArrayList);
                                list = copyOnWriteArrayList;
                            }
                        } else if (arrayList instanceof CopyOnWriteArrayList) {
                            arrayList.addAll(arrayList3);
                            list = arrayList;
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                            copyOnWriteArrayList2.addAll(arrayList);
                            copyOnWriteArrayList2.addAll(arrayList3);
                            fieldLIZ.set(obj, copyOnWriteArrayList2);
                            list = copyOnWriteArrayList2;
                        }
                        Object obj3 = C1968507nP.LIZ(obj.getClass(), "systemNativeLibraryDirectories").get(obj);
                        if (obj3 == null) {
                            arrayList2 = new ArrayList(2);
                        } else {
                            arrayList2 = (List) obj3;
                        }
                        ArrayList arrayList4 = new ArrayList(list.size() + arrayList2.size() + 1);
                        if (z3) {
                            arrayList4.addAll(arrayList3);
                            arrayList4.addAll(arrayList);
                            arrayList4.addAll(arrayList2);
                        } else {
                            arrayList4.addAll(arrayList);
                            arrayList4.addAll(arrayList3);
                            arrayList4.addAll(arrayList2);
                        }
                        C1968507nP.LIZ(obj.getClass(), "nativeLibraryPathElements").set(obj, (Object[]) C2204961BRm.a0(C1968507nP.LIZIZ(obj, List.class, File.class, List.class), obj, new Object[]{arrayList4, null, new ArrayList()}, new C0WZX("dzBzEgAjS8/YVFkiQFyeaXBVebGLNwp5+fZq6/zOq4kPNqjdJjpkzZm4HIo=", null)));
                        return true;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }
            };
        } else if (i >= 23) {
            interfaceC20662087o = new InterfaceC20662087o() { // from class: X.087k
                @Override // X.InterfaceC20662087o
                public final boolean LIZ(ClassLoader classLoader2, String str2, boolean z3) {
                    List arrayList;
                    List list;
                    List arrayList2;
                    try {
                        Object obj = C1968507nP.LIZ(BaseDexClassLoader.class, "pathList").get(classLoader2);
                        Field fieldLIZ = C1968507nP.LIZ(obj.getClass(), "nativeLibraryDirectories");
                        Object obj2 = fieldLIZ.get(obj);
                        if (obj2 == null) {
                            arrayList = new ArrayList();
                        } else {
                            arrayList = (List) obj2;
                        }
                        String[] strArrSplit = str2.split(":");
                        ArrayList arrayList3 = new ArrayList(strArrSplit.length);
                        for (String str3 : strArrSplit) {
                            C0VSJ c0vsj = new C0VSJ(str3);
                            if ((c0vsj.exists() || c0vsj.mkdirs()) && !arrayList.contains(c0vsj)) {
                                arrayList3.add(c0vsj);
                            }
                        }
                        if (z3) {
                            if (arrayList instanceof CopyOnWriteArrayList) {
                                arrayList.addAll(0, arrayList3);
                                list = arrayList;
                            } else {
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                copyOnWriteArrayList.addAll(arrayList3);
                                copyOnWriteArrayList.addAll(arrayList);
                                fieldLIZ.set(obj, copyOnWriteArrayList);
                                list = copyOnWriteArrayList;
                            }
                        } else if (arrayList instanceof CopyOnWriteArrayList) {
                            arrayList.addAll(arrayList3);
                            list = arrayList;
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                            copyOnWriteArrayList2.addAll(arrayList);
                            copyOnWriteArrayList2.addAll(arrayList3);
                            fieldLIZ.set(obj, copyOnWriteArrayList2);
                            list = copyOnWriteArrayList2;
                        }
                        Object obj3 = C1968507nP.LIZ(obj.getClass(), "systemNativeLibraryDirectories").get(obj);
                        if (obj3 == null) {
                            arrayList2 = new ArrayList(2);
                        } else {
                            arrayList2 = (List) obj3;
                        }
                        ArrayList arrayList4 = new ArrayList(list.size() + arrayList2.size() + 1);
                        if (z3) {
                            arrayList4.addAll(arrayList3);
                            arrayList4.addAll(arrayList);
                            arrayList4.addAll(arrayList2);
                        } else {
                            arrayList4.addAll(arrayList);
                            arrayList4.addAll(arrayList3);
                            arrayList4.addAll(arrayList2);
                        }
                        C1968507nP.LIZ(obj.getClass(), "nativeLibraryPathElements").set(obj, (Object[]) C2204961BRm.a0(C1968507nP.LIZIZ(obj, List.class, File.class, List.class), obj, new Object[]{arrayList4, null, new ArrayList()}, new C0WZX("dzBzEgAjS8/YVFkiQFyeaXBVebGLNwp5+fZq6/zOq4kPNqjdJjpkzZm4HIs=", null)));
                        return true;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }
            };
        } else {
            if (i < 14) {
                return false;
            }
            interfaceC20662087o = new InterfaceC20662087o() { // from class: X.087j
                @Override // X.InterfaceC20662087o
                public final boolean LIZ(ClassLoader classLoader2, String str2, boolean z3) {
                    File[] fileArr;
                    synchronized (C20657087j.class) {
                        try {
                            try {
                                Object obj = C1968507nP.LIZ(BaseDexClassLoader.class, "pathList").get(classLoader2);
                                Field fieldLIZ = C1968507nP.LIZ(obj.getClass(), "nativeLibraryDirectories");
                                Object obj2 = fieldLIZ.get(obj);
                                if (obj2 == null) {
                                    fileArr = new File[0];
                                } else {
                                    fileArr = (File[]) obj2;
                                }
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String[] strArrSplit = str2.split(":");
                                ArrayList arrayList = new ArrayList(strArrSplit.length);
                                List listAsList = Arrays.asList(fileArr);
                                for (String str3 : strArrSplit) {
                                    C0VSJ c0vsj = new C0VSJ(str3);
                                    if ((c0vsj.exists() || c0vsj.mkdirs()) && !listAsList.contains(c0vsj)) {
                                        arrayList.add(c0vsj);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(fileArr.length + arrayList.size());
                                if (z3) {
                                    arrayList2.addAll(arrayList);
                                    Collections.addAll(arrayList2, fileArr);
                                } else {
                                    Collections.addAll(arrayList2, fileArr);
                                    arrayList2.addAll(arrayList);
                                }
                                fieldLIZ.set(obj, arrayList2.toArray(new File[0]));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return false;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                    return true;
                }
            };
        }
        return interfaceC20662087o.LIZ(classLoader, str, z);
    }
}
