package X;

import Y.ARunnableS111S0100000_11;
import Y.ARunnableS13S0201000_6;
import Y.ARunnableS44S0300000_11;
import Y.ARunnableS80S0200000_11;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.IFcpTraceRecorderService;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.GenrePriorityAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.funnel.api.FunnelContext;
import com.ss.android.ugc.feed.funnel.api.IFcpDataAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.AnnotationContainerAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS96S1000000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0RbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699060RbU implements InterfaceC697190RWj<ComponentPriorityProtocol>, InterfaceC1146704e9 {
    public final String LL;
    public final String LLILLJJLI;
    public final EnumC697700RYi LLILLL;
    public final IFcpPolicyAbility LLILZIL;
    public final InterfaceC699620RcO LLILZLL;
    public final Function0<String> LLIZ;
    public final C698730Rax LLIZLLLIL;
    public FcpMetaTagAbility LLJI;
    public int LLJILJIL;
    public LifecycleOwner LLJILJILJ;
    public Aweme LLJILLL;
    public VideoItemParams LLJJ;
    public FeedComponentPriorityData LLJJI;
    public C699340Rbw LLJZIJLIL;
    public C698250RaB LLL;
    public boolean LLLF;
    public volatile Integer LLLFF;
    public volatile long LLLFFI;
    public volatile long LLLFZ;
    public C0RYJ LLLI;
    public final Map<EnumC699120Rba, C699170Rbf> LLLIIL;
    public InterfaceC698690Rat LLLIILIL;
    public Map<String, String> LLLIL;
    public final C2252331DDr LLLILZ;
    public volatile C699100RbY LLLILZJ;
    public volatile C699100RbY LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final boolean LLILZ = true;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(507));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C590060NCi());
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C699660RcS());
    public final CopyOnWriteArrayList<C699090RbX<ComponentPriorityProtocol>> LLJJIJI = new CopyOnWriteArrayList<>();
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C699530RcF());
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C699510RcD());
    public final C01GW LLJJJ = C452501pT.LIZIZ(new C699650RcR());
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new C699520RcE());
    public final List<C699090RbX<ComponentPriorityProtocol>> LLJJJJ = new ArrayList();
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new C699640RcQ());
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new C699690RcV());
    public final C01GW LLJJL = C452501pT.LIZIZ(new C699710RcX());
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C697970RZj());
    public final C01GW LLJL = C452501pT.LIZIZ(new C1194504lr());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C1194404lq());
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C699700RcW());
    public final C01GW LLJLL = C452501pT.LIZIZ(new C699220Rbk());
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C699230Rbl());
    public final C01GW LLJLLL = C452501pT.LIZIZ(new C699670RcT());
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(506));
    public final AtomicBoolean LLLII = new AtomicBoolean(false);
    public final AtomicBoolean LLLIIII = new AtomicBoolean(false);
    public final AtomicInteger LLLIIIIL = new AtomicInteger(0);
    public final AtomicInteger LLLIIIL = new AtomicInteger(0);

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    public static boolean LJJIIJ() {
        return ((Boolean) C0B6T.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, ComponentPriorityProtocol> Aa() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = LJIJJLI().values().iterator();
        while (it2.hasNext()) {
            C699090RbX c699090RbX = (C699090RbX) it2.next();
            String componentKey = c699090RbX.LLILLJJLI.getComponentKey();
            if (componentKey != null) {
                linkedHashMap.put(componentKey, c699090RbX.LL);
            }
        }
        return linkedHashMap;
    }

    public final void LJIIIIZZ() {
        String genreType;
        String value;
        Object next;
        GlobalComponentData globalComponentData;
        EnumC700630Re1 enumC700630Re1;
        Music music;
        User author;
        if (this.LLILZLL == null) {
            return;
        }
        Aweme aweme = this.LLJILLL;
        String componentKey = null;
        if (TextUtils.isEmpty(aweme != null ? AwemeExtKt.getGenreType(aweme) : null)) {
            genreType = "video";
        } else {
            Aweme aweme2 = this.LLJILLL;
            genreType = aweme2 != null ? AwemeExtKt.getGenreType(aweme2) : null;
        }
        Aweme aweme3 = this.LLJILLL;
        String aid = aweme3 != null ? aweme3.getAid() : null;
        Aweme aweme4 = this.LLJILLL;
        String requestId = aweme4 != null ? aweme4.getRequestId() : null;
        String str = this.LLILLJJLI;
        Aweme aweme5 = this.LLJILLL;
        Integer numValueOf = aweme5 != null ? Integer.valueOf(aweme5.getAwemeType()) : null;
        Aweme aweme6 = this.LLJILLL;
        String uid = (aweme6 == null || (author = aweme6.getAuthor()) == null) ? null : author.getUid();
        Aweme aweme7 = this.LLJILLL;
        String idStr = (aweme7 == null || (music = aweme7.getMusic()) == null) ? null : music.getIdStr();
        int iLJIILLIIL = LJIILLIIL();
        FeedComponentPriorityData feedComponentPriorityData = this.LLJJI;
        if (feedComponentPriorityData == null || (enumC700630Re1 = feedComponentPriorityData.configType) == null || (value = enumC700630Re1.getValue()) == null) {
            value = "";
        }
        FunnelContext.Info info = new FunnelContext.Info(aid, requestId, str, numValueOf, genreType, uid, idStr, iLJIILLIIL, value);
        Iterator<T> it2 = LJIJJLI().values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            String componentKey2 = ((C699090RbX) next).LLILLJJLI.getComponentKey();
            if (componentKey2 != null && a0.LJJIIZI(componentKey2, "anchor", false)) {
                break;
            }
        }
        C699090RbX c699090RbX = (C699090RbX) next;
        info.setMainAnchor(c699090RbX != null ? c699090RbX.LLILZ : null);
        if (c699090RbX != null && (globalComponentData = c699090RbX.LLILLJJLI) != null) {
            componentKey = globalComponentData.getComponentKey();
        }
        info.setHighestAnchor(componentKey);
        FunnelContext funnelContext = new FunnelContext(new IFcpDataAbility() { // from class: X.0Rbp
            @Override // com.ss.android.ugc.feed.funnel.api.IFcpDataAbility
            public final ComponentContainerData container(String str2) {
                Map<String, ComponentContainerData> map;
                FeedComponentPriorityData feedComponentPriorityData2 = this.LIZ.LLJJI;
                if (feedComponentPriorityData2 == null || (map = feedComponentPriorityData2.containerMap) == null) {
                    return null;
                }
                return map.get(str2);
            }

            @Override // com.ss.android.ugc.feed.funnel.api.IFcpDataAbility
            public final GlobalComponentData protocol(String str2) {
                Map<String, GlobalComponentData> mapLJIILL = this.LIZ.LJIILL();
                if (mapLJIILL != null) {
                    return mapLJIILL.get(str2);
                }
                return null;
            }
        }, info);
        IFcpTraceRecorderService iFcpTraceRecorderService = (IFcpTraceRecorderService) this.LLJ.getValue();
        if (iFcpTraceRecorderService != null) {
            iFcpTraceRecorderService.LIZLLL(this.LLILZLL, new AwS377S0200000_11(this, funnelContext, 162));
        }
    }

    public final boolean LJIIIZ() {
        Map<C707900Rpk, List<C707890Rpj>> mapLIZ;
        InterfaceC699620RcO interfaceC699620RcO = this.LLILZLL;
        if (interfaceC699620RcO == null || (mapLIZ = interfaceC699620RcO.LIZ()) == null || this.LLLIIII.get()) {
            return false;
        }
        List list = (List) C1130204bU.LIZ.getValue();
        if (list == null) {
            return C04VL.LIZ();
        }
        if (list.isEmpty()) {
            return C04VL.LIZ();
        }
        Set<C707900Rpk> setKeySet = mapLIZ.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C707900Rpk) it2.next()).LIZ);
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (arrayList.contains(next)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return C04VL.LIZ();
    }

    public final Map<String, Integer> LJIIJJI() {
        return (Map) this.LLJL.getValue();
    }

    public final List<C699090RbX<ComponentPriorityProtocol>> LJIIL() {
        return (List) this.LLJJIJIL.getValue();
    }

    public final ConcurrentHashMap<String, C699090RbX<ComponentPriorityProtocol>> LJIILIIL() {
        return (ConcurrentHashMap) this.LLJJJ.getValue();
    }

    public final List<C699090RbX<ComponentPriorityProtocol>> LJIILJJIL() {
        return (List) this.LLJJL.getValue();
    }

    public final Map<String, GlobalComponentData> LJIILL() {
        FeedComponentPriorityData feedComponentPriorityData = this.LLJJI;
        if (feedComponentPriorityData != null) {
            return feedComponentPriorityData.globalComponentMap;
        }
        return null;
    }

    public final int LJIILLIIL() {
        FeedComponentPriorityData feedComponentPriorityData = this.LLJJI;
        if (feedComponentPriorityData != null) {
            return feedComponentPriorityData.globalShowLimit;
        }
        return 0;
    }

    public final List<C699090RbX<ComponentPriorityProtocol>> LJIIZILJ() {
        return (List) this.LLJLL.getValue();
    }

    public final List<C699090RbX<ComponentPriorityProtocol>> LJIJ() {
        return (List) this.LLJLLIL.getValue();
    }

    public final ConcurrentHashMap<String, C699090RbX<ComponentPriorityProtocol>> LJIJJ() {
        return (ConcurrentHashMap) this.LLJJJJJIL.getValue();
    }

    public final ConcurrentHashMap<String, C699090RbX<ComponentPriorityProtocol>> LJIJJLI() {
        return (ConcurrentHashMap) this.LLJJIII.getValue();
    }

    public final List<String> LJIL() {
        List<String> list;
        FeedComponentPriorityData feedComponentPriorityData = this.LLJJI;
        return (feedComponentPriorityData == null || (list = feedComponentPriorityData.rankComponentIds) == null) ? C13BV.INSTANCE : list;
    }

    public final MutableLiveData<C699090RbX<ComponentPriorityProtocol>> LJJ() {
        return (MutableLiveData) this.LLJLILLLLZIIL.getValue();
    }

    public final List<C699090RbX<ComponentPriorityProtocol>> LJJI() {
        return (List) this.LLJJJIL.getValue();
    }

    public final String LJJIFFI() {
        FeedComponentPriorityData feedComponentPriorityData = this.LLJJI;
        if (feedComponentPriorityData != null) {
            return feedComponentPriorityData.serverTrackExtra;
        }
        return null;
    }

    public final List<C699090RbX<ComponentPriorityProtocol>> LJJII() {
        return (List) this.LLJJIJIIJIL.getValue();
    }

    public final boolean LJJIIZ() {
        return ((Boolean) this.LLLJ.getValue()).booleanValue();
    }

    public final boolean LJJIJ() {
        return ((Boolean) this.LLLIZZ.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0559  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI() {
        /*
            Method dump skipped, instruction units count: 1777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C699060RbU.LJJIJIIJI():void");
    }

    public final void LJJJIL() {
        Aweme aweme;
        String value;
        Object next;
        GlobalComponentData globalComponentData;
        EnumC700630Re1 enumC700630Re1;
        if (this.LLILZLL == null || (aweme = this.LLJILLL) == null) {
            return;
        }
        String str = this.LLILLJJLI;
        int iLJIILLIIL = LJIILLIIL();
        FeedComponentPriorityData feedComponentPriorityData = this.LLJJI;
        if (feedComponentPriorityData == null || (enumC700630Re1 = feedComponentPriorityData.configType) == null || (value = enumC700630Re1.getValue()) == null) {
            value = "";
        }
        String genreType = !TextUtils.isEmpty(AwemeExtKt.getGenreType(aweme)) ? AwemeExtKt.getGenreType(aweme) : "video";
        String aid = aweme.getAid();
        String requestId = aweme.getRequestId();
        Integer numValueOf = Integer.valueOf(aweme.getAwemeType());
        User author = aweme.getAuthor();
        String componentKey = null;
        String uid = author != null ? author.getUid() : null;
        Music music = aweme.getMusic();
        FunnelContext.Info info = new FunnelContext.Info(aid, requestId, str, numValueOf, genreType, uid, String.valueOf(music != null ? Long.valueOf(music.getId()) : null), iLJIILLIIL, value);
        Iterator<T> it2 = LJIJJLI().values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            String componentKey2 = ((C699090RbX) next).LLILLJJLI.getComponentKey();
            if (componentKey2 != null && a0.LJJIIZI(componentKey2, "anchor", false)) {
                break;
            }
        }
        C699090RbX c699090RbX = (C699090RbX) next;
        info.setMainAnchor(c699090RbX != null ? c699090RbX.LLILZ : null);
        if (c699090RbX != null && (globalComponentData = c699090RbX.LLILLJJLI) != null) {
            componentKey = globalComponentData.getComponentKey();
        }
        info.setHighestAnchor(componentKey);
        FunnelContext funnelContext = new FunnelContext(new IFcpDataAbility() { // from class: X.0Rbq
            @Override // com.ss.android.ugc.feed.funnel.api.IFcpDataAbility
            public final ComponentContainerData container(String str2) {
                Map<String, ComponentContainerData> map;
                FeedComponentPriorityData feedComponentPriorityData2 = this.LIZ.LLJJI;
                if (feedComponentPriorityData2 == null || (map = feedComponentPriorityData2.containerMap) == null) {
                    return null;
                }
                return map.get(str2);
            }

            @Override // com.ss.android.ugc.feed.funnel.api.IFcpDataAbility
            public final GlobalComponentData protocol(String str2) {
                Map<String, GlobalComponentData> mapLJIILL = this.LIZ.LJIILL();
                if (mapLJIILL != null) {
                    return mapLJIILL.get(str2);
                }
                return null;
            }
        }, info);
        IFcpTraceRecorderService iFcpTraceRecorderService = (IFcpTraceRecorderService) this.LLJ.getValue();
        if (iFcpTraceRecorderService != null) {
            iFcpTraceRecorderService.LIZLLL(this.LLILZLL, new AwS377S0200000_11(this, funnelContext, 163));
        }
    }

    @Override // X.InterfaceC697190RWj
    public final void ya() {
        this.LLLII.set(false);
        this.LLLF = true;
        LIZIZ();
        C699340Rbw c699340Rbw = this.LLJZIJLIL;
        if (c699340Rbw != null) {
            final C698250RaB c698250RaB = this.LLL;
            if (LJJIIJ() && c698250RaB != null) {
                final long j = this.LLLFFI;
                Aweme aweme = this.LLJILLL;
                final String aid = aweme != null ? aweme.getAid() : null;
                final AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c699340Rbw, 1650);
                if (!c698250RaB.LIZLLL) {
                    C786410Ut5.LJJZZIII(c698250RaB.LIZJ, new Runnable() { // from class: X.0Raw
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AsyncSlotStrategyCoordinator@10b3.enqueueCleanup$2");
                            try {
                                if (!c698250RaB.LIZLLL && c698250RaB.LIZ.invoke(Long.valueOf(j), aid).booleanValue()) {
                                    awS555S0100000_11.invoke();
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AsyncSlotStrategyCoordinator@10b3.enqueueCleanup$2");
                        }
                    });
                }
            } else if (!c699340Rbw.LJIJ) {
                c699340Rbw.LIZLLL();
                C698730Rax c698730Rax = c699340Rbw.LJI;
                if (c698730Rax != null) {
                    c698730Rax.LIZ(c699340Rbw.LJIIL);
                }
                InterfaceC699310Rbt interfaceC699310Rbt = c699340Rbw.LIZ;
                if (interfaceC699310Rbt != null) {
                    interfaceC699310Rbt.LIZIZ();
                }
            }
        }
        Function0<String> function0 = this.LLIZ;
        C703900RjI c703900RjILIZ = C703870RjF.LIZ(function0 != null ? function0.invoke() : null);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            new AwS555S0100000_11(c703900RjILIZ, 1509);
            C0T6L.LIZLLL();
            c703900RjILIZ.LIZLLL(c703900RjILIZ.LIZJ, false);
        } else {
            C786410Ut5.LJJZZIII(c703900RjILIZ.LIZ, new ARunnableS111S0100000_11(c703900RjILIZ, 135));
        }
        Aweme aweme2 = this.LLJILLL;
        if (aweme2 != null) {
            aweme2.getAid();
        }
        new AwS555S0100000_11(this, 1648);
        C0T6L.LIZLLL();
        LJIIIIZZ();
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, ComponentPriorityProtocol> za() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C699090RbX<ComponentPriorityProtocol> c699090RbX : LJIJ()) {
            String strH3 = c699090RbX.LL.H3();
            if (strH3 != null) {
                linkedHashMap.put(strH3, c699090RbX.LL);
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, ComponentPriorityProtocol> Ba() {
        List listLJLI = C13LP.LJLI(C13LP.LJLI(C13LP.LLIIII(LJIJJLI().values()), C13LP.LLIIJI(C13LP.LLIIII(LJIIZILJ()))), C13LP.LLIIJI(C13LP.LLIIII(LJIJ())));
        List listLLIIII = C13LP.LLIIII(LJIJJ().values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            C699090RbX c699090RbX = (C699090RbX) obj;
            if (!c699090RbX.LLIZ || !c699090RbX.LLIZLLLIL) {
                arrayList.add(obj);
            }
        }
        List<C699090RbX> listLJLI2 = C13LP.LJLI(listLJLI, C13LP.LLIIJI(arrayList));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C699090RbX c699090RbX2 : listLJLI2) {
            String strH3 = c699090RbX2.LL.H3();
            if (strH3 != null) {
                linkedHashMap.put(strH3, c699090RbX2.LL);
            }
        }
        return linkedHashMap;
    }

    public final void LIZIZ() {
        if (LJJIIJ()) {
            this.LLLFFI++;
            this.LLLFZ = 0L;
            C698250RaB c698250RaB = this.LLL;
            if (c698250RaB != null) {
                if (c698250RaB.LJ == null && c698250RaB.LJFF == null) {
                    return;
                }
                c698250RaB.LJ = null;
                c698250RaB.LJFF = null;
                c698250RaB.LIZJ.removeCallbacksAndMessages(null);
            }
        }
    }

    public final boolean LJJIIZI() {
        for (Map.Entry<String, C699090RbX<ComponentPriorityProtocol>> entry : LJIJJ().entrySet()) {
            String key = entry.getKey();
            C699090RbX<ComponentPriorityProtocol> value = entry.getValue();
            Set<String> set = C700100RdA.LIZ;
            if (!C700100RdA.LIZIZ.contains(key) && !value.LLIZLLLIL) {
                return false;
            }
        }
        return true;
    }

    public final void LJJIJLIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("funnel emit. aid: ");
        Aweme aweme = this.LLJILLL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLILZ.LIZJ(Boolean.TRUE);
    }

    public final void LJJIL() {
        int iIntValue;
        int i;
        C08XD.LJIL(LJIIZILJ());
        List<C699090RbX<ComponentPriorityProtocol>> listLJIIZILJ = LJIIZILJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C699090RbX<ComponentPriorityProtocol> c699090RbX : listLJIIZILJ) {
            String parentContainerKey = c699090RbX.LLILLJJLI.getParentContainerKey();
            Object arrayList = linkedHashMap.get(parentContainerKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(parentContainerKey, arrayList);
            }
            ((List) arrayList).add(c699090RbX);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            Integer num = (Integer) ((Map) this.LLJLIL.getValue()).get(key);
            if (num != null && (iIntValue = num.intValue()) != Integer.MAX_VALUE) {
                int size = list.size();
                if (iIntValue == -1) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((C699090RbX) it2.next()).LLJ = Boolean.FALSE;
                    }
                } else {
                    List<C699090RbX<ComponentPriorityProtocol>> listLJJI = LJJI();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<C699090RbX<ComponentPriorityProtocol>> it3 = listLJJI.iterator();
                    while (true) {
                        i = 0;
                        if (!it3.hasNext()) {
                            break;
                        }
                        C699090RbX<ComponentPriorityProtocol> next = it3.next();
                        C699090RbX<ComponentPriorityProtocol> c699090RbX2 = next;
                        if (Intrinsics.LJFF(c699090RbX2.LLILLJJLI.getParentContainerKey(), key) && c699090RbX2.LLILLJJLI.getShowStrategy() == 2) {
                            arrayList2.add(next);
                        }
                    }
                    int iMax = Math.max((arrayList2.size() + list.size()) - iIntValue, 0);
                    if (iMax > 0) {
                        do {
                            ((C699090RbX) ListProtector.get(list, (size - 1) - i)).LLJ = Boolean.FALSE;
                            i++;
                        } while (i < iMax);
                    }
                }
            }
        }
    }

    public final void LJJJJ() {
        List<Pair<String, Boolean>> list;
        if (LJJIIZI()) {
            Iterator<C699090RbX<ComponentPriorityProtocol>> it2 = LJJI().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C699090RbX<ComponentPriorityProtocol> next = it2.next();
                C700450Rdj c700450RdjVN0 = next.LL.vN0();
                if (!(c700450RdjVN0 instanceof C700040Rd4) || ((C700040Rd4) c700450RdjVN0).LIZLLL == null) {
                    C20653815rs c20653815rs = C20653815rs.LIZ;
                    Aweme aweme = this.LLJILLL;
                    String aid = aweme != null ? aweme.getAid() : null;
                    String str = next.LLILZ;
                    Aweme aweme2 = this.LLJILLL;
                    String requestId = aweme2 != null ? aweme2.getRequestId() : null;
                    c20653815rs.getClass();
                    C20653815rs.LIZLLL(aid, str, requestId);
                }
            }
            List<C699090RbX<ComponentPriorityProtocol>> listLJJI = LJJI();
            ArrayList arrayList = new ArrayList();
            Iterator<C699090RbX<ComponentPriorityProtocol>> it3 = listLJJI.iterator();
            while (it3.hasNext()) {
                String strH3 = it3.next().LL.H3();
                if (strH3 != null) {
                    arrayList.add(strH3);
                }
            }
            List<C699090RbX<ComponentPriorityProtocol>> listLJJII = LJJII();
            ArrayList arrayList2 = new ArrayList();
            Iterator<C699090RbX<ComponentPriorityProtocol>> it4 = listLJJII.iterator();
            while (it4.hasNext()) {
                String strH32 = it4.next().LL.H3();
                if (strH32 != null) {
                    arrayList2.add(strH32);
                }
            }
            List listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it5 = LJIJJLI().values().iterator();
            while (it5.hasNext()) {
                C699090RbX c699090RbX = (C699090RbX) it5.next();
                T t = c699090RbX.LL;
                boolean z = !C13LP.LJJJJ(t.H3(), listLJLIL);
                if (z) {
                    LJJJJIZL(c699090RbX, C1AV3.LIZ(2, "Feed", null, "maker"));
                } else {
                    C699500RcC c699500RcCII = c699090RbX.LL.II();
                    if (c699500RcCII != null) {
                        int i = C699290Rbr.LIZ[c699500RcCII.LIZIZ.ordinal()];
                        if (i == 1) {
                            List<C699090RbX<ComponentPriorityProtocol>> listLJJI2 = LJJI();
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJI2, 10));
                            Iterator<C699090RbX<ComponentPriorityProtocol>> it6 = listLJJI2.iterator();
                            while (it6.hasNext()) {
                                arrayList3.add(it6.next().LLILZ);
                            }
                            if (C13LP.LJJL(arrayList3, c699500RcCII.LIZ).isEmpty()) {
                                c699090RbX.LLJI.compareAndSet(false, true);
                                LJJJJIZL(c699090RbX, C1AV3.LIZ(2, "Feed", null, "maker"));
                            }
                        } else {
                            if (i != 2) {
                                throw new C1954807lC();
                            }
                            List<C699090RbX<ComponentPriorityProtocol>> listLJJI3 = LJJI();
                            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLJJI3, 10));
                            Iterator<C699090RbX<ComponentPriorityProtocol>> it7 = listLJJI3.iterator();
                            while (it7.hasNext()) {
                                arrayList4.add(it7.next().LLILZ);
                            }
                            if (!C13LP.LJJL(arrayList4, c699500RcCII.LIZ).isEmpty()) {
                                c699090RbX.LLJI.compareAndSet(false, true);
                                LJJJJIZL(c699090RbX, C1AV3.LIZ(2, "Feed", null, "maker"));
                            }
                        }
                    }
                }
                if (!Intrinsics.LJFF(Boolean.valueOf(z), c699090RbX.LLJILJIL)) {
                    c699090RbX.LLJILJIL = Boolean.valueOf(z);
                }
                String strLLLII = t.LLLII();
                if (strLLLII != null) {
                    String matchedContainerKey = c699090RbX.LLILLJJLI.getMatchedContainerKey();
                    Object arrayList5 = linkedHashMap.get(matchedContainerKey);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(matchedContainerKey, arrayList5);
                    }
                    ((List) arrayList5).add(new Pair(strLLLII, Boolean.valueOf(z)));
                }
                FcpContainerProtocol fcpContainerProtocol = (FcpContainerProtocol) ((Map) this.LLJJLIIIJLLLLLLLZ.getValue()).get(c699090RbX.LLILLJJLI.getMatchedContainerKey());
                if (fcpContainerProtocol != null) {
                    fcpContainerProtocol.Mx();
                }
                t.Bh2(z);
            }
            for (Map.Entry entry : ((Map) this.LLJJLIIIJLLLLLLLZ.getValue()).entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "bottom_tag_container")) {
                    Collection arrayList6 = (Collection) linkedHashMap.get(entry.getKey());
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    ArrayList arrayList7 = new ArrayList(arrayList6);
                    Object obj = (Collection) linkedHashMap.get("standardized_bottom_tag");
                    if (obj == null) {
                        obj = C13BV.INSTANCE;
                    }
                    arrayList7.addAll(obj);
                    list = arrayList7;
                } else {
                    list = (List) linkedHashMap.get(entry.getKey());
                }
                FcpContainerProtocol fcpContainerProtocol2 = (FcpContainerProtocol) entry.getValue();
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                fcpContainerProtocol2.b62(list);
            }
            InterfaceC698690Rat interfaceC698690Rat = this.LLLIILIL;
            if (interfaceC698690Rat != null) {
                interfaceC698690Rat.O7();
            }
        }
    }

    @Override // X.InterfaceC697190RWj
    public final void unBind() {
        InterfaceC699310Rbt interfaceC699310Rbt;
        Iterator<C699090RbX<ComponentPriorityProtocol>> it2 = LJJI().iterator();
        while (it2.hasNext()) {
            ((C700470Rdl) it2.next().LLJILLL.getValue()).LJ.invoke();
        }
        LIZIZ();
        C699340Rbw c699340Rbw = this.LLJZIJLIL;
        Aweme aweme = this.LLJILLL;
        if (aweme != null) {
            AwemeBizExtKt.setSlotStrategySnapshot(aweme, (c699340Rbw == null || (interfaceC699310Rbt = c699340Rbw.LIZ) == null) ? null : interfaceC699310Rbt.LJ());
        }
        C698730Rax c698730Rax = this.LLIZLLLIL;
        if (c698730Rax != null) {
            c698730Rax.LIZJ.clear();
            c698730Rax.LIZ(null);
        }
        this.LLJZIJLIL = null;
        if (c699340Rbw != null) {
            c699340Rbw.LJIIL();
            C698250RaB c698250RaB = this.LLL;
            if (!LJJIIJ() || c698250RaB == null) {
                c699340Rbw.LJ();
            } else {
                AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c699340Rbw, 1651);
                if (!c698250RaB.LIZLLL) {
                    C786410Ut5.LJJZZIII(c698250RaB.LIZJ, new ARunnableS80S0200000_11(c698250RaB, awS555S0100000_11, 34));
                }
            }
        }
        this.LLLF = false;
        Function0<String> function0 = this.LLIZ;
        C703870RjF.LIZJ(function0 != null ? function0.invoke() : null);
        this.LLJILJIL = 0;
        this.LLLFF = null;
        Aweme aweme2 = this.LLJILLL;
        if (aweme2 != null) {
            aweme2.getAid();
        }
        new C699830Rcj();
        C0T6L.LIZLLL();
        Iterator<C699090RbX<ComponentPriorityProtocol>> it3 = LJIIZILJ().iterator();
        while (it3.hasNext()) {
            LJJJI(it3.next().LL);
        }
        LJIIZILJ().clear();
        Iterator<C699090RbX<ComponentPriorityProtocol>> it4 = LJIJ().iterator();
        while (it4.hasNext()) {
            LJJJI(it4.next().LL);
        }
        LJIJ().clear();
        LJIIL().clear();
        LJIILIIL().clear();
        this.LLJJIJI.clear();
        LJJI().clear();
        ((ArrayList) this.LLJJJJ).clear();
        C1384605bQ.LIZIZ(LJJ(), null);
        LJIJJ().clear();
        C1384605bQ.LIZIZ((MutableLiveData) this.LLJJJJLIIL.getValue(), null);
        LJJII().clear();
        LJIILJJIL().clear();
        C698800Rb4.LIZ.getClass();
        ((ArrayList) C698800Rb4.LIZIZ).clear();
        LJIJJLI().clear();
        Iterator<Map.Entry<EnumC699120Rba, C699170Rbf>> it5 = this.LLLIIL.entrySet().iterator();
        while (it5.hasNext()) {
            it5.next().getValue().LIZJ();
        }
    }

    @Override // X.InterfaceC697190RWj
    public final EnumC697700RYi Ca() {
        return this.LLILLL;
    }

    public static void LJJIJIIJIL(C699060RbU c699060RbU) {
        if (c699060RbU.LJJIIZI()) {
            if (!C0SVA.LIZ() && !C1111204Wg.LIZ()) {
                c699060RbU.LJFF(new AwS377S0200000_11(c699060RbU, (C699060RbU) null, (Function1<? super C698810Rb5, Unit>) 166));
                return;
            }
            if (c699060RbU.LJJIJ()) {
                C20684815ws.LJFF().submit(new RunnableC698710Rav(c699060RbU, new C698820Rb6(c699060RbU, null)));
                return;
            }
            Collection<C699090RbX<ComponentPriorityProtocol>> collectionValues = c699060RbU.LJIJJ().values();
            if (!collectionValues.isEmpty()) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    if (!(!((C699090RbX) it2.next()).LLJIJIL)) {
                        return;
                    }
                }
            }
            if (c699060RbU.LJJIIZ()) {
                C20684815ws.LJFF().submit(new RunnableC698710Rav(c699060RbU, new AwS377S0200000_11(c699060RbU, (C699060RbU) null, (Function1<? super C698810Rb5, Unit>) 164)));
            } else {
                c699060RbU.LJFF(new AwS377S0200000_11(c699060RbU, (C699060RbU) null, (Function1<? super C698810Rb5, Unit>) 165));
            }
            Collection<C699090RbX<ComponentPriorityProtocol>> collectionValues2 = c699060RbU.LJIJJ().values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues2) {
                if (((C699090RbX) obj).LLIZ) {
                    arrayList.add(obj);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((C699090RbX) it3.next()).LLJIJIL = true;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJFF(Function1<? super C698810Rb5, Unit> function1) {
        Map mapLJ;
        FeedComponentPriorityData feedComponentPriorityDataCopy;
        List<String> listLLIIII;
        List<String> listLLIIII2;
        Map mapLJIIZILJ;
        List<String> listLLIIII3;
        List<String> listLLIIII4;
        String strLIZJ;
        String strLIZJ2;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List<String> arrayList7;
        List<String> listLLIIII5;
        Iterable arrayList8;
        List list;
        List<String> listLIZIZ;
        ArrayList arrayList9;
        Map<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>> mapLIZ;
        List listLJIIIIZZ;
        List<String> listLLILL;
        Map<String, String> mapK22;
        List<String> listLLILL2;
        List<String> listLLILL3;
        List<String> listLLILL4;
        List<String> listLLLZIIL;
        List<String> listIs;
        Map<String, List<String>> mapDL;
        List<String> listLLLZIIL2;
        List<String> listLLLZIIL3;
        List<String> listLLLZIIL4;
        List<String> listLLIIIL;
        String aid;
        List list2;
        C697910RZd next;
        boolean z;
        boolean z2;
        GlobalComponentData globalComponentData;
        try {
            try {
                mapLJ = (Map) C08JS.LIZIZ().LJIIIIZZ(LJJIFFI(), new TypeToken<Map<String, ? extends String>>() { // from class: X.0RcB
                }.getType());
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                mapLJ = C2097608Jq.LJ();
            }
            C698810Rb5 c698810Rb5 = new C698810Rb5();
            c698810Rb5.LJIILL = LJIILLIIL();
            LJJIL();
            c698810Rb5.LJIILIIL = LJJIFFI();
            if (!mapLJ.isEmpty()) {
                for (Map.Entry entry : mapLJ.entrySet()) {
                    c698810Rb5.LJIIL.put((String) entry.getKey(), (String) entry.getValue());
                    ((ArrayList) c698810Rb5.LJIIJJI).addAll(a0.LJJLIIIJ((CharSequence) entry.getValue(), new char[]{','}, false, 0, 6));
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            new LinkedHashSet();
            new LinkedHashSet();
            if (C0B83.LIZ()) {
                Aweme aweme = this.LLJILLL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                C697900RZc c697900RZcLIZ = C697890RZb.LIZ(aid);
                if (c697900RZcLIZ == null) {
                    return;
                }
                Set setLLIIIZ = C13LP.LLIIIZ(c697900RZcLIZ.LIZ.keySet());
                for (Map.Entry<String, CopyOnWriteArrayList<C697910RZd>> entry2 : c697900RZcLIZ.LIZ.entrySet()) {
                    String key = entry2.getKey();
                    CopyOnWriteArrayList<C697910RZd> value = entry2.getValue();
                    Iterator<C697910RZd> it2 = value.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.LIZIZ == C0RZ2.FAILED) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C697910RZd c697910RZd = next;
                    if (c697910RZd != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Iterator<C697910RZd> it3 = value.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C697910RZd next2 = it3.next();
                        if (Intrinsics.LJFF(next2.LIZ.name(), "FINALSHOW")) {
                            if (next2 != null) {
                                z2 = false;
                            }
                        }
                    }
                    z2 = true;
                    if (!z && !z2) {
                        ((ArrayList) c698810Rb5.LIZLLL).add(key);
                        Map<String, GlobalComponentData> mapLJIILL = LJIILL();
                        if (mapLJIILL != null && (globalComponentData = mapLJIILL.get(key)) != null) {
                            if (globalComponentData.getShowStrategy() == 2) {
                                ((ArrayList) c698810Rb5.LJFF).add(key);
                            } else if (globalComponentData.getShowStrategy() == 1) {
                                linkedHashSet.add(key);
                            }
                        }
                    } else if (c697910RZd != null) {
                        if (!Intrinsics.LJFF(c697910RZd.LIZ.name(), "N2ONE") && !Intrinsics.LJFF(c697910RZd.LIZ.name(), "CONTAINERAVOID")) {
                            if (Intrinsics.LJFF(c697910RZd.LIZ.name(), "GLOBALAVOID")) {
                                ((ArrayList) c698810Rb5.LIZJ).add(key);
                            } else if (Intrinsics.LJFF(c697910RZd.LIZ.name(), "FINALFILTER")) {
                                ((ArrayList) c698810Rb5.LJI).add(key);
                            } else if (Intrinsics.LJFF(c697910RZd.LIZ.name(), "BIZ_ENABLE")) {
                                c698810Rb5.LIZ.add(key);
                            }
                        } else {
                            ((ArrayList) c698810Rb5.LIZIZ).add(key);
                        }
                        c698810Rb5.LJIIIZ.add(key);
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("container_avoid_component_ids", C13LP.LJJLIIIJ(C13LP.LJJJJI(c698810Rb5.LIZIZ), ",", null, null, 0, null, null, 62));
                jSONObject.put("global_avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LIZJ, ",", null, null, 0, null, null, 62));
                jSONObject.put("client_final_filter_avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LJI, ",", null, null, 0, null, null, 62));
                c698810Rb5.LJIIJ = C786410Ut5.J3(jSONObject);
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(c698810Rb5.LJIIIZ);
                arrayList10.addAll(c698810Rb5.LJIIJJI);
                c698810Rb5.LIZ(arrayList10);
                Set setLJJL = C13LP.LJJL(C13LP.LLIIJI(C15442062u.LJII(setLLIIIZ, linkedHashSet)), C13LP.LLIIJI(LJIL()));
                List<String> listLLIIIL2 = C13LP.LLIIIL(setLJJL);
                C08XD.LJJ(listLLIIIL2, AnonymousClass0347.LIZ(LJIL()));
                c698810Rb5.LJ(listLLIIIL2);
                List<String> listLLIIIL3 = C13LP.LLIIIL(setLJJL);
                FeedComponentPriorityData feedComponentPriorityData = this.LLJJI;
                if (feedComponentPriorityData == null || (list2 = feedComponentPriorityData.reRankComponentIds) == null) {
                    list2 = C13BV.INSTANCE;
                }
                C08XD.LJJ(listLLIIIL3, AnonymousClass0347.LIZ(list2));
                c698810Rb5.LJFF(listLLIIIL3);
                C13LP.LLIIIZ(C13LP.LJJJJLI(c698810Rb5.LIZLLL));
            } else {
                FeedComponentPriorityData feedComponentPriorityData2 = this.LLJJI;
                if (feedComponentPriorityData2 != null) {
                    List<String> list3 = feedComponentPriorityData2.priorityList;
                    if (list3 != null) {
                        listLLIIIL = C13LP.LLIIIL(list3);
                    } else {
                        listLLIIIL = null;
                    }
                    feedComponentPriorityDataCopy = feedComponentPriorityData2.copy(feedComponentPriorityData2.treeStructure, feedComponentPriorityData2.globalComponentList, feedComponentPriorityData2.globalShowLimit, feedComponentPriorityData2.containerMap, listLLIIIL, feedComponentPriorityData2.alreadyDisableComponents, feedComponentPriorityData2.finalFilterComponents, feedComponentPriorityData2.rankComponentIds, feedComponentPriorityData2.reRankComponentIds, feedComponentPriorityData2.serverTrackExtra, feedComponentPriorityData2.configType, feedComponentPriorityData2.globalComponentMap, feedComponentPriorityData2.componentPreloadConfig);
                } else {
                    feedComponentPriorityDataCopy = null;
                }
                LifecycleOwner lifecycleOwner = this.LLJILJILJ;
                if (lifecycleOwner == null) {
                    lifecycleOwner = null;
                }
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((BaseCellContentComponent) lifecycleOwner);
                List<String> listLLIIII6 = null;
                BottomBarPriorityAbility bottomBarPriorityAbility = (BottomBarPriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, BottomBarPriorityAbility.class, null);
                if (bottomBarPriorityAbility != null && (listLLLZIIL4 = bottomBarPriorityAbility.LLLZIIL()) != null) {
                    listLLIIII6 = C13LP.LLIIII(listLLLZIIL4);
                }
                FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, FeedBottomButtonAbility.class, null);
                if (feedBottomButtonAbility != null && (listLLLZIIL3 = feedBottomButtonAbility.LLLZIIL()) != null) {
                    listLLIIII = C13LP.LLIIII(listLLLZIIL3);
                } else {
                    listLLIIII = null;
                }
                FcpMetaTagAbility fcpMetaTagAbilityLJIJI = LJIJI(interfaceC665370Q7zLJIIL);
                if (fcpMetaTagAbilityLJIJI != null && (listLLLZIIL2 = fcpMetaTagAbilityLJIJI.LLLZIIL()) != null) {
                    listLLIIII2 = C13LP.LLIIII(listLLLZIIL2);
                } else {
                    listLLIIII2 = null;
                }
                CategoryPriorityAbility categoryPriorityAbility = (CategoryPriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, CategoryPriorityAbility.class, null);
                if (categoryPriorityAbility != null && (mapDL = categoryPriorityAbility.DL()) != null) {
                    mapLJIIZILJ = C2097608Jq.LJIIZILJ(mapDL);
                } else {
                    mapLJIIZILJ = null;
                }
                GenrePriorityAbility genrePriorityAbility = (GenrePriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, GenrePriorityAbility.class, null);
                if (genrePriorityAbility != null && (listIs = genrePriorityAbility.is()) != null) {
                    listLLIIII3 = C13LP.LLIIII(listIs);
                } else {
                    listLLIIII3 = null;
                }
                AnnotationContainerAbility annotationContainerAbility = (AnnotationContainerAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, AnnotationContainerAbility.class, null);
                if (annotationContainerAbility != null && (listLLLZIIL = annotationContainerAbility.LLLZIIL()) != null) {
                    listLLIIII4 = C13LP.LLIIII(listLLLZIIL);
                } else {
                    listLLIIII4 = null;
                }
                List<C699090RbX> listLLIIII7 = C13LP.LLIIII(LJJI());
                List<C699090RbX> listLLIIII8 = C13LP.LLIIII(LJIIZILJ());
                List listLLIIII9 = C13LP.LLIIII(LJIILJJIL());
                List listLLIIII10 = C13LP.LLIIII(LJJII());
                if (LJJIJ()) {
                    BottomBarPriorityAbility bottomBarPriorityAbility2 = (BottomBarPriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, BottomBarPriorityAbility.class, null);
                    if (bottomBarPriorityAbility2 != null && (listLLILL4 = bottomBarPriorityAbility2.LLILL()) != null) {
                        strLIZJ = (String) C13LP.LJJJLZIJ(0, listLLILL4);
                    } else {
                        strLIZJ = null;
                    }
                } else {
                    C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
                    EnumC697700RYi enumC697700RYi = EnumC697700RYi.BOTTOM_BANNER;
                    c698800Rb4.getClass();
                    strLIZJ = C698800Rb4.LIZJ(feedComponentPriorityDataCopy, listLLIIII6, enumC697700RYi);
                }
                if (LJJIJ()) {
                    FeedBottomButtonAbility feedBottomButtonAbility2 = (FeedBottomButtonAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, FeedBottomButtonAbility.class, null);
                    if (feedBottomButtonAbility2 != null && (listLLILL3 = feedBottomButtonAbility2.LLILL()) != null) {
                        strLIZJ2 = (String) C13LP.LJJJLZIJ(0, listLLILL3);
                    } else {
                        strLIZJ2 = null;
                    }
                } else {
                    C698800Rb4 c698800Rb42 = C698800Rb4.LIZ;
                    EnumC697700RYi enumC697700RYi2 = EnumC697700RYi.BOTTOM_BUTTON;
                    c698800Rb42.getClass();
                    strLIZJ2 = C698800Rb4.LIZJ(feedComponentPriorityDataCopy, listLLIIII, enumC697700RYi2);
                }
                FcpMetaTagAbility fcpMetaTagAbilityLJIJI2 = LJIJI(interfaceC665370Q7zLJIIL);
                if (fcpMetaTagAbilityLJIJI2 != null && (listLLILL2 = fcpMetaTagAbilityLJIJI2.LLILL()) != null) {
                    str = (String) C13LP.LJJJLZIJ(0, listLLILL2);
                } else {
                    str = null;
                }
                ArrayList arrayList11 = null;
                CategoryPriorityAbility categoryPriorityAbility2 = (CategoryPriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, CategoryPriorityAbility.class, null);
                if (categoryPriorityAbility2 != null && (mapK22 = categoryPriorityAbility2.k22()) != null) {
                    arrayList11 = new ArrayList(mapK22.size());
                    Iterator<Map.Entry<String, String>> it4 = mapK22.entrySet().iterator();
                    while (it4.hasNext()) {
                        arrayList11.add(it4.next().getValue());
                    }
                }
                C698800Rb4 c698800Rb43 = C698800Rb4.LIZ;
                EnumC697700RYi enumC697700RYi3 = EnumC697700RYi.VIDEO_GENRE_TAG;
                c698800Rb43.getClass();
                String strLIZJ3 = C698800Rb4.LIZJ(feedComponentPriorityDataCopy, listLLIIII3, enumC697700RYi3);
                List listLLIIII11 = null;
                AnnotationContainerAbility annotationContainerAbility2 = (AnnotationContainerAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, AnnotationContainerAbility.class, null);
                if (annotationContainerAbility2 != null && (listLLILL = annotationContainerAbility2.LLILL()) != null) {
                    listLLIIII11 = C13LP.LLIIII(listLLILL);
                }
                if (listLLIIII4 != null) {
                    arrayList = new ArrayList();
                    for (String str2 : listLLIIII4) {
                        String str3 = str2;
                        if (listLLIIII11 == null || !listLLIIII11.contains(str3)) {
                            arrayList.add(str2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (listLLIIII6 != null) {
                    arrayList2 = new ArrayList();
                    for (String str4 : listLLIIII6) {
                        if (!u.LJIJI(str4, strLIZJ, true)) {
                            arrayList2.add(str4);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (listLLIIII != null) {
                    arrayList3 = new ArrayList();
                    for (String str5 : listLLIIII) {
                        if (!u.LJIJI(str5, strLIZJ2, true)) {
                            arrayList3.add(str5);
                        }
                    }
                } else {
                    arrayList3 = null;
                }
                if (listLLIIII2 != null) {
                    arrayList4 = new ArrayList();
                    for (String str6 : listLLIIII2) {
                        if (!u.LJIJI(str6, str, true)) {
                            arrayList4.add(str6);
                        }
                    }
                } else {
                    arrayList4 = null;
                }
                if (mapLJIIZILJ != null) {
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it5 = mapLJIIZILJ.entrySet().iterator();
                    while (it5.hasNext()) {
                        C19719612Di.LJJI((Iterable) ((Map.Entry) it5.next()).getValue(), arrayList12);
                    }
                    arrayList5 = new ArrayList();
                    for (Object obj : arrayList12) {
                        String str7 = (String) obj;
                        if (arrayList11 == null) {
                            listLJIIIIZZ = C1697810uHb.LJIIIIZZ();
                        } else {
                            listLJIIIIZZ = arrayList11;
                        }
                        if (!listLJIIIIZZ.contains(str7)) {
                            arrayList5.add(obj);
                        }
                    }
                } else {
                    arrayList5 = null;
                }
                if (listLLIIII3 != null) {
                    arrayList6 = new ArrayList();
                    for (String str8 : listLLIIII3) {
                        if (!u.LJIJI(str8, strLIZJ3, true)) {
                            arrayList6.add(str8);
                        }
                    }
                } else {
                    arrayList6 = null;
                }
                C0RYJ c0ryj = this.LLLI;
                if (c0ryj != null && (mapLIZ = c0ryj.LIZ()) != null) {
                    ArrayList arrayList13 = new ArrayList();
                    Iterator<Map.Entry<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>>> it6 = mapLIZ.entrySet().iterator();
                    while (it6.hasNext()) {
                        C19719612Di.LJJI(it6.next().getValue().za().keySet(), arrayList13);
                    }
                    arrayList7 = C13LP.LLIIIL(C13LP.LJJJJLI(arrayList13));
                } else {
                    arrayList7 = new ArrayList<>();
                }
                c698810Rb5.LIZLLL(arrayList7);
                for (C699090RbX c699090RbX : listLLIIII8) {
                    if (Intrinsics.LJFF(c699090RbX.LLJ, Boolean.TRUE)) {
                        ((ArrayList) c698810Rb5.LIZJ).add(c699090RbX.LL.H3());
                    } else if (Intrinsics.LJFF(c699090RbX.LLJ, Boolean.FALSE)) {
                        ((ArrayList) c698810Rb5.LIZIZ).add(c699090RbX.LL.H3());
                    }
                    c698810Rb5.LJIIIZ.add(c699090RbX.LL.H3());
                }
                LIZJ(c698810Rb5.LIZIZ, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList);
                LIZJ(c698810Rb5.LJIIIZ, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList);
                if (mapLJIIZILJ != null) {
                    ArrayList arrayList14 = new ArrayList();
                    Iterator it7 = mapLJIIZILJ.entrySet().iterator();
                    while (it7.hasNext()) {
                        C19719612Di.LJJI((Iterable) ((Map.Entry) it7.next()).getValue(), arrayList14);
                    }
                    listLLIIII5 = C13LP.LLIIII(arrayList14);
                } else {
                    listLLIIII5 = null;
                }
                for (C699090RbX c699090RbX2 : listLLIIII7) {
                    ((ArrayList) c698810Rb5.LIZLLL).add(c699090RbX2.LL.H3());
                    if (c699090RbX2.LLILLJJLI.getShowStrategy() == 2) {
                        ((ArrayList) c698810Rb5.LJFF).add(c699090RbX2.LL.H3());
                    }
                    String matchedContainerKey = c699090RbX2.LLILLJJLI.getMatchedContainerKey();
                    switch (matchedContainerKey.hashCode()) {
                        case -1684919427:
                            if (matchedContainerKey.equals("high_tag")) {
                            }
                            break;
                        case -1613157440:
                            if (matchedContainerKey.equals("bottom_banner")) {
                                if (listLLIIII6 != null) {
                                    ArrayList arrayList15 = new ArrayList();
                                    for (String str9 : listLLIIII6) {
                                        if (!Intrinsics.LJFF(str9, c699090RbX2.LL.H3())) {
                                            arrayList15.add(str9);
                                        }
                                    }
                                    listLLIIII6 = arrayList15;
                                } else {
                                    listLLIIII6 = null;
                                }
                            }
                            break;
                        case -1594502202:
                            if (matchedContainerKey.equals("bottom_button")) {
                                if (listLLIIII != null) {
                                    ArrayList arrayList16 = new ArrayList();
                                    for (String str10 : listLLIIII) {
                                        if (!Intrinsics.LJFF(str10, c699090RbX2.LL.H3())) {
                                            arrayList16.add(str10);
                                        }
                                    }
                                    listLLIIII = arrayList16;
                                } else {
                                    listLLIIII = null;
                                }
                            }
                            break;
                        case -513457295:
                            if (matchedContainerKey.equals("annotation_container")) {
                                if (listLLIIII4 != null) {
                                    ArrayList arrayList17 = new ArrayList();
                                    for (String str11 : listLLIIII4) {
                                        if (!Intrinsics.LJFF(str11, c699090RbX2.LL.H3())) {
                                            arrayList17.add(str11);
                                        }
                                    }
                                    listLLIIII4 = arrayList17;
                                } else {
                                    listLLIIII4 = null;
                                }
                            }
                            break;
                        case -450135456:
                            if (matchedContainerKey.equals("meta_tag")) {
                                if (listLLIIII2 != null) {
                                    arrayList9 = new ArrayList();
                                    for (String str12 : listLLIIII2) {
                                        if (!Intrinsics.LJFF(str12, c699090RbX2.LL.H3())) {
                                            arrayList9.add(str12);
                                        }
                                    }
                                } else {
                                    arrayList9 = null;
                                }
                                listLLIIII2 = arrayList9;
                            }
                            break;
                        case 356829231:
                            if (matchedContainerKey.equals("low_tag")) {
                            }
                            break;
                        case 647069406:
                            if (matchedContainerKey.equals("genre_tag")) {
                                if (listLLIIII3 != null) {
                                    ArrayList arrayList18 = new ArrayList();
                                    for (String str13 : listLLIIII3) {
                                        if (!Intrinsics.LJFF(str13, c699090RbX2.LL.H3())) {
                                            arrayList18.add(str13);
                                        }
                                    }
                                    listLLIIII3 = arrayList18;
                                } else {
                                    listLLIIII3 = null;
                                }
                            }
                            break;
                    }
                    if (listLLIIII5 != null) {
                        ArrayList arrayList19 = new ArrayList();
                        for (String str14 : listLLIIII5) {
                            if (!Intrinsics.LJFF(str14, c699090RbX2.LL.H3())) {
                                arrayList19.add(str14);
                            }
                        }
                        listLLIIII5 = arrayList19;
                    } else {
                        listLLIIII5 = null;
                    }
                }
                String aid2 = null;
                LIZLLL(c698810Rb5.LJFF, listLLIIII6, listLLIIII, listLLIIII5, listLLIIII3, listLLIIII2, listLLIIII4);
                c698810Rb5.LJIILIIL = LJJIFFI();
                if (!mapLJ.isEmpty()) {
                    for (Map.Entry entry3 : mapLJ.entrySet()) {
                        c698810Rb5.LJIIL.put((String) entry3.getKey(), (String) entry3.getValue());
                        ((ArrayList) c698810Rb5.LJIIJJI).addAll(a0.LJJLIIIJ((CharSequence) entry3.getValue(), new char[]{','}, false, 0, 6));
                    }
                }
                ArrayList arrayList20 = new ArrayList();
                Iterator it8 = listLLIIII9.iterator();
                while (it8.hasNext()) {
                    String componentKey = ((C699090RbX) it8.next()).LLILLJJLI.getComponentKey();
                    if (componentKey != null) {
                        arrayList20.add(componentKey);
                    }
                }
                Set setLLIIJI = C13LP.LLIIJI(arrayList20);
                ((ArrayList) c698810Rb5.LJI).addAll(setLLIIJI);
                c698810Rb5.LJIIIZ.addAll(setLLIIJI);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("container_avoid_component_ids", C13LP.LJJLIIIJ(C13LP.LJJJJI(c698810Rb5.LIZIZ), ",", null, null, 0, null, null, 62));
                jSONObject2.put("global_avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LIZJ, ",", null, null, 0, null, null, 62));
                jSONObject2.put("client_final_filter_avoid_component_ids", C13LP.LJJLIIIJ(setLLIIJI, ",", null, null, 0, null, null, 62));
                c698810Rb5.LJIIJ = C786410Ut5.J3(jSONObject2);
                c698810Rb5.LIZJ(C13LP.LLIIIL(C13LP.LJJJJI(c698810Rb5.LJIIIZ)));
                ArrayList arrayList21 = new ArrayList();
                arrayList21.addAll(c698810Rb5.LJIIIZ);
                arrayList21.addAll(c698810Rb5.LJIIJJI);
                c698810Rb5.LIZ(arrayList21);
                ArrayList arrayList22 = new ArrayList();
                Iterator it9 = listLLIIII10.iterator();
                while (it9.hasNext()) {
                    String componentKey2 = ((C699090RbX) it9.next()).LLILLJJLI.getComponentKey();
                    if (componentKey2 != null) {
                        arrayList22.add(componentKey2);
                    }
                }
                Set setLLIIJI2 = C13LP.LLIIJI(arrayList22);
                C0RYJ c0ryj2 = this.LLLI;
                if (c0ryj2 != null && (listLIZIZ = c0ryj2.LIZIZ()) != null) {
                    arrayList8 = C13LP.LLIIIL(listLIZIZ);
                } else {
                    arrayList8 = new ArrayList();
                }
                Set setLJJL2 = C13LP.LJJL(C13LP.LLIIJI(C13LP.LJLI(arrayList8, setLLIIJI2)), C13LP.LLIIJI(LJIL()));
                List<String> listLLIIIL4 = C13LP.LLIIIL(setLJJL2);
                C08XD.LJJ(listLLIIIL4, AnonymousClass0347.LIZ(LJIL()));
                c698810Rb5.LJ(listLLIIIL4);
                List<String> listLLIIIL5 = C13LP.LLIIIL(setLJJL2);
                FeedComponentPriorityData feedComponentPriorityData3 = this.LLJJI;
                if (feedComponentPriorityData3 == null || (list = feedComponentPriorityData3.reRankComponentIds) == null) {
                    list = C13BV.INSTANCE;
                }
                C08XD.LJJ(listLLIIIL5, AnonymousClass0347.LIZ(list));
                c698810Rb5.LJFF(listLLIIIL5);
                C0RYJ c0ryj3 = this.LLLI;
                Aweme aweme2 = this.LLJILLL;
                if (aweme2 != null) {
                    aid2 = aweme2.getAid();
                }
                C697730RYl c697730RYlLIZ = C697710RYj.LIZ(c0ryj3, aid2);
                List<String> list4 = c697730RYlLIZ.LIZ;
                if (list4 != null) {
                    C13LP.LLIIIZ(list4);
                } else {
                    new LinkedHashSet();
                }
                List<String> list5 = c697730RYlLIZ.LIZIZ;
                if (list5 != null) {
                    C13LP.LLIIIZ(list5);
                } else {
                    new LinkedHashSet();
                }
            }
            ArrayList arrayList23 = new ArrayList();
            if (!((ArrayList) c698810Rb5.LIZJ).isEmpty()) {
                arrayList23.add("global_avoid_component_ids");
            }
            if (!((ArrayList) c698810Rb5.LIZIZ).isEmpty()) {
                arrayList23.add("container_avoid_component_ids");
            }
            Iterator it10 = ((LinkedHashMap) c698810Rb5.LJIIL).keySet().iterator();
            while (it10.hasNext()) {
                arrayList23.add((String) it10.next());
            }
            if (!((ArrayList) c698810Rb5.LJI).isEmpty()) {
                arrayList23.add("client_final_filter_avoid_component_ids");
            }
            c698810Rb5.LIZIZ(C13LP.LJJLIIIJ(arrayList23, ",", null, null, 0, null, null, 62));
            C699100RbY c699100RbYLIZJ = C700080Rd8.LIZJ(c698810Rb5);
            if (LJJIJ()) {
                if (Intrinsics.LJFF(this.LLLILZLLLI, c699100RbYLIZJ)) {
                    return;
                } else {
                    this.LLLILZLLLI = c699100RbYLIZJ;
                }
            }
            function1.invoke(c698810Rb5);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJFF(e2, "ComponentPriorityMaker#buildMobData");
        }
    }

    public final void LJIIJ(List<String> list) {
        String strInvoke;
        C699340Rbw c699340Rbw = this.LLJZIJLIL;
        if (c699340Rbw == null) {
            return;
        }
        String aid = null;
        if (!LJJIIJ()) {
            List<C699090RbX<ComponentPriorityProtocol>> listLJIIL = LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("commitCandidates start, decisionCount=");
            sbLIZ.append(listLJIIL.size());
            c699340Rbw.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            List<C700060Rd6> listLIZIZ = c699340Rbw.LIZIZ(listLJIIL);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("commitCandidates prepared, candidateCount=");
            sbLIZ2.append(listLIZIZ.size());
            sbLIZ2.append(", candidates=");
            sbLIZ2.append(C699340Rbw.LJIIIIZZ(listLIZIZ));
            c699340Rbw.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC699310Rbt interfaceC699310Rbt = c699340Rbw.LIZ;
            if (interfaceC699310Rbt == null) {
                c699340Rbw.LJIIJJI("commitCandidates service unavailable");
                C1AF0.LIZJ("SlotStrategyBridge#commitCandidates slotStrategyService unavailable");
            } else {
                interfaceC699310Rbt.LIZJ(listLIZIZ);
                C700400Rde c700400Rde = interfaceC699310Rbt.LJ().LIZJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(c700400Rde.LIZ, null);
                c700400Rde.LIZIZ(new AwS377S0200000_11(c700400Rde, (C700400Rde) linkedHashMap, (LinkedHashMap<String, String>) 88));
                c699340Rbw.LJIILLIIL = linkedHashMap;
                Iterator<C700060Rd6> it2 = listLIZIZ.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().LIZ;
                    C699210Rbj c699210RbjLJIILIIL = c699340Rbw.LJIILIIL(str);
                    if (c699210RbjLJIILIIL != null) {
                        String str2 = c699210RbjLJIILIIL.LIZ;
                        C699400Rc2 c699400Rc2 = c699210RbjLJIILIIL.LIZIZ;
                        c699340Rbw.LJII(str2, str, c699400Rc2.LIZ, c699400Rc2.LIZIZ, false);
                    }
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("executeStrategy start, timingKeys=");
            sbLIZ3.append(list);
            c699340Rbw.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
            InterfaceC699310Rbt interfaceC699310Rbt2 = c699340Rbw.LIZ;
            if (interfaceC699310Rbt2 == null) {
                c699340Rbw.LJIIJJI("executeStrategy service unavailable");
                C1AF0.LIZJ("SlotStrategyBridge#executeStrategy slotStrategyService unavailable");
                return;
            }
            if (c699340Rbw.LJIIIZ.isEmpty() && (!c699340Rbw.LJIILIIL.isEmpty())) {
                c699340Rbw.LJIILJJIL(interfaceC699310Rbt2);
            }
            Function0<String> function0 = c699340Rbw.LIZLLL;
            if (function0 != null) {
                strInvoke = function0.invoke();
            } else {
                strInvoke = null;
            }
            C699130Rbb c699130RbbLJFF = interfaceC699310Rbt2.LJFF(new C588670N6z(list, strInvoke));
            c699340Rbw.LJIILL = c699130RbbLJFF.LIZ;
            C702940Rhk c702940RhkLJ = interfaceC699310Rbt2.LJ();
            C700400Rde c700400Rde2 = c702940RhkLJ.LIZJ;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            c700400Rde2.LIZIZ(new C699320Rbu(linkedHashMap2));
            Function0<String> function02 = c699340Rbw.LJ;
            if (function02 != null) {
                aid = function02.invoke();
            }
            C703870RjF.LJ(aid, linkedHashMap2);
            c699340Rbw.LJIILL(c699130RbbLJFF, c702940RhkLJ);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("executeStrategy end, executeId=");
            sbLIZ4.append(c699130RbbLJFF.LIZ);
            sbLIZ4.append(", touchedSlotCount=");
            sbLIZ4.append(c699130RbbLJFF.LIZIZ.size());
            sbLIZ4.append(", scheduledOperationCount=");
            sbLIZ4.append(c699130RbbLJFF.LIZJ);
            sbLIZ4.append(", snapshotVersion=");
            sbLIZ4.append(c702940RhkLJ.LIZ);
            sbLIZ4.append(", slotChildrenCount=");
            sbLIZ4.append(linkedHashMap2.size());
            c699340Rbw.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        Aweme aweme = this.LLJILLL;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        long j = this.LLLFFI;
        this.LLLFZ++;
        long j2 = this.LLLFZ;
        C698890RbD c698890RbD = new C698890RbD(new C698780Rb2(aid, j, j2), c699340Rbw.LIZIZ(C13LP.LLIIII(LJIIL())), list);
        C698250RaB c698250RaB = this.LLL;
        if (c698250RaB == null) {
            c698250RaB = new C698250RaB(new C698270RaD(this));
            this.LLL = c698250RaB;
        }
        C698770Rb1 c698770Rb1 = new C698770Rb1(aid, j, j2, c698890RbD);
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 580);
        if (!c698250RaB.LIZLLL) {
            c698250RaB.LJFF = c698770Rb1;
            C786410Ut5.LJJZZIII(c698250RaB.LIZJ, new ARunnableS44S0300000_11(awS590S0100000_11, c698250RaB, c698770Rb1, 12));
        }
    }

    public final FcpMetaTagAbility LJIJI(InterfaceC665370Q7z interfaceC665370Q7z) {
        boolean z;
        Object ability;
        if (((Boolean) C283290B8l.LIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            if (this.LLJI == null) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z, VideoCellScope.class);
                if (c0qsjLIZJ != null) {
                    ability = c0qsjLIZJ.getAbility(FcpMetaTagAbility.class);
                } else {
                    ability = null;
                }
                if (ability instanceof FcpMetaTagAbility) {
                    obj = ability;
                }
                this.LLJI = (FcpMetaTagAbility) obj;
            }
            return this.LLJI;
        }
        return (FcpMetaTagAbility) C1558520qew.LIZ(interfaceC665370Q7z, FcpMetaTagAbility.class, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol r19) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C699060RbU.LJJIZ(com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol):void");
    }

    public final void LJJJ(List<? extends ComponentPriorityProtocol> list) {
        boolean z = false;
        for (ComponentPriorityProtocol componentPriorityProtocol : list) {
            if (!LJIJJLI().containsKey(componentPriorityProtocol.H3())) {
                LJJIZ(componentPriorityProtocol);
                z = true;
            }
        }
        if (1 == this.LLJILJIL && z) {
            new RunnableC699080RbW(this, this.LLJILLL).run();
        }
    }

    public final void LJJJI(ComponentPriorityProtocol componentPriorityProtocol) {
        if (Intrinsics.LJFF("left_container_see_translation", componentPriorityProtocol.H3())) {
            LifecycleOwner lifecycleOwner = this.LLJILJILJ;
            if (lifecycleOwner == null) {
                lifecycleOwner = null;
            }
            TranslationAbility translationAbility = (TranslationAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) lifecycleOwner), TranslationAbility.class, null);
            if (translationAbility != null) {
                translationAbility.ix0("");
                return;
            }
            return;
        }
        View viewXb = componentPriorityProtocol.xb();
        Set<String> set = C700100RdA.LIZ;
        C695740RQu.LJ(C700100RdA.LJI, viewXb, "");
    }

    public final void LJJJJI(String str) {
        C699090RbX c699090RbX;
        if (str != null && str.length() != 0 && (c699090RbX = (C699090RbX) ((ConcurrentHashMap) this.LLJLLL.getValue()).remove(str)) != null) {
            LJJI().remove(c699090RbX);
            LJIIL().remove(c699090RbX);
            C1384605bQ.LIZ(c699090RbX, LJIILIIL());
            C1384605bQ.LIZ(c699090RbX, LJIJJ());
            ((ArrayList) this.LLJJJJ).remove(c699090RbX);
            LJJII().remove(c699090RbX);
            this.LLJJIJI.remove(c699090RbX);
            LJIILJJIL().remove(c699090RbX);
            LJIIZILJ().remove(c699090RbX);
            C1384605bQ.LIZ(c699090RbX, LJIJJLI());
        }
    }

    @Override // X.InterfaceC697190RWj
    public final void wa(boolean z) {
        Aweme aweme = this.LLJILLL;
        if (aweme != null) {
            aweme.getAid();
        }
        new C699240Rbm(this);
        C0T6L.LIZLLL();
        this.LLLII.set(true);
        IFcpTraceRecorderService iFcpTraceRecorderService = (IFcpTraceRecorderService) this.LLJ.getValue();
        if (iFcpTraceRecorderService != null) {
            iFcpTraceRecorderService.LIZLLL(this.LLILZLL, new AwS590S0100000_11(this, 581));
        }
        if (!z) {
            ((ArrayList) this.LLJJJJ).clear();
        }
        if (LJJIIJZLJL(LJJI(), LJIIL())) {
            LJJIJIIJI();
            this.LLLF = false;
        } else if (this.LLLF) {
            LJIIJ(null);
            this.LLLF = false;
        }
    }

    @Override // X.InterfaceC697190RWj
    public final void xa(VideoItemParams videoItemParams) {
        Aweme aweme;
        LIZIZ();
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        this.LLJILLL = aweme;
        this.LLJJ = videoItemParams;
    }

    public static boolean LJII(C699090RbX c699090RbX, List list) {
        if (C0BX5.LIZ()) {
            String strH3 = c699090RbX.LL.H3();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(strH3, ((C699090RbX) it2.next()).LL.H3())) {
                    return true;
                }
            }
            return false;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            if (TextUtils.equals(c699090RbX.LL.H3(), ((C699090RbX) it3.next()).LL.H3())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJIIJZLJL(List list, List list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C699090RbX) ListProtector.get(list, i)).LLILLL != ((C699090RbX) ListProtector.get(list2, i)).LLILLL) {
                return true;
            }
        }
        return false;
    }

    public final void LIZ(C699090RbX<ComponentPriorityProtocol> c699090RbX, String str) {
        boolean zLJII;
        if (str != null && str.length() != 0) {
            List<C699090RbX<ComponentPriorityProtocol>> listLJIIL = LJIIL();
            ConcurrentHashMap<String, C699090RbX<ComponentPriorityProtocol>> concurrentHashMapLJIILIIL = LJIILIIL();
            if (C0BX5.LIZ()) {
                zLJII = concurrentHashMapLJIILIIL.containsKey(str);
            } else {
                zLJII = LJII(c699090RbX, listLJIIL);
            }
            if (zLJII) {
                return;
            }
            LJIIL().add(c699090RbX);
            C08XD.LJIL(LJIIL());
            LJIILIIL().put(str, c699090RbX);
        }
    }

    public final void LJ(EnumC699120Rba enumC699120Rba, C699100RbY c699100RbY) {
        C699170Rbf c699170Rbf = this.LLLIIL.get(enumC699120Rba);
        if (c699170Rbf == null) {
            return;
        }
        List<String> list = c699100RbY.LJIIL;
        Set<C699770Rcd> setLIZ = c699170Rbf.LIZ(EnumC699150Rbd.SERVER_DATA);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setLIZ, 10));
        Iterator<T> it2 = setLIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C699770Rcd) it2.next()).LIZ);
        }
        list.addAll(arrayList);
        List<String> list2 = c699100RbY.LJIIJJI;
        Set<C699770Rcd> setLIZ2 = c699170Rbf.LIZ(EnumC699150Rbd.ENABLE_FILTER);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(setLIZ2, 10));
        Iterator<T> it3 = setLIZ2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C699770Rcd) it3.next()).LIZ);
        }
        list2.addAll(arrayList2);
        List<String> list3 = c699100RbY.LJIILIIL;
        Set<C699770Rcd> setLIZ3 = c699170Rbf.LIZ(EnumC699150Rbd.BUSINESS_FILTER);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(setLIZ3, 10));
        Iterator<T> it4 = setLIZ3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((C699770Rcd) it4.next()).LIZ);
        }
        list3.addAll(arrayList3);
        List<String> list4 = c699100RbY.LJIILL;
        Set<C699770Rcd> setLIZ4 = c699170Rbf.LIZ(EnumC699150Rbd.PRIORITY_FILTER);
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(setLIZ4, 10));
        Iterator<T> it5 = setLIZ4.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((C699770Rcd) it5.next()).LIZ);
        }
        list4.addAll(arrayList4);
        if (!((Boolean) C266110Abp.LIZ.getValue()).booleanValue()) {
            c699170Rbf.LIZJ();
        }
    }

    public final void LJJIII(C699090RbX<ComponentPriorityProtocol> c699090RbX, String str) {
        boolean z;
        boolean z2;
        C699340Rbw c699340Rbw;
        String strLIZ = str;
        String str2 = c699090RbX.LLILZ;
        if (str2 == null && ((Boolean) C0B8X.LIZ.getValue()).booleanValue()) {
            return;
        }
        C700450Rdj c700450RdjVN0 = c699090RbX.LL.vN0();
        if ((c700450RdjVN0 instanceof C700040Rd4) && ((C700040Rd4) c700450RdjVN0).LIZLLL != null) {
            z = true;
        } else {
            z = false;
        }
        if (strLIZ != null && strLIZ.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        String strInvoke = null;
        if (z2) {
            String componentKey = c699090RbX.LLILLJJLI.getComponentKey();
            if (componentKey != null && componentKey.length() != 0 && (c699340Rbw = this.LLJZIJLIL) != null) {
                strLIZ = C722702rx.LIZ(componentKey, c699340Rbw.LJIILJJIL.LIZ, c699340Rbw.LJIILLIIL);
            } else {
                strLIZ = null;
            }
        }
        String componentKey2 = c699090RbX.LLILZ;
        if (componentKey2 == null) {
            componentKey2 = c699090RbX.LLILLJJLI.getComponentKey();
        }
        new C699140Rbc(this, str2, strLIZ, componentKey2, c699090RbX);
        C0T6L.LIZLLL();
        C699550RcH c699550RcH = new C699550RcH(c699090RbX, z, str2, this.LLJILLL, this.LLJJ, this, strLIZ, componentKey2);
        if (strLIZ != null && strLIZ.length() != 0 && !z) {
            Function0<String> function0 = this.LLIZ;
            if (function0 != null) {
                strInvoke = function0.invoke();
            }
            String componentKey3 = c699090RbX.LLILZ;
            if (componentKey3 == null) {
                componentKey3 = c699090RbX.LLILLJJLI.getComponentKey();
            }
            C703870RjF.LIZLLL(strInvoke, c699550RcH, strLIZ, componentKey3);
            return;
        }
        c699550RcH.invoke();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v10, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v11, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v12, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v13, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v14, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v15, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v16, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v17, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v18, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v19, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v8, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v9, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v15, types: [X.08CX] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized void LJJIJIL(Aweme aweme, C699100RbY c699100RbY) {
        Map mapLJ;
        FeedComponentPriorityData feedComponentPriorityDataCopy;
        List<String> listLLIIII;
        List<String> listLLIIII2;
        Map mapLJIIZILJ;
        List<String> listLLIIII3;
        List<String> listLLIIII4;
        String strLIZJ;
        String strLIZJ2;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List<String> arrayList7;
        List<String> listLLIIII5;
        String str2;
        int i;
        Iterable arrayList8;
        List list;
        String aid;
        Set linkedHashSet;
        Iterable linkedHashSet2;
        List<String> listLIZIZ;
        Map<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>> mapLIZ;
        List listLJIIIIZZ;
        Map<String, String> mapK22;
        List<String> listLLILL;
        List<String> listLLILL2;
        List<String> listLLILL3;
        List<String> listLLLZIIL;
        List<String> listIs;
        Map<String, List<String>> mapDL;
        List<String> listLLLZIIL2;
        List<String> listLLLZIIL3;
        List<String> listLLLZIIL4;
        List<String> listLLIIIL;
        ?? LIZIZ;
        Collection<GlobalComponentData> collectionValues;
        String componentKey;
        String aid2;
        List list2;
        C697910RZd next;
        boolean z;
        boolean z2;
        GlobalComponentData globalComponentData;
        try {
            mapLJ = (Map) C08JS.LIZIZ().LJIIIIZZ(LJJIFFI(), new TypeToken<Map<String, ? extends String>>() { // from class: X.0RcA
            }.getType());
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
        } catch (Exception e) {
            try {
                TryCatchGuardChecker.doCheck(e);
                mapLJ = C2097608Jq.LJ();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJFF(e2, "ComponentPriorityMaker#buildFunnelData");
            }
        }
        C698810Rb5 c698810Rb5 = new C698810Rb5();
        c698810Rb5.LJIILL = LJIILLIIL();
        LJJIL();
        c698810Rb5.LJIILIIL = LJJIFFI();
        if (!mapLJ.isEmpty()) {
            for (Map.Entry entry : mapLJ.entrySet()) {
                c698810Rb5.LJIIL.put((String) entry.getKey(), (String) entry.getValue());
                ((ArrayList) c698810Rb5.LJIIJJI).addAll(a0.LJJLIIIJ((CharSequence) entry.getValue(), new char[]{','}, false, 0, 6));
            }
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        if (C0B83.LIZ()) {
            if (aweme == null) {
                aid2 = null;
            } else {
                aid2 = aweme.getAid();
            }
            C697900RZc c697900RZcLIZ = C697890RZb.LIZ(aid2);
            if (c697900RZcLIZ == null) {
                return;
            }
            linkedHashSet = C13LP.LLIIIZ(c697900RZcLIZ.LIZ.keySet());
            for (Map.Entry<String, CopyOnWriteArrayList<C697910RZd>> entry2 : c697900RZcLIZ.LIZ.entrySet()) {
                String key = entry2.getKey();
                CopyOnWriteArrayList<C697910RZd> value = entry2.getValue();
                Iterator<C697910RZd> it2 = value.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LIZIZ == C0RZ2.FAILED) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C697910RZd c697910RZd = next;
                if (c697910RZd != null) {
                    z = true;
                } else {
                    z = false;
                }
                Iterator<C697910RZd> it3 = value.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C697910RZd next2 = it3.next();
                    if (Intrinsics.LJFF(next2.LIZ.name(), "FINALSHOW")) {
                        if (next2 != null) {
                            z2 = false;
                        }
                    }
                }
                z2 = true;
                if (!z && !z2) {
                    ((ArrayList) c698810Rb5.LIZLLL).add(key);
                    Map<String, GlobalComponentData> mapLJIILL = LJIILL();
                    if (mapLJIILL != null && (globalComponentData = mapLJIILL.get(key)) != null) {
                        if (globalComponentData.getShowStrategy() == 2) {
                            ((ArrayList) c698810Rb5.LJFF).add(key);
                        } else if (globalComponentData.getShowStrategy() == 1) {
                            linkedHashSet3.add(key);
                        }
                    }
                } else if (c697910RZd != null) {
                    if (!Intrinsics.LJFF(c697910RZd.LIZ.name(), "N2ONE") && !Intrinsics.LJFF(c697910RZd.LIZ.name(), "CONTAINERAVOID")) {
                        if (Intrinsics.LJFF(c697910RZd.LIZ.name(), "GLOBALAVOID")) {
                            ((ArrayList) c698810Rb5.LIZJ).add(key);
                        } else if (Intrinsics.LJFF(c697910RZd.LIZ.name(), "FINALFILTER")) {
                            ((ArrayList) c698810Rb5.LJI).add(key);
                        } else if (Intrinsics.LJFF(c697910RZd.LIZ.name(), "BIZ_ENABLE")) {
                            c698810Rb5.LIZ.add(key);
                        }
                    } else {
                        ((ArrayList) c698810Rb5.LIZIZ).add(key);
                    }
                    c698810Rb5.LJIIIZ.add(key);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("container_avoid_component_ids", C13LP.LJJLIIIJ(C13LP.LJJJJI(c698810Rb5.LIZIZ), ",", null, null, 0, null, null, 62));
            jSONObject.put("global_avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LIZJ, ",", null, null, 0, null, null, 62));
            jSONObject.put("client_final_filter_avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LJI, ",", null, null, 0, null, null, 62));
            c698810Rb5.LJIIJ = C786410Ut5.J3(jSONObject);
            ArrayList arrayList9 = new ArrayList();
            arrayList9.addAll(c698810Rb5.LJIIIZ);
            arrayList9.addAll(c698810Rb5.LJIIJJI);
            c698810Rb5.LIZ(arrayList9);
            Set setLJJL = C13LP.LJJL(C13LP.LLIIJI(C15442062u.LJII(linkedHashSet, linkedHashSet3)), C13LP.LLIIJI(LJIL()));
            List<String> listLLIIIL2 = C13LP.LLIIIL(setLJJL);
            C08XD.LJJ(listLLIIIL2, AnonymousClass0347.LIZ(LJIL()));
            c698810Rb5.LJ(listLLIIIL2);
            List<String> listLLIIIL3 = C13LP.LLIIIL(setLJJL);
            FeedComponentPriorityData feedComponentPriorityData = this.LLJJI;
            if (feedComponentPriorityData == null || (list2 = feedComponentPriorityData.reRankComponentIds) == null) {
                list2 = C13BV.INSTANCE;
            }
            C08XD.LJJ(listLLIIIL3, AnonymousClass0347.LIZ(list2));
            c698810Rb5.LJFF(listLLIIIL3);
            linkedHashSet2 = C13LP.LLIIIZ(C13LP.LJJJJLI(c698810Rb5.LIZLLL));
            str2 = null;
            i = 1;
        } else {
            FeedComponentPriorityData feedComponentPriorityData2 = this.LLJJI;
            if (feedComponentPriorityData2 != null) {
                List<String> list3 = feedComponentPriorityData2.priorityList;
                if (list3 != null) {
                    listLLIIIL = C13LP.LLIIIL(list3);
                } else {
                    listLLIIIL = null;
                }
                feedComponentPriorityDataCopy = feedComponentPriorityData2.copy(feedComponentPriorityData2.treeStructure, feedComponentPriorityData2.globalComponentList, feedComponentPriorityData2.globalShowLimit, feedComponentPriorityData2.containerMap, listLLIIIL, feedComponentPriorityData2.alreadyDisableComponents, feedComponentPriorityData2.finalFilterComponents, feedComponentPriorityData2.rankComponentIds, feedComponentPriorityData2.reRankComponentIds, feedComponentPriorityData2.serverTrackExtra, feedComponentPriorityData2.configType, feedComponentPriorityData2.globalComponentMap, feedComponentPriorityData2.componentPreloadConfig);
            } else {
                feedComponentPriorityDataCopy = null;
            }
            LifecycleOwner lifecycleOwner = this.LLJILJILJ;
            if (lifecycleOwner == null) {
                lifecycleOwner = null;
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((BaseCellContentComponent) lifecycleOwner);
            List<String> listLLIIII6 = null;
            BottomBarPriorityAbility bottomBarPriorityAbility = (BottomBarPriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, BottomBarPriorityAbility.class, null);
            if (bottomBarPriorityAbility != null && (listLLLZIIL4 = bottomBarPriorityAbility.LLLZIIL()) != null) {
                listLLIIII6 = C13LP.LLIIII(listLLLZIIL4);
            }
            FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, FeedBottomButtonAbility.class, null);
            if (feedBottomButtonAbility != null && (listLLLZIIL3 = feedBottomButtonAbility.LLLZIIL()) != null) {
                listLLIIII = C13LP.LLIIII(listLLLZIIL3);
            } else {
                listLLIIII = null;
            }
            FcpMetaTagAbility fcpMetaTagAbilityLJIJI = LJIJI(interfaceC665370Q7zLJIIL);
            if (fcpMetaTagAbilityLJIJI != null && (listLLLZIIL2 = fcpMetaTagAbilityLJIJI.LLLZIIL()) != null) {
                listLLIIII2 = C13LP.LLIIII(listLLLZIIL2);
            } else {
                listLLIIII2 = null;
            }
            CategoryPriorityAbility categoryPriorityAbility = (CategoryPriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, CategoryPriorityAbility.class, null);
            if (categoryPriorityAbility != null && (mapDL = categoryPriorityAbility.DL()) != null) {
                mapLJIIZILJ = C2097608Jq.LJIIZILJ(mapDL);
            } else {
                mapLJIIZILJ = null;
            }
            GenrePriorityAbility genrePriorityAbility = (GenrePriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, GenrePriorityAbility.class, null);
            if (genrePriorityAbility != null && (listIs = genrePriorityAbility.is()) != null) {
                listLLIIII3 = C13LP.LLIIII(listIs);
            } else {
                listLLIIII3 = null;
            }
            AnnotationContainerAbility annotationContainerAbility = (AnnotationContainerAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, AnnotationContainerAbility.class, null);
            if (annotationContainerAbility != null && (listLLLZIIL = annotationContainerAbility.LLLZIIL()) != null) {
                listLLIIII4 = C13LP.LLIIII(listLLLZIIL);
            } else {
                listLLIIII4 = null;
            }
            List<C699090RbX> listLLIIII7 = C13LP.LLIIII(LJJI());
            List<C699090RbX> listLLIIII8 = C13LP.LLIIII(LJIIZILJ());
            List listLLIIII9 = C13LP.LLIIII(LJIILJJIL());
            List listLLIIII10 = C13LP.LLIIII(LJJII());
            if (LJJIJ()) {
                BottomBarPriorityAbility bottomBarPriorityAbility2 = (BottomBarPriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, BottomBarPriorityAbility.class, null);
                if (bottomBarPriorityAbility2 != null && (listLLILL3 = bottomBarPriorityAbility2.LLILL()) != null) {
                    strLIZJ = (String) C13LP.LJJJLZIJ(0, listLLILL3);
                } else {
                    strLIZJ = null;
                }
            } else {
                C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
                EnumC697700RYi enumC697700RYi = EnumC697700RYi.BOTTOM_BANNER;
                c698800Rb4.getClass();
                strLIZJ = C698800Rb4.LIZJ(feedComponentPriorityDataCopy, listLLIIII6, enumC697700RYi);
            }
            if (LJJIJ()) {
                FeedBottomButtonAbility feedBottomButtonAbility2 = (FeedBottomButtonAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, FeedBottomButtonAbility.class, null);
                if (feedBottomButtonAbility2 != null && (listLLILL2 = feedBottomButtonAbility2.LLILL()) != null) {
                    strLIZJ2 = (String) C13LP.LJJJLZIJ(0, listLLILL2);
                } else {
                    strLIZJ2 = null;
                }
            } else {
                C698800Rb4 c698800Rb42 = C698800Rb4.LIZ;
                EnumC697700RYi enumC697700RYi2 = EnumC697700RYi.BOTTOM_BUTTON;
                c698800Rb42.getClass();
                strLIZJ2 = C698800Rb4.LIZJ(feedComponentPriorityDataCopy, listLLIIII, enumC697700RYi2);
            }
            FcpMetaTagAbility fcpMetaTagAbilityLJIJI2 = LJIJI(interfaceC665370Q7zLJIIL);
            if (fcpMetaTagAbilityLJIJI2 != null && (listLLILL = fcpMetaTagAbilityLJIJI2.LLILL()) != null) {
                str = (String) C13LP.LJJJLZIJ(0, listLLILL);
            } else {
                str = null;
            }
            ArrayList arrayList10 = null;
            CategoryPriorityAbility categoryPriorityAbility2 = (CategoryPriorityAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, CategoryPriorityAbility.class, null);
            if (categoryPriorityAbility2 != null && (mapK22 = categoryPriorityAbility2.k22()) != null) {
                arrayList10 = new ArrayList(mapK22.size());
                Iterator<Map.Entry<String, String>> it4 = mapK22.entrySet().iterator();
                while (it4.hasNext()) {
                    arrayList10.add(it4.next().getValue());
                }
            }
            C698800Rb4 c698800Rb43 = C698800Rb4.LIZ;
            EnumC697700RYi enumC697700RYi3 = EnumC697700RYi.VIDEO_GENRE_TAG;
            c698800Rb43.getClass();
            String strLIZJ3 = C698800Rb4.LIZJ(feedComponentPriorityDataCopy, listLLIIII3, enumC697700RYi3);
            List<String> listLLILL4 = null;
            AnnotationContainerAbility annotationContainerAbility2 = (AnnotationContainerAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, AnnotationContainerAbility.class, null);
            if (annotationContainerAbility2 != null) {
                listLLILL4 = annotationContainerAbility2.LLILL();
            }
            if (listLLIIII4 != null) {
                arrayList = new ArrayList();
                for (String str3 : listLLIIII4) {
                    String str4 = str3;
                    if (listLLILL4 == null || !listLLILL4.contains(str4)) {
                        arrayList.add(str3);
                    }
                }
            } else {
                arrayList = null;
            }
            if (listLLIIII6 != null) {
                arrayList2 = new ArrayList();
                for (String str5 : listLLIIII6) {
                    if (!u.LJIJI(str5, strLIZJ, true)) {
                        arrayList2.add(str5);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (listLLIIII != null) {
                arrayList3 = new ArrayList();
                for (String str6 : listLLIIII) {
                    if (!u.LJIJI(str6, strLIZJ2, true)) {
                        arrayList3.add(str6);
                    }
                }
            } else {
                arrayList3 = null;
            }
            if (listLLIIII2 != null) {
                arrayList4 = new ArrayList();
                for (String str7 : listLLIIII2) {
                    if (!u.LJIJI(str7, str, true)) {
                        arrayList4.add(str7);
                    }
                }
            } else {
                arrayList4 = null;
            }
            if (mapLJIIZILJ != null) {
                ArrayList arrayList11 = new ArrayList();
                Iterator it5 = mapLJIIZILJ.entrySet().iterator();
                while (it5.hasNext()) {
                    C19719612Di.LJJI((Iterable) ((Map.Entry) it5.next()).getValue(), arrayList11);
                }
                arrayList5 = new ArrayList();
                for (Object obj : arrayList11) {
                    String str8 = (String) obj;
                    if (arrayList10 == null) {
                        listLJIIIIZZ = C1697810uHb.LJIIIIZZ();
                    } else {
                        listLJIIIIZZ = arrayList10;
                    }
                    if (!listLJIIIIZZ.contains(str8)) {
                        arrayList5.add(obj);
                    }
                }
            } else {
                arrayList5 = null;
            }
            if (listLLIIII3 != null) {
                arrayList6 = new ArrayList();
                for (String str9 : listLLIIII3) {
                    if (!u.LJIJI(str9, strLIZJ3, true)) {
                        arrayList6.add(str9);
                    }
                }
            } else {
                arrayList6 = null;
            }
            C0RYJ c0ryj = this.LLLI;
            if (c0ryj != null && (mapLIZ = c0ryj.LIZ()) != null) {
                ArrayList arrayList12 = new ArrayList();
                Iterator<Map.Entry<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>>> it6 = mapLIZ.entrySet().iterator();
                while (it6.hasNext()) {
                    C19719612Di.LJJI(it6.next().getValue().za().keySet(), arrayList12);
                }
                arrayList7 = C13LP.LLIIIL(C13LP.LJJJJLI(arrayList12));
            } else {
                arrayList7 = new ArrayList<>();
            }
            c698810Rb5.LIZLLL(arrayList7);
            for (C699090RbX c699090RbX : listLLIIII8) {
                if (Intrinsics.LJFF(c699090RbX.LLJ, Boolean.TRUE)) {
                    ((ArrayList) c698810Rb5.LIZJ).add(c699090RbX.LL.H3());
                } else if (Intrinsics.LJFF(c699090RbX.LLJ, Boolean.FALSE)) {
                    ((ArrayList) c698810Rb5.LIZIZ).add(c699090RbX.LL.H3());
                }
                c698810Rb5.LJIIIZ.add(c699090RbX.LL.H3());
            }
            LIZJ(c698810Rb5.LIZIZ, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList);
            LIZJ(c698810Rb5.LJIIIZ, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList);
            if (mapLJIIZILJ != null) {
                ArrayList arrayList13 = new ArrayList();
                Iterator it7 = mapLJIIZILJ.entrySet().iterator();
                while (it7.hasNext()) {
                    C19719612Di.LJJI((Iterable) ((Map.Entry) it7.next()).getValue(), arrayList13);
                }
                listLLIIII5 = C13LP.LLIIII(arrayList13);
            } else {
                listLLIIII5 = null;
            }
            for (C699090RbX c699090RbX2 : listLLIIII7) {
                ((ArrayList) c698810Rb5.LIZLLL).add(c699090RbX2.LL.H3());
                if (c699090RbX2.LLILLJJLI.getShowStrategy() == 2) {
                    ((ArrayList) c698810Rb5.LJFF).add(c699090RbX2.LL.H3());
                }
                String matchedContainerKey = c699090RbX2.LLILLJJLI.getMatchedContainerKey();
                switch (matchedContainerKey.hashCode()) {
                    case -1684919427:
                        if (matchedContainerKey.equals("high_tag")) {
                        }
                        break;
                    case -1613157440:
                        if (!matchedContainerKey.equals("bottom_banner")) {
                            continue;
                        } else if (listLLIIII6 != null) {
                            ArrayList arrayList14 = new ArrayList();
                            for (String str10 : listLLIIII6) {
                                if (!Intrinsics.LJFF(str10, c699090RbX2.LL.H3())) {
                                    arrayList14.add(str10);
                                }
                            }
                            listLLIIII6 = arrayList14;
                        } else {
                            listLLIIII6 = null;
                        }
                        break;
                    case -1594502202:
                        if (!matchedContainerKey.equals("bottom_button")) {
                            continue;
                        } else if (listLLIIII != null) {
                            ArrayList arrayList15 = new ArrayList();
                            for (String str11 : listLLIIII) {
                                if (!Intrinsics.LJFF(str11, c699090RbX2.LL.H3())) {
                                    arrayList15.add(str11);
                                }
                            }
                            listLLIIII = arrayList15;
                        } else {
                            listLLIIII = null;
                        }
                        break;
                    case -513457295:
                        if (!matchedContainerKey.equals("annotation_container")) {
                            continue;
                        } else if (listLLIIII4 != null) {
                            ArrayList arrayList16 = new ArrayList();
                            for (String str12 : listLLIIII4) {
                                if (!Intrinsics.LJFF(str12, c699090RbX2.LL.H3())) {
                                    arrayList16.add(str12);
                                }
                            }
                            listLLIIII4 = arrayList16;
                        } else {
                            listLLIIII4 = null;
                        }
                        break;
                    case -450135456:
                        if (!matchedContainerKey.equals("meta_tag")) {
                            continue;
                        } else if (listLLIIII2 != null) {
                            ArrayList arrayList17 = new ArrayList();
                            for (String str13 : listLLIIII2) {
                                if (!Intrinsics.LJFF(str13, c699090RbX2.LL.H3())) {
                                    arrayList17.add(str13);
                                }
                            }
                            listLLIIII2 = arrayList17;
                        } else {
                            listLLIIII2 = null;
                        }
                        break;
                    case 356829231:
                        if (matchedContainerKey.equals("low_tag")) {
                        }
                        break;
                    case 647069406:
                        if (!matchedContainerKey.equals("genre_tag")) {
                            continue;
                        } else if (listLLIIII3 != null) {
                            ArrayList arrayList18 = new ArrayList();
                            for (String str14 : listLLIIII3) {
                                if (!Intrinsics.LJFF(str14, c699090RbX2.LL.H3())) {
                                    arrayList18.add(str14);
                                }
                            }
                            listLLIIII3 = arrayList18;
                        } else {
                            listLLIIII3 = null;
                        }
                        break;
                    default:
                        continue;
                }
                if (listLLIIII5 != null) {
                    ArrayList arrayList19 = new ArrayList();
                    for (String str15 : listLLIIII5) {
                        if (!Intrinsics.LJFF(str15, c699090RbX2.LL.H3())) {
                            arrayList19.add(str15);
                        }
                    }
                    listLLIIII5 = arrayList19;
                } else {
                    listLLIIII5 = null;
                }
            }
            str2 = null;
            i = 1;
            LIZLLL(c698810Rb5.LJFF, listLLIIII6, listLLIIII, listLLIIII5, listLLIIII3, listLLIIII2, listLLIIII4);
            c698810Rb5.LJIILIIL = LJJIFFI();
            if (!mapLJ.isEmpty()) {
                for (Map.Entry entry3 : mapLJ.entrySet()) {
                    c698810Rb5.LJIIL.put((String) entry3.getKey(), (String) entry3.getValue());
                    ((ArrayList) c698810Rb5.LJIIJJI).addAll(a0.LJJLIIIJ((CharSequence) entry3.getValue(), new char[]{','}, false, 0, 6));
                }
            }
            ArrayList arrayList20 = new ArrayList();
            Iterator it8 = listLLIIII9.iterator();
            while (it8.hasNext()) {
                String componentKey2 = ((C699090RbX) it8.next()).LLILLJJLI.getComponentKey();
                if (componentKey2 != null) {
                    arrayList20.add(componentKey2);
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList20);
            ((ArrayList) c698810Rb5.LJI).addAll(setLLIIJI);
            c698810Rb5.LJIIIZ.addAll(setLLIIJI);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("container_avoid_component_ids", C13LP.LJJLIIIJ(C13LP.LJJJJI(c698810Rb5.LIZIZ), ",", null, null, 0, null, null, 62));
            jSONObject2.put("global_avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LIZJ, ",", null, null, 0, null, null, 62));
            jSONObject2.put("client_final_filter_avoid_component_ids", C13LP.LJJLIIIJ(setLLIIJI, ",", null, null, 0, null, null, 62));
            c698810Rb5.LJIIJ = C786410Ut5.J3(jSONObject2);
            c698810Rb5.LIZJ(C13LP.LLIIIL(C13LP.LJJJJI(c698810Rb5.LJIIIZ)));
            ArrayList arrayList21 = new ArrayList();
            arrayList21.addAll(c698810Rb5.LJIIIZ);
            arrayList21.addAll(c698810Rb5.LJIIJJI);
            c698810Rb5.LIZ(arrayList21);
            ArrayList arrayList22 = new ArrayList();
            Iterator it9 = listLLIIII10.iterator();
            while (it9.hasNext()) {
                String componentKey3 = ((C699090RbX) it9.next()).LLILLJJLI.getComponentKey();
                if (componentKey3 != null) {
                    arrayList22.add(componentKey3);
                }
            }
            Set setLLIIJI2 = C13LP.LLIIJI(arrayList22);
            C0RYJ c0ryj2 = this.LLLI;
            if (c0ryj2 != null && (listLIZIZ = c0ryj2.LIZIZ()) != null) {
                arrayList8 = C13LP.LLIIIL(listLIZIZ);
            } else {
                arrayList8 = new ArrayList();
            }
            Set setLJJL2 = C13LP.LJJL(C13LP.LLIIJI(C13LP.LJLI(arrayList8, setLLIIJI2)), C13LP.LLIIJI(LJIL()));
            List<String> listLLIIIL4 = C13LP.LLIIIL(setLJJL2);
            C08XD.LJJ(listLLIIIL4, AnonymousClass0347.LIZ(LJIL()));
            c698810Rb5.LJ(listLLIIIL4);
            List<String> listLLIIIL5 = C13LP.LLIIIL(setLJJL2);
            FeedComponentPriorityData feedComponentPriorityData3 = this.LLJJI;
            if (feedComponentPriorityData3 == null || (list = feedComponentPriorityData3.reRankComponentIds) == null) {
                list = C13BV.INSTANCE;
            }
            C08XD.LJJ(listLLIIIL5, AnonymousClass0347.LIZ(list));
            c698810Rb5.LJFF(listLLIIIL5);
            C0RYJ c0ryj3 = this.LLLI;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C697730RYl c697730RYlLIZ = C697710RYj.LIZ(c0ryj3, aid);
            List<String> list4 = c697730RYlLIZ.LIZ;
            if (list4 != null) {
                linkedHashSet = C13LP.LLIIIZ(list4);
            } else {
                linkedHashSet = new LinkedHashSet();
            }
            List<String> list5 = c697730RYlLIZ.LIZIZ;
            if (list5 != null) {
                linkedHashSet2 = C13LP.LLIIIZ(list5);
            } else {
                linkedHashSet2 = new LinkedHashSet();
            }
        }
        C699100RbY c699100RbYLIZJ = C700080Rd8.LIZJ(c698810Rb5);
        c699100RbYLIZJ.LJIIJJI(C13LP.LLIIIL(C13LP.LJJJJI(c699100RbY.LJIIJJI)));
        c699100RbYLIZJ.LJIIIZ(C13LP.LLIIIL(C13LP.LJJJJI(c699100RbY.LJIIL)));
        c699100RbYLIZJ.LJIIJ(C13LP.LLIIIL(C13LP.LJJJJI(c699100RbY.LJIILIIL)));
        c699100RbYLIZJ.LJIILIIL(C13LP.LLIIIL(C13LP.LJJJJI(c699100RbY.LJIILJJIL)));
        c699100RbYLIZJ.LJIIL(C13LP.LLIIIL(C13LP.LJJJJI(c699100RbY.LJIILL)));
        c699100RbYLIZJ.LJI(C13LP.LLIIIL(C13LP.LJJJJI(c699100RbY.LJIILLIIL)));
        c699100RbYLIZJ.LJFF(C13LP.LLIIIL(C13LP.LJJJJI(c699100RbY.LJIIZILJ)));
        c699100RbYLIZJ.LJ(C13LP.LLIIIL(C13LP.LJJJJI(c699100RbY.LJIJ)));
        c699100RbYLIZJ.LIZIZ(c699100RbY.LJIJI);
        ArrayList arrayList23 = new ArrayList();
        Iterator it10 = ((LinkedHashMap) c698810Rb5.LJIIL).keySet().iterator();
        while (it10.hasNext()) {
            arrayList23.add((String) it10.next());
        }
        if (!c699100RbYLIZJ.LJI.isEmpty()) {
            arrayList23.add("global_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJFF.isEmpty()) {
            arrayList23.add("container_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJII.isEmpty()) {
            arrayList23.add("client_final_filter_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIILLIIL.isEmpty()) {
            arrayList23.add("frequency_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIIZILJ.isEmpty()) {
            arrayList23.add("exit_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIJ.isEmpty()) {
            arrayList23.add("dispersion_avoid_component_ids");
        }
        c698810Rb5.LIZIZ(C13LP.LJJLIIIJ(arrayList23, ",", str2, str2, 0, str2, str2, 62));
        c699100RbYLIZJ.LIZ(new LinkedHashSet());
        if (!c699100RbYLIZJ.LJ.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("enable_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJFF.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("container_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJI.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("global_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJII.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("client_final_filter_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIIJJI.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("standard_enable_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIILIIL.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("standard_data_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIILJJIL.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("standard_timing_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIILL.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("standard_priority_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIILLIIL.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("frequency_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIIZILJ.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("exit_avoid_component_ids");
        }
        if (!c699100RbYLIZJ.LJIJ.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("dispersion_avoid_component_ids");
        }
        if (!c698810Rb5.LJ.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("avoid_component_ids");
        }
        if (!c698810Rb5.LJIIIZ.isEmpty()) {
            c699100RbYLIZJ.LJIIJ.add("client_avoid_component_ids");
        }
        Set setLLIIJI3 = C13LP.LLIIJI(linkedHashSet);
        Set setLLIIJI4 = C13LP.LLIIJI(linkedHashSet2);
        Map<String, GlobalComponentData> mapLJIILL2 = LJIILL();
        if (mapLJIILL2 != null && (collectionValues = mapLJIILL2.values()) != null) {
            ArrayList<GlobalComponentData> arrayList24 = new ArrayList();
            for (Object obj2 : collectionValues) {
                GlobalComponentData globalComponentData2 = (GlobalComponentData) obj2;
                if (globalComponentData2 != null && globalComponentData2.getShowStrategy() == i) {
                    arrayList24.add(obj2);
                }
            }
            LIZIZ = new ArrayList(C15438062q.LJIJJ(arrayList24, 10));
            for (GlobalComponentData globalComponentData3 : arrayList24) {
                if (globalComponentData3 != null) {
                    componentKey = globalComponentData3.getComponentKey();
                } else {
                    componentKey = str2;
                }
                LIZIZ.add(componentKey);
            }
        } else {
            LIZIZ = C093Y.LIZIZ();
        }
        c699100RbYLIZJ.LJIIIIZZ(C13LP.LJJL(setLLIIJI3, C13LP.LLIIJI(C13LP.LLIIJI(C13LP.LJJJJLI((Iterable) LIZIZ)))));
        c699100RbYLIZJ.LIZLLL(C13LP.LJJL(setLLIIJI4, C13LP.LLIIJI(c699100RbYLIZJ.LIZJ)));
        c699100RbYLIZJ.LJII(C13LP.LJLLLLLL(setLLIIJI3, C13LP.LLIIJI(c699100RbYLIZJ.LIZJ)));
        c699100RbYLIZJ.LIZJ(C13LP.LJLLLLLL(setLLIIJI4, C13LP.LLIIJI(c699100RbYLIZJ.LIZJ)));
        if (Intrinsics.LJFF(this.LLLILZJ, c699100RbYLIZJ)) {
            return;
        }
        this.LLLILZJ = c699100RbYLIZJ;
        C698800Rb4 c698800Rb44 = C698800Rb4.LIZ;
        String str16 = this.LLILLJJLI;
        c698800Rb44.getClass();
        C2344009Gk c2344009GkLIZ = C698800Rb4.LIZ(aweme, str16, c698810Rb5);
        c2344009GkLIZ.LJFF("enable_avoid_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJ, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("request_display_unrestricted_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LIZJ, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("display_unrestricted_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LIZLLL, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("request_display_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LIZ, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("display_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LIZIZ, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("client_funnel_keys", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJIIJ, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("standard_enable_avoid_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJIIJJI, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("server_standard_request_display_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJIIL, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("standard_data_avoid_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJIILIIL, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("standard_timing_avoid_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJIILJJIL, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("standard_priority_avoid_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJIILL, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("frequency_avoid_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJIILLIIL, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("exit_avoid_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJIIZILJ, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("dispersion_avoid_component_ids", C13LP.LJJLIIIJ(c699100RbYLIZJ.LJIJ, ",", str2, str2, 0, str2, str2, 62));
        c2344009GkLIZ.LJFF("config_type", c699100RbYLIZJ.LJIJI);
        Map<String, String> map = c2344009GkLIZ.LIZ;
        this.LLLIL = map;
        String string = map.toString();
        if ((((Number) C2766015g.LIZ.getValue()).intValue() & 4) == 0 || (((Boolean) C1E7D.LJ.getValue()).booleanValue() && !C1E7D.LIZ)) {
            C2765015f.LIZIZ("ComponentPriorityMaker", string);
        } else {
            C2765015f.LIZ("ComponentPriorityMaker.mobFunnelData", new AwS96S1000000_11(string, 14));
        }
        if (((Boolean) C04VK.LIZ.getValue()).booleanValue()) {
            C20684815ws.LJIILLIIL("record_component_funnel", map);
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            iFeedDebugService.LIZJ();
        }
    }

    public final void LJJJJIZL(C699090RbX c699090RbX, C1AV2 c1av2) {
        T t = c699090RbX.LL;
        if (Intrinsics.LJFF("left_container_see_translation", t.H3())) {
            LifecycleOwner lifecycleOwner = this.LLJILJILJ;
            if (lifecycleOwner == null) {
                lifecycleOwner = null;
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((AbstractC738140SxQ) lifecycleOwner);
            TranslationAbility translationAbility = (TranslationAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, TranslationAbility.class, null);
            if (translationAbility != null) {
                translationAbility.JX0(false);
            }
            TranslationAbility translationAbility2 = (TranslationAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, TranslationAbility.class, null);
            if (translationAbility2 != null) {
                translationAbility2.ix0("is_avoided");
                return;
            }
            return;
        }
        View viewXb = t.xb();
        C695740RQu.LJ(C700100RdA.LJI, viewXb, "is_avoided");
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            C2180521AVm.LIZLLL(viewXb, 8, c1av2);
        } else {
            C637920P0k.LIZ(viewXb, new ARunnableS13S0201000_6(viewXb, c1av2, 13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.String r4, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol r5, boolean r6) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lc
            if (r5 == 0) goto L62
            java.lang.String r4 = r5.H3()
        Lc:
            r2 = 1
            if (r4 == 0) goto L62
            int r0 = r4.length()
            if (r0 == 0) goto L62
            java.util.concurrent.ConcurrentHashMap r0 = r3.LJIJJ()
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L3b
            java.util.concurrent.ConcurrentHashMap r0 = r3.LJIJJ()
            java.lang.Object r1 = r0.get(r4)
            X.0RbX r1 = (X.C699090RbX) r1
            if (r1 == 0) goto L3a
            r1.LLIZ = r6
            r1.LLIZLLLIL = r2
            X.01GW r0 = r3.LLJJJJLIIL
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            X.C1384605bQ.LIZIZ(r0, r1)
        L3a:
            return
        L3b:
            if (r5 == 0) goto L3a
            r3.LJJIZ(r5)
            java.lang.String r1 = r5.H3()
            X.0N7j r2 = X.EnumC588770N7j.OPERATION_REGISTER
            X.0N7h r0 = X.EnumC588750N7h.REGISTER_INVERSION
            X.C588760N7i.LIZ(r1, r2, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r3.LJIJJ()
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L3a
            java.lang.String r1 = r5.H3()
            X.0N7h r0 = X.EnumC588750N7h.REGISTER_DUPLICATE
            X.C588760N7i.LIZ(r1, r2, r0)
            r3.LJI(r4, r5, r6)
            return
        L62:
            LJJIJIIJIL(r3)
            boolean r0 = X.C2770015k.LIZ()
            if (r0 == 0) goto L6e
            r3.LJJIJLIJ()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C699060RbU.LJI(java.lang.String, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol, boolean):void");
    }

    public C699060RbU(String str, String str2, EnumC697700RYi enumC697700RYi, IFcpPolicyAbility iFcpPolicyAbility, InterfaceC699620RcO interfaceC699620RcO, AwS555S0100000_11 awS555S0100000_11, C698730Rax c698730Rax) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = enumC697700RYi;
        this.LLILZIL = iFcpPolicyAbility;
        this.LLILZLL = interfaceC699620RcO;
        this.LLIZ = awS555S0100000_11;
        this.LLIZLLLIL = c698730Rax;
        EnumC699120Rba enumC699120Rba = EnumC699120Rba.BOTTOM_BANNER;
        EnumC699120Rba enumC699120Rba2 = EnumC699120Rba.ANCHOR;
        EnumC699120Rba enumC699120Rba3 = EnumC699120Rba.BOTTOM_BUTTON;
        EnumC699120Rba enumC699120Rba4 = EnumC699120Rba.HIGH_TAG;
        EnumC699120Rba enumC699120Rba5 = EnumC699120Rba.META_TAG;
        EnumC699120Rba enumC699120Rba6 = EnumC699120Rba.ANNOTATION_CONTAINER;
        EnumC699120Rba enumC699120Rba7 = EnumC699120Rba.INFO_BAR;
        EnumC699120Rba enumC699120Rba8 = EnumC699120Rba.GLOBAL;
        this.LLLIIL = C2097608Jq.LJIIIIZZ(new Pair(enumC699120Rba, new C699170Rbf(enumC699120Rba)), new Pair(enumC699120Rba2, new C699170Rbf(enumC699120Rba2)), new Pair(enumC699120Rba3, new C699170Rbf(enumC699120Rba3)), new Pair(enumC699120Rba4, new C699170Rbf(enumC699120Rba4)), new Pair(enumC699120Rba5, new C699170Rbf(enumC699120Rba5)), new Pair(enumC699120Rba6, new C699170Rbf(enumC699120Rba6)), new Pair(enumC699120Rba7, new C699170Rbf(enumC699120Rba7)), new Pair(enumC699120Rba8, new C699170Rbf(enumC699120Rba8)));
        this.LLLILZ = C09IR.LIZIZ(1, 1, null, 4);
        this.LLLIZZ = C452501pT.LIZIZ(new C699760Rcc());
        this.LLLJ = C452501pT.LIZIZ(new C693980RKa());
    }

    public static void LIZJ(List list, List list2, List list3, List list4, List list5, List list6, List list7) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        Object obj;
        Object obj2;
        Object obj3;
        int i = 0;
        if (list2 != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        if (list3 != null) {
            size2 = list3.size();
        } else {
            size2 = 0;
        }
        if (list4 != null) {
            size3 = list4.size();
        } else {
            size3 = 0;
        }
        if (list5 != null) {
            size4 = list5.size();
        } else {
            size4 = 0;
        }
        if (list6 != null) {
            size5 = list6.size();
        } else {
            size5 = 0;
        }
        if (size > 0) {
            int i2 = 0;
            do {
                if (list2 != null) {
                    obj3 = ListProtector.get(list2, i2);
                } else {
                    obj3 = null;
                }
                list.add(obj3);
                i2++;
            } while (i2 < size);
        }
        if (size2 > 0) {
            int i3 = 0;
            do {
                if (list3 != null) {
                    obj2 = ListProtector.get(list3, i3);
                } else {
                    obj2 = null;
                }
                list.add(obj2);
                i3++;
            } while (i3 < size2);
        }
        if (size3 > 0) {
            do {
                if (list4 != null) {
                    obj = ListProtector.get(list4, i);
                } else {
                    obj = null;
                }
                list.add(obj);
                i++;
            } while (i < size3);
        }
        if (size4 > 0 && list5 != null) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                list.add(it2.next());
            }
        }
        if (size5 > 0 && list6 != null) {
            Iterator it3 = list6.iterator();
            while (it3.hasNext()) {
                list.add(it3.next());
            }
        }
        if (list7 != null) {
            Iterator it4 = list7.iterator();
            while (it4.hasNext()) {
                list.add(it4.next());
            }
        }
    }

    public final void LIZLLL(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7) {
        int size;
        int size2;
        int size3;
        Object obj;
        Object obj2;
        Object obj3;
        FeedComponentPriorityData feedComponentPriorityData = this.LLJJI;
        if (feedComponentPriorityData != null) {
            List<String> list8 = feedComponentPriorityData.priorityList;
            List<GlobalComponentData> list9 = feedComponentPriorityData.globalComponentList;
            if (list8 != null && list9 != null) {
                int i = 0;
                if (list2 != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                if (list3 != null) {
                    size2 = list3.size();
                } else {
                    size2 = 0;
                }
                if (list6 != null) {
                    size3 = list6.size();
                } else {
                    size3 = 0;
                }
                if (size > 0) {
                    int i2 = 0;
                    do {
                        if (list2 != null) {
                            obj3 = ListProtector.get(list2, i2);
                        } else {
                            obj3 = null;
                        }
                        int iIndexOf = list8.indexOf(obj3);
                        if (iIndexOf >= 0 && ((GlobalComponentData) ListProtector.get(list9, iIndexOf)).getShowStrategy() == 2) {
                            ((ArrayList) list).add(((GlobalComponentData) ListProtector.get(list9, iIndexOf)).getComponentKey());
                        }
                        i2++;
                    } while (i2 < size);
                }
                if (size2 > 0) {
                    int i3 = 0;
                    do {
                        if (list3 != null) {
                            obj2 = ListProtector.get(list3, i3);
                        } else {
                            obj2 = null;
                        }
                        int iIndexOf2 = list8.indexOf(obj2);
                        if (iIndexOf2 >= 0 && ((GlobalComponentData) ListProtector.get(list9, iIndexOf2)).getShowStrategy() == 2) {
                            ((ArrayList) list).add(((GlobalComponentData) ListProtector.get(list9, iIndexOf2)).getComponentKey());
                        }
                        i3++;
                    } while (i3 < size2);
                }
                if (size3 > 0) {
                    do {
                        if (list6 != null) {
                            obj = ListProtector.get(list6, i);
                        } else {
                            obj = null;
                        }
                        int iIndexOf3 = list8.indexOf(obj);
                        if (iIndexOf3 >= 0 && ((GlobalComponentData) ListProtector.get(list9, iIndexOf3)).getShowStrategy() == 2) {
                            ((ArrayList) list).add(((GlobalComponentData) ListProtector.get(list9, iIndexOf3)).getComponentKey());
                        }
                        i++;
                    } while (i < size3);
                }
                if (list4 == null) {
                    list4 = C13BV.INSTANCE;
                }
                Iterator<String> it2 = list4.iterator();
                while (it2.hasNext()) {
                    int iIndexOf4 = list8.indexOf(it2.next());
                    if (iIndexOf4 >= 0 && ((GlobalComponentData) ListProtector.get(list9, iIndexOf4)).getShowStrategy() == 2) {
                        ((ArrayList) list).add(((GlobalComponentData) ListProtector.get(list9, iIndexOf4)).getComponentKey());
                    }
                }
                if (list5 == null) {
                    list5 = C13BV.INSTANCE;
                }
                Iterator<String> it3 = list5.iterator();
                while (it3.hasNext()) {
                    int iIndexOf5 = list8.indexOf(it3.next());
                    if (iIndexOf5 >= 0 && ((GlobalComponentData) ListProtector.get(list9, iIndexOf5)).getShowStrategy() == 2) {
                        ((ArrayList) list).add(((GlobalComponentData) ListProtector.get(list9, iIndexOf5)).getComponentKey());
                    }
                }
                if (list7 == null) {
                    list7 = C13BV.INSTANCE;
                }
                Iterator<String> it4 = list7.iterator();
                while (it4.hasNext()) {
                    int iIndexOf6 = list8.indexOf(it4.next());
                    if (iIndexOf6 >= 0 && ((GlobalComponentData) ListProtector.get(list9, iIndexOf6)).getShowStrategy() == 2) {
                        ((ArrayList) list).add(((GlobalComponentData) ListProtector.get(list9, iIndexOf6)).getComponentKey());
                    }
                }
            }
        }
    }
}
