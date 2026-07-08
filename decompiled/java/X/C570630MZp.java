package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C570630MZp extends C2217421BqW implements Function1<C570700MZw, Boolean> {
    public static final C570630MZp LL = new C570630MZp();

    public C570630MZp() {
        super(1, C570700MZw.class, "canVideoDirect2Publish", "canVideoDirect2Publish()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C570700MZw c570700MZw) {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        C570700MZw c570700MZw2 = c570700MZw;
        boolean z = false;
        if (C570690MZv.LIZ(c570700MZw2.LIZIZ) && (((creativeModel = c570700MZw2.LIZIZ.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.hasI2V) && !creativeModel.editorProAIGCInfoModel.taskInfoInCreativeModel.needBlockLeaveEditorPro && !creativeModel.magicCombineEffectModel.taskInfoInCreativeModel.needBlockLeaveEditorPro)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
