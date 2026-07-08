package X;

import android.view.View;

/* JADX INFO: renamed from: X.0EbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367760EbO extends AbstractC368550Ecf<C367620EbA> {
    public static final int LLILZIL;
    public static final int LLILZLL;
    public static final int LLIZ;
    public static final int LLIZLLLIL;
    public final InterfaceC367910Ebd LLILLL;
    public final C367620EbA LLILZ;

    static {
        int i = C368130Ebz.LJIILIIL;
        LLILZIL = i;
        LLILZLL = C360610EBv.LIZJ;
        int i2 = C360610EBv.LIZLLL;
        int i3 = (i2 - i) / 2;
        int i4 = i3 < 0 ? 0 : i3;
        LLIZ = i4;
        if (i3 >= 0) {
            i = i2 - i4;
        }
        LLIZLLLIL = i;
    }

    @Override // X.AbstractC368550Ecf
    public final /* bridge */ /* synthetic */ View LJIIIZ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC368550Ecf, X.InterfaceC368720Ecw
    public final void setClipping(boolean z) {
        super.setClipping(z);
        if (z) {
            this.LLILLL.j();
        }
    }

    @Override // X.AbstractC368550Ecf, X.InterfaceC368720Ecw
    public final void setTimelineScale(float f) {
        super.setTimelineScale(f);
        this.LLILLL.j();
    }

    public C367760EbO(C19EG c19eg, C367920Ebe c367920Ebe, InterfaceC367590Eb7 interfaceC367590Eb7) {
        super(c19eg);
        this.LLILLL = c367920Ebe;
        C367620EbA c367620EbA = new C367620EbA(c19eg);
        c367620EbA.setFrameFetcher$editor_trackpanel_release(new C367770EbP(c367920Ebe));
        c367620EbA.setTrackViewModelCompat(interfaceC367590Eb7);
        this.LLILZ = c367620EbA;
    }
}
