package Y;

import X.AnonymousClass0573;
import X.AnonymousClass0576;
import X.C09JN;
import X.C0FNV;
import X.C12998056u;
import X.C13000056w;
import X.C1389890mGx;
import X.C19EG;
import X.C1C7U;
import X.C259800zU;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyBatchSyncResponse;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class AfS38S1200000_2 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS38S1200000_2 afS38S1200000_2, Object obj) {
        Dialog dialog;
        C1C7U.LIZ("InboxNotificationRouter@139a.openInboxNotification$1$2$5$1");
        if (Intrinsics.LJFF(afS38S1200000_2.s0, "dm_guide_modify_inbox_permission_popup")) {
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) afS38S1200000_2.l1);
            c1389890mGx.LJIIIZ(2131828199);
            c1389890mGx.LJIIJJI();
        }
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) afS38S1200000_2.l2).element;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            C0FNV.LIZ(dialog);
        }
        C1C7U.LIZIZ("InboxNotificationRouter@139a.openInboxNotification$1$2$5$1");
    }

    public static final void accept$1(AfS38S1200000_2 afS38S1200000_2, Object obj) {
        C1C7U.LIZ("LocalImageThumbnailUtils@28a9.load$disposable$1");
        Bitmap bitmap = (Bitmap) obj;
        if (Intrinsics.LJFF(((ImageView) afS38S1200000_2.l1).getTag(), afS38S1200000_2.s0) && bitmap != null) {
            ((ImageView) afS38S1200000_2.l1).setImageBitmap(bitmap);
            Function1 function1 = (Function1) afS38S1200000_2.l2;
            if (function1 != null) {
                function1.invoke(bitmap);
            }
        } else {
            Function1 function12 = (Function1) afS38S1200000_2.l2;
            if (function12 != null) {
                function12.invoke(null);
            }
        }
        C1C7U.LIZIZ("LocalImageThumbnailUtils@28a9.load$disposable$1");
    }

    public static final void accept$2(AfS38S1200000_2 afS38S1200000_2, Object obj) {
        C1C7U.LIZ("PeriodicSyncScheduler@38b.syncWith$disp$1");
        C13000056w.LIZJ((AnonymousClass0576) afS38S1200000_2.l1);
        C12998056u.LIZ((FrequencyBatchSyncResponse) obj, afS38S1200000_2.s0, (List) afS38S1200000_2.l2);
        C1C7U.LIZIZ("PeriodicSyncScheduler@38b.syncWith$disp$1");
    }

    public static final void accept$3(AfS38S1200000_2 afS38S1200000_2, Object obj) {
        C1C7U.LIZ("LocalImageThumbnailUtils@a178.load$disposable$1");
        Bitmap bitmap = (Bitmap) obj;
        if (Intrinsics.LJFF(((ImageView) afS38S1200000_2.l1).getTag(), afS38S1200000_2.s0) && bitmap != null) {
            ((ImageView) afS38S1200000_2.l1).setImageBitmap(bitmap);
            Function1 function1 = (Function1) afS38S1200000_2.l2;
            if (function1 != null) {
                function1.invoke(bitmap);
            }
        } else {
            Function1 function12 = (Function1) afS38S1200000_2.l2;
            if (function12 != null) {
                function12.invoke(null);
            }
        }
        C1C7U.LIZIZ("LocalImageThumbnailUtils@a178.load$disposable$1");
    }

    public AfS38S1200000_2(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }

    public AfS38S1200000_2(AnonymousClass0573 anonymousClass0573, String str, String str2, List list, int i) {
        this.$t = i;
        this.l1 = anonymousClass0573;
        this.s0 = str2;
        this.l2 = list;
    }
}
