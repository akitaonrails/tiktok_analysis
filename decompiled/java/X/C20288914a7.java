package X;

import android.content.Context;
import android.widget.ListView;

/* JADX INFO: renamed from: X.14a7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20288914a7 extends ListView implements InterfaceC20290614aO {
    public InterfaceC20293914av LL;

    public final InterfaceC20293914av getOptionClickListener() {
        return this.LL;
    }

    public C20288914a7(Context context) {
        super(context);
    }

    @Override // X.InterfaceC20290614aO
    public void setOptionListener(InterfaceC20293914av interfaceC20293914av) {
        this.LL = interfaceC20293914av;
    }
}
