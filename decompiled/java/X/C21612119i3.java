package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19i3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21612119i3 implements InterfaceC21612319i5 {
    public final int[] LIZ = new int[2];

    @Override // X.InterfaceC21612319i5
    public final JSONObject LIZIZ(View view) {
        if (view == null) {
            return C1287890jcR.LIZ(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.LIZ);
        int[] iArr = this.LIZ;
        return C1287890jcR.LIZ(iArr[0], iArr[1], width, height);
    }

    @Override // X.InterfaceC21612319i5
    public final void LIZ(View view, JSONObject jSONObject, InterfaceC21612219i4 interfaceC21612219i4, boolean z, boolean z2) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        if (z) {
            HashMap map = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((ArrayList) map.get(it2.next())).iterator();
                while (it3.hasNext()) {
                    ((C2205621BUa) interfaceC21612219i4).LIZ((View) it3.next(), this, jSONObject, z2);
                }
            }
            return;
        }
        while (i < viewGroup.getChildCount()) {
            ((C2205621BUa) interfaceC21612219i4).LIZ(viewGroup.getChildAt(i), this, jSONObject, z2);
            i++;
        }
    }
}
