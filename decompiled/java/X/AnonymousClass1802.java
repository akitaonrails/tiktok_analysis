package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import java.lang.Enum;

/* JADX INFO: renamed from: X.1802, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AnonymousClass1802<W, VM extends ViewModel, T extends Enum<T>> extends AbsSlotWidget<W, VM, T> {
    public final /* synthetic */ C180A LLILLL = new C180A();

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        C180A c180a = this.LLILLL;
        c180a.LIZ = 0L;
        c180a.LIZIZ = true;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onCreate(Bundle bundle) {
        C180A c180a = this.LLILLL;
        c180a.getClass();
        c180a.LIZ = System.currentTimeMillis();
    }
}
