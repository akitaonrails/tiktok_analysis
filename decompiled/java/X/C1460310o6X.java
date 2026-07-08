package X;

import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o6X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460310o6X extends AbstractViewOnClickListenerC372950Ejl {
    public boolean LLILZ;
    public final /* synthetic */ C1460230o6P LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        boolean zLJI = MethodIDManager.LJI(72034);
        if (this.LLILZIL.getEditModel().getAILivePhotoModel().LJIIJ() && this.LLILZIL.LLLJL() != null) {
            InterfaceC1455680nz4 interfaceC1455680nz4LLLJL = this.LLILZIL.LLLJL();
            if (interfaceC1455680nz4LLLJL != null) {
                interfaceC1455680nz4LLLJL.Qu(true, new AwS566S0100000_22(this, 584));
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1460230o6P c1460230o6P = this.LLILZIL;
        c1460230o6P.LLLILZLLLI(new AwS266S0300000_22(this, (C1460310o6X) c1460230o6P, (C1460230o6P) this.LLILZLL, (Function0<Unit>) 16));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1460310o6X(C1460230o6P c1460230o6P, Function0<Unit> function0) {
        super(600L);
        this.LLILZIL = c1460230o6P;
        this.LLILZLL = function0;
    }
}
