package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.15Y9, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15Y9 implements C15XY {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(376));

    public final C15Z2 LJIIIZ() {
        return (C15Z2) this.LIZ.getValue();
    }

    @Override // X.C15XY
    public final Boolean LIZ(C15YM c15ym) {
        c15ym.getType();
        C15Z2 c15z2LJIIIZ = LJIIIZ();
        String key = c15ym.getKey();
        c15z2LJIIIZ.getClass();
        if (C15Z2.LIZ(key)) {
            C15Z2 c15z2LJIIIZ2 = LJIIIZ();
            String key2 = c15ym.getKey();
            c15z2LJIIIZ2.getClass();
            return Boolean.valueOf(C15Z2.LIZIZ().getBoolean(key2, false));
        }
        return null;
    }

    @Override // X.C15XY
    public final Integer LIZLLL(C15YM c15ym) {
        c15ym.getType();
        C15Z2 c15z2LJIIIZ = LJIIIZ();
        String key = c15ym.getKey();
        c15z2LJIIIZ.getClass();
        if (C15Z2.LIZ(key)) {
            C15Z2 c15z2LJIIIZ2 = LJIIIZ();
            String key2 = c15ym.getKey();
            c15z2LJIIIZ2.getClass();
            return Integer.valueOf(C15Z2.LIZIZ().getInt(key2, -1));
        }
        return null;
    }

    @Override // X.C15XY
    public final b LJ(C15YM c15ym) {
        c15ym.getType();
        C15Z2 c15z2LJIIIZ = LJIIIZ();
        String key = c15ym.getKey();
        c15z2LJIIIZ.getClass();
        return C09IC.LJ(new C165J(key, null));
    }

    @Override // X.C15XY
    public final Long LJFF(EnumC20536615Xo enumC20536615Xo) {
        enumC20536615Xo.getType();
        C15Z2 c15z2LJIIIZ = LJIIIZ();
        String key = enumC20536615Xo.getKey();
        c15z2LJIIIZ.getClass();
        if (C15Z2.LIZ(key)) {
            C15Z2 c15z2LJIIIZ2 = LJIIIZ();
            String key2 = enumC20536615Xo.getKey();
            c15z2LJIIIZ2.getClass();
            return Long.valueOf(C15Z2.LIZIZ().getLong(key2, -1L));
        }
        return null;
    }

    @Override // X.C15XY
    public final b LJII(C15YM c15ym) {
        c15ym.getType();
        C15Z2 c15z2LJIIIZ = LJIIIZ();
        String key = c15ym.getKey();
        c15z2LJIIIZ.getClass();
        return C09IC.LJ(new C165K(key, null));
    }

    @Override // X.C15XY
    public final C20308414dG LIZIZ(C15Y5 c15y5, Type type) {
        c15y5.getType();
        C15Z2 c15z2LJIIIZ = LJIIIZ();
        String key = c15y5.getKey();
        c15z2LJIIIZ.getClass();
        return new C20308414dG(type, C09IC.LJ(new C165L(key, null)), 0);
    }

    @Override // X.C15XY
    public final Object LIZJ(EnumC20536615Xo enumC20536615Xo, Type type) {
        enumC20536615Xo.getType();
        C15Z2 c15z2LJIIIZ = LJIIIZ();
        String key = enumC20536615Xo.getKey();
        c15z2LJIIIZ.getClass();
        String string = C15Z2.LIZIZ().getString(key, "");
        try {
            C1227904rF.LIZ.getClass();
            return C1227904rF.LIZJ(string, type);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C15XY
    public final C20308414dG LJI(C15YM c15ym, Class cls) {
        c15ym.getType();
        C15Z2 c15z2LJIIIZ = LJIIIZ();
        String key = c15ym.getKey();
        c15z2LJIIIZ.getClass();
        return new C20308414dG(cls, C09IC.LJ(new C165L(key, null)), 1);
    }

    @Override // X.C15XY
    public final Object LJIIIIZZ(EnumC20536615Xo enumC20536615Xo, Class cls) {
        Object c098200Yq;
        enumC20536615Xo.getType();
        C15Z2 c15z2LJIIIZ = LJIIIZ();
        String key = enumC20536615Xo.getKey();
        c15z2LJIIIZ.getClass();
        try {
            c098200Yq = new Gson().LJII(C15Z2.LIZIZ().getString(key, ""), cls);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            return c098200Yq;
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return null;
    }
}
