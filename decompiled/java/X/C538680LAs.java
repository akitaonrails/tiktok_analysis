package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.asynctask.AsyncTaskManagerServiceImpl$reportAutoPickAiAutocutEndForDraftRestore$1", f = "AsyncTaskManagerServiceImpl.kt", l = {535}, m = "invokeSuspend")
public final class C538680LAs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C538790LBd LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538680LAs(C538790LBd c538790LBd, String str, String str2, String str3, int i, int i2, String str4, String str5, InterfaceC1364105Vn<? super C538680LAs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c538790LBd;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C538680LAs(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJIJ = obj;
        C1C7U.LIZ("AsyncTaskManagerServiceImpl@7ddd.reportAutoPickAiAutocutEndForDraftRestore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            C538790LBd c538790LBd = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            objLJIJ = c538790LBd.LJIJ(str, this);
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.reportAutoPickAiAutocutEndForDraftRestore$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLJIJ;
        C0LSZ c0lsz = (C0LSZ) pair.getFirst();
        List list = (List) pair.getSecond();
        C538790LBd c538790LBd2 = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        int i2 = this.LLILZLL;
        int i3 = this.LLIZ;
        String str5 = this.LLIZLLLIL;
        String str6 = this.LLJ;
        c538790LBd2.getClass();
        C538790LBd.LJIIZILJ(list, str2, str3, str4, true, "DraftBox.draftRestore", c0lsz, i2, i3, str5, str6);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.reportAutoPickAiAutocutEndForDraftRestore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
