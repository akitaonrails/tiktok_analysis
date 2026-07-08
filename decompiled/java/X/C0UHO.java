package X;

import android.widget.ImageView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0UHO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UHO {
    public final C0UHP LIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0UHP] */
    public C0UHO(final MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment) {
        this.LIZ = new InterfaceC766830U6f() { // from class: X.0UHP
            @Override // X.InterfaceC766830U6f
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC766830U6f
            public final void LIZJ() {
                C0UAA multiGuestBeautyLogManager;
                MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment2 = multiGuestEffectSwitchFragment;
                if (((Boolean) multiGuestEffectSwitchFragment2.LL.getValue(multiGuestEffectSwitchFragment2, MultiGuestEffectSwitchFragment.LLJLIL[0])).booleanValue() || (multiGuestBeautyLogManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getMultiGuestBeautyLogManager()) == null) {
                    return;
                }
                Map<Long, C0UD8> map = C0UD7.LIZIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                linkedHashMap.clear();
                ((C0UD7) multiGuestBeautyLogManager).LIZIZ(false);
                linkedHashMap.clear();
                Map<Long, C0UD8> map2 = C0UD7.LIZLLL;
                map.putAll(map2);
                ((LinkedHashMap) map2).clear();
                ((LinkedHashMap) C0UD7.LJ).clear();
                ((LinkedHashMap) C0UD7.LJFF).clear();
                ((LinkedHashMap) C0UD7.LJI).clear();
            }

            @Override // X.InterfaceC766830U6f
            public final C19P4 LIZLLL() {
                C19P4 c19p4 = multiGuestEffectSwitchFragment.LLILLJJLI;
                return c19p4 == null ? new C19P4(multiGuestEffectSwitchFragment.getContext(), null) : c19p4;
            }

            @Override // X.InterfaceC766830U6f
            public final ImageView LJ() {
                return multiGuestEffectSwitchFragment.LLILZLL;
            }

            @Override // X.InterfaceC766830U6f
            public final C16F5 LJI() {
                C16F5 c16f5 = multiGuestEffectSwitchFragment.LLILLL;
                return c16f5 == null ? new C16F5(multiGuestEffectSwitchFragment.getContext(), null) : c16f5;
            }

            @Override // X.InterfaceC766830U6f
            public final Map<String, String> LJFF() {
                return C924620aAW.LJIILL();
            }

            @Override // X.InterfaceC766830U6f
            public final MultiGuestEffectSwitchFragment LJII() {
                return multiGuestEffectSwitchFragment;
            }

            @Override // X.InterfaceC766830U6f
            public final void LIZ(boolean z) {
                float f;
                ImageView imageView = multiGuestEffectSwitchFragment.LLILZLL;
                if (imageView != null) {
                    imageView.setEnabled(z);
                }
                ImageView imageView2 = multiGuestEffectSwitchFragment.LLILZLL;
                if (imageView2 != null) {
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    C786410Ut5.V4(imageView2, f);
                }
            }
        };
    }
}
