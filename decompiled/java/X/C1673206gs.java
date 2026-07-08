package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.caption.LandscapeCellCaptionSwitchAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.cell.assem.caption.LandscapeCellCaptionSwitchAssem$registerCaptionToggleChange$2", f = "LandscapeCellCaptionSwitchAssem.kt", l = {}, m = "invokeSuspend")
public final class C1673206gs extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LandscapeCellCaptionSwitchAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673206gs(LandscapeCellCaptionSwitchAssem landscapeCellCaptionSwitchAssem, InterfaceC1364105Vn<? super C1673206gs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = landscapeCellCaptionSwitchAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1673206gs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandscapeCellCaptionSwitchAssem@8179.registerCaptionToggleChange$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LandscapeCellCaptionSwitchAssem landscapeCellCaptionSwitchAssem = this.LL;
        TuxIconView tuxIconView = landscapeCellCaptionSwitchAssem.LLJJJJLIIL;
        Object obj2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C724270Sb3 c724270Sb3 = landscapeCellCaptionSwitchAssem.LLJI;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        }
        tuxIconView.setTuxIcon(landscapeCellCaptionSwitchAssem.cp(((VideoItemParams) obj2).getAweme()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LandscapeCellCaptionSwitchAssem@8179.registerCaptionToggleChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
