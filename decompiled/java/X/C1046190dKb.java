package X;

import android.view.View;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0dKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046190dKb implements InterfaceC2211901Bhc {
    public final /* synthetic */ InterfaceC1631620sYq<View, String, Float, Unit> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1046190dKb(InterfaceC1631620sYq<? super View, ? super String, ? super Float, Unit> interfaceC1631620sYq) {
        this.LIZ = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC2211901Bhc
    public final void LIZ(View view, String str, float f) {
        this.LIZ.invoke(view, str, Float.valueOf(f));
    }
}
