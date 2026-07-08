package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690170R5j extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ float LL = 1.0f;

    public C690170R5j() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        if (!C1834107Gh.LIZ() || !C690160R5i.LIZIZ.contains(Integer.valueOf(view2.getId()))) {
            if (((Boolean) C0B8V.LIZ.getValue()).booleanValue()) {
                C2180521AVm.LIZ(view2, EnumC2180541AVo.V_ANIMATE, (C1AV2) C1AVH.LIZLLL.getValue());
                view2.animate().cancel();
            }
            C2180521AVm.LIZJ(view2, this.LL, (C1AV2) C1AVH.LIZLLL.getValue());
        }
        return Unit.LIZ;
    }
}
