package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20578815fm extends RecyclerView.ViewHolder {
    public final String LL;
    public final C427870Gq9 LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxTextView LLILZ;

    public C20578815fm(View view) {
        super(view);
        this.LL = "EditProfileBadgeAdapter";
        this.LLILLJJLI = (C427870Gq9) view.findViewById(R.id.go0);
        this.LLILLL = (SmartImageView) view.findViewById(R.id.go3);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.go2);
        view.findViewById(R.id.go1);
    }

    public final void I5(EditProfileBadgeModel editProfileBadgeModel, User user) {
        if (this.LLILLJJLI != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(C848410XPz.LIZ(user)));
            c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
            c1331670kl3LJIIIIZZ.LIZLLL(this.LL);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        if (this.LLILLL != null && C703302op.LIZ(editProfileBadgeModel.getUrl()) && editProfileBadgeModel.getShouldShow() != null && Intrinsics.LJFF(editProfileBadgeModel.getShouldShow(), Boolean.TRUE)) {
            SmartImageView smartImageView = this.LLILLL;
            if (smartImageView != null) {
                C786410Ut5.LLFF(0, smartImageView);
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(editProfileBadgeModel.getUrl());
            c1331670kl3LJIIIZ.LJJ(this.LLILLL);
            c1331670kl3LJIIIZ.LIZLLL(this.LL);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        } else {
            SmartImageView smartImageView2 = this.LLILLL;
            if (smartImageView2 != null) {
                C786410Ut5.LLFF(8, smartImageView2);
            }
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(editProfileBadgeModel.getName());
        }
    }
}
