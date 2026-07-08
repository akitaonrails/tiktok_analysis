package X;

import com.lynx.tasm.LynxView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539760qAg extends C09AY implements Function1<C1539910qAv, Unit> {
    public final /* synthetic */ C1539580qAO LL;
    public final /* synthetic */ LynxView LLILLJJLI;
    public final /* synthetic */ Function1<C1539910qAv, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539760qAg(C1539580qAO c1539580qAO, LynxView lynxView, C1539770qAh c1539770qAh) {
        super(1);
        this.LL = c1539580qAO;
        this.LLILLJJLI = lynxView;
        this.LLILLL = c1539770qAh;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1539910qAv c1539910qAv) {
        C1539580qAO c1539580qAO = this.LL;
        EnumC1539690qAZ enumC1539690qAZ = EnumC1539690qAZ.DOWNGRADED;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(this.LL.LJI);
        sbLIZ.append(')');
        sbLIZ.append(this.LL.LJFF);
        c1539580qAO.LJI(enumC1539690qAZ, -1, C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.removeLynxViewClient(this.LL.LJIIJJI);
        this.LL.LJIIJJI = null;
        this.LLILLL.invoke(c1539910qAv);
        return Unit.LIZ;
    }
}
