package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645690PUh {
    public static boolean LIZJ(int i) {
        return i == 3 || i == 1 || i == 4 || i == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r13) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645690PUh.LIZIZ(com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch):int");
    }

    public static boolean LIZLLL(Map map, C830490Whz c830490Whz) {
        if (map == c830490Whz) {
            return true;
        }
        if (map == null || map.size() != c830490Whz.LLILLL) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!c830490Whz.containsKey(key)) {
                return false;
            }
            if (!Intrinsics.LJFF(value, c830490Whz.get(key)) && !Intrinsics.LJFF(key, "lynxBindTime") && !Intrinsics.LJFF(key, "start_search") && !Intrinsics.LJFF(key, "visibleUnderPredict")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0lX0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.content.Context] */
    public static ViewOnAttachStateChangeListenerC648030PbN LIZ(Fragment fragment, ViewGroup viewGroup, C1361400lX0 c1361400lX0) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        new C648390Pbx();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Context contextLIZ = C657990PrR.LIZ(viewGroup);
        if (contextLIZ == null) {
            contextLIZ = viewGroup.getContext();
        }
        if (c1361400lX0 == 0) {
            InterfaceC214902198i interfaceC214902198i = null;
            if (fragment != null) {
                Context context = fragment.getContext();
                if (context != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    Fragment parentFragment = fragment;
                    while (true) {
                        if (parentFragment instanceof InterfaceC214902198i) {
                            interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                            break;
                        }
                        parentFragment = parentFragment.getParentFragment();
                        if (parentFragment == null) {
                            break;
                        }
                    }
                }
            }
            c1361400lX0 = C661350Pwr.LIZIZ(contextLIZ, interfaceC214902198i);
        }
        ViewOnAttachStateChangeListenerC648030PbN viewOnAttachStateChangeListenerC648030PbN = new ViewOnAttachStateChangeListenerC648030PbN(fragment, C646360PWw.LIZ(3, jCurrentTimeMillis2, c1361400lX0), jCurrentTimeMillis2);
        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
        C645710PUj c645710PUjR5 = viewOnAttachStateChangeListenerC648030PbN.R5();
        if (c645710PUjR5 != null) {
            for (Object obj : (ArrayList) C648390Pbx.LIZ(c645710PUjR5.LL)) {
                C645710PUj c645710PUjR52 = viewOnAttachStateChangeListenerC648030PbN.R5();
                if (c645710PUjR52 != null) {
                    ((ArrayList) c645710PUjR52.LLILLJJLI).add(obj);
                }
            }
        }
        long j = ViewOnAttachStateChangeListenerC648030PbN.LLJL;
        if (jCurrentTimeMillis3 <= j) {
            jCurrentTimeMillis3 = j;
        }
        ViewOnAttachStateChangeListenerC648030PbN.LLJL = jCurrentTimeMillis3;
        return viewOnAttachStateChangeListenerC648030PbN;
    }
}
