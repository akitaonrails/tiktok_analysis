package X;

import Y.ARunnableS37S0201000_33;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1A6K, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A6K<K, V> extends C1A6I<V> {
    public final AbstractC485110J0r<K, V> LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public final C1A6L LLJJIJIL;

    @Override // X.C1A6I
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.C1A6I
    public final Object LJIIJJI() {
        return this.LLJJ.LJIIIZ(this.LLILZLL);
    }

    public final void LJJII() {
        if (this.LLJJIII) {
            return;
        }
        this.LLJJIII = true;
        C1A6G<T> c1a6g = this.LLILZIL;
        this.LLILLJJLI.execute(new ARunnableS37S0201000_33(ListProtector.get((List) ListProtector.get(c1a6g.LLILLJJLI, r1.size() - 1), r1.size() - 1), ((c1a6g.LL + c1a6g.LLILZIL) - 1) + c1a6g.LLILZ, this, 6));
    }

    public final void LJJIII() {
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        C1A6G<T> c1a6g = this.LLILZIL;
        int i = c1a6g.LL + c1a6g.LLILZ;
        this.LLILLJJLI.execute(new ARunnableS37S0201000_33(ListProtector.get((List) ListProtector.get(c1a6g.LLILLJJLI, 0), 0), i, this, 5));
    }

    @Override // X.C1A6I
    public final AbstractC470910IdN<?, V> LJIIJ() {
        return this.LLJJ;
    }

    @Override // X.C1A6I
    public final void LJIIZILJ(int i) {
        int i2 = this.LLILZ.LIZIZ;
        C1A6G<T> c1a6g = this.LLILZIL;
        int i3 = c1a6g.LL;
        int i4 = i2 - (i - i3);
        int i5 = (i + i2) - (i3 + c1a6g.LLILZIL);
        int iMax = Math.max(i4, this.LLJJIJI);
        this.LLJJIJI = iMax;
        if (iMax > 0) {
            LJJIII();
        }
        int iMax2 = Math.max(i5, this.LLJJIJIIJIL);
        this.LLJJIJIIJIL = iMax2;
        if (iMax2 > 0) {
            LJJII();
        }
    }

    @Override // X.C1A6I
    public final void LJIIIZ(C1A6I c1a6i, C1A6C c1a6c) {
        C1A6G<T> c1a6g = c1a6i.LLILZIL;
        C1A6G<T> c1a6g2 = this.LLILZIL;
        int i = c1a6g2.LLIZLLLIL - c1a6g.LLIZLLLIL;
        int i2 = c1a6g2.LLIZ - c1a6g.LLIZ;
        int i3 = c1a6g.LLILLL;
        int i4 = c1a6g.LL;
        if (!c1a6g.isEmpty() && i >= 0 && i2 >= 0 && this.LLILZIL.LLILLL == Math.max(i3 - i, 0) && this.LLILZIL.LL == Math.max(i4 - i2, 0) && this.LLILZIL.LLILZIL == c1a6g.LLILZIL + i + i2) {
            if (i != 0) {
                int iMin = Math.min(i3, i);
                int i5 = i - iMin;
                int i6 = c1a6g.LL + c1a6g.LLILZIL;
                if (iMin != 0) {
                    c1a6c.LIZ(i6, iMin);
                }
                if (i5 != 0) {
                    c1a6c.LIZIZ(i6 + iMin, i5);
                }
            }
            if (i2 != 0) {
                int iMin2 = Math.min(i4, i2);
                int i7 = i2 - iMin2;
                if (iMin2 != 0) {
                    c1a6c.LIZ(i4, iMin2);
                }
                if (i7 != 0) {
                    c1a6c.LIZIZ(0, i7);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
    }

    public final void LJJI(int i, int i2, int i3) {
        int i4 = (this.LLJJIJIIJIL - i2) - i3;
        this.LLJJIJIIJIL = i4;
        this.LLJJIII = false;
        if (i4 > 0) {
            LJJII();
        }
        LJIJ(i, i2);
        LJIJI(i + i2, i3);
    }

    public final void LJJIFFI(int i, int i2, int i3) {
        int i4 = (this.LLJJIJI - i2) - i3;
        this.LLJJIJI = i4;
        this.LLJJI = false;
        if (i4 > 0) {
            LJJIII();
        }
        LJIJ(i, i2);
        LJIJI(0, i3);
        this.LLILZLL += i3;
        this.LLJI += i3;
        this.LLJIJIL += i3;
    }

    public C1A6K(AbstractC485110J0r<K, V> abstractC485110J0r, Executor executor, Executor executor2, AbstractC470940IdQ<V> abstractC470940IdQ, C476690Imh c476690Imh, K k, int i) {
        super(new C1A6G(), executor, executor2, abstractC470940IdQ, c476690Imh);
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJJIJI = 0;
        this.LLJJIJIIJIL = 0;
        AbstractC485160J0w<V> abstractC485160J0w = new AbstractC485160J0w<V>() { // from class: X.1A6L
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v11 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            @Override // X.AbstractC485160J0w
            public final void LIZ(int r11, X.C0J10<V> r12) {
                /*
                    Method dump skipped, instruction units count: 305
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1A6L.LIZ(int, X.0J10):void");
            }
        };
        this.LLJJIJIL = abstractC485160J0w;
        this.LLJJ = abstractC485110J0r;
        this.LLILZLL = i;
        if (abstractC485110J0r.LJ()) {
            LJFF();
        } else {
            C476690Imh c476690Imh2 = this.LLILZ;
            abstractC485110J0r.LJIIIIZZ(k, c476690Imh2.LIZLLL, c476690Imh2.LIZ, c476690Imh2.LIZJ, this.LL, abstractC485160J0w);
        }
    }
}
