package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.10ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19397210ug {
    public static final C19397210ug LIZ = new C19397210ug();

    public static Context LIZIZ(View view) {
        Context context = view.getContext();
        if ((context instanceof Application) && view.getParent() != null && (view.getParent() instanceof View)) {
            return ((View) view.getParent()).getContext();
        }
        return context;
    }

    public static void LIZ(String str, String str2, C1A5D c1a5d, StringBuilder sb) {
        Map<String, String> mapLIZIZ = c1a5d.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Gesture ID:");
        sbLIZ.append(str2);
        sbLIZ.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        sb.append("\n");
        sb.append("Why This Popup:\n");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Gesture ");
        sbLIZ2.append(str);
        sbLIZ2.append(" Detected!\n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        sb.append("\n");
        sb.append("Action Required:\n");
        sb.append("Please click the \"See More In Lark\" button below to proceed with registering your UnRegistered or exceed hot zone gesture.\n");
        sb.append("\n");
        sb.append("More Details:\n");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("areaRatio: ");
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZIZ;
        sbLIZ3.append((String) linkedHashMap.get("area_ratio"));
        sbLIZ3.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("areaRect: ");
        sbLIZ4.append((String) linkedHashMap.get("rect"));
        sbLIZ4.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
    }
}
