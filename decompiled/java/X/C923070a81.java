package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C923070a81 extends C2217421BqW implements Function0<Unit> {
    public C923070a81(Object obj) {
        super(0, obj, MultiLiveAsAnchorListDialogV2.class, "onReminderInfoClick", "onReminderInfoClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string;
        AbstractC928510aGn abstractC928510aGnLIZ;
        Long lLJIJ;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        String strLJIIJ;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        DialogC928320aGU dialogC928320aGU = (DialogC928320aGU) multiLiveAsAnchorListDialogV2.f.getValue();
        InterfaceC302401Fe interfaceC302401FeLJZL = multiLiveAsAnchorListDialogV2.LJZL();
        if (interfaceC302401FeLJZL == null || (abstractC928510aGnLIZ2 = interfaceC302401FeLJZL.LIZ()) == null || (strLJIIJ = abstractC928510aGnLIZ2.LJIIJ()) == null) {
            dialogC928320aGU.getClass();
        } else {
            dialogC928320aGU.LLJI = strLJIIJ;
        }
        C500260Jjc.LJJLIIIJLLLLLLLZ(dialogC928320aGU);
        String strLJLZ = multiLiveAsAnchorListDialogV2.LJLZ();
        String str = multiLiveAsAnchorListDialogV2.LLLLZ;
        C923090a83 c923090a83 = multiLiveAsAnchorListDialogV2.d;
        if (c923090a83 == null || (string = Long.valueOf(c923090a83.LIZIZ).toString()) == null) {
            InterfaceC302401Fe interfaceC302401FeLJZL2 = multiLiveAsAnchorListDialogV2.LJZL();
            string = (interfaceC302401FeLJZL2 == null || (abstractC928510aGnLIZ = interfaceC302401FeLJZL2.LIZ()) == null || (lLJIJ = abstractC928510aGnLIZ.LJIJ()) == null) ? null : lLJIJ.toString();
        }
        if (Intrinsics.LJFF(C922800a7a.LIZ, "selfie_window")) {
            C922800a7a.LIZ = "";
            strLJLZ = "selfie_window";
        }
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("request_page", strLJLZ);
        map.put("guest_connected_cnt", String.valueOf(C924810aAp.LJ().LJJII));
        map.put("tab_name", str);
        if (string != null) {
            map.put("guest_bonus", string);
        }
        C0KX4.LIZ("livesdk_anchor_guest_bonus_info_popup_show", map, null, true);
        return Unit.LIZ;
    }
}
