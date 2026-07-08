package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS263S0000000_23;

/* JADX INFO: renamed from: X.0qUO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551980qUO {
    public static final C1551980qUO LIZ = new C1551980qUO();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final ConcurrentHashMap<String, AnonymousClass0957<String>> LIZJ = new ConcurrentHashMap<>();

    public static void LIZ(UpdatePackage updatePackage, Function1 function1) {
        C23250099c.LIZLLL(LIZIZ, null, null, new C2365309Op(updatePackage, function1, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, X.099G, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static Object LIZIZ(UpdatePackage updatePackage, InterfaceC1364105Vn interfaceC1364105Vn) {
        C09AE c09ae;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(updatePackage.getAccessKey());
        sbLIZ.append('/');
        sbLIZ.append(updatePackage.getChannel());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Requesting decompression for: ");
        sbLIZ2.append(strLIZIZ);
        C1553130qWF.LIZ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ2));
        while (true) {
            ConcurrentHashMap<String, AnonymousClass0957<String>> concurrentHashMap = LIZJ;
            AnonymousClass0957<String> anonymousClass0957 = concurrentHashMap.get(strLIZIZ);
            if (anonymousClass0957 != null) {
                if (anonymousClass0957.isCancelled()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Found a cancelled pipeline for ");
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append(". Will try to start a new one.");
                    C1553130qWF.LIZLLL("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Found active pipeline for ");
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append(". Awaiting its result.");
                    C1553130qWF.LIZ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ4));
                    return anonymousClass0957.LJLIIIL(interfaceC1364105Vn);
                }
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("No active pipeline for ");
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append(" or existing was cancelled. Creating a new task.");
            C1553130qWF.LIZ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ5));
            C259800zU c259800zU = new C259800zU();
            AnonymousClass0957 anonymousClass09572 = null;
            ?? LIZIZ2 = C23250099c.LIZIZ(LIZIZ, null, C099V.LAZY, new C2365209Oo(strLIZIZ, updatePackage, c259800zU, null), 1);
            c259800zU.element = LIZIZ2;
            if (concurrentHashMap.putIfAbsent(strLIZIZ, (AnonymousClass0957<String>) LIZIZ2) == null) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("New task for ");
                sbLIZ6.append(strLIZIZ);
                sbLIZ6.append(" registered. Starting pipeline.");
                C1553130qWF.LIZ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ6));
                T t = c259800zU.element;
                if (t == 0) {
                    c09ae = null;
                } else {
                    c09ae = (C09AE) t;
                }
                c09ae.start();
                T t2 = c259800zU.element;
                if (t2 != 0) {
                    anonymousClass09572 = (AnonymousClass0957) t2;
                }
                return anonymousClass09572.LJLIIIL(interfaceC1364105Vn);
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Race condition: another task for ");
            sbLIZ7.append(strLIZIZ);
            sbLIZ7.append(" was registered first. Retrying.");
            C1553130qWF.LIZ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ7));
        }
    }

    public static Object LIZJ(UpdatePackage updatePackage, InterfaceC1364105Vn interfaceC1364105Vn) throws IllegalAccessException, InstantiationException, C1553110qWD {
        boolean z;
        boolean z2;
        final String str;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(updatePackage.getAccessKey());
        sbLIZ.append('/');
        sbLIZ.append(updatePackage.getChannel());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (updatePackage.getDecompressFrom() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (updatePackage.getDecompressFrom() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            str = "[Update Line]";
        } else if (z2) {
            str = "[Compress Line]";
        } else {
            str = "[Parallel Line]";
        }
        AbstractC1552040qUU abstractC1552040qUU = new AbstractC1552040qUU() { // from class: X.0qSV
            @Override // X.AbstractC1552040qUU
            public final void LJ(UpdatePackage updatePackage2, Throwable th) {
                if (c2252611DEt.isActive()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Pipeline failed for ");
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append('.');
                    C1553130qWF.LIZJ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ2), th);
                    InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append("Pipeline for ");
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append(" failed but coroutine is no longer active.");
                    C1553130qWF.LJ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ3), th);
                }
                C1550730qSN.LJI(updatePackage2.getAccessKey(), updatePackage2.getChannel(), AFwS263S0000000_23.get$arr$(2));
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIL(long j, UpdatePackage updatePackage2) {
                if (c2252611DEt.isActive()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    C1551940qUK c1551940qUK = C797990VSb.LIZ;
                    c1551940qUK.LIZIZ();
                    sbLIZ2.append(c1551940qUK.LIZLLL.getRootDirectory().getAbsolutePath());
                    String str2 = File.separator;
                    sbLIZ2.append(str2);
                    sbLIZ2.append(updatePackage2.getAccessKey());
                    sbLIZ2.append(str2);
                    sbLIZ2.append(updatePackage2.getChannel());
                    sbLIZ2.append(str2);
                    sbLIZ2.append(j);
                    sbLIZ2.append(str2);
                    sbLIZ2.append("res");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append(" Decompress pipeline success for ");
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append(". Path: ");
                    sbLIZ3.append(strLIZIZ2);
                    C1553130qWF.LIZ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ3));
                    C1550730qSN.LJI(updatePackage2.getAccessKey(), updatePackage2.getChannel(), AFwS263S0000000_23.get$arr$(3));
                    InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(strLIZIZ2);
                    interfaceC20236714Gf.resumeWith(strLIZIZ2);
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append("Decompress pipeline for ");
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append(" succeeded but coroutine is no longer active.");
                C1553130qWF.LIZLLL("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ4));
            }
        };
        c2252611DEt.LJJII(AFwS231S0000000_3.get$arr$(0));
        C1551530qTf c1551530qTfLJFF = C797990VSb.LIZ.LJFF();
        List<C1552500qVE> listLJFF = C1551960qUM.LJFF();
        C1552860qVo c1552860qVo = new C1552860qVo();
        c1552860qVo.LIZ = C1550820qSW.class;
        c1552860qVo.LIZIZ = new C1552220qUm(new C1552450qV9(abstractC1552040qUU), C1552210qUl.LIZ(C1550820qSW.class));
        ArrayList arrayList = (ArrayList) listLJFF;
        arrayList.add(new C1552500qVE(c1552860qVo));
        C1552860qVo c1552860qVo2 = new C1552860qVo();
        c1552860qVo2.LIZ = C1550910qSf.class;
        c1552860qVo2.LIZJ = new Object[]{c1551530qTfLJFF, null};
        c1552860qVo2.LIZIZ = new C1552220qUm(C1552210qUl.LIZ(C1550910qSf.class), new C1552450qV9(abstractC1552040qUU));
        arrayList.add(new C1552500qVE(c1552860qVo2));
        C1552860qVo c1552860qVo3 = new C1552860qVo();
        c1552860qVo3.LIZ = C1550900qSe.class;
        c1552860qVo3.LIZIZ = new C1552220qUm(new C1552450qV9(abstractC1552040qUU), C1552210qUl.LIZ(C1550900qSe.class));
        arrayList.add(new C1552500qVE(c1552860qVo3));
        C1552860qVo c1552860qVo4 = new C1552860qVo();
        c1552860qVo4.LIZ = C1550850qSZ.class;
        c1552860qVo4.LIZIZ = new C1552220qUm(new C1552820qVk(abstractC1552040qUU), C1552210qUl.LIZ(C1550850qSZ.class));
        arrayList.add(new C1552500qVE(c1552860qVo4));
        C1552860qVo c1552860qVo5 = new C1552860qVo();
        c1552860qVo5.LIZ = C1550780qSS.class;
        c1552860qVo5.LIZIZ = new C1552220qUm(new C1552770qVf(abstractC1552040qUU), C1552210qUl.LIZ(C1550780qSS.class));
        arrayList.add(new C1552500qVE(c1552860qVo5));
        C1552860qVo c1552860qVo6 = new C1552860qVo();
        c1552860qVo6.LIZ = C1551010qSp.class;
        c1552860qVo6.LIZIZ = new C1552220qUm(new C1552380qV2(abstractC1552040qUU), C1552210qUl.LIZ(C1551010qSp.class));
        arrayList.add(new C1552500qVE(c1552860qVo6));
        C1552390qV3.LIZ(listLJFF).proceed(updatePackage);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
