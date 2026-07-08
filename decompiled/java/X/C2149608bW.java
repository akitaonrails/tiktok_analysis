package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePublishPipeline$runStart$authKeyDeferred$1", f = "BulletinVoicePublishPipeline.kt", l = {181}, m = "invokeSuspend")
public final class C2149608bW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC2150408be>, Object> {
    public int LL;
    public final /* synthetic */ C2149708bX LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C2152408by LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2149608bW(C2149708bX c2149708bX, String str, long j, String str2, C2152408by c2152408by, InterfaceC1364105Vn<? super C2149608bW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2149708bX;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = str2;
        this.LLILZLL = c2152408by;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2149608bW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoicePublishPipeline@9c99.runStart$authKeyDeferred$1");
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
            C2149708bX c2149708bX = this.LLILLJJLI;
            String str = this.LLILLL;
            long j = this.LLILZ;
            String str2 = this.LLILZIL;
            C2152408by c2152408by = this.LLILZLL;
            this.LL = 1;
            obj = c2149708bX.LIZJ(str, j, str2, c2152408by, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.runStart$authKeyDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.runStart$authKeyDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC2150408be> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
