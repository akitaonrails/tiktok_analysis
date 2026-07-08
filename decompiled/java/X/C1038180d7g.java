package X;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0d7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038180d7g extends AbstractC1038200d7i {
    public final Fragment LLILLJJLI;
    public final C1037620d6m LLILLL;
    public final InterfaceC1038230d7l LLILZ;
    public FrameLayout LLILZIL;

    @Override // X.AbstractC1038200d7i
    public final void LJ() {
        LJFF(true);
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC1037610d6l
    public final String getUrl() {
        return this.LLILLL.LIZIZ;
    }

    @Override // X.InterfaceC1037610d6l
    public final Fragment getFragment() {
        return this.LLILLJJLI;
    }

    public final void LJFF(boolean z) {
        Context context;
        Activity activityLIZ;
        C19EG c19eg;
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout != null && (context = frameLayout.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            C486860J7k.LIZIZ(c19eg).KQ2(z);
        }
    }

    public C1038180d7g(Fragment fragment, C1037620d6m c1037620d6m) {
        InterfaceC1038230d7l interfaceC1038230d7lLIZ;
        this.LLILLJJLI = fragment;
        this.LLILLL = c1037620d6m;
        InterfaceC1038230d7l.LIZ.getClass();
        Iterator<InterfaceC1038250d7n> it2 = C1038170d7f.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                interfaceC1038230d7lLIZ = it2.next().LIZ(fragment, c1037620d6m);
                if (interfaceC1038230d7lLIZ != null) {
                    break;
                }
            } else {
                interfaceC1038230d7lLIZ = null;
                break;
            }
        }
        this.LLILZ = interfaceC1038230d7lLIZ;
    }
}
