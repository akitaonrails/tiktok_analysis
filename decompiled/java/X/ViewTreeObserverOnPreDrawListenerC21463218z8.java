package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.18z8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class ViewTreeObserverOnPreDrawListenerC21463218z8 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final AbstractC21463118z7 LL;
    public final ViewGroup LLILLJJLI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01be A[EDGE_INSN: B:128:0x01be->B:87:0x01be BREAK  A[LOOP:1: B:19:0x0098->B:86:0x01b9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e4  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnPreDrawListenerC21463218z8.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C786410Ut5.D3(this.LLILLJJLI.getViewTreeObserver(), this);
        this.LLILLJJLI.removeOnAttachStateChangeListener(this);
        C19748612Om.LIZJ.remove(this.LLILLJJLI);
        ArrayList<AbstractC21463118z7> arrayList = C19748612Om.LIZJ().get(this.LLILLJJLI);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC21463118z7> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIIJ(this.LLILLJJLI);
            }
        }
        this.LL.LJIIIIZZ(true);
    }

    public ViewTreeObserverOnPreDrawListenerC21463218z8(ViewGroup viewGroup, AbstractC21463118z7 abstractC21463118z7) {
        this.LL = abstractC21463118z7;
        this.LLILLJJLI = viewGroup;
    }
}
