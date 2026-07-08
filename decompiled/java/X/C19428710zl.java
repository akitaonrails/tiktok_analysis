package X;

import Y.ARunnableS33S1100000_29;
import com.ss.android.ugc.aweme.view.autocreation.ProfileNaviAutoCreationCameraContainerFragment;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19428710zl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ ProfileNaviAutoCreationCameraContainerFragment LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19428710zl(int i, int i2, ProfileNaviAutoCreationCameraContainerFragment profileNaviAutoCreationCameraContainerFragment, String str) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = profileNaviAutoCreationCameraContainerFragment;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL == 8193) {
            C19423210ys.LIZ.getClass();
            String strValueOf = String.valueOf(new Date().getTime());
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("end_time", strValueOf);
            c2344009Gk.LJIIIIZZ("enter_from", "avatar_hub");
            c2344009Gk.LJIIIIZZ("enter_method", "click");
            C20684815ws.LJIILLIIL("capture_auto_avatar_scan", c2344009Gk.LIZ);
            int i = this.LLILLJJLI;
            if (i == 0) {
                ProfileNaviAutoCreationCameraContainerFragment profileNaviAutoCreationCameraContainerFragment = this.LLILLL;
                String str = this.LLILZ;
                C20296414bK c20296414bKNR = profileNaviAutoCreationCameraContainerFragment.NR();
                if (c20296414bKNR != null) {
                    c20296414bKNR.queueEvent(new ARunnableS33S1100000_29(profileNaviAutoCreationCameraContainerFragment, str, 10));
                }
            } else if (i == 1) {
                this.LLILLL.OR(2131827137);
            } else if (i != 2) {
                this.LLILLL.OR(2131835079);
            } else {
                this.LLILLL.OR(2131827136);
            }
        }
        return Unit.LIZ;
    }
}
