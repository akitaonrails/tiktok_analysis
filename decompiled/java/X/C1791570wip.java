package X;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0wip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791570wip implements InterfaceC1791580wiq {
    public final InterfaceC1790340wgq LIZIZ = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJIIIZ;
    public final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();

    public final <T> T LIZ(Class<T> cls) {
        T t = (T) this.LIZ.get(cls);
        if (t == null) {
            InterfaceC1790340wgq interfaceC1790340wgq = this.LIZIZ;
            String str = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJII;
            if (TextUtils.isEmpty(str)) {
                str = "https://webcast.tiktokv.com";
            }
            T t2 = (T) interfaceC1790340wgq.LIZ(cls, str);
            this.LIZ.putIfAbsent(cls, t2);
            return t2;
        }
        return t;
    }
}
