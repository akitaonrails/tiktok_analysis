package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12w7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19915712w7<K, V> extends AbstractC19916012wA implements InterfaceC19883512qv {
    public volatile boolean LIZ;
    public volatile EnumC19915812w8 LIZIZ;
    public C19883312qt<K, V> LIZJ;
    public List<InterfaceC19930912yZ> LIZLLL;
    public final InterfaceC19883612qw<K, V> LJ;

    public C19915712w7() {
        throw null;
    }

    public final void LIZIZ() {
        if (!this.LIZ) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map<K, V> LIZJ() {
        EnumC19915812w8 enumC19915812w8 = this.LIZIZ;
        EnumC19915812w8 enumC19915812w82 = EnumC19915812w8.LIST;
        if (enumC19915812w8 == enumC19915812w82) {
            synchronized (this) {
                try {
                    if (this.LIZIZ == enumC19915812w82) {
                        this.LIZJ = LIZ(this.LIZLLL);
                        this.LIZIZ = EnumC19915812w8.BOTH;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return Collections.unmodifiableMap(this.LIZJ);
    }

    public final int hashCode() {
        return C19914812vy.LIZ(LIZJ());
    }

    public final C19883312qt<K, V> LIZ(List<InterfaceC19930912yZ> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC19930912yZ interfaceC19930912yZ : list) {
            this.LJ.getClass();
            C19931412ye c19931412ye = (C19931412ye) interfaceC19930912yZ;
            linkedHashMap.put(c19931412ye.LLILLJJLI, c19931412ye.LLILLL);
        }
        return new C19883312qt<>(this, linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19915712w7)) {
            return false;
        }
        return C19914812vy.LJ(LIZJ(), ((C19915712w7) obj).LIZJ());
    }

    public C19915712w7(InterfaceC19883612qw interfaceC19883612qw, Map map) {
        EnumC19915812w8 enumC19915812w8 = EnumC19915812w8.MAP;
        this.LJ = interfaceC19883612qw;
        this.LIZ = true;
        this.LIZIZ = enumC19915812w8;
        this.LIZJ = new C19883312qt<>(this, map);
        this.LIZLLL = null;
    }
}
