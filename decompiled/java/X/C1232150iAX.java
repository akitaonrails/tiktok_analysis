package X;

import Y.ARunnableS119S0100000_19;
import android.text.TextUtils;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0iAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1232150iAX {
    @InterfaceC1294060jmO
    public static final void LIZ(EditText editText) {
        HandlerHook.viewPostDelay(editText, new ARunnableS119S0100000_19(editText, 19), 500L);
    }

    public static final void LIZIZ(EditText editText) {
        editText.requestFocus();
        HandlerHook.viewPostDelay(editText, new ARunnableS119S0100000_19(editText, 20), 500L);
    }

    public static final boolean LIZJ(EditText editText) {
        return TextUtils.isEmpty(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4NKO7Qcg+jimf8ZZkDAmYC0AtmcJX", null)));
    }
}
