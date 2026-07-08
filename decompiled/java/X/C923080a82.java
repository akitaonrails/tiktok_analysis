package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0a82, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C923080a82 extends C2217421BqW implements Function0<C923090a83> {
    public C923080a82(Object obj) {
        super(0, obj, MultiLiveAsAnchorListDialogV2.class, "onReminderInfoGet", "onReminderInfoGet()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/userinfo/anchor/model/RevenueInfo;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C923090a83 invoke() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        String strLJIIIZ;
        String strLJIIJ;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        Long lLJIJ;
        AbstractC928510aGn abstractC928510aGnLIZ4;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        C923090a83 c923090a83 = multiLiveAsAnchorListDialogV2.d;
        if (c923090a83 == null) {
            InterfaceC302401Fe interfaceC302401FeLJZL = multiLiveAsAnchorListDialogV2.LJZL();
            if (interfaceC302401FeLJZL == null || (abstractC928510aGnLIZ = interfaceC302401FeLJZL.LIZ()) == null || abstractC928510aGnLIZ.LJIIIZ() == null) {
                return null;
            }
            InterfaceC302401Fe interfaceC302401FeLJZL2 = multiLiveAsAnchorListDialogV2.LJZL();
            if (interfaceC302401FeLJZL2 == null || (abstractC928510aGnLIZ4 = interfaceC302401FeLJZL2.LIZ()) == null || (strLJIIIZ = abstractC928510aGnLIZ4.LJIIIZ()) == null) {
                strLJIIIZ = CardStruct.IStatusCode.DEFAULT;
            }
            InterfaceC302401Fe interfaceC302401FeLJZL3 = multiLiveAsAnchorListDialogV2.LJZL();
            long jLongValue = (interfaceC302401FeLJZL3 == null || (abstractC928510aGnLIZ3 = interfaceC302401FeLJZL3.LIZ()) == null || (lLJIJ = abstractC928510aGnLIZ3.LJIJ()) == null) ? 0L : lLJIJ.longValue();
            InterfaceC302401Fe interfaceC302401FeLJZL4 = multiLiveAsAnchorListDialogV2.LJZL();
            if (interfaceC302401FeLJZL4 == null || (abstractC928510aGnLIZ2 = interfaceC302401FeLJZL4.LIZ()) == null || (strLJIIJ = abstractC928510aGnLIZ2.LJIIJ()) == null) {
                strLJIIJ = "";
            }
            c923090a83 = new C923090a83(strLJIIIZ, jLongValue, strLJIIJ);
            multiLiveAsAnchorListDialogV2.d = c923090a83;
        }
        return c923090a83;
    }
}
