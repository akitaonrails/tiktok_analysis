package X;

import Y.ACallableS60S1100000_7;
import Y.AfS43S1100000_7;
import Y.AkS104S1100000_7;
import android.os.Looper;
import com.bytedance.android.live.network.combine.LiveCombineResponse;
import com.bytedance.android.live.network.combine.LiveCombineResponseItem;
import com.bytedance.android.live.network.combine.exp.LiveCombineApiRequestSubBizLogData;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ttnet.org.chromium.net.urlconnection.i;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497120JeY<INPUT_DATA> {
    public static final C497120JeY<C496230Jd7> LJIIZILJ = new C497120JeY<>();
    public final String LIZ;
    public C0X9S<C1515820pY4<LiveCombineResponse>> LIZIZ;
    public final ExecutorService LIZJ;
    public final ExecutorService LIZLLL;
    public ConcurrentHashMap<String, AbstractC497160Jec<?, INPUT_DATA>> LJ;
    public final ConcurrentHashMap<String, String> LJFF;
    public final Set<String> LJI;
    public final Set<String> LJII;
    public INPUT_DATA LJIIIIZZ;
    public volatile AtomicInteger LJIIIZ;
    public volatile ConcurrentHashMap<String, Integer> LJIIJ;
    public volatile String LJIIJJI;
    public volatile ConcurrentHashMap<String, InterfaceC497190Jef> LJIIL;
    public final ConcurrentHashMap<String, LiveCombineResponseItem> LJIILIIL;
    public C11NJ LJIILJJIL;
    public boolean LJIILL;
    public final C497130JeZ LJIILLIIL;

    public final void LIZJ() {
        C0X9S<C1515820pY4<LiveCombineResponse>> c0x9s = this.LIZIZ;
        if (c0x9s != null) {
            c0x9s.cancel();
        }
        this.LIZIZ = null;
        this.LJI.clear();
        this.LJII.clear();
        this.LJIIL.clear();
        this.LJ = null;
        this.LJIIIIZZ = null;
        C11NJ c11nj = this.LJIILJJIL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LJIILJJIL = null;
        this.LJIILIIL.clear();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0JeZ] */
    public C497120JeY() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCombineReqeust-");
        sbLIZ.append("enter_room");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ = C786410Ut5.h4();
        this.LIZLLL = C786410Ut5.d4(3);
        new BPEAHandler(Looper.getMainLooper());
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LJII = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LJIIIZ = new AtomicInteger(0);
        this.LJIIJ = new ConcurrentHashMap<>();
        this.LJIIJJI = "";
        this.LJIIL = new ConcurrentHashMap<>();
        this.LJIILIIL = new ConcurrentHashMap<>();
        this.LJIILL = true;
        this.LJIILLIIL = new C0POE<LiveCombineResponse>(this) { // from class: X.0JeZ
            public final /* synthetic */ C497120JeY<Object> LIZ;

            @Override // X.C0POE
            public final void onComplete() {
                this.LIZ.getClass();
                C497060JeS.LIZLLL(4, this.LIZ.LJIIJJI, true);
            }

            {
                this.LIZ = this;
            }

            @Override // X.C0POE
            public final void onFailed(Throwable th) {
                LiveCombineApiRequestSubBizLogData liveCombineApiRequestSubBizLogDataLIZJ;
                this.LIZ.getClass();
                if (!(th instanceof i)) {
                    this.LIZ.LJIIIZ.incrementAndGet();
                    C497060JeS.LIZLLL(3, this.LIZ.LJIIJJI, false);
                    C497120JeY<Object> c497120JeY = this.LIZ;
                    for (String str : c497120JeY.LJI) {
                        c497120JeY.LIZ(1, str);
                        String str2 = c497120JeY.LJIIJJI;
                        if (C497060JeS.LIZ() && (liveCombineApiRequestSubBizLogDataLIZJ = C497060JeS.LIZJ(str, str2)) != null) {
                            liveCombineApiRequestSubBizLogDataLIZJ.requestState = 4;
                        }
                    }
                    return;
                }
                C497060JeS.LIZLLL(8, this.LIZ.LJIIJJI, false);
            }

            @Override // X.C0POE
            public final void onNext(LiveCombineResponse liveCombineResponse) {
                String strLJJLIIIJ;
                Map<String, LiveCombineResponseItem> combineResp;
                boolean z;
                LiveCombineApiRequestSubBizLogData liveCombineApiRequestSubBizLogDataLIZJ;
                Map<String, LiveCombineResponseItem> combineResp2;
                Set<String> setKeySet;
                LiveCombineResponse liveCombineResponse2 = liveCombineResponse;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("on chunk data arrived: ");
                if (liveCombineResponse2 != null && (combineResp2 = liveCombineResponse2.getCombineResp()) != null && (setKeySet = combineResp2.keySet()) != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(setKeySet, "|", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = null;
                }
                sbLIZ2.append(strLJJLIIIJ);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (liveCombineResponse2 != null && (combineResp = liveCombineResponse2.getCombineResp()) != null) {
                    Set<String> setKeySet2 = combineResp.keySet();
                    C497120JeY<Object> c497120JeY = this.LIZ;
                    for (String str : setKeySet2) {
                        ConcurrentHashMap<String, AbstractC497160Jec<?, Object>> concurrentHashMap = c497120JeY.LJ;
                        if (concurrentHashMap != null && concurrentHashMap.get(str) != null) {
                            LiveCombineResponseItem liveCombineResponseItem = combineResp.get(str);
                            if (liveCombineResponseItem != null) {
                                c497120JeY.LJIILIIL.put(str, liveCombineResponseItem);
                                if (c497120JeY.LJIIL.containsKey(str)) {
                                    c497120JeY.LJ(str);
                                }
                                c497120JeY.LJI.remove(str);
                                if (liveCombineResponseItem.getRespCode() == 200) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                String str2 = c497120JeY.LJIIJJI;
                                if (C497060JeS.LIZ() && (liveCombineApiRequestSubBizLogDataLIZJ = C497060JeS.LIZJ(str, str2)) != null) {
                                    if (z) {
                                        liveCombineApiRequestSubBizLogDataLIZJ.requestState = 2;
                                    } else {
                                        liveCombineApiRequestSubBizLogDataLIZJ.requestState = 3;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        };
    }

    public final void LJ(String str) {
        C11LG c11lgLJIJI = AbstractC19484711Kz.LJIJI(new ACallableS60S1100000_7((C497120JeY) this, str, (String) 2));
        ExecutorService executorService = this.LIZLLL;
        C11RO c11ro = C11S5.LIZ;
        InterfaceC420801kM interfaceC420801kMLJJIIZ = c11lgLJIJI.LJJIJIIJI(new C19501611Rm(executorService)).LJJ(new C19501611Rm(this.LIZLLL)).LJJIIZ(new C09JN() { // from class: X.0Jee
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveCombineReqeust@92d7.tryResolveResponse$2");
                C1C7U.LIZIZ("LiveCombineReqeust@92d7.tryResolveResponse$2");
            }
        }, new AfS43S1100000_7(this, str, 4));
        C11NJ c11nj = this.LJIILJJIL;
        if (c11nj != null) {
            c11nj.LIZ(interfaceC420801kMLJJIIZ);
        }
    }

    public final void LIZ(int i, String str) {
        if (this.LJIIL.containsKey(str)) {
            InterfaceC497190Jef interfaceC497190Jef = this.LJIIL.get(str);
            if (interfaceC497190Jef == null) {
                return;
            }
            interfaceC497190Jef.onError(i);
            this.LJIIL.remove(str);
            return;
        }
        this.LJII.add(str);
    }

    public final C11JN LIZIZ(final String str, final Function0 function0) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU(this) { // from class: X.0JeT
            public final /* synthetic */ C497120JeY<Object> LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<T> c09aj) {
                boolean z;
                int iIntValue;
                LiveCombineApiRequestSubBizLogData liveCombineApiRequestSubBizLogDataLIZJ;
                C1C7U.LIZ("LiveCombineReqeust@92d7.fetchCombineReqeust$1");
                String str2 = str;
                String str3 = this.LIZIZ.LJIIJJI;
                if (C497060JeS.LIZ() && (liveCombineApiRequestSubBizLogDataLIZJ = C497060JeS.LIZJ(str2, str3)) != null) {
                    liveCombineApiRequestSubBizLogDataLIZJ.LIZ = System.currentTimeMillis();
                    liveCombineApiRequestSubBizLogDataLIZJ.bizFetchState = 1;
                }
                ConcurrentHashMap<String, AbstractC497160Jec<?, Object>> concurrentHashMap = this.LIZIZ.LJ;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    c09aj.onError(new C497100JeW(3));
                    C497060JeS.LJ(str, this.LIZIZ.LJIIJJI, false);
                } else {
                    Integer num = this.LIZIZ.LJIIJ.get(str);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    LiveCombineRequestExp liveCombineRequestExp = LiveCombineRequestExp.INSTANCE;
                    if (iIntValue < liveCombineRequestExp.maxSplitErrorCount() && this.LIZIZ.LJIIIZ.get() < liveCombineRequestExp.maxCombineErrorCount()) {
                        final C497120JeY<Object> c497120JeY = this.LIZIZ;
                        final String str4 = str;
                        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                        c497120JeY.LJIIL.put(str4, new InterfaceC497190Jef() { // from class: X.0JeU
                            @Override // X.InterfaceC497190Jef
                            public final void onError(int i) {
                                C497060JeS.LJ(str4, c497120JeY.LJIIJJI, false);
                                c19482611Ke.onError(new C497100JeW(i));
                            }

                            /* JADX WARN: Type inference incomplete: some casts might be missing */
                            @Override // X.InterfaceC497190Jef
                            public final void onSuccess(Object obj) {
                                c19482611Ke.onNext((T) obj);
                                c19482611Ke.onComplete();
                            }
                        });
                        Set<String> set = c497120JeY.LJII;
                        if (set != null && set.contains(str4)) {
                            c497120JeY.LIZ(3, str4);
                        } else {
                            c497120JeY.LJ(str4);
                        }
                    } else {
                        c09aj.onError(new C497100JeW(3));
                        C497060JeS.LJ(str, this.LIZIZ.LJIIJJI, false);
                    }
                }
                C1C7U.LIZIZ("LiveCombineReqeust@92d7.fetchCombineReqeust$1");
            }
        }).LJJJ(new AkS104S1100000_7(str, this, 1), false).LJJL(new InterfaceC1487280oo2() { // from class: X.0JeX
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C11NZ<T> c11nzInvoke;
                int iIntValue;
                C11NZ<T> c11nzInvoke2;
                Throwable th = (Throwable) obj;
                if (th instanceof C497100JeW) {
                    C497100JeW c497100JeW = (C497100JeW) th;
                    if (c497100JeW.getErrType() != 3 && c497100JeW.getErrType() != 1) {
                        Integer num = this.LJIIJ.get(str);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        this.LJIIJ.put(str, Integer.valueOf(iIntValue + 1));
                        if (LiveCombineRequestExp.INSTANCE.shouldRetryWhenSplitFailed(str)) {
                            Function0<C11NZ<T>> function02 = function0;
                            if (function02 == null || (c11nzInvoke2 = function02.invoke()) == null) {
                                return C11NZ.LJJIJLIJ(th);
                            }
                            return c11nzInvoke2;
                        }
                        return C11NZ.LJJIJLIJ(th);
                    }
                    Function0<C11NZ<T>> function03 = function0;
                    if (function03 != null && (c11nzInvoke = function03.invoke()) != null) {
                        return c11nzInvoke;
                    }
                    return C11NZ.LJJIJLIJ(th);
                }
                return C11NZ.LJJIJLIJ(th);
            }
        }).LJJIJIIJI(new C516901zr(20));
    }

    public final void LIZLLL(List<String> list, Function2<? super Set<String>, ? super Set<String>, Unit> function2) {
        list.remove("/webcast/room/enter/chunk/");
        String str = this.LJFF.get("/webcast/room/enter/chunk/");
        if (str != null && str.length() != 0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str2 : list) {
                String str3 = this.LJFF.get(str2);
                if (str3 != null && str3.length() != 0) {
                    if (Intrinsics.LJFF(str3, str)) {
                        linkedHashSet.add(str2);
                    } else {
                        linkedHashSet2.add(str2);
                    }
                } else {
                    linkedHashSet2.add(str2);
                }
            }
            function2.invoke(linkedHashSet, linkedHashSet2);
            return;
        }
        function2.invoke(new LinkedHashSet(), C13LP.LLIIIZ(list));
    }
}
