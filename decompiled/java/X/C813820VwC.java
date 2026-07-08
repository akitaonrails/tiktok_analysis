package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: X.0VwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813820VwC {
    public static final List<String> LIZ = new ArrayList();

    public static void LIZ(Intent intent) {
        intent.putExtra("from_notification", true);
        String string = UUID.randomUUID().toString();
        ((ArrayList) LIZ).add(string);
        intent.putExtra("from_notification_uuid", string);
    }
}
