package X;

import com.bytedance.android.live.liveinteract.multilive.model.GroupChatLiveEntranceResponse;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06eL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1657506eL implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final List<C1462005nu> LLIZ;
    public final List<Long> LLIZLLLIL;
    public final GroupChatLiveEntranceResponse.ResponseData LLJ;
    public final C291001Au<IMUser> LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1657506eL)) {
            return false;
        }
        C1657506eL c1657506eL = (C1657506eL) obj;
        return Intrinsics.LJFF(this.LL, c1657506eL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1657506eL.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1657506eL.LLILLL) && this.LLILZ == c1657506eL.LLILZ && this.LLILZIL == c1657506eL.LLILZIL && this.LLILZLL == c1657506eL.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1657506eL.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1657506eL.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1657506eL.LLJ) && Intrinsics.LJFF(this.LLJI, c1657506eL.LLJI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        List<C1462005nu> list = this.LLIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GroupChatLiveEntranceResponse.ResponseData responseData = this.LLJ;
        int iHashCode4 = (iHashCode3 + (responseData == null ? 0 : responseData.hashCode())) * 31;
        C291001Au<IMUser> c291001Au = this.LLJI;
        return iHashCode4 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupChatVMState(groupAvatar=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", groupLeave=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isGroupChatValid=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", groupIsTempBanned=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isMute=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", members=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", memberIdList=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", groupLiveData=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", groupOwnerUserProfileUpdate=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1657506eL(String str, String str2, C291001Au<Boolean> c291001Au, boolean z, boolean z2, boolean z3, List<C1462005nu> list, List<Long> list2, GroupChatLiveEntranceResponse.ResponseData responseData, C291001Au<? extends IMUser> c291001Au2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c291001Au;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = list;
        this.LLIZLLLIL = list2;
        this.LLJ = responseData;
        this.LLJI = c291001Au2;
    }

    public static C1657506eL LIZ(C1657506eL c1657506eL, String str, String str2, C291001Au c291001Au, boolean z, boolean z2, boolean z3, List list, List list2, GroupChatLiveEntranceResponse.ResponseData responseData, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        GroupChatLiveEntranceResponse.ResponseData responseData2 = responseData;
        List list3 = list2;
        List list4 = list;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        C291001Au c291001Au4 = c291001Au;
        String str3 = str2;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c1657506eL.LL;
        }
        if ((i & 2) != 0) {
            str3 = c1657506eL.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au4 = c1657506eL.LLILLL;
        }
        if ((i & 8) != 0) {
            z6 = c1657506eL.LLILZ;
        }
        if ((i & 16) != 0) {
            z5 = c1657506eL.LLILZIL;
        }
        if ((i & 32) != 0) {
            z4 = c1657506eL.LLILZLL;
        }
        if ((i & 64) != 0) {
            list4 = c1657506eL.LLIZ;
        }
        if ((i & 128) != 0) {
            list3 = c1657506eL.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            responseData2 = c1657506eL.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au3 = c1657506eL.LLJI;
        }
        c1657506eL.getClass();
        return new C1657506eL(str4, str3, c291001Au4, z6, z5, z4, list4, list3, responseData2, c291001Au3);
    }
}
