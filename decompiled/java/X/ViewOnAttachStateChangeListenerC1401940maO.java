package X;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelContactRootAssem;
import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0maO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewOnAttachStateChangeListenerC1401940maO implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1401940maO viewOnAttachStateChangeListenerC1401940maO, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1401940maO viewOnAttachStateChangeListenerC1401940maO, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC1401940maO(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1401940maO viewOnAttachStateChangeListenerC1401940maO, View view) {
        SharePanelContactRootAssem sharePanelContactRootAssem = (SharePanelContactRootAssem) viewOnAttachStateChangeListenerC1401940maO.l0;
        C736680Sv4.LJIIIIZZ(sharePanelContactRootAssem, sharePanelContactRootAssem.hp(), C1362250lYN.LL, null, new AwS635S0100000_21(sharePanelContactRootAssem, 115), 6);
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1401940maO viewOnAttachStateChangeListenerC1401940maO, View view) {
        TuxSheet tuxSheet;
        C1388240mEI c1388240mEILIZ;
        DialogFragment dialogFragmentLIZ = C1346460l8u.LIZ(view);
        if ((dialogFragmentLIZ instanceof TuxSheet) && (tuxSheet = (TuxSheet) dialogFragmentLIZ) != null && (c1388240mEILIZ = C1388250mEJ.LIZ((TakoLongImageSharePackage) viewOnAttachStateChangeListenerC1401940maO.l0)) != null) {
            c1388240mEILIZ.LIZIZ = tuxSheet;
        }
    }
}
