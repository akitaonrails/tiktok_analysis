package X;

import Y.AObserverS191S0200000_32;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.19DC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DC extends C19DG {
    public final C1202330hOR LLILLL = new C1202330hOR(false, 3);

    public final C1202330hOR LJIJ() {
        C06W3 next;
        Iterator<C06W3> it2 = LJIIZILJ().LIZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next instanceof C1202330hOR) {
                break;
            }
        }
        C1202330hOR c1202330hOR = (C1202330hOR) (next instanceof C1202330hOR ? next : null);
        return c1202330hOR == null ? this.LLILLL : c1202330hOR;
    }

    @Override // X.C19DE, X.C1EKA
    public final void LJIILJJIL(BaseFragment baseFragment) {
        BaseFragment baseFragment2;
        BaseFragment baseFragment3;
        if (!LJIJ().LIZIZ && !(baseFragment.getParentFragment() instanceof TuxSheet)) {
            C1202330hOR c1202330hORLJIJ = LJIJ();
            C1202340hOS.LIZJ(C1202340hOS.LIZ(baseFragment, c1202330hORLJIJ, false, true), c1202330hORLJIJ);
            C19D0 c19d0 = new C2217371BqR() { // from class: X.19D0
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1202330hOR) obj).LJFF);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C1202330hOR) obj).LJFF = ((Number) obj2).intValue();
                }
            };
            AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(this, baseFragment, 107);
            C259800zU c259800zU = new C259800zU();
            WeakReference<BaseFragment> weakReference = this.LLILLJJLI;
            if (weakReference != null && (baseFragment3 = weakReference.get()) != null) {
                C21172317tJ c21172317tJWQ2 = baseFragment3.PR().wQ2();
                if (!c21172317tJWQ2.LIZ.containsKey(C1202330hOR.class)) {
                    c21172317tJWQ2.LIZ.put(C1202330hOR.class, new MutableLiveData<>());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c21172317tJWQ2.LIZ;
                LiveData mutableLiveData = (LiveData) linkedHashMap.get(C1202330hOR.class);
                if (linkedHashMap.containsKey(C1202330hOR.class) && mutableLiveData == null) {
                    mutableLiveData = new MutableLiveData();
                    linkedHashMap.put(C1202330hOR.class, mutableLiveData);
                }
                if ((mutableLiveData instanceof LiveData) && mutableLiveData != null) {
                    Transformations.map(mutableLiveData, new AwS611S0100000_32((InterfaceC2217241BqE) c19d0, 390)).observe(baseFragment3, new AObserverS191S0200000_32(c259800zU, awS398S0200000_32, 5));
                }
            }
            C19D1 c19d1 = new C2217371BqR() { // from class: X.19D1
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1202330hOR) obj).LJI);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C1202330hOR) obj).LJI = ((Number) obj2).intValue();
                }
            };
            AwS398S0200000_32 awS398S0200000_322 = new AwS398S0200000_32(this, baseFragment, 108);
            C259800zU c259800zU2 = new C259800zU();
            WeakReference<BaseFragment> weakReference2 = this.LLILLJJLI;
            if (weakReference2 != null && (baseFragment2 = weakReference2.get()) != null) {
                C21172317tJ c21172317tJWQ22 = baseFragment2.PR().wQ2();
                if (!c21172317tJWQ22.LIZ.containsKey(C1202330hOR.class)) {
                    c21172317tJWQ22.LIZ.put(C1202330hOR.class, new MutableLiveData<>());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c21172317tJWQ22.LIZ;
                LiveData mutableLiveData2 = (LiveData) linkedHashMap2.get(C1202330hOR.class);
                if (linkedHashMap2.containsKey(C1202330hOR.class) && mutableLiveData2 == null) {
                    mutableLiveData2 = new MutableLiveData();
                    linkedHashMap2.put(C1202330hOR.class, mutableLiveData2);
                }
                if ((mutableLiveData2 instanceof LiveData) && mutableLiveData2 != null) {
                    Transformations.map(mutableLiveData2, new AwS611S0100000_32((InterfaceC2217241BqE) c19d1, 391)).observe(baseFragment2, new AObserverS191S0200000_32(c259800zU2, awS398S0200000_322, 6));
                }
            }
        }
    }
}
