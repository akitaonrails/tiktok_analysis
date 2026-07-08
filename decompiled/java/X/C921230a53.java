package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0a53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C921230a53 extends C2217421BqW implements Function1<Integer, Unit> {
    public C921230a53(Object obj) {
        super(1, obj, MultiLiveAsAnchorListDialogV2.class, "onChangeApplierSettingClick", "onChangeApplierSettingClick(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        int iIntValue = num.intValue();
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        multiLiveAsAnchorListDialogV2.LLLLIIL.LIZLLL(iIntValue, 0, multiLiveAsAnchorListDialogV2.LJLLLL().LIZIZ());
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = multiLiveAsAnchorListDialogV2.LJLLLL().LIZIZ();
        if (multiLiveAnchorPanelSettingsLIZIZ != null) {
            multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting = iIntValue;
        }
        Iterator<?> it2 = multiLiveAsAnchorListDialogV2.LLLLIIIILLL.LL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((next instanceof C930130aJP) && ((C930130aJP) next).LIZIZ == 0) {
                if (i >= 0 && i < multiLiveAsAnchorListDialogV2.LLLLIIIILLL.LL.size()) {
                    multiLiveAsAnchorListDialogV2.LLLLIIIILLL.notifyItemChanged(i);
                }
            } else {
                i++;
            }
        }
        InterfaceC302401Fe interfaceC302401FeLJZL = multiLiveAsAnchorListDialogV2.LJZL();
        if (interfaceC302401FeLJZL != null) {
            interfaceC302401FeLJZL.LJJIJ("fetch_on_change_applier_display_way", 15, new AwS594S0100000_15(multiLiveAsAnchorListDialogV2, 1154), new C5183020f(multiLiveAsAnchorListDialogV2, 355));
        }
        multiLiveAsAnchorListDialogV2.LLLZ = true;
        String strLIZ = C921220a52.LIZ(iIntValue);
        C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.xc;
        boolean zBooleanValue = c20337914i1.LIZIZ().booleanValue();
        InterfaceC302401Fe interfaceC302401FeLJZL2 = multiLiveAsAnchorListDialogV2.LJZL();
        if (interfaceC302401FeLJZL2 != null) {
            abstractC928510aGnLIZ = interfaceC302401FeLJZL2.LIZ();
        } else {
            abstractC928510aGnLIZ = null;
        }
        C921220a52.LIZIZ(strLIZ, zBooleanValue, abstractC928510aGnLIZ);
        c20337914i1.LJFF(Boolean.FALSE);
        return Unit.LIZ;
    }
}
