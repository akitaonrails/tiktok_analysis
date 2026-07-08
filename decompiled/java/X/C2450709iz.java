package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2450709iz {
    public static final JSONArray LIZIZ(View view) {
        JSONArray jSONArray = new JSONArray();
        if (view == null) {
            jSONArray.put("top view is null.");
        } else if (view instanceof ViewGroup) {
            LinkedList linkedList = new LinkedList();
            LinkedHashSet<List> linkedHashSet = new LinkedHashSet();
            LIZ((ViewGroup) view, linkedList, linkedHashSet);
            for (List list : linkedHashSet) {
                StringBuilder sb = new StringBuilder();
                if (!list.isEmpty()) {
                    int size = list.size() - 1;
                    for (int i = 0; i < size; i++) {
                        sb.append(LJI((View) ListProtector.get(list, i)));
                        sb.append("->");
                    }
                    ViewGroup viewGroup = (ViewGroup) ListProtector.get(list, list.size() - 1);
                    sb.append(LJI(viewGroup));
                    sb.append(e3.e);
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        sb.append(LJI(viewGroup.getChildAt(i2)));
                        if (i2 < viewGroup.getChildCount() - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append(e3.f);
                    jSONArray.put(sb.toString());
                }
            }
        }
        return jSONArray;
    }

    public static final JSONObject LIZLLL(C19GS c19gs) throws JSONException {
        Iterator<Fragment> it2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            it2 = c19gs.getSupportFragmentManager().LJJLIIIJL().iterator();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get fragment null view has exception, e:");
            sbLIZ.append(e);
            C20441214yg.LJ("ttlive_exception", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put("exception", e.getMessage());
        }
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            Fragment next = it2.next();
            String canonicalName = next.getClass().getCanonicalName();
            if (canonicalName != null) {
                str = canonicalName;
            }
            jSONObject2.put(str, LIZIZ(next.getView()));
            jSONObject.put("direct_fragments", jSONObject2);
            jSONObject.put("target_deep_fragments", jSONObject3);
            return jSONObject;
        }
        for (Fragment fragment : (ArrayList) LJIIIIZZ(c19gs)) {
            String canonicalName2 = fragment.getClass().getCanonicalName();
            if (canonicalName2 == null) {
                canonicalName2 = "";
            }
            jSONObject3.put(canonicalName2, LIZIZ(fragment.getView()));
        }
        jSONObject.put("direct_fragments", jSONObject2);
        jSONObject.put("target_deep_fragments", jSONObject3);
        return jSONObject;
    }

    public static final String LJFF(C19EG c19eg) {
        boolean z;
        try {
            Iterator<Fragment> it2 = c19eg.getSupportFragmentManager().LJJLIIIJL().iterator();
            while (it2.hasNext()) {
                String strLJII = LJII(it2.next().getView());
                if (strLJII.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return strLJII;
                }
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get fragment null view has exception, e:");
            sbLIZ.append(e);
            C20441214yg.LJ("ttlive_exception", C2188811AlT.LIZIZ(sbLIZ));
            String message = e.getMessage();
            if (message == null) {
                return "null";
            }
            return message;
        }
    }

    public static final String LJI(View view) {
        if (view == null) {
            return "null";
        }
        if (view.getId() == -1) {
            return "no-id";
        }
        try {
            String resourceName = view.getResources().getResourceName(view.getId());
            int iLJJJ = a0.LJJJ(resourceName, "id/", 0, false, 6);
            if (iLJJJ < 0) {
                return resourceName;
            }
            return resourceName.substring(iLJJJ + 3);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return "id-not-found";
        }
    }

    public static final String LJII(View view) {
        if (view == null) {
            return "top view is null.";
        }
        if (view instanceof ViewGroup) {
            LinkedList linkedList = new LinkedList();
            if (LIZJ((ViewGroup) view, linkedList)) {
                StringBuilder sb = new StringBuilder();
                if (linkedList.isEmpty()) {
                    return "contain null view, but get parent view failed.";
                }
                int size = linkedList.size() - 1;
                for (int i = 0; i < size; i++) {
                    sb.append(LJI((View) linkedList.get(i)));
                    sb.append("->");
                }
                ViewGroup viewGroup = (ViewGroup) linkedList.peekLast();
                if (viewGroup != null) {
                    sb.append(LJI(viewGroup));
                    sb.append(e3.e);
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        sb.append(LJI(viewGroup.getChildAt(i2)));
                        if (i2 < viewGroup.getChildCount() - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append(e3.f);
                    return sb.toString();
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            return "";
        }
        return "";
    }

    public static List LJIIIIZZ(C19GS c19gs) {
        List<Fragment> listLJJLIIIJL = c19gs.getSupportFragmentManager().LJJLIIIJL();
        ArrayList arrayList = new ArrayList();
        Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
        while (it2.hasNext()) {
            List<Fragment> listLJJLIIIJL2 = it2.next().getChildFragmentManager().LJJLIIIJL();
            if (!listLJJLIIIJL2.isEmpty()) {
                Iterator<Fragment> it3 = listLJJLIIIJL2.iterator();
                while (it3.hasNext()) {
                    List<Fragment> listLJJLIIIJL3 = it3.next().getChildFragmentManager().LJJLIIIJL();
                    if (!listLJJLIIIJL3.isEmpty()) {
                        arrayList.addAll(listLJJLIIIJL3);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean LIZJ(ViewGroup viewGroup, Deque<ViewGroup> deque) {
        LinkedList linkedList = (LinkedList) deque;
        linkedList.addLast(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) == null) {
                return true;
            }
        }
        int childCount2 = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof ViewGroup) && LIZJ((ViewGroup) childAt, deque)) {
                return true;
            }
        }
        Object objPeekLast = linkedList.peekLast();
        if (!Intrinsics.LJFF(objPeekLast, viewGroup)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current stack top viewGroup isn't ");
            sbLIZ.append(LJI(viewGroup));
            sbLIZ.append(", it is ");
            sbLIZ.append(objPeekLast);
            sbLIZ.append('.');
            C20441214yg.LJIIL("ttlive_exception", C2188811AlT.LIZIZ(sbLIZ));
        }
        linkedList.removeLast();
        return false;
    }

    public static final JSONObject LJ(List<? extends Fragment> list, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (Fragment fragment : (ArrayList) list) {
                String canonicalName = fragment.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = "";
                }
                jSONObject2.put(canonicalName, LIZIZ(fragment.getView()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get fragment null view has exception, e:");
            sbLIZ.append(e);
            C20441214yg.LJ("ttlive_exception", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put("exception", e.getMessage());
        }
        jSONObject.put("fragments", jSONObject2);
        return jSONObject;
    }

    public static void LIZ(ViewGroup viewGroup, Deque deque, Set set) {
        if (viewGroup.getChildCount() == 0) {
            return;
        }
        LinkedList linkedList = (LinkedList) deque;
        linkedList.addLast(viewGroup);
        if (linkedList.size() == 4) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(deque, 10));
            Iterator it2 = deque.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            set.add(arrayList);
        } else {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    LIZ((ViewGroup) childAt, deque, set);
                }
            }
        }
        linkedList.removeLast();
    }
}
