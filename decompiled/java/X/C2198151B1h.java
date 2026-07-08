package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderBase;
import com.ss.bduploader.BDImageXUploaderListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198151B1h extends AbstractC2198091B1b {
    public static final List<String> LLILZ = C1697810uHb.LJIIJJI(".jpg", ".jpeg", ".png", ".webp", ".heic", ".heif", ".gif", ".bmp");
    public final CopyOnWriteArrayList<C2198141B1g> LLILLL = new CopyOnWriteArrayList<>();

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        Collection<C05XL<C09WU>> collectionValues;
        super.release();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        CopyOnWriteArrayList<C2198141B1g> copyOnWriteArrayList = this.LLILLL;
        ArrayList<C2198141B1g> arrayList = new ArrayList();
        for (C2198141B1g c2198141B1g : copyOnWriteArrayList) {
            if (c2198141B1g.LIZIZ == interfaceC634840OvC) {
                arrayList.add(c2198141B1g);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C2198141B1g) it2.next()).LIZJ);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        for (String str : C13LP.LJJJJI(arrayList3)) {
            C09WT.LIZ.getClass();
            if (str.length() != 0 && !C09WT.LJFF.contains(str)) {
                Set<BDImageXUploader> setRemove = C09WT.LJ.remove(str);
                if (setRemove == null) {
                    setRemove = C08CX.INSTANCE;
                }
                for (BDImageXUploaderBase bDImageXUploaderBase : setRemove) {
                    try {
                        bDImageXUploaderBase.close();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    C09WT.LIZLLL.remove(bDImageXUploaderBase);
                }
                ConcurrentHashMap<String, C05XL<C09WU>> concurrentHashMap = C09WT.LIZJ.get(str);
                if (concurrentHashMap != null && (collectionValues = concurrentHashMap.values()) != null) {
                    Iterator<T> it3 = collectionValues.iterator();
                    while (it3.hasNext()) {
                        C05XL c05xl = (C05XL) it3.next();
                        if (!c05xl.isCompleted()) {
                            c05xl.LJIIZILJ(new C09WU(false, null, null, null, null, null, null, "page closed before submit", 126));
                        }
                    }
                }
                C09WT.LIZIZ(str);
            }
        }
        for (C2198141B1g c2198141B1g2 : arrayList) {
            c2198141B1g2.LIZ = null;
            c2198141B1g2.LIZIZ = null;
        }
        this.LLILLL.removeAll(C13LP.LLIIJI(arrayList));
    }

    public static String LIZJ(File file) {
        Object c098200Yq;
        try {
            c098200Yq = file.getCanonicalPath();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        final String strLIZIZ;
        Activity activityLIZLLL;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        int iIntValue;
        int iIntValue2;
        Unit unit;
        Set<BDImageXUploader> setPutIfAbsent;
        IHostContextDepend iHostContextDepend;
        Boolean enableSkipMeta;
        Boolean enableCommitUpload;
        Number socketNum;
        Number sliceSize;
        String strLIZJ;
        InterfaceC2198111B1d interfaceC2198111B1d = (InterfaceC2198111B1d) xBaseParamModel;
        InterfaceC2198181B1k uploadConfig = interfaceC2198111B1d.getUploadConfig();
        if (uploadConfig == null || (strLIZIZ = uploadConfig.getTraceId()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bridge_");
            sbLIZ.append(UUID.randomUUID());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (activityLIZLLL == null) {
            completionBlock.onFailure(0, "get activity failed", C1B1X.LIZ(strLIZIZ, "get activity failed", null));
            return;
        }
        ArrayList<String> arrayListLIZIZ = C09N6.LIZIZ(activityLIZLLL, interfaceC2198111B1d.getFilePaths());
        if (arrayListLIZIZ.isEmpty()) {
            completionBlock.onFailure(0, "get filePaths failed, please check it", C1B1X.LIZ(strLIZIZ, "get filePaths failed, please check it", null));
            return;
        }
        if (!arrayListLIZIZ.isEmpty()) {
            ArrayList<File> arrayList = new ArrayList();
            arrayList.add(activityLIZLLL.getCacheDir());
            arrayList.add(activityLIZLLL.getFilesDir());
            try {
                c098200Yq = activityLIZLLL.getExternalCacheDir();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            arrayList.add(c098200Yq);
            try {
                c098200Yq2 = activityLIZLLL.getExternalFilesDir(null);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            arrayList.add(c098200Yq2);
            try {
                c098200Yq3 = C786410Ut5.W3();
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                c098200Yq3 = null;
            }
            arrayList.add(c098200Yq3);
            ArrayList arrayList2 = new ArrayList();
            for (File file : arrayList) {
                if (file != null && (strLIZJ = LIZJ(file)) != null) {
                    arrayList2.add(strLIZJ);
                }
            }
            ArrayList<String> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList3.isEmpty()) {
                if (!arrayListLIZIZ.isEmpty()) {
                    for (String str : arrayListLIZIZ) {
                        String strLIZJ2 = LIZJ(new C0VSJ(str));
                        if (strLIZJ2 != null && !arrayList3.isEmpty()) {
                            for (String str2 : arrayList3) {
                                if (!Intrinsics.LJFF(strLIZJ2, str2)) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(str2);
                                    sbLIZ2.append(File.separator);
                                    if (u.LJJIIJZLJL(strLIZJ2, C2188811AlT.LIZIZ(sbLIZ2), false)) {
                                    }
                                }
                                String lowerCase = str.toLowerCase(Locale.ROOT);
                                List<String> list = LLILZ;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator<String> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (u.LJIIZILJ(lowerCase, it2.next(), false)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final BDImageXUploader bDImageXUploader = new BDImageXUploader();
                bDImageXUploader.setFilePath(arrayListLIZIZ.size(), (String[]) arrayListLIZIZ.toArray(new String[0]));
                bDImageXUploader.setUploadDomain(interfaceC2198111B1d.getAuthConfig().getHostName());
                bDImageXUploader.setTopAccessKey(interfaceC2198111B1d.getAuthConfig().getAccessKeyId());
                bDImageXUploader.setTopSecretKey(interfaceC2198111B1d.getAuthConfig().getSecretAccessKey());
                bDImageXUploader.setTopSessionToken(interfaceC2198111B1d.getAuthConfig().getSessionToken());
                bDImageXUploader.setServiceID(interfaceC2198111B1d.getAuthConfig().getServiceId());
                InterfaceC2198181B1k uploadConfig2 = interfaceC2198111B1d.getUploadConfig();
                if (uploadConfig2 != null && (sliceSize = uploadConfig2.getSliceSize()) != null) {
                    iIntValue = sliceSize.intValue();
                } else {
                    iIntValue = 524288;
                }
                bDImageXUploader.setSliceSize(iIntValue);
                InterfaceC2198181B1k uploadConfig3 = interfaceC2198111B1d.getUploadConfig();
                if (uploadConfig3 != null && (socketNum = uploadConfig3.getSocketNum()) != null) {
                    iIntValue2 = socketNum.intValue();
                } else {
                    iIntValue2 = 2;
                }
                bDImageXUploader.setSocketNum(iIntValue2);
                InterfaceC2198181B1k uploadConfig4 = interfaceC2198111B1d.getUploadConfig();
                if (uploadConfig4 != null && (enableCommitUpload = uploadConfig4.getEnableCommitUpload()) != null) {
                    bDImageXUploader.setEnableCommitUpload(enableCommitUpload.booleanValue());
                }
                InterfaceC2198181B1k uploadConfig5 = interfaceC2198111B1d.getUploadConfig();
                if (uploadConfig5 != null && (enableSkipMeta = uploadConfig5.getEnableSkipMeta()) != null) {
                    bDImageXUploader.setEnableSkipMeta(enableSkipMeta.booleanValue());
                }
                bDImageXUploader.setSliceRetryCount(3);
                bDImageXUploader.setFileRetryCount(3);
                bDImageXUploader.setTraceId(strLIZIZ);
                C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
                if (c1874950ytJ != null && (iHostContextDepend = c1874950ytJ.LIZLLL) != null) {
                    bDImageXUploader.setOpenBoe(iHostContextDepend.isBoeEnable());
                }
                final C2198141B1g c2198141B1g = new C2198141B1g(completionBlock, this.IBridgeSdkContext, interfaceC2198111B1d.getCurrentUniqueId());
                this.LLILLL.add(c2198141B1g);
                C09WT c09wt = C09WT.LIZ;
                String currentUniqueId = interfaceC2198111B1d.getCurrentUniqueId();
                c09wt.getClass();
                C09WT.LIZLLL.add(bDImageXUploader);
                if (currentUniqueId.length() > 0) {
                    ConcurrentHashMap<String, Set<BDImageXUploader>> concurrentHashMap = C09WT.LJ;
                    Set<BDImageXUploader> setNewSetFromMap = concurrentHashMap.get(currentUniqueId);
                    if (setNewSetFromMap == null && (setPutIfAbsent = concurrentHashMap.putIfAbsent(currentUniqueId, (setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap())))) != null) {
                        setNewSetFromMap = setPutIfAbsent;
                    }
                    setNewSetFromMap.add(bDImageXUploader);
                }
                final String currentUniqueId2 = interfaceC2198111B1d.getCurrentUniqueId();
                final List<String> filePaths = interfaceC2198111B1d.getFilePaths();
                final AwS613S0100000_34 awS613S0100000_34 = new AwS613S0100000_34(this, 133);
                bDImageXUploader.setListener(new BDImageXUploaderListener(c2198141B1g, bDImageXUploader, strLIZIZ, currentUniqueId2, filePaths, awS613S0100000_34) { // from class: X.1B1f
                    public final C2198141B1g LIZ;
                    public final BDImageXUploader LIZIZ;
                    public final String LIZJ;
                    public final String LIZLLL;
                    public final List<String> LJ;
                    public final Function1<C2198141B1g, Unit> LJFF;
                    public final ArrayList<C1B1Q> LJI = new ArrayList<>();

                    @Override // com.ss.bduploader.BDImageXUploaderListener
                    public final int imageXUploadCheckNetState(int i, int i2) {
                        return 0;
                    }

                    @Override // com.ss.bduploader.BDImageXUploaderListener
                    public final void onLog(int i, int i2, String str3) {
                    }

                    public final void LIZ() {
                        Set<BDImageXUploader> set;
                        try {
                            this.LIZIZ.close();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            C189200o6.m2constructorimpl(new C098200Yq(th4));
                        }
                        C09WT c09wt2 = C09WT.LIZ;
                        String str3 = this.LIZLLL;
                        BDImageXUploader bDImageXUploader2 = this.LIZIZ;
                        c09wt2.getClass();
                        C09WT.LIZLLL.remove(bDImageXUploader2);
                        if (str3.length() > 0 && (set = C09WT.LJ.get(str3)) != null) {
                            set.remove(bDImageXUploader2);
                        }
                        C2198141B1g c2198141B1g2 = this.LIZ;
                        c2198141B1g2.LIZ = null;
                        c2198141B1g2.LIZIZ = null;
                        this.LJFF.invoke(this.LIZ);
                    }

                    public static Map LIZJ(BDImageXInfo bDImageXInfo) {
                        String str3;
                        if (bDImageXInfo != null) {
                            String str4 = bDImageXInfo.mMetaInfo;
                            if (str4 != null && str4.length() != 0) {
                                List<String> list2 = C2198151B1h.LLILZ;
                                Gson gson = C2348609Ie.LIZ;
                                return C2348609Ie.LIZIZ(new JSONObject(str4));
                            }
                            if (bDImageXInfo != null && (str3 = bDImageXInfo.mImageTosKey) != null && str3.length() > 0) {
                                List<String> list3 = C2198151B1h.LLILZ;
                                return C2097608Jq.LJIIIIZZ(new Pair("ImageUri", str3), new Pair("SourceUri", str3), new Pair("uri", str3));
                            }
                        }
                        return null;
                    }

                    public final void LIZIZ(Number number, String str3, Map<String, ? extends Object> map) {
                        String str4;
                        Object obj2;
                        String str5;
                        Object obj3;
                        Number number2;
                        Object obj4;
                        Number number3;
                        Object obj5;
                        String str6;
                        Object obj6;
                        if (number != null && (str4 = (String) C13LP.LJJJLZIJ(number.intValue(), this.LJ)) != null) {
                            String str7 = null;
                            if (map != null) {
                                obj2 = map.get("ImageUri");
                            } else {
                                obj2 = null;
                            }
                            if (obj2 instanceof String) {
                                str5 = (String) obj2;
                            } else {
                                str5 = null;
                            }
                            boolean z = false;
                            if (str5 == null || str5.length() <= 0) {
                                str5 = str3;
                            }
                            C09WT c09wt2 = C09WT.LIZ;
                            String str8 = this.LIZLLL;
                            if (str5 == null || str5.length() == 0) {
                                z = true;
                            }
                            boolean z2 = !z;
                            if (map != null) {
                                obj3 = map.get("ImageWidth");
                            } else {
                                obj3 = null;
                            }
                            if (obj3 instanceof Number) {
                                number2 = (Number) obj3;
                            } else {
                                number2 = null;
                            }
                            if (map != null) {
                                obj4 = map.get("ImageHeight");
                            } else {
                                obj4 = null;
                            }
                            if (obj4 instanceof Number) {
                                number3 = (Number) obj4;
                            } else {
                                number3 = null;
                            }
                            if (map != null) {
                                obj5 = map.get("ImageMd5");
                            } else {
                                obj5 = null;
                            }
                            if (obj5 instanceof String) {
                                str6 = (String) obj5;
                            } else {
                                str6 = null;
                            }
                            if (map != null) {
                                obj6 = map.get("ImageFormat");
                            } else {
                                obj6 = null;
                            }
                            if (obj6 instanceof String) {
                                str7 = (String) obj6;
                            }
                            C09WU c09wu = new C09WU(z2, str5, number2, number3, str6, str7, null, null, 192);
                            c09wt2.getClass();
                            C09WT.LJ(str8, str4, c09wu);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:101:0x01ab  */
                    /* JADX WARN: Removed duplicated region for block: B:103:0x01bc  */
                    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4 A[Catch: all -> 0x0204, TryCatch #1 {all -> 0x0204, blocks: (B:104:0x01be, B:106:0x01c4, B:110:0x01de, B:111:0x01e0, B:113:0x01ed, B:114:0x01f5, B:115:0x01fe), top: B:123:0x01be }] */
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // com.ss.bduploader.BDImageXUploaderListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onNotify(int r12, long r13, com.ss.bduploader.BDImageXInfo r15) {
                        /*
                            Method dump skipped, instruction units count: 533
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2198131B1f.onNotify(int, long, com.ss.bduploader.BDImageXInfo):void");
                    }

                    {
                        this.LIZ = c2198141B1g;
                        this.LIZIZ = bDImageXUploader;
                        this.LIZJ = strLIZIZ;
                        this.LIZLLL = currentUniqueId2;
                        this.LJ = filePaths;
                        this.LJFF = awS613S0100000_34;
                    }
                });
                bDImageXUploader.start();
                try {
                    CompletionBlock<C1B1Y> completionBlock2 = c2198141B1g.LIZ;
                    if (completionBlock2 != null) {
                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1B1Y.class, null);
                        ((C1B1Y) xBaseModelLIZJ).setTraceId(strLIZIZ);
                        completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    C189200o6.m2constructorimpl(new C098200Yq(th4));
                }
                c2198141B1g.LIZ = null;
                return;
            }
        }
        completionBlock.onFailure(0, "filePaths not allowed", C1B1X.LIZ(strLIZIZ, "filePaths not allowed", null));
    }
}
