package X;

import android.view.View;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0h3S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189320h3S {
    public static ArrayList LIZ(View view, ArrayList arrayList) {
        if (view == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList2.add(new PoiGalleryAnchorData(view.getWidth(), view.getHeight(), iArr[0], iArr[1], 240));
        }
        return arrayList2;
    }
}
