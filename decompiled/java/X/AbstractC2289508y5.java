package X;

import Y.AfS172S0100000_3;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.external.IAVPublishExtractFrameService;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08y5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2289508y5 {
    public static final ConcurrentHashMap<String, C11PQ<String>> LJIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LJJ = new ConcurrentHashMap<>();
    public final AbstractC1921407fo LIZ;
    public long LIZJ;
    public int LJ;
    public int LJFF;
    public final String LJI;
    public final C11NJ LJII;
    public long LJIIIIZZ;
    public C2288408xu LJIIIZ;
    public final C2290108yB LJIIJ;
    public final C2289908y9 LJIIJJI;
    public AnonymousClass0956 LJIIL;
    public C2289808y8 LJIILIIL;
    public C2290408yE LJIILJJIL;
    public boolean LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final C11PQ<String> LJIJI;
    public final C11PQ<String> LJIJJ;
    public final C01GW LJIJJLI;
    public final int LIZIZ = ((Number) C2276808w2.LIZ.getValue()).intValue();
    public C2291608yQ LIZLLL = new C2291608yQ(-1, -1);

    public abstract Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn);

    public abstract String LJFF();

    public abstract String LJI();

    public abstract String LJII();

    public int LJIIIZ() {
        return 5;
    }

    public abstract String LJIIJJI();

    public abstract String LJIL();

    public void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIL = null;
        this.LJII.dispose();
        C2286708xd.LJIILLIIL(new C0VSJ(LJ()));
    }

    public final String LJ() {
        return (String) this.LJIILLIIL.getValue();
    }

    public final String LJIIIIZZ() {
        return this.LJIJI.LJLZ();
    }

    public final String LJIIL() {
        String strLIZ;
        if ((!(this instanceof C2275808vs)) && (strLIZ = C2288908xz.LIZ(this.LJIILJJIL)) != null) {
            return strLIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ame-extract-frames");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".zip");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJ());
        sbLIZ2.append(File.separator);
        sbLIZ2.append(strLIZIZ);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
        File parentFile = c0vsj.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        String absolutePath = c0vsj.getAbsolutePath();
        return absolutePath == null ? "" : absolutePath;
    }

    public final C19475711Hn LJIILJJIL() {
        C11PQ<String> c11pq = this.LJIJI;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    public final void LJIJ() {
        this.LJIIJJI.LIZ();
        this.LJIIJJI.LJFF = 3;
        this.LJIIJJI.LJJI = System.currentTimeMillis();
        LJIJJLI();
    }

    public void LJIJJLI() {
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            LIZJ("", "uploadFrameEnable is false");
            return;
        }
        IAVPublishExtractFrameService iAVPublishExtractFrameService = (IAVPublishExtractFrameService) PluggableExtentionKt.pluggableSpi$default(IAVPublishExtractFrameService.class, false, false, false, 14, null);
        if (iAVPublishExtractFrameService != null) {
            iAVPublishExtractFrameService.startExtractFrame(LJII(), LJI());
        }
        String strLJLZ = this.LJIJI.LJLZ();
        if (strLJLZ != null && strLJLZ.length() > 0) {
            LIZJ(strLJLZ, "");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start extract frame type:");
        sbLIZ.append(this.LJIIIZ.LJ);
        C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIL = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2289408y4(this, null), 2);
    }

    public long LJJ() {
        return C0C64.LJIILLIIL().LJIJJLI(31744, Mp4ScreenVideoLoadTimeout.CONTROL, "ai_music_upload_frame_timeout", true);
    }

    public AbstractC2289508y5(AbstractC1921407fo abstractC1921407fo) {
        String str;
        this.LIZ = abstractC1921407fo;
        if (C2291808yS.LIZ()) {
            str = "AIMusicConfigOptHelper";
        } else {
            str = "AIMusicConfigHelper";
        }
        this.LJI = str;
        C11NJ c11nj = new C11NJ();
        this.LJII = c11nj;
        this.LJIIIZ = new C2288408xu();
        this.LJIIJ = new C2290108yB();
        this.LJIIJJI = new C2289908y9();
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 164));
        this.LJIIZILJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1613));
        this.LJIJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1611));
        this.LJIJI = new C11PQ<>();
        this.LJIJJ = new C11PQ<>();
        this.LJIJJLI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1612));
        c11nj.LIZ(LJIILJJIL().LJJLL(new AfS172S0100000_3(this, 89), C19487811Me.LIZLLL));
    }

    public static long LJIIJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        long j = -1;
        if (z) {
            return -1L;
        }
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists()) {
                long length = c0vsj.length();
                if (length > 0) {
                    j = length / ((long) 1024);
                    return j;
                }
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return j;
    }

    public static C0VSJ LIZLLL(int i, String str) {
        String str2;
        if (C2276008vu.LIZ()) {
            str2 = ".webp";
        } else {
            str2 = ".jpg";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(File.separator);
        sbLIZ.append(i);
        sbLIZ.append(str2);
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(String str, String str2) {
        int i;
        String strName;
        EnumC325100Com networkStatus;
        String str3;
        C2289908y9 c2289908y9 = this.LJIIJJI;
        if (str.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c2289908y9.LJIILLIIL = Integer.valueOf(i);
        if (C123100dR.LIZ(str2) && ((str3 = this.LJIIJJI.LJIIIIZZ) == null || str3.length() == 0)) {
            C2289908y9 c2289908y92 = this.LJIIJJI;
            if (c2289908y92.LJIIIIZZ == null) {
                c2289908y92.LJIIIIZZ = str2;
            }
            if (c2289908y92.LJII == null) {
                c2289908y92.LJII = -1;
            }
            C2289908y9 c2289908y93 = this.LJIIJJI;
            String strValueOf = String.valueOf(LJIL());
            if (c2289908y93.LJIIIZ == null) {
                c2289908y93.LJIIIZ = strValueOf;
            }
        }
        this.LJIIJJI.LJIJ = System.currentTimeMillis() - this.LJIIJJI.LJJI;
        C2288408xu c2288408xu = this.LJIIIZ;
        if (c2288408xu != null) {
            C1458370o3P.LIZ.getClass();
            String str4 = C1458370o3P.LJI;
            if (str4 != null && str4.length() > 0) {
                this.LJIIJJI.LIZJ = C1458370o3P.LJI;
            }
            if (this.LJFF == EnumC2274808vi.PANEL_PIC.ordinal()) {
                this.LJIIJJI.LJIILJJIL = "panel";
            } else if (c2288408xu.LIZLLL > 0) {
                this.LJIIJJI.LJIILJJIL = "capsule_pre";
            } else {
                this.LJIIJJI.LJIILJJIL = "capsule_normal";
            }
            EnumC2290308yD enumC2290308yD = EnumC2290308yD.SINGLE_SELECT_PHOTO;
            enumC2290308yD.ordinal();
            int i2 = C1458370o3P.LJIIIIZZ.get();
            if (c2288408xu.LIZLLL == enumC2290308yD.ordinal()) {
                this.LJIIJJI.LJI = 1;
            }
            if (c2288408xu.LIZLLL == EnumC2290308yD.MULTI_SELECT_PHOTO.ordinal() && i2 > 0) {
                this.LJIIJJI.LJI = Integer.valueOf(i2);
            }
        }
        String strLJI = LJI();
        String strLJFF = LJFF();
        String strLJII = LJII();
        this.LJIIJJI.LJIILL = Integer.valueOf(LJIIIZ());
        C2289908y9 c2289908y94 = this.LJIIJJI;
        c2289908y94.LIZIZ = strLJI;
        c2289908y94.LIZ = strLJFF;
        String str5 = "";
        if (Intrinsics.LJFF(strLJI, "") || Intrinsics.LJFF(strLJI, "multi_photo")) {
            this.LJIIJJI.LIZIZ = this.LJIIIZ.LIZIZ;
        }
        if (Intrinsics.LJFF(strLJFF, "")) {
            this.LJIIJJI.LIZ = this.LJIIIZ.LIZJ;
        }
        this.LJIIJJI.LJIILIIL = Integer.valueOf(this.LJIIIZ.LIZ);
        this.LJIIJJI.LJ = (String) this.LJIIZILJ.getValue();
        this.LJIIJJI.LIZLLL = (String) this.LJIJ.getValue();
        C2289908y9 c2289908y95 = this.LJIIJJI;
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null && (networkStatus = iNetworkStateService.getNetworkStatus()) != null) {
            strName = networkStatus.name();
        } else {
            strName = null;
        }
        c2289908y95.LJJIFFI = strName;
        if (strLJII == null || strLJII.length() == 0) {
            C1458370o3P.LIZ.getClass();
            String str6 = C1458370o3P.LJI;
            if (str6 != null && str6.length() != 0) {
                strLJII = str6;
            }
        }
        if (this.LJ == EnumC2290308yD.MULTI_SELECT_PHOTO.ordinal()) {
            C1458370o3P.LIZ.getClass();
            strLJII = C1458370o3P.LJI;
        }
        C2289908y9 c2289908y96 = this.LJIIJJI;
        c2289908y96.LIZJ = strLJII;
        new Object() { // from class: X.08yR
        }.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_source", c2289908y96.LIZ);
        c0lab.LJ("content_type", c2289908y96.LIZIZ);
        c0lab.LJ("creation_id", c2289908y96.LIZJ);
        c0lab.LJ("enter_from", c2289908y96.LIZLLL);
        c0lab.LJ("shoot_way", c2289908y96.LJ);
        c0lab.LIZLLL(c2289908y96.LJFF, "biz_type");
        c0lab.LIZLLL(c2289908y96.LJI, "emb_times");
        c0lab.LIZLLL(c2289908y96.LJII, "error_code");
        c0lab.LJ("error_domain", c2289908y96.LJIIIIZZ);
        c0lab.LJ("extra_msg", c2289908y96.LJIIIZ);
        c0lab.LIZIZ(c2289908y96.LJIIJ, "extraction_time");
        c0lab.LJ("from", null);
        c0lab.LIZLLL(c2289908y96.LJIIJJI, "have_authkey");
        c0lab.LIZLLL(c2289908y96.LJIIL, "have_preupload");
        c0lab.LIZLLL(c2289908y96.LJIILIIL, "is_story");
        c0lab.LJ("launch_emb_reason", c2289908y96.LJIILJJIL);
        c0lab.LIZLLL(c2289908y96.LJIILL, "photo_to_video_assets_count");
        c0lab.LIZLLL(c2289908y96.LJIILLIIL, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(c2289908y96.LJIIZILJ, "total_size");
        c0lab.LIZIZ(c2289908y96.LJIJ, "total_time");
        c0lab.LIZIZ(c2289908y96.LJIJI, "upload_config_time");
        c0lab.LIZIZ(c2289908y96.LJIJJ, "upload_time");
        c0lab.LIZLLL(c2289908y96.LJIJJLI, "video_length");
        c0lab.LIZIZ(c2289908y96.LJIL, "zip_time");
        c0lab.LJ("zip_uri", c2289908y96.LJJ);
        String str7 = c2289908y96.LJJIFFI;
        if (str7 != null) {
            str5 = str7;
        }
        c0lab.LJ("network_state", str5);
        C20684815ws.LJIILLIIL("monitor_ies_ai_recommend_video_frames_upload_monitor", c0lab.LIZ);
        this.LJIIJJI.LIZ();
        if (str.length() == 0 && str2.length() > 0) {
            C2290108yB c2290108yB = this.LJIIJ;
            c2290108yB.LJFF = false;
            c2290108yB.LJIIIIZZ = System.currentTimeMillis() - this.LIZJ;
            this.LJIJJ.onNext(str2);
        }
        IAVPublishExtractFrameService iAVPublishExtractFrameService = (IAVPublishExtractFrameService) ServiceManager.get().getService(IAVPublishExtractFrameService.class);
        if (iAVPublishExtractFrameService != null) {
            iAVPublishExtractFrameService.extractFrameFinish(str, Long.valueOf(System.currentTimeMillis() - this.LIZJ), LJII(), LJI());
        }
        C1457440o1u.LIZ.getClass();
        C1457440o1u.LIZIZ = str;
        this.LJIIJ.LJ = str;
        if (!C2292008yU.LIZ()) {
            C1458390o3R c1458390o3R = C1458390o3R.LIZ;
            C2290108yB c2290108yB2 = this.LJIIJ;
            c1458390o3R.getClass();
            C1458390o3R.LJFF = c2290108yB2;
        }
        this.LJIJI.onNext(str);
    }

    public final void LJIILIIL(long j, long j2) {
        C2289908y9 c2289908y9 = this.LJIIJJI;
        c2289908y9.LJIIJ = j;
        c2289908y9.LJIJJLI = Long.valueOf(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029 A[PHI: r5
      0x0029: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:12:0x0058, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIZILJ(java.lang.String r9, java.util.List<java.lang.String> r10) {
        /*
            r8 = this;
            long r6 = java.lang.System.currentTimeMillis()
            boolean r0 = r8 instanceof X.C2275808vs
            r0 = r0 ^ 1
            if (r0 == 0) goto L54
            X.08yE r0 = r8.LJIILJJIL
            java.lang.String r5 = X.C2288908xz.LIZ(r0)
            if (r5 == 0) goto L54
            X.0VSJ r2 = new X.0VSJ
            r2.<init>(r5)
            java.io.File r0 = r2.getParentFile()
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = r2.getName()
            java.lang.String r0 = X.C08SA.LJFF(r1, r0, r10)
            if (r0 != 0) goto L3e
        L29:
            X.08yB r1 = r8.LJIIJ
            X.0o3l r0 = X.EnumC1458590o3l.ZIP
            java.lang.String r0 = r0.getValue()
            r0.toString()
            r1.LJIIIZ = r0
            java.lang.String r2 = ""
            r1 = -2
            java.lang.String r0 = "packageFrames failed"
            r8.LJIILL(r1, r0, r2)
        L3e:
            long r3 = LJIIJ(r5)
            X.08y9 r2 = r8.LJIIJJI
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r6
            r2.LJIL = r0
            X.08y9 r1 = r8.LJIIJJI
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.LJIIZILJ = r0
            return r5
        L54:
            java.lang.String r5 = X.C08SA.LIZ(r9, r10)
            if (r5 != 0) goto L3e
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2289508y5.LJIIZILJ(java.lang.String, java.util.List):java.lang.String");
    }

    public final void LJIILL(int i, String str, String str2) {
        if (i != 0) {
            C2289908y9 c2289908y9 = this.LJIIJJI;
            Integer numValueOf = Integer.valueOf(i);
            if (c2289908y9.LJII == null) {
                c2289908y9.LJII = numValueOf;
            }
            C2289908y9 c2289908y92 = this.LJIIJJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJIL());
            sbLIZ.append('_');
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (c2289908y92.LJIIIZ == null) {
                c2289908y92.LJIIIZ = strLIZIZ;
            }
        }
        if (str.length() > 0) {
            C2289908y9 c2289908y93 = this.LJIIJJI;
            if (c2289908y93.LJIIIIZZ == null) {
                c2289908y93.LJIIIIZZ = str;
            }
        }
    }

    public final C0VSJ LJIJI(Bitmap bitmap, int i, String str) {
        C2268608ui c2268608ui;
        C0VSJ c0vsjLIZLLL = LIZLLL(i, LJ());
        if (C476901tP.LIZJ(bitmap, LJ(), c0vsjLIZLLL.getName(), C2276008vu.LIZ()) && C123100dR.LIZ(str) && (c2268608ui = (C2268608ui) this.LJIJJLI.getValue()) != null) {
            c2268608ui.LIZJ(str, Collections.singletonList(new Pair(bitmap, c0vsjLIZLLL.getName())));
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        return c0vsjLIZLLL;
    }

    public final C0VSJ LJIJJ(Bitmap bitmap, int i, String str) {
        String str2;
        C2268608ui c2268608ui;
        if (C2276008vu.LIZ()) {
            str2 = ".webp";
        } else {
            str2 = ".jpg";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ());
        sbLIZ.append(File.separator);
        sbLIZ.append(i);
        sbLIZ.append(str2);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (C476901tP.LIZJ(bitmap, LJ(), c0vsj.getName(), C2276008vu.LIZ())) {
            if (C123100dR.LIZ(str) && (c2268608ui = (C2268608ui) this.LJIJJLI.getValue()) != null) {
                c2268608ui.LIZJ(str, Collections.singletonList(new Pair(bitmap, c0vsj.getName())));
            }
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            return c0vsj;
        }
        return null;
    }
}
