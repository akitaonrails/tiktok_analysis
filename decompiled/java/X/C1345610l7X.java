package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commentv2.actionbar.AbsCommentPageTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0l7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345610l7X extends AbstractC480470Isn implements C19YQ {
    public final FragmentManager LLIZ;
    public final List<AbsCommentPageTab> LLIZLLLIL;

    public final List<Fragment> LJJIJLIJ() {
        List<AbsCommentPageTab> list = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AbsCommentPageTab> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ().LIZ);
        }
        return arrayList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) LJJIJLIJ()).size();
    }

    @Override // X.C19YQ
    public final Drawable LJIIJ(int i) {
        InterfaceC1344590l5t interfaceC1344590l5t;
        if (!C1349280lDS.LJIIJJI()) {
            return null;
        }
        C128Y c128y = (Fragment) ListProtector.get(LJJIJLIJ(), i);
        if (!(c128y instanceof InterfaceC1344590l5t) || (interfaceC1344590l5t = (InterfaceC1344590l5t) c128y) == null) {
            return null;
        }
        return interfaceC1344590l5t.aJ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        if (C13LP.LJJJJ(obj, LJJIJLIJ())) {
            return ((ArrayList) LJJIJLIJ()).indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        C128Y c128y = (Fragment) ListProtector.get(LJJIJLIJ(), i);
        if (c128y instanceof InterfaceC1344590l5t) {
            return ((InterfaceC1344590l5t) c128y).c4(null);
        }
        return "";
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        return (Fragment) ListProtector.get(LJJIJLIJ(), i);
    }

    @Override // X.AbstractC480470Isn
    public final long LJJIJL(int i) {
        return ((AbsCommentPageTab) ListProtector.get(this.LLIZLLLIL, i)).LIZ().LIZIZ;
    }

    public final View LJJIL(int i) {
        Fragment fragment;
        if (((ArrayList) LJJIJLIJ()).isEmpty()) {
            return null;
        }
        if (i >= 0 && i < ((ArrayList) LJJIJLIJ()).size()) {
            fragment = (Fragment) ListProtector.get(LJJIJLIJ(), i);
        } else {
            fragment = (Fragment) ListProtector.get(LJJIJLIJ(), 0);
        }
        if (fragment instanceof InterfaceC1258040iqI) {
            return ((InterfaceC1258040iqI) ListProtector.get(LJJIJLIJ(), i)).LJJLIIIJILLIZJL();
        }
        return C991840buw.LIZ(fragment.getView());
    }

    public C1345610l7X(FragmentManager fragmentManager, List<AbsCommentPageTab> list) {
        super(fragmentManager, 0);
        this.LLIZ = fragmentManager;
        this.LLIZLLLIL = list;
    }

    @Override // X.C19YQ
    public final Drawable LIZIZ(int i, Context context) {
        InterfaceC1344590l5t interfaceC1344590l5t;
        if (!C1349280lDS.LJIIJJI()) {
            return null;
        }
        C128Y c128y = (Fragment) ListProtector.get(LJJIJLIJ(), i);
        if (!(c128y instanceof InterfaceC1344590l5t) || (interfaceC1344590l5t = (InterfaceC1344590l5t) c128y) == null) {
            return null;
        }
        return interfaceC1344590l5t.GF(context);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C19EH c19ehLJIIJ = this.LLIZ.LJIIJ();
        c19ehLJIIJ.LJIIZILJ((Fragment) obj);
        c19ehLJIIJ.LJIIJ();
    }
}
