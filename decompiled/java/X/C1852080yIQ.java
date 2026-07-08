package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yIQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@InterfaceC20647615qs("compliance_universal")
public final class C1852080yIQ extends C10GR {
    public final Activity LL;
    public final String LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final EnumC1202290hON LLILZ = EnumC1202290hON.CONTAINER;
    public final int LLILZIL = 110;

    @Override // X.AbstractC20656215sG
    public final C0T87 getPopupExtraParams() {
        return new C0T87(this.LLILLJJLI);
    }

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
        return this.LLILZ;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        } else {
            c20656615sK.LIZ();
        }
    }

    public C1852080yIQ(Function0 function0, Activity activity, String str) {
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILLL = function0;
    }
}
