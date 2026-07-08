package X;

import android.text.SpannableStringBuilder;
import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0f7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115050f7f extends C09AY implements Function2<SpannableStringBuilder, Boolean, Unit> {
    public final /* synthetic */ EditText LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115050f7f(C20586215gy c20586215gy, int i) {
        super(2);
        this.LL = c20586215gy;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(SpannableStringBuilder spannableStringBuilder, Boolean bool) {
        bool.booleanValue();
        EditText editText = this.LL;
        C1115360f8A c1115360f8A = C1115380f8C.LIZ;
        editText.setText(C1115380f8C.LIZ(this.LLILLJJLI, spannableStringBuilder));
        EditText editText2 = this.LL;
        editText2.setSelection(C2204961BRm.LLJILJILJ(editText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZej4bCYkQomM84yGcWQTpbvoN+DknKpuF8W", null)).length());
        return Unit.LIZ;
    }
}
