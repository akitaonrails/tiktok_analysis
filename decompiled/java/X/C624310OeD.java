package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OeD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624310OeD extends AbstractC890600Ywk {
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final UrlModel LLILZLL;
    public final String LLIZ;

    public C624310OeD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C624310OeD)) {
            return false;
        }
        C624310OeD c624310OeD = (C624310OeD) obj;
        return this.LLILLJJLI == c624310OeD.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c624310OeD.LLILLL) && Intrinsics.LJFF(this.LLILZ, c624310OeD.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c624310OeD.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c624310OeD.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c624310OeD.LLIZ);
    }

    public final int hashCode() {
        int i = this.LLILLJJLI * 31;
        String str = this.LLILLL;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.LLIZ;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBoardGuideItem(widgetType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", creatorTypeStr=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC890600Ywk, X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return new C0ZB9() { // from class: X.0OeE
        };
    }

    public /* synthetic */ C624310OeD(int i) {
        this(null, null, null, null, null, 4);
    }

    public C624310OeD(String str, String str2, String str3, UrlModel urlModel, String str4, int i) {
        super(i);
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = urlModel;
        this.LLIZ = str4;
    }
}
