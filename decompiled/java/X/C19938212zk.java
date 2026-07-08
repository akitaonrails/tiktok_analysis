package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19938212zk {
    public final List<C19929612yM> LIZ;
    public EnumC19907712up LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int[] LJ;
    public InterfaceC19930912yZ LJFF;

    public C19938212zk(int i) {
        this.LIZ = new ArrayList(i);
    }

    public final void LIZ(C19929612yM c19929612yM) {
        if (!this.LIZJ) {
            ((ArrayList) this.LIZ).add(c19929612yM);
            return;
        }
        throw new IllegalStateException("Builder can only build once");
    }
}
