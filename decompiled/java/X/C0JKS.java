package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdk.chatroom.api.Perk;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.vm.SubManagementPageVM;
import com.bytedance.android.livesdk.subscribe.model.CustomBenefitEntrance;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JKS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JKS extends C09AY implements Function0<List<? extends C0JKM>> {
    public final /* synthetic */ SubManagementPageVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JKS(SubManagementPageVM subManagementPageVM) {
        super(0);
        this.LL = subManagementPageVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C0JKM> invoke() {
        final C0JKW c0jkwWQ2 = this.LL.wQ2();
        final C0JKW c0jkwWQ22 = this.LL.wQ2();
        final C0JKW c0jkwWQ23 = this.LL.wQ2();
        this.LL.wQ2();
        return C1697810uHb.LJIIJJI(new C0JKM(c0jkwWQ2) { // from class: X.0JKL
            public final C0JKW LL;

            {
                this.LL = c0jkwWQ2;
            }

            @Override // X.C0JKM
            public final boolean m3(String str) {
                return Intrinsics.LJFF("/sub_only_live", str);
            }

            @Override // X.C0JK8
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String str;
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                Bundle bundle = new Bundle();
                for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C0JKW c0jkw = this.LL;
                if (c0jkw == null || (str = c0jkw.LLILLJJLI) == null) {
                    str = "";
                }
                C786410Ut5.LJJJI("enter_from", str, bundle);
                C786410Ut5.LJJJI("fragment_type", "sub_only_live", bundle);
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                return true;
            }
        }, new C0JKM(c0jkwWQ22) { // from class: X.0JKR
            public final C0JKW LL;

            {
                this.LL = c0jkwWQ22;
            }

            @Override // X.C0JKM
            public final boolean m3(String str) {
                return Intrinsics.LJFF("/sub_only_videos", str);
            }

            @Override // X.C0JK8
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String str;
                GetSubInfoResponse getSubInfoResponse;
                CustomBenefitEntrance customBenefitEntrance;
                List<Perk> list;
                Uri uri = c2436109gd.LIZ;
                boolean z = false;
                if (uri == null) {
                    return false;
                }
                C0JKW c0jkw = this.LL;
                if (c0jkw != null && (getSubInfoResponse = c0jkw.LLILZ) != null && (customBenefitEntrance = getSubInfoResponse.customBenefitEntrance) != null && (list = customBenefitEntrance.enabledPerks) != null && !list.isEmpty()) {
                    Iterator<Perk> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (it2.next().benefitType == 5) {
                            z = true;
                            break;
                        }
                    }
                }
                Bundle bundle = new Bundle();
                for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                bundle.putBoolean("isSubVideoPerksSet", z);
                C0JKW c0jkw2 = this.LL;
                if (c0jkw2 == null || (str = c0jkw2.LLILLJJLI) == null) {
                    str = "";
                }
                C786410Ut5.LJJJI("enter_from", str, bundle);
                C786410Ut5.LJJJI("enter_method", "click_management_tools", bundle);
                C786410Ut5.LJJJI("fragment_type", "sub_only_video_list", bundle);
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                return true;
            }
        }, new C0JKM(c0jkwWQ23) { // from class: X.0JKN
            public final C0JKW LL;

            {
                this.LL = c0jkwWQ23;
            }

            @Override // X.C0JKM
            public final boolean m3(String str) {
                return Intrinsics.LJFF("/sub_only_space", str);
            }

            @Override // X.C0JK8
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String str;
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                Bundle bundle = new Bundle();
                for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "sub_only_space", bundle);
                C0JKW c0jkw = this.LL;
                if (c0jkw != null) {
                    str = c0jkw.LLILLJJLI;
                } else {
                    str = null;
                }
                C786410Ut5.LJJJI("last_enter_from", str, bundle);
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                return true;
            }
        }, new C0JKT(new C512180K6u(this.LL)));
    }
}
