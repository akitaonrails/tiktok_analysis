package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C432801mI extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ LiveIconView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432801mI(LiveIconView liveIconView) {
        super(2);
        this.LL = liveIconView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            ((Boolean) c291001Au2.LIZ).booleanValue();
            C786410Ut5.LLJJIJIL(this.LL, 0);
        }
        return Unit.LIZ;
    }
}
