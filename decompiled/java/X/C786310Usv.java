package X;

import Y.ARunnableS81S0200000_12;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Usv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786310Usv implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
            case 2:
                onResult$2(this, obj);
                break;
        }
    }

    public static final void onResult$0(C786310Usv c786310Usv, Object obj) {
        C786410Ut5.LLD(8, (C1295960jpS) c786310Usv.l0);
        ImageView imageView = ((C785060Uqu) c786310Usv.l1).LLJ;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
    }

    public static final void onResult$1(C786310Usv c786310Usv, Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS != null) {
            C1295960jpS c1295960jpS = ((C785060Uqu) c786310Usv.l0).LLJI;
            if ((c1295960jpS != null && c1295960jpS.isAnimating()) || (mutableLiveData = ((IIconSlot.SlotViewModel) c786310Usv.l1).LLJJIJI) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
                return;
            }
            final C785060Uqu c785060Uqu = (C785060Uqu) c786310Usv.l0;
            final IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) c786310Usv.l1;
            C1295960jpS c1295960jpS2 = c785060Uqu.LLJI;
            if (c1295960jpS2 != null) {
                c1295960jpS2.removeAllLottieOnCompositionLoadedListener();
            }
            C1295960jpS c1295960jpS3 = c785060Uqu.LLJI;
            if (c1295960jpS3 != null) {
                c1295960jpS3.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0Ur1
                    @Override // X.InterfaceC1296230jpt
                    public final void LIZ(C1294720jnS c1294720jnS2) {
                        Map<String, Bitmap> map;
                        IIconSlot.SlotViewModel slotViewModel2;
                        Map<String, Bitmap> map2;
                        Set<Map.Entry<String, Bitmap>> setEntrySet;
                        IIconSlot.SlotViewModel slotViewModel3 = slotViewModel;
                        if (slotViewModel3 != null && (map = slotViewModel3.LLJLLL) != null && !map.isEmpty() && (slotViewModel2 = slotViewModel) != null && (map2 = slotViewModel2.LLJLLL) != null && (setEntrySet = map2.entrySet()) != null) {
                            C785060Uqu c785060Uqu2 = c785060Uqu;
                            Iterator<T> it2 = setEntrySet.iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                try {
                                    C1295960jpS c1295960jpS4 = c785060Uqu2.LLJI;
                                    if (c1295960jpS4 != null) {
                                        c1295960jpS4.updateBitmap((String) entry.getKey(), (Bitmap) entry.getValue());
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                });
            }
            C1295960jpS c1295960jpS4 = ((C785060Uqu) c786310Usv.l0).LLJI;
            if (c1295960jpS4 != null) {
                c1295960jpS4.setComposition(c1294720jnS);
            }
            C1295960jpS c1295960jpS5 = ((C785060Uqu) c786310Usv.l0).LLJI;
            if (c1295960jpS5 == null) {
                return;
            }
            c1295960jpS5.playAnimation();
        }
    }

    public static final void onResult$2(C786310Usv c786310Usv, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        C740100T1k c740100T1k = (C740100T1k) c786310Usv.l0;
        C1295960jpS c1295960jpS = c740100T1k.LJ.get();
        LifecycleOwner lifecycleOwner = c740100T1k.LIZLLL.get();
        if (c1295960jpS != null && (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED)) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS81S0200000_12(c1294720jnS, c740100T1k, 66));
        }
        Function1 function1 = (Function1) c786310Usv.l1;
        if (function1 != null) {
            function1.invoke(c1294720jnS);
        }
    }

    public C786310Usv(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
