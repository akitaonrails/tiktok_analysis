package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377160EqY extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C377160EqY() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        C377150EqX c377150EqX = C377150EqX.LIZ;
        Set setLLIIJI = C13LP.LLIIJI(C377150EqX.LJ(videoPublishEditModel2.getNleModel()));
        if (setLLIIJI.isEmpty()) {
            return Boolean.FALSE;
        }
        ArrayList<EditorProAIGCMediaItemModel> arrayList = videoPublishEditModel2.creativeModel.editorProAIGCInfoModel.editorProAIGCMediaItemModelList;
        boolean z2 = false;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<EditorProAIGCMediaItemModel> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                EditorProAIGCMediaItemModel next = it2.next();
                boolean zContains = C377150EqX.LIZLLL.contains(next.type);
                EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus = next.status;
                if (editorProAIGCMediaItemModelStatus != EditorProAIGCMediaItemModelStatus.CANCEL && editorProAIGCMediaItemModelStatus != EditorProAIGCMediaItemModelStatus.NONE && editorProAIGCMediaItemModelStatus != EditorProAIGCMediaItemModelStatus.ERROR) {
                    z = true;
                } else {
                    z = false;
                }
                if (zContains && z && setLLIIJI.contains(next.itemID)) {
                    z2 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
