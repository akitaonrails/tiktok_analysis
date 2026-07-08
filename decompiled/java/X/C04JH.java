package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import l9b.u0;

/* JADX INFO: renamed from: X.04JH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JH implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C04JH(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(C04JH c04jh, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c04jh);
        u0 u0Var = (u0) c04jh.l0;
        UserRightDetail userRightDetail = (UserRightDetail) c04jh.l1;
        u0Var.p0(userRightDetail.titleFont, userRightDetail.name, userRightDetail.headerFontColor, userRightDetail.headerFontDarkColor);
        u0Var.setIcon(((UserRightDetail) c04jh.l1).icon);
        Image icon = null;
        if (C1744700vVE.LJ(u0Var.getContext(), null)) {
            Icon icon2 = ((UserRightDetail) c04jh.l1).background;
            if (icon2 != null) {
                icon = icon2.getIconDark();
            }
        } else {
            Icon icon3 = ((UserRightDetail) c04jh.l1).background;
            if (icon3 != null) {
                icon = icon3.getIcon();
            }
        }
        u0Var.setBackground(icon);
        u0Var.setColor(((UserRightDetail) c04jh.l1).themeColor);
        UserRightDetail userRightDetail2 = (UserRightDetail) c04jh.l1;
        u0Var.n0(userRightDetail2.headerBackgroundImage, userRightDetail2.themeColor);
        List<UserRightDesc> list = ((UserRightDetail) c04jh.l1).userRightDesc;
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            UserRightDetail userRightDetail3 = (UserRightDetail) c04jh.l1;
            Icon icon4 = userRightDetail3.icon;
            if (icon4 == null || icon4.getIcon() == null) {
                z = false;
            }
            u0Var.j0(userRightDetail3, z);
            return;
        }
        UserRightDetail userRightDetail4 = (UserRightDetail) c04jh.l1;
        String str = userRightDetail4.description;
        Icon icon5 = userRightDetail4.icon;
        if (icon5 == null || icon5.getIcon() == null) {
            z = false;
        }
        u0Var.l0(str, z);
    }

    public static final void onLayoutChange$1(C04JH c04jh, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c04jh);
        int width = view.getWidth();
        if (width > 0) {
            ((C933403kq) c04jh.l0).LJFF((TextView) c04jh.l1, width);
        }
    }
}
