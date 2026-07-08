package X;

import android.widget.TextView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337780DMa extends C09AY implements Function1<C1591980rWu, String> {
    public C337780DMa() {
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
