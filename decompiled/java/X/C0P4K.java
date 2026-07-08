package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerWidgetContainer;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationWidgetContainer;
import com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment;

/* JADX INFO: renamed from: X.0P4K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4K implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
        }
    }

    public static final void onCancel$0(C0P4K c0p4k, DialogInterface dialogInterface) {
        DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment = (DesignerStickerDetailAwemeListFragment) c0p4k.l0;
        Aweme aweme = (Aweme) c0p4k.l1;
        String str = designerStickerDetailAwemeListFragment.LLLIZZ;
        if (str != null) {
            String secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "prop_page");
            c2344009Gk.LJIIIIZZ("prop_id", str);
            c2344009Gk.LJIIIIZZ("prop_author_id", secAuthorUid);
            c2344009Gk.LJIIIIZZ("enter_method", C615450OBz.LIZIZ);
            c2344009Gk.LIZJ(1, "is_prop_author_video");
            C20684815ws.LJIILLIIL("cancel_editing_featured_video", c2344009Gk.LIZ);
        }
    }

    public static final void onCancel$1(C0P4K c0p4k, DialogInterface dialogInterface) {
        ((NotificationWidgetContainer) c0p4k.l0).lp((MusNotice) c0p4k.l1, "click", "cancel");
    }

    public static final void onCancel$2(C0P4K c0p4k, DialogInterface dialogInterface) {
        ((NotificationWidgetContainer) c0p4k.l0).lp((MusNotice) c0p4k.l1, "click", "cancel");
    }

    public static final void onCancel$3(C0P4K c0p4k, DialogInterface dialogInterface) {
        ((FollowerWidgetContainer) c0p4k.l0).kp((MusNotice) c0p4k.l1, "click", "cancel");
    }

    public C0P4K(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
