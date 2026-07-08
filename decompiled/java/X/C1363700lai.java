package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363700lai {
    public static void LIZ(final List list, final List list2, AbstractC21673619ry abstractC21673619ry, final boolean z, final String str, final List list3) {
        C21342318fd.LIZ(new AbstractC21342018fa(str, list, list2, list3, z) { // from class: X.0laE
            public static final /* synthetic */ int LJFF = 0;
            public final List<IMContact> LIZ;
            public final List<IMContact> LIZIZ;
            public final boolean LIZJ;
            public final String LIZLLL;
            public final List<IMContact> LJ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                BaseContact baseContact = (BaseContact) ListProtector.get(this.LIZIZ, i2);
                if (!(baseContact instanceof C1363720lak) && !(baseContact instanceof C1363730lal) && !(baseContact instanceof C1363680lag) && !(baseContact instanceof C1363740lam) && !(baseContact instanceof C1363280la2) && !(baseContact instanceof C1363200lZu) && !(baseContact instanceof C1363150lZp) && !(baseContact instanceof C1363170lZr) && !(baseContact instanceof C1363310la5) && !(baseContact instanceof C1363750lan) && !(baseContact instanceof C1363320la6) && !(baseContact instanceof C1363130lZn) && !(baseContact instanceof C1363160lZq) && !(baseContact instanceof C1365460ldY) && !(baseContact instanceof IMConversation) && !(baseContact instanceof C1462005nu) && !(baseContact instanceof IMUser) && !(baseContact instanceof IMUserBaseInfo) && !(baseContact instanceof MAFIMUser)) {
                    if ((baseContact instanceof C1363710laj) || (baseContact instanceof C1363190lZt) || (baseContact instanceof C1363140lZo)) {
                        return true;
                    }
                    return false;
                }
                if (!this.LIZJ && !Intrinsics.LJFF(this.LIZLLL, baseContact.getUid()) && !this.LJ.contains(baseContact)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                String str2;
                IMContact iMContact = (IMContact) ListProtector.get(this.LIZ, i);
                IMContact iMContact2 = (IMContact) ListProtector.get(this.LIZIZ, i2);
                if (iMContact instanceof C1363720lak) {
                    return iMContact2 instanceof C1363720lak;
                }
                if (iMContact instanceof C1363730lal) {
                    return iMContact2 instanceof C1363730lal;
                }
                if (iMContact instanceof C1363680lag) {
                    return iMContact2 instanceof C1363680lag;
                }
                if (iMContact instanceof C1363740lam) {
                    return iMContact2 instanceof C1363740lam;
                }
                if (iMContact instanceof C1363280la2) {
                    return iMContact2 instanceof C1363280la2;
                }
                if (iMContact instanceof C1363200lZu) {
                    return iMContact2 instanceof C1363200lZu;
                }
                if (iMContact instanceof C1363150lZp) {
                    return iMContact2 instanceof C1363150lZp;
                }
                if (iMContact instanceof C1363170lZr) {
                    return iMContact2 instanceof C1363170lZr;
                }
                if (iMContact instanceof C1363310la5) {
                    return iMContact2 instanceof C1363310la5;
                }
                if (iMContact instanceof C1363750lan) {
                    return iMContact2 instanceof C1363750lan;
                }
                if (iMContact instanceof C1363320la6) {
                    return iMContact2 instanceof C1363320la6;
                }
                if (iMContact instanceof C1363130lZn) {
                    return iMContact2 instanceof C1363130lZn;
                }
                if (iMContact instanceof C1363160lZq) {
                    return iMContact2 instanceof C1363160lZq;
                }
                if (iMContact instanceof C1365460ldY) {
                    return iMContact2 instanceof C1365460ldY;
                }
                if (iMContact instanceof IMConversation) {
                    if ((iMContact2 instanceof IMConversation) && Intrinsics.LJFF(((IMConversation) iMContact).getConversationId(), ((IMConversation) iMContact2).getConversationId())) {
                        return true;
                    }
                    return false;
                }
                if (iMContact instanceof C1462005nu) {
                    if ((iMContact2 instanceof C1462005nu) && Intrinsics.LJFF(iMContact.getUid(), iMContact2.getUid())) {
                        return true;
                    }
                    return false;
                }
                if (iMContact instanceof IMUser) {
                    if ((iMContact2 instanceof IMUser) && Intrinsics.LJFF(iMContact.getUid(), iMContact2.getUid())) {
                        return true;
                    }
                    return false;
                }
                if (iMContact instanceof IMUserBaseInfo) {
                    if ((iMContact2 instanceof IMUserBaseInfo) && ((IMUserBaseInfo) iMContact).getUserId() == ((IMUserBaseInfo) iMContact2).getUserId()) {
                        return true;
                    }
                    return false;
                }
                if (iMContact instanceof MAFIMUser) {
                    if ((iMContact2 instanceof MAFIMUser) && Intrinsics.LJFF(iMContact.getUid(), iMContact2.getUid())) {
                        return true;
                    }
                    return false;
                }
                if (iMContact instanceof C1363710laj) {
                    return true;
                }
                if (iMContact instanceof C1363190lZt) {
                    if (iMContact2 instanceof C1363190lZt) {
                        C1362500lYm bbDetailInfo = ((C1363190lZt) iMContact).getBbDetailInfo();
                        String str3 = null;
                        if (bbDetailInfo != null) {
                            str2 = bbDetailInfo.LIZ;
                        } else {
                            str2 = null;
                        }
                        C1362500lYm bbDetailInfo2 = ((C1363190lZt) iMContact2).getBbDetailInfo();
                        if (bbDetailInfo2 != null) {
                            str3 = bbDetailInfo2.LIZ;
                        }
                        if (Intrinsics.LJFF(str2, str3)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                if (iMContact instanceof C1363140lZo) {
                    return iMContact2 instanceof C1363140lZo;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i, int i2) {
                Object obj = ListProtector.get(this.LIZIZ, i2);
                if (!(obj instanceof C1365460ldY) && !(obj instanceof IMConversation) && !(obj instanceof C1462005nu) && !(obj instanceof IMUser) && !(obj instanceof IMUserBaseInfo) && !(obj instanceof MAFIMUser)) {
                    return null;
                }
                return new C1363690lah(this.LIZLLL, this.LJ.contains(ListProtector.get(this.LIZIZ, i2)));
            }

            {
                this.LIZ = list;
                this.LIZIZ = list2;
                this.LIZJ = z;
                this.LIZLLL = str;
                this.LJ = list3;
            }
        }, true).LIZJ(abstractC21673619ry);
    }
}
