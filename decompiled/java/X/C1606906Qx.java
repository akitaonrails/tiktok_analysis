package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataFetchAssem;
import com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS651S0100000_2;

/* JADX INFO: renamed from: X.06Qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1606906Qx implements InterfaceC908930ZlD {
    public final Context LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final ViewModelStoreOwner LIZLLL;
    public long LJ;

    @Override // X.InterfaceC908930ZlD
    public final void LIZIZ() {
        Integer num;
        Boolean bool;
        CreativeToolsPluginService creativeToolsPluginService;
        Boolean bool2;
        Context context = this.LIZ;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        int iIntValue = 0;
        if ((iLiveOuterService == null || (bool2 = (Boolean) iLiveOuterService.LIZJ(Boolean.TRUE, "enable_linkmic_veplugin_adapt")) == null) ? true : bool2.booleanValue()) {
            CreativeToolsPluginService creativeToolsPluginService2 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (C1575980r76.LIZLLL(creativeToolsPluginService2 != null ? Boolean.valueOf(creativeToolsPluginService2.LJIIIZ()) : null) && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
                if (!creativeToolsPluginService.LIZJ(context != null ? C1388190mED.LIZ(context) : null, "go_live_group_chat", true)) {
                    return;
                }
            }
        }
        Context context2 = this.LIZ;
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if ((iLiveOuterService2 == null || (bool = (Boolean) iLiveOuterService2.LIZJ(Boolean.TRUE, "enable_linkmic_lyrax_plugin_adapt")) == null || bool.booleanValue()) && !C04QR.LIZ(context2, true)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LJ < 2000) {
            return;
        }
        this.LJ = jCurrentTimeMillis;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ == null) {
            return;
        }
        ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService3 != null && (num = (Integer) iLiveOuterService3.LIZJ(0, "link_mic_group_go_live_flow_opt")) != null) {
            iIntValue = num.intValue();
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1598306Np(this, iIntValue, c19egLIZIZ, null), 3);
    }

    public final void LIZLLL() {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LIZIZ);
        if (c0y8tLIZ == null) {
            return;
        }
        C0ZFW c0zfw = C0ZFW.LIZ;
        String strLJIIJ = c0zfw.LJIIJ(c0y8tLIZ);
        List<Long> memberIds = c0y8tLIZ.getMemberIds();
        ArrayList arrayListLJ = memberIds != null ? LJ(memberIds) : null;
        String strLJIILLIIL = c0zfw.LJIILLIIL(c0y8tLIZ);
        if (strLJIILLIIL == null) {
            strLJIILLIIL = "";
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            iLiveOuterService.P4(this.LIZ, this.LIZIZ, arrayListLJ, strLJIILLIIL, strLJIIJ, this.LIZLLL, new AwS651S0100000_2(this, 9));
        }
    }

    public static ArrayList LJ(Collection collection) {
        if (collection instanceof ArrayList) {
            return (ArrayList) collection;
        }
        if (collection.size() == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        return arrayList;
    }

    public final void LIZ(String str, Bundle bundle, C11NZ<?> c11nz) {
        ArrayList arrayListLJ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJ;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null) {
            return;
        }
        String strLJIIJ = C0ZFW.LIZ.LJIIJ(c0y8tLIZ);
        List<Long> memberIds = c0y8tLIZ.getMemberIds();
        String string = null;
        if (memberIds != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(memberIds, 10));
            Iterator<Long> it2 = memberIds.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toString());
            }
            arrayListLJ = LJ(arrayList);
        } else {
            arrayListLJ = null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("click_go_live_duration", jCurrentTimeMillis);
        C786410Ut5.LJJJI("chat_group_id", str, bundle2);
        C0Y8Y coreInfo = c0y8tLIZ.getCoreInfo();
        if (coreInfo != null) {
            string = Long.valueOf(coreInfo.getOwner()).toString();
        }
        C786410Ut5.LJJJI("chat_group_owner_uid", string, bundle2);
        int memberCount = c0y8tLIZ.getMemberCount();
        bundle2.putInt("group_user_num", memberCount);
        bundle2.putInt("invite_guest_num", memberCount);
        C786410Ut5.LJJJIL(bundle2, "invite_guest_uid_list", arrayListLJ);
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null) {
            iLiveOuterService.v4(this.LIZ, AFwS187S0000000_2.get$arr$(1406), strLJIIJ, bundle2, c11nz);
        }
    }

    public C1606906Qx(Context context, String str, boolean z, SocialActionBarDataFetchAssem socialActionBarDataFetchAssem) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = socialActionBarDataFetchAssem;
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        IIMGroupLiveAnalytics iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMGroupLiveAnalytics.class);
        if (iIMGroupLiveAnalytics != null) {
            if (i > 3) {
                i = 3;
            }
            iIMGroupLiveAnalytics.LIZLLL(C0I0B.LJFF.LIZIZ(), Integer.valueOf(i), str, str2, str3);
        }
    }
}
