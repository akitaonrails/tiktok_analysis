package X;

import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08vB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2271508vB extends C09AY implements Function1<VideoPublishEditModel, List<? extends String>> {
    public C2271508vB() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends String> invoke(VideoPublishEditModel videoPublishEditModel) {
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if (videoPublishEditModel2.isUploadVideo()) {
            ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel2.getImportInfoList();
            if (importInfoList != null && !importInfoList.isEmpty()) {
                ArrayList arrayList = new ArrayList(videoPublishEditModel2.getImportInfoList());
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String realImportPath = ((ImportVideoInfo) it2.next()).getRealImportPath();
                    if (realImportPath != null) {
                        arrayList2.add(realImportPath);
                    }
                }
                return arrayList2;
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }
}
