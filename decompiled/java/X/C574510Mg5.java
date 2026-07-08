package X;

import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574510Mg5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC574610MgF LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ VECutVideoPresenter LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574510Mg5(InterfaceC574610MgF interfaceC574610MgF, int i, int i2, float f, String str, VECutVideoPresenter vECutVideoPresenter) {
        super(0);
        this.LL = interfaceC574610MgF;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = f;
        this.LLILZIL = str;
        this.LLILZLL = vECutVideoPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onCompileError(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZLL.LLJJ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.prepare();
        }
        return Unit.LIZ;
    }
}
