package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JtT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506370JtT extends C09AY implements Function2<UIAssem, C291001Au<? extends C504910Jr7>, Unit> {
    public final /* synthetic */ FakeSubSpaceEditorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506370JtT(FakeSubSpaceEditorAssem fakeSubSpaceEditorAssem) {
        super(2);
        this.LL = fakeSubSpaceEditorAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends C504910Jr7> c291001Au) {
        C504910Jr7 c504910Jr7;
        C291001Au<? extends C504910Jr7> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (c504910Jr7 = (C504910Jr7) c291001Au2.LIZ) != null) {
            FakeSubSpaceEditorAssem.kp(this.LL, c504910Jr7.LIZ, 0, 2);
        }
        return Unit.LIZ;
    }
}
