package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* JADX INFO: renamed from: X.13Bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19970213Bs extends AbstractC19987313Ih {
    public final C13BE LJI;
    public final int LJII;
    public int LJIIIIZZ;

    @Override // X.AbstractC19987313Ih
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd LJJJJLI() {
        return this.LJI;
    }

    @Override // X.InterfaceC19986313Hx
    public final int LJIJJ(InterfaceC19983313Gt interfaceC19983313Gt) {
        int i = this.LJIIIIZZ;
        if (i < this.LJII - 1) {
            int i2 = i + 1;
            this.LJIIIIZZ = i2;
            return i2;
        }
        return -1;
    }

    @Override // X.AbstractC19987313Ih
    public final AbstractC19979113Fd LJJJJJL(String str) {
        C13BE c13be = this.LJI;
        return (AbstractC19979113Fd) ListProtector.get(c13be.LL, CastIntegerProtector.parseInt(str));
    }

    public C19970213Bs(AbstractC19987213Ig abstractC19987213Ig, C13BE c13be) {
        super(abstractC19987213Ig, c13be, null);
        this.LJI = c13be;
        this.LJII = c13be.size();
        this.LJIIIIZZ = -1;
    }

    @Override // X.C13J3
    public final String LJJJJIZL(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return String.valueOf(i);
    }
}
