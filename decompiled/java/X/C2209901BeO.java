package X;

import Y.ARunnableS129S0100000_29;
import android.accounts.Account;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.applog.IBDAccountCallback;
import com.bytedance.applog.params.CommonParamsWrapper;
import com.bytedance.applog.params.lifecycle.LifecycleValueObserver;
import com.bytedance.applog.priority.PriorityCallbackImpl;
import com.bytedance.applog.priority.PriorityEventMetaFactory;
import com.bytedance.applog.priority.PriorityWrapper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209901BeO implements InterfaceC2210301Bf2 {
    public static final long LJLIL = System.currentTimeMillis();
    public static final List<C2209901BeO> LJLILLLLZI = new CopyOnWriteArrayList();
    public static final AtomicInteger LJLJI = new AtomicInteger(0);
    public final C2210041Bec LIZLLL;
    public volatile C2209571Bdr LJIIJJI;
    public volatile C2209771BeB LJIIL;
    public volatile C2209911BeP LJIILIIL;
    public final C2210071Bef LJIILJJIL;
    public volatile boolean LJIILL;
    public volatile InterfaceC2209861BeK LJIILLIIL;
    public volatile InterfaceC801310Vc1 LJIIZILJ;
    public volatile Integer LJIJ;
    public volatile AbstractC2194001Atq LJIJI;
    public C2210481BfK LJIJJ;
    public volatile Proxy LJIJJLI;
    public final C2210131Bel LJJ;
    public final C2209921BeQ LJJJJLI;
    public volatile Long LJJJJLL;
    public volatile Integer LJJJJZ;
    public volatile InterfaceC2211431Bgr LJJJJZI;
    public volatile IBDAccountCallback LJJJLIIL;
    public volatile EnumC2210521BfO LJJJZ;
    public volatile InterfaceC2211401Bgo LJJL;
    public final C2210731Bfj LJLI;
    public final C2210431BfF LIZ = new C2210431BfF();
    public final C2210181Beq LIZIZ = new C2210181Beq();
    public final C19397010ue LIZJ = new C19397010ue();
    public int LJIIIIZZ = 0;
    public String LJIIIZ = "";
    public volatile Application LJIIJ = null;
    public volatile boolean LJIL = true;
    public volatile boolean LJJI = false;
    public volatile boolean LJJIFFI = false;
    public volatile boolean LJJII = true;
    public volatile boolean LJJIII = false;
    public final AtomicInteger LJJIIJ = new AtomicInteger(0);
    public volatile boolean LJJIIJZLJL = false;
    public volatile boolean LJJIIZ = false;
    public volatile boolean LJJIIZI = false;
    public volatile boolean LJJIJ = false;
    public volatile boolean LJJIJIIJI = true;
    public volatile boolean LJJIJIIJIL = false;
    public volatile int LJJIJIL = 5;
    public volatile int LJJIJL = 200;
    public volatile boolean LJJIJLIJ = false;
    public volatile HashSet<String> LJJIL = new HashSet<>();
    public volatile int LJJIZ = 200;
    public volatile int LJJJ = 20;
    public volatile boolean LJJJI = false;
    public volatile boolean LJJJIL = false;
    public volatile boolean LJJJJ = false;
    public volatile boolean LJJJJI = false;
    public volatile boolean LJJJJIZL = false;
    public volatile int LJJJJJ = 8;
    public volatile InterfaceC2211181BgS LJJJJJL = null;
    public final C2210581BfU LJJJJL = new C2210581BfU();
    public volatile boolean LJJJLZIJ = false;
    public volatile JSONObject LJJLI = null;
    public PriorityWrapper LJJLIIIIJ = null;
    public volatile boolean LJJLIIIJ = true;
    public volatile boolean LJJLIIIJILLIZJL = false;
    public volatile ConcurrentHashMap<String, String> LJJLIIIJJI = new ConcurrentHashMap<>();
    public volatile boolean LJJLIIIJJIZ = false;
    public volatile boolean LJJLIIIJL = false;
    public volatile boolean LJJLIIIJLJLI = true;
    public volatile boolean LJJLIIIJLLLLLLLZ = true;
    public volatile boolean LJJLIIJ = false;
    public volatile boolean LJJLIL = false;
    public volatile boolean LJJLJ = false;
    public volatile boolean LJJLJLI = false;
    public volatile long LJJLL = 0;
    public final C2192101Aqm LJJZ = new C08UT<CommonParamsWrapper>() { // from class: X.1Aqm
        @Override // X.C08UT
        public final Object LIZ() {
            return new CommonParamsWrapper(String.valueOf(hashCode()));
        }
    };
    public final AtomicBoolean LJJZZIII = new AtomicBoolean(false);
    public final List<String> LJL = new CopyOnWriteArrayList();
    public final C2210271Bez LJLIIIL = new C2210271Bez(new C2211111BgL(this));
    public final C2209541Bdo LJLIIL = new C2209541Bdo();
    public final int LJII = LJLJI.getAndIncrement();
    public final C2209791BeD LJJZZI = new C2209791BeD();
    public final C2209651Bdz LJFF = new C2209651Bdz(this);
    public final C2201391BDt LJJJLL = new C2201391BDt(this);
    public final C2209831BeH LJ = new C2209831BeH(this);
    public final C2209701Be4 LJI = new InterfaceC23070092e(this) { // from class: X.1Be4
        public final C2209651Bdz LIZ;

        {
            this.LIZ = this.LJFF;
        }

        @Override // X.InterfaceC23070092e
        public final String get(String str, Map<String, String> map) {
            return this.LIZ.LJ(0, str, (HashMap) map, null, 0).LIZ;
        }

        @Override // X.InterfaceC23070092e
        public final byte[] LIZ(String str, Map map, byte[] bArr) {
            return this.LIZ.LJ(1, str, (HashMap) map, bArr, 1).LIZIZ;
        }

        @Override // X.InterfaceC23070092e
        public final String post(String str, Map map, byte[] bArr) {
            return this.LIZ.LJ(1, str, (HashMap) map, bArr, 0).LIZ;
        }
    };

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJJL() {
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJIJI() {
        this.LJJIJLIJ = false;
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LLJILJILJ.obtainMessage(26, Boolean.FALSE).sendToTarget();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJLIL(InterfaceC2211421Bgq interfaceC2211421Bgq) {
    }

    public final String LLLF() {
        if (this.LJIIL == null) {
            return null;
        }
        C2209571Bdr c2209571Bdr = this.LJIIL.LIZLLL;
        if (c2209571Bdr.LJIILLIIL == null) {
            c2209571Bdr.LJIILLIIL = c2209571Bdr.LIZJ.getString("ab_sdk_version", "");
        }
        return c2209571Bdr.LJIILLIIL;
    }

    @Override // X.InterfaceC2210301Bf2
    public final Map<String, String> LIZ() {
        Integer numLIZLLL;
        InterfaceC844930XCp interfaceC844930XCp;
        C0XCI c0xci = (C0XCI) this.LJJ.LIZIZ();
        if (!c0xci.LIZJ() || (numLIZLLL = c0xci.LIZLLL()) == null || (interfaceC844930XCp = (InterfaceC844930XCp) C0XBH.LIZ(InterfaceC844930XCp.class, String.valueOf(numLIZLLL))) == null) {
            return null;
        }
        return interfaceC844930XCp.LIZ();
    }

    @Override // X.InterfaceC2210301Bf2
    public final C2210081Beg LJ() {
        if (this.LJIIJJI != null) {
            return this.LJIIJJI.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LJFF() {
        InterfaceC844940XCq interfaceC844940XCq;
        Integer numLIZLLL = ((C0XCI) this.LJJ.LIZIZ()).LIZLLL();
        if (numLIZLLL == null || (interfaceC844940XCq = (InterfaceC844940XCq) C0XBH.LIZ(InterfaceC844940XCq.class, String.valueOf(numLIZLLL))) == null) {
            return false;
        }
        return interfaceC844940XCq.LJFF();
    }

    @Override // X.InterfaceC2210301Bf2
    public final String LJIIZILJ() {
        return this.LJIIL != null ? this.LJIIL.LIZLLL() : "";
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJI() {
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LJ().getClass();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final C2209741Be8 LJJIIZ() {
        if (this.LJIILIIL != null) {
            return this.LJIILIIL.LLJJIJIL;
        }
        return null;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LJJIZ() {
        this.LJJ.LIZIZ().getClass();
        try {
            Class.forName("com.bytedance.bdinstall.nu.NUModeServiceImpl");
            return true;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJIL() {
        if (this.LJIILIIL != null) {
            C2209911BeP c2209911BeP = this.LJIILIIL;
            c2209911BeP.LLJILJILJ.removeMessages(14);
            C786410Ut5.LJLILLLLZI(c2209911BeP.LLJILJILJ, 14);
        }
        this.LJJJJLI.LIZIZ(EnumC2210021Bea.FLUSH_COUNT, 1);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJJ() {
        this.LJIILJJIL.getClass();
    }

    @Override // X.InterfaceC2210301Bf2
    public final InterfaceC844530XBb LJJJJLI() {
        return this.LJJ.LIZIZ();
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJJZI() {
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LJ().getClass();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final String LJJLI() {
        C0XBN c0xbnLIZJ = this.LJJ.LIZJ();
        if (c0xbnLIZJ != null) {
            return c0xbnLIZJ.LLILZ;
        }
        return null;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LJJLIIIJLJLI() {
        return ((C0XCI) this.LJJ.LIZIZ()).LIZ();
    }

    @Override // X.InterfaceC2210301Bf2
    public final InterfaceC467610IVj LJJLIIIJLLLLLLLZ() {
        C2209521Bdm c2209521Bdm;
        return (!this.LJJLJLI || this.LJIILIIL == null || (c2209521Bdm = this.LJIILIIL.LLJJL) == null) ? new InterfaceC467610IVj() { // from class: X.1BgR
            @Override // X.InterfaceC467610IVj
            public final String LIZ(JSONObject jSONObject) {
                return null;
            }
        } : c2209521Bdm;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLLI() {
        C2210481BfK c2210481BfK = this.LJIJJ;
        if (c2210481BfK != null) {
            c2210481BfK.LIZ.clear();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLLILLLL() {
        BPEAHandler bPEAHandler;
        if (this.LJIILIIL == null || (bPEAHandler = this.LJIILIIL.LLJILJILJ) == null) {
            return;
        }
        bPEAHandler.obtainMessage(22, Boolean.FALSE).sendToTarget();
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIIJLIL() {
        if (this.LJIILIIL == null) {
            this.LJJZZI.LJIIZILJ(null, "init priority failed for not init engine!", null, new Object[0]);
            return;
        }
        C2209911BeP c2209911BeP = this.LJIILIIL;
        BPEAHandler bPEAHandler = c2209911BeP.LLJILJILJ;
        if (bPEAHandler != null) {
            bPEAHandler.removeMessages(28);
            C786410Ut5.LJLILLLLZI(c2209911BeP.LLJILJILJ, 28);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final int LLILL() {
        if (this.LJIJ != null) {
            return this.LJIJ.intValue();
        }
        if (this.LJIIJJI != null) {
            return this.LJIIJJI.LJ.getInt("http_monitor_port", 0);
        }
        return 0;
    }

    @Override // X.InterfaceC2210301Bf2
    public final String LLILZLL() {
        C2210131Bel c2210131Bel = this.LJJ;
        if (TextUtils.isEmpty(c2210131Bel.LJIIIZ)) {
            C0XBN c0xbnLIZJ = c2210131Bel.LIZJ();
            c2210131Bel.LJIIIZ = c0xbnLIZJ != null ? c0xbnLIZJ.LLILZIL : null;
        }
        return c2210131Bel.LJIIIZ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJI() {
        this.LJJ.LIZIZ();
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJILJIL() {
        InterfaceC844940XCq interfaceC844940XCq;
        Integer numLIZLLL = ((C0XCI) this.LJJ.LIZIZ()).LIZLLL();
        if (numLIZLLL == null || (interfaceC844940XCq = (InterfaceC844940XCq) C0XBH.LIZ(InterfaceC844940XCq.class, String.valueOf(numLIZLLL))) == null) {
            return;
        }
        interfaceC844940XCq.getApi();
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJJJLIIL() {
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LIZ(false, 21, 0L, null);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLL() {
        BPEAHandler bPEAHandler;
        if (this.LJIILIIL == null || (bPEAHandler = this.LJIILIIL.LLJILJILJ) == null) {
            return;
        }
        bPEAHandler.obtainMessage(22, Boolean.TRUE).sendToTarget();
    }

    public final InterfaceC2192181Aqu LLLFF() {
        return this.LJJLIIIJLJLI ? LIZIZ(new Object[0]) : C2192121Aqo.LIZ;
    }

    public final int LLLFFI() {
        return this.LJJIIJ.get();
    }

    public final long LLLFZ() {
        if (this.LJIILIIL == null) {
            return 0L;
        }
        return this.LJIILIIL.LLJIJIL.LJIIIZ.incrementAndGet();
    }

    public final PriorityWrapper LLLI() {
        if (this.LJJIIZ) {
            return this.LJJLIIIIJ;
        }
        return null;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void flush() {
        if (this.LJJIJIIJI) {
            LJJJIL();
            return;
        }
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LJIIIZ(true, null);
        }
        this.LJJJJLI.LIZIZ(EnumC2210021Bea.FLUSH_COUNT, 1);
    }

    @Override // X.InterfaceC2210301Bf2
    public final String getAbSdkVersion() {
        if (this.LJIILIIL == null) {
            return null;
        }
        long jLongValue = this.LJIILIIL.LLJIJIL.LIZ;
        IBDAccountCallback iBDAccountCallback = this.LJJJLIIL;
        if (iBDAccountCallback != null) {
            jLongValue = ((Long) iBDAccountCallback.getOdinUserInfo().second).longValue();
        }
        String.valueOf(jLongValue);
        return LLLF();
    }

    @Override // X.InterfaceC2210301Bf2
    public final InterfaceC2192111Aqn getCommonParams() {
        return this.LJJLIIIJLJLI ? LIZIZ(new Object[0]) : C2192121Aqo.LIZ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final String getDid() {
        String did2;
        C0XBN c0xbnLIZIZ;
        C2210131Bel c2210131Bel = this.LJJ;
        if (TextUtils.isEmpty(c2210131Bel.LJII)) {
            C0XCI c0xci = (C0XCI) c2210131Bel.LIZIZ();
            if (c0xci.LIZ == null || c0xci.LIZ.LIZJ == null) {
                C844830XCf.LIZIZ("BDInstall#getDid error, not init yet!");
                Context contextLJ = c0xci.LJ();
                did2 = null;
                if (contextLJ != null && (c0xbnLIZIZ = c0xci.LJIIJJI.LIZIZ(contextLJ)) != null) {
                    did2 = c0xbnLIZIZ.LL;
                }
            } else {
                did2 = c0xci.LJFF.LIZIZ(c0xci.LIZ.LIZJ).getDid();
            }
            c2210131Bel.LJII = did2;
        }
        return c2210131Bel.LJII;
    }

    @Override // X.InterfaceC2210301Bf2
    public final JSONObject getHeader() {
        if (this.LJIIL != null) {
            return this.LJIIL.LIZ();
        }
        this.LJJZZI.LJII("Init first please to get header", new Object[0]);
        return null;
    }

    @Override // X.InterfaceC2210301Bf2
    public final String getIid() {
        C2210131Bel c2210131Bel = this.LJJ;
        if (TextUtils.isEmpty(c2210131Bel.LJIIIIZZ)) {
            C0XBN c0xbnLIZJ = c2210131Bel.LIZJ();
            c2210131Bel.LJIIIIZZ = c0xbnLIZJ != null ? c0xbnLIZJ.LLILLJJLI : null;
        }
        return c2210131Bel.LJIIIIZZ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final InterfaceC23070092e getNetClient() {
        InterfaceC23070092e interfaceC23070092e = this.LJIIJJI.LIZIZ.LJIJI;
        return interfaceC23070092e == null ? this.LJI : interfaceC23070092e;
    }

    @Override // X.InterfaceC2210301Bf2
    public final String getOpenUdid() {
        C0XBN c0xbnLIZJ = this.LJJ.LIZJ();
        if (c0xbnLIZJ != null) {
            return c0xbnLIZJ.LLILLL;
        }
        return null;
    }

    @Override // X.InterfaceC2210301Bf2
    public final String getSessionId() {
        if (this.LJIILIIL != null) {
            return this.LJIILIIL.LLJIJIL.LJIIIIZZ;
        }
        return null;
    }

    @Override // X.InterfaceC2210301Bf2
    public final String getUserID() {
        if (this.LJIILIIL != null) {
            return String.valueOf(this.LJIILIIL.LLJIJIL.LIZ);
        }
        return null;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean isNewUser() {
        C0XCI c0xci = (C0XCI) this.LJJ.LIZIZ();
        Context contextLJ = c0xci.LJ();
        if (contextLJ != null) {
            return c0xci.LJFF.LIZIZ(contextLJ).LJIIL();
        }
        return false;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void start() {
        if (this.LJIILL) {
            return;
        }
        this.LJIILL = true;
        C2209911BeP c2209911BeP = this.LJIILIIL;
        if (!c2209911BeP.LLJJI) {
            c2209911BeP.LLJJI = true;
            C786410Ut5.LJLILLLLZI(c2209911BeP.LLJILJILJ, 1);
            C786410Ut5.LJLJJI(2, 200L, c2209911BeP.LLJILJILJ);
        }
        this.LJJZZI.LJIIJ("System start!", new Object[0]);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void stop() {
        this.LJJZZI.LJIIJ("System stop!", new Object[0]);
        if (this.LJIILL) {
            this.LJIILL = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.1Aqm] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.1Be4] */
    public C2209901BeO() {
        ((CopyOnWriteArrayList) LJLILLLLZI).add(this);
        this.LIZLLL = new C2210041Bec(this);
        this.LJJ = new C2210131Bel(this);
        this.LJIILJJIL = new C2210071Bef(this);
        this.LJJJJLI = new C2209921BeQ();
        this.LJLI = new C2210731Bfj();
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LIZJ() {
        boolean zLJI = MethodIDManager.LJI(71875);
        this.LJIILJJIL.onActivityPaused(null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LJJJZ() {
        if (LJ() != null) {
            LJ().getClass();
        }
        return this.LJJIIZI;
    }

    public final boolean LLLII() {
        C2210081Beg c2210081BegLJ = LJ();
        if (c2210081BegLJ != null) {
            return c2210081BegLJ.LJJIIJ;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppLogInstance{id:");
        sbLIZ.append(this.LJII);
        sbLIZ.append(";appId:");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append("}@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LIZLLL() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC2210301Bf2
    public final InterfaceC2209861BeK LJIJI() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC2210301Bf2
    public final IBDAccountCallback LJIJJ() {
        return this.LJJJLIIL;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LJJIJL() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC2210301Bf2
    public final C2210271Bez LJJJJIZL() {
        return this.LJLIIIL;
    }

    @Override // X.InterfaceC2210301Bf2
    public final C2209921BeQ LJJJJZ() {
        return this.LJJJJLI;
    }

    @Override // X.InterfaceC2210301Bf2
    public final AbstractC2194001Atq LJJJLL() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LJJZ() {
        return this.LJJLJ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LJLJJL() {
        return this.LJJI;
    }

    @Override // X.InterfaceC2210301Bf2
    public final InterfaceC2211431Bgr LJZ() {
        return this.LJJJJZI;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LLF() {
        return this.LJJIIZ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final Integer LLFFF() {
        return this.LJJJJZ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LLIFFJFJJ() {
        return this.LJJLJLI;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LLIIJI() {
        return this.LJJII;
    }

    @Override // X.InterfaceC2210301Bf2
    public final InterfaceC801310Vc1 LLIIZ() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LLJIJIL() {
        return this.LJJIII;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LLJJJJ() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC2210301Bf2
    public final C2209541Bdo LLJZ() {
        return this.LJLIIL;
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LLJZIJLIL() {
        return this.LJIL;
    }

    @Override // X.InterfaceC2210301Bf2
    public final String getAid() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final String getAppId() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final Context getContext() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LIZIZ(Account account) {
        C2210131Bel c2210131Bel = this.LJJ;
        c2210131Bel.getClass();
        synchronized (C2210131Bel.class) {
            try {
                if (c2210131Bel.LIZ != null) {
                    c2210131Bel.LIZ.LJJII = account;
                } else {
                    C0XCI c0xci = (C0XCI) c2210131Bel.LIZIZ();
                    Context contextLJ = c0xci.LJ();
                    if (contextLJ != null) {
                        c0xci.LJFF.LIZIZ(contextLJ).LIZIZ(account);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJI(Context context) {
        String name;
        boolean zLJI = MethodIDManager.LJI(202284);
        if (context instanceof Activity) {
            context.hashCode();
            onActivityResumed((Activity) context);
        } else {
            C2209791BeD c2209791BeD = this.LJJZZI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onResume context: ");
            if (context == null) {
                name = "null";
            } else {
                name = context.getClass().getName();
            }
            sbLIZ.append(name);
            c2209791BeD.LJIIZILJ(null, C2188811AlT.LIZIZ(sbLIZ), null, new Object[0]);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJII(String str) {
        if (this.LJIILIIL != null) {
            C2209911BeP c2209911BeP = this.LJIILIIL;
            String strLIZLLL = c2209911BeP.LLIZLLLIL.LIZLLL();
            if ((TextUtils.isEmpty(str) && !TextUtils.isEmpty(strLIZLLL)) || (!TextUtils.isEmpty(str) && !TextUtils.equals(str, strLIZLLL))) {
                c2209911BeP.LIZJ(str);
            }
            c2209911BeP.LLIZLLLIL.LIZLLL.LJIIZILJ = str;
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIIJ(String str) {
        LJJII("touch_point", str);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIIJJI(boolean z) {
        this.LJJIIZ = z;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIILIIL(Proxy proxy) {
        boolean z;
        this.LJIJJLI = proxy;
        if (proxy != null) {
            z = true;
        } else {
            z = false;
        }
        LLLIIL(Boolean.valueOf(z), "HTTP Proxy");
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIILJJIL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        C2210131Bel c2210131Bel = this.LJJ;
        Application application = this.LJIIJ;
        c2210131Bel.getClass();
        synchronized (C2210131Bel.class) {
            try {
                if (c2210131Bel.LIZ != null) {
                    c2210131Bel.LIZ.LJJI = jSONObject;
                } else {
                    C0XCI c0xci = (C0XCI) c2210131Bel.LIZIZ();
                    c0xci.getClass();
                    if (application == null) {
                        C844830XCf.LIZIZ("context is null when setAppTrack");
                    } else {
                        HashMap map = new HashMap();
                        map.put("app_track", C786410Ut5.J3(jSONObject));
                        c0xci.LJFF.LIZIZ(application).LJIIJ(application, map, false);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LJIILL(String str) {
        if (LLLFFI() != 0 && this.LJIILIIL != null) {
            return this.LJIILIIL.LJIIIIZZ(str, null);
        }
        return false;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIILLIIL(long j) {
        boolean zLJI = MethodIDManager.LJI(137841);
        if (this.LJIILIIL != null) {
            C2209911BeP c2209911BeP = this.LJIILIIL;
            if (c2209911BeP.LLJI != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jCurrentTimeMillis2 = j;
                for (AbstractC2209821BeG abstractC2209821BeG : (ArrayList) c2209911BeP.LLJI) {
                    if (abstractC2209821BeG instanceof C2209891BeN) {
                        C2209891BeN c2209891BeN = (C2209891BeN) abstractC2209821BeG;
                        if (jCurrentTimeMillis2 > 0) {
                            c2209891BeN.LJIIIZ = jCurrentTimeMillis2;
                        }
                        try {
                            c2209891BeN.LIZJ(12);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c2209911BeP.LLILLL.LJJZZI.LJIIZILJ(C2209911BeP.LLJL, "force report by sender:{} failed", null, c2209891BeN.LJIIIIZZ, th);
                        }
                        c2209891BeN.LJIIIZ = 0L;
                        if (j > 0) {
                            jCurrentTimeMillis2 = j - (System.currentTimeMillis() - jCurrentTimeMillis);
                            if (jCurrentTimeMillis2 <= 0) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIJ(InterfaceC2201401BDu interfaceC2201401BDu) {
        C2201391BDt c2201391BDt = this.LJJJLL;
        if (interfaceC2201401BDu != null) {
            c2201391BDt.LIZIZ.add(interfaceC2201401BDu);
        } else {
            c2201391BDt.getClass();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIL(EnumC2210521BfO enumC2210521BfO) {
        this.LJJJZ = enumC2210521BfO;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJ(boolean z) {
        InterfaceC844940XCq interfaceC844940XCq;
        Integer numLIZLLL = ((C0XCI) this.LJJ.LIZIZ()).LIZLLL();
        if (numLIZLLL != null && (interfaceC844940XCq = (InterfaceC844940XCq) C0XBH.LIZ(InterfaceC844940XCq.class, String.valueOf(numLIZLLL))) != null) {
            interfaceC844940XCq.getApi();
        }
        LLLIIL(Boolean.valueOf(z), "New User Mode");
        this.LJJJJLI.LJIIIIZZ("new_user_mode", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIFFI(boolean z) {
        this.LJJJIL = z;
        this.LJJJJLI.LJIIIIZZ("terminate_immediately_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIIJ(boolean z) {
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LLJILJILJ.obtainMessage(27, Boolean.valueOf(z)).sendToTarget();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIIZI(String str) {
        this.LJLI.LIZIZ = str;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIJ(String str) {
        if (this.LJIIL != null) {
            C2209771BeB c2209771BeB = this.LJIIL;
            synchronized (c2209771BeB) {
                Set setLIZJ = C2209771BeB.LIZJ(c2209771BeB.LIZLLL.LIZJ());
                Set setLIZJ2 = C2209771BeB.LIZJ(c2209771BeB.LJ.optString("ab_sdk_version"));
                setLIZJ2.removeAll(setLIZJ);
                setLIZJ2.addAll(C2209771BeB.LIZJ(str));
                C2209571Bdr c2209571Bdr = c2209771BeB.LIZLLL;
                c2209571Bdr.LJIILIIL.LJJZZI.LJIIIZ(0, C2209571Bdr.LJIJJLI, "setExternalAbVersion: {}", str);
                c2209571Bdr.LIZJ.edit().putString("external_ab_version", str).apply();
                c2209571Bdr.LJFF = null;
                StringBuilder sb = new StringBuilder();
                Iterator it2 = ((HashSet) setLIZJ2).iterator();
                while (it2.hasNext()) {
                    sb.append((String) it2.next());
                    if (it2.hasNext()) {
                        sb.append(",");
                    }
                }
                c2209771BeB.LJI(sb.toString());
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIJIIJI(boolean z) {
        this.LJJII = z;
        this.LJJJJLI.LJIIIIZZ("tourist_mode_event_enable", z);
        LLLIIL(Boolean.valueOf(z), "Tourist Event");
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIJIL(boolean z) {
        this.LJJLJ = z;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIL(boolean z) {
        this.LJJLIIIJLJLI = z;
        if (!this.LJJLIIIJLJLI) {
            CommonParamsWrapper commonParamsWrapperLIZIZ = LIZIZ(new Object[0]);
            synchronized (commonParamsWrapperLIZIZ) {
                C2209791BeD.LJIJJ().LJI(commonParamsWrapperLIZIZ.LIZIZ, "start to destroy common params wrapper...", new Object[0]);
                if (!commonParamsWrapperLIZIZ.LJ.isEmpty()) {
                    int size = commonParamsWrapperLIZIZ.LJ.size();
                    Iterator<T> it2 = commonParamsWrapperLIZIZ.LJ.values().iterator();
                    while (it2.hasNext()) {
                        for (LifecycleValueObserver lifecycleValueObserver : ((ConcurrentHashMap) it2.next()).values()) {
                            lifecycleValueObserver.getClass();
                            AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(lifecycleValueObserver, 199);
                            if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS129S0100000_29(awS578S0100000_34, 218));
                            } else {
                                awS578S0100000_34.invoke();
                                throw null;
                            }
                        }
                    }
                    commonParamsWrapperLIZIZ.LJ.clear();
                    C2209791BeD.LJIJJ().LJI(commonParamsWrapperLIZIZ.LIZIZ, "{} lifecycle observers has been destroyed...", Integer.valueOf(size));
                }
                if (!commonParamsWrapperLIZIZ.LIZLLL.isEmpty()) {
                    int size2 = commonParamsWrapperLIZIZ.LIZLLL.size();
                    Iterator<Map.Entry<String, InterfaceC2211321Bgg>> it3 = commonParamsWrapperLIZIZ.LIZLLL.entrySet().iterator();
                    while (it3.hasNext()) {
                        it3.next().getValue().clear();
                    }
                    commonParamsWrapperLIZIZ.LIZLLL.clear();
                    C2209791BeD.LJIJJ().LJI(commonParamsWrapperLIZIZ.LIZIZ, "{} biz params object has been cleared...", Integer.valueOf(size2));
                }
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJI(int i) {
        C2210041Bec c2210041Bec = this.LIZLLL;
        c2210041Bec.getClass();
        c2210041Bec.LIZJ = Math.min(i, 200);
        this.LJJJJLI.LJII(i, "max_cache_event_num");
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJJJ(Context context) {
        String name;
        if (context instanceof Activity) {
            LIZJ();
            return;
        }
        C2209791BeD c2209791BeD = this.LJJZZI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause context: ");
        if (context == null) {
            name = "null";
        } else {
            name = context.getClass().getName();
        }
        sbLIZ.append(name);
        c2209791BeD.LJIIZILJ(null, C2188811AlT.LIZIZ(sbLIZ), null, new Object[0]);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJJJL(boolean z) {
        this.LJJLIIIJL = z;
        this.LJJJJLI.LJIIIIZZ("custom_header_control_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJJLL(boolean z) {
        this.LJJIJIIJIL = z;
        this.LJJJJLI.LJIIIIZZ("insert_event_opt_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJLIIL(InterfaceC19397110uf interfaceC19397110uf) {
        C19397010ue c19397010ue = this.LIZJ;
        if (interfaceC19397110uf != null) {
            Iterator it2 = ((ConcurrentHashMap) c19397010ue.LIZ).entrySet().iterator();
            while (it2.hasNext()) {
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((Map.Entry) it2.next()).getValue();
                if (copyOnWriteArraySet != null) {
                    copyOnWriteArraySet.remove(interfaceC19397110uf);
                }
            }
            return;
        }
        c19397010ue.getClass();
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJLZIJ(String str) {
        ((CopyOnWriteArrayList) this.LJL).add(str);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJL(boolean z) {
        this.LJJLIL = z;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLIIIIJ(boolean z) {
        this.LJJJJI = z;
        this.LJJJJLI.LJIIIIZZ("bdinstall_event_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLIIIJ(boolean z) {
        this.LJJIIJZLJL = z;
        this.LJJJJLI.LJIIIIZZ("priority_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLIIIJILLIZJL(String str) {
        C2210131Bel c2210131Bel = this.LJJ;
        Application application = this.LJIIJ;
        c2210131Bel.getClass();
        synchronized (C2210131Bel.class) {
            try {
                if (c2210131Bel.LIZ != null) {
                    c2210131Bel.LIZ.LJIJJLI = str;
                } else {
                    C0XCI c0xci = (C0XCI) c2210131Bel.LIZIZ();
                    c0xci.getClass();
                    if (application == null) {
                        C844830XCf.LIZIZ("context is null when setUserAgent");
                    } else {
                        HashMap map = new HashMap();
                        map.put("user_agent", str);
                        c0xci.LJFF.LIZIZ(application).LJIIJ(application, map, false);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLIIIJJIZ(boolean z) {
        if (z) {
            AtomicInteger atomicInteger = this.LJJIIJ;
            atomicInteger.set(atomicInteger.get() | 2);
        } else {
            AtomicInteger atomicInteger2 = this.LJJIIJ;
            atomicInteger2.set(atomicInteger2.get() & (-3));
        }
        LLLIIL(Boolean.valueOf(z), "Tea Sampling");
        this.LJJJJLI.LJIIIIZZ("tea_sample_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLIIIJL(boolean z) {
        this.LJJLIIJ = z;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLIIJ(C2210461BfI c2210461BfI) {
        if (this.LJIILIIL != null) {
            C2209911BeP c2209911BeP = this.LJIILIIL;
            c2209911BeP.LLJILJIL = c2210461BfI;
            InterfaceC2209801BeE interfaceC2209801BeE = c2209911BeP.LL;
            C844630XBl c844630XBl = c2210461BfI.LJ;
            C0XCI c0xci = (C0XCI) ((C2210131Bel) interfaceC2209801BeE).LIZIZ();
            Context contextLJ = c0xci.LJ();
            if (contextLJ != null) {
                c0xci.LJFF.LIZIZ(contextLJ).LIZ(c844630XBl);
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLIL(boolean z) {
        this.LJJJJIZL = z;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLJ(C0XDM c0xdm) {
        C0XCI c0xci = (C0XCI) this.LJJ.LIZIZ();
        if (c0xci.LIZJ()) {
            C0XCH c0xch = c0xci.LJI;
            if (c0xch.LIZ == null && c0xdm != null) {
                c0xch.LIZ = c0xdm;
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLJLI(boolean z) {
        this.LJJJJ = z;
        this.LJJJJLI.LJIIIIZZ("pack_launch_desc", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJLL(boolean z) {
        this.LJJLJLI = z;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJZZI(int i) {
        this.LJJIJIL = Math.max(i, 1);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLIIIL(boolean z) {
        this.LJJI = z;
        LLLIIL(Boolean.valueOf(z), "Event User Id");
        this.LJJJJLI.LJIIIIZZ("event_uid_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLIIL(boolean z) {
        this.LJJLIIIJLLLLLLLZ = z;
        this.LJJJJLI.LJIIIIZZ("flush_threshold_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLIL(InterfaceC19397110uf interfaceC19397110uf) {
        this.LIZJ.LIZ(0, interfaceC19397110uf);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLJI(boolean z) {
        this.LJJIIZI = z;
        this.LJJJJLI.LJIIIIZZ("bg_session_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLJJLL(InterfaceC2211431Bgr interfaceC2211431Bgr) {
        this.LJJJJZI = interfaceC2211431Bgr;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLJL(long j) {
        if (this.LJIILIIL != null && this.LJIILIIL.LLJIJIL != null) {
            if (this.LJIILIIL.LLJIJIL.LIZ != j) {
                this.LJIILIIL.LLJIJIL.LIZ = j;
                return;
            }
            return;
        }
        this.LJJJJLL = Long.valueOf(j);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLJLJ(InterfaceC2211041BgE interfaceC2211041BgE) {
        C2210481BfK c2210481BfK = this.LJIJJ;
        if (c2210481BfK != null) {
            if (interfaceC2211041BgE != null) {
                c2210481BfK.LIZ.remove(interfaceC2211041BgE);
            } else {
                c2210481BfK.getClass();
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLJLLL(String str) {
        this.LJLI.LIZJ = str;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLL(int i) {
        boolean z;
        this.LJJJJZ = Integer.valueOf(i);
        C2209921BeQ c2209921BeQ = this.LJJJJLI;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        c2209921BeQ.LJIIIIZZ("disable_personalization_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLLJ(InterfaceC801310Vc1 interfaceC801310Vc1) {
        this.LJIIZILJ = interfaceC801310Vc1;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLLL(boolean z) {
        this.LJJIJIIJI = z;
        this.LJJJJLI.LJIIIIZZ("flush_async_default_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLLLL(boolean z) {
        this.LJLI.LIZ = z;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLLLLLL(InterfaceC2211191BgT interfaceC2211191BgT) {
        C2210581BfU c2210581BfU = this.LJJJJL;
        if (interfaceC2211191BgT == null) {
            c2210581BfU.getClass();
        } else {
            c2210581BfU.LIZ.add(interfaceC2211191BgT);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLZ(boolean z) {
        this.LJJLIIIJJIZ = z;
        this.LJJJJLI.LJIIIIZZ("event_param_control_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJZI(boolean z) {
        this.LJJLIIIJ = z;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJZL(InterfaceC2211051BgF interfaceC2211051BgF) {
        C2210431BfF c2210431BfF = this.LIZ;
        if (interfaceC2211051BgF != null) {
            c2210431BfF.LIZ.add(interfaceC2211051BgF);
        } else {
            c2210431BfF.getClass();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LL(boolean z) {
        this.LJJIII = z;
        LLLIIL(Boolean.valueOf(z), "Dau Fix");
        this.LJJJJLI.LJIIIIZZ("dau_fix", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLD(boolean z) {
        this.LJJJI = z;
        this.LJJJJLI.LJIIIIZZ("migrate_old_applog_data_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLFF(boolean z) {
        if (z) {
            AtomicInteger atomicInteger = this.LJJIIJ;
            atomicInteger.set(atomicInteger.get() | 1);
        } else {
            AtomicInteger atomicInteger2 = this.LJJIIJ;
            atomicInteger2.set(atomicInteger2.get() & (-2));
        }
        LLLIIL(Boolean.valueOf(z), "Event Sampling");
        this.LJJJJLI.LJIIIIZZ("normal_sample_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLFII(InterfaceC2201401BDu interfaceC2201401BDu) {
        C2201391BDt c2201391BDt = this.LJJJLL;
        if (interfaceC2201401BDu != null) {
            c2201391BDt.LIZIZ.remove(interfaceC2201401BDu);
        } else {
            c2201391BDt.getClass();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLFZ(InterfaceC2211181BgS interfaceC2211181BgS) {
        this.LJJJJJL = interfaceC2211181BgS;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIIIZ(InterfaceC2211401Bgo interfaceC2211401Bgo) {
        this.LJJL = interfaceC2211401Bgo;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIIL(boolean z) {
        this.LJIILJJIL.LLIZLLLIL = z;
        this.LJJJJLI.LJIIIIZZ("track_resume_event_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIL(Map<String, String> map) {
        C0XBN c0xbnLIZJ = this.LJJ.LIZJ();
        if (c0xbnLIZJ != null) {
            String str = c0xbnLIZJ.LL;
            if (!TextUtils.isEmpty(str)) {
                map.put("device_id", str);
            }
            String str2 = c0xbnLIZJ.LLILLJJLI;
            if (!TextUtils.isEmpty(str2)) {
                map.put("install_id", str2);
            }
            String str3 = c0xbnLIZJ.LLILLL;
            if (!TextUtils.isEmpty(str3)) {
                map.put("openudid", str3);
            }
            String str4 = c0xbnLIZJ.LLILZ;
            if (!TextUtils.isEmpty(str4)) {
                map.put("clientudid", str4);
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLILII(InterfaceC2211051BgF interfaceC2211051BgF) {
        C2210431BfF c2210431BfF = this.LIZ;
        if (interfaceC2211051BgF != null) {
            c2210431BfF.LIZ.remove(interfaceC2211051BgF);
        } else {
            c2210431BfF.getClass();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLILIL(long j) {
        this.LJJLL = j;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLILLIZIL(int i) {
        this.LJJIJL = Math.max(i, 100);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLILLJJLI(int i) {
        this.LJIJ = Integer.valueOf(i);
        this.LJJJJLI.LJII(i, "http_monitor_port");
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLILZ(boolean z) {
        this.LJJIFFI = z;
        this.LJJJJLI.LJIIIIZZ("tourist_mode", z);
        LLLIIL(Boolean.valueOf(z), "Tourist Mode");
    }

    @Override // X.InterfaceC2210301Bf2
    public final synchronized void LLILZIL(InterfaceC2211041BgE interfaceC2211041BgE) {
        if (this.LJIJJ == null) {
            this.LJIJJ = new C2210481BfK();
        }
        C2210481BfK c2210481BfK = this.LJIJJ;
        if (interfaceC2211041BgE != null) {
            c2210481BfK.LIZ.add(interfaceC2211041BgE);
        } else {
            c2210481BfK.getClass();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIZ(boolean z) {
        this.LJJLIIIJILLIZJL = z;
        this.LJJJJLI.LJIIIIZZ("event_forward_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJILLL(InterfaceC2211161BgQ interfaceC2211161BgQ) {
        this.LIZIZ.LIZ(0, interfaceC2211161BgQ);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJ(boolean z) {
        long j;
        this.LJIL = z;
        C2209921BeQ c2209921BeQ = this.LJJJJLI;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        c2209921BeQ.LJII(j, "encrypt_enable");
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJI(boolean z) {
        this.LJJIJ = z;
        this.LJJJJLI.LJIIIIZZ("bg_session_report_after_pause_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJIII(IBDAccountCallback iBDAccountCallback) {
        this.LJJJLIIL = iBDAccountCallback;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJIJIIJIL(InterfaceC844900XCm interfaceC844900XCm) {
        if (LJ() == null && this.LJJZZIII.compareAndSet(false, true)) {
            C20103613lK.LIZ.add(new C844910XCn(interfaceC844900XCm));
            LLLFF().LIZIZ();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJIJIL(String str) {
        ((CopyOnWriteArrayList) this.LJL).remove(str);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJJIL(boolean z) {
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LIZ(z, 18, 0L, null);
        }
        this.LJJJJLI.LJIIIIZZ("child_mode", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJJJJIL(boolean z) {
        this.LJJJLZIJ = z;
        this.LJJJJLI.LJIIIIZZ("isolate_enable", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJL(boolean z) {
        this.LJJJJLI.LL.LIZJ(z);
        this.LJJJJLI.LJIIIIZZ("monitor_debug_mode", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJJLIIIJLLLLLLLZ(int i) {
        this.LJJJJJ = Math.min(Math.max(1, i), 8);
        this.LJJJJLI.LJII(i, "max_request_once_report");
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJLILLLLZIIL(HashMap<String, Object> map) {
        C2210131Bel c2210131Bel = this.LJJ;
        if (c2210131Bel.LIZJ != null) {
            c2210131Bel.LIZJ.LIZ(map);
        } else {
            c2210131Bel.LJFF.putAll(map);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJLL(InterfaceC2209861BeK interfaceC2209861BeK) {
        this.LJIILLIIL = interfaceC2209861BeK;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJLLIL(String str) {
        if (!TextUtils.isEmpty(str)) {
            C2210131Bel c2210131Bel = this.LJJ;
            if (c2210131Bel.LIZJ != null) {
                C1BA2 c1ba2 = c2210131Bel.LIZJ;
                JSONObject jSONObjectLIZIZ = c1ba2.LIZIZ();
                if (jSONObjectLIZIZ != null && jSONObjectLIZIZ.has(str)) {
                    jSONObjectLIZIZ.remove(str);
                    JSONObject jSONObject = new JSONObject();
                    C2200271B9l.LIZLLL(jSONObject, jSONObjectLIZIZ);
                    c1ba2.LIZLLL(jSONObject);
                    return;
                }
                return;
            }
            c2210131Bel.LJFF.remove(str);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJLLL(InterfaceC2211161BgQ interfaceC2211161BgQ) {
        C2210181Beq c2210181Beq = this.LIZIZ;
        if (interfaceC2211161BgQ != null) {
            Iterator it2 = ((ConcurrentHashMap) c2210181Beq.LIZ).entrySet().iterator();
            while (it2.hasNext()) {
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((Map.Entry) it2.next()).getValue();
                if (copyOnWriteArraySet != null && copyOnWriteArraySet.contains(interfaceC2211161BgQ)) {
                    copyOnWriteArraySet.remove(interfaceC2211161BgQ);
                }
            }
            return;
        }
        c2210181Beq.getClass();
    }

    public final void LLLIIIL(AbstractC2209931BeR abstractC2209931BeR) {
        C2210811Bfr c2210811Bfr;
        int size;
        abstractC2209931BeR.LLJILJILJ = this.LJIIIZ;
        C2210731Bfj c2210731Bfj = this.LJLI;
        if (c2210731Bfj.LIZ) {
            c2210811Bfr = new C2210811Bfr(c2210731Bfj.LIZIZ, c2210731Bfj.LIZJ, c2210731Bfj.LIZLLL);
        } else {
            c2210811Bfr = null;
        }
        abstractC2209931BeR.LLJJJ = c2210811Bfr;
        if ((abstractC2209931BeR instanceof C2209941BeS) || (abstractC2209931BeR instanceof C2209961BeU) || (abstractC2209931BeR instanceof C2209981BeW)) {
            this.LJJJJLI.LIZIZ(EnumC2210021Bea.COLLECT_EVENT_COUNT, 1);
            int iLIZ = C2210101Bei.LIZ(this.LJJJJLI, abstractC2209931BeR);
            abstractC2209931BeR.LLJJIJIIJIL = iLIZ;
            if (iLIZ > 0) {
                C2210101Bei.LIZIZ(this.LJJJJLI, EnumC21646419na.PRE_PROCESS_START, abstractC2209931BeR);
            }
        }
        if (!this.LIZJ.LIZIZ(1)) {
            try {
                if (abstractC2209931BeR instanceof C2209941BeS) {
                    C2209941BeS c2209941BeS = (C2209941BeS) abstractC2209931BeR;
                    this.LIZJ.LIZJ(c2209941BeS.LLJL, c2209941BeS.LLJJL, c2209941BeS.LLJJJJLIIL, 1);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJJZZI.LJIILIIL(4, "notify event observerV2 before receive failed", th, new Object[0]);
                this.LJJJJLI.LJI("notify event observerV2 before receive failed", th, true);
            }
        }
        if (!this.LIZIZ.LIZIZ(1)) {
            try {
                if (abstractC2209931BeR instanceof C2209961BeU) {
                    C2209961BeU c2209961BeU = (C2209961BeU) abstractC2209931BeR;
                    this.LIZIZ.LIZJ(c2209961BeU.LLJJJJLIIL, c2209961BeU.LLJJL, 1, c2209961BeU.LLJLIL, c2209961BeU.LLJJLIIIJLLLLLLLZ, c2209961BeU.LLJL, c2209961BeU.LLJLILLLLZIIL);
                } else if (abstractC2209931BeR instanceof C2209941BeS) {
                    C2209941BeS c2209941BeS2 = (C2209941BeS) abstractC2209931BeR;
                    this.LIZIZ.LIZLLL(1, c2209941BeS2.LLJL, c2209941BeS2.LLJJJJLIIL);
                } else if (abstractC2209931BeR instanceof C2209981BeW) {
                    C2209981BeW c2209981BeW = (C2209981BeW) abstractC2209931BeR;
                    this.LIZIZ.LJ(1, c2209981BeW.LLJJL, c2209981BeW.LLJJJJLIIL);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.LJJZZI.LJIILIIL(4, "notify event observer before receive failed", th2, new Object[0]);
                this.LJJJJLI.LJI("notify event observer before receive failed", th2, true);
            }
        }
        if (this.LJIILIIL == null) {
            this.LIZLLL.LIZ(abstractC2209931BeR);
            if (abstractC2209931BeR.LLJJIJIIJIL > 0) {
                C2210101Bei.LIZIZ(this.LJJJJLI, EnumC21646419na.CACHED_BEFORE_HANDLE, abstractC2209931BeR);
            }
        } else {
            C2209911BeP c2209911BeP = this.LJIILIIL;
            c2209911BeP.getClass();
            if (abstractC2209931BeR.LLILLJJLI == 0) {
                c2209911BeP.LLILLL.LJJZZI.LJIIZILJ(C2209911BeP.LLJL, "receive zero ts", null, new Object[0]);
            }
            synchronized (c2209911BeP.LLILZLL) {
                try {
                    size = c2209911BeP.LLILZLL.size();
                    c2209911BeP.LLILZLL.add(abstractC2209931BeR);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
            if (abstractC2209931BeR.LLJJIJIIJIL > 0) {
                C2210101Bei.LIZIZ(c2209911BeP.LLILLL.LJJJJLI, EnumC21646419na.DATA_LIST_ADDED, abstractC2209931BeR);
            }
            boolean z = abstractC2209931BeR instanceof C2209991BeX;
            if (c2209911BeP.LLILLL.LJJIJIIJIL) {
                if (!z && (size + 1) % c2209911BeP.LLILLL.LJJIJIL != 0) {
                    if (!c2209911BeP.LLJILJILJ.hasMessages(4)) {
                        C786410Ut5.LJLJJI(4, c2209911BeP.LLILLL.LJJIJL, c2209911BeP.LLJILJILJ);
                    }
                } else {
                    c2209911BeP.LLJILJILJ.removeMessages(4);
                    C786410Ut5.LJLILLLLZI(c2209911BeP.LLJILJILJ, 4);
                }
            } else if (size % 5 == 0 || z) {
                c2209911BeP.LLJILJILJ.removeMessages(4);
                if (size == 0 && !z) {
                    C786410Ut5.LJLJJI(4, 200L, c2209911BeP.LLJILJILJ);
                } else {
                    C786410Ut5.LJLILLLLZI(c2209911BeP.LLJILJILJ, 4);
                }
            }
            if (abstractC2209931BeR.LLJJIJIIJIL > 0) {
                C2210101Bei.LIZIZ(c2209911BeP.LLILLL.LJJJJLI, EnumC21646419na.PRE_PROCESS_END, abstractC2209931BeR);
            }
            if (z) {
                C2210141Bem c2210141Bem = c2209911BeP.LLJJJJJIL;
                c2210141Bem.getClass();
                if (((C2209991BeX) abstractC2209931BeR).LLJJJJLIIL > 0) {
                    C786410Ut5.LJLJJI(9999, 500L, c2210141Bem.LLILLJJLI);
                    c2210141Bem.LLILZ = Math.max(0, c2210141Bem.LLILZ - 1);
                } else {
                    c2210141Bem.LLILLJJLI.removeMessages(9999);
                    c2210141Bem.LLILZ++;
                    if (c2210141Bem.LLILLL) {
                        c2210141Bem.LLILLL = false;
                        c2210141Bem.LL.LJJZZI.LJIIIIZZ("App first to frontend...", new Object[0]);
                    }
                    if (c2210141Bem.LLILZIL) {
                        c2210141Bem.LLILZIL = false;
                        c2210141Bem.LL.LJJZZI.LJIIIIZZ("App back to frontend...", new Object[0]);
                        if (c2210141Bem.LL.LJ() != null) {
                            c2210141Bem.LL.LJ().getClass();
                        }
                    }
                }
            }
        }
        if (abstractC2209931BeR.LJIILIIL() > 1048576) {
            this.LJJJJLI.LJI("receive data too big (>1MB)", new Throwable(abstractC2209931BeR.toString()), true);
        }
        C2210111Bej.LIZLLL(abstractC2209931BeR, "event_receive");
    }

    @Override // X.InterfaceC2210301Bf2
    public final void onActivityResumed(Activity activity) {
        if (activity != null) {
            this.LJIILJJIL.onActivityResumed(activity);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public void onEvent(String str) {
        LJJJJI("event_v1", str, null, 0L, 0L, null);
    }

    @Override // X.InterfaceC2210301Bf2
    public void onEventV3(String str) {
        LLLIIII(null, null, str, null);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIIIZ(String str, String str2) {
        LLLIIIIL(str, str2, false);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIIL(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.LJIILJJIL.LIZ(str, i);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIJJLI(String str, String str2) {
        if (this.LJIILIIL != null) {
            C2209911BeP c2209911BeP = this.LJIILIIL;
            InterfaceC2209801BeE interfaceC2209801BeE = c2209911BeP.LL;
            Application application = c2209911BeP.LLILLL.LJIIJ;
            C0XCI c0xci = (C0XCI) ((C2210131Bel) interfaceC2209801BeE).LIZIZ();
            c0xci.getClass();
            HashMap map = new HashMap();
            map.put("app_language", str);
            map.put("app_region", str2);
            c0xci.LJFF.LIZIZ(application).LJIIJ(application, map, true);
            c2209911BeP.LJIILIIL(c2209911BeP.LLILZIL, 0);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJII(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            HashMap map = new HashMap();
            map.put(str, obj);
            C2210131Bel c2210131Bel = this.LJJ;
            if (c2210131Bel.LIZJ != null) {
                c2210131Bel.LIZJ.LIZ(map);
            } else {
                c2210131Bel.LJFF.putAll(map);
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIIJZLJL(long j, InterfaceC845020XCy interfaceC845020XCy) {
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LIZ(false, 20, j, interfaceC845020XCy);
        }
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.1BeA] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC2210301Bf2
    public final void LJJLIIIJJI(Context context, final C2210081Beg c2210081Beg) {
        String str;
        synchronized (C2209901BeO.class) {
            try {
                if (!TextUtils.isEmpty(c2210081Beg.LIZ)) {
                    if (!C1BF5.LIZJ(c2210081Beg.LIZ)) {
                        C2209791BeD c2209791BeD = this.LJJZZI;
                        String str2 = c2210081Beg.LIZ;
                        c2209791BeD.LIZ = str2;
                        ((ConcurrentHashMap) AbstractC20103413lI.LIZJ).put(str2, c2209791BeD);
                        c2209791BeD.LJIIIIZZ("Current logger bind to appId {}", str2);
                        this.LJIIIZ = c2210081Beg.LIZ;
                        this.LJIIJ = (Application) C786410Ut5.N3(context);
                        if (c2210081Beg.LJJIIJ && this.LJJZZIII.compareAndSet(false, true)) {
                            InterfaceC844900XCm interfaceC844900XCm = c2210081Beg.LJ;
                            if (interfaceC844900XCm != null) {
                                ((ConcurrentHashMap) C20103613lK.LIZIZ).put(this.LJIIIZ, new C844910XCn(interfaceC844900XCm));
                            } else {
                                ((ConcurrentHashMap) C20103613lK.LIZIZ).put(this.LJIIIZ, new InterfaceC20103813lM(this) { // from class: X.13lL
                                    public final C2209901BeO LIZ;

                                    {
                                        this.LIZ = this;
                                        C20103313lH c20103313lH = new C20103313lH();
                                        String str3 = this.LJIIIZ;
                                        C20103113lF c20103113lF = c20103313lH.LIZ;
                                        c20103113lF.LIZ = str3;
                                        c20103113lF.LIZJ = 1;
                                        String name = C786410Ut5.u3().getName();
                                        C20103113lF c20103113lF2 = c20103313lH.LIZ;
                                        c20103113lF2.LIZIZ = name;
                                        c20103113lF2.LJFF = "Console logger is ready.";
                                        LIZ(c20103113lF2);
                                    }

                                    @Override // X.InterfaceC20103813lM
                                    public final void LIZ(C20103113lF c20103113lF) {
                                        if (!this.LIZ.LLLII()) {
                                        }
                                    }
                                });
                            }
                        }
                        this.LJJZZI.LJIIJ("App:{} init begin...", this.LJIIIZ);
                        if (TextUtils.isEmpty(c2210081Beg.LJJI)) {
                            String strLIZIZ = C1BF5.LIZIZ(this, "applog_stats");
                            if (!TextUtils.isEmpty(strLIZIZ)) {
                                c2210081Beg.LJJI = strLIZIZ;
                            }
                        }
                        if (!C2210111Bej.LIZIZ()) {
                            C2210111Bej.LIZJ("init_begin", new InterfaceC800590Var() { // from class: X.1BeY
                                @Override // X.InterfaceC800590Var
                                public final Object LIZ() {
                                    C844660XBo c844660XBo;
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("appId", c2210081Beg.LIZ);
                                        jSONObject.put("channel", c2210081Beg.LIZJ);
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("AppLog Version", "5.7.17-bugfix.2");
                                        jSONObject2.put("AppLog Region", "global");
                                        jSONObject2.put("API Encrypt", this.LIZIZ.LJIL);
                                        int i = C2209781BeC.LIZ;
                                        jSONObject2.put("Debug Log", false);
                                        jSONObject2.put("Custom Log", c2210081Beg.LJ != null);
                                        jSONObject2.put("Auto Start", c2210081Beg.LIZIZ);
                                        jSONObject2.put("Auto Active", c2210081Beg.LJIJJLI);
                                        c2210081Beg.getClass();
                                        jSONObject2.put("Silence", false);
                                        jSONObject2.put("Sp Name", c2210081Beg.LJJI);
                                        jSONObject2.put("Db Name", c2210081Beg.LIZ());
                                        c2210081Beg.getClass();
                                        jSONObject2.put("Lifycycle", false);
                                        jSONObject2.put("Disable Personalization", this.LIZIZ.LJJJJZ != null && this.LIZIZ.LJJJJZ.intValue() == 1);
                                        jSONObject2.put("Minor Version", c2210081Beg.LJIIZILJ);
                                        jSONObject2.put("Version Code", String.valueOf(c2210081Beg.LJIILJJIL));
                                        jSONObject2.put("Version Name", c2210081Beg.LJIIL);
                                        jSONObject2.put("App Name", c2210081Beg.LJIIJ);
                                        jSONObject2.put("Process", c2210081Beg.LJIIIIZZ == 1 ? "main" : "child");
                                        jSONObject2.put("Region", c2210081Beg.LJFF);
                                        jSONObject2.put("Language", c2210081Beg.LIZLLL);
                                        c2210081Beg.getClass();
                                        jSONObject2.put("Play Session", false);
                                        jSONObject2.put("Event Sampling", (this.LIZIZ.LLLFFI() & 1) > 0);
                                        jSONObject2.put("Tea Sampling", (this.LIZIZ.LLLFFI() & 2) > 0);
                                        jSONObject2.put("Event Priority", this.LIZIZ.LJJIIJZLJL);
                                        jSONObject2.put("Event User Id", this.LIZIZ.LJJI);
                                        jSONObject2.put("Tourist Mode", this.LIZIZ.LJJIFFI);
                                        jSONObject2.put("Tourist Event", this.LIZIZ.LJJII);
                                        jSONObject2.put("Dau Fix", this.LIZIZ.LJJIII);
                                        jSONObject2.put("HTTP Proxy", this.LIZIZ.LJIJJLI != null);
                                        jSONObject2.put("EXP Batch Interval", this.LIZIZ.LJJLI);
                                        jSONObject2.put("Forward Event", this.LIZIZ.LJJLIIIJILLIZJL);
                                        jSONObject2.put("Terminate Immediately", this.LIZIZ.LJJJIL);
                                        if (c2210081Beg.LJIIJJI != null) {
                                            ArrayList arrayList = new ArrayList();
                                            C844630XBl c844630XBl = c2210081Beg.LJIIJJI.LJ;
                                            if (c844630XBl != null && (c844660XBo = c844630XBl.LLILLJJLI) != null) {
                                                if (!TextUtils.isEmpty(c844660XBo.LL)) {
                                                    arrayList.add(c2210081Beg.LJIIJJI.LJ.LLILLJJLI.LL);
                                                }
                                                if (!TextUtils.isEmpty(c2210081Beg.LJIIJJI.LJ.LLILLJJLI.LLILLJJLI)) {
                                                    arrayList.add(c2210081Beg.LJIIJJI.LJ.LLILLJJLI.LLILLJJLI);
                                                }
                                            }
                                            String[] strArr = c2210081Beg.LJIIJJI.LIZ;
                                            if (strArr != null && strArr.length > 0) {
                                                arrayList.add(TextUtils.join(";", strArr));
                                            }
                                            if (!TextUtils.isEmpty(c2210081Beg.LJIIJJI.LIZJ)) {
                                                arrayList.add(c2210081Beg.LJIIJJI.LIZJ);
                                            }
                                            if (!TextUtils.isEmpty(c2210081Beg.LJIIJJI.LIZJ)) {
                                                arrayList.add(c2210081Beg.LJIIJJI.LIZJ);
                                            }
                                            jSONObject2.put("Server Domain", TextUtils.join("、", arrayList));
                                        } else {
                                            jSONObject2.put("Server Domain", "default");
                                        }
                                        jSONObject.put("config", jSONObject2);
                                        return jSONObject;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        return jSONObject;
                                    }
                                }
                            });
                        }
                        this.LJIIJJI = new C2209571Bdr(this, this.LJIIJ, c2210081Beg);
                        if (this.LJJJJZI == null) {
                            this.LJJJJZI = new C2210151Ben(this, this.LJIIJJI);
                        }
                        this.LJIIL = new C2209771BeB(this, this.LJIIJJI, this.LJJ);
                        this.LJIILIIL = new C2209911BeP(this, this.LJIIJJI, this.LJIIL, this.LJJ, this.LIZLLL, this.LJLIIIL);
                        this.LJIIIIZZ = 1;
                        this.LJIILL = c2210081Beg.LIZIZ;
                        if (this.LJJJJLL != null) {
                            LJLJL(this.LJJJJLL.longValue());
                            this.LJJJJLL = null;
                        }
                        if (this.LJJIIZ) {
                            String[] strArr = this.LJIILIIL.LJII().LIZ;
                            String str3 = this.LJIIIZ;
                            if (strArr.length > 0) {
                                str = strArr[0];
                            } else {
                                str = "";
                            }
                            this.LJJLIIIIJ = new PriorityWrapper(context, new C2192031Aqf(str3, str, c2210081Beg.LJJIIJ, this.LJJI, this.LJIL, new PriorityCallbackImpl(this), new PriorityEventMetaFactory(this) { // from class: X.1BeA
                                public final C2209901BeO LIZ;

                                @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
                                public final long eventId() {
                                    return C830270Whd.LIZ.incrementAndGet();
                                }

                                @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
                                public final long eventIndex() {
                                    return this.LIZ.LLLFZ();
                                }

                                @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
                                public final int nt() {
                                    return C786410Ut5.e3(this.LIZ.LJIIJ).getValue();
                                }

                                /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
                                @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final X.C1B0W user() {
                                    /*
                                        r13 = this;
                                        X.1BeO r1 = r13.LIZ
                                        X.1BeP r0 = r1.LJIILIIL
                                        r10 = 0
                                        if (r0 == 0) goto L62
                                        X.1BeP r0 = r1.LJIILIIL
                                        com.bytedance.applog.engine.Session r0 = r0.LLJIJIL
                                        long r8 = r0.LIZ
                                    Le:
                                        X.1BeO r0 = r13.LIZ
                                        com.bytedance.applog.IBDAccountCallback r2 = r0.LJJJLIIL
                                        X.1BeO r1 = r13.LIZ
                                        X.1BeP r0 = r1.LJIILIIL
                                        if (r0 == 0) goto L60
                                        X.1BeP r0 = r1.LJIILIIL
                                        com.bytedance.applog.engine.Session r4 = r0.LLJIJIL
                                    L1c:
                                        if (r2 == 0) goto L5c
                                        android.util.Pair r3 = r2.getOdinUserInfo()
                                        java.lang.Object r0 = r3.second
                                        java.lang.Long r0 = (java.lang.Long) r0
                                        long r1 = r0.longValue()
                                        int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                                        r5 = 1
                                        if (r0 <= 0) goto L4d
                                        java.lang.Object r0 = r3.second
                                        java.lang.Long r0 = (java.lang.Long) r0
                                        long r10 = r0.longValue()
                                        java.lang.Object r0 = r3.first
                                        java.lang.Integer r0 = (java.lang.Integer) r0
                                        int r7 = r0.intValue()
                                        r8 = r10
                                        r6 = 1
                                    L41:
                                        X.1B0W r4 = new X.1B0W
                                        X.1BeO r0 = r13.LIZ
                                        java.lang.String r12 = r0.LJIIZILJ()
                                        r4.<init>(r5, r6, r7, r8, r10, r12)
                                        return r4
                                    L4d:
                                        if (r4 == 0) goto L5c
                                        int r0 = r4.LIZLLL
                                        if (r0 != 0) goto L5c
                                        long r10 = r4.LIZIZ
                                        int r7 = r4.LIZJ
                                        int r5 = r4.LIZLLL
                                        int r6 = r4.LJ
                                        goto L41
                                    L5c:
                                        r5 = 0
                                        r6 = 0
                                        r7 = 0
                                        goto L41
                                    L60:
                                        r4 = 0
                                        goto L1c
                                    L62:
                                        r8 = 0
                                        goto Le
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C2209761BeA.user():X.1B0W");
                                }

                                @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
                                public final String abSdkVersion() {
                                    long j = user().LIZIZ;
                                    if (j <= 0) {
                                        return null;
                                    }
                                    C2209901BeO c2209901BeO = this.LIZ;
                                    String.valueOf(j);
                                    return c2209901BeO.LLLF();
                                }

                                {
                                    this.LIZ = this;
                                }

                                @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
                                public final int sentryStainedValue(String str4) {
                                    C2209921BeQ c2209921BeQ = this.LIZ.LJJJJLI;
                                    if (!c2209921BeQ.LJFF() || !c2209921BeQ.LIZLLL(str4)) {
                                        return 0;
                                    }
                                    if (c2209921BeQ.LL.LJIILJJIL) {
                                        return 3;
                                    }
                                    return 1;
                                }
                            }));
                        }
                        if (c2210081Beg.LJIL) {
                            this.LJJJJLI.LJII(1L, "congestion_enable");
                        }
                        if (c2210081Beg.LJJIFFI) {
                            this.LJJJJLI.LJII(1L, "event_filter_enable");
                        }
                        String str4 = this.LJIIIZ;
                        if (!C2210111Bej.LIZIZ() && !C2200271B9l.LJI("init_end")) {
                            C800570Vap.LLILZIL.LIZIZ(new Object[0]).LIZLLL(str4, C2210111Bej.LJ("init_end"));
                        }
                        this.LJJZZI.LJIIJ("App:{} init end.", this.LJIIIZ);
                        C2209571Bdr c2209571Bdr = this.LJIIJJI;
                        c2209571Bdr.getClass();
                        if (!C2210111Bej.LIZIZ()) {
                            C2210111Bej.LIZJ("remote_settings", new C2209581Bds(c2209571Bdr));
                        }
                    } else {
                        throw new IllegalStateException("The app id is init already!");
                    }
                } else {
                    throw new IllegalStateException("App id must not be empty!");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJZZIII(boolean z, String str) {
        if (TextUtils.isEmpty(this.LJIIIZ)) {
            this.LJJZZI.LJII("Not init before change event sender", new Object[0]);
            return;
        }
        C1BF3.LJI(this.LJIIJ, this.LJIIIZ, z);
        if (!TextUtils.isEmpty(str)) {
            C1BF3.LJ(this.LJIIIZ, str);
        }
        this.LJJJJLI.LJIIIIZZ("et_enable", z);
        C2209921BeQ c2209921BeQ = this.LJJJJLI;
        if (c2209921BeQ.LL.LIZIZ) {
            C2209791BeD.LJIJJ().LJIIIZ(8, C2209921BeQ.LLJILJILJ, "setFeature string {} = {}", "et_host", str);
            synchronized (c2209921BeQ.LLJILJIL) {
                try {
                    try {
                        c2209921BeQ.LLJILJIL.put("et_host", str);
                    } finally {
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJL(String str, int i) {
        this.LJJJJLI.LIZ(i, str);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLI(List<String> list, boolean z) {
        long j;
        int i;
        AbstractC2194001Atq c2193981Ato;
        AbstractC2194001Atq abstractC2194001Atq = null;
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                if (z) {
                    c2193981Ato = new C2193991Atp(hashSet, null);
                } else {
                    c2193981Ato = new C2193981Ato(hashSet, null);
                }
                abstractC2194001Atq = c2193981Ato;
            }
        }
        this.LJIJI = abstractC2194001Atq;
        C2209921BeQ c2209921BeQ = this.LJJJJLI;
        if (list != null) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            j = i;
        } else {
            j = 0;
        }
        c2209921BeQ.LJII(j, "custom_event_filter");
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIIII(int i, InterfaceC2211161BgQ interfaceC2211161BgQ) {
        this.LIZIZ.LIZ(i, interfaceC2211161BgQ);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIIIILZ(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject.length() > 0) {
            try {
                LLLIIIL(new C2209981BeW(this.LJIIIZ, str, jSONObject));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (this.LJJJJLI.LJ(str)) {
                    this.LJJJJLI.LJIIL(EnumC21646419na.PARAMS_INVALID_DROP, str, String.valueOf(C830270Whd.LIZ.incrementAndGet()), System.currentTimeMillis(), EnumC2176421AFs.LOG_DATA);
                }
                this.LJJZZI.LJIIZILJ(null, "call onEventData get exception: ", e, new Object[0]);
                return;
            }
        }
        this.LJJZZI.LJII("call onEventData with invalid params, return", new Object[0]);
    }

    @Override // X.InterfaceC2210301Bf2
    public final boolean LLIIIL(String str, JSONObject jSONObject) {
        if (LLLFFI() != 0 && this.LJIILIIL != null) {
            return this.LJIILIIL.LJIIIIZZ(str, jSONObject);
        }
        return false;
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIILII(String str, Throwable th) {
        this.LJJJJLI.LJI(str, th, true);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIILZL(int i, InterfaceC19397110uf interfaceC19397110uf) {
        this.LIZJ.LIZ(i, interfaceC19397110uf);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLILLL(String str, String str2) {
        LLLIIIIL(str, str2, true);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLIZLLLIL(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            this.LJJLIIIJJI.remove(str);
        } else {
            this.LJJLIIIJJI.put(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // X.InterfaceC2210301Bf2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJ(java.lang.String r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r5 = 0
            if (r8 == 0) goto L37
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L37
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.Set r0 = r8.keySet()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L35
        L16:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L50
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r8.get(r1)     // Catch: java.lang.OutOfMemoryError -> L27 java.lang.Exception -> L2c java.lang.Throwable -> L35
            goto L31
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L35
            goto L30
        L2c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L35
        L30:
            r0 = r5
        L31:
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L35
            goto L16
        L35:
            r3 = move-exception
            goto L3b
        L37:
            r4 = r5
            goto L50
        L39:
            r3 = move-exception
            r4 = r5
        L3b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.1BeD r2 = r6.LJJZZI
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "parse bundle params failed"
            r2.LJIIZILJ(r5, r0, r3, r1)
            X.1BeQ r2 = r6.LJJJJLI
            X.1Bea r1 = X.EnumC2210021Bea.JSON_ERROR_COUNT
            r0 = 1
            r2.LIZIZ(r1, r0)
        L50:
            r6.LLLIIII(r5, r5, r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209901BeO.LLJJJ(java.lang.String, android.os.Bundle):void");
    }

    public final void LLLIIL(final Object obj, final String str) {
        if (!C2210111Bej.LIZIZ() && !TextUtils.isEmpty(this.LJIIIZ)) {
            C2210111Bej.LIZJ("update_config", new InterfaceC800590Var() { // from class: X.13lN
                @Override // X.InterfaceC800590Var
                public final Object LIZ() {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("appId", this.LIZJ.LJIIIZ);
                        jSONObject2.put(str, obj);
                        jSONObject.put("config", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return jSONObject;
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void onEvent(String str, String str2) {
        LJJJJI("event_v1", str, str2, 0L, 0L, null);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void onEventV3(String str, JSONObject jSONObject) {
        LLLIIII(null, null, str, jSONObject);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJIIIIZZ(boolean z, long j, InterfaceC845020XCy interfaceC845020XCy) {
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LIZ(z, 19, j, interfaceC845020XCy);
        }
        this.LJJJJLI.LJIIIIZZ("child_mode", z);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJLJJI(JSONObject jSONObject, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.LJJZZI.LJII("event name is empty", new Object[0]);
        } else {
            LLLIIIL(new C2209941BeS(this.LJIIIZ, str, null, jSONObject, z));
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLI(String str, String str2, int i) {
        if (i < 0) {
            this.LJJZZI.LJII("interval must not less than 0", new Object[0]);
            return;
        }
        if (this.LJJLI == null) {
            this.LJJLI = new JSONObject();
        }
        try {
            this.LJJLI.put("interval", i);
            this.LJJLI.put("caller", str);
            this.LJJLI.put("unique_key", str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJJZZI.LJIIZILJ(null, "json build ExpectedBatchInterval failed", th, new Object[0]);
            this.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
        }
        C2209921BeQ c2209921BeQ = this.LJJJJLI;
        JSONObject jSONObjectLJ = C2200271B9l.LJ(this.LJJLI);
        if (c2209921BeQ.LL.LIZIZ) {
            C2209791BeD.LJIJJ().LJIIIZ(8, C2209921BeQ.LLJILJILJ, "setFeature json {} = {}", "expected_batch_interval_config", jSONObjectLJ);
            synchronized (c2209921BeQ.LLJILJIL) {
                try {
                    try {
                        c2209921BeQ.LLJILJIL.put("expected_batch_interval_config", jSONObjectLJ);
                    } finally {
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLJILJILJ(HashSet<String> hashSet, int i, int i2) {
        this.LJJIL = hashSet;
        this.LJJIZ = i;
        this.LJJJ = i2;
        this.LJJIJLIJ = true;
        if (this.LJIILIIL != null) {
            this.LJIILIIL.LLJILJILJ.obtainMessage(26, Boolean.TRUE).sendToTarget();
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final <T> T LLJL(String str, T t, Class<T> cls) {
        T tCast = null;
        if (this.LJIIL == null) {
            return null;
        }
        C2209771BeB c2209771BeB = this.LJIIL;
        C2209831BeH c2209831BeH = c2209771BeB.LJI.LJ;
        JSONObject jSONObject = c2209771BeB.LJ;
        if (jSONObject == null) {
            return (T) c2209831BeH.LIZ.LLJL(str, t, cls);
        }
        c2209831BeH.getClass();
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && cls != null) {
            try {
                tCast = cls.cast(objOpt);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c2209831BeH.LIZ.LJJZZI.LJIIZILJ(Collections.singletonList("ApiParamsUtil"), "getValue cast failed", th, new Object[0]);
            }
        }
        if (tCast == null) {
            return t;
        }
        return tCast;
    }

    public final void LLLIIIIL(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.LJJZZI.LJII("event name is empty", new Object[0]);
        } else {
            LLLIIIL(new C2209941BeS(this.LJIIIZ, str, str2, null, z));
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIJLIJ(View view, String str, String str2, JSONObject jSONObject) {
        LLLIIII(view, str, str2, jSONObject);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJ(Context context, Map<String, String> map, boolean z, C0XDP c0xdp) {
        C0XCI c0xci = (C0XCI) this.LJJ.LIZIZ();
        if (c0xci.LIZJ()) {
            c0xci.LJI.LIZIZ(context, z, map, c0xdp);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final String LJLILLLLZI(Context context, String str, boolean z, C0XDP c0xdp) {
        return LLJ(context, new StringBuilder(str), z, c0xdp);
    }

    @Override // X.InterfaceC2210301Bf2
    public final String LLJ(Context context, StringBuilder sb, boolean z, C0XDP c0xdp) {
        C0XCI c0xci = (C0XCI) this.LJJ.LIZIZ();
        if (c0xci.LIZJ()) {
            return c0xci.LJI.LIZ(context, sb, z, c0xdp);
        }
        return null;
    }

    public final void LLLIIII(View view, String str, String str2, JSONObject jSONObject) {
        C1904207d2.LIZ.LIZIZ(str2, jSONObject);
        if (((Boolean) C0VR7.LIZIZ(str2, jSONObject).getFirst()).booleanValue()) {
            if (TextUtils.isEmpty(str2)) {
                this.LJJZZI.LJII("event name is empty", new Object[0]);
                return;
            }
            if (this.LJJLJ) {
                if (view != null) {
                    InterfaceC19919212wg interfaceC19919212wg = C19919012we.LIZ;
                    if (str == null) {
                        str = "custom";
                    }
                    new Pair(str, view);
                    interfaceC19919212wg.LIZ(jSONObject);
                } else {
                    C19919012we.LIZ.LIZ(jSONObject);
                }
            }
            LLLIIIL(new C2209941BeS(this.LJIIIZ, str2, LLLIILIL(EnumC2176421AFs.V3_EVENT, str2, null, jSONObject)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.1BeD] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.1BeD] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String LLLIILIL(EnumC2176421AFs enumC2176421AFs, String str, String str2, JSONObject jSONObject) {
        boolean z;
        ?? r6 = 0;
        J3 = 0;
        ?? J3 = 0;
        if (jSONObject == null) {
            return null;
        }
        try {
            return C786410Ut5.J3(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209791BeD c2209791BeD = this.LJJZZI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("event toString failed ");
            sbLIZ.append(str);
            sbLIZ.append(", label: ");
            sbLIZ.append(str2);
            c2209791BeD.LJIIZILJ(null, C2188811AlT.LIZIZ(sbLIZ), th, new Object[0]);
            JSONObject jSONObjectLJ = C2200271B9l.LJ(jSONObject);
            if (jSONObjectLJ != null) {
                C2210081Beg c2210081BegLJ = LJ();
                if (c2210081BegLJ != null && "local_test".equalsIgnoreCase(c2210081BegLJ.LIZJ)) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    J3 = C786410Ut5.J3(jSONObjectLJ);
                    return J3;
                } catch (OutOfMemoryError e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LJJJJLI.LIZIZ(EnumC2210021Bea.MEM_ERROR_COUNT, 1);
                    if (z) {
                        if (this.LJJJJLI.LJ(str)) {
                            this.LJJJJLI.LJIIL(EnumC21646419na.PARAMS_INVALID_DROP, str, String.valueOf(C830270Whd.LIZ.incrementAndGet()), System.currentTimeMillis(), EnumC2176421AFs.V3_EVENT);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("event toString OOM tag: ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", label: ");
                        sbLIZ2.append(str2);
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e);
                    }
                    ?? r3 = this.LJJZZI;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("event toString OOM tag: ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", label: ");
                    sbLIZ3.append(str2);
                    r3.LJIIZILJ(J3, C2188811AlT.LIZIZ(sbLIZ3), e, new Object[0]);
                    r6 = J3;
                    return r6;
                } catch (StackOverflowError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    this.LJJJJLI.LIZIZ(EnumC2210021Bea.SOF_ERROR_COUNT, 1);
                    if (z) {
                        if (this.LJJJJLI.LJ(str)) {
                            this.LJJJJLI.LJIIL(EnumC21646419na.PARAMS_INVALID_DROP, str, String.valueOf(C830270Whd.LIZ.incrementAndGet()), System.currentTimeMillis(), enumC2176421AFs);
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("event toString stack overflow tag: ");
                        sbLIZ4.append(str);
                        sbLIZ4.append(", label: ");
                        sbLIZ4.append(str2);
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4), e2);
                    }
                    ?? r32 = this.LJJZZI;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("event toString stack overflow tag: ");
                    sbLIZ5.append(str);
                    sbLIZ5.append(", label: ");
                    sbLIZ5.append(str2);
                    r32.LJIIZILJ(J3, C2188811AlT.LIZIZ(sbLIZ5), e2, new Object[0]);
                    return J3;
                } catch (ConcurrentModificationException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    this.LJJJJLI.LIZIZ(EnumC2210021Bea.CONCURRENT_MODIFY_ERROR_COUNT, 1);
                    try {
                        return C786410Ut5.J3(jSONObjectLJ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        if (this.LJJJJLI.LJ(str)) {
                            this.LJJJJLI.LJIIL(EnumC21646419na.PARAMS_INVALID_DROP, str, String.valueOf(C830270Whd.LIZ.incrementAndGet()), System.currentTimeMillis(), enumC2176421AFs);
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("event params exception tag: ");
                        sbLIZ6.append(str);
                        sbLIZ6.append(", label: ");
                        sbLIZ6.append(str2);
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ6), th2);
                    }
                }
            }
            return r6;
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIII(String str, JSONObject jSONObject, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            this.LJJZZI.LJII("both second appid and second app name is empty, return", new Object[0]);
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("second_app_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            jSONObject.put("params_for_special", "second_app");
            jSONObject.put("second_appid", str2);
            jSONObject.put("second_appname", str3);
            jSONObject.put("product_type", str4);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJJZZI.LJIIZILJ(null, "prepare params failed", th, new Object[0]);
            this.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
        }
        LLLIIII(null, null, strLIZIZ, jSONObject);
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LLII(String str, String str2, String str3, long j, long j2) {
        LJJJJI(str, str2, str3, j, j2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    @Override // X.InterfaceC2210301Bf2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIJ(java.lang.String r8, android.os.Bundle r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L17
            X.1BeD r2 = r7.LJJZZI
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "both second appid and second app name is empty, return"
            r2.LJII(r0, r1)
            return
        L17:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "second_app_"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r6 = X.C2188811AlT.LIZIZ(r2)
            r5 = 0
            if (r9 == 0) goto L75
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L75
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L77
            r4.<init>()     // Catch: java.lang.Throwable -> L77
            java.util.Set r0 = r9.keySet()     // Catch: java.lang.Throwable -> L73
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L73
        L3d:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L5c
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r9.get(r2)     // Catch: java.lang.OutOfMemoryError -> L4e java.lang.Exception -> L53 java.lang.Throwable -> L73
            goto L58
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L73
            goto L57
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L73
        L57:
            r0 = r5
        L58:
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L73
            goto L3d
        L5c:
            java.lang.String r2 = "params_for_special"
            java.lang.String r0 = "second_app"
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "second_appid"
            r4.put(r0, r10)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "second_appname"
            r4.put(r0, r11)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "product_type"
            r4.put(r0, r12)     // Catch: java.lang.Throwable -> L73
            goto L8d
        L73:
            r3 = move-exception
            goto L79
        L75:
            r4 = r5
            goto L8d
        L77:
            r3 = move-exception
            r4 = r5
        L79:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.1BeD r2 = r7.LJJZZI
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "prepare params failed"
            r2.LJIIZILJ(r5, r0, r3, r1)
            X.1BeQ r2 = r7.LJJJJLI
            X.1Bea r1 = X.EnumC2210021Bea.JSON_ERROR_COUNT
            r0 = 1
            r2.LIZIZ(r1, r0)
        L8d:
            r7.LLLIIII(r5, r5, r6, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209901BeO.LLIIIJ(java.lang.String, android.os.Bundle, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJIJIIJIL(long j, long j2, String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LLLIIIL(new C2209961BeU(this.LJIIIZ, str, str2, str3, j, j2, str4));
        } else {
            this.LJJZZI.LJII("category or tag is empty", new Object[0]);
        }
    }

    @Override // X.InterfaceC2210301Bf2
    public final void LJJJJI(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LLLIIIL(new C2209961BeU(this.LJIIIZ, str, str2, str3, j, j2, LLLIILIL(EnumC2176421AFs.V1_EVENT, str2, str3, jSONObject)));
        } else {
            this.LJJZZI.LJII("category or tag is empty", new Object[0]);
        }
    }
}
