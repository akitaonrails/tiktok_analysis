package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class ViewOnLongClickListenerC580930MqR implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC580930MqR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC580930MqR viewOnLongClickListenerC580930MqR, View view) {
        ((VideoImageMixedController) viewOnLongClickListenerC580930MqR.l0).LLJJIJIL.invoke();
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC580930MqR viewOnLongClickListenerC580930MqR, View view) {
        Function0<Unit> function0 = ((VideoImageMixedController) viewOnLongClickListenerC580930MqR.l0).LLJJJ;
        if (function0 != null) {
            function0.invoke();
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC580930MqR viewOnLongClickListenerC580930MqR, View view) {
        ((VideoImageMixedController) viewOnLongClickListenerC580930MqR.l0).LLJJIJIL.invoke();
        return true;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC580930MqR viewOnLongClickListenerC580930MqR, View view) {
        C0M6V.U5(((C0M6V) viewOnLongClickListenerC580930MqR.l0).LL.getContext());
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC580930MqR viewOnLongClickListenerC580930MqR, View view) {
        NewDraftViewHolder newDraftViewHolder = (NewDraftViewHolder) viewOnLongClickListenerC580930MqR.l0;
        newDraftViewHolder.getClass();
        C1443030nef c1443030nefLJII = C1443030nef.LJII();
        Context context = view.getContext();
        c1443030nefLJII.getClass();
        if (C1443030nef.LJI(context)) {
            C0M0P c0m0p = newDraftViewHolder.LLJJIJIIJIL;
            C0HZQ c0hzq = null;
            if (c0m0p == null) {
                c0m0p = null;
            }
            if (!c0m0p.LIZIZ) {
                newDraftViewHolder.LL.v1();
                C0M3H c0m3h = newDraftViewHolder.LL;
                C0M0P c0m0p2 = newDraftViewHolder.LLJJIJIIJIL;
                if (c0m0p2 == null) {
                    c0m0p2 = null;
                }
                c0m3h.l(c0m0p2);
            }
            C0HZQ c0hzq2 = newDraftViewHolder.LLJJIII;
            if (c0hzq2 == null) {
                c0hzq2 = null;
            }
            if (c0hzq2.isEnabled()) {
                C0HZQ c0hzq3 = newDraftViewHolder.LLJJIII;
                if (c0hzq3 == null) {
                    c0hzq3 = null;
                }
                C0M0P c0m0p3 = newDraftViewHolder.LLJJIJIIJIL;
                if (c0m0p3 == null) {
                    c0m0p3 = null;
                }
                c0hzq3.setChecked(!c0m0p3.LJIIJJI);
                C0M3H c0m3h2 = newDraftViewHolder.LL;
                C0HZQ c0hzq4 = newDraftViewHolder.LLJJIII;
                C0M0P c0m0p4 = newDraftViewHolder.LLJJIJIIJIL;
                if (c0m0p4 == null) {
                    c0m0p4 = null;
                }
                if (c0hzq4 != null) {
                    c0hzq = c0hzq4;
                }
                c0m3h2.v3(c0m0p4, c0hzq.isChecked(), true);
            }
        }
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC580930MqR viewOnLongClickListenerC580930MqR, View view) {
        ((C0M3N) viewOnLongClickListenerC580930MqR.l0).LLILLL.invoke();
        return true;
    }
}
