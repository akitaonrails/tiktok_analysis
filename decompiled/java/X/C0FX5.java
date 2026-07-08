package X;

import Y.ARunnableS105S0100000_5;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FX5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX5 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$1(C0FX5 c0fx5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C0FX5 c0fx5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C0FX5 c0fx5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C0FX5 c0fx5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C0FX5 c0fx5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C0FX5 c0fx5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C0FX5 c0fx5, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
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
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
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
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C0FX5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$0(X.C0FX5 r9, android.text.Editable r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FX5.afterTextChanged$0(X.0FX5, android.text.Editable):void");
    }

    public static final void afterTextChanged$1(C0FX5 c0fx5, Editable editable) {
        C384700F6m c384700F6m = (C384700F6m) c0fx5.l0;
        if (!c384700F6m.LLJZ && editable != null) {
            Regex regex = new Regex("[\\p{L}\\p{N}\\p{P}\\p{Z}\\p{M}\\p{S}\\uD83C-\\uDBFF\\uDC00-\\uDFFF\\n\\r]");
            String string = editable.toString();
            StringBuilder sb = new StringBuilder();
            int length = string.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = string.charAt(i);
                if (regex.matches(String.valueOf(cCharAt))) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (!Intrinsics.LJFF(string, string2)) {
                int selectionStart = c384700F6m.LLLLLL().getSelectionStart();
                int selectionEnd = c384700F6m.LLLLLL().getSelectionEnd();
                if (selectionStart < 0) {
                    selectionStart = string2.length();
                }
                if (selectionEnd < 0) {
                    selectionEnd = string2.length();
                }
                c384700F6m.LLJZ = true;
                try {
                    editable.replace(0, editable.length(), string2);
                    int length2 = string2.length();
                    int iLJ = C13LZ.LJ(selectionStart, 0, length2);
                    int iLJ2 = C13LZ.LJ(selectionEnd, 0, length2);
                    c384700F6m.LLLLLL().setSelection(Math.min(iLJ, iLJ2), Math.max(iLJ, iLJ2));
                    c384700F6m.LLJZ = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c384700F6m.LLJZ = false;
                    throw th;
                }
            }
            if (string2.length() > 2000) {
                C383990F3t c383990F3t = C383990F3t.LIZ;
                Activity activityRequireActivity = c384700F6m.requireActivity();
                C377760ErW c377760ErW = new C377760ErW(-5, null, 2000, null, null, 21);
                c383990F3t.getClass();
                C383990F3t.LJ(activityRequireActivity, c377760ErW);
            }
            if (!Intrinsics.LJFF(c384700F6m.LLLLILI().LIZ.LIZIZ, string2)) {
                c384700F6m.LLLLIL().LIZLLL.invoke(string2);
            }
            C369780Eee.LIZ.getClass();
            if (C369780Eee.LIZIZ()) {
                ARunnableS105S0100000_5 aRunnableS105S0100000_5 = c384700F6m.LLJZIJLIL;
                if (aRunnableS105S0100000_5 != null) {
                    HandlerHook.viewRemoveCallbacks(c384700F6m.LLLLLL(), aRunnableS105S0100000_5);
                }
                c384700F6m.LLJZIJLIL = new ARunnableS105S0100000_5(c384700F6m, 28);
                HandlerHook.viewPost(c384700F6m.LLLLLL(), c384700F6m.LLJZIJLIL);
            }
        }
    }

    public static final void afterTextChanged$2(C0FX5 c0fx5, Editable editable) {
        if (editable != null) {
            C0F65 c0f65 = (C0F65) c0fx5.l0;
            Regex regex = new Regex("[\\p{L}\\p{N}\\p{P}\\p{Z}\\p{M}\\p{S}\\uD83C-\\uDBFF\\uDC00-\\uDFFF]");
            String string = editable.toString();
            StringBuilder sb = new StringBuilder();
            int length = string.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = string.charAt(i);
                if (regex.matches(String.valueOf(cCharAt))) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (!Intrinsics.LJFF(editable.toString(), string2)) {
                editable.replace(0, editable.length(), string2);
            }
            if (c0f65.LLJZ) {
                c0f65.LLJZ = false;
            } else {
                c0f65.LLLLIL().LIZJ.invoke(new C378480Esg(0, string2));
                c0f65.LLLLLJIL(string2);
            }
        }
    }

    public static final void afterTextChanged$3(C0FX5 c0fx5, Editable editable) {
        if (editable != null) {
            C0FC1 c0fc1 = (C0FC1) c0fx5.l0;
            Regex regex = new Regex("[\\p{L}\\p{N}\\p{P}\\p{Z}\\p{M}\\p{S}\\uD83C-\\uDBFF\\uDC00-\\uDFFF]");
            String string = a0.LJLJJL(editable.toString()).toString();
            StringBuilder sb = new StringBuilder();
            int length = string.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = string.charAt(i);
                if (regex.matches(String.valueOf(cCharAt))) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (!Intrinsics.LJFF(editable.toString(), string2)) {
                editable.replace(0, editable.length(), string2);
            }
            c0fc1.LLLLIL().LIZIZ.invoke(string2);
            if (string2.length() > 300) {
                ((TextView) c0fc1.LLJLIL.getValue()).setText(String.valueOf(string2.length()));
                ((TextView) c0fc1.LLJLILLLLZIIL.getValue()).setText("/300");
                if (((View) c0fc1.LLJLL.getValue()).getVisibility() == 8) {
                    C383990F3t c383990F3t = C383990F3t.LIZ;
                    Activity activityRequireActivity = c0fc1.requireActivity();
                    C377760ErW c377760ErW = new C377760ErW(-5, null, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, null, null, 21);
                    c383990F3t.getClass();
                    C383990F3t.LJ(activityRequireActivity, c377760ErW);
                }
                C197039127h c197039127h = (C197039127h) c0fc1.LLJLLIL.getValue();
                c197039127h.setEnabled(false);
                c197039127h.setClickable(false);
                C786410Ut5.LJZL(0, (LinearLayout) c0fc1.LLJLL.getValue());
                return;
            }
            boolean zLLLLLLIL = c0fc1.LLLLLLIL();
            C197039127h c197039127h2 = (C197039127h) c0fc1.LLJLLIL.getValue();
            c197039127h2.setEnabled(zLLLLLLIL);
            c197039127h2.setClickable(zLLLLLLIL);
            C786410Ut5.LJZL(8, (LinearLayout) c0fc1.LLJLL.getValue());
        }
    }

    public static final void beforeTextChanged$0(C0FX5 c0fx5, CharSequence charSequence, int i, int i2, int i3) {
        C390230FRt c390230FRt = (C390230FRt) c0fx5.l0;
        c390230FRt.LJFF = i;
        c390230FRt.LJI = i3;
    }
}
