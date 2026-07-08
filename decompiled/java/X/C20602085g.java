package X;

import android.view.View;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.085g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20602085g implements AttachUserData {
    public static String LIZ = "";

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap map = new HashMap();
        map.put("BaseCanvasRecycleCrashDataImpl", LIZ);
        return map;
    }

    public static void LIZ(View view, String str) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("DraweeView onDraw crash: \n");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" extraInfo: ");
            sbLIZ.append(str);
            stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" context: ");
            sbLIZ2.append(view.getContext());
            stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" view: ");
            sbLIZ3.append(view);
            stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ3));
            stringBuffer.append("\n");
            int i = 50;
            while (true) {
                Object parent = view.getParent();
                if (!(parent instanceof View) || i <= 0) {
                    break;
                }
                view = (View) parent;
                i--;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("count:");
                sbLIZ4.append(i);
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ4));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(" parent:");
                sbLIZ5.append(view);
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ5));
                stringBuffer.append("\n");
            }
            LIZ = stringBuffer.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
