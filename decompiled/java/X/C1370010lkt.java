package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1370010lkt extends C2217421BqW implements Function0<Unit> {
    public C1370010lkt(Object obj) {
        super(0, obj, DialogC1369990lkr.class, "doWhenConfigurationChanged", "doWhenConfigurationChanged()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1370540llk interfaceC1370540llk;
        DialogC1369990lkr dialogC1369990lkr = (DialogC1369990lkr) this.receiver;
        dialogC1369990lkr.LJJZZI(dialogC1369990lkr.LLJI);
        dialogC1369990lkr.LJL();
        if (dialogC1369990lkr.LLJILJILJ && dialogC1369990lkr.isShowing() && (interfaceC1370540llk = C1370370llT.LJII) != null && !interfaceC1370540llk.LIZ(dialogC1369990lkr.LLJIJIL)) {
            dialogC1369990lkr.dismiss();
            C785410UrT.LIZ(dialogC1369990lkr);
        }
        return Unit.LIZ;
    }
}
