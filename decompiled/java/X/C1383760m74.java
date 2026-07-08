package X;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.IDanmakuService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.DanmakuServiceImpl;

/* JADX INFO: renamed from: X.0m74, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383760m74 implements IDanmakuService {
    public static final C1383760m74 LIZIZ = new C1383760m74();
    public final /* synthetic */ IDanmakuService LIZ;

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIIZ(Aweme aweme) {
        return this.LIZ.LJIIIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIIJJI(C19EG c19eg, String str, Aweme aweme) {
        this.LIZ.LJIIJJI(c19eg, str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIL(Aweme aweme) {
        return this.LIZ.LJIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIILIIL(Aweme aweme) {
        return this.LIZ.LJIILIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIILJJIL(ViewGroup viewGroup, Aweme aweme) {
        this.LIZ.LJIILJJIL(viewGroup, aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIJ(Aweme aweme, String str, boolean z) {
        this.LIZ.LJIJ(aweme, str, z);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIJI(Aweme aweme, String str) {
        this.LIZ.LJIJI(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIJJ() {
        return this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIJJLI(Lifecycle lifecycle, EnumC726810Sf9 enumC726810Sf9) {
        this.LIZ.LJIJJLI(lifecycle, enumC726810Sf9);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIL(Aweme aweme, String str, boolean z) {
        this.LIZ.LJIL(aweme, str, z);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJJ(String str) {
        this.LIZ.LJJ(str);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJJI(C19EG c19eg, String str, Aweme aweme) {
        this.LIZ.LJJI(c19eg, str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIFFI(Aweme aweme) {
        return this.LIZ.LJJIFFI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJII() {
        return this.LIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIII(Aweme aweme) {
        return this.LIZ.LJJIII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIIJ() {
        return this.LIZ.LJJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIIJZLJL(Aweme aweme) {
        return this.LIZ.LJJIIJZLJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIIZ() {
        return this.LIZ.LJJIIZ();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJIIZI() {
        return this.LIZ.LJJIIZI();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJJIJ(String str, String str2) {
        this.LIZ.LJJIJ(str, str2);
    }

    public C1383760m74() {
        IDanmakuService iDanmakuService;
        Object objLIZ = C04TD.LIZ(IDanmakuService.class, false);
        if (objLIZ != null) {
            iDanmakuService = (IDanmakuService) objLIZ;
        } else {
            if (C04TD.Z3 == null) {
                synchronized (IDanmakuService.class) {
                    if (C04TD.Z3 == null) {
                        C04TD.Z3 = new DanmakuServiceImpl();
                    }
                }
            }
            iDanmakuService = C04TD.Z3;
        }
        this.LIZ = iDanmakuService;
    }
}
