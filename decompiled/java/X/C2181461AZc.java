package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayerConfig;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutQosMonitor;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.android.livesdk.livesetting.linkmic.LayoutLayerContentPosFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAllowSetupBeforeLinkerCreated;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicBindLayerWithLock;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixDelegateMemoryLeaf;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixUpdateParentSizeLost;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayerPostSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutCentralOperateInsetsBottomValueSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutFixWindowSize;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutLayerQosMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPostSeiWhenParentNoReady;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkLayoutLayerEnableSetupV2;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkRefreshLayoutWhenVideoSizeChange;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUseNewLayoutEventMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutLeakFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicBugFixLayoutContainerSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiCanvas;
import com.bytedance.android.livesdk.sei.SeiContainerInfo;
import com.bytedance.android.livesdk.sei.SeiEmptyRegion;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdk.sei.SeiSpotInfo;
import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import com.bytedance.android.livesdk.sei.VoiceChatSeiRegion;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutExtra_ProtoEncoder;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra_ProtoEncoder;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.MultiGuestSpotExtra_ProtoEncoder;
import tikcast.linkmic.common.MultiGuestSpotNonSeiExtra;
import tikcast.linkmic.common.MultiGuestSpotNonSeiExtra_ProtoEncoder;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SocialGameLayoutExtra_ProtoEncoder;
import tikcast.linkmic.common.SocialGameUserSpotExtra_ProtoEncoder;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.1AZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181461AZc extends AbstractC939220aY4 implements InterfaceC2181771Aa7, InterfaceC2182091Aad, InterfaceC2235471CeX, InterfaceC964930bDX {
    public C2177031AIb LL;
    public C2181391AYv LLILLJJLI;
    public final String LLILLL;
    public C2182171Aal LLILZ;
    public C942080acg LLILZIL;
    public final List<InterfaceC2182131Aah> LLILZLL;
    public final C2181501AZg LLIZ;
    public InterfaceC2182251Aat LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public C2182031AaX LLJIJIL;
    public List<C2181811AaB> LLJILJIL;
    public List<C957030b0n> LLJILJILJ;
    public volatile boolean LLJILLL;
    public volatile boolean LLJJ;
    public Runnable LLJJI;
    public ViewGroup LLJJIII;
    public double LLJJIJI;
    public View LLJJIJIIJIL;
    public String LLJJIJIL;
    public final C2181491AZf LLJJJ;
    public final C01GW LLJJJIL;
    public LinkMicLayoutLayer LLJJJJ;
    public LinkMicLayoutLayerConfig LLJJJJJIL;
    public final C972840bQI LLJJJJLIIL;
    public C13BV LLJJL;
    public C2181861AaG LLJJLIIIJLLLLLLLZ;
    public Map<String, ? extends Map<String, String>> LLJL;
    public InterfaceC940430aa1 LLJLIL;
    public C2181561AZm LLJLILLLLZIIL;
    public C2181481AZe LLJLL;
    public final AtomicBoolean LLJLLIL;
    public final AtomicInteger LLJLLL;
    public final AtomicLong LLJZ;
    public volatile boolean LLJZIJLIL;
    public final List<Runnable> LLL;
    public final C01GW LLLF;
    public boolean LLLFF;
    public int LLLFFI;

    @Override // X.InterfaceC964930bDX
    public final void LJIJJLI(List<PosIdentity> list) {
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJLIIIJJI() {
        this.LLJLIL = null;
        this.LLJJL = C13BV.INSTANCE;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
    }

    @Override // X.InterfaceC964930bDX
    public final void LJJLIIIJLJLI(String str, List<PosIdentity> list) {
    }

    @Override // X.InterfaceC937820aVo
    public final boolean LJZI() {
        return true;
    }

    @Override // X.InterfaceC964930bDX
    public final void LLI(List<Pair<String, Integer>> list) {
    }

    @Override // X.InterfaceC937820aVo
    public final void setNotAddViewOpt(int i) {
    }

    @Override // X.InterfaceC940060aZQ
    public final FrameLayout LIZIZ() {
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            return c2181481AZe.LJIILLIIL();
        }
        return null;
    }

    @Override // X.InterfaceC940060aZQ
    public final FrameLayout LJJIFFI() {
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            return c2181481AZe.LLIZLLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC940060aZQ
    public final Rect LJJIIJZLJL() {
        InterfaceC2181941AaO interfaceC2181941AaO;
        C2181561AZm c2181561AZm = this.LLJLILLLLZIIL;
        if (c2181561AZm == null || (interfaceC2181941AaO = c2181561AZm.LL) == null) {
            return null;
        }
        return interfaceC2181941AaO.getSize();
    }

    @Override // X.InterfaceC2181771Aa7
    public final boolean LJJIIZ() {
        return this.LL.LJFF.LJJLJ();
    }

    @Override // X.InterfaceC940060aZQ
    public final Rect LJJIJIIJI() {
        View videoView;
        C2181561AZm c2181561AZm = this.LLJLILLLLZIIL;
        if (c2181561AZm == null) {
            return null;
        }
        if (c2181561AZm.LL instanceof C2176161AEs) {
            View viewLIZLLL = ((C2176161AEs) c2181561AZm.LL).LIZLLL();
            if (viewLIZLLL != null) {
                return new Rect(viewLIZLLL.getLeft(), viewLIZLLL.getTop(), viewLIZLLL.getRight(), viewLIZLLL.getBottom());
            }
            return null;
        }
        InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
        if (interfaceC480510Isr == null || (videoView = interfaceC480510Isr.getVideoView()) == null) {
            return null;
        }
        return new Rect(videoView.getLeft(), videoView.getTop(), videoView.getRight(), videoView.getBottom());
    }

    @Override // X.InterfaceC964790bDJ
    public final InterfaceC964830bDN LJJIJL() {
        return (C965470bEP) this.LLLF.getValue();
    }

    @Override // X.InterfaceC2182091Aad
    public final boolean LJJJI() {
        return this.LL.LJFF.LJJJI();
    }

    @Override // X.InterfaceC940060aZQ
    public final C955320ay2 LJJLIIIJL() {
        C2181961AaQ c2181961AaQ;
        MultiGuestLayoutExtra multiGuestLayoutExtraLJII;
        C2182171Aal c2182171Aal = this.LLILZ;
        MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtraLJIIIIZZ = null;
        if (c2182171Aal == null || (c2181961AaQ = c2182171Aal.LIZ) == null) {
            return null;
        }
        String str = c2181961AaQ.LJ;
        if (str == null) {
            str = "";
        }
        String str2 = c2181961AaQ.LIZ;
        String str3 = c2181961AaQ.LJFF.LIZ;
        if (str3 != null) {
            C973010bQZ c973010bQZ = C973010bQZ.LIZ;
            multiGuestLayoutExtraLJII = C973010bQZ.LJII(str3);
        } else {
            multiGuestLayoutExtraLJII = null;
        }
        C2182111Aaf c2182111Aaf = c2181961AaQ.LJFF;
        String str4 = c2182111Aaf.LIZIZ;
        String str5 = c2182111Aaf.LIZJ;
        if (str5 != null) {
            C973010bQZ c973010bQZ2 = C973010bQZ.LIZ;
            multiGuestLayoutNonSeiExtraLJIIIIZZ = C973010bQZ.LJIIIIZZ(str5);
        }
        return new C955320ay2(str, str2, multiGuestLayoutExtraLJII, str4, multiGuestLayoutNonSeiExtraLJIIIIZZ, 32);
    }

    @Override // X.InterfaceC937900aVw
    public final InterfaceC964840bDO LJLIIL() {
        return new InterfaceC964840bDO() { // from class: X.1Aa0
            @Override // X.InterfaceC964840bDO
            public final void LIZ(LayoutDSLConfig layoutDSLConfig) {
            }

            @Override // X.InterfaceC964840bDO
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC964840bDO
            public final void LIZJ(InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964840bDO
            public final void LIZLLL(LayoutDSLConfig layoutDSLConfig, long j, String str) {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJ(PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJFF(String str) {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJI() {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJII(InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJIIIIZZ(long j) {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJIIJ(LayoutDSLConfig layoutDSLConfig) {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJIIL(LayoutDSLConfig layoutDSLConfig) {
            }

            @Override // X.InterfaceC964840bDO
            public final void LJJIJIL() {
                C20441214yg.LJIIIZ(this.LIZ.LLILLL, "onLinkerCreated");
                this.LIZ.LLJJ = true;
                if (LinkMicAllowSetupBeforeLinkerCreated.INSTANCE.isEnable()) {
                    this.LIZ.LLIZLLLIL();
                    return;
                }
                Runnable runnable = this.LIZ.LLJJI;
                if (runnable != null) {
                    runnable.run();
                }
                this.LIZ.LLJJI = null;
            }
        };
    }

    @Override // X.InterfaceC2181771Aa7
    public final InterfaceC2181941AaO LJLIL() {
        C2181561AZm c2181561AZm = this.LLJLILLLLZIIL;
        if (c2181561AZm != null) {
            return c2181561AZm.LL;
        }
        return null;
    }

    @Override // X.InterfaceC940060aZQ
    public final List<C957030b0n> LJLLJ() {
        List<C957030b0n> list = this.LLJILJILJ;
        return list == null ? C13BV.INSTANCE : list;
    }

    @Override // X.InterfaceC964930bDX
    public final void LJZ() {
        if (LayoutLayerContentPosFixSetting.INSTANCE.isEnable()) {
            this.LL.LJFF.LIZJ("notifyContentLayoutUpdate");
        }
    }

    @Override // X.InterfaceC940060aZQ
    public final FrameLayout LL() {
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            return c2181481AZe.LJIILLIIL();
        }
        return null;
    }

    @Override // X.InterfaceC937900aVw
    public final void LLII() {
        EnumC965630bEf enumC965630bEf = EnumC965630bEf.DROP;
        C973010bQZ c973010bQZ = C973010bQZ.LIZ;
        LJLLLL(enumC965630bEf, new C917100ZyO("old drop layout", C973010bQZ.LJ()));
    }

    @Override // X.InterfaceC2181771Aa7
    public final C1AZU LLIIII() {
        C1AZU c1azuLIZLLL;
        LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
        return (linkMicLayoutLayer == null || (c1azuLIZLLL = linkMicLayoutLayer.LIZLLL()) == null) ? C1AZU.Unknown : c1azuLIZLLL;
    }

    @Override // X.InterfaceC940060aZQ
    public final boolean LLIILII() {
        if (!LinkMicSdkLayoutLayerEnableSetupV2.INSTANCE.isEnable()) {
            String str = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("linkMicLayoutLayer is null: ");
            sbLIZ.append(this.LLJJJJ == null);
            C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLJJJJ != null) {
                return true;
            }
        } else if (this.LLJLLL.get() == 2) {
            if (LLJJJJLIIL()) {
                return true;
            }
            String str2 = this.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("hasSetupAndInitialized, setupStatus: ");
            sbLIZ2.append(this.LLJLLL.get());
            sbLIZ2.append(", isRustLayoutLayerReady: ");
            sbLIZ2.append(LLJJJJLIIL());
            C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        return false;
    }

    @Override // X.InterfaceC940060aZQ
    public final boolean LLIIZ() {
        C2181961AaQ c2181961AaQ;
        C2182171Aal c2182171Aal = this.LLILZ;
        if (c2182171Aal == null || (c2181961AaQ = c2182171Aal.LIZ) == null) {
            return false;
        }
        return c2181961AaQ.LIZIZ;
    }

    public final void LLIZLLLIL() {
        final LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
        if (this.LLJJ && !this.LLJILLL && linkMicLayoutLayer != null) {
            String str = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindingLayoutLayerToLinker, start binding, layer:");
            sbLIZ.append(linkMicLayoutLayer.hashCode());
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            this.LL.LJFF.LJJLIIJ(this);
            this.LLJILLL = true;
            return;
        }
        if (C500260Jjc.LJJIL() && LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            this.LLJJI = new Runnable() { // from class: X.1AZu
                public final void LIZ() {
                    String str2 = this.LL.LLILLL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("bindingLayoutLayerToLinker, prepare binding after entering live room, layer:");
                    LinkMicLayoutLayer linkMicLayoutLayer2 = linkMicLayoutLayer;
                    sbLIZ2.append(linkMicLayoutLayer2 != null ? linkMicLayoutLayer2.hashCode() : 0);
                    C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                    C2181461AZc c2181461AZc = this.LL;
                    c2181461AZc.LL.LJFF.LJJLIIJ(c2181461AZc);
                    this.LL.LLJILLL = true;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LinkMicLayoutLayerProxy@8b37.bindingLayoutLayerToLinkerIfReady$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LinkMicLayoutLayerProxy@8b37.bindingLayoutLayerToLinkerIfReady$1");
                }
            };
            return;
        }
        String str2 = this.LLILLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("bindingLayoutLayerToLinker, ignore, layer:");
        sbLIZ2.append(linkMicLayoutLayer != null ? Integer.valueOf(linkMicLayoutLayer.hashCode()) : null);
        sbLIZ2.append(", linker_created:");
        sbLIZ2.append(this.LLJJ);
        sbLIZ2.append(", bind_flag:");
        sbLIZ2.append(this.LLJILLL);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final C2181481AZe LLJILJIL() {
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            return c2181481AZe;
        }
        C2177031AIb c2177031AIb = this.LL;
        C2181481AZe c2181481AZe2 = new C2181481AZe(c2177031AIb.LIZIZ, c2177031AIb.LIZ, this, this);
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create layout view provider:");
        sbLIZ.append(c2181481AZe2.hashCode());
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLL = c2181481AZe2;
        return c2181481AZe2;
    }

    public final boolean LLJJJJLIIL() {
        return this.LLJLLIL.get() && this.LLJJJJ != null;
    }

    public final void LLJLILLLLZIIL() {
        InterfaceC940430aa1 interfaceC940430aa1 = this.LLJLIL;
        if (interfaceC940430aa1 != null) {
            LLJJJIL(null, interfaceC940430aa1, false, 2);
        }
        List listLLIIII = C13LP.LLIIII(this.LLL);
        ((ArrayList) this.LLL).clear();
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            try {
                ((Runnable) it2.next()).run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str = this.LLILLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pending task error: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.InterfaceC940060aZQ
    public final EnumC965730bEp LJJLL() {
        return C2181511AZh.LJIIL(LLIIII());
    }

    public final void LLJILJILJ() throws JSONException {
        if (LLIILII()) {
            if (!this.LLJZIJLIL) {
                C972840bQI c972840bQI = this.LLIZ.LLILZ;
                if (c972840bQI != null) {
                    c972840bQI.LIZ(new C972850bQJ("livesdk_linkmic_layout_layer_destroy", new HashMap()));
                }
                if (LinkMicFixDelegateMemoryLeaf.INSTANCE.isEnable()) {
                    this.LLIZ.LLILLJJLI.clear();
                }
            }
            String str = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroy rust layout layer: init_flag=true, instance:");
            LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
            sbLIZ.append(linkMicLayoutLayer != null ? Integer.valueOf(linkMicLayoutLayer.hashCode()) : null);
            C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            String str2 = this.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("destroy rust layout layer: init_flag=false, instance:");
            LinkMicLayoutLayer linkMicLayoutLayer2 = this.LLJJJJ;
            sbLIZ2.append(linkMicLayoutLayer2 != null ? Integer.valueOf(linkMicLayoutLayer2.hashCode()) : null);
            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LLJZIJLIL = true;
        this.LLJJI = null;
        ((ArrayList) this.LLL).clear();
        C965900bF6.LIZ(new C2181901AaK(this.LLJJJJLIIL, this.LLJJJJ, this.LLJJJJJIL));
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJLLIL.set(false);
    }

    public final int LLJJIJIIJIL() {
        boolean z = LinkCoreModelKt.currentUserIsAnchor() || C500260Jjc.LJJIL();
        int iLJJI = (int) C497740JfY.LJJI(C497740JfY.LJIJ());
        int i = this.LL.LIZIZ;
        boolean z2 = i == 4 || i == 0;
        if (LinkMicBugFixLayoutContainerSizeSetting.INSTANCE.isEnable() && z && z2) {
            String str = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("default_top_dp: 130, status bar height dp: ");
            sbLIZ.append(iLJJI);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        } else if (!LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage() || !C500260Jjc.LJJIL()) {
            return 130;
        }
        return 130 + iLJJI;
    }

    @Override // X.InterfaceC2181771Aa7
    public final C2182171Aal LJIJJ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC2181771Aa7
    public final C2182031AaX LJJII() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJJLI() {
        C973010bQZ c973010bQZ = C973010bQZ.LIZ;
    }

    @Override // X.InterfaceC940060aZQ
    public final C942080acg LJLJI() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC2181771Aa7
    public final List<C2181811AaB> LJLJJLL() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC940060aZQ
    public final ViewGroup LJZL() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC937900aVw
    public final ViewGroup LLILLIZIL() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC2235471CeX
    public final LinkMicLayoutLayer LLILLJJLI() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC940060aZQ, X.InterfaceC2235471CeX
    public final boolean isDestroyed() {
        return this.LLJZIJLIL;
    }

    public static C1283980jW8 LLJJJ(ViewGroup viewGroup) {
        return new C1283980jW8(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom(), 0.0d);
    }

    public static SeiAppData LLJLLIL(InterfaceC940430aa1 interfaceC940430aa1) {
        boolean z;
        if (C931780aM4.LIZ() && (interfaceC940430aa1 instanceof VoiceChatSeiAppData)) {
            VoiceChatSeiAppData voiceChatSeiAppData = (VoiceChatSeiAppData) interfaceC940430aa1;
            SeiAppData seiAppData = new SeiAppData();
            seiAppData.version = voiceChatSeiAppData.ver;
            seiAppData.timestamp = voiceChatSeiAppData.timestamp;
            seiAppData.channelId = voiceChatSeiAppData.channelId;
            List<VoiceChatSeiRegion> list = voiceChatSeiAppData.grids;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (VoiceChatSeiRegion voiceChatSeiRegion : list) {
                SeiRegion seiRegion = new SeiRegion();
                seiRegion.uidStr = voiceChatSeiRegion.linkMicId;
                seiRegion.talk = voiceChatSeiRegion.talkVolume;
                if (voiceChatSeiRegion.isMuteAudio != 0) {
                    z = true;
                } else {
                    z = false;
                }
                seiRegion.muteAudioBool = z;
                seiRegion.audioOccupied = voiceChatSeiRegion.isAudioOccupied;
                seiRegion.position = voiceChatSeiRegion.position;
                seiRegion.onlineUserState = voiceChatSeiRegion.onLineUserState;
                seiRegion.streamId = voiceChatSeiRegion.streamId;
                seiRegion.spotId = voiceChatSeiRegion.spotId;
                seiRegion.width = voiceChatSeiRegion.width;
                seiRegion.height = voiceChatSeiRegion.height;
                seiRegion.x = voiceChatSeiRegion.x;
                seiRegion.y = voiceChatSeiRegion.y;
                seiRegion.z = voiceChatSeiRegion.z;
                arrayList.add(seiRegion);
            }
            seiAppData.grids = arrayList;
            seiAppData.dsl = voiceChatSeiAppData.dsl;
            seiAppData.anchorLinkMicId = voiceChatSeiAppData.anchorLinkMicId;
            seiAppData.businessExtraInfo = voiceChatSeiAppData.businessExtraInfo;
            List<SeiSpotInfo> list2 = voiceChatSeiAppData.spotInfos;
            if (list2 != null) {
                seiAppData.LJIJI(list2);
            }
            List<SeiEmptyRegion> list3 = voiceChatSeiAppData.emptyGrids;
            if (list3 != null) {
                seiAppData.emptyGrids = list3;
            }
            SeiContainerInfo seiContainerInfo = voiceChatSeiAppData.linkMicContainer;
            if (seiContainerInfo != null) {
                seiAppData.linkMicContainer = seiContainerInfo;
            }
            return seiAppData;
        }
        return null;
    }

    @Override // X.InterfaceC940060aZQ
    public final void LIZLLL(final C917100ZyO c917100ZyO) {
        Runnable runnable = new Runnable() { // from class: X.1AZl
            public boolean LL;
            public int LLILLJJLI;
            public int LLILLL;

            public final void LIZ() {
                C2181461AZc c2181461AZc = this.LLILZ;
                ViewGroup viewGroup = c2181461AZc.LLJJIII;
                String str = c2181461AZc.LLILLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try call request layout to rust, viewParent:");
                sbLIZ.append(viewGroup != null ? Integer.valueOf(viewGroup.hashCode()) : null);
                sbLIZ.append(", attached:");
                sbLIZ.append(viewGroup != null ? Boolean.valueOf(viewGroup.isAttachedToWindow()) : null);
                sbLIZ.append(" size:");
                sbLIZ.append(viewGroup != null ? Integer.valueOf(viewGroup.getWidth()) : null);
                sbLIZ.append('x');
                sbLIZ.append(viewGroup != null ? Integer.valueOf(viewGroup.getHeight()) : null);
                sbLIZ.append(", postFlag:");
                sbLIZ.append(this.LL);
                C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                if (viewGroup == null) {
                    return;
                }
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                if (width == 0 && height == 0 && !this.LL) {
                    this.LL = true;
                    HandlerHook.viewPost(viewGroup, this);
                    return;
                }
                if (LinkMicFixUpdateParentSizeLost.INSTANCE.isEnable() && (this.LLILLJJLI != width || this.LLILLL != height)) {
                    C2181461AZc c2181461AZc2 = this.LLILZ;
                    C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                    c2181461AZc2.LLJJJJJIL(viewGroup, null, false, C973010bQZ.LJI("requestUpdateLayout"));
                }
                this.LLILLJJLI = width;
                this.LLILLL = height;
                LinkMicLayoutLayer linkMicLayoutLayer = this.LLILZ.LLJJJJ;
                if (linkMicLayoutLayer != null) {
                    linkMicLayoutLayer.LJIILLIIL(C2181511AZh.LJII(c917100ZyO));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkMicLayoutLayerProxy@8b37.requestUpdateLayout$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkMicLayoutLayerProxy@8b37.requestUpdateLayout$runnable$1");
            }
        };
        if (!LLIILII()) {
            ((ArrayList) this.LLL).add(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.InterfaceC964790bDJ
    public final Rect LJIIJ(String str) {
        SeiAppData seiAppData;
        List<SeiRegion> list;
        SeiRegion next;
        C2181561AZm c2181561AZm;
        InterfaceC2181941AaO interfaceC2181941AaO;
        Pair<Integer, Integer> resolution;
        InterfaceC940430aa1 interfaceC940430aa1 = this.LLJLIL;
        if ((interfaceC940430aa1 instanceof SeiAppData) && (seiAppData = (SeiAppData) interfaceC940430aa1) != null && (list = seiAppData.grids) != null) {
            Iterator<SeiRegion> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.uidStr, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SeiRegion seiRegion = next;
            if (seiRegion != null && (c2181561AZm = this.LLJLILLLLZIIL) != null && (interfaceC2181941AaO = c2181561AZm.LL) != null && (resolution = interfaceC2181941AaO.getResolution()) != null) {
                int iDoubleValue = (int) (seiRegion.x * resolution.getFirst().doubleValue());
                int iDoubleValue2 = ((int) (seiRegion.width * resolution.getFirst().doubleValue())) + iDoubleValue;
                int iDoubleValue3 = (int) (seiRegion.y * resolution.getSecond().doubleValue());
                return new Rect(iDoubleValue, iDoubleValue3, iDoubleValue2, ((int) (seiRegion.height * resolution.getSecond().doubleValue())) + iDoubleValue3);
            }
        }
        return null;
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJIILJJIL(InterfaceC2181591AZp interfaceC2181591AZp) {
        this.LLIZ.LJIL(null);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJIJ(String str) throws JSONException {
        if (LinkMicBindLayerWithLock.INSTANCE.enable()) {
            synchronized (this) {
                try {
                    LLJILJILJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            LLJILJILJ();
        }
        LLJIJIL(true);
        LJJLIIIJJI();
        C2181481AZe c2181481AZe = this.LLJLL;
        C2181561AZm c2181561AZm = this.LLJLILLLLZIIL;
        boolean value = LinkmicLayoutLeakFixSetting.INSTANCE.getValue();
        if (value) {
            this.LLJLILLLLZIIL = null;
            this.LLJLL = null;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2181541AZk(c2181481AZe, c2181561AZm));
        if (!value) {
            this.LLJLILLLLZIIL = null;
            this.LLJLL = null;
        }
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJJI(boolean z) {
        final C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            if (z) {
                final FrameLayout frameLayout = c2181481AZe.LLIZLLLIL;
                if (frameLayout == null) {
                    frameLayout = new FrameLayout(c2181481AZe.LL);
                    frameLayout.setId(R.id.ysd);
                    c2181481AZe.LLIZLLLIL = frameLayout;
                }
                final ViewGroup viewGroup = c2181481AZe.LLILZIL.get(Long.valueOf(c2181481AZe.LLJI));
                if (viewGroup != null) {
                    Runnable runnable = new Runnable() { // from class: X.0eLw
                        public final void LIZ() {
                            FrameLayout frameLayout2 = c2181481AZe.LLIZLLLIL;
                            if (frameLayout2 != null) {
                                C500260Jjc.LJJJLL(frameLayout2);
                            }
                            ViewGroup viewGroup2 = viewGroup;
                            if (viewGroup2 instanceof FrameLayout) {
                                viewGroup2.addView(c2181481AZe.LLIZLLLIL, 0, new FrameLayout.LayoutParams(-1, -1));
                                String str = c2181481AZe.LLILZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("enableBackgroundLayer, has been add to parent view[");
                                sbLIZ.append(C500260Jjc.LJIIL(viewGroup));
                                sbLIZ.append(']');
                                C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                                return;
                            }
                            if (!(viewGroup2 instanceof ConstraintLayout)) {
                                C20441214yg.LJ(c2181481AZe.LLILZ, "enableBackgroundLayer, not support parent view type");
                                return;
                            }
                            FrameLayout frameLayout3 = frameLayout;
                            C19ME c19me = new C19ME(-1, -1);
                            c19me.leftToLeft = 0;
                            c19me.topToTop = 0;
                            c19me.rightToRight = 0;
                            c19me.bottomToBottom = 0;
                            C786410Ut5.a6(frameLayout3, c19me);
                            viewGroup.addView(frameLayout, 0);
                            String str2 = c2181481AZe.LLILZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("enableBackgroundLayer, has been add to parent view[");
                            sbLIZ2.append(C500260Jjc.LJIIL(viewGroup));
                            sbLIZ2.append(']');
                            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LinkMicLayoutViewProviderImpl@2469.enableBackgroundLayer$addToParentBottom$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LinkMicLayoutViewProviderImpl@2469.enableBackgroundLayer$addToParentBottom$1");
                        }
                    };
                    if (!Intrinsics.LJFF(frameLayout.getParent(), viewGroup)) {
                        runnable.run();
                        return;
                    } else {
                        if (viewGroup.indexOfChild(frameLayout) == 0) {
                            return;
                        }
                        runnable.run();
                        return;
                    }
                }
                C20441214yg.LJ(c2181481AZe.LLILZ, "enableBackgroundLayer, parent view is null");
                return;
            }
            FrameLayout frameLayout2 = c2181481AZe.LLIZLLLIL;
            if (frameLayout2 != null) {
                C500260Jjc.LJJJLL(frameLayout2);
            }
            c2181481AZe.LLIZLLLIL = null;
        }
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJJIIJ(int i) {
        this.LLJJIJI = i;
    }

    @Override // X.InterfaceC964790bDJ
    public final Pair<Integer, Rect> LJJIJIIJIL(String str) {
        C947470alN c947470alN;
        List<C957020b0m> list;
        C957020b0m next;
        ViewGroup viewGroup;
        int width;
        int height;
        String str2;
        C942080acg c942080acg = this.LLILZIL;
        if (c942080acg != null && (c947470alN = c942080acg.LIZ) != null && (list = c947470alN.LIZLLL) != null) {
            Iterator<C957020b0m> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    PosIdentity posIdentity = next.getPosIdentity();
                    if (posIdentity != null) {
                        str2 = posIdentity.value;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C957020b0m c957020b0m = next;
            if (c957020b0m != null) {
                int[] iArr = new int[2];
                c957020b0m.getLocationOnScreen(iArr);
                ViewParent parent = c957020b0m.getParent();
                if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                    return null;
                }
                if (c957020b0m.getLayoutParams().width > 0) {
                    width = c957020b0m.getLayoutParams().width;
                } else {
                    width = c957020b0m.getWidth();
                }
                if (c957020b0m.getLayoutParams().height > 0) {
                    height = c957020b0m.getLayoutParams().height;
                } else {
                    height = c957020b0m.getHeight();
                }
                Integer numValueOf = Integer.valueOf(viewGroup.indexOfChild(c957020b0m));
                int i = iArr[0];
                int i2 = iArr[1];
                return new Pair<>(numValueOf, new Rect(i, i2, width + i, height + i2));
            }
        }
        return null;
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJJJ(SurfaceView surfaceView) {
        String strLJIIL;
        String strLJJIIJ = this.LL.LJFF.LJJIIJ();
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestSelfSurfaceView, surfaceView: ");
        if (surfaceView != null) {
            strLJIIL = C500260Jjc.LJIIL(surfaceView);
        } else {
            strLJIIL = null;
        }
        sbLIZ.append(strLJIIL);
        sbLIZ.append(", linkMicId: ");
        sbLIZ.append(strLJJIIJ);
        C20441214yg.LJIIL(str, C2188811AlT.LIZIZ(sbLIZ));
        if (strLJJIIJ != null && strLJJIIJ.length() != 0 && surfaceView != null) {
            LLJZIJLIL(strLJJIIJ, surfaceView);
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJJJI(String str) {
        InterfaceC2181691AZz interfaceC2181691AZzLJIJ;
        String strLJJIIJ = this.LL.LJFF.LJJIIJ();
        if (strLJJIIJ == null) {
            return;
        }
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null && (interfaceC2181691AZzLJIJ = c2181481AZe.LJIJ(strLJJIIJ)) != null) {
            interfaceC2181691AZzLJIJ.LJIL();
        }
        this.LL.LJFF.LJIJJ(strLJJIIJ, false);
    }

    @Override // X.InterfaceC940060aZQ
    public final boolean LJJJLL(String str) {
        if (this.LL.LJFF.LJJLIIIJLLLLLLLZ() && C500260Jjc.LJJIJ(this.LLJJIJIL) && Intrinsics.LJFF(str, this.LLJJIJIL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJJLIIIIJ(InterfaceC2181591AZp interfaceC2181591AZp) {
        C2181501AZg c2181501AZg = this.LLIZ;
        String str = c2181501AZg.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeLayoutDelegate: ");
        sbLIZ.append(interfaceC2181591AZp.hashCode());
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        c2181501AZg.LLILLJJLI.remove(interfaceC2181591AZp);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJLIIIJILLIZJL(int i) {
        FrameLayout frameLayoutLJIILLIIL;
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            frameLayoutLJIILLIIL = c2181481AZe.LJIILLIIL();
        } else {
            frameLayoutLJIILLIIL = null;
        }
        if (frameLayoutLJIILLIIL instanceof C21614919iV) {
            ((C21614919iV) frameLayoutLJIILLIIL).setDividerType(i);
        }
    }

    @Override // X.InterfaceC937900aVw
    public final View LJJLIL(String str) {
        C2181481AZe c2181481AZe;
        InterfaceC2181691AZz interfaceC2181691AZzLJIJ;
        String strLJJIIJ = this.LL.LJFF.LJJIIJ();
        if (strLJJIIJ == null || (c2181481AZe = this.LLJLL) == null || (interfaceC2181691AZzLJIJ = c2181481AZe.LJIJ(strLJJIIJ)) == null) {
            return null;
        }
        this.LL.LJFF.LJIJJ(strLJJIIJ, true);
        interfaceC2181691AZzLJIJ.LJIJJLI(str);
        return interfaceC2181691AZzLJIJ.LJIILJJIL();
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLJJL(Layout layout) throws Throwable {
        C2182171Aal c2182171Aal = this.LLILZ;
        if (c2182171Aal != null) {
            LLLF(c2182171Aal);
        }
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJLLL(C415901jZ c415901jZ) {
        this.LLIZLLLIL = c415901jZ;
    }

    @Override // X.InterfaceC2181771Aa7
    public final void LLF(InterfaceC2182131Aah interfaceC2182131Aah) {
        ((CopyOnWriteArrayList) this.LLILZLL).add(interfaceC2182131Aah);
    }

    @Override // X.InterfaceC937900aVw
    public final void LLIIIL(boolean z) {
        Integer numValueOf;
        C2181481AZe c2181481AZe;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchRenderContainerSuperView, provider:");
        C2181481AZe c2181481AZe2 = this.LLJLL;
        if (c2181481AZe2 != null) {
            numValueOf = Integer.valueOf(c2181481AZe2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", enable=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C2181481AZe c2181481AZe3 = this.LLJLL;
        if (c2181481AZe3 != null && c2181481AZe3.LLJILJILJ != z) {
            c2181481AZe3.LLJILJILJ = z;
            C500260Jjc.LJJLIIIJILLIZJL(new C2182041AaY(c2181481AZe3, z));
        }
        if (!z && (c2181481AZe = this.LLJLL) != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new C2181841AaE(null, c2181481AZe));
        }
    }

    @Override // X.InterfaceC964790bDJ
    public final void LLIIJLIL(List<String> list) {
        C2181391AYv c2181391AYv = this.LLILLJJLI;
        if (c2181391AYv != null) {
            c2181391AYv.LLJ = list;
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LLIILZL(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        Integer numValueOf;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchRenderContainerSuperView, provider:");
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            numValueOf = Integer.valueOf(c2181481AZe.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", subView:");
        sbLIZ.append(C500260Jjc.LJIIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB));
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C2181481AZe c2181481AZe2 = this.LLJLL;
        if (c2181481AZe2 != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new C2181841AaE(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, c2181481AZe2));
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LLILZLL(Pair<Integer, Integer> pair) {
        if (!LinkMicSdkRefreshLayoutWhenVideoSizeChange.INSTANCE.getValue()) {
            return;
        }
        LLFF(pair.getFirst().intValue(), pair.getSecond().intValue());
    }

    public final void LLJIJIL(boolean z) {
        if (z) {
            LLL(0, "clear layout");
            this.LLJJIII = null;
        }
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final EnumC2181801AaA LLJJIII(C1283980jW8 c1283980jW8) {
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() && this.LL.LJII == EnumC945310aht.SEARCH) {
            return EnumC2181801AaA.Search;
        }
        if (((double) C1283930jW3.LIZLLL(c1283980jW8.LIZJ - c1283980jW8.LIZ)) / ((double) C1283930jW3.LIZLLL(c1283980jW8.LIZLLL - c1283980jW8.LIZIZ)) > 0.5625d) {
            if (C1283930jW3.LIZLLL(c1283980jW8.LIZJ - c1283980jW8.LIZ) > C1283930jW3.LIZLLL(c1283980jW8.LIZLLL - c1283980jW8.LIZIZ)) {
                return EnumC2181801AaA.PadLandscape;
            }
            return EnumC2181801AaA.PadPortrait;
        }
        int i = C2181661AZw.LIZJ[this.LL.LJII.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return EnumC2181801AaA.InRoom;
            }
            return EnumC2181801AaA.Feed;
        }
        return EnumC2181801AaA.Search;
    }

    public final int LLJJIJI(C1283980jW8 c1283980jW8) {
        int i = C2181661AZw.LIZ[LLJJIII(c1283980jW8).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return LinkMicLayoutCentralOperateInsetsBottomValueSetting.INSTANCE.getValue().feedDp;
                        }
                        throw new C1954807lC();
                    }
                    return LinkMicLayoutCentralOperateInsetsBottomValueSetting.INSTANCE.getValue().searchDp;
                }
                return LinkMicLayoutCentralOperateInsetsBottomValueSetting.INSTANCE.getValue().inRoomDp;
            }
            return LinkMicLayoutCentralOperateInsetsBottomValueSetting.INSTANCE.getValue().padPortraitDp;
        }
        return LinkMicLayoutCentralOperateInsetsBottomValueSetting.INSTANCE.getValue().padLandscapeDp;
    }

    public final void LLJJL(String str) {
        C20441214yg.LIZIZ(this.LLILLL, str);
    }

    public final void LLJLIL(String str) {
        if (u.LJJIIJZLJL(str, "FromSei", false) && this.LLJJIJIL == null) {
            this.LLJJIJIL = str;
            String str2 = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("record first layout refresh from sei, switch_id:");
            sbLIZ.append(str);
            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LLJLL(String str) {
        InterfaceC2181691AZz interfaceC2181691AZz;
        if (!this.LL.LJIIIIZZ) {
            return;
        }
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null && (interfaceC2181691AZz = c2181481AZe.LLIZ) != null) {
            LLJLLL(interfaceC2181691AZz.getLinkMicId(), interfaceC2181691AZz, str);
            return;
        }
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryRegisterAnchorRenderViewToRust, view is null, source:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [X.0I5r] */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.0I5r] */
    public final C942080acg LLJZ(C2182171Aal c2182171Aal) {
        Rect rect;
        FrameLayout frameLayoutLJIILLIIL;
        RectF rectF;
        Rect rect2;
        FrameLayout frameLayoutLJIILLIIL2;
        RectF rectF2;
        C955300ay0 c955300ay0;
        C957020b0m c957020b0mLJIILL;
        C957020b0m c957020b0mLJIILL2;
        C957020b0m c957020b0mLJIILL3;
        FrameLayout frameLayoutLJIILLIIL3;
        ViewGroup.LayoutParams layoutParams;
        C957020b0m c957020b0mLJIILL4;
        FrameLayout frameLayoutLJIILLIIL4;
        ViewGroup.LayoutParams layoutParams2;
        C2181481AZe c2181481AZe = this.LLJLL;
        C2181961AaQ c2181961AaQ = c2182171Aal.LIZ;
        C2182241Aas c2182241Aas = c2181961AaQ.LIZJ;
        if (c2181481AZe != null && (frameLayoutLJIILLIIL4 = c2181481AZe.LJIILLIIL()) != null && (layoutParams2 = frameLayoutLJIILLIIL4.getLayoutParams()) != null) {
            rect = C2181511AZh.LJI(layoutParams2);
        } else {
            rect = null;
        }
        if (!C1283930jW3.LIZJ(rect)) {
            C1283980jW8 c1283980jW8 = c2182241Aas.LIZIZ;
            rect = new Rect((int) c1283980jW8.LIZ, (int) c1283980jW8.LIZIZ, (int) c1283980jW8.LIZJ, (int) c1283980jW8.LIZLLL);
        }
        String str = c2181961AaQ.LIZ;
        if (c2181481AZe != null) {
            frameLayoutLJIILLIIL = c2181481AZe.LJIILLIIL();
        } else {
            frameLayoutLJIILLIIL = null;
        }
        if (rect != null) {
            rectF = new RectF(rect);
        } else {
            rectF = null;
        }
        List<C2181741Aa4> list = c2181961AaQ.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (C2181741Aa4 c2181741Aa4 : list) {
            if (c2181481AZe != null && (c957020b0mLJIILL4 = c2181481AZe.LJIILL(c2181741Aa4)) != null) {
                arrayList.add(c957020b0mLJIILL4);
            }
        }
        C2182111Aaf c2182111Aaf = c2181961AaQ.LJFF;
        C947470alN c947470alN = new C947470alN(str, frameLayoutLJIILLIIL, rectF, arrayList, new C955300ay0(c2182111Aaf.LIZ, c2182111Aaf.LIZIZ, c2182111Aaf.LIZJ, c2182111Aaf.LIZLLL));
        C2181951AaP c2181951AaP = c2182171Aal.LIZIZ;
        C2182241Aas c2182241Aas2 = c2181951AaP.LIZIZ;
        if (c2182241Aas2 != null) {
            if (c2181481AZe != null && (frameLayoutLJIILLIIL3 = c2181481AZe.LJIILLIIL()) != null && (layoutParams = frameLayoutLJIILLIIL3.getLayoutParams()) != null) {
                rect2 = C2181511AZh.LJI(layoutParams);
            } else {
                rect2 = null;
            }
            if (!C1283930jW3.LIZJ(rect2)) {
                C1283980jW8 c1283980jW82 = c2182241Aas2.LIZIZ;
                rect2 = new Rect((int) c1283980jW82.LIZ, (int) c1283980jW82.LIZIZ, (int) c1283980jW82.LIZJ, (int) c1283980jW82.LIZLLL);
            }
        } else {
            rect2 = null;
        }
        if (c2181481AZe != null) {
            frameLayoutLJIILLIIL2 = c2181481AZe.LJIILLIIL();
        } else {
            frameLayoutLJIILLIIL2 = null;
        }
        if (rect2 != null) {
            rectF2 = new RectF(rect2);
        } else {
            rectF2 = null;
        }
        List<C2181741Aa4> list2 = c2181951AaP.LIZJ;
        ArrayList arrayList2 = new ArrayList();
        for (C2181741Aa4 c2181741Aa42 : list2) {
            if (c2181481AZe != null && (c957020b0mLJIILL3 = c2181481AZe.LJIILL(c2181741Aa42)) != null) {
                arrayList2.add(c957020b0mLJIILL3);
            }
        }
        List<C2182231Aar> list3 = c2181951AaP.LIZLLL;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        for (C2182231Aar c2182231Aar : list3) {
            if (c2181481AZe != null) {
                c957020b0mLJIILL2 = c2181481AZe.LJIILL(c2182231Aar.LIZIZ);
            } else {
                c957020b0mLJIILL2 = null;
            }
            C1283980jW8 c1283980jW83 = c2182231Aar.LIZ.LIZLLL.LIZIZ;
            final double d = c1283980jW83.LIZ;
            final double d2 = c1283980jW83.LIZIZ;
            final double d3 = c1283980jW83.LIZJ;
            final double d4 = c1283980jW83.LIZLLL;
            final double d5 = c1283980jW83.LJ;
            ?? r17 = new Object(d, d2, d3, d4, d5) { // from class: X.0I5r
                public final double LIZ;
                public final double LIZIZ;
                public final double LIZJ;
                public final double LIZLLL;
                public final double LJ;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ExternalLinkMicRect(left=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", top=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", right=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", bottom=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", radius=");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = d;
                    this.LIZIZ = d2;
                    this.LIZJ = d3;
                    this.LIZLLL = d4;
                    this.LJ = d5;
                }
            };
            C1283980jW8 c1283980jW84 = c2182231Aar.LIZIZ.LIZLLL.LIZIZ;
            final double d6 = c1283980jW84.LIZ;
            final double d7 = c1283980jW84.LIZIZ;
            final double d8 = c1283980jW84.LIZJ;
            final double d9 = c1283980jW84.LIZLLL;
            final double d10 = c1283980jW84.LJ;
            arrayList3.add(new C942090ach(c957020b0mLJIILL2, r17, new Object(d6, d7, d8, d9, d10) { // from class: X.0I5r
                public final double LIZ;
                public final double LIZIZ;
                public final double LIZJ;
                public final double LIZLLL;
                public final double LJ;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ExternalLinkMicRect(left=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", top=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", right=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", bottom=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", radius=");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = d6;
                    this.LIZIZ = d7;
                    this.LIZJ = d8;
                    this.LIZLLL = d9;
                    this.LJ = d10;
                }
            }));
        }
        List<C2181741Aa4> list4 = c2181951AaP.LJ;
        ArrayList arrayList4 = new ArrayList();
        for (C2181741Aa4 c2181741Aa43 : list4) {
            if (c2181481AZe != null && (c957020b0mLJIILL = c2181481AZe.LJIILL(c2181741Aa43)) != null) {
                arrayList4.add(c957020b0mLJIILL);
            }
        }
        C2182111Aaf c2182111Aaf2 = c2181951AaP.LJFF;
        if (c2182111Aaf2 != null) {
            c955300ay0 = new C955300ay0(c2182111Aaf2.LIZ, c2182111Aaf2.LIZIZ, c2182111Aaf2.LIZJ, c2182111Aaf2.LIZLLL);
        } else {
            c955300ay0 = null;
        }
        C942080acg c942080acg = new C942080acg(c947470alN, new C947460alM(frameLayoutLJIILLIIL2, rectF2, arrayList2, arrayList3, arrayList4, c955300ay0));
        this.LLILZ = c2182171Aal;
        this.LLILZIL = c942080acg;
        return c942080acg;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLF(X.C2182171Aal r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181461AZc.LLLF(X.1Aal):void");
    }

    @Override // X.InterfaceC937900aVw
    public final void S0(String str) {
        ((HashMap) this.LLJJJIL.getValue()).remove(str);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1AZf] */
    public C2181461AZc(C2177031AIb c2177031AIb, C2181391AYv c2181391AYv) {
        this.LL = c2177031AIb;
        this.LLILLJJLI = c2181391AYv;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1283930jW3.LJI(this.LL.LIZIZ));
        sbLIZ.append("LayoutLayerProxy");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLL = strLIZIZ;
        this.LLILZLL = new CopyOnWriteArrayList();
        C2181501AZg c2181501AZg = new C2181501AZg(strLIZIZ);
        this.LLIZ = c2181501AZg;
        this.LLJJJ = new InterfaceC2183461Acq() { // from class: X.1AZf
            @Override // X.InterfaceC2183461Acq
            public final void LIZJ(C1AZU c1azu, C2182171Aal c2182171Aal, C2181851AaF c2181851AaF) throws Throwable {
                boolean z;
                FrameLayout frameLayoutLJIILLIIL;
                ViewTreeObserver viewTreeObserver;
                FrameLayout frameLayoutLJIILLIIL2;
                C963800bBi c963800bBi;
                C957020b0m externalLinkMicWindowView;
                FrameLayout.LayoutParams layoutParams;
                Rect rectLJIJI;
                InterfaceC951900asW interfaceC951900asW;
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sb = new StringBuilder("onPipelineEndSuccess, ");
                sb.append(c2181851AaF.LIZ);
                sb.append(", ");
                sb.append(c1azu);
                sb.append(" result:");
                List<C2181741Aa4> list = c2182171Aal.LIZ.LIZLLL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C2181741Aa4> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C2181511AZh.LJIIJJI(it2.next()));
                }
                sb.append(arrayList);
                c2181461AZc.LLJJL(sb.toString());
                DataChannel dataChannel = this.LL.LL.LJFF.getDataChannel();
                if (dataChannel != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
                    interfaceC951900asW.LIZIZ();
                }
                InterfaceC2182251Aat interfaceC2182251Aat = this.LL.LLIZLLLIL;
                if (interfaceC2182251Aat != null) {
                    interfaceC2182251Aat.LIZIZ(c2182171Aal.LIZIZ.LIZ);
                }
                C942080acg c942080acgLLJZ = this.LL.LLJZ(c2182171Aal);
                Iterator it3 = C13LP.LLIIII(this.LL.LLILZLL).iterator();
                while (it3.hasNext()) {
                    ((InterfaceC2182131Aah) it3.next()).LIZ(c2182171Aal);
                }
                this.LL.LLLF(c2182171Aal);
                C2181481AZe c2181481AZe = this.LL.LLJLL;
                if (c2181481AZe != null) {
                    c2181481AZe.LJJIIJ("onPipelineEndSuccess");
                }
                C2181481AZe c2181481AZe2 = this.LL.LLJLL;
                if (c2181481AZe2 != null && (frameLayoutLJIILLIIL2 = c2181481AZe2.LJIILLIIL()) != null) {
                    C09RD c09rd = new C09RD(frameLayoutLJIILLIIL2);
                    C2181461AZc c2181461AZc2 = this.LL;
                    Iterator<View> it4 = c09rd.iterator();
                    while (true) {
                        C09RE c09re = (C09RE) it4;
                        if (!c09re.hasNext()) {
                            break;
                        }
                        View view = (View) c09re.next();
                        if ((view instanceof C963800bBi) && (externalLinkMicWindowView = (c963800bBi = (C963800bBi) view).getExternalLinkMicWindowView()) != null) {
                            Rect originRect = c963800bBi.getOriginRect();
                            if (originRect == null) {
                                originRect = new Rect();
                            }
                            C2181501AZg c2181501AZg2 = c2181461AZc2.LLIZ;
                            List listLJIL = C2097808Js.LJIL(c2181501AZg2.LLILLJJLI);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : listLJIL) {
                                if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                                    arrayList2.add(obj);
                                }
                            }
                            Iterator it5 = arrayList2.iterator();
                            Rect rectLJIJI2 = originRect;
                            while (it5.hasNext()) {
                                try {
                                    rectLJIJI2 = ((InterfaceC2181591AZp) ((Pair) it5.next()).getFirst()).LJIJI(externalLinkMicWindowView, rectLJIJI2, C2181511AZh.LJFF(c2181851AaF));
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C20441214yg.LJFF(c2181501AZg2.LL, "call back [onLinkMicWindowWillChangeFrame] exception", e);
                                }
                            }
                            try {
                                InterfaceC2181591AZp interfaceC2181591AZp = c2181501AZg2.LLILLL;
                                if (interfaceC2181591AZp != null && (rectLJIJI = interfaceC2181591AZp.LJIJI(externalLinkMicWindowView, rectLJIJI2, C2181511AZh.LJFF(c2181851AaF))) != null) {
                                    rectLJIJI2 = rectLJIJI;
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C20441214yg.LJFF(c2181501AZg2.LL, "call back [onLinkMicWindowWillChangeFrame][single_delegate] exception", e2);
                            }
                            if (!Intrinsics.LJFF(originRect, rectLJIJI2)) {
                                String str = c2181461AZc2.LLILLL;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onLinkMicWindowWillChangeFrame: ");
                                sbLIZ2.append(originRect);
                                sbLIZ2.append(" -> ");
                                sbLIZ2.append(rectLJIJI2);
                                C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            if (C1283930jW3.LIZJ(rectLJIJI2) && !Intrinsics.LJFF(rectLJIJI2, C2181511AZh.LJI(c963800bBi.getLayoutParams()))) {
                                externalLinkMicWindowView.getShapeDescriptor().LIZ = rectLJIJI2;
                                ViewGroup.LayoutParams layoutParams2 = c963800bBi.getLayoutParams();
                                FrameLayout.LayoutParams layoutParams3 = null;
                                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                                    layoutParams.leftMargin = rectLJIJI2.left;
                                    layoutParams.topMargin = rectLJIJI2.top;
                                    layoutParams.width = rectLJIJI2.width();
                                    layoutParams.height = rectLJIJI2.height();
                                    layoutParams3 = layoutParams;
                                }
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c963800bBi);
                                c963800bBi.setLayoutParams(layoutParams3);
                            }
                        }
                    }
                }
                final C2181461AZc c2181461AZc3 = this.LL;
                if (c2181461AZc3.LLIZLLLIL != null) {
                    final String str2 = c2182171Aal.LIZIZ.LIZ;
                    C2181481AZe c2181481AZe3 = c2181461AZc3.LLJLL;
                    if (c2181481AZe3 != null && (frameLayoutLJIILLIIL = c2181481AZe3.LJIILLIIL()) != null && (viewTreeObserver = frameLayoutLJIILLIIL.getViewTreeObserver()) != null) {
                        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.1AaD
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                FrameLayout frameLayoutLJIILLIIL3;
                                ViewTreeObserver viewTreeObserver2;
                                C2181481AZe c2181481AZe4 = c2181461AZc3.LLJLL;
                                if (c2181481AZe4 != null && (frameLayoutLJIILLIIL3 = c2181481AZe4.LJIILLIIL()) != null && (viewTreeObserver2 = frameLayoutLJIILLIIL3.getViewTreeObserver()) != null) {
                                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                                    C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                                }
                                InterfaceC2182251Aat interfaceC2182251Aat2 = c2181461AZc3.LLIZLLLIL;
                                if (interfaceC2182251Aat2 != null) {
                                    interfaceC2182251Aat2.LIZ(str2);
                                }
                            }
                        };
                        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                        C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                }
                C2181501AZg c2181501AZg3 = this.LL.LLIZ;
                String str3 = c2181501AZg3.LL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("dispatch onLayoutPipelineEndSuccess, archType=");
                sbLIZ3.append(c1azu);
                sbLIZ3.append(", source=");
                sbLIZ3.append(c2181851AaF);
                sbLIZ3.append(", layout_key=");
                sbLIZ3.append(c942080acgLLJZ.LIZ.LIZ);
                sbLIZ3.append(", delegate_count=");
                sbLIZ3.append(c2181501AZg3.LLILLJJLI.size());
                sbLIZ3.append(", has_single_delegate=");
                if (c2181501AZg3.LLILLL != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ3.append(z);
                C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
                List listLJIL2 = C2097808Js.LJIL(c2181501AZg3.LLILLJJLI);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listLJIL2) {
                    if (((EnumC965730bEp) ((Pair) obj2).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    try {
                        ((InterfaceC2181591AZp) ((Pair) it6.next()).getFirst()).LJIIL(c942080acgLLJZ, C2181511AZh.LJFF(c2181851AaF));
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C20441214yg.LJFF(c2181501AZg3.LL, "call back [onLayoutPipelineEndSuccess] exception", e3);
                    }
                }
                try {
                    InterfaceC2181591AZp interfaceC2181591AZp2 = c2181501AZg3.LLILLL;
                    if (interfaceC2181591AZp2 != null) {
                        interfaceC2181591AZp2.LJIIL(c942080acgLLJZ, C2181511AZh.LJFF(c2181851AaF));
                    }
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    C20441214yg.LJFF(c2181501AZg3.LL, "call back [onLayoutPipelineEndSuccess][single_delegate] exception", e4);
                }
            }

            @Override // X.InterfaceC2183461Acq
            public final void LIZLLL(C1AZU c1azu, C1AZU c1azu2, C2181851AaF c2181851AaF) {
                String str = this.LL.LLILLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutArchTypeDidSwitch: ");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(" -> ");
                sbLIZ2.append(c1azu2);
                sbLIZ2.append(", ");
                sbLIZ2.append(c2181851AaF.LIZ);
                C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LIZLLL(c1azu, c1azu2, c2181851AaF);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJFF(C1AZU c1azu, C2182221Aaq c2182221Aaq, C2181851AaF c2181851AaF) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutUpdateAbort:");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(' ');
                sbLIZ2.append(c2182221Aaq.LIZ);
                sbLIZ2.append(' ');
                sbLIZ2.append(c2182221Aaq.LIZIZ);
                sbLIZ2.append(", ");
                sbLIZ2.append(c2181851AaF.LIZ);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LJFF(c1azu, c2182221Aaq, c2181851AaF);
            }

            @Override // X.InterfaceC2183461Acq
            public final C2181531AZj LJI(C1AZU c1azu, C2181531AZj c2181531AZj, C2181851AaF c2181851AaF) {
                C955220axs c955220axs;
                MultiGuestLayoutExtra multiGuestLayoutExtraLJII;
                MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtraLJIIIIZZ;
                boolean z;
                C1283230jUv c1283230jUvLIZLLL;
                C2182121Aag c2182121Aag;
                PosIdentity posIdentityLJI;
                MultiGuestSpotExtra multiGuestSpotExtraLJIIIZ;
                MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtraLJIIJ;
                InterfaceC951900asW interfaceC951900asW;
                DataChannel dataChannel = this.LL.LL.LJFF.getDataChannel();
                if (dataChannel != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
                    interfaceC951900asW.LJJIJ();
                }
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onPipelineWillStart: ");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(" layout_key=");
                sbLIZ2.append(c2181531AZj.LIZIZ);
                sbLIZ2.append(", layoutId=");
                sbLIZ2.append(c2181531AZj.LIZ);
                sbLIZ2.append(", ");
                sbLIZ2.append(c2181851AaF.LIZ);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLJLL("onPipelineWillStart");
                Iterator it2 = C13LP.LLIIII(this.LL.LLILZLL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2182131Aah) it2.next()).LIZJ();
                }
                String str = c2181531AZj.LIZ;
                String str2 = c2181531AZj.LIZIZ;
                long j = c2181531AZj.LIZJ;
                Map<String, C2181761Aa6> map = c2181531AZj.LIZLLL;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                Iterator<T> it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    Object key = entry.getKey();
                    C2181761Aa6 c2181761Aa6 = (C2181761Aa6) entry.getValue();
                    long j2 = c2181761Aa6.LJIIL;
                    String str3 = c2181761Aa6.LIZ;
                    double d = c2181761Aa6.LIZIZ;
                    double d2 = c2181761Aa6.LIZJ;
                    double d3 = c2181761Aa6.LIZLLL;
                    double d4 = c2181761Aa6.LJ;
                    long j3 = c2181761Aa6.LJFF;
                    double d5 = c2181761Aa6.LJI;
                    String str4 = c2181761Aa6.LJII;
                    String str5 = c2181761Aa6.LJIIIIZZ;
                    C1283230jUv c1283230jUv = c2181761Aa6.LJIIIZ;
                    if (c1283230jUv != null) {
                        posIdentityLJI = C1282000jSw.LJI(c1283230jUv);
                    } else {
                        posIdentityLJI = null;
                    }
                    String str6 = c2181761Aa6.LJIIJJI;
                    String str7 = c2181761Aa6.LJIIJ.LIZ;
                    if (str7 != null) {
                        C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                        multiGuestSpotExtraLJIIIZ = C973010bQZ.LJIIIZ(str7);
                    } else {
                        multiGuestSpotExtraLJIIIZ = null;
                    }
                    C2182121Aag c2182121Aag2 = c2181761Aa6.LJIIJ;
                    String str8 = c2182121Aag2.LIZIZ;
                    String str9 = c2182121Aag2.LIZJ;
                    if (str9 != null) {
                        C973010bQZ c973010bQZ2 = C973010bQZ.LIZ;
                        multiGuestSpotNonSeiExtraLJIIJ = C973010bQZ.LJIIJ(str9);
                    } else {
                        multiGuestSpotNonSeiExtraLJIIJ = null;
                    }
                    linkedHashMap.put(key, new C957780b20(j2, str3, d, d2, d3, d4, j3, d5, str4, str5, posIdentityLJI, str6, multiGuestSpotExtraLJIIIZ, multiGuestSpotNonSeiExtraLJIIJ, str8, c2181761Aa6.LJIIJ.LIZLLL));
                }
                double d6 = c2181531AZj.LJ;
                List<Long> list = c2181531AZj.LJI;
                C2182211Aap c2182211Aap = c2181531AZj.LJFF;
                C942140acm c942140acm = new C942140acm(c2182211Aap.LIZ, c2182211Aap.LIZIZ);
                C1AZ2 c1az2 = c2181531AZj.LJIIIIZZ;
                if (c1az2 != null) {
                    c955220axs = new C955220axs(c1az2.LIZ, c1az2.LIZIZ, c1az2.LIZJ, c1az2.LIZLLL);
                } else {
                    c955220axs = null;
                }
                String str10 = c2181531AZj.LJII.LIZ;
                if (str10 != null) {
                    C973010bQZ c973010bQZ3 = C973010bQZ.LIZ;
                    multiGuestLayoutExtraLJII = C973010bQZ.LJII(str10);
                } else {
                    multiGuestLayoutExtraLJII = null;
                }
                C2182111Aaf c2182111Aaf = c2181531AZj.LJII;
                String str11 = c2182111Aaf.LIZIZ;
                String str12 = c2182111Aaf.LIZJ;
                if (str12 != null) {
                    C973010bQZ c973010bQZ4 = C973010bQZ.LIZ;
                    multiGuestLayoutNonSeiExtraLJIIIIZZ = C973010bQZ.LJIIIIZZ(str12);
                } else {
                    multiGuestLayoutNonSeiExtraLJIIIIZZ = null;
                }
                C955310ay1 c955310ay1 = new C955310ay1(str, str2, j, linkedHashMap, d6, list, c942140acm, c955220axs, multiGuestLayoutExtraLJII, str11, multiGuestLayoutNonSeiExtraLJIIIIZZ, c2181531AZj.LJII.LIZLLL);
                if (!this.LL.LLJ && !u.LJJIIJZLJL(c2181851AaF.LIZIZ, "FromSei", false)) {
                    Iterator it4 = linkedHashMap.entrySet().iterator();
                    while (it4.hasNext()) {
                        ((C957780b20) ((Map.Entry) it4.next()).getValue()).LJII = 0.0d;
                    }
                }
                C2181501AZg c2181501AZg2 = this.LL.LLIZ;
                String str13 = c2181501AZg2.LL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("dispatch onPipelineWillStart, archType=");
                sbLIZ3.append(c1azu);
                sbLIZ3.append(", source=");
                sbLIZ3.append(c2181851AaF.LIZ);
                sbLIZ3.append(", layout_key=");
                sbLIZ3.append(c955310ay1.LIZIZ);
                sbLIZ3.append(", delegate_count=");
                sbLIZ3.append(c2181501AZg2.LLILLJJLI.size());
                sbLIZ3.append(", has_single_delegate=");
                if (c2181501AZg2.LLILLL != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ3.append(z);
                C20441214yg.LIZIZ(str13, C2188811AlT.LIZIZ(sbLIZ3));
                List listLJIL = C2097808Js.LJIL(c2181501AZg2.LLILLJJLI);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJIL) {
                    if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                        arrayList.add(obj);
                    }
                }
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    try {
                        ((InterfaceC2181591AZp) ((Pair) it5.next()).getFirst()).LJI(c955310ay1, C2181511AZh.LJFF(c2181851AaF));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJFF(c2181501AZg2.LL, "call back [onPipelineWillStart] exception", e);
                    }
                }
                try {
                    InterfaceC2181591AZp interfaceC2181591AZp = c2181501AZg2.LLILLL;
                    if (interfaceC2181591AZp != null) {
                        interfaceC2181591AZp.LJI(c955310ay1, C2181511AZh.LJFF(c2181851AaF));
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LJFF(c2181501AZg2.LL, "call back [onPipelineWillStart][single_delegate] exception", e2);
                }
                Map<String, C957780b20> map2 = c955310ay1.LIZLLL;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                Iterator<T> it6 = map2.entrySet().iterator();
                while (it6.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it6.next();
                    Object key2 = entry2.getKey();
                    long j4 = ((C957780b20) entry2.getValue()).LIZ;
                    String str14 = ((C957780b20) entry2.getValue()).LIZIZ;
                    double d7 = ((C957780b20) entry2.getValue()).LIZJ;
                    double d8 = ((C957780b20) entry2.getValue()).LIZLLL;
                    double d9 = ((C957780b20) entry2.getValue()).LJ;
                    double d10 = ((C957780b20) entry2.getValue()).LJFF;
                    long j5 = ((C957780b20) entry2.getValue()).LJI;
                    double d11 = ((C957780b20) entry2.getValue()).LJII;
                    String str15 = ((C957780b20) entry2.getValue()).LJIIIIZZ;
                    String str16 = ((C957780b20) entry2.getValue()).LJIIIZ;
                    PosIdentity posIdentity = ((C957780b20) entry2.getValue()).LJIIJ;
                    if (posIdentity != null) {
                        c1283230jUvLIZLLL = C1282000jSw.LIZLLL(posIdentity);
                    } else {
                        c1283230jUvLIZLLL = null;
                    }
                    String str17 = ((C957780b20) entry2.getValue()).LJIIJJI;
                    C2181761Aa6 c2181761Aa62 = c2181531AZj.LIZLLL.get(entry2.getKey());
                    if (c2181761Aa62 == null || (c2182121Aag = c2181761Aa62.LJIIJ) == null) {
                        c2182121Aag = new C2182121Aag(null, null, null, null);
                    }
                    linkedHashMap2.put(key2, new C2181761Aa6(str14, d7, d8, d9, d10, j5, d11, str15, str16, c1283230jUvLIZLLL, c2182121Aag, str17, j4));
                }
                C1AZ2 c1az22 = null;
                c2181531AZj.LIZ = c955310ay1.LIZ;
                c2181531AZj.LIZIZ = c955310ay1.LIZIZ;
                c2181531AZj.LIZJ = c955310ay1.LIZJ;
                c2181531AZj.LIZLLL = linkedHashMap2;
                c2181531AZj.LJ = c955310ay1.LJ;
                c2181531AZj.LJI = c955310ay1.LJFF;
                C942140acm c942140acm2 = c955310ay1.LJI;
                c2181531AZj.LJFF = new C2182211Aap(c942140acm2.LIZ, c942140acm2.LIZIZ);
                C955220axs c955220axs2 = c955310ay1.LJII;
                if (c955220axs2 != null) {
                    c1az22 = new C1AZ2(c955220axs2.LIZ, c955220axs2.LIZIZ, c955220axs2.LIZJ, c955220axs2.LIZLLL);
                }
                c2181531AZj.LJIIIIZZ = c1az22;
                c2181531AZj.LJII = new C2182111Aaf(C1516000pYM.LJFF(c955310ay1.LJIIIIZZ, new MultiGuestLayoutExtra_ProtoEncoder()), c955310ay1.LJIIIZ, C1516000pYM.LJFF(c955310ay1.LJIIJ, new MultiGuestLayoutNonSeiExtra_ProtoEncoder()), c955310ay1.LJIIJJI);
                if (!Intrinsics.LJFF(c2181531AZj, c2181531AZj)) {
                    String str18 = this.LL.LLILLL;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("onPipelineWillStart: layout model has changed, new: ");
                    sbLIZ4.append(c2181531AZj);
                    C20441214yg.LIZIZ(str18, C2188811AlT.LIZIZ(sbLIZ4));
                }
                C2181391AYv c2181391AYv2 = this.LL.LLILLJJLI;
                if (c2181391AYv2 != null) {
                    c2181391AYv2.LLJIJIL = c2181531AZj;
                }
                return c2181531AZj;
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIIJJI(C1AZU c1azu, C1AZU c1azu2, C2181851AaF c2181851AaF) {
                String str = this.LL.LLILLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutArchTypeWillSwitch: ");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(" -> ");
                sbLIZ2.append(c1azu2);
                sbLIZ2.append(", ");
                sbLIZ2.append(c2181851AaF.LIZ);
                C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LJIIJJI(c1azu, c1azu2, c2181851AaF);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIILIIL(C1AZU c1azu, C2182221Aaq c2182221Aaq, C2181851AaF c2181851AaF) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutError:");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(' ');
                sbLIZ2.append(c2182221Aaq.LIZ);
                sbLIZ2.append(' ');
                sbLIZ2.append(c2182221Aaq.LIZIZ);
                sbLIZ2.append(", ");
                sbLIZ2.append(c2181851AaF.LIZ);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                if (LinkMicPostSeiWhenParentNoReady.INSTANCE.isEnable()) {
                    this.LL.getClass();
                    if (u.LJJIIJZLJL(c2181851AaF.LIZIZ, "FromSei", false)) {
                        C2181461AZc c2181461AZc2 = this.LL;
                        c2181461AZc2.getClass();
                        c2181461AZc2.LLJJL = C13BV.INSTANCE;
                        c2181461AZc2.LLJJLIIIJLLLLLLLZ = null;
                        c2181461AZc2.LLJL = null;
                    }
                }
                C500260Jjc.LJJLIIIJILLIZJL(new C2181921AaM(this.LL, c1azu, c2182221Aaq, c2181851AaF));
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIILJJIL(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutWillEnd: ");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(' ');
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(c2181851AaF.LIZ);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                C2181481AZe c2181481AZe = this.LL.LLJLL;
                if (c2181481AZe != null) {
                    C20441214yg.LIZIZ(c2181481AZe.LLILZ, "onLayoutLayerWillEnd: render view end layout");
                    Iterator<Map.Entry<Long, C2182161Aak>> it2 = c2181481AZe.LLILZLL.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next().getValue().LIZIZ.LJJ();
                    }
                }
                this.LL.LLIZ.LJIILJJIL(c1azu, str, c2181851AaF);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIILLIIL(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
                InterfaceC951900asW interfaceC951900asW;
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutWillBegin: ");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(' ');
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(c2181851AaF.LIZ);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                DataChannel dataChannel = this.LL.LL.LJFF.getDataChannel();
                if (dataChannel != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
                    interfaceC951900asW.LJJIIZI();
                }
                this.LL.LLJLL("onLayoutWillBegin");
                this.LL.LLIZ.LJIILLIIL(c1azu, str, c2181851AaF);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIIZILJ(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
                boolean z;
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutDidEnd: ");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(' ');
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(c2181851AaF.LIZ);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                C2181461AZc c2181461AZc2 = this.LL;
                int i = c2181461AZc2.LL.LIZIZ;
                if (i != 0 && i != 4 && i == 2) {
                    z = true;
                } else {
                    z = false;
                }
                c2181461AZc2.LLJIJIL(z);
                this.LL.LJJLIIIJJI();
                C2181481AZe c2181481AZe = this.LL.LLJLL;
                if (c2181481AZe != null) {
                    String str2 = c2181481AZe.LLILZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onLayoutLayerDidEnd: release layout container: ");
                    sbLIZ3.append(z);
                    C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ3));
                    if (z) {
                        C21614919iV c21614919iV = c2181481AZe.LLJ;
                        if (c21614919iV != null) {
                            C500260Jjc.LJJJLL(c21614919iV);
                            c2181481AZe.LLJ = null;
                        }
                        FrameLayout frameLayout = c2181481AZe.LLJILJIL;
                        if (frameLayout != null) {
                            if (c2181481AZe.LJJII(frameLayout)) {
                                C500260Jjc.LJJJLL(frameLayout);
                            }
                            c2181481AZe.LLJILJIL = null;
                            c2181481AZe.LLJIJIL = 0L;
                        }
                        c2181481AZe.LLILZIL.remove(Long.valueOf(c2181481AZe.LLJI));
                        c2181481AZe.LLJI = 0L;
                    }
                }
                this.LL.LLIZ.LJIIZILJ(c1azu, str, c2181851AaF);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIJ(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutDidBegin: ");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(' ');
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(c2181851AaF.LIZ);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LJIJ(c1azu, str, c2181851AaF);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIJJ(C1AZU c1azu, C2182171Aal c2182171Aal, C2181851AaF c2181851AaF) {
                boolean z;
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sb = new StringBuilder("onLayoutDidChanged, ");
                sb.append(c2181851AaF.LIZ);
                sb.append(", ");
                sb.append(c1azu);
                sb.append(" result:");
                List<C2181741Aa4> list = c2182171Aal.LIZ.LIZLLL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C2181741Aa4> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C2181511AZh.LJIIJJI(it2.next()));
                }
                sb.append(arrayList);
                c2181461AZc.LLJJL(sb.toString());
                C942080acg c942080acgLLJZ = this.LL.LLJZ(c2182171Aal);
                C2181501AZg c2181501AZg2 = this.LL.LLIZ;
                String str = c2181501AZg2.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("dispatch onLayoutDidChanged, archType=");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(", source=");
                sbLIZ2.append(c2181851AaF.LIZ);
                sbLIZ2.append(", delegate_count=");
                sbLIZ2.append(c2181501AZg2.LLILLJJLI.size());
                sbLIZ2.append(", has_single_delegate=");
                if (c2181501AZg2.LLILLL != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ2.append(z);
                C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
                List listLJIL = C2097808Js.LJIL(c2181501AZg2.LLILLJJLI);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listLJIL) {
                    if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    try {
                        ((InterfaceC2181591AZp) ((Pair) it3.next()).getFirst()).LJIILLIIL(c942080acgLLJZ, C2181511AZh.LJFF(c2181851AaF));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJFF(c2181501AZg2.LL, "call back [onLayoutDidChanged] exception", e);
                    }
                }
                try {
                    InterfaceC2181591AZp interfaceC2181591AZp = c2181501AZg2.LLILLL;
                    if (interfaceC2181591AZp != null) {
                        interfaceC2181591AZp.LJIILLIIL(c942080acgLLJZ, C2181511AZh.LJFF(c2181851AaF));
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LJFF(c2181501AZg2.LL, "call back [onLayoutDidChanged][single_delegate] exception", e2);
                }
            }

            @Override // X.InterfaceC2183461Acq
            public final void LIZ(C1AZU c1azu, C1283230jUv c1283230jUv, C1CXK c1cxk, C1CXK c1cxk2) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onRtcConnectionStateChange: archType=");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(", identity=");
                sbLIZ2.append(c1283230jUv);
                sbLIZ2.append(", oldState=");
                sbLIZ2.append(c1cxk);
                sbLIZ2.append(", newState=");
                sbLIZ2.append(c1cxk2);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LIZ(c1azu, c1283230jUv, c1cxk, c1cxk2);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJ(C1AZU c1azu, C1283230jUv c1283230jUv, boolean z, boolean z2) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onVideoMuteStateChanged: archType=");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(", identity=");
                sbLIZ2.append(c1283230jUv);
                sbLIZ2.append(", oldState=");
                sbLIZ2.append(z);
                sbLIZ2.append(", newState=");
                sbLIZ2.append(z2);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LJ(c1azu, c1283230jUv, z, z2);
            }

            /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01b9 A[Catch: Exception -> 0x01c1, TryCatch #2 {Exception -> 0x01c1, blocks: (B:72:0x01b5, B:74:0x01b9), top: B:83:0x01b5 }] */
            @Override // X.InterfaceC2183461Acq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJII(X.C1AZU r11, java.util.List<X.C2181741Aa4> r12, X.C2182111Aaf r13, X.C2181851AaF r14) {
                /*
                    Method dump skipped, instruction units count: 461
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2181491AZf.LJII(X.1AZU, java.util.List, X.1Aaf, X.1AaF):void");
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIIIIZZ(C1AZU c1azu, C1283230jUv c1283230jUv, boolean z, boolean z2) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onAudioOccupiedChanged: archType=");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(", identity=");
                sbLIZ2.append(c1283230jUv.LIZIZ);
                sbLIZ2.append(", oldState=");
                sbLIZ2.append(z);
                sbLIZ2.append(", newState=");
                sbLIZ2.append(z2);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LJIIIIZZ(c1azu, c1283230jUv, z, z2);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIIIZ(C1AZU c1azu, C1283230jUv c1283230jUv, C1CXJ c1cxj, C1CXJ c1cxj2) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onOnlineStateChanged: archType=");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(", identity=");
                sbLIZ2.append(c1283230jUv);
                sbLIZ2.append(", oldState=");
                sbLIZ2.append(c1cxj);
                sbLIZ2.append(", newState=");
                sbLIZ2.append(c1cxj2);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LJIIIZ(c1azu, c1283230jUv, c1cxj, c1cxj2);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIIJ(C1AZU c1azu, C1283230jUv c1283230jUv, C1CWQ c1cwq, C1CWQ c1cwq2) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onWinStateChanged: archType=");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(", identity=");
                sbLIZ2.append(c1283230jUv.LIZIZ);
                sbLIZ2.append(", oldState=");
                sbLIZ2.append(c1cwq);
                sbLIZ2.append(", newState=");
                sbLIZ2.append(c1cwq2);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LJIIJ(c1azu, c1283230jUv, c1cwq, c1cwq2);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIIL(C1AZU c1azu, C1283230jUv c1283230jUv, boolean z, boolean z2) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onAudioMuteStateChanged: archType=");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(", identity=");
                sbLIZ2.append(c1283230jUv.LIZIZ);
                sbLIZ2.append(", oldState=");
                sbLIZ2.append(z);
                sbLIZ2.append(", newState=");
                sbLIZ2.append(z2);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LJIIL(c1azu, c1283230jUv, z, z2);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIILL(C1AZU c1azu, C1283230jUv c1283230jUv, C1CX5 c1cx5, C1CX5 c1cx52) {
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onNetworkQualityChanged: archType=");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(", identity=");
                sbLIZ2.append(c1283230jUv);
                sbLIZ2.append(", oldState=");
                sbLIZ2.append(c1cx5);
                sbLIZ2.append(", newState=");
                sbLIZ2.append(c1cx52);
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLIZ.LJIILL(c1azu, c1283230jUv, c1cx5, c1cx52);
            }

            @Override // X.InterfaceC2183461Acq
            public final void LJIJI(C1AZU c1azu, C2182031AaX c2182031AaX, List<C2181811AaB> list, C2181851AaF c2181851AaF) {
                MultiGuestLayoutExtra multiGuestLayoutExtraLJII;
                MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtraLJIIIIZZ;
                C2181961AaQ c2181961AaQ;
                C2182111Aaf c2182111Aaf;
                C2181461AZc c2181461AZc = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutInfoUpdated: archType:");
                sbLIZ2.append(c1azu);
                sbLIZ2.append(", source:");
                sbLIZ2.append(c2181851AaF.LIZ);
                sbLIZ2.append(", layout_key:");
                sbLIZ2.append(c2182031AaX.LIZIZ);
                sbLIZ2.append(", spot_size:");
                ArrayList arrayList = (ArrayList) list;
                sbLIZ2.append(arrayList.size());
                c2181461AZc.LLJJL(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLJLIL(c2181851AaF.LIZ);
                this.LL.LLJLL("onLayoutInfoUpdated");
                C2181461AZc c2181461AZc2 = this.LL;
                c2181461AZc2.LLJIJIL = c2182031AaX;
                c2181461AZc2.LLJILJIL = list;
                Iterator it2 = C13LP.LLIIII(c2181461AZc2.LLILZLL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2182131Aah) it2.next()).LIZIZ();
                }
                try {
                    String str = c2182031AaX.LIZ;
                    String str2 = c2182031AaX.LIZIZ;
                    String str3 = c2182031AaX.LIZJ;
                    MultiGuestLayoutExtra multiGuestLayoutExtraLJII2 = null;
                    if (str3 != null) {
                        C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                        multiGuestLayoutExtraLJII = C973010bQZ.LJII(str3);
                    } else {
                        multiGuestLayoutExtraLJII = null;
                    }
                    String str4 = c2182031AaX.LIZLLL;
                    String str5 = c2182031AaX.LJ;
                    if (str5 != null) {
                        C973010bQZ c973010bQZ2 = C973010bQZ.LIZ;
                        multiGuestLayoutNonSeiExtraLJIIIIZZ = C973010bQZ.LJIIIIZZ(str5);
                    } else {
                        multiGuestLayoutNonSeiExtraLJIIIIZZ = null;
                    }
                    C955320ay2 c955320ay2 = new C955320ay2(str, str2, multiGuestLayoutExtraLJII, str4, multiGuestLayoutNonSeiExtraLJIIIIZZ, c2182031AaX.LJFF);
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(C2181511AZh.LJ((C2181811AaB) it3.next()));
                    }
                    this.LL.getClass();
                    C2181461AZc c2181461AZc3 = this.LL;
                    c2181461AZc3.LLJILJILJ = arrayList2;
                    C2182171Aal c2182171Aal = c2181461AZc3.LLILZ;
                    if (c2182171Aal != null && (c2181961AaQ = c2182171Aal.LIZ) != null && (c2182111Aaf = c2181961AaQ.LJFF) != null) {
                        c2182111Aaf.LIZ = c2182031AaX.LIZJ;
                    }
                    C2181501AZg c2181501AZg2 = c2181461AZc3.LLIZ;
                    String str6 = c2182031AaX.LIZJ;
                    if (str6 != null) {
                        C973010bQZ c973010bQZ3 = C973010bQZ.LIZ;
                        multiGuestLayoutExtraLJII2 = C973010bQZ.LJII(str6);
                    }
                    c2181501AZg2.LJIJJLI(c1azu, c955320ay2, arrayList2, multiGuestLayoutExtraLJII2, c2181851AaF);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJ(this.LL.LLILLL, "onLayoutInfoUpdated error: " + th.getMessage());
                }
            }
        };
        this.LLJJJIL = C452501pT.LIZIZ(new C2181891AaJ());
        C972840bQI c972840bQI = new C972840bQI(this.LL, this);
        c2181501AZg.LLILZ = c972840bQI;
        this.LLJJJJLIIL = c972840bQI;
        this.LLJJL = C13BV.INSTANCE;
        this.LLJLLIL = new AtomicBoolean(false);
        this.LLJLLL = new AtomicInteger(0);
        this.LLJZ = new AtomicLong(0L);
        this.LLL = new ArrayList();
        this.LLLF = C452501pT.LIZIZ(new C967750bI5(this));
    }

    @Override // X.InterfaceC937900aVw
    public final void LJIILLIIL(String str, C1AYC c1ayc) {
        ((HashMap) this.LLJJJIL.getValue()).put(str, c1ayc);
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJJJJZI(LinkUser linkUser, boolean z) {
        InterfaceC2181691AZz interfaceC2181691AZz;
        String str;
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            interfaceC2181691AZz = c2181481AZe.LLIZ;
        } else {
            interfaceC2181691AZz = null;
        }
        if (linkUser == null || (str = linkUser.linkMicId) == null) {
            str = "";
        }
        LLJLLL(str, interfaceC2181691AZz, "update room owner user with diff");
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJJZ(EnumC965730bEp enumC965730bEp, InterfaceC2181591AZp interfaceC2181591AZp) {
        C2181501AZg c2181501AZg = this.LLIZ;
        String str = c2181501AZg.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addLayoutDelegate: ");
        sbLIZ.append(enumC965730bEp);
        sbLIZ.append(", ");
        sbLIZ.append(interfaceC2181591AZp.hashCode());
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        c2181501AZg.LLILLJJLI.put(interfaceC2181591AZp, enumC965730bEp);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLJLLL(String str, boolean z) {
        FrameLayout frameLayoutLJIILLIIL;
        this.LLJ = z;
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            frameLayoutLJIILLIIL = c2181481AZe.LJIILLIIL();
        } else {
            frameLayoutLJIILLIIL = null;
        }
        if (frameLayoutLJIILLIIL instanceof C21614919iV) {
            ((C21614919iV) frameLayoutLJIILLIIL).setEnableRoundCornerRadius(z);
        }
        C2181391AYv c2181391AYv = this.LLILLJJLI;
        if (c2181391AYv != null) {
            c2181391AYv.setEnableRoundCorner(z);
        }
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnableCornerRadius, enable: ");
        sbLIZ.append(z);
        sbLIZ.append(", source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJLLLL(EnumC965630bEf enumC965630bEf, C917100ZyO c917100ZyO) {
        String str;
        C2181431AYz c2181431AYz;
        boolean z;
        C2182031AaX c2182031AaX = this.LLJIJIL;
        if (c2182031AaX == null || (str = c2182031AaX.LIZIZ) == null) {
            C2181861AaG c2181861AaG = this.LLJJLIIIJLLLLLLLZ;
            if (c2181861AaG != null && (c2181431AYz = c2181861AaG.LIZIZ) != null) {
                str = c2181431AYz.LIZIZ;
            } else {
                str = null;
            }
        }
        if (str != null) {
            String str2 = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dropLayout, source=");
            sbLIZ.append(enumC965630bEf.getValue());
            sbLIZ.append(", bizSource=");
            sbLIZ.append(c917100ZyO);
            sbLIZ.append(", layout_key=");
            sbLIZ.append(str);
            C20441214yg.LJFF(str2, C2188811AlT.LIZIZ(sbLIZ), new RuntimeException());
            LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
            if (linkMicLayoutLayer != null) {
                linkMicLayoutLayer.LIZIZ(C2181511AZh.LJIIIIZZ(enumC965630bEf), C2181511AZh.LJII(c917100ZyO));
            }
        } else {
            String str3 = this.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dropLayout, source=");
            sbLIZ2.append(enumC965630bEf.getValue());
            sbLIZ2.append(", bizSource=");
            sbLIZ2.append(c917100ZyO);
            sbLIZ2.append(", layout_key=null");
            C20441214yg.LJ(str3, C2188811AlT.LIZIZ(sbLIZ2));
        }
        int i = this.LL.LIZIZ;
        if (i != 0 && i != 4 && i == 2) {
            z = true;
        } else {
            z = false;
        }
        LLJIJIL(z);
        LJJLIIIJJI();
    }

    @Override // X.InterfaceC2181771Aa7
    public final void LLFF(int i, int i2) {
        Long lValueOf;
        C2182101Aae c2182101Aae;
        C2182101Aae c2182101Aae2;
        long jTimestamp;
        int i3;
        SeiCanvas seiCanvas;
        SeiCanvas seiCanvas2;
        if (!LLIILII()) {
            C20441214yg.LIZIZ(this.LLILLL, "notifyVideoSizeChange, ignore, not initialized");
            return;
        }
        C2181861AaG c2181861AaG = this.LLJJLIIIJLLLLLLLZ;
        Long lValueOf2 = null;
        if (c2181861AaG != null && i != 0 && i2 != 0) {
            C2182101Aae c2182101Aae3 = c2181861AaG.LIZLLL;
            if (i != ((int) c2182101Aae3.LIZ) || i2 != ((int) c2182101Aae3.LIZIZ)) {
                InterfaceC940430aa1 interfaceC940430aa1 = this.LLJLIL;
                if (interfaceC940430aa1 == null) {
                    C20441214yg.LIZIZ(this.LLILLL, "notifyVideoSizeChange, ignore, last sei is null");
                    return;
                }
                SeiAppData seiAppDataLIZ = interfaceC940430aa1.LIZ();
                if (seiAppDataLIZ != null) {
                    jTimestamp = seiAppDataLIZ.timestamp;
                } else {
                    jTimestamp = interfaceC940430aa1.timestamp();
                }
                SeiAppData seiAppDataLIZ2 = interfaceC940430aa1.LIZ();
                int i4 = 0;
                if (seiAppDataLIZ2 != null && (seiCanvas2 = seiAppDataLIZ2.canvas) != null) {
                    i3 = seiCanvas2.width;
                } else {
                    i3 = 0;
                }
                SeiAppData seiAppDataLIZ3 = interfaceC940430aa1.LIZ();
                if (seiAppDataLIZ3 != null && (seiCanvas = seiAppDataLIZ3.canvas) != null) {
                    i4 = seiCanvas.height;
                }
                if (i3 != 0 && i4 != 0) {
                    if (Math.abs(((i * 1.0f) / i2) - ((i3 * 1.0f) / i4)) > 0.001f) {
                        C20441214yg.LIZIZ(this.LLILLL, "notifyVideoSizeChange, ignore, video ratio not match");
                        return;
                    }
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("notifyVideoSizeChange, request layout, sei ts:");
                    sbLIZ.append(jTimestamp);
                    sbLIZ.append(", last:");
                    sbLIZ.append(c2181861AaG.LIZLLL.LIZ);
                    sbLIZ.append('x');
                    sbLIZ.append(c2181861AaG.LIZLLL.LIZIZ);
                    sbLIZ.append(", new:");
                    sbLIZ.append(i);
                    sbLIZ.append('x');
                    sbLIZ.append(i2);
                    C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    LLJJJIL(null, interfaceC940430aa1, true, 3);
                    return;
                }
                C20441214yg.LIZIZ(this.LLILLL, "notifyVideoSizeChange, ignore, expect canvas size in valid");
                return;
            }
        }
        String str2 = this.LLILLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("notifyVideoSizeChange, ignore, invalid resolution, last:");
        if (c2181861AaG != null && (c2182101Aae2 = c2181861AaG.LIZLLL) != null) {
            lValueOf = Long.valueOf(c2182101Aae2.LIZ);
        } else {
            lValueOf = null;
        }
        sbLIZ2.append(lValueOf);
        sbLIZ2.append('x');
        if (c2181861AaG != null && (c2182101Aae = c2181861AaG.LIZLLL) != null) {
            lValueOf2 = Long.valueOf(c2182101Aae.LIZIZ);
        }
        sbLIZ2.append(lValueOf2);
        sbLIZ2.append(", new:");
        sbLIZ2.append(i);
        sbLIZ2.append('x');
        sbLIZ2.append(i2);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC940060aZQ
    public final void LLFFF(ViewGroup viewGroup, C917100ZyO c917100ZyO) {
        LLJJJJJIL(viewGroup, null, true, C2181511AZh.LJII(c917100ZyO));
    }

    @Override // X.InterfaceC940060aZQ
    public final void LLIIJI(Rect rect, C917100ZyO c917100ZyO) {
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            LLJJJJJIL(viewGroup, rect, true, C2181511AZh.LJII(c917100ZyO));
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LLILZIL(AbstractC946520ajq abstractC946520ajq, String str) {
        String strLJIIJJI;
        String strLJIIJJI2;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set stream player: isUnion:");
        sbLIZ.append(this.LL.LJFF.LJJIJ());
        sbLIZ.append(", old:");
        C2181561AZm c2181561AZm = this.LLJLILLLLZIIL;
        C2181561AZm c2181561AZm2 = null;
        if (c2181561AZm != null) {
            strLJIIJJI = C500260Jjc.LJIIJJI(c2181561AZm);
        } else {
            strLJIIJJI = null;
        }
        sbLIZ.append(strLJIIJJI);
        sbLIZ.append(", new: ");
        if (abstractC946520ajq != null) {
            strLJIIJJI2 = C500260Jjc.LJIIJJI(abstractC946520ajq);
        } else {
            strLJIIJJI2 = null;
        }
        sbLIZ.append(strLJIIJJI2);
        sbLIZ.append(", source: ");
        sbLIZ.append(str);
        C20441214yg.LJIIL(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL.LJFF.LJJIJ()) {
            return;
        }
        C2181561AZm c2181561AZm3 = this.LLJLILLLLZIIL;
        if (c2181561AZm3 != null) {
            c2181561AZm3.LIZIZ();
        }
        if (abstractC946520ajq != null) {
            c2181561AZm2 = new C2181561AZm(abstractC946520ajq);
            LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
            if (linkMicLayoutLayer != null) {
                linkMicLayoutLayer.LJJIZ(c2181561AZm2);
            }
        }
        this.LLJLILLLLZIIL = c2181561AZm2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LLJI(com.bytedance.android.livesdk.sei.SeiAppData r6, long r7) {
        /*
            r5 = this;
            com.bytedance.android.livesdk.sei.SeiContainerInfo r4 = r6.linkMicContainer
            X.1AZm r0 = r5.LLJLILLLLZIIL
            if (r0 == 0) goto L25
            X.1Aae r3 = r0.LIZ()
            if (r3 == 0) goto L25
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            long r0 = r3.LIZ
            r2.append(r0)
            r0 = 120(0x78, float:1.68E-43)
            r2.append(r0)
            long r0 = r3.LIZIZ
            r2.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)
            if (r2 != 0) goto L27
        L25:
            java.lang.String r2 = "null"
        L27:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ts="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", channel="
            r1.append(r0)
            java.lang.String r0 = r6.channelId
            r1.append(r0)
            java.lang.String r0 = ", group_channel="
            r1.append(r0)
            java.lang.String r0 = r6.groupChannelId
            r1.append(r0)
            java.lang.String r0 = ", layout_key="
            r1.append(r0)
            r3 = 0
            if (r4 == 0) goto Lbf
            java.lang.String r0 = r4.layoutKey
        L51:
            r1.append(r0)
            java.lang.String r0 = ", dsl_ver="
            r1.append(r0)
            if (r4 == 0) goto Lbd
            int r0 = r4.dslVersion
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L61:
            r1.append(r0)
            java.lang.String r0 = ", scene_from_dsl="
            r1.append(r0)
            int r0 = r6.LJIIJ()
            r1.append(r0)
            java.lang.String r0 = ", linker_arch="
            r1.append(r0)
            int r0 = r6.linkerArchType
            r1.append(r0)
            java.lang.String r0 = ", is_union="
            r1.append(r0)
            boolean r0 = r6.LJIJ()
            r1.append(r0)
            java.lang.String r0 = ", grids="
            r1.append(r0)
            java.util.List<com.bytedance.android.livesdk.sei.SeiRegion> r0 = r6.grids
            if (r0 == 0) goto Lbb
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L97:
            r1.append(r0)
            java.lang.String r0 = ", empty_grids="
            r1.append(r0)
            java.util.List<com.bytedance.android.livesdk.sei.SeiEmptyRegion> r0 = r6.emptyGrids
            if (r0 == 0) goto Lab
            int r0 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        Lab:
            r1.append(r3)
            java.lang.String r0 = ", player_res="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        Lbb:
            r0 = r3
            goto L97
        Lbd:
            r0 = r3
            goto L61
        Lbf:
            r0 = r3
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181461AZc.LLJI(com.bytedance.android.livesdk.sei.SeiAppData, long):java.lang.String");
    }

    public final void LLJILLL(final View view, final Runnable runnable) {
        String str = "anchor";
        if (view.getWidth() > 0) {
            String str2 = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doAfterHasSize: execute runnable, post times:");
            sbLIZ.append(this.LLLFFI);
            sbLIZ.append(", width: ");
            sbLIZ.append(view.getWidth());
            sbLIZ.append(", height: ");
            sbLIZ.append(view.getHeight());
            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            runnable.run();
            int i = this.LLLFFI;
            if (i > 0) {
                HashMap map = new HashMap();
                map.put("function_name", "interactionLayer_post_work");
                if (!this.LL.LJIIIIZZ) {
                    str = "guest";
                }
                map.put("to_user_type", str);
                map.put("error_msg", String.valueOf(i));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_function_call_result");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
                this.LLLFFI = 0;
                return;
            }
            return;
        }
        if (this.LLJZIJLIL) {
            String str3 = this.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("doAfterHasSize: has been destroyed, post times:");
            sbLIZ2.append(this.LLLFFI);
            C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
            int i2 = this.LLLFFI;
            HashMap map2 = new HashMap();
            map2.put("function_name", "interactionLayer_post_but_destroy");
            if (!this.LL.LJIIIIZZ) {
                str = "guest";
            }
            map2.put("to_user_type", str);
            map2.put("error_msg", String.valueOf(i2));
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_multi_function_call_result");
            c474500IjALIZ2.LJJIIZI(map2);
            c474500IjALIZ2.LIZ();
            return;
        }
        int iTimes = LinkMicLayerPostSetting.INSTANCE.times();
        if (iTimes > 0 && this.LLLFFI > iTimes) {
            String str4 = this.LLILLL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("doAfterHasSize: over post times, post times:");
            sbLIZ3.append(this.LLLFFI);
            sbLIZ3.append(", limit:");
            sbLIZ3.append(iTimes);
            sbLIZ3.append(", attached:");
            sbLIZ3.append(view.isAttachedToWindow());
            sbLIZ3.append(", visible:");
            sbLIZ3.append(view.getVisibility());
            sbLIZ3.append(", size:");
            sbLIZ3.append(view.getWidth());
            sbLIZ3.append('x');
            sbLIZ3.append(view.getHeight());
            C20441214yg.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ3));
            int i3 = this.LLLFFI;
            HashMap map3 = new HashMap();
            map3.put("function_name", "interactionLayer_post_but_post_reached");
            if (!this.LL.LJIIIIZZ) {
                str = "guest";
            }
            map3.put("to_user_type", str);
            map3.put("error_msg", String.valueOf(i3));
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_multi_function_call_result");
            c474500IjALIZ3.LJJIIZI(map3);
            c474500IjALIZ3.LIZ();
            return;
        }
        if (this.LLLFF) {
            view.getWidth();
            view.getHeight();
        }
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0uKl
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkMicLayoutLayerProxy@8b37.doAfterHasSize$1");
                try {
                    this.LL.LLJILLL(view, runnable);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkMicLayoutLayerProxy@8b37.doAfterHasSize$1");
            }
        });
        this.LLLFFI++;
        this.LLLFF = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a9  */
    /* JADX WARN: Type inference failed for: r43v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2181861AaG LLJJIJIL(com.bytedance.android.livesdk.sei.SeiAppData r45, long r46) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181461AZc.LLJJIJIL(com.bytedance.android.livesdk.sei.SeiAppData, long):X.1AaG");
    }

    public final void LLJJLIIIJLLLLLLLZ(String str, SurfaceView surfaceView) {
        InterfaceC2181691AZz interfaceC2181691AZzLJIJ;
        C2177681AKo c2177681AKo;
        int iHashCode;
        C2181481AZe c2181481AZe = this.LLJLL;
        String strLJIIL = null;
        if (c2181481AZe != null) {
            interfaceC2181691AZzLJIJ = c2181481AZe.LJIJ(str);
        } else {
            interfaceC2181691AZzLJIJ = null;
        }
        if (!(interfaceC2181691AZzLJIJ instanceof C2177681AKo) || (c2177681AKo = (C2177681AKo) interfaceC2181691AZzLJIJ) == null || !Intrinsics.LJFF(c2177681AKo.LIZ, surfaceView)) {
            c2177681AKo = null;
        }
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAuxRTCView: streamId=");
        sbLIZ.append(str);
        sbLIZ.append(", surfaceView=");
        if (surfaceView != null) {
            strLJIIL = C500260Jjc.LJIIL(surfaceView);
        }
        sbLIZ.append(strLJIIL);
        sbLIZ.append(", cache:");
        if (c2177681AKo != null) {
            iHashCode = c2177681AKo.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (c2177681AKo == null) {
            c2177681AKo = new C2177681AKo(surfaceView, str, true);
            c2177681AKo.init();
        }
        if (!Intrinsics.LJFF(c2177681AKo.LIZ, surfaceView)) {
            c2177681AKo.LIZ = surfaceView;
        }
        C2181481AZe c2181481AZe2 = this.LLJLL;
        if (c2181481AZe2 != null) {
            c2181481AZe2.LJJIII(c2177681AKo);
        }
        LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
        if (linkMicLayoutLayer != null) {
            linkMicLayoutLayer.LJI(C1283930jW3.LIZIZ(c2177681AKo), str);
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2181871AaH(this, str));
    }

    public final void LLJL(String str, SurfaceView surfaceView) {
        InterfaceC2181691AZz interfaceC2181691AZzLJIJ;
        C2177681AKo c2177681AKo;
        int iHashCode;
        C2181481AZe c2181481AZe = this.LLJLL;
        String strLJIIL = null;
        if (c2181481AZe != null) {
            interfaceC2181691AZzLJIJ = c2181481AZe.LJIJ(str);
        } else {
            interfaceC2181691AZzLJIJ = null;
        }
        if (!(interfaceC2181691AZzLJIJ instanceof C2177681AKo) || (c2177681AKo = (C2177681AKo) interfaceC2181691AZzLJIJ) == null || !Intrinsics.LJFF(c2177681AKo.LIZ, surfaceView)) {
            c2177681AKo = null;
        }
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRTCView: linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(", surfaceView=");
        if (surfaceView != null) {
            strLJIIL = C500260Jjc.LJIIL(surfaceView);
        }
        sbLIZ.append(strLJIIL);
        sbLIZ.append(", cache:");
        if (c2177681AKo != null) {
            iHashCode = c2177681AKo.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (c2177681AKo == null) {
            c2177681AKo = new C2177681AKo(surfaceView, str, false);
            c2177681AKo.init();
        }
        C2181481AZe c2181481AZe2 = this.LLJLL;
        if (c2181481AZe2 != null) {
            c2181481AZe2.LJJIII(c2177681AKo);
        }
        LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
        if (linkMicLayoutLayer != null) {
            linkMicLayoutLayer.LJI(C1283930jW3.LIZIZ(c2177681AKo), str);
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2181881AaI(this, str));
    }

    public final void LLJZIJLIL(final String str, final SurfaceView surfaceView) {
        String strLJIIL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRtcViewSafe: linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(", surfaceView=");
        if (surfaceView != null) {
            strLJIIL = C500260Jjc.LJIIL(surfaceView);
        } else {
            strLJIIL = null;
        }
        sbLIZ.append(strLJIIL);
        sbLIZ.append(", init:");
        sbLIZ.append(LLIILII());
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (!LLIILII()) {
            ((ArrayList) this.LLL).add(new Runnable() { // from class: X.14gY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LinkMicLayoutLayerProxy@8b37.updateRtcViewSafe$1");
                    try {
                        this.LL.LLJL(str, surfaceView);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LinkMicLayoutLayerProxy@8b37.updateRtcViewSafe$1");
                }
            });
            return;
        }
        LLJL(str, surfaceView);
    }

    public final void LLL(int i, String str) {
        if (LinkMicSdkLayoutLayerEnableSetupV2.INSTANCE.isEnable()) {
            String str2 = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateSetupStatus: ");
            sbLIZ.append(str);
            sbLIZ.append(", old:");
            sbLIZ.append(this.LLJLLL.get());
            sbLIZ.append(", new:");
            sbLIZ.append(i);
            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            this.LLJLLL.set(i);
        }
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJJIJ(EnumC965730bEp enumC965730bEp, EnumC965630bEf enumC965630bEf, C917100ZyO c917100ZyO) {
        LinkMicLayoutLayer linkMicLayoutLayer;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeLayoutModel: archType:");
        sbLIZ.append(enumC965730bEp);
        sbLIZ.append(", source:");
        sbLIZ.append(enumC965630bEf.getValue());
        sbLIZ.append(", bizSource:");
        sbLIZ.append(c917100ZyO);
        sbLIZ.append(", hasSetupAndInitialized:");
        sbLIZ.append(LLIILII());
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (LLIILII() && (linkMicLayoutLayer = this.LLJJJJ) != null) {
            linkMicLayoutLayer.LJIILL(enumC965730bEp.getLinkArchType(), C2181511AZh.LJIIIIZZ(enumC965630bEf), C2181511AZh.LJII(c917100ZyO));
        }
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJJJ(View view, boolean z, String str) throws Throwable {
        Integer numValueOf;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchToSingleRenderView: enable=");
        sbLIZ.append(z);
        sbLIZ.append(", singleView:");
        if (view != null) {
            numValueOf = Integer.valueOf(view.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIIJIL = view;
        if (z) {
            C2181481AZe c2181481AZe = this.LLJLL;
            if (c2181481AZe != null) {
                C500260Jjc.LJJLIIIJILLIZJL(new C2181821AaC(view, c2181481AZe));
            }
            C2182171Aal c2182171Aal = this.LLILZ;
            if (c2182171Aal != null) {
                LLLF(c2182171Aal);
            }
        } else {
            C2181481AZe c2181481AZe2 = this.LLJLL;
            if (c2181481AZe2 != null) {
                C500260Jjc.LJJLIIIJILLIZJL(new C2181821AaC(null, c2181481AZe2));
            }
        }
        C2181501AZg c2181501AZg = this.LLIZ;
        Iterator it2 = C2097808Js.LJIL(c2181501AZg.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LIZ(str, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(c2181501AZg.LL, "call back [onSingleViewModeChange] exception", e);
            }
        }
        InterfaceC2181591AZp interfaceC2181591AZp = c2181501AZg.LLILLL;
        if (interfaceC2181591AZp != null) {
            interfaceC2181591AZp.LIZ(str, z);
        }
    }

    @Override // X.InterfaceC2182091Aad
    public final void LJJJJL(String str, float f, boolean z) {
        this.LL.LJFF.LJJIJIL(str, f, z);
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJJLIIJ(final LayoutData layoutData, final String str, final String str2) throws JSONException {
        String str3;
        String str4;
        int i;
        String str5;
        String str6 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLayoutV2: layoutData=");
        JSONObject jSONObject = new JSONObject();
        LayoutState layoutState = layoutData.layout;
        if (layoutState == null || (str3 = layoutState.layoutKey) == null) {
            str3 = "";
        }
        jSONObject.put("layout_key", str3);
        LayoutState layoutState2 = layoutData.layout;
        if (layoutState2 == null || (str4 = layoutState2.layoutId) == null) {
            str4 = "";
        }
        jSONObject.put("layout_id", str4);
        List<SpotInfo> list = layoutData.spotList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (SpotInfo spotInfo : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("spot_id", spotInfo.spotId);
            PosIdentity posIdentity = spotInfo.posIdentity;
            if (posIdentity != null) {
                i = posIdentity.type;
            } else {
                i = -1;
            }
            jSONObject2.put("pos_type", i);
            PosIdentity posIdentity2 = spotInfo.posIdentity;
            if (posIdentity2 == null || (str5 = posIdentity2.value) == null) {
                str5 = "";
            }
            jSONObject2.put("pos_value", str5);
            arrayList.add(jSONObject2);
        }
        jSONObject.put("spot_list", arrayList);
        sbLIZ.append(jSONObject);
        C20441214yg.LIZIZ(str6, C2188811AlT.LIZIZ(sbLIZ));
        Runnable runnable = new Runnable() { // from class: X.1Ab7
            public final void LIZ() {
                String str7;
                String str8;
                LinkMicLayoutLayer linkMicLayoutLayer;
                String str9;
                int i2;
                ByteBuffer byteBufferAllocateDirect;
                int i3;
                List<String> list2;
                int i4;
                ByteBuffer byteBufferAllocateDirect2;
                String str10 = this.LL.LLILLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("try call update layout to rust, layout_key:");
                LayoutState layoutState3 = layoutData.layout;
                if (layoutState3 == null || (str7 = layoutState3.layoutKey) == null) {
                    str7 = "null";
                }
                sbLIZ2.append(str7);
                sbLIZ2.append(", viewParent:");
                ViewGroup viewGroup = this.LL.LLJJIII;
                sbLIZ2.append(viewGroup != null ? Integer.valueOf(viewGroup.hashCode()) : null);
                sbLIZ2.append(", source=");
                sbLIZ2.append(str2);
                C20441214yg.LIZIZ(str10, C2188811AlT.LIZIZ(sbLIZ2));
                LayoutData layoutData2 = layoutData;
                String str11 = str;
                String str12 = str2;
                LayoutState layoutState4 = layoutData2.layout;
                if (layoutState4 != null) {
                    String str13 = layoutState4.layoutId;
                    String str14 = layoutState4.layoutKey;
                    MultiGuestLayoutExtra multiGuestLayoutExtra = layoutState4.multiGuestLayoutExtra;
                    if (multiGuestLayoutExtra != null) {
                        long j = multiGuestLayoutExtra.originLayoutStyle;
                        long j2 = multiGuestLayoutExtra.currentLayoutStyle;
                        long j3 = multiGuestLayoutExtra.originMaxPosition;
                        long j4 = multiGuestLayoutExtra.currentMaxPosition;
                        long j5 = multiGuestLayoutExtra.enlargeStatus;
                        long j6 = multiGuestLayoutExtra.currentPanelLayoutType;
                        byte[] bArrLIZ = C1515990pYL.LIZ(multiGuestLayoutExtra.socialGame, new SocialGameLayoutExtra_ProtoEncoder());
                        C2237291ChT c2237291ChT = new C2237291ChT(new C2237321ChW(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), bArrLIZ != null ? ByteString.of(Arrays.copyOf(bArrLIZ, bArrLIZ.length)) : null));
                        int iEncodedSize = C2237291ChT.ADAPTER.encodedSize(c2237291ChT);
                        if (iEncodedSize > 0) {
                            byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iEncodedSize);
                            c2237291ChT.encode(new C1283530jVP(byteBufferAllocateDirect2));
                            i4 = 0;
                        } else {
                            i4 = 0;
                            byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(0);
                        }
                        ByteBuffer byteBufferMoltenFfiNativeConvertMultiGuestLayoutExtraToBase64X4734355880332862199 = MoltenFfiLinkMicSdk.MoltenFfiNativeConvertMultiGuestLayoutExtraToBase64X4734355880332862199(byteBufferAllocateDirect2);
                        try {
                            str8 = C1CCW.ADAPTER.decode(byteBufferMoltenFfiNativeConvertMultiGuestLayoutExtraToBase64X4734355880332862199 == null ? new ByteArrayInputStream(new byte[i4]) : new C19924412xW(byteBufferMoltenFfiNativeConvertMultiGuestLayoutExtraToBase64X4734355880332862199)).ret;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            str8 = C1CCW.ADAPTER.decode(new byte[0]).ret;
                        }
                        if (byteBufferMoltenFfiNativeConvertMultiGuestLayoutExtraToBase64X4734355880332862199 != null) {
                            MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeConvertMultiGuestLayoutExtraToBase64X4734355880332862199);
                        }
                    } else {
                        str8 = null;
                    }
                    C2182031AaX c2182031AaX = new C2182031AaX(str13, str14, str8, null, C1516000pYM.LJFF(layoutState4.multiGuestLayoutNonSeiExtra, new MultiGuestLayoutNonSeiExtra_ProtoEncoder()), null);
                    List<SpotInfo> list3 = layoutData2.spotList;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    for (SpotInfo spotInfo2 : list3) {
                        long j7 = spotInfo2.spotId;
                        PosIdentity posIdentity3 = spotInfo2.posIdentity;
                        C1283230jUv c1283230jUvLIZLLL = posIdentity3 != null ? C1282000jSw.LIZLLL(posIdentity3) : null;
                        MultiGuestSpotExtra multiGuestSpotExtra = spotInfo2.multiGuestSpotExtra;
                        if (multiGuestSpotExtra != null) {
                            List<C2182401Ab8> listSingletonList = Collections.singletonList(new C2182401Ab8(multiGuestSpotExtra.isEnlarged, multiGuestSpotExtra.isSingleZoomEnabled, multiGuestSpotExtra.isDoubleZoomEnabled, multiGuestSpotExtra.isSwitchSpotEnabled, multiGuestSpotExtra.spotRank, multiGuestSpotExtra.contentPositionType, C1515990pYL.LIZ(multiGuestSpotExtra.socialGameUser, new SocialGameUserSpotExtra_ProtoEncoder())));
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
                            for (C2182401Ab8 c2182401Ab8 : listSingletonList) {
                                Boolean boolValueOf = Boolean.valueOf(c2182401Ab8.LIZ);
                                Boolean boolValueOf2 = Boolean.valueOf(c2182401Ab8.LIZIZ);
                                Boolean boolValueOf3 = Boolean.valueOf(c2182401Ab8.LIZJ);
                                Boolean boolValueOf4 = Boolean.valueOf(c2182401Ab8.LIZLLL);
                                Long lValueOf = Long.valueOf(c2182401Ab8.LJ);
                                Long lValueOf2 = Long.valueOf(c2182401Ab8.LJFF);
                                byte[] bArr = c2182401Ab8.LJI;
                                arrayList3.add(new C1CDB(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, lValueOf, lValueOf2, bArr != null ? ByteString.of(Arrays.copyOf(bArr, bArr.length)) : null));
                            }
                            C2223301C0a c2223301C0a = new C2223301C0a(arrayList3);
                            int iEncodedSize2 = C2223301C0a.ADAPTER.encodedSize(c2223301C0a);
                            if (iEncodedSize2 > 0) {
                                byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize2);
                                c2223301C0a.encode(new C1283530jVP(byteBufferAllocateDirect));
                                i2 = 0;
                            } else {
                                i2 = 0;
                                byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
                            }
                            ByteBuffer byteBufferMoltenFfiNativeConvertMultiGuestSpotExtraListToBase64ListX8812820598025254204 = MoltenFfiLinkMicSdk.MoltenFfiNativeConvertMultiGuestSpotExtraListToBase64ListX8812820598025254204(byteBufferAllocateDirect);
                            try {
                                list2 = C1C34.ADAPTER.decode(byteBufferMoltenFfiNativeConvertMultiGuestSpotExtraListToBase64ListX8812820598025254204 == null ? new ByteArrayInputStream(new byte[i2]) : new C19924412xW(byteBufferMoltenFfiNativeConvertMultiGuestSpotExtraListToBase64ListX8812820598025254204)).ret;
                                i3 = 0;
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                i3 = 0;
                                list2 = C1C34.ADAPTER.decode(new byte[0]).ret;
                            }
                            if (byteBufferMoltenFfiNativeConvertMultiGuestSpotExtraListToBase64ListX8812820598025254204 != null) {
                                MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeConvertMultiGuestSpotExtraListToBase64ListX8812820598025254204);
                            }
                            str9 = (String) C13LP.LJJJLZIJ(i3, list2);
                        } else {
                            str9 = null;
                        }
                        arrayList2.add(new C2181811AaB(j7, c1283230jUvLIZLLL, null, str9, null, C1516000pYM.LJFF(spotInfo2.multiGuestSpotNonSeiExtra, new MultiGuestSpotNonSeiExtra_ProtoEncoder()), null));
                    }
                    long j8 = layoutData2.version;
                    List<PosIdentity> list4 = layoutData2.uiPos;
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    Iterator<PosIdentity> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(C1282000jSw.LIZLLL(it2.next()));
                    }
                    C2182411Ab9 c2182411Ab9 = new C2182411Ab9(new C2181931AaN(str12, str11), c2182031AaX, arrayList2, arrayList4, j8, layoutData2.groupChannelId);
                    if (c2182411Ab9 == null || (linkMicLayoutLayer = this.LL.LLJJJJ) == null) {
                        return;
                    }
                    linkMicLayoutLayer.LJJ(EnumC965730bEp.INNER.getLinkArchType(), c2182411Ab9);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkMicLayoutLayerProxy@8b37.updateLayoutV2$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkMicLayoutLayerProxy@8b37.updateLayoutV2$runnable$1");
            }
        };
        if (!LLIILII()) {
            ((ArrayList) this.LLL).add(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.InterfaceC940060aZQ
    public final void LLIL(final EnumC965730bEp enumC965730bEp, final C955340ay4 c955340ay4, final C917100ZyO c917100ZyO) throws JSONException {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("_889");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateLayout: info=");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("layout_key", c955340ay4.LIZ.LIZIZ);
        jSONObject.put("layout_id", c955340ay4.LIZ.LIZ);
        List<C957030b0n> list = c955340ay4.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C957030b0n> it2 = list.iterator();
        while (true) {
            String str = null;
            if (!it2.hasNext()) {
                break;
            }
            C957030b0n next = it2.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("spot_id", next.LIZ);
            PosIdentity posIdentity = next.LIZIZ;
            if (posIdentity != null) {
                numValueOf = Integer.valueOf(posIdentity.type);
            } else {
                numValueOf = null;
            }
            jSONObject2.put("pos_type", numValueOf);
            PosIdentity posIdentity2 = next.LIZIZ;
            if (posIdentity2 != null) {
                str = posIdentity2.value;
            }
            jSONObject2.put("pos_value", str);
            arrayList.add(jSONObject2);
        }
        jSONObject.put("spot_list", arrayList);
        jSONObject.put("consumer_type", c955340ay4.LIZLLL.getValue());
        sbLIZ2.append(jSONObject);
        sbLIZ2.append(", source=");
        sbLIZ2.append(c917100ZyO);
        C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        Runnable runnable = new Runnable() { // from class: X.1AZi
            public boolean LL;
            public int LLILLJJLI;
            public int LLILLL;

            public final void LIZ() {
                ArrayList arrayList2;
                C1283230jUv c1283230jUvLIZLLL;
                ViewGroup viewGroup = this.LLILZ.LLJJIII;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LLILZ.LLILLL);
                sbLIZ3.append("_849");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("try call update layout to rust, layout_key:");
                sbLIZ4.append(c955340ay4.LIZ.LIZIZ);
                sbLIZ4.append(", viewParent:");
                sbLIZ4.append(viewGroup != null ? Integer.valueOf(viewGroup.hashCode()) : null);
                sbLIZ4.append(", attached:");
                sbLIZ4.append(viewGroup != null ? Boolean.valueOf(viewGroup.isAttachedToWindow()) : null);
                sbLIZ4.append(", size:");
                sbLIZ4.append(viewGroup != null ? Integer.valueOf(viewGroup.getWidth()) : null);
                sbLIZ4.append('x');
                sbLIZ4.append(viewGroup != null ? Integer.valueOf(viewGroup.getHeight()) : null);
                sbLIZ4.append(", postFlag:");
                sbLIZ4.append(this.LL);
                sbLIZ4.append(", source=");
                sbLIZ4.append(c917100ZyO);
                C1AZW.LJIIJ(12, strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ4), null, null);
                if (viewGroup == null) {
                    return;
                }
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                if (width == 0 && height == 0 && !this.LL) {
                    this.LL = true;
                    HandlerHook.viewPost(viewGroup, this);
                    return;
                }
                if (LinkMicFixUpdateParentSizeLost.INSTANCE.isEnable() && (this.LLILLJJLI != width || this.LLILLL != height)) {
                    C2181461AZc c2181461AZc = this.LLILZ;
                    C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                    c2181461AZc.LLJJJJJIL(viewGroup, null, false, C973010bQZ.LJI("internalUpdateLayout"));
                }
                this.LLILLJJLI = width;
                this.LLILLL = height;
                C2181931AaN c2181931AaNLJII = C2181511AZh.LJII(c917100ZyO);
                C955320ay2 c955320ay2 = c955340ay4.LIZ;
                C2182031AaX c2182031AaX = new C2182031AaX(c955320ay2.LIZ, c955320ay2.LIZIZ, C1516000pYM.LJFF(c955320ay2.LIZJ, new MultiGuestLayoutExtra_ProtoEncoder()), c955320ay2.LIZLLL, C1516000pYM.LJFF(c955320ay2.LJ, new MultiGuestLayoutNonSeiExtra_ProtoEncoder()), c955320ay2.LJFF);
                List<C957030b0n> list2 = c955340ay4.LIZIZ;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (C957030b0n c957030b0n : list2) {
                    long j = c957030b0n.LIZ;
                    PosIdentity posIdentity3 = c957030b0n.LIZIZ;
                    arrayList3.add(new C2181811AaB(j, posIdentity3 != null ? C1282000jSw.LIZLLL(posIdentity3) : null, null, C1516000pYM.LJFF(c957030b0n.LIZJ, new MultiGuestSpotExtra_ProtoEncoder()), c957030b0n.LIZLLL, C1516000pYM.LJFF(c957030b0n.LJ, new MultiGuestSpotNonSeiExtra_ProtoEncoder()), c957030b0n.LJFF));
                }
                C955340ay4 c955340ay42 = c955340ay4;
                List<PosIdentity> list3 = c955340ay42.LIZJ;
                if (list3 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator<PosIdentity> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(C1282000jSw.LIZLLL(it3.next()));
                    }
                } else {
                    List<C957030b0n> list4 = c955340ay42.LIZIZ;
                    arrayList2 = new ArrayList();
                    Iterator<C957030b0n> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        PosIdentity posIdentity4 = it4.next().LIZIZ;
                        if (posIdentity4 != null && (c1283230jUvLIZLLL = C1282000jSw.LIZLLL(posIdentity4)) != null) {
                            arrayList2.add(c1283230jUvLIZLLL);
                        }
                    }
                }
                C2182311Aaz c2182311Aaz = new C2182311Aaz(c2181931AaNLJII, c2182031AaX, arrayList3, arrayList2, c955340ay4.LIZLLL == EnumC955260axw.ALL ? C13BV.INSTANCE : C1697810uHb.LJ(Long.valueOf(r5.getValue())));
                LinkMicLayoutLayer linkMicLayoutLayer = this.LLILZ.LLJJJJ;
                if (linkMicLayoutLayer != null) {
                    linkMicLayoutLayer.LJIJJLI(enumC965730bEp.getLinkArchType(), c2182311Aaz);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkMicLayoutLayerProxy@8b37.internalUpdateLayout$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkMicLayoutLayerProxy@8b37.internalUpdateLayout$runnable$1");
            }
        };
        if (!LLIILII()) {
            ((ArrayList) this.LLL).add(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LLJ(X.InterfaceC940430aa1 r5, int r6, boolean r7) {
        /*
            r4 = this;
            com.bytedance.android.livesdk.sei.SeiAppData r0 = r5.LIZ()
            if (r0 == 0) goto Lb5
            long r1 = r0.timestamp
            java.lang.String r3 = r4.LLJI(r0, r1)
            if (r3 != 0) goto L23
        Le:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ts="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", app_data=null"
            r3.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r3)
        L23:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "source="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", force_refresh="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", init="
            r1.append(r0)
            boolean r0 = r4.LLIILII()
            r1.append(r0)
            java.lang.String r0 = ", rust_init="
            r1.append(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.LLJLLIL
            boolean r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = ", layer="
            r1.append(r0)
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer r0 = r4.LLJJJJ
            r2 = 0
            if (r0 == 0) goto Lb3
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L6b:
            r1.append(r0)
            java.lang.String r0 = ", player="
            r1.append(r0)
            X.1AZm r0 = r4.LLJLILLLLZIIL
            if (r0 == 0) goto Lb1
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L7f:
            r1.append(r0)
            java.lang.String r0 = ", parent="
            r1.append(r0)
            android.view.ViewGroup r0 = r4.LLJJIII
            if (r0 == 0) goto Laf
            int r0 = r0.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L93:
            r1.append(r0)
            r0 = 120(0x78, float:1.68E-43)
            r1.append(r0)
            android.view.ViewGroup r0 = r4.LLJJIII
            if (r0 == 0) goto La7
            int r0 = r0.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        La7:
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        Laf:
            r0 = r2
            goto L93
        Lb1:
            r0 = r2
            goto L7f
        Lb3:
            r0 = r2
            goto L6b
        Lb5:
            long r1 = r5.timestamp()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181461AZc.LLJ(X.0aa1, int, boolean):java.lang.String");
    }

    public final void LLJLLL(String str, InterfaceC2181691AZz interfaceC2181691AZz, String str2) {
        C2181481AZe c2181481AZe;
        if (!this.LL.LJIIIIZZ) {
            return;
        }
        boolean z = true;
        if (str.length() > 0) {
            if (interfaceC2181691AZz != null) {
                interfaceC2181691AZz.LJIJJ(str);
                C2181481AZe c2181481AZe2 = this.LLJLL;
                if (c2181481AZe2 != null) {
                    c2181481AZe2.LJJIIJZLJL(interfaceC2181691AZz);
                }
                interfaceC2181691AZz.init();
                LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
                if (linkMicLayoutLayer == null || linkMicLayoutLayer.LJFF(C1283930jW3.LIZIZ(interfaceC2181691AZz), str)) {
                    z = false;
                }
                if (z) {
                    String str3 = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateAnchorSelfRenderView, registered, linkMicId:");
                    sbLIZ.append(str);
                    sbLIZ.append(", view:");
                    sbLIZ.append(C1283930jW3.LIZIZ(interfaceC2181691AZz));
                    sbLIZ.append(", source:");
                    sbLIZ.append(str2);
                    C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
                    LinkMicLayoutLayer linkMicLayoutLayer2 = this.LLJJJJ;
                    if (linkMicLayoutLayer2 != null) {
                        linkMicLayoutLayer2.LJI(C1283930jW3.LIZIZ(interfaceC2181691AZz), str);
                        return;
                    }
                    return;
                }
                String str4 = this.LLILLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateAnchorSelfRenderView, ignore, has been registered, init flag:");
                sbLIZ2.append(LLIILII());
                sbLIZ2.append(", source:");
                sbLIZ2.append(str2);
                C20441214yg.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        } else if (interfaceC2181691AZz != null && (c2181481AZe = this.LLJLL) != null) {
            c2181481AZe.LJJIIJZLJL(interfaceC2181691AZz);
        }
        String str5 = this.LLILLL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateAnchorSelfRenderView, don't register self render view to rust layout layer, linkMicId is empty, source:");
        sbLIZ3.append(str2);
        C20441214yg.LJ(str5, C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC2181771Aa7
    public final boolean zu(View view, ViewGroup.LayoutParams layoutParams, String str) {
        InterfaceC2181941AaO interfaceC2181941AaO;
        C2181561AZm c2181561AZm = this.LLJLILLLLZIIL;
        if (c2181561AZm != null) {
            interfaceC2181941AaO = c2181561AZm.LL;
        } else {
            interfaceC2181941AaO = null;
        }
        if (interfaceC2181941AaO != null && (interfaceC2181941AaO instanceof C2176161AEs)) {
            C2176161AEs c2176161AEs = (C2176161AEs) interfaceC2181941AaO;
            View viewLIZLLL = c2176161AEs.LIZLLL();
            if (!Intrinsics.LJFF(view, viewLIZLLL)) {
                C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", "isNeedRoomCommonRenderViewControlPermission, ignore, not target view");
                return false;
            }
            if (Intrinsics.LJFF(layoutParams, c2176161AEs.LJFF)) {
                Rect rect = c2176161AEs.LIZIZ;
                if (rect == null) {
                    C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", "isNeedRoomCommonRenderViewControlPermission, ignore, last update size is null");
                    return false;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (Intrinsics.LJFF(C2181511AZh.LJI(layoutParams2), rect) && layoutParams2.gravity == 51) {
                    C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", "isNeedRoomCommonRenderViewControlPermission, ignore, layout param match last update size");
                    return false;
                }
                viewLIZLLL.setTag(R.id.yss, new FrameLayout.LayoutParams(layoutParams2));
                viewLIZLLL.setTag(R.id.yst, str);
                layoutParams2.gravity = 51;
                layoutParams2.leftMargin = rect.left;
                layoutParams2.topMargin = rect.top;
                layoutParams2.width = rect.width();
                layoutParams2.height = rect.height();
                C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", "isNeedRoomCommonRenderViewControlPermission, intercept, layout param not match last update size");
                return true;
            }
            viewLIZLLL.setTag(R.id.yss, layoutParams);
            viewLIZLLL.setTag(R.id.yst, str);
            C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", "isNeedRoomCommonRenderViewControlPermission, intercept, layout param not match last update size");
            return true;
        }
        C20441214yg.LIZIZ(this.LLILLL, "isNeedRoomCommonRenderViewControlPermission, ignore, no match");
        return false;
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJLI(EnumC965730bEp enumC965730bEp, byte[] bArr, C917100ZyO c917100ZyO, List<Long> list) {
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLayoutData: archType:");
        sbLIZ.append(enumC965730bEp);
        sbLIZ.append(", layoutDataBytes=");
        sbLIZ.append(bArr.length);
        sbLIZ.append(", consumerList=");
        sbLIZ.append(list);
        sbLIZ.append(", bizSource:");
        sbLIZ.append(c917100ZyO);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
        if (linkMicLayoutLayer != null) {
            linkMicLayoutLayer.LJIJJ(enumC965730bEp.getLinkArchType(), bArr, list, C2181511AZh.LJII(c917100ZyO));
        }
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJLLILLLL(LinkUser linkUser, SurfaceView surfaceView, InterfaceC1268870j7l interfaceC1268870j7l, boolean z) {
        InterfaceC2181691AZz interfaceC2181691AZz;
        String str;
        C2181481AZe c2181481AZe = this.LLJLL;
        if (c2181481AZe != null) {
            interfaceC2181691AZz = c2181481AZe.LLIZ;
        } else {
            interfaceC2181691AZz = null;
        }
        if (linkUser == null || (str = linkUser.linkMicId) == null) {
            str = "";
        }
        LLJLLL(str, interfaceC2181691AZz, "update room owner user");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJIL(final X.C945320ahu r43, X.InterfaceC940430aa1 r44, boolean r45, int r46) {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181461AZc.LLJJJIL(X.0ahu, X.0aa1, boolean, int):void");
    }

    public final void LLJJJJJIL(ViewGroup viewGroup, Rect rect, boolean z, C2181931AaN c2181931AaN) {
        C1283980jW8 c1283980jW8LLJJJ;
        double d;
        if (rect != null) {
            c1283980jW8LLJJJ = new C1283980jW8(rect.left, rect.top, rect.right, rect.bottom, 0.0d);
        } else {
            c1283980jW8LLJJJ = LLJJJ(viewGroup);
        }
        double d2 = 0.0d;
        if (LinkMicLayoutFixWindowSize.INSTANCE.isEnable()) {
            d = c1283980jW8LLJJJ.LIZIZ;
        } else {
            d = 0.0d;
        }
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() && this.LL.LJII == EnumC945310aht.COMMON_FEED) {
            d2 = this.LLJJIJI;
        }
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateParentContainerView: parentContainerView:");
        sbLIZ.append(viewGroup.hashCode());
        sbLIZ.append(", rect:");
        sbLIZ.append(rect);
        sbLIZ.append(", rect2:");
        sbLIZ.append(c1283980jW8LLJJJ);
        sbLIZ.append(", requestLayout:");
        sbLIZ.append(z);
        sbLIZ.append(", extraHeight:");
        sbLIZ.append(d2);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(this.LLJJIII, viewGroup)) {
            this.LLJJIII = viewGroup;
            C2181481AZe c2181481AZe = this.LLJLL;
            if (c2181481AZe != null) {
                c2181481AZe.LJIIJJI(viewGroup);
            }
        }
        LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
        if (linkMicLayoutLayer != null) {
            linkMicLayoutLayer.LJJIL(new C2182431AbB(C1283930jW3.LIZIZ(viewGroup), C1283930jW3.LIZLLL(c1283980jW8LLJJJ.LIZJ - c1283980jW8LLJJJ.LIZ), ((double) C1283930jW3.LIZLLL(c1283980jW8LLJJJ.LIZLLL - c1283980jW8LLJJJ.LIZIZ)) + d2), new C2182441AbC(new C1283980jW8(0.0d, 0.0d, c1283980jW8LLJJJ.LIZJ, (c1283980jW8LLJJJ.LIZLLL - d) + d2, 0.0d), new C1283980jW8(0.0d, (int) C497740JfY.LIZIZ(LLJJIJIIJIL()), C1283930jW3.LIZLLL(c1283980jW8LLJJJ.LIZJ - c1283980jW8LLJJJ.LIZ), (c1283980jW8LLJJJ.LIZLLL - ((double) ((int) C497740JfY.LIZIZ(LLJJIJI(c1283980jW8LLJJJ))))) - d, 0.0d)), LLJJIII(c1283980jW8LLJJJ), z, c2181931AaN);
        }
    }

    @InterfaceC1294060jmO
    public final void LLJJ(ViewGroup viewGroup, FrameLayout frameLayout, InterfaceC2181691AZz interfaceC2181691AZz, InterfaceC2181941AaO interfaceC2181941AaO, C1283980jW8 c1283980jW8) {
        InterfaceC972880bQM c972830bQH;
        Integer numValueOf;
        InterfaceC951900asW interfaceC951900asW;
        LinkMicLayoutQosMonitor linkMicLayoutQosMonitorLJ;
        InterfaceC951900asW interfaceC951900asW2;
        FrameLayout frameLayoutLJIILLIIL;
        C2177031AIb c2177031AIb = this.LL;
        C2181481AZe c2181481AZe = new C2181481AZe(c2177031AIb.LIZIZ, c2177031AIb.LIZ, this, this);
        c2181481AZe.LJJIIZ(frameLayout);
        c2181481AZe.LJIIJJI(viewGroup);
        if (interfaceC2181691AZz != null) {
            c2181481AZe.LJJIIJZLJL(interfaceC2181691AZz);
        }
        this.LLJLL = c2181481AZe;
        Integer numValueOf2 = null;
        if (c2181481AZe.LJIILLIIL() instanceof C21614919iV) {
            C2181481AZe c2181481AZe2 = this.LLJLL;
            if (c2181481AZe2 != null) {
                frameLayoutLJIILLIIL = c2181481AZe2.LJIILLIIL();
            } else {
                frameLayoutLJIILLIIL = null;
            }
            C21614919iV c21614919iV = (C21614919iV) frameLayoutLJIILLIIL;
            if (c21614919iV != null) {
                c21614919iV.setEnableRoundCornerRadius(this.LLJ);
            }
        }
        C2182601AbS c2182601AbS = new C2182601AbS();
        C1308530k9j c1308530k9j = new C1308530k9j();
        C2182421AbA c2182421AbA = LinkMicLayoutLayerConfig.LLILZ;
        boolean z = this.LL.LJIIIIZZ;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        double d = C497740JfY.LIZIZ.density;
        EnumC2181801AaA enumC2181801AaALLJJIII = LLJJIII(c1283980jW8);
        C2182431AbB c2182431AbB = new C2182431AbB(C1283930jW3.LIZIZ(viewGroup), C1283930jW3.LIZLLL(c1283980jW8.LIZJ - c1283980jW8.LIZ), C1283930jW3.LIZLLL(c1283980jW8.LIZLLL - c1283980jW8.LIZIZ));
        C2182441AbC c2182441AbC = new C2182441AbC(new C1283980jW8(0.0d, 0.0d, c1283980jW8.LIZJ, c1283980jW8.LIZLLL, 0.0d), new C1283980jW8(0.0d, (int) C497740JfY.LIZIZ(LLJJIJIIJIL()), C1283930jW3.LIZLLL(c1283980jW8.LIZJ - c1283980jW8.LIZ), c1283980jW8.LIZLLL - ((double) ((int) C497740JfY.LIZIZ(LLJJIJI(c1283980jW8)))), 0.0d));
        C2181491AZf c2181491AZf = this.LLJJJ;
        C2181561AZm c2181561AZm = this.LLJLILLLLZIIL;
        C2181391AYv c2181391AYv = this.LLILLJJLI;
        C1AZY c1azy = new C1AZY();
        if (LinkMicUseNewLayoutEventMonitor.INSTANCE.isEnable()) {
            c972830bQH = this.LLJJJJLIIL;
        } else {
            c972830bQH = new C972830bQH(new C20330114gl(this));
        }
        c2182421AbA.getClass();
        LinkMicLayoutLayerConfig linkMicLayoutLayerConfigLIZ = C2182421AbA.LIZ(z, currentUserId, d, enumC2181801AaALLJJIII, c2182431AbB, c2182441AbC, c2182601AbS, c1308530k9j, c2181491AZf, c2181481AZe, c2181561AZm, c2181391AYv, c1azy, c972830bQH);
        DataChannel dataChannel = this.LL.LJFF.getDataChannel();
        if (dataChannel != null && (interfaceC951900asW2 = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW2.LJJIIZ();
        }
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doSetupRustLayoutLayerV1[");
        sbLIZ.append(hashCode());
        sbLIZ.append("] create rust layout layer, old:");
        LinkMicLayoutLayer linkMicLayoutLayer = this.LLJJJJ;
        if (linkMicLayoutLayer != null) {
            numValueOf = Integer.valueOf(linkMicLayoutLayer.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        LinkMicLayoutLayer linkMicLayoutLayerLIZIZ = C2231651CWd.LIZIZ(linkMicLayoutLayerConfigLIZ);
        this.LLJZ.set(0L);
        this.LLJJJJ = linkMicLayoutLayerLIZIZ;
        if (LinkMicLayoutLayerQosMonitor.INSTANCE.isEnable()) {
            C972840bQI c972840bQI = this.LLJJJJLIIL;
            LinkMicLayoutLayer linkMicLayoutLayer2 = this.LLJJJJ;
            if (linkMicLayoutLayer2 != null) {
                linkMicLayoutQosMonitorLJ = C2231651CWd.LJ(linkMicLayoutLayer2);
            } else {
                linkMicLayoutQosMonitorLJ = null;
            }
            c972840bQI.LLILLL = linkMicLayoutQosMonitorLJ;
            c2182601AbS.LLILLJJLI = new WeakReference<>(this.LLJJJJLIIL);
        }
        String str2 = this.LLILLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("doSetupRustLayoutLayerV1[");
        sbLIZ2.append(hashCode());
        sbLIZ2.append("] rust layout layer, init flag:");
        sbLIZ2.append(LLIILII());
        sbLIZ2.append(", install:");
        LinkMicLayoutLayer linkMicLayoutLayer3 = this.LLJJJJ;
        if (linkMicLayoutLayer3 != null) {
            numValueOf2 = Integer.valueOf(linkMicLayoutLayer3.hashCode());
        }
        sbLIZ2.append(numValueOf2);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        DataChannel dataChannel2 = this.LL.LJFF.getDataChannel();
        if (dataChannel2 != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel2.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW.LJIJI();
        }
        this.LLJJJJJIL = linkMicLayoutLayerConfigLIZ;
        if (this.LLJJJJ != null) {
            this.LL.LJFF.LJJLIIJ(this);
        }
        if (interfaceC2181691AZz != null) {
            interfaceC2181691AZz.init();
            if (interfaceC2181691AZz.getLinkMicId().length() > 0) {
                LinkMicLayoutLayer linkMicLayoutLayer4 = this.LLJJJJ;
                if (linkMicLayoutLayer4 != null) {
                    linkMicLayoutLayer4.LJI(C1283930jW3.LIZIZ(interfaceC2181691AZz), interfaceC2181691AZz.getLinkMicId());
                }
            } else {
                C20441214yg.LJIIL(this.LLILLL, "doSetupRustLayoutLayerV1, don't register self render view to rust layout layer");
            }
        }
        if (interfaceC2181941AaO != null) {
            C2181561AZm c2181561AZm2 = new C2181561AZm(interfaceC2181941AaO);
            LinkMicLayoutLayer linkMicLayoutLayer5 = this.LLJJJJ;
            if (linkMicLayoutLayer5 != null) {
                linkMicLayoutLayer5.LJJIZ(c2181561AZm2);
            }
            this.LLJLILLLLZIIL = c2181561AZm2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02e9 A[Catch: all -> 0x0316, TRY_LEAVE, TryCatch #5 {all -> 0x0316, blocks: (B:100:0x02e1, B:102:0x02e9), top: B:140:0x02e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJI(android.view.ViewGroup r44, android.widget.FrameLayout r45, X.InterfaceC2181691AZz r46, X.InterfaceC2181941AaO r47, X.C1283980jW8 r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181461AZc.LLJJI(android.view.ViewGroup, android.widget.FrameLayout, X.1AZz, X.1AaO, X.0jW8):void");
    }

    @Override // X.InterfaceC940060aZQ
    public final void LJJL(final ViewGroup viewGroup, FrameLayout frameLayout, InterfaceC2181691AZz interfaceC2181691AZz, InterfaceC2181941AaO interfaceC2181941AaO, InterfaceC2181591AZp interfaceC2181591AZp, Rect rect) throws JSONException {
        boolean z;
        String strLJIIL;
        String strLJIIL2;
        final C1283980jW8 c1283980jW8LLJJJ;
        InterfaceC951900asW interfaceC951900asW;
        InterfaceC2181691AZz interfaceC2181691AZz2;
        InterfaceC2181941AaO interfaceC2181941AaO2;
        FrameLayout frameLayoutLJIILLIIL;
        FrameLayout frameLayoutLJIILLIIL2;
        LinkMicLayoutLayer linkMicLayoutLayer;
        InterfaceC951900asW interfaceC951900asW2;
        InterfaceC2181941AaO interfaceC2181941AaO3;
        InterfaceC2181691AZz interfaceC2181691AZz3;
        InterfaceC2181941AaO interfaceC2181941AaO4;
        LinkMicSdkLayoutLayerEnableSetupV2 linkMicSdkLayoutLayerEnableSetupV2 = LinkMicSdkLayoutLayerEnableSetupV2.INSTANCE;
        boolean z2 = false;
        if (!linkMicSdkLayoutLayerEnableSetupV2.isEnable() ? this.LLJJJJ != null : this.LLJLLL.get() >= 1) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z && Intrinsics.LJFF(this.LLJJIII, viewGroup)) {
            C2181561AZm c2181561AZm = this.LLJLILLLLZIIL;
            if (c2181561AZm != null) {
                interfaceC2181941AaO3 = c2181561AZm.LL;
            } else {
                interfaceC2181941AaO3 = null;
            }
            if (Intrinsics.LJFF(interfaceC2181941AaO, interfaceC2181941AaO3)) {
                C2181481AZe c2181481AZe = this.LLJLL;
                if (c2181481AZe != null) {
                    interfaceC2181691AZz3 = c2181481AZe.LLIZ;
                } else {
                    interfaceC2181691AZz3 = null;
                }
                if (Intrinsics.LJFF(interfaceC2181691AZz3, interfaceC2181691AZz) && Intrinsics.LJFF(interfaceC2181591AZp, this.LLIZ.LLILLL)) {
                    String str = this.LLILLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setUpRustLayoutLayer viewParent is the same: ");
                    sbLIZ.append(Intrinsics.LJFF(this.LLJJIII, viewGroup));
                    sbLIZ.append(", streamPlayer is the same: ");
                    C2181561AZm c2181561AZm2 = this.LLJLILLLLZIIL;
                    if (c2181561AZm2 != null) {
                        interfaceC2181941AaO4 = c2181561AZm2.LL;
                    } else {
                        interfaceC2181941AaO4 = null;
                    }
                    sbLIZ.append(Intrinsics.LJFF(interfaceC2181941AaO, interfaceC2181941AaO4));
                    sbLIZ.append(", anchorSelfRenderView is the same: ");
                    C2181481AZe c2181481AZe2 = this.LLJLL;
                    if (c2181481AZe2 != null) {
                        obj = c2181481AZe2.LLIZ;
                    }
                    sbLIZ.append(!Intrinsics.LJFF(obj, interfaceC2181691AZz));
                    sbLIZ.append("setup status = ");
                    sbLIZ.append(this.LLJLLL.get());
                    C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
                    this.LLIZ.LIZIZ(9001, "has been setup with same parent view");
                    return;
                }
            }
        }
        String str2 = this.LLILLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setUpRustLayoutLayer start: setupStatus:");
        sbLIZ2.append(this.LLJLLL.get());
        sbLIZ2.append(", parenView:");
        ViewGroup viewGroup2 = this.LLJJIII;
        if (viewGroup2 != null) {
            strLJIIL = C500260Jjc.LJIIL(viewGroup2);
        } else {
            strLJIIL = null;
        }
        sbLIZ2.append(strLJIIL);
        sbLIZ2.append(", new parent:");
        sbLIZ2.append(C500260Jjc.LJIIL(viewGroup));
        sbLIZ2.append(", customLayoutContainer:");
        if (frameLayout != null) {
            strLJIIL2 = C500260Jjc.LJIIL(frameLayout);
        } else {
            strLJIIL2 = null;
        }
        sbLIZ2.append(strLJIIL2);
        sbLIZ2.append(", roomOwner:");
        sbLIZ2.append(this.LL.LJIIIIZZ);
        sbLIZ2.append(", streamPlayer:");
        sbLIZ2.append(interfaceC2181941AaO);
        sbLIZ2.append(" default parent rect:");
        sbLIZ2.append(rect);
        sbLIZ2.append(", isDestroyed:");
        sbLIZ2.append(this.LLJZIJLIL);
        C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        this.LLIZ.LJIL(interfaceC2181591AZp);
        DataChannel dataChannel = this.LL.LJFF.getDataChannel();
        if (dataChannel != null && (interfaceC951900asW2 = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW2.LJIJJLI();
        }
        if (linkMicSdkLayoutLayerEnableSetupV2.isEnable() && !this.LLJLLL.compareAndSet(0, 1)) {
            if (!this.LLJZIJLIL && LLIILII()) {
                C2181481AZe c2181481AZe3 = this.LLJLL;
                if (c2181481AZe3 != null) {
                    interfaceC2181691AZz2 = c2181481AZe3.LLIZ;
                } else {
                    interfaceC2181691AZz2 = null;
                }
                if (!Intrinsics.LJFF(interfaceC2181691AZz2, interfaceC2181691AZz)) {
                    C2181481AZe c2181481AZe4 = this.LLJLL;
                    if (c2181481AZe4 != null) {
                        if (interfaceC2181691AZz != null) {
                            interfaceC2181691AZz.init();
                            C2181481AZe c2181481AZe5 = this.LLJLL;
                            if (c2181481AZe5 != null) {
                                c2181481AZe5.LJJIIJZLJL(interfaceC2181691AZz);
                            }
                        }
                        c2181481AZe4.LJJIIZ(frameLayout);
                    }
                    if (interfaceC2181691AZz != null && (linkMicLayoutLayer = this.LLJJJJ) != null) {
                        linkMicLayoutLayer.LJI(C1283930jW3.LIZIZ(interfaceC2181691AZz), interfaceC2181691AZz.getLinkMicId());
                    }
                }
                C2181561AZm c2181561AZm3 = this.LLJLILLLLZIIL;
                if (c2181561AZm3 != null) {
                    interfaceC2181941AaO2 = c2181561AZm3.LL;
                } else {
                    interfaceC2181941AaO2 = null;
                }
                if (!Intrinsics.LJFF(interfaceC2181941AaO, interfaceC2181941AaO2) && interfaceC2181941AaO != null) {
                    C2181561AZm c2181561AZm4 = new C2181561AZm(interfaceC2181941AaO);
                    LinkMicLayoutLayer linkMicLayoutLayer2 = this.LLJJJJ;
                    if (linkMicLayoutLayer2 != null) {
                        linkMicLayoutLayer2.LJJIZ(c2181561AZm4);
                    }
                    this.LLJLILLLLZIIL = c2181561AZm4;
                }
                C2181481AZe c2181481AZe6 = this.LLJLL;
                if (c2181481AZe6 != null) {
                    frameLayoutLJIILLIIL = c2181481AZe6.LJIILLIIL();
                } else {
                    frameLayoutLJIILLIIL = null;
                }
                if (frameLayoutLJIILLIIL instanceof C21614919iV) {
                    C2181481AZe c2181481AZe7 = this.LLJLL;
                    if (c2181481AZe7 != null) {
                        frameLayoutLJIILLIIL2 = c2181481AZe7.LJIILLIIL();
                    } else {
                        frameLayoutLJIILLIIL2 = null;
                    }
                    C21614919iV c21614919iV = (C21614919iV) frameLayoutLJIILLIIL2;
                    if (c21614919iV != null) {
                        c21614919iV.setEnableRoundCornerRadius(this.LLJ);
                    }
                }
                C1283980jW8 c1283980jW8LLJJJ2 = LLJJJ(viewGroup);
                if (C1283930jW3.LIZLLL(c1283980jW8LLJJJ2.LIZJ - c1283980jW8LLJJJ2.LIZ) > 0 && C1283930jW3.LIZLLL(c1283980jW8LLJJJ2.LIZLLL - c1283980jW8LLJJJ2.LIZIZ) > 0) {
                    C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                    LLJJJJJIL(viewGroup, null, false, C973010bQZ.LJI("setup2"));
                } else {
                    String str3 = this.LLILLL;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("setup2, parent view size is invalid, w:");
                    sbLIZ3.append(C1283930jW3.LIZLLL(c1283980jW8LLJJJ2.LIZJ - c1283980jW8LLJJJ2.LIZ));
                    sbLIZ3.append(", h:");
                    sbLIZ3.append(C1283930jW3.LIZLLL(c1283980jW8LLJJJ2.LIZLLL - c1283980jW8LLJJJ2.LIZIZ));
                    C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
                    LLJILLL(viewGroup, new Runnable() { // from class: X.1AZs
                        public final void LIZ() {
                            String str4 = this.LL.LLILLL;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("setup3, update parent size, w:");
                            sbLIZ4.append(viewGroup.getWidth());
                            sbLIZ4.append(", h:");
                            sbLIZ4.append(viewGroup.getHeight());
                            C20441214yg.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ4));
                            C2181461AZc c2181461AZc = this.LL;
                            ViewGroup viewGroup3 = viewGroup;
                            C973010bQZ c973010bQZ2 = C973010bQZ.LIZ;
                            c2181461AZc.LLJJJJJIL(viewGroup3, null, false, C973010bQZ.LJI("setup3"));
                            this.LL.LLJLILLLLZIIL();
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LinkMicLayoutLayerProxy@8b37.setUpRustLayoutLayer$runnable$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LinkMicLayoutLayerProxy@8b37.setUpRustLayoutLayer$runnable$2");
                        }
                    });
                }
                this.LLIZ.LIZIZ(9004, "reset setup params");
                return;
            }
            return;
        }
        this.LLJZIJLIL = false;
        LLJILJIL();
        C2181481AZe c2181481AZe8 = this.LLJLL;
        if (c2181481AZe8 != null) {
            obj = c2181481AZe8.LLILZIL.get(Long.valueOf(c2181481AZe8.LLJI));
        }
        if (Intrinsics.LJFF(this.LLJJIII, viewGroup) && obj == null && LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue()) {
            z2 = true;
        }
        if (!Intrinsics.LJFF(this.LLJJIII, viewGroup) || z2) {
            this.LLJJIII = viewGroup;
            C2181481AZe c2181481AZe9 = this.LLJLL;
            if (c2181481AZe9 != null) {
                c2181481AZe9.LJIIJJI(viewGroup);
            }
        }
        if (rect != null && C1283930jW3.LIZJ(rect)) {
            c1283980jW8LLJJJ = new C1283980jW8(rect.left, rect.top, rect.right, rect.bottom, 0.0d);
            String str4 = this.LLILLL;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("innerSetUpRustLayoutLayer with default rect, ");
            sbLIZ4.append(c1283980jW8LLJJJ);
            C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ4));
        } else {
            c1283980jW8LLJJJ = LLJJJ(viewGroup);
            String str5 = this.LLILLL;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("innerSetUpRustLayoutLayer with parent rect, ");
            sbLIZ5.append(c1283980jW8LLJJJ);
            C20441214yg.LJIIIZ(str5, C2188811AlT.LIZIZ(sbLIZ5));
        }
        Pair<Integer, String> pairLLJJJJ = LLJJJJ(viewGroup, frameLayout, interfaceC2181691AZz, interfaceC2181941AaO, interfaceC2181591AZp, c1283980jW8LLJJJ);
        LLJILLL(viewGroup, new Runnable() { // from class: X.1AZq
            public final void LIZ() {
                C2181461AZc c2181461AZc = this.LL;
                ViewGroup viewGroup3 = viewGroup;
                c2181461AZc.getClass();
                C1283980jW8 c1283980jW8LLJJJ3 = C2181461AZc.LLJJJ(viewGroup3);
                if (Intrinsics.LJFF(c1283980jW8LLJJJ3, c1283980jW8LLJJJ)) {
                    return;
                }
                String str6 = this.LL.LLILLL;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("innerSetUpRustLayoutLayer update parent rect: ");
                sbLIZ6.append(c1283980jW8LLJJJ);
                sbLIZ6.append(" -> ");
                sbLIZ6.append(c1283980jW8LLJJJ3);
                C20441214yg.LJIIIZ(str6, C2188811AlT.LIZIZ(sbLIZ6));
                C2181461AZc c2181461AZc2 = this.LL;
                ViewGroup viewGroup4 = viewGroup;
                C973010bQZ c973010bQZ2 = C973010bQZ.LIZ;
                c2181461AZc2.LLJJJJJIL(viewGroup4, null, false, C973010bQZ.LJI("setup1"));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkMicLayoutLayerProxy@8b37.setUpRustLayoutLayer$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkMicLayoutLayerProxy@8b37.setUpRustLayoutLayer$runnable$1");
            }
        });
        DataChannel dataChannel2 = this.LL.LJFF.getDataChannel();
        if (dataChannel2 != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel2.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW.LJFF();
        }
        if (pairLLJJJJ == null) {
            return;
        }
        this.LLIZ.LIZIZ(pairLLJJJJ.getFirst().intValue(), pairLLJJJJ.getSecond());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.String> LLJJJJ(final android.view.ViewGroup r13, final android.widget.FrameLayout r14, final X.InterfaceC2181691AZz r15, final X.InterfaceC2181941AaO r16, final X.InterfaceC2181591AZp r17, final X.C1283980jW8 r18) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181461AZc.LLJJJJ(android.view.ViewGroup, android.widget.FrameLayout, X.1AZz, X.1AaO, X.1AZp, X.0jW8):kotlin.Pair");
    }
}
