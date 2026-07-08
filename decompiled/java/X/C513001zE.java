package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01zE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C513001zE implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(C513001zE c513001zE, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C513001zE c513001zE, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C513001zE c513001zE, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C513001zE c513001zE, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C513001zE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C513001zE c513001zE, Editable editable) {
        String string;
        boolean z;
        long j;
        if (editable != null && (string = editable.toString()) != null) {
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    long j2 = CastLongProtector.parseLong(string);
                    if (j2 <= 0) {
                        C429770GtD c429770GtD = ((CountDownForAllV2SettingsDialog) c513001zE.l0).LLLJL;
                        if (c429770GtD != null) {
                            c429770GtD.setGuestEffectTargetScoreText("XXX");
                            return;
                        }
                        return;
                    }
                    if (j2 > 9223372036854775806L) {
                        ((CountDownForAllV2SettingsDialog) c513001zE.l0).NS(EnumC429101lh.MAX_VALUE_EXCEEDED);
                        return;
                    }
                    CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = (CountDownForAllV2SettingsDialog) c513001zE.l0;
                    countDownForAllV2SettingsDialog.getClass();
                    try {
                        j = CastLongProtector.parseLong(string);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        j = 0;
                    }
                    countDownForAllV2SettingsDialog.LLLILZ = j;
                    ((CountDownForAllV2SettingsDialog) c513001zE.l0).JS();
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    ((CountDownForAllV2SettingsDialog) c513001zE.l0).NS(EnumC429101lh.MAX_VALUE_EXCEEDED);
                    ((CountDownForAllV2SettingsDialog) c513001zE.l0).LLLILZ = 0L;
                    return;
                }
            }
            CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog2 = (CountDownForAllV2SettingsDialog) c513001zE.l0;
            countDownForAllV2SettingsDialog2.LLLILZ = 0L;
            C429770GtD c429770GtD2 = countDownForAllV2SettingsDialog2.LLLJL;
            if (c429770GtD2 != null) {
                c429770GtD2.setGuestEffectTargetScoreText("XXX");
            }
        }
    }

    public static final void afterTextChanged$1(C513001zE c513001zE, Editable editable) {
        String string;
        Function1 function1 = (Function1) c513001zE.l0;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        function1.invoke(string);
    }
}
