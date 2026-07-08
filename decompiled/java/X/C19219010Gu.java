package X;

import Y.ARunnableS97S0200000_28;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import defpackage.f9;
import defpackage.g9;
import defpackage.i9;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19219010Gu extends C10P5<C1869040yjm> implements InterfaceC1912500zrs {
    public long LJFF;
    public int LJI;
    public final EnumC1284970jXj LJII;

    @Override // X.C10P5, X.C10P7
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1912500zrs
    public final void LIZ() {
        Function0<Unit> function0;
        C19219110Gv.LIZ.getClass();
        C19219110Gv.LIZLLL = Boolean.valueOf(ComplianceServiceProvider.LJJIII().LJ());
        C19219110Gv.LIZJ = true;
        C19219110Gv.LIZ();
        if (C19219410Gy.LIZ != null) {
            boolean zLJFF = Intrinsics.LJFF(new C10QI() { // from class: X.10H1
                {
                    g9 g9Var = g9.STRATEGY_SCENE_SHORT_TO_LONG;
                }
            }.LIZJ(), "run");
            C10H3.LIZ = zLJFF;
            C19219410Gy.LIZIZ = Boolean.valueOf(zLJFF);
            if (C10H3.LIZ && (function0 = C19219410Gy.LIZ) != null) {
                function0.invoke();
            }
        }
        if (C1234670iEb.LIZ != null && Intrinsics.LJFF(new C10H0().LIZJ(), "run")) {
            C1234670iEb.LIZIZ = true;
            Function0<Unit> function02 = C1234670iEb.LIZ;
            if (function02 != null) {
                function02.invoke();
            }
        }
        C10P6 c10p6 = this.LIZIZ;
        c10p6.getClass();
        C10OL c10ol = C10OL.LIZ;
        C10PP c10pp = c10p6.LIZ;
        c10ol.getClass();
        c10p6.LIZIZ.LJFF = C10OL.LIZ(c10pp, true);
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1913090zsp.LIZ.getClass();
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - C1913090zsp.LJFF, "duration_from_slogan_show");
        C10SV.LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("nuj_start_timing", c2344009Gk.LIZ);
        super.LJ();
        C1891160zJS.LIZ(SystemClock.elapsedRealtime() - this.LJFF, "Server");
        C10SH.LIZ.getClass();
        if (C123100dR.LIZ(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            C10SH.LIZIZ();
        } else {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.10Gz
                @Override // X.InterfaceC2210981Bg8
                public final void LIZ(boolean z) {
                }

                @Override // X.InterfaceC2210981Bg8
                public final void LIZIZ(String str, String str2) {
                }

                @Override // X.InterfaceC2210981Bg8
                public final void LIZJ(boolean z) {
                    if (z) {
                        C10SH.LIZ.getClass();
                        C10SH.LIZIZ();
                    }
                }
            });
        }
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        int i = this.LJI;
        c1912930zsZ.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = C1912930zsZ.LIZLLL;
        long j2 = C1912930zsZ.LIZJ;
        long j3 = j - j2;
        long j4 = jElapsedRealtime - j;
        long j5 = jElapsedRealtime - j2;
        C10H5 c10h5 = C10H5.SLOGAN_OPTIMIZE;
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LIZLLL(j3, "slogan_duration");
        c2344009Gk2.LIZLLL(j4, "plugin_duration");
        c2344009Gk2.LIZLLL(j5, "total_duration");
        c2344009Gk2.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C10SV.LIZIZ(c10h5, c2344009Gk2.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status:");
        sbLIZ.append(i);
        sbLIZ.append(", slogan_duration:");
        sbLIZ.append(j3);
        sbLIZ.append(", plugin_duration:");
        sbLIZ.append(j4);
        sbLIZ.append(", total_duration:");
        sbLIZ.append(j5);
        C1911410zq7.LIZ("SLOGAN_OPTIMIZE", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r2 <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        X.C587550N2r.LIZ(r2, new Y.ARunnableS128S0100000_28(r9, 71));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        return;
     */
    @Override // X.C10P5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r9 = this;
            X.10H2 r0 = new java.lang.Object() { // from class: X.10H2
                static {
                    /*
                        X.10H2 r0 = new X.10H2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.10H2) X.10H2.LIZ X.10H2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C10H2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C10H2.<init>():void");
                }
            }
            r0.getClass()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.plugin.IPluginService> r0 = com.ss.android.ugc.aweme.plugin.IPluginService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.plugin.IPluginService r0 = (com.ss.android.ugc.aweme.plugin.IPluginService) r0
            java.util.List r0 = r0.getCurrentPluginList()
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r0 = r3.hasNext()
            r8 = 0
            if (r0 == 0) goto L9b
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0TA0 r0 = (X.C0TA0) r0
            X.10Pl r1 = r0.getType()
            X.10Pl r0 = X.EnumC19241510Pl.SLOGAN_DELAY
            if (r1 != r0) goto L19
        L2f:
            X.0TA0 r2 = (X.C0TA0) r2
            if (r2 == 0) goto L9d
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.getValue()
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.plugin.IPluginService$SimplePluginData r0 = r0.simplePluginData
            r6 = 0
            if (r0 == 0) goto L9d
            java.util.List<com.ss.android.ugc.aweme.plugin.IPluginService$SpKvItem> r0 = r0.kvList
            if (r0 == 0) goto L9d
            java.util.Iterator r5 = r0.iterator()
            r2 = 0
        L49:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.plugin.IPluginService$SpKvItem r4 = (com.ss.android.ugc.aweme.plugin.IPluginService.SpKvItem) r4
            if (r4 == 0) goto L99
            java.lang.String r1 = r4.key
        L59:
            java.lang.String r0 = "slogan_delay_time_millisecond"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L7a
            if (r4 == 0) goto L9d
            java.lang.String r0 = r4.intValue
            if (r0 == 0) goto L9d
            long r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
        L6b:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L9d
            Y.ARunnableS128S0100000_28 r1 = new Y.ARunnableS128S0100000_28
            r0 = 71
            r1.<init>(r9, r0)
            X.C587550N2r.LIZ(r2, r1)
            return
        L7a:
            if (r4 == 0) goto L97
            java.lang.String r1 = r4.key
        L7e:
            java.lang.String r0 = "slogan_delay_time"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L49
            if (r4 == 0) goto L95
            java.lang.String r0 = r4.intValue
            if (r0 == 0) goto L95
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
        L90:
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            goto L49
        L95:
            r0 = 0
            goto L90
        L97:
            r1 = r8
            goto L7e
        L99:
            r1 = r8
            goto L59
        L9b:
            r2 = r8
            goto L2f
        L9d:
            X.C1912490zrr.LIZIZ = r9
            java.lang.ref.WeakReference<X.0zrt> r0 = X.C1912490zrr.LIZ
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r0.get()
            X.0zrt r0 = (X.InterfaceC1912510zrt) r0
            if (r0 == 0) goto Laf
            r0.wl()
            return
        Laf:
            X.0zrs r0 = X.C1912490zrr.LIZIZ
            if (r0 == 0) goto Lb6
            r0.LIZ()
        Lb6:
            X.C1912490zrr.LIZIZ = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19219010Gu.LJ():void");
    }

    @Override // X.C10P5
    public final EnumC1284970jXj LJFF() {
        return this.LJII;
    }

    @Override // X.C10P7
    public final C10NW type() {
        return C10NW.JOURNEY_SERVER_DELAY_ID;
    }

    public C19219010Gu(C1912470zrp c1912470zrp, C10P6 c10p6) {
        super(c1912470zrp, c10p6);
        this.LJII = EnumC1284970jXj.NA;
    }

    @Override // X.C10P5, X.C10P7
    public final void LIZLLL(C1912470zrp c1912470zrp, C1869040yjm c1869040yjm, Function1<? super C19240810Pe, Unit> function1) {
        long jJz1;
        super.LIZLLL(c1912470zrp, c1869040yjm, function1);
        this.LJFF = SystemClock.elapsedRealtime();
        C19233810Mm.LIZ.getClass();
        f9 f9Var = f9.LIZ;
        i9 i9Var = new i9() { // from class: X.10Me
            @Override // defpackage.i9
            public final void LIZ(List<Integer> list) {
                Integer numLIZIZ;
                C19233810Mm.LIZ.getClass();
                if (new C19233110Mf().LIZ("need_force_cover_nuj_config", false)) {
                    C19233810Mm.LIZIZ = new LinkedHashMap();
                }
                IHybridABInfoService iHybridABInfoService = (IHybridABInfoService) PluggableExtentionKt.pluggableSpi$default(IHybridABInfoService.class, false, false, false, 14, null);
                if (iHybridABInfoService != null && (numLIZIZ = iHybridABInfoService.LIZIZ()) != null && numLIZIZ.intValue() == 1) {
                    C19233810Mm.LIZIZ = new LinkedHashMap();
                }
            }
        };
        f9Var.getClass();
        ((CopyOnWriteArrayList) f9.LIZJ).add(i9Var);
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c1912930zsZ.getClass();
        C1912930zsZ.LIZLLL = jElapsedRealtime;
        C013C c013c = new C013C();
        C19219210Gw c19219210Gw = new C19219210Gw(c013c, this);
        ((IPluginService) ServiceManager.get().getService(IPluginService.class)).observeInitialLaunchRequestResult(this.LIZ.LIZ.LLILLIZIL(), c19219210Gw);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                InterfaceC1912440zrm interfaceC1912440zrm = (InterfaceC1912440zrm) this.LIZ.LIZIZ(InterfaceC1912440zrm.class);
                if (interfaceC1912440zrm != null) {
                    jJz1 = interfaceC1912440zrm.Jz1();
                } else {
                    jJz1 = 0;
                }
                INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
                if (iNewUserJourneyAppDiffService != null) {
                    iNewUserJourneyAppDiffService.LIZ();
                }
                ARunnableS97S0200000_28 aRunnableS97S0200000_28 = new ARunnableS97S0200000_28(c013c, c19219210Gw, 26);
                long j = 2500;
                long j2 = 2500 - jJz1;
                if (j2 <= 2500) {
                    j = j2;
                }
                C587550N2r.LIZ(j, aRunnableS97S0200000_28);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c19219210Gw.onError(new IllegalStateException("no network"));
        c19219210Gw.dispose();
    }
}
