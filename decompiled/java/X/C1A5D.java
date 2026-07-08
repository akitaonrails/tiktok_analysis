package X;

import android.view.TouchDelegate;
import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1A5D, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5D {
    public final View LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final View.OnClickListener LIZLLL;
    public final View.OnTouchListener LJ;
    public final TouchDelegate LJFF;
    public int LJI = 1;
    public int LJII = 1;
    public String LJIIIIZZ = null;
    public final Map<String, String> LJIIIZ = C2097608Jq.LJ();

    public final Map<String, String> LIZIZ() {
        if (this.LJI == 1 || this.LJII == 1) {
            this.LJI = C1A5C.LIZLLL();
            this.LJII = C1A5C.LIZJ();
        }
        int[] iArr = new int[2];
        this.LIZ.getLocationOnScreen(iArr);
        int i = this.LJI * this.LJII;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("gesture_identifier", C1436805jq.LIZ(this.LIZ, false));
        C2097608Jq.LJIIL(linkedHashMap, this.LJIIIZ);
        linkedHashMap.put("area_ratio", C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((((double) (this.LIZ.getWidth() * this.LIZ.getHeight())) * 1.0d) / ((double) i))}, 1)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("l:");
        sbLIZ.append(iArr[0]);
        sbLIZ.append(",r:");
        sbLIZ.append(iArr[0] + this.LIZ.getWidth());
        sbLIZ.append(",t:");
        sbLIZ.append(iArr[1]);
        sbLIZ.append(",b:");
        sbLIZ.append(iArr[1] + this.LIZ.getHeight());
        linkedHashMap.put("rect", C2188811AlT.LIZIZ(sbLIZ));
        linkedHashMap.put("class_name", this.LIZ.getClass().getName());
        linkedHashMap.put("app_width", String.valueOf(this.LJI));
        linkedHashMap.put("app_height", String.valueOf(this.LJII));
        linkedHashMap.put("clickable", String.valueOf(this.LIZIZ));
        linkedHashMap.put("touchable", String.valueOf(this.LIZJ));
        View.OnClickListener onClickListener = this.LIZLLL;
        linkedHashMap.put("click_listener", onClickListener != null ? onClickListener.getClass().getName() : null);
        View.OnTouchListener onTouchListener = this.LJ;
        linkedHashMap.put("touch_listener", onTouchListener != null ? onTouchListener.getClass().getName() : null);
        TouchDelegate touchDelegate = this.LJFF;
        linkedHashMap.put("touch_delegate", touchDelegate != null ? touchDelegate.getClass().getName() : null);
        return linkedHashMap;
    }

    public final String LIZ(boolean z) {
        if (z) {
            return C1436805jq.LIZ(this.LIZ, z);
        }
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = C1436805jq.LIZ(this.LIZ, z);
        }
        String str = this.LJIIIIZZ;
        if (str == null) {
            return "Null";
        }
        return str;
    }

    public C1A5D(View view, boolean z, boolean z2, View.OnClickListener onClickListener, View.OnTouchListener onTouchListener, TouchDelegate touchDelegate) {
        this.LIZ = view;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = onClickListener;
        this.LJ = onTouchListener;
        this.LJFF = touchDelegate;
    }
}
