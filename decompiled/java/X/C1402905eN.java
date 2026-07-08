package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceDownloadHelper$parallelDownloadTasks$2$voiceOriginalDeferred$1", f = "ReplaceDownloadHelper.kt", l = {176}, m = "invokeSuspend")
public final class C1402905eN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C19718712Cz>, Object> {
    public int LL;
    public final /* synthetic */ C14DL LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1510705vl LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402905eN(C14DL c14dl, Aweme aweme, String str, C1510705vl c1510705vl, InterfaceC1364105Vn<? super C1402905eN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c14dl;
        this.LLILLL = aweme;
        this.LLILZ = str;
        this.LLILZIL = c1510705vl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1402905eN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceDownloadHelper@3470.parallelDownloadTasks$2$voiceOriginalDeferred$1");
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
            C14DL c14dl = this.LLILLJJLI;
            Aweme aweme = this.LLILLL;
            String str = this.LLILZ;
            C1510705vl c1510705vl = this.LLILZIL;
            this.LL = 1;
            obj = c14dl.LJ(aweme, str, c1510705vl, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ReplaceDownloadHelper@3470.parallelDownloadTasks$2$voiceOriginalDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ReplaceDownloadHelper@3470.parallelDownloadTasks$2$voiceOriginalDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C19718712Cz> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
