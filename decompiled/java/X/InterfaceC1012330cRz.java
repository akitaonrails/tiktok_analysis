package X;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.Map;

/* JADX INFO: renamed from: X.0cRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1012330cRz {
    void LIZ(long j, InterfaceC1107240ev4 interfaceC1107240ev4);

    void LIZIZ(LifecycleOwner lifecycleOwner, IIconSlot.SlotViewModel slotViewModel, Long l);

    void LIZJ(int i);

    void LIZLLL(long j, InterfaceC1107240ev4 interfaceC1107240ev4);

    void LJ(Long l, boolean z);

    boolean LJFF(Uri uri);

    String[] LJI();

    void LJII(LifecycleOwner lifecycleOwner, IIconSlot.SlotViewModel slotViewModel);

    C1107270ev7 LJIIIIZZ(ViewGroup viewGroup, String str, EnumC1012360cS2 enumC1012360cS2, Fragment fragment, Map map, InterfaceC1107240ev4 interfaceC1107240ev4);
}
