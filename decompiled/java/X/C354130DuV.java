package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DuV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354130DuV {
    public static String LIZ(ResourceItem resourceItem) {
        String str = resourceItem.extra;
        if (str != null && str.length() != 0) {
            return new JSONObject(resourceItem.extra).optString("english_name", "default");
        }
        return "";
    }
}
