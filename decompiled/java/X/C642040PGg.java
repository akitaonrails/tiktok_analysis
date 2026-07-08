package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS624S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0PGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem$onViewCreated$1", f = "SearchTop1BackgroundAssem.kt", l = {}, m = "invokeSuspend")
public final class C642040PGg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchTop1BackgroundAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C642040PGg(SearchTop1BackgroundAssem searchTop1BackgroundAssem, InterfaceC1364105Vn<? super C642040PGg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchTop1BackgroundAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C642040PGg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchTop1BackgroundAssem@1019.onViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchTop1BackgroundAssem searchTop1BackgroundAssem = this.LL;
        C736680Sv4.LJIIIIZZ(searchTop1BackgroundAssem, searchTop1BackgroundAssem.Ho(), new C2217381BqS() { // from class: X.0PGh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C642060PGi) obj2).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS624S0100000_10(this.LL, 15), 4);
        SearchTop1BackgroundAssem searchTop1BackgroundAssem2 = this.LL;
        C736680Sv4.LJIIIIZZ(searchTop1BackgroundAssem2, searchTop1BackgroundAssem2.Ho(), new C2217381BqS() { // from class: X.0PGj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C642060PGi) obj2).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS624S0100000_10(this.LL, 16), 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchTop1BackgroundAssem@1019.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
