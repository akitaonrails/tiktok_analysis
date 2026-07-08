package X;

import Y.ARunnableS109S0100000_9;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService;
import com.ss.android.ugc.aweme.backgroundplay.service.BackgroundPlayServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.1EQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2281231EQv implements IBackgroundPlayService {
    public static final C2281231EQv LIZIZ = new C2281231EQv();
    public final /* synthetic */ IBackgroundPlayService LIZ;

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final void LJIIJ(Context context, Aweme aweme, String str, String str2, String str3) {
        this.LIZ.LJIIJ(context, aweme, str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final Long LJIIJJI(String str, String str2) {
        return this.LIZ.LJIIJJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIIL(String str, String str2, C0TC9 c0tc9) {
        return this.LIZ.LJIIL(str, str2, c0tc9);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIILIIL(Aweme aweme, String str, String str2, String str3, boolean z) {
        return this.LIZ.LJIILIIL(aweme, str, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final int LJIILJJIL(String str, String str2, String str3, Aweme aweme) {
        return this.LIZ.LJIILJJIL(str, str2, str3, aweme);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final int LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIILLIIL(String str, String str2, String str3, Aweme aweme) {
        return this.LIZ.LJIILLIIL(str, str2, str3, aweme);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final int LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIJ(Aweme aweme, String str, String str2) {
        return this.LIZ.LJIJ(aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIJI(Aweme aweme, String str, Fragment fragment, String str2, C0N0Y c0n0y, ARunnableS109S0100000_9 aRunnableS109S0100000_9, ARunnableS109S0100000_9 aRunnableS109S0100000_92) {
        return this.LIZ.LJIJI(aweme, str, fragment, str2, c0n0y, aRunnableS109S0100000_9, aRunnableS109S0100000_92);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final void LJIJJ(String str, String str2) {
        this.LIZ.LJIJJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final boolean LJIJJLI() {
        return this.LIZ.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final void LJIL(String str, String str2, String str3, String str4) {
        this.LIZ.LJIL(str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.backgroundplay.IBackgroundPlayService
    public final void LJJ() {
        this.LIZ.LJJ();
    }

    public C2281231EQv() {
        IBackgroundPlayService iBackgroundPlayService;
        Object objLIZ = C04TD.LIZ(IBackgroundPlayService.class, false);
        if (objLIZ != null) {
            iBackgroundPlayService = (IBackgroundPlayService) objLIZ;
        } else {
            if (C04TD.LLIILZL == null) {
                synchronized (IBackgroundPlayService.class) {
                    if (C04TD.LLIILZL == null) {
                        C04TD.LLIILZL = new BackgroundPlayServiceImpl();
                    }
                }
            }
            iBackgroundPlayService = C04TD.LLIILZL;
        }
        this.LIZ = iBackgroundPlayService;
    }
}
