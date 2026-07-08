package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0W14, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W14 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("android.intent.action.CHOOSER", "android.intent.action.SEND", "android.intent.action.SEND_MULTIPLE", "android.media.action.IMAGE_CAPTURE", "android.media.action.IMAGE_CAPTURE_SECURE", "android.media.action.VIDEO_CAPTURE");

    public static final boolean LIZ(Context context, Intent intent) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        Iterator it2 = C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 0, new C0WZX("dzBzEgAjS8/YVFkiQFyXY4ASwrrs1sOaC9KBVpr0bHTzMijsQfBKjSdXa1VO0Mx3ntWRLg==", null)).iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((ResolveInfo) it2.next()).activityInfo.applicationInfo.uid));
        }
        Iterator<ResolveInfo> it3 = context.getPackageManager().queryIntentServices(intent, 0).iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(it3.next().serviceInfo.applicationInfo.uid));
        }
        Iterator<ResolveInfo> it4 = context.getPackageManager().queryBroadcastReceivers(intent, 0).iterator();
        while (it4.hasNext()) {
            arrayList.add(Integer.valueOf(it4.next().activityInfo.applicationInfo.uid));
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList);
        if ((listLJJJJI instanceof Collection) && listLJJJJI.isEmpty()) {
            z = true;
        } else {
            Iterator it5 = listLJJJJI.iterator();
            while (it5.hasNext()) {
                if (((Number) it5.next()).intValue() == context.getApplicationInfo().uid) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if ((intent.getFlags() & 195) == 0) {
            z2 = true;
        }
        return z & z2 & (!C13LP.LJJJJ(intent.getAction(), LIZ));
    }
}
