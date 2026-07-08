package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.IStickerService;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Px3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C661470Px3 extends FrameLayout implements C0R9I, InterfaceC648270Pbl, DefaultLifecycleObserver, InterfaceC662180PyC, GenericLifecycleObserver {
    public static final boolean LLJJIJI = C650560PfS.LIZ;
    public InterfaceC661770PxX LL;
    public C661490Px5 LLILLJJLI;
    public ImageView LLILLL;
    public ImageView LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final Set<InterfaceC661740PxU> LLIZ;
    public View LLIZLLLIL;
    public InterfaceC661540PxA LLJ;
    public EnumC661340Pwq LLJI;
    public EnumC661340Pwq LLJIJIL;
    public final Set<InterfaceC661400Pww> LLJILJIL;
    public InterfaceC1010470cOz LLJILJILJ;
    public InterfaceC660150Puv LLJILLL;
    public InterfaceC659840PuQ LLJJ;
    public TuxTextView LLJJI;
    public final C01GW LLJJIII;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // X.InterfaceC662180PyC
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public void setAutoPlay(boolean z) {
    }

    @Override // X.InterfaceC648350Pbt
    public void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    private final View getItemView() {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            return c661490Px5.LIZ;
        }
        return null;
    }

    private final String getMEventType() {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            return c661490Px5.LJIIZILJ;
        }
        return null;
    }

    @Override // X.InterfaceC662180PyC
    public final void LIZ() {
        LJIILJJIL("releasePlayer");
        LJIIIIZZ(EnumC661340Pwq.RELEASED);
    }

    public void LIZIZ() {
        InterfaceC1010450cOx interfaceC1010450cOxNe;
        InterfaceC1010450cOx interfaceC1010450cOxNe2;
        LJIIIIZZ(EnumC661340Pwq.PAUSING);
        if (C0C1D.LIZ()) {
            InterfaceC660150Puv interfaceC660150Puv = this.LLJILLL;
            if (interfaceC660150Puv != null && (interfaceC1010450cOxNe2 = interfaceC660150Puv.ne()) != null) {
                interfaceC1010450cOxNe2.LLLLLLJ();
            }
            InterfaceC1010470cOz interfaceC1010470cOz = this.LLJILJILJ;
            if (interfaceC1010470cOz == null || (interfaceC1010450cOxNe = interfaceC1010470cOz.ne()) == null) {
                return;
            }
            interfaceC1010450cOxNe.LLLLLLJ();
        }
    }

    public void LIZJ() {
        InterfaceC1010450cOx interfaceC1010450cOxNe;
        InterfaceC1010450cOx interfaceC1010450cOxNe2;
        LJIIIIZZ(EnumC661340Pwq.PREPARING);
        if (C0C1D.LIZ()) {
            Aweme mAweme = getMAweme();
            if (mAweme != null && C1010120cOQ.LJIJI(mAweme) && C1012040cRW.LIZIZ().LJI) {
                InterfaceC660150Puv interfaceC660150Puv = this.LLJILLL;
                if (interfaceC660150Puv != null) {
                    Aweme mAweme2 = getMAweme();
                    interfaceC660150Puv.LJFF(mAweme2 != null ? mAweme2.getAid() : null);
                }
                C1012040cRW.LIZIZ().LJI = false;
            }
            Aweme mAweme3 = getMAweme();
            if (mAweme3 == null || !C1010120cOQ.LJIJI(mAweme3)) {
                return;
            }
            InterfaceC660150Puv interfaceC660150Puv2 = this.LLJILLL;
            if (interfaceC660150Puv2 != null && (interfaceC1010450cOxNe2 = interfaceC660150Puv2.ne()) != null) {
                interfaceC1010450cOxNe2.QO2();
            }
            InterfaceC1010470cOz interfaceC1010470cOz = this.LLJILJILJ;
            if (interfaceC1010470cOz == null || (interfaceC1010450cOxNe = interfaceC1010470cOz.ne()) == null) {
                return;
            }
            interfaceC1010450cOxNe.QO2();
        }
    }

    public final void LJI() {
        ImageView imageView = this.LLILLL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        ImageView imageView2 = this.LLILZ;
        if (imageView2 != null) {
            C786410Ut5.LJZI(8, imageView2);
        }
    }

    public final void LJIIJJI() {
        if (C662120Py6.LIZ < 0) {
            C662120Py6.LIZ = C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "search_bsr_player_duration_delay", true);
        }
        long j = C662120Py6.LIZ;
        if (LLJJIJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playVideo, ");
            sbLIZ.append(getVideoInfo());
            sbLIZ.append(", aid:");
            Aweme mAweme = getMAweme();
            sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
            sbLIZ.append(", delay:");
            sbLIZ.append(j);
            sbLIZ.append(" ms");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j > 0) {
            getMainHandler().removeMessages(1);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            C786410Ut5.LJLJLJ(getMainHandler(), messageObtain, j);
            return;
        }
        LJ();
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.play();
        }
    }

    public void LJIILIIL() {
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.LJIIL(new InterfaceC2453409jQ() { // from class: X.0PxG
                @Override // X.InterfaceC2453409jQ
                public final Object get() {
                    return new C664340Q4a(this.LIZ.getDataProvider(), C0Q3E.LIZ(this.LIZ));
                }
            });
        }
    }

    public void LLJJJ() {
        LJIIIIZZ(EnumC661340Pwq.PAUSING);
    }

    public void LLLLLIL() {
        InterfaceC661680PxO interfaceC661680PxO;
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (interfaceC661680PxO = c661490Px5.LJIILL) != null) {
            interfaceC661680PxO.LLLLLIL();
        }
        LJIIIIZZ(EnumC661340Pwq.PREPARING);
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        InterfaceC661680PxO interfaceC661680PxO;
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 == null || (interfaceC661680PxO = c661490Px5.LJIILL) == null) {
            return;
        }
        interfaceC661680PxO.LLLLLILLIL();
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        LJIILJJIL("");
    }

    @Override // X.C0R9I
    public final AbsInteractStickerWidget c6() {
        WidgetManager widgetManagerOR;
        Context context;
        C662130Py7.LIZ.getClass();
        InteractStickerWidget interactStickerWidgetLIZ = ((IStickerService) ServiceManager.get().getService(IStickerService.class)).LIZ();
        Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(getItemView());
        if (C1835007Gq.LIZ()) {
            widgetManagerOR = WidgetManager.SR(getItemView(), fragmentLIZLLL);
        } else {
            C661490Px5 c661490Px5 = this.LLILLJJLI;
            C19EG c19egLIZIZ = (c661490Px5 == null || (context = c661490Px5.getContext()) == null) ? null : C1388190mED.LIZIZ(context);
            widgetManagerOR = WidgetManager.OR(c19egLIZIZ, null, getItemView(), c19egLIZIZ);
        }
        if (widgetManagerOR != null) {
            widgetManagerOR.PR(R.id.kvf, interactStickerWidgetLIZ);
        }
        return interactStickerWidgetLIZ;
    }

    public final Aweme getMAweme() {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            return c661490Px5.LIZJ;
        }
        return null;
    }

    public final C652990PjN getMScrollStateManager() {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            return c661490Px5.LJIIIIZZ;
        }
        return null;
    }

    public final AbstractC653010PjP getMScrollStateObserver() {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            return c661490Px5.LJIIIZ;
        }
        return null;
    }

    public final Handler getMainHandler() {
        return (Handler) this.LLJJIII.getValue();
    }

    public final C0N0Y getPlayerManager() {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            return c661490Px5.LJIILIIL;
        }
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA == null) {
            return false;
        }
        if (getMainHandler().hasMessages(1)) {
            return true;
        }
        return interfaceC661540PxA.isPlaying();
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        return interfaceC661540PxA == null ? Boolean.FALSE : Boolean.valueOf(interfaceC661540PxA.isPlaying());
    }

    private final String getVodSceneTag() {
        if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJJZ(getMAweme())) {
            return "gec_general_search_video_native";
        }
        return null;
    }

    public final void LJ() {
        View viewFindViewById = findViewById(R.id.udm);
        View view = this.LLIZLLLIL;
        ViewParent parent = view != null ? view.getParent() : null;
        if (viewFindViewById == null && parent == null) {
            addView(this.LLIZLLLIL, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    public void LJIIIZ() {
        getMainHandler().removeMessages(1);
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.LJI();
        }
    }

    public final void LJIIJ() {
        getMainHandler().removeMessages(1);
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA == null) {
            return;
        }
        interfaceC661540PxA.pause();
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return getItemView();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        getMainHandler().removeMessages(1);
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.LJJLIIIJLLLLLLLZ();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    public String getVideoInfo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoView{");
        sbLIZ.append(Integer.toHexString(hashCode()));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String aid;
        super.onAttachedToWindow();
        if (this.LLILZLL) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(this, c19egLIZIZ);
            if (lifecycleOwnerLJIJI != null) {
                C325901Of.LIZ(lifecycleOwnerLJIJI, this);
            }
        }
        ConcurrentHashMap<String, WeakReference<C653660PkS>> concurrentHashMap = C666560QCo.LJIJJ;
        Aweme mAweme = getMAweme();
        if (mAweme == null || (aid = mAweme.getAid()) == null) {
            aid = "";
        }
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        concurrentHashMap.put(aid, new WeakReference<>(c661490Px5 != null ? c661490Px5.LJIL : null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C661490Px5 c661490Px5;
        View viewFindViewById;
        super.onDetachedFromWindow();
        if (this.LLILZLL) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(this, c19egLIZIZ);
            if (lifecycleOwnerLJIJI != null) {
                C325901Of.LJ(lifecycleOwnerLJIJI, this);
            }
        }
        getMainHandler().removeMessages(1);
        if (C662140Py8.LIZ < 0) {
            C662140Py8.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_remove_surface_view_on_detach", true);
        }
        if ((C662140Py8.LIZ == 1) && C0C1E.LIZ() == 3) {
            View viewFindViewById2 = findViewById(R.id.udm);
            if (viewFindViewById2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, viewFindViewById2);
                removeView(viewFindViewById2);
            }
        } else {
            if (C662140Py8.LIZ < 0) {
                C662140Py8.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_remove_surface_view_on_detach", true);
            }
            if (C662140Py8.LIZ == 1 && C0C1E.LIZ() == 1 && (((c661490Px5 = this.LLILLJJLI) == null || c661490Px5.LJJIFFI != 0) && (viewFindViewById = findViewById(R.id.udm)) != null)) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, viewFindViewById);
                removeView(viewFindViewById);
            }
        }
        C661490Px5 c661490Px52 = this.LLILLJJLI;
        if (c661490Px52 != null) {
            c661490Px52.LJJIJIIJIL = null;
            c661490Px52.LJJIJLIJ = "";
        }
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
        getMainHandler().removeMessages(1);
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.release();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    public final C661490Px5 getDataProvider() {
        return this.LLILLJJLI;
    }

    public final boolean getEnableHideCoverAnim() {
        return this.LLILZIL;
    }

    public final boolean getEnableLifecycleObserver() {
        return this.LLILZLL;
    }

    public final ImageView getInnerCoverView() {
        return this.LLILZ;
    }

    public final ImageView getMCoverView() {
        return this.LLILLL;
    }

    public final InterfaceC661540PxA getVideoPlayer() {
        return this.LLJ;
    }

    public final InterfaceC661770PxX getVideoPlayerStatusListener() {
        return this.LL;
    }

    public static void LJIIL(C661470Px3 c661470Px3) {
        InterfaceC661540PxA interfaceC661540PxA = c661470Px3.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.LIZJ();
        }
    }

    private final void setMAweme(Aweme aweme) {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            c661490Px5.LIZJ = aweme;
        }
    }

    private final void setMEventType(String str) {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            if (str == null) {
                str = "";
            }
            c661490Px5.LJIIZILJ = str;
        }
    }

    public final void LIZLLL(InterfaceC661400Pww interfaceC661400Pww) {
        this.LLJILJIL.add(interfaceC661400Pww);
    }

    public void LJFF(Aweme aweme) {
        C653660PkS c653660PkS;
        C661490Px5 c661490Px5;
        ConcurrentHashMap<String, WeakReference<C653660PkS>> concurrentHashMap = C666560QCo.LJIJJ;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        C661490Px5 c661490Px52 = this.LLILLJJLI;
        if (c661490Px52 != null) {
            c653660PkS = c661490Px52.LJIL;
        } else {
            c653660PkS = null;
        }
        concurrentHashMap.put(aid, new WeakReference<>(c653660PkS));
        setMAweme(aweme);
        if (C0C1E.LIZ() == 1 && (c661490Px5 = this.LLILLJJLI) != null && c661490Px5.LJJIFFI == 0) {
            LJ();
        }
        LJIILIIL();
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.LJIIJ(aweme, getVodSceneTag(), "search_outer_general");
        }
        LJIILJJIL("bind");
        EnumC661340Pwq enumC661340Pwq = this.LLJIJIL;
        EnumC661340Pwq enumC661340Pwq2 = EnumC661340Pwq.IDLE;
        if (enumC661340Pwq.isAtMost(enumC661340Pwq2)) {
            LJIIIIZZ(enumC661340Pwq2);
        }
        if (this.LLIZLLLIL instanceof SurfaceView) {
            TuxTextView tuxTextView = this.LLJJI;
            if (tuxTextView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("S: ");
                sbLIZ.append(aweme.getAid());
                tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJI;
        if (tuxTextView2 == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("T: ");
        sbLIZ2.append(aweme.getAid());
        tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJIIIIZZ(EnumC661340Pwq enumC661340Pwq) {
        InterfaceC661770PxX interfaceC661770PxX;
        EnumC661340Pwq enumC661340Pwq2 = this.LLJIJIL;
        if (enumC661340Pwq2 == enumC661340Pwq) {
            return;
        }
        this.LLJI = enumC661340Pwq2;
        this.LLJIJIL = enumC661340Pwq;
        for (InterfaceC661400Pww interfaceC661400Pww : this.LLJILJIL) {
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                mAweme.getAid();
            }
            interfaceC661400Pww.LIZIZ(enumC661340Pwq);
        }
        if (enumC661340Pwq == EnumC661340Pwq.PLAY_COMPLETED && (interfaceC661770PxX = this.LL) != null) {
            interfaceC661770PxX.LIZ(new C581630MrZ(7, 0));
        }
    }

    public final void LJIILJJIL(String str) {
        Integer numValueOf;
        if (!z3().booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showCover, ");
            sbLIZ.append(getVideoInfo());
            sbLIZ.append(", source:");
            sbLIZ.append(str);
            sbLIZ.append(", visible: ");
            ImageView imageView = this.LLILLL;
            if (imageView != null) {
                numValueOf = Integer.valueOf(imageView.getVisibility());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            ImageView imageView2 = this.LLILLL;
            if (imageView2 != null) {
                C786410Ut5.LJZI(0, imageView2);
            }
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onPausePlay(String str) {
        CopyOnWriteArraySet<OnUIPlayListener> copyOnWriteArraySet;
        if (this.LLJIJIL == EnumC661340Pwq.PAUSING) {
            LJIIIIZZ(EnumC661340Pwq.PAUSED);
        }
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (copyOnWriteArraySet = c661490Px5.LJIILLIIL) != null) {
            Iterator<OnUIPlayListener> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().onPausePlay(str);
            }
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onPlayCompleted(String str) {
        InterfaceC1010450cOx interfaceC1010450cOxNe;
        InterfaceC1010450cOx interfaceC1010450cOxNe2;
        CopyOnWriteArraySet<OnUIPlayListener> copyOnWriteArraySet;
        String aid;
        if (this.LLJIJIL == EnumC661340Pwq.STARTED) {
            LJIIIIZZ(EnumC661340Pwq.PLAY_COMPLETED);
        }
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (copyOnWriteArraySet = c661490Px5.LJIILLIIL) != null) {
            for (OnUIPlayListener onUIPlayListener : copyOnWriteArraySet) {
                Aweme mAweme = getMAweme();
                if (mAweme == null || (aid = mAweme.getAid()) == null) {
                    aid = "";
                }
                onUIPlayListener.onPlayCompleted(aid);
            }
        }
        Iterator<InterfaceC661740PxU> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayCompleted(str);
        }
        if (C0C1D.LIZ()) {
            InterfaceC660150Puv interfaceC660150Puv = this.LLJILLL;
            if (interfaceC660150Puv != null && (interfaceC1010450cOxNe2 = interfaceC660150Puv.ne()) != null) {
                interfaceC1010450cOxNe2.LJJLIIIJ();
            }
            InterfaceC1010470cOz interfaceC1010470cOz = this.LLJILJILJ;
            if (interfaceC1010470cOz != null && (interfaceC1010450cOxNe = interfaceC1010470cOz.ne()) != null) {
                interfaceC1010450cOxNe.LJJLIIIJ();
            }
            InterfaceC659840PuQ interfaceC659840PuQ = this.LLJJ;
            if (interfaceC659840PuQ != null) {
                interfaceC659840PuQ.aw(str);
            }
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onPlayCompletedFirstTime(String str) {
        InterfaceC661680PxO interfaceC661680PxO;
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (interfaceC661680PxO = c661490Px5.LJIILL) != null) {
            interfaceC661680PxO.onPlayCompletedFirstTime(str);
        }
    }

    public void onPlayPrepare(String str) {
        EnumC661340Pwq enumC661340Pwq = this.LLJIJIL;
        if (enumC661340Pwq == EnumC661340Pwq.PREPARING || enumC661340Pwq == EnumC661340Pwq.BUFFERING) {
            LJIIIIZZ(EnumC661340Pwq.PREPARED);
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onPlayStop(String str) {
        Boolean boolValueOf;
        InterfaceC659840PuQ interfaceC659840PuQ;
        C661550PxB c661550PxBLJ;
        C0N0Y c0n0y;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayStop: sourceId:");
        sbLIZ.append(str);
        sbLIZ.append(", playing: ");
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (c661550PxBLJ = c661490Px5.LJ()) != null && (c0n0y = c661550PxBLJ.LJFF) != null) {
            boolValueOf = Boolean.valueOf(c0n0y.isPlaying());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJIJIL == EnumC661340Pwq.STOPPING) {
            LJIIIIZZ(EnumC661340Pwq.STOPPED);
        }
        if (C0C1D.LIZ() && (interfaceC659840PuQ = this.LLJJ) != null) {
            interfaceC659840PuQ.yB();
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onPlaying(String str) {
        InterfaceC659840PuQ interfaceC659840PuQ;
        CopyOnWriteArraySet<OnUIPlayListener> copyOnWriteArraySet;
        String aid;
        EnumC661340Pwq enumC661340Pwq = this.LLJIJIL;
        if (enumC661340Pwq == EnumC661340Pwq.PREPARING || enumC661340Pwq == EnumC661340Pwq.PREPARED || enumC661340Pwq == EnumC661340Pwq.BUFFERING || enumC661340Pwq == EnumC661340Pwq.STARTED) {
            LJIIIIZZ(EnumC661340Pwq.STARTED);
        }
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (copyOnWriteArraySet = c661490Px5.LJIILLIIL) != null) {
            for (OnUIPlayListener onUIPlayListener : copyOnWriteArraySet) {
                Aweme mAweme = getMAweme();
                if (mAweme == null || (aid = mAweme.getAid()) == null) {
                    aid = "";
                }
                onUIPlayListener.onPlaying(aid);
            }
        }
        if (C0C1D.LIZ() && (interfaceC659840PuQ = this.LLJJ) != null) {
            interfaceC659840PuQ.F4(str);
        }
    }

    public void onResume(LifecycleOwner lifecycleOwner) {
        InterfaceC661680PxO interfaceC661680PxO;
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (interfaceC661680PxO = c661490Px5.LJIILL) != null) {
            interfaceC661680PxO.zU();
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onResumePlay(String str) {
        LJI();
        EnumC661340Pwq enumC661340Pwq = this.LLJIJIL;
        if (enumC661340Pwq == EnumC661340Pwq.PREPARING || enumC661340Pwq == EnumC661340Pwq.PREPARED || enumC661340Pwq == EnumC661340Pwq.BUFFERING || enumC661340Pwq == EnumC661340Pwq.STARTED) {
            LJIIIIZZ(EnumC661340Pwq.STARTED);
        }
        Iterator<InterfaceC661740PxU> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onResumePlay(str);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public final void setContainerStatusProvider(InterfaceC641090PCp interfaceC641090PCp) {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            c661490Px5.LJII = interfaceC641090PCp;
        }
    }

    public final void setDataProvider(C661490Px5 c661490Px5) {
        this.LLILLJJLI = c661490Px5;
    }

    public final void setEnableHideCoverAnim(boolean z) {
        this.LLILZIL = z;
    }

    public final void setEnableLifecycleObserver(boolean z) {
        this.LLILZLL = z;
    }

    public final void setFillHeight(boolean z) {
        InterfaceC661540PxA interfaceC661540PxA;
        if (!z && (interfaceC661540PxA = this.LLJ) != null) {
            interfaceC661540PxA.LIZLLL(3);
        }
    }

    public final void setISubInfoListener(InterfaceC1472010oPP interfaceC1472010oPP) {
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.LJJIJL(interfaceC1472010oPP);
        }
    }

    public final void setInnerCoverView(ImageView imageView) {
        this.LLILZ = imageView;
    }

    public final void setMCoverView(ImageView imageView) {
        this.LLILLL = imageView;
    }

    public final void setMScrollStateManager(C652990PjN c652990PjN) {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            c661490Px5.LJIIIIZZ = c652990PjN;
        }
    }

    public final void setMScrollStateObserver(AbstractC653010PjP abstractC653010PjP) {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            c661490Px5.LJIIIZ = abstractC653010PjP;
        }
    }

    public final void setMute(boolean z) {
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.LJIILJJIL(z);
        }
    }

    @Override // X.InterfaceC648350Pbt
    public void setPlayMetrics(C664400Q4g c664400Q4g) {
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.setPlayMetrics(c664400Q4g);
        }
    }

    public final void setSubCallbackEnable(boolean z) {
        InterfaceC661540PxA interfaceC661540PxA = this.LLJ;
        if (interfaceC661540PxA != null) {
            interfaceC661540PxA.LJJIJLIJ(z);
        }
    }

    public final void setVideoLifeCycleListener(OnUIPlayListener onUIPlayListener) {
        C661490Px5 c661490Px5;
        CopyOnWriteArraySet<OnUIPlayListener> copyOnWriteArraySet;
        if (onUIPlayListener != null && (c661490Px5 = this.LLILLJJLI) != null && (copyOnWriteArraySet = c661490Px5.LJIILLIIL) != null) {
            copyOnWriteArraySet.add(onUIPlayListener);
        }
    }

    public final void setVideoPlayer(InterfaceC661540PxA interfaceC661540PxA) {
        this.LLJ = interfaceC661540PxA;
    }

    public final void setVideoPlayerStatusListener(InterfaceC661770PxX interfaceC661770PxX) {
        this.LL = interfaceC661770PxX;
    }

    public final void setVideoUiListener(InterfaceC661680PxO interfaceC661680PxO) {
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null) {
            c661490Px5.LJIILL = interfaceC661680PxO;
        }
    }

    public C661470Px3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    @Override // X.InterfaceC662180PyC
    public final void onBuffering(String str, boolean z) {
        String aid;
        CopyOnWriteArraySet<OnUIPlayListener> copyOnWriteArraySet;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBuffering, sourceId:");
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            aid = mAweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", start:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            EnumC661340Pwq enumC661340Pwq = this.LLJIJIL;
            if (enumC661340Pwq == EnumC661340Pwq.PREPARING || enumC661340Pwq == EnumC661340Pwq.PREPARED || enumC661340Pwq == EnumC661340Pwq.STARTED) {
                LJIIIIZZ(EnumC661340Pwq.BUFFERING);
            }
        } else if (this.LLJIJIL == EnumC661340Pwq.BUFFERING) {
            LJIIIIZZ(this.LLJI);
        }
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (copyOnWriteArraySet = c661490Px5.LJIILLIIL) != null) {
            Iterator<OnUIPlayListener> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().onBuffering(str, z);
            }
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        CopyOnWriteArraySet<OnUIPlayListener> copyOnWriteArraySet;
        String aid;
        LJIILJJIL("playFailed");
        LJIIIIZZ(EnumC661340Pwq.ERROR);
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (copyOnWriteArraySet = c661490Px5.LJIILLIIL) != null) {
            for (OnUIPlayListener onUIPlayListener : copyOnWriteArraySet) {
                Aweme mAweme = getMAweme();
                if (mAweme == null || (aid = mAweme.getAid()) == null) {
                    aid = "";
                }
                onUIPlayListener.onPlayFailed(aid, c1481290oeN);
            }
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        InterfaceC1010450cOx interfaceC1010450cOxNe;
        InterfaceC1010450cOx interfaceC1010450cOxNe2;
        CopyOnWriteArraySet<OnUIPlayListener> copyOnWriteArraySet;
        C19EG c19egLIZIZ;
        EnumC661340Pwq enumC661340Pwq = this.LLJIJIL;
        if (enumC661340Pwq == EnumC661340Pwq.PREPARING || enumC661340Pwq == EnumC661340Pwq.PREPARED || enumC661340Pwq == EnumC661340Pwq.BUFFERING || enumC661340Pwq == EnumC661340Pwq.STARTED) {
            LJIIIIZZ(EnumC661340Pwq.STARTED);
        }
        LJI();
        if (TextUtils.equals(getMEventType(), "homepage_follow") && (c19egLIZIZ = C1388190mED.LIZIZ(getContext())) != null) {
            C679340Qkm.LIZIZ(C946803n0.LIZ(getItemView()), c19egLIZIZ).get(FollowPageFirstFrameViewModel.class).getClass();
        }
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (copyOnWriteArraySet = c661490Px5.LJIILLIIL) != null) {
            Iterator<OnUIPlayListener> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().onRenderFirstFrame(str, c1480420ocy);
            }
        }
        Iterator<InterfaceC661740PxU> it3 = this.LLIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LJJIJIIJI(str);
        }
        if (C0C1D.LIZ()) {
            InterfaceC660150Puv interfaceC660150Puv = this.LLJILLL;
            if (interfaceC660150Puv != null && (interfaceC1010450cOxNe2 = interfaceC660150Puv.ne()) != null) {
                interfaceC1010450cOxNe2.LJII();
            }
            InterfaceC1010470cOz interfaceC1010470cOz = this.LLJILJILJ;
            if (interfaceC1010470cOz != null && (interfaceC1010450cOxNe = interfaceC1010470cOz.ne()) != null) {
                interfaceC1010450cOxNe.LJII();
            }
            InterfaceC659840PuQ interfaceC659840PuQ = this.LLJJ;
            if (interfaceC659840PuQ != null) {
                interfaceC659840PuQ.LJJIJIIJI(str);
            }
        }
    }

    public C661470Px3(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        this.LLIZ = new LinkedHashSet();
        EnumC661340Pwq enumC661340Pwq = EnumC661340Pwq.IDLE;
        this.LLJI = enumC661340Pwq;
        this.LLJIJIL = enumC661340Pwq;
        this.LLJILJIL = new LinkedHashSet();
        this.LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 544));
        int i2 = 0;
        if ((C0C1E.LIZ() & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        AttributeSet attributeSet2 = null;
        if (z) {
            C1473990oSb c1473990oSb = new C1473990oSb(context);
            c1473990oSb.setId(R.id.udm);
            this.LLIZLLLIL = c1473990oSb;
            C661490Px5 c661490Px5 = new C661490Px5();
            this.LLILLJJLI = c661490Px5;
            C0Q5B c0q5b = new C0Q5B(c1473990oSb, this, c661490Px5, true);
            this.LLJ = c0q5b;
            c0q5b.LJIJJ.Dn(new InterfaceC1473950oSX() { // from class: X.0PxV
                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void LLF(int i3, int i4) {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LLILLIZIL(int i3, int i4) {
                }

                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LIZ() {
                    this.LL.LJIILJJIL("surfaceDestroyed");
                }
            });
        } else {
            C1473870oSP c1473870oSP = new C1473870oSP(context, null);
            c1473870oSP.setId(R.id.udm);
            this.LLIZLLLIL = c1473870oSP;
            LJ();
            C661490Px5 c661490Px52 = new C661490Px5();
            this.LLILLJJLI = c661490Px52;
            C0Q5B c0q5b2 = new C0Q5B(c1473870oSP, this, c661490Px52, true);
            this.LLJ = c0q5b2;
            c0q5b2.LJIJJ.Dn(new InterfaceC1473950oSX() { // from class: X.0PxW
                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void LLF(int i3, int i4) {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LLILLIZIL(int i3, int i4) {
                }

                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LIZ() {
                    this.LL.LJIILJJIL("surfaceDestroyed");
                }
            });
        }
        if (C662150Py9.LIZ < 0) {
            C662150Py9.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_player_surface_debug", true);
        }
        if (C662150Py9.LIZ == 1) {
            TuxTextView tuxTextView = new TuxTextView(context, attributeSet2, 6, i2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = (int) C418040GaI.LIZ(2);
            addView(tuxTextView, layoutParams);
            tuxTextView.setTextSize(8.0f);
            tuxTextView.setTextColor(-65536);
            tuxTextView.setBackgroundColor(-3355444);
            this.LLJJI = tuxTextView;
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onBufferedPercent(String str, long j, int i) {
        CopyOnWriteArraySet<OnUIPlayListener> copyOnWriteArraySet;
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (copyOnWriteArraySet = c661490Px5.LJIILLIIL) != null) {
            Iterator<OnUIPlayListener> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().onBufferedPercent(str, j, i);
            }
        }
    }

    @Override // X.InterfaceC662180PyC
    public final void onPlayProgressChange(String str, long j, long j2) {
        InterfaceC661680PxO interfaceC661680PxO;
        C661490Px5 c661490Px5 = this.LLILLJJLI;
        if (c661490Px5 != null && (interfaceC661680PxO = c661490Px5.LJIILL) != null) {
            interfaceC661680PxO.onPlayProgressChange(str, j, j2);
        }
        Iterator<InterfaceC661740PxU> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(j, j2);
        }
    }

    public static void LJII(final C661470Px3 c661470Px3, InterfaceC660150Puv interfaceC660150Puv, boolean z, final Aweme aweme, int i) {
        InterfaceC660150Puv interfaceC660150Puv2 = null;
        if ((i & 2) != 0) {
            interfaceC660150Puv = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if (!C0C1D.LIZ()) {
            InterfaceC661540PxA interfaceC661540PxA = c661470Px3.LLJ;
            if (interfaceC661540PxA != null) {
                interfaceC661540PxA.LJII(null, interfaceC660150Puv, z, aweme);
                return;
            }
            return;
        }
        c661470Px3.LLJILJILJ = null;
        c661470Px3.LLJILLL = null;
        if (z) {
            return;
        }
        InterfaceC1010860cPc interfaceC1010860cPc = new InterfaceC1010860cPc() { // from class: X.0PxF
            @Override // X.InterfaceC1010860cPc
            public final Context LIZ() {
                Context context;
                View view = this.LIZ.LLIZLLLIL;
                return (view == null || (context = view.getContext()) == null) ? this.LIZ.getContext() : context;
            }

            @Override // X.InterfaceC1010860cPc
            public final Aweme getAweme() {
                Aweme aweme2 = aweme;
                return aweme2 == null ? this.LIZ.getMAweme() : aweme2;
            }

            @Override // X.InterfaceC1010860cPc
            public final long getCurrentPosition() {
                InterfaceC661540PxA videoPlayer = this.LIZ.getVideoPlayer();
                if (videoPlayer != null) {
                    return videoPlayer.getCurrentPosition();
                }
                return 0L;
            }

            @Override // X.InterfaceC1010860cPc
            public final View getView() {
                return this.LIZ.LLIZLLLIL;
            }

            @Override // X.InterfaceC1010860cPc
            public final boolean isPlaying() {
                InterfaceC661540PxA videoPlayer = this.LIZ.getVideoPlayer();
                if (videoPlayer != null) {
                    return videoPlayer.isPlaying();
                }
                return false;
            }

            @Override // X.InterfaceC1010860cPc
            public final boolean isMute() {
                return C659080PtC.LIZIZ();
            }
        };
        c661470Px3.LLJILJILJ = null;
        if (interfaceC660150Puv != null) {
            interfaceC660150Puv.ik(interfaceC1010860cPc);
            interfaceC660150Puv2 = interfaceC660150Puv;
        }
        c661470Px3.LLJILLL = interfaceC660150Puv2;
    }
}
