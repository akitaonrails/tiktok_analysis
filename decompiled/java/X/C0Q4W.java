package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Q4W, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q4W implements InterfaceC657840PrC {
    public final Function1<C0Q4X, Unit> LIZ;

    @Override // X.InterfaceC657840PrC
    public final C13IQ<? extends UIContentAssem> LIZJ() {
        return C13LE.LIZ(GeneralVerticalSkinAssem.class);
    }

    @Override // X.InterfaceC657780Pr6
    public final InterfaceC111300bX getConfig() {
        Function1<C0Q4X, Unit> function1 = this.LIZ;
        if (function1 == null) {
            return null;
        }
        C0Q4X c0q4x = new C0Q4X(null, null, null, 63);
        function1.invoke(c0q4x);
        return c0q4x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0Q4W(Function1<? super C0Q4X, Unit> function1) {
        this.LIZ = function1;
    }
}
