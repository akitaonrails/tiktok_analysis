package X;

/* JADX INFO: renamed from: X.0qLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546710qLt extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public static final /* synthetic */ int LLJ = 0;
    public boolean LLIZ;
    public final C1546730qLv LLIZLLLIL = new AbstractC1541650qDj<C1BVW>() { // from class: X.0qLv
        public final C20190213zI LLIZ;

        @Override // X.AbstractC1541650qDj
        public final boolean LIZIZ() {
            return this.LLIZLLLIL.LLILZ;
        }

        @Override // X.AbstractC1541650qDj
        public final void LIZJ() {
            LJ("onShowFileChooser", this.LLIZ, 8000);
        }

        {
            this.LLIZ = new C20190213zI(this, this.LLIZLLLIL);
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        this.LLILLL = "FileChooserExtension";
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebChromeClient(), this.LLIZLLLIL);
    }
}
