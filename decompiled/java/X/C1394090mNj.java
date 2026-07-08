package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorKt;

/* JADX INFO: renamed from: X.0mNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394090mNj {
    public static final C1394090mNj LIZ = new C1394090mNj();

    public static void LIZ(C2344009Gk c2344009Gk, AnchorCommonStruct anchorCommonStruct) {
        String id;
        String extraBasedOnKey;
        String extraBasedOnKey2 = null;
        if (anchorCommonStruct != null) {
            id = anchorCommonStruct.getId();
        } else {
            id = null;
        }
        c2344009Gk.LJFF("style_id", id);
        if (anchorCommonStruct != null && (extraBasedOnKey2 = AnchorKt.getExtraBasedOnKey(anchorCommonStruct, "root_style_id")) == null) {
            extraBasedOnKey2 = anchorCommonStruct.getId();
        }
        c2344009Gk.LJFF("root_style_id", extraBasedOnKey2);
        if (anchorCommonStruct == null || (extraBasedOnKey = AnchorKt.getExtraBasedOnKey(anchorCommonStruct, "style_resource_id")) == null) {
            extraBasedOnKey = "";
        }
        c2344009Gk.LJFF("resource_id", extraBasedOnKey);
    }
}
