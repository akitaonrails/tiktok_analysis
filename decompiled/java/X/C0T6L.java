package X;

import Y.ARunnableS81S0200000_12;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.longpress.LongPressStructure;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T6L, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6L {
    public static final boolean LIZLLL() {
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            interfaceC1370110ll3.isDebug();
        }
        InterfaceC1370110ll3 interfaceC1370110ll32 = C1370370llT.LIZ;
        return interfaceC1370110ll32 != null && interfaceC1370110ll32.LJI();
    }

    public static final List<Object> LIZIZ(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object objLIZJ = null;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map != null) {
                    objLIZJ = LIZJ(map);
                }
                arrayList.add(objLIZJ);
            } else if (obj instanceof List) {
                List list2 = (List) obj;
                if (list2 != null) {
                    objLIZJ = LIZIZ(list2);
                }
                arrayList.add(objLIZJ);
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> LIZJ(Map<String, ? extends Object> map) {
        Map map2;
        List list;
        LongPressStructure longPressStructure;
        List<Object> listLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Map<String, Object> mapLIZJ = null;
            List<Object> list2 = null;
            LongPressStructure longPressStructure2 = null;
            listLIZIZ = null;
            List<Object> listLIZIZ2 = null;
            mapLIZJ = null;
            if (entry.getValue() instanceof Map) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if ((value instanceof Map) && (map2 = (Map) value) != null) {
                    mapLIZJ = LIZJ(map2);
                }
                linkedHashMap.put(key, mapLIZJ);
            } else if (entry.getValue() instanceof List) {
                String key2 = entry.getKey();
                Object value2 = entry.getValue();
                if ((value2 instanceof List) && (list = (List) value2) != null) {
                    listLIZIZ2 = LIZIZ(list);
                }
                linkedHashMap.put(key2, listLIZIZ2);
            } else if (entry.getValue() instanceof LongPressStructure) {
                Object value3 = entry.getValue();
                if (value3 instanceof LongPressStructure) {
                    longPressStructure = (LongPressStructure) value3;
                } else {
                    longPressStructure = null;
                }
                String key3 = entry.getKey();
                if (longPressStructure != null) {
                    List<String> list3 = longPressStructure.children;
                    if (list3 != null) {
                        listLIZIZ = LIZIZ(list3);
                    } else {
                        listLIZIZ = null;
                    }
                    if (C19719512Dh.LJI(listLIZIZ)) {
                        list2 = listLIZIZ;
                    }
                    longPressStructure2 = new LongPressStructure(longPressStructure.containerKey, list2);
                }
                linkedHashMap.put(key3, longPressStructure2);
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final void LIZ(final View view, final Function0<Unit> function0) {
        final C013C c013c = new C013C();
        ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.0T68
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                if (c013c.element) {
                    return;
                }
                function0.invoke();
                c013c.element = true;
                View view2 = view;
                HandlerHook.viewPost(view2, new ARunnableS81S0200000_12(this, view2, 148));
            }
        };
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            C786410Ut5.w3(view.getViewTreeObserver(), onDrawListener);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC786060UsW(view, onDrawListener, 3));
        }
    }
}
