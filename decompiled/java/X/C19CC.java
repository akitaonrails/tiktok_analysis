package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: X.19CC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CC extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs/Kio9LWHELIOSsAICk2CzwvJSoVOiQrJCo9PA==";
    public C19CF LL;
    public C19AK LLILLJJLI;

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C19AK c19ak = this.LLILLJJLI;
        if (c19ak != null) {
            c19ak.LJI();
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C19CF c19cf = this.LL;
        if (c19cf != null) {
            C19CD c19cd = c19cf.LIZIZ;
            Activity activity = c19cd.LIZ;
            C788890Ux5.LIZ.get(activity).remove(c19cd.LIZJ.getTag());
            View view = c19cf.LIZ;
            if (view != null) {
                C19BL.LJFF(view);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        C19AK c19ak = this.LLILLJJLI;
        if (c19ak != null) {
            c19ak.LIZIZ();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C19AK c19ak = this.LLILLJJLI;
        if (c19ak != null) {
            c19ak.LIZJ();
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C19AK c19ak = this.LLILLJJLI;
        if (c19ak != null) {
            c19ak.LJ();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        C19AK c19ak = this.LLILLJJLI;
        if (c19ak != null) {
            c19ak.LJFF();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C19AK c19ak = this.LLILLJJLI;
        if (c19ak != null) {
            c19ak.LIZ(getActivity(), bundle);
        } else {
            FragmentManager fragmentManager = getActivity().getFragmentManager();
            C19BL.LIZ(fragmentManager, fragmentManager.beginTransaction().remove(this), false);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C19AK c19ak = this.LLILLJJLI;
        if (c19ak != null) {
            c19ak.LIZLLL(bundle);
        }
    }
}
