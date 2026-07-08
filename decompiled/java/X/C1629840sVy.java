package X;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629840sVy<DATA> {
    public final DATA LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Bundle LJI;
    public final InterfaceC1625560sP4 LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1629840sVy(Object obj, int i, int i2, boolean z, boolean z2, Bundle bundle, InterfaceC1625560sP4 interfaceC1625560sP4, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252, int i3) {
        boolean z3;
        if ((i3 & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z = (i3 & 16) != 0 ? false : z;
        z2 = (i3 & 32) != 0 ? false : z2;
        bundle = (i3 & 64) != 0 ? null : bundle;
        interfaceC1625560sP4 = (i3 & 128) != 0 ? null : interfaceC1625560sP4;
        awS569S0100000_25 = (i3 & 256) != 0 ? null : awS569S0100000_25;
        awS569S0100000_252 = (i3 & 512) != 0 ? null : awS569S0100000_252;
        this.LIZ = obj;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z3;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = bundle;
        this.LJII = interfaceC1625560sP4;
        this.LJIIIIZZ = awS569S0100000_25;
        this.LJIIIZ = awS569S0100000_252;
    }
}
