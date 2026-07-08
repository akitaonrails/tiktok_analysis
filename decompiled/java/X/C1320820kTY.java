package X;

import android.content.Context;
import android.content.res.Resources;
import java.util.Set;

/* JADX INFO: renamed from: X.0kTY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320820kTY implements InterfaceC1320070kSL<C1320810kTX> {
    public final Context LIZ;
    public final C1325540kbA LIZIZ;
    public final C1320830kTZ LIZJ;
    public final Set<InterfaceC1320650kTH> LIZLLL;

    public C1320820kTY() {
        throw null;
    }

    @Override // X.InterfaceC1320070kSL
    public final C1320810kTX get() {
        return new C1320810kTX(this.LIZ, this.LIZJ, this.LIZIZ, this.LIZLLL);
    }

    public C1320820kTY(Context context, C1320860kTc c1320860kTc) {
        C1320560kT8 c1320560kT8;
        C1320890kTf c1320890kTf;
        Set<InterfaceC1320650kTH> set;
        C1328130kfL c1328130kfLLJIILIIL = C1328130kfL.LJIILIIL();
        this.LIZ = context;
        C1325540kbA c1325540kbALJIIL = c1328130kfLLJIILIIL.LJIIL();
        this.LIZIZ = c1325540kbALJIIL;
        C1320830kTZ c1320830kTZ = new C1320830kTZ();
        this.LIZJ = c1320830kTZ;
        Resources resources = context.getResources();
        C1320560kT8 c1320560kT82 = C1320560kT8.LIZLLL;
        synchronized (C1320560kT8.class) {
            if (C1320560kT8.LIZLLL == null) {
                C1320560kT8.LIZLLL = new C1320560kT8();
            }
            c1320560kT8 = C1320560kT8.LIZLLL;
        }
        InterfaceC1320130kSR interfaceC1320130kSRLIZIZ = c1328130kfLLJIILIIL.LIZIZ(context);
        C822690WPb c822690WPbLIZ = C822690WPb.LIZ();
        InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> interfaceC1325150kaX = c1325540kbALJIIL.LIZLLL;
        if (c1320860kTc != null) {
            c1320890kTf = c1320860kTc.LIZ;
            set = c1320860kTc.LIZIZ;
        } else {
            c1320890kTf = null;
            set = null;
        }
        c1320830kTZ.LIZ = resources;
        c1320830kTZ.LIZIZ = c1320560kT8;
        c1320830kTZ.LIZJ = interfaceC1320130kSRLIZIZ;
        c1320830kTZ.LIZLLL = c822690WPbLIZ;
        c1320830kTZ.LJ = interfaceC1325150kaX;
        c1320830kTZ.LJFF = null;
        c1320830kTZ.LJI = c1320890kTf;
        c1320830kTZ.LJII = set;
        this.LIZLLL = null;
    }
}
