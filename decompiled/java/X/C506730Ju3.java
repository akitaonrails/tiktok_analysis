package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ju3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506730Ju3 extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ FakeSubSpaceEditorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506730Ju3(FakeSubSpaceEditorAssem fakeSubSpaceEditorAssem) {
        super(2);
        this.LL = fakeSubSpaceEditorAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue());
            FakeSubSpaceEditorAssem fakeSubSpaceEditorAssem = this.LL;
            boolValueOf.booleanValue();
            C786410Ut5.LJLLLLLL(8, (View) fakeSubSpaceEditorAssem.LLJJJJJIL.getValue());
        }
        return Unit.LIZ;
    }
}
