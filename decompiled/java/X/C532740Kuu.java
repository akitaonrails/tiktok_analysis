package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.util.SkipAIGCLoadComponent$trackClose$1", f = "SkipAIGCLoadComponent.kt", l = {}, m = "invokeSuspend")
public final class C532740Kuu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1625020sOC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532740Kuu(C1625020sOC c1625020sOC, InterfaceC1364105Vn<? super C532740Kuu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1625020sOC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532740Kuu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String effectId;
        C1C7U.LIZ("SkipAIGCLoadComponent@d3a7.trackClose$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LAB c0lab = new C0LAB();
        C1625020sOC c1625020sOC = this.LL;
        Effect effectLIZIZ = C1624010sMZ.LIZIZ(c1625020sOC.getStickerApiComponent());
        if (effectLIZIZ != null && (effectId = effectLIZIZ.getEffectId()) != null) {
            c0lab.LJ("prop_id", effectId);
        }
        InterfaceC1624480sNK interfaceC1624480sNKC0 = c1625020sOC.getStickerApiComponent().C0();
        c0lab.LJ("creation_id", c1625020sOC.getShortVideoContext().getCreationId());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("tab_name", c1625020sOC.H2(interfaceC1624480sNKC0));
        c0lab.LJ("impr_position", c1625020sOC.G2(interfaceC1624480sNKC0));
        C20684815ws.LJIILLIIL("effect_generation_cancel", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkipAIGCLoadComponent@d3a7.trackClose$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
