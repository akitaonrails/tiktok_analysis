package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ne0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbneo.RequestSearchHorizontalDataMethodIDL$horizontalLoadMore$1", f = "RequestSearchHorizontalDataMethodIDL.kt", l = {126}, m = "invokeSuspend")
public final class C598700Ne0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C651160PgQ LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ Number LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598700Ne0(C651160PgQ c651160PgQ, int i, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, Number number, String str6, InterfaceC1364105Vn<? super C598700Ne0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c651160PgQ;
        this.LLILLL = i;
        this.LLILZ = num;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = j;
        this.LLJIJIL = j2;
        this.LLJILJIL = number;
        this.LLJILJILJ = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598700Ne0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C1C7U.LIZ("RequestSearchHorizontalDataMethodIDL@e9de.horizontalLoadMore$1");
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
            C651160PgQ c651160PgQ = this.LLILLJJLI;
            int i2 = this.LLILLL;
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            String str3 = this.LLIZ;
            String str4 = this.LLIZLLLIL;
            String str5 = this.LLJ;
            long j = this.LLJI;
            long j2 = this.LLJIJIL;
            Number number = this.LLJILJIL;
            if (number instanceof Integer) {
                num = (Integer) number;
            } else {
                num = null;
            }
            C651000PgA c651000PgA = new C651000PgA(str, str2, str3, str4, str5, j, j2, num, this.LLJILJILJ);
            this.LL = 1;
            if (c651160PgQ.LIZLLL(i2, c651000PgA, this) == objLJFF) {
                C1C7U.LIZIZ("RequestSearchHorizontalDataMethodIDL@e9de.horizontalLoadMore$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RequestSearchHorizontalDataMethodIDL@e9de.horizontalLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
