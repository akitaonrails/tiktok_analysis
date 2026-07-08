package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.service.IAssistantService;

/* JADX INFO: renamed from: X.10kH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class ViewOnLongClickListenerC19332710kH implements View.OnLongClickListener {
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
            case 6:
                return onLongClick$6(this, view);
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC19332710kH(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC19332710kH viewOnLongClickListenerC19332710kH, View view) {
        C621180OYa.LIZ.LJJIJLIJ(((EmptyGuideV2) viewOnLongClickListenerC19332710kH.l0).LLIZ, "Following");
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC19332710kH viewOnLongClickListenerC19332710kH, View view) {
        ((RecSwipeViewModel) viewOnLongClickListenerC19332710kH.l0).FQ2(view.getContext(), view);
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC19332710kH viewOnLongClickListenerC19332710kH, View view) {
        ViewOnClickListenerC19230910Lj viewOnClickListenerC19230910Lj = (ViewOnClickListenerC19230910Lj) viewOnLongClickListenerC19332710kH.l0;
        InterfaceC19231710Lr interfaceC19231710Lr = viewOnClickListenerC19230910Lj.LLILLL;
        viewOnClickListenerC19230910Lj.getLayoutPosition();
        interfaceC19231710Lr.LJ();
        return true;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC19332710kH viewOnLongClickListenerC19332710kH, View view) {
        ViewOnClickListenerC19230910Lj viewOnClickListenerC19230910Lj = (ViewOnClickListenerC19230910Lj) viewOnLongClickListenerC19332710kH.l0;
        InterfaceC19231710Lr interfaceC19231710Lr = viewOnClickListenerC19230910Lj.LLILLL;
        viewOnClickListenerC19230910Lj.getLayoutPosition();
        interfaceC19231710Lr.LJ();
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC19332710kH viewOnLongClickListenerC19332710kH, View view) {
        ViewOnClickListenerC19230910Lj viewOnClickListenerC19230910Lj = (ViewOnClickListenerC19230910Lj) viewOnLongClickListenerC19332710kH.l0;
        InterfaceC19231710Lr interfaceC19231710Lr = viewOnClickListenerC19230910Lj.LLILLL;
        viewOnClickListenerC19230910Lj.getLayoutPosition();
        interfaceC19231710Lr.LJ();
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC19332710kH viewOnLongClickListenerC19332710kH, View view) {
        C10LU c10lu = (C10LU) viewOnLongClickListenerC19332710kH.l0;
        C10LW c10lw = c10lu.LLILLJJLI;
        c10lu.getLayoutPosition();
        c10lw.LJ();
        return true;
    }

    public static final boolean onLongClick$6(ViewOnLongClickListenerC19332710kH viewOnLongClickListenerC19332710kH, View view) {
        C10LU c10lu = (C10LU) viewOnLongClickListenerC19332710kH.l0;
        C10LW c10lw = c10lu.LLILLJJLI;
        c10lu.getLayoutPosition();
        c10lw.LJ();
        return true;
    }

    public static final boolean onLongClick$7(ViewOnLongClickListenerC19332710kH viewOnLongClickListenerC19332710kH, View view) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Activity activityL5 = ((AbstractC1903430zdF) viewOnLongClickListenerC19332710kH.l0).L5();
        if ((activityL5 instanceof C19EG) && (c19eg = (C19EG) activityL5) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            ((DialogFragment) ((AbstractC1903430zdF) viewOnLongClickListenerC19332710kH.l0).LL.getValue()).show(supportFragmentManager, "MultiBaseVH");
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$8(ViewOnLongClickListenerC19332710kH viewOnLongClickListenerC19332710kH, View view) {
        IAssistantService iAssistantService = (IAssistantService) ServiceManager.get().getService(IAssistantService.class);
        if (iAssistantService != null) {
            iAssistantService.openPage(((C19310610gi) viewOnLongClickListenerC19332710kH.l0).LL.getContext());
            return true;
        }
        return true;
    }
}
