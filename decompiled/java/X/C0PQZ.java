package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS29S0110000_10;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.MultiVideo;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1MultiSummary;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS122S1000000_10;
import kotlin.jvm.internal.AwS30S0600000_9;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQZ {
    public static boolean LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static boolean LJI;
    public static long LJIIJ;
    public static volatile long LJIIJJI;
    public static final C0PQZ LIZ = new C0PQZ();
    public static boolean LJFF = true;
    public static final List<String> LJII = new ArrayList();
    public static final List<String> LJIIIIZZ = new ArrayList();
    public static final ConcurrentHashMap<Integer, List<C589710NAz>> LJIIIZ = new ConcurrentHashMap<>();

    public static void LIZIZ() {
        Iterator<T> it2 = LJIIIZ.values().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) it2.next()).iterator();
            while (it3.hasNext()) {
                ((C589710NAz) it3.next()).LIZIZ();
            }
        }
        LJIIIZ.clear();
    }

    public static EnumC644580PQa LIZ(int i) {
        if (i < 4) {
            return EnumC644580PQa.P0_VISIBLE_MAIN_CONTENT;
        }
        if (i < 8) {
            return EnumC644580PQa.P1_NEXT_ROW_MAIN_CONTENT;
        }
        return EnumC644580PQa.P3_PREFETCH_AHEAD;
    }

    public static void LJ(SearchMixFeedList searchMixFeedList) {
        if (searchMixFeedList == null) {
            return;
        }
        int i = searchMixFeedList.resultStatus;
        if (i == 2) {
            LJI = true;
            C823050WQl.LJFF().execute(new ARunnableS110S0100000_10(searchMixFeedList, 108));
        } else {
            if (i != 3 && i != 40) {
                return;
            }
            C823050WQl.LJFF().execute(new ARunnableS110S0100000_10(searchMixFeedList, 109));
        }
    }

    public static void LJFF(SearchMixFeedList searchMixFeedList) {
        boolean z;
        boolean zLJFF;
        if (searchMixFeedList == null) {
            return;
        }
        if (LJFF) {
            if (searchMixFeedList.ack == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!C287940BQi.LIZ() && ((Number) C0BDQ.LIZ.getValue()).intValue() != 0) {
                C1334280kpG.LIZ.getClass();
                C1334280kpG.LIZJ = searchMixFeedList.cursor;
                GlobalDoodleConfig globalDoodleConfig = searchMixFeedList.globalDoodleConfig;
                if (globalDoodleConfig != null) {
                    zLJFF = Intrinsics.LJFF(globalDoodleConfig.getEnableImageRecord(), Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                C1334280kpG.LIZIZ = zLJFF;
                C823050WQl.LIZJ().execute(new ARunnableS29S0110000_10(searchMixFeedList, z, 3));
            }
        }
        int i = searchMixFeedList.ack;
        if (i == 0 || i == 1) {
            LJFF = false;
        }
        if (searchMixFeedList.resultStatus == 4 && LJFF) {
            LJFF = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static void LJIIIZ(List list) {
        Object next;
        Top1MultiSummary top1MultiSummary;
        List<MultiVideo> multiVideo;
        ?? arrayList;
        if (((Number) C0BDC.LIZ.getValue()).intValue() == 1) {
            Unit unit = null;
            if (list != null) {
                try {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((SearchMixFeed) next).getTop1MultiSummary() != null) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    SearchMixFeed searchMixFeed = (SearchMixFeed) next;
                    if (searchMixFeed != null && (top1MultiSummary = searchMixFeed.getTop1MultiSummary()) != null && (multiVideo = top1MultiSummary.getMultiVideo()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<MultiVideo> it3 = multiVideo.iterator();
                        while (it3.hasNext()) {
                            List<ImageData> subImages = it3.next().getSubImages();
                            if (subImages != null) {
                                arrayList = new ArrayList();
                                Iterator<ImageData> it4 = subImages.iterator();
                                while (it4.hasNext()) {
                                    String imageUrl = it4.next().getImageUrl();
                                    if (imageUrl != null && C123100dR.LIZ(imageUrl)) {
                                        arrayList.add(imageUrl);
                                    }
                                }
                            } else {
                                arrayList = C13BV.INSTANCE;
                            }
                            C19719612Di.LJJI(arrayList, arrayList2);
                        }
                        List listLL = C13LP.LL(arrayList2, 3);
                        if (listLL != null) {
                            Iterator it5 = listLL.iterator();
                            while (it5.hasNext()) {
                                ((ArrayList) LJIIIIZZ).add(C0Q0E.LIZIZ((String) it5.next()));
                            }
                            unit = Unit.LIZ;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return;
                }
            }
            C189200o6.m2constructorimpl(unit);
        }
    }

    public static void LJIIIIZZ(List list, List list2) {
        String strLIZ;
        String str;
        if (list == null) {
            return;
        }
        if (C278010Av1.LIZ() != 2 && C278010Av1.LIZ() != 4) {
            return;
        }
        boolean zLIZIZ = C644600PQc.LIZIZ();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            EnumC644580PQa enumC644580PQaLIZ = null;
            if (i >= 0) {
                C0PLT c0plt = (C0PLT) obj;
                Aweme aweme = c0plt.getAweme();
                if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && (strLIZ = C662290PyN.LIZ(c0plt.getAweme())) != null && strLIZ.length() != 0 && !((ArrayList) list2).contains(strLIZ)) {
                    if (zLIZIZ) {
                        LIZ.getClass();
                        enumC644580PQaLIZ = LIZ(i);
                    }
                    C0PQZ c0pqz = LIZ;
                    if (zLIZIZ) {
                        str = "photo_card_outflow_supplement";
                    } else {
                        str = "";
                    }
                    c0pqz.getClass();
                    LIZJ(strLIZ, enumC644580PQaLIZ, str, -1, -1);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[PHI: r15
      0x009f: PHI (r15v5 int) = (r15v4 int), (r15v7 int), (r15v8 int) binds: [B:28:0x0070, B:36:0x0097, B:37:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.AbstractC683590Qrd r14, androidx.recyclerview.widget.RecyclerView r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PQZ.LJI(X.0Qrd, androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    public static C589710NAz LIZJ(String str, EnumC644580PQa enumC644580PQa, String str2, int i, int i2) {
        boolean z;
        boolean z2;
        AbstractC1321260kUG abstractC1321260kUGLJIIZILJ;
        EnumC1331380kka frescoPriority;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Bitmap.Config configLIZ = null;
        if (z) {
            return null;
        }
        if (C2190321Anu.LIZ() >= 2 && i2 >= 0) {
            configLIZ = C1868030yi9.LIZ(i, i2);
        }
        if (((Number) C0BDP.LIZ.getValue()).intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (enumC644580PQa == null) {
                enumC644580PQa = EnumC644580PQa.P0_VISIBLE_MAIN_CONTENT;
            }
            EnumC1331380kka frescoPriority2 = enumC644580PQa.toFrescoPriority();
            AwS122S1000000_10 awS122S1000000_10 = new AwS122S1000000_10(str2, 2);
            Executor executor = C589690NAx.LIZ;
            AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(366);
            AFwS196S0000000_10 aFwS196S0000000_102 = AFwS196S0000000_10.get$arr$(367);
            C589710NAz c589710NAz = new C589710NAz();
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            C658730Psd c658730Psd = new C658730Psd(-1, null, 0, "", true, 0.0f, 0, null, false, 960);
            if (str2.length() > 0) {
                c658730Psd.LLJ = new AwS61S1000000_10(str2, 8);
            }
            c1325700kbQLIZLLL.LJIIZILJ = C1331830klJ.LJIIL(c658730Psd);
            if (frescoPriority2 != null) {
                c1325700kbQLIZLLL.LJIIL = frescoPriority2;
            } else if (C302000Bsc.LIZIZ()) {
                c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
            }
            if (C302000Bsc.LIZ()) {
                c1325700kbQLIZLLL.LJI = EnumC1325560kbC.CUSTOM;
                c1325700kbQLIZLLL.LJIJI = "search_cache";
            }
            if (configLIZ != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(configLIZ);
                c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            }
            C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
            final AwS30S0600000_9 awS30S0600000_9 = new AwS30S0600000_9((Context) null, c1325710kbRLIZ, c589710NAz, aFwS196S0000000_102, aFwS196S0000000_10, awS122S1000000_10, 0);
            C1322200kVm.LIZ().LJIILIIL(c1325710kbRLIZ).LIZJ(new C0HWJ() { // from class: X.0HWL
                @Override // X.C0HWJ
                public final void LJ(InterfaceC1320200kSY<Boolean> interfaceC1320200kSY) {
                    awS30S0600000_9.invoke(Boolean.FALSE);
                }

                @Override // X.C0HWJ
                public final void LJFF(boolean z3) {
                    awS30S0600000_9.invoke(Boolean.valueOf(z3));
                }
            }, C589690NAx.LIZ);
            return c589710NAz;
        }
        C1325700kbQ c1325700kbQLIZLLL2 = C1325700kbQ.LIZLLL(UriProtector.parse(str));
        C658730Psd c658730Psd2 = new C658730Psd(-1, null, 0, "", true, 0.0f, 0, null, false, 960);
        if (str2.length() > 0) {
            c658730Psd2.LLJ = new AwS61S1000000_10(str2, 14);
        }
        c1325700kbQLIZLLL2.LJIIZILJ = C1331830klJ.LJIIL(c658730Psd2);
        if (enumC644580PQa != null && (frescoPriority = enumC644580PQa.toFrescoPriority()) != null) {
            c1325700kbQLIZLLL2.LJIIL = frescoPriority;
        } else if (C302000Bsc.LIZIZ()) {
            c1325700kbQLIZLLL2.LJIIL = EnumC1331380kka.HIGH;
        }
        if (C302000Bsc.LIZ()) {
            c1325700kbQLIZLLL2.LJI = EnumC1325560kbC.CUSTOM;
            c1325700kbQLIZLLL2.LJIJI = "search_cache";
        }
        if (configLIZ != null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder2 = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder2.setBitmapConfig(configLIZ);
            c1325700kbQLIZLLL2.LJFF = new C1329360khK(imageDecodeOptionsBuilder2);
        }
        C1325710kbR c1325710kbRLIZ2 = c1325700kbQLIZLLL2.LIZ();
        C589710NAz c589710NAz2 = new C589710NAz();
        if (((Number) C0BDM.LIZ.getValue()).intValue() == 1) {
            abstractC1321260kUGLJIIZILJ = C1322200kVm.LIZ().LJIJ(c1325710kbRLIZ2, null);
        } else {
            abstractC1321260kUGLJIIZILJ = C1322200kVm.LIZ().LJIIZILJ(c1325710kbRLIZ2, null);
        }
        c589710NAz2.LIZ(abstractC1321260kUGLJIIZILJ);
        return c589710NAz2;
    }

    public static void LJII(C0PQZ c0pqz, List list, EnumC644580PQa enumC644580PQa, String str, Function1 function1, int i) {
        EnumC644580PQa enumC644580PQa2;
        if ((i & 2) != 0) {
            enumC644580PQa = null;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        c0pqz.getClass();
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            boolean zLIZIZ = C644600PQc.LIZIZ();
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str2 = (String) obj;
                    C644640PQg.LIZJ(str2, str);
                    if (zLIZIZ) {
                        if (function1 == null || (enumC644580PQa2 = (EnumC644580PQa) function1.invoke(Integer.valueOf(i2))) == null) {
                            if (enumC644580PQa == null) {
                                enumC644580PQa2 = EnumC644580PQa.P0_VISIBLE_MAIN_CONTENT;
                            } else {
                                enumC644580PQa2 = enumC644580PQa;
                            }
                        }
                        LIZ.getClass();
                        LIZJ(str2, enumC644580PQa2, str, -1, -1);
                    } else {
                        LIZ.getClass();
                        LIZJ(str2, null, "", -1, -1);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
