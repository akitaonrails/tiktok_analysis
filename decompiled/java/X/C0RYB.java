package X;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RYB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC1294060jmO
public final class C0RYB implements InterfaceC697190RWj<PriorityProtocol> {
    public static final int LLJILJILJ = Math.abs(UUID.randomUUID().hashCode()) | 33554432;
    public final EnumC697700RYi LL;
    public ViewGroup LLILLJJLI;
    public C0RY9 LLILLL;
    public C0RYA LLILZ;
    public String LLILZLL;
    public int LLJI;
    public C0RYC<PriorityProtocol> LLJIJIL;
    public int LLILZIL = LLJILJILJ;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C0RYG());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C0RYH());
    public final C01GW LLJ = C452501pT.LIZIZ(new C0RYI());
    public final C0RYE LLJILJIL = new Observer() { // from class: X.0RYE
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (this.LL.LLJI == 1) {
                    if (bool.booleanValue()) {
                        this.LL.LJIIIZ();
                    } else {
                        this.LL.LIZJ();
                    }
                }
            }
        }
    };

    @Override // X.InterfaceC697190RWj
    public final void wa(boolean z) {
    }

    @Override // X.InterfaceC697190RWj
    public final void ya() {
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, PriorityProtocol> Aa() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C0RYC<PriorityProtocol>> entry : LJFF().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().LIZ);
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, PriorityProtocol> Ba() {
        Map<String, PriorityProtocol> mapLIZJ;
        C0RYC<PriorityProtocol> c0ryc = this.LLJIJIL;
        return (c0ryc == null || (mapLIZJ = C2097908Jt.LIZJ(new Pair(c0ryc.LIZ.zg(), c0ryc.LIZ))) == null) ? C2097608Jq.LJ() : mapLIZJ;
    }

    public final ViewGroup LIZLLL() {
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final C0RY9 LJ() {
        C0RY9 c0ry9 = this.LLILLL;
        if (c0ry9 != null) {
            return c0ry9;
        }
        return null;
    }

    public final ConcurrentHashMap<String, C0RYC<PriorityProtocol>> LJFF() {
        return (ConcurrentHashMap) this.LLIZ.getValue();
    }

    public final void LJI() {
        C0RYC<PriorityProtocol> c0ryc = this.LLJIJIL;
        if (c0ryc != null) {
            if (!Intrinsics.LJFF(c0ryc.LIZJ, Boolean.TRUE)) {
                LJIIIZ();
                return;
            } else {
                c0ryc.LIZ().removeObserver(this.LLJILJIL);
                c0ryc.LIZ().observe(LJ().getLifecycleOwner(), this.LLJILJIL);
                return;
            }
        }
        LJIIJ(null);
        if (this.LLJI == 1) {
            C786410Ut5.LJJJJI(LIZLLL());
            if (LJFF().isEmpty()) {
                if (this.LLJI <= 2) {
                    this.LLJI = 2;
                }
                LJ().LIZ(null);
            }
        }
    }

    public final void LJIIIZ() {
        ViewGroup viewGroup;
        C0RYC<PriorityProtocol> c0ryc = this.LLJIJIL;
        if (c0ryc == null) {
            return;
        }
        if (this.LLJI <= 2) {
            this.LLJI = 2;
        }
        ViewGroup viewGroupLIZLLL = LIZLLL();
        if (viewGroupLIZLLL.getChildCount() == 1) {
            View childAt = viewGroupLIZLLL.getChildAt(0);
            if (Intrinsics.LJFF(childAt != null ? childAt.getTag(this.LLILZIL) : null, c0ryc.LIZ.zg())) {
                C697890RZb.LIZIZ(this.LLILZLL, c0ryc.LIZ.zg(), EnumC699110RbZ.N2ONE, C0RZ2.SUCCEED);
                LJIIJ(c0ryc);
                LJIIJJI();
                LJ().LIZ(c0ryc.LIZ);
                return;
            }
        }
        C786410Ut5.LJJJJI(LIZLLL());
        View viewVt = c0ryc.LIZ.Vt();
        ViewParent parent = viewVt.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        LIZLLL().addView(viewVt);
        viewVt.setTag(this.LLILZIL, c0ryc.LIZ.zg());
        C697890RZb.LIZIZ(this.LLILZLL, c0ryc.LIZ.zg(), EnumC699110RbZ.N2ONE, C0RZ2.SUCCEED);
        LJIIJ(c0ryc);
        LJIIJJI();
        LJ().LIZ(c0ryc.LIZ);
        C0RYF.LIZIZ((MutableLiveData) this.LLJ.getValue(), c0ryc.LIZ);
    }

    public final void LIZJ() {
        Set<? extends String> setInvoke;
        C0RYC<PriorityProtocol> c0ryc = null;
        c0ryc = null;
        c0ryc = null;
        if (LJFF().isEmpty()) {
            LJ().LIZ(null);
            return;
        }
        if (this.LLJI >= 2) {
            C0RY9 c0ry9LJ = LJ();
            C0RYC<PriorityProtocol> c0ryc2 = this.LLJIJIL;
            c0ry9LJ.LIZ(c0ryc2 != null ? c0ryc2.LIZ : null);
            return;
        }
        C0RYA c0rya = this.LLILZ;
        if (c0rya != null && (setInvoke = c0rya.invoke()) != null) {
            Iterator<T> it2 = setInvoke.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0RYC<PriorityProtocol> c0ryc3 = LJFF().get(it2.next());
                if (c0ryc3 != null && !Intrinsics.LJFF(c0ryc3.LIZ().getValue(), Boolean.FALSE)) {
                    c0ryc = c0ryc3;
                    break;
                }
            }
        }
        if (Intrinsics.LJFF(c0ryc, this.LLJIJIL) && this.LLJI == 1) {
            return;
        }
        if (this.LLJI <= 1) {
            this.LLJI = 1;
        }
        if (c0ryc != null) {
            LIZIZ(c0ryc);
        } else {
            LJIIIIZZ(c0ryc);
        }
        LJI();
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
    public final void LJIIJJI() {
        T t;
        for (Map.Entry<String, C0RYC<PriorityProtocol>> entry : LJFF().entrySet()) {
            String strZg = entry.getValue().LIZ.zg();
            C0RYC<PriorityProtocol> c0ryc = this.LLJIJIL;
            if (Intrinsics.LJFF(strZg, (c0ryc == null || (t = c0ryc.LIZ) == 0) ? null : t.zg())) {
                entry.getValue().LIZIZ.invoke(entry.getValue().LIZ, Boolean.FALSE);
            } else {
                entry.getValue().LIZIZ.invoke(entry.getValue().LIZ, Boolean.TRUE);
            }
        }
    }

    public final List<String> is() {
        ConcurrentHashMap<String, C0RYC<PriorityProtocol>> concurrentHashMapLJFF = LJFF();
        ArrayList arrayList = new ArrayList(concurrentHashMapLJFF.size());
        Iterator<Map.Entry<String, C0RYC<PriorityProtocol>>> it2 = concurrentHashMapLJFF.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue().LIZ.zg());
        }
        return arrayList;
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, PriorityProtocol> za() {
        Set<? extends String> setInvoke;
        LinkedHashMap linkedHashMap = (LinkedHashMap) Aa();
        Set setKeySet = linkedHashMap.keySet();
        C0RYA c0rya = this.LLILZ;
        if (c0rya == null || (setInvoke = c0rya.invoke()) == null) {
            setInvoke = C08CX.INSTANCE;
        }
        Set setLJLLLLLL = C13LP.LJLLLLLL(setKeySet, C13LP.LLIIJI(setInvoke));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (setLJLLLLLL.contains(entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    @Override // X.InterfaceC697190RWj
    public final EnumC697700RYi Ca() {
        return this.LL;
    }

    @Override // X.InterfaceC697190RWj
    public final void unBind() {
        LJII(this);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0RYE] */
    public C0RYB(EnumC697700RYi enumC697700RYi) {
        this.LL = enumC697700RYi;
    }

    public static void LJII(C0RYB c0ryb) {
        c0ryb.LJIIIIZZ(null);
        c0ryb.LLJI = 0;
        LiveData liveData = (LiveData) c0ryb.LLIZLLLIL.getValue();
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            liveData.setValue(null);
        } else {
            liveData.postValue(null);
        }
        c0ryb.LJFF().clear();
        ((LiveData) c0ryb.LLJ.getValue()).setValue(null);
    }

    public final boolean LIZIZ(C0RYC<PriorityProtocol> c0ryc) {
        String strZg;
        T t;
        Set<? extends String> setInvoke;
        C0RYC<PriorityProtocol> c0ryc2 = this.LLJIJIL;
        if (c0ryc2 != null && !Intrinsics.LJFF(c0ryc2.LIZ().getValue(), Boolean.FALSE)) {
            String strZg2 = c0ryc.LIZ.zg();
            String strZg3 = c0ryc2.LIZ.zg();
            C0RYA c0rya = this.LLILZ;
            if (c0rya == null || (setInvoke = c0rya.invoke()) == null || C13LP.LJJJZ(strZg2, setInvoke) >= C13LP.LJJJZ(strZg3, setInvoke)) {
                String str = this.LLILZLL;
                String strZg4 = c0ryc.LIZ.zg();
                EnumC699110RbZ enumC699110RbZ = EnumC699110RbZ.N2ONE;
                C0RZ2 c0rz2 = C0RZ2.FAILED;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Compare failed, priority smaller than ");
                C0RYC<PriorityProtocol> c0ryc3 = this.LLJIJIL;
                if (c0ryc3 != null && (t = c0ryc3.LIZ) != 0) {
                    strZg = t.zg();
                } else {
                    strZg = null;
                }
                sbLIZ.append(strZg);
                C2188811AlT.LIZIZ(sbLIZ);
                C697890RZb.LIZIZ(str, strZg4, enumC699110RbZ, c0rz2);
                return false;
            }
        }
        LJIIIIZZ(c0ryc);
        return true;
    }

    public final void LJIIIIZZ(C0RYC<PriorityProtocol> c0ryc) {
        MutableLiveData<Boolean> mutableLiveDataLIZ;
        if (c0ryc != null && Intrinsics.LJFF(c0ryc, this.LLJIJIL)) {
            return;
        }
        C0RYC<PriorityProtocol> c0ryc2 = this.LLJIJIL;
        if (c0ryc2 != null && (mutableLiveDataLIZ = c0ryc2.LIZ()) != null) {
            mutableLiveDataLIZ.removeObserver(this.LLJILJIL);
        }
        this.LLJIJIL = c0ryc;
    }

    public final void LJIIJ(C0RYC<PriorityProtocol> c0ryc) {
        Set<? extends String> setInvoke;
        String strZg;
        T t;
        String strZg2;
        T t2;
        C0RYA c0rya = this.LLILZ;
        if (c0rya != null) {
            setInvoke = c0rya.invoke();
        } else {
            setInvoke = null;
        }
        ConcurrentHashMap<String, C0RYC<PriorityProtocol>> concurrentHashMapLJFF = LJFF();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C0RYC<PriorityProtocol>> entry : concurrentHashMapLJFF.entrySet()) {
            String strZg3 = entry.getValue().LIZ.zg();
            if (c0ryc != null && (t2 = c0ryc.LIZ) != 0) {
                strZg2 = t2.zg();
            } else {
                strZg2 = null;
            }
            if (true ^ Intrinsics.LJFF(strZg3, strZg2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (setInvoke != null && setInvoke.contains(entry2.getKey())) {
                Boolean bool = ((C0RYC) entry2.getValue()).LIZJ;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2) && !Intrinsics.LJFF(((C0RYC) entry2.getValue()).LIZ().getValue(), bool2)) {
                    C697890RZb.LIZIZ(this.LLILZLL, (String) entry2.getKey(), EnumC699110RbZ.N2ONE, C0RZ2.FAILED);
                } else {
                    String str = this.LLILZLL;
                    String str2 = (String) entry2.getKey();
                    EnumC699110RbZ enumC699110RbZ = EnumC699110RbZ.N2ONE;
                    C0RZ2 c0rz2 = C0RZ2.FAILED;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Compare failed, priority smaller than ");
                    if (c0ryc != null && (t = c0ryc.LIZ) != 0) {
                        strZg = t.zg();
                    } else {
                        strZg = null;
                    }
                    sbLIZ.append(strZg);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C697890RZb.LIZIZ(str, str2, enumC699110RbZ, c0rz2);
                }
            } else {
                C697890RZb.LIZIZ(this.LLILZLL, (String) entry2.getKey(), EnumC699110RbZ.N2ONE, C0RZ2.FAILED);
            }
        }
    }

    public final void LJIIL(PriorityProtocol priorityProtocol) {
        String strZg;
        T t;
        if (LJFF().containsKey(priorityProtocol.zg())) {
            LJFF().remove(priorityProtocol.zg());
            if (Intrinsics.LJFF(this.LLIZLLLIL.getValue(), priorityProtocol)) {
                LiveData liveData = (LiveData) this.LLIZLLLIL.getValue();
                if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
                    liveData.setValue(null);
                } else {
                    liveData.postValue(null);
                }
            }
            String strZg2 = priorityProtocol.zg();
            if (!TextUtils.isEmpty(strZg2)) {
                C0RYC<PriorityProtocol> c0ryc = this.LLJIJIL;
                if (c0ryc != null && (t = c0ryc.LIZ) != 0) {
                    strZg = t.zg();
                } else {
                    strZg = null;
                }
                if (Intrinsics.LJFF(strZg2, strZg)) {
                    LJIIIIZZ(null);
                    ((LiveData) this.LLJ.getValue()).setValue(null);
                }
            }
        }
    }

    @Override // X.InterfaceC697190RWj
    public final void xa(VideoItemParams videoItemParams) {
        String aid;
        Aweme aweme;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        this.LLILZLL = aid;
    }

    public final void LIZ(ViewGroup viewGroup, C0RY9 c0ry9) {
        this.LLILLL = c0ry9;
        this.LLILZ = new C0RYA(c0ry9);
        this.LLILLJJLI = viewGroup;
        if (viewGroup.getId() > 0) {
            this.LLILZIL = viewGroup.getId();
        }
        ((LiveData) this.LLIZLLLIL.getValue()).observe(c0ry9.getLifecycleOwner(), new Observer() { // from class: X.0RYD
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C0RYC<PriorityProtocol> c0ryc = (C0RYC) obj;
                if (c0ryc != null) {
                    C0RYB c0ryb = this.LL;
                    if (c0ryb.LLJI == 1 && c0ryb.LIZIZ(c0ryc)) {
                        this.LL.LJI();
                    }
                }
            }
        });
    }

    public final void ls(PriorityProtocol priorityProtocol, Function2<? super PriorityProtocol, ? super Boolean, Unit> function2, Boolean bool) {
        C0RYC<PriorityProtocol> c0ryc = new C0RYC<>(priorityProtocol, function2, bool);
        if (LJFF().containsValue(c0ryc)) {
            return;
        }
        boolean zContainsKey = LJFF().containsKey(priorityProtocol.zg());
        LJFF().put(priorityProtocol.zg(), c0ryc);
        if (!zContainsKey) {
            C0RYF.LIZIZ((MutableLiveData) this.LLIZLLLIL.getValue(), c0ryc);
        }
    }
}
