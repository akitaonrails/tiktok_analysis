package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar;

import X.C01GW;
import X.C16FS;
import X.C1819620xS4;
import X.C19MB;
import X.C20736316Cj;
import X.C452501pT;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC934710aQn;
import Y.ACListenerS150S0100000_15;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.multi_guest_social_data.AvatarImageCase;
import webcast.data.multi_guest_social_data.AvatarImageSelectTips;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestLearningAvatarFragment extends MultiGuestAbstractAvatarFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSHELIOSwiZyI2LCwtZygmLTY4Zy4lKTEtO2EePSk4IAgmLTY4BSoyOislJygSPiQ4KD0VOiQrJCo9PA==";
    public AvatarImageSelectTips LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 297));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 298));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gkf);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJ = true;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAbstractAvatarFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        List<String> list;
        List<AvatarImageCase> list2;
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        C786410Ut5.h8((C16FS) view.findViewById(R.id.bj3), new ACListenerS150S0100000_15(this, 84));
        TextView textView = (TextView) view.findViewById(R.id.bja);
        AvatarImageSelectTips avatarImageSelectTips = this.LL;
        View view2 = null;
        if (avatarImageSelectTips != null) {
            str = avatarImageSelectTips.title;
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = (TextView) view.findViewById(R.id.bj4);
        AvatarImageSelectTips avatarImageSelectTips2 = this.LL;
        if (avatarImageSelectTips2 != null) {
            str2 = avatarImageSelectTips2.desc;
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.bj7);
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        AvatarImageSelectTips avatarImageSelectTips3 = this.LL;
        if (avatarImageSelectTips3 != null && (list2 = avatarImageSelectTips3.examples) != null) {
            int i = 100;
            for (AvatarImageCase avatarImageCase : list2) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(constraintLayout.getContext()), R.layout.fzh, constraintLayout, false);
                C1819620xS4.LIZ().LJIIIZ(avatarImageCase.exampleImages).LJJI(viewTd.findViewById(R.id.bj5));
                LiveIconView liveIconView = (LiveIconView) viewTd.findViewById(R.id.bj6);
                if (avatarImageCase.isBad) {
                    liveIconView.setBackground((Drawable) this.LLILLJJLI.getValue());
                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.eny, liveIconView.getContext()));
                } else {
                    liveIconView.setBackground((Drawable) this.LLILLL.getValue());
                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.ejp, liveIconView.getContext()));
                }
                int i2 = i + 1;
                viewTd.setId(i);
                constraintLayout.addView(viewTd);
                c19mb.LJFF(viewTd.getId());
                c19mb.LJIILL(viewTd.getId(), -2);
                if (view2 == null) {
                    c19mb.LJIIIIZZ(viewTd.getId(), 6, 0, 6);
                } else {
                    c19mb.LJIIIIZZ(viewTd.getId(), 6, view2.getId(), 7);
                }
                c19mb.LJIIIIZZ(viewTd.getId(), 3, 0, 3);
                i = i2;
                view2 = viewTd;
            }
        }
        int childCount = constraintLayout.getChildCount();
        int[] iArr = new int[childCount];
        for (int i3 = 0; i3 < childCount; i3++) {
            iArr[i3] = constraintLayout.getChildAt(i3).getId();
        }
        if (childCount >= 2) {
            c19mb.LJIJI(iArr[0]).LIZLLL.LJJJJ = 1;
            c19mb.LJIIIZ(iArr[0], 6, 0, 6, -1);
            int i4 = 1;
            do {
                int i5 = i4 - 1;
                c19mb.LJIIIZ(iArr[i4], 6, iArr[i5], 7, -1);
                c19mb.LJIIIZ(iArr[i5], 7, iArr[i4], 6, -1);
                i4++;
            } while (i4 < childCount);
            c19mb.LJIIIZ(iArr[childCount - 1], 7, 0, 7, -1);
            c19mb.LIZIZ(constraintLayout);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bj8);
            AvatarImageSelectTips avatarImageSelectTips4 = this.LL;
            if (avatarImageSelectTips4 != null && (list = avatarImageSelectTips4.rules) != null) {
                boolean z = true;
                for (String str3 : list) {
                    View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.hdc, viewGroup, false);
                    ViewGroup.LayoutParams layoutParams = viewTd2.getLayoutParams();
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        if (z) {
                            z = false;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) C497740JfY.LIZIZ(10.0f);
                        }
                    }
                    ((TextView) viewTd2.findViewById(R.id.bj9)).setText(str3);
                    viewGroup.addView(viewTd2);
                }
            }
            InterfaceC934710aQn.hc.LJFF(Boolean.FALSE);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }
}
