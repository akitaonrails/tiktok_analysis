package X;

import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.common.ui.component.SearchPlayerCore$initLifeCycleObserver$1;
import com.ss.android.ugc.aweme.search.common.ui.component.SearchPlayerCore$initLifeCycleObserver$2;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661850Pxf extends C1473870oSP implements OnUIPlayListener, InterfaceC648270Pbl {
    public static final boolean LLLILZLLLI = C650560PfS.LIZ;
    public static final C01GW<HashSet<C661850Pxf>> LLLIZZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(175));
    public OnUIPlayListener LLIZ;
    public InterfaceC661680PxO LLIZLLLIL;
    public InterfaceC648270Pbl LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public final int LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public String LLJJJJLIIL;
    public final C01GW LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public InterfaceC1472010oPP LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final AtomicBoolean LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public final C01GW LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;
    public boolean LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public int LLLI;
    public int LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public long LLLIIIL;
    public boolean LLLIIL;
    public InterfaceC1010470cOz LLLIILIL;
    public InterfaceC660150Puv LLLIL;
    public String LLLILZ;
    public String LLLILZJ;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
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

    @Override // X.C1473870oSP, X.InterfaceC1474060oSi
    public /* bridge */ /* synthetic */ String getStackTraceString() {
        return C1474050oSh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C583620Mum.LIZLLL(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str) {
        C583620Mum.LJIIIIZZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJIILJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C583620Mum.LJJIJL(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C583620Mum.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    public void setAutoPlay(boolean z) {
    }

    @Override // X.InterfaceC648350Pbt
    public void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    private final EnumC2281141EQm getAllVideoDowngradeResolution() {
        return (EnumC2281141EQm) this.LLJJJJJIL.getValue();
    }

    private final boolean getEnableAllVideoDowngradeResolution() {
        return ((Boolean) this.LLJJJJ.getValue()).booleanValue();
    }

    private final boolean getEnableFirstVideoDowngradeResolution() {
        return ((Boolean) this.LLJJJ.getValue()).booleanValue();
    }

    private final EnumC2281141EQm getFirstVideoDowngradeResolution() {
        return (EnumC2281141EQm) this.LLJJJIL.getValue();
    }

    private final C586920N0g getPlayStateHelper() {
        return (C586920N0g) this.LLLIIII.getValue();
    }

    public final void LJIL() {
        if (this.LLLFZ || C659080PtC.LIZIZ()) {
            getMPlayVideoHelper().LJFF();
        }
    }

    public final C661490Px5 getDataProvider() {
        return (C661490Px5) this.LLJJL.getValue();
    }

    public final C586970N0l getMPlayVideoHelper() {
        return (C586970N0l) this.LLJZ.getValue();
    }

    public final InterfaceC1482650ogZ getSurfaceHolder() {
        return (InterfaceC1482650ogZ) this.LLJL.getValue();
    }

    public final InterfaceC1473950oSX getVideoSurfaceLifecycleListener() {
        return (InterfaceC1473950oSX) this.LLLIIIIL.getValue();
    }

    @Override // X.C1473870oSP, android.view.View
    public final void onDetachedFromWindow() {
        Aweme mAweme;
        C658950Psz c658950Psz;
        LLLIZZ.getValue().remove(this);
        if (getDataProvider().LJIIJJI) {
            super.onDetachedFromWindow();
            setMIsAttached(false);
            Aweme mAweme2 = getMAweme();
            if ((mAweme2 != null && mAweme2.isAd()) || ((mAweme = getMAweme()) != null && C1010120cOQ.LJJIJ(mAweme))) {
                this.LLLIIL = true;
            }
            if (getDataProvider().LJIIL && (c658950Psz = getDataProvider().LJIIJ) != null) {
                c658950Psz.onDestroy();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getPlayerInstanceInfo());
            sbLIZ.append(" detach from Window");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LLJJIII) {
            if (!this.LLJJIJIL && this.LLJILJILJ > 0) {
                this.LLJILJILJ = 0;
            }
            this.LLJI = true;
            this.LLJIJIL = true;
        }
        this.LLJLLL = 0;
    }

    private final boolean getMIsAttached() {
        return getDataProvider().LIZIZ;
    }

    private final InterfaceC652950PjJ getMPlayVideoObserver() {
        return getDataProvider().LJI;
    }

    private final String getPlayerInstanceInfo() {
        C0N0Y mPlayer = getMPlayer();
        if (mPlayer == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlayerCore{");
            sbLIZ.append(Integer.toHexString(hashCode()));
            sbLIZ.append(" player=null}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PlayerCore{");
        sbLIZ2.append(Integer.toHexString(hashCode()));
        sbLIZ2.append(" player=");
        sbLIZ2.append(Integer.toHexString(mPlayer.hashCode()));
        sbLIZ2.append('}');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LJJI() {
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL;
        if (C07H8.LIZIZ()) {
            InterfaceC1472010oPP interfaceC1472010oPP = this.LLJLIL;
            if (interfaceC1472010oPP != null) {
                C0N0Y mPlayer = getMPlayer();
                if (mPlayer != null && (interfaceC1483670oiDLJIILL = mPlayer.LJIILL()) != null) {
                    interfaceC1483670oiDLJIILL.LJJIJL(this.LLJLIL);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setSubInfoListener：");
                C0N0Y mPlayer2 = getMPlayer();
                sbLIZ.append(mPlayer2 != null ? mPlayer2.LJIILL() : null);
                sbLIZ.append(", awemeId: ");
                Aweme mAweme = getMAweme();
                sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
                sbLIZ.append(", data:");
                sbLIZ.append(interfaceC1472010oPP);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C0N0Y mPlayer3 = getMPlayer();
            if (mPlayer3 != null) {
                mPlayer3.LJIILL();
            }
        }
    }

    public final boolean LJJII() {
        C661550PxB c661550PxBLJ = getDataProvider().LJ();
        if (c661550PxBLJ != null && c661550PxBLJ.LJIIIIZZ) {
            return true;
        }
        C661550PxB c661550PxBLJ2 = getDataProvider().LJ();
        return c661550PxBLJ2 != null && c661550PxBLJ2.LJIIIZ;
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return getDataProvider().LIZ;
    }

    public final void LJJIIJZLJL() {
        if (!LJJII()) {
            C0N0Y c0n0y = getMPlayVideoHelper().LJI;
            if (c0n0y != null) {
                c0n0y.seek(0.0f);
            }
            getMPlayVideoHelper().LJIIIIZZ();
            return;
        }
        C661550PxB c661550PxBLJ = getDataProvider().LJ();
        if (c661550PxBLJ == null || !c661550PxBLJ.LJII) {
            getMPlayVideoHelper().LJI(this.LLJILJILJ);
        } else {
            getMPlayVideoHelper().LJIIIIZZ();
            C661550PxB c661550PxBLJ2 = getDataProvider().LJ();
            if (c661550PxBLJ2 != null) {
                c661550PxBLJ2.LJI = -1;
            }
        }
        C661550PxB c661550PxBLJ3 = getDataProvider().LJ();
        if (c661550PxBLJ3 != null) {
            c661550PxBLJ3.LJIIIIZZ = false;
        }
    }

    public final void LJJIIZ() {
        C664340Q4a c664340Q4a;
        C664340Q4a c664340Q4a2;
        C664340Q4a c664340Q4a3;
        if (getMPlayer() != null) {
            if (C0P5P.LIZ()) {
                InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
                if ((interfaceC661680PxO instanceof C664340Q4a) && (c664340Q4a3 = (C664340Q4a) interfaceC661680PxO) != null) {
                    c664340Q4a3.LJIJJLI();
                }
                InterfaceC661680PxO interfaceC661680PxO2 = this.LLIZLLLIL;
                if ((interfaceC661680PxO2 instanceof C664340Q4a) && (c664340Q4a2 = (C664340Q4a) interfaceC661680PxO2) != null) {
                    c664340Q4a2.LJIILL();
                }
            }
            if (!C256030A1p.LIZ()) {
                InterfaceC661680PxO interfaceC661680PxO3 = this.LLIZLLLIL;
                if ((interfaceC661680PxO3 instanceof C664340Q4a) && (c664340Q4a = (C664340Q4a) interfaceC661680PxO3) != null) {
                    Aweme mAweme = getMAweme();
                    c664340Q4a.LJIL(mAweme != null ? mAweme.getAid() : null);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releasePlayerIfNecessary. ");
            sbLIZ.append(getPlayerInstanceInfo());
            C2188811AlT.LIZIZ(sbLIZ);
            C650710Pfh c650710Pfh = C640060P8q.LIZ;
            C0N0Y mPlayer = getMPlayer();
            c650710Pfh.getClass();
            C650710Pfh.LIZLLL(mPlayer);
            getMPlayVideoHelper().LIZJ();
            getMPlayVideoHelper().LJIIIZ = Boolean.FALSE;
            Map<Integer, String> map = C661520Px8.LIZ;
            C661520Px8.LIZLLL(getMPlayer());
            setMPlayer(null);
        }
    }

    public final void LJJIJ() {
        Map<String, String> map;
        C653660PkS c653660PkS = getDataProvider().LJIL;
        if (c653660PkS == null || (map = c653660PkS.LJJJJJL) == null) {
            return;
        }
        C661940Pxo c661940Pxo = new C661940Pxo();
        c661940Pxo.LJIIZILJ("autoplay_status", C1837307Hn.LIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        c661940Pxo.LJIILLIIL.putAll(map);
        c661940Pxo.LJIILJJIL();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
        C664340Q4a c664340Q4a;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopMedia:");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (getMAweme() != null && (getMPlayer() == null || getMPlayer().LJJIII() == null || TextUtils.equals(this.LLJJJJLIIL, getMPlayer().LJJIII().getSourceId()))) {
            C586970N0l mPlayVideoHelper = getMPlayVideoHelper();
            mPlayVideoHelper.LJFF = 1;
            C0N0Y c0n0y = mPlayVideoHelper.LJI;
            if (c0n0y != null) {
                c0n0y.LJJL();
            }
            if (getMPlayer() != null) {
                InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
                if ((interfaceC661680PxO instanceof C664340Q4a) && (c664340Q4a = (C664340Q4a) interfaceC661680PxO) != null) {
                    c664340Q4a.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "stop");
                }
            }
        }
        InterfaceC648270Pbl interfaceC648270Pbl = this.LLJ;
        if (interfaceC648270Pbl != null) {
            interfaceC648270Pbl.LJJJJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    @Override // X.InterfaceC648270Pbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJ() {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661850Pxf.LLJJJ():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0259, code lost:
    
        if (r1.isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED) == true) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140 A[PHI: r0
      0x0140: PHI (r0v256 java.lang.String) = (r0v255 java.lang.String), (r0v262 java.lang.String) binds: [B:57:0x011b, B:62:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
    @Override // X.InterfaceC648270Pbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLIL() {
        /*
            Method dump skipped, instruction units count: 1851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661850Pxf.LLLLLIL():void");
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        if (getDataProvider().LJ) {
            getDataProvider().LJ = false;
            return;
        }
        LLJJJ();
        InterfaceC648270Pbl interfaceC648270Pbl = this.LLJ;
        if (interfaceC648270Pbl != null) {
            interfaceC648270Pbl.LLLLLILLIL();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseMedia:");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        onDestroy();
        InterfaceC648270Pbl interfaceC648270Pbl = this.LLJ;
        if (interfaceC648270Pbl != null) {
            interfaceC648270Pbl.O4();
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.O4();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    public final Aweme getMAweme() {
        return getDataProvider().LIZJ;
    }

    public final C0N0Y getMPlayer() {
        return getDataProvider().LJIILIIL;
    }

    public final long getPlayerCurrentPosition() {
        return getMPlayVideoHelper().LIZLLL();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        C0N0Y c0n0y;
        if (!C291280BbK.LIZ()) {
            C0N0Y c0n0y2 = getMPlayVideoHelper().LJI;
            return c0n0y2 != null && c0n0y2.isPlaying();
        }
        int i = this.LLJLLL;
        if (i == 4 || i == 1) {
            return true;
        }
        return (i == 2 || (c0n0y = getMPlayVideoHelper().LJI) == null || !c0n0y.isPlaying()) ? false : true;
    }

    @Override // X.C1473870oSP, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMIsAttached(true);
        LLLIZZ.getValue().add(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(" attach to Window");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void onDestroy() {
        SimVideoUrlModel simVideoUrlModelLJFF;
        if (getMAweme() == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(" onDestroy. aid: ");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLIIIL = getMPlayVideoHelper().LIZLLL();
        LLJJJ();
        if (getMPlayer() != null && getMAweme() != null && (simVideoUrlModelLJFF = C1483340ohg.LJFF(getMAweme())) != null) {
            C1478160oZK.LIZ().LJJJJZ(simVideoUrlModelLJFF);
        }
        if (getMPlayer() != null) {
            C650710Pfh c650710Pfh = C640060P8q.LIZ;
            C0N0Y mPlayer = getMPlayer();
            c650710Pfh.getClass();
            C650710Pfh.LIZLLL(mPlayer);
            getMPlayVideoHelper().LIZJ();
            setMPlayer(null);
        }
        C661490Px5 dataProvider = getDataProvider();
        C661550PxB c661550PxBLJ = getDataProvider().LJ();
        dataProvider.LJJIL = c661550PxBLJ != null ? c661550PxBLJ.LIZLLL : -1L;
        Aweme mAweme2 = getMAweme();
        if (mAweme2 != null) {
            InterfaceC641090PCp interfaceC641090PCp = getDataProvider().LJII;
            String strLIZ = C0P7S.LIZ(interfaceC641090PCp != null ? interfaceC641090PCp.getIdentifier() : null, mAweme2.getAid());
            C661830Pxd c661830Pxd = C661820Pxc.LIZ;
            if (!((HashMap) c661830Pxd.LIZ).isEmpty() && strLIZ != null) {
                ((HashMap) c661830Pxd.LIZ).remove(strLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("removePlayShareInfo ");
            sbLIZ2.append(strLIZ);
            sbLIZ2.append("; ");
            sbLIZ2.append(Log.getStackTraceString(new Throwable()));
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (C07H8.LIZIZ()) {
            this.LLJLIL = null;
        }
        if (this.LLJJIII) {
            this.LLJILJILJ = 0;
        }
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release:");
        Aweme mAweme = getMAweme();
        sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        onDestroy();
        this.LLJJI = true;
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        int i;
        if (C291280BbK.LIZ()) {
            return Boolean.valueOf(isPlaying());
        }
        C0N0Y c0n0y = getMPlayVideoHelper().LJI;
        boolean z = false;
        if (c0n0y != null && c0n0y.isPlaying() && ((i = getMPlayVideoHelper().LJFF) == 2 || i == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    public final int getActionState() {
        return this.LLJLLL;
    }

    public final long getCurrentPosition() {
        return this.LLLIIIL;
    }

    public final boolean getEnableProgressCallback() {
        return this.LLJZIJLIL;
    }

    public final boolean getFillHeight() {
        return this.LLLF;
    }

    public final int getFitType() {
        return this.LLLFF;
    }

    public final String getGecVodSceneTag() {
        return this.LLLILZ;
    }

    public final InterfaceC648270Pbl getMPlayerViewListener() {
        return this.LLJ;
    }

    public final InterfaceC661680PxO getMVideoMobListener() {
        return this.LLIZLLLIL;
    }

    public final OnUIPlayListener getMVideoViewListener() {
        return this.LLIZ;
    }

    public final boolean getMute() {
        return this.LLLFZ;
    }

    public final String getPlayTag() {
        return this.LLLILZJ;
    }

    public final boolean getRepeat() {
        return this.LLLFFI;
    }

    public final int getSampleInterval() {
        return this.LLL;
    }

    public final String getSourceId() {
        return this.LLJJJJLIIL;
    }

    private final void setMIsAttached(boolean z) {
        getDataProvider().LIZIZ = z;
    }

    private final void setMPlayVideoObserver(InterfaceC652950PjJ interfaceC652950PjJ) {
        getDataProvider().LJI = interfaceC652950PjJ;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Pxg] */
    public final void LJIJI(LifecycleOwner lifecycleOwner) {
        C19EG c19egLIZIZ;
        if (!((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LJ() || (c19egLIZIZ = C1388190mED.LIZIZ(getContext())) == null) {
            return;
        }
        if (lifecycleOwner == null) {
            SAFHelper.LIZ.getClass();
            lifecycleOwner = SAFHelper.LJJ(this, c19egLIZIZ);
            if (lifecycleOwner == null) {
                return;
            }
        }
        AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(lifecycleOwner, (C661860Pxg) new InterfaceC2217831BrB() { // from class: X.0Pxg
            @Override // X.InterfaceC2217831BrB
            public final String getScenario() {
                return "search_video_card";
            }

            @Override // X.InterfaceC2217831BrB
            public final void LIZ() {
                if (this.LIZ.LLJJLIIIJLLLLLLLZ) {
                    C722880SXe.LIZLLL("search_video_card");
                    this.LIZ.LLLLLIL();
                    C722880SXe.LIZJ(Boolean.valueOf(this.LIZ.isPlaying()), "search_video_card");
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "general_search");
                    Aweme mAweme = this.LIZ.getMAweme();
                    c2344009Gk.LJIIIIZZ("group_id", mAweme != null ? mAweme.getAid() : null);
                    Aweme mAweme2 = this.LIZ.getMAweme();
                    c2344009Gk.LJIIIIZZ("author_id", mAweme2 != null ? AwemeExtKt.getAuthorUid(mAweme2) : null);
                    C20684815ws.LJIILLIIL("earphone_play_continue", c2344009Gk.LIZ);
                    this.LIZ.setPausedByDisconnection(false);
                }
            }
        }, 25);
        if (C649470Pdh.LJIILIIL("search-video")) {
            C421540Gfw.LIZ(new AwS554S0100000_10(awS411S0200000_10, 957));
        } else {
            awS411S0200000_10.invoke();
        }
    }

    public final void LJJ(Aweme aweme) {
        String str;
        C664340Q4a c664340Q4a;
        this.LLJI = true;
        this.LLJIJIL = true;
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if ((interfaceC661680PxO instanceof C664340Q4a) && (c664340Q4a = (C664340Q4a) interfaceC661680PxO) != null) {
            c664340Q4a.LLJILLL.put(Long.valueOf(System.currentTimeMillis()), "reset");
        }
        this.LLJJJJLIIL = null;
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        getMPlayVideoHelper().LJIIIZ(aweme);
        if (getEnableFirstVideoDowngradeResolution()) {
            C586970N0l mPlayVideoHelper = getMPlayVideoHelper();
            mPlayVideoHelper.getClass();
            mPlayVideoHelper.LJIIJ = EnumC2281141EQm.Undefine;
        }
        if (this.LLJJIII) {
            this.LLJILJILJ = -1;
            this.LLJILJIL = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getAid());
            sbLIZ.append('_');
            sbLIZ.append(hashCode());
            this.LLJJ = C2188811AlT.LIZIZ(sbLIZ);
            this.LLJJI = false;
        }
        setMAweme(aweme);
        HashMap<String, Object> map = new HashMap<>();
        C653660PkS c653660PkS = getDataProvider().LJIL;
        if (c653660PkS == null || (str = c653660PkS.LJIIIIZZ) == null) {
            str = "";
        }
        map.put("enter_from", str);
        map.put("is_fullscreen", 0);
        map.put("play_order", Integer.valueOf(getDataProvider().LJJIFFI));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("bind aweme data, aid: ");
        sbLIZ2.append(aweme.getAid());
        sbLIZ2.append(", group id: ");
        sbLIZ2.append(aweme.getGroupId());
        sbLIZ2.append(", position: ");
        sbLIZ2.append(getDataProvider().LJJIFFI);
        C2188811AlT.LIZIZ(sbLIZ2);
        getMPlayVideoHelper().LJII = map;
        if (C07EA.LIZ()) {
            C586970N0l mPlayVideoHelper2 = getMPlayVideoHelper();
            String str2 = this.LLLILZ;
            if (str2 == null) {
                mPlayVideoHelper2.LJIIL = "";
            } else {
                mPlayVideoHelper2.LJIIL = str2;
            }
            C586970N0l mPlayVideoHelper3 = getMPlayVideoHelper();
            String str3 = this.LLLILZJ;
            mPlayVideoHelper3.getClass();
            if (str3 != null && !str3.isEmpty()) {
                mPlayVideoHelper3.LJIIJJI = str3;
            }
        }
        getPlayStateHelper().LIZ = 0;
        if (!this.LLJLILLLLZIIL && C07H8.LIZIZ()) {
            this.LLJLIL = null;
        }
    }

    public final void LJJIFFI(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        if (lifecycleOwner == null) {
            return;
        }
        Lifecycle lifecycle2 = lifecycleOwner.getLifecycle();
        if (lifecycle2 != null) {
            lifecycle2.addObserver(new SearchPlayerCore$initLifeCycleObserver$1(this));
        }
        if (this.LLJJIII && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new SearchPlayerCore$initLifeCycleObserver$2(this));
        }
    }

    public final boolean LJJIII(String str) {
        String aid;
        if (getMAweme() != null) {
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                aid = mAweme.getAid();
            } else {
                aid = null;
            }
            if (TextUtils.equals(str, aid)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJJIJIIJI(int i) {
        if (i > 0) {
            C0N0Y mPlayer = getMPlayer();
            if (mPlayer != null) {
                mPlayer.LJJIJIIJI(i);
                return;
            }
            return;
        }
        C0N0Y mPlayer2 = getMPlayer();
        if (mPlayer2 == null) {
            return;
        }
        mPlayer2.LJJIIZ();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        String aid;
        C0PBQ c0pbq;
        C0N0Y mPlayer;
        if (!LJJIII(str) || getPlayStateHelper().LIZ == 3) {
            return;
        }
        this.LLJLLL = 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<onPausePlay>, ");
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(", sourceId: ");
        sbLIZ.append(str);
        sbLIZ.append('.');
        C2188811AlT.LIZIZ(sbLIZ);
        getPlayStateHelper().LIZ = 3;
        if (this.LLJZIJLIL && (mPlayer = getMPlayer()) != null) {
            mPlayer.LJJIIZI();
        }
        setKeepScreenOn(false);
        InterfaceC652950PjJ mPlayVideoObserver = getMPlayVideoObserver();
        if (mPlayVideoObserver != null) {
            mPlayVideoObserver.LJLJJI();
        }
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPausePlay(str);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onPausePlay(str);
        }
        Aweme mAweme = getMAweme();
        if (mAweme != null && (aid = mAweme.getAid()) != null && (c0pbq = C0PBR.LIZ) != null && Intrinsics.LJFF(aid, c0pbq.LJFF)) {
            c0pbq.LJFF = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        C658950Psz c658950Psz;
        InterfaceC1010450cOx interfaceC1010450cOxNe;
        this.LLJLL.set(false);
        if (!LJJIII(str)) {
            return;
        }
        if (this.LLJJIII) {
            this.LLJILJILJ = 0;
            this.LLJILJIL = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<onPlayCompleted>, ");
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(", sourceId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onPlayCompleted(str);
        }
        InterfaceC660150Puv interfaceC660150Puv = this.LLLIL;
        if (interfaceC660150Puv != null && (interfaceC1010450cOxNe = interfaceC660150Puv.ne()) != null) {
            interfaceC1010450cOxNe.LJJLIIIJ();
        }
        if (!this.LLLFFI && (c658950Psz = getDataProvider().LJIIJ) != null) {
            c658950Psz.LLJJJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (!LJJIII(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<onPlayCompleteFirstTime>, ");
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(", sourceId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJJIII) {
            this.LLJILJILJ = 0;
            this.LLJILJIL = true;
            if (!this.LLJIJIL) {
                return;
            } else {
                this.LLJIJIL = false;
            }
        }
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        if (!LJJIII(str)) {
            return;
        }
        LJIL();
        this.LLJLL.set(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<onPlayPrepare>, ");
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(", sourceId: ");
        sbLIZ.append(str);
        sbLIZ.append('.');
        C2188811AlT.LIZIZ(sbLIZ);
        getPlayStateHelper().LIZ = 1;
        this.LLJJJJLIIL = str;
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPrepare(str);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(" onPlayRelease : sourceId=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJI = true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        if (!LJJIII(str)) {
            return;
        }
        this.LLJLLL = 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(" onPlayStop: sourceId=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onPlayStop(str);
        }
        this.LLJJI = true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        if (!LJJIII(str)) {
            return;
        }
        this.LLJLLL = 0;
        LJIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlaying, ");
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(", sourceId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlaying(str);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onPlaying(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r2, "search_separate_tab_lynx") != false) goto L17;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResumePlay(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.LJJIII(r4)
            if (r0 != 0) goto L7
            return
        L7:
            r3.LJIL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "<onResumePlay>, "
            r1.append(r0)
            java.lang.String r0 = r3.getPlayerInstanceInfo()
            r1.append(r0)
            java.lang.String r0 = ", sourceId: "
            r1.append(r0)
            r1.append(r4)
            r0 = 46
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            int r1 = r3.getWindowVisibility()
            r0 = 8
            if (r1 != r0) goto L5d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getMAweme()
            r2 = 0
            if (r0 == 0) goto L5b
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getSearchFeedType(r0)
        L3d:
            java.lang.String r0 = "search_horizontal_tab_lynx"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L57
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getMAweme()
            if (r0 == 0) goto L4f
            java.lang.String r2 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getSearchFeedType(r0)
        L4f:
            java.lang.String r0 = "search_separate_tab_lynx"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L5d
        L57:
            r3.LLJJJ()
            return
        L5b:
            r1 = r2
            goto L3d
        L5d:
            r0 = 0
            r3.LLJLLL = r0
            X.0N0g r1 = r3.getPlayStateHelper()
            r0 = 2
            r1.LIZ = r0
            boolean r0 = r3.LLJZIJLIL
            if (r0 == 0) goto L70
            int r0 = r3.LLL
            r3.LJJIJIIJI(r0)
        L70:
            r0 = 1
            r3.setKeepScreenOn(r0)
            r3.LLJJJJLIIL = r4
            com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener r0 = r3.LLIZ
            if (r0 == 0) goto L7d
            r0.onResumePlay(r4)
        L7d:
            X.0PxO r0 = r3.LLIZLLLIL
            if (r0 == 0) goto L84
            r0.onResumePlay(r4)
        L84:
            r3.LJJI()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getMAweme()
            if (r0 == 0) goto L96
            java.lang.String r0 = r0.getAid()
            if (r0 == 0) goto L96
            X.C0PBR.LIZIZ(r0)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661850Pxf.onResumePlay(java.lang.String):void");
    }

    public final void setActionState(int i) {
        this.LLJLLL = i;
    }

    public final void setContainerStatusProvider(InterfaceC641090PCp interfaceC641090PCp) {
        getDataProvider().LJII = interfaceC641090PCp;
    }

    public final void setCurrentPosition(long j) {
        this.LLLIIIL = j;
    }

    public final void setEnableProgressCallback(boolean z) {
        this.LLJZIJLIL = z;
    }

    public final void setFillHeight(boolean z) {
        this.LLLF = z;
    }

    public final void setFitType(int i) {
        if (i >= 0 && i <= 1) {
            this.LLLFF = i;
            LJJIJIL(this.LLLI, this.LLLII);
        }
    }

    public final void setGecVodSceneTag(String str) {
        this.LLLILZ = str;
    }

    public final void setISubInfoListener(InterfaceC1472010oPP interfaceC1472010oPP) {
        this.LLJLIL = interfaceC1472010oPP;
    }

    public final void setMAweme(Aweme aweme) {
        getDataProvider().LIZJ = aweme;
    }

    public final void setMPlayer(C0N0Y c0n0y) {
        getDataProvider().LJIILIIL = c0n0y;
    }

    public final void setMPlayerViewListener(InterfaceC648270Pbl interfaceC648270Pbl) {
        this.LLJ = interfaceC648270Pbl;
    }

    public final void setMVideoMobListener(InterfaceC661680PxO interfaceC661680PxO) {
        this.LLIZLLLIL = interfaceC661680PxO;
    }

    public final void setMVideoViewListener(OnUIPlayListener onUIPlayListener) {
        this.LLIZ = onUIPlayListener;
    }

    public final void setMute(boolean z) {
        this.LLLFZ = z;
        if (z) {
            getMPlayVideoHelper().LJFF();
            return;
        }
        C0N0Y c0n0y = getMPlayVideoHelper().LJI;
        if (c0n0y == null) {
            return;
        }
        c0n0y.LJIJJ();
    }

    public final void setNotResetSubInfoListener(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setPausedByDisconnection(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @Override // X.InterfaceC648350Pbt
    public void setPlayMetrics(C664400Q4g c664400Q4g) {
        C664400Q4g c664400Q4g2 = getDataProvider().LJJIJIL;
        if (c664400Q4g2 == null || c664400Q4g2.LJIIIIZZ()) {
            getDataProvider().LJJIJIL = c664400Q4g;
        }
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setPlayMetrics, old: ");
            sbLIZ.append(c664400Q4g2);
            sbLIZ.append(", new: ");
            sbLIZ.append(c664400Q4g);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void setPlayTag(String str) {
        this.LLLILZJ = str;
    }

    public final void setRepeat(boolean z) {
        this.LLLFFI = z;
    }

    public final void setSampleInterval(int i) {
        this.LLL = i;
    }

    public final void setSourceId(String str) {
        this.LLJJJJLIIL = str;
    }

    public final void setSubCallbackEnable(boolean z) {
        InterfaceC1483670oiD interfaceC1483670oiDLJIILL;
        C0N0Y mPlayer = getMPlayer();
        if (mPlayer != null && (interfaceC1483670oiDLJIILL = mPlayer.LJIILL()) != null) {
            interfaceC1483670oiDLJIILL.LJJIJLIJ(z);
        }
    }

    public final void setVideoLifeCycleListener(OnUIPlayListener onUIPlayListener) {
        if (onUIPlayListener != null) {
            getDataProvider().LJIILLIIL.add(onUIPlayListener);
        }
    }

    public final void setVideoUiListener(InterfaceC661680PxO interfaceC661680PxO) {
        getDataProvider().LJIILL = interfaceC661680PxO;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C661850Pxf(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661850Pxf.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void LJJIJIL(int i, int i2) {
        float f;
        if (i > 0 && i2 > 0) {
            this.LLLI = i;
            this.LLLII = i2;
            float f2 = 1.0f;
            if (this.LLLF) {
                int i3 = this.LLLFF;
                Aweme mAweme = getMAweme();
                if (mAweme != null && mAweme.getVideo() != null) {
                    int width = getMAweme().getVideo().getWidth();
                    int height = getMAweme().getVideo().getHeight();
                    if (width > 0 && height > 0) {
                        float f3 = height / width;
                        if (i3 == 0) {
                            if (f3 > 0.0f) {
                                float f4 = i2 / i;
                                if (f4 > f3) {
                                    float f5 = f4 / f3;
                                    f = 1.0f;
                                    f2 = f5;
                                } else {
                                    f = f3 / f4;
                                }
                                Matrix matrix = new Matrix();
                                matrix.setScale(f2, f, i / 2, i2 / 2);
                                setTransform(matrix);
                                return;
                            }
                            return;
                        }
                        float f6 = i2 / i;
                        float f7 = f3 / f6;
                        if (f6 <= f3) {
                            f2 = f7;
                            f7 = 1.0f;
                        }
                        Matrix matrix2 = new Matrix();
                        matrix2.setScale(f2, f7, i / 2, i2 / 2);
                        setTransform(matrix2);
                        return;
                    }
                    return;
                }
                return;
            }
            Aweme mAweme2 = getMAweme();
            if (mAweme2 == null || mAweme2.getVideo() == null) {
                return;
            }
            int width2 = getMAweme().getVideo().getWidth();
            int height2 = getMAweme().getVideo().getHeight();
            if (width2 <= 0 || height2 <= 0) {
                return;
            }
            Matrix matrix3 = new Matrix();
            matrix3.setScale(1.0f, (height2 / width2) / (i2 / i), i / 2, i2 / 2);
            setTransform(matrix3);
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        if (!this.LLJLL.get() || !LJJIII(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<onBuffering>, ");
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(", sourceId: ");
        sbLIZ.append(str);
        sbLIZ.append("; start:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(str, z);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        if (!LJJIII(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(" onCompleteLoaded: sourceId=");
        sbLIZ.append(str);
        sbLIZ.append("; isDash=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onCompleteLoaded(str, z);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onCompleteLoaded(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCrosstalkHappened(String str, List<? extends Map<String, ? extends Object>> list) {
        C664340Q4a c664340Q4a;
        if (str != null && LJJIII(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<onCrosstalk>, ");
            sbLIZ.append(getPlayerInstanceInfo());
            sbLIZ.append(", sourceId:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
            if ((interfaceC661680PxO instanceof C664340Q4a) && (c664340Q4a = (C664340Q4a) interfaceC661680PxO) != null) {
                c664340Q4a.LJIILJJIL(str, list);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        if (!LJJIII(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<onDecoderBuffering>, ");
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(", sourceId=");
        sbLIZ.append(str);
        sbLIZ.append("; start=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(str, z);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onDecoderBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onLoopPlay(String str, int i) {
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onLoopPlay(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        if (!LJJIII(str)) {
            return;
        }
        this.LLJLLL = 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<onPlayFailed>, ");
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(", sourceId: ");
        sbLIZ.append(str);
        sbLIZ.append("; error=");
        sbLIZ.append(c1481290oeN);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJI = false;
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(str, c1481290oeN);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onPlayFailed(str, c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        if (!LJJIII(str)) {
            return;
        }
        this.LLJJI = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(" onPlayStop 2: sourceId=");
        sbLIZ.append(str);
        sbLIZ.append(", isUsedSr: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, "search_separate_tab_lynx") != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[PHI: r0
      0x00a8: PHI (r0v28 java.lang.String) = (r0v27 java.lang.String), (r0v34 java.lang.String) binds: [B:24:0x0083, B:29:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRenderFirstFrame(java.lang.String r5, X.C1480420ocy r6) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661850Pxf.onRenderFirstFrame(java.lang.String, X.0ocy):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        if (!LJJIII(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<onRetryOnError>, ");
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(", sourceId=");
        sbLIZ.append(str);
        sbLIZ.append(", error=");
        sbLIZ.append(c1481290oeN);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(str, c1481290oeN);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onRetryOnError(str, c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        if (!LJJIII(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(" onSeekEnd: sourceId=");
        sbLIZ.append(str);
        sbLIZ.append("; success=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        if (!LJJIII(str)) {
            return;
        }
        if (i < 10 || i > 90) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<onBufferedPercent>, ");
            sbLIZ.append(getPlayerInstanceInfo());
            sbLIZ.append(", sourceId: ");
            sbLIZ.append(str);
            sbLIZ.append(", percent: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedPercent(str, j, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        int i;
        if (!LJJIII(str) || j2 <= 0) {
            return;
        }
        if (LLLILZLLLI && (i = (int) ((j * 100.0d) / j2)) != this.LLJLLIL && i % 5 == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<onProgressChange>, ");
            sbLIZ.append(getPlayerInstanceInfo());
            sbLIZ.append(", sourceId:");
            sbLIZ.append(str);
            sbLIZ.append(", pos:");
            sbLIZ.append(j);
            sbLIZ.append(", dur:");
            sbLIZ.append(j2);
            sbLIZ.append('.');
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLJLLIL = i;
        }
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(str, j, j2);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        if (!LJJIII(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(" onSeekStart: sourceId=");
        sbLIZ.append(str);
        sbLIZ.append("; offset=");
        sbLIZ.append(i);
        sbLIZ.append("; progress=");
        sbLIZ.append(f);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekStart(str, i, f);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onSeekStart(str, i, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        if (!LJJIII(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getPlayerInstanceInfo());
        sbLIZ.append(" onVideoSizeChanged: sourceId=");
        sbLIZ.append(str);
        sbLIZ.append("; width=");
        sbLIZ.append(i);
        sbLIZ.append("; height=");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        OnUIPlayListener onUIPlayListener = this.LLIZ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoSizeChanged(str, i, i2);
        }
        InterfaceC661680PxO interfaceC661680PxO = this.LLIZLLLIL;
        if (interfaceC661680PxO != null) {
            interfaceC661680PxO.onVideoSizeChanged(str, i, i2);
        }
    }
}
