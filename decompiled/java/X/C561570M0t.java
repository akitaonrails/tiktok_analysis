package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.theater.consumption.entrance.CastPanelFragment;

/* JADX INFO: renamed from: X.0M0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561570M0t {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static void LIZ(FragmentManager fragmentManager, Aweme aweme, String str) {
        CastPanelFragment castPanelFragment = new CastPanelFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "aweme", aweme);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        castPanelFragment.setArguments(bundle);
        C259800zU c259800zU = new C259800zU();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        ?? r2 = c1390920mIc.LIZ;
        r2.LLJLILLLLZIIL = false;
        r2.LLJJIJI = castPanelFragment;
        r2.LLILLJJLI = new DialogInterfaceOnDismissListenerC580970MqV(c259800zU, 5);
        c259800zU.element = r2;
        C2211631BhB.LJIIJ(r2);
        ((DialogFragment) c259800zU.element).show(fragmentManager, "CastPanelFragment");
    }
}
