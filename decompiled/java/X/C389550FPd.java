package X;

import com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0FPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389550FPd extends C09AY implements Function1<C539960LFq, Unit> {
    public final /* synthetic */ AIGCBaseScene<SLOT_HOLDER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389550FPd(AIGCBaseScene<SLOT_HOLDER> aIGCBaseScene) {
        super(1);
        this.LL = aIGCBaseScene;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C539960LFq c539960LFq) {
        C539960LFq c539960LFq2 = c539960LFq;
        AIGCBaseScene<SLOT_HOLDER> aIGCBaseScene = this.LL;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C389530FPb.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC389540FPc.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC389540FPc.class, C389530FPb.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, aIGCBaseScene, 237));
        Collection collectionValues = ((LinkedHashMap) this.LL.LLJJJJLIIL).values();
        C19A3 c19a3 = this.LL;
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            ((C549530Lgt) it2.next()).LJ.invoke(c539960LFq2, c19a3);
        }
        this.LL.LLLLJI(c539960LFq2);
        return Unit.LIZ;
    }
}
