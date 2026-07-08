package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPublishPermissionViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10CC, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CC {
    public final View LIZ;
    public final LifecycleOwner LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 785));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 783));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 784));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS572S0100000_28(this, 786));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 782));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(571));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(570));
    public SoftReference<Fragment> LJIIIZ;

    public final TuxTextView LIZ() {
        return (TuxTextView) this.LJFF.getValue();
    }

    public final SubscriptionPublishPermissionViewModel LIZIZ() {
        return (SubscriptionPublishPermissionViewModel) this.LJII.getValue();
    }

    public final void LIZJ(String str) {
        int iIntValue;
        Integer numLIZJ;
        TuxTextView tuxTextViewLIZ = LIZ();
        if (tuxTextViewLIZ != null) {
            tuxTextViewLIZ.setText(str);
        }
        Context context = this.LIZ.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        TuxTextView tuxTextViewLIZ2 = LIZ();
        if (tuxTextViewLIZ2 != null) {
            tuxTextViewLIZ2.setTextColor(iIntValue);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LJI.getValue();
        if (tuxIconView != null) {
            tuxIconView.setTintColor(iIntValue);
        }
    }

    public C10CC(View view, LifecycleOwner lifecycleOwner) {
        this.LIZ = view;
        this.LIZIZ = lifecycleOwner;
    }
}
