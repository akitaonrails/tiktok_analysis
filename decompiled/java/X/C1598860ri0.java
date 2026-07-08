package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ri0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598860ri0 implements InterfaceC1891350zJl, InterfaceC1890700zIi, InterfaceC1595240rcA, InterfaceC1598460rhM {
    public final IMUser LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public double LLILZ;
    public final int LLILZIL;
    public final User LLILZLL;
    public final boolean LLIZ;

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        return "friends";
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1595240rcA
    public final int getReRankSequence() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final Integer getReRankType() {
        return -1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMUserPowerItem(contact=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subPriority=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        return this.LL.getUid();
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skylight_muf_");
        sbLIZ.append(this.LL.getUniqueId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C1598110rgn.LIZIZ;
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1598860ri0) {
            C1598860ri0 c1598860ri0 = (C1598860ri0) interfaceC1891350zJl;
            if (this.LLILLJJLI == c1598860ri0.LLILLJJLI && Intrinsics.LJFF(this.LL.getNickName(), c1598860ri0.LL.getNickName()) && Intrinsics.LJFF(this.LL.getUniqueId(), c1598860ri0.LL.getUniqueId()) && Intrinsics.LJFF(this.LL.getDisplayAvatar(), c1598860ri0.LL.getDisplayAvatar())) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1598860ri0) {
            return Intrinsics.LJFF(this.LL, ((C1598860ri0) interfaceC1891350zJl).LL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1598860ri0)) {
            return false;
        }
        return areItemTheSame((InterfaceC1891350zJl) obj);
    }

    @Override // X.InterfaceC1598460rhM
    public final String getItemFilterUid(String str) {
        String uid = this.LL.getUid();
        if (uid == null) {
            return "";
        }
        return uid;
    }

    @Override // X.InterfaceC1598460rhM
    public final int getItemPriority(int i) {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1598860ri0)) {
            return C1600110rk1.LIZ("unknown");
        }
        C1598860ri0 c1598860ri0 = (C1598860ri0) interfaceC1891350zJl;
        if (c1598860ri0.LLILLJJLI != this.LLILLJJLI) {
            return C1600110rk1.LIZ("active_status");
        }
        int i = c1598860ri0.LLILZIL;
        int i2 = this.LLILZIL;
        if (i != i2 && i2 > 0) {
            return C1600110rk1.LIZ("is_story");
        }
        return C1600110rk1.LIZJ();
    }

    public C1598860ri0(IMUser iMUser, boolean z, int i, double d) {
        int iLJ;
        this.LL = iMUser;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = d;
        StoryFeature storyFeatureLIZ = StoryFeature.LIZ.LIZ();
        if (storyFeatureLIZ != null) {
            String uid = iMUser.getUid();
            iLJ = storyFeatureLIZ.LJ(uid == null ? "" : uid);
        } else {
            iLJ = 0;
        }
        this.LLILZIL = iLJ;
        IMUser.Companion.getClass();
        this.LLILZLL = C2201941BFw.LJII(iMUser);
        this.LLIZ = true;
    }
}
