package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nE3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426530nE3 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1426520nE2 LL;
    public final /* synthetic */ EffectModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426530nE3(C1426520nE2 c1426520nE2, EffectModel effectModel, int i, String str, boolean z, Function0<Unit> function0) {
        super(1);
        this.LL = c1426520nE2;
        this.LLILLJJLI = effectModel;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            C1426520nE2 c1426520nE2 = this.LL;
            InterfaceC1426650nEF interfaceC1426650nEF = c1426520nE2.LLJJIII;
            if (interfaceC1426650nEF != null) {
                interfaceC1426650nEF.LJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, c1426520nE2.T2().LJIIIIZZ, this.LL.T2().LJIIIZ);
            }
            this.LLILZLL.invoke();
        }
        return Unit.LIZ;
    }
}
