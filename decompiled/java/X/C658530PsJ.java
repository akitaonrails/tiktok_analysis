package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658530PsJ extends FrameLayout implements InterfaceC648270Pbl, InterfaceC663110Pzh {
    public boolean LL;
    public final C663070Pzd LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public ImageView LLILZIL;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJIIIZ() {
        this.LLILZ = true;
        getDataProvider();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    public void setAutoPlay(boolean z) {
    }

    @Override // X.InterfaceC648350Pbt
    public void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    @Override // X.InterfaceC663110Pzh
    public final void LIZIZ() {
        if (!this.LL && getContext() != null) {
            setOutlineProvider(new C689710R3p(this, 2));
            setClipToOutline(true);
        }
        getDataProvider();
    }

    @Override // X.InterfaceC663110Pzh
    public final void LIZLLL() {
        C663070Pzd c663070Pzd = this.LLILLJJLI;
        c663070Pzd.LLJIJIL = true;
        ImageView imageView = c663070Pzd.LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        this.LLILZ = true;
        AbstractC658540PsK abstractC658540PsK = getDataProvider().LJIIJJI;
        if (abstractC658540PsK != null) {
            abstractC658540PsK.LIZLLL();
        }
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJIIJ() {
        this.LLILLJJLI.LIZIZ();
        getDataProvider();
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        C663070Pzd c663070Pzd = this.LLILLJJLI;
        c663070Pzd.getClass();
        return c663070Pzd;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        this.LLILLJJLI.LJJLIIIJLLLLLLLZ();
    }

    public final C658480PsE getDataProvider() {
        return (C658480PsE) this.LLILLL.getValue();
    }

    public final String getLivePlayerTag() {
        return this.LLILLJJLI.getLivePlayerTag();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return this.LLILLJJLI.isPlaying();
    }

    @Override // X.InterfaceC663110Pzh
    public final void onPause() {
        C663070Pzd c663070Pzd = this.LLILLJJLI;
        c663070Pzd.LLJIJIL = true;
        ImageView imageView = c663070Pzd.LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        this.LLILZ = true;
        AbstractC658540PsK abstractC658540PsK = getDataProvider().LJIIJJI;
        if (abstractC658540PsK != null) {
            abstractC658540PsK.onPause();
        }
    }

    private final InterfaceC655620Pnc getMediaHelper() {
        return getDataProvider().LJ;
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJII() {
        Aweme aweme = getDataProvider().LJI;
        LiveRoomStruct newLiveRoomDataExt = aweme != null ? AwemeExtKt.getNewLiveRoomDataExt(aweme) : null;
        if ((newLiveRoomDataExt == null || !newLiveRoomDataExt.liveTypeAudio) && this.LLILZ) {
            this.LLILZ = false;
            this.LLILLJJLI.LJIIIZ();
        }
        AbstractC658540PsK abstractC658540PsK = getDataProvider().LJIIJJI;
        if (abstractC658540PsK != null) {
            abstractC658540PsK.LJII();
        }
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJJZ() {
        AbstractC658540PsK abstractC658540PsK = getDataProvider().LJIIJJI;
        if (abstractC658540PsK != null) {
            abstractC658540PsK.LJJZ();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        InterfaceC655620Pnc mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.LLJJJ();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        InterfaceC655620Pnc mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.u4(150L);
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        InterfaceC655620Pnc mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.LLLLLILLIL();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        InterfaceC655620Pnc mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.onDestroy();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC663110Pzh
    public final void onLoading() {
        AbstractC658540PsK abstractC658540PsK = getDataProvider().LJIIJJI;
        if (abstractC658540PsK != null) {
            abstractC658540PsK.onLoading();
        }
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC663110Pzh
    public final void LIZ() {
        getDataProvider();
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJ() {
        getDataProvider();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    public final C663070Pzd getLiveCore() {
        return this.LLILLJJLI;
    }

    public final ImageView getMCoverView() {
        return this.LLILZIL;
    }

    public final boolean getOutCorner() {
        return this.LL;
    }

    @Override // X.InterfaceC663110Pzh
    public final void onBind() {
        getDataProvider();
    }

    @Override // X.InterfaceC663110Pzh
    public final void onDestroy() {
        getDataProvider();
    }

    @Override // X.InterfaceC663110Pzh
    public final void onInit() {
        getDataProvider();
    }

    @Override // X.InterfaceC663110Pzh
    public final void onError(String str) {
        AbstractC658540PsK abstractC658540PsK = getDataProvider().LJIIJJI;
        if (abstractC658540PsK != null) {
            abstractC658540PsK.onError(str);
        }
    }

    public final void setMCoverView(ImageView imageView) {
        this.LLILZIL = imageView;
        this.LLILLJJLI.setMCoverView(imageView);
    }

    public final void setOutCorner(boolean z) {
        this.LL = z;
    }

    public C658530PsJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C663070Pzd c663070Pzd = new C663070Pzd(context, attributeSet, 0);
        this.LLILLJJLI = c663070Pzd;
        this.LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1266));
        this.LLILZ = true;
        c663070Pzd.getStatusDelegate().LIZJ().add(new C655800Pnu(getDataProvider()));
        c663070Pzd.getStatusDelegate().LIZJ().add(this);
        addView(c663070Pzd);
    }

    public final void LIZJ(Aweme aweme, C653660PkS c653660PkS) {
        String str;
        getDataProvider().LJII = c653660PkS;
        C660870Pw5.LIZIZ(this, c653660PkS);
        this.LLILZ = true;
        this.LLILLJJLI.LIZJ(aweme);
        if (aweme.getIsLiveHasProduct()) {
            str = "ecom";
        } else {
            str = "";
        }
        this.LLILLJJLI.setLivePlayerEntranceParam(new C1699360uK6("general_search", "live_cell", "", str, false, true, 8));
        this.LLILLJJLI.LIZIZ();
        if (((Boolean) C0BCL.LIZ.getValue()).booleanValue()) {
            this.LLILLJJLI.setBackgroundColor(-16777216);
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJI(int i, int i2, View view) {
        AbstractC658540PsK abstractC658540PsK = getDataProvider().LJIIJJI;
        if (abstractC658540PsK != null) {
            abstractC658540PsK.LJI(i, i2, view);
        }
    }
}
