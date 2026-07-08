package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01nf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C441301nf extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public C441301nf() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        DialogFragment dialogFragment;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue()).booleanValue();
            Fragment fragmentLJI = C724240Sb0.LJI(uIAssem2);
            if ((fragmentLJI instanceof LiveDialogFragment) && (dialogFragment = (DialogFragment) fragmentLJI) != null) {
                dialogFragment.dismissAllowingStateLoss();
            }
        }
        return Unit.LIZ;
    }
}
