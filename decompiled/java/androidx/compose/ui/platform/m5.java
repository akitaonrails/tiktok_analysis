package androidx.compose.ui.platform;

import X.C054G;
import X.C05YD;
import X.C05YW;
import X.C08D5;
import X.C095D;
import X.C095G;
import X.C099V;
import X.C09IC;
import X.C0WX3;
import X.C1370905Yd;
import X.C13Y1;
import X.C13Z1;
import X.C1696250uF5;
import X.C1791230wiH;
import X.C1791250wiJ;
import X.C1838610xwh;
import X.C1838650xwl;
import X.C1838660xwm;
import X.C189200o6;
import X.C1DEK;
import X.C2145408aq;
import X.C2188811AlT;
import X.C2197108jB;
import X.C2296808zG;
import X.C23250099c;
import X.C23271099x;
import X.C259800zU;
import X.InterfaceC1364105Vn;
import X.InterfaceC1677690tl9;
import X.InterfaceC1838630xwj;
import X.InterfaceC23139094v;
import X.ViewOnAttachStateChangeListenerC1864720yco;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes28.dex */
public final class m5 {
    public static final Map<Context, C05YD<Float>> LIZ = new LinkedHashMap();

    public static final C13Z1 LIZJ(View view) {
        Object tag = view.getTag(R.id.b3h);
        if (tag instanceof C13Z1) {
            return (C13Z1) tag;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0WX4] */
    public static final C05YD<Float> getAnimationScaleFlowFor(Context context) {
        C05YD<Float> c05yd;
        Map<Context, C05YD<Float>> map = LIZ;
        synchronized (map) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                Object objLJJIJIL = linkedHashMap.get(context);
                if (objLJJIJIL == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    final C1DEK c1dekLIZ = C095G.LIZ(-1, null, 6);
                    final Handler handlerLIZ = C08D5.LIZ(Looper.getMainLooper());
                    objLJJIJIL = C09IC.LJJIJIL(new C095D(new C0WX3(contentResolver, uriFor, new ContentObserver(handlerLIZ) { // from class: X.0WX4
                        @Override // android.database.ContentObserver
                        public final void onChange(boolean z, Uri uri) {
                            c1dekLIZ.LJIIIIZZ(Unit.LIZ);
                        }
                    }, c1dekLIZ, context, null)), C2296808zG.LIZIZ(), C1370905Yd.LIZ(C05YW.LIZ, 0L, 3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objLJJIJIL);
                }
                c05yd = (C05YD) objLJJIJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c05yd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, X.0xwm] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final C13Y1 LIZIZ(final View view, CoroutineContext coroutineContext, Lifecycle lifecycle) {
        CoroutineContext coroutineContext2;
        LifecycleOwner lifecycleOwner;
        if (coroutineContext.get(InterfaceC23139094v.LJJLIIJ) == null || coroutineContext.get(InterfaceC1838630xwj.LIZJ) == null) {
            coroutineContext = C1838610xwh.LIZ().plus(coroutineContext);
        }
        InterfaceC1838630xwj interfaceC1838630xwj = (InterfaceC1838630xwj) coroutineContext.get(InterfaceC1838630xwj.LIZJ);
        final C1838650xwl c1838650xwl = null;
        if (interfaceC1838630xwj != null) {
            c1838650xwl = new C1838650xwl(interfaceC1838630xwj);
            C1791250wiJ c1791250wiJ = c1838650xwl.LLILLJJLI;
            synchronized (c1791250wiJ.LIZ) {
                try {
                    c1791250wiJ.LIZLLL = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        final C259800zU c259800zU = new C259800zU();
        CoroutineContext.Element element = coroutineContext.get(InterfaceC1677690tl9.LJLJJI);
        ?? r1 = element;
        if (element == null) {
            ?? c1838660xwm = new C1838660xwm();
            c259800zU.element = c1838660xwm;
            r1 = c1838660xwm;
        }
        if (c1838650xwl != null) {
            coroutineContext2 = c1838650xwl;
        } else {
            coroutineContext2 = C23271099x.INSTANCE;
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2).plus(r1);
        final C13Y1 c13y1 = new C13Y1(coroutineContextPlus);
        c13y1.LJJIJ();
        final C054G c054gLIZ = C2296808zG.LIZ(coroutineContextPlus);
        if (lifecycle != null || ((lifecycleOwner = ViewTreeLifecycleOwner.get(view)) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null)) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1864720yco(view, c13y1, 0));
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    int i = C2145408aq.LIZ[event.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    c13y1.LJJII();
                                    return;
                                }
                                return;
                            }
                            c13y1.LJJIJ();
                            return;
                        }
                        C1838650xwl c1838650xwl2 = c1838650xwl;
                        if (c1838650xwl2 != null) {
                            C1791250wiJ c1791250wiJ2 = c1838650xwl2.LLILLJJLI;
                            synchronized (c1791250wiJ2.LIZ) {
                                try {
                                    if (!c1791250wiJ2.LIZ()) {
                                        List<InterfaceC1364105Vn<Unit>> list = c1791250wiJ2.LIZIZ;
                                        c1791250wiJ2.LIZIZ = c1791250wiJ2.LIZJ;
                                        c1791250wiJ2.LIZJ = list;
                                        c1791250wiJ2.LIZLLL = true;
                                        int size = list.size();
                                        for (int i2 = 0; i2 < size; i2++) {
                                            InterfaceC1364105Vn<Unit> interfaceC1364105Vn = list.get(i2);
                                            Unit unit = Unit.LIZ;
                                            C189200o6.m2constructorimpl(unit);
                                            interfaceC1364105Vn.resumeWith(unit);
                                        }
                                        list.clear();
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }
                        c13y1.LJJIZ();
                        return;
                    }
                    C23250099c.LIZLLL(c054gLIZ, null, C099V.UNDISPATCHED, new C1791230wiH(c259800zU, c13y1, lifecycleOwner2, this, view, null), 1);
                }
            });
            return c13y1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewTreeLifecycleOwner not found from ");
        sbLIZ.append(view);
        C1696250uF5.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        throw new C2197108jB();
    }
}
