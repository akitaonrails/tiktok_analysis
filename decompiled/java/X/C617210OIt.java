package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617210OIt implements InterfaceC1891350zJl {
    public final BulletinFunctionSetting LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final C0OJ0 LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C617210OIt)) {
            return false;
        }
        C617210OIt c617210OIt = (C617210OIt) obj;
        return Intrinsics.LJFF(this.LL, c617210OIt.LL) && this.LLILLJJLI == c617210OIt.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c617210OIt.LLILLL) && Intrinsics.LJFF(this.LLILZ, c617210OIt.LLILZ);
    }

    public final int hashCode() {
        BulletinFunctionSetting bulletinFunctionSetting = this.LL;
        int iHashCode = (((bulletinFunctionSetting == null ? 0 : bulletinFunctionSetting.hashCode()) * 31) + this.LLILLJJLI) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C0OJ0 c0oj0 = this.LLILZ;
        return iHashCode2 + (c0oj0 != null ? c0oj0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinFunctionSwitchItem(bulletinFunctionSetting=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entranceId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", entranceKey=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C617210OIt c617210OIt;
        BulletinFunctionSetting bulletinFunctionSetting;
        BulletinFunctionSetting bulletinFunctionSetting2 = this.LL;
        if (bulletinFunctionSetting2 == null || !(interfaceC1891350zJl instanceof C617210OIt) || (c617210OIt = (C617210OIt) interfaceC1891350zJl) == null || (bulletinFunctionSetting = c617210OIt.LL) == null || bulletinFunctionSetting2.status != bulletinFunctionSetting.status) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C617210OIt c617210OIt;
        BulletinFunctionSetting bulletinFunctionSetting;
        BulletinFunctionSetting bulletinFunctionSetting2 = this.LL;
        if (bulletinFunctionSetting2 == null || !(interfaceC1891350zJl instanceof C617210OIt) || (c617210OIt = (C617210OIt) interfaceC1891350zJl) == null || (bulletinFunctionSetting = c617210OIt.LL) == null || bulletinFunctionSetting2.functionType != bulletinFunctionSetting.functionType) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C617210OIt c617210OIt;
        BulletinFunctionSetting bulletinFunctionSetting;
        BulletinFunctionSetting bulletinFunctionSetting2 = this.LL;
        if (bulletinFunctionSetting2 == null || !(interfaceC1891350zJl instanceof C617210OIt) || (c617210OIt = (C617210OIt) interfaceC1891350zJl) == null || (bulletinFunctionSetting = c617210OIt.LL) == null || bulletinFunctionSetting2.status == bulletinFunctionSetting.status) {
            return null;
        }
        return new C617240OIw();
    }

    public C617210OIt(BulletinFunctionSetting bulletinFunctionSetting, int i, String str, C0OJ0 c0oj0) {
        this.LL = bulletinFunctionSetting;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c0oj0;
    }
}
