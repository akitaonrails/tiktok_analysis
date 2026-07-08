package X;

import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;

/* JADX INFO: renamed from: X.0lfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366870lfp {
    public static final void LIZ(IMContact iMContact, SharePanelItemInfo sharePanelItemInfo, int i, List<String> list, boolean z) {
        C1367140lgG info;
        boolean z2;
        InterfaceC1367040lg6 interfaceC1367040lg6;
        if (iMContact.getInfo() == null) {
            info = new C1367140lgG();
        } else {
            info = iMContact.getInfo();
        }
        EnumC1381990m4D enumC1381990m4D = EnumC1381990m4D.SERVER;
        if (!list.contains(C1055660dZs.LIZ(iMContact)) && sharePanelItemInfo.itemType != EnumC1366980lg0.SHARE_PANEL_ITEM_TYPE_MAF.getValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1367140lgG c1367140lgGLIZ = C1367140lgG.LIZ(info, enumC1381990m4D, z2, null, C1367070lg9.LIZ, null, z, null, 84);
        Integer numValueOf = Integer.valueOf(sharePanelItemInfo.itemType);
        int value = EnumC1366980lg0.SHARE_PANEL_ITEM_TYPE_RECENTSHARE.getValue();
        if (numValueOf != null && numValueOf.intValue() == value) {
            iMContact.setType(1);
            iMContact.setRecentContact(1);
            if (i < 5) {
                iMContact.setRecentTop5Contact(1);
            }
            Long l = sharePanelItemInfo.timestamp;
            if (l != null) {
                final long jLongValue = l.longValue();
                interfaceC1367040lg6 = new InterfaceC1367040lg6(jLongValue) { // from class: X.04zz
                    public final long LIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1282104zz) && this.LIZ == ((C1282104zz) obj).LIZ;
                    }

                    public final int hashCode() {
                        return C786410Ut5.Y2(this.LIZ);
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Yes(shareTimeMillis=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = jLongValue;
                    }
                };
            } else {
                interfaceC1367040lg6 = C1367080lgA.LIZ;
            }
            final int i2 = i + 1;
            c1367140lgGLIZ = C1367140lgG.LIZ(c1367140lgGLIZ, null, false, interfaceC1367040lg6, null, new InterfaceC1367150lgH(i2) { // from class: X.0Uxj
                public final int LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C789290Uxj) && this.LIZ == ((C789290Uxj) obj).LIZ;
                }

                public final int hashCode() {
                    return this.LIZ;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("RecentShare(rank=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = i2;
                }
            }, false, null, 107);
        } else {
            int value2 = EnumC1366980lg0.SHARE_PANEL_ITEM_TYPE_RECENTCHAT.getValue();
            if (numValueOf != null && numValueOf.intValue() == value2) {
                iMContact.setType(1);
                iMContact.setRecentContact(1);
                if (i < 5) {
                    iMContact.setRecentTop5Contact(1);
                }
            }
        }
        iMContact.setInfo(c1367140lgGLIZ);
        iMContact.setShareRelationType(sharePanelItemInfo.sortReason);
    }
}
