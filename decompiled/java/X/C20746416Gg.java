package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.16Gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20746416Gg extends C16GX implements InterfaceC1324370kZH {
    public int LLJJIII;
    public String LLJJIJI;

    public final String getStatus() {
        return this.LLJJIJI;
    }

    public C20746416Gg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIJI = "expanded";
        LIZ(this);
    }

    @Override // X.InterfaceC1324380kZI
    public final void LLZZJLIL(C16GX c16gx, int i) {
        String str;
        if (this.LLJJIII == i) {
            return;
        }
        this.LLJJIII = i;
        if (i == 0) {
            str = "expanded";
        } else {
            str = "collapsed";
        }
        this.LLJJIJI = str;
    }
}
