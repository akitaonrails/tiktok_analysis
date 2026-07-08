package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362370lYZ implements InterfaceC1361730lXX {
    public final IMContact LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final List<IMContact> LLILZIL;
    public final C429270GsP LLILZLL;
    public final C1362180lYG LLIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NormalIMContactPowerItem(contact=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needRefreshState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", needRefreshAuthorUid=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", activityStatusVO=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", uiState=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLIZ.hashCode();
    }

    @Override // X.InterfaceC1361730lXX
    public final IMContact LJLJJI() {
        return this.LL;
    }

    @Override // X.InterfaceC1361730lXX
    public final int getPosition() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1362370lYZ)) {
            return false;
        }
        IMContact iMContact = this.LL;
        if (iMContact instanceof C1365460ldY) {
            return true;
        }
        if (!(iMContact instanceof IMConversation) && !(iMContact instanceof C1462005nu) && !(iMContact instanceof IMUser) && !(iMContact instanceof IMUserBaseInfo) && !(iMContact instanceof MAFIMUser)) {
            return Intrinsics.LJFF(iMContact, ((C1362370lYZ) interfaceC1891350zJl).LL);
        }
        return Intrinsics.LJFF(this.LLIZ, ((C1362370lYZ) interfaceC1891350zJl).LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        IMUserBaseInfo iMUserBaseInfo;
        IMConversation iMConversation;
        if (!(interfaceC1891350zJl instanceof C1362370lYZ)) {
            return false;
        }
        IMContact iMContact = this.LL;
        if (iMContact instanceof C1365460ldY) {
            return ((C1362370lYZ) interfaceC1891350zJl).LL instanceof C1365460ldY;
        }
        if (iMContact instanceof IMConversation) {
            IMContact iMContact2 = ((C1362370lYZ) interfaceC1891350zJl).LL;
            if (!(iMContact2 instanceof IMConversation) || (iMConversation = (IMConversation) iMContact2) == null || !Intrinsics.LJFF(((IMConversation) iMContact).getConversationId(), iMConversation.getConversationId())) {
                return false;
            }
            return true;
        }
        if (iMContact instanceof C1462005nu) {
            IMContact iMContact3 = ((C1362370lYZ) interfaceC1891350zJl).LL;
            if (!(iMContact3 instanceof C1462005nu) || iMContact3 == null || !Intrinsics.LJFF(iMContact.getUid(), iMContact3.getUid())) {
                return false;
            }
            return true;
        }
        if (iMContact instanceof IMUser) {
            IMContact iMContact4 = ((C1362370lYZ) interfaceC1891350zJl).LL;
            if (!(iMContact4 instanceof IMUser) || iMContact4 == null || !Intrinsics.LJFF(iMContact.getUid(), iMContact4.getUid())) {
                return false;
            }
            return true;
        }
        if (iMContact instanceof IMUserBaseInfo) {
            IMContact iMContact5 = ((C1362370lYZ) interfaceC1891350zJl).LL;
            if (!(iMContact5 instanceof IMUserBaseInfo) || (iMUserBaseInfo = (IMUserBaseInfo) iMContact5) == null || ((IMUserBaseInfo) iMContact).getUserId() != iMUserBaseInfo.getUserId()) {
                return false;
            }
            return true;
        }
        if (iMContact instanceof MAFIMUser) {
            IMContact iMContact6 = ((C1362370lYZ) interfaceC1891350zJl).LL;
            if (!(iMContact6 instanceof MAFIMUser) || iMContact6 == null || !Intrinsics.LJFF(iMContact.getUid(), iMContact6.getUid())) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(iMContact, ((C1362370lYZ) interfaceC1891350zJl).LL);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1362370lYZ.class, cls)) {
            return false;
        }
        C1362370lYZ c1362370lYZ = (C1362370lYZ) obj;
        if (Intrinsics.LJFF(this.LL, c1362370lYZ.LL) && Intrinsics.LJFF(this.LLIZ, c1362370lYZ.LLIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        if (!(interfaceC1891350zJl instanceof C1362370lYZ) || (i = !Intrinsics.LJFF(this.LLIZ, ((C1362370lYZ) interfaceC1891350zJl).LLIZ) ? 1 : 0) == 0) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static C1362370lYZ LIZ(C1362370lYZ c1362370lYZ, String str, C429270GsP c429270GsP, C1362180lYG c1362180lYG, int i) {
        IMContact iMContact;
        int i2;
        boolean z;
        C1362180lYG c1362180lYG2 = c1362180lYG;
        C429270GsP c429270GsP2 = c429270GsP;
        String str2 = str;
        List<IMContact> list = null;
        if ((i & 1) != 0) {
            iMContact = c1362370lYZ.LL;
        } else {
            iMContact = null;
        }
        if ((i & 2) != 0) {
            i2 = c1362370lYZ.LLILLJJLI;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            z = c1362370lYZ.LLILLL;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = c1362370lYZ.LLILZ;
        }
        if ((i & 16) != 0) {
            list = c1362370lYZ.LLILZIL;
        }
        if ((i & 32) != 0) {
            c429270GsP2 = c1362370lYZ.LLILZLL;
        }
        if ((i & 64) != 0) {
            c1362180lYG2 = c1362370lYZ.LLIZ;
        }
        c1362370lYZ.getClass();
        return new C1362370lYZ(iMContact, i2, z, str2, list, c429270GsP2, c1362180lYG2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1362370lYZ(IMContact iMContact, int i, boolean z, String str, List<? extends IMContact> list, C429270GsP c429270GsP, C1362180lYG c1362180lYG) {
        this.LL = iMContact;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = list;
        this.LLILZLL = c429270GsP;
        this.LLIZ = c1362180lYG;
    }
}
