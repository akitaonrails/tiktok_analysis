package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0vhb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752370vhb extends C1765720w38 {
    public InterfaceC1752380vhc LLJZIJLIL;

    @Override // X.C1765720w38, X.InterfaceC588410N5z
    public final void onPausePlay(String str) {
        InterfaceC1752380vhc interfaceC1752380vhc = this.LLJZIJLIL;
        if (interfaceC1752380vhc != null) {
            interfaceC1752380vhc.LLIIII();
        }
    }

    @Override // X.C1765720w38, X.InterfaceC588410N5z
    public final void onPlayCompleted(String str) {
        super.onPlayCompleted(str);
        InterfaceC1752380vhc interfaceC1752380vhc = this.LLJZIJLIL;
        if (interfaceC1752380vhc != null) {
            interfaceC1752380vhc.LJJIJIIJIL();
        }
    }

    @Override // X.C1765720w38, X.InterfaceC588410N5z
    public final void onResumePlay(String str) {
        InterfaceC1752380vhc interfaceC1752380vhc = this.LLJZIJLIL;
        if (interfaceC1752380vhc != null) {
            interfaceC1752380vhc.LJJJJJL();
        }
    }

    public final void setCallback(InterfaceC1752380vhc interfaceC1752380vhc) {
        this.LLJZIJLIL = interfaceC1752380vhc;
    }

    public C1752370vhb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAutoReleaseImmersionBar(true);
    }
}
