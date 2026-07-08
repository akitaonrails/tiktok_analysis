package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ymi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884380Ymi {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final List<Class<?>> LIZJ;
    public final Function1<List<InterfaceC884440Ymo>, List<InterfaceC884440Ymo>> LIZLLL;
    public final InterfaceC879010Ye3 LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final InterfaceC884800YnO LJIIIZ;

    public C884380Ymi(boolean z, List list, C0Z8W c0z8w, C878950Ydx c878950Ydx, int i, int i2, boolean z2, C0Z79 c0z79, int i3) {
        list = (i3 & 4) != 0 ? C13BV.INSTANCE : list;
        c0z8w = (i3 & 8) != 0 ? null : c0z8w;
        c878950Ydx = (i3 & 16) != 0 ? null : c878950Ydx;
        i = (i3 & 32) != 0 ? Integer.MIN_VALUE : i;
        i2 = (i3 & 64) != 0 ? Integer.MIN_VALUE : i2;
        z2 = (i3 & 128) != 0 ? false : z2;
        c0z79 = (i3 & 512) != 0 ? null : c0z79;
        this.LIZ = z;
        this.LIZIZ = false;
        this.LIZJ = list;
        this.LIZLLL = c0z8w;
        this.LJ = c878950Ydx;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = z2;
        this.LJIIIIZZ = false;
        this.LJIIIZ = c0z79;
    }
}
