package X;

import Y.ARunnableS124S0100000_24;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sH5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620610sH5 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1620610sH5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$0(C1620610sH5 c1620610sH5, Uri uri, View view, Throwable th) {
        C1607740rwK c1607740rwK = (C1607740rwK) c1620610sH5.l0;
        HandlerHook.viewRemoveCallbacks(c1607740rwK, c1607740rwK.LLILZ);
        int visibility = c1607740rwK.getVisibility();
        c1607740rwK.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1607740rwK);
    }

    public static final void cm$1(C1620610sH5 c1620610sH5, Uri uri, View view, Throwable th) {
        C19EG activity = ((DetailSafRootFragment) c1620610sH5.l0).getActivity();
        if (activity != null) {
            activity.getWindow();
        }
        if (view != null) {
            view.findViewById(R.id.xuv);
        }
        C19EG activity2 = ((DetailSafRootFragment) c1620610sH5.l0).getActivity();
        if (activity2 != null) {
            C1606560ruQ.LJ(activity2);
        }
    }

    public static final void Ad$0(C1620610sH5 c1620610sH5, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1607740rwK c1607740rwK = (C1607740rwK) c1620610sH5.l0;
        c1607740rwK.LLILLJJLI = true;
        if (c1607740rwK.LLILLL) {
            C1607740rwK c1607740rwK2 = (C1607740rwK) c1620610sH5.l0;
            HandlerHook.viewPost(c1607740rwK2, new ARunnableS124S0100000_24(c1607740rwK2, 130));
        }
    }

    public static final void Ad$1(C1620610sH5 c1620610sH5, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C19EG activity = ((DetailSafRootFragment) c1620610sH5.l0).getActivity();
        if (activity != null) {
            activity.getWindow();
        }
        if (view != null) {
            view.findViewById(R.id.xuv);
        }
        C19EG activity2 = ((DetailSafRootFragment) c1620610sH5.l0).getActivity();
        if (activity2 != null) {
            C1606560ruQ.LJ(activity2);
        }
    }
}
