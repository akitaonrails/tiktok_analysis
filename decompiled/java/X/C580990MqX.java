package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.topic.book.detail.BookDetailPage;
import com.ss.android.ugc.aweme.topic.movie.detail.MovieDetailPage;
import com.tts.oecverify.BdTuring;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0MqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580990MqX implements IExternalService.ServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 5:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 6:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 7:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 8:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 14:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 15:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 5:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 6:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 7:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 8:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 14:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 15:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            case 2:
                onLoad$2(this, asyncAVService, j);
                break;
            case 3:
                onLoad$3(this, asyncAVService, j);
                break;
            case 4:
                onLoad$4(this, asyncAVService, j);
                break;
            case 5:
                onLoad$5(this, asyncAVService, j);
                break;
            case 6:
                onLoad$6(this, asyncAVService, j);
                break;
            case 7:
                onLoad$7(this, asyncAVService, j);
                break;
            case 8:
                onLoad$8(this, asyncAVService, j);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLoad$9(this, asyncAVService, j);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onLoad$10(this, asyncAVService, j);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onLoad$11(this, asyncAVService, j);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onLoad$12(this, asyncAVService, j);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onLoad$13(this, asyncAVService, j);
                break;
            case 14:
                onLoad$14(this, asyncAVService, j);
                break;
            case 15:
                onLoad$15(this, asyncAVService, j);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 5:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 6:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 7:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 8:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 14:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 15:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
        }
    }

    public C580990MqX(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLoad$0(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        try {
            asyncAVService.uiService().startCreationFromDeepLink((Activity) c580990MqX.l1, (CreationConfigModelCompat) C7740030o.LIZ().getGson().LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) c580990MqX.l0, "json"), CreationConfigModelCompat.class));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x013d A[Catch: Exception -> 0x015f, PHI: r7
      0x013d: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v1 java.lang.String), (r7v3 java.lang.String) binds: [B:31:0x011a, B:33:0x012a, B:35:0x013b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x015f, blocks: (B:2:0x0000, B:4:0x006a, B:6:0x006e, B:7:0x0085, B:9:0x0089, B:10:0x0094, B:12:0x009c, B:13:0x00a7, B:15:0x00ab, B:16:0x00d0, B:18:0x00d4, B:19:0x00d7, B:21:0x00db, B:22:0x00e6, B:24:0x0101, B:25:0x0106, B:27:0x010a, B:28:0x010f, B:30:0x0116, B:32:0x011c, B:34:0x012c, B:36:0x013d, B:37:0x0142, B:38:0x0150), top: B:43:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onLoad$1(X.C580990MqX r30, com.ss.android.ugc.aweme.services.AsyncAVService r31, long r32) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580990MqX.onLoad$1(X.0MqX, com.ss.android.ugc.aweme.services.AsyncAVService, long):void");
    }

    public static final void onLoad$10(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        Context context = ((View) c580990MqX.l0).getContext();
        ExteriorRecordModel exteriorRecordModel = new ExteriorRecordModel(C0LGC.AIGC, C1697810uHb.LJIIJJI(C0MJU.REVERSE, C0MJU.FLASH, C0MJU.M_BEAUTY, C0MJU.FILTER), C0LGK.PHOTO, 0L, 0L, 0, 0, Float.valueOf(0.0f), Float.valueOf(0.0f), new ArrayList(), true, null);
        final AIGCPictureHandler aIGCPictureHandler = ((C0MJV) c580990MqX.l1).handler;
        iRecordServiceRecordService.startExteriorVideoRecordScene(context, exteriorRecordModel, new AbstractBinderC539700LEq(aIGCPictureHandler) { // from class: X.0LLJ
            public final AIGCPictureHandler LLILLJJLI;

            @Override // X.AbstractBinderC539700LEq
            public final String LIZ() {
                return "aigc_take_selfie";
            }

            @Override // X.AbstractBinderC539700LEq
            public final void LIZJ(Activity activity, int i, Intent intent) {
            }

            @Override // X.AbstractBinderC539700LEq
            public final void LIZLLL() {
                C0MJJ.LIZ.getClass();
                C0MJJ.LIZ("retake");
            }

            @Override // X.AbstractBinderC539700LEq
            public final void LJ() {
                C0MJJ.LIZ.getClass();
                C0MJJ.LIZ("show");
            }

            {
                this.LLILLJJLI = aIGCPictureHandler;
            }

            @Override // X.AbstractBinderC539700LEq
            public final void LIZIZ(Activity activity, String str, Function1<? super Boolean, Unit> function1) {
                this.LLILLJJLI.checkValidAndUpload(activity, Collections.singletonList(str), "shoot_page", new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 427));
                C0MJJ.LIZ.getClass();
                C0MJJ.LIZ("use_photo");
            }
        }, "ai_avatar", null, null, null, null);
    }

    public static final void onLoad$11(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        LifecycleCoroutineScope lifecycleScope;
        C19EG c19eg = ((C535990L0j) c580990MqX.l0).activity;
        if (c19eg != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg)) != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C536140L0y((C535990L0j) c580990MqX.l0, asyncAVService, (View) c580990MqX.l1, null), 2);
        }
    }

    public static final void onLoad$12(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        MusicModel musicModelConvertToMusicModel;
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(((C1076810e7z) c580990MqX.l0).LLJ);
        builder.enterFrom("anchor_combine_page");
        builder.shootWay("anchor_combine_mv");
        PhotoMvAnchorConfig photoMvAnchorConfig = new PhotoMvAnchorConfig();
        photoMvAnchorConfig.setSlideshowMvId(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) c580990MqX.l1, "slideshow_mv_id"));
        Music music = ((C1076810e7z) c580990MqX.l0).LJIIZILJ().getMusic();
        if (music != null) {
            musicModelConvertToMusicModel = music.convertToMusicModel();
        } else {
            musicModelConvertToMusicModel = null;
        }
        photoMvAnchorConfig.setMusicModel(musicModelConvertToMusicModel);
        photoMvAnchorConfig.setTemplateType(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) c580990MqX.l1, "template_type"));
        asyncAVService.uiService().recordService().startRecordSlideShowPhotoMV(((C1076810e7z) c580990MqX.l0).LJIILJJIL(), builder.build(), photoMvAnchorConfig);
    }

    public static final void onLoad$13(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c580990MqX.l0, ((RecordConfig.Builder) c580990MqX.l1).build());
    }

    public static final void onLoad$14(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c580990MqX.l0, ((RecordConfig.Builder) c580990MqX.l1).build());
    }

    public static final void onLoad$15(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        try {
            asyncAVService.uiService().startCreationFromDeepLink((Context) c580990MqX.l0, (CreationConfigModelCompat) c580990MqX.l1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void onLoad$2(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        String string = ((Bundle) c580990MqX.l0).getString("enter_from");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((Bundle) c580990MqX.l0).getString("shoot_way");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((Bundle) c580990MqX.l0).getString("enter_method");
        if (string3 != null) {
            str = string3;
        }
        if (!((Activity) c580990MqX.l1).isFinishing()) {
            asyncAVService.uiService().recordService().startPugcAlbum((Activity) c580990MqX.l1, new C573660Mei(string2, string, str));
        }
    }

    public static final void onLoad$3(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c580990MqX.l0, ((RecordConfig.Builder) c580990MqX.l1).build());
    }

    public static final void onLoad$4(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        boolean z;
        String string = ((Bundle) c580990MqX.l0).getString("template_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((Bundle) c580990MqX.l0).getString("enter_from");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((Bundle) c580990MqX.l0).getString("shoot_way");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = ((Bundle) c580990MqX.l0).getString("enter_method");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = ((Bundle) c580990MqX.l0).getString("group_id");
        if (string5 == null) {
            string5 = "";
        }
        String string6 = ((Bundle) c580990MqX.l0).getString("schema_tag");
        if (string6 != null) {
            str = string6;
        }
        String string7 = ((Bundle) c580990MqX.l0).getString("landing_back");
        String string8 = ((Bundle) c580990MqX.l0).getString("landing_url");
        if (!((Activity) c580990MqX.l1).isFinishing()) {
            IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
            Activity activity = (Activity) c580990MqX.l1;
            if (string7 != null) {
                z = true;
            } else {
                z = false;
            }
            iRecordServiceRecordService.startTemplatePreviewActivity(activity, new C0MPJ(string, string3, str, string2, string4, string5, string7, string8, z));
        }
    }

    public static final void onLoad$5(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        ShootExtraData shootExtraData;
        boolean z;
        String string = ((Bundle) c580990MqX.l0).getString("template_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((Bundle) c580990MqX.l0).getString("enter_from");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((Bundle) c580990MqX.l0).getString("shoot_way");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = ((Bundle) c580990MqX.l0).getString("enter_method");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = ((Bundle) c580990MqX.l0).getString("group_id");
        if (string5 == null) {
            string5 = "";
        }
        String string6 = ((Bundle) c580990MqX.l0).getString("schema_tag");
        if (string6 != null) {
            str = string6;
        }
        Serializable serializable = ((Bundle) c580990MqX.l0).getSerializable("shoot_extra_data");
        if (serializable instanceof ShootExtraData) {
            shootExtraData = (ShootExtraData) serializable;
        } else {
            shootExtraData = null;
        }
        String string7 = ((Bundle) c580990MqX.l0).getString("landing_back");
        String string8 = ((Bundle) c580990MqX.l0).getString("landing_url");
        if (!((Activity) c580990MqX.l1).isFinishing()) {
            IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
            Activity activity = (Activity) c580990MqX.l1;
            if (string7 != null) {
                z = true;
            } else {
                z = false;
            }
            iRecordServiceRecordService.startReusePugcTemplateAlbum(activity, new C573840Mf0(string, string3, str, string2, string4, string5, z, string7, string8, shootExtraData));
        }
    }

    public static final void onLoad$6(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((BookDetailPage) c580990MqX.l0).requireActivity(), ((RecordConfig.Builder) c580990MqX.l1).build());
    }

    public static final void onLoad$7(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((MovieDetailPage) c580990MqX.l0).requireActivity(), ((RecordConfig.Builder) c580990MqX.l1).build());
    }

    public static final void onLoad$8(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c580990MqX.l0, ((RecordConfig.Builder) c580990MqX.l1).build());
    }

    public static final void onLoad$9(C580990MqX c580990MqX, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c580990MqX.l0, (Intent) c580990MqX.l1);
    }
}
