package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1415440mwA extends C2217421BqW implements Function1<String, Unit> {
    public C1415440mwA(Object obj) {
        super(1, obj, C1415280mvu.class, "updateTitle", "updateTitle(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        TuxTextView tuxTextView = ((C1415280mvu) this.receiver).LLJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str2);
        }
        return Unit.LIZ;
    }
}
