package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.setting.ab.TabCleanScoreParams;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rVY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591140rVY {
    public final C19EG LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public double LJFF;
    public long LJI;
    public double LJII;
    public long LJIIIIZZ;
    public boolean LJIIL;
    public long LJIILJJIL;
    public List<String> LJ = new ArrayList();
    public final Map<String, WeakReference<Fragment>> LJIIIZ = new LinkedHashMap();
    public final Map<String, C1591190rVd> LJIIJ = new LinkedHashMap();
    public final Map<String, C1157460gE4> LJIIJJI = new LinkedHashMap();
    public final Map<String, C09AE> LJIILIIL = new LinkedHashMap();
    public String LJIILL = "For You";
    public String LJIILLIIL = "HOME";
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(501));
    public final C01GW LJIJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(499));
    public final C01GW LJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1727));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1730));
    public final C01GW LJIJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1729));
    public final C01GW LJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1728));
    public final C01GW LJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(500));

    public final void LJIIJ() {
        this.LJII = C2367709Pn.LIZJ();
        long j = 1024;
        this.LJIIIIZZ = (C2367709Pn.LIZLLL() / j) / j;
        ArrayList arrayList = new ArrayList();
        for (String str : this.LJ) {
            Reference reference = (Reference) ((LinkedHashMap) this.LJIIIZ).get(str);
            if (reference != null && reference.get() != null) {
                arrayList.add(str);
            }
        }
        C1591160rVa c1591160rVa = C1591160rVa.LIZ;
        double d = this.LJFF;
        double d2 = this.LJII;
        long j2 = this.LJI;
        long j3 = this.LJIIIIZZ;
        int i = this.LIZLLL;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJLLJ(this.LJ), ",", null, null, 0, null, null, 62);
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(C13LP.LJLLJ(arrayList), ",", null, null, 0, null, null, 62);
        c1591160rVa.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("start_memory_rate", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)));
        c2344009Gk.LJIIIIZZ("end_memory_rate", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)));
        c2344009Gk.LIZLLL(j2, "start_memory_size");
        c2344009Gk.LIZLLL(j3, "end_memory_size");
        c2344009Gk.LIZJ(i, "clean_count");
        c2344009Gk.LJIIIIZZ("try_clean_tab", strLJJLIIIJ);
        c2344009Gk.LJIIIIZZ("leaked_tabs", strLJJLIIIJ2);
        c2344009Gk.LJIIIIZZ("decrease_memory_rate", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d - d2)}, 1)));
        c2344009Gk.LIZLLL(j2 - j3, "decrease_memory_size");
        c2344009Gk.LJ(Boolean.valueOf(C1591220rVg.LIZ()), "real_clean_tab");
        C20684815ws.LJIILLIIL("tab_memory_clean_status", c2344009Gk.LIZ);
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LJ.clear();
    }

    public C1591140rVY(C19EG c19eg) {
        this.LIZ = c19eg;
    }

    public final float LIZIZ(C1591190rVd c1591190rVd) {
        float f;
        float f2 = 0.0f;
        if (!C1591220rVg.LIZJ().advanced.enableSolaria) {
            return 0.0f;
        }
        long jCurrentTimeMillis = c1591190rVd.LIZLLL;
        if (jCurrentTimeMillis == -1) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long jCurrentTimeMillis2 = (System.currentTimeMillis() - jCurrentTimeMillis) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C01GW c01gw = C1591180rVc.LIZIZ;
        float fExp = (float) Math.exp((-((TabCleanScoreParams) c01gw.getValue()).idleCoefficient) * jCurrentTimeMillis2);
        if (LJFF(c1591190rVd)) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (C1591220rVg.LIZJ().advanced.enableSolaria) {
            if (c1591190rVd.LIZJ == 0) {
                c1591190rVd.LIZJ = LJI(c1591190rVd.LIZ);
            }
            f2 = c1591190rVd.LIZJ / ((TabCleanScoreParams) c01gw.getValue()).solariaMax;
        }
        TabCleanScoreParams tabCleanScoreParams = (TabCleanScoreParams) c01gw.getValue();
        return (tabCleanScoreParams.idleWeight * fExp) + (tabCleanScoreParams.unreadWeight * f) + (tabCleanScoreParams.solariaWeight * f2);
    }

    public final void LIZJ(String str) {
        int i;
        C1157460gE4 c1157460gE4Remove = this.LJIIJJI.remove(str);
        if (c1157460gE4Remove == null) {
            return;
        }
        Reference reference = (Reference) ((LinkedHashMap) this.LJIIIZ).get(str);
        if (reference != null && reference.get() != null) {
            i = 1;
        } else {
            i = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c1157460gE4Remove.LIZLLL;
        C1591160rVa c1591160rVa = C1591160rVa.LIZ;
        String str2 = c1157460gE4Remove.LIZ;
        boolean z = c1157460gE4Remove.LIZIZ;
        EnumC593570NPv enumC593570NPv = c1157460gE4Remove.LIZJ;
        c1591160rVa.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("clean_tab_name", str2);
        c2344009Gk.LJ(Boolean.valueOf(z), "is_top_tab");
        c2344009Gk.LIZJ(enumC593570NPv.getMobValue(), "trigger_source");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration_ms");
        c2344009Gk.LIZJ(i, "is_fragment_leaked");
        C20684815ws.LJIILLIIL("tab_clean_re_enter", c2344009Gk.LIZ);
    }

    public final Pair LJ(C1591190rVd c1591190rVd) {
        Fragment fragmentKi;
        String str = c1591190rVd.LIZ;
        if (((List) this.LJIIZILJ.getValue()).contains(str)) {
            return new Pair(false, EnumC1591170rVb.IN_WHITE_LIST);
        }
        if (!Intrinsics.LJFF(str, this.LJIILL) && !Intrinsics.LJFF(str, this.LJIILLIIL)) {
            if (!((List) this.LJIJ.getValue()).contains(str)) {
                return new Pair(false, EnumC1591170rVb.NOT_IN_CLEAN_LIST);
            }
            Reference reference = (Reference) ((LinkedHashMap) this.LJIIIZ).get(str);
            if (reference != null && reference.get() != null) {
                return new Pair(false, EnumC1591170rVb.FRAGMENT_IS_LEAKED);
            }
            if (c1591190rVd.LIZIZ) {
                HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LJIJJ.getValue();
                if (homeViewPagerAbility != null && (fragmentKi = homeViewPagerAbility.Ki(str)) != null) {
                    if (LIZ(fragmentKi, str)) {
                        return new Pair(false, EnumC1591170rVb.BIZ_INTERCEPTOR);
                    }
                    this.LJIIIZ.put(str, new WeakReference<>(fragmentKi));
                    HomeViewPagerAbility homeViewPagerAbility2 = (HomeViewPagerAbility) this.LJIJJ.getValue();
                    if (homeViewPagerAbility2 != null) {
                        Boolean.valueOf(homeViewPagerAbility2.Y11(str));
                    }
                } else {
                    return new Pair(false, EnumC1591170rVb.FRAGMENT_IS_NULL);
                }
            } else {
                Fragment fragmentZQ2 = ((TabChangeManager) this.LJIJI.getValue()).zQ2(str);
                if (fragmentZQ2 == null) {
                    return new Pair(false, EnumC1591170rVb.FRAGMENT_IS_NULL);
                }
                if (LIZ(fragmentZQ2, str)) {
                    return new Pair(false, EnumC1591170rVb.BIZ_INTERCEPTOR);
                }
                this.LJIIIZ.put(str, new WeakReference<>(fragmentZQ2));
                ((TabChangeManager) this.LJIJI.getValue()).GQ2(fragmentZQ2.getClass());
            }
            this.LJIIJ.remove(str);
            return new Pair(true, null);
        }
        return new Pair(false, EnumC1591170rVb.IS_CURRENT_TAB);
    }

    public final boolean LJFF(C1591190rVd c1591190rVd) {
        if (c1591190rVd.LIZIZ) {
            IMFToolBarAbility iMFToolBarAbility = (IMFToolBarAbility) this.LJIJJLI.getValue();
            if (iMFToolBarAbility != null && iMFToolBarAbility.Iv(c1591190rVd.LIZ)) {
                return true;
            }
            IMFToolBarAbility iMFToolBarAbility2 = (IMFToolBarAbility) this.LJIJJLI.getValue();
            if (iMFToolBarAbility2 != null && iMFToolBarAbility2.Tf(c1591190rVd.LIZ)) {
                return true;
            }
            return false;
        }
        AbstractC1591090rVT abstractC1591090rVT = (AbstractC1591090rVT) this.LJIL.getValue();
        if (abstractC1591090rVT != null && abstractC1591090rVT.LJJI(c1591190rVd.LIZ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI(java.lang.String r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.setting.ab.TabCleanConfig r0 = X.C1591220rVg.LIZJ()
            com.ss.android.ugc.aweme.setting.ab.AdvancedConfig r0 = r0.advanced
            boolean r0 = r0.enableSolaria
            r3 = 0
            if (r0 != 0) goto Lc
            return r3
        Lc:
            X.01GW r0 = r11.LJJ
            java.lang.Object r4 = r0.getValue()
            com.ss.ugc.clientai.core.api.FeatureProducer r4 = (com.ss.ugc.clientai.core.api.FeatureProducer) r4
            if (r4 == 0) goto L6c
            int r0 = r12.hashCode()
            switch(r0) {
                case -1525083535: goto L39;
                case -1382453013: goto L44;
                case -1309089240: goto L4f;
                case -734952021: goto L58;
                default: goto L1d;
            }
        L1d:
            java.lang.String r5 = ""
        L1f:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r1 = "portrait_group"
            java.lang.String r0 = "legacy_cold_start_profiles"
            org.json.JSONObject r6 = r2.put(r1, r0)
            java.lang.String r7 = ""
            r8 = 0
            r9 = 8
            r10 = r8
            java.lang.String r0 = com.ss.ugc.clientai.core.api.FeatureProducer.getStringFeature$default(r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L6c
            goto L63
        L39:
            java.lang.String r0 = "Following"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.String r5 = "enter_homepage_follow_label"
            goto L1f
        L44:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.String r5 = "enter_homepage_message_label"
            goto L1f
        L4f:
            java.lang.String r0 = "FRIENDS_FEED"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L60
            goto L1d
        L58:
            java.lang.String r0 = "FRIENDS_TAB"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L1d
        L60:
            java.lang.String r5 = "enter_homepage_friends_label"
            goto L1f
        L63:
            int r3 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L68
            return r3
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1591140rVY.LJI(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C593600NPy
            if (r0 == 0) goto L67
            r6 = r8
            X.0NPy r6 = (X.C593600NPy) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L38
            if (r0 != r4) goto L6d
            X.C155000ia.LIZIZ(r1)
        L22:
            r7.LIZIZ = r4
            double r0 = X.C2367709Pn.LIZJ()
            r7.LJFF = r0
            long r2 = X.C2367709Pn.LIZLLL()
            r0 = 1024(0x400, float:1.435E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            long r2 = r2 / r0
            r7.LJI = r2
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r7.LIZIZ
            if (r0 == 0) goto L42
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L42:
            com.ss.android.ugc.aweme.setting.ab.TabCleanConfig r0 = X.C1591220rVg.LIZJ()
            com.ss.android.ugc.aweme.setting.ab.AdvancedConfig r0 = r0.advanced
            boolean r0 = r0.triggerGcBefore
            if (r0 == 0) goto L22
            r6.LLILLL = r4
            X.1DFH r3 = X.C0PEM.LIZ
            X.0qtn r2 = new X.0qtn
            r1 = 0
            java.lang.String r0 = "before clean"
            r2.<init>(r7, r0, r1)
            java.lang.Object r1 = X.C23250099c.LJI(r6, r3, r2)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L64
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L64:
            if (r1 != r5) goto L22
            return r5
        L67:
            X.0NPy r6 = new X.0NPy
            r6.<init>(r7, r8)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1591140rVY.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    public final void LJIIJJI(String str) {
        if (!C1591220rVg.LIZJ().trigger.idle.enable || !C1591220rVg.LIZ() || ((List) this.LJIIZILJ.getValue()).contains(str) || !((List) this.LJIJ.getValue()).contains(str)) {
            return;
        }
        C09AE c09aeRemove = this.LJIILIIL.remove(str);
        if (c09aeRemove != null) {
            c09aeRemove.LIZIZ(null);
        }
        long j = C1591220rVg.LIZJ().trigger.idle.delayMs;
        Map<String, C09AE> map = this.LJIILIIL;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        map.put(str, C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C593540NPs(j, this, str, null), 2));
    }

    public final boolean LIZ(Fragment fragment, String str) {
        IFriendsTabV3Service iFriendsTabV3Service;
        long j;
        if (Intrinsics.LJFF(str, "FRIENDS_TAB") && (iFriendsTabV3Service = (IFriendsTabV3Service) PluggableExtentionKt.pluggableSpi$default(IFriendsTabV3Service.class, false, false, false, 14, null)) != null && iFriendsTabV3Service.Pu(fragment)) {
            int iIntValue = ((Number) C278490Avn.LIZ.getValue()).intValue() * 60 * LSPassThroughRecordSizeConfig.DEFAULT;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1591190rVd c1591190rVd = (C1591190rVd) ((LinkedHashMap) this.LJIIJ).get(str);
            if (c1591190rVd != null) {
                j = c1591190rVd.LIZLLL;
            } else {
                j = 0;
            }
            if (jCurrentTimeMillis - j < iIntValue) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc A[PHI: r4 r14
      0x01bc: PHI (r4v6 java.util.Iterator) = (r4v3 java.util.Iterator), (r4v23 java.util.Iterator) binds: [B:66:0x0213, B:58:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r14v5 X.0NPv) = (r14v4 X.0NPv), (r14v8 X.0NPv) binds: [B:66:0x0213, B:58:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0215  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0151 -> B:43:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0173 -> B:43:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0213 -> B:59:0x01bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.EnumC593570NPv r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1591140rVY.LIZLLL(X.0NPv, X.05Vn):java.lang.Object");
    }

    public final void LJIIIZ(C1591190rVd c1591190rVd, EnumC593570NPv enumC593570NPv) {
        Map<String, C1157460gE4> map = this.LJIIJJI;
        String str = c1591190rVd.LIZ;
        map.put(str, new C1157460gE4(str, c1591190rVd.LIZIZ, enumC593570NPv, System.currentTimeMillis()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.lang.String r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1591140rVY.LJIIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r7, java.util.List<java.lang.String> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C593590NPx
            if (r0 == 0) goto L71
            r5 = r9
            X.0NPx r5 = (X.C593590NPx) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L77
            X.C155000ia.LIZIZ(r2)
        L22:
            r6.LJIIJ()
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = r6.LIZIZ
            if (r0 != 0) goto L32
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            boolean r0 = r6.LIZJ
            if (r0 == 0) goto L39
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L39:
            if (r7 != 0) goto L46
            r0 = 0
            r6.LIZIZ = r0
            java.util.List<java.lang.String> r0 = r6.LJ
            r0.clear()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            r6.LIZLLL = r7
            r6.LJ = r8
            r6.LIZJ = r1
            com.ss.android.ugc.aweme.setting.ab.TabCleanConfig r0 = X.C1591220rVg.LIZJ()
            com.ss.android.ugc.aweme.setting.ab.AdvancedConfig r0 = r0.advanced
            boolean r0 = r0.triggerGcAfter
            if (r0 == 0) goto L25
            r5.LLILLL = r1
            X.1DFH r3 = X.C0PEM.LIZ
            X.0qtn r2 = new X.0qtn
            r1 = 0
            java.lang.String r0 = "after clean"
            r2.<init>(r6, r0, r1)
            java.lang.Object r1 = X.C23250099c.LJI(r5, r3, r2)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L6e
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L6e:
            if (r1 != r4) goto L22
            return r4
        L71:
            X.0NPx r5 = new X.0NPx
            r5.<init>(r6, r9)
            goto L12
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1591140rVY.LJII(int, java.util.List, X.05Vn):java.lang.Object");
    }
}
