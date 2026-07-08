package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0McR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572250McR {
    public static final TextImageTaskInfo LIZJ(Text2ImageModel text2ImageModel) {
        int iIntValue;
        List<TextImageTaskInfo> list = text2ImageModel.imageTaskList;
        Integer num = text2ImageModel.index;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return (TextImageTaskInfo) C13LP.LJJJLZIJ(iIntValue, list);
    }

    public static final long LJ(Text2ImageModel text2ImageModel) {
        int iIntValue;
        List<Long> list = text2ImageModel.templateList;
        if (list != null) {
            Integer num = text2ImageModel.index;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Long l = (Long) C13LP.LJJJLZIJ(iIntValue, list);
            if (l != null) {
                return l.longValue();
            }
            return 0L;
        }
        return 0L;
    }

    public static final String LJFF(Text2ImageModel text2ImageModel) {
        String str = text2ImageModel.cmtToPostInitialContentSource;
        if (str != null && str.length() != 0) {
            if (Intrinsics.LJFF(text2ImageModel.cmtToPostInitialContentSource, "not_fetched")) {
                return "not_fetched";
            }
            String str2 = text2ImageModel.text;
            if (str2 == null) {
                str2 = "";
            }
            if (text2ImageModel.commentText.length() > 0 && Intrinsics.LJFF(str2, text2ImageModel.commentText)) {
                return "original_comment";
            }
            String str3 = text2ImageModel.textByAi;
            if (str3 != null && C123100dR.LIZ(str3) && Intrinsics.LJFF(str2, text2ImageModel.textByAi)) {
                return "ai_rewrite";
            }
            return "edited";
        }
        return null;
    }

    public static final void LIZ(Text2ImageModel text2ImageModel, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("cmt_to_post_entrance_module");
        if (string != null) {
            text2ImageModel.cmtToPostEntranceModule = string;
        }
        String string2 = bundle.getString("cmt_to_post_entrance_element");
        if (string2 != null) {
            text2ImageModel.cmtToPostEntranceElement = string2;
        }
        String string3 = bundle.getString("cmt_to_post_preview_position");
        if (string3 != null) {
            text2ImageModel.cmtToPostPreviewPosition = string3;
        }
    }

    public static final TextImageTaskInfo LIZIZ(Text2ImageModel text2ImageModel, String str) {
        TextImageTaskInfo next;
        Iterator<TextImageTaskInfo> it2 = text2ImageModel.imageTaskList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getAsyncTaskId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final TextImageTaskInfo LIZLLL(Text2ImageModel text2ImageModel, Integer num) {
        int iIntValue;
        List<TextImageTaskInfo> list = text2ImageModel.imageTaskList;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return (TextImageTaskInfo) C13LP.LJJJLZIJ(iIntValue, list);
    }
}
