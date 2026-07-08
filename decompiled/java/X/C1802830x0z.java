package X;

import com.bytedance.android.livesdk.wallet.CustomErrorExtra;

/* JADX INFO: renamed from: X.0x0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802830x0z extends AbstractC1802900x16 {
    public String LIZ;
    public final InterfaceC1802860x12 LIZIZ;
    public final C1802410x0J LIZJ;
    public final CustomErrorExtra LIZLLL;
    public final String LJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802830x0z(CustomErrorExtra customErrorExtra, InterfaceC1802860x12 interfaceC1802860x12, C1802410x0J c1802410x0J, String str) {
        super(interfaceC1802860x12);
        String toastContent = customErrorExtra.getToastContent();
        this.LIZ = toastContent;
        this.LIZIZ = interfaceC1802860x12;
        this.LIZJ = c1802410x0J;
        this.LIZLLL = customErrorExtra;
        this.LJ = str;
    }
}
