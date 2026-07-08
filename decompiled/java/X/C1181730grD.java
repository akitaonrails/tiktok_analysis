package X;

import X.C1181820grM;
import X.C786410Ut5;
import Y.ARunnableS4S1110000_18;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.SlashConfig;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.ss.android.ugc.aweme.slash.skeleton.ISlashSkeletonSignalNotify;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0grD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181730grD extends AbstractC1181640gr4 implements InterfaceC1181380gqe {
    public final InterfaceC665370Q7z LLILLJJLI;
    public final Function1<C1180620gpQ, Unit> LLILLL;
    public final C054G LLILZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C23118094a.LIZ()));
    public final List<C1181800grK> LLILZIL = new ArrayList();
    public final ConcurrentHashMap<String, C1181810grL> LLILZLL = new ConcurrentHashMap<>();
    public AnonymousClass0956 LLIZ;
    public boolean LLIZLLLIL;
    public C1180620gpQ LLJ;

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIIJ() {
        this.LL = null;
        Iterator<T> it2 = this.LLILZLL.values().iterator();
        while (it2.hasNext()) {
            ((C1181810grL) it2.next()).job.LIZIZ(null);
        }
        this.LLILZLL.clear();
        C2296808zG.LIZJ(this.LLILZ, null);
        ((ArrayList) this.LLILZIL).clear();
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    public final void LJJIIJ() {
        SlashConfig slashConfig;
        BaseComponentData baseComponentData;
        SlashConfig slashConfig2;
        int i = 0;
        for (Object obj : (ArrayList) this.LLILZIL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C1181800grK c1181800grK = (C1181800grK) obj;
            BaseComponentData baseComponentData2 = c1181800grK.LIZJ.LIZLLL;
            if (baseComponentData2 == null || (slashConfig = baseComponentData2.slashConfig) == null || !Intrinsics.LJFF(slashConfig.isAsyncLoad, Boolean.TRUE)) {
                ListProtector.set(this.LLILZIL, i, new C1181800grK(c1181800grK.LIZ, EnumC1181780grI.LOAD_FINISH, c1181800grK.LIZJ));
            } else {
                int i3 = C1181790grJ.LIZ[c1181800grK.LIZIZ.ordinal()];
                if (i3 == 1) {
                    return;
                }
                if (i3 == 2) {
                    ListProtector.set(this.LLILZIL, i, new C1181800grK(c1181800grK.LIZ, EnumC1181780grI.LOADING, c1181800grK.LIZJ));
                    C1180920gpu c1180920gpu = c1181800grK.LIZJ;
                    if (this.LLILZLL.containsKey(c1180920gpu.LIZ) || this.LLIZLLLIL || (baseComponentData = c1180920gpu.LIZLLL) == null || (slashConfig2 = baseComponentData.slashConfig) == null || !Intrinsics.LJFF(slashConfig2.isAsyncLoad, Boolean.TRUE)) {
                        return;
                    }
                    AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LLILZ, null, null, new C1181710grB(c1180920gpu, this, null), 3);
                    ConcurrentHashMap<String, C1181810grL> concurrentHashMap = this.LLILZLL;
                    String str = c1180920gpu.LIZ;
                    concurrentHashMap.put(str, new C1181810grL(str, anonymousClass0956LIZLLL));
                    return;
                }
                if (i3 != 3) {
                    throw new C1954807lC();
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C1181730grD(InterfaceC665370Q7z interfaceC665370Q7z, AwS597S0100000_18 awS597S0100000_18) {
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = awS597S0100000_18;
        ISlashSkeletonSignalNotify iSlashSkeletonSignalNotify = new ISlashSkeletonSignalNotify() { // from class: com.ss.android.ugc.aweme.slash.plugin.SlashSerialLoadPlugin$1
            @Override // com.ss.android.ugc.aweme.slash.skeleton.ISlashSkeletonSignalNotify
            public final void eH(String str, boolean z) {
                ARunnableS4S1110000_18 aRunnableS4S1110000_18 = new ARunnableS4S1110000_18(this.LL, str, z, 1);
                if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                    aRunnableS4S1110000_18.run();
                } else {
                    C786410Ut5.LJJZZIII(C1181820grM.LIZ, aRunnableS4S1110000_18);
                }
            }
        };
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ISlashSkeletonSignalNotify.class, null);
        if (interfaceC494301wDLIZ == null) {
            C1558520qew.LJII(interfaceC665370Q7z, iSlashSkeletonSignalNotify, ISlashSkeletonSignalNotify.class, null, null);
            return;
        }
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
            if (invocationHandler instanceof C2255108sX) {
                ((C2255108sX) invocationHandler).LL.add(iSlashSkeletonSignalNotify);
                return;
            }
            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C2255108sX c2255108sX = new C2255108sX();
            c2255108sX.LL.add(iSlashSkeletonSignalNotify);
            c2255108sX.LL.add((T) interfaceC494301wDLIZ);
            Object objNewProxyInstance = Proxy.newProxyInstance(ISlashSkeletonSignalNotify.class.getClassLoader(), new Class[]{ISlashSkeletonSignalNotify.class}, c2255108sX);
            if (objNewProxyInstance != null) {
                C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, ISlashSkeletonSignalNotify.class, null, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.slash.skeleton.ISlashSkeletonSignalNotify");
        }
    }

    public final void LJJIFFI(EnumC1181770grH enumC1181770grH, String str) {
        Map<String, Object> mapBO1;
        String str2;
        C1181930grX c1181930grXPu2;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null) {
            mapBO1 = interfaceC1181010gq3.BO1();
        } else {
            mapBO1 = null;
        }
        InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
        if (interfaceC1181010gq32 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1189060h32.LJJ("key", "serial_load_component", linkedHashMap);
            InterfaceC1181010gq3 interfaceC1181010gq33 = this.LL;
            if (interfaceC1181010gq33 != null && (c1181930grXPu2 = interfaceC1181010gq33.Pu2()) != null) {
                str2 = c1181930grXPu2.LIZJ;
            } else {
                str2 = null;
            }
            C1189060h32.LJJ("biz", str2, linkedHashMap);
            C1189060h32.LJJ("node_key", str, linkedHashMap);
            C1189060h32.LJJ("reason", enumC1181770grH.getReason(), linkedHashMap);
            if (mapBO1 != null) {
                for (Map.Entry<String, Object> entry : mapBO1.entrySet()) {
                    C1189060h32.LJJ(entry.getKey(), entry.getValue().toString(), linkedHashMap);
                }
            }
            interfaceC1181010gq32.Xr2("local_service_slash_track", linkedHashMap, null);
        }
    }

    public final void LJJIIZI(String str, EnumC1181780grI enumC1181780grI) {
        int i = 0;
        for (Object obj : (ArrayList) this.LLILZIL) {
            int i2 = i + 1;
            if (i >= 0) {
                C1181800grK c1181800grK = (C1181800grK) obj;
                if (Intrinsics.LJFF(c1181800grK.LIZJ.LIZ, str)) {
                    ListProtector.set(this.LLILZIL, i, new C1181800grK(c1181800grK.LIZ, enumC1181780grI, c1181800grK.LIZJ));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(final C1180620gpQ c1180620gpQ, final EnumC1181510gqr enumC1181510gqr, final boolean z, String str) {
        Runnable runnable = new Runnable() { // from class: X.0grE
            public final void LIZ() {
                ArrayList<C1180920gpu> arrayList;
                C1181190gqL c1181190gqL;
                List<C1180920gpu> listLIZ;
                BaseComponentData baseComponentData;
                if (z && enumC1181510gqr == EnumC1181510gqr.REQUEST) {
                    C1181730grD c1181730grD = this;
                    C1180620gpQ c1180620gpQ2 = c1180620gpQ;
                    c1181730grD.LLJ = c1180620gpQ2;
                    if (c1180620gpQ2 == null || (c1181190gqL = c1180620gpQ2.LL) == null || (listLIZ = c1181190gqL.LIZ()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (C1180920gpu c1180920gpu : listLIZ) {
                            C1180920gpu c1180920gpu2 = c1180920gpu;
                            if (c1180920gpu2 != null && ((baseComponentData = c1180920gpu2.LIZLLL) == null || !Intrinsics.LJFF(baseComponentData.isSkeleton, Boolean.TRUE))) {
                                if (C1180170goh.LIZ(c1180920gpu2, false)) {
                                    arrayList.add(c1180920gpu);
                                }
                            }
                        }
                    }
                    List<C1181800grK> list = c1181730grD.LLILZIL;
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (C1181800grK c1181800grK : (ArrayList) list) {
                        Pair pair = new Pair(c1181800grK.LIZ, c1181800grK.LIZIZ);
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    ((ArrayList) c1181730grD.LLILZIL).clear();
                    if (arrayList != null) {
                        for (C1180920gpu c1180920gpu3 : arrayList) {
                            String str2 = c1180920gpu3.LIZ;
                            EnumC1181780grI enumC1181780grI = (EnumC1181780grI) linkedHashMap.get(str2);
                            if (enumC1181780grI == null) {
                                enumC1181780grI = EnumC1181780grI.NOT_LOAD;
                            }
                            ((ArrayList) c1181730grD.LLILZIL).add(new C1181800grK(str2, enumC1181780grI, c1180920gpu3));
                        }
                    }
                    c1181730grD.LJJIIJ();
                    C1180620gpQ c1180620gpQ3 = c1180620gpQ;
                    if (c1180620gpQ3 == null || !c1180620gpQ3.LLILLJJLI) {
                        return;
                    }
                    C1181730grD c1181730grD2 = this;
                    List<C1181800grK> list2 = c1181730grD2.LLILZIL;
                    if ((list2 instanceof Collection) && ((ArrayList) list2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = ((ArrayList) list2).iterator();
                    while (it2.hasNext()) {
                        if (((C1181800grK) it2.next()).LIZIZ != EnumC1181780grI.LOAD_FINISH) {
                            AnonymousClass0956 anonymousClass0956 = c1181730grD2.LLIZ;
                            if (anonymousClass0956 != null) {
                                anonymousClass0956.LIZIZ(null);
                                c1181730grD2.LLIZ = null;
                            }
                            c1181730grD2.LLIZ = C23250099c.LIZLLL(c1181730grD2.LLILZ, null, null, new C1181760grG(c1181730grD2, c1180620gpQ3, null), 3);
                            return;
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SlashSerialLoadPlugin@753b.onComponentsResponse$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SlashSerialLoadPlugin@753b.onComponentsResponse$1");
            }
        };
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(C1181820grM.LIZ, runnable);
        }
    }
}
