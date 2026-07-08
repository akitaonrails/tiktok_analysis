package X;

import Y.AComparatorS514S0100000_15;
import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.HidePreviewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0avW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953760avW {
    public static final C915050Zv5 LIZIZ = new C915050Zv5();
    public static volatile C953760avW LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(116));

    public final C08I7<String, C953770avX> LJ() {
        return (C08I7) this.LIZ.getValue();
    }

    public final void LIZIZ() {
        synchronized (LJ()) {
            try {
                C953770avX c953770avXLJ = LJ().LJ("preview_id");
                if (c953770avXLJ != null) {
                    File fileFM2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).fM2(c953770avXLJ.LIZIZ(), false);
                    MultiCanvasUtils.LIZ.getClass();
                    MultiCanvasUtils.LJII(fileFM2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ() {
        synchronized (LJ()) {
            try {
                Collection collectionValues = ((LinkedHashMap) LJ().LJI()).values();
                ArrayList<C953770avX> arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (((C953770avX) obj).LIZ == 2) {
                        arrayList.add(obj);
                    }
                }
                for (C953770avX c953770avX : arrayList) {
                    File fileFM2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).fM2(c953770avX.LIZIZ(), false);
                    MultiCanvasUtils.LIZ.getClass();
                    MultiCanvasUtils.LJII(fileFM2);
                    LJ().LJ(c953770avX.LIZIZ());
                }
                LJIILJJIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C953770avX LJIIIIZZ() {
        C953770avX c953770avXLIZIZ;
        synchronized (LJ()) {
            try {
                c953770avXLIZIZ = LJ().LIZIZ("preview_id");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c953770avXLIZIZ;
    }

    public final C953770avX LJIIIZ() {
        Object next;
        C953770avX c953770avX;
        synchronized (LJ()) {
            try {
                Collection collectionValues = ((LinkedHashMap) LJ().LJI()).values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (((C953770avX) obj).LIZ == 2) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long j = ((C953770avX) next).LIZJ;
                        do {
                            Object next2 = it2.next();
                            long j2 = ((C953770avX) next2).LIZJ;
                            if (j < j2) {
                                next = next2;
                                j = j2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                c953770avX = (C953770avX) next;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c953770avX;
    }

    public final void LJIIJ() {
        synchronized (LJ()) {
            try {
                List<String> listLIZIZ = InterfaceC1106030et7.N7.LIZIZ();
                if (!listLIZIZ.isEmpty()) {
                    for (String str : listLIZIZ) {
                        if (str != null && str.length() != 0) {
                            C0VSJ c0vsj = new C0VSJ(str);
                            if (c0vsj.exists()) {
                                int i = C953770avX.LJIILL;
                                C953770avX c953770avX = (C953770avX) C2348809Ig.LJ(C09BH.LJI(c0vsj, Charsets.UTF_8), C953770avX.class);
                                if (c953770avX != null && LIZ(c953770avX) && c953770avX.LIZ == 3 && c953770avX.LJIIIIZZ != 1) {
                                    LJ().LIZLLL(c953770avX.LIZIZ(), c953770avX);
                                }
                            }
                            File parentFile = new C0VSJ(str).getParentFile();
                            if (parentFile != null) {
                                MultiCanvasUtils.LIZ.getClass();
                                MultiCanvasUtils.LJII(parentFile);
                            }
                        }
                    }
                    LJIIJJI();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJJI() {
        for (Map.Entry entry : ((LinkedHashMap) LJ().LJI()).entrySet()) {
            C953770avX c953770avX = (C953770avX) entry.getValue();
            C0VSJ c0vsj = new C0VSJ(((C953770avX) entry.getValue()).LJ);
            IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c953770avX.LIZIZ());
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append("content_image.");
            sbLIZ.append(C08QA.LJIJ(c0vsj));
            File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), false);
            MultiCanvasUtils.LIZ.getClass();
            MultiCanvasUtils.LJ(c0vsj, fileFM2);
            ((C953770avX) entry.getValue()).LJ = fileFM2.getAbsolutePath();
            C0VSJ c0vsj2 = new C0VSJ(((C953770avX) entry.getValue()).LIZLLL);
            IHostMultiCanvas iHostMultiCanvas2 = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c953770avX.LIZIZ());
            sbLIZ2.append(str);
            sbLIZ2.append("origin_image.");
            sbLIZ2.append(C08QA.LJIJ(c0vsj2));
            File fileFM22 = iHostMultiCanvas2.fM2(C2188811AlT.LIZIZ(sbLIZ2), false);
            MultiCanvasUtils.LJ(c0vsj2, fileFM22);
            ((C953770avX) entry.getValue()).LIZLLL = fileFM22.getAbsolutePath();
        }
        LJIILJJIL();
    }

    public final void LJIILJJIL() {
        synchronized (LJ()) {
            try {
                C20337914i1<List<String>> c20337914i1 = InterfaceC1106030et7.N7;
                ArrayList arrayList = new ArrayList();
                Collection collectionValues = ((LinkedHashMap) LJ().LJI()).values();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(LJIILLIIL((C953770avX) it2.next()));
                }
                arrayList.addAll(arrayList2);
                c20337914i1.LJFF(arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LIZ(C953770avX c953770avX) {
        boolean zExists;
        if (c953770avX.LJ.length() == 0) {
            c953770avX.LIZJ();
        }
        if (c953770avX.LIZ != 1 && c953770avX.LJIIJJI) {
            c953770avX.LJIIJJI = false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            zExists = Files.exists(Paths.get(c953770avX.LJ, new String[0]), new LinkOption[0]);
        } else {
            zExists = new C0VSJ(c953770avX.LJ).exists();
        }
        if (zExists && System.currentTimeMillis() - c953770avX.LIZJ <= ((long) (MultiGuestNoticeboardEditorSetting.INSTANCE.getHistoryExpireTime() * 24 * 60 * 60)) * 1000 && (!a0.LJJJIL(c953770avX.LJIIJ)) && (!a0.LJJJIL(c953770avX.LJII))) {
            return true;
        }
        return false;
    }

    public static String LJIILLIIL(C953770avX c953770avX) throws Throwable {
        String absolutePath;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c953770avX.LIZIZ());
            sbLIZ.append(File.separator);
            sbLIZ.append("draft_item.json");
            File fileFM2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).fM2(C2188811AlT.LIZIZ(sbLIZ), true);
            C09BH.LJIIIZ(fileFM2, c953770avX.toString(), Charsets.UTF_8);
            absolutePath = fileFM2.getAbsolutePath();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (absolutePath == null) {
            return "";
        }
        return absolutePath;
    }

    public final C953770avX LJFF(String str) {
        C953770avX c953770avX;
        synchronized (LJ()) {
            try {
                if (str.length() != 0) {
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(3, 1), new Pair(2, 2), new Pair(1, 3));
                    Collection collectionValues = ((LinkedHashMap) LJ().LJI()).values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (Intrinsics.LJFF(((C953770avX) obj).LJII, str)) {
                            arrayList.add(obj);
                        }
                    }
                    c953770avX = (C953770avX) C13LP.LJJJLZIJ(0, C13LP.LJLLLL(new AComparatorS514S0100000_15(mapLJIIIIZZ, 3), arrayList));
                } else {
                    c953770avX = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c953770avX;
    }

    public final List<C953770avX> LJI(String str) {
        boolean z;
        List<C953770avX> listLJLLLL;
        synchronized (LJ()) {
            try {
                if (str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    listLJLLLL = C13BV.INSTANCE;
                } else {
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(3, 1), new Pair(2, 2), new Pair(1, 3));
                    Collection collectionValues = ((LinkedHashMap) LJ().LJI()).values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (Intrinsics.LJFF(((C953770avX) obj).LJII, str)) {
                            arrayList.add(obj);
                        }
                    }
                    listLJLLLL = C13LP.LJLLLL(new AComparatorS514S0100000_15(mapLJIIIIZZ, 4), arrayList);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listLJLLLL;
    }

    public final List<C953770avX> LJII(long j) {
        ArrayList arrayList;
        boolean z;
        synchronized (LJ()) {
            try {
                Collection collectionValues = ((LinkedHashMap) LJ().LJI()).values();
                arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    Long l = ((C953770avX) obj).LJIIL;
                    if (l == null || l.longValue() != j) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final void LJIIL(C953770avX c953770avX) {
        synchronized (LJ()) {
            try {
                LJ().LIZLLL(c953770avX.LIZIZ(), c953770avX);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILIIL(String str) {
        synchronized (LJ()) {
            try {
                LJ().LJ(str);
                MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                File fileFM2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).fM2(str, false);
                multiCanvasUtils.getClass();
                MultiCanvasUtils.LJII(fileFM2);
                LJIILJJIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJ(List<Pair<String, Integer>> list) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDraftByReviewIM, pairs: ");
        sbLIZ.append(list);
        C20441214yg.LJIIIZ("DraftCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (LJ()) {
            try {
                for (Pair<String, Integer> pair : list) {
                    if (pair.getSecond().intValue() == 20 || pair.getSecond().intValue() == 30) {
                        if (pair.getSecond().intValue() == 20) {
                            i = 4;
                        } else {
                            i = 5;
                        }
                        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(3, 1), new Pair(1, 2), new Pair(2, 3));
                        Collection collectionValues = ((LinkedHashMap) LJ().LJI()).values();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : collectionValues) {
                            C953770avX c953770avX = (C953770avX) obj;
                            if (Intrinsics.LJFF(c953770avX.LJII, pair.getFirst()) && c953770avX.LJIIIIZZ != 5) {
                                arrayList.add(obj);
                            }
                        }
                        C953770avX c953770avX2 = (C953770avX) C13LP.LJJJLZIJ(0, C13LP.LJLLLL(new AComparatorS514S0100000_15(mapLJIIIIZZ, 5), arrayList));
                        if (c953770avX2 == null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("on updateDraft, not fount media node id: ");
                            sbLIZ2.append(pair);
                            C20441214yg.LIZIZ("DraftCacheManager", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            c953770avX2.LJIIIIZZ = i;
                        }
                    }
                }
                LJIILJJIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final List LIZLLL(int i, String str) {
        ArrayList arrayList;
        boolean z;
        synchronized (LJ()) {
            try {
                Collection collectionValues = ((LinkedHashMap) LJ().LJI()).values();
                arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    C953770avX c953770avX = (C953770avX) obj;
                    if (!Intrinsics.LJFF(c953770avX.LJII, str) || c953770avX.LIZ != i) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final void LJIILL(C953770avX c953770avX, Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat;
        synchronized (LJ()) {
            if (c953770avX != null && bitmap != null) {
                try {
                    MultiGuestNoticeboardEditorSetting multiGuestNoticeboardEditorSetting = MultiGuestNoticeboardEditorSetting.INSTANCE;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, multiGuestNoticeboardEditorSetting.getMaxCanvasWidth(), multiGuestNoticeboardEditorSetting.getMaxCanvasHeight(), true);
                    MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c953770avX.LIZIZ());
                    sbLIZ.append(File.separator);
                    sbLIZ.append("content_image.webp");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (Build.VERSION.SDK_INT >= 30) {
                        compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
                    } else {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    }
                    multiCanvasUtils.getClass();
                    c953770avX.LJ = MultiCanvasUtils.LJIJJLI(bitmapCreateScaledBitmap, strLIZIZ, compressFormat);
                    LJIIL(c953770avX);
                    LJIILJJIL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJIIZILJ(DataChannel dataChannel, Pair<String, Integer> pair) {
        int i;
        Object obj;
        Object next;
        C953770avX c953770avXLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDraftByNoticeboardIM, pair: ");
        sbLIZ.append(pair);
        C20441214yg.LIZIZ("DraftCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (LJ()) {
            try {
                int iIntValue = pair.getSecond().intValue();
                if (iIntValue != 3 && iIntValue != 4) {
                    if (iIntValue != 5 && iIntValue != 6) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 3;
                }
                Collection collectionValues = ((LinkedHashMap) LJ().LJI()).values();
                ArrayList<C953770avX> arrayList = new ArrayList();
                for (Object obj2 : collectionValues) {
                    if (Intrinsics.LJFF(((C953770avX) obj2).LJII, pair.getFirst())) {
                        arrayList.add(obj2);
                    }
                }
                for (C953770avX c953770avX : arrayList) {
                    if (i == 3) {
                        int i2 = c953770avX.LJIIIIZZ;
                        if (i2 != 4 && i2 != 5) {
                            c953770avX.LJIIIIZZ = i;
                        }
                    } else {
                        c953770avX.LJIIIIZZ = i;
                    }
                }
                if (i == 3) {
                    Iterator it2 = ((LinkedHashMap) LJ().LJI()).values().iterator();
                    while (true) {
                        obj = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            C953770avX c953770avX2 = (C953770avX) next;
                            if (Intrinsics.LJFF(c953770avX2.LJII, pair.getFirst()) && c953770avX2.LIZ == 3) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (((C953770avX) next) == null) {
                        Iterator it3 = ((LinkedHashMap) LJ().LJI()).values().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next2 = it3.next();
                            C953770avX c953770avX3 = (C953770avX) next2;
                            if (Intrinsics.LJFF(c953770avX3.LJII, pair.getFirst()) && c953770avX3.LIZ == 1) {
                                obj = next2;
                                break;
                            }
                        }
                        C953770avX c953770avX4 = (C953770avX) obj;
                        if (c953770avX4 != null && (c953770avXLIZ = c953770avX4.LIZ(3)) != null) {
                            LJIIL(c953770avXLIZ);
                        }
                    }
                }
                if (dataChannel != null) {
                    dataChannel.FQ2(HidePreviewEvent.class);
                }
                LIZIZ();
                LJIILJJIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
