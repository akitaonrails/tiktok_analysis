package X;

import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0cnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025520cnG {
    public final EnumC345560Dgg LIZ;
    public final String LIZIZ;
    public final C1026760cpG LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final String LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;

    public C1025520cnG(EnumC345560Dgg enumC345560Dgg, String str, C1026760cpG c1026760cpG, String str2, String str3, int i, String str4, String str5, int i2) {
        boolean z;
        boolean z2;
        enumC345560Dgg = (i2 & 1) != 0 ? EnumC345560Dgg.TYPE_NONE_SLIDE : enumC345560Dgg;
        str = (i2 & 2) != 0 ? "" : str;
        c1026760cpG = (i2 & 4) != 0 ? null : c1026760cpG;
        if ((i2 & 64) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            str4 = C2188811AlT.LIZIZ(sbLIZ);
        }
        if ((i2 & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        str5 = (i2 & 256) != 0 ? null : str5;
        this.LIZ = enumC345560Dgg;
        this.LIZIZ = str;
        this.LIZJ = c1026760cpG;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = str4;
        this.LJII = z;
        this.LJIIIIZZ = str5;
        if (enumC345560Dgg != EnumC345560Dgg.TYPE_SLIDE_FOLLOW && enumC345560Dgg != EnumC345560Dgg.TYPE_SLIDE_GO) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LJIIIZ = z2;
        this.LJIIJ = i == ((ICRouterAdapterDelegate) ServiceManager.get().getService(ICRouterAdapterDelegate.class)).LJJIJLIJ();
    }
}
