package X;

import android.widget.FrameLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zE1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887790zE1 implements C188U, InterfaceC1141530foN {
    public FrameLayout LL;
    public LiveRoomStruct LLILLJJLI;
    public Function2<? super Map<String, String>, ? super String, Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public Function0<? extends PageFinder> LLILZLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(617));

    @Override // X.C188U
    public final void LIZIZ() {
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLIZ = null;
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZLLLIL = null;
        FrameLayout frameLayout2 = this.LL;
        if (frameLayout2 != null) {
            C786410Ut5.LJLLLLLL(8, frameLayout2);
        }
        LIZLLL("StepCardDisappear", new JSONObject());
    }

    @Override // X.C188U
    public final void onDestroy() {
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLIZ = null;
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZLLLIL = null;
        C1548820qPI.LJIIIIZZ("ttls_live_feed_product_card_sync", this);
        this.LLJ = false;
        LIZLLL("StepCardDestroy", new JSONObject());
    }

    public static String LIZJ(Aweme aweme) {
        List<LiveRoomStatesTag> liveExtraInfoStruct;
        LiveRoomStatesTag next;
        String str;
        Integer numLJIIJJI;
        String string;
        if (aweme != null && (liveExtraInfoStruct = aweme.getLiveExtraInfoStruct()) != null) {
            Iterator<LiveRoomStatesTag> it2 = liveExtraInfoStruct.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.tagKey, "chandler_liveboost_type")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LiveRoomStatesTag liveRoomStatesTag = next;
            if (liveRoomStatesTag != null && (str = liveRoomStatesTag.tagValue) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && (string = Integer.valueOf(numLJIIJJI.intValue() + 1).toString()) != null) {
                return string;
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttls_live_feed_product_card_sync")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String string2 = null;
            if (interfaceC1107590evd != null) {
                string = interfaceC1107590evd.getString("unique_id");
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(string, this.LLJI.getValue())) {
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null) {
                    string2 = interfaceC1107590evd2.getString("action_type");
                }
                C742170T9j.LIZ(new AwS143S1200000_28(string2, c262100zr, this, 11));
            }
        }
    }

    @Override // X.C188U
    public final void LIZ(Aweme aweme, LiveRoomStruct liveRoomStruct) {
        this.LLILLJJLI = liveRoomStruct;
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZLLL("StepRequestCardData", new JSONObject());
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLIZLLLIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1892290zLH(this, liveRoomStruct, aweme, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[PHI: r2
      0x000d: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:7:0x000b, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r4.LLILLJJLI
            java.lang.String r3 = ""
            if (r0 == 0) goto La
            java.lang.String r2 = r0.idStr
            if (r2 != 0) goto Ld
        La:
            r2 = r3
            if (r0 == 0) goto L1c
        Ld:
            long r0 = r0.getAnchorId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L1c
            r3 = r0
        L1c:
            java.lang.String r0 = "ttls_rd_live_preview_pin_card_step_event"
            X.C1892660zLs.LIZ(r0, r6, r5, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1887790zE1.LIZLLL(java.lang.String, org.json.JSONObject):void");
    }
}
