package X;

import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.effectcreatormobile.ckeapi.api.album.EditMedia;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.ame.AMEImageCutoutInput;
import com.ss.android.ugc.aweme.creative.model.ame.AMEVideoCutoutInput;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0LvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558490LvL implements InterfaceC522520KeQ {
    public final C19EG LL;

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    public C558490LvL(C19EG c19eg) {
        this.LL = c19eg;
    }

    public static String LIZJ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LIZLLL(String str, boolean z) {
        String strLIZJ = LIZJ(this.LL.getIntent(), "bottomtab_from");
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        Pair[] pairArr = new Pair[5];
        String str2 = "1";
        pairArr[0] = new Pair("is_ame_data", "1");
        if (!z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_success", str2);
        pairArr[2] = new Pair("texture_type", str);
        pairArr[3] = new Pair("error_code", "2");
        pairArr[4] = new Pair("bottomtab_from", strLIZJ);
        C1737910vKH.LIZ("select_asset_add_camera_roll", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZ(final int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        if (i2 == -1 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null && !parcelableArrayListExtra.isEmpty() && !TextUtils.isEmpty(((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJFF())) {
            C530750Krh.LJFF.LIZ();
            MediaModel mediaModel = (MediaModel) ListProtector.get(parcelableArrayListExtra, 0);
            final Effect effect = (Effect) intent.getParcelableExtra("key_custom_effect_sticker");
            String strLIZJ = LIZJ(intent, "shoot_way");
            String str = "";
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            String strLIZJ2 = LIZJ(intent, "content_source");
            if (strLIZJ2 == null) {
                strLIZJ2 = "";
            }
            String strLIZJ3 = LIZJ(intent, "content_type");
            if (strLIZJ3 == null) {
                strLIZJ3 = "";
            }
            CreativeInfo creativeInfoLIZ = C537520L6g.LIZ(intent);
            if (mediaModel.LJIILJJIL()) {
                if (intent.getIntExtra("key_ame_exist_video_sticker_count", 0) >= C558520LvO.LIZ().maxVideoStickerCount) {
                    C1390390mHl c1390390mHl = C1390390mHl.LIZ;
                    C19EG c19eg = this.LL;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(C1710306mr.LIZIZ(2131821264, Integer.valueOf(C558520LvO.LIZ().maxVideoStickerCount)));
                    ((C1390360mHi) c1390390mHl.createToast(c19eg, 3067, creativeToastBuilder)).show();
                    LIZLLL("video", false);
                    return;
                }
                if (mediaModel.duration < TimeUnit.SECONDS.toMillis(C558520LvO.LIZ().minVideoStickerDurationSeconds)) {
                    C1390390mHl c1390390mHl2 = C1390390mHl.LIZ;
                    C19EG c19eg2 = this.LL;
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.message(C1710306mr.LIZIZ(2131821263, Integer.valueOf(C558520LvO.LIZ().minVideoStickerDurationSeconds)));
                    ((C1390360mHi) c1390390mHl2.createToast(c19eg2, 3067, creativeToastBuilder2)).show();
                    LIZLLL("video", false);
                    return;
                }
                if (mediaModel.duration > TimeUnit.MINUTES.toMillis(10L)) {
                    C1390390mHl c1390390mHl3 = C1390390mHl.LIZ;
                    C19EG c19eg3 = this.LL;
                    CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                    creativeToastBuilder3.messageRes(2131821262);
                    ((C1390360mHi) c1390390mHl3.createToast(c19eg3, 3067, creativeToastBuilder3)).show();
                    LIZLLL("video", false);
                    return;
                }
                LIZLLL("video", true);
                int i3 = C558520LvO.LIZ().maxVideoStickerDurationSeconds * LSPassThroughRecordSizeConfig.DEFAULT;
                String strLJFF = mediaModel.LJFF();
                if (strLJFF != null) {
                    str = strLJFF;
                }
                AMEVideoCutoutInput aMEVideoCutoutInput = new AMEVideoCutoutInput(strLIZJ, strLIZJ2, strLIZJ3, str, 0, i3, creativeInfoLIZ);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "//ame/video_cutout");
                smartRouteBuildRoute.withParam("ame_cutout_input_key", aMEVideoCutoutInput);
                smartRouteBuildRoute.open(i, new OnActivityResultCallback() { // from class: X.0LvM
                    @Override // com.bytedance.router.OnActivityResultCallback
                    public final void onActivityResult(int i4, int i5, Intent intent2) throws Throwable {
                        if (i == i4 && i5 == -1) {
                            Effect effect2 = effect;
                            if (!(effect2 instanceof Parcelable)) {
                                effect2 = null;
                            }
                            intent2.putExtra("custom_sticker", (Parcelable) effect2);
                            C2204961BRm.LLJJIJIL(-1, intent2, this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9bMiocYG7T736eju4e8scoJ4P7fJpaZchyn4zThxHXzFeB93JTugqTkYaC9z1o=", null));
                            this.LL.finish();
                        }
                    }
                });
                return;
            }
            LIZLLL("photo", true);
            if (mediaModel.type == 2) {
                C1660680tJi.LIZ().LJ(this.LL, mediaModel, creativeInfoLIZ, effect, new ShortVideoCommonParams(strLIZJ, strLIZJ2, strLIZJ3, creativeInfoLIZ.getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null));
                return;
            }
            String strLJFF2 = ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJFF();
            if (strLJFF2 == null) {
                strLJFF2 = "";
            }
            AMEImageCutoutInput aMEImageCutoutInput = new AMEImageCutoutInput(mediaModel, strLIZJ, strLIZJ2, strLIZJ3, strLJFF2, creativeInfoLIZ, null, LIZJ(this.LL.getIntent(), "et_enter_from"), LIZJ(this.LL.getIntent(), "et_ame_enter_from"), LIZJ(this.LL.getIntent(), "bottomtab_from"));
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("is_ame_data", "1");
            String strLIZJ4 = LIZJ(this.LL.getIntent(), "et_enter_from");
            if (strLIZJ4 == null) {
                strLIZJ4 = "";
            }
            pairArr[1] = new Pair("enter_from", strLIZJ4);
            String strLIZJ5 = LIZJ(this.LL.getIntent(), "et_ame_enter_from");
            if (strLIZJ5 == null) {
                strLIZJ5 = "";
            }
            pairArr[2] = new Pair("ame_enter_from", strLIZJ5);
            String strLIZJ6 = LIZJ(this.LL.getIntent(), "bottomtab_from");
            if (strLIZJ6 == null) {
                strLIZJ6 = "";
            }
            pairArr[3] = new Pair("bottomtab_from", strLIZJ6);
            C1737910vKH.LIZ("add_asset_image_edit", C2097608Jq.LJIIIIZZ(pairArr));
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(this.LL, "//ame/image_cutout");
            smartRouteBuildRoute2.withParam("ame_image_cutout_input_key", aMEImageCutoutInput);
            smartRouteBuildRoute2.open(i, new OnActivityResultCallback() { // from class: X.0LvN
                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i4, int i5, Intent intent2) throws Throwable {
                    EditMedia editMedia;
                    String path;
                    if (i == i4 && i5 == -1) {
                        if (intent2 != null) {
                            editMedia = (EditMedia) intent2.getParcelableExtra("ame_image_cutout_result_key");
                        } else {
                            editMedia = null;
                        }
                        if (editMedia == null || (path = editMedia.getPath()) == null) {
                            path = "";
                        }
                        intent2.putExtra("custom_sticker_image_info", new CustomStickerInfo(null, path, 0, 0));
                        Effect effect2 = effect;
                        if (!(effect2 instanceof Parcelable)) {
                            effect2 = null;
                        }
                        intent2.putExtra("custom_sticker", (Parcelable) effect2);
                        C2204961BRm.LLJJIJIL(-1, intent2, this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9bMiocYG7T736eju4e8scoJ4P7fJpaZchyn4zThxHXzFeB93JTugqTkYaC9z1o=", null));
                        this.LL.finish();
                    }
                }
            });
        }
    }
}
