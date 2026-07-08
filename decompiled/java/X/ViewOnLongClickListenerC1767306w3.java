package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.debug.api.IIMDebugService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice.SystemNoticeReusedUISlotAssem;
import com.ss.android.ugc.aweme.msg.GroupSystemNoticeReusedUISlotAssem;

/* JADX INFO: renamed from: X.06w3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnLongClickListenerC1767306w3 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1767306w3 viewOnLongClickListenerC1767306w3, View view) {
        IIMDebugService.LIZ.getClass();
        IIMDebugService iIMDebugService = C1587706Jn.LIZIZ;
        if (iIMDebugService != null) {
            ((GroupSystemNoticeReusedUISlotAssem) viewOnLongClickListenerC1767306w3.l0).LJJIJL().getContext();
            ((C457780HxI) ((GroupSystemNoticeReusedUISlotAssem) viewOnLongClickListenerC1767306w3.l0).LLJJLIIIJLLLLLLLZ.getValue()).LL.getUuid();
            iIMDebugService.LIZIZ();
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1767306w3 viewOnLongClickListenerC1767306w3, View view) {
        IIMDebugService.LIZ.getClass();
        IIMDebugService iIMDebugService = C1587706Jn.LIZIZ;
        if (iIMDebugService != null) {
            ((SystemNoticeReusedUISlotAssem) viewOnLongClickListenerC1767306w3.l0).LJJIJL().getContext();
            ((C457780HxI) ((SystemNoticeReusedUISlotAssem) viewOnLongClickListenerC1767306w3.l0).LLJJLIIIJLLLLLLLZ.getValue()).LL.getUuid();
            iIMDebugService.LIZIZ();
            return true;
        }
        return true;
    }

    public ViewOnLongClickListenerC1767306w3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
