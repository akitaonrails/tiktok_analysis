package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20647615qs("profile_passkey_registration")
public final class C20342414ik extends C10GR {
    public final Activity LL;
    public final InterfaceC20325014fw LLILLJJLI;
    public final Function1<InterfaceC20325014fw, Unit> LLILLL;
    public final int LLILZ = 160;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        Activity activity = this.LL;
        if (activity instanceof LifecycleOwner) {
            return new C688120Qyw(activity, (LifecycleOwner) activity, null);
        }
        return null;
    }

    @Override // X.AbstractC20656215sG
    public final EnumC1202290hON getPopupType() {
        return EnumC1202290hON.POPUP;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        this.LLILLL.invoke(new InterfaceC20325014fw() { // from class: X.14ij
            @Override // X.InterfaceC20325014fw
            public final void LJ() {
                this.LIZ.LLILLJJLI.LJ();
            }

            @Override // X.InterfaceC20325014fw
            public final void onSuccess(String str) {
                this.LIZ.LLILLJJLI.onSuccess(null);
                c20656615sK.LIZ();
            }

            @Override // X.InterfaceC20325014fw
            public final void LIZ(Throwable th, boolean z, boolean z2) {
                this.LIZ.LLILLJJLI.LIZ(th, z, z2);
                c20656615sK.LIZ();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20342414ik(Activity activity, InterfaceC20325014fw interfaceC20325014fw, Function1<? super InterfaceC20325014fw, Unit> function1) {
        this.LL = activity;
        this.LLILLJJLI = interfaceC20325014fw;
        this.LLILLL = function1;
    }
}
