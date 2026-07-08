package Y;

import X.AbstractC2197911B0j;
import X.AnonymousClass1553;
import X.AnonymousClass1639;
import X.C09JN;
import X.C11RK;
import X.C1361410lX1;
import X.C15UK;
import X.C162U;
import X.C162V;
import X.C163D;
import X.C16CD;
import X.C1C7U;
import X.C201955140j;
import X.C201962140q;
import X.C20345714jH;
import X.C20441214yg;
import X.C204607154j;
import X.C207118162y;
import X.C207160164o;
import X.C207161164p;
import X.C21341918fZ;
import X.C2188811AlT;
import X.C2197981B0q;
import X.C2281251EQx;
import X.C259800zU;
import X.C421580Gg0;
import X.C524780Ki4;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1654750tA9;
import X.EnumC20746516Gh;
import X.InterfaceC1541990qEH;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.browser.emote.CropEmoteFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.log.PdpLogHelper;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostBridge;
import com.ss.android.ugc.aweme.performance.OpenEditMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AfS165S0200000_31 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.browser.emote.CropEmoteFragment] */
    public static final void accept$0(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("EditImageForSubMethod@d1f7.startCropFragment$2");
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C259800zU c259800zU = (C259800zU) afS165S0200000_31.l0;
            EditImageForSubMethod editImageForSubMethod = (EditImageForSubMethod) afS165S0200000_31.l1;
            ?? cropEmoteFragment = new CropEmoteFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "arg_origin_bitmap", bitmap);
            cropEmoteFragment.setArguments(bundle);
            c259800zU.element = cropEmoteFragment;
            editImageForSubMethod.LJIIJJI(cropEmoteFragment, bitmap);
        }
        C1C7U.LIZIZ("EditImageForSubMethod@d1f7.startCropFragment$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.queryForExploreAwemeListByChunk$6");
        Throwable th = (Throwable) obj;
        C15UK.LIZ.getClass();
        C15UK.LIZ(false);
        ExploreAwemeList exploreAwemeList = (ExploreAwemeList) ((C259800zU) afS165S0200000_31.l0).element;
        if (exploreAwemeList != null) {
            exploreAwemeList.LL = false;
        }
        C11RK c11rk = (C11RK) afS165S0200000_31.l1;
        if (th == null) {
            th = new Throwable("chunk error");
        }
        c11rk.onError(th);
        C1C7U.LIZIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.queryForExploreAwemeListByChunk$6");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$10(Y.AfS165S0200000_31 r14, java.lang.Object r15) {
        /*
            java.lang.String r4 = "MusicShootAssem@266f.preloadMusicAndEffect$ignored$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = r14.l0
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r3 = (com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem) r3
            java.lang.Object r2 = r14.l1
            com.ss.android.ugc.aweme.music.model.MusicDetail r2 = (com.ss.android.ugc.aweme.music.model.MusicDetail) r2
            r3.getClass()
            X.01GW r0 = X.C0BNC.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.music.model.Music r0 = r3.Fp()
        L23:
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = r0.convertToMusicModel()
            if (r7 == 0) goto L81
            java.lang.Object r0 = r14.l0
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = (com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem) r0
            boolean r0 = r0.pq()
            r7.setSimilarMusic(r0)
        L36:
            java.lang.Object r0 = r14.l0
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = (com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem) r0
            X.15L9 r5 = r0.LLLII
            if (r5 == 0) goto L76
            java.lang.String r8 = r0.Gp()
            r9 = 1
            r11 = 0
            java.lang.Object r0 = r14.l0
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = (com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem) r0
            int r6 = r0.jq()
            java.lang.Object r0 = r14.l0
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = (com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem) r0
            r0.getClass()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicService> r0 = com.ss.android.ugc.aweme.music.service.IMusicService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.music.service.IMusicService r0 = (com.ss.android.ugc.aweme.music.service.IMusicService) r0
            boolean r14 = r0.LJJIJLIJ()
            boolean r0 = X.C0BWG.LIZ()
            if (r0 != 0) goto L7a
            boolean r0 = X.C298270Bmb.LIZ()
            if (r0 != 0) goto L7a
            r15 = 0
        L70:
            r10 = r9
            r12 = r11
            r13 = r11
            r5.LIZJ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L76:
            X.C1C7U.LIZIZ(r4)
            return
        L7a:
            r15 = 1
            goto L70
        L7c:
            if (r2 == 0) goto L81
            com.ss.android.ugc.aweme.music.model.Music r0 = r2.music
            goto L23
        L81:
            r7 = r1
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS165S0200000_31.accept$10(Y.AfS165S0200000_31, java.lang.Object):void");
    }

    public static final void accept$11(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("TranslationStateMachine@b563.startTranslate$disposable$3");
        ((C207118162y) afS165S0200000_31.l0).getClass();
        ((Throwable) obj).getMessage();
        C207118162y c207118162y = (C207118162y) afS165S0200000_31.l0;
        c207118162y.LJJI = null;
        C162U c162u = (C162U) afS165S0200000_31.l1;
        if (c162u != null) {
            c162u.LIZ(C162V.FAILURE);
        }
        c207118162y.onEvent(C207160164o.LIZIZ);
        C1C7U.LIZIZ("TranslationStateMachine@b563.startTranslate$disposable$3");
    }

    public static final void accept$12(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("LottieGeniusKt@ae90.updateImageForScreenShot$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateImageForScreenShot ");
        sbLIZ.append(((C20345714jH) afS165S0200000_31.l0).LIZIZ);
        sbLIZ.append(" success");
        C20441214yg.LIZIZ("LottieAnimationView", C2188811AlT.LIZIZ(sbLIZ));
        ((ImageView) afS165S0200000_31.l1).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("LottieGeniusKt@ae90.updateImageForScreenShot$1");
    }

    public static final void accept$13(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("MvImageChooseAdapter@89e4.setPageLoadData$disposable$1");
        C21341918fZ c21341918fZ = (C21341918fZ) obj;
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            ((C16CD) afS165S0200000_31.l0).LLLFZ(c21341918fZ, (List) afS165S0200000_31.l1);
        } else {
            C421580Gg0.LIZ(new AwS275S0300000_31((C16CD) afS165S0200000_31.l0, (C16CD) c21341918fZ, (C21341918fZ) afS165S0200000_31.l1, (List<TikTokMediaModel>) 34));
        }
        C1C7U.LIZIZ("MvImageChooseAdapter@89e4.setPageLoadData$disposable$1");
    }

    public static final void accept$14(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("RecommendRepo@8c93.getMusicList$2$2");
        ((AnonymousClass1553) afS165S0200000_31.l0).LJ((C204607154j) obj);
        ((CountDownLatch) afS165S0200000_31.l1).countDown();
        C1C7U.LIZIZ("RecommendRepo@8c93.getMusicList$2$2");
    }

    public static final void accept$15(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("RecommendRepo@8c93.getMusicList$2$3");
        AnonymousClass1553 anonymousClass1553 = (AnonymousClass1553) afS165S0200000_31.l0;
        anonymousClass1553.getClass();
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Get AI Recommend Music Failed. Reason:");
        sbLIZ.append(((Throwable) obj).getMessage());
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        anonymousClass1553.LLILLJJLI.LJI = Boolean.FALSE;
        C524780Ki4.LIZ.end(OpenEditMusicPanelPerformanceMonitor.INSTANCE, "music_data_set");
        C2281251EQx.LIZ.LJII("edit_music", EnumC1654750tA9.TAB_AI.getStringValue(), "", false);
        ((CountDownLatch) afS165S0200000_31.l1).countDown();
        C1C7U.LIZIZ("RecommendRepo@8c93.getMusicList$2$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("ExploreTopicFeedApi@fc3e.queryCustomFeedWithChunk$4");
        Throwable th = (Throwable) obj;
        ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = (ExploreTopicAwemeListResponse) ((C259800zU) afS165S0200000_31.l0).element;
        if (exploreTopicAwemeListResponse != null) {
            exploreTopicAwemeListResponse.LLILLJJLI = false;
        }
        C11RK c11rk = (C11RK) afS165S0200000_31.l1;
        if (th == null) {
            th = new Throwable("chunk error");
        }
        c11rk.onError(th);
        C1C7U.LIZIZ("ExploreTopicFeedApi@fc3e.queryCustomFeedWithChunk$4");
    }

    public static final void accept$3(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("LiveHostBridge@fdde.queryRelationSearchList$1");
        ArrayList arrayList = new ArrayList();
        List<User> list = ((RelationSearchResponse) obj).searchUser;
        if (list != null) {
            LiveHostBridge liveHostBridge = (LiveHostBridge) afS165S0200000_31.l1;
            for (User user : list) {
                liveHostBridge.getClass();
                com.bytedance.android.live.base.model.user.User user2 = new com.bytedance.android.live.base.model.user.User();
                try {
                    user2.setId(CastLongProtector.parseLong(user.getUid()));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                user2.setNickName(user.getNickname());
                user2.setIdStr(user.getUid());
                UrlModel avatarThumb = user.getAvatarThumb();
                ImageModel imageModel = new ImageModel();
                imageModel.mUrls = avatarThumb.getUrlList();
                imageModel.mUri = avatarThumb.getUri();
                imageModel.width = avatarThumb.getWidth();
                imageModel.height = avatarThumb.getHeight();
                user2.setAvatarThumb(imageModel);
                user2.setDisplayId(user.getUserDisplayName());
                arrayList.add(user2);
            }
        }
        ((Function1) afS165S0200000_31.l0).invoke(arrayList);
        C1C7U.LIZIZ("LiveHostBridge@fdde.queryRelationSearchList$1");
    }

    public static final void accept$4(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        EnumC20746516Gh enumC20746516Gh;
        C1C7U.LIZ("PdpLogHelper@204e.startToListenSheetStateChange$1");
        InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) afS165S0200000_31.l0;
        PdpLogHelper pdpLogHelper = (PdpLogHelper) afS165S0200000_31.l1;
        JSONObject jSONObject = new JSONObject();
        int iIntValue = ((Integer) obj).intValue();
        pdpLogHelper.getClass();
        if (iIntValue != 3) {
            if (iIntValue == 4 || iIntValue != 5) {
                enumC20746516Gh = EnumC20746516Gh.COLLAPSED;
            } else {
                enumC20746516Gh = EnumC20746516Gh.HIDDEN;
            }
        } else {
            enumC20746516Gh = EnumC20746516Gh.EXPANDED;
        }
        interfaceC1541990qEH.X0("onPageGlide", Collections.singletonList(jSONObject.put("state", enumC20746516Gh.getValue())));
        C1C7U.LIZIZ("PdpLogHelper@204e.startToListenSheetStateChange$1");
    }

    public static final void accept$5(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("EnigmaPurchaseService@d2d.getProductDetails$3");
        Throwable th = (Throwable) obj;
        ((EnigmaPurchaseService) afS165S0200000_31.l0).getClass();
        if (!(th instanceof AbstractC2197911B0j)) {
            new C2197981B0q(th.getMessage(), th);
        }
        C766270U4b.LIZLLL(2131852185);
        ((Function0) afS165S0200000_31.l1).invoke();
        C1C7U.LIZIZ("EnigmaPurchaseService@d2d.getProductDetails$3");
    }

    public static final void accept$6(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("OverallBizCompTranslationStateMachine@9b36.startTranslate$disposable$2");
        if (((Boolean) obj).booleanValue()) {
            ((C162U) afS165S0200000_31.l0).LIZ(C162V.SUCCESS);
            ((C163D) afS165S0200000_31.l1).onEvent(C207161164p.LIZIZ);
        } else {
            ((C163D) afS165S0200000_31.l1).LJJII((C162U) afS165S0200000_31.l0);
        }
        C1C7U.LIZIZ("OverallBizCompTranslationStateMachine@9b36.startTranslate$disposable$2");
    }

    public static final void accept$7(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("OverallBizCompTranslationStateMachine@9b36.startTranslate$disposable$3");
        ((C163D) afS165S0200000_31.l0).getClass();
        ((Throwable) obj).getMessage();
        ((C163D) afS165S0200000_31.l0).LJJII((C162U) afS165S0200000_31.l1);
        C1C7U.LIZIZ("OverallBizCompTranslationStateMachine@9b36.startTranslate$disposable$3");
    }

    public static final void accept$8(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("OverallCommentTranslationStateMachine@2e12.startTranslate$disposable$2");
        if (((Boolean) obj).booleanValue()) {
            ((C162U) afS165S0200000_31.l0).LIZ(C162V.SUCCESS);
            ((AnonymousClass1639) afS165S0200000_31.l1).onEvent(C207161164p.LIZIZ);
        } else {
            ((C162U) afS165S0200000_31.l0).LIZ(C162V.FAILURE);
            ((AnonymousClass1639) afS165S0200000_31.l1).onEvent(C207160164o.LIZIZ);
        }
        C1C7U.LIZIZ("OverallCommentTranslationStateMachine@2e12.startTranslate$disposable$2");
    }

    public static final void accept$9(AfS165S0200000_31 afS165S0200000_31, Object obj) {
        C1C7U.LIZ("OverallCommentTranslationStateMachine@2e12.startTranslate$disposable$3");
        ((AnonymousClass1639) afS165S0200000_31.l0).getClass();
        ((Throwable) obj).getMessage();
        C162U c162u = (C162U) afS165S0200000_31.l1;
        C162V c162v = C162V.FAILURE;
        c162u.LIZ(c162v);
        ((AnonymousClass1639) afS165S0200000_31.l0).onEvent(C207160164o.LIZIZ);
        C1361410lX1 c1361410lX1 = C1361410lX1.LJ;
        AnonymousClass1639 anonymousClass1639 = (AnonymousClass1639) afS165S0200000_31.l0;
        Comment comment = anonymousClass1639.LIZLLL;
        String str = anonymousClass1639.LJ;
        if (str == null) {
            str = "";
        }
        int value = c162v.getValue();
        c1361410lX1.getClass();
        C1361410lX1.LJIJJ(value, comment, str, false);
        C1C7U.LIZIZ("OverallCommentTranslationStateMachine@2e12.startTranslate$disposable$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS165S0200000_31(X.C162U r2, X.AnonymousClass1639 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 8 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS165S0200000_31.<init>(X.162U, X.1639, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS165S0200000_31(X.C162U r2, X.C163D r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 6 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS165S0200000_31.<init>(X.162U, X.163D, int):void");
    }

    public AfS165S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public AfS165S0200000_31(EnigmaPurchaseService enigmaPurchaseService, String str, String str2, AFwS221S0000000_31 aFwS221S0000000_31, int i) {
        this.$t = i;
        this.l0 = enigmaPurchaseService;
        this.l1 = aFwS221S0000000_31;
    }
}
