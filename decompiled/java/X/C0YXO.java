package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.PigeonGlobalContainer;
import com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi;
import com.bytedance.tts.pigeon.paas.components.api.WSManagerComponentApi;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS380S0200000_14;

/* JADX INFO: renamed from: X.0YXO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0YXO implements C0YJ0, C0XQB {
    public static final C01GW<List<C0YXO>> LLJILJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(423));
    public final String LL = "cs";
    public final String LLILLJJLI = "fe_tiktok_ecommerce_chat_lynx";
    public final String LLILLL = "fe_tiktok_ecommerce_chat_lynx/chat";
    public final boolean LLILZ;
    public final GECPigeon LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final Set<String> LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public final C054G LLJI;
    public long LLJIJIL;

    @Override // X.C0YJ0
    public final void LIZ() {
        int i;
        this.LLILZIL.removeOnInitEndListener(this);
        if (this.LLIZ) {
            i = 1;
        } else {
            ((PigeonIMLoginStateComponentApi) C0YXD.LIZIZ(this.LLILZIL, C13LE.LIZ(PigeonIMLoginStateComponentApi.class))).LJJI();
            i = 0;
        }
        C1018703yb.LIZIZ("pigeon_preconnect_end", C2097608Jq.LJIIIIZZ(new Pair("delay_time", String.valueOf(C0BLV.LIZ())), new Pair("client", this.LL), new Pair("cost_time", String.valueOf(System.currentTimeMillis() - this.LLJIJIL)), new Pair("can_end", Integer.valueOf(i))));
    }

    public final void LIZJ() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (this.LLILZLL) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).addLoginOrLogoutListener(this);
        try {
            C0YXD.LIZ(this.LLILZIL, C13LE.LIZ(PigeonGlobalContainer.class), AFwS248S0000000_14.get$arr$(431));
            this.LLILZLL = true;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJ() {
        PigeonIMLoginStateComponentApi pigeonIMLoginStateComponentApi = (PigeonIMLoginStateComponentApi) C0YXD.LIZIZ(this.LLILZIL, C13LE.LIZ(PigeonIMLoginStateComponentApi.class));
        ((WSManagerComponentApi) C0YXD.LIZIZ(this.LLILZIL, C13LE.LIZ(WSManagerComponentApi.class))).LJJ();
        pigeonIMLoginStateComponentApi.LJJI();
        pigeonIMLoginStateComponentApi.LJIIL(new C0YWT(0, null, null, null, null, null, null, 0, 0, null, 0, 8191));
    }

    public final void LIZIZ(C09AE c09ae) {
        c09ae.LIZIZ(null);
        C1018703yb.LIZIZ("pigeon_shut_down_interrupt", C2097608Jq.LJIIIIZZ(new Pair("delay_time", Long.valueOf(C0BLV.LIZ())), new Pair("client", this.LL)));
    }

    public final void LJFF(String str) {
        this.LLIZLLLIL.remove(str);
        C1018703yb.LIZIZ("pigeon_shut_down", C2097608Jq.LJIIIIZZ(new Pair("unregister_scene", str), new Pair("trigger_logout", Integer.valueOf(this.LLIZLLLIL.isEmpty() ? 1 : 0)), new Pair("client", this.LL)));
        if (true ^ this.LLIZLLLIL.isEmpty()) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            LIZIZ(anonymousClass0956);
        }
        this.LLJ = C23250099c.LIZLLL(this.LLJI, null, null, new C313690CRj(this, null), 3);
    }

    public C0YXO(boolean z, C0YZB c0yzb) {
        this.LLILZ = z;
        C872060YIy c872060YIy = GECPigeon.Companion;
        C052L c052l = new C0YWU() { // from class: X.052L
            public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1002));
            public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1001));
            public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1003));
            public static final C01GW LJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(424));

            @Override // X.C0YWU
            public final C052P LIZ() {
                return (C052P) LIZIZ.getValue();
            }

            @Override // X.C0YWU
            public final C052N LIZIZ() {
                return (C052N) LIZLLL.getValue();
            }

            @Override // X.C0YWU
            public final C0YXL LIZJ() {
                return (C0YXL) LJ.getValue();
            }

            @Override // X.C0YWU
            public final Context getApplicationContext() {
                IECommerceHostService iECommerceHostService;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                return ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
            }
        };
        c872060YIy.getClass();
        GECPigeon.sharedPigeonDepend = c052l;
        this.LLILZIL = new GECPigeon(c0yzb);
        this.LLIZLLLIL = new LinkedHashSet();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJI = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
    }

    public final void LIZLLL(String str, C0YWT c0ywt) {
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            LIZIZ(anonymousClass0956);
        }
        this.LLJ = null;
        C1018703yb.LIZIZ("pigeon_start_up", C2097608Jq.LJIIIIZZ(new Pair("register_scene", str), new Pair("trigger_login", Integer.valueOf(this.LLIZLLLIL.isEmpty() ? 1 : 0)), new Pair("client", this.LL)));
        this.LLIZ = true;
        LIZJ();
        PigeonIMLoginStateComponentApi pigeonIMLoginStateComponentApi = (PigeonIMLoginStateComponentApi) C0YXD.LIZIZ(this.LLILZIL, C13LE.LIZ(PigeonIMLoginStateComponentApi.class));
        WSManagerComponentApi wSManagerComponentApi = (WSManagerComponentApi) C0YXD.LIZIZ(this.LLILZIL, C13LE.LIZ(WSManagerComponentApi.class));
        this.LLILZIL.setNeedWebSocket(true);
        if (this.LLIZLLLIL.contains(str) && c0ywt != null) {
            pigeonIMLoginStateComponentApi.LJIIL(c0ywt);
            pigeonIMLoginStateComponentApi.LJJI();
            pigeonIMLoginStateComponentApi.LJIILL(c0ywt);
            wSManagerComponentApi.LJJII(c0ywt);
        } else if (this.LLIZLLLIL.isEmpty()) {
            pigeonIMLoginStateComponentApi.LJJJJIZL(new AwS380S0200000_14(pigeonIMLoginStateComponentApi, wSManagerComponentApi, 90), true);
        }
        this.LLIZLLLIL.add(str);
    }

    @Override // X.C0XQB
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (!z) {
            return;
        }
        if (i != 2) {
            if (i == 3) {
                LJ();
                return;
            }
            return;
        }
        LJ();
    }
}
