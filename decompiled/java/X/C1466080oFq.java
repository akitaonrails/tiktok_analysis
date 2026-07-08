package X;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0oFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1466080oFq implements InterfaceC1643840ssY {
    public final Context LIZ;
    public ViewGroup LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 845));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 844));

    @Override // X.InterfaceC1643840ssY
    public final int LIZ() {
        return ((View) this.LIZLLL.getValue()).getWidth();
    }

    @Override // X.InterfaceC1643840ssY
    public final int LIZJ() {
        return ViewConfiguration.get(this.LIZ).getScaledPagingTouchSlop();
    }

    public C1466080oFq(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC1643840ssY
    public final void LIZIZ(C1643850ssZ c1643850ssZ) {
        ((InterfaceC1461390o8H) this.LIZJ.getValue()).LIZIZ(new GestureInteractItem(0, c1643850ssZ));
    }

    @Override // X.InterfaceC1643840ssY
    public final void init(ViewGroup viewGroup) {
        this.LIZIZ = viewGroup;
    }
}
