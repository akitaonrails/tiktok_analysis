package X;

import Y.ARunnableS126S0100000_26;
import Y.ARunnableS132S0100000_32;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImgPreloadKeepOptData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS38S2200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775590wJ3 extends C1AEE implements InterfaceC2272941Dxs, InterfaceC2272961Dxu, DefaultLifecycleObserver, GenericLifecycleObserver {
    public static boolean LLLIL = true;
    public static final boolean LLLILZ;
    public final ViewGroup LLJIJIL;
    public final LifecycleOwner LLJILJIL;
    public final RemoteImageView LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public volatile boolean LLJJJ;
    public volatile boolean LLJJJIL;
    public volatile long LLJJJJ;
    public volatile boolean LLJJJJJIL;
    public volatile boolean LLJJJJLIIL;
    public final C1775610wJ5 LLJJL;
    public final C21341518fV LLJJLIIIJLLLLLLLZ;
    public volatile boolean LLJL;
    public volatile boolean LLJLIL;
    public volatile boolean LLJLILLLLZIIL;
    public volatile boolean LLJLL;
    public Long LLJLLIL;
    public final C01GW LLJLLL;
    public volatile boolean LLJZ;
    public volatile C1851070yGn LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public String LLLFF;
    public String LLLFFI;
    public final Long LLLFZ;
    public Long LLLI;
    public Long LLLII;
    public C1775420wIm LLLIIII;
    public String LLLIIIIL;
    public String LLLIIIL;
    public String LLLIIL;
    public String LLLIILIL;

    static {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            LLLILZ = Keva.getRepo("ecom_keva_store").getBoolean("_debug_mix_mall_live_video_debug_view", false);
        }
    }

    public final void LJIJI() {
        InterfaceC497601wk lifecycleScope;
        if (!this.LLJL) {
            LJIJJ("not allowPlay");
            this.LLJZ = false;
            return;
        }
        String str = this.LLJILLL;
        if (str == null || a0.LJJJIL(str) || this.LLJJI == null) {
            this.LLJZ = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1775610wJ5 c1775610wJ5 = this.LLJJL;
        if (c1775610wJ5 != null) {
            this.LLILLJJLI = c1775610wJ5;
            C1120704Zx.LIZ.getClass();
            C1120704Zx.LIZJ = c1775610wJ5;
        }
        String str2 = this.LLJJI;
        this.LLJZIJLIL = null;
        if (str2 == null) {
            str2 = "unknown";
        }
        this.LLJZIJLIL = new C1851070yGn(str2, "mix");
        C1851070yGn c1851070yGn = this.LLJZIJLIL;
        if (c1851070yGn != null) {
            c1851070yGn.LJII = EnumC1782850wUl.TRIGGERED;
            c1851070yGn.LIZJ = SystemClock.elapsedRealtime();
        }
        InterfaceC2175541ACi interfaceC2175541ACi = this.LLILLJJLI;
        if (interfaceC2175541ACi != null) {
            C1120704Zx.LIZ.getClass();
            C1120704Zx.LIZJ = interfaceC2175541ACi;
        }
        setAttachCallback(this.LLJJLIIIJLLLLLLLZ);
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(getContext());
        LifecycleOwner lifecycleOwnerLIZ = C20161913uj.LIZ(this);
        if ((lifecycleOwnerLIZ == null && (!(componentCallbacks2LIZ instanceof LifecycleOwner) || (lifecycleOwnerLIZ = (LifecycleOwner) componentCallbacks2LIZ) == null)) || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) == null) {
            lifecycleScope = C817503Hh.LL;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C1735830vGv(str, this, jElapsedRealtime, null), 2);
    }

    @Override // X.InterfaceC2272941Dxs
    public final String LLLLLLL() {
        return "live";
    }

    @Override // X.InterfaceC2272941Dxs
    public C1775590wJ3 getItemView() {
        return this;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final void setOptimizeType(String str) {
    }

    private final IAccountDependencyService getUserService() {
        return (IAccountDependencyService) this.LLJLLL.getValue();
    }

    public final void LJIILJJIL() {
        RemoteImageView remoteImageView = this.LLJILJILJ;
        if (remoteImageView == null || Intrinsics.LJFF(remoteImageView.getTag(), this.LLJJ)) {
            return;
        }
        remoteImageView.LIZ();
        String str = this.LLJJ;
        if (str == null) {
            str = "";
        }
        EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.SHOP_MALL_LIVE_CARD;
        C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
        String value = enumC1769850w9n.getValue();
        EcomImgPreloadKeepOptData ecomImgPreloadKeepOptData = C314740CVk.LIZ;
        Size size = ecomImgPreloadKeepOptData.enableLynxForceResize ? (Size) C20160313uT.LIZIZ().get(value) : null;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("size=");
        sbLIZ.append(size);
        sbLIZ.append(",enableLynxForceResize=");
        sbLIZ.append(ecomImgPreloadKeepOptData.enableLynxForceResize);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("yejingjiesize", strLIZIZ);
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        if (size != null) {
            int width = size.getWidth();
            int height = size.getHeight();
            c1331670kl3LIZLLL.LJIIIIZZ = width;
            c1331670kl3LIZLLL.LJIIIZ = height;
        }
        c1331670kl3LIZLLL.LJJI(remoteImageView);
        C786410Ut5.h3(c1331670kl3LIZLLL);
        remoteImageView.setTag(this.LLJJ);
    }

    public final void LJIIZILJ() {
        RemoteImageView remoteImageView = this.LLJILJILJ;
        if (remoteImageView == null) {
            return;
        }
        if (!C1AEJ.LIZ()) {
            if (!C1771440wCM.LIZ() || indexOfChild(remoteImageView) == 0) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) remoteImageView.getParent();
            if (viewGroup != null) {
                C786410Ut5.LJJJLZIJ(remoteImageView, viewGroup);
            }
            addView(remoteImageView, 0);
            return;
        }
        String str = this.LLJJ;
        if (str == null || str.length() == 0) {
            return;
        }
        LJIILJJIL();
        C786410Ut5.l(remoteImageView, 0);
        remoteImageView.bringToFront();
        HandlerHook.viewPost(this, new ARunnableS126S0100000_26(remoteImageView, 43));
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLIL() {
        AbstractC1775370wIh abstractC1775370wIh;
        C1775180wIO c1775180wIOLJII;
        LJIJJ("try playMedia");
        this.LLJL = true;
        this.LLJLLIL = Long.valueOf(System.currentTimeMillis());
        if (!C0BAH.LIZ()) {
            LJIILLIIL(null);
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play!!! currItem=");
            sbLIZ.append(hashCode());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("MMKLive", strLIZIZ);
        }
        if (this.LLJZ) {
            return;
        }
        this.LLJZ = true;
        if (C0BAH.LIZ()) {
            LJIILLIIL(null);
            C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("new play!!! currItem=");
            sbLIZ2.append(hashCode());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c599820Nfo2.getClass();
            C599820Nfo.LIZ("MMKLive", strLIZIZ2);
        }
        C1775420wIm c1775420wIm = this.LLLIIII;
        if (c1775420wIm != null && (abstractC1775370wIh = c1775420wIm.LIZ) != null && (c1775180wIOLJII = abstractC1775370wIh.LJII()) != null) {
            abstractC1775370wIh.LJI = System.currentTimeMillis();
            c1775180wIOLJII.LJIILJJIL++;
            c1775180wIOLJII.LJIJ = 0L;
            c1775180wIOLJII.LJIJI = 0;
            c1775180wIOLJII.LJIJJ = abstractC1775370wIh.LJI().LLLL();
        }
        C1775420wIm c1775420wIm2 = this.LLLIIII;
        if (c1775420wIm2 != null) {
            c1775420wIm2.LIZIZ("play");
        }
        C1775420wIm c1775420wIm3 = this.LLLIIII;
        if (c1775420wIm3 != null) {
            c1775420wIm3.LJ(null, "card_emit_play", null);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final String LLLLLJLJLL() {
        String str = this.LLJJIII;
        if (str != null) {
            return str;
        }
        String str2 = this.LLJJI;
        if (str2 != null) {
            return str2;
        }
        String str3 = this.LLJILLL;
        return str3 == null ? "" : str3;
    }

    @Override // X.InterfaceC2272941Dxs
    public C1768420w7U getConfig() {
        C1775420wIm c1775420wIm = this.LLLIIII;
        if (c1775420wIm != null) {
            return c1775420wIm.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC2272941Dxs
    public InterfaceC1775450wIp<?> getContainerCallback() {
        AbstractC1775370wIh abstractC1775370wIh;
        C1775420wIm c1775420wIm = this.LLLIIII;
        if (c1775420wIm == null || (abstractC1775370wIh = c1775420wIm.LIZ) == null) {
            return null;
        }
        return abstractC1775370wIh.LIZLLL;
    }

    @Override // X.InterfaceC2272941Dxs
    public String getMediaSrc() {
        String str = this.LLJILLL;
        return str == null ? "" : str;
    }

    public final void LJIIJJI() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest() && LLLILZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger:");
            sbLIZ.append(this.LLLIIL);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("status:");
            sbLIZ2.append(this.LLLIIIL);
            C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("msg:");
            sbLIZ3.append(this.LLLIIIIL);
            C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("ratio:");
            sbLIZ4.append(this.LLLIILIL);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1775460wIq getPlayService() {
        /*
            r4 = this;
            X.0w7U r3 = r4.getConfig()
            r2 = 1
            if (r3 == 0) goto L15
            int r0 = r3.LIZ
            if (r0 == r2) goto L15
            r1 = 1
        Lc:
            r0 = 0
            if (r1 == 0) goto L17
            X.0Nfo r1 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r1)
            return r0
        L15:
            r1 = 0
            goto Lc
        L17:
            if (r3 == 0) goto L54
            int r1 = r3.LIZLLL
            if (r1 != r2) goto L2c
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService r1 = r4.getUserService()
            if (r1 == 0) goto L2a
            boolean r1 = r1.isLogin()
            if (r1 != 0) goto L2a
            return r0
        L2a:
            if (r3 == 0) goto L54
        L2c:
            boolean r1 = r3.LIZIZ()
            if (r1 != 0) goto L38
            X.0Nfo r1 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r1)
            return r0
        L38:
            android.content.Context r1 = r4.getContext()
            boolean r1 = r3.LIZLLL(r1)
            if (r1 != 0) goto L48
            X.0Nfo r1 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r1)
            return r0
        L48:
            boolean r1 = r3.LIZJ()
            if (r1 != 0) goto L54
            X.0Nfo r1 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r1)
            return r0
        L54:
            X.0wIm r1 = r4.LLLIIII
            if (r1 == 0) goto L5e
            X.0wIh r1 = r1.LIZ
            if (r1 == 0) goto L5e
            X.0wDv r0 = r1.LIZJ
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1775590wJ3.getPlayService():X.0wIq");
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLL() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLLLL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLLLLL() {
        return this.LLJJJ;
    }

    public final ViewGroup getContainerView() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC2272941Dxs
    public /* bridge */ /* synthetic */ View getItemView() {
        getItemView();
        return this;
    }

    public final void LJIIL(String str) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            this.LLLIIIL = str;
            LJIIJJI();
        }
    }

    public final void LJIILIIL(boolean z) {
        if (C1771440wCM.LIZ() && !C1AEJ.LIZ()) {
            LJIILJJIL();
            return;
        }
        if (z) {
            RemoteImageView remoteImageView = this.LLJILJILJ;
            if (remoteImageView != null) {
                C786410Ut5.l(remoteImageView, 8);
                return;
            }
            return;
        }
        RemoteImageView remoteImageView2 = this.LLJILJILJ;
        if (remoteImageView2 != null) {
            LJIILJJIL();
            String str = this.LLJJ;
            if (str != null && str.length() != 0 && !this.LLJJJ) {
                C786410Ut5.l(remoteImageView2, 0);
            } else {
                C786410Ut5.l(remoteImageView2, 8);
            }
        }
    }

    public final void LJIILL(EnumC2176021AEe enumC2176021AEe) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try pauseInternal ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        LJIJJ(C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL(enumC2176021AEe);
        this.LLJJJ = false;
        LJIILIIL(false);
        if (this.LLJJJJ > 0 && this.LLJJJIL) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LLJJJJ);
            EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.LIVE_CARD_PAUSE;
            LJIJ(CardStruct.IStatusCode.DEFAULT, strValueOf, C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
        }
        C418601k0.LIZ(new AwS576S0100000_32(this, 162));
        C1851070yGn c1851070yGn = this.LLJZIJLIL;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(c1851070yGn.LJII, "pause", null, null);
        }
        this.LLLII = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    public final void LJIILLIIL(ReadableMap readableMap) {
        LJIJJ("try play with params");
        LJIJI();
        LJIILIIL(false);
        this.LLJJJJLIIL = false;
        C418601k0.LIZ(new AwS576S0100000_32(this, 163));
    }

    public final void LJIJJ(String str) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            this.LLLIIL = str;
            LJIIJJI();
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLF(String str) {
        return LIZIZ();
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLJIL(float f) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(f);
            sbLIZ.append(" at ");
            sbLIZ.append(SystemClock.elapsedRealtime());
            this.LLLIILIL = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLLIL(boolean z) {
        LJJII(EnumC2176021AEe.PLAY_SELECTION, z);
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLJ(boolean z) {
        AbstractC1775370wIh abstractC1775370wIh;
        C1775180wIO c1775180wIOLJII;
        boolean z2 = true;
        if (!this.LLJLL && z) {
            C1775420wIm c1775420wIm = this.LLLIIII;
            if (c1775420wIm != null && (abstractC1775370wIh = c1775420wIm.LIZ) != null && (c1775180wIOLJII = abstractC1775370wIh.LJII()) != null && Intrinsics.LJFF("card_exposure", "card_exposure")) {
                c1775180wIOLJII.LJIILL++;
            }
            C1775420wIm c1775420wIm2 = this.LLLIIII;
            if (c1775420wIm2 != null) {
                c1775420wIm2.LJ(null, "card_exposure", null);
            }
        }
        if (this.LLJLL == z) {
            z2 = false;
        }
        this.LLJLL = z;
        return z2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        IECommerceHostService iECommerceHostService;
        EnumC1782940wUu enumC1782940wUu;
        boolean z;
        String name;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2 = this.LLJILJIL;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        LJIJJ(C2188811AlT.LIZIZ(sbLIZ));
        C1775610wJ5 c1775610wJ5 = this.LLJJL;
        if (c1775610wJ5 != null) {
            LJFF(c1775610wJ5);
        }
        LJI();
        C418601k0.LIZ(new AwS576S0100000_32(this, 161));
        if (this.LLJJJJ > 0 && this.LLJJJIL) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && rootPageMonitor.LJFF()) {
                enumC1782940wUu = EnumC1782940wUu.LIVE_CARD_DESTROY;
            } else {
                enumC1782940wUu = EnumC1782940wUu.LIVE_CARD_DETACH;
            }
            LJIJ(CardStruct.IStatusCode.DEFAULT, String.valueOf(SystemClock.elapsedRealtime() - this.LLJJJJ), C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
        }
        C1851070yGn c1851070yGn = this.LLJZIJLIL;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(c1851070yGn.LJII, "destroy", null, null);
        }
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LLJL = false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        if (!C1AEJ.LIZIZ().LIZJ) {
            C356901a3.LIZJ(this, lifecycleOwner);
            return;
        }
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLJLIL = this.LLJL;
        LJJII(EnumC2176021AEe.APP_BACKGROUND, true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        if (!C1AEJ.LIZIZ().LIZJ) {
            C356901a3.LIZLLL(this, lifecycleOwner);
            return;
        }
        C356901a3.LIZLLL(this, lifecycleOwner);
        if (this.LLJLIL && C770702zh.LIZIZ(this.LLJILLL) && this.LLJJI != null) {
            this.LLJL = true;
            LJIJI();
        }
        this.LLJLIL = false;
    }

    public final void setActionType(String str) {
        this.LLLFFI = str;
    }

    public final void setAutoPlay(Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue != this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = zBooleanValue;
            this.LLJJJJJIL = true;
            this.LLJJJJLIIL = false;
        }
    }

    public final void setEnterFromMerge(String str) {
        this.LLLF = str;
    }

    public final void setEnterMethod(String str) {
        this.LLLFF = str;
    }

    public final void setMute(Boolean bool) {
        boolean zBooleanValue = false;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            setMute(true);
        } else {
            setMute(false);
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LLJJIJIL = zBooleanValue;
    }

    public final void setObjectfit(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            if (Intrinsics.LJFF(str, "cover")) {
                InterfaceC464060IHs textureView = getTextureView();
                if (textureView != null) {
                    textureView.setScaleType(2);
                }
                RemoteImageView remoteImageView = this.LLJILJILJ;
                if (remoteImageView != null) {
                    remoteImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                LJIILIIL(false);
                return;
            }
            if (!Intrinsics.LJFF(str, "contain")) {
                return;
            }
            InterfaceC464060IHs textureView2 = getTextureView();
            if (textureView2 != null) {
                textureView2.setScaleType(1);
            }
            RemoteImageView remoteImageView2 = this.LLJILJILJ;
            if (remoteImageView2 != null) {
                remoteImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            LJIILIIL(false);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public void setPlayEnd(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setPoster(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            this.LLJJ = str;
        }
    }

    public final void setQualities(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            this.LLJJIJI = str;
        }
    }

    public final void setRoomId(String str) {
        this.LLJJI = str;
    }

    public final void setStreamURL(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            if (C770702zh.LIZIZ(this.LLJILLL) && !TextUtils.equals(this.LLJILLL, str)) {
                this.LLJLILLLLZIIL = false;
                this.LLJLL = false;
                this.LLJLLIL = null;
                this.LLJZ = false;
                if (this.LLJJJ) {
                    LJIILL(EnumC2176021AEe.TYPE_SWITCH);
                }
            }
            this.LLJILLL = str;
        }
    }

    public final void setUuId(String str) {
        this.LLJJIII = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0wJ5] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.18fV, X.1AEV] */
    public C1775590wJ3(Context context, ViewGroup viewGroup) {
        Lifecycle lifecycle;
        IECommerceHostService iECommerceHostService;
        C928103jz c928103jzLJ;
        boolean z;
        String name;
        super(context, null, 6);
        LifecycleOwner lifecycleOwner = null;
        this.LLJIJIL = viewGroup;
        this.LLJJJJ = -1L;
        this.LLJLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(230));
        this.LLL = "";
        Object objLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        if (objLJIIIIZZ != null) {
            Fragment fragment = (Fragment) objLJIIIIZZ;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && (c928103jzLJ = rootPageMonitor.LJ(fragment)) != null) {
                lifecycleOwner = c928103jzLJ.LIZJ;
            }
        }
        this.LLJILJIL = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        ?? r4 = new C1AEV() { // from class: X.18fV
            /* JADX WARN: Type inference failed for: r1v0, types: [X.18fU] */
            @Override // X.C1AEV
            public final void onAttachedToWindow() {
                C1775590wJ3 c1775590wJ3 = this.LIZ;
                C1775420wIm c1775420wIm = c1775590wJ3.LLLIIII;
                if (c1775420wIm != null) {
                    AbstractC1775370wIh abstractC1775370wIh = c1775420wIm.LIZ;
                    if (abstractC1775370wIh != null) {
                        abstractC1775370wIh.LJFF = true;
                    }
                } else {
                    ViewGroup containerView = c1775590wJ3.getContainerView();
                    if (containerView == null) {
                        containerView = this.LIZ;
                    }
                    final C1775590wJ3 c1775590wJ32 = this.LIZ;
                    c1775590wJ3.LLLIIII = new C1775420wIm(containerView, new InterfaceC1775440wIo() { // from class: X.18fU
                        @Override // X.InterfaceC1775440wIo
                        public final String LIZ() {
                            return c1775590wJ32.LLLF;
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final String LIZIZ() {
                            return c1775590wJ32.getMediaSrc();
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final String LJIIJ() {
                            return c1775590wJ32.LLLFFI;
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final String LLIIJI() {
                            String str = c1775590wJ32.LLLFF;
                            return str == null ? "" : str;
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final String LLLL() {
                            if (c1775590wJ32.LLJJJ) {
                                return EnumC1775410wIl.PLAYING.getStatus();
                            }
                            boolean z2 = C1775590wJ3.LLLIL;
                            return C1775590wJ3.LLLIL ? EnumC1775410wIl.INIT.getStatus() : EnumC1775410wIl.STOP.getStatus();
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final Long M2() {
                            return c1775590wJ32.LLLII;
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final Long N2() {
                            return c1775590wJ32.LLJLLIL;
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final Long O2() {
                            return c1775590wJ32.LLLFZ;
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final Long P2() {
                            return c1775590wJ32.LLLI;
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final String Q2() {
                            return c1775590wJ32.LLL;
                        }

                        @Override // X.InterfaceC1775440wIo
                        public final void L2(String str) {
                            c1775590wJ32.LLL = str;
                        }
                    });
                }
                if (this.LIZ.getHeight() == 0) {
                    C1775590wJ3 c1775590wJ33 = this.LIZ;
                    HandlerHook.viewPost(c1775590wJ33, new ARunnableS132S0100000_32(c1775590wJ33, 31));
                    return;
                }
                C1775590wJ3 c1775590wJ34 = this.LIZ;
                InterfaceC1775460wIq playService = c1775590wJ34.getPlayService();
                if (playService != null) {
                    playService.LJI(c1775590wJ34);
                }
            }

            @Override // X.C1AEV
            public final void onDetachedFromWindow() {
                this.LIZ.LJJII(EnumC2176021AEe.VIEW_DETACH, true);
                C1775590wJ3 c1775590wJ3 = this.LIZ;
                InterfaceC1775460wIq playService = c1775590wJ3.getPlayService();
                if (playService != null) {
                    playService.LIZIZ(c1775590wJ3);
                }
                C1775590wJ3 c1775590wJ32 = this.LIZ;
                C1775610wJ5 c1775610wJ5 = c1775590wJ32.LLJJL;
                if (c1775610wJ5 != null) {
                    c1775590wJ32.LJFF(c1775610wJ5);
                }
            }
        };
        this.LLJJLIIIJLLLLLLLZ = r4;
        this.LLJJL = new InterfaceC2175541ACi() { // from class: X.0wJ5
            @Override // X.InterfaceC2175541ACi
            public final Integer Dk() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean LLILLIZIL() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Md() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean U1() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean We() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Y7() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final void o() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oc(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void sk(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void T5() {
                if (this.LL.LLJJJIL) {
                    this.LL.LLJJJ = true;
                }
                this.LL.LLJZ = false;
                C1775590wJ3.LLLIL = false;
                if (C1AEJ.LIZ()) {
                    this.LL.LJIILIIL(true);
                }
                if (C1775590wJ3.LLLILZ) {
                    C1775590wJ3 c1775590wJ3 = this.LL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("playing ");
                    sbLIZ.append(SystemClock.elapsedRealtime());
                    c1775590wJ3.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                }
                C1775420wIm c1775420wIm = this.LL.LLLIIII;
                if (c1775420wIm != null) {
                    c1775420wIm.LIZLLL(null);
                }
                C1775420wIm c1775420wIm2 = this.LL.LLLIIII;
                if (c1775420wIm2 != null) {
                    c1775420wIm2.LJ(null, "card_play_success", null);
                }
                C1851070yGn c1851070yGn = this.LL.LLJZIJLIL;
                if (c1851070yGn != null) {
                    c1851070yGn.LIZIZ(EnumC1782850wUl.FIRST_FRAME, "first_frame", null, null);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void v() {
                if (C1AEJ.LIZ()) {
                    this.LL.LJIILIIL(true);
                }
                if (C1775590wJ3.LLLILZ) {
                    this.LL.LJIIL("firstFrame");
                }
                if (this.LL.LLJJJJ > 0 && this.LL.LLJJJIL) {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime() - this.LL.LLJJJJ;
                    this.LL.LLJJJJ = -1L;
                    C1775590wJ3 c1775590wJ3 = this.LL;
                    String strValueOf = String.valueOf(jElapsedRealtime3);
                    EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.SUCCESS;
                    c1775590wJ3.LJIJ("1", strValueOf, C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
                }
                C1851070yGn c1851070yGn = this.LL.LLJZIJLIL;
                if (c1851070yGn != null) {
                    c1851070yGn.LJII = EnumC1782850wUl.PLAYING;
                    c1851070yGn.LJ = SystemClock.elapsedRealtime();
                }
            }

            @Override // X.InterfaceC2175541ACi
            /* JADX INFO: renamed from: if */
            public final void mo29if(String str) {
                AbstractC1775370wIh abstractC1775370wIh;
                C1775180wIO c1775180wIOLJII;
                if (C1775590wJ3.LLLILZ) {
                    this.LL.LJIIL("playComplete");
                    this.LL.LJIJJ("triggerPlay for playComplete");
                }
                this.LL.LLJJJ = false;
                this.LL.LLJLILLLLZIIL = true;
                C1775420wIm c1775420wIm = this.LL.LLLIIII;
                if (c1775420wIm != null && (abstractC1775370wIh = c1775420wIm.LIZ) != null && (c1775180wIOLJII = abstractC1775370wIh.LJII()) != null) {
                    c1775180wIOLJII.LJIIZILJ++;
                    c1775180wIOLJII.LJIJ = System.currentTimeMillis() - abstractC1775370wIh.LJI;
                    c1775180wIOLJII.LJIJI = 100;
                    c1775180wIOLJII.LJIJJ = abstractC1775370wIh.LJI().LLLL();
                }
                C1775420wIm c1775420wIm2 = this.LL.LLLIIII;
                if (c1775420wIm2 != null) {
                    c1775420wIm2.LIZIZ("play_over");
                }
                this.LL.LJIILIIL(false);
                InterfaceC1775460wIq playService = this.LL.getPlayService();
                if (playService != null) {
                    playService.LJIIJJI(false, false);
                }
                C1775420wIm c1775420wIm3 = this.LL.LLLIIII;
                if (c1775420wIm3 != null) {
                    c1775420wIm3.LIZLLL(null);
                }
                C1851070yGn c1851070yGn = this.LL.LLJZIJLIL;
                if (c1851070yGn != null) {
                    c1851070yGn.LIZIZ(c1851070yGn.LJII, "complete", null, null);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void oe(String str) {
                C1851070yGn c1851070yGn = this.LL.LLJZIJLIL;
                if (c1851070yGn != null) {
                    c1851070yGn.LJII = EnumC1782850wUl.PREPARED;
                    c1851070yGn.LJFF = SystemClock.elapsedRealtime();
                }
                if (C1775590wJ3.LLLILZ) {
                    this.LL.LJIIL("playPrepared");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v6, types: [X.0wJ3] */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1, types: [int] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v5 */
            /* JADX WARN: Type inference failed for: r5v6 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC2175541ACi
            public final void w9(String str) {
                ?? LJIIJ;
                Integer num;
                Integer num2;
                String str2;
                int iLJIIJ = 2;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    iLJIIJ = C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(jSONObject.optInt("error_code"))), new Pair("msg", jSONObject.optString("error_description")));
                    LJIIJ = iLJIIJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Pair[] pairArr = new Pair[iLJIIJ];
                    EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.DATA_ERROR;
                    pairArr[0] = new Pair("code", Integer.valueOf(enumC1782940wUu.getCode()));
                    pairArr[1] = new Pair("msg", enumC1782940wUu.getMsg());
                    LJIIJ = C2097608Jq.LJIIJ(pairArr);
                }
                if (this.LL.LLJJJJ > 0 && this.LL.LLJJJIL) {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime() - this.LL.LLJJJJ;
                    this.LL.LLJJJJ = -1L;
                    this.LL.LJIJ(CardStruct.IStatusCode.DEFAULT, String.valueOf(jElapsedRealtime3), LJIIJ);
                }
                if (C1775590wJ3.LLLILZ) {
                    this.LL.LJIIL("playerMediaError " + str);
                }
                this.LL.LLJZ = false;
                this.LL.LLJJJ = false;
                this.LL.LJIILIIL(false);
                C1775420wIm c1775420wIm = this.LL.LLLIIII;
                String str3 = null;
                if (c1775420wIm != null) {
                    c1775420wIm.LIZLLL(null);
                }
                C1775420wIm c1775420wIm2 = this.LL.LLLIIII;
                if (c1775420wIm2 != null) {
                    Object objLIZ = C7726030a.LIZ("code", LJIIJ);
                    if (objLIZ instanceof Integer) {
                        num2 = (Integer) objLIZ;
                    } else {
                        num2 = null;
                    }
                    Object objLIZ2 = C7726030a.LIZ("msg", LJIIJ);
                    if (objLIZ2 instanceof String) {
                        str2 = (String) objLIZ2;
                    } else {
                        str2 = null;
                    }
                    c1775420wIm2.LJ(num2, "card_play_error", str2);
                }
                C1851070yGn c1851070yGn = this.LL.LLJZIJLIL;
                if (c1851070yGn != null) {
                    Object objLIZ3 = C7726030a.LIZ("code", LJIIJ);
                    if (objLIZ3 instanceof Integer) {
                        num = (Integer) objLIZ3;
                    } else {
                        num = null;
                    }
                    Object objLIZ4 = C7726030a.LIZ("msg", LJIIJ);
                    if (objLIZ4 instanceof String) {
                        str3 = (String) objLIZ4;
                    }
                    c1851070yGn.LIZIZ(EnumC1782850wUl.ERROR, "error", num, str3);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                IECommerceHostService iECommerceHostService2;
                boolean z2;
                String name3;
                if (C1775590wJ3.LLLILZ) {
                    C1775590wJ3 c1775590wJ3 = this.LL;
                    String strName = enumC1913550ztZ.name();
                    c1775590wJ3.getClass();
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        if (iECommerceHostService2 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String name4 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService2 != null) {
                            name3 = iECommerceHostService2.getClass().getName();
                        } else {
                            name3 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name3, z2);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    if (((IApplicationDependencyService) iECommerceHostService2).isLocalTest()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strName);
                        sbLIZ.append(" at ");
                        sbLIZ.append(SystemClock.elapsedRealtime());
                        c1775590wJ3.LLLIIIIL = C2188811AlT.LIZIZ(sbLIZ);
                        c1775590wJ3.LJIIJJI();
                    }
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void Th(int i, int i2, View view) {
                if (C1775590wJ3.LLLILZ) {
                    this.LL.LJIIL("onVideoSizeChange");
                }
                C599820Nfo.LIZ.getClass();
                C599820Nfo.LIZ("MMKLive", "onVideoSizeChange: video size changed");
            }
        };
        RemoteImageView remoteImageView = new RemoteImageView(context);
        C786410Ut5.f7(remoteImageView, new ViewGroup.LayoutParams(-1, -1));
        C786410Ut5.l(remoteImageView, C1771440wCM.LIZ() ? 0 : 8);
        this.LLJILJILJ = remoteImageView;
        setAttachCallback(r4);
        addView(remoteImageView);
        C418601k0.LIZ(AFwS223S0000000_32.get$arr$(53));
        this.LLLFZ = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime2);
        this.LLLIIIIL = "__unknow__";
        this.LLLIIIL = "__unknow__";
        this.LLLIIL = "__unknow__";
        this.LLLIILIL = "__unknow__";
    }

    @Override // X.InterfaceC2272961Dxu
    public final void LJJII(EnumC2176021AEe enumC2176021AEe, boolean z) {
        AbstractC1775370wIh abstractC1775370wIh;
        C1775180wIO c1775180wIOLJII;
        LJIJJ("try pauseMedia");
        this.LLJZ = false;
        if (this.LLJL) {
            this.LLJL = false;
            if (!this.LLJLILLLLZIIL) {
                C1775420wIm c1775420wIm = this.LLLIIII;
                if (c1775420wIm != null && (abstractC1775370wIh = c1775420wIm.LIZ) != null && (c1775180wIOLJII = abstractC1775370wIh.LJII()) != null) {
                    c1775180wIOLJII.LJIILLIIL++;
                    c1775180wIOLJII.LJIJ = System.currentTimeMillis() - abstractC1775370wIh.LJI;
                    c1775180wIOLJII.LJIJI = 0;
                    c1775180wIOLJII.LJIJJ = abstractC1775370wIh.LJI().LLLL();
                }
                C1775420wIm c1775420wIm2 = this.LLLIIII;
                if (c1775420wIm2 != null) {
                    c1775420wIm2.LIZIZ("play_break");
                }
                C1775420wIm c1775420wIm3 = this.LLLIIII;
                if (c1775420wIm3 != null) {
                    c1775420wIm3.LJ(null, "card_emit_stop", null);
                }
            }
        }
        this.LLJJJ = false;
        LJIILIIL(false);
        C1775420wIm c1775420wIm4 = this.LLLIIII;
        if (c1775420wIm4 != null) {
            c1775420wIm4.LIZLLL(Boolean.FALSE);
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pauseLive: pauseInternal force, scene=");
        sbLIZ.append(enumC2176021AEe);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKLive", strLIZIZ);
        LJIILL(enumC2176021AEe);
    }

    public final void LJIJ(String str, String str2, Map<String, Object> map) {
        if (!this.LLJJJJLIIL) {
            this.LLJJJJLIIL = true;
            C418601k0.LIZ(new AwS38S2200000_32(str2, str, (String) map, (Map<String, Object>) this, (C1775590wJ3) 1));
        }
    }
}
