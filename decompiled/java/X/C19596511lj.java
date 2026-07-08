package X;

import android.view.View;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19596511lj extends C09AY implements Function1<C451220Hmi, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C19625211qM LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ Map<Integer, InterfaceC19578611iq> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19596511lj(int i, C19625211qM c19625211qM, boolean z, C013C c013c, Map<Integer, ? extends InterfaceC19578611iq> map, boolean z2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c19625211qM;
        this.LLILLL = z;
        this.LLILZ = c013c;
        this.LLILZIL = map;
        this.LLILZLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C451220Hmi c451220Hmi) {
        C450820Hm4 c450820Hm4 = new C450820Hm4();
        int i = this.LL;
        final C19625211qM c19625211qM = this.LLILLJJLI;
        final boolean z = this.LLILLL;
        final C013C c013c = this.LLILZ;
        final Map<Integer, InterfaceC19578611iq> map = this.LLILZIL;
        final boolean z2 = this.LLILZLL;
        c450820Hm4.LIZIZ = i;
        c450820Hm4.LIZLLL = new View.OnClickListener() { // from class: X.11pQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                InterfaceC2175461ACa interfaceC2175461ACaLJIJJ;
                String string2;
                InterfaceC2175461ACa interfaceC2175461ACaLJIJJ2;
                String string3;
                InterfaceC2175461ACa interfaceC2175461ACaLJIJJ3;
                C20441214yg.LIZIZ("LiveShareSticker", "click tooltips");
                C0P0T tuxActionTooltip = c19625211qM.getTuxActionTooltip();
                if (tuxActionTooltip != null) {
                    tuxActionTooltip.dismiss();
                }
                C19625211qM c19625211qM2 = c19625211qM;
                boolean z3 = z;
                NewLiveRoomStruct newLiveRoomStruct = c19625211qM2.LLJJJJLIIL;
                Boolean boolValueOf = Boolean.valueOf(c013c.element);
                boolean zBooleanValue = true;
                if (c19625211qM2.getContext().getResources().getConfiguration().orientation == 2) {
                    C766270U4b.LJFF(2131851154, c19625211qM2.getContext());
                } else if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    enterRoomConfig.mRoomsData.fromNewStyle = true;
                    EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                    logData.toplivePosition = "top_left";
                    logData.topliveHomepageType = "homepage_hot";
                    logData.fromTopliveGuide = C486660J6q.LIZJ();
                    enterRoomConfig.mLogData.fromFollowRelationShipTopliveGuide = C486660J6q.LIZIZ();
                    enterRoomConfig.mLogData.topliveEnterTimestamp = String.valueOf(System.currentTimeMillis());
                    C486660J6q.LJII("story_live", c19625211qM2.getEnterMethod());
                    C0J5O c0j5oZ5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5();
                    c19625211qM2.getContext();
                    c0j5oZ5.LJII(enterRoomConfig, "homepage_hot");
                } else {
                    EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
                    roomsData.enterFromMerge = "story_live";
                    roomsData.enterMethod = c19625211qM2.getEnterMethod();
                    if (z3) {
                        enterRoomConfig2.mRoomsData.shareIntent = "multi_live_open_from_story";
                    }
                    enterRoomConfig2.mRoomsData.shareSource = "share_to_story";
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LIZIZ(c19625211qM2.getContext(), newLiveRoomStruct, enterRoomConfig2);
                }
                InterfaceC19578611iq interfaceC19578611iq = map.get(107);
                if (interfaceC19578611iq != null) {
                    interfaceC19578611iq.onClick(c19625211qM.getStruct());
                }
                if (!z2) {
                    int iLJJII = 0;
                    String string4 = null;
                    if (c013c.element) {
                        Long l = c19625211qM.LLJJIII;
                        if (l != null) {
                            string3 = l.toString();
                        } else {
                            string3 = null;
                        }
                        LiveRoomStruct liveRoomStruct = c19625211qM.LLJJJJJIL;
                        if (liveRoomStruct != null) {
                            string4 = Long.valueOf(liveRoomStruct.getAnchorId()).toString();
                        }
                        C19625211qM c19625211qM3 = c19625211qM;
                        String str = c19625211qM3.LLJJIJIIJIL;
                        Boolean bool = c19625211qM3.LLJJJIL;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        C1ACD c1acd = c19625211qM.LLJJI;
                        if (c1acd != null && (interfaceC2175461ACaLJIJJ3 = c1acd.LJIJJ()) != null) {
                            iLJJII = interfaceC2175461ACaLJIJJ3.LJJII();
                        }
                        C486660J6q.LJIILIIL(iLJJII, string3, string4, str, "discover_pop_click", zBooleanValue);
                        return;
                    }
                    if (z) {
                        Long l2 = c19625211qM.LLJJIII;
                        if (l2 != null) {
                            string2 = l2.toString();
                        } else {
                            string2 = null;
                        }
                        LiveRoomStruct liveRoomStruct2 = c19625211qM.LLJJJJJIL;
                        if (liveRoomStruct2 != null) {
                            string4 = Long.valueOf(liveRoomStruct2.getAnchorId()).toString();
                        }
                        C19625211qM c19625211qM4 = c19625211qM;
                        String str2 = c19625211qM4.LLJJIJIIJIL;
                        Boolean bool2 = c19625211qM4.LLJJJIL;
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        }
                        C1ACD c1acd2 = c19625211qM.LLJJI;
                        if (c1acd2 != null && (interfaceC2175461ACaLJIJJ2 = c1acd2.LJIJJ()) != null) {
                            iLJJII = interfaceC2175461ACaLJIJJ2.LJJII();
                        }
                        C486660J6q.LJIILIIL(iLJJII, string2, string4, str2, "guest_pop_click", zBooleanValue);
                        return;
                    }
                    Long l3 = c19625211qM.LLJJIII;
                    if (l3 != null) {
                        string = l3.toString();
                    } else {
                        string = null;
                    }
                    LiveRoomStruct liveRoomStruct3 = c19625211qM.LLJJJJJIL;
                    if (liveRoomStruct3 != null) {
                        string4 = Long.valueOf(liveRoomStruct3.getAnchorId()).toString();
                    }
                    C19625211qM c19625211qM5 = c19625211qM;
                    String str3 = c19625211qM5.LLJJIJIIJIL;
                    Boolean bool3 = c19625211qM5.LLJJJIL;
                    if (bool3 != null) {
                        zBooleanValue = bool3.booleanValue();
                    }
                    C1ACD c1acd3 = c19625211qM.LLJJI;
                    if (c1acd3 != null && (interfaceC2175461ACaLJIJJ = c1acd3.LJIJJ()) != null) {
                        iLJJII = interfaceC2175461ACaLJIJJ.LJJII();
                    }
                    C486660J6q.LJIILIIL(iLJJII, string, string4, str3, "watch_pop_click", zBooleanValue);
                }
            }
        };
        c451220Hmi.LIZ(c450820Hm4);
        return Unit.LIZ;
    }
}
