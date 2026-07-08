package X;

import android.widget.EditText;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.TextInputSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DSS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.TextInputSheetFragment$onResume$1", f = "TextInputSheetFragment.kt", l = {576, 587}, m = "invokeSuspend")
public final class C0DSS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EditText LLILLJJLI;
    public final /* synthetic */ TextInputSheetFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DSS(EditText editText, TextInputSheetFragment textInputSheetFragment, InterfaceC1364105Vn<? super C0DSS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editText;
        this.LLILLL = textInputSheetFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DSS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "TextInputSheetFragment@d367.onResume$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LL
            r2 = 200(0xc8, double:9.9E-322)
            r8 = 2
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 == r6) goto L37
            if (r0 != r8) goto L70
            X.C155000ia.LIZIZ(r11)
        L19:
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.TextInputSheetFragment r0 = r10.LLILLL
            android.widget.FrameLayout r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L22
            X.C786410Ut5.LJZ(r5, r0)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L28:
            X.C155000ia.LIZIZ(r11)
            r10.LL = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r10)
            if (r0 != r7) goto L3a
            X.C1C7U.LIZIZ(r9)
            return r7
        L37:
            X.C155000ia.LIZIZ(r11)
        L3a:
            android.widget.EditText r0 = r10.LLILLJJLI
            if (r0 == 0) goto L78
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L78
            android.widget.EditText r4 = r10.LLILLJJLI
            if (r4 == 0) goto L64
            r4.requestFocus()
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = X.C786410Ut5.H2(r1, r0)
            boolean r0 = r1 instanceof android.view.inputmethod.InputMethodManager
            if (r0 == 0) goto L64
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            if (r1 == 0) goto L64
            boolean r0 = r1.showSoftInput(r4, r6)
            java.lang.Boolean.valueOf(r0)
        L64:
            r10.LL = r8
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r10)
            if (r0 != r7) goto L19
            X.C1C7U.LIZIZ(r9)
            return r7
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L78:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DSS.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
