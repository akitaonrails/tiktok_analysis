package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.13LE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LE {
    public static final C09R3 LIZ;
    public static final C13IQ[] LIZIZ;

    static {
        C09R3 c09r3;
        try {
            c09r3 = (C09R3) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (IllegalAccessException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (InstantiationException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        if (c09r3 == null) {
            c09r3 = new C09R3();
        }
        LIZ = c09r3;
        LIZIZ = new C13IQ[0];
    }

    public static C19719912Dl LIZ(Class cls) {
        LIZ.getClass();
        return new C19719912Dl(cls);
    }

    public static C13IQ[] LIZIZ(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return LIZIZ;
        }
        C13IQ[] c13iqArr = new C13IQ[length];
        int i = 0;
        do {
            c13iqArr[i] = LIZ(clsArr[i]);
            i++;
        } while (i < length);
        return c13iqArr;
    }

    public static C13JW LIZJ(C13JW c13jw) {
        LIZ.getClass();
        return new C13JW(c13jw.LL, c13jw.LLILLJJLI, c13jw.LLILLL, c13jw.LLILZ | 2);
    }

    public static void LIZLLL(C2217371BqR c2217371BqR) {
        LIZ.getClass();
    }

    public static C13JW LJ(Class cls) {
        C09R3 c09r3 = LIZ;
        C19719912Dl c19719912DlLIZ = LIZ(cls);
        List listEmptyList = Collections.emptyList();
        c09r3.getClass();
        return C09R3.LIZIZ(c19719912DlLIZ, listEmptyList, true);
    }

    public static C13JW LJII(Class cls) {
        C09R3 c09r3 = LIZ;
        C19719912Dl c19719912DlLIZ = LIZ(cls);
        List listEmptyList = Collections.emptyList();
        c09r3.getClass();
        return C09R3.LIZIZ(c19719912DlLIZ, listEmptyList, false);
    }

    public static C13JW LJFF(Class cls, KTypeProjection kTypeProjection) {
        C09R3 c09r3 = LIZ;
        C19719912Dl c19719912DlLIZ = LIZ(cls);
        List listSingletonList = Collections.singletonList(kTypeProjection);
        c09r3.getClass();
        return C09R3.LIZIZ(c19719912DlLIZ, listSingletonList, true);
    }

    public static C13JW LJIIIIZZ(Class cls, KTypeProjection kTypeProjection) {
        C09R3 c09r3 = LIZ;
        C19719912Dl c19719912DlLIZ = LIZ(cls);
        List listSingletonList = Collections.singletonList(kTypeProjection);
        c09r3.getClass();
        return C09R3.LIZIZ(c19719912DlLIZ, listSingletonList, false);
    }

    public static C13JW LJI(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        C09R3 c09r3 = LIZ;
        C19719912Dl c19719912DlLIZ = LIZ(cls);
        List listAsList = Arrays.asList(kTypeProjection, kTypeProjection2);
        c09r3.getClass();
        return C09R3.LIZIZ(c19719912DlLIZ, listAsList, true);
    }

    public static C13JW LJIIIZ(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        C09R3 c09r3 = LIZ;
        C19719912Dl c19719912DlLIZ = LIZ(cls);
        List listAsList = Arrays.asList(kTypeProjection, kTypeProjection2);
        c09r3.getClass();
        return C09R3.LIZIZ(c19719912DlLIZ, listAsList, false);
    }
}
