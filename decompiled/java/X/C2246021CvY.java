package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel;
import com.ss.android.ugc.aweme.recommend.RecUserPopupInMainActivityController;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246021CvY {
    public static void LIZ(InterfaceC1072780e1U interfaceC1072780e1U, EnumC19359310oZ enumC19359310oZ) {
        interfaceC1072780e1U.destroy();
        RecUserPopupInMainActivityController.LLILZLL.remove(enumC19359310oZ);
        InterfaceC1072780e1U interfaceC1072780e1U2 = RecUserPopupInMainActivityController.LLIZ;
        if (interfaceC1072780e1U == interfaceC1072780e1U2) {
            interfaceC1072780e1U2.destroy();
            RecUserPopupInMainActivityController.LLIZ = null;
        }
        InterfaceC1072780e1U interfaceC1072780e1U3 = RecUserPopupInMainActivityController.LLIZLLLIL;
        if (interfaceC1072780e1U == interfaceC1072780e1U3) {
            interfaceC1072780e1U3.destroy();
            RecUserPopupInMainActivityController.LLIZLLLIL = null;
        }
    }

    public static RecUserPopupInMainActivityController LIZIZ(C19EG c19eg, EnumC19359310oZ enumC19359310oZ, Aweme aweme, LifecycleOwner lifecycleOwner) {
        Map<EnumC19359310oZ, RecUserPopupInMainActivityController> map = RecUserPopupInMainActivityController.LLILZLL;
        RecUserPopupInMainActivityController recUserPopupInMainActivityController = (RecUserPopupInMainActivityController) ((LinkedHashMap) map).get(enumC19359310oZ);
        if (recUserPopupInMainActivityController == null) {
            RecUserPopupInMainActivityController recUserPopupInMainActivityController2 = new RecUserPopupInMainActivityController(c19eg, enumC19359310oZ, aweme, (RecUserInMainActivityViewModel) new ViewModelProvider(c19eg).get(RecUserInMainActivityViewModel.class), lifecycleOwner);
            map.put(enumC19359310oZ, recUserPopupInMainActivityController2);
            return recUserPopupInMainActivityController2;
        }
        return recUserPopupInMainActivityController;
    }
}
