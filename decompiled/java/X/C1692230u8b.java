package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0u8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692230u8b implements Appendable {
    public final StringBuilder LL;
    public final List<C1692290u8h<? extends Object>> LLILLJJLI;
    public final List<C1692290u8h<? extends InterfaceC1692820u9Y>> LLILLL;

    public final int LJFF() {
        return this.LL.length();
    }

    public final void LJI() {
        if (!(!this.LLILLJJLI.isEmpty())) {
            C1681000tqU.LIZJ("Nothing to pop.");
        }
        ((C1692290u8h) ListProtector.remove(this.LLILLJJLI, ((ArrayList) r1).size() - 1)).LIZJ = this.LL.length();
    }

    public final C1692220u8a LJIIL() {
        String string = this.LL.toString();
        ArrayList arrayList = (ArrayList) this.LLILLL;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C1692290u8h) ListProtector.get(arrayList, i)).LIZ(this.LL.length()));
        }
        return new C1692220u8a(string, arrayList2);
    }

    public C1692230u8b() {
        this.LL = new StringBuilder(16);
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        new Object() { // from class: X.0u9D
            {
                new ArrayList();
            }
        };
    }

    public C1692230u8b(C1692220u8a c1692220u8a) {
        this();
        LJ(c1692220u8a);
    }

    public final void LIZJ(CharSequence charSequence) {
        if (charSequence instanceof C1692220u8a) {
            LJ((C1692220u8a) charSequence);
        } else {
            this.LL.append(charSequence);
        }
    }

    public final void LIZLLL(String str) {
        this.LL.append(str);
    }

    public final void LJ(C1692220u8a c1692220u8a) {
        int length = this.LL.length();
        this.LL.append(c1692220u8a.LLILLJJLI);
        List<C1692270u8f<? extends InterfaceC1692820u9Y>> list = c1692220u8a.LL;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(list, i);
                ((ArrayList) this.LLILLL).add(new C1692290u8h(c1692270u8f.LIZ, c1692270u8f.LIZIZ + length, c1692270u8f.LIZJ + length, c1692270u8f.LIZLLL));
            }
        }
    }

    public final void LJII(int i) {
        if (i >= ((ArrayList) this.LLILLJJLI).size()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append(" should be less than ");
            sbLIZ.append(((ArrayList) this.LLILLJJLI).size());
            C1681000tqU.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        while (((ArrayList) this.LLILLJJLI).size() - 1 >= i) {
            LJI();
        }
    }

    public final void LJIIIIZZ(C1693020u9s c1693020u9s) {
        C1692290u8h c1692290u8h = new C1692290u8h(c1693020u9s, this.LL.length(), 0, null, 12);
        ((ArrayList) this.LLILLJJLI).add(c1692290u8h);
        ((ArrayList) this.LLILLL).add(c1692290u8h);
        ((ArrayList) this.LLILLJJLI).size();
    }

    public final int LJIIJ(C1693480uAc c1693480uAc) {
        C1692290u8h c1692290u8h = new C1692290u8h(c1693480uAc, this.LL.length(), 0, null, 12);
        ((ArrayList) this.LLILLJJLI).add(c1692290u8h);
        ((ArrayList) this.LLILLL).add(c1692290u8h);
        return ((ArrayList) this.LLILLJJLI).size() - 1;
    }

    public final int LJIIJJI(C1693450uAZ c1693450uAZ) {
        C1692290u8h c1692290u8h = new C1692290u8h(c1693450uAZ, this.LL.length(), 0, null, 12);
        ((ArrayList) this.LLILLJJLI).add(c1692290u8h);
        ((ArrayList) this.LLILLL).add(c1692290u8h);
        return ((ArrayList) this.LLILLJJLI).size() - 1;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.LL.append(c);
        return this;
    }

    public C1692230u8b(String str) {
        this();
        LIZLLL(str);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        LIZJ(charSequence);
        return this;
    }

    public final void LJIIIZ(String str, String str2) {
        C1692290u8h c1692290u8h = new C1692290u8h(new C1556440qba(str2), this.LL.length(), 0, str, 4);
        ((ArrayList) this.LLILLJJLI).add(c1692290u8h);
        ((ArrayList) this.LLILLL).add(c1692290u8h);
        ((ArrayList) this.LLILLJJLI).size();
    }

    public final void LIZ(C1693020u9s c1693020u9s, int i, int i2) {
        ((ArrayList) this.LLILLL).add(new C1692290u8h(c1693020u9s, i, i2, null, 8));
    }

    public final void LIZIZ(C1693450uAZ c1693450uAZ, int i, int i2) {
        ((ArrayList) this.LLILLL).add(new C1692290u8h(c1693450uAZ, i, i2, null, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof C1692220u8a) {
            C1692220u8a c1692220u8a = (C1692220u8a) charSequence;
            int length = this.LL.length();
            this.LL.append((CharSequence) c1692220u8a.LLILLJJLI, i, i2);
            List<C1692270u8f<? extends InterfaceC1692820u9Y>> listLIZ = C1692250u8d.LIZ(c1692220u8a, i, i2, null);
            if (listLIZ != null) {
                int size = listLIZ.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(listLIZ, i3);
                    ((ArrayList) this.LLILLL).add(new C1692290u8h(c1692270u8f.LIZ, c1692270u8f.LIZIZ + length, c1692270u8f.LIZJ + length, c1692270u8f.LIZLLL));
                }
            }
        } else {
            this.LL.append(charSequence, i, i2);
        }
        return this;
    }
}
