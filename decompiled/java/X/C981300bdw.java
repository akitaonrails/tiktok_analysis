package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0bdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981300bdw extends AbstractC742610TBb<InterfaceC981310bdx> {
    public final MutableLiveData<Boolean> LJIIIZ;
    public final MutableLiveData<Boolean> LJIIJ;
    public final MutableLiveData LJIIJJI;
    public final MutableLiveData<Boolean> LJIIL;
    public final MutableLiveData LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public List<C954460awe> LJIILLIIL;

    public C981300bdw() {
        Boolean bool = Boolean.FALSE;
        this.LJIIIZ = new MutableLiveData<>(bool);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIIJ = mutableLiveData;
        this.LJIIJJI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIIL = mutableLiveData2;
        this.LJIILIIL = mutableLiveData2;
    }

    @Override // X.AbstractC742610TBb, X.InterfaceC969510bKv
    public final void onCleared() {
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIIIZ;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIIJ.setValue(bool);
        this.LJIILLIIL = null;
    }

    public final void LJFF(EnumC981380be4 enumC981380be4) {
        this.LJIIL.setValue(Boolean.TRUE);
        this.LJIIJ.setValue(Boolean.FALSE);
        InterfaceC981310bdx interfaceC981310bdx = (InterfaceC981310bdx) this.LIZIZ;
        if (interfaceC981310bdx != null) {
            interfaceC981310bdx.LJJIJIIJIL(this.LJIILJJIL, enumC981380be4);
        }
    }

    public static void LJ(C981300bdw c981300bdw, long j) {
        c981300bdw.LIZLLL(j, new ArrayList(C915980Zwa.LJII().LLILZLL(false)));
    }

    public final void LIZLLL(long j, List<C954460awe> list) {
        C981500beG c981500beG;
        C963520bBG c963520bBG;
        this.LJIIL.setValue(Boolean.TRUE);
        MutableLiveData<Boolean> mutableLiveData = this.LJIIIZ;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIIJ.setValue(bool);
        this.LJ.setValue(new HashMap());
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        List<Long> list2 = null;
        if (c981480beEM91 != null && (c981500beG = c981480beEM91.LJJIJIIJI) != null) {
            AbstractC963510bBF abstractC963510bBF = c981500beG.LIZ.LJIL;
            if ((abstractC963510bBF instanceof C963520bBG) && (c963520bBG = (C963520bBG) abstractC963510bBF) != null) {
                list2 = c963520bBG.LJI;
            }
        }
        C968660bJY.LIZIZ(list, list2);
        this.LIZJ.setValue(list);
        ArrayList arrayList = new ArrayList();
        C954460awe c954460awe = (C954460awe) C13LP.LJJJLZIJ(0, list);
        if (c954460awe != null && j == c954460awe.LJ) {
            arrayList.addAll(list);
        } else {
            for (C954460awe c954460awe2 : list) {
                if (c954460awe2.LJ == j) {
                    ListProtector.add(arrayList, 0, c954460awe2);
                } else {
                    arrayList.add(c954460awe2);
                }
            }
        }
        this.LJIILL = j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("selected_pk_mode", "take_stage");
        linkedHashMap.put("first_performer_anchor_id", String.valueOf(j));
        C973690bRf c973690bRf = C973690bRf.LIZ;
        C973690bRf.LJIIL("", linkedHashMap);
        C973690bRf.LJJIJIIJIL(12, c973690bRf, "livesdk_pk_order_selection", linkedHashMap, false);
        this.LJIILLIIL = arrayList;
        InterfaceC981310bdx interfaceC981310bdx = (InterfaceC981310bdx) this.LIZIZ;
        if (interfaceC981310bdx != null) {
            interfaceC981310bdx.LJIIIZ(arrayList);
        }
    }
}
