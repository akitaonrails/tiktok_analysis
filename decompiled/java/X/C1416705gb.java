package X;

import com.ss.android.ugc.aweme.compliance.audiencecontrol.creator.AudienceControlFragment;
import com.ss.android.ugc.aweme.compliance.audiencecontrol.creator.AudienceControlViewModel;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.audiencecontrol.creator.AudienceControlFragment$onViewCreated$4$1$1$1", f = "AudienceControlFragment.kt", l = {110}, m = "invokeSuspend")
public final class C1416705gb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AudienceControlFragment LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C127K LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416705gb(AudienceControlFragment audienceControlFragment, boolean z, C127K c127k, InterfaceC1364105Vn<? super C1416705gb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = audienceControlFragment;
        this.LLILLL = z;
        this.LLILZ = c127k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1416705gb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objVQ2;
        String str;
        C1C7U.LIZ("AudienceControlFragment@eb2f.onViewCreated$4$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objVQ2 = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AudienceControlViewModel audienceControlViewModel = (AudienceControlViewModel) this.LLILLJJLI.LLJ.getValue();
            if (audienceControlViewModel != null) {
                boolean z = this.LLILLL;
                this.LL = 1;
                objVQ2 = audienceControlViewModel.vQ2(z, this);
                if (objVQ2 == objLJFF) {
                    C1C7U.LIZIZ("AudienceControlFragment@eb2f.onViewCreated$4$1$1$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AudienceControlFragment@eb2f.onViewCreated$4$1$1$1");
            return unit;
        }
        C127K c127k = this.LLILZ;
        AudienceControlFragment audienceControlFragment = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(objVQ2)) {
            c127k.setLoading(false);
            String statusMsg = ((BaseResponse) objVQ2).getStatusMsg();
            if (statusMsg.length() > 0) {
                C1389890mGx c1389890mGx = new C1389890mGx(audienceControlFragment);
                c1389890mGx.LJIIJ(statusMsg);
                c1389890mGx.LJIIJJI();
            }
            C1163504gr c1163504gr = C1163504gr.LIZIZ;
            if (z2) {
                str = "on";
            } else {
                str = "off";
            }
            c1163504gr.onEventV3("toggle_aac_switch", C2097908Jt.LIZJ(new Pair("to_status", str)));
        }
        C127K c127k2 = this.LLILZ;
        AudienceControlFragment audienceControlFragment2 = this.LLILLJJLI;
        if (C189200o6.m5exceptionOrNullimpl(objVQ2) != null) {
            c127k2.setLoading(false);
            C1389890mGx c1389890mGx2 = new C1389890mGx(audienceControlFragment2);
            c1389890mGx2.LJIIJ(c127k2.getContext().getString(2131824489));
            c1389890mGx2.LJIIJJI();
            C1163504gr.LIZIZ.onEventV3("display_aac_error_toast", C2097608Jq.LJ());
        }
        C189200o6.m1boximpl(objVQ2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AudienceControlFragment@eb2f.onViewCreated$4$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
