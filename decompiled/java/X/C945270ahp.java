package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.PreviewCardCohostEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.TopLiveSkylightTransYChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestTrackingSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCardOverdrawOptSetting;
import com.bytedance.android.livesdk.sei.LinkMicSei;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0ahp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945270ahp implements InterfaceC940790aab {
    public final CopyOnWriteArrayList<AbstractC940410aZz> LL;
    public final HashMap<String, Boolean> LLILLJJLI;
    public final HashMap<String, Integer> LLILLL;
    public final HashMap<String, Integer> LLILZ;
    public InterfaceC937900aVw LLILZIL;
    public C940490aa7 LLILZLL;
    public long LLIZ;
    public String LLIZLLLIL;
    public FrameLayout LLJ;
    public View LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public SeiAppData LLJILLL;
    public int LLJJ;
    public InterfaceC940230aZh LLJJI;
    public long LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public final AtomicBoolean LLJJJJJIL;
    public C948800anW LLJJJJLIIL;

    @Override // X.InterfaceC958970b3v
    public final void LIZJ(int i, List list) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJIJL(C2180891AWx c2180891AWx) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJJI() {
    }

    @Override // X.InterfaceC958970b3v
    public final boolean LJJJIL() {
        return true;
    }

    @Override // X.InterfaceC940380aZw
    public final void LJJZZIII(LinkMicSei linkMicSei) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIIIL(Map map) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJJJ() {
    }

    @Override // X.InterfaceC940380aZw
    public final void LLJJJIL() {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLLL(List list, boolean z) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLJ(LinkUser linkUser) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
    }

    @Override // X.InterfaceC940380aZw
    public final void LLLLLJIL(C945320ahu c945320ahu) {
    }

    @Override // X.InterfaceC940550aaD
    public final boolean LJ() {
        return this.LLJJJJ > 2;
    }

    @Override // X.InterfaceC940550aaD
    public final long getChannelId() {
        if (this.LLJJJIL == EnumC467700IVs.CROSS_ROOM_ARCH.getType()) {
            long j = this.LLJJIII;
            if (j != 0) {
                return j;
            }
        }
        return this.LLIZ;
    }

    @Override // X.InterfaceC940550aaD
    public final String getSubMatchType() {
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(Integer.valueOf(this.LLJJIJI));
        int i = this.LLJJJJ;
        c917350Zyn.getClass();
        return C917350Zyn.LIZIZ(enumC919170a1jLIZ, i);
    }

    @Override // X.InterfaceC940380aZw
    public final void release() {
        LiveWidget liveWidget;
        DataChannel dataChannel;
        C940490aa7 c940490aa7 = this.LLILZLL;
        if (c940490aa7 != null && (liveWidget = c940490aa7.LJI) != null && (dataChannel = liveWidget.dataChannel) != null) {
            dataChannel.zW(PreviewCardCohostEvent.class, Boolean.FALSE);
        }
        InterfaceC937900aVw interfaceC937900aVw = this.LLILZIL;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.V4(true);
        }
        this.LLILZIL = null;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this, 954));
    }

    @Override // X.InterfaceC940550aaD
    public final C948800anW LIZ() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC940550aaD
    public final int LIZLLL() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC940550aaD
    public final int LJIIIZ() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC940550aaD
    public final int LJJI() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC940550aaD
    public final long lr() {
        return this.LLJJJ;
    }

    public C945270ahp(int i) {
        CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        new ConcurrentHashMap();
        HashMap<String, Boolean> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        this.LL = copyOnWriteArrayList;
        this.LLILLJJLI = map;
        this.LLILLL = map2;
        this.LLILZ = map3;
        this.LLILZIL = null;
        this.LLJJJIL = EnumC467700IVs.MULTI_ARCH.getType();
        this.LLJJJJJIL = new AtomicBoolean(true);
    }

    @Override // X.InterfaceC940550aaD
    public final long LIZIZ(boolean z) {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC940380aZw
    public final void LJIIL(InterfaceC940230aZh interfaceC940230aZh) {
        this.LLJJI = interfaceC940230aZh;
    }

    @Override // X.InterfaceC940380aZw
    public final void LLJJJJJIL(SeiAppData seiAppData) {
        long jLongValue;
        boolean zLJIIZILJ;
        boolean z;
        int size;
        Map<String, String> map;
        int iIntValue;
        int iIntValue2;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        int i;
        int i2;
        int i3;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        int i4 = seiAppData.linkerMode;
        String str = seiAppData.channelId;
        long jLongValue2 = 0;
        if (str != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL2.longValue();
        } else {
            jLongValue = 0;
        }
        String str2 = seiAppData.anchorLinkMicId;
        int i5 = seiAppData.linkerArchType;
        String str3 = seiAppData.groupChannelId;
        if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
            jLongValue2 = lLJIILIIL.longValue();
        }
        this.LLJJIII = jLongValue2;
        this.LLJJIJIL = seiAppData.battleId;
        C948800anW c948800anW = null;
        int i6 = 1;
        if (CohostWithGuestTrackingSetting.INSTANCE.getValue().isFeedTrackingEnabled) {
            List<SeiRegion> list = seiAppData.grids;
            if (list != null) {
                i = 0;
                i2 = 0;
                i3 = 0;
                int i7 = 0;
                for (SeiRegion seiRegion : list) {
                    int i8 = i7 + 1;
                    if (i7 >= 0) {
                        SeiRegion seiRegion2 = seiRegion;
                        int i9 = seiRegion2.userType;
                        if (i9 != 2 && i9 != 0) {
                            if (i9 == i6) {
                                i2++;
                                if (new IntRange(2, 3).LJLJL(seiRegion2.position)) {
                                    i3++;
                                }
                            }
                        } else {
                            i++;
                        }
                        i7 = i8;
                        i6 = 1;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            c948800anW = new C948800anW(i, i2, i3);
        }
        this.LLJJJJLIIL = c948800anW;
        Map<String, Map<String, String>> map2 = seiAppData.businessExtraInfo;
        if (map2 != null && (map = map2.get("match_info")) != null) {
            String str4 = map.get("match_type");
            if (str4 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str4)) != null) {
                iIntValue = numLJIIJJI2.intValue();
            } else {
                iIntValue = 0;
            }
            this.LLJJIJI = iIntValue;
            this.LLJJJ = C950220apo.LJJ(map.get("competition_id"));
            String str5 = map.get("match_stage");
            if (str5 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str5)) != null) {
                iIntValue2 = numLJIIJJI.intValue();
            } else {
                iIntValue2 = 0;
            }
            this.LLJJIJIIJIL = iIntValue2;
        }
        if (this.LLJJJJJIL.get()) {
            this.LLJJJJJIL.set(false);
            this.LLJILLL = seiAppData;
            this.LLJJ = i4;
            this.LLIZ = jLongValue;
            this.LLIZLLLIL = str2;
            this.LLJJJIL = i5;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSeiAppData, isInitial=true, newLinkerMode=");
            sbLIZ.append(i4);
            sbLIZ.append(", newChannelId=");
            sbLIZ.append(jLongValue);
            sbLIZ.append(", newLinkMicId=");
            sbLIZ.append(str2);
            sbLIZ.append(", newArcType=");
            sbLIZ.append(i5);
            C20441214yg.LJIIIZ("MultiCoHostFeedWindowHandler", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            SeiAppData seiAppData2 = this.LLJILLL;
            if (seiAppData2 != null) {
                zLJIIZILJ = seiAppData2.LJIIZILJ(seiAppData);
            } else {
                zLJIIZILJ = false;
            }
            int i10 = this.LLJJ;
            long j = this.LLIZ;
            String str6 = this.LLIZLLLIL;
            int i11 = this.LLJJJIL;
            if (!zLJIIZILJ && i10 == i4 && j == jLongValue && Intrinsics.LJFF(str6, str2) && i11 == i5) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onSeiAppData, isInitial=false, ifConfigSame=");
            sbLIZ2.append(z);
            sbLIZ2.append(", isSceneChanged=");
            sbLIZ2.append(zLJIIZILJ);
            sbLIZ2.append(", oldLinkerMode=");
            sbLIZ2.append(i10);
            sbLIZ2.append(", oldChannelId=");
            sbLIZ2.append(j);
            sbLIZ2.append(", oldLinkMicId=");
            sbLIZ2.append(str6);
            sbLIZ2.append(", oldArcType=");
            sbLIZ2.append(i11);
            sbLIZ2.append(", newChannelId=");
            sbLIZ2.append(jLongValue);
            sbLIZ2.append(", newLinkMicId=");
            sbLIZ2.append(str2);
            sbLIZ2.append(", newArcType=");
            sbLIZ2.append(i5);
            C20441214yg.LJIIIZ("MultiCoHostFeedWindowHandler", C2188811AlT.LIZIZ(sbLIZ2));
            if (!z) {
                this.LLJILLL = seiAppData;
                this.LLJJ = i4;
                this.LLIZ = jLongValue;
                this.LLIZLLLIL = str2;
                this.LLJJJIL = i5;
            }
        }
        List<SeiRegion> list2 = seiAppData.grids;
        if (list2 != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        this.LLJJJJ = size;
    }

    @Override // X.InterfaceC940380aZw
    public final void LLLLJI(InterfaceC940430aa1 interfaceC940430aa1) {
        SeiAppData seiAppData;
        if ((interfaceC940430aa1 instanceof SeiAppData) && (seiAppData = (SeiAppData) interfaceC940430aa1) != null) {
            LLJJJJJIL(seiAppData);
        }
    }

    @Override // X.InterfaceC940380aZw
    public final void LLIIJI(FrameLayout frameLayout, Pair<Integer, Integer> pair) {
        SeiAppData seiAppData;
        Context context;
        ViewParent parent;
        Long lValueOf;
        float fFloatValue;
        if (!Intrinsics.LJFF(this.LLJ, frameLayout)) {
            this.LLJ = frameLayout;
            InterfaceC940230aZh interfaceC940230aZh = this.LLJJI;
            if (interfaceC940230aZh != null) {
                interfaceC940230aZh.LIZIZ();
            }
        }
        View view = this.LLJI;
        if (view != null && this.LLJIJIL != null) {
            view.bringToFront();
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                view2.bringToFront();
            }
        }
        if (this.LLJILJIL == null && this.LLJILJILJ == null && this.LLJI == null && this.LLJIJIL == null && (seiAppData = this.LLJILLL) != null && seiAppData.LJIILL()) {
            InterfaceC937900aVw interfaceC937900aVw = this.LLILZIL;
            if (interfaceC937900aVw != null) {
                Float f = (Float) DataChannelGlobal.LLILZ.gg0(TopLiveSkylightTransYChannel.class);
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                interfaceC937900aVw.LJJJJLI(frameLayout, null, pair, "multi_cohost_feed_handler", null, fFloatValue);
            }
            C940490aa7 c940490aa7 = this.LLILZLL;
            Long lValueOf2 = null;
            if (c940490aa7 != null) {
                context = c940490aa7.LIZJ;
            } else {
                context = null;
            }
            FrameLayout frameLayout2 = this.LLJ;
            if ((context == null && (frameLayout2 == null || (context = frameLayout2.getContext()) == null)) || frameLayout2 == null) {
                return;
            }
            View view3 = this.LLJILJIL;
            if (view3 != null) {
                parent = view3.getParent();
            } else {
                parent = null;
            }
            if (Intrinsics.LJFF(parent, frameLayout2)) {
                return;
            }
            LiveCardOverdrawOptSetting liveCardOverdrawOptSetting = LiveCardOverdrawOptSetting.INSTANCE;
            C940490aa7 c940490aa72 = this.LLILZLL;
            if (c940490aa72 != null) {
                lValueOf = Long.valueOf(c940490aa72.LJIIJJI);
            } else {
                lValueOf = null;
            }
            if (liveCardOverdrawOptSetting.enableOverdrawOptForMultiHost(lValueOf)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initEmptyView but enableOverdrawOptForMultiCoHost and webcastSdkVersion=");
                C940490aa7 c940490aa73 = this.LLILZLL;
                if (c940490aa73 != null) {
                    lValueOf2 = Long.valueOf(c940490aa73.LJIIJJI);
                }
                sbLIZ.append(lValueOf2);
                C20441214yg.LJIIIZ("live_overdraw_opt", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
            layoutParams.gravity = 8388659;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 0);
            layoutParams2.gravity = 48;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
            layoutParams3.gravity = 8388661;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 0);
            layoutParams4.gravity = 80;
            View view4 = this.LLJI;
            if (view4 != null) {
                C930540aK4.LJJIJL(view4);
            }
            View view5 = new View(context);
            view5.setId(R.id.ybl);
            C786410Ut5.LJLLLLLL(8, view5);
            view5.setBackgroundColor(-16777216);
            frameLayout2.addView(view5, layoutParams2);
            this.LLJI = view5;
            View view6 = this.LLJILJIL;
            if (view6 != null) {
                C930540aK4.LJJIJL(view6);
            }
            View view7 = new View(context);
            view7.setId(R.id.mke);
            C786410Ut5.LJLLLLLL(8, view7);
            view7.setBackgroundColor(-16777216);
            frameLayout2.addView(view7, layoutParams);
            this.LLJILJIL = view7;
            View view8 = this.LLJIJIL;
            if (view8 != null) {
                C930540aK4.LJJIJL(view8);
            }
            View view9 = new View(context);
            view9.setId(R.id.ceu);
            C786410Ut5.LJLLLLLL(8, view9);
            view9.setBackgroundColor(-16777216);
            frameLayout2.addView(view9, layoutParams4);
            this.LLJIJIL = view9;
            View view10 = this.LLJILJILJ;
            if (view10 != null) {
                C930540aK4.LJJIJL(view10);
            }
            View view11 = new View(context);
            view11.setId(R.id.tlo);
            C786410Ut5.LJLLLLLL(8, view11);
            view11.setBackgroundColor(-16777216);
            frameLayout2.addView(view11, layoutParams3);
            this.LLJILJILJ = view11;
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
        Boolean boolValueOf;
        SeiAppData seiAppData;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        View view;
        ViewGroup.LayoutParams layoutParams2;
        View view2;
        ViewGroup.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        View view3;
        FrameLayout.LayoutParams layoutParams5;
        View view4;
        if (interfaceC937820aVo.getLayoutName() == null) {
            return;
        }
        String layoutName = interfaceC937820aVo.getLayoutName();
        ViewGroup.LayoutParams layoutParams6 = null;
        if (layoutName != null) {
            boolValueOf = Boolean.valueOf(C916560ZxW.LIZJ(layoutName));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIFFI(boolValueOf) && (seiAppData = this.LLJILLL) != null && seiAppData.LJIILL() && (frameLayout = this.LLJ) != null) {
            Rect containerActualRange = interfaceC937820aVo.getContainerActualRange();
            if (frameLayout.getWidth() > containerActualRange.right - containerActualRange.left) {
                View view5 = this.LLJILJIL;
                if (view5 != null) {
                    layoutParams3 = view5.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams5 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    if (LiveCardOverdrawOptSetting.INSTANCE.enableRefreshOptForMultiHost() && (view4 = this.LLJILJIL) != null && view4.getVisibility() == 0 && layoutParams5.topMargin == containerActualRange.top && layoutParams5.height == containerActualRange.height() && layoutParams5.width == containerActualRange.left) {
                        C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but leftEmptyView is not changed");
                    } else {
                        layoutParams5.topMargin = containerActualRange.top;
                        layoutParams5.height = containerActualRange.height();
                        layoutParams5.width = containerActualRange.left;
                        View view6 = this.LLJILJIL;
                        if (view6 != null) {
                            C786410Ut5.W5(view6, layoutParams5);
                        }
                        View view7 = this.LLJILJIL;
                        if (view7 != null) {
                            C786410Ut5.LJLLLLLL(0, view7);
                        }
                    }
                }
                View view8 = this.LLJILJILJ;
                if (view8 != null) {
                    layoutParams6 = view8.getLayoutParams();
                }
                if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams6) != null) {
                    int width = frameLayout.getWidth() - containerActualRange.right;
                    if (LiveCardOverdrawOptSetting.INSTANCE.enableRefreshOptForMultiHost() && (view3 = this.LLJILJILJ) != null && view3.getVisibility() == 0 && layoutParams4.topMargin == containerActualRange.top && layoutParams4.height == containerActualRange.height() && layoutParams4.width == width) {
                        C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but rightEmptyView is not changed");
                    } else {
                        layoutParams4.topMargin = containerActualRange.top;
                        layoutParams4.height = containerActualRange.height();
                        layoutParams4.width = width;
                        View view9 = this.LLJILJILJ;
                        if (view9 != null) {
                            C786410Ut5.W5(view9, layoutParams4);
                        }
                        View view10 = this.LLJILJILJ;
                        if (view10 != null) {
                            C786410Ut5.LJLLLLLL(0, view10);
                        }
                    }
                }
            }
            View view11 = this.LLJI;
            if (view11 != null && (layoutParams2 = view11.getLayoutParams()) != null) {
                if (LiveCardOverdrawOptSetting.INSTANCE.enableRefreshOptForMultiHost() && (view2 = this.LLJI) != null && view2.getVisibility() == 0 && layoutParams2.height == containerActualRange.top) {
                    C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but topEmptyView is not changed");
                } else {
                    layoutParams2.height = containerActualRange.top;
                    View view12 = this.LLJI;
                    if (view12 != null) {
                        C786410Ut5.W5(view12, layoutParams2);
                    }
                    View view13 = this.LLJI;
                    if (view13 != null) {
                        C786410Ut5.LJLLLLLL(0, view13);
                    }
                }
            }
            View view14 = this.LLJIJIL;
            if (view14 != null && (layoutParams = view14.getLayoutParams()) != null) {
                int height = frameLayout.getHeight() - containerActualRange.bottom;
                if (LiveCardOverdrawOptSetting.INSTANCE.enableRefreshOptForMultiHost() && (view = this.LLJIJIL) != null && view.getVisibility() == 0 && layoutParams.height == height) {
                    C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but btmEmptyView is not changed");
                    return;
                }
                layoutParams.height = height;
                View view15 = this.LLJIJIL;
                if (view15 != null) {
                    C786410Ut5.W5(view15, layoutParams);
                }
                View view16 = this.LLJIJIL;
                if (view16 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, view16);
            }
        }
    }

    public final void LJFF(C940490aa7 c940490aa7, InterfaceC937900aVw interfaceC937900aVw, C919770a2h c919770a2h, InterfaceC958990b3x interfaceC958990b3x) {
        LiveWidget liveWidget;
        DataChannel dataChannel;
        this.LLILZLL = c940490aa7;
        this.LLILZIL = interfaceC937900aVw;
        if (c940490aa7 != null && (liveWidget = c940490aa7.LJI) != null && (dataChannel = liveWidget.dataChannel) != null) {
            dataChannel.zW(PreviewCardCohostEvent.class, Boolean.TRUE);
        }
    }
}
