package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS458S0200000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13y7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20182913y7 {
    public C20182913y7() {
        new C20183313yB();
    }

    public static List LJIIL(Class cls) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Class superclass = cls;
        while (superclass != null && !Intrinsics.LJFF(superclass, Object.class) && i < 10) {
            try {
                C19719612Di.LJJII(arrayList, superclass.getDeclaredFields());
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot access fields of ");
                sbLIZ.append(superclass.getSimpleName());
                sbLIZ.append(": ");
                sbLIZ.append(e.getMessage());
                C20183113y9.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            superclass = superclass.getSuperclass();
            i++;
        }
        if (i >= 10) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Deep inheritance detected for ");
            sbLIZ2.append(cls.getSimpleName());
            sbLIZ2.append(", stopped at depth 10");
            C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return arrayList;
    }

    public static boolean LJIJI(Object obj) {
        String name = obj.getClass().getName();
        List listLJIIJJI = C1697810uHb.LJIIJJI("com.ss.android.ugc.aweme", "com.bytedance.");
        List listLJIIJJI2 = C1697810uHb.LJIIJJI("java.", "javax.", "sun.", "android.", "androidx.", "kotlin.", "kotlinx.", "com.google.", "com.facebook.", "com.squareup.", "okhttp3.", "okio.", "retrofit2.", "io.reactivex.", "org.jetbrains.", "org.apache.", "org.json.");
        if (!(listLJIIJJI2 instanceof Collection) || !listLJIIJJI2.isEmpty()) {
            Iterator it2 = listLJIIJJI2.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(name, (String) it2.next(), false)) {
                    return false;
                }
            }
        }
        if ((listLJIIJJI instanceof Collection) && listLJIIJJI.isEmpty()) {
            return false;
        }
        Iterator it3 = listLJIIJJI.iterator();
        while (it3.hasNext()) {
            if (u.LJJIIJZLJL(name, (String) it3.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIJJ(Object obj) {
        if (LJIJJLI(obj)) {
            return false;
        }
        return LJIJI(obj);
    }

    public static boolean LJIJJLI(Object obj) {
        if (!obj.getClass().isPrimitive() && !(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Enum) && !(obj instanceof Class) && !(obj instanceof Date) && !(obj instanceof Calendar)) {
            return false;
        }
        return true;
    }

    public static boolean LJIL(String str) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(Files.isSymbolicLink(Paths.get(str, new String[0])));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static String LIZ(String str, String str2) {
        if (str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('.');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str2;
    }

    public static float LIZJ(long j, Long l) {
        long jLongValue;
        if (l != null) {
            jLongValue = l.longValue();
            if (jLongValue <= 0) {
                return 0.0f;
            }
        } else {
            jLongValue = 137438953472L;
        }
        return (j / jLongValue) * 100;
    }

    public static C20183913yH LJII(C20182913y7 c20182913y7, C20183413yC c20183413yC) {
        c20182913y7.getClass();
        C0VSJ c0vsj = new C0VSJ(c20183413yC.LIZ);
        String str = c20183413yC.LIZ;
        return new C20183913yH(str, LJIIJJI(str, null), c0vsj.getName(), C08QA.LJIJ(c0vsj), 0L, 0.0f, c20183413yC.LIZIZ, true, Boolean.FALSE, c20183413yC.LIZJ, false, null, false, null, true, null);
    }

    public static EnumC19373010qm LJIIIZ(String str, String str2) {
        Object c098200Yq;
        try {
            String strLJFF = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF();
            String persistentRoot = C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot();
            if (u.LJJIIJZLJL(str, strLJFF, false)) {
                c098200Yq = EnumC19373010qm.PUBLIC;
            } else if (u.LJJIIJZLJL(str, persistentRoot, false)) {
                c098200Yq = EnumC19373010qm.PERSISTENT;
            } else if (u.LJJIIJZLJL(str, str2, false)) {
                c098200Yq = EnumC19373010qm.PRIVATE;
            } else {
                c098200Yq = EnumC19373010qm.PRIVATE;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to determine NLE resource type for: ");
            sbLIZ.append(str);
            C20183113y9.LJIIJJI("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
            c098200Yq = EnumC19373010qm.PRIVATE;
        }
        return (EnumC19373010qm) c098200Yq;
    }

    public static String LJIIJJI(String str, String str2) {
        boolean z = true;
        if (str2 != null && str2.length() != 0 && u.LJJIIJZLJL(str, str2, false)) {
            String strLJLJJLL = a0.LJLJJLL(str.substring(str2.length()), '/');
            if (strLJLJJLL.length() != 0) {
                z = false;
            }
            if (z) {
                return "/";
            }
            if (!u.LJJIIJZLJL(strLJLJJLL, "/", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(strLJLJJLL);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return strLJLJJLL;
        }
        return new C0VSJ(str).getName();
    }

    public static boolean LJJI(Field field, Object obj) {
        int modifiers = field.getModifiers();
        if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || field.isSynthetic() || LJIJJLI(obj)) {
            return false;
        }
        if ((obj instanceof Collection) || (obj instanceof Map) || (obj instanceof Object[])) {
            return true;
        }
        return LJIJI(obj);
    }

    public final List<C20183913yH> LIZLLL(AwemeDraft awemeDraft, Long l) {
        Object c098200Yq;
        List listLLIIII;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int iIntValue;
        String str;
        boolean z4;
        NLEModel nLEModel;
        NLEInfoModel nLEInfoModel;
        ArrayList<C20183913yH> arrayList = new ArrayList();
        ArrayList<C20183413yC> arrayList2 = new ArrayList();
        C20183213yA c20183213yA = new C20183213yA();
        try {
            LJI(awemeDraft, AwemeDraft.class, arrayList2, "", c20183213yA);
            if (c20183213yA.LIZJ > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Skipped ");
                sbLIZ.append(c20183213yA.LIZJ);
                sbLIZ.append(" large collections during path collection");
                C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (arrayList2.size() >= 10000) {
                C20183113y9.LJIIJ("FilePathMapper", "Path collection reached maximum limit of 10000");
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
            C20183113y9.LIZLLL("FilePathMapper", "Failed to collect annotated paths", thM5exceptionOrNullimpl);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Collected ");
        sbLIZ2.append(arrayList2.size());
        sbLIZ2.append(" raw annotated paths from AwemeDraft object tree");
        C20183113y9.LJIIIIZZ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C20183413yC c20183413yC : arrayList2) {
            String str2 = c20183413yC.LIZIZ;
            if (!linkedHashMap.containsKey(str2)) {
                linkedHashMap.put(str2, c20183413yC);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Duplicate field mapping found, skipping: ");
                sbLIZ3.append(str2);
                sbLIZ3.append(" -> ");
                sbLIZ3.append(c20183413yC.LIZ);
                C20183113y9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        List listLLIIII2 = C13LP.LLIIII(linkedHashMap.values());
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("After field mapping deduplication: ");
        sbLIZ4.append(listLLIIII2.size());
        sbLIZ4.append(" unique field mappings (removed ");
        sbLIZ4.append(arrayList2.size() - listLLIIII2.size());
        sbLIZ4.append(" duplicate field mappings)");
        C20183113y9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
        String strLIZ = C2400309ar.LIZ(awemeDraft);
        ArrayList arrayList3 = new ArrayList();
        ArrayList<C20183913yH> arrayList4 = new ArrayList();
        Iterator it2 = listLLIIII2.iterator();
        while (true) {
            Object c098200Yq2 = null;
            if (!it2.hasNext()) {
                break;
            }
            C20183413yC c20183413yC2 = (C20183413yC) it2.next();
            try {
                C20183913yH c20183913yHLJIILJJIL = LJIILJJIL(c20183413yC2, l, awemeDraft, strLIZ);
                if (c20183913yHLJIILJJIL != null) {
                    arrayList3.add(c20183913yHLJIILJJIL);
                    if (!c20183913yHLJIILJJIL.LJIILJJIL) {
                        arrayList4.add(c20183913yHLJIILJJIL);
                    }
                    c098200Yq2 = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl2 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Failed to convert path to FileDetail: ");
                sbLIZ5.append(c20183413yC2.LIZ);
                C20183113y9.LIZLLL("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ5), thM5exceptionOrNullimpl2);
            }
        }
        if (!arrayList4.isEmpty()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Found ");
            sbLIZ6.append(arrayList4.size());
            sbLIZ6.append(" invalid paths:");
            C20183113y9.LIZJ(C2188811AlT.LIZIZ(sbLIZ6));
            for (C20183913yH c20183913yH : arrayList4) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("  - ");
                sbLIZ7.append(c20183913yH.LIZ);
                sbLIZ7.append(": ");
                sbLIZ7.append(c20183913yH.LJIILL);
                C20183113y9.LIZJ(C2188811AlT.LIZIZ(sbLIZ7));
            }
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLLIIII2, 10));
        Iterator it3 = listLLIIII2.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C20183413yC) it3.next()).LIZ);
        }
        C13LP.LLIIJI(arrayList5);
        new ArrayList();
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listLLIIII2, 10));
        Iterator it4 = listLLIIII2.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C20183413yC) it4.next()).LIZ);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList6);
        C0VSJ c0vsj = new C0VSJ(strLIZ);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            ArrayList<C20183913yH> arrayList7 = new ArrayList();
            LJJ(c0vsj, setLLIIJI, arrayList7, l, strLIZ);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (C20183913yH c20183913yH2 : arrayList7) {
                String str3 = c20183913yH2.LIZ;
                if (!linkedHashMap2.containsKey(str3)) {
                    linkedHashMap2.put(str3, c20183913yH2);
                } else {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("Duplicate undeclared file path found, skipping: ");
                    sbLIZ8.append(str3);
                    C20183113y9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ8));
                }
            }
            listLLIIII = C13LP.LLIIII(linkedHashMap2.values());
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("Found ");
            sbLIZ9.append(arrayList7.size());
            sbLIZ9.append(" undeclared files, after path deduplication: ");
            sbLIZ9.append(listLLIIII.size());
            C20183113y9.LJIIIIZZ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ9));
        } else {
            listLLIIII = C13BV.INSTANCE;
        }
        arrayList.addAll(listLLIIII);
        ArrayList arrayList8 = new ArrayList();
        try {
            CreativeModel creativeModel = awemeDraft.LIZ;
            if (creativeModel != null && (nLEInfoModel = creativeModel.nleInfoModel) != null) {
                nLEModel = nLEInfoModel.nleModel;
            } else {
                nLEModel = null;
            }
            C189200o6.m2constructorimpl(Boolean.valueOf(arrayList8.addAll(LJFF(nLEModel, l, strLIZ))));
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        try {
            NLEEditor nLEEditor = new NLEEditor();
            nLEEditor.restore(awemeDraft.LIZ.editorProDraftModel.nleData);
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("NLE.Pro collect nle model files, has: ");
            if (nLEEditor.getModel() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            sbLIZ10.append(z4);
            C20183113y9.LJI(C2188811AlT.LIZIZ(sbLIZ10));
            C189200o6.m2constructorimpl(Boolean.valueOf(arrayList8.addAll(LJFF(nLEEditor.getModel(), l, strLIZ))));
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            C189200o6.m2constructorimpl(new C098200Yq(th4));
        }
        arrayList.addAll(arrayList8);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (C20183913yH c20183913yH3 : arrayList) {
            String str4 = c20183913yH3.LIZ;
            if (!linkedHashMap3.containsKey(str4)) {
                linkedHashMap3.put(str4, c20183913yH3);
                linkedHashMap4.put(str4, 1);
            } else {
                Integer num = (Integer) linkedHashMap4.get(str4);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                linkedHashMap4.put(str4, Integer.valueOf(iIntValue + 1));
                if (c20183913yH3.LJII && c20183913yH3.LJI != null) {
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("Duplicate file path found: ");
                    sbLIZ11.append(str4);
                    C20183113y9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ11));
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("  - Keeping field mapping: ");
                    C20183913yH c20183913yH4 = (C20183913yH) linkedHashMap3.get(str4);
                    if (c20183913yH4 != null) {
                        str = c20183913yH4.LJI;
                    } else {
                        str = null;
                    }
                    sbLIZ12.append(str);
                    C20183113y9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ12));
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("  - Discarding field mapping: ");
                    sbLIZ13.append(c20183913yH3.LJI);
                    C20183113y9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ13));
                }
            }
        }
        Collection collectionValues = linkedHashMap4.values();
        ArrayList arrayList9 = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() > 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                arrayList9.add(obj);
            }
        }
        int iLJZI = C13LP.LJZI(arrayList9);
        Collection collectionValues2 = linkedHashMap4.values();
        if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
            i = 0;
        } else {
            Iterator it5 = collectionValues2.iterator();
            i = 0;
            while (it5.hasNext()) {
                if (((Number) it5.next()).intValue() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i2 = iLJZI - i;
        if (i2 > 0) {
            C20183113y9.LIZIZ("Deduplication summary: removed " + i2 + " duplicate file entries");
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap4.entrySet()) {
                if (((Number) entry.getValue()).intValue() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap5.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                String str5 = (String) entry2.getKey();
                int iIntValue2 = ((Number) entry2.getValue()).intValue();
                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                sbLIZ14.append("  - ");
                sbLIZ14.append(str5);
                sbLIZ14.append(": appeared ");
                sbLIZ14.append(iIntValue2);
                sbLIZ14.append(" times, kept 1");
                C20183113y9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ14));
            }
        }
        List<C20183913yH> listLLIIII3 = C13LP.LLIIII(linkedHashMap3.values());
        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
        sbLIZ15.append("Final deduplication: ");
        sbLIZ15.append(arrayList.size());
        sbLIZ15.append(" files reduced to ");
        sbLIZ15.append(listLLIIII3.size());
        sbLIZ15.append(" unique files");
        C20183113y9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ15));
        return listLLIIII3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:23:0x005f, B:25:0x0065, B:31:0x0071, B:32:0x008b, B:34:0x0091, B:37:0x0099, B:39:0x00d5, B:40:0x00ed), top: B:56:0x005f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:23:0x005f, B:25:0x0065, B:31:0x0071, B:32:0x008b, B:34:0x0091, B:37:0x0099, B:39:0x00d5, B:40:0x00ed), top: B:56:0x005f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF(com.bytedance.ies.nle.editor_jni.NLEModel r9, java.lang.Long r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20182913y7.LJFF(com.bytedance.ies.nle.editor_jni.NLEModel, java.lang.Long, java.lang.String):java.util.List");
    }

    public static C20183513yD LJJIFFI(String str, EnumC19373010qm enumC19373010qm, AwemeDraft awemeDraft) {
        EnumC19373010qm enumC19373010qm2;
        String strLIZ = C2400309ar.LIZ(awemeDraft);
        String strLJFF = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF();
        String persistentRoot = C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot();
        if (u.LJJIIJZLJL(str, strLJFF, false)) {
            enumC19373010qm2 = EnumC19373010qm.PUBLIC;
        } else if (u.LJJIIJZLJL(str, persistentRoot, false)) {
            enumC19373010qm2 = EnumC19373010qm.PERSISTENT;
        } else if (u.LJJIIJZLJL(str, strLIZ, false)) {
            enumC19373010qm2 = EnumC19373010qm.PRIVATE;
        } else {
            enumC19373010qm2 = EnumC19373010qm.PRIVATE;
        }
        if (enumC19373010qm == enumC19373010qm2) {
            return new C20183513yD(true, null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Path type mismatch: declared as ");
        sbLIZ.append(enumC19373010qm);
        sbLIZ.append(" but stored in ");
        sbLIZ.append(enumC19373010qm2);
        sbLIZ.append(" location. Path: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C20183113y9.LIZJ(strLIZIZ);
        return new C20183513yD(false, strLIZIZ);
    }

    public final C20183913yH LJIJ(C20183413yC c20183413yC, Long l, String str) {
        Object c098200Yq;
        try {
            Path path = Paths.get(c20183413yC.LIZ, new String[0]);
            if (Files.isSymbolicLink(path)) {
                Path symbolicLink = Files.readSymbolicLink(path);
                File file = symbolicLink.toFile();
                if (file.exists() && file.isFile()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Following symbolic link: ");
                    sbLIZ.append(c20183413yC.LIZ);
                    sbLIZ.append(" -> ");
                    sbLIZ.append(symbolicLink);
                    C20183113y9.LIZ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ));
                    String str2 = c20183413yC.LIZ;
                    c098200Yq = new C20183913yH(str2, LJIIJJI(str2, str), file.getName(), C08QA.LJIJ(file), file.length(), LIZJ(file.length(), l), c20183413yC.LIZIZ, true, Boolean.FALSE, c20183413yC.LIZJ, true, null, false, null, true, null);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Symbolic link target does not exist: ");
                    sbLIZ2.append(symbolicLink);
                    C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ2));
                    c098200Yq = LJII(this, c20183413yC);
                }
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Failed to handle symbolic link: ");
            sbLIZ3.append(c20183413yC.LIZ);
            C20183113y9.LIZLLL("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ3), thM5exceptionOrNullimpl);
            c098200Yq = LJII(this, c20183413yC);
        }
        return (C20183913yH) c098200Yq;
    }

    public static void LIZIZ(File file, long j, int i, Function2 function2) {
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = j;
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = i;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LIZIZ(file2, c238400w2.element, c118300cf.element, new AwS458S0200000_23(c238400w2, c118300cf, 2));
                } else {
                    c238400w2.element += file2.length();
                    c118300cf.element++;
                }
            }
        }
        function2.invoke(Long.valueOf(c238400w2.element), Integer.valueOf(c118300cf.element));
    }

    public static C20183913yH LJIIIIZZ(Long l, String str, String str2, String str3) {
        Object c098200Yq;
        Object obj;
        boolean z;
        long length;
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists() || !c0vsj.isFile()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NLE resource file not exists: ");
                sbLIZ.append(str);
                C20183113y9.LJI(C2188811AlT.LIZIZ(sbLIZ));
            }
            String name = c0vsj.getName();
            String strLJIJ = C08QA.LJIJ(c0vsj);
            if (z) {
                length = c0vsj.length();
            } else {
                length = 0;
            }
            c098200Yq = new C20183913yH(str, LJIIJJI(str, str3), name, strLJIJ, length, LIZJ(length, l), str2, false, Boolean.TRUE, LJIIIZ(str, str3), z, null, false, null, true, null);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to create NLE FileDetail for: ");
            sbLIZ2.append(str);
            C20183113y9.LIZLLL("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
            obj = null;
        }
        return (C20183913yH) obj;
    }

    public final void LJIIJ(Object obj, List<C20183413yC> list, String str, C20183213yA c20183213yA) {
        try {
            Class<?> cls = obj.getClass();
            for (Field field : (ArrayList) LJIIL(cls)) {
                try {
                    try {
                        field.setAccessible(true);
                        try {
                            Object obj2 = field.get(obj);
                            if (obj2 != null && LJJI(field, obj2)) {
                                String strLIZ = LIZ(str, field.getName());
                                if (LJIJJ(obj2)) {
                                    LJI(obj2, obj2.getClass(), list, strLIZ, c20183213yA);
                                } else if (obj2 instanceof Object[]) {
                                    LJIILIIL((Object[]) obj2, strLIZ, list, c20183213yA);
                                } else if (obj2 instanceof Collection) {
                                    LJIILL((Collection) obj2, strLIZ, list, c20183213yA);
                                } else if (obj2 instanceof Map) {
                                    LJIIZILJ((Map) obj2, strLIZ, list, c20183213yA);
                                }
                            }
                        } catch (SecurityException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Security error accessing field ");
                            sbLIZ.append(field.getName());
                            sbLIZ.append(": ");
                            sbLIZ.append(e.getMessage());
                            C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } catch (SecurityException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Cannot access field ");
                        sbLIZ2.append(field.getName());
                        sbLIZ2.append(" in ");
                        sbLIZ2.append(cls.getSimpleName());
                        C20183113y9.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } catch (IllegalAccessException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Cannot access field ");
                    sbLIZ3.append(field.getName());
                    sbLIZ3.append(": ");
                    sbLIZ3.append(e3.getMessage());
                    C20183113y9.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                } catch (ReflectiveOperationException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Reflection error processing field ");
                    sbLIZ4.append(field.getName());
                    sbLIZ4.append(": ");
                    sbLIZ4.append(e4.getMessage());
                    C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ4));
                } catch (RuntimeException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Runtime error processing field ");
                    sbLIZ5.append(field.getName());
                    sbLIZ5.append(": ");
                    sbLIZ5.append(e5.getMessage());
                    C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
        } catch (ReflectiveOperationException e6) {
            TryCatchGuardChecker.doCheck(e6);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Reflection error exploring nested objects for ");
            sbLIZ6.append(obj.getClass().getSimpleName());
            C20183113y9.LIZLLL("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ6), e6);
        } catch (SecurityException e7) {
            TryCatchGuardChecker.doCheck(e7);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Security exception exploring ");
            sbLIZ7.append(obj.getClass().getSimpleName());
            sbLIZ7.append(": ");
            sbLIZ7.append(e7.getMessage());
            C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ7));
        } catch (RuntimeException e8) {
            TryCatchGuardChecker.doCheck(e8);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("Runtime error exploring nested objects for ");
            sbLIZ8.append(obj.getClass().getSimpleName());
            C20183113y9.LIZLLL("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ8), e8);
        }
    }

    public final void LJIILIIL(Object[] objArr, String str, List<C20183413yC> list, C20183213yA c20183213yA) {
        if (objArr.length > 1000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Large array detected at ");
            sbLIZ.append(str);
            sbLIZ.append(" with ");
            sbLIZ.append(objArr.length);
            sbLIZ.append(" elements, processing first 1000");
            C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ));
            c20183213yA.LIZJ++;
        }
        int iMin = Math.min(objArr.length, LSPassThroughRecordSizeConfig.DEFAULT);
        for (int i = 0; i < iMin; i++) {
            Object obj = objArr[i];
            if (obj != null && LJIJJ(obj)) {
                Class<?> cls = obj.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('[');
                sbLIZ2.append(i);
                sbLIZ2.append(']');
                LJI(obj, cls, list, C2188811AlT.LIZIZ(sbLIZ2), c20183213yA);
            }
        }
    }

    public final C20183913yH LJIILJJIL(C20183413yC c20183413yC, Long l, AwemeDraft awemeDraft, String str) {
        String str2;
        try {
            C0VSJ c0vsj = new C0VSJ(c20183413yC.LIZ);
            if (c0vsj.exists() && c0vsj.isDirectory()) {
                return LJIILLIIL(c20183413yC, c0vsj, l, awemeDraft, str);
            }
            if (c0vsj.exists() && c0vsj.isFile()) {
                try {
                    if (LJIL(c20183413yC.LIZ)) {
                        return LJIJ(c20183413yC, l, str);
                    }
                    String name = c0vsj.getName();
                    String strLJIJ = C08QA.LJIJ(c0vsj);
                    long length = c0vsj.length();
                    if (u.LJJIIJZLJL(name, e3.d, false)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Hidden file detected: ");
                        sbLIZ.append(c20183413yC.LIZ);
                        C20183113y9.LIZ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (length == 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Empty file detected: ");
                        sbLIZ2.append(c20183413yC.LIZ);
                        C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (length <= 104857600) {
                        str2 = null;
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Large file detected (");
                        sbLIZ3.append(length);
                        sbLIZ3.append(" bytes): ");
                        sbLIZ3.append(c20183413yC.LIZ);
                        C20183113y9.LIZ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ3));
                        str2 = "SKIPPED_LARGE_FILE";
                    }
                    String str3 = c20183413yC.LIZ;
                    String strLJIIJJI = LJIIJJI(str3, str);
                    float fLIZJ = LIZJ(length, l);
                    String str4 = c20183413yC.LIZIZ;
                    Boolean bool = Boolean.FALSE;
                    EnumC19373010qm enumC19373010qm = c20183413yC.LIZJ;
                    C20183913yH c20183913yH = new C20183913yH(str3, strLJIIJJI, name, strLJIJ, length, fLIZJ, str4, true, bool, enumC19373010qm, true, str2, false, null, true, null);
                    if (awemeDraft != null) {
                        C20183513yD c20183513yDLJJIFFI = LJJIFFI(c20183413yC.LIZ, enumC19373010qm, awemeDraft);
                        return C20183913yH.LIZ(c20183913yH, c20183513yDLJJIFFI.LIZ, c20183513yDLJJIFFI.LIZIZ);
                    }
                    return c20183913yH;
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    Object c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Failed to handle boundary file: ");
                        sbLIZ4.append(c20183413yC.LIZ);
                        C20183113y9.LIZLLL("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ4), thM5exceptionOrNullimpl);
                        c098200Yq = LJII(this, c20183413yC);
                    }
                    return (C20183913yH) c098200Yq;
                }
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("File not exists or not a file: ");
            sbLIZ5.append(c20183413yC.LIZ);
            C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ5));
            return LJII(this, c20183413yC);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void LJIILL(Collection<?> collection, String str, List<C20183413yC> list, C20183213yA c20183213yA) {
        if (collection.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Empty collection at ");
            sbLIZ.append(str);
            C20183113y9.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (collection.size() > 1000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Large collection detected at ");
            sbLIZ2.append(str);
            sbLIZ2.append(" with ");
            sbLIZ2.append(collection.size());
            sbLIZ2.append(" elements, processing first 1000");
            C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ2));
            c20183213yA.LIZJ++;
        }
        int i = 0;
        for (Object obj : C13LP.LL(collection, LSPassThroughRecordSizeConfig.DEFAULT)) {
            int i2 = i + 1;
            if (i >= 0) {
                if (obj != null && LJIJJ(obj)) {
                    Class<?> cls = obj.getClass();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append('[');
                    sbLIZ3.append(i);
                    sbLIZ3.append(']');
                    LJI(obj, cls, list, C2188811AlT.LIZIZ(sbLIZ3), c20183213yA);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LJIIZILJ(Map<?, ?> map, String str, List<C20183413yC> list, C20183213yA c20183213yA) {
        String strLJZL;
        if (map.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Empty map at ");
            sbLIZ.append(str);
            C20183113y9.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (map.size() > 1000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Large map detected at ");
            sbLIZ2.append(str);
            sbLIZ2.append(" with ");
            sbLIZ2.append(map.size());
            sbLIZ2.append(" entries, processing first 1000");
            C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ2));
            c20183213yA.LIZJ++;
        }
        for (Map.Entry entry : C13LP.LL(map.entrySet(), LSPassThroughRecordSizeConfig.DEFAULT)) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                strLJZL = "null";
            } else if (key instanceof String) {
                strLJZL = (String) key;
                if (strLJZL.length() > 100) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(C13LN.LJZL(100, strLJZL));
                    sbLIZ3.append("...");
                    strLJZL = C2188811AlT.LIZIZ(sbLIZ3);
                }
            } else {
                strLJZL = C13LN.LJZL(50, key.toString());
            }
            if (value != null && LJIJJ(value)) {
                Class<?> cls = value.getClass();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append('[');
                sbLIZ4.append(strLJZL);
                sbLIZ4.append(']');
                LJI(value, cls, list, C2188811AlT.LIZIZ(sbLIZ4), c20183213yA);
            }
        }
    }

    public static C20183913yH LJIILLIIL(C20183413yC c20183413yC, C0VSJ c0vsj, Long l, AwemeDraft awemeDraft, String str) {
        Object c098200Yq;
        C20183513yD c20183513yD;
        C238400w2 c238400w2 = new C238400w2();
        C118300cf c118300cf = new C118300cf();
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            LIZIZ(c0vsj, c238400w2.element, c118300cf.element, new C020Z(c238400w2, c118300cf, 8));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to calculate directory stats: ");
            sbLIZ.append(c0vsj.getAbsolutePath());
            C20183113y9.LIZLLL("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
        }
        long j = c238400w2.element;
        int i = c118300cf.element;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Directory detected: ");
        sbLIZ2.append(c20183413yC.LIZ);
        sbLIZ2.append(", size: ");
        sbLIZ2.append(j);
        sbLIZ2.append(", files: ");
        sbLIZ2.append(i);
        C20183113y9.LIZ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ2));
        if (awemeDraft != null) {
            c20183513yD = LJJIFFI(c20183413yC.LIZ, c20183413yC.LIZJ, awemeDraft);
        } else {
            c20183513yD = new C20183513yD(true, null);
        }
        if (!c20183513yD.LIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Invalid directory path: ");
            sbLIZ3.append(c20183513yD.LIZIZ);
            C20183113y9.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        String str2 = c20183413yC.LIZ;
        String strLJIIJJI = LJIIJJI(str2, str);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(c0vsj.getName());
        sbLIZ4.append('/');
        return new C20183913yH(str2, strLJIIJJI, C2188811AlT.LIZIZ(sbLIZ4), "directory", j, LIZJ(j, l), c20183413yC.LIZIZ, true, Boolean.FALSE, c20183413yC.LIZJ, true, null, true, Integer.valueOf(i), c20183513yD.LIZ, c20183513yD.LIZIZ);
    }

    public static void LJJ(File file, Set set, List list, Long l, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LJJ(file2, set, list, l, str);
                } else {
                    String absolutePath = file2.getAbsolutePath();
                    if (!set.contains(absolutePath)) {
                        ((ArrayList) list).add(new C20183913yH(absolutePath, LJIIJJI(absolutePath, str), file2.getName(), C08QA.LJIJ(file2), file2.length(), LIZJ(file2.length(), l), "unknown", false, Boolean.FALSE, EnumC19373010qm.PRIVATE, true, null, false, null, true, null));
                    }
                }
            }
        }
    }

    public final <DATA> void LJI(DATA data, Class<DATA> cls, List<C20183413yC> list, String str, C20183213yA c20183213yA) {
        Object c098200Yq;
        if (data == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Null data encountered at path: ");
            sbLIZ.append(str);
            C20183113y9.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (((ArrayList) list).size() >= 10000) {
            C20183113y9.LJIIJ("FilePathMapper", "Reached maximum path limit, stopping collection");
            return;
        }
        if (c20183213yA.LIZIZ >= 20) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Max recursion depth reached at path: ");
            sbLIZ2.append(str);
            C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int iIdentityHashCode = System.identityHashCode(data);
        if (c20183213yA.LIZ.contains(Integer.valueOf(iIdentityHashCode))) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Circular reference detected for ");
            sbLIZ3.append(data.getClass().getSimpleName());
            sbLIZ3.append(" at path: ");
            sbLIZ3.append(str);
            C20183113y9.LIZ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        c20183213yA.LIZ.add(Integer.valueOf(iIdentityHashCode));
        c20183213yA.LIZIZ++;
        try {
            LJ(data, cls, C0MY0.class, EnumC19373010qm.PRIVATE, list, str);
            LJ(data, cls, InterfaceC2270908v5.class, EnumC19373010qm.PUBLIC, list, str);
            LJ(data, cls, InterfaceC2270808v4.class, EnumC19373010qm.PERSISTENT, list, str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            LJIIJ(data, list, str, c20183213yA);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            th = th2;
            try {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c20183213yA.LIZ.remove(Integer.valueOf(iIdentityHashCode));
                c20183213yA.LIZIZ--;
                throw th3;
            }
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof IllegalAccessException) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Cannot access fields in ");
                sbLIZ4.append(str);
                sbLIZ4.append(": ");
                sbLIZ4.append(thM5exceptionOrNullimpl.getMessage());
                C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ4));
            } else if (thM5exceptionOrNullimpl instanceof SecurityException) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Security error collecting paths at ");
                sbLIZ5.append(str);
                sbLIZ5.append(": ");
                sbLIZ5.append(thM5exceptionOrNullimpl.getMessage());
                C20183113y9.LJIIJ("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ5));
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("Error collecting paths at ");
                sbLIZ6.append(str);
                sbLIZ6.append(": ");
                sbLIZ6.append(thM5exceptionOrNullimpl.getMessage());
                C20183113y9.LIZLLL("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ6), thM5exceptionOrNullimpl);
            }
        }
        c20183213yA.LIZ.remove(Integer.valueOf(iIdentityHashCode));
        c20183213yA.LIZIZ--;
    }

    public final <DATA, PATH extends Annotation> void LJ(DATA data, Class<DATA> cls, Class<PATH> cls2, final EnumC19373010qm enumC19373010qm, final List<C20183413yC> list, final String str) {
        Object c098200Yq;
        try {
            C0MY6.LIZ(C0MY6.LIZ, cls, cls2, false, 12).LIZIZ(data, new InterfaceC576180Mim<PATH>() { // from class: X.13y8
                /* JADX WARN: Incorrect types in method signature: (Ljava/lang/reflect/Field;Ljava/lang/Object;TPATH;)V */
                @Override // X.InterfaceC576180Mim
                public final void LJ(Field field, Object obj, Annotation annotation) throws IllegalAccessException {
                    String str2;
                    try {
                        Object obj2 = field.get(obj);
                        if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
                            C20182913y7 c20182913y7 = this.LIZ;
                            String str3 = str;
                            List<C20183413yC> list2 = list;
                            EnumC19373010qm enumC19373010qm2 = enumC19373010qm;
                            if (str2.length() > 0) {
                                String name = field.getName();
                                c20182913y7.getClass();
                                list2.add(new C20183413yC(str2, C20182913y7.LIZ(str3, name), enumC19373010qm2));
                            }
                        }
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20183113y9.LIZLLL("FilePathMapper", "handleFileDes failed, illegal access", e);
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C20183113y9.LIZLLL("FilePathMapper", "handleFileDes failed, illegal argument", e2);
                        throw e2;
                    }
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZ(Field field, String str2, Annotation annotation, List list2) {
                    if (str2.length() > 0) {
                        C20182913y7 c20182913y7 = this.LIZ;
                        String str3 = str;
                        String name = field.getName();
                        c20182913y7.getClass();
                        list.add(new C20183413yC(str2, C20182913y7.LIZ(str3, name), enumC19373010qm));
                    }
                }

                /* JADX WARN: Incorrect types in method signature: (Ljava/lang/reflect/Field;Ljava/util/Map<Ljava/lang/Object;Ljava/lang/String;>;Ljava/lang/Object;TPATH;)V */
                @Override // X.InterfaceC576180Mim
                public final void LIZIZ(Field field, Map map, Object obj, Annotation annotation) {
                    String str2 = (String) map.get(obj);
                    if (str2 != null) {
                        C20182913y7 c20182913y7 = this.LIZ;
                        String str3 = str;
                        List<C20183413yC> list2 = list;
                        EnumC19373010qm enumC19373010qm2 = enumC19373010qm;
                        if (str2.length() > 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(field.getName());
                            sbLIZ.append('[');
                            sbLIZ.append(obj);
                            sbLIZ.append(']');
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c20182913y7.getClass();
                            list2.add(new C20183413yC(str2, C20182913y7.LIZ(str3, strLIZIZ), enumC19373010qm2));
                        }
                    }
                }

                /* JADX WARN: Incorrect types in method signature: (Ljava/lang/reflect/Field;[Ljava/lang/String;ITPATH;)V */
                @Override // X.InterfaceC576180Mim
                public final void LIZJ(Field field, String[] strArr, int i, Annotation annotation) {
                    String str2 = strArr[i];
                    if (str2.length() > 0) {
                        C20182913y7 c20182913y7 = this.LIZ;
                        String str3 = str;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(field.getName());
                        sbLIZ.append('[');
                        sbLIZ.append(i);
                        sbLIZ.append(']');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c20182913y7.getClass();
                        list.add(new C20183413yC(str2, C20182913y7.LIZ(str3, strLIZIZ), enumC19373010qm));
                    }
                }

                /* JADX WARN: Incorrect types in method signature: (Ljava/lang/reflect/Field;Ljava/util/List<Ljava/lang/String;>;ITPATH;)V */
                @Override // X.InterfaceC576180Mim
                public final void LIZLLL(Field field, List list2, int i, Annotation annotation) {
                    String str2 = (String) ListProtector.get(list2, i);
                    if (str2.length() > 0) {
                        C20182913y7 c20182913y7 = this.LIZ;
                        String str3 = str;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(field.getName());
                        sbLIZ.append('[');
                        sbLIZ.append(i);
                        sbLIZ.append(']');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c20182913y7.getClass();
                        list.add(new C20183413yC(str2, C20182913y7.LIZ(str3, strLIZIZ), enumC19373010qm));
                    }
                }
            });
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to collect annotated paths for ");
            sbLIZ.append(cls.getSimpleName());
            C20183113y9.LJIIJJI("FilePathMapper", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
        }
    }
}
