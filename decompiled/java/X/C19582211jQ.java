package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.AwS157S0400000_29;

/* JADX INFO: renamed from: X.11jQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19582211jQ extends AbstractC19586911kB {
    public final InterfaceC386401eo LJIIIZ;
    public View LJIIJ;
    public final C01GW LJIIJJI;

    @Override // X.InterfaceC19594811lS
    public final void LIZIZ() {
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJ() {
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJI() {
    }

    @Override // X.InterfaceC19594811lS
    public final void LJJIII() {
    }

    @Override // X.InterfaceC19594611lQ
    public final int getStickerType() {
        return 22;
    }

    @Override // X.AbstractC19586911kB
    public final View LJIILL() {
        return new View(this.LIZ);
    }

    @Override // X.InterfaceC19594811lS
    public final View getView() {
        if (this.LJIIJ == null) {
            this.LJIIJ = new FrameLayout(this.LIZ);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            View view = this.LJIIJ;
            if (view != null) {
                C786410Ut5.W5(view, layoutParams);
            }
        }
        return this.LJIIJ;
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        return ((AbstractC19580211j6) this.LJIIJJI.getValue()).LJI(f, f2, i, j);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        return ((AbstractC19580211j6) this.LJIIJJI.getValue()).LJIIIZ(j, i, f, f2, interfaceC19579211iw);
    }

    public C19582211jQ(int i, Context context, C194349111v c194349111v, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, InterfaceC386401eo interfaceC386401eo) {
        super(context, c194349111v, interactStickerStruct, c705930RmZ);
        this.LJIIIZ = interfaceC386401eo;
        this.LJIIJJI = C452501pT.LIZIZ(new AwS157S0400000_29(context, this, interactStickerStruct, c705930RmZ, 0));
    }
}
