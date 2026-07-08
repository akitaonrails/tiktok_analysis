package X;

import Y.ARunnableS75S0200000_6;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.gesture.GestureControllerSettings;
import com.ss.android.ugc.aweme.feed.gesture.GestureHotfixItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS242S0300000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1A5I, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5I {
    public static float LIZIZ;
    public static float LIZJ;
    public static boolean LIZLLL;
    public static final List<C1A5H> LJFF;
    public static final C1A5I LIZ = new C1A5I();
    public static long LJ = -1;

    static {
        ArrayList arrayList = new ArrayList();
        LJFF = arrayList;
        arrayList.add(C1A5E.LIZ);
        arrayList.add(C1A5F.LIZ);
    }

    public static boolean LIZ() {
        return GestureControllerSettings.LIZJ || C2173791A5p.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v68, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v91, types: [T, java.util.Map] */
    public static void LIZIZ(ViewGroup viewGroup, MotionEvent motionEvent, final Fragment fragment, int i) throws JSONException, NoSuchFieldException {
        View view;
        View viewLIZIZ;
        String str;
        String str2;
        String str3;
        boolean z;
        String strLIZIZ;
        String strLIZ;
        C0T3S c0t3sFirst;
        WeakReference<View> weakReference;
        C0T3S c0t3sFirst2;
        WeakReference<View> weakReference2;
        C1A5L c1a5lLIZIZ;
        C1A5L c1a5lLIZIZ2;
        if (LIZ() && viewGroup != null && motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1 || (viewLIZIZ = C1967407nE.LIZIZ(viewGroup)) == null) {
                    return;
                }
                LruCache<String, C13E8<C0T3S>> lruCache = C1A5K.LIZ;
                if (C2173791A5p.LIZLLL && (c1a5lLIZIZ2 = C2271391DvN.LIZIZ(viewLIZIZ)) != null) {
                    Iterator<GestureHotfixItem> it2 = C2173791A5p.LIZJ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        GestureHotfixItem next = it2.next();
                        if (Intrinsics.LJFF(c1a5lLIZIZ2.LIZ, next.gestureName)) {
                            Integer num = next.pageType;
                            if (num == null || i == num.intValue()) {
                                HandlerHook.viewPost(viewLIZIZ, new ARunnableS75S0200000_6(viewLIZIZ, c1a5lLIZIZ2, 103));
                            }
                        }
                    }
                }
                if (!GestureControllerSettings.LIZJ) {
                    return;
                }
                float fAbs = Math.abs(LIZIZ - motionEvent.getRawX());
                float fAbs2 = Math.abs(LIZJ - motionEvent.getRawY());
                if (GestureControllerSettings.LJFF) {
                    List<String> list = GestureControllerSettings.LJIIL;
                    if (!(!list.isEmpty()) || (((c1a5lLIZIZ = C2271391DvN.LIZIZ(viewLIZIZ)) == null || !list.contains(c1a5lLIZIZ.LIZ)) && !list.contains(C1436805jq.LIZ(viewLIZIZ, false)))) {
                        LruCache<String, C13E8<C0T3S>> lruCache2 = C1A5K.LIZ;
                        if (motionEvent.getAction() == 1) {
                            String strLIZ2 = C1436805jq.LIZ(viewLIZIZ, false);
                            C1A5L c1a5lLIZIZ3 = C2271391DvN.LIZIZ(viewLIZIZ);
                            String strValueOf = String.valueOf(viewLIZIZ.hashCode());
                            long eventTime = motionEvent.getEventTime();
                            LruCache<String, C13E8<C0T3S>> lruCache3 = C1A5K.LIZ;
                            C13E8<C0T3S> c13e8 = lruCache3.get(strValueOf);
                            if (c13e8 == null) {
                                c13e8 = new C13E8<>();
                            }
                            LruCache<String, C13E8<C0T3S>> lruCache4 = C1A5K.LIZIZ;
                            C13E8<C0T3S> c13e82 = lruCache4.get(strValueOf);
                            if (c13e82 == null) {
                                c13e82 = new C13E8<>();
                            }
                            if (fAbs <= 0.0f && fAbs2 <= 0.0f) {
                                c13e8.addLast(new C0T3S(motionEvent.getEventTime(), new WeakReference(viewLIZIZ)));
                                lruCache3.put(strValueOf, c13e8);
                                int size = c13e8.size();
                                int i2 = C1A5K.LJ;
                                if (size > i2) {
                                    c13e8.removeFirst();
                                }
                                if (c13e8.size() >= i2 && c13e8.first() != null && (c0t3sFirst2 = c13e8.first()) != null && (weakReference2 = c0t3sFirst2.LIZ) != null && weakReference2.get() != null && eventTime - c13e8.first().LIZIZ < C1A5K.LIZJ) {
                                    List listLLIIII = C13LP.LLIIII(c13e8);
                                    C19396910ud.LIZ.getClass();
                                    C19396910ud.LIZ(c1a5lLIZIZ3, strLIZ2, strValueOf, "feed_gesture_error_type_click", listLLIIII);
                                    c13e8.clear();
                                }
                            } else {
                                c13e82.addLast(new C0T3S(motionEvent.getEventTime(), new WeakReference(viewLIZIZ)));
                                lruCache4.put(strValueOf, c13e82);
                                int size2 = c13e82.size();
                                int i3 = C1A5K.LJFF;
                                if (size2 > i3) {
                                    c13e82.removeFirst();
                                }
                                if (c13e82.size() >= i3 && c13e82.first() != null && (c0t3sFirst = c13e82.first()) != null && (weakReference = c0t3sFirst.LIZ) != null && weakReference.get() != null && eventTime - c13e82.first().LIZIZ < C1A5K.LIZLLL) {
                                    LIZ.getClass();
                                    if (LJ < c13e82.first().LIZIZ) {
                                        List listLLIIII2 = C13LP.LLIIII(c13e82);
                                        C19396910ud.LIZ.getClass();
                                        C19396910ud.LIZ(c1a5lLIZIZ3, strLIZ2, strValueOf, "feed_gesture_error_type_scroll", listLLIIII2);
                                        c13e82.clear();
                                    }
                                }
                            }
                        }
                    }
                }
                if (!GestureControllerSettings.LJ) {
                    return;
                }
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                C1A5C.LJII = Integer.valueOf(width);
                C1A5C.LJIIIIZZ = Integer.valueOf(height);
                C1A5G.LIZ.getClass();
                C844470XAv.LIZ.getClass();
                if (TextUtils.equals(C844470XAv.LJIILL, "local_test") && GestureControllerSettings.LIZLLL && fragment != null && GestureControllerSettings.LIZLLL && fragment.getView() != null) {
                    C15O7.LIZJ(new Callable() { // from class: X.1A5J
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws NoSuchFieldException {
                            C1C7U.LIZ("GestureLocalDetector@c623.postLocalGestureCheck$1");
                            C1A5G c1a5g = C1A5G.LIZ;
                            View view2 = fragment.getView();
                            c1a5g.getClass();
                            C1A5G.LIZIZ(view2);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("GestureLocalDetector@c623.postLocalGestureCheck$1");
                            return unit;
                        }
                    });
                }
                C1A5D c1a5dLJFF = C1A5C.LJFF(viewLIZIZ);
                C1A5L c1a5lLIZIZ4 = C2271391DvN.LIZIZ(viewLIZIZ);
                c1a5dLJFF.LJI = viewGroup.getWidth();
                c1a5dLJFF.LJII = viewGroup.getHeight();
                C2097608Jq.LJIILIIL(c1a5dLJFF.LJIIIZ, new Pair("pageType", String.valueOf(i)));
                if (C1A5C.LIZ(c1a5lLIZIZ4, c1a5dLJFF)) {
                    return;
                }
                if (fAbs <= 0.0f && fAbs2 <= 0.0f) {
                    str = "click";
                } else {
                    str = "scroll";
                }
                C1A5L c1a5lLIZIZ5 = C2271391DvN.LIZIZ(viewLIZIZ);
                Iterator it3 = ((ArrayList) LJFF).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        str2 = "None";
                        break;
                    }
                    C1A5H c1a5h = (C1A5H) it3.next();
                    if (!c1a5h.LIZ(viewLIZIZ)) {
                        if ((c1a5h instanceof C1A5F) && (fAbs > 0.0f || fAbs2 > 0.0f)) {
                            break;
                        } else if (c1a5h instanceof C1A5E) {
                            str2 = "ClickArea";
                            break;
                        }
                    }
                }
                str2 = "ScrollArea";
                C19397210ug.LIZ.getClass();
                C844470XAv.LIZ.getClass();
                if (TextUtils.equals(C844470XAv.LJIILL, "local_test")) {
                    DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml = new DialogInterfaceOnClickListenerC2189611Aml(c1a5dLJFF, 19);
                    if (C1A5C.LIZIZ(c1a5dLJFF) || (c1a5lLIZIZ5 != null && C2271391DvN.LIZJ(c1a5lLIZIZ5.LIZ))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if ((u.LJIJI(str2, "ClickArea", false) || u.LJIJI(str2, "ScrollArea", false)) && !C1A5C.LIZ(c1a5lLIZIZ5, c1a5dLJFF)) {
                            StringBuilder sb = new StringBuilder();
                            if (u.LJIJI(str2, "None", false)) {
                                strLIZIZ = "Consume";
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str2);
                                sbLIZ.append(" exceed");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            if (c1a5lLIZIZ5 == null || (strLIZ = c1a5lLIZIZ5.LIZ) == null) {
                                strLIZ = c1a5dLJFF.LIZ(false);
                            }
                            C19397210ug.LIZ(strLIZIZ, strLIZ, c1a5dLJFF, sb);
                            if (c1a5lLIZIZ5 != null) {
                                C259800zU c259800zU = new C259800zU();
                                c259800zU.element = sb.toString();
                                Map mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIILIIL(C2097608Jq.LJIIJ(new Pair("gesture_name", c1a5lLIZIZ5.LIZ), new Pair("rd_owner", c1a5lLIZIZ5.LIZIZ), new Pair("scene_list", GsonProtectorUtils.toJson(new Gson(), c1a5lLIZIZ5.LIZJ)), new Pair("action_way", c1a5lLIZIZ5.LIZLLL), new Pair("gesture_consume_type_List", GsonProtectorUtils.toJson(new Gson(), c1a5lLIZIZ5.LJ)), new Pair("exceed_grant", String.valueOf(c1a5lLIZIZ5.LJFF)), new Pair("gesture_identifier", c1a5lLIZIZ5.LJI)), new Pair("error_type", strLIZIZ)), c1a5dLJFF.LIZIZ());
                                String json = GsonProtectorUtils.toJson(new Gson(), mapLJIIL);
                                C259800zU c259800zU2 = new C259800zU();
                                c259800zU2.element = C2097608Jq.LJIILIIL(mapLJIIL, new Pair("other", json));
                                IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
                                c1a5dLJFF.LIZ.getContext();
                                new AwS242S0300000_33(c1a5dLJFF, c259800zU, c259800zU2, dialogInterfaceOnClickListenerC2189611Aml, 8);
                                iFeedDebugService.LJIILJJIL();
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        String strLIZIZ2 = "UnRegistered ";
                        if (u.LJIJI(str2, "ClickArea", false) || u.LJIJI(str2, "ScrollArea", false)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("UnRegistered ");
                            sbLIZ2.append("and ");
                            sbLIZ2.append(str2);
                            sbLIZ2.append(" exceed");
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        C19397210ug.LIZ(strLIZIZ2, c1a5dLJFF.LIZ(false), c1a5dLJFF, sb2);
                        C259800zU c259800zU3 = new C259800zU();
                        c259800zU3.element = sb2.toString();
                        Map mapLJIILIIL = C2097608Jq.LJIILIIL(C2097608Jq.LJIILIIL(c1a5dLJFF.LIZIZ(), new Pair("gesture_identifier", c1a5dLJFF.LIZ(false))), new Pair("error_type", strLIZIZ2));
                        String json2 = GsonProtectorUtils.toJson(new Gson(), mapLJIILIIL);
                        C259800zU c259800zU4 = new C259800zU();
                        c259800zU4.element = C2097608Jq.LJIILIIL(mapLJIILIIL, new Pair("other", json2));
                        IFeedDebugService iFeedDebugService2 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
                        c1a5dLJFF.LIZ.getContext();
                        new AwS242S0300000_33(c1a5dLJFF, c259800zU3, c259800zU4, dialogInterfaceOnClickListenerC2189611Aml, 9);
                        iFeedDebugService2.LIZIZ();
                    }
                }
                if ((!C1A5C.LIZIZ(c1a5dLJFF) && (c1a5lLIZIZ5 == null || !C2271391DvN.LIZJ(c1a5lLIZIZ5.LIZ))) || (!Intrinsics.LJFF(str2, "None") && !C1A5C.LIZ(c1a5lLIZIZ5, c1a5dLJFF))) {
                    C19396910ud.LIZ.getClass();
                    Map mapLJIILIIL2 = C2097608Jq.LJIILIIL(C2097608Jq.LJIILIIL(C2097608Jq.LJIILIIL(C2097608Jq.LJIILIIL(c1a5dLJFF.LIZIZ(), new Pair("alarm_type", str2)), new Pair("dx", String.valueOf(fAbs))), new Pair("dy", String.valueOf(fAbs2))), new Pair("touch_type", str));
                    if (c1a5lLIZIZ5 != null) {
                        str3 = c1a5lLIZIZ5.LIZ;
                    } else {
                        str3 = null;
                    }
                    C20684815ws.LJIILLIIL("feed_gesture_consume_item_alarm", C2097608Jq.LJIILIIL(mapLJIILIIL2, new Pair("gesture_name", str3)));
                }
                LIZIZ = 0.0f;
                LIZJ = 0.0f;
                return;
            }
            if (GestureControllerSettings.LIZJ) {
                LIZIZ = motionEvent.getRawX();
                LIZJ = motionEvent.getRawY();
                if (GestureControllerSettings.LJFF) {
                    if (fragment != null) {
                        view = fragment.getView();
                    } else {
                        view = null;
                    }
                    if (!LIZLLL && view != null) {
                        C786410Ut5.z3(view.getViewTreeObserver(), new ViewTreeObserver.OnScrollChangedListener() { // from class: X.1A5M
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final void onScrollChanged() {
                                C1A5I c1a5i = C1A5I.LIZ;
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                c1a5i.getClass();
                                C1A5I.LJ = jUptimeMillis;
                            }
                        });
                        LIZLLL = true;
                    }
                }
            }
        }
    }
}
