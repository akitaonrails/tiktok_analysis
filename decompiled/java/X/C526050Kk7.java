package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0Kk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526050Kk7 extends AbstractC2255721DQs<C05YN> implements C05YN, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final C05YN LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525910Kjt.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525680KjW.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), AlbumEventTrackingConfig.class, null);
    public final List<Function2<String, C0LAB, Unit>> LLIZ = new ArrayList();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C526050Kk7.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/aweme/shortvideo/album/bottombar/AlbumBottomBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C526050Kk7.class, "nextStepApi", "getNextStepApi()Lcom/ss/android/ugc/aweme/shortvideo/album/nextstep/AlbumNextStepApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C526050Kk7.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C526050Kk7.class, "eventTrackingConfig", "getEventTrackingConfig()Lcom/ss/android/ugc/aweme/shortvideo/album/api/config/AlbumEventTrackingConfig;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final InterfaceC525910Kjt Z1() {
        return (InterfaceC525910Kjt) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    public final AlbumEventTrackingConfig o2() {
        return (AlbumEventTrackingConfig) this.LLILZLL.getValue(this, LLIZLLLIL[3]);
    }

    public final InterfaceC525680KjW w2() {
        return (InterfaceC525680KjW) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    private final void registerObservers() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526220KkO(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526300KkW(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Map<String, String> map = o2().passThroughCommonParams;
        if (map != null) {
            Fx1(new AwS622S0100000_8(map, (Map<String, String>) 11));
        }
        Map<String, ? extends Map<String, String>> map2 = o2().passThroughParams;
        if (map2 != null) {
            Fx1(new AwS622S0100000_8(map2, (Map<String, String>) 12));
        }
        registerObservers();
    }

    public C05YN X1() {
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

    public C526050Kk7(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C05YN
    public void Fx1(Function2<? super String, ? super C0LAB, Unit> function2) {
        this.LLIZ.add(function2);
    }

    public final void G2(C526070Kk9 c526070Kk9) {
        TikTokMediaModel tikTokMediaModel = c526070Kk9.LIZ;
        C522180Kds c522180Kds = C522180Kds.LIZ;
        boolean zLJIILJJIL = tikTokMediaModel.LJIILJJIL();
        c522180Kds.getClass();
        C0LAB c0labLIZ = C522180Kds.LIZ(zLJIILJJIL);
        c0labLIZ.LJ("edit_way", "click");
        W1("edit_clip_preview", c0labLIZ);
    }

    public final void H2(C526080KkA c526080KkA) {
        boolean zLJIILJJIL = c526080KkA.LIZ.LJIILJJIL();
        C522180Kds.LIZ.getClass();
        W1("edit_clip_delete", C522180Kds.LIZ(zLJIILJJIL));
    }

    public final void T2(C526060Kk8 c526060Kk8) {
        TikTokMediaModel tikTokMediaModel = c526060Kk8.LIZJ;
        if (tikTokMediaModel == null) {
            return;
        }
        boolean zLJIILJJIL = tikTokMediaModel.LJIILJJIL();
        C522180Kds.LIZ.getClass();
        C0LAB c0labLIZ = C522180Kds.LIZ(zLJIILJJIL);
        c0labLIZ.LJ("edit_way", "press");
        W1("edit_clips_order", c0labLIZ);
    }

    public final void W1(String str, C0LAB c0lab) {
        Iterator<Function2<String, C0LAB, Unit>> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(str, c0lab);
        }
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }
}
