package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EDQ {
    public final ResourceItem LIZ;
    public EnumC361070EDp LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EDQ)) {
            return false;
        }
        C0EDQ c0edq = (C0EDQ) obj;
        return Intrinsics.LJFF(this.LIZ, c0edq.LIZ) && this.LIZIZ == c0edq.LIZIZ && this.LIZJ == c0edq.LIZJ && this.LIZLLL == c0edq.LIZLLL && this.LJ == c0edq.LJ && this.LJFF == c0edq.LJFF;
    }

    public C0EDQ(ResourceItem resourceItem, int i) {
        EnumC361070EDp enumC361070EDp;
        boolean z;
        if ((i & 2) != 0) {
            enumC361070EDp = EnumC361070EDp.INIT;
        } else {
            enumC361070EDp = null;
        }
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = resourceItem;
        this.LIZIZ = enumC361070EDp;
        this.LIZJ = false;
        this.LIZLLL = 0;
        this.LJ = z;
        this.LJFF = false;
    }
}
