package X;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventInviteGuestFragment;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ljG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1369000ljG extends C2217421BqW implements Function0<C1365120ld0> {
    public C1369000ljG(Object obj) {
        super(0, obj, LiveEventInviteGuestFragment.class, "createShareTextBoxComponent", "createShareTextBoxComponent()Lcom/ss/android/ugc/aweme/im/sharepanel/impl/share/ui/textbox/ShareTextBoxLayoutComponent;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1365120ld0 invoke() {
        LiveEventInviteGuestFragment liveEventInviteGuestFragment = (LiveEventInviteGuestFragment) this.receiver;
        SharePackage sharePackage = liveEventInviteGuestFragment.LLILZLL;
        if (sharePackage == null) {
            sharePackage = null;
        }
        String string = sharePackage.extras.getString("enter_method", "");
        C19EG activity = liveEventInviteGuestFragment.getActivity();
        if (activity == null) {
            return null;
        }
        C1361400lX0 c1361400lX0LIZIZ = C1385040m98.LIZIZ(activity);
        MutableLiveData<Boolean> mutableLiveData = liveEventInviteGuestFragment.NR().LLJILJILJ;
        InterfaceC1365250ldD interfaceC1365250ldD = liveEventInviteGuestFragment.LLILZ;
        SharePackage sharePackage2 = liveEventInviteGuestFragment.LLILZLL;
        if (sharePackage2 == null) {
            sharePackage2 = null;
        }
        BaseContent baseContent = liveEventInviteGuestFragment.LLIZ;
        HashMap map = new HashMap();
        map.put("panel_source", TextUtils.equals(string, "long_press") ? "long_press" : "share_panel");
        Map<String, String> map2 = liveEventInviteGuestFragment.LLIZLLLIL;
        if (map2 != null) {
            map.putAll(map2);
        }
        Map<String, String> mapLJFF = liveEventInviteGuestFragment.LLJ;
        if (mapLJFF == null) {
            C1365220ldA c1365220ldA = C1365220ldA.LIZ;
            SharePackage sharePackage3 = liveEventInviteGuestFragment.LLILZLL;
            if (sharePackage3 == null) {
                sharePackage3 = null;
            }
            c1365220ldA.getClass();
            mapLJFF = C1365220ldA.LJFF(sharePackage3);
        }
        Set<? extends IMContact> set = liveEventInviteGuestFragment.LLILLJJLI;
        boolean z = liveEventInviteGuestFragment.LLILZIL;
        boolean z2 = liveEventInviteGuestFragment.LLILLL;
        LifecycleOwner lifecycleOwner = liveEventInviteGuestFragment.getLifecycleOwner();
        View view = liveEventInviteGuestFragment.LLJJJ;
        if (view != null) {
            return C1365070lcv.LIZ(c1361400lX0LIZIZ, mutableLiveData, null, interfaceC1365250ldD, sharePackage2, baseContent, map, mapLJFF, null, set, z, z2, lifecycleOwner, view, false, liveEventInviteGuestFragment.LLJJIII, liveEventInviteGuestFragment.NR().LLJJL, null, 131328);
        }
        return null;
    }
}
