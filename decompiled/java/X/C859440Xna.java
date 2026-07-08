package X;

import com.bytedance.retrofit2.mime.TypedFile;
import com.ss.android.ugc.aweme.nows.api.AICaptionApi;
import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule$submitImage$2", f = "AICaptionNetworkModule.kt", l = {54}, m = "invokeSuspend")
public final class C859440Xna extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AICaptionNetworkModule.AICaptionResponse>, Object> {
    public int LL;
    public final /* synthetic */ TypedFile LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859440Xna(TypedFile typedFile, InterfaceC1364105Vn<? super C859440Xna> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = typedFile;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859440Xna(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICaptionNetworkModule@235.submitImage$2");
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
            AICaptionApi value = AICaptionNetworkModule.LIZ.getValue();
            TypedFile typedFile = this.LLILLJJLI;
            String value2 = AICaptionNetworkModule.LIZIZ.getValue();
            this.LL = 1;
            obj = value.getImageInfo(typedFile, value2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AICaptionNetworkModule@235.submitImage$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AICaptionNetworkModule@235.submitImage$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AICaptionNetworkModule.AICaptionResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
