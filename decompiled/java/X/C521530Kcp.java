package X;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.api.PerkTag;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.common.SubscribeNoticeDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521530Kcp extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    public static final void onClick$0(C521530Kcp c521530Kcp, View view) {
        ((Function0) c521530Kcp.l0).invoke();
        FragmentManager fragmentManager = (FragmentManager) c521530Kcp.l1;
        if (fragmentManager != null) {
            String str = SubscribeNoticeDialog._pnsPageId;
            C510530K0l.LIZ(fragmentManager, ((PerkTag) c521530Kcp.l2).popupContent);
        }
    }

    public static final void onClick$1(C521530Kcp c521530Kcp, View view) {
        ((Function0) c521530Kcp.l0).invoke();
        FragmentManager fragmentManager = (FragmentManager) c521530Kcp.l1;
        if (fragmentManager != null) {
            String str = SubscribeNoticeDialog._pnsPageId;
            C510530K0l.LIZ(fragmentManager, ((PerkTag) c521530Kcp.l2).popupContent);
        }
    }

    public C521530Kcp(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
