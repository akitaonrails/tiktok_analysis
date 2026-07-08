package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.preload.MynaGeckoChannelPreloadInfo;
import com.tiktok.myna.preload.MynaTemplatePreloadInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS222S0000000_32;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21322318cP implements InterfaceC21322918cV {
    public static final C01GW<C21323018cW> LJIIIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS223S0000000_32.get$arr$(323));
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC1540190qBN LIZJ;
    public final C21329018dU LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final ConcurrentHashMap<String, C21323018cW> LJI;
    public final ConcurrentHashMap<String, C21322518cR> LJII;
    public final InterfaceC21322918cV LJIIIIZZ;

    @Override // X.InterfaceC21322918cV
    public final void release() {
        InterfaceC21322918cV interfaceC21322918cV = this.LJIIIIZZ;
        if (interfaceC21322918cV != null) {
            interfaceC21322918cV.release();
        }
        Iterator<T> it2 = this.LJII.values().iterator();
        while (it2.hasNext()) {
            ((C21322518cR) it2.next()).LJFF();
        }
        C21322218cO c21322218cO = C21322218cO.LIZ;
        String str = this.LIZ;
        c21322218cO.getClass();
        HashMap<String, InterfaceC21322918cV> map = C21322218cO.LJFF;
        synchronized (map) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC21322918cV
    public final C21329018dU LIZIZ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.18cR, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZLLL(String str, Function2<? super C21323018cW, ? super C21326518d5, Unit> function2) {
        final C259800zU c259800zU = new C259800zU();
        ?? r0 = this.LJII.get(str);
        c259800zU.element = r0;
        if (r0 == 0) {
            ?? c21322518cR = new C21322518cR(this.LIZIZ, str, C1942607jE.LIZ(str), C21321318cF.LIZ(false, false, false, 7));
            c259800zU.element = c21322518cR;
            this.LJII.put(str, (C21322518cR) c21322518cR);
            ((C21322518cR) c259800zU.element).LJ(function2);
            C21322218cO c21322218cO = C21322218cO.LIZ;
            InterfaceC1540190qBN interfaceC1540190qBN = this.LIZJ;
            C21322518cR c21322518cR2 = (C21322518cR) c259800zU.element;
            Function2<C21323018cW, C21326518d5, Unit> function22 = new Function2<C21323018cW, C21326518d5, Unit>() { // from class: X.18cS
                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(C21323018cW c21323018cW, C21326518d5 c21326518d5) {
                    C21323018cW c21323018cW2 = c21323018cW;
                    C21322318cP c21322318cP = this.LL;
                    C21322518cR c21322518cR3 = c259800zU.element;
                    c21322318cP.getClass();
                    if (c21323018cW2.LIZ != null) {
                        C1168400gVi.LIZ(new AwS611S0100000_32(c21322518cR3, 386));
                        String str2 = c21322518cR3.LIZIZ;
                        C21322218cO c21322218cO2 = C21322218cO.LIZ;
                        String str3 = c21322318cP.LIZIZ;
                        c21322218cO2.getClass();
                        if (C21322218cO.LJIIJJI(str3)) {
                            c21322318cP.LJI.put(str2, c21323018cW2);
                        }
                    }
                    AwS276S0300000_32 awS276S0300000_32 = new AwS276S0300000_32(c21322318cP, c21322518cR3, c21323018cW2, 19);
                    if (C1168320gVa.LIZIZ()) {
                        awS276S0300000_32.invoke();
                    } else {
                        C786410Ut5.LJJZZIII(C1168320gVa.LIZ, new ARunnableS116S0100000_16(awS276S0300000_32, (Function0<Unit>) 163));
                    }
                    return Unit.LIZ;
                }
            };
            c21322218cO.getClass();
            C21322218cO.LIZJ(interfaceC1540190qBN, c21322518cR2, function22);
            return;
        }
        if (((C21322518cR) r0).LJII != null) {
            C1325860kbg.LIZIZ(new Throwable("MynaTemplateLoadContext is not removed from map after the template is loaded"), new AwS222S0000000_32(1), C2097608Jq.LJ());
        } else {
            ((C21322518cR) c259800zU.element).LJ(function2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r9, java.lang.String r10, kotlin.jvm.functions.Function2<? super X.C21323018cW, ? super X.C21326518d5, kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21322318cP.LIZJ(android.content.Context, java.lang.String, kotlin.jvm.functions.Function2):void");
    }

    @Override // X.InterfaceC21322918cV
    public final void LIZ(Context context, String str, C21326918d9 c21326918d9, Function2<? super C21323018cW, ? super C21326518d5, Unit> function2) {
        InterfaceC21322918cV interfaceC21322918cV = this.LJIIIIZZ;
        if (interfaceC21322918cV != null) {
            interfaceC21322918cV.LIZ(context, str, c21326918d9, new C21322718cT(this, context, str, function2));
        } else {
            LIZJ(context, str, function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    public C21322318cP(String str, String str2, InterfaceC1540190qBN interfaceC1540190qBN, C21329018dU c21329018dU, C21322218cO c21322218cO) {
        List<MynaTemplatePreloadInfo> list;
        ?? map;
        Function0 function0;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC1540190qBN;
        this.LIZLLL = c21329018dU;
        c21322218cO.getClass();
        InterfaceC21322918cV interfaceC21322918cV = null;
        if (!C21322218cO.LJFF(str2)) {
            map = C2097608Jq.LJ();
        } else {
            MynaGeckoChannelPreloadInfo mynaGeckoChannelPreloadInfo = C21322218cO.LJI.LIZLLL.get(str2);
            if (mynaGeckoChannelPreloadInfo != null) {
                list = mynaGeckoChannelPreloadInfo.preloadList;
            } else {
                list = null;
            }
            map = new HashMap();
            if (list != null) {
                Iterator<MynaTemplatePreloadInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str3 = it2.next().url;
                    if (str3 != null && str3.length() != 0) {
                        C21322018cM c21322018cM = C21322218cO.LJI;
                        c21322018cM.getClass();
                        C21322218cO.LIZ.getClass();
                        C21323018cW c21323018cW = c21322018cM.LIZ.get(str3);
                        if (c21323018cW != null) {
                            map.put(str3, c21323018cW);
                        }
                    }
                }
            }
        }
        this.LJI = new ConcurrentHashMap<>((Map) map);
        new C1759030vsL();
        this.LJII = new ConcurrentHashMap<>();
        C21322218cO c21322218cO2 = C21322218cO.LIZ;
        String str4 = this.LIZIZ;
        c21322218cO2.getClass();
        if (C1325860kbg.LJII() && (!((ConcurrentHashMap) C21322218cO.LJIIIIZZ.getValue()).isEmpty())) {
            Iterator<Map.Entry<String, Set<String>>> it3 = C21322218cO.LJI.LIZJ.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Map.Entry<String, Set<String>> next = it3.next();
                String key = next.getKey();
                if (next.getValue().contains(str4)) {
                    if (key != null && !a0.LJJJIL(key) && (function0 = (Function0) ((ConcurrentHashMap) C21322218cO.LJIIIIZZ.getValue()).get(key)) != null) {
                        interfaceC21322918cV = (InterfaceC21322918cV) function0.invoke();
                    }
                }
            }
        }
        this.LJIIIIZZ = interfaceC21322918cV;
    }
}
