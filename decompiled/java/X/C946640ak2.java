package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0ak2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946640ak2 extends View {
    public final String LL;
    public String LLILLJJLI;
    public int LLILLL;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow, hashCode = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", linkmicId = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pos = ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String getLinkmicId() {
        return this.LLILLJJLI;
    }

    public final int getPos() {
        return this.LLILLL;
    }

    public C946640ak2(Context context) {
        super(context);
        this.LL = "MultiHostGuestBorderView";
        this.LLILLL = -1;
    }

    public final void setLinkmicId(String str) {
        this.LLILLJJLI = str;
    }

    public final void setPos(int i) {
        this.LLILLL = i;
    }
}
