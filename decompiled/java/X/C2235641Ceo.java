package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1Ceo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235641Ceo {
    public final C967180bHA LIZ;
    public final EnumC2235671Cer LIZIZ;
    public final long LIZJ;
    public final C2235661Ceq LIZLLL;
    public final String LJ;
    public final List<C2284081Eak> LJFF;

    public final C2235941CfI LIZ() {
        C2232021CXo c2232021CXoLIZ = this.LIZ.LIZ();
        EnumC2231981CXk enumC2231981CXkInto = this.LIZIZ.into();
        Long lValueOf = Long.valueOf(this.LIZJ);
        Boolean bool = Boolean.TRUE;
        C2235661Ceq c2235661Ceq = this.LIZLLL;
        c2235661Ceq.getClass();
        Long lValueOf2 = Long.valueOf(c2235661Ceq.LIZ);
        Long lValueOf3 = Long.valueOf(c2235661Ceq.LIZIZ);
        String str = c2235661Ceq.LIZJ;
        c2235661Ceq.LIZLLL.getClass();
        C2236001CfO c2236001CfO = new C2236001CfO(lValueOf2, lValueOf3, str, new C1CNZ(""), Long.valueOf(c2235661Ceq.LJ));
        String str2 = this.LJ;
        List<C2284081Eak> list = this.LJFF;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C2284081Eak> it2 = list.iterator();
        if (!it2.hasNext()) {
            return new C2235941CfI("", c2232021CXoLIZ, enumC2231981CXkInto, lValueOf, bool, c2236001CfO, str2, arrayList);
        }
        it2.next().getClass();
        throw null;
    }

    public C2235641Ceo(C967180bHA c967180bHA, EnumC2235671Cer enumC2235671Cer, long j, C2235661Ceq c2235661Ceq, String str, C13BV c13bv) {
        this.LIZ = c967180bHA;
        this.LIZIZ = enumC2235671Cer;
        this.LIZJ = j;
        this.LIZLLL = c2235661Ceq;
        this.LJ = str;
        this.LJFF = c13bv;
    }
}
