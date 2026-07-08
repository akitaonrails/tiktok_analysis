package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.innerpush.InnerPushServiceImpl;
import com.ss.android.ugc.aweme.innerpush.api.IInnerPushService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zlO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908480zlO implements IInnerPushService {
    public static final C1908480zlO LIZIZ = new C1908480zlO();
    public final /* synthetic */ IInnerPushService LIZ;

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LIZIZ(C1906330zhv c1906330zhv) {
        this.LIZ.LIZIZ(c1906330zhv);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final C13IQ<? extends AbstractC738140SxQ> LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LIZLLL(C19323510in c19323510in) {
        return this.LIZ.LIZLLL(c19323510in);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJ(InterfaceC19330810jy interfaceC19330810jy) {
        this.LIZ.LJ(interfaceC19330810jy);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJFF(long j) {
        this.LIZ.LJFF(j);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJI(InterfaceC19330810jy interfaceC19330810jy) {
        this.LIZ.LJI(interfaceC19330810jy);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJII(C18JY c18jy, InnerPushMessage innerPushMessage, String str, int i) {
        this.LIZ.LJII(c18jy, innerPushMessage, str, i);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIIIZZ(InterfaceC20643015q8 interfaceC20643015q8) {
        this.LIZ.LJIIIIZZ(interfaceC20643015q8);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIIIZ(boolean z) {
        return this.LIZ.LJIIIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final InterfaceC1209290hZf LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIL(boolean z, boolean z2) {
        this.LIZ.LJIIL(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIILIIL(JSONObject jSONObject, long j) {
        this.LIZ.LJIILIIL(jSONObject, j);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIILJJIL(JSONObject jSONObject) {
        return this.LIZ.LJIILJJIL(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIILL(InterfaceC20643015q8 interfaceC20643015q8, int[] iArr) {
        this.LIZ.LJIILL(interfaceC20643015q8, iArr);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final boolean LJIILLIIL(String str) {
        return this.LIZ.LJIILLIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void LJIIZILJ(InterfaceC20643015q8 interfaceC20643015q8) {
        this.LIZ.LJIIZILJ(interfaceC20643015q8);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final InterfaceC19330810jy LJIJ(int i) {
        return this.LIZ.LJIJ(i);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final HashMap<String, String> LJIJI(InnerPushMessage innerPushMessage) {
        return this.LIZ.LJIJI(innerPushMessage);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.IInnerPushService
    public final void init() {
        boolean zLJI = MethodIDManager.LJI(202251);
        this.LIZ.init();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C1908480zlO() {
        IInnerPushService iInnerPushService;
        Object objLIZ = C04TD.LIZ(IInnerPushService.class, false);
        if (objLIZ != null) {
            iInnerPushService = (IInnerPushService) objLIZ;
        } else {
            if (C04TD.r1 == null) {
                synchronized (IInnerPushService.class) {
                    if (C04TD.r1 == null) {
                        C04TD.r1 = new InnerPushServiceImpl();
                    }
                }
            }
            iInnerPushService = C04TD.r1;
        }
        this.LIZ = iInnerPushService;
    }
}
