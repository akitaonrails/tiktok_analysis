package X;

import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20515215Pi {
    public final C1057450dcl LIZ = new C1057450dcl(0);
    public Context LIZIZ;
    public final ViewGroup LIZJ;
    public C20515515Pl LIZLLL;
    public C20514915Pf LJ;

    public final void LIZIZ() {
        C20515515Pl c20515515Pl = this.LIZLLL;
        if (c20515515Pl != null) {
            c20515515Pl.LLILZLL = 3;
            c20515515Pl.dismiss();
        }
        C20514915Pf c20514915Pf = this.LJ;
        if (c20514915Pf != null) {
            c20514915Pf.LLJLLIL = 3;
            c20514915Pf.LJIJJLI();
        }
    }

    public final void LIZLLL() {
        WeakReference<C20515515Pl> weakReference;
        C20515515Pl c20515515Pl;
        C1057450dcl c1057450dcl = this.LIZ;
        if (c1057450dcl.LJIILL) {
            LJ();
            return;
        }
        Context context = this.LIZIZ;
        ViewGroup viewGroup = this.LIZJ;
        CharSequence charSequence = c1057450dcl.LJFF;
        CharSequence charSequence2 = c1057450dcl.LJ;
        if (context == null) {
            "context must not be null".toString();
            throw new IllegalStateException("context must not be null");
        }
        if (viewGroup == null) {
            "parent must not be null".toString();
            throw new IllegalStateException("parent must not be null");
        }
        if ((charSequence2 == null || charSequence2.length() == 0) && (charSequence == null || charSequence.length() == 0)) {
            "title & message view cannot be null at the same time".toString();
            throw new IllegalStateException("title & message view cannot be null at the same time");
        }
        C20515515Pl c20515515Pl2 = new C20515515Pl(context, viewGroup, this.LIZ);
        this.LIZLLL = c20515515Pl2;
        try {
            View view = c20515515Pl2.LLILZ;
            if (view == null) {
                view = null;
            }
            view.measure(0, 0);
            c20515515Pl2.showAtLocation(c20515515Pl2.LLILLJJLI, 80, 0, 0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(c20515515Pl2);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            View view2 = c20515515Pl2.LLILZ;
            if (view2 == null) {
                view2 = null;
            }
            C20516215Ps c20516215Ps = (C20516215Ps) view2.findViewById(R.id.pd0);
            float f = c20516215Ps.LLJILLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20516215Ps);
            c20516215Ps.setTranslationY(f);
            c20516215Ps.LIZ(true);
            if (c20515515Pl2.LLILLL.LIZJ) {
                C786410Ut5.LJLIIL(c20515515Pl2.LLILLL.LIZIZ, new BPEAHandler(Looper.getMainLooper()), new ARunnableS131S0100000_31(c20515515Pl2, 162));
            }
            c20515515Pl2.LJJIIJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        WeakReference<View> weakReference2 = C20515515Pl.LLJI;
        if (Intrinsics.LJFF(weakReference2 != null ? weakReference2.get() : null, c20515515Pl2.LLILLJJLI) && (weakReference = C20515515Pl.LLJIJIL) != null && (c20515515Pl = weakReference.get()) != null && !Intrinsics.LJFF(c20515515Pl, c20515515Pl2) && c20515515Pl.isShowing()) {
            c20515515Pl.LJJIIJZLJL();
        }
        C20515515Pl.LLJI = new WeakReference<>(c20515515Pl2.LLILLJJLI);
        C20515515Pl.LLJIJIL = new WeakReference<>(c20515515Pl2);
    }

    public final void LJ() {
        Context context = this.LIZIZ;
        ViewGroup viewGroup = this.LIZJ;
        C1057450dcl c1057450dcl = this.LIZ;
        CharSequence charSequence = c1057450dcl.LJFF;
        CharSequence charSequence2 = c1057450dcl.LJ;
        if (context == null) {
            "context must not be null".toString();
            throw new IllegalStateException("context must not be null");
        }
        if (viewGroup == null) {
            "parent must not be null".toString();
            throw new IllegalStateException("parent must not be null");
        }
        if ((charSequence2 == null || charSequence2.length() == 0) && (charSequence == null || charSequence.length() == 0)) {
            "title & message view cannot be null at the same time".toString();
            throw new IllegalStateException("title & message view cannot be null at the same time");
        }
        C20514915Pf c20514915Pf = new C20514915Pf(viewGroup, this.LIZ, context);
        this.LJ = c20514915Pf;
        try {
            c20514915Pf.measure(0, 0);
            c20514915Pf.LJIL();
            C20516215Ps c20516215Ps = c20514915Pf.LLJL;
            float f = c20516215Ps.LLJILLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20516215Ps);
            c20516215Ps.setTranslationY(f);
            c20514915Pf.LLJL.LIZ(true);
            if (c20514915Pf.LLJJLIIIJLLLLLLLZ.LIZJ) {
                C786410Ut5.LJLIIL(c20514915Pf.LLJJLIIIJLLLLLLLZ.LIZIZ, new BPEAHandler(Looper.getMainLooper()), new ARunnableS131S0100000_31(c20514915Pf, 164));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C20515215Pi(DialogC989903tx dialogC989903tx) {
        View decorView;
        Window window = dialogC989903tx.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZJ = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        this.LIZIZ = dialogC989903tx.getContext();
    }

    public final void LIZ(int i) {
        String string;
        C1057450dcl c1057450dcl = this.LIZ;
        Context context = this.LIZIZ;
        if (context != null) {
            string = context.getString(i);
        } else {
            string = null;
        }
        c1057450dcl.LJI = string;
    }

    public final void LIZJ(int i) {
        String string;
        C1057450dcl c1057450dcl = this.LIZ;
        Context context = this.LIZIZ;
        if (context != null) {
            string = context.getString(i);
        } else {
            string = null;
        }
        c1057450dcl.LJFF = string;
    }

    public final void LJFF(C419910GdJ c419910GdJ) {
        LJI(new C5183020f(c419910GdJ, 264));
    }

    public final void LJI(Function1 function1) {
        this.LIZ.LIZ = new AwS585S0100000_6(function1, (Function1<? super C1721380utc, ? extends List<? extends Object>>) 355);
    }

    public final void LJII(int i) {
        String string;
        C1057450dcl c1057450dcl = this.LIZ;
        Context context = this.LIZIZ;
        if (context != null) {
            string = context.getString(i);
        } else {
            string = null;
        }
        c1057450dcl.LJ = string;
    }

    public C20515215Pi(Fragment fragment) {
        View rootView;
        View view = fragment.getView();
        if (view != null) {
            rootView = view.getRootView();
        } else {
            rootView = null;
        }
        this.LIZJ = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        this.LIZIZ = fragment.getContext();
    }

    public C20515215Pi(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZJ = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        this.LIZIZ = activity;
    }

    public C20515215Pi(ViewGroup viewGroup) {
        this.LIZJ = viewGroup;
        this.LIZIZ = viewGroup.getContext();
    }
}
