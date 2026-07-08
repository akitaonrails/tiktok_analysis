package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.router.UploadActionInterceptor;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576000MiU extends C09AY implements Function2<AddYoursStickerStruct, Boolean, Unit> {
    public final /* synthetic */ RecordConfig.Builder LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ UploadActionInterceptor LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C576000MiU(RecordConfig.Builder builder, Bundle bundle, UploadActionInterceptor uploadActionInterceptor, Activity activity, String str) {
        super(2);
        this.LL = builder;
        this.LLILLJJLI = bundle;
        this.LLILLL = uploadActionInterceptor;
        this.LLILZ = activity;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AddYoursStickerStruct addYoursStickerStruct, Boolean bool) {
        AddYoursStickerStruct addYoursStickerStruct2 = addYoursStickerStruct;
        bool.booleanValue();
        if (addYoursStickerStruct2 != null) {
            Long topicId = addYoursStickerStruct2.getTopicId();
            if (topicId != null && topicId.longValue() > 0) {
                RecordConfig.Builder builder = this.LL;
                String string = this.LLILLJJLI.getString("ay_enter_method");
                if (string == null) {
                    string = "H5";
                }
                builder.addYoursStickerParam(new AddYourRecordParam(addYoursStickerStruct2, false, false, null, null, string, null, true, false, null, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, true, false));
            }
        } else {
            this.LLILLJJLI.remove("ay_topic_id");
            this.LLILLJJLI.remove("ay_topic_text");
            this.LLILLJJLI.remove("ay_enter_method");
        }
        UploadActionInterceptor uploadActionInterceptor = this.LLILLL;
        Activity activity = this.LLILZ;
        String str = this.LLILZIL;
        Bundle bundle = this.LLILLJJLI;
        RecordConfig recordConfigBuild = this.LL.build();
        uploadActionInterceptor.getClass();
        UploadActionInterceptor.LIZ(activity, str, bundle, recordConfigBuild);
        return Unit.LIZ;
    }
}
