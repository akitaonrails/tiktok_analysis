package X;

import Y.AfS172S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.LiveRoomCropInfoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.ui.component.SearchLiveCore$1;
import com.ss.android.ugc.aweme.search.common.ui.component.SearchLiveCore$bindData$1;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663070Pzd extends FrameLayout implements InterfaceC648270Pbl {
    public static final boolean LLJILLL = C650560PfS.LIZ;
    public final C01GW LL;
    public ImageView LLILLJJLI;
    public final C663070Pzd LLILLL;
    public long LLILZ;
    public final long LLILZIL;
    public final C01GW LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public C1699360uK6 LLJILJIL;
    public InterfaceC663140Pzk LLJILJILJ;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return this;
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

    private final FrameLayout getAdjustedContainerView() {
        User author;
        LiveRoomCropInfoStruct liveRoomCropInfo;
        Long y2;
        User author2;
        LiveRoomCropInfoStruct liveRoomCropInfo2;
        Long x2;
        User author3;
        LiveRoomCropInfoStruct liveRoomCropInfo3;
        Long y1;
        User author4;
        LiveRoomCropInfoStruct liveRoomCropInfo4;
        Long x1;
        User author5;
        LiveRoomCropInfoStruct liveRoomCropInfo5;
        Long height;
        User author6;
        LiveRoomCropInfoStruct liveRoomCropInfo6;
        Long width;
        if (((Number) AnonymousClass0785.LIZ.getValue()).intValue() != 1) {
            return this.LLILLL;
        }
        int width2 = this.LLILLL.getWidth();
        int height2 = this.LLILLL.getHeight();
        Aweme mAweme = getMAweme();
        long jLongValue = (mAweme == null || (author6 = mAweme.getAuthor()) == null || (liveRoomCropInfo6 = author6.getLiveRoomCropInfo()) == null || (width = liveRoomCropInfo6.getWidth()) == null) ? 0L : width.longValue();
        Aweme mAweme2 = getMAweme();
        long jLongValue2 = (mAweme2 == null || (author5 = mAweme2.getAuthor()) == null || (liveRoomCropInfo5 = author5.getLiveRoomCropInfo()) == null || (height = liveRoomCropInfo5.getHeight()) == null) ? 0L : height.longValue();
        Aweme mAweme3 = getMAweme();
        long jLongValue3 = (mAweme3 == null || (author4 = mAweme3.getAuthor()) == null || (liveRoomCropInfo4 = author4.getLiveRoomCropInfo()) == null || (x1 = liveRoomCropInfo4.getX1()) == null) ? 0L : x1.longValue();
        Aweme mAweme4 = getMAweme();
        long jLongValue4 = (mAweme4 == null || (author3 = mAweme4.getAuthor()) == null || (liveRoomCropInfo3 = author3.getLiveRoomCropInfo()) == null || (y1 = liveRoomCropInfo3.getY1()) == null) ? 0L : y1.longValue();
        Aweme mAweme5 = getMAweme();
        long jLongValue5 = (mAweme5 == null || (author2 = mAweme5.getAuthor()) == null || (liveRoomCropInfo2 = author2.getLiveRoomCropInfo()) == null || (x2 = liveRoomCropInfo2.getX2()) == null) ? 0L : x2.longValue();
        Aweme mAweme6 = getMAweme();
        long jLongValue6 = (mAweme6 == null || (author = mAweme6.getAuthor()) == null || (liveRoomCropInfo = author.getLiveRoomCropInfo()) == null || (y2 = liveRoomCropInfo.getY2()) == null) ? 0L : y2.longValue();
        if (jLongValue == 0 || jLongValue2 == 0 || jLongValue3 >= jLongValue5 || jLongValue4 >= jLongValue6) {
            return this.LLILLL;
        }
        float f = jLongValue3;
        float f2 = jLongValue5 - jLongValue3;
        float f3 = f + (f2 / 2.0f);
        float f4 = jLongValue4;
        float f5 = jLongValue6 - jLongValue4;
        float f6 = f4 + (f5 / 2.0f);
        float f7 = width2 / f2;
        float f8 = height2 / f5;
        if (f7 < f8) {
            f7 = f8;
        }
        int i = (int) ((width2 / 2) - (f3 * f7));
        int i2 = (int) ((height2 / 2) - (f6 * f7));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) (jLongValue * f7), (int) (jLongValue2 * f7));
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        C786410Ut5.Kc(frameLayout, i);
        C786410Ut5.fd(frameLayout, i2);
        C663070Pzd c663070Pzd = this.LLILLL;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c663070Pzd, null);
        c663070Pzd.removeAllViews();
        this.LLILLL.addView(frameLayout, marginLayoutParams);
        return frameLayout;
    }

    public final void LIZIZ() {
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
    }

    public final void LJFF() {
        String aid;
        if (LLJILLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doOnFirstFrame, ");
            sbLIZ.append(getInstanceInfo());
            sbLIZ.append(", aid:");
            Aweme mAweme = getMAweme();
            sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Aweme mAweme2 = getMAweme();
        String livePlayerTag = getLivePlayerTag();
        if (mAweme2 != null && (aid = mAweme2.getAid()) != null && aid.length() > 0) {
            C663130Pzj.LIZ.put(aid, livePlayerTag);
        }
        getStatusDelegate().LJII();
    }

    public final void LJIIIZ() {
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            ImageView imageView = this.LLILLJJLI;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
        }
    }

    public final C658480PsE getDataProvider() {
        return (C658480PsE) this.LL.getValue();
    }

    public final C663080Pze getStatusDelegate() {
        return (C663080Pze) this.LLILZLL.getValue();
    }

    private final boolean getAttached() {
        return getDataProvider().LJIIJ;
    }

    private final InterfaceC641090PCp getContainerStatusProvider() {
        return getDataProvider().LIZ;
    }

    private final String getInstanceInfo() {
        C1ACD mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveCore{");
            sbLIZ.append(Integer.toHexString(hashCode()));
            sbLIZ.append(" player=null}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LiveCore{");
        sbLIZ2.append(Integer.toHexString(hashCode()));
        sbLIZ2.append(" player=");
        sbLIZ2.append(Integer.toHexString(mLivePlayHelper.hashCode()));
        sbLIZ2.append('}');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    private final LiveRoomStruct getLiveRoomStruct() {
        Aweme aweme = getDataProvider().LJI;
        if (aweme != null) {
            return AwemeExtKt.getNewLiveRoomDataExt(aweme);
        }
        return null;
    }

    private final Aweme getMAweme() {
        return getDataProvider().LJI;
    }

    private final C1ACD getMLivePlayHelper() {
        return getDataProvider().LJIIIIZZ;
    }

    private final boolean getMLiveStarted() {
        return getDataProvider().LJIIIZ;
    }

    public final void LIZLLL() {
        C1ACD mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.LJJIJIL(null, true);
        }
        getStatusDelegate().onDestroy();
        setMLiveStarted(false);
        this.LLIZLLLIL = false;
        C663130Pzj.LIZ(getMAweme());
    }

    public final void LJI() {
        if (getMLiveStarted()) {
            setKeepScreenOn(false);
            getStatusDelegate().onPause();
            setMLiveStarted(false);
            C1ACD mLivePlayHelper = getMLivePlayHelper();
            if (mLivePlayHelper == null || !(!mLivePlayHelper.LJJJI())) {
                return;
            }
            if (C0PZE.LIZIZ() == 1) {
                mLivePlayHelper.LJJIJIL("pause", true);
                setMLivePlayHelper(null);
            } else if (((Boolean) C271300AkC.LIZ.getValue()).booleanValue()) {
                mLivePlayHelper.LIZIZ();
            } else {
                mLivePlayHelper.LJJJJIZL();
            }
        }
    }

    public final void LJIIJ() {
        C1ACD c1acdGenerateLivePlayHelper;
        if (C0PZE.LIZ()) {
            if (getMLivePlayHelper() == null) {
                setMLivePlayHelper(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).generateLivePlayHelper(new InterfaceC2175541ACi() { // from class: X.0Pzf
                    @Override // X.InterfaceC2175541ACi
                    public final boolean LLILLIZIL() {
                        return false;
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void LLLIL() {
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void LLLLLLIL() {
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final Object Md() {
                        return null;
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
                    public final Integer Dk() {
                        return ((Boolean) C0BCL.LIZ.getValue()).booleanValue() ? 17 : null;
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void T5() {
                        this.LL.getStatusDelegate().LJJZ();
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final boolean U1() {
                        return ((Boolean) C0BCL.LIZ.getValue()).booleanValue();
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void v() {
                        this.LL.getStatusDelegate().LIZ();
                        this.LL.LJFF();
                    }

                    @Override // X.InterfaceC2175541ACi
                    /* JADX INFO: renamed from: if */
                    public final void mo29if(String str) {
                        this.LL.LJIILIIL();
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void oe(String str) {
                        this.LL.getStatusDelegate().LIZ();
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void sk(String str) {
                        this.LL.LJII(str);
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void w9(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            this.LL.LJ(str);
                        }
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void Th(int i, int i2, View view) {
                        this.LL.LJIIIIZZ(i, i2, view);
                    }
                }, EnumC1913520ztW.SEARCH));
            }
        } else {
            if (((Number) C079E.LIZ.getValue()).intValue() == 1) {
                C0PZ5.LIZ.getClass();
                c1acdGenerateLivePlayHelper = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).generateLivePlayHelper(new InterfaceC2175541ACi() { // from class: X.0Pzi
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
                    public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
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
                        return false;
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
                    public final void T5() {
                        C0PZ5.LIZ.getClass();
                        InterfaceC663140Pzk interfaceC663140Pzk = C0PZ5.LIZIZ;
                        if (interfaceC663140Pzk != null) {
                            interfaceC663140Pzk.LJ();
                        }
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void v() {
                        C0PZ5 c0pz5 = C0PZ5.LIZ;
                        c0pz5.getClass();
                        InterfaceC663140Pzk interfaceC663140Pzk = C0PZ5.LIZIZ;
                        if (interfaceC663140Pzk != null) {
                            interfaceC663140Pzk.LIZ();
                        }
                        c0pz5.getClass();
                        InterfaceC663140Pzk interfaceC663140Pzk2 = C0PZ5.LIZIZ;
                        if (interfaceC663140Pzk2 != null) {
                            interfaceC663140Pzk2.LJFF();
                        }
                    }

                    @Override // X.InterfaceC2175541ACi
                    /* JADX INFO: renamed from: if */
                    public final void mo29if(String str) {
                        C0PZ5.LIZ.getClass();
                        InterfaceC663140Pzk interfaceC663140Pzk = C0PZ5.LIZIZ;
                        if (interfaceC663140Pzk != null) {
                            interfaceC663140Pzk.LIZIZ();
                        }
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void oe(String str) {
                        C0PZ5.LIZ.getClass();
                        InterfaceC663140Pzk interfaceC663140Pzk = C0PZ5.LIZIZ;
                        if (interfaceC663140Pzk != null) {
                            interfaceC663140Pzk.LIZJ();
                        }
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void sk(String str) {
                        C0PZ5.LIZ.getClass();
                        InterfaceC663140Pzk interfaceC663140Pzk = C0PZ5.LIZIZ;
                        if (interfaceC663140Pzk != null) {
                            interfaceC663140Pzk.LIZLLL(str);
                        }
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void w9(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            C0PZ5.LIZ.getClass();
                            InterfaceC663140Pzk interfaceC663140Pzk = C0PZ5.LIZIZ;
                            if (interfaceC663140Pzk != null) {
                                interfaceC663140Pzk.LJI(str);
                            }
                        }
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void Th(int i, int i2, View view) {
                        C0PZ5.LIZ.getClass();
                        InterfaceC663140Pzk interfaceC663140Pzk = C0PZ5.LIZIZ;
                        if (interfaceC663140Pzk != null) {
                            interfaceC663140Pzk.LJII(i, i2, view);
                        }
                    }
                }, EnumC1913520ztW.SEARCH);
            } else {
                c1acdGenerateLivePlayHelper = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).generateLivePlayHelper(new InterfaceC2175541ACi() { // from class: X.0Pzf
                    @Override // X.InterfaceC2175541ACi
                    public final boolean LLILLIZIL() {
                        return false;
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void LLLIL() {
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void LLLLLLIL() {
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final Object Md() {
                        return null;
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
                    public final Integer Dk() {
                        return ((Boolean) C0BCL.LIZ.getValue()).booleanValue() ? 17 : null;
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void T5() {
                        this.LL.getStatusDelegate().LJJZ();
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final boolean U1() {
                        return ((Boolean) C0BCL.LIZ.getValue()).booleanValue();
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void v() {
                        this.LL.getStatusDelegate().LIZ();
                        this.LL.LJFF();
                    }

                    @Override // X.InterfaceC2175541ACi
                    /* JADX INFO: renamed from: if */
                    public final void mo29if(String str) {
                        this.LL.LJIILIIL();
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void oe(String str) {
                        this.LL.getStatusDelegate().LIZ();
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void sk(String str) {
                        this.LL.LJII(str);
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void w9(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            this.LL.LJ(str);
                        }
                    }

                    @Override // X.InterfaceC2175541ACi
                    public final void Th(int i, int i2, View view) {
                        this.LL.LJIIIIZZ(i, i2, view);
                    }
                }, EnumC1913520ztW.SEARCH);
            }
            setMLivePlayHelper(c1acdGenerateLivePlayHelper);
        }
    }

    public final void LJIIJJI() {
        Map<String, String> map;
        C653660PkS c653660PkS = getDataProvider().LJII;
        if (c653660PkS == null || (map = c653660PkS.LJJJJJL) == null) {
            return;
        }
        C661940Pxo c661940Pxo = new C661940Pxo();
        c661940Pxo.LJIIZILJ("autoplay_status", C1837307Hn.LIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        c661940Pxo.LJIILLIIL.putAll(map);
        c661940Pxo.LJIILJJIL();
    }

    public final void LJIIL() {
        C1ACD mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.LJJIJLIJ();
        }
    }

    public final void LJIILIIL() {
        if (System.currentTimeMillis() - this.LLILZ < this.LLILZIL) {
            return;
        }
        this.LLILZ = System.currentTimeMillis();
        LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
        if (liveRoomStruct != null) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJI("search", null, liveRoomStruct.id, new InterfaceC472850IgV() { // from class: X.0Pzl
                @Override // X.InterfaceC472850IgV
                public final void onFailed() {
                }

                @Override // X.InterfaceC472850IgV
                public final void LIZ(FilterInfoData filterInfoData, boolean z) {
                    if (!z) {
                        this.LIZ.LJIILJJIL();
                    }
                }
            });
        }
    }

    public final void LJIILJJIL() {
        LJI();
        C1ACD mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.LIZIZ();
        }
        getStatusDelegate().LIZLLL();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        if (C0PZE.LIZIZ() == 2) {
            C1ACD mLivePlayHelper = getMLivePlayHelper();
            if (mLivePlayHelper != null) {
                mLivePlayHelper.LJJIJIL("releasePlayer", true);
            }
            setMLivePlayHelper(null);
            setMLiveStarted(false);
            C663130Pzj.LIZ(getMAweme());
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        C1ACD mLivePlayHelper;
        TVStationRoomStruct tVStationRoomStruct;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && getAttached()) {
            LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
            if ((liveRoomStruct != null && liveRoomStruct.isFinish()) || this.LLIZLLLIL || getMLiveStarted()) {
                return;
            }
            LiveRoomStruct liveRoomStruct2 = getLiveRoomStruct();
            if (liveRoomStruct2 == null || (tVStationRoomStruct = liveRoomStruct2.tvStationRoomStruct) == null || !tVStationRoomStruct.isIdle) {
                if (C0PZE.LIZ()) {
                    LJIIJ();
                } else if (((Number) C079E.LIZ.getValue()).intValue() == 1) {
                    C0PZ5 c0pz5 = C0PZ5.LIZ;
                    InterfaceC663140Pzk interfaceC663140Pzk = this.LLJILJILJ;
                    c0pz5.getClass();
                    C0PZ5.LIZIZ = interfaceC663140Pzk;
                }
                C649470Pdh c649470Pdh = C649470Pdh.LIZ;
                String str = getDataProvider().LJIILIIL;
                c649470Pdh.getClass();
                if (C649470Pdh.LJJ(str) && C293730BfH.LIZ()) {
                    if (!C1837307Hn.LIZ()) {
                        LJIIJJI();
                        return;
                    }
                    LJIIJJI();
                }
                if (LLJILLL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("doRequestPlay, ");
                    sbLIZ.append(getInstanceInfo());
                    sbLIZ.append(", aid:");
                    Aweme mAweme = getMAweme();
                    sbLIZ.append(mAweme != null ? mAweme.getAid() : null);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                LiveRoomStruct liveRoomStruct3 = getLiveRoomStruct();
                if (liveRoomStruct3 != null) {
                    FrameLayout adjustedContainerView = getAdjustedContainerView();
                    C1699360uK6 c1699360uK6 = this.LLJILJIL;
                    if (c1699360uK6 != null && (mLivePlayHelper = getMLivePlayHelper()) != null) {
                        mLivePlayHelper.LJIILIIL(c1699360uK6);
                    }
                    C1ACD mLivePlayHelper2 = getMLivePlayHelper();
                    if (mLivePlayHelper2 != null) {
                        mLivePlayHelper2.LJJIIJZLJL(this.LLJ, liveRoomStruct3, adjustedContainerView, false, null, "", false, null);
                    }
                }
                setMLiveStarted(true);
                InterfaceC652950PjJ interfaceC652950PjJ = getDataProvider().LIZIZ;
                if (interfaceC652950PjJ != null) {
                    interfaceC652950PjJ.LLLFF(getMAweme());
                }
                getStatusDelegate().LJ();
                setKeepScreenOn(true);
                getStatusDelegate().onLoading();
            }
        }
    }

    @Override // X.InterfaceC648350Pbt
    public String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    public final String getLivePlayerTag() {
        C1ACD mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            return mLivePlayHelper.getPlayerTag();
        }
        return null;
    }

    public final String getStreamData() {
        LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
        if (liveRoomStruct != null) {
            return liveRoomStruct.getMultiStreamData();
        }
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return getMLiveStarted();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
        getStatusDelegate().LJIIJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJIJIL = true;
        setAttached(false);
        getStatusDelegate().LJIIIZ();
        LJI();
        if (C0PZE.LIZIZ() == 2) {
            C1ACD mLivePlayHelper = getMLivePlayHelper();
            if (mLivePlayHelper != null) {
                mLivePlayHelper.LJJIJIL("detachFromWindow", true);
            }
            setMLivePlayHelper(null);
            getStatusDelegate().onDestroy();
            setMLiveStarted(false);
            this.LLIZLLLIL = false;
            C663130Pzj.LIZ(getMAweme());
        }
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

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        LJI();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        LJI();
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        LIZLLL();
    }

    public final int getFitType() {
        return this.LLJI;
    }

    public final C1699360uK6 getLivePlayerEntranceParam() {
        return this.LLJILJIL;
    }

    public final ImageView getMCoverView() {
        return this.LLILLJJLI;
    }

    public final boolean getMute() {
        return this.LLJ;
    }

    public final InterfaceC663140Pzk getSearchLiveCoreCallback() {
        return this.LLJILJILJ;
    }

    private final void setAttached(boolean z) {
        getDataProvider().LJIIJ = z;
    }

    private final void setMAweme(Aweme aweme) {
        getDataProvider().LJI = aweme;
    }

    private final void setMLivePlayHelper(C1ACD c1acd) {
        getDataProvider().LJIIIIZZ = c1acd;
    }

    private final void setMLiveStarted(boolean z) {
        getDataProvider().LJIIIZ = z;
    }

    public final void LIZ(Function0<? extends InterfaceC663110Pzh> function0) {
        Integer numValueOf;
        InterfaceC663110Pzh interfaceC663110PzhInvoke = function0.invoke();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addLiveStatusListener, hash: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", listener hash: ");
        if (interfaceC663110PzhInvoke != null) {
            numValueOf = Integer.valueOf(interfaceC663110PzhInvoke.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C663080Pze statusDelegate = getStatusDelegate();
        if (interfaceC663110PzhInvoke == null) {
            return;
        }
        statusDelegate.LIZJ().add(interfaceC663110PzhInvoke);
    }

    public final void LIZJ(Aweme aweme) {
        Long lValueOf;
        String str;
        String requestId;
        Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this);
        if (!C0PZE.LIZ() && C07H4.LIZIZ(fragmentLIZLLL, C1388190mED.LIZIZ(getContext())) && !this.LLIZ) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
            sAFHelper.getClass();
            C325901Of.LIZIZ(SAFHelper.LJIJJ(fragmentLIZLLL, c19egLIZIZ), new SearchLiveCore$bindData$1(this));
            this.LLIZ = true;
        }
        this.LLIZLLLIL = false;
        this.LLJIJIL = true;
        setMAweme(aweme);
        setTag(aweme);
        Object c098200Yq = null;
        this.LLJILJIL = null;
        getStatusDelegate().onBind();
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt != null) {
            lValueOf = Long.valueOf(newLiveRoomDataExt.id);
        } else {
            lValueOf = null;
        }
        LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt2 != null) {
            str = newLiveRoomDataExt2.idStr;
        } else {
            str = null;
        }
        if (lValueOf != null && str != null && str.length() != 0) {
            try {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                if (lLJIILIIL != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    if (jLongValue > 0 && jLongValue != lValueOf.longValue()) {
                        HashMap map = new HashMap();
                        map.put("id_str", lLJIILIIL.toString());
                        map.put(FollowStatusChangeMethod.PARAM_UID, lValueOf.toString());
                        map.put("aid", aweme.getAid());
                        LiveRoomStruct newLiveRoomDataExt3 = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                        if (newLiveRoomDataExt3 != null) {
                            c098200Yq = Long.valueOf(newLiveRoomDataExt3.getAnchorId());
                        }
                        map.put("anchor_id", String.valueOf(c098200Yq));
                        LiveRoomStruct newLiveRoomDataExt4 = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                        if (newLiveRoomDataExt4 == null || (requestId = newLiveRoomDataExt4.getRequestId()) == null) {
                            requestId = "";
                        }
                        map.put("request_id", requestId);
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SearchLiveCore RoomId Exception, ");
                        sbLIZ.append(map);
                        C1720106oR.LIZ("SearchLiveCore", C2188811AlT.LIZIZ(sbLIZ));
                        C1AF0.LJI(new Throwable("SearchLiveCore RoomId Exception"), "RoomId Exception", map);
                    }
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LIZJ("SearchLiveCore", thM5exceptionOrNullimpl);
                return;
            }
            return;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("roomId empty, roomId=");
        sbLIZ2.append(lValueOf);
        sbLIZ2.append(", roomIdStr=");
        sbLIZ2.append(str);
        C1720106oR.LIZ("SearchLiveCore", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJ(String str) {
        getStatusDelegate().onError(str);
        C663130Pzj.LIZ(getMAweme());
    }

    public final void LJII(String str) {
        new C19483411Km(AbstractC19484711Kz.LJIJJLI(str).LJIL(new InterfaceC1487280oo2() { // from class: X.00Ul
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return new JSONObject((String) obj);
            }
        }), new InterfaceC19483011Ki() { // from class: X.08BM
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                if (!TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_Android") && !TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_IOS")) {
                    return false;
                }
                return true;
            }
        }).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIIZILJ(new AfS172S0100000_3((Object) new AwS589S0100000_10(this, 146), 111), new C09JN() { // from class: X.00QO
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveSeiUtils@8afd.getLiveTypeBySei$4");
                C1C7U.LIZIZ("LiveSeiUtils@8afd.getLiveTypeBySei$4");
            }
        });
        if (((Number) AnonymousClass0786.LIZ.getValue()).intValue() == 0 && !this.LLIZLLLIL && getMLiveStarted() && a0.LJJIIZI(str, "sub_only_live", false)) {
            this.LLIZLLLIL = true;
            if (TextUtils.equals(new JSONObject(str).optString("sub_only_live", CardStruct.IStatusCode.DEFAULT), "1")) {
                LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
                if (liveRoomStruct != null) {
                    liveRoomStruct.liveSubOnly = 1L;
                }
                LJIILJJIL();
            }
        }
    }

    public final void setFitType(int i) {
        if (i >= 0 && i <= 1) {
            this.LLJI = i;
        }
    }

    public final void setLivePlayerEntranceParam(C1699360uK6 c1699360uK6) {
        this.LLJILJIL = c1699360uK6;
    }

    public final void setMCoverView(ImageView imageView) {
        this.LLILLJJLI = imageView;
    }

    public final void setMute(boolean z) {
        this.LLJ = z;
        C1ACD mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.LJIILJJIL(this.LLJ);
        }
    }

    public final void setSearchLiveCoreCallback(InterfaceC663140Pzk interfaceC663140Pzk) {
        this.LLJILJILJ = interfaceC663140Pzk;
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    public C663070Pzd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(173));
        this.LLILLL = this;
        this.LLILZIL = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LLILZLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(174));
        if (!C0PZE.LIZ() && !C07H4.LIZIZ(C651580Ph6.LIZLLL(this), C1388190mED.LIZIZ(context))) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            sAFHelper.getClass();
            C325901Of.LIZIZ(SAFHelper.LJIJJ(fragmentLIZLLL, c19egLIZIZ), new SearchLiveCore$1(this));
        }
        getStatusDelegate().LIZIZ();
        if (!C0PZE.LIZ()) {
            LJIIJ();
        }
        setMLiveStarted(false);
        getStatusDelegate().onInit();
        this.LLJIJIL = true;
        this.LLJILJILJ = new InterfaceC663140Pzk() { // from class: X.0Pzg
            @Override // X.InterfaceC663140Pzk
            public final void LIZ() {
                this.LIZ.getStatusDelegate().LIZ();
            }

            @Override // X.InterfaceC663140Pzk
            public final void LIZIZ() {
                this.LIZ.LJIILIIL();
            }

            @Override // X.InterfaceC663140Pzk
            public final void LIZJ() {
                this.LIZ.getStatusDelegate().LIZ();
            }

            @Override // X.InterfaceC663140Pzk
            public final void LJ() {
                this.LIZ.getStatusDelegate().LJJZ();
            }

            @Override // X.InterfaceC663140Pzk
            public final void LJFF() {
                this.LIZ.LJFF();
            }

            @Override // X.InterfaceC663140Pzk
            public final void LIZLLL(String str) {
                this.LIZ.LJII(str);
            }

            @Override // X.InterfaceC663140Pzk
            public final void LJI(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.LIZ.LJ(str);
                }
            }

            @Override // X.InterfaceC663140Pzk
            public final void LJII(int i2, int i3, View view) {
                this.LIZ.LJIIIIZZ(i2, i3, view);
            }
        };
    }

    public final void LJIIIIZZ(int i, int i2, View view) {
        C2175491ACd c2175491ACdLJJJJLI;
        C1ACD mLivePlayHelper = getMLivePlayHelper();
        View view2 = null;
        if (mLivePlayHelper != null && (c2175491ACdLJJJJLI = mLivePlayHelper.LJJJJLI()) != null) {
            view2 = c2175491ACdLJJJJLI.LIZ;
        }
        if ((view2 instanceof TextureView) && view2 != null) {
            getStatusDelegate().LJI(i, i2, view);
        }
    }
}
