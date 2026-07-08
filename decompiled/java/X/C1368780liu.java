package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0liu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1368780liu extends C2217421BqW implements Function0<C1365120ld0> {
    public C1368780liu(Object obj) {
        super(0, obj, DialogC1368760lis.class, "createShareTextBoxComponent", "createShareTextBoxComponent()Lcom/ss/android/ugc/aweme/im/sharepanel/impl/share/ui/textbox/ShareTextBoxLayoutComponent;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1365120ld0 invoke() {
        DialogC1368760lis dialogC1368760lis = (DialogC1368760lis) this.receiver;
        String string = dialogC1368760lis.LLJJIII.extras.getString("enter_method", "");
        C1365220ldA c1365220ldA = C1365220ldA.LIZ;
        Bundle bundle = dialogC1368760lis.LLJJIII.extras;
        Map<String, String> map = dialogC1368760lis.LLJJIJIL;
        c1365220ldA.getClass();
        C1365220ldA.LIZ(bundle, map);
        C1361400lX0 c1361400lX0LIZIZ = C1385040m98.LIZIZ(dialogC1368760lis.LLJILJIL);
        MutableLiveData<Boolean> mutableLiveData = dialogC1368760lis.LLLIIIL.LLJILJILJ;
        InterfaceC1365250ldD interfaceC1365250ldD = dialogC1368760lis.LLJJ;
        SharePackage sharePackage = dialogC1368760lis.LLJJIII;
        BaseContent baseContent = dialogC1368760lis.LLJJIJI;
        HashMap map2 = new HashMap();
        map2.put("panel_source", TextUtils.equals(string, "long_press") ? "long_press" : "share_panel");
        Map<String, String> map3 = dialogC1368760lis.LLJJIJIIJIL;
        if (map3 != null) {
            map2.putAll(map3);
        }
        Map<String, String> mapLJFF = dialogC1368760lis.LLJJIJIL;
        if (mapLJFF == null) {
            mapLJFF = C1365220ldA.LJFF(dialogC1368760lis.LLJJIII);
        }
        return C1365070lcv.LIZ(c1361400lX0LIZIZ, mutableLiveData, dialogC1368760lis, interfaceC1365250ldD, sharePackage, baseContent, map2, mapLJFF, dialogC1368760lis.LLJJJ, dialogC1368760lis.LLJILJILJ, dialogC1368760lis.LLJJI, dialogC1368760lis.LLJILLL, dialogC1368760lis, dialogC1368760lis.LJLIL(), dialogC1368760lis.LLJZ, dialogC1368760lis.LLJJLIIIJLLLLLLLZ, null, dialogC1368760lis.LLJLLIL, 65536);
    }
}
