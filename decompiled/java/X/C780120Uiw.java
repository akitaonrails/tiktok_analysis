package X;

import com.bytedance.android.livesdk.model.Gift;
import com.google.gson.h;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Uiw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780120Uiw {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Collection collection) {
        h hVar = new h();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hVar.LJJII(Long.valueOf(((Gift) it2.next()).id));
        }
        return hVar.toString();
    }
}
