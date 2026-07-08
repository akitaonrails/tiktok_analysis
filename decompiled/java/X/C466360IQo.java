package X;

import X.C830490Whz;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.dataChannel.LiveInteractionScrollState;
import com.bytedance.android.livesdk.livefinishcard.LiveEndPageOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRoomRunnableBlockMiloConfigExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAnchorAvatarPreloadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomSuccessMsgOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerPrePullStreamConfigData;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerPrePullStreamSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSessionIdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePowerInflaterOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePredictEnterSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveReleasePlayerExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRoomScrollEndLogSampleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSlideBlockLogDisableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveSurfaceNewVersionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.scatter.LiveExitRoomRunnableScatter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: X.0IQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C466360IQo implements InterfaceC469360Ias {
    public InterfaceC466370IQp LLILLJJLI;
    public InterfaceC466370IQp LLILLL;
    public String LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final String LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILLL;
    public final float LLJJJ;
    public final float LLJJJIL;
    public InterfaceC466370IQp LLJJJJ;
    public final SparseLongArray LLJJJJJIL;
    public final /* synthetic */ LiveRoomFragment LLJJJJLIIL;
    public int LL = -1;
    public long LLILZ = -1;
    public int LLJILJILJ = -1;
    public final SparseBooleanArray LLJJ = new SparseBooleanArray();
    public int LLJJI = -1;
    public final SparseBooleanArray LLJJIII = new SparseBooleanArray();
    public int LLJJIJI = -1;
    public final Map<String, EnterRoomLinkSession> LLJJIJIIJIL = new ConcurrentHashMap();
    public int LLJJIJIL = -1;

    public final C0IEB LIZJ(int i) {
        InterfaceC466370IQp interfaceC466370IQpLJJIJIL;
        String playerTag;
        if (i < 0 || i >= this.LLJJJJLIIL.LLLLIIL.getCount() || (interfaceC466370IQpLJJIJIL = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i)) == null) {
            return null;
        }
        C0IEB c0iebLIZLLL = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Qt1().LIZLLL(interfaceC466370IQpLJJIJIL.hx());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPlayerClientByPosition -> ");
        if (c0iebLIZLLL == null) {
            playerTag = "null";
        } else {
            playerTag = c0iebLIZLLL.getPlayerTag();
        }
        sbLIZ.append(playerTag);
        C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ));
        return c0iebLIZLLL;
    }

    public final InterfaceC466370IQp LIZLLL(int i) {
        boolean z;
        InterfaceC466370IQp interfaceC466370IQpLJJIJIL;
        LiveInnerPrePullStreamConfigData value = LiveInnerPrePullStreamSettings.INSTANCE.getValue();
        if (value != null && value.delayTimeForPrePullStream >= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        int i2 = this.LLJJIJIL;
        if (i2 >= 0) {
            interfaceC466370IQpLJJIJIL = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i2);
        } else {
            interfaceC466370IQpLJJIJIL = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i);
        }
        if (interfaceC466370IQpLJJIJIL != null && !interfaceC466370IQpLJJIJIL.lk()) {
            interfaceC466370IQpLJJIJIL = null;
        }
        if (interfaceC466370IQpLJJIJIL == this.LLJJJJ) {
            return null;
        }
        return interfaceC466370IQpLJJIJIL;
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LLJJJJLIIL.LLLLIIL.getCount()) {
            InterfaceC466370IQp interfaceC466370IQpLJJIJIL = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i);
            Collection collectionValues = this.LLJJJJLIIL.LLLLIIL.LLIZ.values();
            InterfaceC466370IQp interfaceC466370IQpLIZLLL = LIZLLL(i);
            Iterator it2 = ((C830490Whz.e) collectionValues).iterator();
            while (true) {
                AbstractC1322040kVW abstractC1322040kVW = (AbstractC1322040kVW) it2;
                if (!abstractC1322040kVW.hasNext()) {
                    break;
                }
                InterfaceC466370IQp interfaceC466370IQp = (InterfaceC466370IQp) abstractC1322040kVW.next();
                if (interfaceC466370IQp != null && interfaceC466370IQp != interfaceC466370IQpLIZLLL && interfaceC466370IQp != interfaceC466370IQpLJJIJIL) {
                    interfaceC466370IQp.IP();
                    interfaceC466370IQp.kR();
                    interfaceC466370IQp.kb(C0IHD.LIZ(interfaceC466370IQp, "releaseAllUselessPlayer"));
                }
            }
            if (interfaceC466370IQpLJJIJIL != null) {
                interfaceC466370IQpLJJIJIL.wA(C0IHD.LIZ(interfaceC466370IQpLJJIJIL, "releaseAllUselessPlayer"));
            }
            LJ(i, true, false, -1, -1, null);
            C0IEB c0iebLIZJ = LIZJ(i);
            if (c0iebLIZJ != null) {
                c0iebLIZJ.setMute(false, "multi-player release all useless player");
            }
            C465130ILv c465130ILvQt1 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Qt1();
            this.LLJJJJLIIL.getContext();
            c465130ILvQt1.LJI(c0iebLIZJ);
            this.LLJJIII.clear();
            this.LLJJIII.put(i, true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseAllUselessPlayer index ");
            sbLIZ.append(i);
            C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJII(InterfaceC466370IQp interfaceC466370IQp) {
        this.LLILLJJLI = interfaceC466370IQp;
        LiveRoomFragment liveRoomFragment = this.LLJJJJLIIL;
        if (liveRoomFragment.LLLLIIL != null && liveRoomFragment.LLLLIIIILLL != null && C0IJ7.LIZIZ(liveRoomFragment.getContext())) {
            int iLJIJJ = this.LLJJJJLIIL.LLLLIIL.LJIJJ(interfaceC466370IQp);
            if (iLJIJJ == 0) {
                if (this.LLJJJJLIIL.LLLLIIL.getCount() == 1 && !this.LLJJJJLIIL.LLLLIIIILLL.LJJIFFI()) {
                    this.LLJJJJLIIL.getClass();
                    LiveRoomFragment.sS("only_one");
                    return;
                } else {
                    this.LLJJJJLIIL.getClass();
                    LiveRoomFragment.sS("top");
                    return;
                }
            }
            if (iLJIJJ != this.LLJJJJLIIL.LLLLIIL.getCount() - 1) {
                return;
            }
            this.LLJJJJLIIL.getClass();
            LiveRoomFragment.sS("bottom");
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        int currentItem;
        InterfaceC466370IQp interfaceC466370IQpLJJIJIL;
        int i2;
        C21601619gM c21601619gM = this.LLJJJJLIIL.LLLJIL;
        if (c21601619gM != null) {
            currentItem = c21601619gM.getCurrentItem();
        } else {
            currentItem = this.LLJ;
        }
        for (InterfaceC469360Ias interfaceC469360Ias : this.LLJJJJLIIL.LLZL) {
            if (interfaceC469360Ias != null) {
                interfaceC469360Ias.onPageScrollStateChanged(i);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageScrollStateChanged invoked, state is ");
        sbLIZ.append(i);
        C827750WdZ.LIZ("LiveRoomFragment", C2188811AlT.LIZIZ(sbLIZ));
        C21601619gM c21601619gM2 = this.LLJJJJLIIL.LLLJIL;
        int i3 = 2;
        if (c21601619gM2 != null && i == 2) {
            C0IIS.LIZIZ = c21601619gM2.LLJJL;
        }
        boolean z = true;
        if (i == 0) {
            if (this.LLJILJILJ >= 0) {
                if (currentItem == this.LLJIJIL) {
                    if (this.LLJILJIL) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                } else if (this.LLJILJIL) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_cell_show");
                c474500IjALIZ.LJJII(Integer.valueOf(i2), "pre_enter_room_status");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
                this.LLJILJILJ = -1;
            }
            C486790J7d.LIZIZ = false;
            C18JT c18jt = C18JT.LLILZLL;
            c18jt.LLILZ = false;
            LockSupport.unpark(c18jt);
            LiveExitRoomRunnableScatter.setScrolling(false);
            LiveRoomFragment liveRoomFragment = this.LLJJJJLIIL;
            if (liveRoomFragment.LLLLZLLLI && this.LLILZLL != 1) {
                LJFF(liveRoomFragment.LLLJIL.getCurrentItem());
            }
            this.LLJJJJJIL.clear();
            C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("watch_slide");
            if (c1300480jwkLIZIZ != null) {
                c1300480jwkLIZIZ.stop();
            }
            LiveRoomFragment liveRoomFragment2 = this.LLJJJJLIIL;
            liveRoomFragment2.getClass();
            if (RecommendEndAtFollowingSetting.INSTANCE.getValue().enableShowRecommend == 3) {
                liveRoomFragment2.LLLJIL.LJJI(1.0f, true);
            }
            if (LiveRoomScrollEndLogSampleSetting.INSTANCE.getShouldLogForScrollEnd() && this.LLJJJJLIIL.LL != null) {
                int i4 = this.LLJJIJI;
                if (i4 != -1) {
                    if (i4 == this.LLJ) {
                        i3 = 1;
                    }
                } else {
                    i3 = 0;
                }
                this.LLJJIJI = -1;
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_scroll_end");
                c474500IjALIZ2.LJJII(Integer.valueOf(i3), "effect_draw_for_pre_pull_stream_state");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LIZ();
            }
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).S5(EnumC480200IsM.INNER_FLOW_SLIDE_END);
            C21601619gM c21601619gM3 = this.LLJJJJLIIL.LLLJIL;
            if (c21601619gM3 != null && this.LLJJI >= 0) {
                int currentItem2 = c21601619gM3.getCurrentItem();
                int i5 = this.LLJJI;
                if (currentItem2 != i5 && (interfaceC466370IQpLJJIJIL = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i5)) != null) {
                    interfaceC466370IQpLJJIJIL.bK();
                    this.LLJJ.delete(this.LLJJI);
                    this.LLJJI = -1;
                }
            }
        } else if (i == 1) {
            ((IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class)).MS1(3000L);
            if (LiveSlideBlockLogDisableSetting.disable()) {
                C08MD c08md = C08MD.LIZ;
                ((IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class)).TY();
            } else {
                C08MD c08md2 = C08MD.LIZ;
                ((IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class)).OC2();
            }
            if (!LivePowerInflaterOptSetting.enableGcBlockOpt() || !this.LLJJJJLIIL.LLLZZIL) {
                JatoXL.requestBlockGc(1000L);
            }
            C486790J7d.LIZIZ = true;
            C18JT.LLILZLL.LLILZ = true;
            LiveExitRoomRunnableScatter.setScrolling(true);
            if (LiveRoomRunnableBlockMiloConfigExperiment.getEnableOpt() && !LiveRoomRunnableBlockMiloConfigExperiment.exp2SlideEnabled()) {
                C1BCA.LIZ(LiveRoomRunnableBlockMiloConfigExperiment.getRunnableBlockConfig());
            }
            InterfaceC466370IQp interfaceC466370IQp = this.LLILLJJLI;
            if (interfaceC466370IQp != null) {
                interfaceC466370IQp.fN();
            }
            int i6 = C21406218pw.LIZ;
            C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", "startSwitchRoom");
            C21406218pw.LIZ = 2;
            C1EOY c1eoy = C1EOY.LIZ;
            C1300480jwk c1300480jwkLIZIZ2 = c1eoy.LIZIZ("watch_slide");
            if (c1300480jwkLIZIZ2 != null) {
                c1300480jwkLIZIZ2.LIZJ(null);
            }
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = "";
            this.LLJJJJLIIL.NR(true, true);
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).S5(EnumC480200IsM.INNER_FLOW_SLIDE_START);
        } else if (i == 2) {
            int i7 = C21406218pw.LIZ;
            C20441214yg.LIZIZ("LivePitayaRunTaskFrequentControlManager", "switchRoomSuccess");
            C21406218pw.LIZ = 0;
        }
        this.LLILZLL = i;
        if (i == 1) {
            this.LLJIJIL = this.LLJJJJLIIL.LLLJIL.getCurrentItem();
            LiveRoomFragment liveRoomFragment3 = this.LLJJJJLIIL;
            liveRoomFragment3.LLLLLZIL = false;
            liveRoomFragment3.LLLLLZ = true;
        }
        if (this.LLILZLL == 0) {
            this.LLJJJJLIIL.LLLLLLZZ = false;
        }
        C0IOL c0iol = this.LLJJJJLIIL.LLLLIIIILLL;
        if (c0iol != null) {
            c0iol.LJJIJIIJIL(i);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (i == 0) {
            z = false;
        }
        dataChannelGlobal.HQ2(LiveInteractionScrollState.class, Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04bc A[Catch: all -> 0x05b8, TryCatch #3 {all -> 0x05b8, blocks: (B:175:0x0457, B:177:0x045b, B:179:0x0461, B:181:0x046d, B:185:0x0489, B:182:0x0479, B:184:0x0484, B:187:0x0490, B:191:0x04b6, B:193:0x04bc, B:195:0x04ce, B:198:0x04d6, B:201:0x04e0, B:202:0x04f5, B:213:0x052c, B:212:0x0529, B:205:0x04fb, B:207:0x0503, B:208:0x0518, B:211:0x0520, B:210:0x051d, B:214:0x0534, B:216:0x0538, B:217:0x0543, B:219:0x0549, B:222:0x055b, B:224:0x0561, B:225:0x0565, B:227:0x056b, B:228:0x057a, B:230:0x0586, B:231:0x0593, B:234:0x059b, B:235:0x05a3, B:189:0x04b2), top: B:397:0x0457, inners: #0, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04d6 A[Catch: all -> 0x05b8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x05b8, blocks: (B:175:0x0457, B:177:0x045b, B:179:0x0461, B:181:0x046d, B:185:0x0489, B:182:0x0479, B:184:0x0484, B:187:0x0490, B:191:0x04b6, B:193:0x04bc, B:195:0x04ce, B:198:0x04d6, B:201:0x04e0, B:202:0x04f5, B:213:0x052c, B:212:0x0529, B:205:0x04fb, B:207:0x0503, B:208:0x0518, B:211:0x0520, B:210:0x051d, B:214:0x0534, B:216:0x0538, B:217:0x0543, B:219:0x0549, B:222:0x055b, B:224:0x0561, B:225:0x0565, B:227:0x056b, B:228:0x057a, B:230:0x0586, B:231:0x0593, B:234:0x059b, B:235:0x05a3, B:189:0x04b2), top: B:397:0x0457, inners: #0, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0538 A[Catch: all -> 0x05b8, TryCatch #3 {all -> 0x05b8, blocks: (B:175:0x0457, B:177:0x045b, B:179:0x0461, B:181:0x046d, B:185:0x0489, B:182:0x0479, B:184:0x0484, B:187:0x0490, B:191:0x04b6, B:193:0x04bc, B:195:0x04ce, B:198:0x04d6, B:201:0x04e0, B:202:0x04f5, B:213:0x052c, B:212:0x0529, B:205:0x04fb, B:207:0x0503, B:208:0x0518, B:211:0x0520, B:210:0x051d, B:214:0x0534, B:216:0x0538, B:217:0x0543, B:219:0x0549, B:222:0x055b, B:224:0x0561, B:225:0x0565, B:227:0x056b, B:228:0x057a, B:230:0x0586, B:231:0x0593, B:234:0x059b, B:235:0x05a3, B:189:0x04b2), top: B:397:0x0457, inners: #0, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0549 A[Catch: all -> 0x05b8, TryCatch #3 {all -> 0x05b8, blocks: (B:175:0x0457, B:177:0x045b, B:179:0x0461, B:181:0x046d, B:185:0x0489, B:182:0x0479, B:184:0x0484, B:187:0x0490, B:191:0x04b6, B:193:0x04bc, B:195:0x04ce, B:198:0x04d6, B:201:0x04e0, B:202:0x04f5, B:213:0x052c, B:212:0x0529, B:205:0x04fb, B:207:0x0503, B:208:0x0518, B:211:0x0520, B:210:0x051d, B:214:0x0534, B:216:0x0538, B:217:0x0543, B:219:0x0549, B:222:0x055b, B:224:0x0561, B:225:0x0565, B:227:0x056b, B:228:0x057a, B:230:0x0586, B:231:0x0593, B:234:0x059b, B:235:0x05a3, B:189:0x04b2), top: B:397:0x0457, inners: #0, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0561 A[Catch: all -> 0x05b8, TryCatch #3 {all -> 0x05b8, blocks: (B:175:0x0457, B:177:0x045b, B:179:0x0461, B:181:0x046d, B:185:0x0489, B:182:0x0479, B:184:0x0484, B:187:0x0490, B:191:0x04b6, B:193:0x04bc, B:195:0x04ce, B:198:0x04d6, B:201:0x04e0, B:202:0x04f5, B:213:0x052c, B:212:0x0529, B:205:0x04fb, B:207:0x0503, B:208:0x0518, B:211:0x0520, B:210:0x051d, B:214:0x0534, B:216:0x0538, B:217:0x0543, B:219:0x0549, B:222:0x055b, B:224:0x0561, B:225:0x0565, B:227:0x056b, B:228:0x057a, B:230:0x0586, B:231:0x0593, B:234:0x059b, B:235:0x05a3, B:189:0x04b2), top: B:397:0x0457, inners: #0, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x056b A[Catch: all -> 0x05b8, TryCatch #3 {all -> 0x05b8, blocks: (B:175:0x0457, B:177:0x045b, B:179:0x0461, B:181:0x046d, B:185:0x0489, B:182:0x0479, B:184:0x0484, B:187:0x0490, B:191:0x04b6, B:193:0x04bc, B:195:0x04ce, B:198:0x04d6, B:201:0x04e0, B:202:0x04f5, B:213:0x052c, B:212:0x0529, B:205:0x04fb, B:207:0x0503, B:208:0x0518, B:211:0x0520, B:210:0x051d, B:214:0x0534, B:216:0x0538, B:217:0x0543, B:219:0x0549, B:222:0x055b, B:224:0x0561, B:225:0x0565, B:227:0x056b, B:228:0x057a, B:230:0x0586, B:231:0x0593, B:234:0x059b, B:235:0x05a3, B:189:0x04b2), top: B:397:0x0457, inners: #0, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0586 A[Catch: all -> 0x05b8, TryCatch #3 {all -> 0x05b8, blocks: (B:175:0x0457, B:177:0x045b, B:179:0x0461, B:181:0x046d, B:185:0x0489, B:182:0x0479, B:184:0x0484, B:187:0x0490, B:191:0x04b6, B:193:0x04bc, B:195:0x04ce, B:198:0x04d6, B:201:0x04e0, B:202:0x04f5, B:213:0x052c, B:212:0x0529, B:205:0x04fb, B:207:0x0503, B:208:0x0518, B:211:0x0520, B:210:0x051d, B:214:0x0534, B:216:0x0538, B:217:0x0543, B:219:0x0549, B:222:0x055b, B:224:0x0561, B:225:0x0565, B:227:0x056b, B:228:0x057a, B:230:0x0586, B:231:0x0593, B:234:0x059b, B:235:0x05a3, B:189:0x04b2), top: B:397:0x0457, inners: #0, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x060f  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r26) {
        /*
            Method dump skipped, instruction units count: 2651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466360IQo.onPageSelected(int):void");
    }

    public C466360IQo(LiveRoomFragment liveRoomFragment, String str) {
        this.LLJJJJLIIL = liveRoomFragment;
        LiveEnterRoomSuccessMsgOptExp liveEnterRoomSuccessMsgOptExp = LiveEnterRoomSuccessMsgOptExp.INSTANCE;
        this.LLJJJ = liveEnterRoomSuccessMsgOptExp.prePullStreamScrollThreshold();
        this.LLJJJIL = liveEnterRoomSuccessMsgOptExp.scrollEnterRoomStartThreshold();
        this.LLJJJJ = null;
        this.LLJJJJJIL = new SparseLongArray();
        this.LLJI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r23, X.InterfaceC466370IQp r24) {
        /*
            Method dump skipped, instruction units count: 1931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466360IQo.LIZIZ(int, X.0IQp):void");
    }

    public final void LJIIIIZZ(int i, InterfaceC466370IQp interfaceC466370IQp) {
        Room roomLJIIJJI = this.LLJJJJLIIL.LLLLIIIILLL.LJIIJJI(i);
        EnterRoomConfig enterRoomConfigLIZIZ = this.LLJJJJLIIL.LLLLIIIILLL.LIZIZ(i);
        if (enterRoomConfigLIZIZ != null) {
            if (enterRoomConfigLIZIZ.mRoomsData.curIsMicRoomFromOfficial) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("warmUp next room ");
            sbLIZ.append(enterRoomConfigLIZIZ.mRoomsData.roomId);
            sbLIZ.append(" pull stream,");
            C20441214yg.LIZIZ("LiveRoomFragment_tag", C2188811AlT.LIZIZ(sbLIZ));
            IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
            Long lValueOf = Long.valueOf(enterRoomConfigLIZIZ.mRoomsData.roomId);
            EnterRoomConfig.LogData logData = enterRoomConfigLIZIZ.mLogData;
            LJI(interfaceC466370IQp, enterRoomConfigLIZIZ, iPullStreamService.dv1(new C0IMA("", lValueOf, logData.forcedLowLatency, logData.logId), enterRoomConfigLIZIZ, this.LLJJJJLIIL.getContext()));
        } else if (roomLJIIJJI != null) {
            LJI(interfaceC466370IQp, enterRoomConfigLIZIZ, ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).iB0(this.LLJJJJLIIL.getContext(), roomLJIIJJI));
        }
        interfaceC466370IQp.wA(C0IHD.LIZ(interfaceC466370IQp, "tryToWarmUpOnPageSelected"));
    }

    public final boolean LIZ(float f, int i, boolean z) {
        float f2 = this.LLJJJ;
        float f3 = 1.0f - f2;
        int count = this.LLJJJJLIIL.LLLLIIL.getCount();
        if (i >= 0 && i < count) {
            if (this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("canPrePullStream -> targetFragment == null, ");
                sbLIZ.append(i);
                C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
            if (this.LLJJIII.get(i)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("canPrePullStream -> already prePullStream position == ");
                sbLIZ2.append(i);
                C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ2));
                return false;
            }
            if (z) {
                if (f > f2) {
                    return true;
                }
            } else if (f < f3) {
                return true;
            }
        }
        return false;
    }

    public final void LJI(InterfaceC466370IQp interfaceC466370IQp, EnterRoomConfig enterRoomConfig, C0IEB c0ieb) {
        if (c0ieb != null) {
            this.LLILZIL = c0ieb.getPlayerTag();
            this.LLJJJJLIIL.LLLLZIL = c0ieb.getPlayerTag();
            if (enterRoomConfig != null) {
                this.LLILZ = enterRoomConfig.mRoomsData.roomId;
            }
            interfaceC466370IQp.Eq().mRoomsData.warmUpPlayerTag = this.LLILZIL;
        }
        enterRoomConfig.mRoomsData.enterRoomScene = "inner_draw";
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        boolean z;
        InterfaceC466370IQp interfaceC466370IQpLJJIJIL;
        InterfaceC466370IQp interfaceC466370IQpLJJIJIL2;
        EnterRoomConfig enterRoomConfigEq;
        int currentItem;
        Object obj;
        boolean zBooleanValue;
        Boolean bool;
        C1090000eTG c1090000eTGO3;
        int i3;
        InterfaceC466370IQp interfaceC466370IQpLJJIJIL3;
        int i4;
        InterfaceC466370IQp interfaceC466370IQpLJJIJIL4;
        for (InterfaceC469360Ias interfaceC469360Ias : this.LLJJJJLIIL.LLZL) {
            if (interfaceC469360Ias != null) {
                interfaceC469360Ias.onPageScrolled(i, f, i2);
            }
        }
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LIZIZ(C0UX8.EVENT_PAGE_WATCH_LIVE, 9);
        LiveInnerPrePullStreamConfigData value = LiveInnerPrePullStreamSettings.INSTANCE.getValue();
        if (value != null && value.delayTimeForPrePullStream >= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int currentItem2 = this.LLJJJJLIIL.LLLJIL.getCurrentItem();
            float f2 = this.LLJJJIL;
            float f3 = 1.0f - f2;
            if (i == currentItem2) {
                i4 = i + 1;
            } else if (i == currentItem2 - 1) {
                i4 = i;
            } else {
                i4 = -1;
            }
            int count = this.LLJJJJLIIL.LLLLIIL.getCount();
            if (i4 >= 0 && i4 < count && (interfaceC466370IQpLJJIJIL4 = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i4)) != null && this.LLJJJJJIL.get(i4) == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (i == currentItem2) {
                    if (f > f2) {
                        this.LLJJJJJIL.put(i4, jCurrentTimeMillis);
                        C963140bAe.LJFF(this.LLJJJJJIL.get(i4));
                        C963140bAe.LJFF(jCurrentTimeMillis);
                    }
                    interfaceC466370IQpLJJIJIL4.Eq().mRoomsData.timeStamps.enterRoomStarTimeReal = jCurrentTimeMillis;
                } else if (i == currentItem2 - 1) {
                    if (f < f3) {
                        this.LLJJJJJIL.put(i4, jCurrentTimeMillis);
                        C963140bAe.LJFF(this.LLJJJJJIL.get(i4));
                        C963140bAe.LJFF(jCurrentTimeMillis);
                    }
                    interfaceC466370IQpLJJIJIL4.Eq().mRoomsData.timeStamps.enterRoomStarTimeReal = jCurrentTimeMillis;
                }
            }
            if (this.LLJJJJLIIL.LLLLZLLLI) {
                this.LLJJIII.put(currentItem2, true);
                if (i == currentItem2) {
                    int i5 = i + 1;
                    if (LIZ(f, i5, true)) {
                        this.LLJJIJI = i5;
                        LJ(i5, false, false, -1, -1, null);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onPageScrolled -> n+1 preload -->");
                        sbLIZ.append(i5);
                        C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (i == currentItem2 - 1 && LIZ(f, i, false)) {
                    this.LLJJIJI = i;
                    LJ(i, false, false, -1, -1, null);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPageScrolled -> n-1 preload -->");
                    sbLIZ2.append(i);
                    C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        if (LiveAnchorAvatarPreloadSetting.preloadWhenSlide()) {
            int currentItem3 = this.LLJJJJLIIL.LLLJIL.getCurrentItem();
            if (i == currentItem3) {
                if (f > 0.05f) {
                    i3 = i + 1;
                    if (i3 != -1 && (interfaceC466370IQpLJJIJIL3 = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i3)) != null) {
                        interfaceC466370IQpLJJIJIL3.jm();
                    }
                }
            } else if (i == currentItem3 - 1 && f < 0.95f) {
                i3 = i;
                if (i3 != -1) {
                    interfaceC466370IQpLJJIJIL3.jm();
                }
            }
        }
        if (this.LLJILJILJ < 0 && this.LLILZLL == 1 && f > 0.0f && LivePredictEnterSetting.isEnablePredictEnter() && i == (currentItem = this.LLJJJJLIIL.LLLJIL.getCurrentItem())) {
            InterfaceC472980Igi interfaceC472980Igi = C0IR8.LIZ;
            ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
            if (iLiveFeatureCenterService != null && (c1090000eTGO3 = iLiveFeatureCenterService.O3(EnumC1094630eaj.DEFAULT, "predict", "predict_slide_next")) != null) {
                obj = c1090000eTGO3.LIZJ;
            } else {
                obj = null;
            }
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.LLJILJIL = zBooleanValue;
            this.LLJILJILJ = currentItem;
            if (zBooleanValue) {
                LiveRoomFragment liveRoomFragment = this.LLJJJJLIIL;
                liveRoomFragment.getClass();
                try {
                    InterfaceC466370IQp interfaceC466370IQpZR = liveRoomFragment.ZR();
                    if (interfaceC466370IQpZR != null && liveRoomFragment.getContext() != null) {
                        interfaceC466370IQpZR.Rm();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("LiveRoomFragment", "onPredictSlideNext failed", e);
                }
            }
        }
        if (this.LL == -1 && f < 1.0E-10f) {
            InterfaceC466370IQp interfaceC466370IQpLJJIJIL5 = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i);
            InterfaceC466370IQp interfaceC466370IQp = this.LLILLJJLI;
            if (interfaceC466370IQp != null && interfaceC466370IQpLJJIJIL5 == interfaceC466370IQp) {
                interfaceC466370IQp.vH();
            }
        }
        int i6 = this.LL;
        if (i == i6 && f < 1.0E-10f) {
            InterfaceC466370IQp interfaceC466370IQpLJJIJIL6 = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onPageScrolled -> newFragment != activeFragment, pos=");
            sbLIZ3.append(i);
            sbLIZ3.append(", positionOffset < MAX_OFFSET");
            C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ3));
            if (interfaceC466370IQpLJJIJIL6 != this.LLILLJJLI) {
                LIZIZ(i, interfaceC466370IQpLJJIJIL6);
                LiveRoomFragment liveRoomFragment2 = this.LLJJJJLIIL;
                liveRoomFragment2.getClass();
                C520010KaN.LJIILJJIL(liveRoomFragment2, "has_page_slide");
                if (interfaceC466370IQpLJJIJIL6 == null) {
                    HashMap map = new HashMap();
                    map.put("is_frag_created", CardStruct.IStatusCode.DEFAULT);
                    map.put("is_screen_black", "1");
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_enter_room_full_link");
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJIIL();
                    if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                        c474500IjALIZ.LIZ();
                    } else {
                        c474500IjALIZ.LJJIJLIJ();
                        c474500IjALIZ.LJJIJL();
                    }
                }
            }
        } else if (i6 != -1 && i != i6 && f < 1.0E-10f) {
            C827750WdZ.LIZ("MultiPlayerPrePullStream", "multi-player=" + this.LLJJJJLIIL.LLLLZLLLI + "!!!  The case of sliding back after triggering onPageSelected, re-stream the current live broadcast room");
            Room roomLJIIJJI = this.LLJJJJLIIL.LLLLIIIILLL.LJIIJJI(i);
            if (roomLJIIJJI != null && this.LLILZ != -1 && roomLJIIJJI.getId() != this.LLILZ) {
                if (this.LLILZIL != null) {
                    ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).t11(this.LLILZIL);
                    ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).R92(this.LLILZIL);
                    this.LLILZIL = null;
                }
                this.LLILZ = -1L;
            }
            LiveRoomFragment liveRoomFragment3 = this.LLJJJJLIIL;
            if (!liveRoomFragment3.LLLLZLLLI) {
                LIZIZ(i, liveRoomFragment3.LLLLIIL.LJJIJIL(i));
            }
        }
        if (i == this.LL && f < 1.0E-10f) {
            int i7 = this.LLIZLLLIL;
            if (i7 >= 0 && i != i7) {
                if (i < i7) {
                    this.LLIZ = 0;
                } else {
                    this.LLIZ++;
                }
                this.LLIZLLLIL = i;
                if (this.LLIZ > 15) {
                    this.LLIZLLLIL = -1;
                }
            } else {
                return;
            }
        }
        if (i == this.LLJJJJLIIL.LLLLIIL.getCount() - 1 && this.LLILZLL == 1 && f == 0.0f && !this.LLJJJJLIIL.LLLLIIIILLL.LJJIFFI()) {
            LiveRoomFragment liveRoomFragment4 = this.LLJJJJLIIL;
            if (!liveRoomFragment4.LLLLLLZZ) {
                C0IVS c0ivs = liveRoomFragment4.LL;
                InterfaceC466370IQp interfaceC466370IQp2 = this.LLILLJJLI;
                c0ivs.getClass();
                if (interfaceC466370IQp2 != null && (enterRoomConfigEq = interfaceC466370IQp2.Eq()) != null && enterRoomConfigEq.drawParams.openLiveFromDrawer && !TextUtils.isEmpty(enterRoomConfigEq.mRoomsData.openLiveFromDrawerTab)) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_explore_infeed_empty_show");
                    c474500IjALIZ2.LJJII(enterRoomConfigEq.mRoomsData.openLiveFromDrawerTab, "from_drawer_tab");
                    c474500IjALIZ2.LJJII(enterRoomConfigEq.mRoomsData.enterFromMerge, "enter_from_merge");
                    c474500IjALIZ2.LJJII(enterRoomConfigEq.mRoomsData.enterMethod, "enter_method");
                    c474500IjALIZ2.LJJII(enterRoomConfigEq.mRoomsData.actionType, "action_type");
                    c474500IjALIZ2.LIZ();
                }
                this.LLJJJJLIIL.LLLLLLZZ = true;
            }
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && i == this.LLJJJJLIIL.LLLLIIL.getCount() - 1 && this.LLILZLL == 1 && f == 0.0f) {
            C0IOL c0iol = this.LLJJJJLIIL.LLLLIIIILLL;
            if (!(c0iol instanceof C0IP5)) {
                String strLJIILLIIL = c0iol.LJIILLIIL(2, 0L);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("no feed Data! ");
                sbLIZ4.append(strLJIILLIIL);
                C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        if (i == this.LLJJJJLIIL.LLLLIIL.getCount() - 1 && this.LLILZLL == 1 && f == 0.0f) {
            int i8 = i + 1;
            if (this.LLJJJJLIIL.LLJJL.contains(Integer.valueOf(i8))) {
                this.LLJJJJLIIL.LLJJL.remove(Integer.valueOf(i8));
                this.LLJJJJLIIL.uS(i, false);
            }
        } else if (f != 0.0f) {
            int i9 = i + 1;
            if (this.LLJJJJLIIL.LLJJL.contains(Integer.valueOf(i9))) {
                this.LLJJJJLIIL.LLJJL.remove(Integer.valueOf(i9));
                this.LLJJJJLIIL.uS(i, true);
            }
        }
        if (LiveEndPageOptSetting.INSTANCE.isEndCardEnable() && C0IH6.LJFF == 6) {
            LivePlayFragment livePlayFragment = C0IH6.LJI;
            if (livePlayFragment != null) {
                livePlayFragment.NR(f);
            }
            LivePlayFragment livePlayFragment2 = C0IH6.LJII;
            if (livePlayFragment2 != null) {
                livePlayFragment2.NR(f);
            }
        }
        int currentItem4 = this.LLJJJJLIIL.LLLJIL.getCurrentItem();
        this.LLJJ.put(currentItem4, true);
        if (i == currentItem4 && f > 0.05f) {
            int i10 = currentItem4 + 1;
            if (i10 >= 0 && i10 < this.LLJJJJLIIL.LLLLIIL.getCount() && !this.LLJJ.get(i10) && (interfaceC466370IQpLJJIJIL2 = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i10)) != null) {
                interfaceC466370IQpLJJIJIL2.fy();
                this.LLJJ.put(i10, true);
                this.LLJJI = i10;
                return;
            }
            return;
        }
        int i11 = currentItem4 - 1;
        if (i != i11 || f >= 0.95f || i11 < 0 || i11 >= this.LLJJJJLIIL.LLLLIIL.getCount() || this.LLJJ.get(i11) || (interfaceC466370IQpLJJIJIL = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i11)) == null) {
            return;
        }
        interfaceC466370IQpLJJIJIL.fy();
        this.LLJJ.put(i11, true);
        this.LLJJI = i11;
    }

    public final void LJ(int i, boolean z, boolean z2, int i2, int i3, EnterRoomLinkSession enterRoomLinkSession) {
        InterfaceC466370IQp interfaceC466370IQpLJJIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multiPlayerPrePullTargetFragment START (");
        sbLIZ.append(i);
        sbLIZ.append(")");
        C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ));
        C0IK4 c0ik4 = this.LLJJJJLIIL.LLLLIIL;
        if (c0ik4 == null) {
            return;
        }
        int count = c0ik4.getCount();
        if (i < 0 || i >= count || (interfaceC466370IQpLJJIJIL = this.LLJJJJLIIL.LLLLIIL.LJJIJIL(i)) == null) {
            return;
        }
        if (interfaceC466370IQpLJJIJIL.Eq().mRoomsData.isSubOnlyLive == 1) {
            C827750WdZ.LIZ("MultiPlayerPrePullStream", "stop mMultiPlayerPrePullStream due to sub-only-live");
            return;
        }
        if (LiveReleasePlayerExp.isEnable() && interfaceC466370IQpLJJIJIL.bl()) {
            this.LLJJIJIL = i;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isPlayerFastStop，try multiPlayerPrePullTargetFragment start pull stream ~~~~~~~ (");
            sbLIZ2.append(i);
            sbLIZ2.append(")");
            C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC466370IQpLJJIJIL.Eq().mRoomsData.enterRoomScene = "inner_draw";
            interfaceC466370IQpLJJIJIL.UP(i2, i3, z, z2);
            if (!LiveSurfaceNewVersionSetting.INSTANCE.getEnable()) {
                interfaceC466370IQpLJJIJIL.wA(C0IHD.LIZ(interfaceC466370IQpLJJIJIL, "multiPlayerPrePullTargetFragment"));
            }
        }
        if (this.LLJJIII.get(i)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("mMultiPlayerPrePullStreamState --->  has pre pull, target position: (");
            sbLIZ3.append(i);
            sbLIZ3.append(")");
            C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        this.LLJJIII.put(i, true);
        C0IEB c0iebLIZJ = LIZJ(i);
        if (c0iebLIZJ != null && c0iebLIZJ.isPlaying()) {
            return;
        }
        this.LLJJIJIL = i;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("multiPlayerPrePullTargetFragment start pull stream ~~~~~~~ (");
        sbLIZ4.append(i);
        sbLIZ4.append(")");
        C827750WdZ.LIZ("MultiPlayerPrePullStream", C2188811AlT.LIZIZ(sbLIZ4));
        interfaceC466370IQpLJJIJIL.Eq().mRoomsData.enterRoomScene = "inner_draw";
        if (enterRoomLinkSession == null) {
            if (LivePlayerSessionIdSetting.INSTANCE.allowCompactLogicOfSessionId()) {
                if (((ConcurrentHashMap) this.LLJJIJIIJIL).containsKey(String.valueOf(i))) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("setBizSessionId: preCreateEnterRoomLinkSession ");
                    sbLIZ5.append(i);
                    sbLIZ5.append(" has already been put");
                    C827750WdZ.LIZ("LiveRoomFragment", C2188811AlT.LIZIZ(sbLIZ5));
                } else {
                    EnterRoomLinkSession enterRoomLinkSession2 = new EnterRoomLinkSession(interfaceC466370IQpLJJIJIL.Eq());
                    C0IL2.LIZ.getClass();
                    ((ConcurrentHashMap) this.LLJJIJIIJIL).put(String.valueOf(i), enterRoomLinkSession2);
                }
            } else {
                C827750WdZ.LIZ("LiveRoomFragment", "setBizSessionId: preCreateEnterRoomLinkSession is return due to the switch is off.");
            }
        }
        interfaceC466370IQpLJJIJIL.UP(i2, i3, z, z2);
        if (!LiveSurfaceNewVersionSetting.INSTANCE.getEnable()) {
            interfaceC466370IQpLJJIJIL.wA(C0IHD.LIZ(interfaceC466370IQpLJJIJIL, "multiPlayerPrePullTargetFragment"));
        }
    }
}
