package X;

import android.view.View;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Rts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem$transitionToNewState$1", f = "TranslationStatusAssem.kt", l = {473}, m = "invokeSuspend")
public final class C710460Rts extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TranslationStatusAssem LLILLJJLI;
    public final /* synthetic */ C0S5P LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C0S5R LLILZIL;
    public final /* synthetic */ C0S5N LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710460Rts(TranslationStatusAssem translationStatusAssem, C0S5P c0s5p, boolean z, C0S5R c0s5r, C0S5N c0s5n, View view, InterfaceC1364105Vn<? super C710460Rts> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = translationStatusAssem;
        this.LLILLL = c0s5p;
        this.LLILZ = z;
        this.LLILZIL = c0s5r;
        this.LLILZLL = c0s5n;
        this.LLIZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710460Rts(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TranslationStatusAssem@113f.transitionToNewState$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("TranslationStatusAssem@113f.transitionToNewState$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.Ip(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TranslationStatusAssem@113f.transitionToNewState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
