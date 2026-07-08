package X;

import androidx.lifecycle.LiveData;

/* JADX INFO: renamed from: X.0E9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360040E9q extends C0ECU implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final boolean LLJ;
    public final C19A3 LLJI;
    public final C1DRG LLJIJIL;
    public final C372830EjZ LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final C1664740tQG LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C360040E9q.class, "surfacePreviewApi", "getSurfacePreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C360040E9q.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final C0ELJ LJIIIIZZ() {
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0EY2 c0ey2 = (C0EY2) this.LLJILLL.getValue(this, LLJJ[1]);
        if (c0ey2 == null || (liveDataZu2 = c0ey2.zu2()) == null || (value = liveDataZu2.getValue()) == null) {
            return null;
        }
        return value.LJ;
    }

    public final InterfaceC361710EGb LJIIIZ() {
        return (InterfaceC361710EGb) this.LLJILJILJ.getValue(this, LLJJ[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    @Override // X.C360050E9r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r3 = this;
            super.LIZ()
            X.0ELJ r0 = r3.LJIIIIZZ()
            if (r0 == 0) goto L3f
            boolean r0 = r0.getRetouchMultiTrackMode()
            r1 = 1
            if (r0 != r1) goto L3f
        L10:
            boolean r0 = r3.LLJ
            if (r0 != 0) goto L3e
            if (r1 != 0) goto L3e
            X.19A3 r0 = r3.LLJI
            if (r0 == 0) goto L3e
            android.app.Activity r1 = r0.mActivity
            if (r1 == 0) goto L3e
            r0 = 2131388528(0x7f0a6870, float:1.8397573E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L3e
            X.19A3 r0 = r3.LLJI
            android.app.Activity r1 = r0.mActivity
            if (r1 == 0) goto L3e
            r0 = 2131370683(0x7f0a22bb, float:1.836138E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            if (r0 == 0) goto L3e
            com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker.recordViewRemovedPoint(r0, r2)
            r0.removeView(r2)
        L3e:
            return
        L3f:
            r1 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360040E9q.LIZ():void");
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJIJIL;
    }

    public C360040E9q(boolean z, C19A3 c19a3, C0E48 c0e48, C1DRG c1drg) {
        C372830EjZ c372830EjZ;
        C372480Ej0 c372480Ej0;
        C0EGE c0ege;
        super(c0e48, "retouch_panel");
        this.LLJ = z;
        this.LLJI = c19a3;
        this.LLJIJIL = c1drg;
        if ((c19a3 instanceof C372480Ej0) && (c372480Ej0 = (C372480Ej0) c19a3) != null && (c0ege = c372480Ej0.LLLILZ) != null) {
            c372830EjZ = c0ege.LJIIJ;
        } else {
            c372830EjZ = null;
        }
        this.LLJILJIL = c372830EjZ;
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC361710EGb.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
    }
}
