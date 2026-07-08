package X;

import com.ss.android.ugc.aweme.creative.model.audio.ConsumptionSpeakerInfo;
import com.ss.android.ugc.aweme.creative.model.audio.InstantCloneConsumptionModel;
import com.ss.android.ugc.gamora.editor.audioservice.service.vopinstantclone.VopInstantCloneCameraServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.InstantCloneParser$fetchInstantCloneInfo$1", f = "InstantCloneParser.kt", l = {}, m = "invokeSuspend")
public final class C1406205eu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1364105Vn<InstantCloneConsumptionModel> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1406205eu(InterfaceC1364105Vn<? super InstantCloneConsumptionModel> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1406205eu> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1406205eu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantCloneParser@3cac.fetchInstantCloneInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C443120HZe<String, String, Boolean> speakerInfo = VopInstantCloneCameraServiceImpl.LIZ().getSpeakerInfo();
        InstantCloneConsumptionModel instantCloneConsumptionModel = new InstantCloneConsumptionModel("", null);
        if (speakerInfo != null) {
            instantCloneConsumptionModel.speakerInfo = new ConsumptionSpeakerInfo(speakerInfo.getFirst(), speakerInfo.getSecond(), speakerInfo.getThird().booleanValue());
        }
        InterfaceC1364105Vn<InstantCloneConsumptionModel> interfaceC1364105Vn = this.LL;
        C189200o6.m2constructorimpl(instantCloneConsumptionModel);
        interfaceC1364105Vn.resumeWith(instantCloneConsumptionModel);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstantCloneParser@3cac.fetchInstantCloneInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
