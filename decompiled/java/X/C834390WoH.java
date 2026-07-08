package X;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: X.0WoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834390WoH {
    public Boolean LIZ = null;
    public Context LIZIZ = null;
    public InterfaceC834240Wo2 LIZJ = null;
    public String LIZLLL = null;
    public String LJ = null;
    public C834360WoE LJFF = null;
    public String LJI = null;
    public String LJII = null;
    public List<String> LJIIIIZZ = null;

    public final C834290Wo7 LIZ() {
        Context context = this.LIZIZ;
        if (context == null) {
            throw new IllegalArgumentException("need to set context");
        }
        InterfaceC834240Wo2 interfaceC834240Wo2 = this.LIZJ;
        if (interfaceC834240Wo2 == null) {
            throw new IllegalArgumentException("need to set callback");
        }
        C834360WoE c834360WoE = this.LJFF;
        if (c834360WoE == null) {
            throw new IllegalArgumentException("need to set appInfo");
        }
        String str = this.LJ;
        if (str == null) {
            throw new IllegalArgumentException("need to set gatewayMerchantId");
        }
        Boolean bool = this.LIZ;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            str2 = "US";
        }
        return new C834290Wo7(bool, context, interfaceC834240Wo2, str2, c834360WoE, str, this.LJI, this.LJII, this.LJIIIIZZ);
    }

    public C834390WoH(Object obj) {
    }
}
