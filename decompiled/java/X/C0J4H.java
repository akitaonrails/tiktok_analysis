package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: renamed from: X.0J4H, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4H implements LayoutInflater.Factory2 {
    public final LayoutInflater.Factory LL;
    public final LayoutInflater.Factory2 LLILLJJLI;
    public final LayoutInflater.Factory LLILLL;
    public final LayoutInflater.Factory2 LLILZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NxFactoryMerger(mF1=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mF12=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mF2=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mF22=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView;
        LayoutInflater.Factory factory = this.LL;
        if (factory != null && (viewOnCreateView = factory.onCreateView(str, context, attributeSet)) != null) {
            return viewOnCreateView;
        }
        LayoutInflater.Factory factory2 = this.LLILLL;
        if (factory2 == null) {
            return null;
        }
        return factory2.onCreateView(str, context, attributeSet);
    }

    public C0J4H(LayoutInflater.Factory factory, LayoutInflater.Factory2 factory2, LayoutInflater.Factory factory3, LayoutInflater.Factory2 factory22) {
        this.LL = factory;
        this.LLILLJJLI = factory2;
        this.LLILLL = factory3;
        this.LLILZ = factory22;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r3, java.lang.String r4, android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r2 = this;
            android.view.LayoutInflater$Factory2 r0 = r2.LLILLJJLI
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r0 = r0.onCreateView(r3, r4, r5, r6)
        L9:
            if (r0 == 0) goto L15
            return r0
        Lc:
            android.view.LayoutInflater$Factory r0 = r2.LL
            if (r0 == 0) goto L15
            android.view.View r0 = r0.onCreateView(r4, r5, r6)
            goto L9
        L15:
            android.view.LayoutInflater$Factory2 r0 = r2.LLILZ
            if (r0 == 0) goto L1e
            android.view.View r1 = r0.onCreateView(r3, r4, r5, r6)
        L1d:
            return r1
        L1e:
            android.view.LayoutInflater$Factory r0 = r2.LLILLL
            if (r0 == 0) goto L1d
            android.view.View r1 = r0.onCreateView(r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J4H.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
