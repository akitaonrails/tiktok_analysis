package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01n2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem$discardGenerationDialog$1$2$1$1$1$1$3", f = "MixStudioResultsBaseAssem.kt", l = {}, m = "invokeSuspend")
public final class C437401n2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437401n2(Fragment fragment, Context context, InterfaceC1364105Vn<? super C437401n2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437401n2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioResultsBaseAssem@327b.discardGenerationDialog$1$2$1$1$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        new C1389890mGx(this.LL).LJIIJ(this.LLILLJJLI.getString(2131833103));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioResultsBaseAssem@327b.discardGenerationDialog$1$2$1$1$1$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
