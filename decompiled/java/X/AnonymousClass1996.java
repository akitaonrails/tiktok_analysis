package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManagerImpl;
import java.io.PrintWriter;

/* JADX INFO: renamed from: X.1996, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AnonymousClass1996<H> extends C19F6 {
    public final Activity LL;
    public final Context LLILLJJLI;
    public final Handler LLILLL;
    public final FragmentManager LLILZ = new FragmentManagerImpl();

    @Override // X.C19F6
    public View LIZIZ(int i) {
        return null;
    }

    @Override // X.C19F6
    public boolean LIZJ() {
        return true;
    }

    public void LJI(PrintWriter printWriter, String[] strArr) {
    }

    public abstract H LJII();

    @InterfaceC1294060jmO
    public void LJIIIZ(Fragment fragment, String[] strArr, int i) {
    }

    public boolean LJIIJ(String str) {
        return false;
    }

    public void LJIIL() {
    }

    public final Handler LJ() {
        if (!(this instanceof C198X)) {
            return this.LLILLL;
        }
        C198X c198x = (C198X) this;
        c198x.LLILZIL.getClass();
        return !C665300Q7s.LIZ() ? (Handler) c198x.LLILZIL.LLJJJIL.getValue() : C20580084k.LIZIZ;
    }

    public LayoutInflater LJIIIIZZ() {
        return C786410Ut5.ne(this.LLILLJJLI);
    }

    public final Activity LIZLLL() {
        return this.LL;
    }

    public AnonymousClass1996(Activity activity, Context context, Handler handler) {
        this.LL = activity;
        this.LLILLJJLI = context;
        this.LLILLL = handler;
    }

    public void LJIIJJI(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C838410Wul.LJIIIIZZ(this.LLILLJJLI, intent, bundle);
        } else {
            "Starting activity with a requestCode requires a FragmentActivity host".toString();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }
}
