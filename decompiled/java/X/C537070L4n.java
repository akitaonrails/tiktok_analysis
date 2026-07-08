package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537070L4n implements InterfaceC21363618j4 {
    public final /* synthetic */ ShortVideoContext LIZ;
    public final /* synthetic */ C0L3B LIZIZ;
    public final /* synthetic */ InterfaceC1624480sNK LIZJ;

    @Override // X.InterfaceC21363618j4
    public final C21364418jC LIZ(Intent intent) {
        String stringExtra;
        String stringExtra2;
        AIGCInfo aIGCInfo = null;
        try {
            stringExtra = intent.getStringExtra("videoPath");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            stringExtra2 = intent.getStringExtra("audioPath");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        try {
            String stringExtra3 = intent.getStringExtra("videoOriginPath");
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        Serializable serializableExtra = intent.getSerializableExtra("aigcInfo");
        if (serializableExtra instanceof AIGCInfo) {
            aIGCInfo = (AIGCInfo) serializableExtra;
        }
        return new C21364418jC(stringExtra, stringExtra2, str, aIGCInfo);
    }

    public C537070L4n(ShortVideoContext shortVideoContext, InterfaceC1624480sNK interfaceC1624480sNK, C0L3B c0l3b) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = c0l3b;
        this.LIZJ = interfaceC1624480sNK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21363618j4
    public final Intent LIZIZ(String str, String str2, DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure, final String str3, final String str4, Boolean bool, Effect effect) {
        String effectId;
        String resourceId;
        String string;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Intent intent = new Intent();
        final ShortVideoContext shortVideoContext = this.LIZ;
        C0L3B c0l3b = this.LIZIZ;
        InterfaceC1624480sNK interfaceC1624480sNK = this.LIZJ;
        intent.putExtra("shoot_way", shortVideoContext.shootWay);
        intent.putExtra("shoot_tab_name", shortVideoContext.LJIJJLI());
        intent.putExtra("enter_from", "video_shoot_page");
        intent.putExtra("creation_id", str);
        intent.putExtra("file_path", str2);
        intent.putExtra("extra_is_effect_aigc_v2v", Intrinsics.LJFF(bool, Boolean.TRUE));
        if (str3 != null && str4 != null) {
            C0L3B c0l3b2 = new C0L3B(str3, shortVideoContext, str4) { // from class: X.0L38
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
                    super("from_background_video", "background_video_compile_configure", new BackgroundVideoCompileConfigure(workspace.LL.Af(str3, str4).getPath(), workspace.LL.oy().getPath()));
                }
            };
            intent.putExtra("from_background_video", true);
            intent.putExtra("background_video_compile_configure", c0l3b2.LIZJ);
        } else if (c0l3b != null) {
            intent.putExtra(c0l3b.LIZ, true);
            intent.putExtra(c0l3b.LIZIZ, c0l3b.LIZJ);
        }
        long maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(!shortVideoContext.cameraComponentModel.mCurrentDurationMode, shortVideoContext);
        C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(shortVideoContext, maxShootingDuration);
        if (diyPropUploadVideoAutoCutConfigure != null) {
            intent.putExtra("diy_prop_upload_video_configure", diyPropUploadVideoAutoCutConfigure);
            maxShootingDuration = Math.min(diyPropUploadVideoAutoCutConfigure.maxDuration, maxShootingDuration);
        }
        String effectId2 = null;
        C537520L6g.LJ(intent, shortVideoContext.creativeInfo.getCreationId(), shortVideoContext.creativeInfo.getVersion(), null);
        intent.putExtra("cut_video_max_length", maxShootingDuration);
        String str11 = "";
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        intent.putExtra("prop_id", effectId);
        if (effect == null || (resourceId = effect.getResourceId()) == null) {
            resourceId = "";
        }
        intent.putExtra("prop_resource_id", resourceId);
        if (effect != null) {
            string = Integer.valueOf(effect.getSource()).toString();
        } else {
            string = null;
        }
        intent.putExtra("effect_source", string);
        intent.putExtra("tab_key", C1449260noi.LIZJ((C1449000noI) interfaceC1624480sNK.LJII().LJ().getValue(), shortVideoContext, interfaceC1624480sNK));
        if (effect != null) {
            C537040L4k c537040L4kLIZ = C0LXS.LIZ(effect);
            if (c537040L4kLIZ == null || (str6 = c537040L4kLIZ.LIZ) == null) {
                str6 = "";
            }
            intent.putExtra("is_ai_prop", str6);
            if (c537040L4kLIZ == null || (str7 = c537040L4kLIZ.LIZIZ) == null) {
                str7 = "";
            }
            intent.putExtra("ai_prop_type", str7);
            if (c537040L4kLIZ == null || (str8 = c537040L4kLIZ.LJ) == null) {
                str8 = "";
            }
            intent.putExtra("is_async", str8);
            if (c537040L4kLIZ == null || (str9 = c537040L4kLIZ.LIZJ) == null) {
                str9 = "";
            }
            intent.putExtra("sub_ai_prop_type", str9);
            if (c537040L4kLIZ == null || (str10 = c537040L4kLIZ.LIZLLL) == null) {
                str10 = "";
            }
            intent.putExtra("ai_prop_model_name", str10);
        }
        String strLJIIIZ = shortVideoContext.LJIIIZ();
        if (strLJIIIZ == null) {
            strLJIIIZ = "";
        }
        if (effect != null) {
            effectId2 = effect.getEffectId();
        }
        if (Intrinsics.LJFF(strLJIIIZ, effectId2)) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        intent.putExtra("is_default_prop", str5);
        intent.putExtra("prop_trigger_type", "upload_video");
        String str12 = shortVideoContext.creativeModel.aigcOfflineModel.propSelectedFrom;
        if (str12.length() > 0) {
            str11 = str12;
        } else {
            String name = C1623660sM0.LIZ(interfaceC1624480sNK).getName();
            if (name != null) {
                str11 = name;
            }
        }
        intent.putExtra("prop_selected_from", str11);
        return intent;
    }
}
