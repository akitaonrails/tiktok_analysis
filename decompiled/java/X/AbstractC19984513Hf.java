package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.13Hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19984513Hf<Tag> implements C13HB, InterfaceC19986313Hx {
    public final ArrayList<Tag> LIZIZ = new ArrayList<>();
    public boolean LIZJ;

    @Override // X.C13HB
    public abstract Object LIZLLL(InterfaceC19984213Hc interfaceC19984213Hc);

    @Override // X.C13HB
    public final void LJIJI() {
    }

    @Override // X.InterfaceC19986313Hx
    public final /* synthetic */ void LJJII() {
    }

    public abstract boolean LJJIJ(Tag tag);

    public abstract byte LJJIJIIJI(Tag tag);

    public abstract char LJJIJIIJIL(Tag tag);

    public abstract double LJJIJIL(Tag tag);

    public abstract int LJJIJL(Tag tag, InterfaceC19983313Gt interfaceC19983313Gt);

    public abstract float LJJIJLIJ(Tag tag);

    public abstract C13HB LJJIL(Tag tag, InterfaceC19983313Gt interfaceC19983313Gt);

    public abstract int LJJIZ(Tag tag);

    public abstract long LJJJ(Tag tag);

    public abstract short LJJJI(Tag tag);

    public abstract String LJJJIL(Tag tag);

    public abstract Tag LJJJJ(InterfaceC19983313Gt interfaceC19983313Gt, int i);

    public final Tag LJJJJI() {
        ArrayList<Tag> arrayList = this.LIZIZ;
        Tag tag = (Tag) ListProtector.remove(arrayList, C1697810uHb.LJIIJ(arrayList));
        this.LIZJ = true;
        return tag;
    }

    @Override // X.C13HB
    public final double LJ() {
        return LJJIJIL(LJJJJI());
    }

    @Override // X.C13HB
    public final short LJIIL() {
        return LJJJI(LJJJJI());
    }

    @Override // X.C13HB
    public final String LJIILJJIL() {
        return LJJJIL(LJJJJI());
    }

    @Override // X.C13HB
    public final boolean LJIILLIIL() {
        return LJJIJ(LJJJJI());
    }

    @Override // X.C13HB
    public final byte LJJI() {
        return LJJIJIIJI(LJJJJI());
    }

    @Override // X.C13HB
    public final long LJJIFFI() {
        return LJJJ(LJJJJI());
    }

    @Override // X.C13HB
    public final char LJJIII() {
        return LJJIJIIJIL(LJJJJI());
    }

    @Override // X.C13HB
    public final int LJJIIZ() {
        return LJJIZ(LJJJJI());
    }

    @Override // X.C13HB
    public final float LJJIIZI() {
        return LJJIJLIJ(LJJJJI());
    }

    @Override // X.C13HB
    public final int LJIILIIL(InterfaceC19983313Gt interfaceC19983313Gt) {
        return LJJIJL(LJJJJI(), interfaceC19983313Gt);
    }

    @Override // X.C13HB
    public C13HB LJJIIJZLJL(InterfaceC19983313Gt interfaceC19983313Gt) {
        return LJJIL(LJJJJI(), interfaceC19983313Gt);
    }

    @Override // X.InterfaceC19986313Hx
    public final double LIZJ(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJJIJIL(LJJJJ(interfaceC19983313Gt, i));
    }

    @Override // X.InterfaceC19986313Hx
    public final boolean LJFF(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJJIJ(LJJJJ(interfaceC19983313Gt, i));
    }

    @Override // X.InterfaceC19986313Hx
    public final C13HB LJII(C19980213Fo c19980213Fo, int i) {
        return LJJIL(LJJJJ(c19980213Fo, i), c19980213Fo.LJIIIIZZ(i));
    }

    @Override // X.InterfaceC19986313Hx
    public final long LJIIIIZZ(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJJJ(LJJJJ(interfaceC19983313Gt, i));
    }

    @Override // X.InterfaceC19986313Hx
    public final short LJIIJ(C19980213Fo c19980213Fo, int i) {
        return LJJJI(LJJJJ(c19980213Fo, i));
    }

    @Override // X.InterfaceC19986313Hx
    public final String LJIILL(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJJJIL(LJJJJ(interfaceC19983313Gt, i));
    }

    @Override // X.InterfaceC19986313Hx
    public final byte LJIJ(C19980213Fo c19980213Fo, int i) {
        return LJJIJIIJI(LJJJJ(c19980213Fo, i));
    }

    @Override // X.InterfaceC19986313Hx
    public final int LJIJJLI(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        return LJJIZ(LJJJJ(interfaceC19983313Gt, i));
    }

    @Override // X.InterfaceC19986313Hx
    public final float LJJ(C19980213Fo c19980213Fo, int i) {
        return LJJIJLIJ(LJJJJ(c19980213Fo, i));
    }

    @Override // X.InterfaceC19986313Hx
    public final char LJJIIJ(C19980213Fo c19980213Fo, int i) {
        return LJJIJIIJIL(LJJJJ(c19980213Fo, i));
    }

    @Override // X.InterfaceC19986313Hx
    public final <T> T LJI(InterfaceC19983313Gt interfaceC19983313Gt, int i, InterfaceC19984213Hc<? extends T> interfaceC19984213Hc, T t) {
        this.LIZIZ.add(LJJJJ(interfaceC19983313Gt, i));
        T t2 = (T) LIZLLL(interfaceC19984213Hc);
        if (!this.LIZJ) {
            LJJJJI();
        }
        this.LIZJ = false;
        return t2;
    }

    @Override // X.InterfaceC19986313Hx
    public final <T> T LJIIIZ(InterfaceC19983313Gt interfaceC19983313Gt, int i, InterfaceC19984213Hc<? extends T> interfaceC19984213Hc, T t) {
        T t2;
        this.LIZIZ.add(LJJJJ(interfaceC19983313Gt, i));
        if (!interfaceC19984213Hc.getDescriptor().LIZ() && !LJIIZILJ()) {
            t2 = null;
        } else {
            t2 = (T) LIZLLL(interfaceC19984213Hc);
        }
        if (!this.LIZJ) {
            LJJJJI();
        }
        this.LIZJ = false;
        return t2;
    }
}
