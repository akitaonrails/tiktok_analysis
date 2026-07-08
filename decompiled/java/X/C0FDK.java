package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FDK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.template.ui.CaptionTemplateListComponent$fetchData$2", f = "CaptionTemplateListComponent.kt", l = {122}, m = "invokeSuspend")
public final class C0FDK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0FDW LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FDK(C0FDW c0fdw, boolean z, InterfaceC1364105Vn<? super C0FDK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0fdw;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0FDK c0fdk = new C0FDK(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0fdk.LLILLJJLI = obj;
        return c0fdk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Object objLJI;
        C1C7U.LIZ("CaptionTemplateListComponent@1430.fetchData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
                objLJI = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C0FDM c0fdm = this.LLILLL.LLJJIJIIJIL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            objLJI = c0fdm.LJI("tiktok_ep_caption_template", false, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("CaptionTemplateListComponent@1430.fetchData$2");
                return objLJFF;
            }
        }
        C0FDW c0fdw = this.LLILLL;
        boolean z = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(objLJI)) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) objLJI;
            C365460EUm.LIZIZ("tiktok_ep_caption_template", effectChannelResponse.getAll_category_effects());
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C0FDL(c0fdw, z, effectChannelResponse, null), 2);
        }
        C0FDW c0fdw2 = this.LLILLL;
        if (C189200o6.m5exceptionOrNullimpl(objLJI) != null) {
            c0fdw2.i3(AFwS234S0000000_5.get$arr$(283));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionTemplateListComponent@1430.fetchData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
