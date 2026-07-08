package X;

import X.C640750PBh;
import X.C650630PfZ;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.SearchLiveForLynx$ability$1;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS70S0301000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0PsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C658550PsL extends FrameLayout implements InterfaceC663110Pzh, InterfaceC648270Pbl, InterfaceC211600ri, C0PML {
    public final /* synthetic */ C650580PfU LL;
    public volatile Long LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public Function2<? super String, ? super Map<String, ? extends Object>, Unit> LLIZLLLIL;
    public Function0<Unit> LLJ;
    public String LLJI;
    public SmartImageView LLJIJIL;
    public ARunnableS110S0100000_10 LLJILJIL;
    public final BPEAHandler LLJILJILJ;
    public final long LLJILLL;
    public final C01GW LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public s LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public boolean LLJJJJ;
    public final C658560PsM LLJJJJJIL;
    public final C615230OBd LLJJJJLIIL;
    public InterfaceC665370Q7z LLJJL;
    public final SearchLiveForLynx$ability$1 LLJJLIIIJLLLLLLLZ;
    public Map<String, ? extends Object> LLJL;
    public String LLJLIL;
    public Map<String, ? extends Object> LLJLILLLLZIIL;
    public int LLJLL;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC663110Pzh
    public final void LIZ() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LIZIZ() {
    }

    @Override // X.C0PML
    public final void LIZJ() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LIZLLL() {
        LJIJI(true);
        LJIILL("ended", new HashMap());
        this.LLIZ = false;
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJ() {
    }

    @Override // X.C0PML
    public final void LJFF() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJI(int i, int i2, View view) {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJIIIZ() {
        this.LLJJJJ = true;
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJJZ() {
        this.LLIZ = true;
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

    @Override // X.C0PML
    public C658550PsL getView() {
        return this;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC663110Pzh
    public final void onBind() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void onDestroy() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void onInit() {
    }

    @Override // X.InterfaceC663110Pzh
    public final void onPause() {
        LJIJI(false);
        LJIILL("stop", new HashMap());
        this.LLIZ = false;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
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

    private final String getCardName() {
        return (String) this.LLJJIJIIJIL.getValue();
    }

    private final C641050PCl getContainerStatusProvider() {
        return (C641050PCl) this.LLJJJ.getValue();
    }

    public final void LJIIJJI() {
        s sVar;
        AbstractC653010PjP mScrollStateObserver;
        DynamicPatch dynamicPatch;
        if (this.LLILZIL) {
            O4();
            C649040Pd0 c649040Pd0LIZ = C647140PZw.LIZ.LIZ(this.LLILZ);
            String str = (c649040Pd0LIZ == null || (dynamicPatch = c649040Pd0LIZ.LIZ) == null) ? null : dynamicPatch.schema;
            if ((str == null || str.length() == 0) && ((sVar = this.LLJJIJIL) == null || (str = sVar.LLJJIII) == null)) {
                str = "";
            }
            if (((Number) AnonymousClass0780.LIZ.getValue()).intValue() != 0 || str == null || !a0.LJJIIZI(str, "activity-hub", false)) {
                C646200PWg.LJFF(getLiveCore());
            }
            C660180Puy.LIZ(this);
            setMScrollStateManager(null);
            C652990PjN mScrollStateManager = getMScrollStateManager();
            if (mScrollStateManager == null || (mScrollStateObserver = getMScrollStateObserver()) == null) {
                return;
            }
            mScrollStateObserver.LIZ = 0;
            mScrollStateObserver.LIZIZ = false;
            mScrollStateObserver.LIZIZ();
            mScrollStateManager.LIZIZ.add(mScrollStateObserver);
        }
    }

    public final void LJIIZILJ() {
        if (this.LLILZLL) {
            String roomId = getRoomId();
            long j = roomId != null ? CastLongProtector.parseLong(roomId) : 1L;
            Long l = this.LLILLJJLI;
            if (l != null && j == l.longValue()) {
                this.LLJJJJ = false;
                this.LLILLJJLI = null;
                LJIJJ();
            }
            getLiveCore().setMute(true);
        }
        InterfaceC655620Pnc interfaceC655620Pnc = getDataProvider().LJ;
        if (interfaceC655620Pnc != null) {
            interfaceC655620Pnc.u4(150L);
        }
    }

    public final void LJIJJ() {
        InterfaceC655620Pnc interfaceC655620Pnc;
        Long l;
        if (this.LLILZLL) {
            String roomId = getRoomId();
            long j = roomId != null ? CastLongProtector.parseLong(roomId) : -1L;
            if ((this.LLILLJJLI == null || (l = this.LLILLJJLI) == null || l.longValue() != j) && (interfaceC655620Pnc = getDataProvider().LJ) != null) {
                interfaceC655620Pnc.LLJJJ();
            }
        } else {
            InterfaceC655620Pnc interfaceC655620Pnc2 = getDataProvider().LJ;
            if (interfaceC655620Pnc2 != null) {
                interfaceC655620Pnc2.LLJJJ();
            }
        }
        LJIJI(false);
    }

    public final C658480PsE getDataProvider() {
        return (C658480PsE) this.LLJJJIL.getValue();
    }

    public final C663070Pzd getLiveCore() {
        return (C663070Pzd) this.LLJJIJI.getValue();
    }

    public final Fragment getRootFragment() {
        return (Fragment) this.LLJJ.getValue();
    }

    @Override // X.InterfaceC663110Pzh
    public final void onLoading() {
        LJIILL("loading", new HashMap());
    }

    private final AbstractC653010PjP getMScrollStateObserver() {
        return getDataProvider().LIZLLL;
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJII() {
        Aweme aweme = getDataProvider().LJI;
        LiveRoomStruct newLiveRoomDataExt = aweme != null ? AwemeExtKt.getNewLiveRoomDataExt(aweme) : null;
        if ((newLiveRoomDataExt == null || !newLiveRoomDataExt.liveTypeAudio) && this.LLJJJJ) {
            this.LLJJJJ = false;
            getLiveCore().LJIIIZ();
        }
        C663070Pzd liveCore = getLiveCore();
        if (liveCore != null) {
            boolean z = C659080PtC.LIZ;
            liveCore.setMute(C659080PtC.LIZ(this.LLJLL, 0, null));
        }
        Function0<Unit> function0 = this.LLJ;
        if (function0 != null) {
            function0.invoke();
        }
        C659080PtC.LJFF();
        LJIILL("play", C2097608Jq.LJI(new Pair("muted", Integer.valueOf(C659080PtC.LIZIZ))));
    }

    @Override // X.InterfaceC663110Pzh
    public final void LJIIJ() {
        getLiveCore().LIZIZ();
    }

    public final void LJIILJJIL() {
        C646200PWg.LJI(getLiveCore());
        InterfaceC655620Pnc interfaceC655620Pnc = getDataProvider().LJ;
        if (interfaceC655620Pnc != null) {
            interfaceC655620Pnc.onDestroy();
        }
        C652990PjN mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.LJ(getMScrollStateObserver());
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        C663070Pzd liveCore = getLiveCore();
        liveCore.getClass();
        return liveCore;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        InterfaceC655620Pnc interfaceC655620Pnc = getDataProvider().LJ;
        if (interfaceC655620Pnc != null) {
            interfaceC655620Pnc.LLJJJ();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        String str;
        Map<String, String> map;
        if (getLiveCore().getLivePlayerEntranceParam() == null) {
            C653660PkS c653660PkS = getDataProvider().LJII;
            C663070Pzd liveCore = getLiveCore();
            String str2 = null;
            if (this.LLILZLL) {
                if (c653660PkS != null && (map = c653660PkS.LJJJJJL) != null) {
                    str2 = map.get("enter_from");
                }
            } else if (c653660PkS == null || (str2 = c653660PkS.LJIIIIZZ) == null) {
                str2 = "";
            }
            if (!C123100dR.LIZ(this.LLJJIII) ? c653660PkS == null || (str = c653660PkS.LJIIIZ) == null || str.length() == 0 : (str = this.LLJJIII) == null || str.length() == 0) {
                str = "live_cell";
            }
            liveCore.setLivePlayerEntranceParam(new C1699360uK6(str2, str, null, (C123100dR.LIZ(this.LLJJIII) || this.LLILZLL) ? "ecom" : "", false, true, 8));
        }
        InterfaceC655620Pnc interfaceC655620Pnc = getDataProvider().LJ;
        if (interfaceC655620Pnc != null) {
            interfaceC655620Pnc.u4(0L);
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        InterfaceC655620Pnc interfaceC655620Pnc = getDataProvider().LJ;
        if (interfaceC655620Pnc != null) {
            interfaceC655620Pnc.LLLLLILLIL();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        InterfaceC655620Pnc interfaceC655620Pnc = getDataProvider().LJ;
        if (interfaceC655620Pnc != null) {
            interfaceC655620Pnc.onDestroy();
        }
    }

    @Override // X.InterfaceC211600ri
    public String getAuthorId() {
        String authorUid;
        Aweme mAweme = getMAweme();
        return (mAweme == null || (authorUid = AwemeExtKt.getAuthorUid(mAweme)) == null) ? "" : authorUid;
    }

    public Aweme getAwemeStruct() {
        return getMAweme();
    }

    @Override // X.InterfaceC648350Pbt
    public String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC211600ri
    public String getGroupId() {
        String aid;
        Aweme mAweme = getMAweme();
        return (mAweme == null || (aid = mAweme.getAid()) == null) ? "" : aid;
    }

    public final Aweme getMAweme() {
        return getDataProvider().LJI;
    }

    public final C652990PjN getMScrollStateManager() {
        return getDataProvider().LIZJ;
    }

    public final String getRoomId() {
        User author;
        Aweme mAweme = getMAweme();
        if (mAweme == null || (author = mAweme.getAuthor()) == null) {
            return null;
        }
        return author.roomIdStr;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return getLiveCore().isPlaying();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String aid;
        InterfaceC655270Pn3 interfaceC655270Pn3;
        super.onAttachedToWindow();
        LJIILL("attached", new HashMap());
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C641100PCq.LIZIZ(this);
        this.LLJJL = interfaceC665370Q7zLIZIZ;
        if (interfaceC665370Q7zLIZIZ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this.LLJJLIIIJLLLLLLLZ, SearchServiceCenter$AutoPlayAbility.class, null, null);
        }
        EventBus.LIZLLL().LJIJJ(this);
        getDataProvider().LIZ = getContainerStatusProvider();
        LJIIJJI();
        ConcurrentHashMap<String, WeakReference<C653660PkS>> concurrentHashMap = C666560QCo.LJIJJ;
        Aweme mAweme = getMAweme();
        if (mAweme == null || (aid = mAweme.getAid()) == null) {
            aid = "";
        }
        concurrentHashMap.put(aid, new WeakReference<>(getDataProvider().LJII));
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(this, c19egLIZIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(this.LLJJJJJIL);
        }
        C036E.LIZ.LIZ(this.LLJJJJLIIL);
        this.LL.LIZ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        super.onDetachedFromWindow();
        LJIILL("detached", new HashMap());
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLJJL;
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, SearchServiceCenter$AutoPlayAbility.class, null);
        }
        LJIILJJIL();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(this, c19egLIZIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this.LLJJJJJIL);
        }
        C036E.LIZ.LIZLLL(this.LLJJJJLIIL);
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    public final Long getJumpRoomId() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC211600ri
    public Map<String, Object> getOriginLogExtra() {
        return this.LLJLILLLLZIIL;
    }

    public final boolean getOutCorner() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC211600ri
    public String getSessionIdStr() {
        return this.LLJLIL;
    }

    @Override // X.C0PML
    public /* bridge */ /* synthetic */ View getView() {
        getView();
        return this;
    }

    private final void setMAweme(Aweme aweme) {
        getDataProvider().LJI = aweme;
    }

    private final void setMScrollStateObserver(AbstractC653010PjP abstractC653010PjP) {
        getDataProvider().LIZLLL = abstractC653010PjP;
    }

    @Override // X.C0PML
    public final boolean LJIIIIZZ(String str) {
        String aid;
        Aweme aweme = getDataProvider().LJI;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.equals(str)) {
            return true;
        }
        return false;
    }

    public final void LJIIL(Aweme aweme) {
        C653660PkS c653660PkS;
        if (Intrinsics.LJFF(getMAweme(), aweme)) {
            return;
        }
        O4();
        this.LLJJJJ = true;
        LJIILIIL(aweme);
        getLiveCore().LIZJ(aweme);
        getLiveCore().LIZIZ();
        if (((Boolean) C271560Akc.LIZ.getValue()).booleanValue()) {
            getLiveCore().setBackgroundColor(-16777216);
        }
        ConcurrentHashMap<String, WeakReference<C653660PkS>> concurrentHashMap = C666560QCo.LJIJJ;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        C658480PsE dataProvider = getDataProvider();
        if (dataProvider != null) {
            c653660PkS = dataProvider.LJII;
        } else {
            c653660PkS = null;
        }
        concurrentHashMap.put(aid, new WeakReference<>(c653660PkS));
        setMAweme(aweme);
    }

    public final void LJIILIIL(Aweme aweme) {
        UrlModel urlModel;
        SmartImageView smartImageView = this.LLJIJIL;
        User author = aweme.getAuthor();
        if (author != null) {
            urlModel = author.roomCover;
        } else {
            urlModel = null;
        }
        if (smartImageView != null) {
            if (C123100dR.LIZ(this.LLJJI) && this.LLILZLL && ((Boolean) C133800fA.LIZ.getValue()).booleanValue()) {
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                String str = this.LLJJI;
                C1334210kp9.LIZIZ(str, EnumC1769850w9n.SEARCH_PRODUCT, null, null, false, false, null, null);
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                c1331670kl3LIZLLL.LIZLLL(getCardName());
                c1331670kl3LIZLLL.LJJJIL = new C651020PgC(this, aweme);
                C786410Ut5.h3(c1331670kl3LIZLLL);
                return;
            }
            if (this.LLJJIII != null && C1202104n5.LIZ().LJIJJLI()) {
                if (urlModel == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                List<String> urlList = urlModel.getUrlList();
                if (urlList != null) {
                    for (String str2 : urlList) {
                        C1334210kp9.LIZIZ(str2, EnumC1769850w9n.GENERAL_SEARCH_LYNX_LIVE_COVER, null, null, false, false, null, null);
                        arrayList.add(str2);
                    }
                }
                C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
                ImageUrlModel imageUrlModel = new ImageUrlModel(urlModel.getUri(), arrayList);
                c1326790kdB2.getClass();
                C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageUrlModel);
                c1331670kl3LIZLLL2.LJJ(smartImageView);
                c1331670kl3LIZLLL2.LIZLLL(getCardName());
                c1331670kl3LIZLLL2.LJJJIL = new C651020PgC(this, aweme);
                C786410Ut5.h3(c1331670kl3LIZLLL2);
                return;
            }
            if (urlModel == null) {
                return;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LIZLLL(getCardName());
            c1331670kl3LJIIIIZZ.LJJJIL = new C651020PgC(this, aweme);
            if (C284190BBx.LIZ()) {
                c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIIIZZ.LJJJJJ = "search_cache";
            }
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
    }

    public final void LJIJI(boolean z) {
        if (!this.LLJJJJ) {
            this.LLJJJJ = true;
            C663070Pzd liveCore = getLiveCore();
            liveCore.LLJIJIL = true;
            ImageView imageView = liveCore.LLILLJJLI;
            if (imageView != null) {
                C786410Ut5.LJZI(0, imageView);
            }
        }
    }

    @Override // X.InterfaceC663110Pzh
    public final void onError(String str) {
        LJIILL("error", C2097608Jq.LJI(new Pair("error", str)));
        LJIJI(true);
        this.LLIZ = false;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveCardJump(C034A c034a) {
        this.LLILLJJLI = c034a.LIZ;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!this.LLILZLL) {
            return;
        }
        C1440005kM.LIZ(new C658660PsW(getRoomId(), i, this.LLIZ));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void searchShopTabVisible(C2037507yX c2037507yX) {
        if (!this.LLILZLL) {
            return;
        }
        if (this.LLIZ && c2037507yX.LIZ) {
            LJIIZILJ();
        } else {
            LJIJJ();
        }
    }

    public void setAutoPlay(boolean z) {
        this.LLILZIL = z;
        if (!z) {
            LJIILJJIL();
        } else {
            LJIIJJI();
        }
    }

    public void setAwemeIdentifier(Map<String, ? extends Object> map) {
        this.LLJL = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAwemeIndex(X.C658580PsO r8) {
        /*
            r7 = this;
            X.0PsE r6 = r7.getDataProvider()
            r3 = -1
            r5 = 0
            if (r6 == 0) goto L4c
            int r4 = r8.LIZ
            int r2 = r8.LIZIZ
            if (r2 == r3) goto L37
            X.0PZw r1 = X.C647140PZw.LIZ
            int r0 = r7.LLILZ
            X.0Pd0 r0 = r1.LIZ(r0)
            if (r0 == 0) goto L1c
            java.util.List r5 = r0.LIZ(r2)
        L1c:
            r2 = -1
            if (r4 < 0) goto L4a
            r1 = 0
        L20:
            if (r5 == 0) goto L32
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L32
            java.lang.String r0 = r0.getAid()
            if (r0 == 0) goto L32
            int r2 = r2 + 1
        L32:
            if (r1 == r4) goto L4a
            int r1 = r1 + 1
            goto L20
        L37:
            X.0PZw r1 = X.C647140PZw.LIZ
            int r0 = r7.LLILZ
            X.0Pd0 r0 = r1.LIZ(r0)
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r0.LIZ
            if (r0 == 0) goto L1c
            java.util.List r5 = r0.getAwemeList()
            goto L1c
        L4a:
            r6.LJFF = r2
        L4c:
            X.0PZw r1 = X.C647140PZw.LIZ
            int r0 = r7.LLILZ
            X.0Pd0 r2 = r1.LIZ(r0)
            int r0 = r8.LIZIZ
            if (r0 == r3) goto L9d
            if (r2 == 0) goto L9c
            java.util.List r1 = r2.LIZ(r0)
            if (r1 == 0) goto L6f
            int r0 = r8.LIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
        L68:
            if (r0 == 0) goto L6d
            r7.LJIIL(r0)
        L6d:
            if (r2 == 0) goto L9c
        L6f:
            boolean r1 = r2.LJ
            r0 = 1
            if (r1 != r0) goto L9c
            java.util.List<com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct> r1 = r2.LIZJ
            if (r1 == 0) goto L9c
            int r0 = r8.LIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct r0 = (com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.getLiveAweme()
            r7.LJIIL(r3)
            X.0PsE r1 = r7.getDataProvider()
            X.0PCp r0 = r2.LIZLLL
            r1.LIZ = r0
            X.0PsE r2 = r7.getDataProvider()
            kotlin.jvm.internal.AwS554S0100000_10 r1 = new kotlin.jvm.internal.AwS554S0100000_10
            r0 = 334(0x14e, float:4.68E-43)
            r1.<init>(r3, r0)
            r2.LJIIL = r1
        L9c:
            return
        L9d:
            if (r2 == 0) goto L9c
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r2.LIZ
            if (r0 == 0) goto L6f
            java.util.List r1 = r0.getAwemeList()
            if (r1 == 0) goto L6f
            int r0 = r8.LIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C658550PsL.setAwemeIndex(X.0PsO):void");
    }

    public void setEcomTokenType(String str) {
        this.LLJJIII = str;
    }

    public void setEventChangeListener(Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.LLIZLLLIL = function2;
    }

    public void setFirstFrameHandler(Function0<Unit> function0) {
        this.LLJ = function0;
    }

    public final void setIsECommerce(boolean z) {
        this.LLILZLL = z;
    }

    public final void setJumpRoomId(Long l) {
        this.LLILLJJLI = l;
    }

    public void setLogExtra(HashMap<String, Object> map) {
        this.LLJLILLLLZIIL = map;
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                if (entry.getValue() instanceof JavaOnlyMap) {
                    map2.put(entry.getKey(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), entry.getValue()));
                } else {
                    map2.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        C653660PkS c653660PkS = getDataProvider().LJII;
        if (c653660PkS != null) {
            c653660PkS.LJJJJJL = map2;
        }
    }

    public final void setLynxContext(s sVar) {
        this.LLJJIJIL = sVar;
    }

    public final void setMScrollStateManager(C652990PjN c652990PjN) {
        getDataProvider().LIZJ = c652990PjN;
    }

    public void setMuted(int i) {
        if (i == -1) {
            return;
        }
        C659080PtC.LIZJ(i);
        if (i == 0) {
            C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
            if (c2174741A9g.LJIILJJIL()) {
                C659080PtC.LIZ = false;
                c2174741A9g.LJIILL("general_search", EnumC655500PnQ.CLICK_UNMUTE_BUTTON, C0SVP.STYLE_NO_BUTTON);
            }
        }
        getLiveCore().setMute(C659080PtC.LIZ(this.LLJLL, 0, null));
    }

    public void setObjectFit(String str) {
        getLiveCore().setFitType(!Intrinsics.LJFF(str, "fill") ? 1 : 0);
    }

    public final void setOutCorner(boolean z) {
        this.LLILLL = z;
    }

    public final void setPoster(String str) {
        this.LLJJI = str;
        if (C123100dR.LIZ(str) && this.LLILZLL && ((Boolean) C132800f0.LIZ.getValue()).booleanValue()) {
            C651020PgC c651020PgC = null;
            if (this instanceof C658700Psa) {
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                C1334210kp9.LIZIZ(str, EnumC1769850w9n.SEARCH_PRODUCT, null, null, false, false, null, null);
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
                c1331670kl3LIZLLL.LJJ(this.LLJIJIL);
                c1331670kl3LIZLLL.LIZLLL(getCardName());
                Aweme mAweme = getMAweme();
                if (mAweme != null) {
                    c651020PgC = new C651020PgC(this, mAweme);
                }
                c1331670kl3LIZLLL.LJJJIL = c651020PgC;
                C786410Ut5.h3(c1331670kl3LIZLLL);
                return;
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(this.LLJIJIL);
            c1331670kl3LJIIIZ.LIZLLL(getCardName());
            Aweme mAweme2 = getMAweme();
            if (mAweme2 != null) {
                c651020PgC = new C651020PgC(this, mAweme2);
            }
            c1331670kl3LJIIIZ.LJJJIL = c651020PgC;
            if (C284190BBx.LIZ()) {
                c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LJIIIZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIIZ.LJJJJJ = "search_cache";
            }
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    public void setSessionId(int i) {
        String str;
        DynamicPatch dynamicPatch;
        this.LLILZ = i;
        C647140PZw c647140PZw = C647140PZw.LIZ;
        C649040Pd0 c649040Pd0LIZ = c647140PZw.LIZ(i);
        if (c649040Pd0LIZ != null) {
            new WeakReference(this);
        }
        InterfaceC655620Pnc interfaceC655620Pnc = getDataProvider().LJ;
        if (interfaceC655620Pnc != null && c649040Pd0LIZ != null) {
            c649040Pd0LIZ.LIZIZ = new WeakReference<>(interfaceC655620Pnc);
        }
        C658480PsE dataProvider = getLiveCore().getDataProvider();
        C649040Pd0 c649040Pd0LIZ2 = c647140PZw.LIZ(this.LLILZ);
        if (c649040Pd0LIZ2 != null && (dynamicPatch = c649040Pd0LIZ2.LIZ) != null) {
            str = dynamicPatch.schema;
        } else {
            str = null;
        }
        dataProvider.LJIILIIL = str;
        if (c649040Pd0LIZ != null) {
            new WeakReference(getLiveCore());
        }
        getDataProvider();
        ARunnableS110S0100000_10 aRunnableS110S0100000_10 = new ARunnableS110S0100000_10(this, 117);
        this.LLJILJIL = aRunnableS110S0100000_10;
        C786410Ut5.LJJZZIII(this.LLJILJILJ, aRunnableS110S0100000_10);
    }

    public void setSessionIdStr(String str) {
        this.LLJLIL = str;
    }

    public void setSoundControl(int i) {
        this.LLJLL = i;
        getLiveCore().setMute(C659080PtC.LIZ(i, 0, null));
    }

    public final void LJIILL(String str, Map<String, ? extends Object> map) {
        if (!TextUtils.equals(this.LLJI, str)) {
            this.LLJI = str;
            Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2 = this.LLIZLLLIL;
            if (function2 != null) {
                function2.invoke(str, map);
            }
        }
    }

    public final void LJIJ(InterfaceC641090PCp interfaceC641090PCp, C653660PkS c653660PkS) {
        Aweme mAweme;
        User author;
        String str;
        getDataProvider().LIZ = interfaceC641090PCp;
        C653660PkS c653660PkS2 = getDataProvider().LJII;
        Map<String, String> map = null;
        if (c653660PkS2 != null) {
            map = c653660PkS2.LJJJJJL;
        }
        if (c653660PkS != null) {
            if (map != null) {
                c653660PkS.LJJJJJL = map;
            }
            getDataProvider().LJII = c653660PkS;
        }
        C653660PkS c653660PkS3 = getDataProvider().LJII;
        if (c653660PkS3 != null && (mAweme = getMAweme()) != null && (author = mAweme.getAuthor()) != null && (str = author.roomIdStr) != null) {
            c653660PkS3.LJIJI = str;
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0PsM] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0OBd] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.SearchLiveForLynx$ability$1] */
    public C658550PsL(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        C649040Pd0 c649040Pd0LIZ;
        SmartImageView smartImageView;
        super(context, attributeSet, i);
        this.LL = new C650580PfU();
        this.LLILZ = -1;
        this.LLILZIL = true;
        this.LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJILLL = 500L;
        this.LLJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 333));
        this.LLJJI = "";
        this.LLJJIJI = C452501pT.LIZIZ(new AwS70S0301000_10(context, attributeSet, i, this, 0));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 330));
        this.LLJJJ = C452501pT.LIZIZ(new AwS411S0200000_10(this, context, 27));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 331));
        this.LLJJJJ = true;
        this.LLJJJJJIL = new InterfaceC1399350mWD() { // from class: X.0PsM
            @Override // X.InterfaceC1399350mWD
            public final /* synthetic */ boolean Fi() {
                return false;
            }

            @Override // X.InterfaceC1399350mWD
            public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                if (this.LL.isPlaying() && C2174741A9g.LIZIZ.LJIILJJIL() && (i2 == 24 || i2 == 25)) {
                    this.LL.LJIILL("modifySoundStatus", C2097608Jq.LJI(new Pair("isMute", 0)));
                }
                return false;
            }
        };
        this.LLJJJJLIIL = new C0H62() { // from class: X.0OBd
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                if (C0N73.LIZ[c0o0l2.ordinal()] == 1 && c0o0l != C0O0L.AVAILABLE) {
                    C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this.LL, 332));
                }
            }
        };
        this.LLJJLIIIJLLLLLLLZ = new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.SearchLiveForLynx$ability$1
            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Mu(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean N1() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View Vt() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void kC0(int i2) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean mm() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void wp(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void J0() {
                this.LL.LLLLLIL();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void LJJLIIIJLLLLLLLZ() {
                this.LL.getLiveCore().LJJLIIIJLLLLLLLZ();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void LLZZZZ() {
                this.LL.LLJJJ();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean isPlaying() {
                return this.LL.LLIZ;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View getDetectView() {
                return this.LL;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                function0.invoke();
            }
        };
        getDataProvider().LJII = new C653660PkS();
        if (C301150BrF.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C650520PfO c650520PfO = C650520PfO.LIZ;
            Context context2 = getContext();
            c650520PfO.getClass();
            C650520PfO.LIZIZ(context2, R.layout.f4l, this, true);
        } else {
            C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.f4l, this, true);
        }
        this.LLJIJIL = (SmartImageView) findViewById(R.id.l1s);
        if (C1838907Id.LIZ() && (smartImageView = this.LLJIJIL) != null) {
            C662390PyX.LIZ.getClass();
            C662390PyX.LJ(smartImageView, false);
        }
        getLiveCore().setMCoverView(this.LLJIJIL);
        AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(this, 430);
        C658910Psv c658910Psv = new C658910Psv();
        awS589S0100000_10.invoke(c658910Psv);
        getDataProvider().LJ = c658910Psv;
        InterfaceC655620Pnc interfaceC655620Pnc = getDataProvider().LJ;
        if (interfaceC655620Pnc != null && (c649040Pd0LIZ = C647140PZw.LIZ.LIZ(this.LLILZ)) != null) {
            c649040Pd0LIZ.LIZIZ = new WeakReference<>(interfaceC655620Pnc);
        }
        getDataProvider().LIZIZ = new C646220PWi(getLiveCore());
        AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10(this, c658910Psv, 90);
        C658630PsT c658630PsT = new C658630PsT();
        awS376S0200000_10.invoke(c658630PsT);
        setMScrollStateObserver(c658630PsT);
        getLiveCore().getStatusDelegate().LIZJ().add(new C655800Pnu(getDataProvider()));
        this.LLJLIL = "";
    }
}
