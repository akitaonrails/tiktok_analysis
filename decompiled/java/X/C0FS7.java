package X;

import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FS7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FS7 extends C2217421BqW implements Function1<Boolean, Unit> {
    public C0FS7(C0FS1 c0fs1) {
        super(1, c0fs1, C0FS1.class, "updateSureView", "updateSureView(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C0FS1 c0fs1 = (C0FS1) this.receiver;
        TuxTextView tuxTextView = null;
        if (zBooleanValue) {
            TuxTextView tuxTextView2 = c0fs1.LLJIJIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setEnabled(false);
            TuxTextView tuxTextView3 = c0fs1.LLJIJIL;
            if (tuxTextView3 != null) {
                tuxTextView = tuxTextView3;
            }
            tuxTextView.setTextColorRes(R.attr.ei);
        } else {
            TuxTextView tuxTextView4 = c0fs1.LLJIJIL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setEnabled(true);
            TuxTextView tuxTextView5 = c0fs1.LLJIJIL;
            if (tuxTextView5 != null) {
                tuxTextView = tuxTextView5;
            }
            tuxTextView.setTextColorRes(R.attr.ee);
        }
        return Unit.LIZ;
    }
}
