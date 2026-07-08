package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.11dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19548511dz implements InterfaceC19548711e1 {
    public final /* synthetic */ C19547511dp LIZ;
    public final /* synthetic */ InterfaceC19548711e1 LIZIZ;

    public C19548511dz(C19547511dp c19547511dp, InterfaceC19548711e1 interfaceC19548711e1) {
        this.LIZ = c19547511dp;
        this.LIZIZ = interfaceC19548711e1;
    }

    @Override // X.InterfaceC19548711e1
    public final void LIZ(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, String str5) {
        this.LIZ.LIZLLL = ((long) LSPassThroughRecordSizeConfig.DEFAULT) * j;
        InterfaceC19548711e1 interfaceC19548711e1 = this.LIZIZ;
        if (interfaceC19548711e1 != null) {
            interfaceC19548711e1.LIZ(i, i2, j, j2, str, str2, str3, str4, str5);
        }
    }
}
