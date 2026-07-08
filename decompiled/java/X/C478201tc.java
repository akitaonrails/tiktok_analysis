package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C478201tc {
    public static int LIZ;

    public static String LIZ(View view) {
        if (view.getContext() != null && view.getContext().getResources() != null) {
            StringBuilder sb = new StringBuilder(128);
            int i = LIZ;
            LIZ = i + 1;
            sb.append(i);
            if (view instanceof ProgressBar) {
                sb.append("#ProgressBar#");
            }
            return sb.toString();
        }
        return "";
    }

    public static JSONObject LIZIZ(ViewGroup viewGroup, List<Integer> list, HashSet<Integer> hashSet) {
        boolean z;
        if (viewGroup == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, viewGroup.getId());
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() == -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.contains(Integer.valueOf(childAt.getId()))) {
                        hashSet.add(Integer.valueOf(childAt.getId()));
                    } else {
                        arrayList.add(Integer.valueOf(childAt.getId()));
                    }
                }
                if (childAt instanceof ViewGroup) {
                    jSONObject.put(LIZ(childAt), LIZIZ((ViewGroup) childAt, list, hashSet));
                } else {
                    jSONObject.put(LIZ(childAt), String.valueOf(childAt.getId()));
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }
}
