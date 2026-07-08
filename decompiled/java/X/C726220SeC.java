package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ILandscapeFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;

/* JADX INFO: renamed from: X.0SeC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726220SeC implements ILandscapeFeedService {
    public static final C726220SeC LIZIZ = new C726220SeC();
    public final /* synthetic */ ILandscapeFeedService LIZ = (ILandscapeFeedService) ServiceManager.get().getService(ILandscapeFeedService.class);

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZ(Activity activity) {
        return this.LIZ.LIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZIZ(Aweme aweme) {
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final int LJ(Context context, Aweme aweme) {
        return this.LIZ.LJ(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJFF(InterfaceC665370Q7z interfaceC665370Q7z, int i, boolean z) {
        this.LIZ.LJFF(interfaceC665370Q7z, i, z);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJI(Context context, InterfaceC665370Q7z interfaceC665370Q7z) {
        return this.LIZ.LJI(context, interfaceC665370Q7z);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJII(String str) {
        return this.LIZ.LJII(str);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final C13IQ<? extends UIContentAssem> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJIIJ(ReusedUIAssem<? extends C03H5> reusedUIAssem, int i, Aweme aweme) {
        this.LIZ.LJIIJ(reusedUIAssem, i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIIJJI(int i, Aweme aweme) {
        return this.LIZ.LJIIJJI(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final C13IQ<? extends UIContentAssem> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIILIIL(int i, Aweme aweme) {
        return this.LIZ.LJIILIIL(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJIILJJIL(Assembler assembler, InteractAreaComponent interactAreaComponent) {
        this.LIZ.LJIILJJIL(assembler, interactAreaComponent);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIILL(Context context, Aweme aweme) {
        return this.LIZ.LJIILL(context, aweme);
    }
}
