package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C921090a4p extends C2217421BqW implements Function1<Boolean, Unit> {
    public C921090a4p(Object obj) {
        super(1, obj, MultiLiveAsAnchorListDialogV2.class, "onQuickConnectStateChanged", "onQuickConnectStateChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        List listLJJIII;
        AbstractC928510aGn abstractC928510aGnLIZ;
        boolean zBooleanValue = bool.booleanValue();
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        multiLiveAsAnchorListDialogV2.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[QC_BATCH_INVITE_V1] quickConnectStateChanged isStarted=");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(" sessionId=");
        sbLIZ.append(multiLiveAsAnchorListDialogV2.LLZLLIL);
        sbLIZ.append(" status=");
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel = (MultiGuestAnchorQuickConnectViewModel) multiLiveAsAnchorListDialogV2.LLZZJLIL.getValue();
        EnumC931540aLg enumC931540aLgYQ2 = null;
        if (multiGuestAnchorQuickConnectViewModel != null) {
            enumC931540aLgYQ2 = multiGuestAnchorQuickConnectViewModel.yQ2();
        }
        sbLIZ.append(enumC931540aLgYQ2);
        C20441214yg.LJIIIZ("MultiLiveAsAnchorListDialogV2", C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue) {
            multiLiveAsAnchorListDialogV2.LLLZZ = false;
            multiLiveAsAnchorListDialogV2.LLZ = false;
        } else {
            multiLiveAsAnchorListDialogV2.LLLZZ = true;
            multiLiveAsAnchorListDialogV2.LLZ = true;
            multiLiveAsAnchorListDialogV2.LLZIL = false;
            multiLiveAsAnchorListDialogV2.LLLZZIL = C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ());
            InterfaceC302401Fe interfaceC302401FeLJZL = multiLiveAsAnchorListDialogV2.LJZL();
            if (interfaceC302401FeLJZL == null || (abstractC928510aGnLIZ = interfaceC302401FeLJZL.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
                listLJJIII = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJIII.iterator();
            while (it2.hasNext()) {
                Long lValueOf = Long.valueOf(((LinkPlayerInfo) it2.next()).mUser.getId());
                if (lValueOf.longValue() > 0) {
                    arrayList.add(lValueOf);
                }
            }
            multiLiveAsAnchorListDialogV2.LLZILL = C13LP.LLIIJI(arrayList);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[QC_BATCH_INVITE_V1] resetAttemptState baselineGuestIds=");
            sbLIZ2.append(multiLiveAsAnchorListDialogV2.LLZILL);
            sbLIZ2.append(" linkedGuestCount=");
            sbLIZ2.append(multiLiveAsAnchorListDialogV2.LLLZZIL);
            C20441214yg.LJIIIZ("MultiLiveAsAnchorListDialogV2", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return Unit.LIZ;
    }
}
