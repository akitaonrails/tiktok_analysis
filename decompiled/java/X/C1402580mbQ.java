package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402580mbQ extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C1402580mbQ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        List<SimpleTextStickerData> textStickerDataList = videoPublishEditModel.getTextStickerDataList();
        if (textStickerDataList != null && !textStickerDataList.isEmpty()) {
            Iterator<SimpleTextStickerData> it2 = textStickerDataList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getTtsExtraMap().get("is_instant_clone"), "1")) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }
}
