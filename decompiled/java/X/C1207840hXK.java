package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.AwS12S0300100_18;
import kotlin.jvm.internal.AwS21S0300100_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS70S0100100_18;

/* JADX INFO: renamed from: X.0hXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207840hXK extends C12Q8 {
    public InterfaceC1207430hWf LIZ;
    public final AwS562S0100000_18 LIZIZ;
    public final /* synthetic */ C1207850hXL LIZJ;

    @Override // X.C12Q8
    public final void LIZ() {
        InterfaceC1207430hWf interfaceC1207430hWf = this.LIZ;
        if (interfaceC1207430hWf != null) {
            interfaceC1207430hWf.hide();
        }
    }

    public C1207840hXK(C1207850hXL c1207850hXL) {
        this.LIZJ = c1207850hXL;
        this.LIZIZ = new AwS562S0100000_18(c1207850hXL, 2420);
    }

    @Override // X.C12Q8
    public final void LIZLLL(C12QB c12qb, C12QB c12qb2, String str, String str2, String str3) {
        String str4;
        String str5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c12qb != null) {
            if (C13LP.LJJJJ(this.LIZJ.LIZJ.certToken(), C1201430hMz.LIZIZ().openSettingsCertTokenList)) {
                if (!C13LP.LJJJJ(this.LIZJ.LIZJ.certToken(), C1201430hMz.LIZIZ().prePopupCertTokenList)) {
                    c12qb.LIZ();
                    return;
                }
                AwS21S0300100_18 awS21S0300100_18 = new AwS21S0300100_18(jCurrentTimeMillis, c12qb, this, this.LIZJ, 0);
                AwS70S0100100_18 awS70S0100100_18 = new AwS70S0100100_18(this.LIZJ, jCurrentTimeMillis, 1);
                C1201470hN3 c1201470hN3 = C1201470hN3.LIZ;
                Activity activity = this.LIZJ.LIZ;
                c1201470hN3.getClass();
                C1201470hN3.LJFF(activity, awS21S0300100_18, awS70S0100100_18);
                C1207400hWc c1207400hWc = C1207400hWc.LIZ;
                C1207520hWo c1207520hWo = this.LIZJ.LIZIZ;
                String str6 = null;
                if (c1207520hWo != null) {
                    str4 = c1207520hWo.LIZLLL;
                    str5 = c1207520hWo.LIZ;
                    str6 = c1207520hWo.LIZIZ;
                } else {
                    str4 = null;
                    str5 = null;
                }
                c1207400hWc.getClass();
                C1207400hWc.LJ(str4, str5, str6);
                return;
            }
            Activity activity2 = this.LIZJ.LIZ;
            C1397580mTM c1397580mTM = new C1397580mTM(activity2);
            c1397580mTM.LJI(activity2.getResources().getString(2131850512));
            c1397580mTM.LIZIZ(str2);
            c1397580mTM.LJII = false;
            C1238130iKB.LIZ(c1397580mTM, new AwS12S0300100_18(jCurrentTimeMillis, c12qb, this, this.LIZJ, 2));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        this.LIZIZ.invoke();
        if (TextUtils.isEmpty(str2)) {
            str2 = this.LIZJ.LIZ.getString(2131844821);
        }
        this.LIZ = C0JOG.LIZ(this.LIZJ.LIZ, ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIIZ(this.LIZJ.LIZ), str2);
    }
}
