package X;

import android.widget.TextView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DMZ extends C09AY implements Function1<C1591980rWu, String> {
    public C0DMZ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(C1591980rWu c1591980rWu) {
        TextView customTextView;
        CharSequence text;
        String string;
        C1592080rX4 c1592080rX4 = c1591980rWu.LIZLLL;
        if (c1592080rX4 == null || (customTextView = c1592080rX4.getCustomTextView()) == null || (text = customTextView.getText()) == null || (string = text.toString()) == null) {
            return "";
        }
        return string;
    }
}
