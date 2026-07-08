package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.19SN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19SN extends C19SO {
    public C20247514Kj LLJJI;
    public C19ST LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;

    public C19SN() {
        this(null, null);
    }

    @Override // X.C19SO, X.C19SP
    public final C19SQ LIZIZ() {
        return new C20247514Kj(this.LLJJI, this, null);
    }

    @Override // X.C19SO
    /* JADX INFO: renamed from: LJFF */
    public final C19SR LIZIZ() {
        return new C20247514Kj(this.LLJJI, this, null);
    }

    @Override // X.C19SO, X.C19SP, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.LLJJIJIL) {
            super.mutate();
            this.LLJJI.LJ();
            this.LLJJIJIL = true;
        }
        return this;
    }

    @Override // X.C19SP, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        C19ST c19st = this.LLJJIII;
        if (c19st != null) {
            c19st.LIZLLL();
            this.LLJJIII = null;
            LIZLLL(this.LLJJIJI);
            this.LLJJIJI = -1;
            this.LLJJIJIIJIL = -1;
        }
    }

    @Override // X.C19SO, X.C19SP
    public final void LJ(C19SQ c19sq) {
        super.LJ(c19sq);
        if (c19sq instanceof C20247514Kj) {
            this.LLJJI = (C20247514Kj) c19sq;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    @Override // X.C19SO, X.C19SP, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19SN.onStateChange(int[]):boolean");
    }

    public C19SN(C20247514Kj c20247514Kj, Resources resources) {
        this.LLJJIJI = -1;
        this.LLJJIJIIJIL = -1;
        LJ(new C20247514Kj(c20247514Kj, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // X.C19SP, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C19ST c19st = this.LLJJIII;
        if (c19st != null && (visible || z2)) {
            if (z) {
                c19st.LIZJ();
            } else {
                jumpToCurrentState();
                return visible;
            }
        }
        return visible;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0237, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r26.getPositionDescription());
        r1.append(": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0250, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0269, code lost:
    
        r9.onStateChange(r9.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0270, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19SN LJI(android.content.Context r22, android.content.res.Resources.Theme r23, android.content.res.Resources r24, android.util.AttributeSet r25, org.xmlpull.v1.XmlPullParser r26) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19SN.LJI(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):X.19SN");
    }
}
