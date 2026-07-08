package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioNetworkAPI;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HT8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.network.SafeMixStudioNetworkAPIImpl$getStatus$2", f = "SafeMixStudioNetworkAPIImpl.kt", l = {117}, m = "invokeSuspend")
public final class C0HT8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MixStudioStatusResponse>, Object> {
    public int LL;
    public final /* synthetic */ C0HT4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HT8(C0HT4 c0ht4, InterfaceC1364105Vn<? super C0HT8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ht4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HT8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SafeMixStudioNetworkAPIImpl@daff.getStatus$2");
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
            MixStudioNetworkAPI mixStudioNetworkAPI = this.LLILLJJLI.LIZ;
            this.LL = 1;
            obj = mixStudioNetworkAPI.getProgress(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SafeMixStudioNetworkAPIImpl@daff.getStatus$2");
                return objLJFF;
            }
        }
        AbstractC2126608Uu abstractC2126608Uu = (AbstractC2126608Uu) obj;
        abstractC2126608Uu.checkValid();
        C1C7U.LIZIZ("SafeMixStudioNetworkAPIImpl@daff.getStatus$2");
        return abstractC2126608Uu;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MixStudioStatusResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
