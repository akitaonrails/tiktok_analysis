package X;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: renamed from: X.0r9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577540r9c implements InterfaceC1577580r9g {
    public InterfaceC1577580r9g LL;
    public final C1577550r9d LLILLJJLI = new C1577550r9d();

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C1577550r9d c1577550r9d = this.LLILLJJLI;
        AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(this, bundle, 54);
        if (c1577550r9d.LIZIZ) {
            awS425S0200000_24.invoke();
        } else {
            ((ArrayList) c1577550r9d.LIZ).add(awS425S0200000_24);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        C1577550r9d c1577550r9d = this.LLILLJJLI;
        AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(this, bundle, 55);
        if (c1577550r9d.LIZIZ) {
            awS425S0200000_24.invoke();
        } else {
            ((ArrayList) c1577550r9d.LIZ).add(awS425S0200000_24);
        }
    }
}
