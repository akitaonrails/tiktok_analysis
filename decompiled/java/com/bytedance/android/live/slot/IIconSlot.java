package com.bytedance.android.live.slot;

import X.C2188811AlT;
import X.C785040Uqs;
import X.C785100Uqy;
import X.EnumC742820TBw;
import X.EnumC756890TmZ;
import X.InterfaceC1124060fMC;
import X.InterfaceC752610Tff;
import X.InterfaceC784990Uqn;
import X.InterfaceC785110Uqz;
import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public interface IIconSlot {
    Animator.AnimatorListener LIZ();

    InterfaceC752610Tff LIZJ();

    void getScheme();

    public static class SlotViewModel extends ViewModel {
        public final MutableLiveData<Boolean> LL = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LLILLJJLI;
        public final MutableLiveData<Boolean> LLILLL;
        public final MutableLiveData<Boolean> LLILZ;
        public final MutableLiveData<Boolean> LLILZIL;
        public final MutableLiveData<String> LLILZLL;
        public final MutableLiveData<Boolean> LLIZ;
        public final MutableLiveData<String> LLIZLLLIL;
        public final MutableLiveData<Drawable> LLJ;
        public final MutableLiveData<Drawable> LLJI;
        public final MutableLiveData<Drawable> LLJIJIL;
        public final MutableLiveData<Drawable> LLJILJIL;
        public final MutableLiveData<String> LLJILJILJ;
        public final MutableLiveData<String> LLJILLL;
        public final MutableLiveData<String> LLJJ;
        public final MutableLiveData<C785100Uqy> LLJJI;
        public final MutableLiveData<C785040Uqs> LLJJIII;
        public final MutableLiveData<Boolean> LLJJIJI;
        public final Map<EnumC742820TBw, MutableLiveData<Object>> LLJJIJIIJIL;
        public final MutableLiveData<Boolean> LLJJIJIL;
        public final MutableLiveData<Boolean> LLJJJ;
        public final MutableLiveData<Boolean> LLJJJIL;
        public final MutableLiveData<Boolean> LLJJJJ;
        public final MutableLiveData<Boolean> LLJJJJJIL;
        public final MutableLiveData<Boolean> LLJJJJLIIL;
        public final MutableLiveData<Pair<Boolean, Integer>> LLJJL;
        public final MutableLiveData<Boolean> LLJJLIIIJLLLLLLLZ;
        public final MutableLiveData<Float> LLJL;
        public long LLJLIL;
        public String LLJLILLLLZIIL;
        public String LLJLL;
        public Integer LLJLLIL;
        public Map<String, Bitmap> LLJLLL;
        public Integer LLJZ;
        public Integer LLJZIJLIL;
        public InterfaceC784990Uqn LLL;
        public InterfaceC785110Uqz LLLF;
        public Animator LLLFF;
        public Boolean LLLFFI;
        public Boolean LLLFZ;
        public EnumC756890TmZ LLLI;
        public Boolean LLLII;
        public float LLLIIII;

        public SlotViewModel() {
            Boolean bool = Boolean.FALSE;
            this.LLILLJJLI = new MutableLiveData<>(bool);
            this.LLILLL = new MutableLiveData<>(bool);
            this.LLILZ = new MutableLiveData<>();
            this.LLILZIL = new MutableLiveData<>();
            this.LLILZLL = new MutableLiveData<>();
            this.LLIZ = new MutableLiveData<>();
            this.LLIZLLLIL = new MutableLiveData<>();
            this.LLJ = new MutableLiveData<>();
            this.LLJI = new MutableLiveData<>();
            this.LLJIJIL = new MutableLiveData<>();
            this.LLJILJIL = new MutableLiveData<>();
            this.LLJILJILJ = new MutableLiveData<>();
            this.LLJILLL = new MutableLiveData<>();
            this.LLJJ = new MutableLiveData<>();
            this.LLJJI = new MutableLiveData<>();
            this.LLJJIII = new MutableLiveData<>();
            this.LLJJIJI = new MutableLiveData<>();
            this.LLJJIJIIJIL = new ConcurrentHashMap();
            this.LLJJIJIL = new MutableLiveData<>();
            this.LLJJJ = new MutableLiveData<>();
            this.LLJJJIL = new MutableLiveData<>();
            this.LLJJJJ = new MutableLiveData<>();
            this.LLJJJJJIL = new MutableLiveData<>();
            this.LLJJJJLIIL = new MutableLiveData<>();
            this.LLJJL = new MutableLiveData<>();
            this.LLJJLIIIJLLLLLLLZ = new MutableLiveData<>();
            this.LLJL = new MutableLiveData<>();
            this.LLJLIL = 0L;
            this.LLLFFI = bool;
            this.LLLFZ = bool;
            this.LLLI = EnumC756890TmZ.DEFAULT;
            this.LLLII = bool;
            this.LLLIIII = 1.0f;
        }

        public final void vQ2(LifecycleOwner lifecycleOwner) {
            xQ2(lifecycleOwner);
            this.LLJLIL = 0L;
            this.LLJLILLLLZIIL = null;
            this.LLJLLL = null;
            this.LLJZ = 0;
            this.LLL = null;
            this.LLLF = null;
            MutableLiveData<Boolean> mutableLiveData = this.LLILZ;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            this.LLILLJJLI.setValue(bool);
            this.LLILLL.setValue(bool);
            this.LLILZLL.setValue(null);
            this.LLIZ.setValue(bool);
            this.LLIZLLLIL.setValue(null);
            this.LLJ.setValue(null);
            this.LLJILJIL.setValue(null);
            this.LLJILJILJ.setValue(null);
            this.LLJILLL.setValue(null);
            this.LLJJ.setValue(null);
            this.LLJJI.setValue(null);
            this.LLJJIJI.setValue(bool);
            this.LLJIJIL.setValue(null);
            this.LL.setValue(bool);
            this.LLJI.setValue(null);
            this.LLJJIJIL.setValue(bool);
            ((ConcurrentHashMap) this.LLJJIJIIJIL).clear();
            Animator animator = this.LLLFF;
            if (animator != null && animator.isRunning()) {
                this.LLLFF.cancel();
            }
            this.LLLFF = null;
            this.LLJJJ.setValue(null);
            this.LLJJJIL.setValue(null);
            this.LLJJJJ.setValue(null);
            this.LLJJJJLIIL.setValue(bool);
            this.LLJJL.setValue(Pair.create(bool, -1));
            this.LLJJLIIIJLLLLLLLZ.setValue(bool);
            this.LLJL.setValue(Float.valueOf(0.0f));
            this.LLLI = EnumC756890TmZ.DEFAULT;
            this.LLLFZ = bool;
        }

        public final void xQ2(LifecycleOwner lifecycleOwner) {
            this.LL.removeObservers(lifecycleOwner);
            this.LLILZ.removeObservers(lifecycleOwner);
            this.LLILZLL.removeObservers(lifecycleOwner);
            this.LLIZ.removeObservers(lifecycleOwner);
            this.LLIZLLLIL.removeObservers(lifecycleOwner);
            this.LLJ.removeObservers(lifecycleOwner);
            this.LLJILJIL.removeObservers(lifecycleOwner);
            this.LLJILJILJ.removeObservers(lifecycleOwner);
            this.LLJILLL.removeObservers(lifecycleOwner);
            this.LLJJ.removeObservers(lifecycleOwner);
            this.LLJJI.removeObservers(lifecycleOwner);
            this.LLJIJIL.removeObservers(lifecycleOwner);
            this.LLJJIJI.removeObservers(lifecycleOwner);
            this.LLJI.removeObservers(lifecycleOwner);
            this.LLJJIJIL.removeObservers(lifecycleOwner);
            this.LLJJJ.removeObservers(lifecycleOwner);
            this.LLJJJIL.removeObservers(lifecycleOwner);
            this.LLJJJJ.removeObservers(lifecycleOwner);
            this.LLJJJJLIIL.removeObservers(lifecycleOwner);
            Iterator it2 = ((ConcurrentHashMap) this.LLJJIJIIJIL).values().iterator();
            while (it2.hasNext()) {
                ((LiveData) it2.next()).removeObservers(lifecycleOwner);
            }
            this.LLJJL.removeObservers(lifecycleOwner);
            this.LLJJLIIIJLLLLLLLZ.removeObservers(lifecycleOwner);
            this.LLJL.removeObservers(lifecycleOwner);
        }

        public static SlotViewModel wQ2(InterfaceC1124060fMC interfaceC1124060fMC, ViewModelStoreOwner viewModelStoreOwner) {
            ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStoreOwner);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(interfaceC1124060fMC.LLJ().name());
            sbLIZ.append(interfaceC1124060fMC.hashCode());
            return (SlotViewModel) viewModelProvider.get(C2188811AlT.LIZIZ(sbLIZ), SlotViewModel.class);
        }
    }
}
