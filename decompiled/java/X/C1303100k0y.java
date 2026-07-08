package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303100k0y extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1303170k15 LLILLL;
    public final /* synthetic */ InterfaceC1303110k0z LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303100k0y(int i, int i2, C1303170k15 c1303170k15, InterfaceC1303110k0z interfaceC1303110k0z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = c1303170k15;
        this.LLILZ = interfaceC1303110k0z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle IO finished scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" version=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        sbLIZ.append(C786410Ut5.u3().getName());
        C20441214yg.LJIIIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        DslLayout dslLayout = this.LLILLL.LIZIZ.get(C1303170k15.LJI(this.LL, this.LLILLJJLI));
        if (dslLayout != null) {
            this.LLILZ.LIZ(dslLayout);
        } else {
            this.LLILZ.LIZ(C2490609pQ.LIZ());
        }
        return Unit.LIZ;
    }
}
