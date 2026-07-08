package X;

import java.util.LinkedList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0pyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532290pyd extends C09AY implements Function2<Boolean, C1532340pyi, Unit> {
    public final /* synthetic */ C1532300pye LL;
    public final /* synthetic */ C1532340pyi LLILLJJLI;
    public final /* synthetic */ C1532180pyS LLILLL;
    public final /* synthetic */ LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> LLILZ;
    public final /* synthetic */ Function1<C1532340pyi, Unit> LLILZIL;
    public final /* synthetic */ C08AB LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C013C LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1532290pyd(C1532300pye c1532300pye, C1532340pyi c1532340pyi, C1532180pyS c1532180pyS, LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> linkedList, Function1<? super C1532340pyi, Unit> function1, C08AB c08ab, boolean z, C013C c013c) {
        super(2);
        this.LL = c1532300pye;
        this.LLILLJJLI = c1532340pyi;
        this.LLILLL = c1532180pyS;
        this.LLILZ = linkedList;
        this.LLILZIL = function1;
        this.LLILZLL = c08ab;
        this.LLIZ = z;
        this.LLIZLLLIL = c013c;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.lang.Boolean r11, X.C1532340pyi r12) {
        /*
            r10 = this;
            r5 = r12
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r3 = r11.booleanValue()
            X.0pyi r5 = (X.C1532340pyi) r5
            X.0pye r0 = r10.LL
            r0.LJIIZILJ = r5
            X.0pyi r0 = r10.LLILLJJLI
            X.0pyT r2 = r0.LIZIZ
            r0 = 0
            if (r5 != 0) goto L3b
            if (r2 != 0) goto L4e
            r5 = r0
        L17:
            r6 = 1
            if (r0 != 0) goto L56
            X.0pyS r0 = r10.LLILLL
            r0.LJ(r6)
            java.util.LinkedList<kotlin.Pair<X.0pyS, X.0pyg<?, ?>>> r0 = r10.LLILZ
            java.util.Iterator r1 = r0.iterator()
        L25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r1.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getFirst()
            X.0pyS r0 = (X.C1532180pyS) r0
            r0.LJ(r6)
            goto L25
        L3b:
            X.0pyT r1 = r5.LIZIZ
            if (r2 == 0) goto L4c
            if (r2 == r1) goto L4c
            if (r1 == 0) goto L49
            X.0pyU r0 = new X.0pyU
            r0.<init>(r2, r1)
            r2 = r0
        L49:
            r5.LIZIZ = r2
            goto L53
        L4c:
            r2 = r1
            goto L49
        L4e:
            X.0pyi r5 = new X.0pyi
            r5.<init>(r0, r2)
        L53:
            X.0pyj<?> r0 = r5.LIZ
            goto L17
        L56:
            X.0pye r1 = r10.LL
            X.08AB r2 = r10.LLILZLL
            X.0pyS r4 = r10.LLILLL
            boolean r0 = r10.LLIZ
            if (r0 == 0) goto L72
            X.013C r0 = r10.LLIZLLLIL
            boolean r0 = r0.element
            if (r0 == 0) goto L72
        L66:
            X.013C r0 = r10.LLIZLLLIL
            boolean r7 = r0.element
            java.util.LinkedList<kotlin.Pair<X.0pyS, X.0pyg<?, ?>>> r8 = r10.LLILZ
            kotlin.jvm.functions.Function1<X.0pyi, kotlin.Unit> r9 = r10.LLILZIL
            r1.LJIIL(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L81
        L72:
            r6 = 0
            goto L66
        L74:
            X.0pye r0 = r10.LL
            X.0pyR r1 = r0.LJII
            X.0pys r0 = X.EnumC1532440pys.NORMAL
            r1.LJIIJJI = r0
            kotlin.jvm.functions.Function1<X.0pyi, kotlin.Unit> r0 = r10.LLILZIL
            r0.invoke(r5)
        L81:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532290pyd.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
