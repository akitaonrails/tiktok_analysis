package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13DN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13DN<T> extends AbstractC19973513Cz<T> {
    public abstract C13DO<T> LIZJ(T t);

    public C13DN(Function0<? extends T> function0) {
        super(function0);
    }

    @Override // X.AbstractC19973513Cz
    public final InterfaceC19973313Cx<T> LIZIZ(C13DO<T> c13do, InterfaceC19973313Cx<T> interfaceC19973313Cx) {
        if (interfaceC19973313Cx instanceof C13DM) {
            if (c13do.LJFF) {
                C13DM c13dm = (C13DM) interfaceC19973313Cx;
                c13dm.LIZ.setValue(c13do.LIZ());
                return c13dm;
            }
        } else if (interfaceC19973313Cx instanceof C19973213Cw) {
            if ((c13do.LIZIZ || c13do.LJI != null) && !c13do.LJFF) {
                C19973213Cw c19973213Cw = (C19973213Cw) interfaceC19973313Cx;
                if (Intrinsics.LJFF(c13do.LIZ(), c19973213Cw.LIZ)) {
                    return c19973213Cw;
                }
            }
        } else if (interfaceC19973313Cx instanceof C13D1) {
            C13D1 c13d1 = (C13D1) interfaceC19973313Cx;
            if (c13do.LJ == c13d1.LIZ) {
                return c13d1;
            }
        }
        if (c13do.LJFF) {
            C05P0 parcelableSnapshotMutableState = c13do.LIZLLL;
            if (parcelableSnapshotMutableState == null) {
                T t = c13do.LJI;
                C13FF c13ff = c13do.LIZJ;
                if (c13ff == null) {
                    c13ff = C595410NWx.LIZ;
                }
                parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(t, c13ff);
            }
            return new C13DM(parcelableSnapshotMutableState);
        }
        Function1<InterfaceC1670270tZB, T> function1 = c13do.LJ;
        if (function1 != null) {
            return new C13D1(function1);
        }
        C05P0<T> c05p0 = c13do.LIZLLL;
        if (c05p0 != null) {
            return new C13DM(c05p0);
        }
        return new C19973213Cw(c13do.LIZ());
    }
}
