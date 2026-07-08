package X;

import Y.AObserverS191S0200000_32;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.19Cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21502119Cx extends C19D2 {
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

    @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
    public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
        BaseActivity baseActivity2;
        BaseActivity baseActivity3;
        BaseActivity baseActivity4;
        int i;
        super.LJJIIZI(baseActivity, bundle);
        if (C2451209j4.LIZ == 26) {
            TypedValue typedValue = new TypedValue();
            Window window = baseActivity.getWindow();
            boolean z = true;
            if (!baseActivity.getTheme().resolveAttribute(R.attr.g9c, typedValue, true) || typedValue.data == 0) {
                z = false;
            }
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (z) {
                window.clearFlags(134217728);
                window.addFlags(Integer.MIN_VALUE);
                i = systemUiVisibility | 16;
            } else {
                i = systemUiVisibility & (-17);
            }
            if (i != systemUiVisibility) {
                window.getDecorView().setSystemUiVisibility(i);
            }
        }
        if (!LJIJ().LIZIZ) {
            C1202340hOS.LIZIZ(baseActivity, LJIJ());
            C14E2 c14e2 = new C2217371BqR() { // from class: X.14E2
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1202330hOR) obj).LIZJ);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C1202330hOR) obj).LIZJ = ((Boolean) obj2).booleanValue();
                }
            };
            AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(this, baseActivity, 13);
            C259800zU c259800zU = new C259800zU();
            WeakReference<BaseActivity> weakReference = this.LLILLJJLI;
            if (weakReference != null && (baseActivity4 = weakReference.get()) != null) {
                C21172317tJ c21172317tJWQ2 = baseActivity4.getViewModel().wQ2();
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
                    C0R1H.LJ(Transformations.map(mutableLiveData, new AwS611S0100000_32((InterfaceC2217241BqE) c14e2, 31)), baseActivity4, new AObserverS191S0200000_32(c259800zU, awS398S0200000_32, 0));
                }
            }
            C21502319Cz c21502319Cz = new C2217371BqR() { // from class: X.19Cz
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1202330hOR) obj).LJI);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C1202330hOR) obj).LJI = ((Number) obj2).intValue();
                }
            };
            AwS398S0200000_32 awS398S0200000_322 = new AwS398S0200000_32(this, baseActivity, 11);
            C259800zU c259800zU2 = new C259800zU();
            WeakReference<BaseActivity> weakReference2 = this.LLILLJJLI;
            if (weakReference2 != null && (baseActivity3 = weakReference2.get()) != null) {
                C21172317tJ c21172317tJWQ22 = baseActivity3.getViewModel().wQ2();
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
                    C0R1H.LJ(Transformations.map(mutableLiveData2, new AwS611S0100000_32((InterfaceC2217241BqE) c21502319Cz, 32)), baseActivity3, new AObserverS191S0200000_32(c259800zU2, awS398S0200000_322, 1));
                }
            }
            C21502219Cy c21502219Cy = new C2217371BqR() { // from class: X.19Cy
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1202330hOR) obj).LJFF);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C1202330hOR) obj).LJFF = ((Number) obj2).intValue();
                }
            };
            AwS398S0200000_32 awS398S0200000_323 = new AwS398S0200000_32(this, baseActivity, 12);
            C259800zU c259800zU3 = new C259800zU();
            WeakReference<BaseActivity> weakReference3 = this.LLILLJJLI;
            if (weakReference3 != null && (baseActivity2 = weakReference3.get()) != null) {
                C21172317tJ c21172317tJWQ23 = baseActivity2.getViewModel().wQ2();
                if (!c21172317tJWQ23.LIZ.containsKey(C1202330hOR.class)) {
                    c21172317tJWQ23.LIZ.put(C1202330hOR.class, new MutableLiveData<>());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) c21172317tJWQ23.LIZ;
                LiveData mutableLiveData3 = (LiveData) linkedHashMap3.get(C1202330hOR.class);
                if (linkedHashMap3.containsKey(C1202330hOR.class) && mutableLiveData3 == null) {
                    mutableLiveData3 = new MutableLiveData();
                    linkedHashMap3.put(C1202330hOR.class, mutableLiveData3);
                }
                if ((mutableLiveData3 instanceof LiveData) && mutableLiveData3 != null) {
                    C0R1H.LJ(Transformations.map(mutableLiveData3, new AwS611S0100000_32((InterfaceC2217241BqE) c21502219Cy, 33)), baseActivity2, new AObserverS191S0200000_32(c259800zU3, awS398S0200000_323, 2));
                }
            }
        }
    }
}
