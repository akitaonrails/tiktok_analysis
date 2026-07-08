package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01nL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageAssem$onViewCreated$7$1$1", f = "MixStudioGeneratingPageAssem.kt", l = {}, m = "invokeSuspend")
public final class C439301nL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ MixStudioGeneratingPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439301nL(View view, MixStudioGeneratingPageAssem mixStudioGeneratingPageAssem, InterfaceC1364105Vn<? super C439301nL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = mixStudioGeneratingPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C439301nL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("MixStudioGeneratingPageAssem@b2f1.onViewCreated$7$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        Context context = this.LLILLJJLI.getContext();
        if (context != null) {
            string = context.getString(2131835079);
        } else {
            string = null;
        }
        c1389890mGx.LJIIJ(string);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioGeneratingPageAssem@b2f1.onViewCreated$7$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
