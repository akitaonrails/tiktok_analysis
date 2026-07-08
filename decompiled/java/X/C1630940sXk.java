package X;

import Y.ACListenerS127S0200000_25;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630940sXk implements InterfaceC1624270sMz {
    public LinearLayout LL;
    public Effect LLILLJJLI;
    public ACListenerS127S0200000_25 LLILLL;
    public C1322110kVd LLILZ;
    public C19518211Xw LLILZIL;
    public C19518211Xw LLILZLL;
    public C1322110kVd LLIZ;

    @Override // X.InterfaceC1624270sMz
    public final void LIZ() {
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1624270sMz
    public final EnumC992590bw9 priority() {
        return EnumC992590bw9.BlockStickerInfoHandlerPriority;
    }

    @Override // X.InterfaceC1624270sMz
    public final void LIZIZ(View view) {
        C1322110kVd c1322110kVd;
        C19518211Xw c19518211Xw;
        C1322110kVd c1322110kVd2;
        View viewFindViewById;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.mfq);
        this.LL = linearLayout;
        C19518211Xw c19518211Xw2 = null;
        if (linearLayout != null) {
            c1322110kVd = (C1322110kVd) linearLayout.findViewById(R.id.w64);
        } else {
            c1322110kVd = null;
        }
        this.LLILZ = c1322110kVd;
        LinearLayout linearLayout2 = this.LL;
        if (linearLayout2 != null) {
            c19518211Xw = (C19518211Xw) linearLayout2.findViewById(R.id.w6i);
        } else {
            c19518211Xw = null;
        }
        this.LLILZIL = c19518211Xw;
        LinearLayout linearLayout3 = this.LL;
        if (linearLayout3 != null) {
            c1322110kVd2 = (C1322110kVd) linearLayout3.findViewById(R.id.p82);
        } else {
            c1322110kVd2 = null;
        }
        this.LLIZ = c1322110kVd2;
        LinearLayout linearLayout4 = this.LL;
        if (linearLayout4 != null && (viewFindViewById = linearLayout4.findViewById(R.id.p7b)) != null) {
            c19518211Xw2 = (C19518211Xw) viewFindViewById.findViewById(R.id.p83);
        }
        this.LLILZLL = c19518211Xw2;
        if (C306740C0q.LIZ()) {
            C1322110kVd c1322110kVd3 = this.LLILZ;
            if (c1322110kVd3 != null) {
                C786410Ut5.q9(c1322110kVd3, this.LLILLL);
            }
            C19518211Xw c19518211Xw3 = this.LLILZIL;
            if (c19518211Xw3 != null) {
                C786410Ut5.Ta(c19518211Xw3, this.LLILLL);
            }
            C1322110kVd c1322110kVd4 = this.LLIZ;
            if (c1322110kVd4 != null) {
                C786410Ut5.q9(c1322110kVd4, this.LLILLL);
            }
            C19518211Xw c19518211Xw4 = this.LLILZLL;
            if (c19518211Xw4 != null) {
                C786410Ut5.Ta(c19518211Xw4, this.LLILLL);
                return;
            }
            return;
        }
        LinearLayout linearLayout5 = this.LL;
        if (linearLayout5 == null) {
            return;
        }
        C786410Ut5.R7(linearLayout5, this.LLILLL);
    }

    @Override // X.InterfaceC1624270sMz
    public final boolean LIZJ(C1627370sRz c1627370sRz) {
        this.LLILLJJLI = c1627370sRz.LIZ;
        return false;
    }
}
