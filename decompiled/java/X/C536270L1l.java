package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0L1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536270L1l {
    public static final void LIZ(List list) {
        HashMap<String, String> metaData;
        String str;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it2.next();
            if (C1463450oBb.LIZ()) {
                metaData = C498101wp.LIZ(videoSegment.originPath);
            } else {
                metaData = TEVideoUtils.getMetaData(videoSegment.originPath);
            }
            if (metaData == null || (str = metaData.get("LvMetaInfo")) == null) {
                str = "";
            }
            videoSegment.mDescription = str;
        }
    }
}
