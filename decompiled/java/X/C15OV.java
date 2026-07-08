package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15OV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15OV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Intent LL;
    public final /* synthetic */ AbstractC20598115it LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ StitchParams LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15OV(Intent intent, AbstractC20598115it abstractC20598115it, Context context, StitchParams stitchParams, boolean z) {
        super(0);
        this.LL = intent;
        this.LLILLJJLI = abstractC20598115it;
        this.LLILLL = context;
        this.LLILZ = stitchParams;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CreativeInfo creativeInfoLIZ = C537520L6g.LIZ(this.LL);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        StitchParams stitchParams = this.LLILZ;
        boolean z = this.LLILZIL;
        Intent intent = this.LL;
        builder.shootWay("stitch");
        builder.stitchParams(stitchParams);
        builder.creationId(creativeInfoLIZ.getCreationId());
        builder.recordFromFeed(z);
        builder.ttsVoiceIDs(intent.getStringArrayListExtra("tts_voice_ids"));
        builder.ttsVoiceRefIDs(intent.getStringArrayListExtra("tts_voice_ref_ids"));
        builder.vcVoiceIDs(intent.getStringArrayListExtra("vc_voice_ids"));
        builder.vcVoiceRefIDs(intent.getStringArrayListExtra("vc_voice_ref_ids"));
        RecordConfig recordConfigBuild = builder.build();
        this.LLILLJJLI.getClass();
        Intent intentLIZ = AbstractC20598115it.LIZ(recordConfigBuild);
        if (this.LL.hasExtra("duet_and_stitch_router_config")) {
            intentLIZ.putExtra("duet_and_stitch_router_config", this.LL.getParcelableExtra("duet_and_stitch_router_config"));
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.LLILLL, intentLIZ);
        return Unit.LIZ;
    }
}
