package X;

import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479060oam<T> {
    public final String LIZ;
    public final T LIZIZ;
    public final Type LIZJ;
    public final boolean LIZLLL;

    public final T LIZ() {
        String str = this.LIZ;
        InterfaceC1479880oc6 interfaceC1479880oc6 = new InterfaceC1479880oc6() { // from class: X.0oao
            @Override // X.InterfaceC1479880oc6
            public final /* synthetic */ Object LIZ() {
                return null;
            }

            @Override // X.InterfaceC1479880oc6
            public final Object get() {
                C1479060oam c1479060oam = this.LIZ;
                return C1305910k5V.LIZ(c1479060oam.LIZ, c1479060oam.LIZJ);
            }
        };
        InterfaceC1479880oc6 interfaceC1479880oc62 = new InterfaceC1479880oc6() { // from class: X.0oan
            @Override // X.InterfaceC1479880oc6
            public final /* synthetic */ Object LIZ() {
                return null;
            }

            @Override // X.InterfaceC1479880oc6
            public final Object get() {
                C1479060oam c1479060oam = this.LIZ;
                c1479060oam.getClass();
                return PlayerSettingService.getInstance().get(c1479060oam.LIZ, c1479060oam.LIZJ, c1479060oam.LIZIZ, true, c1479060oam.LIZLLL);
            }
        };
        ((ConcurrentHashMap) C1305910k5V.LIZJ).put(str, interfaceC1479880oc6);
        ((ConcurrentHashMap) C1305910k5V.LIZLLL).put(str, interfaceC1479880oc62);
        T t = (T) C1305910k5V.LIZ(this.LIZ, this.LIZJ);
        if (t != null) {
            PlayerSettingService.isDebug();
            return t;
        }
        if (PlayerSettingService.getInstance() != null) {
            T t2 = (T) PlayerSettingService.getInstance().get(this.LIZ, this.LIZJ, this.LIZIZ, true, this.LIZLLL);
            PlayerSettingService.isDebug();
            return t2;
        }
        if (PlayerSettingService.isDebug()) {
            throw new RuntimeException("Call getValue before PlayerSettingService init");
        }
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1479060oam(Object obj, String str, boolean z) {
        Class<?> cls = obj.getClass();
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = cls;
        this.LIZLLL = z;
    }
}
