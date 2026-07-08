package X;

import com.ss.android.ugc.aweme.creative.model.CutSameMediaItem;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItemCrop;
import com.ss.android.ugc.cut_ui.ItemCrop;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0L8A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L8A {
    public static final ArrayList<MediaItem> LIZ(List<CutSameMediaItem> list) {
        ArrayList<MediaItem> arrayList = new ArrayList<>();
        for (CutSameMediaItem cutSameMediaItem : list) {
            CutSameMediaItemCrop cutSameMediaItemCrop = cutSameMediaItem.crop;
            ItemCrop itemCrop = new ItemCrop(cutSameMediaItemCrop.upperLeftX, cutSameMediaItemCrop.upperLeftY, cutSameMediaItemCrop.lowerRightX, cutSameMediaItemCrop.lowerRightY);
            String str = cutSameMediaItem.materialId;
            long j = cutSameMediaItem.targetStartTime;
            boolean z = cutSameMediaItem.isMutable;
            String str2 = cutSameMediaItem.alignMode;
            boolean z2 = cutSameMediaItem.isSubVideo;
            boolean z3 = cutSameMediaItem.isReverse;
            int i = cutSameMediaItem.cartoonType;
            int i2 = cutSameMediaItem.width;
            int i3 = cutSameMediaItem.height;
            long j2 = cutSameMediaItem.duration;
            String str3 = cutSameMediaItem.source;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            long j3 = cutSameMediaItem.sourceStartTime;
            float f = cutSameMediaItem.cropScale;
            String str5 = cutSameMediaItem.type;
            String str6 = cutSameMediaItem.mediaSrc;
            String str7 = cutSameMediaItem.gamePlayAlgorithm;
            if (str7 != null) {
                str4 = str7;
            }
            arrayList.add(new MediaItem(str, j, cutSameMediaItem.targetEndTime, z, str2, z2, z3, i, str4, cutSameMediaItem.volume, i2, i3, j2, str3, j3, f, itemCrop, str5, str6, 0.0f, 524288));
        }
        return arrayList;
    }
}
