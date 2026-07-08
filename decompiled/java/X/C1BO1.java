package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.plugins.HtmlPlugin;
import com.bytedance.pia.core.plugins.ManifestPlugin;
import com.bytedance.pia.core.plugins.RenderingPlugin;
import com.bytedance.pia.core.setting.Config;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1BO1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BO1 implements InterfaceC1549430qQH {
    public static final Map<String, C2204041BNy> LIZ = new HashMap();

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0qQJ] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0qQI] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1BOB] */
    @Override // X.InterfaceC1549430qQH
    public final C1BOB LIZ(String str, Map map, final C602190Njd c602190Njd, final C1549400qQE c1549400qQE) {
        if (!C2203961BNq.LIZ().isCacheEnabled) {
            c1549400qQE.accept(new C1BOJ());
            return null;
        }
        if (str == null) {
            c1549400qQE.accept(new C1BOJ());
            return null;
        }
        Config configLIZ = Config.LIZ(UriProtector.parse(str));
        if (configLIZ != null && configLIZ.LIZIZ().contains("nsr")) {
            C1BOK.LIZ.getClass();
            C2204041BNy c2204041BNyLIZ = C2204011BNv.LIZ(str, "HybridKit", null, configLIZ, false);
            if (c2204041BNyLIZ == null) {
                c1549400qQE.accept(new C2204191BOn("Create runtime error!"));
                return null;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final String string = c2204041BNyLIZ.toString();
            ((HashMap) LIZ).put(string, c2204041BNyLIZ);
            final ?? r4 = new InterfaceC1542530qF9() { // from class: X.1BOB
                @Override // X.InterfaceC1542530qF9
                public final void release() {
                    C1BOC c1boc;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = string;
                    if (!atomicBoolean2.compareAndSet(false, true) || (c1boc = (C1BOC) ((HashMap) C1BO1.LIZ).remove(str2)) == null) {
                        return;
                    }
                    c1boc.release();
                }
            };
            ?? r3 = new InterfaceC1530550pvp() { // from class: X.0qQI
                @Override // X.InterfaceC1530550pvp
                public final void accept(Object obj) {
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    InterfaceC1542530qF9 interfaceC1542530qF9 = r4;
                    InterfaceC1530550pvp interfaceC1530550pvp = c602190Njd;
                    if (atomicBoolean2.compareAndSet(false, true)) {
                        interfaceC1542530qF9.release();
                        if (interfaceC1530550pvp != null) {
                            interfaceC1530550pvp.accept(obj);
                        }
                    }
                }
            };
            ?? r2 = new InterfaceC1530550pvp() { // from class: X.0qQJ
                @Override // X.InterfaceC1530550pvp
                public final void accept(Object obj) {
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    InterfaceC1542530qF9 interfaceC1542530qF9 = r4;
                    InterfaceC1530550pvp interfaceC1530550pvp = c1549400qQE;
                    if (atomicBoolean2.compareAndSet(false, true)) {
                        interfaceC1542530qF9.release();
                        if (interfaceC1530550pvp != null) {
                            interfaceC1530550pvp.accept(obj);
                        }
                    }
                }
            };
            c2204041BNyLIZ.LJIIIIZZ(HtmlPlugin.class, null);
            c2204041BNyLIZ.LJIIIIZZ(ManifestPlugin.class, null);
            c2204041BNyLIZ.LJIIIIZZ(RenderingPlugin.class, new C1BO8(map, r3, r2));
            c2204041BNyLIZ.LJII();
            return r4;
        }
        c1549400qQE.accept(new C1BOJ());
        return null;
    }
}
