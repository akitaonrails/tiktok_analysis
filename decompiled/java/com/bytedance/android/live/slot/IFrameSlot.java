package com.bytedance.android.live.slot;

import X.C2188811AlT;
import X.EnumC742820TBw;
import X.InterfaceC1124060fMC;
import X.InterfaceC752610Tff;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes18.dex */
public interface IFrameSlot {
    InterfaceC752610Tff LIZJ();

    Animation LJIIZILJ();

    Animation LJIJ();

    View LJIJI(Context context);

    void LJIJJ(String str);

    String getScheme();

    void onHide();

    public static class SlotViewModel extends ViewModel {
        public final MutableLiveData<Pair<Boolean, String>> LL = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LLILLL = new MutableLiveData<>();
        public final Map<EnumC742820TBw, MutableLiveData<Object>> LLILZ = new ConcurrentHashMap();
        public final MutableLiveData<Boolean> LLILZIL;
        public final MutableLiveData<Boolean> LLILZLL;
        public final MutableLiveData<String> LLIZ;
        public final MutableLiveData<Boolean> LLIZLLLIL;

        public SlotViewModel() {
            Boolean bool = Boolean.FALSE;
            this.LLILZIL = new MutableLiveData<>(bool);
            this.LLILZLL = new MutableLiveData<>(bool);
            this.LLIZ = new MutableLiveData<>();
            this.LLIZLLLIL = new MutableLiveData<>(bool);
        }

        public final void vQ2(LifecycleOwner lifecycleOwner) {
            this.LL.removeObservers(lifecycleOwner);
            this.LLILLJJLI.removeObservers(lifecycleOwner);
            this.LLILLL.removeObservers(lifecycleOwner);
            this.LLILZLL.removeObservers(lifecycleOwner);
            MutableLiveData<Boolean> mutableLiveData = this.LLILZLL;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            this.LL.setValue(new Pair<>(bool, "visibility_reason_dispose"));
            this.LLILLJJLI.setValue(null);
            this.LLILLL.setValue(null);
            this.LLILZIL.removeObservers(lifecycleOwner);
            this.LLILZIL.setValue(bool);
            this.LLIZLLLIL.removeObservers(lifecycleOwner);
            this.LLIZLLLIL.setValue(bool);
            Iterator it2 = ((ConcurrentHashMap) this.LLILZ).values().iterator();
            while (it2.hasNext()) {
                ((LiveData) it2.next()).removeObservers(lifecycleOwner);
            }
            ((ConcurrentHashMap) this.LLILZ).clear();
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
