package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2Q {
    public static final C0N2Q LIZ = new C0N2Q();

    public static final JSONObject LIZ(IBaseListFragmentPanel iBaseListFragmentPanel) {
        if (iBaseListFragmentPanel != null) {
            return iBaseListFragmentPanel.zj();
        }
        return null;
    }

    public static final String LIZIZ(IBaseListFragmentPanel iBaseListFragmentPanel) {
        String strOptString;
        JSONObject jSONObjectLIZ = LIZ(iBaseListFragmentPanel);
        if (jSONObjectLIZ == null || (strOptString = jSONObjectLIZ.optString("request_id")) == null) {
            return "";
        }
        return strOptString;
    }

    public static final String LIZJ(List<String> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append("\"");
                sb.append((String) ListProtector.get(list, i));
                sb.append("\"");
            } else {
                sb.append(",\"");
                sb.append((String) ListProtector.get(list, i));
                sb.append("\"");
            }
        }
        return sb.toString();
    }
}
