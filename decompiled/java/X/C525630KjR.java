package X;

import android.content.Intent;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.shortvideo.album.internal.AlbumOpenApiSessionData;
import com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525630KjR extends AbstractC2255721DQs<InterfaceC522950Kf7> implements InterfaceC379610EuV, InterfaceC522950Kf7 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public final InterfaceC522950Kf7 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), CreationAlbumPlatformService.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), AlbumOpenApiSessionData.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525680KjW.class, null);
    public boolean LLIZLLLIL;
    public boolean LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C525630KjR.class, "platformService", "getPlatformService()Lcom/ss/android/ugc/aweme/shortvideo/album/service/CreationAlbumPlatformService;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C525630KjR.class, "sessionData", "getSessionData()Lcom/ss/android/ugc/aweme/shortvideo/album/internal/AlbumOpenApiSessionData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C525630KjR.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C525630KjR.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C525630KjR.class, "nextStepApi", "getNextStepApi()Lcom/ss/android/ugc/aweme/shortvideo/album/nextstep/AlbumNextStepApi;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    private final CreationAlbumPlatformService Z1() {
        return (CreationAlbumPlatformService) this.LLILLL.getValue(this, LLJI[0]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILZIL.getValue(this, LLJI[2]);
    }

    private final AbstractC214814194y o2() {
        return (AbstractC214814194y) this.LLILZLL.getValue(this, LLJI[3]);
    }

    private final AlbumOpenApiSessionData w2() {
        return (AlbumOpenApiSessionData) this.LLILZ.getValue(this, LLJI[1]);
    }

    @Override // X.InterfaceC522950Kf7
    public void SV0() {
        if (this.LLIZLLLIL) {
            throw new IllegalStateException("Can't dispatchCancel after dispatched result");
        }
        this.LLJ = true;
        String str = w2().launchIntentKey;
        C524340KhM.LIZ.getClass();
        if (!Intrinsics.LJFF(str, C524340KhM.LIZIZ)) {
            o2().setResult(0, null);
            o2().finish();
        } else {
            CreationAlbumPlatformService creationAlbumPlatformServiceZ1 = Z1();
            if (creationAlbumPlatformServiceZ1 != null) {
                creationAlbumPlatformServiceZ1.LIZJ();
            }
        }
    }

    public final InterfaceC525680KjW X1() {
        return (InterfaceC525680KjW) this.LLIZ.getValue(this, LLJI[4]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526310KkX(this, null), 3);
    }

    public InterfaceC522950Kf7 W1() {
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

    public C525630KjR(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC522950Kf7
    public void dg0(C525660KjU c525660KjU) {
        if (!this.LLJ) {
            this.LLIZLLLIL = true;
            List<TikTokMediaModel> list = c525660KjU.LIZ;
            Intent intent = c525660KjU.LIZJ;
            C345260DgC c345260DgC = new C345260DgC(intent, list);
            String str = w2().launchIntentKey;
            C524340KhM.LIZ.getClass();
            if (Intrinsics.LJFF(str, C524340KhM.LIZIZ)) {
                CreationAlbumPlatformService creationAlbumPlatformServiceZ1 = Z1();
                if (creationAlbumPlatformServiceZ1 != null) {
                    creationAlbumPlatformServiceZ1.LJ(getActivity(), o2(), c345260DgC);
                    return;
                }
                return;
            }
            o2().setResult(-1, intent);
            o2().finish();
            return;
        }
        throw new IllegalStateException("Can't dispatchResult after dispatched cancel");
    }
}
