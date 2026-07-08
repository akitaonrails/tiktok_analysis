package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Vyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815510Vyv {
    public static final boolean LIZIZ(Uri uri) {
        if (C13LQ.LJJIJIIJI(uri.getScheme(), new String[]{"http", "https"}) >= 0) {
            return true;
        }
        return false;
    }

    public static final List LIZ(Context context, Uri uri) {
        List listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), new Intent("android.intent.action.VIEW", uri), 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMqm7thDKSX8Qu5gUc30UOBDy/Xw==", null));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
        Iterator it2 = listLJJJJZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ResolveInfo) it2.next()).activityInfo.packageName);
        }
        return C13LP.LLIIII(arrayList);
    }
}
