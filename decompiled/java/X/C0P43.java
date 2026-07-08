package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.preview.BulletinEditPreviewAssem;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkbenchMiddleBannerCell;
import com.ss.android.ugc.aweme.minis.page.main.functions.guide.MinisAddShortCutFloatingNoticeAssem;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0P43, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P43 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void Ad$0(C0P43 c0p43, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
                break;
            case 4:
                Ad$4(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
            case 4:
                cm$4(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C0P43(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$0(C0P43 c0p43, Uri uri, View view, Throwable th) {
        C0CNO.LIZLLL(0L, new AwS553S0100000_9((BulletinEditPreviewAssem) c0p43.l0, 466));
    }

    public static final void cm$1(C0P43 c0p43, Uri uri, View view, Throwable th) {
        View viewFindViewById = ((WorkbenchMiddleBannerCell) c0p43.l0).itemView.findViewById(R.id.workbench_card_middle_banner_image);
        if (viewFindViewById != null) {
            C12ES.LJIILL(4, viewFindViewById);
        }
    }

    public static final void cm$2(C0P43 c0p43, Uri uri, View view, Throwable th) {
        TuxIconView workbenchCardMiddleIconFromXml = ((C0P0K) c0p43.l0).getWorkbenchCardMiddleIconFromXml();
        if (workbenchCardMiddleIconFromXml != null) {
            C12ES.LJIILL(4, workbenchCardMiddleIconFromXml);
        }
    }

    public static final void cm$3(C0P43 c0p43, Uri uri, View view, Throwable th) {
        ((AddYoursHubItemCellAssem) c0p43.l0).zp().setBackgroundDrawable((Drawable) ((AddYoursHubItemCellAssem) c0p43.l0).LLLII.getValue());
    }

    public static final void cm$4(C0P43 c0p43, Uri uri, View view, Throwable th) {
        ((MinisAddShortCutFloatingNoticeAssem) c0p43.l0).LLILZIL = false;
    }

    public static final void Ad$1(C0P43 c0p43, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        View viewFindViewById = ((WorkbenchMiddleBannerCell) c0p43.l0).itemView.findViewById(R.id.workbench_card_middle_banner_image);
        if (viewFindViewById != null) {
            C12ES.LJIILL(0, viewFindViewById);
        }
    }

    public static final void Ad$2(C0P43 c0p43, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        TuxIconView workbenchCardMiddleIconFromXml = ((C0P0K) c0p43.l0).getWorkbenchCardMiddleIconFromXml();
        if (workbenchCardMiddleIconFromXml != null) {
            C12ES.LJIILL(0, workbenchCardMiddleIconFromXml);
        }
    }

    public static final void Ad$3(C0P43 c0p43, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((AddYoursHubItemCellAssem) c0p43.l0).zp().setBackground(null);
    }

    public static final void Ad$4(C0P43 c0p43, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((MinisAddShortCutFloatingNoticeAssem) c0p43.l0).LLILZIL = true;
    }
}
