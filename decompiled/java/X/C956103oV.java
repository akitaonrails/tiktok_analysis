package X;

import android.content.Context;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightViewHolderV2;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03oV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C956103oV {
    public static TuxTextView LIZ(Context context, ExposeUserRight exposeUserRight) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextColorRes(R.attr.a1i);
        if (C1071004Gu.LIZIZ().LIZ()) {
            tuxTextView.setTuxFont(61);
        } else {
            tuxTextView.setTuxFont(71);
        }
        tuxTextView.setText(exposeUserRight.name);
        tuxTextView.setMaxLines(1);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_tick_fill_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.fy);
        int i = SeaUserRightViewHolderV2.LLJJLIIIJLLLLLLLZ;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
        tuxTextView.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        return tuxTextView;
    }
}
