package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.01kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C424701kz {
    public static final /* synthetic */ int LIZ = 0;

    public static Uri LIZ(List list, Map map) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("tt_ame");
        builder.authority("main");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str.length() > 0) {
                builder.appendPath(str);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((CharSequence) entry.getKey()).length() > 0) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builder.build();
    }
}
