package X;

import android.app.Application;
import android.net.Uri;
import android.os.Build;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1537910q7h implements InterfaceC1531560pxS {
    public Map<String, C1311220kE4> LIZ;
    public List<C1311670kEn> LIZIZ;
    public C1067460dsu LIZJ;
    public C649560Pdq LIZLLL;
    public String LJ;
    public Uri LJFF;
    public TemplateBundle LJI;
    public final Function0<? extends AnonymousClass0957<TemplateBundle>> LJII;
    public byte[] LJIIIIZZ;
    public ByteBuffer LJIIIZ;
    public final EnumC1067640dtC LJIIJ;
    public CoroutineContext LJIIJJI;
    public final C01GW LJIIL;
    public C1299340juu LJIILIIL;
    public String LJIILJJIL;
    public Integer LJIILL;
    public Integer LJIILLIIL;
    public Integer LJIIZILJ;
    public Integer LJIJ;
    public final C1536760q5q LJIJI;
    public TemplateData LJIJJ;
    public C1537260q6e LJIJJLI;
    public Map<Object, Object> LJIL;
    public AnonymousClass0957<TemplateData> LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public C09AY LJJII;
    public InterfaceC1538820q9A LJJIII;
    public HybridSchemaParam LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public C650530PfP LJJIL;
    public boolean LJJIZ;
    public LynxBackgroundRuntime LJJJ;
    public final C2281408wm<String, Object> LJJJI;
    public final CopyOnWriteArrayList<LynxViewClient> LJJJIL;

    public C1537910q7h() {
        throw null;
    }

    @Override // X.InterfaceC1531560pxS
    public boolean LIZIZ() {
        HybridSchemaParam hybridSchemaParam = this.LJJIIJ;
        if (hybridSchemaParam != null) {
            return hybridSchemaParam.getUseForest();
        }
        return false;
    }

    @Override // X.InterfaceC1531560pxS
    public Map<String, Object> LJFF() {
        return LJIJI();
    }

    public final TemplateBundle LJIJ() {
        AnonymousClass0957<TemplateBundle> anonymousClass0957Invoke;
        TemplateBundle c098200Yq;
        Function0<AnonymousClass0957<TemplateBundle>> function0LJIIZILJ = LJIIZILJ();
        if (function0LJIIZILJ == null || (anonymousClass0957Invoke = function0LJIIZILJ.invoke()) == null || !anonymousClass0957Invoke.isCompleted()) {
            return LJIILLIIL();
        }
        try {
            c098200Yq = anonymousClass0957Invoke.LIZLLL();
            if (c098200Yq == null) {
                c098200Yq = LJIILLIIL();
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        TemplateBundle templateBundleLJIILLIIL = LJIILLIIL();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = templateBundleLJIILLIIL;
        }
        return (TemplateBundle) c098200Yq;
    }

    @Override // X.InterfaceC1531560pxS
    public Uri LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1531560pxS
    public HybridSchemaParam LIZJ() {
        return this.LJJIIJ;
    }

    public C649560Pdq LJIIIZ() {
        return this.LIZLLL;
    }

    public C1067460dsu LJIIJ() {
        return this.LIZJ;
    }

    public List<C1311670kEn> LJIIJJI() {
        return this.LIZIZ;
    }

    public Map<String, C1311220kE4> LJIIL() {
        return this.LIZ;
    }

    public String LJIILIIL() {
        return this.LJ;
    }

    public byte[] LJIILJJIL() {
        return this.LJIIIIZZ;
    }

    public ByteBuffer LJIILL() {
        return this.LJIIIZ;
    }

    public TemplateBundle LJIILLIIL() {
        return this.LJI;
    }

    public Function0<AnonymousClass0957<TemplateBundle>> LJIIZILJ() {
        return this.LJII;
    }

    public Map<String, Object> LJIJI() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC1531560pxS
    public EnumC1067640dtC getType() {
        return this.LJIIJ;
    }

    public C1537910q7h(Uri uri) {
        this(null, null, null, null, "", uri, null, null, null, 1792);
    }

    @Override // X.InterfaceC1531560pxS
    public void LIZLLL(Map<String, ? extends Object> map) {
        if (map != null) {
            this.LJJJI.putAll(map);
        }
    }

    @Override // X.InterfaceC1531560pxS
    public void LJ(HybridSchemaParam hybridSchemaParam) {
        this.LJJIIJ = hybridSchemaParam;
    }

    @Override // X.InterfaceC1531560pxS
    public void LJI(Uri uri) {
        this.LJFF = uri;
    }

    public final void LJII(List<C1311670kEn> list) {
        if (LJIIJJI() == null) {
            LJIL(new CopyOnWriteArrayList());
        }
        List<C1311670kEn> listLJIIJJI = LJIIJJI();
        if (listLJIIJJI != null) {
            listLJIIJJI.addAll(list);
        }
    }

    public final void LJIIIIZZ(LynxViewClient lynxViewClient) {
        this.LJJJIL.add(lynxViewClient);
    }

    public void LJIJJ(C649560Pdq c649560Pdq) {
        this.LIZLLL = c649560Pdq;
    }

    public void LJIJJLI(C1067460dsu c1067460dsu) {
        this.LIZJ = c1067460dsu;
    }

    public void LJIL(List<C1311670kEn> list) {
        this.LIZIZ = list;
    }

    public void LJJ(Map<String, C1311220kE4> map) {
        this.LIZ = map;
    }

    public void LJJI(String str) {
        this.LJ = str;
    }

    public void LJJIFFI(byte[] bArr) {
        this.LJIIIIZZ = bArr;
    }

    public void LJJII(ByteBuffer byteBuffer) {
        this.LJIIIZ = byteBuffer;
    }

    public void LJJIII(TemplateBundle templateBundle) {
        this.LJI = templateBundle;
    }

    public C1537910q7h(Map map, List list, C1067460dsu c1067460dsu, C649560Pdq c649560Pdq, String str, Uri uri, TemplateBundle templateBundle, Function0 function0, byte[] bArr, int i) {
        boolean z;
        map = (i & 1) != 0 ? null : map;
        list = (i & 2) != 0 ? null : list;
        c1067460dsu = (i & 4) != 0 ? null : c1067460dsu;
        c649560Pdq = (i & 8) != 0 ? null : c649560Pdq;
        str = (i & 16) != 0 ? "" : str;
        templateBundle = (i & 64) != 0 ? null : templateBundle;
        function0 = (i & 128) != 0 ? null : function0;
        bArr = (i & 256) != 0 ? null : bArr;
        if ((i & 1024) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = map;
        this.LIZIZ = list;
        this.LIZJ = c1067460dsu;
        this.LIZLLL = c649560Pdq;
        this.LJ = str;
        this.LJFF = uri;
        this.LJI = templateBundle;
        this.LJII = function0;
        this.LJIIIIZZ = bArr;
        this.LJIIIZ = null;
        this.LJIIJ = EnumC1067640dtC.LYNX;
        this.LJIIL = C452501pT.LIZ(EnumC452301pR.NONE, new C338101Sx(this));
        this.LJIIZILJ = -1;
        this.LJIJ = -1;
        this.LJIJI = new C1536760q5q(new C1536770q5r(this));
        this.LJJIJ = true;
        this.LJJIJIIJIL = C1535630q41.LJIIIZ;
        C2281408wm<String, Object> c2281408wm = new C2281408wm<>();
        this.LJJJI = c2281408wm;
        if (z) {
            c2281408wm.put("lynxSdkVersion", LynxEnv.inst().getLynxVersion());
            C1490740otc.LIZIZ(C1490740otc.LIZ, "init useLegacyGlobalProps width and height", null, "getScreenSize", 2);
            if (C1535630q41.LJI == 0) {
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Application applicationLIZ = C1202420hOa.LIZ();
                boolean z2 = this.LJJIJIIJIL;
                c1546210qL5.getClass();
                c2281408wm.put("screenWidth", Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LJI(applicationLIZ, z2), C1202420hOa.LIZ())));
                c2281408wm.put("screenHeight", Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LIZLLL(C1202420hOa.LIZ(), this.LJJIJIIJIL), C1202420hOa.LIZ())));
            }
            C1546210qL5 c1546210qL52 = C1546210qL5.LIZ;
            Application applicationLIZ2 = C1202420hOa.LIZ();
            c1546210qL52.getClass();
            c2281408wm.put("statusBarHeight", Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LJII(applicationLIZ2), C1202420hOa.LIZ())));
            c2281408wm.put("deviceModel", Build.MODEL);
            c2281408wm.put("os", "android");
            c2281408wm.put("osVersion", Build.VERSION.RELEASE);
            c2281408wm.put("language", C1546210qL5.LIZIZ());
            c2281408wm.put("isLowPowerMode", Integer.valueOf(C1546210qL5.LJIIIIZZ(C1202420hOa.LIZ()) ? 1 : 0));
            c2281408wm.put("accessibleMode", Integer.valueOf(C1546210qL5.LJIIJJI(C1202420hOa.LIZ()) ? 1 : 0));
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            c2281408wm.put("isPad", Integer.valueOf(C1546210qL5.LJIIIZ(C1161970gLL.LIZIZ().LIZJ()) ? 1 : 0));
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v != null) {
                c2281408wm.putAll(c1538050q7v);
            }
        }
        this.LJJJIL = new CopyOnWriteArrayList<>();
    }
}
