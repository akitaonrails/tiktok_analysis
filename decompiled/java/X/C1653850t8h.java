package X;

import a6n.a;
import android.text.TextUtils;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653850t8h extends AbstractC2255721DQs<InterfaceC1653800t8c> implements InterfaceC379610EuV, InterfaceC1653800t8c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public EnumC1653870t8j LLIZLLLIL;
    public String LLJILLL;
    public final List<InterfaceC1654170t9D> LLILLL = new ArrayList();
    public final List<InterfaceC1654200t9G> LLILZ = new ArrayList();
    public final HashMap<EnumC1653870t8j, InterfaceC1653990t8v> LLILZIL = new HashMap<>();
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C1653860t8i.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public EnumC1653870t8j LLJ = (EnumC1653870t8j) o2().LJI.getValue();
    public EnumC1653890t8l LLJI = ((C1654080t94) o2().LIZLLL.getValue()).LIZIZ;
    public final h0<C1648770t0V> LLJIJIL = new h0<>(new C1648770t0V(null, LLLLLJIL(), null));
    public final C11SU<Pair<InterfaceC1654170t9D, Boolean>> LLJILJIL = C11SU.LJLLLLLL();
    public final C01GW LLJILJILJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 386));
    public final h0<C1647390syH> LLJJ = new h0<>(new C1647390syH(null, C1653920t8o.LIZ(LLLLLJIL()), 0, false, false, false, null, false, false, 504));
    public final C11SU<Pair<Integer, Integer>> LLJJI = C11SU.LJLLLLLL();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1653850t8h.class, "tabRepository", "getTabRepository()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/tabs/TabRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1653850t8h.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIJI = 8;
    }

    public InterfaceC1653800t8c W1() {
        return this;
    }

    private final List<String> X1() {
        return Collections.singletonList(EnumC1653890t8l.STORY.getTag());
    }

    private final List<String> Z1() {
        return Collections.singletonList(EnumC1653870t8j.STORY.getTag());
    }

    private final C1649450t1b getSwitchDurationConfigFactory() {
        return (C1649450t1b) this.LLJILJILJ.getValue();
    }

    private final C1653860t8i o2() {
        return (C1653860t8i) this.LLILZLL.getValue(this, LLJJIII[0]);
    }

    @Override // X.InterfaceC1653800t8c
    public List<InterfaceC1654200t9G> Cn0() {
        InterfaceC1654200t9G interfaceC1654200t9G;
        if (this.LLILZ.isEmpty()) {
            for (String str : X1()) {
                EnumC1653890t8l[] enumC1653890t8lArrValues = EnumC1653890t8l.values();
                int length = enumC1653890t8lArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        EnumC1653890t8l enumC1653890t8l = enumC1653890t8lArrValues[i];
                        if (Intrinsics.LJFF(enumC1653890t8l.getTag(), str)) {
                            HashMap<EnumC1653890t8l, InterfaceC1654200t9G> map = C1653950t8r.LIZIZ;
                            if (map.containsKey(enumC1653890t8l) && (interfaceC1654200t9G = map.get(enumC1653890t8l)) != null) {
                                this.LLILZ.add(interfaceC1654200t9G);
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
            HashMap<EnumC1653890t8l, InterfaceC1654200t9G> map2 = C1653950t8r.LIZIZ;
            ArrayList arrayList = new ArrayList(map2.size());
            Iterator<Map.Entry<EnumC1653890t8l, InterfaceC1654200t9G>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!r4.contains(((InterfaceC1654200t9G) obj).LJIIJJI().getTag())) {
                    arrayList2.add(obj);
                }
            }
            this.LLILZ.addAll(arrayList2);
        }
        return this.LLILZ;
    }

    @Override // X.InterfaceC1653800t8c
    public List<InterfaceC1654170t9D> FK0() {
        InterfaceC1654170t9D interfaceC1654170t9D;
        if (this.LLILLL.isEmpty()) {
            for (String str : Z1()) {
                EnumC1653870t8j[] enumC1653870t8jArrValues = EnumC1653870t8j.values();
                int length = enumC1653870t8jArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        EnumC1653870t8j enumC1653870t8j = enumC1653870t8jArrValues[i];
                        if (Intrinsics.LJFF(enumC1653870t8j.getTag(), str)) {
                            HashMap<EnumC1653870t8j, InterfaceC1654170t9D> map = C1653950t8r.LIZ;
                            if (map.containsKey(enumC1653870t8j) && (interfaceC1654170t9D = map.get(enumC1653870t8j)) != null) {
                                this.LLILLL.add(interfaceC1654170t9D);
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
            HashMap<EnumC1653870t8j, InterfaceC1654170t9D> map2 = C1653950t8r.LIZ;
            ArrayList arrayList = new ArrayList(map2.size());
            Iterator<Map.Entry<EnumC1653870t8j, InterfaceC1654170t9D>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!r4.contains(((InterfaceC1654170t9D) obj).LJIIJJI().getTag())) {
                    arrayList2.add(obj);
                }
            }
            this.LLILLL.addAll(arrayList2);
        }
        return this.LLILLL;
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJJIII[1]);
    }

    @Override // X.InterfaceC1647930sz9
    public a provideRecordEnv() {
        a aVar = (a) this.LL.getScope().LJ("record_env_context");
        return aVar == null ? new a(false, null, null, null) : aVar;
    }

    private final void Xi() {
        kO1().LIZ(this, new InterfaceC1441305kZ() { // from class: X.0t8q
            @Override // androidx.lifecycle.Observer
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            }
        });
    }

    @Override // X.InterfaceC1647930sz9
    public boolean couldShowToolbar() {
        return !TextUtils.equals(getCurrentBottomTag(), "record_mode_editor_tab");
    }

    @Override // X.InterfaceC1647930sz9
    public String getCurrentBottomTag() {
        return C1653920t8o.LIZ(LLLLLJIL());
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.InterfaceC1653800t8c
    public EnumC1653870t8j LLLLLJIL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1653800t8c
    public C11SU<Pair<InterfaceC1654170t9D, Boolean>> OH() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1653800t8c
    public EnumC1653890t8l TP0() {
        return this.LLJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC1647930sz9
    public C385670FAf<C1647390syH> getBottomTabIndexChangeEvent() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    @Override // X.InterfaceC1653800t8c
    public C385670FAf<C1648770t0V> kO1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1653800t8c
    public C11SU<Pair<Integer, Integer>> sY0() {
        return this.LLJJI;
    }

    public void G2(EnumC1653870t8j enumC1653870t8j) {
        this.LLJ = enumC1653870t8j;
    }

    @Override // X.InterfaceC1653800t8c
    public InterfaceC1654170t9D Hz2(EnumC1653870t8j enumC1653870t8j) {
        return C1653950t8r.LIZ.get(enumC1653870t8j);
    }

    @Override // X.InterfaceC1653800t8c
    public void configSwitchDuration(C1648150szV c1648150szV) {
        getSwitchDurationConfigFactory().onEvent(c1648150szV);
    }

    @Override // X.InterfaceC1653800t8c
    public void tE1(String str) {
        this.LLJILLL = str;
    }

    public void w2(EnumC1653890t8l enumC1653890t8l) {
        this.LLJI = enumC1653890t8l;
    }

    public C1653850t8h(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    @Override // X.InterfaceC1653800t8c
    public void WF(EnumC1653870t8j enumC1653870t8j, int i) {
        G2(enumC1653870t8j);
        EnumC1653870t8j enumC1653870t8j2 = this.LLIZLLLIL;
        C1648770t0V c1648770t0V = new C1648770t0V(enumC1653870t8j2, enumC1653870t8j, this.LLJILLL);
        InterfaceC1653990t8v interfaceC1653990t8v = this.LLILZIL.get(enumC1653870t8j2);
        if (interfaceC1653990t8v != null) {
            interfaceC1653990t8v.LLLLLILLIL(c1648770t0V);
        }
        InterfaceC1653990t8v interfaceC1653990t8v2 = this.LLILZIL.get(enumC1653870t8j);
        if (interfaceC1653990t8v2 != null) {
            interfaceC1653990t8v2.LJIILIIL(c1648770t0V);
        }
        this.LLJIJIL.LJII(c1648770t0V);
        this.LLJJ.LJII(new C1647390syH(C1653920t8o.LIZ(this.LLIZLLLIL), C1653920t8o.LIZ(LLLLLJIL()), i, false, false, false, null, false, false, 504));
        IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
        if (iBottomTabChangeService != null) {
            iBottomTabChangeService.LIZLLL(this.LLJJ.LIZJ().LIZIZ);
        }
        this.LLIZLLLIL = LLLLLJIL();
    }

    @Override // X.InterfaceC1647930sz9
    public void setBottomSelectedTextColor(int i, int i2) {
        this.LLJJI.onNext(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // X.InterfaceC1653800t8c
    public void t32(EnumC1653870t8j enumC1653870t8j, InterfaceC1653990t8v interfaceC1653990t8v) {
        this.LLILZIL.put(enumC1653870t8j, interfaceC1653990t8v);
        if (LLLLLJIL() == enumC1653870t8j) {
            InterfaceC1653990t8v interfaceC1653990t8v2 = this.LLILZIL.get(enumC1653870t8j);
            if (interfaceC1653990t8v2 != null) {
                interfaceC1653990t8v2.LJIILIIL(kO1().LIZJ());
            }
            this.LLIZLLLIL = LLLLLJIL();
        }
    }

    @Override // X.InterfaceC1653800t8c
    public void zM2(EnumC1653870t8j enumC1653870t8j, InterfaceC1654170t9D interfaceC1654170t9D) {
        boolean z;
        HashMap<EnumC1653870t8j, InterfaceC1654170t9D> map = C1653950t8r.LIZ;
        if (map.containsKey(enumC1653870t8j)) {
            return;
        }
        map.put(enumC1653870t8j, interfaceC1654170t9D);
        this.LLILLL.add(interfaceC1654170t9D);
        if (LLLLLJIL() == enumC1653870t8j) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJIL.onNext(new Pair<>(interfaceC1654170t9D, Boolean.valueOf(z)));
    }
}
