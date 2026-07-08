package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageBottomAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JV1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JV1 extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SubWaveEmotePageBottomAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JV1(SubWaveEmotePageBottomAssem subWaveEmotePageBottomAssem) {
        super(2);
        this.LL = subWaveEmotePageBottomAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        UIAssem uIAssem2 = uIAssem;
        Boolean boolLIZ = c291001Au.LIZ();
        if (boolLIZ != null && boolLIZ.booleanValue()) {
            SubWaveEmotePageBottomAssem subWaveEmotePageBottomAssem = this.LL;
            boolLIZ.booleanValue();
            C16FS c16fs = subWaveEmotePageBottomAssem.LLJI;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
            C389001fE.LIZ("rewards_motes_upload_success", null, System.currentTimeMillis(), false);
            C520010KaN.LJJIJIL(uIAssem2.getContext());
        }
        return Unit.LIZ;
    }
}
