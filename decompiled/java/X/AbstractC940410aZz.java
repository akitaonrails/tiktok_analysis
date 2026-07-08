package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFeedCornerTechSwitchSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC940410aZz {
    public ViewGroup LL;
    public ViewGroup LLILLJJLI;
    public boolean LLILLL;
    public ViewOnAttachStateChangeListenerC986940bn2 LLILZ;

    public abstract String LIZ();

    public abstract int LIZIZ();

    public abstract void LIZJ(ViewGroup viewGroup);

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public void LJI() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            C786410Ut5.LJJJJI(viewGroup2);
        }
        if (LinkMicFeedCornerTechSwitchSetting.INSTANCE.isEnable() && (viewGroup = this.LL) != null) {
            viewGroup.removeOnAttachStateChangeListener(this.LLILZ);
        }
        ViewGroup viewGroup3 = this.LL;
        if (viewGroup3 != null) {
            C439101nJ.LJI(viewGroup3);
        }
        ViewGroup viewGroup4 = this.LLILLJJLI;
        if (viewGroup4 != null) {
            C786410Ut5.LJJJJI(viewGroup4);
        }
        ViewGroup viewGroup5 = this.LL;
        if (viewGroup5 != null) {
            C439101nJ.LJI(viewGroup5);
        }
        this.LLILLL = false;
    }

    public final void LJII(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3 = this.LL;
        ViewGroup viewGroup4 = null;
        ViewParent parent = null;
        if (viewGroup3 != null) {
            if (Intrinsics.LJFF(viewGroup3.getParent(), viewGroup)) {
                return;
            }
            ViewGroup viewGroup5 = this.LL;
            if (viewGroup5 != null) {
                parent = viewGroup5.getParent();
            }
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LL, viewGroup2);
            }
            this.LLILLJJLI = viewGroup;
            viewGroup.addView(this.LL);
            return;
        }
        Context contextLJJIIZI = C520010KaN.LJJIIZI(viewGroup.getContext(), true);
        if (contextLJJIIZI == null) {
            return;
        }
        this.LLILLJJLI = viewGroup;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(contextLJJIIZI);
        View viewTd = C786410Ut5.Td(layoutInflaterNe.cloneInContext(C1834150xpV.LJIIIZ(layoutInflaterNe.getContext())), LIZIZ(), viewGroup, false);
        if (viewTd instanceof ViewGroup) {
            viewGroup4 = (ViewGroup) viewTd;
        }
        this.LL = viewGroup4;
        if (LinkMicFeedCornerTechSwitchSetting.INSTANCE.isEnable()) {
            ViewOnAttachStateChangeListenerC986940bn2 viewOnAttachStateChangeListenerC986940bn2 = new ViewOnAttachStateChangeListenerC986940bn2(this, 0);
            this.LLILZ = viewOnAttachStateChangeListenerC986940bn2;
            ViewGroup viewGroup6 = this.LL;
            if (viewGroup6 != null) {
                viewGroup6.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC986940bn2);
            }
        }
        viewGroup.addView(this.LL);
        LIZJ(this.LL);
        this.LLILLL = true;
    }
}
