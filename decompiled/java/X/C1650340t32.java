package X;

import Y.AObjectS246S0100000_25;
import a6n.a;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t32, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650340t32 extends AbstractC2255721DQs<InterfaceC1646940sxY> implements InterfaceC379610EuV, InterfaceC1646940sxY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1646940sxY LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1638550sk1.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650340t32.class, "bottomTabApi", "getBottomTabApi()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650340t32.class, "splitShootApi", "getSplitShootApi()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZLL = 8;
    }

    private final InterfaceC1648020szI X1() {
        return (InterfaceC1648020szI) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    private final InterfaceC1638550sk1 Z1() {
        return (InterfaceC1638550sk1) this.LLILZ.getValue(this, LLILZIL[1]);
    }

    private final void handleBackFromTextMode() {
        if (Intrinsics.LJFF(Z1().Wg(), C1664590tQ1.LJII(this).getString(2131845853))) {
            Z1().Yf(true, 7, false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C528180KnY.LIZ.getClass();
        if (C528180KnY.LJ()) {
            ((ITextToImageService) ServiceManager.get().getService(ITextToImageService.class)).LIZJ();
        }
        Z1().hb1().LIZ(this, new AObjectS246S0100000_25(this, 549));
        if (C1647240sy2.LIZ().unifyPreloadTasks) {
            return;
        }
        C197010126e.LIZ.getClass();
        C197010126e.LIZIZ();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        handleBackFromTextMode();
    }

    public InterfaceC1646940sxY W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1650340t32(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void o2(C1647390syH c1647390syH) {
        if (Intrinsics.LJFF(c1647390syH.LIZIZ, EnumC1647570syZ.RECORD_LIGHTENING_TEXT.getTag())) {
            C528180KnY.LIZ.getClass();
            if (C528180KnY.LJ()) {
                IOpenTextToImageService iOpenTextToImageServiceOpenTextToImageService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).openTextToImageService();
                a aVarProvideRecordEnv = X1().provideRecordEnv();
                int i = c1647390syH.LIZJ;
                Bundle bundle = new Bundle();
                bundle.putInt("origin", 1);
                C786410Ut5.LJJJI("entrance", "shoot_page_text_button", bundle);
                IOpenTextToImageService.DefaultImpls.openTextToImageFromRecord$default(iOpenTextToImageServiceOpenTextToImageService, aVarProvideRecordEnv, i, bundle, null, 8, null);
                return;
            }
            IOpenTextNextService.DefaultImpls.openTextModeCanvas$default(((IExternalService) ServiceManager.get().getService(IExternalService.class)).openTextNextService(), X1().provideRecordEnv(), c1647390syH.LIZJ, null, 4, null);
        }
    }
}
