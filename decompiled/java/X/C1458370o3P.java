package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService;
import com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingServiceWrap;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0o3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458370o3P {
    public static String LJI;
    public static String LJIIL;
    public static Pair<String, Long> LJIILJJIL;
    public static Pair<String, String> LJIILL;
    public static Pair<String, Integer> LJIILLIIL;
    public static int LJIJ;
    public static int LJIJI;
    public static final C1458370o3P LIZ = new C1458370o3P();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final CopyOnWriteArrayList<C1458730o3z> LIZJ = new CopyOnWriteArrayList<>();
    public static final C1DEV LIZLLL = C2191201ApK.LIZ();
    public static final C1458630o3p<String> LJ = new C1458630o3p<>();
    public static final Map<String, List<String>> LJFF = new LinkedHashMap();
    public static final CopyOnWriteArrayList<String> LJII = new CopyOnWriteArrayList<>();
    public static AtomicInteger LJIIIIZZ = new AtomicInteger(0);
    public static final int LJIIIZ = ((Number) C0APG.LIZ.getValue()).intValue();
    public static final int LJIIJ = ((Number) C0APH.LIZ.getValue()).intValue();
    public static final ConcurrentHashMap<String, Pair<String, Integer>> LJIIJJI = new ConcurrentHashMap<>();
    public static final Map<String, String> LJIILIIL = new LinkedHashMap();
    public static EnumC1155060gAC LJIIZILJ = EnumC1155060gAC.TOS_URI;
    public static final CopyOnWriteArrayList<C1458720o3y> LJIJJ = new CopyOnWriteArrayList<>();

    public static String LJII() {
        int size;
        try {
            Set setLLIIJI = C13LP.LLIIJI(C13LP.LLIIII(LJII));
            if (setLLIIJI.isEmpty()) {
                C201955140j.LJFF("PreEmbTaskManager", "findBestMatchUnderstandingResult: selectedMediaListInEditScene is empty");
                LJIIJJI.clear();
                return null;
            }
            Object it2 = LJ.LIZ().iterator();
            boolean z = false;
            String str = null;
            int i = 0;
            while (true) {
                C13EM c13em = (C13EM) it2;
                if (!c13em.hasNext()) {
                    break;
                }
                String str2 = (String) c13em.next();
                List list = (List) ((LinkedHashMap) LJFF).get(str2);
                if (list != null && (size = C13LP.LJJL(list, LJII).size()) != 0) {
                    int size2 = setLLIIJI.size();
                    if (size == size2 && list.size() == size2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("hit foundExactMatch bestMatchUrl: ");
                        sbLIZ.append(str2);
                        sbLIZ.append(", maxIntersectionSize: ");
                        sbLIZ.append(size);
                        C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
                        z = true;
                        str = str2;
                        break;
                    }
                    if (size > i) {
                        str = str2;
                        i = size;
                    }
                }
            }
            if (str == null) {
                LJIIJJI.clear();
                C201955140j.LJIILIIL("PreEmbTaskManager", "findBestMatchUnderstandingResult no matching understanding result found");
                return null;
            }
            Iterable iterable = (List) ((LinkedHashMap) LJFF).get(str);
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            Set setLJJL = C13LP.LJJL(iterable, setLLIIJI);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("findBestMatchUnderstandingResult creationId:");
            sbLIZ2.append(LJI);
            sbLIZ2.append(", zipUrl: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", path: ");
            sbLIZ2.append(iterable);
            sbLIZ2.append(", size: ");
            sbLIZ2.append(LJ.LIZ.size());
            sbLIZ2.append("，intersection: ");
            sbLIZ2.append(setLJJL);
            sbLIZ2.append(", foundExactMatch: ");
            sbLIZ2.append(z);
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ2));
            String str3 = LJI;
            if (str3 != null) {
                LJIIJJI.put(str3, new Pair<>(str, Integer.valueOf(setLJJL.size())));
            }
            return str;
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static List LJIILL() {
        CopyOnWriteArrayList<C1458730o3z> copyOnWriteArrayList = LIZJ;
        if (copyOnWriteArrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        Iterator<C1458730o3z> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZJ);
        }
        return arrayList;
    }

    public static void LJJIII() {
        IContentUnderstandingService iContentUnderstandingService;
        LJ.LIZ.clear();
        ((LinkedHashMap) LJFF).clear();
        LJIIJJI.clear();
        LJIJJ.clear();
        LJIIIIZZ = new AtomicInteger(0);
        LJIJ = 0;
        LJIJI = 0;
        LJIIL = null;
        LJIILJJIL = null;
        LJIILL = null;
        LJIILLIIL = null;
        LJIIZILJ = EnumC1155060gAC.TOS_URI;
        if (C1452450ntr.LIZ() && (iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null)) != null && !C2292008yU.LIZ()) {
            iContentUnderstandingService.LIZ(C2253208sE.LIZ);
        }
        if (C1458780o44.LIZ()) {
            C2253508sH.LIZ.getClass();
            IContentUnderstandingService iContentUnderstandingService2 = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
            if (iContentUnderstandingService2 != null) {
                iContentUnderstandingService2.LIZ(C2250708rp.LIZ);
            }
        }
        C201955140j.LJFF("PreEmbTaskManager", "resetUrlContent");
    }

    public static boolean LIZ() {
        boolean z = false;
        if (!LJIJI()) {
            return false;
        }
        CopyOnWriteArrayList<C1458730o3z> copyOnWriteArrayList = LIZJ;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        List listLLIIII = C13LP.LLIIII(copyOnWriteArrayList);
        if (!(listLLIIII instanceof Collection) || !listLLIIII.isEmpty()) {
            Iterator it2 = listLLIIII.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((C1458730o3z) it2.next()).LIZIZ) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    public static void LIZIZ() {
        if (LJIJI()) {
            C201955140j.LJFF("PreEmbTaskManager", "clearSelectedMediaListInEditScene");
            LJII.clear();
            ((LinkedHashMap) LJIILIIL).clear();
            LJIILJJIL = null;
            LJIILL = null;
            LJIILLIIL = null;
        }
    }

    public static Pair LJIIIIZZ() {
        if (!LJIJJ()) {
            return new Pair(0, null);
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_preload_frame_in_album_for_multi_select_pic_opt", true, false)) {
            return new Pair(0, null);
        }
        CopyOnWriteArrayList<C1458720o3y> copyOnWriteArrayList = LJIJJ;
        if (copyOnWriteArrayList.isEmpty()) {
            return new Pair(0, null);
        }
        for (C1458720o3y c1458720o3y : copyOnWriteArrayList) {
            Set setLJJL = C13LP.LJJL(c1458720o3y.LIZ, LJII);
            boolean z = !setLJJL.isEmpty();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("findMatchingExternalResultSubject hasIntersection:");
            sbLIZ.append(z);
            sbLIZ.append(", size:");
            sbLIZ.append(setLJJL.size());
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                return new Pair(Integer.valueOf(setLJJL.size()), c1458720o3y.LIZIZ);
            }
        }
        C201955140j.LJIILIIL("PreEmbTaskManager", "findMatchingExternalResultSubject not found Intersection");
        return new Pair(0, null);
    }

    public static String LJIILLIIL() {
        if (!LJIJJ()) {
            return null;
        }
        if (C1452450ntr.LIZ() && LJIIZILJ == EnumC1155060gAC.CLOUD_CONTENT_UNDERSTANDING) {
            return null;
        }
        return LJII();
    }

    public static boolean LJIJI() {
        return C0APN.LIZIZ() || C289260BVk.LIZIZ();
    }

    public static boolean LJIJJ() {
        return C0APN.LIZIZ() || C289260BVk.LIZIZ();
    }

    public static String LJJI() {
        String str = null;
        if (!LJIJJ()) {
            return null;
        }
        LJIIIIZZ.incrementAndGet();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current frame count in pic: ");
        sbLIZ.append(LJIIIIZZ.get());
        C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
        C11RK c11rk = new C11RK();
        List listLJIILL = LJIILL();
        if (listLJIILL != null) {
            C1458720o3y c1458720o3y = new C1458720o3y(new ArrayList(listLJIILL), c11rk);
            LJIJJ.add(c1458720o3y);
            C1457520o22 c1457520o22 = new C1457520o22(listLJIILL);
            C2288408xu c2288408xu = c1457520o22.LIZ;
            EnumC2290308yD enumC2290308yD = EnumC2290308yD.MULTI_SELECT_PHOTO;
            c2288408xu.LIZLLL = enumC2290308yD.ordinal();
            LJIJ = enumC2290308yD.ordinal();
            C11NZ c11nzLIZJ = C1457440o1u.LIZJ(c1457520o22, false, null, 6);
            if (c11nzLIZJ != null && (str = (String) c11nzLIZJ.LIZLLL()) != null) {
                c11rk.onNext(str);
            }
            if (c1458720o3y != null) {
                CopyOnWriteArrayList<C1458720o3y> copyOnWriteArrayList = LJIJJ;
                if (copyOnWriteArrayList.contains(c1458720o3y)) {
                    copyOnWriteArrayList.remove(c1458720o3y);
                }
            }
        }
        return str;
    }

    public static void LJJII() {
        if (LJIJI()) {
            C201955140j.LJFF("PreEmbTaskManager", "resetAllPreloadFrameCache");
            LJI = null;
            LIZJ.clear();
            LJJIII();
            LIZIZ();
        }
    }

    public static EnumC1155060gAC LJIILIIL() {
        return LJIIZILJ;
    }

    public static List LJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String strLJFF = ((MediaModel) it2.next()).LJFF();
            if (strLJFF != null) {
                arrayList.add(strLJFF);
            }
        }
        return arrayList;
    }

    public static String LJIIIZ(String str) {
        Pair<String, Integer> pair;
        ConcurrentHashMap<String, Pair<String, Integer>> concurrentHashMap = LJIIJJI;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getZipUrlCache createId = ");
            sbLIZ.append(str);
            sbLIZ.append(", before = ");
            sbLIZ.append(LJI);
            C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (LJII.isEmpty() || (pair = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return pair.getFirst();
    }

    public static String LJIIJ(String str) {
        String first;
        Pair<String, String> pair;
        Pair<String, String> pair2 = LJIILL;
        if (pair2 != null) {
            first = pair2.getFirst();
        } else {
            first = null;
        }
        if (!Intrinsics.LJFF(first, str) || (pair = LJIILL) == null) {
            return null;
        }
        return pair.getSecond();
    }

    public static int LJIIL(String str) {
        if (LJIJ == EnumC2290308yD.SINGLE_SELECT_PHOTO.ordinal()) {
            return 1;
        }
        if (LJII.isEmpty()) {
            return 0;
        }
        ConcurrentHashMap<String, Pair<String, Integer>> concurrentHashMap = LJIIJJI;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getIntersectionsSize createId = ");
            sbLIZ.append(str);
            sbLIZ.append(", before = ");
            sbLIZ.append(LJI);
            C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        }
        Pair<String, Integer> pair = concurrentHashMap.get(str);
        if (pair == null) {
            return 0;
        }
        return pair.getSecond().intValue();
    }

    public static boolean LJIJJLI(ShortVideoContext shortVideoContext) {
        boolean z;
        String musicId;
        if (shortVideoContext != null && (musicId = shortVideoContext.getMusicId()) != null && musicId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static boolean LJIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null && videoPublishEditModel.getVideoCount() == 0) {
            if (C1428470nHB.LJJZZI(videoPublishEditModel) || C1428470nHB.LJLIIL(videoPublishEditModel) || C1428470nHB.LJZI(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJJIFFI(boolean z) {
        if (!z) {
            if (!C0APN.LIZIZ()) {
                return;
            }
        } else if (!C289260BVk.LIZIZ()) {
            return;
        }
        LIZJ.clear();
        C201955140j.LJIILIIL("PreEmbTaskManager", "reset select medias");
    }

    public static C1458730o3z LIZJ(MediaModel mediaModel, Long l) {
        if (!C0APN.LIZIZ() || mediaModel == null) {
            return null;
        }
        String str = mediaModel.id;
        boolean zLJIILJJIL = mediaModel.LJIILJJIL();
        String strLJFF = mediaModel.LJFF();
        String str2 = "";
        if (strLJFF == null) {
            strLJFF = "";
        }
        String str3 = mediaModel.fileName;
        if (str3 != null) {
            str2 = str3;
        }
        C1458730o3z c1458730o3z = new C1458730o3z(str, zLJIILJJIL, strLJFF, str2, null, mediaModel.LJIIJJI(), 16);
        if (l != null) {
            c1458730o3z.LJ = Long.valueOf(l.longValue());
        }
        return c1458730o3z;
    }

    public static byte[] LJIIJJI(Context context, String str) throws Throwable {
        InputStream c0vsp;
        try {
            if (u.LJJIIJZLJL(str, "content://", false)) {
                c0vsp = C09NT.LJ(context.getContentResolver(), UriProtector.parse(str));
                if (c0vsp == null) {
                    return null;
                }
            } else {
                c0vsp = new C0VSP(new C0VSJ(str));
            }
            try {
                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                while (true) {
                    int i = c0vsp.read(bArr);
                    if (i != -1) {
                        messageDigest.update(bArr, 0, i);
                    } else {
                        byte[] bArrDigest = messageDigest.digest();
                        C2107108Nh.LIZ(c0vsp, null);
                        return bArrDigest;
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsp, th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FileNotFoundException: ");
            sbLIZ.append(str);
            sbLIZ.append(" not found , e: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IOException: Failed to read ");
            sbLIZ2.append(str);
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        } catch (IllegalArgumentException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("IllegalArgumentException: Invalid path format, e: ");
            sbLIZ3.append(e3.getMessage());
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ3));
            return null;
        } catch (NullPointerException e4) {
            TryCatchGuardChecker.doCheck(e4);
            C201955140j.LJIILIIL("PreEmbTaskManager", "NullPointerException: Context or path is null");
            return null;
        } catch (SecurityException e5) {
            TryCatchGuardChecker.doCheck(e5);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("SecurityException: No permission to access ");
            sbLIZ4.append(str);
            sbLIZ4.append(", e: ");
            sbLIZ4.append(e5.getMessage());
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ4));
            return null;
        } catch (NoSuchAlgorithmException e6) {
            TryCatchGuardChecker.doCheck(e6);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("NoSuchAlgorithmException: MD5 not supported, e: ");
            sbLIZ5.append(e6.getMessage());
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ5));
            return null;
        } catch (Exception e7) {
            TryCatchGuardChecker.doCheck(e7);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Unexpected error msg: ");
            sbLIZ6.append(e7.getMessage());
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ6));
            return null;
        }
    }

    public static int LJIILJJIL(Context context, boolean z) {
        Activity activityLIZ;
        Boolean boolValueOf;
        Boolean boolValueOf2 = null;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        int iLJIJ = 30;
        if (activityLIZ != null) {
            ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
            if (iCreativeSAAService != null) {
                boolValueOf = Boolean.valueOf(iCreativeSAAService.isEditScene(activityLIZ));
            } else {
                boolValueOf = null;
            }
            ICreativeSAAService iCreativeSAAService2 = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
            if (iCreativeSAAService2 != null) {
                boolValueOf2 = Boolean.valueOf(iCreativeSAAService2.isEditSceneInStory(activityLIZ));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getRequestMusicCount isEditScene:");
            sbLIZ.append(boolValueOf);
            sbLIZ.append(", isEditPro:");
            sbLIZ.append(z);
            sbLIZ.append(", isEditSceneInStory:");
            sbLIZ.append(boolValueOf2);
            C201955140j.LJIILIIL("EditMusicPanelOptHelper", C2188811AlT.LIZIZ(sbLIZ));
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(boolValueOf2, bool) && !Intrinsics.LJFF(boolValueOf, bool)) {
                C201955140j.LJFF("EditMusicPanelOptHelper", "getRequestMusicCount return");
                return 30;
            }
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 30, "studio_request_panel_music_counts", true) < 30 && !z) {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 30, "studio_request_panel_music_counts", true);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getRequestMusicCount pageSize:");
        sbLIZ2.append(iLJIJ);
        C201955140j.LJIILIIL("EditMusicPanelOptHelper", C2188811AlT.LIZIZ(sbLIZ2));
        return iLJIJ;
    }

    public static String LJIIZILJ(String str, boolean z) {
        if (LJIJ == EnumC2290308yD.SINGLE_SELECT_PHOTO.ordinal()) {
            return "preload_emb";
        }
        if (LJIJI == EnumC2274808vi.PANEL_PIC.ordinal() && z) {
            return "panel_emb";
        }
        if (LJIIJJI.containsKey(str) && (!LJII.isEmpty())) {
            C201955140j.LJIILIIL("PreEmbTaskManager", "getZipUrlType preload_emb");
            return "preload_emb";
        }
        return "capsule_emb";
    }

    public static void LJJIJIIJI(String str, List list) {
        if (!C0APN.LIZIZ()) {
            return;
        }
        LJJIJIIJIL(str, LJ(list));
    }

    public static void LJJIJIIJIL(String str, List list) {
        if (!Intrinsics.LJFF(LJI, str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("final updateCreateIdSelectedMedias different createId = ");
            sbLIZ.append(str);
            sbLIZ.append(", before = ");
            sbLIZ.append(LJI);
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            LJI = str;
            LJJIII();
        }
        LIZIZ();
        LJII.addAll(list);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("final updateCreateIdSelectedMedias list = ");
        sbLIZ2.append(list);
        C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r22, java.util.List r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458370o3P.LJJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.util.List, android.os.Bundle):void");
    }

    public static void LIZLLL(C1458730o3z c1458730o3z, boolean z, boolean z2, ShortVideoContext shortVideoContext) {
        if (!z2) {
            if (!C0APN.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isAllowPreloadInMainScene in deselectMedia: ");
                sbLIZ.append(C0APN.LIZIZ());
                C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        } else if (!C289260BVk.LIZIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isAllowPreloadInStory in deselectMedia: ");
            sbLIZ2.append(C289260BVk.LIZIZ());
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        String str = LJIIL;
        if (str != null && Intrinsics.LJFF(str, c1458730o3z.LIZJ)) {
            C201955140j.LJFF("PreEmbTaskManager", "already deselected this media ");
        } else {
            C23250099c.LIZLLL(LIZIZ, null, null, new C1458380o3Q(c1458730o3z, z, shortVideoContext, z2, null), 3);
        }
    }

    public static void LJJIIZI(String str, ShortVideoContext shortVideoContext, boolean z, boolean z2) {
        boolean z3;
        String str2;
        if (shortVideoContext != null) {
            z3 = shortVideoContext.mIsFromDraft;
        } else {
            z3 = false;
        }
        if (!C2292008yU.LIZ()) {
            C1452450ntr.LIZ = z3;
        }
        String creationId = null;
        if (shortVideoContext != null) {
            str2 = shortVideoContext.shootWay;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "comment_reply")) {
            C201955140j.LJFF("PreEmbTaskManager", "shoot pic in comment reply scene not support preload frame");
            return;
        }
        if (!z2) {
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_preload_frame_for_shoot_pic", true, false)) {
                C201955140j.LJFF("PreEmbTaskManager", "No main scene shooting optimization");
                return;
            }
        } else if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_preload_frame_for_shoot_pic_in_story", true, false)) {
            C201955140j.LJFF("PreEmbTaskManager", "No optimization for shooting in story scenes");
            return;
        }
        if (LJIJJLI(shortVideoContext)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncPreLaunchTaskForShootPic musicId:");
            if (shortVideoContext != null) {
                creationId = shortVideoContext.getMusicId();
            }
            sbLIZ.append(creationId);
            C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (shortVideoContext != null) {
            creationId = shortVideoContext.getCreationId();
        }
        LJJIIZ(shortVideoContext, str, null, creationId, z, z2, "video_shoot_page");
    }

    public static void LJJIIJ(C1458730o3z c1458730o3z, boolean z, ShortVideoContext shortVideoContext, boolean z2, boolean z3) {
        boolean z4;
        if (shortVideoContext != null) {
            z4 = shortVideoContext.mIsFromDraft;
        } else {
            z4 = false;
        }
        if (!C2292008yU.LIZ()) {
            C1452450ntr.LIZ = z4;
        }
        String musicId = null;
        if (LJIJJLI(shortVideoContext)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("selectMedia musicId:");
            if (shortVideoContext != null) {
                musicId = shortVideoContext.getMusicId();
            }
            sbLIZ.append(musicId);
            C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!z3) {
            if (!C0APN.LIZIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isAllowPreloadInMainScene: ");
                sbLIZ2.append(C0APN.LIZIZ());
                C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        } else if (!C289260BVk.LIZIZ()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("isAllowPreloadInStory: ");
            sbLIZ3.append(C289260BVk.LIZIZ());
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (c1458730o3z == null) {
            C201955140j.LJFF("PreEmbTaskManager", "selectMedia media is null");
            return;
        }
        String str = c1458730o3z.LIZJ;
        if (str != null && str.length() == 0) {
            C201955140j.LJIILIIL("PreEmbTaskManager", "selectMedia fileLocalUriPath is empty");
            return;
        }
        if (shortVideoContext != null) {
            try {
                String creationId = shortVideoContext.getCreationId();
                if (creationId != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("-------------------- creationId: ");
                    sbLIZ4.append(creationId);
                    C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ4));
                    if (!Intrinsics.LJFF(creationId, LJI)) {
                        LJI = creationId;
                        LIZ.getClass();
                        LJJIII();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("resetUrlContent happened in selectMedia method: ");
                        sbLIZ5.append(creationId);
                        C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("happen ConcurrentModificationException in selectMedia e: ");
                sbLIZ6.append(e.getMessage());
                C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ6));
                return;
            }
        }
        if (!z) {
            LIZLLL(c1458730o3z, z2, z3, shortVideoContext);
            return;
        }
        CopyOnWriteArrayList<C1458730o3z> copyOnWriteArrayList = LIZJ;
        if (!copyOnWriteArrayList.contains(c1458730o3z)) {
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator<C1458730o3z> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().LIZ, c1458730o3z.LIZ)) {
                    }
                }
            }
            C23250099c.LIZLLL(LIZIZ, null, null, new C1458400o3S(c1458730o3z, z2, shortVideoContext, z3, null), 3);
            return;
        }
        C201955140j.LJIILIIL("PreEmbTaskManager", "already selected");
    }

    public static void LJJIIZ(ShortVideoContext shortVideoContext, String str, String str2, String str3, boolean z, boolean z2, String str4) {
        if (str.length() == 0) {
            C201955140j.LJFF("PreEmbTaskManager", "performTaskForSinglePic path is null");
            return;
        }
        if (str2 != null) {
            LJIILIIL.put(str, str2);
        }
        if (str3 != null) {
            LJI = str3;
        }
        C23250099c.LIZLLL(LIZIZ, null, null, new C1457490o1z(z, str, shortVideoContext, z2, str4, null), 3);
    }

    public static void LJJIJ(C1458370o3P c1458370o3P, String str, String str2, String str3, ShortVideoContext shortVideoContext, boolean z, boolean z2, int i) {
        String str4;
        boolean z3 = z;
        ShortVideoContext shortVideoContext2 = shortVideoContext;
        String musicId = null;
        if ((i & 8) != 0) {
            shortVideoContext2 = null;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        c1458370o3P.getClass();
        if (!z2) {
            C201955140j.LJFF("PreEmbTaskManager", "scene is not main scene");
            return;
        }
        if (shortVideoContext2 != null) {
            str4 = shortVideoContext2.shootWay;
        } else {
            str4 = null;
        }
        if (Intrinsics.LJFF(str4, "comment_reply")) {
            C201955140j.LJFF("PreEmbTaskManager", "upload pic in comment reply scene not support preload frame");
            return;
        }
        if (LJIJJLI(shortVideoContext2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncPreLaunchTaskForSingleSelectPic musicId:");
            if (shortVideoContext2 != null) {
                musicId = shortVideoContext2.getMusicId();
            }
            sbLIZ.append(musicId);
            C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!z3) {
            if (C0APN.LIZ() != 2 && C0APN.LIZ() != 3) {
                C201955140j.LJFF("PreEmbTaskManager", "not support single pic in preload extract frame in album for pic on Main shooting scene");
                return;
            }
        } else if (C289260BVk.LIZ() != 2 && C289260BVk.LIZ() != 3) {
            C201955140j.LJFF("PreEmbTaskManager", "not support single pic in preload extract frame in album for pic on story Main shooting scene");
            return;
        }
        LJJIIZ(shortVideoContext2, str, str2, str3, false, z3, "upload_page");
    }

    public static String LJFF(ShortVideoContext shortVideoContext, List list, boolean z, String str, String str2, boolean z2, String str3, boolean z3, int i) {
        ContentUnderstandingRequest contentUnderstandingRequestLIZ;
        C19475711Hn c19475711HnLJII;
        ContentUnderstandingResult contentUnderstandingResult;
        ContentUnderstandingResult.RequestResult requestResult;
        String understandingKey = null;
        if (!LJIJJ() || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return null;
        }
        C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "UnderstandingKeyCenter clearLocalUnderstandingKey");
        C1458580o3k.LIZ = null;
        IContentUnderstandingServiceWrap iContentUnderstandingServiceWrap = (IContentUnderstandingServiceWrap) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingServiceWrap.class, false, false, false, 14, null);
        if (iContentUnderstandingServiceWrap != null && (contentUnderstandingRequestLIZ = iContentUnderstandingServiceWrap.LIZ(list, shortVideoContext, str2, str, "cloud_understanding", z2, str3, i)) != null) {
            contentUnderstandingRequestLIZ.extraParams.put("isFromStory", String.valueOf(z2));
            contentUnderstandingRequestLIZ.extraParams.put("isFromShoot", String.valueOf(z3));
            IContentUnderstandingService iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
            if (iContentUnderstandingService != null) {
                iContentUnderstandingService.LJ(C2253208sE.LIZ, contentUnderstandingRequestLIZ);
            }
            LJIIIIZZ.incrementAndGet();
            LJIJ = EnumC2290308yD.MULTI_SELECT_PHOTO.ordinal();
            if (z) {
                C11RK c11rk = new C11RK();
                IContentUnderstandingService iContentUnderstandingService2 = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
                if (iContentUnderstandingService2 != null) {
                    c19475711HnLJII = iContentUnderstandingService2.LJII(C2253208sE.LIZ);
                } else {
                    c19475711HnLJII = null;
                }
                C1458720o3y c1458720o3y = new C1458720o3y(new ArrayList(list), c11rk);
                LJIJJ.add(c1458720o3y);
                try {
                    if (c19475711HnLJII != null) {
                        try {
                            contentUnderstandingResult = (ContentUnderstandingResult) c19475711HnLJII.LIZLLL();
                        } catch (NoSuchElementException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("doCloudContentUnderstanding empty stream: ");
                            sbLIZ.append(e.getMessage());
                            C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
                            contentUnderstandingResult = null;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("doCloudContentUnderstanding error: ");
                            sbLIZ2.append(e2.getMessage());
                            C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ2));
                            contentUnderstandingResult = null;
                        }
                    } else {
                        contentUnderstandingResult = null;
                    }
                    if (contentUnderstandingResult instanceof ContentUnderstandingResult.RequestResult) {
                        requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult;
                    } else {
                        requestResult = null;
                    }
                    if (requestResult != null) {
                        understandingKey = requestResult.getUnderstandingKey();
                    }
                    if (understandingKey != null) {
                        c11rk.onNext(understandingKey);
                    }
                    CopyOnWriteArrayList<C1458720o3y> copyOnWriteArrayList = LJIJJ;
                    if (copyOnWriteArrayList.contains(c1458720o3y)) {
                        copyOnWriteArrayList.remove(c1458720o3y);
                    }
                    return understandingKey;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    CopyOnWriteArrayList<C1458720o3y> copyOnWriteArrayList2 = LJIJJ;
                    if (copyOnWriteArrayList2.contains(c1458720o3y)) {
                        copyOnWriteArrayList2.remove(c1458720o3y);
                    }
                    throw th;
                }
            }
        }
        return null;
    }
}
