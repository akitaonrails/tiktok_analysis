package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509560Jyc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubPrivilegeDetailFullPage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509560Jyc(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage) {
        super(0);
        this.LL = subPrivilegeDetailFullPage;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = this.LL;
        View viewFindViewById = subPrivilegeDetailFullPage.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = subPrivilegeDetailFullPage.getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rw1) : null;
            subPrivilegeDetailFullPage.LLILLJJLI = (ConstraintLayout) viewFindViewById;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage2 = this.LL;
        View viewFindViewById2 = subPrivilegeDetailFullPage2.LLILLL;
        if (viewFindViewById2 == null) {
            View view2 = subPrivilegeDetailFullPage2.getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.hb1) : null;
            subPrivilegeDetailFullPage2.LLILLL = (ConstraintLayout) viewFindViewById2;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById2;
        if (constraintLayout2 != null) {
            C786410Ut5.LL(0, constraintLayout2);
        }
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage3 = this.LL;
        View viewFindViewById3 = subPrivilegeDetailFullPage3.LLILZ;
        if (viewFindViewById3 == null) {
            View view3 = subPrivilegeDetailFullPage3.getView();
            viewFindViewById3 = view3 != null ? view3.findViewById(R.id.hbb) : null;
            subPrivilegeDetailFullPage3.LLILZ = (LiveIconView) viewFindViewById3;
        }
        LiveIconView liveIconView = (LiveIconView) viewFindViewById3;
        if (liveIconView != null) {
            liveIconView.setIcon(C20736316Cj.LJ(R.attr.dxv, this.LL.getContext()));
        }
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage4 = this.LL;
        View viewFindViewById4 = subPrivilegeDetailFullPage4.LLILZIL;
        if (viewFindViewById4 == null) {
            View view4 = subPrivilegeDetailFullPage4.getView();
            viewFindViewById4 = view4 != null ? view4.findViewById(R.id.hc1) : null;
            subPrivilegeDetailFullPage4.LLILZIL = (C16F5) viewFindViewById4;
        }
        TextView textView = (TextView) viewFindViewById4;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131844196));
        }
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage5 = this.LL;
        View viewFindViewById5 = subPrivilegeDetailFullPage5.LLILZLL;
        if (viewFindViewById5 == null) {
            View view5 = subPrivilegeDetailFullPage5.getView();
            viewFindViewById5 = view5 != null ? view5.findViewById(R.id.haz) : null;
            subPrivilegeDetailFullPage5.LLILZLL = (C16FS) viewFindViewById5;
        }
        C16FS c16fs = (C16FS) viewFindViewById5;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131844195));
        }
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage6 = this.LL;
        View view6 = subPrivilegeDetailFullPage6.LLILZLL;
        if (view6 == null) {
            View view7 = subPrivilegeDetailFullPage6.getView();
            View viewFindViewById6 = view7 != null ? view7.findViewById(R.id.haz) : null;
            subPrivilegeDetailFullPage6.LLILZLL = (C16FS) viewFindViewById6;
            view6 = viewFindViewById6;
        }
        C16FS c16fs2 = (C16FS) view6;
        if (c16fs2 != null) {
            final SubPrivilegeDetailFullPage subPrivilegeDetailFullPage7 = this.LL;
            C786410Ut5.h8(c16fs2, new View.OnClickListener() { // from class: X.0Jyk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view8) {
                    C520010KaN.LIZLLL(subPrivilegeDetailFullPage7);
                }
            });
        }
        return Unit.LIZ;
    }
}
