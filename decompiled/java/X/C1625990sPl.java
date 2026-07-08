package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerLogicComponent$reloadNonGSEffect$1$1", f = "RecordStickerLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C1625990sPl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ l0 LL;
    public final /* synthetic */ Effect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625990sPl(l0 l0Var, Effect effect, InterfaceC1364105Vn<? super C1625990sPl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = l0Var;
        this.LLILLJJLI = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1625990sPl(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordStickerLogicComponent@6428.reloadNonGSEffect$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bundle bundle = new Bundle();
        bundle.putBoolean("need_report_prop_remove_event", false);
        this.LL.getShortVideoContext().creativeModel.commerceModel.getStickerContext().setStartedUsingEffect(false);
        List<String> list = C579450Mo3.LIZ;
        if (C579450Mo3.LIZIZ(this.LL.getShortVideoContext())) {
            C1624010sMZ.LJIIJ(this.LL, C1622820sKe.LIZ(null, bundle, 1));
        } else {
            C1624010sMZ.LJIIJ(this.LL, C1622820sKe.LIZ(null, bundle, 5));
        }
        l0 l0Var = this.LL;
        Effect effect = this.LLILLJJLI;
        EnumC1448980noG enumC1448980noG = EnumC1448980noG.MANUAL_SET;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("ignore_notice", true);
        bundle2.putBoolean("ignore_game_effect_music_clean", true);
        C1624010sMZ.LJIIJ(l0Var, C1622820sKe.LIZIZ(effect, -1, enumC1448980noG, null, bundle2, null, null, 0, false, null, null, 1012));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordStickerLogicComponent@6428.reloadNonGSEffect$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
