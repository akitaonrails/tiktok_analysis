package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageBottomAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JV9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JV9 extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SuggestEmotePageBottomAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JV9(SuggestEmotePageBottomAssem suggestEmotePageBottomAssem) {
        super(2);
        this.LL = suggestEmotePageBottomAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        UIAssem uIAssem2 = uIAssem;
        Boolean boolLIZ = c291001Au.LIZ();
        if (boolLIZ != null && boolLIZ.booleanValue()) {
            SuggestEmotePageBottomAssem suggestEmotePageBottomAssem = this.LL;
            boolLIZ.booleanValue();
            C16FS c16fs = suggestEmotePageBottomAssem.LLJIJIL;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
            C766270U4b.LJIIIZ(uIAssem2.getContext(), C497740JfY.LJIJI(2131852094));
        }
        return Unit.LIZ;
    }
}
