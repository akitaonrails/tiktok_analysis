package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.directshow.DirectShowShareTextBoxViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0lcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365070lcv {
    public static C1365120ld0 LIZ(Context context, MutableLiveData mutableLiveData, InterfaceC1364650lcF interfaceC1364650lcF, InterfaceC1365250ldD interfaceC1365250ldD, SharePackage sharePackage, BaseContent baseContent, Map map, Map map2, Map map3, Set set, boolean z, boolean z2, LifecycleOwner lifecycleOwner, View view, boolean z3, boolean z4, MutableLiveData mutableLiveData2, String str, int i) {
        ShareTextBoxViewModel shareTextBoxViewModel;
        MutableLiveData mutableLiveData3 = mutableLiveData2;
        boolean z5 = z;
        Map map4 = map3;
        String str2 = null;
        if ((i & 256) != 0) {
            map4 = null;
        }
        if ((i & 1024) != 0) {
            z5 = false;
        }
        if ((65536 & i) != 0) {
            mutableLiveData3 = null;
        }
        if ((i & 131072) == 0) {
            str2 = str;
        }
        if (sharePackage.extras.getBoolean("key_show_checkbox_directly_when_select")) {
            shareTextBoxViewModel = new DirectShowShareTextBoxViewModel(sharePackage, mutableLiveData, new C1363060lZg((LinearLayout) view.findViewById(R.id.j6q), (C0HZQ) view.findViewById(R.id.dqk), (C0I7D) view.findViewById(R.id.gqg), (C197039127h) view.findViewById(R.id.f6u), 8), interfaceC1365250ldD, interfaceC1364650lcF, z5, z3, z4);
        } else {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.j6q);
            C0HZQ c0hzq = (C0HZQ) view.findViewById(R.id.dqk);
            C0I7D c0i7d = (C0I7D) view.findViewById(R.id.gqg);
            view.findViewById(R.id.zda);
            shareTextBoxViewModel = new ShareTextBoxViewModel(sharePackage, interfaceC1365250ldD, interfaceC1364650lcF, mutableLiveData, new C1363060lZg(linearLayout, c0hzq, c0i7d, (C197039127h) view.findViewById(R.id.f6u)), z5, z3, z4, mutableLiveData3);
        }
        return new C1365120ld0(view, shareTextBoxViewModel, set, z2, new C1365110lcz(context, view, sharePackage, baseContent, map, map2, map4, shareTextBoxViewModel, lifecycleOwner, str2));
    }
}
