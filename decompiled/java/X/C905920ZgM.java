package X;

import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamRepositoryImpl$retryFromScratch$coldFlow$1", f = "StreamRepositoryImpl.kt", l = {395}, m = "invokeSuspend")
public final class C905920ZgM extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC905820ZgC>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C905950ZgP LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ C869590Y9l LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ RetryInfoComponent LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C905920ZgM(C905950ZgP c905950ZgP, String str, String str2, Long l, C869590Y9l c869590Y9l, String str3, RetryInfoComponent retryInfoComponent, InterfaceC1364105Vn<? super C905920ZgM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c905950ZgP;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = l;
        this.LLIZ = c869590Y9l;
        this.LLIZLLLIL = str3;
        this.LLJ = retryInfoComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C905920ZgM c905920ZgM = new C905920ZgM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c905920ZgM.LLILLJJLI = obj;
        return c905920ZgM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamRepositoryImpl@ffe.retryFromScratch$coldFlow$1");
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
            InterfaceC346701Wf<? super InterfaceC905820ZgC> interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C905950ZgP c905950ZgP = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            Long l = this.LLILZLL;
            String conversationId = this.LLIZ.getConversationId();
            long conversationShortId = this.LLIZ.getConversationShortId();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str3 = this.LLIZLLLIL;
            RetryInfoComponent retryInfoComponent = this.LLJ;
            EnumC905940ZgO enumC905940ZgO = EnumC905940ZgO.RETRY;
            this.LL = 1;
            if (c905950ZgP.LJII(interfaceC346701Wf, str, str2, l, conversationId, conversationShortId, linkedHashMap, 0, str3, retryInfoComponent, enumC905940ZgO, this) == objLJFF) {
                C1C7U.LIZIZ("StreamRepositoryImpl@ffe.retryFromScratch$coldFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamRepositoryImpl@ffe.retryFromScratch$coldFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC905820ZgC> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
