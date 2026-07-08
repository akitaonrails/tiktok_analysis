package X;

import android.text.Editable;
import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0I8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtCreationPanelKt$ThoughtBubbleEditView$2$1", f = "SocialThoughtCreationPanel.kt", l = {}, m = "invokeSuspend")
public final class C461750I8v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ EditText[] LLILLJJLI;
    public final /* synthetic */ boolean[] LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C461750I8v(String str, EditText[] editTextArr, boolean[] zArr, Function0<Unit> function0, InterfaceC1364105Vn<? super C461750I8v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = editTextArr;
        this.LLILLL = zArr;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C461750I8v(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        int length;
        C1C7U.LIZ("SocialThoughtCreationPanelKt@90c9.ThoughtBubbleEditView$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        if (str == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialThoughtCreationPanelKt@90c9.ThoughtBubbleEditView$2$1");
            return unit;
        }
        EditText editText = this.LLILLJJLI[0];
        if (editText == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SocialThoughtCreationPanelKt@90c9.ThoughtBubbleEditView$2$1");
            return unit2;
        }
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxsIa5vyM7VV+Jl0+7O0GY8L9FouNLLfzWuPp7xnfbWLmSZrx5YRPc=", null));
        if (editableLLJILLL != null) {
            string = editableLLJILLL.toString();
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF(string, str)) {
            this.LLILLL[0] = true;
            editText.setText(str);
            Editable editableLLJILLL2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxsIa5vyM7VV+Jl0+7O0GY8L9FouNLLfzWuPp7xnfbWLmSZrx5YRPc=", null));
            if (editableLLJILLL2 != null) {
                length = editableLLJILLL2.length();
            } else {
                length = 0;
            }
            editText.setSelection(length);
            this.LLILLL[0] = false;
        }
        this.LLILZ.invoke();
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtCreationPanelKt@90c9.ThoughtBubbleEditView$2$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
