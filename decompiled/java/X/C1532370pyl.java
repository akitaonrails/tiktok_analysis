package X;

import java.util.LinkedList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532370pyl extends C09AY implements Function1<C1532340pyi, Unit> {
    public final /* synthetic */ C1532300pye LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1532300pye LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> LLILZLL;
    public final /* synthetic */ C1532710pzJ LLIZ;
    public final /* synthetic */ C1532180pyS LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532370pyl(C1532300pye c1532300pye, boolean z, C1532300pye c1532300pye2, boolean z2, boolean z3, LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> linkedList, C1532710pzJ c1532710pzJ, C1532180pyS c1532180pyS) {
        super(1);
        this.LL = c1532300pye;
        this.LLILLJJLI = z;
        this.LLILLL = c1532300pye2;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = linkedList;
        this.LLIZ = c1532710pzJ;
        this.LLIZLLLIL = c1532180pyS;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1532340pyi c1532340pyi) {
        boolean z;
        C1532340pyi c1532340pyi2 = c1532340pyi;
        this.LL.LJIILLIIL.LIZJ("reuse_async_invoke");
        C08AB c08ab = this.LL.LJIILLIIL;
        c08ab.LIZJ("process");
        boolean z2 = this.LLILZ;
        boolean z3 = this.LLILZIL;
        C1532300pye c1532300pye = this.LL;
        LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> linkedList = this.LLILZLL;
        C1532710pzJ c1532710pzJ = this.LLIZ;
        C1532300pye c1532300pye2 = this.LLILLL;
        C1532180pyS c1532180pyS = this.LLIZLLLIL;
        if (!this.LLILLJJLI && Intrinsics.LJFF(C786410Ut5.u3(), this.LLILLL.LJIIIZ)) {
            z = false;
        } else {
            z = true;
        }
        C1532300pye.LJIIIIZZ(z2, z3, c1532300pye, linkedList, c1532710pzJ, c1532300pye2, c1532180pyS, c1532340pyi2, c08ab, z);
        return Unit.LIZ;
    }
}
