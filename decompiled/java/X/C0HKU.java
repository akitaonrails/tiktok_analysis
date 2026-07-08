package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import java.util.List;

/* JADX INFO: renamed from: X.0HKU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HKU implements InterfaceC440230HOb<List<? extends C440440HOw>> {
    public final C01GW LIZ;
    public final C2252321DDq LIZIZ;
    public final C01GW LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC440230HOb
    public final Integer LIZ() {
        return 1;
    }

    @Override // X.InterfaceC440230HOb
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.InterfaceC440230HOb
    public final Integer LIZJ() {
        return 1;
    }

    @Override // X.InterfaceC440230HOb
    public final String LIZLLL() {
        return C0HOE.SA_SELF.getParam();
    }

    @Override // X.InterfaceC440230HOb
    public final void LJ() {
        SocialAvatarFastFlowService socialAvatarFastFlowService = (SocialAvatarFastFlowService) this.LIZ.getValue();
        if (socialAvatarFastFlowService != null) {
            socialAvatarFastFlowService.LIZJ(LJI());
        }
    }

    @Override // X.InterfaceC440230HOb
    public final C05YD<C0HOM<? extends List<? extends C440440HOw>>> getState() {
        return C09IC.LIZIZ(this.LIZIZ);
    }

    public static String LJI() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0HKU(X.InterfaceC497601wk r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 273(0x111, float:3.83E-43)
            kotlin.jvm.internal.AFwS192S0000000_6 r0 = kotlin.jvm.internal.AFwS192S0000000_6.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r3.LIZ = r0
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService r1 = (com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService) r1
            if (r1 == 0) goto L5a
            java.lang.String r0 = LJI()
            X.05YD r0 = r1.LIZIZ(r0)
            if (r0 == 0) goto L5a
            java.lang.Object r2 = r0.getValue()
            X.0HJq r2 = (X.InterfaceC439080HJq) r2
            if (r2 == 0) goto L5a
            X.0HOO r0 = X.C0HOM.LIZ
            java.lang.String r1 = LJI()
            r0.getClass()
            r0 = 0
            X.0HOM r0 = X.C0HOO.LIZIZ(r2, r1, r0)
            X.0HOM r0 = r0.LIZ()
            if (r0 == 0) goto L5a
        L3d:
            X.1DDq r0 = X.C1BNE.LIZ(r0)
            r3.LIZIZ = r0
            r0 = 274(0x112, float:3.84E-43)
            kotlin.jvm.internal.AFwS192S0000000_6 r0 = kotlin.jvm.internal.AFwS192S0000000_6.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r3.LIZJ = r0
            X.0HKT r2 = new X.0HKT
            r1 = 0
            r2.<init>(r3, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r4, r1, r1, r2, r0)
            return
        L5a:
            X.05Yu r0 = X.C1372605Yu.LIZIZ
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HKU.<init>(X.01wk):void");
    }

    @Override // X.InterfaceC440230HOb
    public final void LJFF(Context context, boolean z) {
        InterfaceC439080HJq value;
        EnumC437540HDs enumC437540HDs;
        String str;
        C05YD<InterfaceC439080HJq> c05ydLIZIZ;
        SocialAvatarFastFlowService socialAvatarFastFlowService = (SocialAvatarFastFlowService) this.LIZ.getValue();
        if (socialAvatarFastFlowService != null && (c05ydLIZIZ = socialAvatarFastFlowService.LIZIZ(LJI())) != null) {
            value = c05ydLIZIZ.getValue();
        } else {
            value = null;
        }
        if (value instanceof C438980HJg) {
            enumC437540HDs = EnumC437540HDs.START_REGENERATE;
            str = "imagine_studio_upgrade_image";
        } else {
            enumC437540HDs = EnumC437540HDs.IDLE;
            str = "imagine_studio";
        }
        ((ISocialAvatarService) this.LIZJ.getValue()).LJIILLIIL(new C0HHA(context, "click_imagine_studio_generate", str, null, null, 0, false, z, null, true, null, 2808), enumC437540HDs, null);
    }
}
