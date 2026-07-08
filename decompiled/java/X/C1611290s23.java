package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import java.util.UUID;

/* JADX INFO: renamed from: X.0s23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611290s23 extends SimpleServiceLoadCallback {
    public final /* synthetic */ C1611300s24 LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ SecretRepliesRecordParam LIZJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        C563770M9f c563770M9fLIZLLL;
        String string = UUID.randomUUID().toString();
        C1611300s24 c1611300s24 = this.LIZ;
        String str = this.LIZIZ;
        c1611300s24.getClass();
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        Long baseAwemeId = null;
        C1449410nox c1449410nox = new C1449410nox(string, "story", str, null, null, null, null, null, 248);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("has_secret_reply_sticker", "1");
        c0lab.LJ("is_secret_reply_initiator", CardStruct.IStatusCode.DEFAULT);
        iRecordMobService.LIZLLL(c1449410nox, c0lab.LIZ);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(string);
        builder.enterFrom(this.LIZIZ);
        builder.shootWay("secret_reply");
        builder.secretRepliesStickerParam(this.LIZ.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("awemeId: ");
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct = this.LIZ.LIZIZ.getSecretRepliesResponseStickerStruct();
        if (secretRepliesResponseStickerStruct != null) {
            baseAwemeId = secretRepliesResponseStickerStruct.getBaseAwemeId();
        }
        sbLIZ.append(baseAwemeId);
        C2188811AlT.LIZIZ(sbLIZ);
        SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
        if (socMediaPickerService != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
            Context context = this.LIZ.LIZ;
            ShootExtraData shootExtraData = new ShootExtraData(this.LIZIZ, null, null, null, "secret_reply", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null);
            String str2 = this.LIZIZ;
            c563770M9fLIZLLL.openStoryRecordingPageDirectly(context, new EnterStoryParam(null, null, str2, null, null, str2, "story_immersive_feed", null, shootExtraData, false, false, false, 0, 0.0f, 0, null, null, null, null, this.LIZJ, null, false, null, false, null, null, 66584219, null), null);
        }
    }

    public C1611290s23(C1611300s24 c1611300s24, String str, SecretRepliesRecordParam secretRepliesRecordParam) {
        this.LIZ = c1611300s24;
        this.LIZIZ = str;
        this.LIZJ = secretRepliesRecordParam;
    }
}
