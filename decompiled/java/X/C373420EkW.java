package X;

import Y.AComparatorS24S0000000_5;
import Y.AObjectS240S0100000_5;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.ss.ugc.android.editor.components.base.api.IConsoleBarService;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS24S0000100_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373420EkW extends i<InterfaceC360800ECo, C373410EkV, C373330EkN, C373400EkU> implements InterfaceC379610EuV, InterfaceC360800ECo {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C1DRG LLJILJILJ;
    public C373410EkV LLJILLL;
    public final C01GW LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public String LLJJIII;
    public final Set<InterfaceC373540Eki> LLJJIJI;
    public final Set<InterfaceC373530Ekh> LLJJIJIIJIL;
    public final Map<EnumC373450EkZ, MutableLiveData<Unit>> LLJJIJIL;
    public boolean LLJJJ;
    public final C373480Ekc LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373420EkW.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = 8;
    }

    public static /* synthetic */ void H4() {
    }

    public static /* synthetic */ void P4() {
    }

    @Override // X.InterfaceC360800ECo
    public void IO() {
        this.LLJJJ = false;
        C350440DoY.LIZIZ(this.LLJJJIL);
        C0E48 c0e48K4 = K4();
        if (c0e48K4 != null) {
            c0e48K4.Bo().LIZJ(this.LLJJJIL);
        }
    }

    private final C0E48 K4() {
        return (C0E48) this.LLJJ.getValue();
    }

    private final InterfaceC359950E9h O4() {
        return (InterfaceC359950E9h) this.LLJJI.getValue(this, LLJJJJ[0]);
    }

    @Override // ge.i
    public Function0<C373410EkV> E3() {
        return new AwS549S0100000_5(this, 796);
    }

    @Override // X.InterfaceC360800ECo
    public void Fi2() {
        if (this.LLJJJ) {
            return;
        }
        this.LLJJJ = true;
        C350440DoY.LIZ(this.LLJJJIL);
        C0E48 c0e48K4 = K4();
        if (c0e48K4 != null) {
            c0e48K4.Bo().LIZLLL(this.LLJJJIL);
        }
        d5(false);
    }

    @Override // X.InterfaceC360800ECo
    public LiveState<Long> c8() {
        return Z1(new C2217381BqS() { // from class: X.0Eka
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C373330EkN) obj).LIZJ);
            }
        });
    }

    @Override // X.InterfaceC360800ECo
    public LiveState<EnumC373600Eko> getPlayState() {
        return Z1(new C2217381BqS() { // from class: X.0EkR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C373330EkN) obj).LJ;
            }
        });
    }

    @Override // X.InterfaceC360800ECo
    public LiveState<Long> jq() {
        return Z1(new C2217381BqS() { // from class: X.0EkT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C373330EkN) obj).LIZIZ);
            }
        });
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C373330EkN> o2() {
        return AFwS191S0000000_5.get$arr$(232);
    }

    @Override // X.InterfaceC360800ECo
    public LiveState<EnumC373340EkO> ox() {
        return Z1(new C2217381BqS() { // from class: X.0Ekd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C373330EkN) obj).LIZLLL;
            }
        });
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C373400EkU> w2() {
        return new AwS549S0100000_5(this, 795);
    }

    private final boolean F4() {
        boolean z;
        C0E2C c0e2c;
        Map<EnumC373450EkZ, C373430EkX> map = T2().LIZ;
        if (map.isEmpty()) {
            z = false;
        } else {
            for (Map.Entry<EnumC373450EkZ, C373430EkX> entry : map.entrySet()) {
                if (C1697810uHb.LJIIJJI(EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO, EnumC373450EkZ.FULL_SCREEN).contains(entry.getKey()) && entry.getValue().LIZ == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        C0E48 c0e48K4 = K4();
        if (c0e48K4 == null || (c0e2c = (C0E2C) c0e48K4.S7().LIZJ("panel_bounce_event", null)) == null || !c0e2c.LIZ) {
            return z;
        }
        if (z) {
            return !(C13LP.LJJJJ(c0e2c != null ? c0e2c.LIZJ : null, C1697810uHb.LJIIJJI("volume_panel", "adjust_range_panel", "sound_adjust_panel", "customize_cutout_panel", "adjust_opacity_panel", "mask_panel")) ^ true);
        }
        return false;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventDx0;
        super.onCreate();
        IConsoleBarService iConsoleBarService = (IConsoleBarService) C792600V7i.LIZ(IConsoleBarService.class);
        if (iConsoleBarService != null) {
            iConsoleBarService.init(this);
        }
        InterfaceC359950E9h interfaceC359950E9hO4 = O4();
        if (interfaceC359950E9hO4 == null || (liveEventDx0 = interfaceC359950E9hO4.Dx0()) == null) {
            return;
        }
        liveEventDx0.LIZ(this, new AObjectS240S0100000_5(this, 122));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        IConsoleBarService iConsoleBarService = (IConsoleBarService) C792600V7i.LIZ(IConsoleBarService.class);
        if (iConsoleBarService != null) {
            iConsoleBarService.onDestroy();
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC360800ECo
    public void Cx0(InterfaceC373530Ekh interfaceC373530Ekh) {
        this.LLJJIJIIJIL.add(interfaceC373530Ekh);
    }

    @Override // X.InterfaceC360800ECo
    public void J40(InterfaceC373530Ekh interfaceC373530Ekh) {
        this.LLJJIJIIJIL.remove(interfaceC373530Ekh);
    }

    @Override // X.InterfaceC360800ECo
    public void P42(InterfaceC373540Eki interfaceC373540Eki) {
        this.LLJJIJI.add(interfaceC373540Eki);
    }

    public final void T4(C0E2F c0e2f) {
        Iterator it2 = C13LP.LJLLLL(new AComparatorS24S0000000_5(44), this.LLJJIJIIJIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC373530Ekh) it2.next()).LIZ(c0e2f)) {
                Iterator<T> it3 = this.LLJJIJI.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC373540Eki) it3.next()).onEvent(c0e2f);
                }
                return;
            }
        }
        Iterator<T> it4 = this.LLJJIJI.iterator();
        while (it4.hasNext()) {
            ((InterfaceC373540Eki) it4.next()).onEvent(c0e2f);
        }
    }

    public final void Z4(EnumC373450EkZ enumC373450EkZ) {
        if (!this.LLJJIJIL.containsKey(enumC373450EkZ)) {
            this.LLJJIJIL.put(enumC373450EkZ, new MutableLiveData<>());
        }
        MutableLiveData<Unit> mutableLiveData = this.LLJJIJIL.get(enumC373450EkZ);
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Unit.LIZ);
        }
    }

    @Override // X.InterfaceC360800ECo
    public int[] ZL1(EnumC373450EkZ enumC373450EkZ) {
        View viewLLLLLJLJLL;
        C373410EkV c373410EkV = this.LLJILLL;
        if (c373410EkV != null && (viewLLLLLJLJLL = c373410EkV.LLLLLJLJLL(enumC373450EkZ)) != null) {
            int[] iArr = new int[2];
            viewLLLLLJLJLL.getLocationOnScreen(iArr);
            return new int[]{iArr[0], iArr[1]};
        }
        return null;
    }

    @Override // X.InterfaceC360800ECo
    public void b5(EnumC373600Eko enumC373600Eko) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LIZ);
        EnumC373450EkZ enumC373450EkZ = EnumC373450EkZ.PLAY_PAUSE;
        C373430EkX c373430EkX = (C373430EkX) linkedHashMap.get(enumC373450EkZ);
        if (c373430EkX != null) {
            if (enumC373600Eko == EnumC373600Eko.PLAY) {
                i = R.raw.icon_pause_fill;
            } else {
                i = R.raw.icon_play_fill;
            }
            linkedHashMap.put(enumC373450EkZ, C373430EkX.LIZ(c373430EkX, 0, false, 0.0f, Integer.valueOf(i), 0.0f, 23));
        }
        i3(new AwS371S0200000_5((Map) linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) enumC373600Eko, (EnumC373600Eko) 154));
    }

    public final void d5(boolean z) {
        C0E48 c0e48K4;
        boolean zLIZ;
        boolean zLJFF;
        String uuid;
        NLECommit head;
        if (!this.LLJJJ || (c0e48K4 = K4()) == null) {
            return;
        }
        String str = this.LLJJIII;
        if (str != null) {
            NLEBranch branch = c0e48K4.LLFII().LJI().getBranch();
            if (branch != null && (head = branch.getHead()) != null) {
                uuid = head.getUUID();
            } else {
                uuid = null;
            }
            if (Intrinsics.LJFF(uuid, str)) {
                zLIZ = false;
            } else {
                zLIZ = c0e48K4.Bo().LIZ();
            }
        } else {
            zLIZ = c0e48K4.Bo().LIZ();
        }
        if (z) {
            zLJFF = false;
        } else {
            zLJFF = c0e48K4.Bo().LJFF();
        }
        C0EB4.LIZIZ(this, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO}, null, Boolean.valueOf(zLIZ), null, null, 26);
        C0EB4.LIZIZ(this, new EnumC373450EkZ[]{EnumC373450EkZ.REDO}, null, Boolean.valueOf(zLJFF), null, null, 26);
    }

    @Override // X.InterfaceC360800ECo
    public LiveData<Unit> fD2(EnumC373450EkZ enumC373450EkZ) {
        MutableLiveData<Unit> mutableLiveData = this.LLJJIJIL.get(enumC373450EkZ);
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Unit> mutableLiveData2 = new MutableLiveData<>();
        this.LLJJIJIL.put(enumC373450EkZ, mutableLiveData2);
        return mutableLiveData2;
    }

    @Override // X.InterfaceC360800ECo
    public void pz2(InterfaceC373540Eki interfaceC373540Eki) {
        this.LLJJIJI.remove(interfaceC373540Eki);
    }

    @Override // X.InterfaceC360800ECo
    public void Wh1(String str, boolean z) {
        this.LLJJIII = str;
        d5(z);
    }

    @Override // X.InterfaceC360800ECo
    public void gm0(Long l, Long l2) {
        if (l != null) {
            i3(new AwS24S0000100_5(l.longValue(), 8));
        }
        if (l2 != null) {
            i3(new AwS24S0000100_5(l2.longValue(), 9));
        }
    }

    @Override // X.InterfaceC360800ECo
    public void zB(boolean z, boolean z2) {
        int i;
        int i2;
        EnumC373340EkO enumC373340EkO;
        Integer num;
        if (z2) {
            i = R.raw.icon_tetragon_minus;
        } else {
            i = R.raw.icon_tetragon_plus;
        }
        if (z && F4()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        if (z2) {
            enumC373340EkO = EnumC373340EkO.REMOVE_KEYFRAME;
        } else {
            enumC373340EkO = EnumC373340EkO.ADD_KEYFRAME;
        }
        Map<EnumC373450EkZ, C373430EkX> map = T2().LIZ;
        EnumC373450EkZ enumC373450EkZ = EnumC373450EkZ.KEY_FRAME;
        C373430EkX c373430EkX = map.get(enumC373450EkZ);
        if (c373430EkX != null && (num = c373430EkX.LIZLLL) != null && num.intValue() == i && c373430EkX.LIZ == i2 && T2().LIZLLL == enumC373340EkO) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LIZ);
        C373430EkX c373430EkX2 = (C373430EkX) linkedHashMap.get(enumC373450EkZ);
        if (c373430EkX2 != null) {
            linkedHashMap.put(enumC373450EkZ, C373430EkX.LIZ(c373430EkX2, i2, false, 0.0f, Integer.valueOf(i), 0.0f, 22));
        }
        i3(new AwS371S0200000_5((Map) linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) enumC373340EkO, (EnumC373340EkO) 153));
    }

    public C373420EkW(C19A3 c19a3, C1DRG c1drg, InterfaceC373530Ekh interfaceC373530Ekh) {
        Set<InterfaceC373530Ekh> linkedHashSet;
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 794));
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJJIJI = new LinkedHashSet();
        if (interfaceC373530Ekh != null) {
            linkedHashSet = C093Y.LJ(interfaceC373530Ekh);
        } else {
            linkedHashSet = new LinkedHashSet<>();
        }
        this.LLJJIJIIJIL = linkedHashSet;
        this.LLJJIJIL = new LinkedHashMap();
        this.LLJJJIL = new C373480Ekc(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC360800ECo
    public void DI2(EnumC373450EkZ[] enumC373450EkZArr, Integer num, Boolean bool, Float f, Float f2) {
        int iIntValue;
        boolean zBooleanValue;
        float fFloatValue;
        float fFloatValue2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LIZ);
        for (EnumC373450EkZ enumC373450EkZ : enumC373450EkZArr) {
            C373430EkX c373430EkX = (C373430EkX) linkedHashMap.get(enumC373450EkZ);
            if (c373430EkX == null) {
                c373430EkX = new C373430EkX(0, (boolean) (0 == true ? 1 : 0), 0.0f, (Integer) null, 31);
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c373430EkX.LIZ;
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = c373430EkX.LIZIZ;
            }
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = c373430EkX.LIZJ;
            }
            if (f2 != null) {
                fFloatValue2 = f2.floatValue();
            } else {
                fFloatValue2 = c373430EkX.LJ;
            }
            linkedHashMap.put(enumC373450EkZ, C373430EkX.LIZ(c373430EkX, iIntValue, zBooleanValue, fFloatValue, null, fFloatValue2, 8));
        }
        i3(new AwS584S0100000_5(linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) 711));
    }
}
