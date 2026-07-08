package X;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12LR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LR {
    public static final String LIZIZ = C12LR.class.getSimpleName();
    public final EnumC19740012Le LIZ;

    public C12LR() {
        this(0);
    }

    public C12LR(int i) {
        this.LIZ = EnumC19740012Le.QUIET;
    }

    public static boolean LIZ(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.LJFF(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.LJFF(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean LIZIZ(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!LIZ((SidecarDisplayFeature) ListProtector.get(list, i), (SidecarDisplayFeature) ListProtector.get(list2, i))) {
                return false;
            }
        }
        return true;
    }

    public final C0N9B LIZJ(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C0N9B(C13BV.INSTANCE);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int iLIZ = C12LS.LIZ(sidecarDeviceState);
        if (iLIZ < 0 || iLIZ > 4) {
            iLIZ = 0;
        }
        C12LS.LIZJ(sidecarDeviceState2, iLIZ);
        return new C0N9B(LIZLLL(C12LS.LIZIZ(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final List<Object> LIZLLL(List<SidecarDisplayFeature> list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator<SidecarDisplayFeature> it2 = list.iterator();
        while (it2.hasNext()) {
            C19738612Kq c19738612KqLJ = LJ(it2.next(), sidecarDeviceState);
            if (c19738612KqLJ != null) {
                arrayList.add(c19738612KqLJ);
            }
        }
        return arrayList;
    }

    public final C19738612Kq LJ(final SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C19738812Ks c19738812Ks;
        C19380710s1 c19380710s1;
        final EnumC19740012Le enumC19740012Le = this.LIZ;
        final C19740212Lg c19740212Lg = new InterfaceC19740312Lh() { // from class: X.12Lg
            @Override // X.InterfaceC19740312Lh
            public final void LIZ() {
            }
        };
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new C12LU<T>(sidecarDisplayFeature, enumC19740012Le, c19740212Lg) { // from class: X.12LT
            public final T LIZIZ;
            public final String LIZJ;
            public final EnumC19740012Le LIZLLL;
            public final InterfaceC19740312Lh LJ;

            @Override // X.C12LU
            public final T LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C12LU
            public final C12LU<T> LIZIZ(final String str, Function1<? super T, Boolean> function1) {
                if (function1.invoke(this.LIZIZ).booleanValue()) {
                    return this;
                }
                final T t = this.LIZIZ;
                final String str2 = this.LIZJ;
                final InterfaceC19740312Lh interfaceC19740312Lh = this.LJ;
                final EnumC19740012Le enumC19740012Le2 = this.LIZLLL;
                return new C12LU<T>(t, str2, str, interfaceC19740312Lh, enumC19740012Le2) { // from class: X.12Lc
                    public final T LIZIZ;
                    public final String LIZJ;
                    public final InterfaceC19740312Lh LIZLLL;
                    public final EnumC19740012Le LJ;
                    public final C19740112Lf LJFF;

                    @Override // X.C12LU
                    public final C12LU<T> LIZIZ(String str3, Function1<? super T, Boolean> function12) {
                        return this;
                    }

                    @Override // X.C12LU
                    public final T LIZ() throws C19740112Lf {
                        int i = C19739912Ld.LIZ[this.LJ.ordinal()];
                        if (i == 1) {
                            throw this.LJFF;
                        }
                        if (i != 2) {
                            if (i != 3) {
                                throw new C1954807lC();
                            }
                            return null;
                        }
                        InterfaceC19740312Lh interfaceC19740312Lh2 = this.LIZLLL;
                        T t2 = this.LIZIZ;
                        String str3 = this.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str3);
                        sbLIZ.append(" value: ");
                        sbLIZ.append(t2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        interfaceC19740312Lh2.LIZ();
                        return null;
                    }

                    /* JADX WARN: Type inference failed for: r2v0, types: [X.12Lf, java.lang.Throwable] */
                    {
                        this.LIZIZ = t;
                        this.LIZJ = str;
                        this.LIZLLL = interfaceC19740312Lh;
                        this.LJ = enumC19740012Le2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(" value: ");
                        sbLIZ.append(t);
                        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        ?? r2 = new Exception(strLIZIZ) { // from class: X.12Lf
                        };
                        r2.setStackTrace((StackTraceElement[]) C13LQ.LJIJ(2, r2.getStackTrace()).toArray(new StackTraceElement[0]));
                        this.LJFF = r2;
                    }
                };
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                String str = C12LR.LIZIZ;
                this.LIZIZ = sidecarDisplayFeature;
                this.LIZJ = str;
                this.LIZLLL = enumC19740012Le;
                this.LJ = c19740212Lg;
            }
        }.LIZIZ("Type must be either TYPE_FOLD or TYPE_HINGE", new C12LZ()).LIZIZ("Feature bounds must not be 0", new C12LW()).LIZIZ("TYPE_FOLD must have 0 area", new C12LV()).LIZIZ("Feature be pinned to either left or top", new C12LX()).LIZ();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            c19738812Ks = C19738812Ks.LIZJ;
        } else {
            c19738812Ks = C19738812Ks.LIZIZ;
        }
        int iLIZ = C12LS.LIZ(sidecarDeviceState);
        if (iLIZ < 0 || iLIZ > 4 || iLIZ == 0 || iLIZ == 1) {
            return null;
        }
        if (iLIZ != 2) {
            if (iLIZ != 3) {
                return null;
            }
            c19380710s1 = C19380710s1.LIZIZ;
        } else {
            c19380710s1 = C19380710s1.LIZJ;
        }
        return new C19738612Kq(new C19738512Kp(sidecarDisplayFeature.getRect()), c19738812Ks, c19380710s1);
    }
}
