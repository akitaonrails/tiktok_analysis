package X;

import com.ss.android.ugc.aweme.vibefeed.model.VibeReachResponse;
import com.ss.android.ugc.aweme.vibefeed.network.IVibeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.interact.reach.InlineMsgRequestWorker$doWork$response$1$1", f = "InlineMsgRequestWorker.kt", l = {43}, m = "invokeSuspend")
public final class C629330OmJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VibeReachResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629330OmJ(String str, String str2, String str3, String str4, int i, int i2, String str5, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C629330OmJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLIZ, this.LLIZLLLIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InlineMsgRequestWorker@4fda.doWork$response$1$1");
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
            String strLJII = C1575440r6E.LJII(this.LLILLJJLI);
            IVibeApi.LIZ.getClass();
            IVibeApi iVibeApiLIZ = C629310OmH.LIZ();
            if (iVibeApiLIZ != null) {
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                String str3 = this.LLILZIL;
                String str4 = this.LLILZLL;
                int i2 = this.LLIZ;
                int i3 = this.LLIZLLLIL;
                this.LL = 1;
                obj = iVibeApiLIZ.vibeConsumeReach(str, str2, str3, str4, i2, i3, strLJII, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InlineMsgRequestWorker@4fda.doWork$response$1$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("InlineMsgRequestWorker@4fda.doWork$response$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VibeReachResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
