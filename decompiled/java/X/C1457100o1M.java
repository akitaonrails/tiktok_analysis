package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457100o1M {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C1457100o1M LIZ = new C1457100o1M();
    public static final Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public static final C1457160o1S LJ = C1457160o1S.LIZ;

    public static boolean LIZ(C1457050o1H c1457050o1H) {
        Thread threadU3 = C786410Ut5.u3();
        C1DFH c1dfh = C0PEM.LIZ;
        if (Intrinsics.LJFF(threadU3, C2107308Nj.LIZ) || c1457050o1H.LIZ.isMvThemeVideoType()) {
            return false;
        }
        if (!LIZJ) {
            C476250Ilz.LIZ.LIZIZ(C1BWL.LIZ());
            C2188561Al4.LJII(LJ);
            LIZJ = true;
        }
        if (C2188561Al4.LJIIJ(C1BWL.LIZ())) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = c1457050o1H.LIZ;
        if (!videoPublishEditModel.isDuet() && !videoPublishEditModel.isStitchMode() && !C1428520nHG.LJJLIIIJL(videoPublishEditModel)) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("enable_i2v_support_multi_input", true) || C1428470nHB.LJJZZI(videoPublishEditModel) || C1428470nHB.LLIIIJ(videoPublishEditModel) || c1457050o1H.LJIJJLI) {
                return false;
            }
            Boolean bool = (Boolean) ((LinkedHashMap) LIZLLL).get(videoPublishEditModel.getCreationId());
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            if (((!C1428520nHG.LJJJZ(videoPublishEditModel) && !C1428520nHG.LJJLIIIJ(videoPublishEditModel)) || C1428520nHG.LJJJLZIJ(videoPublishEditModel)) && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !videoPublishEditModel.isFromCrash() && !C1428470nHB.LJJJJLL(videoPublishEditModel) && !C1428470nHB.LJZ(videoPublishEditModel) && !C2367709Pn.LJIIIIZZ(C1BWL.LIZ()) && !LIZIZ) {
                boolean zLIZJ = ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LIZJ();
                C540390LHh.LIZIZ(c1457050o1H.LIZ, zLIZJ);
                if (zLIZJ) {
                    return false;
                }
                return new C2292908yd().LJFF();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:34:0x00f2, B:40:0x0117], limit reached: 50 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:31:0x00cc, B:32:0x00cf, B:34:0x00f2, B:36:0x00fc, B:38:0x010c, B:39:0x0112, B:22:0x009d, B:24:0x00a3, B:26:0x00ad, B:28:0x00b3, B:43:0x011f, B:40:0x0117, B:20:0x0096, B:21:0x0099, B:17:0x0081), top: B:48:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:31:0x00cc, B:32:0x00cf, B:34:0x00f2, B:36:0x00fc, B:38:0x010c, B:39:0x0112, B:22:0x009d, B:24:0x00a3, B:26:0x00ad, B:28:0x00b3, B:43:0x011f, B:40:0x0117, B:20:0x0096, B:21:0x0099, B:17:0x0081), top: B:48:0x0024 }] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ab -> B:41:0x011c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:41:0x011c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c9 -> B:32:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<X.C1457150o1R> r18, X.C2292908yd r19, X.InterfaceC1364105Vn<? super X.C1457140o1Q> r20) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457100o1M.LIZIZ(java.util.List, X.08yd, X.05Vn):java.lang.Object");
    }

    public static void LIZJ(int i, Bitmap bitmap, String str, C1457050o1H c1457050o1H, InterfaceC1457170o1T interfaceC1457170o1T) {
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        CoverNewItem coverNewItem;
        if (bitmap != null) {
            float f = i / 1000.0f;
            c1457050o1H.LIZ.setVideoCoverStartTm(f);
            LIZLLL.put(c1457050o1H.LIZ.getCreationId(), Boolean.TRUE);
            if (interfaceC1457170o1T != null) {
                interfaceC1457170o1T.LIZ(bitmap, str);
            }
            CopyOnWriteArrayList<CoverNewItem> newCoverList2 = null;
            try {
                CoverPublishModel coverPublishModel = c1457050o1H.LIZ.getCoverPublishModel();
                if (coverPublishModel != null && (newCoverList = coverPublishModel.getNewCoverList()) != null && (coverNewItem = (CoverNewItem) C13LP.LJJLIIIJL(newCoverList)) != null) {
                    coverNewItem.setVideoCoverStartTm(Float.valueOf(f));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SmartCoverExtractor");
                sbLIZ.append(": ArrayIndexOutOfBoundsException, list: ");
                CoverPublishModel coverPublishModel2 = c1457050o1H.LIZ.getCoverPublishModel();
                if (coverPublishModel2 != null) {
                    newCoverList2 = coverPublishModel2.getNewCoverList();
                }
                sbLIZ.append(newCoverList2);
                C1AF0.LJ(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
            }
        } else {
            C01TT.LIZLLL(new AwS566S0100000_22(c1457050o1H, 4));
        }
        C01TT.LIZLLL(new AwS566S0100000_22(c1457050o1H, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0ntP] */
    public static boolean LIZLLL(C1457050o1H c1457050o1H, String str, Context context, LifecycleOwner lifecycleOwner, C1457080o1K c1457080o1K) throws Throwable {
        T tLJ;
        C259800zU c259800zU = new C259800zU();
        ?? r0 = c1457050o1H.LJIIIIZZ;
        c259800zU.element = r0;
        if (r0 == 0) {
            AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(lifecycleOwner, c1457050o1H, 9);
            if (!C01TT.LIZ()) {
                tLJ = C23250099c.LJ(C23271099x.INSTANCE, new C01XI(awS409S0200000_8, null));
            } else {
                tLJ = awS409S0200000_8.invoke();
            }
            c259800zU.element = tLJ;
        }
        if (c259800zU.element == 0) {
            return false;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1219810hqd(c259800zU, c1457050o1H, str, context, lifecycleOwner, c1457080o1K, null), 2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1452170ntP r20, X.C1457050o1H r21, java.lang.String r22, android.content.Context r23, androidx.lifecycle.LifecycleOwner r24, X.InterfaceC1457170o1T r25, X.InterfaceC1364105Vn<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457100o1M.LJ(X.0ntP, X.0o1H, java.lang.String, android.content.Context, androidx.lifecycle.LifecycleOwner, X.0o1T, X.05Vn):java.lang.Object");
    }
}
