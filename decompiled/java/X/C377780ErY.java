package X;

import com.ss.android.ugc.aweme.aigc.asynctask.DownloadItemResult;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import java.util.List;

/* JADX INFO: renamed from: X.0ErY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377780ErY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DownloadItemResult downloadItemResult, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, AIGCGenerationParamType aIGCGenerationParamType, List list) {
        editorProAIGCMediaItemModel.creationTime = downloadItemResult.timestamp;
        editorProAIGCMediaItemModel.mediaFilePath = downloadItemResult.localFilePath;
        editorProAIGCMediaItemModel.serverDownloadUrl = downloadItemResult.url;
        int i = C377810Erb.LIZ[aIGCGenerationParamType.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4 && i != 5) {
                return;
            }
            editorProAIGCMediaItemModel.holderPicturePath = downloadItemResult.thumbnailLocalFilePath;
            String str = (String) C13LP.LJJJLZIJ(0, list);
            if (str == null) {
                str = "";
            }
            editorProAIGCMediaItemModel.referenceImagePath = str;
            editorProAIGCMediaItemModel.referenceImagePathList = list;
            return;
        }
        editorProAIGCMediaItemModel.holderPicturePath = downloadItemResult.localFilePath;
        editorProAIGCMediaItemModel.referenceImagePathList = list;
    }
}
