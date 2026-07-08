package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.story.a;
import com.ss.android.ugc.gamora.recorder.bottom.o0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446350nk1 {
    public static final C1446350nk1 LIZ = new C1446350nk1();

    public static boolean LIZIZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.mIsFromDraft) {
            return d4.LJIILIIL(shortVideoContext);
        }
        if ((C293940Bfc.LIZ() || C289940BYa.LIZ() > 0.0f) && shortVideoContext.isRestoreFromSaveInstance) {
            int i = shortVideoContext.shootMode;
            if (i == 20 || i == 23 || i == 29) {
                return true;
            }
            return false;
        }
        if (a.LIZ()) {
            o0 o0Var = o0.LIZ;
            String str = shortVideoContext.shootWay;
            o0Var.getClass();
            if (C13LP.LJJJJ(str, o0.LIZJ)) {
                return true;
            }
        }
        if (a.LIZ()) {
            x4l.a.LIZ.getClass();
            if (x4l.a.LIZ() == 5) {
                o0 o0Var2 = o0.LIZ;
                String str2 = shortVideoContext.shootWay;
                o0Var2.getClass();
                if (Intrinsics.LJFF(str2, "direct_shoot") && !C13LP.LJJJJ(str2, o0.LIZJ) && C1446360nk2.LIZ != null) {
                    Keva keva = C1446360nk2.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("story_separate_lightening_tab_when_leave_");
                    sbLIZ.append(str2);
                    Integer numValueOf = Integer.valueOf(keva.getInt(C2188811AlT.LIZIZ(sbLIZ), -1));
                    if (numValueOf != null && numValueOf.intValue() == 2) {
                        return true;
                    }
                }
            }
        }
        if (a.LIZ() && Intrinsics.LJFF(shortVideoContext.creativeModel.landingModel.landingTab, "story")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7) {
        /*
            boolean r0 = LIZLLL(r7)
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            boolean r0 = r7.mIsFromDraft
            r5 = 1
            if (r0 != 0) goto L27
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r7.cameraComponentModel
            int r1 = r0.mRestoreType
            r0 = 2
            if (r1 != r0) goto L2a
            com.ss.android.ugc.aweme.shortvideo.model.RecordScene r0 = X.C1439190nYT.LIZIZ()
            int r1 = r0.shootMode
        L1a:
            r0 = 10
            if (r1 == r0) goto L26
            r0 = 11
            if (r1 == r0) goto L26
            r0 = 14
            if (r1 != r0) goto L2a
        L26:
            return r5
        L27:
            int r1 = r7.shootMode
            goto L1a
        L2a:
            java.lang.String r1 = r7.shootWay
            java.lang.String r0 = "direct_shoot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L43
            boolean r0 = r7.mIsFromDraft
            if (r0 != 0) goto L43
            long r3 = r7.LJII()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L43
            return r5
        L43:
            X.0Mo5 r0 = X.C579470Mo5.LIZ
            r0.getClass()
            boolean r0 = X.C579470Mo5.LIZJ(r7)
            if (r0 == 0) goto L4f
            return r5
        L4f:
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.d4.LJIILIIL(r7)
            if (r0 == 0) goto L56
            return r6
        L56:
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_COMBINE_15
            java.lang.String r0 = r0.getTag()
            boolean r0 = LIZ(r7, r0)
            if (r0 != 0) goto L92
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_COMBINE_60
            java.lang.String r0 = r0.getTag()
            boolean r0 = LIZ(r7, r0)
            if (r0 != 0) goto L92
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_COMBINE_180
            java.lang.String r0 = r0.getTag()
            boolean r0 = LIZ(r7, r0)
            if (r0 != 0) goto L92
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_COMBINE_600
            java.lang.String r0 = r0.getTag()
            boolean r0 = LIZ(r7, r0)
            if (r0 != 0) goto L92
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_NOW
            java.lang.String r0 = r0.getTag()
            boolean r0 = LIZ(r7, r0)
            if (r0 == 0) goto L93
        L92:
            r6 = 1
        L93:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1446350nk1.LIZJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):boolean");
    }

    public static boolean LIZLLL(ShortVideoContext shortVideoContext) {
        if (!LJIIIZ(shortVideoContext) || !shortVideoContext.mToLive) {
            if (!LJIIJ(shortVideoContext) || !LJIIJJI(shortVideoContext)) {
                if (((Boolean) C272110AlV.LIZ.getValue()).booleanValue() || !LIZIZ(shortVideoContext)) {
                    if ((shortVideoContext.mIsFromDraft || !LJIIIIZZ(shortVideoContext)) && !LJ(shortVideoContext)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r2.isEditorProToRecordRetake == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1446350nk1.LJ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):boolean");
    }

    public static boolean LJFF(ShortVideoContext shortVideoContext) {
        if (LJI(shortVideoContext) || ((shortVideoContext.mIsFromDraft && shortVideoContext.shootMode == 15 && !shortVideoContext.isPhotoMvMode) || d4.LJIILIIL(shortVideoContext))) {
            return true;
        }
        return false;
    }

    public static boolean LJI(ShortVideoContext shortVideoContext) {
        int i;
        if (shortVideoContext.mIsFromDraft && shortVideoContext.isPhotoMvMode && (i = shortVideoContext.shootMode) != 10 && i != 16 && i != 20 && i != 23 && i != 29) {
            return true;
        }
        return false;
    }

    public static boolean LJII(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.mIsFromDraft) {
            if ((shortVideoContext.isPhotoMvMode && shortVideoContext.shootMode == 10) || shortVideoContext.shootMode == 16) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIIZZ(ShortVideoContext shortVideoContext) {
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "story") && ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() && a.LIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.LJJJJLL() || LJFF(shortVideoContext) || LJIIIIZZ(shortVideoContext) || LJII(shortVideoContext)) {
            return false;
        }
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).e6()) {
            if (shortVideoContext.LJJLL()) {
                return false;
            }
            String str = shortVideoContext.shootWay;
            if (str == null) {
                return true;
            }
            return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).x5(str);
        }
        String str2 = shortVideoContext.shootWay;
        if (str2 == null) {
            return true;
        }
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).h6(str2);
    }

    public static boolean LJIIJ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.LJJJJLL()) {
            return false;
        }
        int i = shortVideoContext.tabs;
        if ((i != 0 && (i & 4) != 4) || !C0CHQ.LIZ().LJIIIIZZ().LJIIIZ() || ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL()) {
            return false;
        }
        return !shortVideoContext.LJJLL();
    }

    public static boolean LJIIJJI(ShortVideoContext shortVideoContext) {
        if ((!C0CHQ.LIZ().LJIIIIZZ().LJI(shortVideoContext) || shortVideoContext.enterMvThemeEffect == null) && !C703302op.LIZ(shortVideoContext.enterCutsameId) && !Intrinsics.LJFF(shortVideoContext.creativeModel.landingModel.landingTab, "mv")) {
            return false;
        }
        return true;
    }

    public static boolean LJIIL(ShortVideoContext shortVideoContext) {
        if (!TextUtils.equals(shortVideoContext.shootWay, "mv_page") && !LJ(shortVideoContext)) {
            if (LJIIJ(shortVideoContext) && LJIIJJI(shortVideoContext)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean LIZ(ShortVideoContext shortVideoContext, String str) {
        if (LIZLLL(shortVideoContext)) {
            return false;
        }
        return Intrinsics.LJFF(str, C0CHQ.LIZ().LJJJJJ().getDefaultShootTabTag(shortVideoContext));
    }
}
