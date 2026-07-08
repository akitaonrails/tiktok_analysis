package X;

import Y.AfS143S0200000_7;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.reddot.RedDotManager$observeLifeCycle$1;
import com.bytedance.android.live.uikit.reddot.RedDotStatusChangeEvent;
import com.bytedance.android.live.uikit.setting.LiveRedDotManagerReEntryExp;
import com.bytedance.android.live.uikit.uisetting.MessageNotifyConfig;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveMessagePlatformCommonPreferenceRedDotSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Un7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782710Un7 {
    public static boolean LJ;
    public static C0UX8 LJFF;
    public static C11JF LJIILIIL;
    public static C0UX6 LJIILL;
    public static AnonymousClass0956 LJIJI;
    public static AnonymousClass0956 LJIJJ;
    public static final C782710Un7 LIZ = new C782710Un7();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static List<? extends C0UX6> LJI = C13BV.INSTANCE;
    public static final List<C0UX6> LJII = new ArrayList();
    public static final HashMap<C0UX8, C782780UnE> LJIIIIZZ = new HashMap<>();
    public static final boolean LJIIIZ = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).isNewUser();
    public static final int LJIIJ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getShortVersionCode();
    public static final SpannableStringBuilder LJIIJJI = new SpannableStringBuilder();
    public static final boolean LJIIL = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    public static final HashSet<C0UX6> LJIILJJIL = new HashSet<>();
    public static final HashSet<C0UX6> LJIILLIIL = new HashSet<>();
    public static final HashSet<String> LJIIZILJ = new HashSet<>();
    public static final HashMap<String, Set<String>> LJIJ = new HashMap<>();

    public static void LJIILJJIL() {
        C11JF c11jf = LJIILIIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LJIILIIL = null;
        AnonymousClass0956 anonymousClass0956 = LJIJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = LJIJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        LJIILJJIL.clear();
        LJIJ.clear();
        LJIILLIIL.clear();
        LJIILL = null;
    }

    public static HashSet LJII(C782710Un7 c782710Un7) {
        C0UX8 c0ux8 = LJFF;
        c782710Un7.getClass();
        C782780UnE c782780UnE = LJIIIIZZ.get(c0ux8);
        if (c782780UnE != null) {
            return c782780UnE.LIZIZ;
        }
        return null;
    }

    public static ConcurrentHashMap LJIIIIZZ(C782710Un7 c782710Un7) {
        C0UX8 c0ux8 = LJFF;
        c782710Un7.getClass();
        C782780UnE c782780UnE = LJIIIIZZ.get(c0ux8);
        if (c782780UnE != null) {
            return c782780UnE.LIZ;
        }
        return null;
    }

    public static DataChannel LJIIIZ(C782710Un7 c782710Un7) {
        C0UX8 c0ux8 = LJFF;
        c782710Un7.getClass();
        C782780UnE c782780UnE = LJIIIIZZ.get(c0ux8);
        if (c782780UnE != null) {
            return c782780UnE.LIZJ;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if ((r2 - r0) < (r5 * 100)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C0UX6 r7) {
        /*
            r6 = this;
            com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig r0 = r7.getLiveMessagePlatformRedDotConfig()
            int r5 = r0.lifetime
            boolean r0 = X.C782710Un7.LJIIL
            if (r0 == 0) goto L36
            X.14i1<com.bytedance.android.livesdk.model.LiveRedDotDebugConfig> r2 = X.InterfaceC1106030et7.Y6
            java.lang.Object r0 = r2.LIZIZ()
            com.bytedance.android.livesdk.model.LiveRedDotDebugConfig r0 = (com.bytedance.android.livesdk.model.LiveRedDotDebugConfig) r0
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.debugVersionLifeTimes
            java.lang.String r0 = r7.getCurrentId()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L36
            java.lang.Object r0 = r2.LIZIZ()
            com.bytedance.android.livesdk.model.LiveRedDotDebugConfig r0 = (com.bytedance.android.livesdk.model.LiveRedDotDebugConfig) r0
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.debugVersionLifeTimes
            java.lang.String r0 = r7.getCurrentId()
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L36
            int r5 = r0.intValue()
        L36:
            r4 = 1
            if (r5 == 0) goto L7e
            X.14i1<java.util.Map<java.lang.String, java.lang.String>> r3 = X.InterfaceC1106030et7.T6
            java.lang.Object r1 = r3.LIZIZ()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r7.getCurrentId()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L7e
            java.lang.Object r1 = r3.LIZIZ()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r7.getCurrentId()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L81
            int r2 = X.C782710Un7.LJIIJ
            java.lang.Object r1 = r3.LIZIZ()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r7.getCurrentId()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L7f
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L7f
            int r0 = r0.intValue()
        L79:
            int r2 = r2 - r0
            int r0 = r5 * 100
            if (r2 >= r0) goto L81
        L7e:
            return r4
        L7f:
            r0 = 0
            goto L79
        L81:
            r2 = 0
            java.lang.String r1 = "show failed, life_time has expired"
            java.lang.String r0 = "INTERCEPT"
            r6.getClass()
            LJFF(r7, r1, r0, r2)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C782710Un7.LIZ(X.0UX6):boolean");
    }

    public final boolean LIZIZ(C0UX6 c0ux6) {
        if ((LJIIL && InterfaceC1106030et7.Y6.LIZIZ().closeNewUser.contains(c0ux6.getCurrentId())) || !LJIIIZ || (!c0ux6.getLiveMessagePlatformRedDotConfig().newUserBlock && c0ux6.getLiveMessagePlatformRedDotConfig().priority == EnumC12977055z.PRIORITY_MUST_SHOW.getPriority())) {
            return true;
        }
        getClass();
        LJFF(c0ux6, "show failed, current user is New User", "INTERCEPT", null);
        return false;
    }

    public final boolean LIZJ(C0UX6 c0ux6) {
        if (!InterfaceC1106030et7.U6.LIZIZ().contains(c0ux6.getCurrentId())) {
            return true;
        }
        getClass();
        LJFF(c0ux6, "show failed, has consumed", "INTERCEPT", null);
        return false;
    }

    public final boolean LIZLLL(C0UX6 c0ux6) {
        if (c0ux6.isValid() && LiveMessagePlatformCommonPreferenceRedDotSetting.INSTANCE.getValue(c0ux6) != null) {
            return true;
        }
        getClass();
        LJFF(c0ux6, "show failed, invalid", "INTERCEPT", null);
        return false;
    }

    public final void LJIIJ(C0UX6 c0ux6) {
        C782780UnE c782780UnE;
        DataChannel dataChannelLJIIIZ = LJIIIZ(LIZ);
        if (dataChannelLJIIIZ != null) {
            dataChannelLJIIIZ.LC0(RedDotStatusChangeEvent.class, new C782820UnI(c0ux6, false));
        }
        LJIILJJIL.remove(c0ux6);
        if (!c0ux6.isAssetsRedDot() && c0ux6.getLiveMessagePlatformRedDotConfig().priority > 0 && LJIILL != c0ux6 && (c782780UnE = LJIIIIZZ.get(LJFF)) != null) {
            c782780UnE.LIZLLL = c0ux6;
        }
        for (C0UX6 c0ux62 : C0UX6.values()) {
            List<String> list = c0ux6.getLiveMessagePlatformRedDotConfig().outLayerList;
            if (list != null && list.contains(c0ux62.getCurrentId())) {
                DataChannel dataChannelLJIIIZ2 = LJIIIZ(LIZ);
                if (dataChannelLJIIIZ2 != null) {
                    dataChannelLJIIIZ2.LC0(RedDotStatusChangeEvent.class, new C782820UnI(c0ux62, false));
                }
                LJIILJJIL.remove(c0ux62);
            }
        }
        if (LJIIL) {
            getClass();
            LJFF(c0ux6, "hide", "DISMISS", null);
        }
    }

    public static void LJ(C782710Un7 c782710Un7, LifecycleOwner lifecycleOwner) {
        LifecycleCoroutineScope lifecycleScope;
        c782710Un7.getClass();
        if (!LJI.isEmpty()) {
            AnonymousClass0956 anonymousClass0956 = LJIJI;
            AnonymousClass0956 anonymousClass0956LIZLLL = null;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C01W4(false, null), 3);
            }
            LJIJI = anonymousClass0956LIZLLL;
        }
    }

    public static void LJIIL(C0UX8 c0ux8, DataChannel dataChannel) {
        Room room;
        long id;
        HashMap<C0UX8, C782780UnE> map = LJIIIIZZ;
        if (map.get(c0ux8) == null) {
            map.put(c0ux8, new C782780UnE());
        }
        C782780UnE c782780UnE = map.get(c0ux8);
        if (c782780UnE != null) {
            c782780UnE.LIZJ = dataChannel;
            c782780UnE.LIZ.clear();
            c782780UnE.LIZIZ.clear();
        }
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            LIZIZ = String.valueOf(room.getId());
            User owner = room.getOwner();
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            LIZJ = String.valueOf(id);
            LIZLLL = C354201Zc.LIZ(room.getStreamType());
        }
    }

    public static void LJIILIIL(C0UX8 c0ux8, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        Map<String, LiveMessagePlatformRedDotConfig> map;
        Set<Map.Entry<String, LiveMessagePlatformRedDotConfig>> setEntrySet;
        String strLIZIZ;
        ((ArrayList) LJII).clear();
        C0UX6[] c0ux6ArrValues = C0UX6.values();
        ArrayList arrayList = new ArrayList();
        for (C0UX6 c0ux6 : c0ux6ArrValues) {
            if (c0ux6.isGuide()) {
                ((ArrayList) LJII).add(c0ux6);
            }
            if (C13LQ.LJIILLIIL(LJFF, c0ux6.getLivePage()) && LiveMessagePlatformCommonPreferenceRedDotSetting.INSTANCE.getValue(c0ux6) != null) {
                arrayList.add(c0ux6);
            } else {
                C782710Un7 c782710Un7 = LIZ;
                if (!C13LQ.LJIILLIIL(LJFF, c0ux6.getLivePage())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("show failed, page error, current page is ");
                    sbLIZ.append(c0ux8);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "show failed, redDot not setting on msg notify plat";
                }
                c782710Un7.getClass();
                LJFF(c0ux6, strLIZIZ, "INTERCEPT", null);
            }
        }
        LJI = arrayList;
        if (LJIIL) {
            LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
            MessageNotifyConfig messageNotifyConfigLIZ = C782850UnL.LIZ();
            if (messageNotifyConfigLIZ != null && (map = messageNotifyConfigLIZ.filteredRedDotConfig) != null && (setEntrySet = map.entrySet()) != null) {
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    C782710Un7 c782710Un72 = LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("redDot is filter by server, reason is ");
                    sbLIZ2.append(((LiveMessagePlatformRedDotConfig) entry.getValue()).filterReason);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    String str = (String) entry.getKey();
                    c782710Un72.getClass();
                    LJFF(null, strLIZIZ2, "SERVER FILTER", str);
                }
            }
        }
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new RedDotManager$observeLifeCycle$1(lifecycleOwner));
        }
    }

    public static void LJIIJJI(LifecycleOwner lifecycleOwner, C0UX8 c0ux8, DataChannel dataChannel) {
        if (LiveRedDotManagerReEntryExp.INSTANCE.enable() && LJFF == c0ux8) {
            return;
        }
        LJFF = c0ux8;
        for (C0UX6 c0ux6 : C0UX6.values()) {
            c0ux6.reset();
        }
        C20441214yg.LJ("[Message]", "redDotManager init");
        SpannableStringBuilder spannableStringBuilder = LJIIJJI;
        spannableStringBuilder.delete(0, spannableStringBuilder.length());
        LJIILJJIL();
        LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
        LJIILIIL = (C11JF) C782850UnL.LJ().LJJLL(new AfS143S0200000_7((Object) c0ux8, (EmoteModel) lifecycleOwner, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 1), new AfS143S0200000_7((Object) c0ux8, (EmoteModel) lifecycleOwner, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 2));
        LJIIL(c0ux8, dataChannel);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C0UX6 r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = X.C782710Un7.LJIIL
            if (r0 == 0) goto Lb0
            if (r9 != 0) goto L18
            if (r6 == 0) goto Lbd
            java.lang.String r0 = r6.getCurrentId()
            if (r0 == 0) goto Lb1
            int r0 = r0.length()
            if (r0 <= 0) goto Lb1
            java.lang.String r9 = r6.getCurrentId()
        L18:
            java.lang.String r5 = java.lang.String.valueOf(r9)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = X.C963140bAe.LJFF(r0)
            r2.append(r0)
            java.lang.String r0 = "::"
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            android.text.SpannableStringBuilder r6 = X.C782710Un7.LJIIJJI
            r6.append(r0)
            int r3 = r6.length()
            android.text.SpannableStringBuilder r2 = r6.append(r5)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r0 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r1.<init>(r0)
            int r0 = r5.length()
            int r0 = r0 + r3
            r4 = 33
            X.C786410Ut5.q2(r2, r1, r3, r0, r4)
            java.lang.String r0 = " "
            r6.append(r0)
            int r3 = r6.length()
            android.text.SpannableStringBuilder r2 = r6.append(r8)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r1.<init>(r0)
            int r0 = r8.length()
            int r0 = r0 + r3
            X.C786410Ut5.q2(r2, r1, r3, r0, r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ":: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " \n\n"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r6.append(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[RedDotDebug] ["
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "], from="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", info=["
            r1.append(r0)
            r1.append(r7)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZ(r0)
        Lb0:
            return
        Lb1:
            java.lang.String[] r0 = r6.getIds()
            if (r0 == 0) goto Lbd
            java.util.List r9 = java.util.Arrays.asList(r0)
            if (r9 != 0) goto L18
        Lbd:
            java.lang.String r9 = ""
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C782710Un7.LJFF(X.0UX6, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
