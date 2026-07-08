package X;

import android.os.Bundle;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptProcessFragment;

/* JADX INFO: renamed from: X.0JBV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JBV {
    public static PaPromptProcessFragment LIZ(int i, int i2, String str) {
        PaPromptProcessFragment paPromptProcessFragment = new PaPromptProcessFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("private_account_prompt", i);
        bundle.putInt("private_account_prompt_type", i2);
        C786410Ut5.LJJJI("enter_position", str, bundle);
        paPromptProcessFragment.setArguments(bundle);
        return paPromptProcessFragment;
    }
}
