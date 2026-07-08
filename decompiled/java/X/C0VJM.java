package X;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJM {
    public static void LIZ(File file) {
        Window window;
        View viewPeekDecorView;
        JSONArray jSONArray = new JSONArray();
        ArrayList<WeakReference<Activity>> arrayList = C0VYH.LIZIZ().LJIIIIZZ;
        if (arrayList != null && arrayList.size() > 0) {
            LinkedList linkedList = new LinkedList();
            Iterator<WeakReference<Activity>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().get();
                if (activity != null && (window = activity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    linkedList.add(new Pair(viewPeekDecorView, jSONObject));
                    jSONArray.put(jSONObject);
                }
            }
            while (!linkedList.isEmpty()) {
                Pair pair = (Pair) linkedList.pop();
                View view = (View) pair.first;
                JSONObject jSONObject2 = (JSONObject) pair.second;
                C0VJO.LJIIIIZZ(jSONObject2, "cls", String.valueOf(view.getClass()));
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    JSONArray jSONArray2 = new JSONArray();
                    C0VJO.LJIIIIZZ(jSONObject2, "children", jSONArray2);
                    for (int i = 0; i < childCount; i++) {
                        try {
                            View childAt = viewGroup.getChildAt(i);
                            if (childAt != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONArray2.put(jSONObject3);
                                linkedList.push(new Pair(childAt, jSONObject3));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
            try {
                C08SE.LJII(new C0VSJ(file, "viewTree.txt"), jSONArray);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
