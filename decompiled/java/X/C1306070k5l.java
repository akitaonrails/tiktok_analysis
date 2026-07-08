package X;

import android.os.Build;
import com.bytedance.android.starship.engine.event.Event;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: X.0k5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306070k5l implements InterfaceC860430XpB {
    public static final C1306070k5l LIZ = new C1306070k5l();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final ConcurrentHashMap<String, C05YC<Event>> LIZJ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC860430XpB
    public final InterfaceC346201Wa<Event> LIZIZ(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return LIZJ.computeIfAbsent(str, new Function() { // from class: X.0k5m
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C09IR.LIZIZ(0, 0, null, 7);
                }
            });
        }
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        C05YC<Event> c05ycPutIfAbsent = LIZJ.putIfAbsent(str, c2252331DDrLIZIZ);
        if (c05ycPutIfAbsent != null) {
            return c05ycPutIfAbsent;
        }
        return c2252331DDrLIZIZ;
    }
}
