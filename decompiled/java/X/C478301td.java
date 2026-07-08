package X;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C478301td extends FrameLayout {
    @Override // android.view.View
    public final void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        try {
            super.restoreHierarchyState(sparseArray);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("error_msg", e.toString(), jSONObject);
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            JSONObject jSONObject2 = new JSONObject();
            int i = 1;
            if (getId() != -1) {
                arrayList.add(Integer.valueOf(getId()));
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C478201tc.LIZ(this), C478201tc.LIZIZ(this, arrayList, hashSet));
                jSONObject2.put("view_info", jSONObject3);
                if (!C086I.LIZIZ(hashSet)) {
                    jSONObject2.put("repeat_id", TextUtils.join(", ", hashSet));
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C0K04.LJII("dump", jSONObject, jSONObject2);
            if (jSONObject2.optJSONObject("repeat_id") == null) {
                i = 0;
            }
            C1CC2.LJIIIIZZ("ttlive_xg_restore_dump", i, jSONObject);
        }
    }

    public C478301td(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
