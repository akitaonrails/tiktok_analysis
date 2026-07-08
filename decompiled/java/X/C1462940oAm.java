package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0oAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1462940oAm extends AbstractC2255721DQs<InterfaceC1452920nuc> implements InterfaceC1452920nuc, InterfaceC379610EuV {
    public static final int LLILZIL = 8;
    public final C1DRG LL;
    public List<SingleImageData> LLILLJJLI;
    public C11RK<Boolean> LLILLL;
    public int LLILZ;

    private final void Z1() {
        SingleImageData singleImageData;
        SrcLiveVideoInfo srcLiveInfo;
        List listLJIIJJI = C1697810uHb.LJIIJJI(LivePhotoPreviewMode.LIVE_PHOTO, LivePhotoPreviewMode.LOOP);
        List<SingleImageData> list = this.LLILLJJLI;
        boolean zLJJJJ = C13LP.LJJJJ((list == null || (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(this.LLILZ, list)) == null || (srcLiveInfo = singleImageData.getSrcLiveInfo()) == null) ? null : srcLiveInfo.getLivePhotoPreviewMode(), listLJIIJJI);
        C11RK<Boolean> c11rk = this.LLILLL;
        if (c11rk != null) {
            c11rk.onNext(Boolean.valueOf(zLJJJJ));
        }
    }

    public InterfaceC19647211tu Av() {
        return null;
    }

    public InterfaceC1452920nuc W1() {
        return this;
    }

    public AbstractC19484711Kz<Unit> fb(int i) {
        return null;
    }

    public final int LJLJJL() {
        return this.LLILZ;
    }

    public final C11RK<Boolean> X1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1462940oAm(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1452920nuc
    public void BX1(List<SingleImageData> list) {
        this.LLILLJJLI = list;
        Z1();
    }

    public final void o2(int i) {
        this.LLILZ = i;
    }

    @Override // X.InterfaceC1452920nuc
    public AbstractC19484711Kz<Boolean> rb1(int i) {
        SingleImageData singleImageData;
        LivePhotoPreviewMode livePhotoPreviewMode;
        this.LLILZ = i;
        List<SingleImageData> list = this.LLILLJJLI;
        if (list != null && (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, list)) != null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(LivePhotoPreviewMode.LIVE_PHOTO, LivePhotoPreviewMode.LOOP);
            SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
            if (srcLiveInfo != null) {
                livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode();
            } else {
                livePhotoPreviewMode = null;
            }
            return AbstractC19484711Kz.LJIJJLI(Boolean.valueOf(C13LP.LJJJJ(livePhotoPreviewMode, listLJIIJJI)));
        }
        C11RK<Boolean> c11rk = new C11RK<>();
        this.LLILLL = c11rk;
        return new C19475111Hh(c11rk);
    }

    public final void w2(C11RK<Boolean> c11rk) {
        this.LLILLL = c11rk;
    }
}
