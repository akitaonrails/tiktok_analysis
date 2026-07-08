package X;

import com.ss.android.ugc.aweme.nows.api.AICaptionApi;
import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;
import com.ss.android.ugc.aweme.nows.api.MemeAudioRequestBody;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule$submitImage$4", f = "AICaptionNetworkModule.kt", l = {66}, m = "invokeSuspend")
public final class C859430XnZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AICaptionNetworkModule.AICaptionResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859430XnZ(String str, List<String> list, InterfaceC1364105Vn<? super C859430XnZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859430XnZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICaptionNetworkModule@235.submitImage$4");
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
            MemeAudioRequestBody memeAudioRequestBody = new MemeAudioRequestBody(this.LLILLJJLI, this.LLILLL);
            AICaptionApi value = AICaptionNetworkModule.LIZ.getValue();
            this.LL = 1;
            obj = value.getImageInfos(memeAudioRequestBody, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AICaptionNetworkModule@235.submitImage$4");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AICaptionNetworkModule@235.submitImage$4");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AICaptionNetworkModule.AICaptionResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
