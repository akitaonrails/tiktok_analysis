package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0rah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC20647615qs("search_floating_bar")
public final class C1594330rah extends C10GR {
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final InterfaceC671160QUg LLILLL;
    public C20656615sK LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL = true;
    public final int LLIZ = 209;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        return new C688120Qyw(this.LL, this.LLILLJJLI, null);
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLIZ;
    }

    @Override // X.AbstractC20656215sG
    public final void onConflict() {
        super.onConflict();
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        this.LLILZIL = true;
        this.LLILLL.LIZ();
        this.LLILZ = c20656615sK;
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
    }

    public C1594330rah(Context context, LifecycleOwner lifecycleOwner, C671150QUf c671150QUf) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c671150QUf;
    }
}
