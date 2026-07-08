package X;

import com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.intervention.OperatorInfoStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.02r2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C717002r2 {
    public static final void LIZ(ContentInfoStruct contentInfoStruct, OperatorInfoStruct operatorInfoStruct) {
        if (contentInfoStruct.operatorInfoList == null) {
            contentInfoStruct.operatorInfoList = new ArrayList(1);
        }
        List<OperatorInfoStruct> list = contentInfoStruct.operatorInfoList;
        if (list != null) {
            list.add(operatorInfoStruct);
        }
    }
}
