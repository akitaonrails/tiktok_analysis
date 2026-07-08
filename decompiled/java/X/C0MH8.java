package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S2102000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0MH8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MH8 {
    public static final C0MH8 LIZ = new C0MH8();
    public static final boolean LIZIZ = C493401w4.LIZ();
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C581260Mqy(CoroutineExceptionHandler.LJJLIL, 0)));
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, List<C0MHA>>> LIZLLL = new ConcurrentHashMap<>();
    public static final MutableLiveData<C0MHA> LJ = new MutableLiveData<>();
    public static final C2252331DDr LJFF = C09IR.LIZIZ(0, Integer.MAX_VALUE, null, 5);

    public static int LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return 1001;
        }
        return LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public static CoverNewItem LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        CopyOnWriteArrayList<CoverNewItem> newCoverList2;
        CopyOnWriteArrayList<CoverNewItem> newCoverList3;
        CoverNewItem coverNewItemPrevious;
        try {
            CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel == null || (newCoverList3 = coverPublishModel.getNewCoverList()) == null) {
                return null;
            }
            ListIterator<CoverNewItem> listIterator = newCoverList3.listIterator(newCoverList3.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    coverNewItemPrevious = listIterator.previous();
                    CoverNewItem coverNewItem = coverNewItemPrevious;
                    if (coverNewItem != null) {
                        int scene = coverNewItem.getScene();
                        LIZ.getClass();
                        if (scene == LJIIIIZZ(videoPublishEditModel) && C2286708xd.LIZJ(coverNewItem.getCoverPath())) {
                            break;
                        }
                    }
                } else {
                    coverNewItemPrevious = null;
                    break;
                }
            }
            return coverNewItemPrevious;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CoverCreationManager");
            sbLIZ.append(": IndexOutOfBoundsException, list: ");
            CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel2 != null) {
                newCoverList2 = coverPublishModel2.getNewCoverList();
            } else {
                newCoverList2 = null;
            }
            sbLIZ.append(newCoverList2);
            C1AF0.LJ(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
            return null;
        } catch (NegativeArraySizeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CoverCreationManager");
            sbLIZ2.append(": negativeArraySizeException, list: ");
            CoverPublishModel coverPublishModel3 = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel3 != null) {
                newCoverList = coverPublishModel3.getNewCoverList();
            } else {
                newCoverList = null;
            }
            sbLIZ2.append(newCoverList);
            C1AF0.LJ(new Throwable(C2188811AlT.LIZIZ(sbLIZ2)));
            return null;
        }
    }

    public static void LJIIL(String str) {
        C201955140j.LJII(C0MHB.LIZIZ, str);
    }

    public static void LJIILL(VideoPublishEditModel videoPublishEditModel) {
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        CopyOnWriteArrayList<CoverNewItem> newCoverList2;
        Integer numValueOf;
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        if (coverPublishModel != null && (newCoverList = coverPublishModel.getNewCoverList()) != null) {
            C0MH8 c0mh8 = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("before removeUselessCover: ");
            sbLIZ.append(newCoverList);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c0mh8.getClass();
            LJIIL(strLIZIZ);
            ArrayList arrayList = new ArrayList(newCoverList);
            HashMap map = new HashMap();
            Iterator it2 = arrayList.iterator();
            while (true) {
                newCoverList2 = null;
                String coverPath = null;
                Integer numValueOf2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                CoverNewItem coverNewItem = (CoverNewItem) it2.next();
                if (LIZIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    if (coverNewItem != null) {
                        numValueOf = Integer.valueOf(coverNewItem.getCoverType());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ2.append(numValueOf);
                    sbLIZ2.append('-');
                    if (coverNewItem != null) {
                        numValueOf2 = Integer.valueOf(coverNewItem.getScene());
                    }
                    sbLIZ2.append(numValueOf2);
                    CoverNewItem coverNewItem2 = (CoverNewItem) map.put(C2188811AlT.LIZIZ(sbLIZ2), coverNewItem);
                    if (coverNewItem2 != null) {
                        C2286708xd.LJIJ(coverNewItem2.getCoverPath());
                        newCoverList.remove(coverNewItem2);
                        C0MH8 c0mh82 = LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("clear old cover: ");
                        sbLIZ3.append(coverNewItem2);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        c0mh82.getClass();
                        LJIIL(strLIZIZ2);
                    }
                } else {
                    if (coverNewItem != null) {
                        coverPath = coverNewItem.getCoverPath();
                    }
                    C2286708xd.LJIJ(coverPath);
                    newCoverList.remove(coverNewItem);
                    C0MH8 c0mh83 = LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("clear old cover because exp not hit: ");
                    sbLIZ4.append(coverNewItem);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                    c0mh83.getClass();
                    LJIIL(strLIZIZ3);
                }
            }
            C0MH8 c0mh84 = LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("after remove: ");
            CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel2 != null) {
                newCoverList2 = coverPublishModel2.getNewCoverList();
            }
            sbLIZ5.append(newCoverList2);
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
            c0mh84.getClass();
            LJIIL(strLIZIZ4);
        }
    }

    public static String LJI(VideoPublishEditModel videoPublishEditModel, int i) {
        String str;
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
        EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.COVER;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cover_");
        switch (i) {
            case -1:
                str = "default";
                break;
            case 0:
                str = "source_frame_from_editor";
                break;
            case 1:
                str = "source_frame_without_editor";
                break;
            case 2:
                str = "source_frame_from_editor_with_sticker";
                break;
            case 3:
                str = "source_frame_without_editor_with_sticker";
                break;
            case 4:
                str = "custom_cover";
                break;
            case 5:
                str = "custom_cover_with_sticker";
                break;
            default:
                str = "unknown";
                break;
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".png");
        return C2298208zU.LIZLLL(pathService, creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), false, 8);
    }

    public static CoverNewItem LJIIJJI(List list, VideoPublishEditModel videoPublishEditModel) {
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        CopyOnWriteArrayList<CoverNewItem> newCoverList2;
        CopyOnWriteArrayList<CoverNewItem> newCoverList3;
        CoverNewItem coverNewItemPrevious;
        Integer numValueOf;
        try {
            CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel == null || (newCoverList3 = coverPublishModel.getNewCoverList()) == null) {
                return null;
            }
            ListIterator<CoverNewItem> listIterator = newCoverList3.listIterator(newCoverList3.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    coverNewItemPrevious = listIterator.previous();
                    CoverNewItem coverNewItem = coverNewItemPrevious;
                    if (coverNewItem != null) {
                        numValueOf = Integer.valueOf(coverNewItem.getCoverType());
                    } else {
                        numValueOf = null;
                    }
                    if (C13LP.LJJJJ(numValueOf, list) && coverNewItem != null) {
                        int scene = coverNewItem.getScene();
                        LIZ.getClass();
                        if (scene == LJIIIIZZ(videoPublishEditModel) && C2286708xd.LIZJ(coverNewItem.getCoverPath())) {
                            break;
                        }
                    }
                } else {
                    coverNewItemPrevious = null;
                    break;
                }
            }
            return coverNewItemPrevious;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CoverCreationManager");
            sbLIZ.append(": IndexOutOfBoundsException, list: ");
            CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel2 != null) {
                newCoverList2 = coverPublishModel2.getNewCoverList();
            } else {
                newCoverList2 = null;
            }
            sbLIZ.append(newCoverList2);
            C1AF0.LJ(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
            return null;
        } catch (NegativeArraySizeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CoverCreationManager");
            sbLIZ2.append(": negativeArraySizeException, list: ");
            CoverPublishModel coverPublishModel3 = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel3 != null) {
                newCoverList = coverPublishModel3.getNewCoverList();
            } else {
                newCoverList = null;
            }
            sbLIZ2.append(newCoverList);
            C1AF0.LJ(new Throwable(C2188811AlT.LIZIZ(sbLIZ2)));
            return null;
        }
    }

    public static void LJIJJ(String str, String str2) {
        List<C0MHA> list;
        List<C0MHA> list2;
        C0MHA c0mha;
        ConcurrentHashMap<String, ConcurrentHashMap<String, List<C0MHA>>> concurrentHashMap = LIZLLL;
        ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 != null && (list = concurrentHashMap2.get(str2)) != null && !list.isEmpty()) {
            LJIIL("trigger save cover task");
            ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap3 = concurrentHashMap.get(str);
            if (concurrentHashMap3 != null && (list2 = concurrentHashMap3.get(str2)) != null && (c0mha = (C0MHA) C13LP.LJJJLL(list2)) != null) {
                C23250099c.LIZLLL(LIZJ, null, null, new C0MH9(c0mha, str, str2, null), 3);
            }
        }
    }

    public final boolean LJ(VideoPublishEditModel videoPublishEditModel, int i) {
        boolean z;
        boolean z2;
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        String coverPath;
        if (videoPublishEditModel == null) {
            return false;
        }
        try {
            if (!C493401w4.LIZ()) {
                return false;
            }
            String strLJII = LJII(videoPublishEditModel, i);
            boolean zLIZJ = C2286708xd.LIZJ(strLJII);
            boolean z3 = true;
            if (zLIZJ) {
                z = true;
            } else {
                z = false;
            }
            CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel != null && (newCoverList = coverPublishModel.getNewCoverList()) != null && !newCoverList.isEmpty()) {
                for (CoverNewItem coverNewItem : newCoverList) {
                    if (coverNewItem != null) {
                        coverPath = coverNewItem.getCoverPath();
                    } else {
                        coverPath = null;
                    }
                    if (Intrinsics.LJFF(coverPath, strLJII)) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
            C540390LHh c540390LHh = C540390LHh.LIZ;
            String creationId = videoPublishEditModel.getCreationId();
            if (strLJII == null) {
                z3 = false;
            }
            c540390LHh.getClass();
            C540390LHh.LIZ(creationId, z2, z3, zLIZJ);
            if (!z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("check file failed, stack: ");
                sbLIZ.append(C13SZ.LIZIZ(new Throwable()));
                LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            }
            return z;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (ConcurrentModificationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public final synchronized void LJFF(String str, C0MHA c0mha) {
        List<C0MHA> listPutIfAbsent;
        ConcurrentHashMap<String, List<C0MHA>> concurrentHashMapPutIfAbsent;
        List<C0MHA> list;
        List<C0MHA> listPutIfAbsent2;
        ConcurrentHashMap<String, List<C0MHA>> concurrentHashMapPutIfAbsent2;
        ConcurrentHashMap<String, ConcurrentHashMap<String, List<C0MHA>>> concurrentHashMap = LIZLLL;
        ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 != null && (list = concurrentHashMap2.get(c0mha.LIZ)) != null && !list.isEmpty()) {
            ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap3 = concurrentHashMap.get(str);
            if (concurrentHashMap3 == null && (concurrentHashMapPutIfAbsent2 = concurrentHashMap.putIfAbsent(str, (concurrentHashMap3 = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap3 = concurrentHashMapPutIfAbsent2;
            }
            ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap4 = concurrentHashMap3;
            String str2 = c0mha.LIZ;
            List<C0MHA> arrayList = concurrentHashMap4.get(str2);
            if (arrayList == null && (listPutIfAbsent2 = concurrentHashMap4.putIfAbsent(str2, (arrayList = new ArrayList<>()))) != null) {
                arrayList = listPutIfAbsent2;
            }
            arrayList.add(c0mha);
        } else {
            ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap5 = concurrentHashMap.get(str);
            if (concurrentHashMap5 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap5 = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap5 = concurrentHashMapPutIfAbsent;
            }
            ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap6 = concurrentHashMap5;
            String str3 = c0mha.LIZ;
            List<C0MHA> arrayList2 = concurrentHashMap6.get(str3);
            if (arrayList2 == null && (listPutIfAbsent = concurrentHashMap6.putIfAbsent(str3, (arrayList2 = new ArrayList<>()))) != null) {
                arrayList2 = listPutIfAbsent;
            }
            arrayList2.add(c0mha);
            LJIJJ(str, c0mha.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d A[EDGE_INSN: B:66:0x012d->B:59:0x012d BREAK  A[LOOP:0: B:54:0x0119->B:68:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r18, int r19) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MH8.LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int):java.lang.String");
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        return ((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C470001sI(videoPublishEditModel, str, str2, null))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15, X.C0MH8 r16, java.lang.String r17) {
        /*
            r2 = r16
            r2.getClass()
            boolean r0 = X.C0MH8.LIZIZ
            r1 = r15
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r1.creativeModel
            com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel r0 = r0.coverPublishModel
            if (r0 == 0) goto L7b
            X.0MH8 r0 = X.C0MH8.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.editSticker.model.CoverNewItem r0 = LJIIJ(r1)
            if (r0 == 0) goto L7b
            java.lang.String r6 = r0.getCoverPath()
            if (r6 == 0) goto L7b
            boolean r0 = X.C2286708xd.LIZJ(r6)
            if (r0 == 0) goto L7b
        L27:
            r5 = 0
            r9 = r17
            if (r6 != 0) goto L4f
            boolean r0 = X.C2286708xd.LIZJ(r9)
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.editSticker.model.CoverNewItem r7 = new com.ss.android.ugc.aweme.editSticker.model.CoverNewItem
            int r8 = LJIIIIZZ(r1)
            r10 = -3
            r11 = 0
            r12 = 0
            float r0 = r1.getVideoCoverStartTm()
            java.lang.Float r15 = java.lang.Float.valueOf(r0)
            r16 = 56
            r14 = r11
            r17 = r11
            r7.<init>(r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r2.LIZ(r1, r7, r5)
        L4f:
            boolean r0 = X.C2286708xd.LIZJ(r9)
            if (r0 != 0) goto L79
            boolean r0 = X.C2286708xd.LIZJ(r6)
            if (r0 != 0) goto L79
            r4 = 0
        L5c:
            if (r9 == 0) goto L6e
            X.0LHh r3 = X.C540390LHh.LIZ
            java.lang.String r2 = r1.getCreationId()
            if (r6 == 0) goto L71
            r1 = 1
        L67:
            r5 = 1
        L68:
            r3.getClass()
            X.C540390LHh.LIZ(r2, r1, r5, r4)
        L6e:
            if (r6 != 0) goto L7d
            return r9
        L71:
            r1 = 0
            boolean r0 = X.C123100dR.LIZ(r9)
            if (r0 == 0) goto L68
            goto L67
        L79:
            r4 = 1
            goto L5c
        L7b:
            r6 = 0
            goto L27
        L7d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MH8.LJIIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0MH8, java.lang.String):java.lang.String");
    }

    public final void LIZ(VideoPublishEditModel videoPublishEditModel, CoverNewItem coverNewItem, boolean z) {
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        CopyOnWriteArrayList<CoverNewItem> newCoverList2;
        Object next;
        CopyOnWriteArrayList<CoverNewItem> newCoverList3;
        CopyOnWriteArrayList<CoverNewItem> newCoverList4;
        String coverPath;
        if (!LIZIZ) {
            return;
        }
        if (!C2286708xd.LIZJ(coverNewItem.getCoverPath()) && !z && !Intrinsics.LJFF(coverNewItem.getUnsafeItem(), Boolean.TRUE)) {
            return;
        }
        synchronized (this) {
            CopyOnWriteArrayList<CoverNewItem> newCoverList5 = null;
            try {
                try {
                    CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
                    if (coverPublishModel != null && (newCoverList2 = coverPublishModel.getNewCoverList()) != null) {
                        Iterator it2 = new ArrayList(newCoverList2).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                CoverNewItem coverNewItem2 = (CoverNewItem) next;
                                if (coverNewItem2 != null) {
                                    coverPath = coverNewItem2.getCoverPath();
                                } else {
                                    coverPath = null;
                                }
                                if (Intrinsics.LJFF(coverPath, coverNewItem.getCoverPath())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        CoverNewItem coverNewItem3 = (CoverNewItem) next;
                        if (coverNewItem3 != null) {
                            CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
                            if (coverPublishModel2 != null && (newCoverList4 = coverPublishModel2.getNewCoverList()) != null) {
                                newCoverList4.remove(coverNewItem3);
                            }
                            CoverPublishModel coverPublishModel3 = videoPublishEditModel.getCoverPublishModel();
                            if (coverPublishModel3 != null && (newCoverList3 = coverPublishModel3.getNewCoverList()) != null) {
                                newCoverList3.add(coverNewItem);
                            }
                            return;
                        }
                    }
                    CoverPublishModel coverPublishModel4 = videoPublishEditModel.creativeModel.coverPublishModel;
                    if (coverPublishModel4 != null && (newCoverList = coverPublishModel4.getNewCoverList()) != null) {
                        newCoverList.add(coverNewItem);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (NegativeArraySizeException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("CoverCreationManager");
                    sb.append(": negativeArraySizeException, list: ");
                    CoverPublishModel coverPublishModel5 = videoPublishEditModel.getCoverPublishModel();
                    if (coverPublishModel5 != null) {
                        newCoverList5 = coverPublishModel5.getNewCoverList();
                    }
                    sb.append(newCoverList5);
                    C1AF0.LJ(new Throwable(sb.toString()));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final Pair LJIILIIL(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        boolean z;
        String strLJII = LJII(videoPublishEditModel, i);
        if (strLJII == null || !C123100dR.LIZ(strLJII)) {
            strLJII = str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("read cover bitmap: backupPath: ");
        sbLIZ.append(str);
        sbLIZ.append(", type = ");
        sbLIZ.append(i);
        sbLIZ.append(", stacktrace: ");
        sbLIZ.append(C13SZ.LIZIZ(new Throwable()));
        LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strLJII);
        ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap = LIZLLL.get(videoPublishEditModel.getCreationId());
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return new Pair(bitmapDecodeFile, Boolean.valueOf(!z));
    }

    public static Object LIZJ(VideoPublishEditModel videoPublishEditModel, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LIZIZ(LIZ, videoPublishEditModel, str, str2, new C5183020f(c2252611DEt, 10), 8);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static void LJIILJJIL(C0MH8 c0mh8, VideoPublishEditModel videoPublishEditModel, String str, Integer num, int i) {
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        CopyOnWriteArrayList<CoverNewItem> newCoverList2;
        String coverPath;
        String coverPath2;
        Integer numValueOf;
        CopyOnWriteArrayList<CoverNewItem> newCoverList3 = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        synchronized (c0mh8) {
            try {
                CoverPublishModel coverPublishModel = videoPublishEditModel.creativeModel.coverPublishModel;
                if (coverPublishModel != null && (newCoverList = coverPublishModel.getNewCoverList()) != null) {
                    ArrayList<CoverNewItem> arrayList = new ArrayList();
                    for (CoverNewItem coverNewItem : newCoverList) {
                        CoverNewItem coverNewItem2 = coverNewItem;
                        if (coverNewItem2 != null) {
                            coverPath2 = coverNewItem2.getCoverPath();
                        } else {
                            coverPath2 = null;
                        }
                        if (!Intrinsics.LJFF(coverPath2, str)) {
                            if (coverNewItem2 == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(coverNewItem2.getCoverType());
                            }
                            if (Intrinsics.LJFF(num, numValueOf)) {
                            }
                        }
                        arrayList.add(coverNewItem);
                    }
                    for (CoverNewItem coverNewItem3 : arrayList) {
                        if (coverNewItem3 != null) {
                            coverPath = coverNewItem3.getCoverPath();
                        } else {
                            coverPath = null;
                        }
                        C2286708xd.LJIJ(coverPath);
                    }
                    CoverPublishModel coverPublishModel2 = videoPublishEditModel.creativeModel.coverPublishModel;
                    if (coverPublishModel2 != null && (newCoverList2 = coverPublishModel2.getNewCoverList()) != null) {
                        newCoverList2.removeAll(arrayList);
                    }
                    C0MH8 c0mh82 = LIZ;
                    StringBuilder sb = new StringBuilder();
                    sb.append("remove success: path:");
                    sb.append(str);
                    sb.append(", coverList: ");
                    CoverPublishModel coverPublishModel3 = videoPublishEditModel.creativeModel.coverPublishModel;
                    if (coverPublishModel3 != null) {
                        newCoverList3 = coverPublishModel3.getNewCoverList();
                    }
                    sb.append(newCoverList3);
                    String string = sb.toString();
                    c0mh82.getClass();
                    LJIIL(string);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(C0MH8 c0mh8, VideoPublishEditModel videoPublishEditModel, String str, String str2, Function1 function1, int i) {
        int i2;
        String strLJI = str2;
        if ((i & 4) != 0) {
            strLJI = null;
        }
        if ((i & 8) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (strLJI == null) {
            c0mh8.getClass();
            strLJI = LJI(videoPublishEditModel, i2);
        }
        c0mh8.getClass();
        int iLJIIIIZZ = LJIIIIZZ(videoPublishEditModel);
        videoPublishEditModel.getCreationId();
        C0MHA c0mha = new C0MHA(strLJI, new AwS1S2102000_8(iLJIIIIZZ, i2, videoPublishEditModel, str, strLJI, 0));
        if (((Boolean) C0BCW.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(LIZJ, null, null, new C0MHF(c0mha, null, function1), 3);
            c0mh8.LJFF(videoPublishEditModel.getCreationId(), c0mha);
        } else {
            c0mh8.LJFF(videoPublishEditModel.getCreationId(), c0mha);
            C0CNO.LIZLLL(0L, new AwS409S0200000_8(c0mha, (C0MHA) function1, (Function1<? super Boolean, Unit>) 7));
        }
    }

    public static boolean LJIJ(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, int i, int i2, String str, int i3) {
        if (bitmap == null) {
            return false;
        }
        return ((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C469701sF(videoPublishEditModel, bitmap, i, i2, str, i3, null))).booleanValue();
    }

    public final void LJIILLIIL(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, int i, int i2, String str, int i3, Bitmap.CompressFormat compressFormat, Function1<? super Boolean, Unit> function1) {
        String strLJI = str;
        if (strLJI == null) {
            strLJI = LJI(videoPublishEditModel, i2);
        }
        LIZ(videoPublishEditModel, new CoverNewItem(i, strLJI, i2, null, 0L, Boolean.TRUE, Float.valueOf(videoPublishEditModel.getVideoCoverStartTm()), 24, null), false);
        videoPublishEditModel.getCreationId();
        C0MHA c0mha = new C0MHA(strLJI, new C0MBR(strLJI, bitmap, i3, compressFormat, videoPublishEditModel, i, i2));
        if (((Boolean) C0BCW.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(LIZJ, null, null, new C0MHC(c0mha, null, function1), 3);
            LJFF(videoPublishEditModel.getCreationId(), c0mha);
        } else {
            LJFF(videoPublishEditModel.getCreationId(), c0mha);
            C0CNO.LIZLLL(0L, new AwS409S0200000_8(c0mha, (C0MHA) function1, (Function1<? super Boolean, Unit>) 5));
        }
    }

    public static /* synthetic */ void LJIIZILJ(C0MH8 c0mh8, VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, int i, int i2, String str, int i3, Bitmap.CompressFormat compressFormat, Function1 function1, int i4) {
        if ((i4 & 4) != 0) {
            c0mh8.getClass();
            i = LJIIIIZZ(videoPublishEditModel);
        }
        if ((i4 & 8) != 0) {
            i2 = 2;
        }
        if ((i4 & 16) != 0) {
            str = null;
        }
        if ((i4 & 32) != 0) {
            i3 = 100;
        }
        if ((i4 & 64) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        c0mh8.LJIILLIIL(videoPublishEditModel, bitmap, i, i2, str, i3, compressFormat, function1);
    }
}
