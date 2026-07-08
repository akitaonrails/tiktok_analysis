package X;

import Y.ARunnableS96S0200000_27;
import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.view.TakoInputExpandTextViewFragment;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ycu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864780ycu implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void beforeTextChanged$0(C1864780ycu c1864780ycu, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1864780ycu c1864780ycu, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C1864780ycu c1864780ycu, CharSequence charSequence, int i, int i2, int i3) {
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

    public static final void afterTextChanged$0(C1864780ycu c1864780ycu, Editable editable) {
        int selectionStart = ((C1842270y2b) c1864780ycu.l0).getSelectionStart();
        TakoInputExpandTextViewFragment takoInputExpandTextViewFragment = (TakoInputExpandTextViewFragment) c1864780ycu.l1;
        String str = TakoInputExpandTextViewFragment._pnsPageId;
        takoInputExpandTextViewFragment.gt2(selectionStart, true);
        ((TakoInputExpandTextViewFragment) c1864780ycu.l1).SR(!a0.LJJJIL(String.valueOf(C2204961BRm.v((C1842270y2b) c1864780ycu.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6gRXNGEdNA8bI9SKSxWjW46sYH+lLcISva7Y034clww9tLB+C", null)))));
        AwS606S0100000_27 awS606S0100000_27 = ((TakoInputExpandTextViewFragment) c1864780ycu.l1).LLJJIJI;
        if (awS606S0100000_27 != null) {
            awS606S0100000_27.invoke(String.valueOf(C2204961BRm.v((C1842270y2b) c1864780ycu.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6gRXNGEdNA8bI9SKSxWjW46sYH+lLcISva7Y034clww9tLB+C", null))));
        }
    }

    public static final void afterTextChanged$1(C1864780ycu c1864780ycu, Editable editable) {
        boolean z;
        C1854340yM4 c1854340yM4 = (C1854340yM4) c1864780ycu.l0;
        if (a0.LJLIIIL(String.valueOf(C2204961BRm.v((C1842270y2b) c1864780ycu.l1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0yZP5SGk0u70KzM2C1bcUL93MSPufveHmvHesfuUlNXDDEIv53c4PNLwNmfvxDKnxQ==", null)))).toString().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        c1854340yM4.LLJI = z;
        ((C1854340yM4) c1864780ycu.l0).LIZIZ();
        C1842270y2b c1842270y2b = (C1842270y2b) c1864780ycu.l1;
        HandlerHook.viewPost(c1842270y2b, new ARunnableS96S0200000_27(c1842270y2b, (C1854340yM4) c1864780ycu.l0, 14));
    }

    public C1864780ycu(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public static final void onTextChanged$0(C1864780ycu c1864780ycu, CharSequence charSequence, int i, int i2, int i3) {
        String string;
        String strSubstring;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        if (i3 > 0) {
            strSubstring = string.substring(i, i3 + i);
        } else {
            strSubstring = null;
        }
        ?? r0 = ((TakoInputExpandTextViewFragment) c1864780ycu.l1).LLJJ;
        if (r0 != 0) {
            r0.invoke(strSubstring);
        }
    }
}
