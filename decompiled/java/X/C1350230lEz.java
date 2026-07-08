package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0lEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350230lEz extends AbstractC1177930gl5 implements InterfaceC1354500lLs {
    public final int LIZ = 1;
    public C0QQT LIZIZ;
    public C1354140lLI LIZJ;

    @Override // X.AbstractC1177930gl5
    public final void LIZJ(View view, float f) {
    }

    @Override // X.InterfaceC1354420lLk
    public final boolean LIZIZ(C1354140lLI c1354140lLI) {
        C718860SHs.LIZ.getClass();
        return C2548109yh.LIZ;
    }

    @Override // X.InterfaceC1354420lLk
    public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
        this.LIZJ = c1350290lF5.LIZ;
        ViewStub viewStub = new ViewStub(viewGroup.getContext());
        viewStub.setId(R.id.blz);
        viewGroup.addView(viewStub, new FrameLayout.LayoutParams(-2, -2, 8388661));
        Fragment fragment = c1350290lF5.LIZIZ;
        C723850SaN.LIZ(fragment, false, null, new AwS598S0100000_19(fragment, 830), 3);
        C0QQT c0qqt = (C0QQT) C1558520qew.LIZIZ(C1558360qeg.LJFF(c1350290lF5.LIZIZ, null), C13LE.LIZ(CommentRootFragmentScope.class), C13LE.LIZ(C0QQT.class));
        if (c0qqt != null) {
            this.LIZIZ = c0qqt;
            InterfaceC1349690lE7 interfaceC1349690lE7 = (InterfaceC1349690lE7) C1558520qew.LIZIZ(C1558360qeg.LJFF(c1350290lF5.LIZIZ, null), C13LE.LIZ(TitlePanelRootScope.class), C13LE.LIZ(InterfaceC1349690lE7.class));
            if (interfaceC1349690lE7 != null) {
                interfaceC1349690lE7.Ej(this);
            }
        }
    }

    @Override // X.AbstractC1177930gl5
    public final void LIZLLL(int i, View view) {
        C0QQT c0qqt;
        int i2;
        C1354140lLI c1354140lLI = this.LIZJ;
        if (c1354140lLI != null && (c0qqt = this.LIZIZ) != null) {
            boolean zDA0 = false;
            if (i == 5) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i3 = this.LIZ;
            VideoShrinkAbility videoShrinkAbility = c1354140lLI.LLILZIL.get();
            if (videoShrinkAbility != null) {
                zDA0 = videoShrinkAbility.dA0();
            }
            Boolean boolValueOf = Boolean.valueOf(zDA0);
            C1350320lF8 c1350320lF8 = c1354140lLI.LL;
            c0qqt.e3(i3, i2, boolValueOf, new C667180QEy(c1350320lF8.LL, c1350320lF8.LLILLJJLI, "comment_card"));
        }
    }
}
