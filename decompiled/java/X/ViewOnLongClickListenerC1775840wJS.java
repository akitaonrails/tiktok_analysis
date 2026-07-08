package X;

import android.view.View;
import com.ss.android.ugc.aweme.publish.detail.EffectPublishOldFuncAssem;
import com.ss.android.ugc.aweme.publish.detail.EffectPublishPkgSizeMonitorAssem;

/* JADX INFO: renamed from: X.0wJS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewOnLongClickListenerC1775840wJS implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC1775840wJS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1775840wJS viewOnLongClickListenerC1775840wJS, View view) {
        ((EffectPublishPkgSizeMonitorAssem) viewOnLongClickListenerC1775840wJS.l0).getClass();
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1775840wJS viewOnLongClickListenerC1775840wJS, View view) {
        ((EffectPublishOldFuncAssem) viewOnLongClickListenerC1775840wJS.l0).getClass();
        return true;
    }
}
