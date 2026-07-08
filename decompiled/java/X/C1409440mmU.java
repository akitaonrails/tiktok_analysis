package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.inspiration.data.ImageInspirationDataManager$fetchInspirationData$2$lokiDataDeferred$1", f = "ImageInspirationDataManager.kt", l = {68}, m = "invokeSuspend")
public final class C1409440mmU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EffectChannelResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1409480mmY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409440mmU(C1409480mmY c1409480mmY, InterfaceC1364105Vn<? super C1409440mmU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1409480mmY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409440mmU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationDataManager@3f4f.fetchInspirationData$2$lokiDataDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1635410sex interfaceC1635410sex = this.LLILLJJLI.LIZ;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            interfaceC1635410sex.LJI("photo_text_inspi_template", false, new IFetchEffectChannelListener() { // from class: X.01gi
                public final /* synthetic */ String LIZIZ = "photo_text_inspi_template";

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Exception illegalStateException;
                    InterfaceC20236714Gf<EffectChannelResponse> interfaceC20236714Gf = c2252611DEt;
                    if (exceptionResult == null || (illegalStateException = exceptionResult.getException()) == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Failed to fetch Loki panel with unknown error: ");
                        sbLIZ.append(this.LIZIZ);
                        illegalStateException = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C098200Yq c098200Yq = new C098200Yq(illegalStateException);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    if (effectChannelResponse != null) {
                        InterfaceC20236714Gf<EffectChannelResponse> interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(effectChannelResponse);
                        interfaceC20236714Gf.resumeWith(effectChannelResponse);
                        return;
                    }
                    InterfaceC20236714Gf<EffectChannelResponse> interfaceC20236714Gf2 = c2252611DEt;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to fetch Loki panel: ");
                    sbLIZ.append(this.LIZIZ);
                    C098200Yq c098200Yq = new C098200Yq(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf2.resumeWith(c098200Yq);
                }
            });
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImageInspirationDataManager@3f4f.fetchInspirationData$2$lokiDataDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ImageInspirationDataManager@3f4f.fetchInspirationData$2$lokiDataDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EffectChannelResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
