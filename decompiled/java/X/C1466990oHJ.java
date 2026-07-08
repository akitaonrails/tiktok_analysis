package X;

import Y.AComparatorS42S0000000_23;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS34S0101000_23;
import Y.ARunnableS92S0200000_23;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.webkit.URLUtil;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.LoadControl;
import com.ss.ttm.player.MaskInfo;
import com.ss.ttm.player.NativeAudioProcessor;
import com.ss.ttm.player.TTPlayer;
import com.ss.ttm.player.TTPlayerClient;
import com.ss.ttm.player.TraitObject;
import com.ss.ttm.player.s;
import com.ss.ttm.player.x;
import com.ss.ttm.strategycenter.TTPlayerStrategyCenter;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.TTVideoEngineMonitor;
import com.ss.ttvideoengine.fetcher.SubInfoFetcher;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.model.IntertrustDrmHelper;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tiktok.ttkmedia.configcenter.BaseConfigV2;
import com.tiktok.ttkmedia.configcenter.ConfigCenter;
import cxo.s0;
import fyo.e;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1466990oHJ extends AbstractC1467000oHK implements InterfaceC1467390oHx, InterfaceC1468000oIw {
    public static final Map<Surface, Boolean> x6;
    public static String y6;
    public InterfaceC1467950oIr A1;
    public int A2;
    public boolean A3;
    public long A4;
    public boolean A5;
    public int B2;
    public int B3;
    public int B4;
    public int B5;
    public int C2;
    public int C3;
    public int C4;
    public boolean C5;
    public int D2;
    public int D3;
    public int D4;
    public C1467040oHO D5;
    public int E2;
    public IntertrustDrmHelper E3;
    public int E4;
    public boolean E5;
    public boolean F2;
    public boolean F3;
    public int F4;
    public boolean F5;
    public int G;
    public int G2;
    public boolean G3;
    public int G4;
    public boolean G5;
    public int H2;
    public boolean H3;
    public int H4;
    public boolean H5;
    public int I2;
    public int I3;
    public int I4;
    public boolean I5;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1468790oKD f168J;
    public int J2;
    public String J3;
    public int J4;
    public int J5;
    public int K2;
    public C1467260oHk K3;
    public int K4;
    public C1467490oI7 K5;
    public LoadControl L0;
    public int L2;
    public int L3;
    public int L4;
    public int L5;
    public final C1466990oHJ LJLIL;
    public final C1467590oIH LJLILLLLZI;
    public BPEAHandler LJLJJLL;
    public ARunnableS34S0101000_23 LJLJL;
    public int LLIIZ;
    public int LLIL;
    public Map<String, String> LLLLLLZ;
    public AbstractC1468760oKA LLLLLLZZ;
    public InterfaceC1467770oIZ LLLLLZ;
    public C1469350oL7 LLLLLZL;
    public InterfaceC1467890oIl LLLLZ;
    public C1468920oKQ LLLLZI;
    public InterfaceC1467760oIY LLLLZIL;
    public InterfaceC1467780oIa LLLLZLL;
    public InterfaceC1467970oIt LLLLZLLIL;
    public C1467900oIm LLLLZLLLI;
    public final C1468160oJC LLLZIL;
    public C1468040oJ0 LLLZL;
    public TTVideoEngineMonitor LLLZLL;
    public VideoInfoFetcher LLLZLZ;
    public C1468530oJn LLLZZ;
    public EnumC2281151EQn LLZILL;
    public C1474520oTS LLZLLIL;
    public Map<EnumC2281151EQn, Integer> LLZLLLL;
    public Map<String, C1467610oIJ> LLZZ;
    public Map<EnumC2281151EQn, String> LLZZJLIL;
    public Map<Integer, String> LLZZLLIL;
    public String LLZZZIL;
    public C1467600oII M0;
    public int M2;
    public int M3;
    public int M4;
    public int M5;
    public C1468890oKN N0;
    public int N2;
    public int N3;
    public int N4;
    public String N5;
    public int O2;
    public int O3;
    public int O4;
    public String O5;
    public int P2;
    public int P3;
    public int P4;
    public String P5;
    public int Q2;
    public int Q3;
    public int Q4;
    public int Q5;
    public int R2;
    public final ArrayList<String> R3;
    public int R4;
    public int R5;
    public int S2;
    public int S3;
    public int S4;
    public String S5;
    public int T2;
    public int T3;
    public int T4;
    public int T5;
    public int U2;
    public int U3;
    public int U4;
    public boolean U5;
    public int V2;
    public int V3;
    public int V4;
    public int V5;
    public int W;
    public String W2;
    public boolean W3;
    public int W4;
    public int W5;
    public boolean X2;
    public int X3;
    public int X4;
    public int X5;
    public int Y1;
    public String Y2;
    public int Y3;
    public int Y4;
    public int Y5;
    public String Z1;
    public String Z2;
    public int Z3;
    public int Z4;
    public int Z5;
    public int a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public String f172a3;
    public int a4;
    public int a5;
    public int a6;
    public int b2;
    public long b3;
    public int b4;
    public int b5;
    public float b6;
    public int c2;
    public String c3;
    public int c4;
    public int c5;
    public float c6;
    public BPEAHandler d0;
    public int d2;
    public int d3;
    public int d4;
    public int d5;
    public String d6;
    public int e2;
    public int e3;
    public int e4;
    public int e5;
    public String e6;
    public int f2;
    public int f3;
    public int f4;
    public int f5;
    public final C1467060oHQ f6;
    public int g2;
    public int g3;
    public int g4;
    public int g5;
    public final C1467080oHS g6;
    public int h2;
    public int h3;
    public int h4;
    public int h5;
    public final C1467230oHh h6;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public int i6;
    public int j2;
    public int j3;
    public int j4;
    public int j5;
    public boolean j6;
    public int k2;
    public int k3;
    public int k4;
    public int k5;
    public String k6;
    public int l2;
    public int l3;
    public int l4;
    public int l5;
    public String l6;
    public int m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public int f177m3;
    public int m4;
    public int m5;
    public String m6;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public int f178n2;
    public int n3;
    public int n4;
    public int n5;
    public InterfaceC1467050oHP n6;
    public int o2;
    public int o3;
    public int o4;
    public int o5;
    public Boolean o6;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public int f181p2;
    public int p3;
    public int p4;
    public int p5;
    public int p6;
    public int q2;
    public int q3;
    public int q4;
    public int q5;
    public int q6;
    public int r2;
    public int r3;
    public int r4;
    public int r5;
    public String r6;
    public int s2;
    public int s3;
    public Surface s4;
    public int s5;
    public int s6;
    public int t2;
    public int t3;
    public int t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public int f182t5;
    public int t6;
    public int u2;
    public int u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public String f183u4;
    public int u5;
    public int u6;
    public int v2;
    public int v3;
    public boolean v4;
    public int v5;
    public boolean v6;
    public int w2;
    public long w3;
    public int w4;
    public boolean w5;
    public boolean w6;
    public boolean x;
    public int x2;
    public int x3;
    public int x4;
    public int x5;
    public boolean y;
    public int y2;
    public int y3;
    public int y4;
    public final TTVideoEngine y5;
    public int z2;
    public int z3;
    public int z4;
    public boolean z5;
    public final Set<Integer> LJLJI = new HashSet();
    public int LJLJJI = 500;
    public final int LJLJJL = -1;
    public int LJLJLJ = 0;
    public volatile int LJLJLLL = 0;
    public volatile Boolean LJLL = Boolean.FALSE;
    public int LJLLI = 0;
    public boolean LJLLILLLL = false;
    public String LJLLJ = "h264";
    public boolean LJLLL = false;
    public boolean LJLLLL = false;
    public boolean LJLLLLLL = false;
    public boolean LJLZ = false;
    public boolean LJZ = false;
    public boolean LJZI = false;
    public int LJZL = 0;
    public boolean LL = false;
    public boolean LLD = false;
    public boolean LLF = false;
    public boolean LLFF = false;
    public int LLFFF = 0;
    public int LLFII = 0;
    public int LLFZ = 0;
    public int LLI = 0;
    public int LLIFFJFJJ = 0;
    public int LLII = 3;
    public int LLIIII = 0;
    public int LLIIIILZ = 0;
    public int LLIIIJ = 0;
    public int LLIIIL = 0;
    public int LLIIIZ = 0;
    public int LLIIJI = 0;
    public int LLIIJLIL = 0;
    public int LLIIL = 0;
    public int LLIILII = 1;
    public int LLIILZL = 1;
    public int LLILII = -1;
    public int LLILIL = 0;
    public int LLILL = 0;
    public int LLILLIZIL = 0;
    public int LLILLJJLI = 0;
    public int LLILLL = 10;
    public int LLILZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public int LLILZIL = 3;
    public int LLILZLL = 0;
    public int LLIZ = 0;
    public int LLIZLLLIL = 10;
    public int LLJ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public int LLJI = 3;
    public int LLJIJIL = 0;
    public int LLJILJIL = 0;
    public int LLJILJILJ = -1;
    public int LLJILLL = 2;
    public int LLJJ = 1;
    public int LLJJI = 0;
    public int LLJJIII = 0;
    public int LLJJIJI = 1;
    public int LLJJIJIIJIL = 0;
    public int LLJJIJIL = 0;
    public int LLJJJ = 0;
    public int LLJJJIL = 0;
    public int LLJJJJ = 0;
    public int LLJJJJJIL = -1;
    public int LLJJJJLIIL = 0;
    public float LLJJL = 0.25f;
    public float LLJJLIIIJLLLLLLLZ = -18.0f;
    public float LLJL = 8.0f;
    public float LLJLIL = 0.007f;
    public float LLJLILLLLZIIL = 0.0f;
    public float LLJLL = 0.0f;
    public float LLJLLIL = 0.0f;
    public float LLJLLL = 200.0f;
    public float LLJZ = 3.0f;
    public int LLJZIJLIL = 0;
    public float LLL = 0.0f;
    public float LLLF = 0.0f;
    public float LLLFF = 0.0f;
    public float LLLFFI = 0.0f;
    public float LLLFZ = 0.0f;
    public int LLLI = 0;
    public int LLLII = 0;
    public boolean LLLIIII = false;
    public String LLLIIIIL = "";
    public String LLLIIIL = "";
    public String LLLIIL = "";
    public int LLLIILIL = -2;
    public int LLLIL = -1;
    public int LLLILZ = 0;
    public int LLLILZJ = 0;
    public int LLLILZLLLI = 0;
    public int LLLIZZ = 0;
    public int LLLJ = 5000;
    public int LLLJIL = 0;
    public int LLLJL = 0;
    public int LLLL = 0;
    public int LLLLII = 30;
    public int LLLLIIIILLL = 5;
    public boolean LLLLIIL = true;
    public int LLLLIILL = 0;
    public float LLLLIILLL = 50.0f;
    public int LLLLIL = 0;
    public int LLLLILI = 0;
    public int LLLLJ = 0;
    public int LLLLJI = 0;
    public int LLLLL = 1;
    public int LLLLLIL = -1;
    public int LLLLLILLIL = 0;
    public int LLLLLJIL = 0;
    public int LLLLLJLJLL = 0;
    public int LLLLLL = 0;
    public int LLLLLLIL = 0;
    public int LLLLLLJ = 0;
    public int LLLLLLL = 4;
    public int LLLLLLLLL = 0;
    public int LLLLLLLLLL = 0;
    public int LLLLLLLZIL = 0;
    public InterfaceC1467990oIv LLLLLZIL = null;
    public InterfaceC1467980oIu LLLZ = null;
    public SurfaceHolderCallbackC1467210oHf LLLZI = null;
    public boolean LLLZIIL = true;
    public long LLLZZIL = -1;
    public long LLZ = -1;
    public long LLZIL = -1;
    public int LLZL = 0;
    public EnumC2281151EQn LLZLI = null;
    public long LLZLL = 0;
    public boolean LLZZZZ = false;
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public boolean d = false;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public boolean n = true;
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";
    public String u = "";
    public String v = "";
    public String w = "";
    public boolean z = true;
    public boolean A = true;
    public boolean B = true;
    public boolean C = false;
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;
    public boolean H = false;
    public int I = 0;
    public boolean K = false;
    public int L = -1;
    public boolean M = false;
    public int N = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f169O = false;
    public int P = 0;
    public boolean Q = false;
    public int R = 0;
    public AudioProcessor S = null;
    public int T = 0;
    public final C1286440ja6 U = new C1286440ja6();
    public int V = 0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f170X = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f171Y = "";
    public String Z = "";
    public int a0 = 0;
    public boolean b0 = false;
    public boolean c0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f173e0 = false;
    public boolean f0 = true;
    public boolean g0 = false;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f174h0 = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f175i0 = 0;
    public String j0 = null;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f176k0 = 0;
    public int l0 = 1;
    public boolean m0 = false;
    public int n0 = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f179o0 = 0;
    public int p0 = 0;
    public int q0 = 0;
    public int r0 = 0;
    public int s0 = 0;
    public int t0 = 0;
    public int u0 = 0;
    public int v0 = 0;
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = -1;
    public int B0 = 0;
    public int C0 = 1;
    public boolean D0 = false;
    public long E0 = 0;
    public int F0 = 0;
    public int G0 = 0;
    public int H0 = 0;
    public int I0 = 0;
    public int J0 = 0;
    public int K0 = 0;
    public int O0 = 0;
    public int P0 = 0;
    public int Q0 = LSPassThroughRecordSizeConfig.DEFAULT;
    public float R0 = 0.0f;
    public int S0 = 0;
    public int T0 = 0;
    public int U0 = 0;
    public final long V0 = System.currentTimeMillis();
    public int W0 = 0;
    public int X0 = 0;
    public int Y0 = 0;
    public int Z0 = 0;
    public int a1 = 0;
    public int b1 = 0;
    public int c1 = 1;
    public int d1 = 0;
    public int e1 = 0;
    public int f1 = 0;
    public int g1 = 1;
    public int h1 = 1;
    public int i1 = 2;
    public int j1 = 1048576;
    public int k1 = 409600;
    public int l1 = 5000;
    public int m1 = 10000;
    public int n1 = 0;
    public int o1 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f180p1 = 5000000;
    public int q1 = 0;
    public int r1 = 0;
    public int s1 = 1;
    public int t1 = 0;
    public final String u1 = "";
    public int v1 = -1;
    public int w1 = 0;
    public int x1 = 0;
    public boolean y1 = false;
    public boolean z1 = false;
    public int B1 = 0;
    public int C1 = 0;
    public int D1 = 0;
    public int E1 = 2;
    public long F1 = -1;
    public long G1 = -1;
    public long H1 = -1;
    public long I1 = -1;
    public float J1 = -1.0f;
    public float K1 = -1.0f;
    public float L1 = -1.0f;
    public float M1 = -1.0f;
    public int N1 = -1;
    public String O1 = null;
    public String P1 = "";
    public String Q1 = "";
    public String R1 = "";
    public String S1 = null;
    public int T1 = 0;
    public C1468600oJu U1 = new C1468600oJu();
    public final Map V1 = new HashMap();
    public boolean W1 = false;
    public int X1 = 0;

    @Override // X.InterfaceC1467390oHx
    public void LJJIIJZLJL() {
    }

    @Override // X.AbstractC1467000oHK
    public final void LJJJJI() {
        LJLL(true);
    }

    public final synchronized void LLIIL() {
        if (this.A1 == null) {
            this.A1 = LLIIJLIL();
        }
    }

    public final boolean LLJJJJJIL() {
        return LJJIJL(0) || LJJIJL(1) || LJJIJL(3) || LJJIJL(4);
    }

    @Override // X.InterfaceC1467390oHx
    public void prepare() {
        C1467190oHd c1467190oHd;
        InterfaceC1467050oHP interfaceC1467050oHP;
        this.LJJJJLI = false;
        C1467070oHR c1467070oHR = this.LJLIIL;
        c1467070oHR.LJIJ = false;
        c1467070oHR.LJIJI = false;
        this.LJJII = false;
        this.LJJIJIL = 0;
        if (this.LJIL.LIZJ() && (interfaceC1467050oHP = (c1467190oHd = (C1467190oHd) this.LJIL).LJII) != null) {
            interfaceC1467050oHP.LJJI(c1467190oHd.LJIIIZ);
        }
        C1468160oJC c1468160oJC = this.LLLZIL;
        if (c1468160oJC != null) {
            c1468160oJC.LJLJJLL(65);
        }
        LJLJI(false);
        this.LJLIIL.LJIILJJIL = false;
    }

    static {
        C1470480oMw c1470480oMw = C1469430oLF.LIZ;
        EnumC1469090oKh enumC1469090oKh = EnumC1469090oKh.VOD_PLAYER;
        c1470480oMw.LIZIZ(enumC1469090oKh, InterfaceC1470050oMF.class, new InterfaceC1470580oN6<C1470040oME>() { // from class: X.0oM9
            @Override // X.InterfaceC1470580oN6
            public final InterfaceC1470560oN4 LIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
                return new C1470040oME((C1467590oIH) abstractC1470590oN7, interfaceC1469660oLc);
            }
        });
        c1470480oMw.LIZIZ(enumC1469090oKh, InterfaceC1470060oMG.class, new InterfaceC1470580oN6<C1470030oMD>() { // from class: X.0oMA
            @Override // X.InterfaceC1470580oN6
            public final InterfaceC1470560oN4 LIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
                return new C1470030oMD((C1467590oIH) abstractC1470590oN7, interfaceC1469660oLc);
            }
        });
        c1470480oMw.LIZIZ(enumC1469090oKh, InterfaceC1470070oMH.class, new InterfaceC1470580oN6<InterfaceC1470070oMH>() { // from class: X.0oMB
            @Override // X.InterfaceC1470580oN6
            public final InterfaceC1470560oN4 LIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
                return new C1470020oMC((C1467590oIH) abstractC1470590oN7, interfaceC1469660oLc);
            }
        });
        if (C1474810oTv.LLJI().pluginReuseMode == 1) {
            c1470480oMw.LIZ(enumC1469090oKh, InterfaceC1470050oMF.class, new C1470570oN5());
            c1470480oMw.LIZ(enumC1469090oKh, InterfaceC1470060oMG.class, new C1470570oN5());
            c1470480oMw.LIZ(enumC1469090oKh, InterfaceC1470070oMH.class, new C1470570oN5());
        }
        if (((Boolean) C1474810oTv.f5.getValue()).booleanValue()) {
            x.LJI(70, 1);
        }
        x6 = new ConcurrentHashMap(15);
        y6 = null;
    }

    @Override // X.InterfaceC1467390oHx
    public void LJIILL() {
        TTPlayerClient tTPlayerClient;
        C1468090oJ5 c1468090oJ5;
        C1467310oHp c1467310oHp = C1467660oIO.LIZ;
        if ((c1467310oHp.LIZJ & 512) > 0 && (c1468090oJ5 = c1467310oHp.LJIIJ) != null) {
            c1468090oJ5.LIZJ();
        }
        this.LJLIIL.LJIJI = true;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = true;
        if (!LJJIJIIJIL()) {
            release();
            return;
        }
        EngineThreadPool.addExecuteTask(new RunnableC790180UzA(this.V0));
        this.LJLIIL.LJIJ = false;
        LJZI(2, false);
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            if (this.LJIILJJIL != 0) {
                if (this.LJIILIIL != null && (tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr).LIZ) != null) {
                    tTPlayerClient.LJJJJJ(null);
                }
                if (this.LJIIL != null) {
                    LLLLZIL(null);
                }
            } else if (this.LJIILIIL != null || this.LJIIL != null) {
                LLLLZIL(null);
            }
        }
        InterfaceC1467950oIr interfaceC1467950oIr2 = this.A1;
        if (interfaceC1467950oIr2 != null) {
            ((C1470430oMr) interfaceC1467950oIr2).release();
            this.A1 = null;
        }
        final InterfaceC1467950oIr interfaceC1467950oIr3 = this.LJIIIIZZ;
        this.LJIIIIZZ = null;
        if (interfaceC1467950oIr3 != null) {
            EngineThreadPool.addExecuteTask(new Runnable(interfaceC1467950oIr3) { // from class: X.0oJc
                public InterfaceC1470080oMI LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TTVideoEngineImplV2$MyReleaseRunnable@aabf.run");
                    try {
                        InterfaceC1470080oMI interfaceC1470080oMI = this.LL;
                        if (interfaceC1470080oMI != null) {
                            try {
                                interfaceC1470080oMI.release();
                                this.LL = null;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TTVideoEngineImplV2$MyReleaseRunnable@aabf.run");
                }

                {
                    this.LL = interfaceC1467950oIr3;
                }
            });
        }
        LJJLIIIJJI();
    }

    public final void LJJJLIIL() {
        InterfaceC1467090oHT interfaceC1467090oHT;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null && ((C1470430oMr) interfaceC1467950oIr).getPlayerType() == 0 && (interfaceC1467090oHT = this.LJII) != null) {
            interfaceC1467090oHT.release();
            this.LJII = null;
            this.LJIIIIZZ = null;
        }
        this.LJLIIL.LJIJ = false;
        this.LJJIIJ = false;
        this.M = false;
        this.W1 = false;
        ((ConcurrentHashMap) this.LLLLLLZ).clear();
        LJZI(6, true);
        this.f6.onReset();
        if (this.LJIIIIZZ != null) {
            if (this.LJLIIL.LIZLLL == 1 && this.W5 == 0 && this.C4 == -1) {
                LLLLZIL(null);
            }
            this.LJII.reset();
        }
        this.LJLIIL.getClass();
        C1467070oHR c1467070oHR = this.LJLIIL;
        c1467070oHR.LJIILIIL = false;
        this.c = false;
        this.d = false;
        this.LJLLILLLL = false;
        c1467070oHR.LJIILLIIL = false;
        c1467070oHR.LIZ = 0;
        this.LJJIJIIJI = false;
        this.LLLZIL.LJJJJLI();
        this.B = true;
        this.LJJIJL = true;
        this.LLZZZZ = false;
        this.LLLZZIL = -1L;
        this.LLZ = -1L;
        this.LJLIIL.LJIIIIZZ = -1L;
        this.F1 = -1L;
        this.j0 = null;
        this.f183u4 = null;
        this.D0 = false;
        this.LLLLLIL = -1;
        this.LJJJLIIL = 0L;
        this.LLZLL = 0L;
        this.E0 = 0L;
        this.b3 = 0L;
        LJLJL();
        this.U.LIZIZ();
        LLJLL();
        C1467070oHR c1467070oHR2 = this.LJLIIL;
        c1467070oHR2.LIZIZ = 0;
        this.LLZLLIL = null;
        this.LJIL = InterfaceC1467290oHn.LIZ;
        c1467070oHR2.LJIIZILJ = false;
        c1467070oHR2.LJIILIIL = false;
        this.c = false;
        this.d = false;
        C1467010oHL c1467010oHL = this.LJJJJIZL;
        c1467010oHL.LIZ.LIZJ();
        c1467010oHL.LIZIZ.LIZJ();
        c1467010oHL.LIZJ.LIZJ();
        c1467010oHL.LIZLLL.LIZJ();
        C1467490oI7 c1467490oI7 = c1467010oHL.LJII;
        if (c1467490oI7 != null && c1467490oI7.LIZJ != 0) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("this:");
            sbLIZ.append(c1467490oI7);
            sbLIZ.append(",reset");
            TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ));
            c1467490oI7.LIZ.LIZJ();
            c1467490oI7.LIZLLL.clear();
            c1467490oI7.LJIIIIZZ.clear();
            c1467490oI7.LJ = 0;
            c1467490oI7.LJFF = 0;
            c1467490oI7.LIZJ = 0;
        }
        C1467070oHR c1467070oHR3 = this.LJLIIL;
        c1467070oHR3.LJIILJJIL = false;
        c1467070oHR3.LJIJJ = false;
        c1467070oHR3.LJII = 0L;
        this.LJJIIZ = false;
        this.LJJIJ = 0L;
        this.LJJIJIIJIL = false;
        ((HashMap) this.LLZZLLIL).clear();
        this.s3 = -1;
        C1467070oHR c1467070oHR4 = this.LJLIIL;
        c1467070oHR4.LJ = -1;
        this.LJJJLZIJ = -1;
        this.LJJJZ = -1;
        this.LJJL = -1;
        this.u3 = -1;
        this.v3 = -1;
        this.w3 = -1L;
        c1467070oHR4.LJIJJLI = 0.0f;
        this.S = null;
        this.LLF = false;
        this.LLD = false;
        this.LLLIIII = false;
        this.LLLLLZIL = null;
        c1467070oHR4.LJIIL = false;
        this.LLLZIL.LJLJJLL(63);
        ((ArrayList) this.LJLIIL.LJJI).clear();
        ((HashMap) this.LLZZ).clear();
        this.F5 = false;
        this.G5 = false;
        this.f6.LJIJ();
    }

    public final void LJJJLL() {
        C1467900oIm c1467900oIm;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr == null) {
            return;
        }
        if (this.LLLLILI != 0 && (c1467900oIm = this.LLLLZLLLI) != null) {
            C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
            c1470430oMr.LJI(48, -1);
            long jLJIIJ = c1470430oMr.LJIIJ(156, -1L);
            long jLJIIJ2 = c1470430oMr.LJIIJ(163, -1L);
            C1467370oHv c1467370oHv = new C1467370oHv();
            c1467370oHv.LIZ = 3;
            c1467370oHv.LIZIZ = jLJIIJ;
            c1467370oHv.LIZJ = jLJIIJ2;
            ((C1467710oIT) c1467900oIm).LIZ.LLILLJJLI.LJJIJL().LJLJLLL(3, C1467370oHv.LIZ(c1467370oHv));
        }
        if (!this.d) {
            this.d = true;
            C1470430oMr c1470430oMr2 = (C1470430oMr) interfaceC1467950oIr;
            this.LLLZIL.LIZIZ(77, c1470430oMr2.LJIIJ(628, -1L));
            if (this.LJIIL == null && this.LJIILIIL == null && this.LJJJJZI == 0 && c1470430oMr2.LJI(62, -100) != 0) {
                this.LLLZIL.LIZJ(111, 1);
            }
        }
        if (!this.LJLIIL.LJIILIIL || this.LLZZZZ) {
            if (((C1470430oMr) interfaceC1467950oIr).LJI(62, -100) == 0) {
                C1468160oJC c1468160oJC = this.LLLZIL;
                if (c1468160oJC != null && this.V5 != 150) {
                    c1468160oJC.LJJJLL(300019);
                }
            } else if (this.LJJJJZI == 0 && !this.D0 && (this.B0 != 1 || this.LJIIL != null || this.LJIILIIL != null)) {
                return;
            }
            LJLJJLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJZ() {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LJJJZ():void");
    }

    public final void LJJL() {
        this.V3 = C1309150kAj.LIZ.LIZJ(this.V3, "native_render_rotation_adapt");
    }

    public final void LJJLI() {
        int iLIZJ = C1309150kAj.LIZ.LIZJ(this.h2, "native_yv12_render");
        if (iLIZJ > 0 && Build.MODEL.contains("Pixel") && Build.MANUFACTURER.contains("Google") && Build.VERSION.SDK_INT <= 33) {
            iLIZJ = 0;
        }
        this.h2 = iLIZJ;
    }

    public final int LJJLIIIJ() {
        int iLJJLJ = (this.LLZZZZ || (this.LLLILZJ == 0 && this.LJLIIL.LJIIL)) ? this.LJJIZ : LJJLJ();
        if (((Boolean) C1474810oTv.A1.getValue()).booleanValue()) {
            C786410Ut5.LJJZZIII(this.d0, new ARunnableS34S0101000_23(this, iLJJLJ, 12));
            return iLJJLJ;
        }
        this.g6.LJJIJIIJIL(iLJJLJ);
        return iLJJLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.0oHo, android.os.PowerManager$OnThermalStatusChangedListener] */
    public final void LJJLIIIJILLIZJL() {
        Context context;
        int i = this.l4;
        if (i > 0) {
            final C1467310oHp c1467310oHp = C1467660oIO.LIZ;
            c1467310oHp.LIZJ = i;
            int i2 = this.m4;
            if (i2 == 0) {
                c1467310oHp.LIZIZ = 60;
            } else {
                c1467310oHp.LIZIZ = i2;
            }
            Context context2 = this.LJI;
            if (c1467310oHp.LIZ == null) {
                c1467310oHp.LIZ = C786410Ut5.N3(context2);
            }
            int i3 = 0;
            if ((c1467310oHp.LIZJ & 2) > 0) {
                if (c1467310oHp.LJI == null) {
                    c1467310oHp.LJI = new C1467320oHq();
                }
                Context context3 = c1467310oHp.LIZ;
                if (context3 != null && c1467310oHp.LJIIIIZZ == null) {
                    C1467510oI9 c1467510oI9 = new C1467510oI9(context3);
                    c1467310oHp.LJIIIIZZ = c1467510oI9;
                    c1467510oI9.LIZIZ = new C1467690oIR(c1467310oHp);
                    if (c1467510oI9.LIZ != null) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                        Intent intentLJIJJ = C786410Ut5.LJIJJ(context3, c1467510oI9.LIZ, intentFilter);
                        if (intentLJIJJ != null) {
                            int intExtra = intentLJIJJ.getIntExtra("plugged", -1);
                            int i4 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("BatteryListener state: ");
                            sbLIZ.append(intExtra);
                            C1471660oOq.LIZJ("BatteryListener", C2188811AlT.LIZIZ(sbLIZ));
                            c1467510oI9.LIZJ = intExtra == 2;
                        }
                    }
                    if (!c1467310oHp.LJIIIIZZ.LIZJ) {
                        int i5 = C2187451AjH.LIZ;
                        C1471660oOq.LIZJ("PlayerMetrics", "getInitialCharging");
                        c1467310oHp.LJI.LIZJ = System.currentTimeMillis();
                        c1467310oHp.LJI.LIZ = C1468330oJT.LIZ(c1467310oHp.LIZ);
                        c1467310oHp.LJI.getClass();
                    }
                }
            }
            if ((c1467310oHp.LIZJ & 4) > 0 && (context = c1467310oHp.LIZ) != null && c1467310oHp.LJII == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    final PowerManager powerManager = (PowerManager) C786410Ut5.H2(context, "power");
                    if (powerManager != 0) {
                        int i6 = C2187451AjH.LIZ;
                        C1471660oOq.LIZJ("PlayerMetrics", "start thermal");
                        ?? r0 = new PowerManager.OnThermalStatusChangedListener(powerManager) { // from class: X.0oHo
                            /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
                            /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
                            /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
                            /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
                            @Override // android.os.PowerManager.OnThermalStatusChangedListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void onThermalStatusChanged(int r11) {
                                /*
                                    r10 = this;
                                    X.0oHp r0 = r10.LIZ
                                    X.0oHq r0 = r0.LJI
                                    if (r0 != 0) goto L7
                                    return
                                L7:
                                    int r0 = X.C2187451AjH.LIZ
                                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                    java.lang.String r0 = "onThermalStatusChanged "
                                    r1.append(r0)
                                    r1.append(r11)
                                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                                    java.lang.String r0 = "PlayerMetrics"
                                    X.C1471660oOq.LIZJ(r0, r1)
                                    X.0oHp r0 = r10.LIZ
                                    X.0oHq r9 = r0.LJI
                                    r3 = 0
                                    if (r9 == 0) goto L6e
                                    r0 = 4
                                    if (r11 != r0) goto L56
                                    long r0 = java.lang.System.currentTimeMillis()
                                    r9.LJ = r0
                                L2f:
                                    X.0oHp r0 = r10.LIZ
                                    X.0oHq r9 = r0.LJI
                                    long r1 = r9.LJI
                                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                                    if (r0 <= 0) goto L53
                                    long r5 = r9.LJII
                                    long r7 = java.lang.System.currentTimeMillis()
                                    X.0oHp r0 = r10.LIZ
                                    X.0oHq r2 = r0.LJI
                                    long r0 = r2.LJI
                                    long r7 = r7 - r0
                                    long r5 = r5 + r7
                                    r9.LJII = r5
                                    r2.LJI = r3
                                L4b:
                                    X.0oHp r0 = r10.LIZ
                                    X.0oHq r0 = r0.LJI
                                    r0.getClass()
                                    return
                                L53:
                                    r9.LJI = r3
                                    goto L4b
                                L56:
                                    long r1 = r9.LJ
                                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                                    if (r0 <= 0) goto L7c
                                    long r5 = r9.LJFF
                                    long r7 = java.lang.System.currentTimeMillis()
                                    X.0oHp r0 = r10.LIZ
                                    X.0oHq r2 = r0.LJI
                                    long r0 = r2.LJ
                                    long r7 = r7 - r0
                                    long r5 = r5 + r7
                                    r9.LJFF = r5
                                    r2.LJ = r3
                                L6e:
                                    r0 = 5
                                    if (r11 != r0) goto L2f
                                    X.0oHp r0 = r10.LIZ
                                    X.0oHq r2 = r0.LJI
                                    long r0 = java.lang.System.currentTimeMillis()
                                    r2.LJI = r0
                                    goto L4b
                                L7c:
                                    r9.LJ = r3
                                    goto L6e
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1467300oHo.onThermalStatusChanged(int):void");
                            }
                        };
                        c1467310oHp.LJII = r0;
                        powerManager.addThermalStatusListener(r0);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i7 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("thermalError: ");
                    sbLIZ2.append(e);
                    C1471660oOq.LIZJ("PlayerMetrics", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            if ((c1467310oHp.LIZJ & 1) > 0) {
                if (C1467310oHp.LJIILIIL == null) {
                    C1467310oHp.LJIILIIL = new ArrayList<>();
                    if ((c1467310oHp.LIZJ & 64) > 0) {
                        int i8 = 0;
                        while (true) {
                            String[] strArr = C1467310oHp.LJIIL;
                            if (i8 >= strArr.length) {
                                break;
                            }
                            C1467310oHp.LJIILIIL.add(strArr[i8]);
                            i8++;
                        }
                    }
                    if ((c1467310oHp.LIZJ & 128) > 0) {
                        int i9 = 0;
                        while (true) {
                            String[] strArr2 = C1467310oHp.LJIIJJI;
                            if (i9 >= strArr2.length) {
                                break;
                            }
                            C1467310oHp.LJIILIIL.add(strArr2[i9]);
                            i9++;
                        }
                    }
                }
                if (c1467310oHp.LJIIJ == null) {
                    C1468090oJ5 c1468090oJ5 = new C1468090oJ5();
                    c1467310oHp.LJIIJ = c1468090oJ5;
                    ArrayList<String> arrayList = C1467310oHp.LJIILIIL;
                    if (arrayList != null) {
                        c1468090oJ5.LIZIZ = new CopyOnWriteArrayList<>();
                        c1468090oJ5.LIZJ = new CopyOnWriteArrayList<>();
                        c1468090oJ5.LIZLLL = new CopyOnWriteArrayList<>();
                        new C1468080oJ4();
                        C1468080oJ4 c1468080oJ4 = new C1468080oJ4();
                        c1468080oJ4.LIZ = "self";
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(Process.myPid());
                        sbLIZ3.append("");
                        c1468080oJ4.LIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        c1468080oJ4.LJIIIIZZ = 1;
                        c1468090oJ5.LIZIZ.add(c1468080oJ4);
                        while (i3 < arrayList.size()) {
                            String str = (String) ListProtector.get(arrayList, i3);
                            i3++;
                            C1468080oJ4 c1468080oJ42 = new C1468080oJ4();
                            c1468080oJ42.LIZ = str;
                            if (str == null || !str.equals("MediaLoad")) {
                                c1468080oJ42.LJIIIIZZ = 1;
                            } else {
                                c1468080oJ42.LJIIIIZZ = 2;
                            }
                            c1468090oJ5.LIZIZ.add(c1468080oJ42);
                        }
                    }
                    C1468090oJ5 c1468090oJ52 = c1467310oHp.LJIIJ;
                    c1468090oJ52.getClass();
                    if (!C1468090oJ5.LJI) {
                        EngineThreadPool.addExecuteTask(new ARunnableS103S0100000_3(c1468090oJ52, 150));
                    }
                }
            }
            synchronized (c1467310oHp) {
                try {
                    if (c1467310oHp.LJFF == null) {
                        c1467310oHp.LJFF = new C1467430oI1();
                    }
                    if (c1467310oHp.LJIIIZ == null) {
                        c1467310oHp.LJIIIZ = new ArrayList<>();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = c1467310oHp.LJ;
            if (j == 0) {
                c1467310oHp.LIZLLL = 0L;
            } else {
                c1467310oHp.LIZLLL += (jCurrentTimeMillis - j) / 1000;
            }
            c1467310oHp.LJ = jCurrentTimeMillis;
            int i10 = c1467310oHp.LIZIZ;
            if (i10 > 0 && c1467310oHp.LIZLLL >= i10) {
                c1467310oHp.LIZLLL = 0L;
                c1467310oHp.LIZ();
            }
            C1468160oJC c1468160oJC = this.LLLZIL;
            if (c1468160oJC != null) {
                c1468160oJC.LJJIII(1, "metrics");
            }
        }
    }

    public void LJJLIIIJJI() {
        TTVideoEngineMonitor tTVideoEngineMonitor = this.LLLZLL;
        if (tTVideoEngineMonitor != null) {
            tTVideoEngineMonitor.stopObserve(hashCode());
        }
        C2032407xi c2032407xiLIZIZ = C2032407xi.LIZIZ();
        TTVideoEngine tTVideoEngine = this.y5;
        if (tTVideoEngine == null) {
            c2032407xiLIZIZ.getClass();
        } else {
            ((ConcurrentHashMap) c2032407xiLIZIZ.LIZ).remove(Integer.valueOf(tTVideoEngine.hashCode()));
        }
        Context context = this.LJI;
        try {
            C787240UuQ c787240UuQ = C787250UuR.LIZJ;
            synchronized (c787240UuQ) {
                try {
                    if (C787250UuR.LIZIZ && context != null) {
                        C787250UuR.LIZIZ = false;
                        C786410Ut5.LJJIFFI(C786410Ut5.N3(context), c787240UuQ);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception th) {
        }
        LLJLL();
        C1467010oHL c1467010oHL = this.LJJJJIZL;
        if (c1467010oHL != null) {
            C1468040oJ0 c1468040oJ0 = c1467010oHL.LJ;
            C1468040oJ0.LJI(c1468040oJ0.LIZIZ, new ARunnableS92S0200000_23(c1468040oJ0, c1467010oHL.LJIIIIZZ, 82));
        }
        this.U.LIZIZ();
        this.S = null;
        this.M0 = null;
        this.N0 = null;
        this.c3 = null;
        this.LLF = false;
        this.LLD = false;
        this.LLLIIII = false;
        this.f6.onRelease();
        IntertrustDrmHelper intertrustDrmHelper = this.E3;
        if (intertrustDrmHelper != null) {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("IntertrustDrmHelper", "release enter");
            if (intertrustDrmHelper.LIZIZ != null) {
                try {
                    if (intertrustDrmHelper.LIZ == null) {
                        intertrustDrmHelper.LIZ = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                    }
                    intertrustDrmHelper.LIZ.getDeclaredMethod("release", new Class[0]).invoke(intertrustDrmHelper.LIZIZ, new Object[0]);
                    intertrustDrmHelper.LIZIZ = null;
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("class not found:");
                    sbLIZ.append(e.getLocalizedMessage());
                    C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ));
                } catch (IllegalAccessException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("method invoke failied:");
                    sbLIZ2.append(e2.getLocalizedMessage());
                    C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ2));
                } catch (NoSuchMethodException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("method not found:");
                    sbLIZ3.append(e3.getLocalizedMessage());
                    C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ3));
                } catch (InvocationTargetException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("method invoke failied:");
                    sbLIZ4.append(e4.getLocalizedMessage());
                    C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
            this.E3 = null;
        }
        getClass();
        this.LJJLIL = InterfaceC1467720oIU.LIZ;
        this.LJLIIL.LIZIZ = 5;
    }

    public final void LJJLIIIJLJLI() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        C1467040oHO c1467040oHO = this.D5;
        if (c1467040oHO == null || interfaceC1467950oIr == null) {
            return;
        }
        ((C1470430oMr) interfaceC1467950oIr).LIZJ(44134, c1467040oHO.LIZIZ(44134, 0));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    public final void LJJLIIJ() {
        C1468170oJD c1468170oJD;
        C1468800oKE c1468800oKELIZ;
        BPEAHandler bPEAHandler;
        this.LJLIIL.LIZIZ = 1;
        LJLJL();
        String strLLILLL = LLILLL();
        if (this.f169O) {
            strLLILLL = C795730VJj.LIZLLL(strLLILLL);
        }
        this.LLZZZIL = C790040Uyw.LIZ(strLLILLL);
        if (this.f168J != null && !TextUtils.isEmpty(this.LJIL.getVideoId()) && this.K) {
            boolean zLIZIZ = C787250UuR.LIZIZ(this.LJI);
            if ((this.LJJLIIIJLJLI <= 1 || !zLIZIZ) && (c1468800oKELIZ = this.f168J.LIZ(this.LJIL.getVideoId(), this.LLZZZIL)) != null && (!c1468800oKELIZ.LIZJ || (!zLIZIZ && this.g6.LJI.isRunning() && this.N > 0))) {
                C1468170oJD c1468170oJD2 = this.LLLZIL.LIZJ;
                if (c1468170oJD2 != null) {
                    c1468170oJD2.LLFF = 1;
                }
                C1470240oMY c1470240oMY = c1468800oKELIZ.LIZ;
                if (this.LJIL.LIZJ()) {
                    ((C1467190oHd) this.LJIL).LJII = c1470240oMY;
                }
                this.LLLZIL.LJJIJLIJ(c1470240oMY);
                if (this.LLLLZIL == null || !LLIIIILZ(c1470240oMY)) {
                    if (!this.b0 || (bPEAHandler = this.d0) == null) {
                        LJLILLLLZI(c1470240oMY);
                        return;
                    }
                    try {
                        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS92S0200000_23(this, c1470240oMY, 54));
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJLILLLLZI(c1470240oMY);
                        return;
                    }
                }
                return;
            }
        }
        if (this.K && (c1468170oJD = this.LLLZIL.LIZJ) != null) {
            c1468170oJD.LLFF = 0;
        }
        this.M = true;
        Context context = this.LJI;
        AbstractC1468760oKA abstractC1468760oKA = this.LLLLLLZZ;
        if (abstractC1468760oKA == null) {
            abstractC1468760oKA = null;
        }
        VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(context, abstractC1468760oKA);
        this.LLLZLZ = videoInfoFetcher;
        videoInfoFetcher.LJIIL = this.LJIL.getVideoId();
        this.LLLZLZ.LJIIIZ(this.K);
        this.LLLZLZ.getClass();
        if (this.LLLZIIL > 0) {
            InterfaceC1467290oHn interfaceC1467290oHn = this.LJIL;
            if (interfaceC1467290oHn.LIZJ() && ((C1467190oHd) interfaceC1467290oHn).LJFF != null) {
                VideoInfoFetcher videoInfoFetcher2 = this.LLLZLZ;
                videoInfoFetcher2.getClass();
                videoInfoFetcher2.LJI = true;
            }
        }
        this.LLLZLZ.LJII = new InterfaceC1468830oKH(this) { // from class: X.0oHM
            public final WeakReference<C1466990oHJ> LIZ;

            {
                this.LIZ = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1468830oKH
            public final void LIZ(e eVar) {
                C1466990oHJ c1466990oHJ;
                if (eVar == null || (c1466990oHJ = this.LIZ.get()) == null) {
                    return;
                }
                c1466990oHJ.LLLZIL.LJJJJJ(C1467400oHy.LIZIZ(c1466990oHJ.LJIL), eVar);
            }

            @Override // X.InterfaceC1468830oKH
            public final void onLog(String str) {
                C1466990oHJ c1466990oHJ = this.LIZ.get();
                if (c1466990oHJ == null) {
                    return;
                }
                c1466990oHJ.LLLZIL.LJJJJ(str);
            }

            @Override // X.InterfaceC1468830oKH
            public final void LIZIZ(int i, String str) {
                boolean z;
                C1466990oHJ c1466990oHJ = this.LIZ.get();
                if (c1466990oHJ == null) {
                    return;
                }
                boolean z2 = false;
                c1466990oHJ.M = false;
                C1468160oJC c1468160oJC = c1466990oHJ.LLLZIL;
                if (c1468160oJC != null) {
                    if (c1468160oJC.LJJLIIIIJ == 4) {
                        C1468230oJJ c1468230oJJ = c1468160oJC.LJ;
                        if (c1468230oJJ != null) {
                            c1468230oJJ.LIZ(0, "error");
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                    if (c1468160oJC.LJJLIIIIJ == 3) {
                        c1468160oJC.LIZLLL.LIZIZ("error");
                        c1468160oJC.LIZJ.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
                    } else {
                        z2 = z;
                    }
                    c1468160oJC.LJJLIIIIJ = 5;
                    if (z2) {
                        c1468160oJC.LJII.LJIILJJIL();
                    }
                    C1468170oJD c1468170oJD3 = c1468160oJC.LIZJ;
                    c1468170oJD3.LJJJJLL = i;
                    c1468170oJD3.LJJJJZ = str;
                    c1468160oJC.LJJJJI(5);
                }
                c1466990oHJ.LLLJ(i);
            }

            @Override // X.InterfaceC1468830oKH
            public final void LIZJ(C1470240oMY c1470240oMY2, e eVar) {
                C1466990oHJ c1466990oHJ = this.LIZ.get();
                if (c1466990oHJ == null) {
                    return;
                }
                c1466990oHJ.M = false;
                if (c1470240oMY2 != null) {
                    if (eVar == null) {
                        if (c1466990oHJ.LJIL.LIZJ()) {
                            ((C1467190oHd) c1466990oHJ.LJIL).LJII = c1470240oMY2;
                        }
                        c1466990oHJ.LLLZIL.LJJIJLIJ(c1470240oMY2);
                        boolean zLJJIJL = c1470240oMY2.LJJIJL();
                        c1466990oHJ.LJZ = zLJJIJL;
                        c1466990oHJ.LJLLL = zLJJIJL;
                        c1466990oHJ.LJJLIIJ.getClass();
                        if (c1466990oHJ.LLLLZIL != null) {
                            if (c1466990oHJ.LLIIIILZ(c1470240oMY2)) {
                                c1466990oHJ.LLLZIL.LIZJ.LLIIJLIL = 1;
                                return;
                            }
                            c1466990oHJ.LLLZIL.LIZJ.LLIIJLIL = 0;
                        }
                        c1466990oHJ.LJLILLLLZI(c1470240oMY2);
                        return;
                    }
                } else if (eVar == null) {
                    new e("kTTVideoErrorDomainFetchingInfo", -9997, 0, "fetch empty");
                    c1466990oHJ.LLLZIL.getClass();
                    c1466990oHJ.LLLLIILL(new e("kTTVideoErrorDomainFetchingInfo", -9997, 0, "fetch empty"));
                    return;
                }
                if (eVar.LJ.containsKey("log_id")) {
                    c1466990oHJ.LLLZIL.LIZ(15, (String) eVar.LJ.get("log_id"));
                }
                c1466990oHJ.LLLZIL.getClass();
                c1466990oHJ.LLLLIILL(eVar);
            }
        };
        VideoInfoFetcher videoInfoFetcher3 = this.LLLZLZ;
        String str = this.LLZZZIL;
        InterfaceC1467290oHn interfaceC1467290oHn2 = this.LJIL;
        videoInfoFetcher3.getClass();
        int iLIZIZ = C1467400oHy.LIZIZ(interfaceC1467290oHn2);
        videoInfoFetcher3.LJII(iLIZIZ, str, (iLIZIZ == 2 || iLIZIZ == 4 || !interfaceC1467290oHn2.LIZLLL()) ? null : ((C1467550oID) interfaceC1467290oHn2).LJIIJJI, interfaceC1467290oHn2.LIZJ() ? ((C1467190oHd) interfaceC1467290oHn2).LJI : null);
        VideoInfoFetcher videoInfoFetcher4 = this.LLLZLZ;
        InterfaceC1467290oHn interfaceC1467290oHn3 = this.LJIL;
        videoInfoFetcher4.LJIIIZ = interfaceC1467290oHn3.LIZJ() ? ((C1467190oHd) interfaceC1467290oHn3).LJIIIZ : null;
    }

    public final int LJJLJ() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr == null) {
            return 0;
        }
        return ((C1470430oMr) interfaceC1467950oIr).getCurrentPosition();
    }

    public final void LJJZZI() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (!this.LJLIIL.LJIILIIL) {
            LLF();
            C1468160oJC c1468160oJC = this.LLLZIL;
            if (c1468160oJC != null) {
                c1468160oJC.LLI();
            }
            this.LJLIIL.LJIILIIL = true;
            if (interfaceC1467950oIr == null) {
                return;
            }
        } else {
            if (interfaceC1467950oIr == null) {
                return;
            }
            C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
            this.LJJJZ = c1470430oMr.LJI(141, -1);
            this.u3 = c1470430oMr.LJI(402, -1);
            this.v3 = c1470430oMr.LJI(403, -1);
        }
        C1470430oMr c1470430oMr2 = (C1470430oMr) interfaceC1467950oIr;
        this.LJLIIL.LJ = c1470430oMr2.LJI(157, -1);
        this.LJJJLZIJ = c1470430oMr2.LJI(158, -1);
        this.LJJL = c1470430oMr2.LJI(140, -1);
        this.w3 = c1470430oMr2.LJIIJ(171, -1L);
        this.LJLIIL.LJIJJLI = c1470430oMr2.LJIILIIL(0.0f, 151);
    }

    public final void LJLJJL() {
        C1467010oHL c1467010oHL = this.LJJJJIZL;
        if (c1467010oHL != null) {
            c1467010oHL.LIZ();
        }
        C1468160oJC c1468160oJC = this.LLLZIL;
        String str = this.LJ;
        if (c1468160oJC.LJII != null && str != null && !str.isEmpty()) {
            c1468160oJC.LJII.LJJJIL = str;
        }
        C1468160oJC c1468160oJC2 = this.LLLZIL;
        String str2 = this.LJFF;
        if (c1468160oJC2.LJII != null && str2 != null && !str2.isEmpty()) {
            c1468160oJC2.LJII.LJJJJ = str2;
        }
        C1468160oJC c1468160oJC3 = this.LLLZIL;
        c1468160oJC3.LLFF = 0;
        c1468160oJC3.LLFFF = 0L;
        c1468160oJC3.LLFII = 0;
        c1468160oJC3.LLFZ = 0;
        c1468160oJC3.LLLFF = null;
        C1467070oHR c1467070oHR = this.LJLIIL;
        if (c1467070oHR.LJII == 0) {
            c1467070oHR.LJII = System.currentTimeMillis();
        }
        LJJZ(this.LJIL.getVideoId());
        if (this.LJIL.LJI() || this.LJIL.LIZ()) {
            LJLI(this.LJIL.getUrl());
            LJZ(this.LJIL.getUrl(), this.LLLLLLZ);
        } else if (!this.LJIL.LIZJ() || this.LJIL.LIZLLL()) {
            LJJLIIJ();
        } else {
            LJLILLLLZI(C1467400oHy.LIZJ(this.LJIL));
        }
        this.f6.LJIIJJI();
    }

    public final void LJLJJLL() {
        boolean z;
        C1468090oJ5 c1468090oJ5;
        C1468090oJ5 c1468090oJ52;
        if (this.G5) {
            this.LJLIIL.LJIILIIL = true;
            return;
        }
        C1467070oHR c1467070oHR = this.LJLIIL;
        if (!c1467070oHR.LJIILIIL && this.LLLZIL != null) {
            c1467070oHR.LJI = System.currentTimeMillis();
            this.LLZ = SystemClock.elapsedRealtime();
            this.LLLZIL.LLIFFJFJJ();
        }
        if (this.LJLIIL.LJIJ) {
            LLLZIL(1, null);
        }
        LJJZZI();
        if (this.L5 == 0) {
            LJLZ();
        }
        this.LJLIIL.LJIIZILJ = true;
        LLLZIIL(1, -1);
        C1467010oHL c1467010oHL = this.LJJJJIZL;
        if (c1467010oHL != null) {
            c1467010oHL.LIZJ();
        }
        int i = this.LJLJJI;
        if (this.LJLJJL >= 0 && this.LJIIIIZZ != null && i > 0) {
            BPEAHandler bPEAHandler = new BPEAHandler();
            this.LJLJJLL = bPEAHandler;
            ARunnableS34S0101000_23 aRunnableS34S0101000_23 = new ARunnableS34S0101000_23(this, i, 10);
            this.LJLJL = aRunnableS34S0101000_23;
            C786410Ut5.LJLIIL(i + (i / 2), bPEAHandler, aRunnableS34S0101000_23);
        }
        if (this.LJJIJIIJI) {
            if (this.LJJIZ != 0 && !LJJIJIIJIL()) {
                LJLLI(this.LJJIZ, this.LJJIJIIJI);
            }
            this.LJJIJIIJI = false;
            C1468160oJC c1468160oJC = this.LLLZIL;
            if (c1468160oJC.LLJLILLLLZIIL != null && c1468160oJC.LLJLLIL > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis - c1468160oJC.LLJLLIL;
                HashMap map = new HashMap(5);
                InterfaceC1468020oIy interfaceC1468020oIy = c1468160oJC.LIZIZ;
                int iLIZJ = interfaceC1468020oIy != null ? ((C1467030oHN) interfaceC1468020oIy).LIZJ(67) : -1;
                map.put("ec", Integer.valueOf(c1468160oJC.LLJLILLLLZIIL.LIZ));
                map.put("p", Integer.valueOf(iLIZJ));
                map.put("t", Long.valueOf(jCurrentTimeMillis));
                map.put("c", Long.valueOf(j));
                map.put("st", Integer.valueOf(c1468160oJC.LLJLL));
                C790040Uyw.LIZIZ(3, C786410Ut5.J3(new JSONObject(map)), c1468160oJC.LLJJJJLIIL);
            }
            c1468160oJC.LLJLILLLLZIIL = null;
            c1468160oJC.LLJLLIL = -2147483648L;
            c1468160oJC.LLJLL = -1;
        }
        if (this.e != 0 && !LJJIJIIJIL()) {
            LJLLI(this.e, this.LLZZZZ);
        }
        this.e = 0;
        if (this.LLZZZZ) {
            z = !this.A3;
            if (this.LJJIZ == 0 || LJJIJIIJIL()) {
                this.LLZZZZ = false;
                LLIIII(false);
                C1468160oJC c1468160oJC2 = this.LLLZIL;
                if (c1468160oJC2 != null) {
                    c1468160oJC2.LLIIJI(true);
                }
            } else {
                LJLLI(this.LJJIZ, this.LLZZZZ);
            }
        } else {
            z = true;
        }
        this.LJJLIIIJLJLI = 0;
        this.Y0 = 0;
        getClass();
        if (z) {
            LLLIILIL();
        }
        if (this.LLLLLLLLLL > 0 && this.s4 != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) x6;
            if (concurrentHashMap.size() >= 15) {
                concurrentHashMap.clear();
            }
            if (LJIIJ(1071) == 1) {
                concurrentHashMap.put(this.s4, Boolean.TRUE);
            } else {
                concurrentHashMap.put(this.s4, Boolean.FALSE);
            }
        }
        int i2 = this.l4;
        if (i2 > 0) {
            C1467310oHp c1467310oHp = C1467660oIO.LIZ;
            c1467310oHp.LIZJ = i2;
            int i3 = this.m4;
            if (i3 == 0) {
                c1467310oHp.LIZIZ = 60;
            } else {
                c1467310oHp.LIZIZ = i3;
            }
            InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
            if (interfaceC1467950oIr != null) {
                String strLJIIIZ = ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(1804);
                int i4 = c1467310oHp.LIZJ;
                if ((i4 & 1) > 0 && (i4 & 32) > 0 && (c1468090oJ52 = c1467310oHp.LJIIJ) != null && !TextUtils.isEmpty(strLJIIIZ) && c1468090oJ52.LIZJ != null) {
                    String[] strArrSplit = strLJIIIZ.split("=|;");
                    c1468090oJ52.LIZJ.clear();
                    c1468090oJ52.LIZLLL.clear();
                    for (int i5 = 0; i5 < strArrSplit.length - 1; i5 += 2) {
                        C1468080oJ4 c1468080oJ4 = new C1468080oJ4();
                        c1468080oJ4.LJIIIIZZ = 1;
                        c1468080oJ4.LIZ = strArrSplit[i5];
                        c1468080oJ4.LIZIZ = strArrSplit[i5 + 1];
                        c1468090oJ52.LIZJ.add(c1468080oJ4);
                    }
                }
                if ((c1467310oHp.LIZJ & 1024) > 0 && (c1468090oJ5 = c1467310oHp.LJIIJ) != null) {
                    c1468090oJ5.LIZJ();
                }
            }
        }
        this.f6.onRenderStart();
    }

    public final void LJLJLLL() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr == null || !this.LJLIIL.LJIJ) {
            return;
        }
        C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
        c1470430oMr.LJII();
        if (!this.LJJIIJ) {
            this.LJJIII = false;
            return;
        }
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if ((this.LJIILL == 0 || this.LJLIIL.LJIILJJIL) && this.LJIL.LIZLLL() && interfaceC1467050oHPLIZJ != null) {
            LLLFFI(interfaceC1467050oHPLIZJ);
        }
        c1470430oMr.LIZJ(100, this.e);
        this.LJII.start();
        if (this.LJLIIL.LJIILIIL) {
            C1467010oHL c1467010oHL = this.LJJJJIZL;
            if (c1467010oHL != null) {
                c1467010oHL.LIZJ();
            }
            LLLZIL(1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLILLLL() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LJLLILLLL():void");
    }

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
    public final void LJLLL() {
        this.LLLZIL.LIZJ(97, this.W3 ? 1 : 0);
        this.LLLZIL.LIZJ(93, this.t2);
        this.LLLZIL.LIZJ(94, this.v2);
        this.LLLZIL.LIZJ(55, this.h2);
        this.LLLZIL.LIZJ(96, C790230UzF.LIZ.LJI() ? 1 : 0);
        int i = C790030Uyv.LIZ.LJ;
        int i2 = this.E2;
        if (i2 > 0 || i > 0) {
            C1468160oJC c1468160oJC = this.LLLZIL;
            if (i2 > 0) {
                i = i2;
            }
            c1468160oJC.LJJIII(Integer.valueOf(i), "bytevc1_decoder_opt");
        }
        int i3 = this.LLIIIZ;
        if (i3 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i3), "open_voice_early");
        }
        int i4 = this.s0;
        if (i4 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i4), "mask_delay_loading");
        }
        int i5 = this.u0;
        if (i5 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i5), "mask_range_req");
        }
        int i6 = this.i4;
        if (i6 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i6), "preload_gear");
        }
        if (this.E) {
            this.LLLZIL.LJJIII(1, "pre_decode");
        }
        int i7 = this.F4;
        if (i7 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i7), "async_res");
        }
        int i8 = this.G4;
        if (i8 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i8), "a_directbuf");
        }
        int i9 = this.T4;
        if (i9 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i9), "auto_disconnect_cpu");
        }
        int i10 = this.P4;
        if (i10 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i10), "v_2nd_frame");
        }
        int i11 = this.Q4;
        if (i11 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i11), "giveback_codec_early");
        }
        int i12 = this.X4;
        if (i12 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i12), "query_adapt_playback");
        }
        int i13 = this.c5;
        if (i13 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i13), "codecpool_extend");
        }
        int i14 = this.e5;
        if (i14 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i14), "opti_hwdec2swdec");
        }
        int i15 = this.C4;
        if (i15 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i15), "codec_surface_reuse");
        }
        if (this.LLILLJJLI > 0) {
            this.LLLZIL.LJJIII(2, "decoder_drop");
        } else if (this.LLILLIZIL > 0) {
            this.LLLZIL.LJJIII(1, "decoder_drop");
        }
        if (1 == this.LLIZ) {
            this.LLLZIL.LJJIII(3, "hw_decoder_drop");
        } else if (1 == this.LLJIJIL) {
            this.LLLZIL.LJJIII(1, "hw_decoder_drop");
        } else if (1 == this.LLJILJIL) {
            this.LLLZIL.LJJIII(2, "hw_decoder_drop");
        }
        int i16 = this.LLJJIII;
        if (i16 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i16), "skip_audio_out");
        }
        int i17 = this.j3;
        if (i17 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i17), "ai_barrage");
        }
        long j = this.A4;
        if (this.LJJZ) {
            getClass();
        } else if (j > 0) {
            this.LLLZIL.LJJIII(1, "precise_pause");
        }
        if (this.H2 > 0) {
            this.LLLZIL.LJJIII(1, "pre_demux");
        }
        int i18 = this.o2;
        if (i18 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i18), "demux_nonblock_read");
        }
        int i19 = this.w4;
        if (i19 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i19), "av_interlaced_check");
        }
        int i20 = this.D1;
        if (i20 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i20), "clear_mdl_cache");
        }
        int i21 = this.w0;
        if (i21 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i21), "xHEAAC_audio_support");
        }
        int i22 = this.k2;
        if (i22 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i22), " no_buffer_update");
        }
        int i23 = this.N3;
        if (i23 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i23), "query_win");
        }
        int i24 = this.P3;
        if (i24 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i24), "mediacodec_async");
        }
        if (this.y1 && this.z1) {
            this.LLLZIL.LJJIII(1, "force_disable_oes_render");
        }
        if (this.I2 > 0) {
            this.LLLZIL.LJJIII(1, "bytevc2_opt");
        }
        if (this.J2 > 0) {
            this.LLLZIL.LJJIII(1, "audiomem_intergration");
        }
        if (this.K2 > 0) {
            this.LLLZIL.LJJIII(1, "lower_buffering_capacity");
        }
        if (this.L2 > 0) {
            this.LLLZIL.LJJIII(1, "downgrade_asynccodec");
        }
        if (this.M2 > 0) {
            this.LLLZIL.LJJIII(1, "mediacodec_sync_clode");
        }
        if (this.N2 > 0) {
            this.LLLZIL.LJJIII(1, "seek_buffering");
        }
        if (this.S4 > 0) {
            this.LLLZIL.LJJIII(1, "async_set_surface");
        }
        int i25 = this.LJLJLJ;
        if (i25 > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i25), "cache");
        }
        C1467040oHO c1467040oHO = this.D5;
        if (c1467040oHO != null && c1467040oHO.LIZIZ(42027, 0) > 0) {
            this.LLLZIL.LJJIII(1, "out_thread_optimize");
        }
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (interfaceC1467050oHPLIZJ == null || !interfaceC1467050oHPLIZJ.LJJIFFI(253)) {
            return;
        }
        this.LLLZIL.LJJIII(1, "mb_refactor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0oHt] */
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
    public final void LJLZ() {
        int size;
        String strLIZLLL;
        int size2;
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (interfaceC1467050oHPLIZJ == null || interfaceC1467050oHPLIZJ.LJJIIJZLJL() == null || this.o3 <= 0) {
            size = 0;
        } else {
            size = interfaceC1467050oHPLIZJ.LJJIIJZLJL().size();
            if (!TextUtils.isEmpty(this.t)) {
                String[] strArrSplit = this.t.split(",");
                if (TextUtils.isEmpty(this.s) || TextUtils.isEmpty(this.w)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C1469130oKl c1469130oKl : interfaceC1467050oHPLIZJ.LJJIIJZLJL()) {
                        if (c1469130oKl != null) {
                            for (String str : strArrSplit) {
                                if (!TextUtils.isEmpty(str) && str.equals(Integer.toString(c1469130oKl.LIZ))) {
                                    arrayList.add(Integer.toString(c1469130oKl.LIZIZ));
                                    arrayList2.add(c1469130oKl.LIZJ);
                                }
                            }
                        }
                    }
                    this.s = TextUtils.join(",", arrayList);
                    this.w = TextUtils.join(",", arrayList2);
                }
            }
        }
        if (this.o3 > 0) {
            InterfaceC1467990oIv interfaceC1467990oIv = this.LLLLLZIL;
            if (interfaceC1467990oIv != null) {
                String string = ((C1469110oKj) interfaceC1467990oIv).toString();
                if (string == null || string.length() <= 0 || (size2 = ((C1469110oKj) this.LLLLLZIL).LIZ.size()) <= 0) {
                    return;
                }
                C1468160oJC c1468160oJC = this.LLLZIL;
                if (c1468160oJC != null) {
                    c1468160oJC.LLIIIILZ = size2;
                }
                LJLLLL(string);
                return;
            }
            if (this.c || size <= 0) {
                return;
            }
            C1468160oJC c1468160oJC2 = this.LLLZIL;
            if (c1468160oJC2 != null) {
                c1468160oJC2.LLIIIILZ = size;
            }
            InterfaceC1467050oHP interfaceC1467050oHPLIZJ2 = C1467400oHy.LIZJ(this.LJIL);
            C1474520oTS c1474520oTSLIZ = C1467400oHy.LIZ(this.LJIL);
            if (interfaceC1467050oHPLIZJ2 == null || c1474520oTSLIZ == null) {
                strLIZLLL = null;
            } else {
                StringBuilder sb = new StringBuilder();
                String strLIZ = c1474520oTSLIZ.LIZ(28);
                if (strLIZ == null) {
                    strLIZ = "";
                }
                String str2 = this.v;
                String str3 = this.t;
                String str4 = this.u;
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.startsWith("http://") || str2.startsWith("https://")) {
                        sb.append(C786410Ut5.j4("%s/video/subtitle/v1/%s/%s?", new Object[]{str2, this.LJIL.getVideoId(), strLIZ}));
                    } else {
                        sb.append(C786410Ut5.j4("https://%s/video/subtitle/v1/%s/%s?", new Object[]{str2, this.LJIL.getVideoId(), strLIZ}));
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        sb.append(C786410Ut5.j4("sub_ids=%s&language_ids=%s&versions=%s", new Object[]{str3, this.s, this.w}));
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        if (!TextUtils.isEmpty(str3)) {
                            sb.append("&");
                        }
                        sb.append(C786410Ut5.j4("format=%s", new Object[]{str4}));
                    }
                }
                strLIZLLL = sb.toString();
            }
            if (this.f169O) {
                strLIZLLL = C795730VJj.LIZLLL(strLIZLLL);
            }
            String strLIZ2 = C790040Uyw.LIZ(strLIZLLL);
            C1468160oJC c1468160oJC3 = this.LLLZIL;
            if (c1468160oJC3 != null) {
                c1468160oJC3.LLIIL = strLIZ2;
            }
            AbstractC1468760oKA abstractC1468760oKA = this.LLLLLLZZ;
            final SubInfoFetcher subInfoFetcher = new SubInfoFetcher(abstractC1468760oKA != null ? abstractC1468760oKA : null);
            subInfoFetcher.LIZJ = new C1467340oHs(this);
            subInfoFetcher.LIZIZ = strLIZ2;
            try {
                new URL(strLIZ2).getHost();
            } catch (MalformedURLException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (TextUtils.isEmpty(subInfoFetcher.LIZIZ)) {
                subInfoFetcher.LIZ(new e("kTTVideoErrorDomainSubFetchingInfo", -9930, 0, "sub ApiString empty"));
            } else {
                subInfoFetcher.LIZLLL.LIZIZ(subInfoFetcher.LIZIZ, new InterfaceC1309180kAm() { // from class: X.0oHt
                    @Override // X.InterfaceC1309180kAm
                    public final void LIZIZ(JSONObject jSONObject, e eVar) {
                        if (eVar != null) {
                            subInfoFetcher.getClass();
                        }
                        if (jSONObject == null && eVar != null) {
                            subInfoFetcher.LIZ(eVar);
                            return;
                        }
                        SubInfoFetcher subInfoFetcher2 = subInfoFetcher;
                        synchronized (subInfoFetcher2) {
                            try {
                                if (jSONObject == null) {
                                    return;
                                }
                                int i = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("sub jsonObject:");
                                sbLIZ.append(C786410Ut5.J3(jSONObject));
                                TTVideoEngineLog.d("SubInfoFetcher", C2188811AlT.LIZIZ(sbLIZ));
                                int iOptInt = jSONObject.optInt("code");
                                String strOptString = jSONObject.optString("message");
                                String strOptString2 = jSONObject.optString("trace_id");
                                if (iOptInt != 200) {
                                    e eVar2 = new e("kTTVideoErrorDomainSubFetchingInfo", -9932, iOptInt, strOptString);
                                    eVar2.LJ.put("log_id", strOptString2);
                                    subInfoFetcher2.LIZ(eVar2);
                                    return;
                                }
                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                                if (jSONObjectOptJSONObject == null) {
                                    subInfoFetcher2.LIZ(new e("kTTVideoErrorDomainSubFetchingInfo", -9931, 0, "sub fetched info Result is empty"));
                                    return;
                                }
                                C786410Ut5.LJLJJL(subInfoFetcher2.LIZ, subInfoFetcher2.LIZ.obtainMessage(2, C786410Ut5.J3(jSONObjectOptJSONObject)));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                });
            }
            this.c = true;
        }
    }

    public final void LLF() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr == null || this.LJLIIL.LJIILIIL) {
            return;
        }
        int i = this.t0;
        if (i > 0) {
            this.LLLZIL.LJJIII(Integer.valueOf(i), "mask_loader");
        }
        this.LLLZIL.LJJIII(Integer.valueOf(this.O4), "change_rec_buf_speed");
        C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
        this.LLLZIL.LJJIII(Integer.valueOf(c1470430oMr.LJI(1042, -1)), "reuse_codec");
        this.LLLZIL.LJJIII(Integer.valueOf(this.Z4), "mc_monitor");
        this.LLLZIL.LJJIII(Integer.valueOf(this.f5), "create_audiotrack_early");
        long jLJIIJ = c1470430oMr.LJIIJ(68, -1L);
        this.LLLZIL.LJJLIIIJL(1, jLJIIJ);
        this.LLLZIL.LL(c1470430oMr.LJIIJ(69, -1L));
        this.LLLZIL.LLD(c1470430oMr.LJIIJ(70, -1L));
        this.LLLZIL.LJJJJLL(c1470430oMr.LJIIJ(267, -1L));
        this.LLLZIL.LJJJJZ(c1470430oMr.LJIIJ(268, -1L));
        this.LLLZIL.LJJJJZI(c1470430oMr.LJIIJ(269, -1L));
        this.LLLZIL.LJLZ(c1470430oMr.LJIIJ(75, -1L));
        this.LLLZIL.LJLLLLLL(c1470430oMr.LJIIJ(76, -1L));
        this.LLLZIL.LJJLIL(c1470430oMr.LJIIJ(77, -1L));
        this.LLLZIL.LJJLIIJ(c1470430oMr.LJIIJ(78, -1L));
        this.LLLZIL.LJLLL(c1470430oMr.LJIIIZ(71));
        this.LLLZIL.LJJIIZI(1, c1470430oMr.LJIIJ(156, -1L));
        this.LLLZIL.LJJIIZI(0, c1470430oMr.LJIIJ(155, -1L));
        this.LLLZIL.LJJIJ(1, c1470430oMr.LJIIJ(163, -1L));
        this.LLLZIL.LJJIJ(0, c1470430oMr.LJIIJ(162, -1L));
        long jLJIIJ2 = c1470430oMr.LJIIJ(210, -1L);
        this.LLLZIL.LJLI(jLJIIJ2);
        if (jLJIIJ > 0) {
            this.LLLZIL.LJJLIIIJJIZ(jLJIIJ);
        }
        long jLJIIJ3 = c1470430oMr.LJIIJ(622, -1L);
        if (jLJIIJ3 > 0) {
            this.LLLZIL.LJJLIIIJLJLI(1, jLJIIJ3);
        }
        long jLJIIJ4 = c1470430oMr.LJIIJ(623, -1L);
        if (jLJIIJ4 > 0) {
            this.LLLZIL.LIZIZ(66, jLJIIJ4);
        }
        if (TTVideoEngine.LJIJ == 0) {
            this.LLLZIL.LIZIZ(67, c1470430oMr.LJIIJ(620, -1L));
            this.LLLZIL.LIZIZ(68, c1470430oMr.LJIIJ(624, -1L));
            this.LLLZIL.LIZIZ(78, c1470430oMr.LJIIJ(621, -1L));
            this.LLLZIL.LIZIZ(69, c1470430oMr.LJIIJ(625, -1L));
            this.LLLZIL.LIZIZ(70, c1470430oMr.LJIIJ(626, -1L));
            this.LLLZIL.LIZIZ(71, c1470430oMr.LJIIJ(627, -1L));
            this.LLLZIL.LIZIZ(72, c1470430oMr.LJIIJ(629, -1L));
            this.LLLZIL.LIZIZ(73, c1470430oMr.LJIIJ(631, -1L));
            this.LLLZIL.LIZIZ(74, c1470430oMr.LJIIJ(630, -1L));
            this.LLLZIL.LIZIZ(75, c1470430oMr.LJIIJ(632, -1L));
            this.LLLZIL.LIZIZ(76, jLJIIJ2);
        }
        this.LLLZIL.LIZIZ(77, c1470430oMr.LJIIJ(628, -1L));
        this.LLLZIL.LIZIZ(87, c1470430oMr.LJIIJ(822, -1L));
        this.LLLZIL.LIZIZ(88, c1470430oMr.LJIIJ(307, -1L));
        this.LLLZIL.LIZIZ(120, c1470430oMr.LJIIJ(583, -1L));
        this.LLLZIL.LIZIZ(121, c1470430oMr.LJIIJ(588, -1L));
        this.LLLZIL.LIZIZ(122, c1470430oMr.LJIIJ(584, -1L));
        this.LLLZIL.LIZIZ(123, c1470430oMr.LJIIJ(589, -1L));
        this.LLLZIL.LIZIZ(124, c1470430oMr.LJIIJ(585, -1L));
        this.LLLZIL.LIZIZ(125, c1470430oMr.LJIIJ(590, -1L));
        String strLJIIIZ = c1470430oMr.LJIIIZ(516);
        if (strLJIIIZ != null) {
            if (strLJIIIZ.equals("bash") || strLJIIIZ.equals("dash")) {
                this.LLLZIL.LJIIJ(1, "bash");
            }
        }
    }

    public final void LLFF() {
        InterfaceC1467950oIr interfaceC1467950oIr;
        JSONObject jSONObjectOptJSONObject;
        int i;
        InterfaceC1467950oIr interfaceC1467950oIr2 = this.LJIIIIZZ;
        if (interfaceC1467950oIr2 != null) {
            if (TTVideoEngine.LJIJ == 1) {
                TTPlayerClient tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr2).LIZ;
                if (tTPlayerClient != null) {
                    tTPlayerClient.LLJJIII.lock();
                    try {
                        mapLJI = tTPlayerClient.LJJIJIIJIL() ? tTPlayerClient.LLJJJ.LIZIZ.LJI() : null;
                        tTPlayerClient.LLJJIII.unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        tTPlayerClient.LLJJIII.unlock();
                        throw th;
                    }
                }
                C1468160oJC c1468160oJC = this.LLLZIL;
                if (c1468160oJC.LIZJ != null) {
                    if (mapLJI != null) {
                        if (mapLJI.get("formater_create_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJFF = ((Long) mapLJI.get("formater_create_t")).longValue();
                        }
                        if (mapLJI.get("avformat_open_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJI = ((Long) mapLJI.get("avformat_open_t")).longValue();
                        }
                        if (mapLJI.get("demuxer_begin_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJIIIIZZ = ((Long) mapLJI.get("demuxer_begin_t")).longValue();
                        }
                        if (mapLJI.get("demuxer_create_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJII = ((Long) mapLJI.get("demuxer_create_t")).longValue();
                        }
                        if (mapLJI.get("dec_create_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJIIIZ = ((Long) mapLJI.get("dec_create_t")).longValue();
                        }
                        if (mapLJI.get("outlet_create_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJIIJ = ((Long) mapLJI.get("outlet_create_t")).longValue();
                        }
                        if (mapLJI.get("v_dec_start_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJIILJJIL = ((Long) mapLJI.get("v_dec_start_t")).longValue();
                        }
                        if (mapLJI.get("a_dec_start_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJIILIIL = ((Long) mapLJI.get("a_dec_start_t")).longValue();
                        }
                        if (mapLJI.get("v_dec_opened_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJIILLIIL = ((Long) mapLJI.get("v_dec_opened_t")).longValue();
                        }
                        if (mapLJI.get("a_dec_opened_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJIILL = ((Long) mapLJI.get("a_dec_opened_t")).longValue();
                        }
                        if (mapLJI.get("v_render_f_t") instanceof Long) {
                            c1468160oJC.LIZJ.LJIIJJI = ((Long) mapLJI.get("v_render_f_t")).longValue();
                        }
                        if (mapLJI.get("v_render_mae") instanceof Number) {
                            C1468170oJD c1468170oJD = c1468160oJC.LIZJ;
                            if (c1468170oJD.G2 < 0.001d) {
                                c1468170oJD.G2 = ((Number) mapLJI.get("v_render_mae")).floatValue();
                            }
                        }
                        if (mapLJI.get("v_render_stddev") instanceof Number) {
                            C1468170oJD c1468170oJD2 = c1468160oJC.LIZJ;
                            if (c1468170oJD2.H2 < 0.001d) {
                                c1468170oJD2.H2 = ((Number) mapLJI.get("v_render_stddev")).floatValue();
                            }
                        }
                    }
                    c1468160oJC.LIZJ.F2 = mapLJI;
                }
            }
            C1468160oJC c1468160oJC2 = this.LLLZIL;
            C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr2;
            float fLJIILIIL = c1470430oMr.LJIILIIL(-1.0f, 150);
            C1468170oJD c1468170oJD3 = c1468160oJC2.LIZJ;
            if (c1468170oJD3 != null) {
                c1468170oJD3.LJLIIL = fLJIILIIL;
            }
            C1468160oJC c1468160oJC3 = this.LLLZIL;
            float fLJIILIIL2 = c1470430oMr.LJIILIIL(-1.0f, 151);
            C1468170oJD c1468170oJD4 = c1468160oJC3.LIZJ;
            if (c1468170oJD4 != null) {
                c1468170oJD4.LJLIL = fLJIILIIL2;
            }
            C1468160oJC c1468160oJC4 = this.LLLZIL;
            int iLJI = c1470430oMr.LJI(186, -1);
            C1468170oJD c1468170oJD5 = c1468160oJC4.LIZJ;
            if (c1468170oJD5 != null) {
                c1468170oJD5.LLILZ = iLJI;
            }
            C1468160oJC c1468160oJC5 = this.LLLZIL;
            long jLJIIJ = c1470430oMr.LJIIJ(152, -1L);
            C1468170oJD c1468170oJD6 = c1468160oJC5.LIZJ;
            if (c1468170oJD6 != null) {
                c1468170oJD6.LJLILLLLZI = jLJIIJ;
            }
            C1468160oJC c1468160oJC6 = this.LLLZIL;
            int iLJI2 = c1470430oMr.LJI(153, -1);
            C1468170oJD c1468170oJD7 = c1468160oJC6.LIZJ;
            if (c1468170oJD7 != null) {
                c1468170oJD7.LJLJI = iLJI2;
                c1468170oJD7.A1 = iLJI2 - c1468170oJD7.z1;
            }
            C1468160oJC c1468160oJC7 = this.LLLZIL;
            int iLJI3 = c1470430oMr.LJI(189, -1);
            C1468170oJD c1468170oJD8 = c1468160oJC7.LIZJ;
            if (c1468170oJD8 != null) {
                c1468170oJD8.LLILL = iLJI3;
            }
            C1468160oJC c1468160oJC8 = this.LLLZIL;
            int iLJI4 = c1470430oMr.LJI(221, -1);
            C1468170oJD c1468170oJD9 = c1468160oJC8.LIZJ;
            if (c1468170oJD9 != null && iLJI4 > 0) {
                c1468170oJD9.LLLFFI = iLJI4;
            }
            C1468160oJC c1468160oJC9 = this.LLLZIL;
            int iLJI5 = c1470430oMr.LJI(222, -1);
            C1468170oJD c1468170oJD10 = c1468160oJC9.LIZJ;
            if (c1468170oJD10 != null && iLJI5 > 0) {
                c1468170oJD10.LLLFZ = iLJI5;
            }
            C1468160oJC c1468160oJC10 = this.LLLZIL;
            int iLJI6 = c1470430oMr.LJI(245, -1);
            C1468170oJD c1468170oJD11 = c1468160oJC10.LIZJ;
            if (c1468170oJD11 != null && iLJI6 != 0) {
                c1468170oJD11.LLLI = iLJI6;
            }
            if (this.LJLIIL.LIZLLL > 0) {
                C1468160oJC c1468160oJC11 = this.LLLZIL;
                String strLJIIIZ = c1470430oMr.LJIIIZ(187);
                C1468170oJD c1468170oJD12 = c1468160oJC11.LIZJ;
                if (c1468170oJD12 != null) {
                    c1468170oJD12.LLILZIL = strLJIIIZ;
                }
                C1468160oJC c1468160oJC12 = this.LLLZIL;
                int iLJI7 = c1470430oMr.LJI(188, -1);
                C1468170oJD c1468170oJD13 = c1468160oJC12.LIZJ;
                if (c1468170oJD13 != null) {
                    c1468170oJD13.LLILZLL = iLJI7;
                }
            }
            if (this.LJIILL != 0) {
                C1468160oJC c1468160oJC13 = this.LLLZIL;
                long jLJIIJ2 = c1470430oMr.LJIIJ(73, -1L);
                C1468170oJD c1468170oJD14 = c1468160oJC13.LIZJ;
                if (c1468170oJD14 != null) {
                    c1468170oJD14.LLIIIILZ = (int) jLJIIJ2;
                }
                C1468160oJC c1468160oJC14 = this.LLLZIL;
                long jLJIIJ3 = c1470430oMr.LJIIJ(72, -1L);
                C1468170oJD c1468170oJD15 = c1468160oJC14.LIZJ;
                if (c1468170oJD15 != null) {
                    c1468170oJD15.LLIIII = (int) jLJIIJ3;
                }
            }
            this.LLLZIL.LIZIZ(21, c1470430oMr.LJIIJ(171, -1L));
            this.LLLZIL.LIZIZ(56, c1470430oMr.LJIIJ(468, -1L));
            this.LLLZIL.LIZIZ(82, c1470430oMr.LJIIJ(850, -1L));
            this.LLLZIL.LIZIZ(186, c1470430oMr.LJIIJ(857, -1L));
            this.LLLZIL.LIZIZ(187, c1470430oMr.LJIIJ(858, -1L));
            this.LLLZIL.LIZIZ(188, c1470430oMr.LJIIJ(859, -1L));
            this.LLLZIL.LIZIZ(84, c1470430oMr.LJIIJ(851, -1L));
            this.LLLZIL.LIZIZ(85, c1470430oMr.LJIIJ(852, -1L));
            this.LLLZIL.LIZ(189, c1470430oMr.LJIIIZ(4011));
            this.LLLZIL.LIZ(230, c1470430oMr.LJIIIZ(4013));
            this.LLLZIL.LIZJ(196, c1470430oMr.LJI(2000, -1));
            this.LLLZIL.LIZIZ(197, c1470430oMr.LJIIJ(2002, -1L));
            this.LLLZIL.LIZIZ(198, c1470430oMr.LJIIJ(2003, -1L));
            this.LLLZIL.LIZJ(199, c1470430oMr.LJI(2005, -1));
            this.LLLZIL.LIZIZ(200, c1470430oMr.LJIIJ(2006, -1L));
            this.LLLZIL.LIZJ(224, c1470430oMr.LJI(2010, -1));
            this.LLLZIL.LJLIIIL(c1470430oMr.LJIILIIL(Float.MIN_VALUE, 645), 242);
            this.LLLZIL.LIZJ(243, this.t4);
            this.LLLZIL.LIZ(244, this.O5);
            this.LLLZIL.LIZ(245, this.P5);
            if (C1474810oTv.LJJLIIJ()) {
                this.LLLZIL.LIZIZ(234, c1470430oMr.LJIIJ(1384, -1L));
                this.LLLZIL.LIZIZ(235, c1470430oMr.LJIIJ(1385, -1L));
            }
            this.LLLZIL.LIZ(252, c1470430oMr.LJIIIZ(35013));
            this.LLLZIL.LIZ(236, c1470430oMr.LJIIIZ(1383));
            long jLJIIJ4 = c1470430oMr.LJIIJ(902, 0L);
            if (jLJIIJ4 != 0) {
                TTPlayerStrategyCenter.LIZ().getClass();
                String strLIZLLL = TTPlayerStrategyCenter.LIZLLL(jLJIIJ4);
                if (strLIZLLL != null) {
                    this.LLLZIL.LIZ(202, strLIZLLL);
                }
            }
            if (this.z4 == 0) {
                String strLJIIIZ2 = c1470430oMr.LJIIIZ(516);
                boolean z = strLJIIIZ2 != null && (strLJIIIZ2.equals("bash") || strLJIIIZ2.equals("dash"));
                if (this.LJLIIL.LJI <= 0) {
                    if (z) {
                        long jLJIIJ5 = c1470430oMr.LJIIJ(1806, -2L);
                        long jLJIIJ6 = c1470430oMr.LJIIJ(1805, -2L);
                        long jLJIIJ7 = c1470430oMr.LJIIJ(1806, -3L);
                        long jLJIIJ8 = c1470430oMr.LJIIJ(1805, -3L);
                        this.LLLZIL.LIZIZ(191, jLJIIJ6);
                        this.LLLZIL.LIZIZ(192, jLJIIJ5);
                        this.LLLZIL.LIZIZ(194, jLJIIJ7);
                        this.LLLZIL.LIZIZ(193, jLJIIJ8);
                    } else {
                        long jLJIIJ9 = c1470430oMr.LJIIJ(1806, -1L);
                        this.LLLZIL.LIZIZ(191, c1470430oMr.LJIIJ(1805, -1L));
                        this.LLLZIL.LIZIZ(192, jLJIIJ9);
                    }
                }
                this.z4 = 1;
                C1467080oHS c1467080oHS = this.g6;
                InterfaceC1467150oHZ interfaceC1467150oHZ = c1467080oHS.LJI;
                if (interfaceC1467150oHZ != null) {
                    C1467070oHR c1467070oHR = c1467080oHS.LIZ;
                    String strLJIILLIIL = interfaceC1467150oHZ.LJIILLIIL(c1467070oHR.LJIL, c1467070oHR.LJI > 0 ? 1 : 0);
                    if (strLJIILLIIL != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(strLJIILLIIL);
                            if (jSONObject.has("v_state")) {
                                c1467080oHS.LIZJ.LIZIZ(191, JSONObjectProtectorUtils.getInt(jSONObject, "v_state"));
                            }
                            if (z && jSONObject.has("a_state")) {
                                c1467080oHS.LIZJ.LIZIZ(191, JSONObjectProtectorUtils.getInt(jSONObject, "a_state"));
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
            int iLJI8 = c1470430oMr.LJI(62, -1);
            int iLJI9 = c1470430oMr.LJI(61, -1);
            if (iLJI8 == 0) {
                this.LLLZIL.LIZJ(12, 1);
                i = 0;
            } else {
                i = 0;
                this.LLLZIL.LIZJ(12, 0);
            }
            if (iLJI9 == 0) {
                this.LLLZIL.LIZJ(13, 1);
            } else {
                this.LLLZIL.LIZJ(13, i);
            }
            LLF();
            if (TTVideoEngine.LJIJ == 0) {
                this.LLLZIL.LIZJ(89, c1470430oMr.LJI(912, -1));
                this.LLLZIL.LIZJ(195, c1470430oMr.LJI(2001, -1));
            }
        }
        this.LLLZIL.LIZJ(11, this.LJJJJZI);
        if (this.X5 > 0) {
            this.LLLZIL.LIZJ(79, 2);
        } else {
            this.LLLZIL.LIZJ(79, 0);
        }
        this.LLLZIL.LIZJ(80, this.d3);
        this.LLLZIL.LIZJ(81, this.e3);
        if (((Boolean) C1474810oTv.f1.getValue()).booleanValue()) {
            this.LLLZIL.LIZJ(239, this.T5);
        }
        this.f6.LJ();
        if (this.S1 != null && (interfaceC1467950oIr = this.LJIIIIZZ) != null) {
            String str = C795730VJj.LIZ.get(Integer.valueOf(((C1470430oMr) interfaceC1467950oIr).LJI(1386, 0)));
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(new JSONObject(this.S1), "v1");
                    if (jSONObject2 != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject(str)) != null) {
                        this.LLLZIL.LIZ(237, C786410Ut5.J3(jSONObjectOptJSONObject));
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        if (TTVideoEngine.LJIIL == 0) {
            ((HashMap) this.LLLZIL.LIZJ.i).putAll(this.V1);
        } else if (this.T1 > 0) {
            ((HashMap) this.LLLZIL.LIZJ.i).putAll(this.V1);
        }
        TTVideoEngine tTVideoEngine = this.y5;
        if (tTVideoEngine != null) {
            this.LLLZIL.LJLIIIL(tTVideoEngine.LIZLLL, 241);
        }
    }

    public final void LLFFF() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) this.LLZZ).entrySet()) {
            Object key = entry.getKey();
            C1467610oIJ c1467610oIJ = (C1467610oIJ) entry.getValue();
            if (key != null && c1467610oIJ != null) {
                HashMap map = new HashMap();
                map.put("url", key);
                map.put("ip", c1467610oIJ.LIZ);
                map.put("dns", c1467610oIJ.LIZIZ);
                map.put("dns_cache_open", Integer.valueOf(c1467610oIJ.LIZJ));
                map.put("server_dns_open", Integer.valueOf(c1467610oIJ.LIZLLL));
                map.put("url_desc", c1467610oIJ.LJ);
                if (this.LJIL.LIZ() && !TextUtils.isEmpty(this.r)) {
                    map.put("gid", this.r);
                }
                arrayList.add(map);
            }
        }
        if (this.LJIL.LIZ()) {
            return;
        }
        this.LLLZIL.LJIJI = arrayList;
    }

    public final void LLIIIJ() {
        C1467730oIV c1467730oIV = this.LJJLIL;
        C1467730oIV c1467730oIV2 = InterfaceC1467720oIU.LIZ;
        if (c1467730oIV != c1467730oIV2) {
            return;
        }
        this.LJJZ = false;
        this.LJJZZI = false;
        this.LJJZZIII = false;
        this.LJJLIIJ = c1467730oIV2;
        this.LJJLIL = c1467730oIV2;
        this.LJJLJLI = C1467840oIg.LIZ;
        this.LJJLJ = new C1467460oI4();
    }

    public final void LLIIIL() {
        if (this.i6 != 0) {
            if (LLJLILLLLZIIL() && !C1474810oTv.LLIL()) {
                C1469350oL7 c1469350oL7 = this.LLLLLZL;
                if (c1469350oL7 != null) {
                    c1469350oL7.LJJLIIIIJ(1);
                }
                this.i6 = 0;
            }
            if (this.i6 == 2) {
                this.h6.LIZ(this.LJIIIIZZ);
            }
        }
    }

    public final InterfaceC1467950oIr LLIIJLIL() {
        LJJJJZI(this.LJIIJJI);
        C1284100jWK c1284100jWK = C1284100jWK.LIZLLL;
        c1284100jWK.LIZIZ();
        if (this.LJII == null) {
            this.LJII = C1470620oNA.LIZ(this.LJLILLLLZI, this.LJLIL);
        }
        InterfaceC1467950oIr interfaceC1467950oIrInitMediaPlayer = this.LJLIL.LIZJ.initMediaPlayer();
        c1284100jWK.LIZ();
        if (interfaceC1467950oIrInitMediaPlayer == null) {
            return null;
        }
        C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIrInitMediaPlayer;
        if (c1470430oMr.LIZIZ && this.LLLZIL != null) {
            String str = c1470430oMr.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(",customState:");
            sbLIZ.append(this.Z1);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1468160oJC c1468160oJC = this.LLLZIL;
            C1468170oJD c1468170oJD = c1468160oJC.LIZJ;
            if (c1468170oJD != null) {
                c1468170oJD.LJJLIIIJ = 1;
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    c1468160oJC.LIZJ.LJJLIIIJILLIZJL = strLIZIZ;
                }
            }
        }
        if (c1470430oMr.LIZ == null) {
            return null;
        }
        if (((Boolean) C1474810oTv.h6.getValue()).booleanValue()) {
            c1470430oMr.LIZJ(49992, 1);
        }
        if (((Boolean) C1474810oTv.g6.getValue()).booleanValue()) {
            ConfigCenter.LJI().getClass();
            c1470430oMr.LJIJJLI(ConfigCenter.LIZIZ(null));
        }
        if (((Boolean) C1474810oTv.l6.getValue()).booleanValue() && !C1474810oTv.LJJJJLL()) {
            InterfaceC1467440oI2 interfaceC1467440oI2 = this.LJJLL;
            if (interfaceC1467440oI2 != null) {
                interfaceC1467440oI2.release();
            }
            ConfigCenter.LJI().getClass();
            InterfaceC1467440oI2 interfaceC1467440oI2LIZIZ = ConfigCenter.LIZIZ(null);
            this.LJJLL = interfaceC1467440oI2LIZIZ;
            interfaceC1467440oI2LIZIZ.LJII();
            InterfaceC1467440oI2 interfaceC1467440oI22 = this.LJJLL;
            int iIntValue = ((Number) C1474810oTv.m6.getValue()).intValue();
            int iIntValue2 = ((Number) C1474810oTv.n6.getValue()).intValue();
            TTPlayerClient tTPlayerClient = c1470430oMr.LIZ;
            if (tTPlayerClient != null) {
                tTPlayerClient.LLJJIII.lock();
                try {
                    if (tTPlayerClient.LJJIJIIJIL()) {
                        TTPlayer tTPlayer = tTPlayerClient.LLJJJ.LIZIZ;
                        tTPlayer.LJ = interfaceC1467440oI22;
                        tTPlayer.LJFF = iIntValue;
                        tTPlayer.LJI = iIntValue2;
                        C1285320jYI.LIZIZ(null, "TTPlayerJava", "set empty config.");
                    }
                    tTPlayerClient.LLJJIII.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    tTPlayerClient.LLJJIII.unlock();
                    throw th;
                }
            }
        }
        if (this.w5 && this.LJLIIL.LIZLLL > 0 && this.B1 > 0 && this.o5 == 2) {
            c1470430oMr.LIZJ(59, 1);
            c1470430oMr.LIZJ(400, 1);
            c1470430oMr.LIZJ(1344, 2);
            c1470430oMr.LIZJ(181, 1);
            c1470430oMr.LIZJ(182, this.LJJJJJ);
            c1470430oMr.LIZJ(88, this.LLJJIJI);
            c1470430oMr.LIZJ(285, this.P0);
            c1470430oMr.LIZJ(574, this.B2);
            c1470430oMr.LIZJ(575, this.C2);
            c1470430oMr.LIZJ(576, this.D2);
            c1470430oMr.LIZJ(164, this.x2);
            c1470430oMr.LIZJ(254, this.C1);
            c1470430oMr.LIZJ(1055, this.LLJIJIL);
            c1470430oMr.LIZJ(1056, this.LLJILJIL);
            c1470430oMr.LIZJ(1072, this.d4);
            if (this.E4 <= 0 || this.D4 <= 0) {
                this.E4 = 1080;
                this.D4 = 1920;
            }
            c1470430oMr.LIZJ(1009, this.E4);
            c1470430oMr.LIZJ(1008, this.D4);
            int i = this.I4;
            if (i != -1) {
                c1470430oMr.LIZJ(1041, i);
            }
            int i2 = this.p5;
            if (i2 != -1) {
                c1470430oMr.LIZJ(1345, i2);
            }
            int i3 = this.q5;
            if (i3 != -1) {
                c1470430oMr.LIZJ(1346, i3);
            }
            int i4 = this.r5;
            if (i4 != -1) {
                c1470430oMr.LIZJ(1347, i4);
            }
            int i5 = this.s5;
            if (i5 != -1) {
                c1470430oMr.LIZJ(1348, i5);
            }
            int i6 = this.J4;
            if (i6 != -1) {
                c1470430oMr.LIZJ(1034, i6);
            }
            int i7 = this.Q3;
            if (i7 != -1) {
                c1470430oMr.LIZJ(1003, i7);
                for (int i8 = 0; i8 < this.R3.size(); i8++) {
                    try {
                        c1470430oMr.LIZ(1002, this.R3.get(i8));
                    } catch (IndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1470430oMr.LIZJ(1003, 0);
                    }
                }
            }
            int i9 = this.P3;
            if (i9 != -1) {
                c1470430oMr.LIZJ(LSPassThroughRecordSizeConfig.DEFAULT, i9);
            }
            int i10 = this.LLJILJILJ;
            if (i10 != -1) {
                c1470430oMr.LIZJ(1057, i10);
            }
            int i11 = this.Z4;
            if (i11 != -1) {
                c1470430oMr.LIZJ(1326, i11);
            }
            int i12 = this.a5;
            if (i12 != -1) {
                c1470430oMr.LIZJ(1327, i12);
            }
            int i13 = this.b5;
            if (i13 != -1) {
                c1470430oMr.LIZJ(1328, i13);
            }
            int i14 = this.g5;
            if (i14 != -1) {
                c1470430oMr.LIZJ(1333, i14);
            }
            int i15 = this.h5;
            if (i15 != -1) {
                c1470430oMr.LIZJ(1334, i15);
            }
            int i16 = this.X4;
            if (i16 != -1) {
                c1470430oMr.LIZJ(1313, i16);
            }
            int i17 = this.LLJJJJ;
            if (i17 == 1) {
                c1470430oMr.LIZJ(212, i17);
                c1470430oMr.LIZJ(213, this.LLJJJJJIL);
            }
            int i18 = this.K0;
            if (i18 == 1) {
                c1470430oMr.LIZJ(280, i18);
            }
            C1467040oHO c1467040oHO = this.D5;
            if (c1467040oHO != null) {
                c1470430oMr.LIZJ(42039, c1467040oHO.LIZIZ(42039, 0));
            }
            c1470430oMr.LJIJJLI(this.LJJLIL);
            if (c1470430oMr.LIZ != null) {
                try {
                    Method method = C1469080oKg.LIZ(200, "com.ss.ttm.player.TTPlayerClient").getMethod("setupMediaCodec", new Class[0]);
                    method.setAccessible(true);
                    method.invoke(c1470430oMr.LIZ, new Object[0]);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            this.w5 = false;
        }
        this.g6.LJJIJIIJI(interfaceC1467950oIrInitMediaPlayer);
        C1468160oJC c1468160oJC2 = this.LLLZIL;
        if (c1468160oJC2 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1468170oJD c1468170oJD2 = c1468160oJC2.LIZJ;
            if (c1468170oJD2 != null && c1468170oJD2.LLJJIII <= 0) {
                c1468170oJD2.LLJJIII = jCurrentTimeMillis;
            }
            this.LLLZIL.LLI = this.LJLIL;
        }
        this.LJJLJLI.getClass();
        return interfaceC1467950oIrInitMediaPlayer;
    }

    public final void LLIILZL() {
        TTPlayerClient tTPlayerClient;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr == null || (tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr).LIZ) == null) {
            return;
        }
        tTPlayerClient.LLJJIII.lock();
        try {
            if (tTPlayerClient.LJJIJIIJIL()) {
                tTPlayerClient.LLJJJ.LIZIZ.LJII.LJFF();
            }
            tTPlayerClient.LLJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            tTPlayerClient.LLJJIII.unlock();
            throw th;
        }
    }

    public final boolean LLILIL() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr == null) {
            return true;
        }
        try {
            int currentPosition = ((C1470430oMr) interfaceC1467950oIr).getCurrentPosition();
            int duration = ((C1470430oMr) this.LJIIIIZZ).getDuration();
            long jLJIIJ = ((C1470430oMr) this.LJIIIIZZ).LJIIJ(72, -1L);
            if (((C1470430oMr) this.LJIIIIZZ).LJI(157, -1) != 5 || this.LJIILL != 1 || this.LJLIIL.LIZJ != 1 || currentPosition < 1000 || duration - currentPosition < 1000 || jLJIIJ < 500) {
                return true;
            }
            int iLJI = ((C1470430oMr) this.LJIIIIZZ).LJI(160, 100);
            long jLJIIJ2 = ((C1470430oMr) this.LJIIIIZZ).LJIIJ(152, -1L);
            int iLJI2 = ((C1470430oMr) this.LJIIIIZZ).LJI(153, -1);
            float fLJIILIIL = ((C1470430oMr) this.LJIIIIZZ).LJIILIIL(0.0f, 151);
            if (fLJIILIIL > this.LLILLIZIL) {
                fLJIILIIL /= 2.0f;
            }
            int i = this.LLJILLL;
            int i2 = (((int) fLJIILIIL) * i) / (i + 1);
            if (jLJIIJ2 <= -350) {
                return iLJI2 < (i2 * 2) / 3 || iLJI <= 2;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    public final String LLILLL() {
        int iLIZ;
        boolean z;
        InterfaceC1467290oHn interfaceC1467290oHn = this.LJIL;
        String str = interfaceC1467290oHn.LIZJ() ? ((C1467190oHd) interfaceC1467290oHn).LJFF : null;
        if (!TextUtils.isEmpty(str)) {
            try {
                iLIZ = C795750VJl.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iLIZ = 0;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append(C786410Ut5.j4("&method=%d", new Object[]{Integer.valueOf(iLIZ)}));
            if (!TextUtils.isEmpty(this.f183u4)) {
                sb.append(C786410Ut5.j4("&%s=%s", new Object[]{"force_codec", this.f183u4}));
            }
            return sb.toString();
        }
        if (this.LLLLLZ == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (C1469080oKg.LIZ) {
            z = true;
        } else {
            try {
                C1469080oKg.LIZ(200, "com.ss.ttm.player.TTPlayerClient");
                C1469080oKg.LIZ = true;
                z = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                z = false;
            }
        }
        String strLIZLLL = x.LIZLLL(14, "");
        boolean z2 = this.LJLLL;
        if (z) {
            if (z2) {
                map.put("format_type", "dash");
            }
            String str2 = this.LJLLJ;
            if (str2.equals("bytevc2")) {
                map.put("codec_type", "4");
            } else if (str2.equals("bytevc1")) {
                map.put("codec_type", "3");
            }
        } else {
            this.LJLIIL.LIZLLL = 0;
        }
        if (this.LJIIJ == 2 && this.k == 2) {
            map.put("format_type", "mpd");
        }
        if (this.f173e0 || this.LJLIIL.LJIILLIIL) {
            this.LJLLILLLL = true;
            map.put("ssl", "1");
        } else {
            this.LJLLILLLL = false;
        }
        map.put("player_version", strLIZLLL);
        if (this.i3 > 1) {
            map.put("barragemask", "1");
        }
        map.put("cdn_type", String.valueOf(this.g6.LJIL(301)));
        C1468070oJ3.LIZ().getClass();
        if (!TextUtils.isEmpty(this.f183u4)) {
            map.put("force_codec", this.f183u4);
        }
        int i = this.LJIIJ;
        HashMap map2 = new HashMap();
        if (i == 5 || i == 2) {
            map2.put("unsupport_bytevc2", "true");
            map2.put("unsupport_dash", "true");
        }
        if (this.A5 && !map2.isEmpty()) {
            try {
                map.put("TtPlayerSdkOptions", C786410Ut5.J3(new JSONObject(map2)));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return this.LLLLLZ.LIZ(C1467400oHy.LIZIZ(this.LJIL), map);
    }

    public final String LLILZ() {
        return this.LJIL.LJI() ? this.LJIL.getUrl() : this.LJLIIL.LJJ.LIZ;
    }

    public final int LLILZIL() {
        C1467070oHR c1467070oHR = this.LJLIIL;
        int i = c1467070oHR.LIZIZ;
        if (i != 3) {
            if (this.LLZZZZ || i == 4) {
                return this.LJJIZ;
            }
            return -1;
        }
        int i2 = this.LJIILL;
        if ((i2 != 1 && i2 != 2 && !this.LJJIIJ) || c1467070oHR.LJIJI) {
            return -1;
        }
        if (!this.LJJIIZ) {
            return LLIIZ();
        }
        int i3 = c1467070oHR.LJFF;
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    public final int LLILZLL() {
        int i = this.LJIIJ;
        return (i == 2 || i == 5 || this.t3 <= 0) ? LLILZIL() : this.s3;
    }

    public final EnumC2281151EQn LLIZ() {
        return this.LJIL.getCurrentResolution();
    }

    public final String LLIZLLLIL() {
        InterfaceC1467290oHn interfaceC1467290oHn = this.LJIL;
        if (interfaceC1467290oHn.LIZ()) {
            return ((C1467450oI3) interfaceC1467290oHn).LJFF;
        }
        return null;
    }

    public final InterfaceC1467050oHP LLJIJIL() {
        return C1467400oHy.LIZJ(this.LJIL);
    }

    public final float LLJILJILJ() {
        int iZ3;
        Context context = this.LJI;
        if (context == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
        int i = 0;
        if (audioManager != null) {
            iZ3 = C786410Ut5.Z3(audioManager, 3);
            if (iZ3 >= 0) {
            }
            return i;
        }
        iZ3 = 0;
        i = iZ3;
        return i;
    }

    public final InterfaceC1468030oIz LLJILLL() {
        C1468160oJC c1468160oJC = this.LLLZIL;
        if (c1468160oJC == null) {
            return null;
        }
        return c1468160oJC.LJJIIJ();
    }

    public final int LLJJ() {
        return C1467400oHy.LIZIZ(this.LJIL);
    }

    public final Surface LLJJI() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            return ((C1470430oMr) interfaceC1467950oIr).LJIILJJIL();
        }
        return null;
    }

    public final InterfaceC1468020oIy LLJJIJIIJIL() {
        return new C1467030oHN(this, this.g6);
    }

    public final void LLJJIJIL() {
        int iIndexOf;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            String strLJIIIZ = ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(516);
            if (!TextUtils.isEmpty(strLJIIIZ) && strLJIIIZ.indexOf("mp4") <= 0 && (iIndexOf = strLJIIIZ.indexOf(",")) >= 0) {
                strLJIIIZ.substring(0, iIndexOf);
            }
            ((C1470430oMr) this.LJIIIIZZ).LJIIJ(171, 0L);
            ((C1470430oMr) this.LJIIIIZZ).LJI(157, -1);
            ((C1470430oMr) this.LJIIIIZZ).LJI(403, -1);
            ((C1470430oMr) this.LJIIIIZZ).getVideoWidth();
            ((C1470430oMr) this.LJIIIIZZ).getVideoHeight();
            ((C1470430oMr) this.LJIIIIZZ).LJI(555, -1);
            ((C1470430oMr) this.LJIIIIZZ).LJIILIIL(0.0f, 151);
            ((C1470430oMr) this.LJIIIIZZ).LJI(158, -1);
            ((C1470430oMr) this.LJIIIIZZ).LJI(402, -1);
            ((C1470430oMr) this.LJIIIIZZ).LJI(553, -1);
            ((C1470430oMr) this.LJIIIIZZ).LJI(554, -1);
        }
    }

    public final String LLJJJ() {
        return this.LJIL.getVideoId();
    }

    public final C1470240oMY LLJJJIL() {
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (interfaceC1467050oHPLIZJ instanceof C1470240oMY) {
            return (C1470240oMY) interfaceC1467050oHPLIZJ;
        }
        return null;
    }

    public final float LLJJJJ() {
        return C795730VJj.LJIIIZ(this.LJI);
    }

    public final boolean LLJLIL() {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr == null) {
            int i = this.LJIIJ;
            return i == 2 || i == 5;
        }
        C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
        return (c1470430oMr.LIZ instanceof C20547315ah) || c1470430oMr.getPlayerType() == 5;
    }

    public final boolean LLJLILLLLZIIL() {
        return C1467570oIF.LIZ(this.LLII, this.X5 > 0) == 8;
    }

    public final void LLJLL() {
        String videoId = this.LJIL.getVideoId();
        Hashtable<String, C1467920oIo> hashtable = C1467930oIp.LIZIZ;
        if (!TextUtils.isEmpty(videoId)) {
            C1467930oIp.LIZIZ.remove(videoId);
        }
        try {
            C1467940oIq.LIZIZ(this.K3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.K3 = null;
    }

    public void LLL() {
        this.LLLLLZL.LJIILL(this.y5);
    }

    public void LLLIIIIL() {
        this.LLLLLZL.LJIIIZ(this.y5);
    }

    public void LLLIIIL() {
        this.LLLLLZL.LJIILIIL(this.y5);
    }

    public void LLLIIL() {
        this.LLLLLZL.LJJLIIIJJIZ(this.y5);
    }

    public void LLLIILIL() {
        this.LLLLLZL.LJ(this.y5);
    }

    public void LLLILZ() {
        if (this.V == 0) {
            this.LLLLLZL.LJIIIIZZ(this.y5);
        }
    }

    public final String LLLLIIL() {
        int i = C1309170kAl.LIZ;
        String strLJJJI = this.LLLZIL.LJJJI();
        if (TextUtils.isEmpty(strLJJJI)) {
            strLJJJI = "null";
        }
        return C786410Ut5.j4("appId:%d,os:Android,traceId:%s,appSessionId:%s,tag:%s", new Object[]{Integer.valueOf(i), strLJJJI, C1468180oJE.LJJZZIII, TextUtils.isEmpty(this.LJ) ? "default" : this.LJ});
    }

    public final void LLLLIILLL() {
        InterfaceC1467090oHT interfaceC1467090oHT = this.LJII;
        if (interfaceC1467090oHT != null) {
            interfaceC1467090oHT.release();
            this.LJII = null;
            this.LJIIIIZZ = null;
        }
        this.LJLIIL.LJIIZILJ = false;
    }

    public final void LLLLILI() {
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(59, this.LJLIIL.LIZLLL);
        if (this.LLJJJJLIIL == 1) {
            if (!this.LJJZZI) {
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLJJL), 303);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLJJLIIIJLLLLLLLZ), 304);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLJLIL), 306);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLJL), 305);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLJLILLLLZIIL), 644);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLJLLIL), 645);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLJLL), 646);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLJLLL), 1151);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLJZ), 1152);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLL), 1153);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLLF), 1154);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLLFF), 1155);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLLFFI), 1156);
                ((C1470430oMr) this.LJIIIIZZ).LJIL(LJIIJJI(this.LLLFZ), 1157);
            }
            if (!this.LJJZZIII) {
                ((C1470430oMr) this.LJIIIIZZ).LIZ(1158, LJIIL(this.LLLIIIIL));
                ((C1470430oMr) this.LJIIIIZZ).LIZ(1161, LJIIL(this.LLLIIIL));
                ((C1470430oMr) this.LJIIIIZZ).LIZ(1162, LJIIL(this.LLLIIL));
            }
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(643, this.LLJZIJLIL);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1159, this.LLLI);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1160, this.LLLII);
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(224, this.Y3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(302, this.LLJJJJLIIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(370, this.LLLLIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(570, this.Z3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(855, this.LLFII);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(196, (this.LJJJJLI && this.D) ? 0 : 1);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(289, this.LJJJJLI ? 0 : this.d3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(290, this.e3);
        if (this.f3 > 0) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(296, 1);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(294, this.f3);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(295, this.g3);
        }
        String str = TextUtils.isEmpty(this.LJ) ? "default" : this.LJ;
        String str2 = TextUtils.isEmpty(this.LJFF) ? "default" : this.LJFF;
        ((C1470430oMr) this.LJIIIIZZ).LIZ(1304, str);
        ((C1470430oMr) this.LJIIIIZZ).LIZ(1305, str2);
        if (!((ArrayList) this.LJLIIL.LJJI).isEmpty()) {
            ((C1470430oMr) this.LJIIIIZZ).LIZ(2007, (String) ListProtector.get(this.LJLIIL.LJJI, 0));
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1013, this.B5);
        if (this.s6 > 0) {
            LIZJ(43211, 1);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1371, this.s6);
        }
    }

    public final void LLLLJ() {
        if (this.l6 == null && this.o6.booleanValue()) {
            LLLLIIIILLL(this.m6, this.n6);
        }
    }

    public final void LLLLJI() {
        this.LLLLLZL.getClass();
    }

    public final String[] LLLZ() {
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (interfaceC1467050oHPLIZJ != null) {
            return interfaceC1467050oHPLIZJ.LIZJ();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String LLLZI() {
        String str;
        String str2;
        String str3 = this.S5;
        if (str3 == null) {
            str3 = this.LJ;
        }
        if (TextUtils.isEmpty(str3)) {
            str = "vt";
        } else if (!str3.contains("search")) {
            switch (str3.hashCode()) {
                case -1731750228:
                    str = !str3.equals("single_song") ? "vt" : "vs";
                    break;
                case -1482672230:
                    str = !str3.equals("collection_video") ? "vt" : "vc";
                    break;
                case -1271119582:
                    str = !str3.equals("homepage_follow") ? "vt" : "vw";
                    break;
                case -667094460:
                    str = !str3.equals("homepage_friends") ? "vt" : "vf";
                    break;
                case -562830579:
                    str = !str3.equals("personal_homepage") ? "vt" : "vp";
                    break;
                case 809483594:
                    str = !str3.equals("others_homepage") ? "vt" : "vo";
                    break;
                case 910603205:
                    str = !str3.equals("homepage_mall") ? "vt" : "vm";
                    break;
                case 1425879700:
                    str = !str3.equals("search_result") ? "vt" : "vr";
                    break;
                case 1691937916:
                    str = !str3.equals("homepage_hot") ? "vt" : "vh";
                    break;
                default:
                    str = "vt";
                    break;
            }
        } else {
            str = "vg";
        }
        return (((Boolean) C1474810oTv.b2.getValue()).booleanValue() && "vt".equals(str) && ((str2 = this.S5) != null || (str2 = this.LJ) != null)) ? str2 : str;
    }

    @Override // X.InterfaceC1467390oHx
    public void pause() {
        C1467110oHV c1467110oHV;
        this.LJLIIL.LJIJ = false;
        C1468160oJC c1468160oJC = this.LLLZIL;
        if (TTVideoEngine.LJIIL == 0) {
            InterfaceC1468020oIy interfaceC1468020oIy = c1468160oJC.LIZIZ;
            int iLIZJ = interfaceC1468020oIy != null ? ((C1467030oHN) interfaceC1468020oIy).LIZJ(67) : -1;
            HashMap map = new HashMap(2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put("p", Integer.valueOf(iLIZJ));
            map.put("t", Long.valueOf(jCurrentTimeMillis));
            C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map)), c1468160oJC.LLJJIJIL);
            if (c1468160oJC.LLJLIL && (c1467110oHV = c1468160oJC.LJFF) != null) {
                c1467110oHV.LIZIZ.LJJIJIL.add(Long.valueOf(jCurrentTimeMillis));
            }
        }
        int i = c1468160oJC.LL + 1;
        c1468160oJC.LL = i;
        c1468160oJC.LLFII = i;
        c1468160oJC.LJLLL.LIZLLL = false;
        if (this.LJJIIJ) {
            InterfaceC1467090oHT interfaceC1467090oHT = this.LJII;
            if (interfaceC1467090oHT != null) {
                interfaceC1467090oHT.pause();
                LLLZIL(2, null);
            }
            this.f6.onPause();
        } else {
            this.LJJIII = true;
            LLLZIL(2, null);
        }
        C1467010oHL c1467010oHL = this.LJJJJIZL;
        if (c1467010oHL != null) {
            c1467010oHL.LIZLLL();
        }
    }

    @Override // X.InterfaceC1467390oHx
    public void play() {
        C1467190oHd c1467190oHd;
        InterfaceC1467050oHP interfaceC1467050oHP;
        C1467070oHR c1467070oHR = this.LJLIIL;
        if (c1467070oHR.LIZIZ == 5) {
            this.t4 = 5;
            return;
        }
        boolean z = true;
        c1467070oHR.LJIJ = true;
        c1467070oHR.LJIJI = false;
        this.LJJII = false;
        this.LJJIJIL = 0;
        if (this.LJIL.LIZJ() && (interfaceC1467050oHP = (c1467190oHd = (C1467190oHd) this.LJIL).LJII) != null) {
            interfaceC1467050oHP.LJJI(c1467190oHd.LJIIIZ);
        }
        if (this.LJJIIZ) {
            this.LLLZIL.LIZJ(14, 1);
            this.LJJIIZ = false;
        }
        C2032407xi.LIZIZ().LIZ(this.y5);
        if (C1474810oTv.LJLI() && this.w6 && this.LJLIIL.LIZIZ == 3) {
            this.w6 = false;
            C1467080oHS c1467080oHS = this.g6;
            InterfaceC1467150oHZ interfaceC1467150oHZ = c1467080oHS.LJI;
            if (interfaceC1467150oHZ != null) {
                interfaceC1467150oHZ.LJJIFFI(c1467080oHS.LIZ.LJIL);
            }
        }
        if (!this.LJJJJLI && this.LJJIJ <= 0 && !this.LJJIIJ) {
            z = false;
        }
        LJLJI(z);
        this.LJLIIL.LJIILJJIL = false;
    }

    @Override // X.InterfaceC1467390oHx
    public void release() {
        this.LJLIIL.LJIJI = true;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = true;
        EngineThreadPool.addExecuteTask(new RunnableC790180UzA(this.V0));
        this.LJLIIL.LJIJ = false;
        LJZI(1, false);
        InterfaceC1467090oHT interfaceC1467090oHT = this.LJII;
        if (interfaceC1467090oHT != null) {
            interfaceC1467090oHT.release();
            this.LJII = null;
            this.LJIIIIZZ = null;
        }
        if (this.A1 != null && ((Boolean) C1474810oTv.G1.getValue()).booleanValue() && !C1470530oN1.LIZ(this.LJLILLLLZI)) {
            if (((Boolean) C1474810oTv.e5.getValue()).booleanValue()) {
                ((C1470430oMr) this.A1).LJIJI();
            } else {
                ((C1470430oMr) this.A1).release();
            }
            this.A1 = null;
        }
        LJJLIIIJJI();
    }

    @Override // X.InterfaceC1467390oHx
    public void start() {
        C1467070oHR c1467070oHR = this.LJLIIL;
        c1467070oHR.LJIJ = true;
        c1467070oHR.LJIJI = false;
        this.LJJII = false;
        this.LJJIJIL = 0;
        LJLJI(true);
        this.LJLIIL.LJIILJJIL = false;
    }

    @Override // X.InterfaceC1467390oHx
    public boolean LJIJJ() {
        return LLILIL();
    }

    @Override // X.AbstractC1467000oHK
    public final void LJJJJJL() {
        int iLIZIZ;
        TTPlayerClient tTPlayerClient;
        super.LJJJJJL();
        C1468060oJ2.LIZ();
        C1468060oJ2 c1468060oJ2 = C790030Uyv.LIZ;
        if (c1468060oJ2.LJIIZILJ) {
            C1468060oJ2.LIZ();
            c1468060oJ2.LJIIZILJ = false;
            InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
            C1468060oJ2.LIZ();
            ((C1470430oMr) interfaceC1467950oIr).LIZIZ(4300, c1468060oJ2.LIZIZ(0));
            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LJIIIIZZ;
            C1468060oJ2.LIZ();
            ((C1470430oMr) interfaceC1467950oIr2).LIZIZ(4301, c1468060oJ2.LIZIZ(1));
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(823, this.f176k0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(619, this.f179o0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(828, this.p0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1601, this.q0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1602, this.r0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1800, this.s0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1900, this.w0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1901, this.x0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1902, this.y0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(870, this.x3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(853, this.p3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(829, this.q3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(854, this.r3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(185, this.l0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(201, this.R);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(95, this.LLILIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(96, this.LLILL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(133, this.LLIIJLIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(81, this.LLLLII);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(9, this.LLLLIIIILLL * 1000000);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(197, this.LLIILZL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(253, this.w1);
        int i = this.LLIILII;
        if (i == 0) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(183, i);
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(827, this.LLIIIZ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(67, this.LLIIIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(44116, this.LJZL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(86, this.LLIIJI);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(110, this.LLLJ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(111, this.G);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(159, this.LLJILLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(195, this.LLJJI);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(79, this.LJLJJL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(66, this.LJLJJI);
        int i2 = this.p6;
        if (i2 != 0) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1986, i2);
        }
        int i3 = this.q6;
        if (i3 != 0) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1987, i3);
        }
        String str = this.r6;
        if (str != null) {
            ((C1470430oMr) this.LJIIIIZZ).LIZ(1979, str);
        }
        int i4 = this.LJLJLJ;
        if (i4 != 0 && this.C) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(24, i4);
        }
        if (this.LJLJLLL == 1 && C1474810oTv.LJJLIIJ()) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(35002, this.LJLJLLL);
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(83, this.LLIIIJ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(37, this.LLFZ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(38, this.LLI);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(36, this.LLIFFJFJJ);
        if (((Boolean) C1474810oTv.i2.getValue()).booleanValue() && this.v6) {
            this.LLII = 8;
        }
        C1468060oJ2.LIZ();
        int i5 = c1468060oJ2.LIZ;
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(56, i5 == -1 ? C1467570oIF.LIZ(this.LLII, this.X5 > 0) : C1467570oIF.LIZ(i5, this.X5 > 0));
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(301, this.LLLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(211, this.LLJJIJIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(247, this.LLLILZLLLI);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(248, this.LLLIZZ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(134, this.LLILLIZIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1010, this.LLILLJJLI);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1011, this.LLILLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1012, this.LLILZ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1014, this.LLILZIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(50302, this.LLILZLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(50303, this.LLIZ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(50304, this.LLIZLLLIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(50305, this.LLJ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(50306, this.LLJI);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1055, this.LLJIJIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1056, this.LLJILJIL);
        int i6 = this.LLJILJILJ;
        if (i6 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1057, i6);
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(192, this.LLJJ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(358, this.LLLLIILL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(278, this.I0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(276, this.H0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(263, this.G0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(199, this.LLJJIII);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(256, this.E1);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(285, this.P0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(286, this.Q0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(292, this.S0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(293, this.T0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(297, this.U0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(647, this.t3);
        LJJL();
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(565, this.V3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(664, this.a4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(666, this.w4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1004, this.LLLLLILLIL);
        if (!this.LJJZ) {
            ((C1470430oMr) this.LJIIIIZZ).LIZIZ(668, this.A4);
        }
        ((C1470430oMr) this.LJIIIIZZ).LJIL(this.LLLLIILLL, 359);
        if (this.R5 == 0) {
            LJJLIIIJLJLI();
            ((C1470430oMr) this.LJIIIIZZ).LIZ(1746, LLII());
            this.R5 = 1;
        }
        C1468160oJC c1468160oJC = this.LLLZIL;
        if (c1468160oJC != null) {
            c1468160oJC.LIZJ(228, this.Z5);
            this.LLLZIL.LIZJ(227, this.a6);
            this.LLLZIL.LJLIIIL(this.b6, 232);
            this.LLLZIL.LJLIIIL(this.c6, 233);
            this.LLLZIL.LIZ(229, this.d6);
        }
        int i7 = this.I4;
        if (i7 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1041, i7);
        }
        if (this.LJLIIL.LIZLLL == 1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(254, this.C1);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(400, this.B1);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(90, this.LLLJIL);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(215, this.LLJJJIL);
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(216, this.LLJJJ);
            int i8 = this.LLJJJJ;
            if (i8 == 1) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(212, i8);
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(213, this.LLJJJJJIL);
            }
            if (this.i == 1) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(184, 1);
            }
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(279, this.J0);
            int i9 = this.K0;
            if (i9 == 1) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(280, i9);
            }
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(401, this.O0);
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1744, this.LLILII);
        if (this.LLIIL == 1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(189, 1);
        }
        if (this.X0 == 1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(312, 1);
        }
        C1468060oJ2.LIZ();
        if (c1468060oJ2.LIZLLL > 0) {
            InterfaceC1467950oIr interfaceC1467950oIr3 = this.LJIIIIZZ;
            C1468060oJ2.LIZ();
            ((C1470430oMr) interfaceC1467950oIr3).LIZIZ(231, c1468060oJ2.LIZLLL);
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(223, this.LLLJL);
        C1468060oJ2.LIZ();
        if (c1468060oJ2.LIZJ >= 0) {
            InterfaceC1467950oIr interfaceC1467950oIr4 = this.LJIIIIZZ;
            C1468060oJ2.LIZ();
            ((C1470430oMr) interfaceC1467950oIr4).LIZJ(1501, c1468060oJ2.LIZJ);
        } else {
            InterfaceC1467950oIr interfaceC1467950oIr5 = this.LJIIIIZZ;
            C1468060oJ2.LIZ();
            ((C1470430oMr) interfaceC1467950oIr5).LIZJ(984, c1468060oJ2.LIZIZ);
        }
        AudioProcessor audioProcessor = this.S;
        if (audioProcessor != null && (tTPlayerClient = ((C1470430oMr) this.LJIIIIZZ).LIZ) != null) {
            tTPlayerClient.setAudioProcessor(audioProcessor);
        }
        for (Map.Entry entry : ((HashMap) this.U.LIZ()).entrySet()) {
            InterfaceC1467950oIr interfaceC1467950oIr6 = this.LJIIIIZZ;
            int iIntValue = ((Integer) entry.getKey()).intValue();
            TraitObject traitObject = (TraitObject) entry.getValue();
            TTPlayerClient tTPlayerClient2 = ((C1470430oMr) interfaceC1467950oIr6).LIZ;
            if (tTPlayerClient2 != null) {
                tTPlayerClient2.setTraitObject(iIntValue, traitObject);
            }
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(48, this.v1);
        C1467040oHO c1467040oHO = this.D5;
        if (c1467040oHO != null && (iLIZIZ = c1467040oHO.LIZIZ(42060, 0)) == 1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(42060, iLIZIZ);
            this.LLLZIL.LIZJ(184, iLIZIZ);
        }
        int i10 = this.LLIIII;
        if (i10 > 0) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(252, i10);
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(88, this.LLJJIJI);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(97, this.LLJJIJIIJIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(536, this.f180p1);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(537, this.q1);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(538, this.r1);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(539, this.s1);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(5003, this.g2);
        LJJLI();
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(542, this.h2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(550, this.i2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(551, this.j2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(552, this.k2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(556, this.LLLLILI);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(654, this.LLLLJ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(348, this.LLLLJI);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(557, this.l2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(558, this.m2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(559, this.f178n2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(257, this.LLLLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(560, this.o2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(952, this.M3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(561, this.f181p2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(562, this.q2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(599, this.r2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(563, this.t2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(322, this.s2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(321, this.u2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(564, this.v2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(566, this.w2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(149, this.W3 ? 1 : 0);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(164, this.x2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(571, this.y2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(572, this.z2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(573, this.A2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(574, this.B2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(575, this.C2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(576, this.D2);
        C1468060oJ2.LIZ();
        int i11 = C790030Uyv.LIZ.LJ;
        if (i11 > 0) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(580, i11);
        } else {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(580, this.E2);
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(582, this.G2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(587, this.H2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1050, this.B3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1052, this.C3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(480, this.D3);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(672, this.LLIIZ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(591, this.I2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(673, this.J2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(674, this.K2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(675, this.L2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(676, this.M2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(677, this.N2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(592, this.O2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(593, this.P2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(594, this.Q2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(595, this.R2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(4001, this.S2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(4002, this.T2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(4003, this.U2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(4005, this.V2);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1071, this.c4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1072, this.d4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1074, this.e4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1075, this.f4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1076, this.g4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(581, this.LLLLLJLJLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(4008, this.LLLLLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1079, this.h4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(756, this.i4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1094, this.j4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1096, this.k4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(598, this.LLLLLLIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1084, this.n4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1098, this.o4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(1086, this.p4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(42005, this.q4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(42016, this.r4);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(4009, this.LLLLLLJ);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(4010, this.LLLLLLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(42001, this.LLLLLLLLL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(42049, this.LLLLLLLZIL);
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(5000, this.T5);
        if (this.LJLIIL.LIZLLL <= 0) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(4007, this.LLLLLJIL);
        }
        int i12 = this.N3;
        if (i12 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(982, i12);
        }
        int i13 = this.O3;
        if (i13 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(985, i13);
        }
        int i14 = this.P3;
        if (i14 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(LSPassThroughRecordSizeConfig.DEFAULT, i14);
        }
        int i15 = this.B4;
        if (i15 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1070, i15);
        }
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (interfaceC1467050oHPLIZJ != null) {
            InterfaceC1467950oIr interfaceC1467950oIr7 = this.LJIIIIZZ;
            int iLJIIZILJ = this.LLLLLIL;
            if (iLJIIZILJ == -1) {
                iLJIIZILJ = interfaceC1467050oHPLIZJ.LJIIZILJ(230);
            }
            ((C1470430oMr) interfaceC1467950oIr7).LIZJ(662, iLJIIZILJ);
        } else {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(662, this.LLLLLIL);
        }
        LJLLL();
        int i16 = this.Q3;
        if (i16 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1003, i16);
            for (int i17 = 0; i17 < this.R3.size(); i17++) {
                ((C1470430oMr) this.LJIIIIZZ).LIZ(1002, (String) ListProtector.get(this.R3, i17));
            }
        }
        int i18 = this.S3;
        if (i18 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1005, i18);
        }
        int i19 = this.T3;
        if (i19 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1020, i19);
        }
        int i20 = this.C4;
        if (i20 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1007, i20);
        }
        int i21 = this.D4;
        if (i21 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1008, i21);
        }
        int i22 = this.E4;
        if (i22 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1009, i22);
        }
        int i23 = this.U3;
        if (i23 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1036, i23);
        }
        int i24 = this.U4;
        if (i24 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1035, i24);
        }
        if (this.E) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1063, 1);
        }
        int i25 = this.F4;
        if (i25 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1038, i25);
        }
        int i26 = this.G4;
        if (i26 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1039, i26);
        }
        int i27 = this.H4;
        if (i27 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1040, i27);
        }
        int i28 = this.J4;
        if (i28 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1034, i28);
        }
        int i29 = this.K4;
        if (i29 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1043, i29);
        }
        int i30 = this.L4;
        if (i30 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1311, i30);
        }
        int i31 = this.M4;
        if (i31 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1044, i31);
        }
        int i32 = this.N4;
        if (i32 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1045, i32);
        }
        int i33 = this.O4;
        if (i33 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1046, i33);
        }
        int i34 = this.P4;
        if (i34 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1049, i34);
        }
        int i35 = this.Q4;
        if (i35 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1047, i35);
        }
        int i36 = this.R4;
        if (i36 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1048, i36);
        }
        int i37 = this.S4;
        if (i37 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1316, i37);
        }
        int i38 = this.T4;
        if (i38 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1310, i38);
        }
        int i39 = this.W4;
        if (i39 == 1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(475, i39);
        }
        int i40 = this.X4;
        if (i40 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1313, i40);
        }
        int i41 = this.Y4;
        if (i41 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1321, i41);
        }
        int i42 = this.Z4;
        if (i42 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1326, i42);
        }
        int i43 = this.a5;
        if (i43 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1327, i43);
        }
        int i44 = this.b5;
        if (i44 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1328, i44);
        }
        int i45 = this.c5;
        if (i45 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1329, i45);
        }
        int i46 = this.d5;
        if (i46 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1330, i46);
        }
        int i47 = this.e5;
        if (i47 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1332, i47);
        }
        int i48 = this.f5;
        if (i48 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1325, i48);
        }
        int i49 = this.g5;
        if (i49 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1333, i49);
        }
        int i50 = this.h5;
        if (i50 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1334, i50);
        }
        int i51 = this.i5;
        if (i51 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1336, i51);
        }
        int i52 = this.j5;
        if (i52 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1312, i52);
        }
        int i53 = this.k5;
        if (i53 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1341, i53);
        }
        int i54 = this.l5;
        if (i54 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1340, i54);
        }
        int i55 = this.m5;
        if (i55 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1337, i55);
        }
        int i56 = this.n5;
        if (i56 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1338, i56);
        }
        int i57 = this.o5;
        if (i57 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1344, i57);
        }
        int i58 = this.p5;
        if (i58 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1345, i58);
        }
        int i59 = this.q5;
        if (i59 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1346, i59);
        }
        int i60 = this.r5;
        if (i60 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1347, i60);
        }
        int i61 = this.s5;
        if (i61 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1348, i61);
        }
        int i62 = this.u5;
        if (i62 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1355, i62);
        }
        int i63 = this.t6;
        if (i63 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1502, i63);
        }
        int i64 = this.u6;
        if (i64 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(1093, i64);
        }
        if (!TextUtils.isEmpty(this.N5)) {
            ((C1470430oMr) this.LJIIIIZZ).LIZ(1366, this.N5);
        }
        int i65 = this.X5;
        if (i65 != -1) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(8000, i65);
            if (this.X5 > 0 && this.LJLIIL.LIZLLL != 1 && "bytevc2".equals(this.LJLLJ)) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(42423, 1);
            }
            int i66 = this.Y5;
            if (i66 != -1 && this.X5 > 0) {
                ((C1470430oMr) this.LJIIIIZZ).LIZJ(8001, i66);
            }
        }
        ((C1470430oMr) this.LJIIIIZZ).LIZJ(333, this.f170X);
        ((C1470430oMr) this.LJIIIIZZ).LJJ(new InterfaceC1470980oNk(this) { // from class: X.0oHw
            public final WeakReference<C1466990oHJ> LIZ;

            @Override // X.InterfaceC1470980oNk
            public final void LIZ(int i67, long j) {
            }

            @Override // X.InterfaceC1470980oNk
            public final /* synthetic */ void LIZIZ(int i67, long j, Map map) {
            }

            @Override // X.InterfaceC1470980oNk
            public final /* synthetic */ void LIZJ(long j, String str2) {
            }

            @Override // X.InterfaceC1470980oNk
            public final /* synthetic */ void LIZLLL(String str2) {
            }

            @Override // X.InterfaceC1470980oNk
            public final void LJ() {
            }

            @Override // X.InterfaceC1470980oNk
            public final void LJFF(ByteBuffer byteBuffer) {
            }

            {
                this.LIZ = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1470980oNk
            public final void onFrameAboutToBeRendered(int i67, long j, long j2, Map<Integer, String> map) {
                C1466990oHJ c1466990oHJ = this.LIZ.get();
                if (c1466990oHJ == null) {
                    return;
                }
                c1466990oHJ.LLLI(i67, j, j2, map);
            }
        });
        if (((Boolean) C1474810oTv.z1.getValue()).booleanValue()) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(339, -99);
        }
        if (((Boolean) C1474810oTv.C4.getValue()).booleanValue()) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(194, 1);
        }
        this.D5.LIZ(this.LJIIIIZZ);
    }

    public final void LJLJL() {
        for (EnumC2281151EQn enumC2281151EQn : EnumC2281151EQn.getAllResolutions()) {
            this.LLZLLLL.put(enumC2281151EQn, 0);
            this.LLZZJLIL.put(enumC2281151EQn, "");
        }
    }

    public final String LLII() {
        String strLLLZI = LLLZI();
        if (((Boolean) C1474810oTv.O5.getValue()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tag=");
            sbLIZ.append(strLLLZI);
            sbLIZ.append(";report=");
            sbLIZ.append(this.Q5);
            sbLIZ.append(";report_idle=1;");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tag=");
        sbLIZ2.append(strLLLZI);
        sbLIZ2.append(";report=");
        sbLIZ2.append(this.Q5);
        sbLIZ2.append(";");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LLIILII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("m:");
        sbLIZ.append(C2085308Ex.LIZ(this.e6));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            ((C1470430oMr) interfaceC1467950oIr).LIZ(202, strLIZIZ);
        }
    }

    public int LLIIZ() {
        return LJJLIIIJ();
    }

    public void LLLFZ() {
        this.LLLZIL.LLFZ(System.currentTimeMillis());
        this.LLLLLZL.LIZIZ(this.y5);
    }

    @Override // X.InterfaceC1467390oHx
    public void stop() {
        boolean zLJI = MethodIDManager.LJI(71891);
        C1467070oHR c1467070oHR = this.LJLIIL;
        c1467070oHR.LJIJ = false;
        this.M = false;
        c1467070oHR.LJIIZILJ = false;
        c1467070oHR.LJIJI = true;
        getClass();
        this.f = 0;
        this.g = 0;
        this.E = false;
        this.F = false;
        getClass();
        this.w6 = false;
        this.LJZL = 0;
        LJZI(0, true);
        this.f6.LJIIIIZZ();
        if (this.LJJJJLL > 0) {
            InterfaceC1467090oHT interfaceC1467090oHT = this.LJII;
            if (interfaceC1467090oHT != null) {
                interfaceC1467090oHT.reset();
                this.LJJIIJ = false;
            }
            this.f6.LJIIIZ();
            InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
            if (interfaceC1467950oIr != null && ((C1470430oMr) interfaceC1467950oIr).getPlayerType() == 0) {
                ((C1470430oMr) this.LJIIIIZZ).release();
                this.LJIIIIZZ = null;
            }
            if (this.A1 != null && !C1470530oN1.LIZ(this.LJLILLLLZI)) {
                ((C1470430oMr) this.A1).release();
                this.A1 = null;
            }
            this.LJLIIL.LIZIZ = 0;
        }
        BPEAHandler bPEAHandler = this.LJLJJLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(this.LJLJL);
        }
        this.f6.onStop();
        this.T1 = 0;
        this.U1 = new C1468600oJu();
        getClass();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
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
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // X.AbstractC1467000oHK, X.InterfaceC1467390oHx
    public void LIZJ(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 6218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LIZJ(int, int):void");
    }

    public C1466990oHJ(C1467420oI0 c1467420oI0) {
        int i;
        int i2;
        int i3;
        this.LLIIZ = 0;
        this.LLIL = 0;
        this.x = true;
        this.y = true;
        EnumC2281151EQn enumC2281151EQn = EnumC2281151EQn.Undefine;
        enumC2281151EQn.getIndex();
        EnumC2281151EQn enumC2281151EQn2 = EnumC2281151EQn.SuperHigh;
        enumC2281151EQn2.getIndex();
        enumC2281151EQn2.getIndex();
        this.Y1 = 1;
        this.Z1 = null;
        enumC2281151EQn.getIndex();
        this.a2 = 0;
        this.b2 = 0;
        this.c2 = -1;
        this.d2 = -1;
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = 0;
        this.h2 = 0;
        this.i2 = 0;
        this.j2 = 0;
        this.k2 = 0;
        this.l2 = 0;
        this.m2 = 0;
        this.f178n2 = 0;
        this.o2 = 0;
        this.f181p2 = 0;
        this.q2 = 0;
        this.r2 = 0;
        this.s2 = 0;
        this.t2 = 0;
        this.u2 = 0;
        this.v2 = 0;
        this.w2 = 0;
        this.x2 = 1;
        this.y2 = 0;
        this.z2 = 0;
        this.A2 = 0;
        this.B2 = 1;
        this.C2 = 0;
        this.D2 = 0;
        this.E2 = 0;
        this.F2 = false;
        this.G2 = 0;
        this.H2 = 0;
        this.I2 = 0;
        this.J2 = 0;
        this.K2 = 0;
        this.L2 = 0;
        this.M2 = 0;
        this.N2 = 0;
        this.O2 = 0;
        this.P2 = 0;
        this.Q2 = 0;
        this.R2 = 0;
        this.S2 = 0;
        this.T2 = 0;
        this.U2 = 0;
        this.V2 = 0;
        this.W2 = "";
        this.X2 = false;
        this.c3 = null;
        this.d3 = 0;
        this.h3 = 0;
        this.i3 = 0;
        this.j3 = 0;
        this.k3 = 0;
        this.l3 = -3;
        this.f177m3 = 0;
        this.n3 = 0;
        this.o3 = 0;
        this.p3 = -1;
        this.q3 = 0;
        this.r3 = 0;
        this.s3 = -1;
        this.t3 = 0;
        this.u3 = -1;
        this.v3 = -1;
        this.w3 = -1L;
        this.x3 = 0;
        this.y3 = 0;
        this.z3 = 0;
        this.A3 = false;
        this.B3 = 0;
        this.C3 = 0;
        this.D3 = 0;
        this.E3 = null;
        this.F3 = false;
        this.G3 = false;
        this.H3 = false;
        this.I3 = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.L3 = 500;
        this.M3 = 0;
        this.N3 = -1;
        this.O3 = -1;
        this.P3 = -1;
        this.Q3 = -1;
        this.R3 = new ArrayList<>();
        this.S3 = -1;
        this.T3 = -1;
        this.U3 = -1;
        this.V3 = 0;
        this.W3 = false;
        this.X3 = 0;
        this.Y3 = 0;
        this.Z3 = 0;
        this.a4 = 0;
        this.b4 = 1;
        this.c4 = 0;
        this.d4 = 0;
        this.e4 = 0;
        this.f4 = 0;
        this.g4 = 0;
        this.h4 = 0;
        this.i4 = 0;
        this.j4 = 0;
        this.k4 = 0;
        this.l4 = 0;
        this.m4 = 60;
        this.n4 = 0;
        this.o4 = 0;
        this.p4 = 0;
        this.q4 = 0;
        this.r4 = 0;
        this.s4 = null;
        this.t4 = -1;
        this.f183u4 = null;
        this.v4 = false;
        this.w4 = 0;
        this.x4 = 0;
        this.y4 = 0;
        this.z4 = 0;
        this.A4 = 0L;
        this.B4 = -1;
        this.C4 = -1;
        this.D4 = -1;
        this.E4 = -1;
        this.F4 = -1;
        this.G4 = -1;
        this.H4 = -1;
        this.I4 = -1;
        this.J4 = -1;
        this.K4 = -1;
        this.L4 = -1;
        this.M4 = -1;
        this.N4 = -1;
        this.O4 = -1;
        this.P4 = -1;
        this.Q4 = -1;
        this.R4 = -1;
        this.S4 = -1;
        this.T4 = -1;
        this.U4 = -1;
        this.V4 = -1;
        this.W4 = 1;
        this.X4 = -1;
        this.Y4 = -1;
        this.Z4 = -1;
        this.a5 = -1;
        this.b5 = -1;
        this.c5 = -1;
        this.d5 = -1;
        this.e5 = -1;
        this.f5 = -1;
        this.g5 = -1;
        this.h5 = -1;
        this.i5 = -1;
        this.j5 = -1;
        this.k5 = -1;
        this.l5 = -1;
        this.m5 = -1;
        this.n5 = -1;
        this.o5 = -1;
        this.p5 = -1;
        this.q5 = -1;
        this.r5 = -1;
        this.s5 = -1;
        this.u5 = -1;
        this.v5 = -1;
        this.w5 = false;
        this.x5 = 0;
        this.z5 = false;
        this.B5 = 0;
        this.C5 = false;
        this.E5 = false;
        this.G5 = false;
        this.H5 = false;
        this.I5 = false;
        this.J5 = 0;
        this.L5 = 0;
        this.M5 = 0;
        this.N5 = null;
        this.O5 = null;
        this.P5 = null;
        this.Q5 = 0;
        this.R5 = 0;
        this.S5 = null;
        this.T5 = 0;
        this.U5 = false;
        this.V5 = 0;
        this.W5 = 0;
        this.X5 = -1;
        this.Y5 = -1;
        this.Z5 = -1;
        this.a6 = -1;
        this.b6 = 0.0f;
        this.c6 = 0.0f;
        this.d6 = "";
        this.e6 = null;
        this.i6 = 0;
        this.k6 = null;
        this.l6 = null;
        this.m6 = null;
        this.n6 = null;
        this.o6 = Boolean.FALSE;
        this.p6 = 0;
        this.q6 = 0;
        this.r6 = null;
        this.s6 = 0;
        this.t6 = -1;
        this.u6 = -1;
        this.w6 = false;
        C1468060oJ2 c1468060oJ2 = C790030Uyv.LIZ;
        if (c1468060oJ2.LJI != 1) {
            C795750VJl.LIZJ();
        }
        this.y5 = c1467420oI0.LIZLLL;
        this.LJLIIL = new C1467070oHR();
        LLIIIJ();
        this.LJJLJLI = new C1467840oIg();
        C1467060oHQ c1467060oHQ = new C1467060oHQ();
        this.f6 = c1467060oHQ;
        C1467520oIA c1467520oIA = new C1467520oIA(this);
        C1468160oJC c1468160oJC = new C1468160oJC(c1467420oI0.LIZ);
        this.LLLZIL = c1468160oJC;
        this.h6 = new C1467230oHh(c1468160oJC);
        C1467080oHS c1467080oHS = new C1467080oHS(c1467420oI0.LIZ, c1467520oIA);
        this.g6 = c1467080oHS;
        c1467080oHS.LJII = this;
        if (!((CopyOnWriteArrayList) c1467060oHQ.LIZ).contains(c1467080oHS)) {
            ((CopyOnWriteArrayList) c1467060oHQ.LIZ).add(c1467080oHS);
        }
        Context context = c1467420oI0.LIZ;
        int i4 = c1467420oI0.LIZJ;
        Map<String, ? extends Object> map = c1467420oI0.LIZIZ;
        this.LJI = context;
        this.LJIIJ = i4;
        this.LJIIJJI = new HashMap<>();
        this.LJJJJ = false;
        x.LJI(6, 0);
        if (i4 != 2 && i4 != 5) {
            i = 1;
        } else {
            i = 0;
        }
        x.LJI(1, i);
        if (i4 == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        x.LJI(2, i2);
        if (i4 == 5) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        x.LJI(26, i3);
        x.LJI(11, 0);
        x.LJI(4, 0);
        this.y = true;
        this.x = true;
        this.LLZLLLL = new HashMap();
        this.LLZZJLIL = new HashMap();
        this.LLZZLLIL = new HashMap();
        LJLJL();
        this.LLZZ = new HashMap();
        this.LLLLLLZ = new ConcurrentHashMap();
        if (map != null && map.containsKey("new_user_opt_harden_diversion") && (map.get("new_user_opt_harden_diversion") instanceof Integer)) {
            this.LLIL = ((Integer) map.get("new_user_opt_harden_diversion")).intValue();
        }
        this.LLLLLZL = new C1469350oL7();
        if (C1468040oJ0.LJI == null) {
            synchronized (C1468040oJ0.class) {
                try {
                    if (C1468040oJ0.LJI == null) {
                        C1468040oJ0.LJI = new C1468040oJ0(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LLLZL = C1468040oJ0.LJI;
        c1467060oHQ.LJIILLIIL(map);
        c1468160oJC.LJLIL(this.LLLZL);
        c1468160oJC.LJJLIIIJLLLLLLLZ(new C1467030oHN(this, this.g6));
        TTVideoEngineMonitor tTVideoEngineMonitor = TTVideoEngineMonitor.getInstance(context);
        this.LLLZLL = tTVideoEngineMonitor;
        if (tTVideoEngineMonitor != null) {
            this.LLLZLL.startObserve(hashCode(), this.y5);
        }
        c1468160oJC.LLF();
        c1468160oJC.LJJIIZ(LJLJLJ(EnumC2281151EQn.Standard), "");
        c1468160oJC.LIZJ(132, hashCode());
        if ((C1468160oJC.LLLJIL != 1 || !((Boolean) C1474810oTv.y1.getValue()).booleanValue()) && TTVideoEngine.LJIILIIL == 1) {
            C1467490oI7 c1467490oI7 = new C1467490oI7();
            this.K5 = c1467490oI7;
            this.LJJJJIZL = new C1467010oHL(this.LLLZL, c1467490oI7);
        } else {
            this.LJJJJIZL = new C1467010oHL(this.LLLZL);
        }
        C1468480oJi.LIZ();
        final TTVideoEngine tTVideoEngine = this.y5;
        final long j = this.V0;
        EngineThreadPool.addExecuteTask(new Runnable(j, tTVideoEngine) { // from class: X.0Uz9
            public final WeakReference<TTVideoEngine> LL;
            public final long LLILLJJLI;

            public final void LIZ() {
                C790190UzB c790190UzB;
                TTVideoEngine tTVideoEngine2 = this.LL.get();
                if (tTVideoEngine2 == null || (c790190UzB = C790190UzB.LIZLLL) == null) {
                    return;
                }
                long j2 = this.LLILLJJLI;
                synchronized (c790190UzB) {
                    if (c790190UzB.LIZ.containsKey(Long.valueOf(j2))) {
                        return;
                    }
                    c790190UzB.LIZ.put(Long.valueOf(j2), new WeakReference<>(tTVideoEngine2));
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("new engine: ");
                    sbLIZ.append(j2);
                    TTVideoEngineLog.d("VideoInfoCollecor", C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoInfoCollector$myVideoCollectorRegister@65f6.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoInfoCollector$myVideoCollectorRegister@65f6.run");
            }

            {
                this.LL = new WeakReference<>(tTVideoEngine);
                this.LLILLJJLI = j;
            }
        });
        C2032407xi.LIZIZ().LIZ(this.y5);
        this.J3 = String.valueOf(hashCode());
        int i5 = c1468060oJ2.LJIJ;
        if (i5 != -1) {
            this.P3 = i5;
            getClass();
        }
        if (this.LLIL == 1) {
            this.P3 = 1;
            this.LLIIZ = 1;
            this.K2 = 1;
            getClass();
            getClass();
            getClass();
        }
        this.D5 = new C1467040oHO();
        if (C1472750oQb.LIZIZ && C1150504el.LIZ().LJII) {
            C0X35.LJIIJJI("player_precreate_ttvideoengine_init_duration", true);
            C0X35.LIZ("player_precreate_ttvideoengine_lock_duration", true);
            C1472750oQb.LIZIZ = false;
        }
        C1467590oIH c1467590oIH = new C1467590oIH(this.LJI, c1467420oI0.LIZJ);
        this.LJLILLLLZI = c1467590oIH;
        Map<String, Object> map2 = c1467420oI0.LIZIZ;
        if (map2 != null && map2.containsKey("is_mediabox_player")) {
            c1467590oIH.LIZ = ((Boolean) c1467420oI0.LIZIZ.get("is_mediabox_player")).booleanValue();
        }
        this.LJLIL = this;
        this.LJII = C1470620oNA.LIZ(c1467590oIH, this);
    }

    public static boolean LJJLJLI(C1474520oTS c1474520oTS) {
        String strLIZ = c1474520oTS.LIZ(6);
        if (!TextUtils.isEmpty(strLIZ)) {
            if (strLIZ.equals("dash") || strLIZ.equals("mpd")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String LLILLJJLI(Map map) {
        try {
            return C786410Ut5.J3(new JSONObject(map));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LLJJL(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (interfaceC1467050oHP == null || !interfaceC1467050oHP.LJIIJ(EnumC1469940oM4.HLS)) {
            return false;
        }
        return interfaceC1467050oHP.LJJIII();
    }

    public static boolean LLJJLIIIJLLLLLLLZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("mem://bash") && !lowerCase.startsWith("mem://hls") && !C1476290oWJ.LIZ(str) && !C1476290oWJ.LIZIZ(str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1467390oHx
    public void LIZLLL(s sVar) {
        this.LJIILLIIL = sVar;
        LJJLIIIJJIZ(sVar);
    }

    @Override // X.AbstractC1467000oHK
    public final int LJIIJ(int i) {
        int iLIZIZ;
        C1474520oTS c1474520oTSLJJIIJ;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        try {
            switch (i) {
                case 0:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(24, -1);
                    }
                    return -1;
                case 4:
                    return this.LLIFFJFJJ;
                case 26:
                    return this.j;
                case 29:
                case 199:
                case 494:
                case 660:
                case 1071:
                    return 0;
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    return this.LJLLLL ? 1 : 0;
                case 40:
                    C1468160oJC c1468160oJC = this.LLLZIL;
                    if (c1468160oJC != null) {
                        return c1468160oJC.LJJJJIZL;
                    }
                    return -1;
                case 42:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(153, -1);
                    }
                    return -1;
                case 43:
                    C1467070oHR c1467070oHR = this.LJLIIL;
                    if (c1467070oHR.LJ < 0 && interfaceC1467950oIr != null) {
                        c1467070oHR.LJ = ((C1470430oMr) interfaceC1467950oIr).LJI(157, -1);
                    }
                    return this.LJLIIL.LJ;
                case 44:
                    if (this.LJJJLZIJ < 0 && interfaceC1467950oIr != null) {
                        this.LJJJLZIJ = ((C1470430oMr) interfaceC1467950oIr).LJI(158, -1);
                    }
                    return this.LJJJLZIJ;
                case 45:
                    if (this.LJJJZ < 0 && interfaceC1467950oIr != null) {
                        this.LJJJZ = ((C1470430oMr) interfaceC1467950oIr).LJI(141, -1);
                    }
                    return this.LJJJZ;
                case 46:
                    if (this.LJJL < 0 && interfaceC1467950oIr != null) {
                        this.LJJL = ((C1470430oMr) interfaceC1467950oIr).LJI(140, -1);
                    }
                    return this.LJJL;
                case 52:
                    if (this.LLZZZZ) {
                        return this.LJJIZ;
                    }
                    return LJJLJ();
                case 58:
                    if (this.v3 == -1 && interfaceC1467950oIr != null) {
                        this.v3 = ((C1470430oMr) interfaceC1467950oIr).LJI(403, -1);
                    }
                    return this.v3;
                case 59:
                    if (this.u3 == -1 && interfaceC1467950oIr != null) {
                        this.u3 = ((C1470430oMr) interfaceC1467950oIr).LJI(402, -1);
                    }
                    return this.u3;
                case 83:
                    C1467010oHL c1467010oHL = this.LJJJJIZL;
                    if (c1467010oHL != null) {
                        iLIZIZ = c1467010oHL.LIZJ.LIZIZ();
                    } else {
                        return -1;
                    }
                    break;
                case 84:
                    C1467010oHL c1467010oHL2 = this.LJJJJIZL;
                    if (c1467010oHL2 != null) {
                        iLIZIZ = c1467010oHL2.LIZLLL.LIZIZ();
                    } else {
                        return -1;
                    }
                    break;
                case 160:
                    return this.N;
                case 256:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(989, 0);
                    }
                    return -1;
                case 257:
                    return this.LJIIZILJ;
                case 258:
                    return this.LJIJI;
                case 301:
                    return this.g6.LJIL(i);
                case 302:
                    return this.LLIIIILZ;
                case 313:
                    return this.g0 ? 1 : 0;
                case 343:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(643, 0);
                    }
                    return -1;
                case 371:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(540, -1);
                    }
                    return -1;
                case 424:
                    return this.f174h0;
                case 425:
                    return this.f175i0;
                case 499:
                    return this.h3;
                case 512:
                    return this.k3;
                case 525:
                    return this.a2;
                case 530:
                    return this.f179o0;
                case 533:
                    return this.n3;
                case 596:
                    return this.LLLILZJ;
                case 650:
                    return this.W;
                case 655:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(541, 0);
                    }
                    return -1;
                case 667:
                    InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
                    if (interfaceC1467050oHPLIZJ == null || (c1474520oTSLJJIIJ = interfaceC1467050oHPLIZJ.LJJIIJ(this.LJIL.getCurrentResolution(), 0, null)) == null) {
                        return 0;
                    }
                    return c1474520oTSLJJIIJ.LIZIZ(41);
                case OppoPermissionPopupMaskDelayExp.DEFAULT /* 700 */:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(961, -1);
                    }
                    return -1;
                case 701:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(569, -1);
                    }
                    return -1;
                case 754:
                    C1468160oJC c1468160oJC2 = this.LLLZIL;
                    if (c1468160oJC2 != null) {
                        return c1468160oJC2.LJJIL(162);
                    }
                    return -1;
                case 756:
                    C1468160oJC c1468160oJC3 = this.LLLZIL;
                    if (c1468160oJC3 != null) {
                        return c1468160oJC3.LJJIL(158);
                    }
                    return -1;
                case 758:
                    C1468160oJC c1468160oJC4 = this.LLLZIL;
                    if (c1468160oJC4 != null) {
                        return c1468160oJC4.LJJIL(160);
                    }
                    return -1;
                case 761:
                    C1468160oJC c1468160oJC5 = this.LLLZIL;
                    if (c1468160oJC5 != null) {
                        return c1468160oJC5.LJJIL(165);
                    }
                    return -1;
                case 950:
                    return this.L3;
                case 1403:
                    C1468160oJC c1468160oJC6 = this.LLLZIL;
                    if (c1468160oJC6 != null) {
                        return c1468160oJC6.LJJIL(49);
                    }
                    return -1;
                case 1405:
                    return this.LJIJ;
                case 1408:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(1603, 0);
                    }
                    return -1;
                case 1409:
                    if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJI(1604, 0);
                    }
                    return -1;
                default:
                    return super.LJIIJ(i);
            }
            return iLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    @Override // X.InterfaceC1467390oHx
    public void LJIJ(final String str) {
        if (str != null && !str.equals(this.LJIL.getUrl()) && (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 1L) || this.LJJIIZI)) {
            LJJJLIIL();
            C1467070oHR c1467070oHR = this.LJLIIL;
            c1467070oHR.LIZIZ = 0;
            this.LJJII = false;
            this.LJJIZ = 0;
            c1467070oHR.LJIIJJI = true;
            this.LLZZZIL = null;
        }
        this.LJJIIZI = true;
        this.LJLIIL.LJIIJ = false;
        this.LJIL = new C1467410oHz(str) { // from class: X.0oIM
            public String LJ;

            @Override // X.C1467410oHz, X.InterfaceC1467290oHn
            public final boolean LJI() {
                return true;
            }

            @Override // X.C1467410oHz, X.InterfaceC1467290oHn
            public final String getUrl() {
                return this.LJ;
            }

            {
                this.LJ = str;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C1467640oIM) && ((C1467640oIM) obj).LJ.equals(this.LJ)) {
                    return true;
                }
                return false;
            }

            @Override // X.C1467410oHz, X.InterfaceC1467290oHn
            public final void setUrl(String str2) {
                this.LJ = str2;
            }
        };
        this.LJLIIL.LJIIIZ = 0L;
        this.LLLZIL.LJZ(0, "");
        InterfaceC1467290oHn interfaceC1467290oHn = this.LJIL;
        EnumC2281151EQn enumC2281151EQn = EnumC2281151EQn.Undefine;
        interfaceC1467290oHn.LIZIZ(enumC2281151EQn);
        this.LLLZIL.LJJIIZ(LJLJLJ(enumC2281151EQn), "");
    }

    @Override // X.InterfaceC1467390oHx
    public void LJIJI(String str) {
        LLLLLL(str, new String[]{str});
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0oHk] */
    @Override // X.InterfaceC1467390oHx
    public void LJIL(InterfaceC1467050oHP interfaceC1467050oHP) {
        String str;
        if (interfaceC1467050oHP == null || TextUtils.isEmpty(interfaceC1467050oHP.LJJII(2))) {
            return;
        }
        int i = 0;
        String str2 = null;
        if (!interfaceC1467050oHP.equals(C1467400oHy.LIZJ(this.LJIL)) && (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 1L) || this.LJJIIZI)) {
            LJJJLIIL();
            C1467070oHR c1467070oHR = this.LJLIIL;
            c1467070oHR.LJIIJJI = true;
            this.y = true;
            this.x = true;
            c1467070oHR.LIZIZ = 0;
            this.LJJII = false;
            this.LJJIZ = 0;
            this.LLLZLZ = null;
            this.LLZZZIL = null;
        }
        this.LJJIIZI = true;
        this.LJLIIL.LJIIJ = false;
        C1467190oHd c1467190oHd = new C1467190oHd(interfaceC1467050oHP);
        this.LJIL = c1467190oHd;
        c1467190oHd.LJIIIZ = null;
        InterfaceC1467050oHP interfaceC1467050oHP2 = c1467190oHd.LJII;
        if (interfaceC1467050oHP2 != null) {
            interfaceC1467050oHP2.LJJI(null);
        }
        if (!TextUtils.isEmpty(((C1467190oHd) this.LJIL).LJFF)) {
            this.LLLZIL.LIZJ(172, 1);
        }
        InterfaceC1467290oHn interfaceC1467290oHn = this.LJIL;
        Hashtable<String, C1467920oIo> hashtable = C1467930oIp.LIZIZ;
        String videoId = interfaceC1467290oHn.getVideoId();
        if (interfaceC1467290oHn.LIZJ()) {
            str = ((C1467190oHd) interfaceC1467290oHn).LJI;
        } else {
            str = null;
        }
        if (interfaceC1467290oHn.LIZJ()) {
            str2 = ((C1467190oHd) interfaceC1467290oHn).LJFF;
        }
        if (interfaceC1467290oHn.LIZJ()) {
            i = ((C1467190oHd) interfaceC1467290oHn).LJ;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store videoId ");
        sbLIZ.append(videoId);
        sbLIZ.append(", keyseed ");
        sbLIZ.append(str);
        sbLIZ.append(", fallbackAPI ");
        sbLIZ.append(str2);
        sbLIZ.append(", version ");
        sbLIZ.append(i);
        C1471660oOq.LIZJ("FetcherMaker", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(videoId) || TextUtils.isEmpty(str2) || (i != 3 && TextUtils.isEmpty(str))) {
            C1471660oOq.LIZJ("FetcherMaker", "mdlFetch store fail");
        } else {
            C1467930oIp.LIZIZ.put(videoId, new C1467920oIo(str, str2, i));
        }
        if (this.K3 == null) {
            final TTVideoEngine tTVideoEngine = this.y5;
            this.K3 = new InterfaceC1468880oKM(tTVideoEngine) { // from class: X.0oHk
                public final WeakReference<TTVideoEngine> LIZ;

                @Override // X.InterfaceC1468880oKM
                public final C1470240oMY LIZIZ() {
                    TTVideoEngine tTVideoEngine2 = this.LIZ.get();
                    if (tTVideoEngine2 == null) {
                        return null;
                    }
                    return tTVideoEngine2.LJJLIL();
                }

                @Override // X.InterfaceC1468880oKM
                public final String LJ() {
                    TTVideoEngine tTVideoEngine2 = this.LIZ.get();
                    if (tTVideoEngine2 == null) {
                        return null;
                    }
                    return C790040Uyw.LIZ(tTVideoEngine2.LJJIL());
                }

                @Override // X.InterfaceC1468880oKM
                public final Context getContext() {
                    TTVideoEngine tTVideoEngine2 = this.LIZ.get();
                    if (tTVideoEngine2 == null) {
                        return null;
                    }
                    return tTVideoEngine2.LJJJ();
                }

                @Override // X.InterfaceC1468880oKM
                public final String getId() {
                    TTVideoEngine tTVideoEngine2 = this.LIZ.get();
                    if (tTVideoEngine2 == null) {
                        return null;
                    }
                    return tTVideoEngine2.LJJJJLL();
                }

                {
                    this.LIZ = new WeakReference<>(tTVideoEngine);
                }

                @Override // X.InterfaceC1468880oKM
                public final void LIZ(e eVar) {
                    TTVideoEngine tTVideoEngine2 = this.LIZ.get();
                    if (eVar != null && tTVideoEngine2 != null && tTVideoEngine2.LIZ.LLLZIL != null) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fetcher should retry error ");
                        sbLIZ2.append(eVar.toString());
                        C1471660oOq.LIZIZ("EngineMDLFetcherListener", C2188811AlT.LIZIZ(sbLIZ2));
                        tTVideoEngine2.LIZ.LLLZIL.LJJJJJ(tTVideoEngine2.LJJLIIIJ(), eVar);
                    }
                }

                @Override // X.InterfaceC1468880oKM
                public final void onLog(String str3) {
                    C1468160oJC c1468160oJC;
                    int i3 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("EngineMDLFetcherListener", "fetcher cancelled");
                    TTVideoEngine tTVideoEngine2 = this.LIZ.get();
                    if (tTVideoEngine2 != null && (c1468160oJC = tTVideoEngine2.LIZ.LLLZIL) != null) {
                        c1468160oJC.LJJJJ(str3);
                    }
                }

                @Override // X.InterfaceC1468880oKM
                public final void LIZLLL(e eVar, String str3) {
                    InterfaceC1467240oHi interfaceC1467240oHiLJJJLL;
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("videoEngine mdl fetch failed ");
                    sbLIZ2.append(eVar.toString());
                    C1471660oOq.LIZJ("EngineMDLFetcherListener", C2188811AlT.LIZIZ(sbLIZ2));
                    TTVideoEngine tTVideoEngine2 = this.LIZ.get();
                    if (tTVideoEngine2 != null && (interfaceC1467240oHiLJJJLL = tTVideoEngine2.LJJJLL()) != null) {
                        interfaceC1467240oHiLJJJLL.LJIIZILJ(0, eVar, str3);
                    }
                }

                @Override // X.InterfaceC1468880oKM
                public final void LIZJ(C1470240oMY c1470240oMY, boolean z, String str3) {
                    int i3;
                    TTVideoEngine tTVideoEngine2 = this.LIZ.get();
                    if (tTVideoEngine2 == null) {
                        return;
                    }
                    int i4 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("EngineMDLFetcherListener", "fetch info success");
                    C1468160oJC c1468160oJC = tTVideoEngine2.LIZ.LLLZIL;
                    if (c1468160oJC != null) {
                        if (z) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        c1468160oJC.LJIIZILJ(i3, null, str3);
                        if (z) {
                            c1468160oJC.LJJIJLIJ(c1470240oMY);
                        }
                    }
                }
            };
        }
        try {
            C1467940oIq.LIZJ(this.K3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LJLIIL.LJIIIZ = 0L;
        this.LLLZIL.LJZ(4, this.LJIL.getVideoId());
        this.LLLZIL.LJL(interfaceC1467050oHP);
    }

    @Override // X.InterfaceC1467390oHx
    public void LJJII(AudioProcessor audioProcessor) {
        TTPlayerClient tTPlayerClient;
        this.S = audioProcessor;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null && (tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr).LIZ) != null) {
            tTPlayerClient.setAudioProcessor(audioProcessor);
        }
    }

    @Override // X.InterfaceC1467390oHx
    public void LJJIIJ(C1469110oKj c1469110oKj) {
        this.LLLLLZIL = c1469110oKj;
    }

    @Override // X.InterfaceC1467390oHx
    public void LJJIIZ(String str) {
        if (str != null && !str.equals(this.LJIL.getVideoId()) && (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 1L) || this.LJJIIZI)) {
            LJJJLIIL();
            C1467070oHR c1467070oHR = this.LJLIIL;
            c1467070oHR.LJIIJJI = true;
            this.y = true;
            this.x = true;
            c1467070oHR.LIZIZ = 0;
            this.LJJII = false;
            this.LJJIZ = 0;
            this.LLZZZIL = null;
        }
        this.LJJIIZI = true;
        this.LJLIIL.LJIIJ = false;
        this.LJIL = new C1467550oID(str);
        this.LJLIIL.LJIIIZ = 0L;
        this.LLLZIL.LJZ(5, str);
    }

    @Override // X.InterfaceC1467390oHx
    public void LJJIIZI(C1467630oIL c1467630oIL) {
        String[] strArr = c1467630oIL.LIZIZ;
        LLLLLLIL(c1467630oIL.LIZJ, c1467630oIL.LIZLLL, c1467630oIL.LIZ, strArr);
    }

    @Override // X.InterfaceC1467390oHx
    public void LJJIJ(int[] iArr) {
        int length;
        if (!LJJIJIIJIL() || (length = iArr.length) <= 0) {
            return;
        }
        this.G = 0;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                if (C1467830oIf.LIZ[i2] == iArr[i]) {
                    this.G = (1 << i2) | this.G;
                    break;
                } else {
                    i2++;
                    if (i2 >= 19) {
                        break;
                    }
                }
            }
            i++;
        } while (i < length);
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            ((C1470430oMr) interfaceC1467950oIr).LIZJ(111, this.G);
        }
    }

    @Override // X.AbstractC1467000oHK
    public final void LJJIL(int i) {
        if (this.LJIL.LJI()) {
            i = 100;
        }
        this.LJJJJI = i;
        this.g6.LJJIIZI(2, i);
        LLJZIJLIL(i);
    }

    @Override // X.AbstractC1467000oHK
    public final void LJJIZ(InterfaceC1470080oMI interfaceC1470080oMI) {
        int playerType;
        C1468170oJD c1468170oJD = this.LLLZIL.LIZJ;
        if (c1468170oJD != null) {
            c1468170oJD.LJLLJ = 1;
        }
        if (!this.LJJJ) {
            this.LJLIIL.LJIILJJIL = true;
            LLLZIL(0, null);
            C1467010oHL c1467010oHL = this.LJJJJIZL;
            if (c1467010oHL != null) {
                c1467010oHL.LIZLLL();
                this.LLLZIL.LIZJ.LLD = this.LJJJJIZL.LIZ.LIZIZ();
                this.LLLZIL.LIZJ.LLF = this.LJJJJIZL.LIZIZ();
            }
            LLD(this.LJLIIL.LJFF, true);
            C1468160oJC c1468160oJC = this.LLLZIL;
            int i = this.LJLIIL.LJFF;
            C1468170oJD c1468170oJD2 = c1468160oJC.LIZJ;
            if (c1468170oJD2 != null) {
                c1468170oJD2.LJLIIIL = i;
            }
            LLFF();
            this.LLLZIL.LJJJJI(3);
            C1467070oHR c1467070oHR = this.LJLIIL;
            c1467070oHR.LJIILIIL = false;
            this.c = false;
            this.LLLZZIL = -1L;
            this.LLZ = -1L;
            c1467070oHR.LJIIIIZZ = -1L;
            this.d = false;
            this.LLZZZZ = false;
            LLIIII(false);
            this.LJJIZ = 0;
            this.LJJIJIIJI = false;
            C1467070oHR c1467070oHR2 = this.LJLIIL;
            c1467070oHR2.LJIIJ = false;
            this.LJJIIZ = true;
            c1467070oHR2.LJIIL = false;
            this.G5 = false;
        } else {
            if (interfaceC1470080oMI != null && this.LIZLLL == 1 && ((playerType = interfaceC1470080oMI.getPlayerType()) == 1 || playerType == 3)) {
                this.LJLIIL.LJIILIIL = false;
                this.LLLZIL.LJIJ();
                this.LJII.start();
                this.G5 = true;
            }
            C1468160oJC c1468160oJC2 = this.LLLZIL;
            c1468160oJC2.LJJIIZI++;
            C790040Uyw.LIZJ(String.valueOf(System.currentTimeMillis()), c1468160oJC2.LLJJJJJIL);
        }
        LLL();
        if (interfaceC1470080oMI.LJFF()) {
            this.LJJIIJ = false;
        }
        this.e = 0;
    }

    @Override // X.AbstractC1467000oHK
    public void LJJJIL(InterfaceC1470080oMI interfaceC1470080oMI) {
        boolean z;
        int i;
        InterfaceC1467090oHT interfaceC1467090oHT;
        InterfaceC1467090oHT interfaceC1467090oHT2;
        if (!this.LJLIIL.LJIJI && interfaceC1470080oMI != null && this.LJII != null) {
            interfaceC1470080oMI.LJI(141, -1);
            interfaceC1470080oMI.LJI(44, -1);
            int i2 = 0;
            this.LJJLIIIJLJLI = 0;
            this.LJJLIIIJLLLLLLLZ = null;
            this.LJLIIL.LJFF = interfaceC1470080oMI.getDuration();
            this.LJJIIJ = true;
            C1468170oJD c1468170oJD = this.LLLZIL.LIZJ;
            if (c1468170oJD.LJJIIJ <= 0) {
                c1468170oJD.LJJII = System.currentTimeMillis();
            }
            C1468160oJC c1468160oJC = this.LLLZIL;
            int i3 = this.LJLIIL.LJFF;
            c1468160oJC.LJJIJIL = i3;
            c1468160oJC.LJII.LJJIIZ = i3;
            LLLIIIL();
            if (this.v4) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (((!this.LJJIII && this.LJLIIL.LJIJ) || (!LJJIJL(2) && !this.LJJJJLI && this.D)) && (interfaceC1467090oHT2 = this.LJII) != null)) {
                interfaceC1467090oHT2.start();
            }
            if (this.LLZZZZ && !this.LJLIIL.LJIJ && (interfaceC1467090oHT = this.LJII) != null) {
                interfaceC1467090oHT.start();
                this.LJII.pause();
            }
            if (!TextUtils.isEmpty(this.c3) && this.LLZZZZ && this.o3 > 0) {
                interfaceC1470080oMI.LIZJ(618, this.n3);
                interfaceC1470080oMI.LIZ(617, this.c3);
            }
            if (this.LJIILLIIL != null && LJJIJL(2)) {
                interfaceC1470080oMI.LIZLLL(this.LJIILLIIL);
                this.LLLZIL.LJLLI(this.LJIILLIIL);
            }
            int iLJI = interfaceC1470080oMI.LJI(62, -100);
            int iLJI2 = interfaceC1470080oMI.LJI(61, -100);
            C1468160oJC c1468160oJC2 = this.LLLZIL;
            if (iLJI == 0) {
                i = 1;
            } else {
                i = 0;
            }
            c1468160oJC2.LIZJ(12, i);
            C1468160oJC c1468160oJC3 = this.LLLZIL;
            if (iLJI2 == 0) {
                i2 = 1;
            }
            c1468160oJC3.LIZJ(13, i2);
            if (TTVideoEngine.LJIJ == 0) {
                long jLJIIJ = interfaceC1470080oMI.LJIIJ(524, -1L);
                long jLJIIJ2 = interfaceC1470080oMI.LJIIJ(525, -1L);
                this.LLLZIL.LIZIZ(98, jLJIIJ);
                this.LLLZIL.LIZIZ(99, jLJIIJ2);
            }
            if (interfaceC1470080oMI.LJFF() && this.LJJJJZI == 1 && !this.LJLIIL.LJIILIIL) {
                LJLJJLL();
            }
        }
    }

    public final void LJJJLZIJ(int i) {
        C1468160oJC c1468160oJC;
        C1467010oHL c1467010oHL = this.LJJJJIZL;
        if (c1467010oHL != null && this.LJIILL == 1) {
            c1467010oHL.LIZJ();
        }
        this.f6.LJIJJ(i);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LJLIIL.LJIIIZ;
        if (j > 0 && jElapsedRealtime >= j) {
            C1468160oJC c1468160oJC2 = this.LLLZIL;
            if (c1468160oJC2 != null) {
                if (i == 0 && c1468160oJC2.LJJLIIIIJ == 3) {
                    c1468160oJC2.LJJLIIIIJ = 2;
                    c1468160oJC2.LIZLLL.LIZIZ("wait");
                }
                if (c1468160oJC2.LIZJ != null) {
                    if (i == 0) {
                        if (c1468160oJC2.LJJLIIIIJ != 4) {
                            c1468160oJC2.LJJ(-2003, false);
                        }
                    } else if (i == 1) {
                        c1468160oJC2.LJJ(-2004, false);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1468170oJD c1468170oJD = c1468160oJC2.LIZJ;
                    if (c1468170oJD.LJLI <= 0) {
                        c1468170oJD.LJLI = jCurrentTimeMillis;
                    }
                    if (i == 1) {
                        long j2 = c1468160oJC2.LJJJIL;
                        if (j2 > 0 && jCurrentTimeMillis >= j2) {
                            c1468160oJC2.LJJJJJ += jCurrentTimeMillis - j2;
                            c1468160oJC2.LJJJIL = 0L;
                        }
                    }
                    c1468170oJD.LLJJLIIIJLLLLLLLZ = jCurrentTimeMillis;
                }
                TTVideoEngine.LJIILLIIL = SystemClock.elapsedRealtime();
            }
            this.LJLIIL.LJIIIZ = 0L;
        } else if (this.LLJJIJIL == 1 && (c1468160oJC = this.LLLZIL) != null) {
            C1468170oJD c1468170oJD2 = c1468160oJC.LIZJ;
            if (c1468170oJD2.LLLLIILL <= 0) {
                c1468170oJD2.LLLLIILL = System.currentTimeMillis();
            }
        }
        this.LJIJJLI = -1;
        LLJLLL(i);
        LLLZIIL(1, i);
    }

    public final void LJJLIIIJJIZ(s sVar) {
        this.LJIILLIIL = sVar;
        if (this.LJIIIIZZ != null) {
            try {
                if (!LJJIJL(2) || this.LJJIIJ) {
                    ((C1470430oMr) this.LJIIIIZZ).LIZLLL(sVar);
                }
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (sVar != null) {
            this.LLLZIL.LJLLI(sVar);
        }
    }

    public final void LJJLIIIJLLLLLLLZ(Surface surface) {
        this.LJIIL = surface;
        if (surface != null && !this.LJLIIL.LJIILIIL) {
            this.LLLZIL.LJIILIIL(surface.toString());
        }
        if (this.A1 != null || this.LJIIIIZZ != null) {
            LLLLZIL(this.LJIIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.0oJK] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.0oJS, java.util.TimerTask] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJJZ(String str) {
        String str2;
        String strLJ;
        C1468270oJN c1468270oJN;
        int iLIZIZ;
        int i;
        if (this.LLLZIL != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LJJIJ = jCurrentTimeMillis;
            C1468160oJC c1468160oJC = this.LLLZIL;
            int i2 = this.L;
            int iOptInt = 0;
            if (i2 != 1 && ((i2 == 0 || !c1468160oJC.LJII.LJJII.equals("dir_url")) && (i = c1468160oJC.LJII.LJJLIIJ) != 1 && i != 2)) {
                c1468160oJC.LIZJ.LLLII = 0;
            } else {
                c1468160oJC.LIZJ.LLLII = 1;
            }
            if (!TextUtils.isEmpty(C1309170kAl.LJIIIIZZ)) {
                str2 = C1309170kAl.LJIIIIZZ;
            } else {
                str2 = C1309170kAl.LJ;
            }
            final C1468160oJC c1468160oJC2 = this.LLLZIL;
            c1468160oJC2.LJJLIIIIJ = 1;
            C1468180oJE c1468180oJE = c1468160oJC2.LJII;
            c1468180oJE.LJJI = str;
            c1468180oJE.LIZLLL = str2;
            InterfaceC1468020oIy interfaceC1468020oIy = c1468180oJE.LIZ;
            if (interfaceC1468020oIy != null) {
                strLJ = ((C1467030oHN) interfaceC1468020oIy).LJ(139);
            } else {
                strLJ = null;
            }
            if (TextUtils.isEmpty(strLJ)) {
                String str3 = c1468180oJE.LIZLLL;
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(str3)) {
                    sb.append(str3);
                    sb.append("T");
                }
                sb.append(Long.toString(System.currentTimeMillis()));
                sb.append("T");
                sb.append(Integer.toString((int) (Math.random() * 65535.0d)));
                c1468180oJE.LJIILL = sb.toString();
                c1468180oJE.LJJLIIIIJ = false;
            } else {
                c1468180oJE.LJIILL = strLJ;
                c1468180oJE.LJJLIIIIJ = true;
            }
            c1468180oJE.LJJJJLI = c1468180oJE.LJIILL;
            if (TextUtils.isEmpty(C1468180oJE.LJJZZIII)) {
                C1468180oJE.LJJZZIII = C2094908Ip.LIZ(c1468180oJE.LIZLLL);
            }
            if (!C1474810oTv.LJLIL() && !C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) && C1468160oJC.LLLJIL == 0) {
                c1468160oJC2.LJII.LJIIJ();
            }
            if (c1468160oJC2.LJLIIIL == 1) {
                c1468160oJC2.LJJZ = jCurrentTimeMillis;
            }
            if (c1468160oJC2.LJJZZI <= 0) {
                c1468160oJC2.LJJZZI = jCurrentTimeMillis;
                C1468180oJE c1468180oJE2 = c1468160oJC2.LJII;
                if (c1468180oJE2.LJJLI) {
                    double dLJ = c1468180oJE2.LJ();
                    double dLJFF = c1468160oJC2.LJII.LJFF();
                    if (dLJ > 0.0d && dLJFF > 0.0d) {
                        C1468170oJD c1468170oJD = c1468160oJC2.LIZJ;
                        c1468170oJD.f188e0 = dLJ;
                        c1468170oJD.g0 = dLJFF;
                    } else {
                        final C1468170oJD c1468170oJD2 = c1468160oJC2.LIZJ;
                        final C1468180oJE c1468180oJE3 = c1468160oJC2.LJII;
                        EngineThreadPool.addExecuteTask(new Runnable(c1468180oJE3, c1468170oJD2) { // from class: X.0oJZ
                            public final WeakReference<C1468170oJD> LL;
                            public final WeakReference<C1468180oJE> LLILLJJLI;

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1468440oJe c1468440oJeLJII;
                                C1C7U.LIZ("StatisticDataRunnable@4f1c.run");
                                try {
                                    C1468170oJD c1468170oJD3 = this.LL.get();
                                    C1468180oJE c1468180oJE4 = this.LLILLJJLI.get();
                                    if (c1468170oJD3 != null && c1468180oJE4 != null && (c1468440oJeLJII = c1468180oJE4.LJII()) != null) {
                                        double d = c1468440oJeLJII.LIZ;
                                        if (d <= 0.0d) {
                                            d = 1.401298464324817E-45d;
                                        }
                                        c1468170oJD3.f188e0 = d;
                                        double d2 = c1468440oJeLJII.LIZIZ;
                                        c1468170oJD3.g0 = d2 > 0.0d ? d2 : 1.401298464324817E-45d;
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("StatisticDataRunnable@4f1c.run");
                            }

                            {
                                this.LL = new WeakReference<>(c1468170oJD2);
                                this.LLILLJJLI = new WeakReference<>(c1468180oJE3);
                            }
                        });
                    }
                    HashMap<String, Object> mapLJI = c1468160oJC2.LJII.LJI();
                    if (mapLJI != null) {
                        c1468160oJC2.LLJJL.add(mapLJI.get("power"));
                        c1468160oJC2.LLJJLIIIJLLLLLLLZ.add(mapLJI.get("isCharging"));
                    }
                }
                if (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 2L) && (iLIZIZ = C1468330oJT.LIZIZ(c1468160oJC2.LJJLIIIJ)) >= 0) {
                    c1468160oJC2.LIZJ.f190i0 = iLIZIZ;
                }
            }
            c1468160oJC2.LJIIL = true;
            C1468170oJD c1468170oJD3 = c1468160oJC2.LIZJ;
            c1468170oJD3.LLJLLIL = c1468160oJC2.LJII.LJIILL;
            if (c1468160oJC2.LJLIIIL == 1) {
                c1468170oJD3.LJJIFFI = jCurrentTimeMillis;
            } else {
                c1468170oJD3.LJJIFFI = -2147483648L;
            }
            c1468170oJD3.LJJII = -2147483648L;
            c1468170oJD3.LJJLIIIJL = -2147483648L;
            c1468170oJD3.LJJLIIIJLJLI = -2147483648L;
            c1468170oJD3.LJJLIIJ = -2147483648L;
            c1468170oJD3.LJJLIL = -2147483648L;
            c1468170oJD3.LJJLJ = -2147483648L;
            c1468170oJD3.LJJLJLI = -2147483648L;
            c1468170oJD3.LJJLL = -2147483648L;
            c1468170oJD3.LJJZ = -2147483648L;
            c1468170oJD3.LJJZZI = -2147483648L;
            c1468170oJD3.LJJZZIII = -2147483648L;
            c1468170oJD3.LJLJJI = -2147483648L;
            c1468170oJD3.LJLJJLL = -2147483648L;
            c1468170oJD3.LJLJJL = -2147483648L;
            c1468170oJD3.LJLJL = -2147483648L;
            c1468170oJD3.LLJJJJJIL = -2147483648L;
            c1468170oJD3.LLJJJJLIIL = -2147483648L;
            c1468170oJD3.LLJJL = -2147483648L;
            c1468170oJD3.LLJJLIIIJLLLLLLLZ = -2147483648L;
            c1468170oJD3.LLJL = -2147483648L;
            c1468170oJD3.LLJLIL = -2147483648L;
            c1468170oJD3.LLJLILLLLZIIL = Integer.MIN_VALUE;
            c1468170oJD3.a0 = c1468160oJC2.LJLJI;
            c1468170oJD3.J1 = TTVideoEngine.LJIILL ? 1 : 0;
            c1468160oJC2.LIZJ.f184J = null;
            C1468250oJL c1468250oJL = c1468160oJC2.LLLJ;
            if (!((HashMap) c1468250oJL.LIZ).isEmpty()) {
                c1468250oJL.LIZ = new HashMap();
            }
            if (!c1468160oJC2.LJLJI) {
                c1468160oJC2.LJLJI = true;
            }
            if (c1468160oJC2.LJII.LJJII.equals("vid")) {
                c1468160oJC2.LJJ(-1002, true);
            } else if (c1468160oJC2.LJII.LJJII.equals("local_url")) {
                c1468160oJC2.LJJ(-1005, true);
            } else {
                int i3 = c1468160oJC2.LIZJ.LLLII;
                if (i3 == 0) {
                    c1468160oJC2.LJJ(-1003, true);
                } else if (i3 == 1) {
                    c1468160oJC2.LJJ(-1005, true);
                }
            }
            if (c1468160oJC2.LJLJJLL && (c1468270oJN = c1468160oJC2.LJIIJJI) != null) {
                if (Math.random() > c1468270oJN.LIZ) {
                    c1468270oJN.LIZIZ = false;
                } else {
                    c1468270oJN.LIZIZ = true;
                }
            }
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("netlevel interval:");
            sbLIZ.append(c1468160oJC2.LJLLILLLL);
            sbLIZ.append(", max count:");
            sbLIZ.append(c1468160oJC2.LJLLJ);
            C1471660oOq.LIZJ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
            if (c1468160oJC2.LJLLILLLL > 0 && c1468160oJC2.LJLL == null) {
                final C1468280oJO c1468280oJO = C1468070oJ3.LIZ().LIZ;
                int i5 = c1468160oJC2.LJLLILLLL;
                c1468280oJO.getClass();
                if (i5 >= 0) {
                    if (i5 < 500) {
                        i5 = 500;
                    }
                    c1468280oJO.LJIIIIZZ = i5;
                }
                int i6 = c1468160oJC2.LJLLJ;
                if (i6 >= 0) {
                    if (i6 < 10) {
                        i6 = 10;
                    }
                    c1468280oJO.LJII = i6;
                }
                c1468160oJC2.LJLL = new C0W9W() { // from class: X.0oJK
                    public final void LIZIZ() {
                        C1468160oJC c1468160oJC3;
                        List arrayList;
                        C790010Uyt c790010Uyt;
                        C1468160oJC c1468160oJC4 = c1468160oJC2;
                        C1468180oJE c1468180oJE4 = c1468160oJC4.LJII;
                        C1468170oJD c1468170oJD4 = c1468160oJC4.LIZJ;
                        C1468280oJO c1468280oJO2 = C1468070oJ3.LIZ().LIZ;
                        InterfaceC1468520oJm interfaceC1468520oJm = C1468070oJ3.LIZ().LIZ.LJ;
                        int networkRttMs = interfaceC1468520oJm != null ? ((C1468510oJl) interfaceC1468520oJm).LIZ.LIZIZ.getNetworkRttMs() : -1;
                        String strLJIIIZ = C1468180oJE.LJIIIZ();
                        String str4 = "unknown";
                        if (!C1468180oJE.LJJLL.equals("unknown")) {
                            if (C1468180oJE.LJJZ.equals("unknown") && (c790010Uyt = C1468180oJE.LJJZZI) != null) {
                                C1468180oJE.LJJZ = C1468180oJE.LIZ(c790010Uyt.LIZIZ);
                            }
                            str4 = C1468180oJE.LJJZ;
                        }
                        if (TTVideoEngine.LJIIL == 0) {
                            int iLIZLLL = c1468180oJE4.LJJJI;
                            String str5 = c1468180oJE4.LJIL;
                            if (iLIZLLL < 0) {
                                iLIZLLL = (int) ((C1467030oHN) c1468160oJC2.LIZIZ).LIZLLL(75);
                            }
                            if (iLIZLLL > 0) {
                                LIZ(c1468170oJD4.LLZLLLL, c1468170oJD4.LLZZZZ, Integer.valueOf(iLIZLLL));
                            }
                            if (!TextUtils.isEmpty(str5)) {
                                LIZ(c1468170oJD4.LLZLLIL, c1468170oJD4.LLZZZZ, str5);
                            }
                            if (c1468170oJD4.LLZZ.isEmpty()) {
                                c1468170oJD4.LLZZ.addAll(c1468280oJO2.LIZ(c1468280oJO2.LIZ));
                            }
                            int size = c1468170oJD4.LLZZ.size();
                            if (size >= c1468160oJC2.LJLLJ && size > 0) {
                                ListProtector.remove(c1468170oJD4.LLZZ, 0);
                            }
                            InterfaceC1468520oJm interfaceC1468520oJm2 = C1468070oJ3.LIZ().LIZ.LJ;
                            c1468170oJD4.LLZZ.add(Integer.valueOf(interfaceC1468520oJm2 != null ? ((C1468510oJl) interfaceC1468520oJm2).LIZ.LIZIZ.getNetworkType() : -1));
                        }
                        if (c1468170oJD4.LLZZJLIL.isEmpty()) {
                            c1468170oJD4.LLZZJLIL.addAll(c1468280oJO2.LIZ(c1468280oJO2.LIZIZ));
                        }
                        if (c1468170oJD4.LLZLL.isEmpty()) {
                            ArrayList<Float> arrayList2 = c1468170oJD4.LLZLL;
                            c1468280oJO2.getClass();
                            try {
                                arrayList = c1468280oJO2.LIZ(new ArrayList(c1468280oJO2.LIZLLL.values()));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                arrayList = new ArrayList();
                            }
                            arrayList2.addAll(arrayList);
                        }
                        int size2 = c1468170oJD4.LLZZJLIL.size();
                        if (size2 >= c1468160oJC2.LJLLJ && size2 > 0) {
                            ListProtector.remove(c1468170oJD4.LLZZJLIL, 0);
                        }
                        c1468170oJD4.LLZZJLIL.add(Integer.valueOf(networkRttMs));
                        synchronized ("VideoEventLoggerV2") {
                            try {
                                c1468160oJC3 = c1468160oJC2;
                                c1468160oJC3.getClass();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (!c1468160oJC3.LJLJJL) {
                            int size3 = c1468170oJD4.LLZLL.size();
                            if (size3 >= c1468160oJC2.LJLLJ && size3 > 0) {
                                ListProtector.remove(c1468170oJD4.LLZLL, 0);
                            }
                            c1468170oJD4.LLZLL.add(Float.valueOf(-1.0f));
                        }
                        c1468280oJO2.getClass();
                        try {
                            Map<Long, Float> map = c1468280oJO2.LIZLLL;
                            if (map != Collections.EMPTY_MAP) {
                                if (map.size() > c1468280oJO2.LJII) {
                                    c1468280oJO2.LIZLLL.remove(c1468280oJO2.LIZLLL.keySet().iterator().next());
                                }
                                c1468280oJO2.LIZLLL.put(Long.valueOf(System.currentTimeMillis()), Float.valueOf(-1.0f));
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            int i7 = C2187451AjH.LIZ;
                            C1471660oOq.LIZIZ("NetworkPortraitData", e2.getMessage());
                        }
                        if (!TextUtils.isEmpty(strLJIIIZ)) {
                            LIZ(c1468170oJD4.LLZL, c1468170oJD4.LLZZZZ, strLJIIIZ);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            LIZ(c1468170oJD4.LLZLI, c1468170oJD4.LLZZZZ, str4);
                        }
                        int size4 = c1468170oJD4.LLZZLLIL.size();
                        if (size4 >= c1468160oJC2.LJLLJ && size4 > 0) {
                            ListProtector.remove(c1468170oJD4.LLZZLLIL, 0);
                        }
                        float fLIZLLL = c1468160oJC2.LJII.LIZLLL();
                        if (fLIZLLL != -1.0f) {
                            c1468170oJD4.LLZZLLIL.add(Float.valueOf(fLIZLLL));
                        }
                        c1468170oJD4.LLZZZZ++;
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("VideoEventLoggerV2$MyTimerTask@b131.run");
                        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                        try {
                            LIZIZ();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("VideoEventLoggerV2$MyTimerTask@b131.run");
                    }

                    public static void LIZ(LinkedHashMap linkedHashMap, int i7, Object obj) {
                        int size = linkedHashMap.size();
                        if (size > 0) {
                            if (!obj.equals(linkedHashMap.get(((String[]) linkedHashMap.keySet().toArray(new String[0]))[size - 1]))) {
                                linkedHashMap.put(Integer.toString(i7), obj);
                                return;
                            }
                            return;
                        }
                        linkedHashMap.put(Integer.toString(i7), obj);
                    }
                };
                c1468280oJO.LIZJ();
                c1468280oJO.LIZIZ(c1468160oJC2.LJLL, c1468160oJC2.LJLLILLLL);
                C1468170oJD c1468170oJD4 = c1468160oJC2.LIZJ;
                int i7 = c1468160oJC2.LJLLILLLL;
                c1468170oJD4.LLZZZIL = i7;
                Math.max(i7 / 3, 200);
                synchronized ("VideoEventLoggerV2") {
                    try {
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C1468070oJ3.LIZ().getClass();
                c1468160oJC2.LJLLLLLL = new C1468300oJQ();
                String str4 = c1468160oJC2.LJLZ;
                if (str4 != null && !str4.isEmpty()) {
                    c1468160oJC2.LJLLLLLL.LIZIZ = c1468160oJC2.LJLZ;
                    c1468160oJC2.LJLZ = null;
                }
                JSONObject jSONObjectLIZLLL = C1309150kAj.LIZ.LIZLLL("net_quality");
                if (jSONObjectLIZLLL != null) {
                    iOptInt = jSONObjectLIZLLL.optInt("calculate_interval");
                }
                if (c1468160oJC2.LJLLI == null && iOptInt > 0) {
                    final C1468300oJQ c1468300oJQ = c1468160oJC2.LJLLLLLL;
                    ?? r1 = new C0W9W(c1468280oJO, c1468300oJQ) { // from class: X.0oJS
                        public final C1468280oJO LL;
                        public final InterfaceC1467850oIh LLILLJJLI;

                        public final void LIZ() {
                            C1468280oJO c1468280oJO2 = this.LL;
                            List<Integer> list = c1468280oJO2.LIZ;
                            Map<Long, Float> map = c1468280oJO2.LIZLLL;
                            ArrayList arrayList = (map == null || map.isEmpty()) ? null : new ArrayList(c1468280oJO2.LIZLLL.values());
                            InterfaceC1467850oIh interfaceC1467850oIh = this.LLILLJJLI;
                            if (interfaceC1467850oIh == null || list == null || arrayList == null) {
                                return;
                            }
                            C790230UzF.LIZ.LIZJ().businessEvent(31213, String.valueOf(((C1468300oJQ) interfaceC1467850oIh).LIZ(list, arrayList)));
                        }

                        @Override // java.util.TimerTask, java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("PortraitNetworkScore$BitrateCalculationTask@9c26.run");
                            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                            try {
                                LIZ();
                            } finally {
                            }
                            if (zLJ) {
                                C0W9U.LJFF();
                            }
                            C1C7U.LIZIZ("PortraitNetworkScore$BitrateCalculationTask@9c26.run");
                        }

                        {
                            this.LL = c1468280oJO;
                            this.LLILLJJLI = c1468300oJQ;
                        }
                    };
                    c1468160oJC2.LJLLI = r1;
                    c1468280oJO.LIZIZ(r1, iOptInt);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("bitrate calculate interval: ");
                    sbLIZ2.append(iOptInt);
                    TTVideoEngineLog.d("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            if (this.x4 > 0 && !TextUtils.isEmpty(this.W2)) {
                this.LLLZIL.LJZL(this.W2);
            }
            this.LJLIIL.LJIL = this.LLLZIL.LJJJI();
        }
    }

    public final void LJJZZIII(String str) {
        if (this.z) {
            this.z = false;
            this.LLLZIL.LJJII = str;
        }
        this.LLLZIL.LJJLI(str);
    }

    public final void LJL(int i) {
        if (this.A) {
            this.A = false;
            this.LLLZIL.LJJIII = i;
        }
    }

    public final void LJLI(String str) {
        String[] strArrLJI;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1474520oTS c1474520oTSLIZ = C1467400oHy.LIZ(this.LJIL);
        EnumC2281151EQn currentResolution = this.LJIL.getCurrentResolution();
        Map<Integer, String> mapLJFF = this.LJIL.LJFF();
        C1467070oHR c1467070oHR = this.LJLIIL;
        if (c1467070oHR.LJIIJJI) {
            int iIntValue = 0;
            c1467070oHR.LJIIJJI = false;
            String str3 = "";
            if (str.startsWith("mem://bash") && c1474520oTSLIZ != null) {
                if (c1474520oTSLIZ.LJFF() == 0) {
                    str2 = (String) ((HashMap) this.LLZZJLIL).get(currentResolution);
                    if (str2 == null || str2.isEmpty()) {
                        str2 = str;
                    }
                    for (Map.Entry entry : ((HashMap) this.LLZZLLIL).entrySet()) {
                        if (iIntValue == 0) {
                            try {
                                iIntValue = ((Integer) entry.getKey()).intValue();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else if (iIntValue > ((Integer) entry.getKey()).intValue()) {
                            iIntValue = ((Integer) entry.getKey()).intValue();
                        }
                    }
                    if (iIntValue > 0) {
                        str3 = (String) ((HashMap) this.LLZZLLIL).get(Integer.valueOf(iIntValue));
                    }
                    this.LLLZIL.LJLJJL(str2, str3);
                } else {
                    if (c1474520oTSLIZ.LJFF() == 1) {
                        str3 = (String) ((HashMap) this.LLZZLLIL).get(Integer.valueOf(c1474520oTSLIZ.LIZIZ(3)));
                    }
                    str2 = str;
                    this.LLLZIL.LJLJJL(str2, str3);
                }
            } else {
                str2 = str;
                this.LLLZIL.LJLJJL(str2, str3);
            }
        }
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (c1474520oTSLIZ != null) {
            strArrLJI = c1474520oTSLIZ.LJIIJ();
        } else {
            if (interfaceC1467050oHPLIZJ != null) {
                strArrLJI = interfaceC1467050oHPLIZJ.LJI(currentResolution, mapLJFF);
            }
            this.LLLZIL.LJJLIIIJ(str);
        }
        if (strArrLJI != null && strArrLJI.length > 0) {
            int iIntValue2 = ((Integer) ((HashMap) this.LLZLLLL).get(currentResolution)).intValue();
            if (iIntValue2 < strArrLJI.length) {
                this.LLLZIL.LJJLIIIJ(strArrLJI[iIntValue2]);
                return;
            } else {
                this.LLLZIL.LJJLIIIJ(str);
                return;
            }
        }
        this.LLLZIL.LJJLIIIJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL(fyo.e r13) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LJLIIIL(fyo.e):void");
    }

    public final void LJLIIL(String str) {
        boolean z;
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        C1467070oHR c1467070oHR = this.LJLIIL;
        if (c1467070oHR.LJIJI) {
            return;
        }
        c1467070oHR.LIZIZ = 2;
        C1468160oJC c1468160oJC = this.LLLZIL;
        if (c1468160oJC != null) {
            c1468160oJC.LJJLIIIJLJLI(0, System.currentTimeMillis());
        }
        try {
            URL url = new URL(str);
            Context context = this.LJI;
            String host = url.getHost();
            AbstractC1468760oKA abstractC1468760oKA = this.LLLLLLZZ;
            if (abstractC1468760oKA == null) {
                abstractC1468760oKA = null;
            }
            C1468530oJn c1468530oJn = new C1468530oJn(context, abstractC1468760oKA, host);
            this.LLLZZ = c1468530oJn;
            c1468530oJn.LIZLLL = new InterfaceC1468560oJq(this) { // from class: X.0oHb
                public final WeakReference<C1466990oHJ> LIZ;

                @Override // X.InterfaceC1468560oJq
                public final void onCancelled() {
                }

                {
                    this.LIZ = new WeakReference<>(this);
                }

                @Override // X.InterfaceC1468560oJq
                public final void LIZ(e eVar) {
                    C1466990oHJ c1466990oHJ;
                    if (eVar != null || (c1466990oHJ = this.LIZ.get()) == null) {
                        return;
                    }
                    c1466990oHJ.LLLZIL.LJIIZILJ.add(eVar);
                }

                @Override // X.InterfaceC1468560oJq
                public final void LIZIZ(JSONObject jSONObject, e eVar) {
                    String strOptString;
                    C1466990oHJ c1466990oHJ = this.LIZ.get();
                    if (c1466990oHJ == null || c1466990oHJ.LJLIIL.LJIJI) {
                        return;
                    }
                    if (eVar != null) {
                        c1466990oHJ.LLLLIILL(eVar);
                        return;
                    }
                    if (jSONObject != null) {
                        strOptString = jSONObject.optString("ip");
                        long jOptLong = jSONObject.optLong("time");
                        String strOptString2 = jSONObject.optString("dns_type");
                        C1468160oJC c1468160oJC2 = c1466990oHJ.LLLZIL;
                        if (c1468160oJC2 != null) {
                            c1468160oJC2.LJJLIIIJJIZ(jOptLong);
                            c1466990oHJ.LLLZIL.LIZ(86, strOptString2);
                        }
                    } else {
                        strOptString = null;
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        c1466990oHJ.LLLLIILL(new e("", -9997, 0, "DNS result empty"));
                    } else {
                        c1466990oHJ.LJLIL(strOptString);
                    }
                }
            };
            if (this.LJJLIIIJLJLI != 0) {
                this.LLLZZ.LJIIL = true;
            }
            C1468530oJn c1468530oJn2 = this.LLLZZ;
            if (this.H) {
                z = true;
            } else {
                z = false;
            }
            c1468530oJn2.LJIILIIL = z;
            int i = this.I;
            if (i > 0) {
                c1468530oJn2.LJIILL = i;
            }
            if (this.c0 && interfaceC1467050oHPLIZJ != null) {
                c1468530oJn2.LJIILJJIL = true;
                JSONObject jSONObjectLJIL = interfaceC1467050oHPLIZJ.LJIL();
                Long lValueOf = Long.valueOf(interfaceC1467050oHPLIZJ.LJIILJJIL(216));
                c1468530oJn2.LJIJ = jSONObjectLJIL;
                c1468530oJn2.LJIJI = lValueOf.longValue();
            }
            this.LLLZZ.LJFF();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJLIL(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LJLIL(java.lang.String):void");
    }

    public void LJLILLLLZI(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (LLLLII(interfaceC1467050oHP, true)) {
            this.F5 = false;
            if (this.LJLIIL.LJJ.LIZ == null) {
                LLLLIILL(new e("kTTVideoErrorDomainFetchingInfo", -9967, 0, "mURLInfo.hostURL is empty"));
                return;
            }
            int i = this.L;
            if (i != 1) {
                if (i != 1 && (this.N <= 0 || !this.g6.LJI.isRunning() || this.k == 2)) {
                    LJLIIL(this.LJLIIL.LJJ.LIZ);
                }
            } else {
                this.LLLZIL.LIZ(86, "localDNS");
            }
            LJLJJI(this.LJLIIL.LJJ.LIZ, this.LLLLLLZ);
        }
        this.F5 = false;
    }

    public final void LJLJI(boolean z) throws Exception {
        String str;
        InterfaceC1467950oIr interfaceC1467950oIr;
        int iLIZJ;
        this.LJLIIL.LJIIJ = true;
        this.LJJIII = false;
        if (this.d0 == null) {
            this.d0 = new BPEAHandler(C795730VJj.LJII());
        }
        this.f6.LIZ(z);
        if (z) {
            this.LLLZIL.LJLJJLL(64);
            this.LJLIIL.LJIIIIZZ = System.currentTimeMillis();
            if (this.LLLZZIL < 0) {
                this.LLLZZIL = SystemClock.elapsedRealtime();
            }
        } else {
            this.LLLZIL.LIZJ(31, 1);
            this.LLLZIL.LJLJJLL(65);
        }
        C1468160oJC c1468160oJC = this.LLLZIL;
        if (TTVideoEngine.LJIIL == 0) {
            c1468160oJC.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC1468020oIy interfaceC1468020oIy = c1468160oJC.LIZIZ;
            if (interfaceC1468020oIy != null) {
                iLIZJ = ((C1467030oHN) interfaceC1468020oIy).LIZJ(67);
            } else {
                iLIZJ = -1;
            }
            HashMap map = new HashMap(2);
            map.put("p", Integer.valueOf(iLIZJ));
            map.put("t", Long.valueOf(jCurrentTimeMillis));
            C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map)), c1468160oJC.LLJJIJIIJIL);
        }
        if (z && (c1468160oJC.LJZL & 4) != 0) {
            c1468160oJC.LJLLL.LIZLLL = true;
            C1467120oHW c1467120oHW = c1468160oJC.LJLLL;
            if (!c1467120oHW.LIZJ) {
                c1467120oHW.LIZJ = true;
                try {
                    c1467120oHW.LIZ.getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), true, c1467120oHW.LJ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = C2187451AjH.LIZ;
                    TTVideoEngineLog.w("BrightnessMonitor", e.getMessage());
                }
                c1467120oHW.LIZ();
            }
        }
        C1467160oHa c1467160oHa = c1468160oJC.LJLLLL;
        if (c1467160oHa.LIZ <= 0 && c1467160oHa.LIZIZ <= 0) {
            c1467160oHa.LIZ(c1467160oHa.LIZJ, c1467160oHa.LIZLLL);
        }
        if ((c1468160oJC.LJZL & 8) != 0) {
            C1468040oJ0 c1468040oJ0 = c1468160oJC.LJIIIZ;
            if (!c1468040oJ0.LJFF) {
                c1468040oJ0.LJFF = true;
                EngineThreadPool.addExecuteTask(new ARunnableS123S0100000_23(c1468040oJ0, 129));
                if (c1468040oJ0.LIZLLL == null) {
                    Context context = c1468040oJ0.LIZ;
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
                    intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    C1469100oKi c1469100oKi = new C1469100oKi(c1468040oJ0);
                    c1468040oJ0.LIZLLL = c1469100oKi;
                    C786410Ut5.LJIJJ(context, c1469100oKi, intentFilter);
                }
            }
            C1467650oIN c1467650oIN = c1468160oJC.LJIIJ;
            C1468040oJ0 c1468040oJ02 = c1467650oIN.LIZIZ;
            C1468040oJ0.LJI(c1468040oJ02.LIZIZ, new ARunnableS92S0200000_23(c1468040oJ02, c1467650oIN, 83));
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("HeadsetStateHistory", "start");
        }
        if (z) {
            C1468170oJD c1468170oJD = c1468160oJC.LIZJ;
            if (c1468170oJD.Z0 == Integer.MIN_VALUE) {
                c1468170oJD.Z0 = ((C1467030oHN) c1468160oJC.LIZIZ).LIZJ(94);
            }
        }
        int i3 = this.LJLIIL.LIZIZ;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return;
                    }
                } else {
                    int i4 = this.LJIILL;
                    if (((i4 == 0 || i4 == 3) && !this.LJJIIJ) || ((interfaceC1467950oIr = this.LJIIIIZZ) != null && ((C1470430oMr) interfaceC1467950oIr).getPlayerType() == 0 && !this.LJJIIJ)) {
                        LJJZ(this.LJIL.getVideoId());
                        if (!this.LJIL.LJI() && !this.LJIL.LIZ()) {
                            Map<String, C1467610oIJ> map2 = this.LLZZ;
                            if (map2 != null) {
                                C1467610oIJ c1467610oIJ = (C1467610oIJ) ((HashMap) map2).get(this.LJLIIL.LJJ.LIZ);
                                if (c1467610oIJ != null) {
                                    c1467610oIJ.LIZIZ = "FromCache";
                                    ((HashMap) this.LLZZ).put(this.LJLIIL.LJJ.LIZ, c1467610oIJ);
                                    LLFFF();
                                }
                            }
                            C1467670oIP c1467670oIP = this.LJLIIL.LJJ;
                            if (c1467670oIP.LIZJ) {
                                str = c1467670oIP.LIZIZ;
                            } else {
                                str = c1467670oIP.LIZ;
                            }
                            LJLJJI(str, this.LLLLLLZ);
                            return;
                        }
                        LJZ(this.LJIL.getUrl(), this.LLLLLLZ);
                        return;
                    }
                    if (this.LJLIIL.LJIILJJIL || (this.LJIILL == 0 && this.LJJIJ == 0)) {
                        LJLLILLLL();
                        this.g6.LJJIIJZLJL(false);
                        LJJZ(this.LJIL.getVideoId());
                        Map<String, String> map3 = this.LLLLLLZ;
                        InterfaceC1467950oIr interfaceC1467950oIr2 = this.LJIIIIZZ;
                        if (map3 != null && interfaceC1467950oIr2 != null) {
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map3;
                            concurrentHashMap.put("X-Tt-Traceid", this.LJLIIL.LJIL);
                            StringBuilder sb = new StringBuilder();
                            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                sb.append((String) entry.getKey());
                                sb.append(": ");
                                sb.append((String) entry.getValue());
                                sb.append("\r\n");
                            }
                            ((C1470430oMr) this.LJIIIIZZ).LIZ(20, sb.toString());
                        }
                        C1467010oHL c1467010oHL = this.LJJJJIZL;
                        if (c1467010oHL != null) {
                            c1467010oHL.LIZ();
                        }
                    }
                    LJLJLLL();
                    return;
                }
            } else if (C1467400oHy.LIZJ(this.LJIL) == null) {
                if (!this.M) {
                    LJLJJL();
                    return;
                }
                return;
            } else {
                LJJZ(this.LJIL.getVideoId());
                LJLILLLLZI(C1467400oHy.LIZJ(this.LJIL));
                return;
            }
        }
        LJLJJL();
    }

    public final String LJLJLJ(EnumC2281151EQn enumC2281151EQn) {
        if (enumC2281151EQn == null) {
            return "nil";
        }
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (interfaceC1467050oHPLIZJ != null) {
            return interfaceC1467050oHPLIZJ.LIZLLL(enumC2281151EQn);
        }
        return enumC2281151EQn.toString(0);
    }

    public final void LJLL(boolean z) {
        C1468160oJC c1468160oJC;
        if (z && (c1468160oJC = this.LLLZIL) != null) {
            c1468160oJC.LJLJJLL(169);
        }
        if (!LJJIJIIJIL()) {
            this.LJLIIL.LJIIL = false;
            this.LJJIJLIJ = 0L;
            C1468160oJC c1468160oJC2 = this.LLLZIL;
            if (c1468160oJC2 != null) {
                if (c1468160oJC2.LJJJZ > 0) {
                    c1468160oJC2.LJJJZ = -2147483648L;
                    C1468170oJD c1468170oJD = c1468160oJC2.LIZJ;
                    if (c1468170oJD != null) {
                        c1468170oJD.LLJJJJLIIL = System.currentTimeMillis();
                    }
                }
                this.LLLZIL.LLIFFJFJJ();
            }
        }
        if (this.LLZZZZ) {
            this.LLZZZZ = false;
            LLIIII(false);
            C1468160oJC c1468160oJC3 = this.LLLZIL;
            if (c1468160oJC3 != null) {
                c1468160oJC3.LLIIJI(true);
            }
        }
        LLLILZJ(z);
        this.f6.LJIIZILJ(z);
    }

    public final void LJLLLL(String str) {
        this.c3 = str;
        this.LLLZIL.LJZI(str);
        if (!TextUtils.isEmpty(str) && this.o3 > 0) {
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(618, this.n3);
            ((C1470430oMr) this.LJIIIIZZ).LIZ(617, this.c3);
            this.LLLZIL.LIZIZ(83, System.currentTimeMillis());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL(int r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "stream "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " changed, state:"
            r1.append(r0)
            int r0 = r3.LJIILL
            r1.append(r0)
            java.lang.String r0 = ", mPrepared:"
            r1.append(r0)
            boolean r0 = r3.LJJIIJ
            r1.append(r0)
            java.lang.String r0 = ", mLoadState:"
            r1.append(r0)
            X.0oHR r0 = r3.LJLIIL
            int r0 = r0.LIZJ
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.0oHR r1 = r3.LJLIIL
            boolean r0 = r1.LJIIL
            if (r0 == 0) goto L3c
            r0 = 0
            r1.LJIIL = r0
            r0 = 0
            r3.LJJIJLIJ = r0
        L3c:
            int r0 = r3.LLLLILI
            r2 = 1
            if (r0 == 0) goto L73
            X.0oIm r0 = r3.LLLLZLLLI
            if (r0 == 0) goto L73
            X.0oIr r0 = r3.LJIIIIZZ
            if (r0 == 0) goto L73
            if (r4 != 0) goto L6d
            r3.LLJJIJIL()
        L4e:
            X.0oHR r1 = r3.LJLIIL
            boolean r0 = r1.LJIJJ
            if (r0 != 0) goto L56
            r1.LJIJJ = r2
        L56:
            boolean r0 = r3.LJJIIJ
            if (r0 == 0) goto L6c
            int r0 = r3.LJIILL
            if (r0 == 0) goto L6c
            X.0oHR r0 = r3.LJLIIL
            int r0 = r0.LIZJ
            if (r0 == 0) goto L6c
            r3.LLLILZLLLI(r4)
            X.0oHQ r0 = r3.f6
            r0.LJIILJJIL(r4)
        L6c:
            return
        L6d:
            if (r4 != r2) goto L56
            r3.LLJJIJIL()
            goto L56
        L73:
            if (r4 != 0) goto L56
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LJZL(int):void");
    }

    public final void LLFII(int i) {
        boolean z;
        EnumC2281151EQn enumC2281151EQn = EnumC2281151EQn.Undefine;
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (interfaceC1467050oHPLIZJ != null && interfaceC1467050oHPLIZJ.LJIIL()) {
            EnumC2281151EQn[] allResolutions = EnumC2281151EQn.getAllResolutions();
            EnumC2281151EQn currentResolution = this.LJIL.getCurrentResolution();
            int i2 = 0;
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                }
                C1474520oTS c1474520oTSLJJIIJ = interfaceC1467050oHPLIZJ.LJJIIJ(allResolutions[i2], 0, null);
                if (c1474520oTSLJJIIJ != null && c1474520oTSLJJIIJ.LIZIZ(3) == i) {
                    enumC2281151EQn = allResolutions[i2];
                    this.LLZILL = currentResolution;
                    this.LLZIL = i;
                    this.LJIL.LIZIZ(enumC2281151EQn);
                    this.Z = c1474520oTSLJJIIJ.LIZ(32);
                    String strLJLJLJ = LJLJLJ(currentResolution);
                    if (this.B) {
                        if (currentResolution == EnumC2281151EQn.Auto) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.B = z;
                        this.LLLZIL.LJLJJI(strLJLJLJ);
                    }
                    this.LLLZIL.LJJLIIIIJ(strLJLJLJ);
                    this.LLLZIL.LJJIIZ(LJLJLJ(currentResolution), LJLJLJ(this.LLZILL));
                    this.LLLZIL.LJJLIIIJILLIZJL(this.Z);
                } else {
                    i2++;
                }
            }
        }
        if (this.LJIILL == 2 && this.LLZZZZ) {
            this.LLZZZZ = false;
            LLIIII(false);
            C1468160oJC c1468160oJC = this.LLLZIL;
            if (c1468160oJC != null) {
                c1468160oJC.LLIIJI(true);
            }
        } else {
            if (this.a) {
                this.LLLZIL.LLIIJI(false);
            }
            LLIIII(false);
        }
        LLLJIL(i, enumC2281151EQn);
    }

    public final String[] LLI(String[] strArr) {
        if (this.LLIIIILZ == 0) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = C795730VJj.LIZ(strArr[i]);
            }
        }
        return strArr;
    }

    public final void LLIFFJFJJ(C0MRO c0mro) {
        this.LLLLLZL.LLILZIL.addIfAbsent(c0mro);
    }

    public final void LLIIII(boolean z) {
        if (z) {
            this.a = true;
            this.b = SystemClock.currentThreadTimeMillis();
        } else {
            this.a = false;
            this.b = 0L;
        }
    }

    public boolean LLIIIILZ(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (interfaceC1467050oHP instanceof C1470240oMY) {
            return this.LLLLZIL.LJJIIZI((C1470240oMY) interfaceC1467050oHP);
        }
        return false;
    }

    public void LLIL(e eVar) {
        this.LLLLLZL.LJI(eVar);
    }

    public final float LLJI(int i) {
        if (i == 474) {
            return 0.0f;
        }
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i != 70) {
            if (i != 71) {
                if (i != 474 && i == 760) {
                    C1468160oJC c1468160oJC = this.LLLZIL;
                    if (c1468160oJC != null) {
                        return c1468160oJC.LJII.LJJJJJ;
                    }
                    return 1.0f;
                }
            } else if (interfaceC1467950oIr != null) {
                return ((C1470430oMr) interfaceC1467950oIr).LJIILIIL(0.0f, 150);
            }
            return 0.0f;
        }
        C1467070oHR c1467070oHR = this.LJLIIL;
        if (c1467070oHR.LJIJJLI <= 0.0f && interfaceC1467950oIr != null) {
            c1467070oHR.LJIJJLI = ((C1470430oMr) interfaceC1467950oIr).LJIILIIL(0.0f, 151);
        }
        return this.LJLIIL.LJIJJLI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final long LLJILJIL(int i) {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        try {
            if (i != 41) {
                if (i != 81) {
                    if (i != 315) {
                        if (i != 461) {
                            if (i != 755) {
                                if (i != 757) {
                                    if (i != 759) {
                                        if (i != 614) {
                                            if (i != 615) {
                                                switch (i) {
                                                    case 60:
                                                        if (this.w3 < 0 && interfaceC1467950oIr != null) {
                                                            this.w3 = ((C1470430oMr) interfaceC1467950oIr).LJIIJ(171, 0L);
                                                        }
                                                        return this.w3;
                                                    case 61:
                                                        if (interfaceC1467950oIr != null) {
                                                            return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(73, 0L);
                                                        }
                                                        break;
                                                    case BaseNotice.CREATOR /* 62 */:
                                                        if (interfaceC1467950oIr != null) {
                                                            return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(72, 0L);
                                                        }
                                                        break;
                                                    case 63:
                                                        if (interfaceC1467950oIr != null) {
                                                            return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(63, -1L);
                                                        }
                                                        break;
                                                    case 64:
                                                        if (interfaceC1467950oIr != null) {
                                                            return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(468, -1L);
                                                        }
                                                        break;
                                                }
                                            } else {
                                                return this.LLZ;
                                            }
                                        } else {
                                            return this.LLLZZIL;
                                        }
                                    } else {
                                        C1468160oJC c1468160oJC = this.LLLZIL;
                                        if (c1468160oJC != null) {
                                            return c1468160oJC.LJJIZ(161);
                                        }
                                    }
                                } else {
                                    C1468160oJC c1468160oJC2 = this.LLLZIL;
                                    if (c1468160oJC2 != null) {
                                        return c1468160oJC2.LJJIZ(159);
                                    }
                                }
                            } else {
                                C1468160oJC c1468160oJC3 = this.LLLZIL;
                                if (c1468160oJC3 != null) {
                                    return c1468160oJC3.LJJIZ(163);
                                }
                            }
                        } else {
                            return this.g6.LJIILL;
                        }
                    } else if (interfaceC1467950oIr != null) {
                        return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(46, 0L);
                    }
                } else if (interfaceC1467950oIr != null) {
                    return ((C1470430oMr) interfaceC1467950oIr).LJIIJ(240, 0L);
                }
            } else {
                C1468160oJC c1468160oJC4 = this.LLLZIL;
                if (c1468160oJC4 != null) {
                    return c1468160oJC4.LJJJJJ;
                }
            }
            return -1L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    public final String LLJJIJI(int i) {
        C1468160oJC c1468160oJC;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        String string = "";
        try {
            if (i != 80) {
                if (i != 82) {
                    if (i != 462) {
                        if (i != 477) {
                            if (i != 716) {
                                if (i != 957) {
                                    if (i != 1420) {
                                        if (i != 1414) {
                                            if (i == 1415 && (c1468160oJC = this.LLLZIL) != null) {
                                                return c1468160oJC.LJJJ(173);
                                            }
                                        } else if (interfaceC1467950oIr != null) {
                                            return ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(860);
                                        }
                                    } else if (interfaceC1467950oIr != null) {
                                        C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
                                        String strLJIIIZ = c1470430oMr.LJIIIZ(2008);
                                        String strLJIIIZ2 = c1470430oMr.LJIIIZ(2009);
                                        if (!TextUtils.isEmpty(strLJIIIZ)) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("");
                                            sbLIZ.append(strLJIIIZ);
                                            string = C2188811AlT.LIZIZ(sbLIZ);
                                        }
                                        if (!TextUtils.isEmpty(strLJIIIZ2)) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(string);
                                            sbLIZ2.append(strLJIIIZ2);
                                            return C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                    }
                                } else if (interfaceC1467950oIr != null) {
                                    return ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(1002);
                                }
                            } else if (interfaceC1467950oIr != null) {
                                return ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(473);
                            }
                        } else {
                            C1468160oJC c1468160oJC2 = this.LLLZIL;
                            if (c1468160oJC2 != null) {
                                return c1468160oJC2.LJJJ(47);
                            }
                        }
                    } else {
                        Map<String, C1467610oIJ> map = this.LLZZ;
                        if (map != null) {
                            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                                String str = (String) entry.getKey();
                                C1467610oIJ c1467610oIJ = (C1467610oIJ) entry.getValue();
                                if (str != null && c1467610oIJ != null) {
                                    HashMap map2 = new HashMap();
                                    map2.put("ip", c1467610oIJ.LIZ);
                                    map2.put("dns", c1467610oIJ.LIZIZ);
                                    map2.put("dns_cache_open", Integer.valueOf(c1467610oIJ.LIZJ));
                                    map2.put("server_dns_open", Integer.valueOf(c1467610oIJ.LIZLLL));
                                    map2.put("url_desc", c1467610oIJ.LJ);
                                    string = map2.toString();
                                }
                            }
                        }
                    }
                } else {
                    if (TTVideoEngine.LJFF) {
                        try {
                            string = C1469080oKg.LIZ(201, "com.ss.ttmplugin.player.TTVersion").getField("VERSION_NAME").get(null).toString();
                            return string;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return string;
                        }
                    }
                    return x.LIZLLL(14, "");
                }
            } else if (interfaceC1467950oIr != null) {
                return ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(142);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return string;
    }

    public final boolean LLJJJJLIIL(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (interfaceC1467050oHP == null) {
            return false;
        }
        if ((!interfaceC1467050oHP.LJIIJ(EnumC1469940oM4.DASH) || ((this.i1 >> 1) & 1) != 1) && (!interfaceC1467050oHP.LJIIJ(EnumC1469940oM4.MP4) || ((this.i1 >> 2) & 1) != 1)) {
            return false;
        }
        return interfaceC1467050oHP.LJIIJJI();
    }

    public final boolean LLJL(InterfaceC1467050oHP interfaceC1467050oHP) {
        boolean z;
        boolean z2;
        if (interfaceC1467050oHP == null) {
            return false;
        }
        if (this.LJLLLL) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLLLLLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (interfaceC1467050oHP.LJIIJ(EnumC1469940oM4.DASH)) {
            return true;
        }
        if (interfaceC1467050oHP.LJIIJ(EnumC1469940oM4.MP4)) {
            if (!z || !LLJJJJLIIL(interfaceC1467050oHP)) {
                return false;
            }
            return true;
        }
        if (!interfaceC1467050oHP.LJIIJ(EnumC1469940oM4.HLS) || !z2 || !LLJJL(interfaceC1467050oHP)) {
            return false;
        }
        return true;
    }

    public void LLJLLIL(Map map) {
        this.LLLLLZL.LJJIJ(map);
    }

    public void LLJLLL(int i) {
        C1469350oL7 c1469350oL7 = this.LLLLLZL;
        if (c1469350oL7 != null) {
            c1469350oL7.LJIJJ(i);
        }
    }

    public void LLJZIJLIL(int i) {
        this.LLLLLZL.LJIIL(this.y5, i);
        LJJLIIIJILLIZJL();
    }

    public void LLLF(int i) {
        this.LLLLLZL.LJJJJJ(this.y5, i);
    }

    public void LLLFFI(InterfaceC1467050oHP interfaceC1467050oHP) {
        InterfaceC1467760oIY interfaceC1467760oIY = this.LLLLZIL;
        if (interfaceC1467760oIY == null) {
            return;
        }
        interfaceC1467760oIY.LJJIIZI((C1470240oMY) interfaceC1467050oHP);
    }

    public void LLLII(int i) {
        if (this.LJLIIL.LJIJ || i != 3) {
            this.LLLLLZL.LJIJ(this.y5, i);
        }
    }

    public void LLLIIII(C1467860oIi c1467860oIi) {
        this.LLLLLZL.LJJJLZIJ(this.y5, this.LJIILL, c1467860oIi);
    }

    public void LLLILZJ(boolean z) {
        s0 s0Var = this.LJJIL;
        if (s0Var == null) {
            return;
        }
        s0Var.LJII(z);
    }

    public void LLLILZLLLI(int i) {
        this.LLLLLZL.LJIJI(this.y5, i);
    }

    public void LLLJ(int i) {
        this.LLLLLZL.LJIJJLI(i);
    }

    public void LLLJL(e eVar) {
        this.LLLLLZL.LJJL(eVar, this.LLZZZIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x050d A[PHI: r5
      0x050d: PHI (r5v16 int) = (r5v12 int), (r5v12 int), (r5v10 int) binds: [B:177:0x0321, B:179:0x0328, B:256:0x0509] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIILL(fyo.e r14) {
        /*
            Method dump skipped, instruction units count: 1494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LLLLIILL(fyo.e):void");
    }

    public final void LLLLIL(C0MRO c0mro) {
        this.LLLLLZL.LLILZIL.remove(c0mro);
    }

    public final void LLLLL(C1469120oKk c1469120oKk) {
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            ((C1470430oMr) interfaceC1467950oIr).LIZ(1600, c1469120oKk.toString());
        }
    }

    public final void LLLLLJLJLL(String str) {
        if (this.LLLZIL != null && !TextUtils.isEmpty(str)) {
            if (str.length() > 512) {
                str = str.substring(0, 512);
            }
            this.LLLZIL.LJIJJ = str;
        }
    }

    public final void LLLLLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.p = str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oII] */
    public final void LLLLLLZ(InterfaceC1467890oIl interfaceC1467890oIl) {
        this.LLLLZ = interfaceC1467890oIl;
        if (this.M0 == null) {
            this.M0 = new MaskInfo() { // from class: X.0oII
                @Override // com.ss.ttm.player.MaskInfo
                public final void onMaskInfoCallback(int i, int i2, String str) {
                    C1466990oHJ c1466990oHJ = this.LIZIZ;
                    if (c1466990oHJ.LLLLZ != null) {
                        int i3 = c1466990oHJ.h3;
                        c1466990oHJ.getClass();
                        if (i3 > 0) {
                            this.LIZIZ.LLLLZ.LJLI(i, i2, str);
                        }
                    }
                }
            };
        }
    }

    public final void LLLLLZ(int i) {
        this.e = i;
        this.LLLZIL.LJJIJL = i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0oKN, X.0oKO] */
    public final void LLLLLZIL(C1468920oKQ c1468920oKQ) {
        int i;
        final C1466990oHJ c1466990oHJ;
        InterfaceC1467950oIr interfaceC1467950oIr;
        TTPlayerClient tTPlayerClient;
        this.LLLLZI = c1468920oKQ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subtitle: set callback, null: %d");
        if (c1468920oKQ == null) {
            i = 1;
        } else {
            i = 0;
        }
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.N0 == null) {
            final C1468160oJC c1468160oJC = this.LLLZIL;
            if (((Boolean) C1474810oTv.h1.getValue()).booleanValue()) {
                c1466990oHJ = null;
            } else {
                c1466990oHJ = this;
            }
            ?? r2 = new AbstractC1468900oKO<T>(c1468160oJC, c1466990oHJ) { // from class: X.0oKN
                @Override // com.ss.ttm.player.SubInfo
                public final void onSubLoadFinished(int i2) {
                    int i3;
                    if (this.LIZIZ.get() != null && this.LIZLLL > 0) {
                        int i4 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d("SubInfoCallbackAdapter", "subtitle call back: finished old did call back");
                        if (i2 >= 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        this.LIZIZ.get().LIZIZ(i3);
                        if (i3 == 1 && this.LIZJ.get() != null) {
                            this.LIZJ.get().LJIIJ(1, "sub_thread_enable");
                            return;
                        }
                        return;
                    }
                    int i5 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("SubInfoCallbackAdapter", "mSubInfoCallBack is null or mEnableSub == 0");
                }

                @Override // com.ss.ttm.player.SubInfo
                public final void onSubInfoCallback2(int i2, String str) {
                    if (this.LIZIZ.get() != null && this.LIZLLL > 0) {
                        this.LIZIZ.get().LIZ(i2, str);
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("subtitle: callback2: ");
                        sbLIZ2.append(str);
                        TTVideoEngineLog.d("SubInfoCallbackAdapter", C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    int i4 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("SubInfoCallbackAdapter", "mSubInfoCallBack is null or mEnableSub == 0");
                }

                @Override // com.ss.ttm.player.SubInfo
                public final void onSubLoadFinished2(int i2, String str) {
                    int i3;
                    if (this.LIZIZ.get() != null && this.LIZLLL > 0) {
                        int i4 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("subtitle: call back: finished did call back ");
                        sbLIZ2.append(this.LJ);
                        TTVideoEngineLog.d("SubInfoCallbackAdapter", C2188811AlT.LIZIZ(sbLIZ2));
                        if (i2 >= 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            if (i3 == 1) {
                                i2 = 0;
                            }
                            jSONObject.put("code", i2);
                            jSONObject.put("cache_size", this.LJ);
                            str = C786410Ut5.J3(jSONObject);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i5 = C2187451AjH.LIZ;
                            C1471660oOq.LIZIZ("SubInfoCallbackAdapter", e.toString());
                        }
                        this.LIZIZ.get().LIZJ(i3, str);
                        if (i3 == 1 && this.LIZJ.get() != null) {
                            this.LIZJ.get().LJIIJ(1, "sub_thread_enable");
                            return;
                        }
                        return;
                    }
                    int i6 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("SubInfoCallbackAdapter", "mSubInfoCallBack is null or mEnableSub == 0");
                }

                @Override // com.ss.ttm.player.SubInfo
                public final void onSubSwitchCompleted(int i2, String str) {
                    if (this.LIZIZ.get() != null && this.LIZLLL > 0) {
                        this.LIZIZ.get().LIZLLL(i2, str);
                        return;
                    }
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("mSubInfoCallBack is null, mEnableSub:");
                    sbLIZ2.append(this.LIZLLL);
                    C1471660oOq.LIZIZ("SubInfoCallbackAdapter", C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // com.ss.ttm.player.SubInfo
                public final void onSubSwitchCompleted(int i2, int i3) {
                    int i4 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("SubInfoCallbackAdapter", "onSubSwitchCompleted: deprecated API");
                }

                @Override // com.ss.ttm.player.SubInfo
                public final void onSubInfoCallback(int i2, int i3, String str) {
                    if (this.LIZIZ.get() != null && this.LIZLLL > 0) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("info", str);
                            jSONObject.put("pts", i3);
                            int i4 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("subtitle: callback: ");
                            sbLIZ2.append(str);
                            TTVideoEngineLog.d("SubInfoCallbackAdapter", C2188811AlT.LIZIZ(sbLIZ2));
                            this.LIZIZ.get().LIZ(i2, C786410Ut5.J3(jSONObject));
                            return;
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i5 = C2187451AjH.LIZ;
                            C1471660oOq.LIZIZ("SubInfoCallbackAdapter", "put content field failed");
                            return;
                        }
                    }
                    int i6 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("SubInfoCallbackAdapter", "mSubInfoCallBack is null");
                }
            };
            this.N0 = r2;
            r2.LIZIZ = new WeakReference<>(c1468920oKQ);
            C1468890oKN c1468890oKN = this.N0;
            c1468890oKN.LIZLLL = this.n3;
            if (this.M5 != 0 && this.o3 > 0 && (interfaceC1467950oIr = this.LJIIIIZZ) != null && (tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr).LIZ) != null) {
                tTPlayerClient.setSubInfo(c1468890oKN);
            }
        }
    }

    public final void LLLLZ(SurfaceHolder surfaceHolder) {
        this.i6 = 0;
        LLLLZI(surfaceHolder, false);
    }

    public final void LLLLZIL(Surface surface) {
        boolean z;
        if (this.i6 == 2 && surface == null) {
            return;
        }
        InterfaceC1467950oIr interfaceC1467950oIr = this.A1;
        if (interfaceC1467950oIr == null) {
            interfaceC1467950oIr = this.LJIIIIZZ;
        }
        if (this.LLLLLLLLLL > 0 && surface != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) x6;
            if (concurrentHashMap.get(surface) != null && ((Boolean) concurrentHashMap.get(surface)).booleanValue()) {
                this.LLII = 5;
                InterfaceC1467950oIr interfaceC1467950oIr2 = this.LJIIIIZZ;
                if (interfaceC1467950oIr2 != null) {
                    if (this.X5 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((C1470430oMr) interfaceC1467950oIr2).LIZJ(56, C1467570oIF.LIZ(5, z));
                }
            }
        }
        if (interfaceC1467950oIr != null) {
            LJJLIIIJL(0, surface);
            if (this.LLLLLLLLLL > 0 && surface != null) {
                this.s4 = surface;
            }
        }
    }

    public final void LLLLZLL(Surface surface) {
        LJLLLLLL(this.L3, surface, false);
    }

    public final void LLLLZLLIL(String str) {
        this.q = str;
        IntertrustDrmHelper intertrustDrmHelper = this.E3;
        if (intertrustDrmHelper != null) {
            intertrustDrmHelper.LIZJ(str);
        }
    }

    public final void LLLLZLLLI(Map<String, String> map) {
        this.LLLZIL.LIZJ.Q1 = map;
    }

    @Override // X.InterfaceC1467390oHx
    public void setLooping(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLooping:");
        sbLIZ.append(z);
        C1471660oOq.LIZJ("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJJ = z;
        if (this.LJIIIIZZ != null && (this.LIZLLL != 1 || !LJJIJIIJIL())) {
            ((C1470430oMr) this.LJIIIIZZ).setLooping(this.LJJJ);
        }
        this.LLLZIL.LJJIJ = z;
    }

    @Override // X.InterfaceC1467390oHx
    public void setSurface(Surface surface) {
        if (surface == null) {
            this.E0 = System.currentTimeMillis();
        }
        this.i6 = 0;
        LJJLIIIJLLLLLLLZ(surface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1467390oHx
    public void LIZ(int i, String str) {
        TextureView textureViewLIZJ;
        int i2;
        int i3;
        int i4 = 0;
        switch (i) {
            case 531:
                this.v = str;
                break;
            case 532:
                this.s = str;
                break;
            case 546:
                this.t = str;
                break;
            case 547:
                this.u = str;
                break;
            case 549:
                this.w = str;
                break;
            case 659:
                this.Z1 = str;
                break;
            case 715:
                this.LLLZIL.LIZ(113, str);
                break;
            case 957:
                if (!this.R3.contains(str)) {
                    this.R3.add(str);
                }
                break;
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                ((HashSet) this.LJLJI).add(Integer.valueOf(i));
                this.LJLLJ = str;
                break;
            case 1205:
                C1468160oJC c1468160oJC = this.LLLZIL;
                if (c1468160oJC != null) {
                    c1468160oJC.LIZ(128, str);
                    if ("get existing from EnginePool".equals(str) || "new by EnginePool".equals(str)) {
                        this.LLLZIL.LJJIII(1, "from_engpool");
                    }
                }
                break;
            case 1227:
                C1467490oI7 c1467490oI7 = this.K5;
                if (c1467490oI7 != null && c1467490oI7.LIZJ != 1) {
                    if (TextUtils.isEmpty(str)) {
                        int i5 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("this:");
                        sbLIZ.append(c1467490oI7);
                        sbLIZ.append(",vmaf string is null");
                        TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ));
                        c1467490oI7.LIZJ = 0;
                    } else {
                        if (str.contains("v2.0")) {
                            c1467490oI7.LIZIZ = new InterfaceC1467500oI8() { // from class: X.0oKa
                                public HashMap<EnumC1469010oKZ, Double> LIZ;
                                public HashMap<EnumC1469010oKZ, Double> LIZIZ;

                                @Override // X.InterfaceC1467500oI8
                                public final /* synthetic */ double LIZIZ(HashMap map) {
                                    return C2638010i.LIZ(map);
                                }

                                @Override // X.InterfaceC1467500oI8
                                public final int LIZ(String str2) {
                                    HashMap<EnumC1469010oKZ, Double> map;
                                    if (TextUtils.isEmpty(str2)) {
                                        return -1;
                                    }
                                    try {
                                        JSONObject jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject("v2.0");
                                        if (jSONObjectOptJSONObject != null) {
                                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("ori");
                                            if (jSONObjectOptJSONObject2 != null) {
                                                this.LIZ = new HashMap<>();
                                                Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    String next = itKeys.next();
                                                    this.LIZ.put(EnumC1469010oKZ.LIZJ(next), Double.valueOf(jSONObjectOptJSONObject2.optDouble(next)));
                                                }
                                            }
                                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("srv1");
                                            if (jSONObjectOptJSONObject3 != null) {
                                                this.LIZIZ = new HashMap<>();
                                                Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                                                while (itKeys2.hasNext()) {
                                                    String next2 = itKeys2.next();
                                                    this.LIZIZ.put(EnumC1469010oKZ.LIZJ(next2), Double.valueOf(jSONObjectOptJSONObject3.optDouble(next2)));
                                                }
                                            }
                                        }
                                        HashMap<EnumC1469010oKZ, Double> map2 = this.LIZ;
                                        if (map2 == null || map2.isEmpty() || (map = this.LIZIZ) == null || map.isEmpty()) {
                                            return -1;
                                        }
                                        return 0;
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        int i6 = C2187451AjH.LIZ;
                                        C1471660oOq.LIZIZ("VodQualityHelper", e.toString());
                                        return -1;
                                    }
                                }

                                @Override // X.InterfaceC1467500oI8
                                public final double LIZJ(int i6, int i7) {
                                    HashMap<EnumC1469010oKZ, Double> map = this.LIZ;
                                    if (map == null || map.isEmpty()) {
                                        return 0.0d;
                                    }
                                    int i8 = i6 * i7;
                                    EnumC1469010oKZ enumC1469010oKZ = EnumC1469010oKZ.LLILZLL;
                                    int iAbs = Integer.MAX_VALUE;
                                    for (EnumC1469010oKZ enumC1469010oKZ2 : C1467490oI7.LJIIJ) {
                                        int i9 = i8 - (enumC1469010oKZ2.LLILLL * enumC1469010oKZ2.LLILLJJLI);
                                        if (Math.abs(i9) < iAbs) {
                                            iAbs = Math.abs(i9);
                                            enumC1469010oKZ = enumC1469010oKZ2;
                                        }
                                    }
                                    if (Math.abs((enumC1469010oKZ.LLILLL * enumC1469010oKZ.LLILLJJLI) - i8) <= ((double) (enumC1469010oKZ.LLILLL * enumC1469010oKZ.LLILLJJLI)) * 0.1d) {
                                        for (EnumC1469010oKZ enumC1469010oKZ3 : map.keySet()) {
                                            if (enumC1469010oKZ3.LL.equals(enumC1469010oKZ.LL)) {
                                                Double d = map.get(enumC1469010oKZ3);
                                                if (d == null) {
                                                    return 0.0d;
                                                }
                                                return d.doubleValue();
                                            }
                                        }
                                    }
                                    if (map.size() == 1) {
                                        return ((Double[]) map.values().toArray(new Double[0]))[0].doubleValue();
                                    }
                                    ArrayList arrayList = new ArrayList(map.entrySet());
                                    Collections.sort(arrayList, new AComparatorS42S0000000_23(11));
                                    EnumC1469010oKZ enumC1469010oKZ4 = (EnumC1469010oKZ) ((Map.Entry) ListProtector.get(arrayList, 0)).getKey();
                                    int i10 = enumC1469010oKZ4.LLILLL * enumC1469010oKZ4.LLILLJJLI;
                                    double dDoubleValue = ((Double) ((Map.Entry) ListProtector.get(arrayList, 0)).getValue()).doubleValue();
                                    EnumC1469010oKZ enumC1469010oKZ5 = (EnumC1469010oKZ) ((Map.Entry) ListProtector.get(arrayList, arrayList.size() - 1)).getKey();
                                    int i11 = enumC1469010oKZ5.LLILLL * enumC1469010oKZ5.LLILLJJLI;
                                    double dDoubleValue2 = ((Double) ((Map.Entry) ListProtector.get(arrayList, arrayList.size() - 1)).getValue()).doubleValue();
                                    double d2 = (enumC1469010oKZ.LLILLL * enumC1469010oKZ.LLILLJJLI) - i10;
                                    return dDoubleValue + (((dDoubleValue2 * d2) - (d2 * dDoubleValue)) / ((double) (i11 - i10)));
                                }
                            };
                            c1467490oI7.LJIIIZ = 2;
                        } else if (str.contains("v1.0")) {
                            c1467490oI7.LIZIZ = new InterfaceC1467500oI8() { // from class: X.0oKb
                                public HashMap<EnumC1469010oKZ, Double> LIZ;

                                @Override // X.InterfaceC1467500oI8
                                public final /* synthetic */ double LIZIZ(HashMap map) {
                                    return C2638010i.LIZ(map);
                                }

                                @Override // X.InterfaceC1467500oI8
                                public final int LIZ(String str2) {
                                    JSONObject jSONObjectOptJSONObject;
                                    if (TextUtils.isEmpty(str2)) {
                                        return -1;
                                    }
                                    try {
                                        JSONObject jSONObjectOptJSONObject2 = new JSONObject(str2).optJSONObject("v1.0");
                                        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("ori")) != null) {
                                            this.LIZ = new HashMap<>();
                                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                            while (itKeys.hasNext()) {
                                                String next = itKeys.next();
                                                this.LIZ.put(EnumC1469010oKZ.LIZJ(next), Double.valueOf(jSONObjectOptJSONObject.optDouble(next)));
                                            }
                                        }
                                        HashMap<EnumC1469010oKZ, Double> map = this.LIZ;
                                        if (map == null || map.isEmpty()) {
                                            return -1;
                                        }
                                        return 0;
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        int i6 = C2187451AjH.LIZ;
                                        C1471660oOq.LIZIZ("VodQualityHelper", e.toString());
                                        return -1;
                                    }
                                }

                                @Override // X.InterfaceC1467500oI8
                                public final double LIZJ(int i6, int i7) {
                                    if (this.LIZ == null) {
                                        return 0.0d;
                                    }
                                    int i8 = i6 * i7;
                                    EnumC1469010oKZ enumC1469010oKZ = EnumC1469010oKZ.LLILZLL;
                                    int iAbs = Integer.MAX_VALUE;
                                    for (EnumC1469010oKZ enumC1469010oKZ2 : C1467490oI7.LJIIJ) {
                                        int i9 = i8 - (enumC1469010oKZ2.LLILLL * enumC1469010oKZ2.LLILLJJLI);
                                        if (Math.abs(i9) < iAbs) {
                                            iAbs = Math.abs(i9);
                                            enumC1469010oKZ = enumC1469010oKZ2;
                                        }
                                    }
                                    if (Math.abs((enumC1469010oKZ.LLILLL * enumC1469010oKZ.LLILLJJLI) - i8) <= ((double) (enumC1469010oKZ.LLILLL * enumC1469010oKZ.LLILLJJLI)) * 0.1d) {
                                        for (EnumC1469010oKZ enumC1469010oKZ3 : this.LIZ.keySet()) {
                                            if (enumC1469010oKZ3.LL.equals(enumC1469010oKZ.LL)) {
                                                Double d = this.LIZ.get(enumC1469010oKZ3);
                                                if (d == null) {
                                                    return 0.0d;
                                                }
                                                return d.doubleValue();
                                            }
                                        }
                                    }
                                    if (this.LIZ.size() == 1) {
                                        return ((Double[]) this.LIZ.values().toArray(new Double[0]))[0].doubleValue();
                                    }
                                    ArrayList arrayList = new ArrayList(this.LIZ.entrySet());
                                    Collections.sort(arrayList, new AComparatorS42S0000000_23(10));
                                    EnumC1469010oKZ enumC1469010oKZ4 = (EnumC1469010oKZ) ((Map.Entry) ListProtector.get(arrayList, 0)).getKey();
                                    int i10 = enumC1469010oKZ4.LLILLL * enumC1469010oKZ4.LLILLJJLI;
                                    double dDoubleValue = ((Double) ((Map.Entry) ListProtector.get(arrayList, 0)).getValue()).doubleValue();
                                    EnumC1469010oKZ enumC1469010oKZ5 = (EnumC1469010oKZ) ((Map.Entry) ListProtector.get(arrayList, arrayList.size() - 1)).getKey();
                                    int i11 = enumC1469010oKZ5.LLILLL * enumC1469010oKZ5.LLILLJJLI;
                                    double dDoubleValue2 = ((Double) ((Map.Entry) ListProtector.get(arrayList, arrayList.size() - 1)).getValue()).doubleValue();
                                    double d2 = (enumC1469010oKZ.LLILLL * enumC1469010oKZ.LLILLJJLI) - i10;
                                    return dDoubleValue + (((dDoubleValue2 * d2) - (d2 * dDoubleValue)) / ((double) (i11 - i10)));
                                }
                            };
                            c1467490oI7.LJIIIZ = 1;
                        }
                        InterfaceC1467500oI8 interfaceC1467500oI8 = c1467490oI7.LIZIZ;
                        if (interfaceC1467500oI8 == null) {
                            int i6 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("this:");
                            sbLIZ2.append(c1467490oI7);
                            sbLIZ2.append(", no match algorithm");
                            TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            c1467490oI7.LIZJ = 0;
                        } else if (interfaceC1467500oI8.LIZ(str) < 0) {
                            c1467490oI7.LIZJ = 0;
                            int i7 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("this:");
                            sbLIZ3.append(c1467490oI7);
                            sbLIZ3.append(",algorithm set failed");
                            TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ3));
                        } else {
                            c1467490oI7.LIZJ = 1;
                            c1467490oI7.LJII = str;
                            int i8 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("this:");
                            sbLIZ4.append(c1467490oI7);
                            sbLIZ4.append(",set vod quality inputs, vmaf = ");
                            sbLIZ4.append(str);
                            TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                }
                break;
            case 1283:
                C1468160oJC c1468160oJC2 = this.LLLZIL;
                if (c1468160oJC2 != null) {
                    c1468160oJC2.LIZ(225, str);
                }
                break;
            case 1410:
                this.LJL = str;
                break;
            case 1411:
                this.LJLI = str;
                break;
            case 1412:
                this.LJLIIIL = str;
                break;
            case 1416:
                C1468160oJC c1468160oJC3 = this.LLLZIL;
                if (c1468160oJC3 != null) {
                    c1468160oJC3.LIZ(210, str);
                }
                break;
            case 1417:
                C1468160oJC c1468160oJC4 = this.LLLZIL;
                if (c1468160oJC4 != null) {
                    c1468160oJC4.LIZ(211, str);
                }
                break;
            case 1419:
                if (!this.U5) {
                    InterfaceC1467980oIu interfaceC1467980oIu = this.LLLZ;
                    if (interfaceC1467980oIu != null) {
                        C1472250oPn c1472250oPn = (C1472250oPn) interfaceC1467980oIu;
                        if (((Boolean) C1474810oTv.T2.getValue()).booleanValue()) {
                            C1475000oUE.LIZLLL.execute(new RunnableC1469690oLf(c1472250oPn));
                        }
                    }
                    if (this.LLLZ != null && C1474810oTv.LJJJJLI()) {
                        C1472250oPn c1472250oPn2 = (C1472250oPn) this.LLLZ;
                        int[] iArr = new int[6];
                        Surface surface = c1472250oPn2.LLJILJIL;
                        Surface surface2 = c1472250oPn2.LLJIJIL;
                        if (surface != null) {
                            SurfaceView surfaceViewLIZIZ = C1471640oOo.LIZIZ(surface);
                            if (surfaceViewLIZIZ != null) {
                                int[] iArr2 = new int[2];
                                surfaceViewLIZIZ.getLocationOnScreen(iArr2);
                                iArr[0] = iArr2[0];
                                iArr[1] = iArr2[1];
                                iArr[2] = surfaceViewLIZIZ.getWidth();
                                iArr[3] = surfaceViewLIZIZ.getHeight();
                                if (surfaceViewLIZIZ.getVisibility() == 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                iArr[4] = i3;
                                iArr[5] = surface.isValid() ? 1 : 0;
                            }
                        } else if (surface2 != null && (textureViewLIZJ = C1471640oOo.LIZJ(surface2)) != null) {
                            int[] iArr3 = new int[2];
                            textureViewLIZJ.getLocationOnScreen(iArr3);
                            iArr[0] = iArr3[0];
                            iArr[1] = iArr3[1];
                            iArr[2] = textureViewLIZJ.getWidth();
                            iArr[3] = textureViewLIZJ.getHeight();
                            if (textureViewLIZJ.getVisibility() == 0) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            iArr[4] = i2;
                            iArr[5] = surface2.isValid() ? 1 : 0;
                        }
                        String strLIZIZ = "";
                        do {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(strLIZIZ);
                            sbLIZ5.append(iArr[i4]);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(strLIZIZ2);
                            sbLIZ6.append(";");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                            i4++;
                        } while (i4 < 6);
                        C1468160oJC c1468160oJC5 = this.LLLZIL;
                        if (c1468160oJC5 != null) {
                            c1468160oJC5.LIZ(114, strLIZIZ);
                        }
                    }
                    this.U5 = true;
                }
                break;
            case 1421:
                C1468160oJC c1468160oJC6 = this.LLLZIL;
                if (c1468160oJC6 != null) {
                    c1468160oJC6.LIZ(222, str);
                }
                break;
            case 1422:
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("effect_type");
                        if (jSONArrayOptJSONArray != null) {
                            StringBuilder sb = new StringBuilder();
                            for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                                sb.append(C786410Ut5.j4("%d,", new Object[]{Integer.valueOf(jSONArrayOptJSONArray.optInt(i9))}));
                            }
                            this.d6 = sb.toString();
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                break;
            case 1423:
                if (!TextUtils.isEmpty(str)) {
                    this.S1 = str;
                    try {
                        JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "v1");
                        this.a6 = jSONObject.optInt("score_spk");
                        this.Z5 = jSONObject.optInt("score");
                        this.c6 = (float) jSONObject.optDouble("score_spk");
                        this.b6 = (float) jSONObject.optDouble("score");
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                break;
            case 1426:
                this.O5 = str;
                break;
            case 1427:
                this.P5 = str;
                break;
            case 1429:
                C1468160oJC c1468160oJC7 = this.LLLZIL;
                if (c1468160oJC7 != null) {
                    c1468160oJC7.LIZ(249, str);
                }
                break;
            case 1432:
                C1468160oJC c1468160oJC8 = this.LLLZIL;
                if (c1468160oJC8 != null) {
                    c1468160oJC8.LIZ(254, str);
                }
                break;
            case 1502:
                C1468160oJC c1468160oJC9 = this.LLLZIL;
                if (c1468160oJC9 != null) {
                    c1468160oJC9.LIZ(231, str);
                }
                break;
            case 1805:
                this.N5 = str;
                break;
            case 4032:
                C1468160oJC c1468160oJC10 = this.LLLZIL;
                if (c1468160oJC10 != null) {
                    c1468160oJC10.LIZ(209, str);
                }
                break;
            case 4304:
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(C1309170kAl.LJ);
                sbLIZ7.append("_");
                sbLIZ7.append(str);
                this.W2 = C2188811AlT.LIZIZ(sbLIZ7);
                break;
            case 4305:
                C1468160oJC c1468160oJC11 = this.LLLZIL;
                if (c1468160oJC11 != null) {
                    c1468160oJC11.LJJZZIII(str);
                    this.S5 = str;
                }
                break;
            case 4312:
                C1468160oJC c1468160oJC12 = this.LLLZIL;
                if (c1468160oJC12 != null) {
                    c1468160oJC12.LJJLJLI(str);
                }
                break;
            case 4326:
                C1468160oJC c1468160oJC13 = this.LLLZIL;
                if (c1468160oJC13 != null) {
                    c1468160oJC13.LIZ(248, str);
                }
                break;
            default:
                if (i == 5000) {
                    InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
                    if (interfaceC1467950oIr != null && ((C1470430oMr) interfaceC1467950oIr).getPlayerType() == 5) {
                        ((C1470430oMr) this.LJIIIIZZ).LIZ(5000, str);
                    }
                    this.LJJLI = str;
                }
                break;
        }
        if (this.LJJZZIII) {
            LLIIIJ();
            C1467840oIg c1467840oIg = this.LJJLJLI;
            this.LJJLJ.LIZ(i, str);
            c1467840oIg.getClass();
            return;
        }
        if (C1467460oI4.LJIIIIZZ(i)) {
            ((ConcurrentHashMap) this.D5.LIZLLL).put(Integer.valueOf(i), str);
            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LJIIIIZZ;
            if (interfaceC1467950oIr2 != null) {
                ((C1470430oMr) interfaceC1467950oIr2).LIZ(i, str);
            }
        }
        if (i != 355) {
            if (i != 662) {
                if (i != 1505) {
                    if (i != 4327) {
                        if (i != 360) {
                            if (i == 361) {
                                this.LLLIIL = str;
                                return;
                            }
                            return;
                        }
                        this.LLLIIIL = str;
                        return;
                    }
                    this.k6 = str;
                    return;
                }
                this.r6 = str;
                InterfaceC1467950oIr interfaceC1467950oIr3 = this.LJIIIIZZ;
                if (interfaceC1467950oIr3 == null) {
                    return;
                }
                ((C1470430oMr) interfaceC1467950oIr3).LIZ(1979, str);
                return;
            }
            this.j0 = str;
            return;
        }
        this.LLLIIIIL = str;
        InterfaceC1467950oIr interfaceC1467950oIr4 = this.LJIIIIZZ;
        if (interfaceC1467950oIr4 == null) {
            return;
        }
        ((C1470430oMr) interfaceC1467950oIr4).LIZ(1158, str);
    }

    @Override // X.InterfaceC1467390oHx
    public void LIZIZ(int i, long j) {
        C1468160oJC c1468160oJC;
        if (i != 440) {
            if (i == 725 && (c1468160oJC = this.LLLZIL) != null) {
                c1468160oJC.LLLIIL = j;
            }
        } else if (j > 0) {
            NativeAudioProcessor nativeAudioProcessor = new NativeAudioProcessor();
            this.S = nativeAudioProcessor;
            nativeAudioProcessor.setNativeWrapper(j);
            InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
            if (interfaceC1467950oIr != null) {
                AudioProcessor audioProcessor = this.S;
                TTPlayerClient tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr).LIZ;
                if (tTPlayerClient != null) {
                    tTPlayerClient.setAudioProcessor(audioProcessor);
                }
            }
        }
        if (this.LJJZ) {
            LLIIIJ();
            C1467840oIg c1467840oIg = this.LJJLJLI;
            this.LJJLJ.LIZIZ(i, j);
            c1467840oIg.getClass();
            return;
        }
        if (C1467460oI4.LJIIIIZZ(i)) {
            ((ConcurrentHashMap) this.D5.LIZIZ).put(Integer.valueOf(i), Long.valueOf(j));
            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LJIIIIZZ;
            if (interfaceC1467950oIr2 != null) {
                ((C1470430oMr) interfaceC1467950oIr2).LIZIZ(i, j);
            }
        }
        if (i == 709) {
            this.A4 = j;
            InterfaceC1467950oIr interfaceC1467950oIr3 = this.LJIIIIZZ;
            if (interfaceC1467950oIr3 != null) {
                ((C1470430oMr) interfaceC1467950oIr3).LIZIZ(668, j);
            }
        }
    }

    @Override // X.InterfaceC1467390oHx
    public void LJIJJLI(int i, s0 s0Var) {
        String str;
        if (i - this.LJJIZ > 0) {
            str = "back";
        } else {
            str = "front";
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("stage", "seek_begin");
        map.put("action", str);
        C20511081t.LJ().LIZLLL(map);
        this.LJJIL = s0Var;
        if (this.LJIIIIZZ != null && this.LJLIIL.LJIIJ) {
            LLD(i, false);
        }
        LJLLI(i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:7:0x0015, B:15:0x0023, B:16:0x002e, B:11:0x001b, B:13:0x0021), top: B:29:0x0003 }] */
    @Override // X.InterfaceC1467390oHx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJ(int r5, com.ss.ttm.player.TraitObject r6) {
        /*
            r4 = this;
            X.0ja6 r3 = r4.U
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, com.ss.ttm.player.TraitObject> r1 = r3.LIZ     // Catch: java.lang.Throwable -> L42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L42
            com.ss.ttm.player.TraitObject r2 = (com.ss.ttm.player.TraitObject) r2     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L17
            if (r6 != 0) goto L23
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            goto L34
        L17:
            if (r2 == r6) goto L21
            if (r2 == 0) goto L23
            boolean r0 = r2.sameAs(r6)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
        L21:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            goto L34
        L23:
            java.util.Map<java.lang.Integer, com.ss.ttm.player.TraitObject> r1 = r3.LIZ     // Catch: java.lang.Throwable -> L42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L42
            r1.put(r0, r6)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L34
            r2.LIZ()
        L34:
            X.0oIr r0 = r4.LJIIIIZZ
            if (r0 == 0) goto L41
            X.0oMr r0 = (X.C1470430oMr) r0
            com.ss.ttm.player.TTPlayerClient r0 = r0.LIZ
            if (r0 == 0) goto L41
            r0.setTraitObject(r5, r6)
        L41:
            return
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LJJ(int, com.ss.ttm.player.TraitObject):void");
    }

    @Override // X.InterfaceC1467390oHx
    public void LJJI(int i, String str) {
        if (this.LJIL.LIZLLL()) {
            C1467550oID c1467550oID = (C1467550oID) this.LJIL;
            c1467550oID.LJIIL = i;
            c1467550oID.LJIIJJI = str;
            C1468160oJC c1468160oJC = this.LLLZIL;
            c1468160oJC.LJJJJLL = i;
            c1468160oJC.LJJJJZ = str;
        }
    }

    @Override // X.InterfaceC1467390oHx
    public void LJJIFFI(int i, boolean z) {
        InterfaceC1467950oIr interfaceC1467950oIr = this.A1;
        if (interfaceC1467950oIr == null) {
            interfaceC1467950oIr = this.LJIIIIZZ;
        }
        this.LJJJJJL = z ? 1 : 0;
        if (C1467400oHy.LIZJ(this.LJIL) != null) {
            i = -1;
        }
        this.LJJJJJ = i;
        if (interfaceC1467950oIr != null && this.LJLIIL.LIZLLL == 1) {
            C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
            c1470430oMr.LIZJ(181, this.LJJJJJL);
            c1470430oMr.LIZJ(182, this.LJJJJJ);
            C1468160oJC c1468160oJC = this.LLLZIL;
            int i2 = this.LJJJJJL;
            int i3 = this.LJJJJJ;
            c1468160oJC.LJIILIIL = i2;
            c1468160oJC.LJJJJ = i3;
        }
    }

    @Override // X.InterfaceC1467390oHx
    public void LJJIII(String str, String str2) {
        Map<String, String> map;
        if (!TextUtils.isEmpty(str) && (map = this.LLLLLLZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, 1).toUpperCase());
            sbLIZ.append(str.substring(1));
            map.put(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    @Override // X.AbstractC1467000oHK
    public final void LJJJJ(int i, int i2) {
        LLLIL(i, i2);
    }

    @Override // X.AbstractC1467000oHK
    public final void LJJJJIZL(int i, int i2) {
        this.f6.onVideoSizeChanged(i, i2);
        LLLIZZ(i, i2);
        if (!this.LLZZZZ && this.LJJIJL) {
            this.LJJIJL = false;
            C1468160oJC c1468160oJC = this.LLLZIL;
            c1468160oJC.LJJIJLIJ = i;
            c1468160oJC.LJJIL = i2;
        }
    }

    public final void LJJLIIIIJ(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        int i;
        if (this.X1 == 0) {
            if (enumC2281151EQn == EnumC2281151EQn.Auto) {
                i = 1;
            } else {
                i = 0;
            }
            LIZJ(494, i);
        }
        if (enumC2281151EQn != EnumC2281151EQn.Auto) {
            C1467070oHR c1467070oHR = this.LJLIIL;
            int i2 = c1467070oHR.LIZIZ;
            if (i2 != 0 && i2 != 1 && !c1467070oHR.LJIILJJIL) {
                if (i2 == 3) {
                    LLILL(enumC2281151EQn, map);
                    return;
                }
                return;
            }
            this.LLZILL = enumC2281151EQn;
            this.LJIL.LIZIZ(enumC2281151EQn);
            this.LJIL.LJ(map);
            if (this.LJIL.LIZ() || this.LJIL.LJI()) {
                return;
            }
            this.LLLZIL.LJJIIZ(LJLJLJ(enumC2281151EQn), LJLJLJ(enumC2281151EQn));
        }
    }

    public final void LJJLIIIJL(int i, Surface surface) {
        InterfaceC1467950oIr interfaceC1467950oIr = this.A1;
        if (interfaceC1467950oIr != null || (interfaceC1467950oIr = this.LJIIIIZZ) != null) {
            if (surface == null) {
                InterfaceC1467090oHT interfaceC1467090oHT = this.LJII;
                if (interfaceC1467090oHT != null) {
                    interfaceC1467090oHT.setSurface(null);
                }
                TTPlayerClient tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr).LIZ;
                if (tTPlayerClient != null) {
                    tTPlayerClient.LLJJIII.lock();
                    try {
                        if (tTPlayerClient.LJJIJIIJIL()) {
                            tTPlayerClient.LLJJJ.LJI();
                        }
                        tTPlayerClient.LLJJIII.unlock();
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        tTPlayerClient.LLJJIII.unlock();
                        throw th;
                    }
                }
                return;
            }
            if (i == 1) {
                InterfaceC1467090oHT interfaceC1467090oHT2 = this.LJII;
                if (interfaceC1467090oHT2 != null) {
                    interfaceC1467090oHT2.setSurface(surface);
                }
                this.LLLZIL.LJLLLL(surface.toString());
                return;
            }
            InterfaceC1467090oHT interfaceC1467090oHT3 = this.LJII;
            if (interfaceC1467090oHT3 != null) {
                interfaceC1467090oHT3.setSurface(surface);
            }
            this.LLLZIL.LJLLLL(surface.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    public final boolean LJJLL(C1474520oTS c1474520oTS, InterfaceC1467050oHP interfaceC1467050oHP) {
        if (c1474520oTS == null || interfaceC1467050oHP == null || this.Q > 0) {
            return false;
        }
        if (interfaceC1467050oHP.LJIILJJIL(220) > 0 && C1468480oJi.LIZ() && System.currentTimeMillis() - (interfaceC1467050oHP.LJIILJJIL(220) * 1000) > -30000) {
            return true;
        }
        if (c1474520oTS.LJIIIZ(30) <= 0 || !C1468480oJi.LIZ() || System.currentTimeMillis() - (c1474520oTS.LJIIIZ(30) * 1000) <= -30000) {
            return false;
        }
        return true;
    }

    public final void LJLJJI(String str, Map map) {
        if (C1472750oQb.LJ && C1150504el.LIZ().LJII) {
            C0X35.LJIIJJI("player_prerender_dataprocesss_to_play", true);
            C0X35.LIZ("player_prerender_play_duration", true);
            C1472750oQb.LJ = false;
        }
        LLIIIZ(str, map);
    }

    public final void LJLLI(int i, boolean z) {
        int iLJJLJ;
        C1468230oJJ c1468230oJJ;
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null && this.LJLIIL.LJIIJ) {
            if (z) {
                iLJJLJ = this.LJJIZ;
            } else {
                iLJJLJ = LJJLJ();
            }
            this.LJLIIL.LJIIL = true;
            this.LJJIJLIJ = SystemClock.currentThreadTimeMillis();
            this.LJJIZ = i;
            this.f6.LJIILL(i);
            if (this.LLLILZJ != 0 && LLJJJJJIL()) {
                int i2 = this.LLLILZJ;
                TTPlayerClient tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr).LIZ;
                if (tTPlayerClient != null) {
                    tTPlayerClient.seekTo(i, i2);
                }
            } else {
                ((C1470430oMr) interfaceC1467950oIr).seekTo(i);
            }
            this.f6.LJIILIIL(i);
            C1468160oJC c1468160oJC = this.LLLZIL;
            if (!c1468160oJC.LJIIL) {
                if (!z) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (c1468160oJC.LJJLIIIIJ == 3) {
                        c1468160oJC.LIZLLL.LIZIZ("seek");
                        c1468160oJC.LIZJ.LLJJLIIIJLLLLLLLZ = jCurrentTimeMillis;
                    }
                    if (c1468160oJC.LJJLIIIIJ == 4 && (c1468230oJJ = c1468160oJC.LJ) != null) {
                        c1468230oJJ.LIZ(0, "seek");
                    }
                    int i3 = c1468160oJC.LJJJLIIL + 1;
                    c1468160oJC.LJJJLIIL = i3;
                    c1468160oJC.LLFF = i3;
                    c1468160oJC.LJJLIIIIJ = 4;
                    C1468230oJJ c1468230oJJ2 = c1468160oJC.LJ;
                    if (c1468230oJJ2 != null) {
                        int i4 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("brian beginSeek from ");
                        sbLIZ.append(iLJJLJ);
                        sbLIZ.append(" to ");
                        sbLIZ.append(i);
                        TTVideoEngineLog.d("VideoEventOneOpera", C2188811AlT.LIZIZ(sbLIZ));
                        c1468230oJJ2.LIZJ.LJFF = System.currentTimeMillis();
                        C1468340oJU c1468340oJU = c1468230oJJ2.LIZJ;
                        c1468340oJU.LIZ = "seek";
                        c1468340oJU.LIZIZ = Integer.toString(iLJJLJ);
                        c1468230oJJ2.LIZJ.LIZJ = Integer.toString(i);
                        C1468340oJU c1468340oJU2 = c1468230oJJ2.LIZJ;
                        c1468340oJU2.LIZLLL = 0L;
                        c1468340oJU2.LJIILIIL = i3;
                        C1468180oJE c1468180oJE = c1468230oJJ2.LIZ;
                        if (c1468180oJE != null) {
                            c1468340oJU2.LJIILJJIL = c1468180oJE.LJJJ;
                            c1468340oJU2.LJIILLIIL = c1468180oJE.LJJJI;
                            InterfaceC1468020oIy interfaceC1468020oIy = c1468180oJE.LIZ;
                            if (interfaceC1468020oIy != null) {
                                c1468340oJU2.LJIIJJI = ((C1467030oHN) interfaceC1468020oIy).LIZLLL(105);
                                c1468230oJJ2.LIZJ.LJIIL = ((C1467030oHN) c1468230oJJ2.LIZ.LIZ).LIZLLL(104);
                            }
                        }
                        C1468230oJJ c1468230oJJ3 = c1468160oJC.LJ;
                        C1468170oJD c1468170oJD = c1468160oJC.LIZJ;
                        c1468230oJJ3.LIZLLL = c1468170oJD.LLJJL;
                        c1468230oJJ3.LJ = c1468170oJD.LLJJLIIIJLLLLLLLZ;
                    }
                    c1468160oJC.LJJJZ = jCurrentTimeMillis;
                    C1468170oJD c1468170oJD2 = c1468160oJC.LIZJ;
                    if (c1468170oJD2 != null) {
                        c1468170oJD2.LLJJJJJIL = jCurrentTimeMillis;
                        c1468170oJD2.LLJLILLLLZIIL = i;
                    }
                    c1468160oJC.LJJJZ = SystemClock.elapsedRealtime();
                    if (c1468160oJC.LLJLIL) {
                        C1467110oHV c1467110oHV = c1468160oJC.LJFF;
                        if (c1467110oHV != null) {
                            c1467110oHV.LIZ(iLJJLJ, "seek");
                        }
                        c1468160oJC.LLJLIL = false;
                    }
                }
                c1468160oJC.LJJ(-2002, true);
                return;
            }
            return;
        }
        LJLL(false);
    }

    public final void LJLLJ(String str, Map<String, String> map) {
        String str2;
        String strLJJLIL = LJJLIL(str, null, map);
        if (this.LJLIIL.LJIILLIIL && !TextUtils.isEmpty(strLJJLIL) && !strLJJLIL.contains("http://127.0.0.1")) {
            strLJJLIL = strLJJLIL.replaceAll("http:", "https:");
        }
        C1468160oJC c1468160oJC = this.LLLZIL;
        if (c1468160oJC != null) {
            c1468160oJC.LJJIJIIJIL = this.g6.LJIL(301);
        }
        if (!this.LJJIIJ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LLLZIL != null) {
                if (this.x4 > 0 && !TextUtils.isEmpty(this.W2)) {
                    this.LLLZIL.LJZL(this.W2);
                }
                this.LJLIIL.LJIL = this.LLLZIL.LJJJI();
            } else {
                C1467070oHR c1467070oHR = this.LJLIIL;
                String str3 = C1309170kAl.LJ;
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(str3)) {
                    sb.append(str3);
                    sb.append("T");
                }
                sb.append(jCurrentTimeMillis);
                sb.append("T");
                sb.append(Integer.toString((int) (Math.random() * 65535.0d)));
                c1467070oHR.LJIL = sb.toString();
            }
            if (!TextUtils.isEmpty(this.LJLIIL.LJIL)) {
                map.put("X-Tt-Traceid", this.LJLIIL.LJIL);
                ((ConcurrentHashMap) this.LLLLLLZ).put("X-Tt-Traceid", this.LJLIIL.LJIL);
            }
            String str4 = this.g6.LJIIJJI;
            if (!TextUtils.isEmpty(str4)) {
                map.put("X-Tt-GroupId", str4);
                this.LLLZIL.LIZ(156, str4);
            }
            int i = this.x1;
            if (!this.LJIL.LIZ() && i != 0) {
                ((ConcurrentHashMap) this.LLLLLLZ).put("X-Tt-Fapi", String.valueOf(i));
                ((ConcurrentHashMap) this.LLLLLLZ).put("Engine-ID", String.valueOf(this.J3));
                this.LLLZIL.LIZJ(34, i);
            }
            int i2 = this.z3;
            int i3 = TTVideoEngine.LJI;
            if (i3 == 1) {
                ((ConcurrentHashMap) this.LLLLLLZ).put("X-SpeedTest-TimeInternal", String.valueOf(0));
            } else if (i3 == 0 && this.y3 > 0 && i2 > 0) {
                ((ConcurrentHashMap) this.LLLLLLZ).put("X-SpeedTest-TimeInternal", String.valueOf(i2));
            }
            Map<String, String> map2 = this.LLLLLLZ;
            if (TextUtils.isEmpty(this.LJ)) {
                str2 = "default";
            } else {
                str2 = this.LJ;
            }
            ((ConcurrentHashMap) map2).put("X-Tt-Tag", str2);
            int i4 = this.V4;
            if (i4 == 0 || i4 == 1) {
                ((ConcurrentHashMap) this.LLLLLLZ).put("X-Tt-VdpIo", String.valueOf(i4));
            }
            if (!TextUtils.isEmpty(this.LJFF)) {
                ((ConcurrentHashMap) this.LLLLLLZ).put("X-Tt-SubTag", this.LJFF);
            }
        }
        InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
        if (interfaceC1467950oIr != null && ((C1470430oMr) interfaceC1467950oIr).getPlayerType() == 0 && this.F) {
            map.clear();
        }
        this.LJII.setDataSource(C786410Ut5.N3(this.LJI), UriProtector.parse(strLJJLIL), map);
    }

    public final void LJZ(String str, Map<String, String> map) {
        C1467670oIP c1467670oIP = this.LJLIIL.LJJ;
        c1467670oIP.LIZ = str;
        c1467670oIP.LIZJ = false;
        boolean zLIZIZ = C1476290oWJ.LIZIZ(str);
        this.LJZ = zLIZIZ;
        this.LJLLL = zLIZIZ;
        getClass();
        int i = this.L;
        this.LLLZIL.LIZ(86, "localDNS");
        if (i != 1 && i == 0 && !this.LJIL.LJI()) {
            if (C08F5.LIZIZ(str)) {
                LJLJJI(str, map);
                return;
            }
            if (str.indexOf("http") == 0) {
                Map<String, C1467610oIJ> map2 = this.LLZZ;
                HashMap map3 = (HashMap) map2;
                map3.put(this.LJLIIL.LJJ.LIZ, new C1467610oIJ(this.H ? 1 : 0, this.c0 ? 1 : 0, "", "", "single"));
                LLFFF();
                LJLIIL(str);
                return;
            }
            LJLJJI(str, map);
            return;
        }
        LJLJJI(str, map);
    }

    public final void LJZI(int i, boolean z) {
        int currentPosition;
        C1467010oHL c1467010oHL;
        C1467010oHL c1467010oHL2;
        InterfaceC1467090oHT interfaceC1467090oHT;
        InterfaceC1467440oI2 interfaceC1467440oI2;
        String strSubstring;
        int size;
        int size2;
        String strLIZIZ;
        String strLIZIZ2;
        C1467010oHL c1467010oHL3;
        TTVideoEngineMonitor tTVideoEngineMonitor = this.LLLZLL;
        if (tTVideoEngineMonitor != null) {
            tTVideoEngineMonitor.engineStateChange(hashCode(), false);
        }
        if (this.H3 && (c1467010oHL3 = this.LJJJJIZL) != null) {
            c1467010oHL3.LIZLLL();
        }
        InterfaceC1467950oIr interfaceC1467950oIr = this.A1;
        if (interfaceC1467950oIr == null) {
            interfaceC1467950oIr = this.LJIIIIZZ;
        }
        int i2 = this.LJLIIL.LIZIZ;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            this.LJJII = true;
                            VideoInfoFetcher videoInfoFetcher = this.LLLZLZ;
                            if (videoInfoFetcher != null) {
                                videoInfoFetcher.LJI();
                            }
                            C1468530oJn c1468530oJn = this.LLLZZ;
                            if (c1468530oJn != null) {
                                c1468530oJn.LIZJ();
                            }
                        }
                    } else {
                        this.LJJII = true;
                    }
                } else {
                    this.LJJII = true;
                    C1468530oJn c1468530oJn2 = this.LLLZZ;
                    if (c1468530oJn2 != null) {
                        c1468530oJn2.LIZJ();
                    }
                }
            } else {
                this.LJJII = true;
                VideoInfoFetcher videoInfoFetcher2 = this.LLLZLZ;
                if (videoInfoFetcher2 != null) {
                    videoInfoFetcher2.LJI();
                }
            }
        } else {
            this.LJJII = true;
        }
        LLFF();
        InterfaceC1467950oIr interfaceC1467950oIr2 = this.LJIIIIZZ;
        if (interfaceC1467950oIr2 != null) {
            C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr2;
            int iLJI = c1470430oMr.LJI(49990, -1);
            int iLJI2 = c1470430oMr.LJI(49991, -1);
            if (iLJI != -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("49990:");
                sbLIZ.append(iLJI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = null;
            }
            if (iLJI2 != -1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("49991:");
                sbLIZ2.append(iLJI2);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ2 = null;
            }
            this.LLLZIL.LJLL(strLIZIZ, strLIZIZ2);
        }
        if (C1474810oTv.LJJJJLL() && ((Number) C1474810oTv.f6.getValue()).intValue() > 0) {
            int iLLILZLL = C1474810oTv.LLILZLL();
            int iLLIZ = C1474810oTv.LLIZ();
            ConfigCenter.LJI().LJIIIZ(2, 1, "");
            ConfigCenter.LJI().getClass();
            BaseConfigV2 baseConfigV2 = new BaseConfigV2(2, "", 1);
            if (iLLILZLL <= iLLIZ && iLLILZLL >= 0) {
                JSONObject jSONObject = new JSONObject();
                while (iLLILZLL <= iLLIZ) {
                    try {
                        int iLJIIIIZZ = baseConfigV2.LJIIIIZZ(iLLILZLL);
                        if (iLJIIIIZZ != 0) {
                            jSONObject.put(String.valueOf(iLLILZLL), iLJIIIIZZ);
                        }
                        iLLILZLL++;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (jSONObject.length() > 0) {
                    this.LLLZIL.LIZJ.o2 = C786410Ut5.J3(jSONObject);
                }
            }
        }
        if (((Boolean) C1474810oTv.l6.getValue()).booleanValue() && (interfaceC1467440oI2 = this.LJJLL) != null) {
            Map<Integer, C1467880oIk> mapLIZLLL = interfaceC1467440oI2.LIZLLL();
            if (mapLIZLLL != null && !mapLIZLLL.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<Integer> it2 = mapLIZLLL.keySet().iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    sb.append(',');
                }
                strSubstring = sb.substring(0, sb.length() - 1);
            } else {
                strSubstring = null;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("update empty config to logger, hash:");
            sbLIZ3.append(hashCode());
            sbLIZ3.append(", map size:");
            if (mapLIZLLL != null) {
                size = mapLIZLLL.size();
            } else {
                size = -1;
            }
            sbLIZ3.append(size);
            sbLIZ3.append(", item size:");
            if (this.LJJLL.LJI() != null) {
                size2 = this.LJJLL.LJI().size();
            } else {
                size2 = -1;
            }
            sbLIZ3.append(size2);
            C2188811AlT.LIZIZ(sbLIZ3);
            JSONObject jSONObject2 = new JSONObject();
            Map<Integer, C1467880oIk> mapLJI = this.LJJLL.LJI();
            int iIntValue = ((Number) C1474810oTv.m6.getValue()).intValue();
            int iIntValue2 = ((Number) C1474810oTv.n6.getValue()).intValue();
            if (iIntValue <= iIntValue2 && mapLJI != null && !mapLJI.isEmpty()) {
                try {
                    Iterator<Integer> it3 = mapLJI.keySet().iterator();
                    while (it3.hasNext()) {
                        int iIntValue3 = it3.next().intValue();
                        if (iIntValue3 >= iIntValue && iIntValue3 <= iIntValue2) {
                            jSONObject2.put(String.valueOf(iIntValue3), mapLJI.get(Integer.valueOf(iIntValue3)).LIZ);
                        }
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    int i3 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("TTVideoEngine", "fail to set ConfigItem to JSONObject");
                }
            }
            this.LLLZIL.LJJZZI(strSubstring, C786410Ut5.J3(jSONObject2));
            this.LJJLL.release();
        }
        this.LJJLL = null;
        if (interfaceC1467950oIr != null) {
            if (this.LIZLLL == 1) {
                ((C1470430oMr) interfaceC1467950oIr).LIZJ(42064, 0);
            }
            currentPosition = ((C1470430oMr) interfaceC1467950oIr).getCurrentPosition();
        } else {
            currentPosition = -2;
        }
        C1467860oIi c1467860oIi = new C1467860oIi();
        long j = currentPosition;
        c1467860oIi.LIZ = j;
        if (interfaceC1467950oIr != null && z) {
            C1470430oMr c1470430oMr2 = (C1470430oMr) interfaceC1467950oIr;
            if ((c1470430oMr2.getPlayerType() != 0 || (c1470430oMr2.getPlayerType() == 0 && this.LJJIIJ)) && (interfaceC1467090oHT = this.LJII) != null) {
                interfaceC1467090oHT.stop();
            }
        }
        if (!this.H3 && (c1467010oHL2 = this.LJJJJIZL) != null) {
            c1467010oHL2.LIZLLL();
        }
        IntertrustDrmHelper intertrustDrmHelper = this.E3;
        if (intertrustDrmHelper != null) {
            intertrustDrmHelper.LIZLLL();
        }
        if (this.LLLZIL != null) {
            if (interfaceC1467950oIr != null) {
                LLD(currentPosition, false);
                C1468160oJC c1468160oJC = this.LLLZIL;
                C1468170oJD c1468170oJD = c1468160oJC.LIZJ;
                if (c1468170oJD != null) {
                    c1468170oJD.LJLIIIL = j;
                }
                if (this.LJLIIL.LIZIZ == 3) {
                    c1468160oJC.LJIIIZ(((C1470430oMr) interfaceC1467950oIr).LJI(204, -1));
                }
            }
            if (this.LJIILL != 0 && (c1467010oHL = this.LJJJJIZL) != null) {
                this.LLLZIL.LIZJ.LLD = c1467010oHL.LIZ.LIZIZ();
                this.LLLZIL.LIZJ.LLF = this.LJJJJIZL.LIZIZ();
            }
            if (this.LJLLI > 0 && this.LJLJLLL == 1 && !this.LJLL.booleanValue() && this.d0 != null) {
                this.LJLL = Boolean.TRUE;
                C786410Ut5.LJLIIL(this.LJLLI, this.d0, new ARunnableS34S0101000_23(this, i, 11));
            } else {
                this.LLLZIL.LLII(i);
            }
        }
        LLLZIL(0, c1467860oIi);
        C1467070oHR c1467070oHR = this.LJLIIL;
        c1467070oHR.LJIILIIL = false;
        this.c = false;
        this.LLZ = -1L;
        this.LLLZZIL = -1L;
        c1467070oHR.LJIIIIZZ = -1L;
        this.d = false;
        this.LJJIJ = 0L;
        c1467070oHR.LJIJJ = false;
        c1467070oHR.LJIIL = false;
        this.G5 = false;
        if (i != 6) {
            SurfaceHolderCallbackC1467210oHf surfaceHolderCallbackC1467210oHf = this.LLLZI;
            if (surfaceHolderCallbackC1467210oHf != null) {
                SurfaceHolder surfaceHolder = this.LJIILIIL;
                if (surfaceHolder != null) {
                    surfaceHolder.removeCallback(surfaceHolderCallbackC1467210oHf);
                }
                this.LLLZI.LL.clear();
                this.LLLZI = null;
            }
            this.v4 = false;
            getClass();
        }
    }

    public final void LL(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        C1467010oHL c1467010oHL;
        int iLIZIZ;
        int iLJFF;
        EnumC2281151EQn currentResolution = this.LJIL.getCurrentResolution();
        Map<Integer, String> mapLJFF = this.LJIL.LJFF();
        if (currentResolution == enumC2281151EQn) {
            if (mapLJFF == null) {
                if (map == null) {
                    return;
                }
            } else if (mapLJFF.equals(map)) {
                return;
            }
        }
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (interfaceC1467050oHPLIZJ == null) {
            return;
        }
        if (currentResolution != enumC2281151EQn) {
            C1474520oTS c1474520oTSLJIJJLI = interfaceC1467050oHPLIZJ.LJIJJLI(enumC2281151EQn, interfaceC1467050oHPLIZJ.LJIIZILJ(7), map, false);
            C1474520oTS c1474520oTSLJIJJLI2 = interfaceC1467050oHPLIZJ.LJIJJLI(currentResolution, interfaceC1467050oHPLIZJ.LJIIZILJ(7), mapLJFF, false);
            if (c1474520oTSLJIJJLI2 != null && c1474520oTSLJIJJLI != null) {
                if (c1474520oTSLJIJJLI.LIZIZ(3) == c1474520oTSLJIJJLI2.LIZIZ(3)) {
                    LLLILZLLLI(interfaceC1467050oHPLIZJ.LJIIZILJ(7));
                }
            }
        }
        this.LLZILL = currentResolution;
        this.LLZLL = System.currentTimeMillis();
        this.LJIL.LIZIZ(enumC2281151EQn);
        this.LJIL.LJ(map);
        if (map != null) {
            Iterator<Map.Entry<Integer, String>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        boolean zLLJL = LLJL(interfaceC1467050oHPLIZJ);
        if (zLLJL && this.LJIILL != 2) {
            if (interfaceC1467050oHPLIZJ.LJIIL()) {
                if (map == null) {
                    map = new HashMap<>();
                }
                String str = this.LJLLJ;
                if (str.equals("bytevc2") && interfaceC1467050oHPLIZJ.LJJIFFI(228)) {
                    map.put(8, "bytevc2");
                } else if (str.equals("bytevc1") && interfaceC1467050oHPLIZJ.LJJIFFI(204)) {
                    map.put(8, "bytevc1");
                } else if (interfaceC1467050oHPLIZJ.LJJIFFI(203)) {
                    map.put(8, "h264");
                }
                C1474520oTS c1474520oTSLLFZ = LLFZ(currentResolution, interfaceC1467050oHPLIZJ.LJIIZILJ(7), map);
                if (c1474520oTSLLFZ != null) {
                    iLIZIZ = c1474520oTSLLFZ.LIZIZ(3);
                    iLJFF = c1474520oTSLLFZ.LJFF();
                } else {
                    iLIZIZ = 0;
                    iLJFF = 0;
                }
                if (this.LLLLZLL != null) {
                    ArrayList arrayList = new ArrayList();
                    if (interfaceC1467050oHPLIZJ.LJIIJ(EnumC1469940oM4.DASH)) {
                        String strLIZIZ = interfaceC1467050oHPLIZJ.LIZIZ();
                        if (!TextUtils.isEmpty(strLIZIZ) && strLIZIZ.equals("segment_base")) {
                            C1474520oTS c1474520oTSLLFZ2 = LLFZ(currentResolution, 0, map);
                            C1474520oTS c1474520oTSLLFZ3 = LLFZ(currentResolution, 1, map);
                            int i = this.LLLLLIL;
                            if (i != -1) {
                                c1474520oTSLLFZ3 = interfaceC1467050oHPLIZJ.LJIJI(i);
                            }
                            if (c1474520oTSLLFZ2 != null) {
                                arrayList.add(c1474520oTSLLFZ2);
                            }
                            if (c1474520oTSLLFZ3 != null) {
                                arrayList.add(c1474520oTSLLFZ3);
                            }
                        }
                    } else if (c1474520oTSLLFZ != null) {
                        arrayList.add(c1474520oTSLLFZ);
                    }
                    if (arrayList.size() > 0) {
                        C1467470oI5 c1467470oI5 = new C1467470oI5();
                        c1467470oI5.LIZ = "usingUrlInfos";
                        c1467470oI5.LIZIZ = arrayList;
                        LLLFF(c1467470oI5, true);
                    }
                }
            } else {
                iLIZIZ = 0;
                iLJFF = 0;
            }
            if (this.LJIIIIZZ != null && LJJIJIIJIL()) {
                this.LLLZIL.LLIIIZ(LJLJLJ(currentResolution), LJLJLJ(this.LLZILL), false);
                LLIIII(true);
                TTPlayerClient tTPlayerClient = ((C1470430oMr) this.LJIIIIZZ).LIZ;
                if (tTPlayerClient != null && tTPlayerClient.LLJJJ != null) {
                    tTPlayerClient.LLJJIII.lock();
                    try {
                        if (tTPlayerClient.LJJIJIIJIL()) {
                            tTPlayerClient.LLJJJ.LIZIZ.LJJJJ(iLIZIZ, iLJFF);
                        }
                        tTPlayerClient.LLJJIII.unlock();
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        tTPlayerClient.LLJJIII.unlock();
                        throw th;
                    }
                }
                return;
            }
        }
        if (!this.LLZZZZ) {
            this.LLZZZZ = true;
            this.LLLZIL.LLIIIZ(LJLJLJ(currentResolution), LJLJLJ(this.LLZILL), true);
            LLIIII(true);
            if (!zLLJL && (c1467010oHL = this.LJJJJIZL) != null) {
                c1467010oHL.LIZLLL();
            }
            this.LJJIZ = LJJLJ();
        }
        InterfaceC1467090oHT interfaceC1467090oHT = this.LJII;
        if (interfaceC1467090oHT != null) {
            interfaceC1467090oHT.pause();
        }
        LJLILLLLZI(interfaceC1467050oHPLIZJ);
    }

    public final void LLD(int i, boolean z) {
        if (this.t3 > 0 && this.s3 != i && i >= 0) {
            this.s3 = i;
            if (z) {
                LLLF(i);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0157 A[PHI: r14
      0x0157: PHI (r14v15 boolean) = (r14v12 boolean), (r14v16 boolean) binds: [B:92:0x0152, B:94:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015f A[PHI: r14
      0x015f: PHI (r14v13 boolean) = (r14v15 boolean), (r14v16 boolean) binds: [B:96:0x015d, B:94:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIZ(java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
            Method dump skipped, instruction units count: 3156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LLIIIZ(java.lang.String, java.util.Map):void");
    }

    public final void LLIIJI(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        if (enumC2281151EQn == null) {
            return;
        }
        LJJLIIIIJ(enumC2281151EQn, map);
    }

    public final void LLILII(SurfaceHolder surfaceHolder, boolean z) {
        C1467010oHL c1467010oHL;
        if (z && (c1467010oHL = this.LJJJJIZL) != null) {
            c1467010oHL.LIZLLL();
        }
        SurfaceHolder surfaceHolder2 = this.LJIILIIL;
        SurfaceHolderCallbackC1467210oHf surfaceHolderCallbackC1467210oHf = this.LLLZI;
        if (surfaceHolderCallbackC1467210oHf != null && surfaceHolder2 != null) {
            surfaceHolderCallbackC1467210oHf.LL.clear();
            surfaceHolder2.removeCallback(surfaceHolderCallbackC1467210oHf);
            this.LLLZI = null;
        }
        this.LJIILIIL = surfaceHolder;
        if (this.LJIILJJIL != 0) {
            InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
            if (interfaceC1467950oIr != null) {
                TTPlayerClient tTPlayerClient = ((C1470430oMr) interfaceC1467950oIr).LIZ;
                if (tTPlayerClient != null) {
                    tTPlayerClient.LJJJJJ(surfaceHolder);
                }
                if (surfaceHolder != null) {
                    this.LLLZIL.LJIILIIL(surfaceHolder.toString());
                    return;
                }
                return;
            }
            return;
        }
        if (surfaceHolder == null) {
            LLLLZIL(null);
            return;
        }
        Surface surface = surfaceHolder.getSurface();
        synchronized (this) {
            if (this.LLLZI == null) {
                SurfaceHolderCallbackC1467210oHf surfaceHolderCallbackC1467210oHf2 = new SurfaceHolderCallbackC1467210oHf(this.y5);
                this.LLLZI = surfaceHolderCallbackC1467210oHf2;
                surfaceHolder.addCallback(surfaceHolderCallbackC1467210oHf2);
            }
        }
        LLLLZIL(surface);
        if (surface == null) {
            return;
        }
        C1468160oJC c1468160oJC = this.LLLZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceHolderWithSurface@");
        sbLIZ.append(surface);
        c1468160oJC.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LLILL(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        LL(enumC2281151EQn, map);
    }

    public final String LLJ(String str, List list) {
        try {
            ArrayList<C1471830oP7> arrayList = (ArrayList) list;
            if (arrayList.size() <= 0) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (C1471830oP7 c1471830oP7 : arrayList) {
                if (c1471830oP7 != null) {
                    if (!TextUtils.isEmpty(c1471830oP7.LJIIIZ)) {
                        C1467080oHS c1467080oHS = this.g6;
                        String str2 = c1471830oP7.LJIIIZ;
                        long j = this.P;
                        String[] strArrLIZ = c1471830oP7.LIZ();
                        EnumC2281151EQn enumC2281151EQn = EnumC2281151EQn.Undefine;
                        String strLJJIFFI = c1467080oHS.LJJIFFI(LLJJIII(str2, str, j, strArrLIZ, enumC2281151EQn, null, null, null, null, 0L));
                        if (!TextUtils.isEmpty(strLJJIFFI)) {
                            c1471830oP7.LIZIZ = strLJJIFFI;
                            if (C1474810oTv.LLJZIJLIL()) {
                                if (c1471830oP7.LIZ().length >= 2) {
                                    String[] strArr = new String[c1471830oP7.LIZ().length - 1];
                                    System.arraycopy(c1471830oP7.LIZ(), 1, strArr, 0, c1471830oP7.LIZ().length - 1);
                                    String strLJJII = this.g6.LJJII(LLJJIII(c1471830oP7.LJIIIZ, str, this.P, strArr, enumC2281151EQn, null, null, null, null, 0L));
                                    if (!TextUtils.isEmpty(strLJJII)) {
                                        strLJJIFFI = strLJJII;
                                    }
                                    c1471830oP7.LIZJ = strLJJIFFI;
                                }
                            } else {
                                c1471830oP7.LIZJ = strLJJIFFI;
                            }
                        }
                    }
                    JSONObject jSONObjectLIZIZ = c1471830oP7.LIZIZ();
                    if (jSONObjectLIZIZ != null) {
                        int i = c1471830oP7.LIZ;
                        if (i == 0) {
                            jSONArray.put(jSONObjectLIZIZ);
                        } else if (i == 1) {
                            jSONArray2.put(jSONObjectLIZIZ);
                        }
                    }
                }
            }
            jSONObject.put("dynamic_video_list", jSONArray);
            jSONObject.put("dynamic_audio_list", jSONArray2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mem://bash/url_index:0/segment_format:2/");
            sbLIZ.append(jSONObject);
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public void LLLFF(C1467470oI5 c1467470oI5, boolean z) {
        InterfaceC1467780oIa interfaceC1467780oIa = this.LLLLZLL;
        if (interfaceC1467780oIa == null) {
            return;
        }
        interfaceC1467780oIa.LJJJIL(c1467470oI5);
    }

    public void LLLIL(int i, int i2) {
        this.LLLLLZL.LJJII(i, i2);
    }

    public void LLLIZZ(int i, int i2) {
        this.LLLLLZL.LJIIJJI(this.y5, i, i2);
    }

    public void LLLJIL(int i, EnumC2281151EQn enumC2281151EQn) {
        this.LLLLLZL.LJFF(i, enumC2281151EQn);
    }

    public final void LLLL(long j, String str) {
        if (this.LLLLZLL == null) {
            return;
        }
        C1467470oI5 c1467470oI5 = new C1467470oI5();
        c1467470oI5.LIZ = str;
        c1467470oI5.LJ = j;
        LLLFF(c1467470oI5, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0663 A[PHI: r0 r2
      0x0663: PHI (r0v43 X.0oTS) = (r0v18 X.0oTS), (r0v17 X.0oTS) binds: [B:169:0x0524, B:164:0x0519] A[DONT_GENERATE, DONT_INLINE]
      0x0663: PHI (r2v26 java.lang.String[]) = (r2v6 java.lang.String[]), (r2v5 java.lang.String[]) binds: [B:169:0x0524, B:164:0x0519] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09cc A[LOOP:3: B:427:0x09c9->B:429:0x09cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x055d A[EDGE_INSN: B:505:0x055d->B:187:0x055d BREAK  A[LOOP:5: B:177:0x053c->B:506:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:? A[LOOP:5: B:177:0x053c->B:506:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [int] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r46v0, types: [X.0oHJ, X.0oHK] */
    /* JADX WARN: Type inference failed for: r5v141, types: [X.0oJu] */
    /* JADX WARN: Type inference failed for: r5v204 */
    /* JADX WARN: Type inference failed for: r5v205 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r5v76, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v98 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLLII(X.InterfaceC1467050oHP r47, boolean r48) {
        /*
            Method dump skipped, instruction units count: 2694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LLLLII(X.0oHP, boolean):boolean");
    }

    public final void LLLLIIIILLL(String str, InterfaceC1467050oHP interfaceC1467050oHP) {
        String str2;
        String str3;
        int iLJI;
        boolean z;
        if (this.g6.LJIL(1150) != 0 && this.g6.LJIL(13001) <= 1) {
            C1469160oKo c1469160oKo = C790230UzF.LIZ;
            if ((!c1469160oKo.LJIIL) && (iLJI = ((C1470430oMr) this.LJIIIIZZ).LJI(903, -1)) != -1 && c1469160oKo.LIZJ().isLoadLibrarySucceed()) {
                c1469160oKo.LJIIL = true;
                if (c1469160oKo.LIZJ().iPlayerVersion() == iLJI) {
                    z = true;
                } else {
                    z = false;
                }
                c1469160oKo.LJIILIIL = z;
            }
            if (!c1469160oKo.LJIILIIL) {
                this.m6 = str;
                this.n6 = interfaceC1467050oHP;
                this.o6 = Boolean.TRUE;
                return;
            }
            String videoId = this.LJIL.getVideoId();
            JSONObject jSONObject = null;
            if (this.LJIL.LJI() && !TextUtils.isEmpty(this.LJIL.getUrl())) {
                if (((Boolean) C1474810oTv.b5.getValue()).booleanValue() && this.LJIL.getUrl().contains("feedCache/")) {
                    String url = this.LJIL.getUrl();
                    int iIndexOf = url.indexOf("feedCache/");
                    videoId = iIndexOf != -1 ? url.substring(iIndexOf + 10) : null;
                } else {
                    videoId = C2085308Ex.LIZ(this.LJIL.getUrl());
                }
            }
            if (this.g6.LJIL(13003) > 0) {
                String str4 = this.r;
                if (str4 != null) {
                    videoId = str4;
                }
                C1469160oKo.LIZ(videoId, "", this.LJLIIL.LJJIFFI, new String[]{str});
            }
            if (TextUtils.isEmpty(videoId)) {
                videoId = (String) ((ConcurrentHashMap) this.LJLIIL.LJJIFFI).get("vid");
            }
            this.LLLZIL.LIZ(154, videoId);
            if (videoId != null) {
                ((C1470430oMr) this.LJIIIIZZ).LIZ(901, videoId);
            }
            if (this.b4 > 0) {
                if (interfaceC1467050oHP != null) {
                    jSONObject = interfaceC1467050oHP.LJII();
                } else if (!((ConcurrentHashMap) this.LJLIIL.LJJIFFI).isEmpty()) {
                    jSONObject = new JSONObject(this.LJLIIL.LJJIFFI);
                }
                if (!c1469160oKo.LIZJ().checkMediaAdded(jSONObject) && jSONObject != null) {
                    try {
                        String strJ3 = C786410Ut5.J3(jSONObject);
                        if (strJ3 != null) {
                            C790230UzF.LIZ.LIZJ().addMedia(strJ3, null, null, false, true);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            ((C1470430oMr) this.LJIIIIZZ).LIZJ(904, this.X3);
            this.LLLZIL.LJJIII(Integer.valueOf(this.X3), "precise_cache");
            long jLJIIJ = ((C1470430oMr) this.LJIIIIZZ).LJIIJ(902, 0L);
            if (jLJIIJ == 0 || TextUtils.isEmpty(videoId)) {
                return;
            }
            if (this.x4 <= 0 || TextUtils.isEmpty(this.W2)) {
                str2 = this.LJLIIL.LJIL;
            } else {
                str2 = this.W2;
            }
            if (TextUtils.isEmpty(this.LJ)) {
                str3 = "default";
            } else {
                str3 = this.LJ;
            }
            C1469160oKo c1469160oKo2 = C790230UzF.LIZ;
            c1469160oKo2.LIZJ().createPlayer(jLJIIJ, videoId, str2, str3);
            c1469160oKo2.LIZJ().setPlayStringConfig(str2, 56006, this.LJL);
            c1469160oKo2.LIZJ().setPlayStringConfig(str2, 56007, this.LJLI);
            c1469160oKo2.LIZJ().setPlayStringConfig(str2, 56008, this.LJLIIIL);
            if (!this.LJJJJLI || this.g6.LJIL(13001) != 0) {
                return;
            }
            c1469160oKo2.LIZJ().makeCurrentPlayer(videoId);
            this.l6 = videoId;
        }
    }

    public final void LLLLLIL(String str, String str2) {
        List arrayList;
        this.Y2 = str;
        this.f172a3 = str2;
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LJLIIL.LJJIFFI;
            if (concurrentHashMap.containsKey("infos")) {
                arrayList = (List) concurrentHashMap.get("infos");
            } else {
                arrayList = new ArrayList();
            }
            HashMap map = new HashMap();
            map.put("file_hash", str2);
            if (!TextUtils.isEmpty(str)) {
                map.put("urls", new String[]{str});
            }
            map.put("media_type", "mask");
            arrayList.add(map);
            concurrentHashMap.put("infos", arrayList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("VCStrategy", th.toString());
        }
    }

    public final void LLLLLILLIL(int i, int i2) {
        if (i > 0 && i2 > 0) {
            Pair<Integer, Integer> pairLJIJJLI = this.g6.LJIJJLI(i, i2);
            this.f3 = ((Integer) pairLJIJJLI.first).intValue();
            this.g3 = ((Integer) pairLJIJJLI.second).intValue();
        }
    }

    public final void LLLLLJIL(EnumC1471520oOc enumC1471520oOc, Object obj) {
        C1468160oJC c1468160oJC = this.LLLZIL;
        if (c1468160oJC != null) {
            c1468160oJC.LJJLIIIJJI(enumC1471520oOc, obj);
        }
    }

    public final void LLLLLL(String str, String[] strArr) {
        String[] strArr2;
        InterfaceC1467290oHn interfaceC1467290oHn = this.LJIL;
        if (interfaceC1467290oHn.LIZ()) {
            strArr2 = ((C1467450oI3) interfaceC1467290oHn).LJ;
        } else {
            strArr2 = null;
        }
        if ((!Arrays.equals(strArr2, strArr)) && (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 1L) || this.LJJIIZI)) {
            LJJJLIIL();
            C1467070oHR c1467070oHR = this.LJLIIL;
            c1467070oHR.LIZIZ = 0;
            c1467070oHR.LJIIJJI = true;
            this.y = true;
            this.x = true;
            this.LJJII = false;
            this.LJJIZ = 0;
            this.LLZZZIL = null;
        }
        this.LJJIIZI = true;
        this.LJLIIL.LJIIJ = false;
        C1467450oI3 c1467450oI3 = new C1467450oI3(str, strArr);
        this.LJIL = c1467450oI3;
        this.LJLIIL.LJIIIZ = 0L;
        EnumC2281151EQn enumC2281151EQn = EnumC2281151EQn.Undefine;
        c1467450oI3.LIZJ = enumC2281151EQn;
        this.LLLZIL.LJJIIZ(LJLJLJ(enumC2281151EQn), "");
        this.LLLZIL.LJZ(1, "");
    }

    public final void LLLLLLLLL(float f, int i) {
        C1468160oJC c1468160oJC;
        if (i != 359) {
            if (i != 535) {
                if (i != 1228) {
                    if (i != 722) {
                        if (i == 723 && (c1468160oJC = this.LLLZIL) != null) {
                            c1468160oJC.LLLIIIIL = f;
                        }
                    } else {
                        C1468160oJC c1468160oJC2 = this.LLLZIL;
                        if (c1468160oJC2 != null) {
                            c1468160oJC2.LLFFF(f);
                        }
                    }
                } else {
                    C1467490oI7 c1467490oI7 = this.K5;
                    if (c1467490oI7 != null) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("this:");
                        sbLIZ.append(c1467490oI7);
                        sbLIZ.append(",set vqscore:");
                        sbLIZ.append(f);
                        TTVideoEngineLog.d("VodQualityHelper", C2188811AlT.LIZIZ(sbLIZ));
                        c1467490oI7.LJI = f;
                    }
                }
            } else {
                this.LLLZIL.LJLIIIL(f, 20);
            }
        } else {
            this.LLLLIILLL = f;
        }
        if (this.LJJZZI) {
            LLIIIJ();
            C1467840oIg c1467840oIg = this.LJJLJLI;
            this.LJJLJ.LJFF(f, i);
            c1467840oIg.getClass();
            return;
        }
        if (C1467460oI4.LJIIIIZZ(i)) {
            ((ConcurrentHashMap) this.D5.LIZJ).put(Integer.valueOf(i), Float.valueOf(f));
            InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
            if (interfaceC1467950oIr != null) {
                ((C1470430oMr) interfaceC1467950oIr).LJIL(f, i);
            }
        }
        if (i != 1424) {
            switch (i) {
                case 325:
                    this.LLJJL = f;
                    break;
                case 326:
                    this.LLJJLIIIJLLLLLLLZ = f;
                    break;
                case 327:
                    this.LLJL = f;
                    break;
                case 328:
                    this.LLJLIL = f;
                    break;
                default:
                    boolean z = true;
                    switch (i) {
                        case 344:
                            this.LLJLLIL = f;
                            InterfaceC1467950oIr interfaceC1467950oIr2 = this.LJIIIIZZ;
                            if (interfaceC1467950oIr2 != null) {
                                ((C1470430oMr) interfaceC1467950oIr2).LJIL(f, 645);
                            }
                            break;
                        case 345:
                            this.LLD = true;
                            this.LLJLILLLLZIIL = f;
                            InterfaceC1467950oIr interfaceC1467950oIr3 = this.LJIIIIZZ;
                            if (interfaceC1467950oIr3 != null) {
                                ((C1470430oMr) interfaceC1467950oIr3).LJIL(f, 644);
                            }
                            break;
                        case 346:
                            this.LLF = true;
                            this.LLJLL = f;
                            InterfaceC1467950oIr interfaceC1467950oIr4 = this.LJIIIIZZ;
                            if (interfaceC1467950oIr4 != null) {
                                ((C1470430oMr) interfaceC1467950oIr4).LJIL(f, 646);
                            }
                            break;
                        case 347:
                            if (f <= 0.0f) {
                                z = false;
                            }
                            this.LLFF = z;
                            break;
                        case 348:
                            this.LLJLLL = f;
                            break;
                        case 349:
                            this.LLJZ = f;
                            break;
                        case 350:
                            this.LLL = f;
                            InterfaceC1467950oIr interfaceC1467950oIr5 = this.LJIIIIZZ;
                            if (interfaceC1467950oIr5 != null) {
                                ((C1470430oMr) interfaceC1467950oIr5).LJIL(f, 1153);
                            }
                            break;
                        case 351:
                            this.LLLF = f;
                            InterfaceC1467950oIr interfaceC1467950oIr6 = this.LJIIIIZZ;
                            if (interfaceC1467950oIr6 != null) {
                                ((C1470430oMr) interfaceC1467950oIr6).LJIL(f, 1154);
                            }
                            break;
                        case 352:
                            this.LLLFF = f;
                            InterfaceC1467950oIr interfaceC1467950oIr7 = this.LJIIIIZZ;
                            if (interfaceC1467950oIr7 != null) {
                                ((C1470430oMr) interfaceC1467950oIr7).LJIL(f, 1155);
                            }
                            break;
                        case 353:
                            this.LLLFFI = f;
                            InterfaceC1467950oIr interfaceC1467950oIr8 = this.LJIIIIZZ;
                            if (interfaceC1467950oIr8 != null) {
                                ((C1470430oMr) interfaceC1467950oIr8).LJIL(f, 1156);
                            }
                            break;
                        case 354:
                            this.LLLFZ = f;
                            InterfaceC1467950oIr interfaceC1467950oIr9 = this.LJIIIIZZ;
                            if (interfaceC1467950oIr9 != null) {
                                ((C1470430oMr) interfaceC1467950oIr9).LJIL(f, 1157);
                            }
                            break;
                    }
                    break;
            }
            return;
        }
        this.LLLZIL.LJLIIIL(f, 238);
    }

    public final void LLLLLLLLLL(int i, int i2) {
        switch (i) {
            case 213:
                this.LLLZIL.LIZJ(212, LJJLJ());
                break;
            case 214:
                this.LLLZIL.LIZJ(215, LJJLJ());
                break;
            case 216:
                i2 = LJJLJ();
                break;
            case 217:
                this.LLLZIL.LIZJ(218, LJJLJ());
                break;
            case 219:
                this.LLLZIL.LIZJ(220, LJJLJ());
                break;
        }
        this.LLLZIL.LIZJ(i, i2);
    }

    public final void LLLLLLLZIL(int i, long j) {
        this.LLLZIL.LIZIZ(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLZL(int r4, android.view.Surface r5) {
        /*
            r3 = this;
            X.0oIr r0 = r3.LJIIIIZZ
            if (r0 == 0) goto L67
            boolean r0 = X.C1481110oe5.LIZ
            if (r0 == 0) goto L25
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "setSubSurface surface "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", index "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "TTVideoEngine"
            X.C1481110oe5.LIZIZ(r0, r1)
        L25:
            X.0oIr r1 = r3.LJIIIIZZ
            X.0oMr r1 = (X.C1470430oMr) r1
            if (r5 == 0) goto L34
            r1.getClass()
            boolean r0 = r5.isValid()
            if (r0 == 0) goto L5c
        L34:
            com.ss.ttm.player.TTPlayerClient r2 = r1.LIZ
            if (r2 == 0) goto L5c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.LLJJIII
            r0.lock()
            boolean r0 = r2.LJJIJIIJIL()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L4c
            r2.LLILZ = r5     // Catch: java.lang.Throwable -> L52
            X.0oNg r0 = r2.LLJJJ     // Catch: java.lang.Throwable -> L52
            com.ss.ttm.player.TTPlayer r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L52
            r0.LJJIJL(r4, r5)     // Catch: java.lang.Throwable -> L52
        L4c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.LLJJIII
            r0.unlock()
            return
        L52:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.LLJJIII
            r0.unlock()
            throw r1
        L5c:
            boolean r0 = X.C1481110oe5.LIZ
            if (r0 == 0) goto L67
            java.lang.String r1 = "MediaPlayerWrapper"
            java.lang.String r0 = "setSubSurface surface invalid"
            X.C1481110oe5.LIZIZ(r1, r0)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LLLLLZL(int, android.view.Surface):void");
    }

    public void LLLLZI(SurfaceHolder surfaceHolder, boolean z) {
        if (surfaceHolder == null) {
            this.E0 = System.currentTimeMillis();
        }
        this.i6 = 0;
        LLILII(surfaceHolder, z);
    }

    public final void LLLZIIL(int i, int i2) {
        C1468160oJC c1468160oJC;
        InterfaceC1467950oIr interfaceC1467950oIr;
        C1468160oJC c1468160oJC2;
        InterfaceC1468020oIy interfaceC1468020oIy;
        int iLIZIZ;
        C1467070oHR c1467070oHR = this.LJLIIL;
        int i3 = c1467070oHR.LIZJ;
        if (i3 == i) {
            return;
        }
        if (i == 2) {
            if (c1467070oHR.LJIILIIL && !c1467070oHR.LJIIL && i3 != 3) {
                int iLJJLJ = LJJLJ();
                this.LJIJJLI = i2;
                C1468160oJC c1468160oJC3 = this.LLLZIL;
                c1468160oJC3.getClass();
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("movieStalled, type: ");
                sbLIZ.append(i2);
                C1471660oOq.LIZJ("VideoEventLoggerV2", C2188811AlT.LIZIZ(sbLIZ));
                if (i2 == 0) {
                    int i5 = c1468160oJC3.LJJLIIIIJ;
                    if (i5 != 3 && i5 != 4) {
                        c1468160oJC3.LJJLIIIIJ = 3;
                        int i6 = c1468160oJC3.LJJJJL + 1;
                        c1468160oJC3.LJJJJL = i6;
                        C1468140oJA c1468140oJA = c1468160oJC3.LIZLLL;
                        c1468140oJA.getClass();
                        TTVideoEngineLog.d("VideoEventOneEvent", "movieStalled");
                        c1468140oJA.LIZLLL.LJFF = System.currentTimeMillis();
                        C1468150oJB c1468150oJB = c1468140oJA.LIZLLL;
                        c1468150oJB.LJIIIIZZ = iLJJLJ;
                        c1468150oJB.LJIILL = i6;
                        c1468150oJB.LIZ = "block_net";
                        C1468180oJE c1468180oJE = c1468140oJA.LIZ;
                        if (c1468180oJE != null && (interfaceC1468020oIy = c1468180oJE.LIZ) != null) {
                            c1468150oJB.LJJIIZ = c1468180oJE.LJJJ;
                            c1468150oJB.LJJIJ = c1468180oJE.LJJJI;
                            c1468150oJB.LJJIJIL = c1468180oJE.LJJJZ;
                            c1468150oJB.LJIILJJIL = ((C1467030oHN) interfaceC1468020oIy).LIZLLL(56);
                            HashMap map = (HashMap) C799510VXx.LIZ(((C1467030oHN) c1468140oJA.LIZ.LIZ).LJ(55));
                            if (map.get("fvl") != null) {
                                c1468140oJA.LIZLLL.LJIIJ = ((Long) map.get("fvl")).longValue();
                            }
                            if (map.get("fal") != null) {
                                c1468140oJA.LIZLLL.LJIIJJI = ((Long) map.get("fal")).longValue();
                            }
                            if (map.get("dvl") != null) {
                                c1468140oJA.LIZLLL.LJIILLIIL = ((Long) map.get("dvl")).longValue();
                            }
                            if (map.get("dal") != null) {
                                c1468140oJA.LIZLLL.LJIJ = ((Long) map.get("dal")).longValue();
                            }
                            if (map.get("bvl") != null) {
                                c1468140oJA.LIZLLL.LJIJJ = ((Long) map.get("bvl")).longValue();
                            }
                            if (map.get("bal") != null) {
                                c1468140oJA.LIZLLL.LJIL = ((Long) map.get("bal")).longValue();
                            }
                            if (map.get("fvlim") != null) {
                                c1468140oJA.LIZLLL.LJJI = ((Long) map.get("fvlim")).longValue();
                            }
                            if (map.get("falim") != null) {
                                c1468140oJA.LIZLLL.LJJIFFI = ((Long) map.get("falim")).longValue();
                            }
                            c1468140oJA.LIZ.LJJJJZI = C1468180oJE.LJIIIZ();
                            C1468180oJE c1468180oJE2 = c1468140oJA.LIZ;
                            if (c1468180oJE2.LJJLI) {
                                double dLJ = c1468180oJE2.LJ();
                                double dLJFF = c1468140oJA.LIZ.LJFF();
                                if (dLJ > 0.0d && dLJFF > 0.0d) {
                                    C1468150oJB c1468150oJB2 = c1468140oJA.LIZLLL;
                                    c1468150oJB2.LJJIJLIJ = dLJ;
                                    c1468150oJB2.LJJIL = dLJFF;
                                } else {
                                    final C1468150oJB c1468150oJB3 = c1468140oJA.LIZLLL;
                                    final C1468180oJE c1468180oJE3 = c1468140oJA.LIZ;
                                    EngineThreadPool.addExecuteTask(new Runnable(c1468150oJB3, c1468180oJE3) { // from class: X.0oJW
                                        public final WeakReference<C1468150oJB> LL;
                                        public final WeakReference<C1468180oJE> LLILLJJLI;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1468440oJe c1468440oJeLJII;
                                            C1C7U.LIZ("VideoEventOneEvent$StatisticDataRunnable@40c3.run");
                                            try {
                                                C1468150oJB c1468150oJB4 = this.LL.get();
                                                C1468180oJE c1468180oJE4 = this.LLILLJJLI.get();
                                                if (c1468150oJB4 != null && c1468180oJE4 != null && (c1468440oJeLJII = c1468180oJE4.LJII()) != null) {
                                                    double d = c1468440oJeLJII.LIZ;
                                                    if (d <= 0.0d) {
                                                        d = 1.401298464324817E-45d;
                                                    }
                                                    c1468150oJB4.LJJIJLIJ = d;
                                                    double d2 = c1468440oJeLJII.LIZIZ;
                                                    c1468150oJB4.LJJIL = d2 > 0.0d ? d2 : 1.401298464324817E-45d;
                                                }
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("VideoEventOneEvent$StatisticDataRunnable@40c3.run");
                                        }

                                        {
                                            this.LL = new WeakReference<>(c1468150oJB3);
                                            this.LLILLJJLI = new WeakReference<>(c1468180oJE3);
                                        }
                                    });
                                }
                                c1468140oJA.LIZLLL.LJJJ = c1468140oJA.LIZ.LIZLLL();
                            }
                            if (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 2L) && (iLIZIZ = C1468330oJT.LIZIZ(c1468140oJA.LIZ.LJJJLIIL)) >= 0) {
                                c1468140oJA.LIZLLL.LJJIZ = iLIZIZ;
                            }
                        }
                    }
                    c1468160oJC3.LJJJJJL++;
                    if (c1468160oJC3.LJJLIIIIJ != 4) {
                        c1468160oJC3.LJJ(-2003, true);
                    }
                } else if (i2 == 1) {
                    c1468160oJC3.LJJJJIZL++;
                    c1468160oJC3.LJJ(-2004, true);
                }
                if (c1468160oJC3.LIZJ != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1468170oJD c1468170oJD = c1468160oJC3.LIZJ;
                    if (c1468170oJD.LJL <= 0) {
                        c1468170oJD.LJL = jCurrentTimeMillis;
                    }
                    if (i2 == 1) {
                        c1468160oJC3.LJJJIL = jCurrentTimeMillis;
                    }
                    c1468170oJD.LLJJL = jCurrentTimeMillis;
                }
                this.LJLIIL.LJIIIZ = SystemClock.elapsedRealtime();
                long j = TTVideoEngine.LJIILLIIL;
                if (j > 0) {
                    long j2 = this.LJLIIL.LJIIIZ - j;
                    TTVideoEngine.LJIILLIIL = 0L;
                    C1468160oJC c1468160oJC4 = this.LLLZIL;
                    if (c1468160oJC4 != null) {
                        c1468160oJC4.LIZIZ(226, j2);
                    }
                }
            }
            C1467070oHR c1467070oHR2 = this.LJLIIL;
            if (c1467070oHR2.LJIILIIL && c1467070oHR2.LJIIL && (c1468160oJC2 = this.LLLZIL) != null) {
                c1468160oJC2.LIZJ(155, i2 + 1);
                this.LLLZIL.LJLJJLL(170);
            }
        } else if (i == 1) {
            C1467070oHR c1467070oHR3 = this.LJLIIL;
            if (c1467070oHR3.LJIILIIL && c1467070oHR3.LJIIL && (c1468160oJC = this.LLLZIL) != null) {
                c1468160oJC.LJLJJLL(171);
            }
        }
        this.LJLIIL.LIZJ = i;
        LLLII(i);
        if (i == 2 && (interfaceC1467950oIr = this.LJIIIIZZ) != null) {
            long jLJIIJ = ((C1470430oMr) interfaceC1467950oIr).LJIIJ(665, 0L);
            if (jLJIIJ > 0) {
                HashMap map2 = new HashMap();
                map2.put("diff", Long.valueOf(jLJIIJ));
                C1468160oJC c1468160oJC5 = this.LLLZIL;
                C1468140oJA c1468140oJA2 = c1468160oJC5.LIZLLL;
                if (c1468140oJA2 != null) {
                    c1468140oJA2.LJII = 1;
                }
                C1467110oHV c1467110oHV = c1468160oJC5.LJFF;
                if (c1467110oHV != null) {
                    c1467110oHV.LJIIIZ = 1;
                }
                C1467140oHY c1467140oHY = c1468160oJC5.LJI;
                if (c1467140oHY != null) {
                    c1467140oHY.LJFF = 1;
                }
                HashMap map3 = new HashMap(3);
                map3.put("pts", "-1");
                map3.put("type", "non");
                map3.put("diff", Long.toString(jLJIIJ));
                C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map3)), c1468160oJC5.LLJL);
                LLJLLIL(map2);
            }
        }
    }

    public final void LLLZIL(int i, C1467860oIi c1467860oIi) {
        if (this.LJIILL != i) {
            this.LJIILL = i;
            LLLIIII(c1467860oIi);
            TTVideoEngineMonitor tTVideoEngineMonitor = this.LLLZLL;
            if (tTVideoEngineMonitor != null) {
                int iHashCode = hashCode();
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                tTVideoEngineMonitor.engineStateChange(iHashCode, z);
            }
        }
    }

    @Override // X.InterfaceC1467390oHx
    public void LJIIZILJ(FileDescriptor fileDescriptor, long j, long j2) {
        throw new RuntimeException("not supported");
    }

    @Override // X.AbstractC1467000oHK
    public final boolean LJJJ(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2) {
        C1467010oHL c1467010oHL = this.LJJJJIZL;
        if (c1467010oHL != null) {
            c1467010oHL.LIZLLL();
        }
        LLLZIL(3, null);
        LLLZIIL(3, -1);
        if (this.LJLIIL.LIZIZ == 0) {
            return true;
        }
        String strLJIIIZ = interfaceC1470080oMI.LJIIIZ(5002);
        String strLIZIZ = e.LIZIZ(interfaceC1470080oMI);
        if (strLIZIZ.equals("kTTVideoErrorDomainVideoOwnPlayer") && this.LJJIJIIJIL) {
            return true;
        }
        this.LJJLIIIJLLLLLLLZ = new e(strLIZIZ, i, i2, strLJIIIZ);
        LLLLIILL(this.LJJLIIIJLLLLLLLZ);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0ab2  */
    @Override // X.AbstractC1467000oHK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(X.InterfaceC1470080oMI r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 2984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LJJJI(X.0oMI, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJLIL(java.lang.String r18, java.util.List r19, java.util.Map r20) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466990oHJ.LJJLIL(java.lang.String, java.util.List, java.util.Map):java.lang.String");
    }

    public void LJLLLLLL(long j, Surface surface, boolean z) {
        if (surface == null) {
            this.E0 = System.currentTimeMillis();
        }
        if (z) {
            try {
                EngineThreadPool.addExecuteTaskSync(new ARunnableS92S0200000_23(this, surface, 53), j);
                return;
            } catch (TimeoutException e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
                if (interfaceC1467950oIr != null) {
                    ((C1470430oMr) interfaceC1467950oIr).LIZJ(35001, 1);
                    return;
                }
                return;
            }
        }
        LJJLIIIJLLLLLLLZ(surface);
    }

    public final C1474520oTS LLFZ(EnumC2281151EQn enumC2281151EQn, int i, Map<Integer, String> map) {
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        if (interfaceC1467050oHPLIZJ != null && interfaceC1467050oHPLIZJ.LJIIL()) {
            C1474520oTS c1474520oTSLJIJJLI = interfaceC1467050oHPLIZJ.LJIJJLI(enumC2281151EQn, i, map, true);
            if (c1474520oTSLJIJJLI != null) {
                int iLJIIZILJ = interfaceC1467050oHPLIZJ.LJIIZILJ(7);
                if (iLJIIZILJ == 1) {
                    if (c1474520oTSLJIJJLI.LJFF() == 1) {
                        this.LJIL.LIZIZ(c1474520oTSLJIJJLI.getResolution());
                        this.Z = c1474520oTSLJIJJLI.LIZ(32);
                    }
                } else if (iLJIIZILJ == 0 && c1474520oTSLJIJJLI.LJFF() == 0) {
                    this.LJIL.LIZIZ(c1474520oTSLJIJJLI.getResolution());
                    this.Z = c1474520oTSLJIJJLI.LIZ(32);
                }
                this.LLLZIL.LJJLIIIJILLIZJL(this.Z);
                this.LLLZIL.LJJIIZ(LJLJLJ(this.LJIL.getCurrentResolution()), "");
            }
            return c1474520oTSLJIJJLI;
        }
        return null;
    }

    public void LLJZ(int i, int i2, int i3) {
        this.LLLLLZL.LJJJLIIL(i, i2, i3);
    }

    public void LLLLLLJ(String str, String str2, String[] strArr) {
        LLLLLLIL(0L, str, str2, strArr);
    }

    public final void LLLLLLZZ(SurfaceControl surfaceControl, int i, int i2) {
        if (!LLJLILLLLZIIL() || C1474810oTv.LLIL()) {
            C1467230oHh c1467230oHh = this.h6;
            if (C1481110oe5.LIZ) {
                c1467230oHh.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updatePlayerCoreSurfaceControl:, parentSurfaceControl:");
                sbLIZ.append(surfaceControl);
                sbLIZ.append(", width:");
                sbLIZ.append(i);
                sbLIZ.append(", height:");
                sbLIZ.append(i2);
                sbLIZ.append(", mParentSurfaceControl:");
                sbLIZ.append(c1467230oHh.LIZIZ);
                sbLIZ.append(", mWidth:");
                sbLIZ.append(c1467230oHh.LIZJ);
                sbLIZ.append(", mHeight:");
                sbLIZ.append(c1467230oHh.LIZLLL);
                C1481110oe5.LIZIZ("EngineSurfaceControlWrapper", C2188811AlT.LIZIZ(sbLIZ));
            }
            c1467230oHh.LIZIZ = surfaceControl;
            c1467230oHh.LIZJ = i;
            c1467230oHh.LIZLLL = i2;
            C1467230oHh c1467230oHh2 = this.h6;
            InterfaceC1467950oIr interfaceC1467950oIr = this.A1;
            if (interfaceC1467950oIr == null) {
                interfaceC1467950oIr = this.LJIIIIZZ;
            }
            c1467230oHh2.LIZ(interfaceC1467950oIr);
            this.i6 = 2;
        }
    }

    public void LLLI(int i, long j, long j2, Map<Integer, String> map) {
        this.LLLLLZL.LJJJJJL(this.y5, i, j, j2, map);
    }

    public final void LLLLLLIL(long j, String str, String str2, String[] strArr) {
        int iIndexOf;
        if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(strArr[0])) {
            if (this.y4 > 0 && !TextUtils.isEmpty(str) && !str.startsWith("http") && (iIndexOf = str.indexOf("_")) > 0) {
                this.e6 = str.substring(0, iIndexOf);
            }
            if (TextUtils.isEmpty(str)) {
                LLLLLL(strArr[0], strArr);
                this.LLLZIL.LIZJ(174, EnumC1469040oKc.EmptyKey.ordinal());
            } else if (this.N == 0) {
                LLLLLL(strArr[0], strArr);
                this.LLLZIL.LIZJ(174, EnumC1469040oKc.OptionNotSet.ordinal());
            } else {
                this.g6.LJJIIJ();
                String strLJJIFFI = this.g6.LJJIFFI(LLJJIII(str, str2, this.P, strArr, EnumC2281151EQn.Undefine, this.o, null, null, null, j));
                if (!((ArrayList) this.LJLIIL.LJJI).contains(str)) {
                    ((ArrayList) this.LJLIIL.LJJI).add(str);
                }
                if (TextUtils.isEmpty(strLJJIFFI)) {
                    LLLLLL(strArr[0], strArr);
                } else {
                    if (this.o1 == 1) {
                        for (String str3 : strArr) {
                            if (!URLUtil.isValidUrl(str3)) {
                            }
                        }
                        this.LJIL.setVideoId(str2);
                        LLLLIILL(new e("kTTVideoErrorDomainVideoOwnPlayer", -9966, 0, "Direct url is invalid url."));
                        return;
                    }
                    LLLLLL(strLJJIFFI, strArr);
                    this.LJIL.setVideoId(str2);
                    C1469160oKo.LIZ(str2, str, this.LJLIIL.LJJIFFI, strArr);
                }
                this.LLLZIL.LJJIIJ = strLJJIFFI;
            }
            this.LJIL.setVideoId(str2);
        }
    }

    public static HashMap LLILLIZIL(int i, String str, String str2, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("tag", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("subtag", str2);
        }
        map.put("islive", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str3)) {
            map.put("enginehash", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            map.put("group_id", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            map.put("crosstalk_id", str5);
        }
        return map;
    }

    public final C1467360oHu LLJJIII(String str, String str2, long j, String[] strArr, EnumC2281151EQn enumC2281151EQn, String str3, C1474520oTS c1474520oTS, String str4, String str5, long j2) {
        boolean z;
        InterfaceC1467050oHP interfaceC1467050oHPLIZJ = C1467400oHy.LIZJ(this.LJIL);
        boolean z2 = true;
        if (interfaceC1467050oHPLIZJ != null && interfaceC1467050oHPLIZJ.LJIIJ(EnumC1469940oM4.HLS)) {
            z = true;
        } else {
            z = false;
        }
        int i = this.LJIIJ;
        if (i == 0 || (this.LJJLIIIJL && i == 5)) {
            z2 = false;
        }
        C1467360oHu c1467360oHu = new C1467360oHu();
        c1467360oHu.LIZ = str;
        c1467360oHu.LIZIZ = str2;
        c1467360oHu.LIZJ = j;
        c1467360oHu.LIZLLL = strArr;
        c1467360oHu.LJ = enumC2281151EQn;
        c1467360oHu.LJFF = str3;
        c1467360oHu.LJI = c1474520oTS;
        c1467360oHu.LJII = str4;
        c1467360oHu.LJIIIIZZ = str5;
        c1467360oHu.LJIIIZ = z2;
        c1467360oHu.LJIIJ = z;
        c1467360oHu.LJIIJJI = this.u1;
        c1467360oHu.LJIIL = j2;
        return c1467360oHu;
    }
}
