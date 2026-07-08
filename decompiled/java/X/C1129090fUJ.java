package X;

import Y.AgS298S0100000_17;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fUJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.musicgift.MusicGiftPanelPreviewController$onPanelStart$1", f = "MusicGiftPanelPreviewController.kt", l = {47}, m = "invokeSuspend")
public final class C1129090fUJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1129000fUA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129090fUJ(C1129000fUA c1129000fUA, InterfaceC1364105Vn<? super C1129090fUJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1129000fUA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1129090fUJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftPanelPreviewController@46c5.onPanelStart$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1142070fpF.LIZ.getClass();
            AnonymousClass0951 anonymousClass0951 = C1142070fpF.LJIILIIL;
            AgS298S0100000_17 agS298S0100000_17 = new AgS298S0100000_17(this.LLILLJJLI, 0);
            this.LL = 1;
            if (anonymousClass0951.collect(agS298S0100000_17, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftPanelPreviewController@46c5.onPanelStart$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
