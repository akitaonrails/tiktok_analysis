package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06HD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06HD implements C06F6, C06C8, InterfaceC1572006Dm {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final FrameLayout LL;
    public final Context LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC1575606Ew LLILZ;
    public final String LLILZIL;
    public volatile StreakData LLILZLL;
    public volatile EnumC1579606Gk LLIZ;
    public volatile StreakPetData LLIZLLLIL;
    public volatile boolean LLJ;
    public final AtomicBoolean LLJI;
    public final AtomicInteger LLJIJIL;
    public volatile C1580106Gp LLJILJIL;
    public volatile boolean LLJILJILJ;
    public volatile boolean LLJILLL;
    public volatile SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJ;
    public boolean LLJJI;
    public final C054G LLJJIII;
    public final C1DEV LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public C384150F4j LLJJIJIL;
    public final AtomicBoolean LLJJJ;
    public long LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public volatile C1598406Nq LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06HD.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
    }

    public final C1598406Nq LIZLLL() {
        C1598406Nq c1598406Nq = this.LLJJLIIIJLLLLLLLZ;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLJJLIIIJLLLLLLLZ;
                if (c1598406Nq == null) {
                    C1598406Nq c1598406Nq2 = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLJJLIIIJLLLLLLLZ = c1598406Nq2;
                    return c1598406Nq2;
                }
            }
        }
        return c1598406Nq;
    }

    public final void LJIIIZ() {
        String str;
        C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
        String str2 = this.LLILLL;
        c1575806Ey.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str2);
        C06C6 c06c6 = C06C6.LIZIZ;
        String str3 = this.LLILLL;
        c06c6.getClass();
        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str3);
        if (C06BV.LIZIZ(streakDataLJIIIIZZ, streakPetDataLIZIZ, this.LLILLL) && !this.LLJI.getAndSet(true)) {
            this.LLJJJIL = System.currentTimeMillis();
            boolean z = C1590806Ks.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakPetWidget tryCreateWidgetSparkView init data ");
            sbLIZ.append(streakDataLJIIIIZZ != null ? C1567806Bw.LJIIIIZZ(streakDataLJIIIIZZ, false) : null);
            sbLIZ.append(' ');
            sbLIZ.append(streakPetDataLIZIZ);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            LJIIJJI(streakDataLJIIIIZZ);
            LJIIL(streakPetDataLIZIZ);
            int iLIZ = streakPetDataLIZIZ != null ? C06DJ.LIZ(this.LLILLL, streakPetDataLIZIZ, null, streakDataLJIIIIZZ) : 1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("StreakPetWidget tryCreateWidgetSparkView animationType=");
            switch (iLIZ) {
                case 1:
                    str = "Normal";
                    break;
                case 2:
                    str = "Change";
                    break;
                case 3:
                    str = "Exit";
                    break;
                case 4:
                    str = "Upgrade";
                    break;
                case 5:
                    str = "Enter";
                    break;
                case 6:
                    str = "HatchingUpgrade";
                    break;
                default:
                    str = "Other";
                    break;
            }
            sbLIZ2.append(str);
            sbLIZ2.append(' ');
            sbLIZ2.append(streakDataLJIIIIZZ != null ? C1567806Bw.LJIIIIZZ(streakDataLJIIIIZZ, false) : null);
            sbLIZ2.append(' ');
            sbLIZ2.append(streakPetDataLIZIZ);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            C23250099c.LIZLLL(this.LLJJIII, LIZLLL().LIZIZ, null, new C06HE(this, streakDataLJIIIIZZ, streakPetDataLIZIZ, iLIZ, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06HD.LJII():void");
    }

    @Override // X.InterfaceC1572006Dm
    public final void LIZ(String str) {
        if (!Intrinsics.LJFF(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId(), str)) {
            return;
        }
        C23250099c.LIZLLL(this.LLJJIII, null, null, new C06HJ(this, null), 3);
    }

    @Override // X.InterfaceC1572006Dm
    public final void LIZIZ(String str) {
        if (!Intrinsics.LJFF(this.LLILLL, str)) {
            return;
        }
        C23250099c.LIZLLL(this.LLJJIII, null, null, new C06HI(this, str, null), 3);
    }

    public final void LJI(boolean z) {
        C23250099c.LIZLLL(this.LLJJIII, LIZLLL().LIZIZ, null, new C1575506Ev(this, null, z), 2);
    }

    public final void LJIIJJI(StreakData streakData) {
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        this.LLILZLL = streakData;
        if (streakData != null) {
            enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData, false);
        } else {
            enumC1579606GkLJIIIIZZ = null;
        }
        this.LLIZ = enumC1579606GkLJIIIIZZ;
    }

    public final void LJIIL(StreakPetData streakPetData) {
        this.LLIZLLLIL = streakPetData;
        C23250099c.LIZLLL(this.LLJJIII, LIZLLL().LIZIZ, null, new C1575706Ex(streakPetData, this, null), 2);
    }

    @Override // X.C06C8
    public final void Ro1(String str) {
        if (!Intrinsics.LJFF(this.LLILLL, str)) {
            return;
        }
        C23250099c.LIZLLL(this.LLJJIII, null, null, new C06HN(this, null), 3);
    }

    public static boolean LJ(StreakPetData streakPetData, StreakPetData streakPetData2) {
        if (streakPetData == null || streakPetData.isHidden != streakPetData2.isHidden || streakPetData.isEggHidden != streakPetData2.isEggHidden || streakPetData.status != streakPetData2.status || streakPetData.subStatus != streakPetData2.subStatus || streakPetData.experiencePoints != streakPetData2.experiencePoints || C1571306Df.LIZ(streakPetData) != C1571306Df.LIZ(streakPetData2) || streakPetData.hatchingTimestampInSeconds != streakPetData2.hatchingTimestampInSeconds || !Intrinsics.LJFF(streakPetData.feCommonData, streakPetData2.feCommonData) || !Intrinsics.LJFF(streakPetData.feExtraData, streakPetData2.feExtraData) || !Intrinsics.LJFF(streakPetData.petFeUserData, streakPetData2.petFeUserData) || !Intrinsics.LJFF(streakPetData.serverDataVersion, streakPetData2.serverDataVersion)) {
            return true;
        }
        return false;
    }

    public final void LJFF(boolean z, boolean z2) {
        boolean z3 = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPWidget notifyWidgetAttachStatus ");
        sbLIZ.append(z);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIJIL != null) {
            return;
        }
        this.LLJILJILJ = z;
        if (!z) {
            return;
        }
        this.LLJILLL = z2;
        C23250099c.LIZLLL(this.LLJJIII, null, null, new C06HK(this, null, z2), 3);
    }

    public final void LJIIIIZZ(boolean z, boolean z2) {
        if (this.LLJJJ.getAndSet(true)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJJIL;
        C066K c066k = C066K.LIZIZ;
        String str = this.LLILLL;
        C06I0.LIZIZ.getClass();
        boolean z3 = C06I0.LJIIJJI;
        boolean z4 = C06I0.LJIIL;
        StreakPetData streakPetData = this.LLIZLLLIL;
        StreakData streakData = this.LLILZLL;
        C0I0B.LJFF.LIZIZ();
        c066k.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("conversation_id", str), new Pair("conversation_type", String.valueOf(C1567806Bw.LIZIZ(str))), new Pair("is_first_show", C066K.LIZ(false)), new Pair("is_widget_resource_ready", C066K.LIZ(z4)), new Pair("is_widget_template_ready", C066K.LIZ(z3)), new Pair("latency", String.valueOf(jCurrentTimeMillis)), new Pair("is_success", C066K.LIZ(z)), new Pair("is_show_fallback", C066K.LIZ(z2)));
        if (streakPetData != null) {
            mapLJIIJ.put("pet_status", String.valueOf(streakPetData.status));
            mapLJIIJ.put("pet_level", String.valueOf(C1571306Df.LIZ(streakPetData)));
        }
        mapLJIIJ.put("pet_type", C1567906Bx.LIZJ(streakPetData));
        if (streakData != null) {
            mapLJIIJ.put("streak_status", String.valueOf(C1567806Bw.LJIIIIZZ(streakData, false).ordinal()));
        }
        C20684815ws.LJIILLIIL("show_streak_pet_widget", mapLJIIJ);
    }

    public final void LJIIJ(EnumC1579606Gk enumC1579606Gk, StreakPetData streakPetData) {
        C23250099c.LIZLLL(this.LLJJIII, LIZLLL().LIZIZ, null, new C06HC(this, enumC1579606Gk, streakPetData, null), 2);
    }

    @Override // X.C06F6
    public final void r80(StreakData streakData, String str) {
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPWidget onUpdate ");
        sbLIZ.append(streakData);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(this.LLILLL, str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SPWidget onUpdate skip diff convId ");
            sbLIZ2.append(str);
            sbLIZ2.append(" conversationId ");
            sbLIZ2.append(this.LLILLL);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C23250099c.LIZLLL(this.LLJJIII, null, null, new C06HF(this, streakData, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1580106Gp LIZJ(com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r15, X.EnumC1579606Gk r16, com.ss.android.ugc.aweme.im.streak.api.StreakData r17) {
        /*
            r14 = this;
            java.lang.String r0 = r14.LLILLL
            r2 = r17
            r4 = r15
            r1 = r16
            int r1 = X.C06DJ.LIZ(r0, r4, r1, r2)
            X.06Gp r3 = new X.06Gp
            r0 = 0
            if (r2 == 0) goto L36
            X.06Gk r0 = X.C1567806Bw.LJIIIIZZ(r2, r0)
            if (r0 == 0) goto L36
            int r5 = r0.ordinal()
        L1a:
            long r6 = r2.restoreAvailableTime
            int r8 = r2.remainRestoreCnt
        L1e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r10 = r14.LLILLL
            boolean r11 = r14.LLJILLL
            java.util.concurrent.atomic.AtomicInteger r0 = r14.LLJIJIL
            int r12 = r0.getAndIncrement()
            if (r2 == 0) goto L34
            int r13 = r2.streak
        L30:
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r13)
            return r3
        L34:
            r13 = 0
            goto L30
        L36:
            r5 = 0
            if (r2 != 0) goto L1a
            r6 = 0
            r8 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06HD.LIZJ(com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData, X.06Gk, com.ss.android.ugc.aweme.im.streak.api.StreakData):X.06Gp");
    }

    @Override // X.C06C8
    public final void SI2(String str, StreakPetData streakPetData, StreakPetData streakPetData2) {
        if (!Intrinsics.LJFF(this.LLILLL, str)) {
            return;
        }
        C23250099c.LIZLLL(this.LLJJIII, null, null, new C06HG(this, streakPetData2, streakPetData, str, null), 3);
    }

    @Override // X.C06C8
    public final void wK0(String str, StreakExtension streakExtension, StreakPetData streakPetData) {
        if (!Intrinsics.LJFF(this.LLILLL, str)) {
            return;
        }
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStreakExtensionUpdate conversationId=");
        sbLIZ.append(str);
        sbLIZ.append(", shouldDisplayPromotionalWidget=");
        sbLIZ.append(streakExtension.shouldDisplayPromotionalWidget);
        sbLIZ.append(", newStreakPetData=");
        sbLIZ.append(streakPetData);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(this.LLJJIII, null, null, new C06HH(this, streakExtension, streakPetData, null), 3);
    }

    public C06HD(C06MJ c06mj, Context context, String str, C1589806Ki c1589806Ki) {
        String string = UUID.randomUUID().toString();
        this.LL = c06mj;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = c1589806Ki;
        this.LLILZIL = string;
        this.LLJI = new AtomicBoolean(false);
        this.LLJIJIL = new AtomicInteger(0);
        this.LLJILJILJ = true;
        this.LLJJIII = C2296808zG.LIZ(LIZLLL().LIZ.plus(C2296908zH.LIZ()));
        this.LLJJIJI = C2191201ApK.LIZ();
        this.LLJJJ = new AtomicBoolean(false);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1146));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1145));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1143));
        this.LLJJL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1144));
    }
}
