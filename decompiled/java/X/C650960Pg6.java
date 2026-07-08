package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C650960Pg6 implements Serializable {
    public final C664000Q2s searchCommonModel;
    public final C669560QOc searchEcommerceModel;
    public final C650940Pg4 searchEventModel;
    public final C0Q8L searchInputModel;
    public final C0PYE searchSessionModel;
    public final C664030Q2v searchVideoModel;
    public final C0QJN singleSearchEcommerceModel;

    public C650960Pg6() {
        this(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null));
    }

    public final C650960Pg6 copy(C664000Q2s c664000Q2s, C0Q8L c0q8l, C664030Q2v c664030Q2v, C650940Pg4 c650940Pg4, C0PYE c0pye, C669560QOc c669560QOc, C0QJN c0qjn) {
        return new C650960Pg6(c664000Q2s, c0q8l, c664030Q2v, c650940Pg4, c0pye, c669560QOc, c0qjn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C650960Pg6)) {
            return false;
        }
        C650960Pg6 c650960Pg6 = (C650960Pg6) obj;
        return Intrinsics.LJFF(this.searchCommonModel, c650960Pg6.searchCommonModel) && Intrinsics.LJFF(this.searchInputModel, c650960Pg6.searchInputModel) && Intrinsics.LJFF(this.searchVideoModel, c650960Pg6.searchVideoModel) && Intrinsics.LJFF(this.searchEventModel, c650960Pg6.searchEventModel) && Intrinsics.LJFF(this.searchSessionModel, c650960Pg6.searchSessionModel) && Intrinsics.LJFF(this.searchEcommerceModel, c650960Pg6.searchEcommerceModel) && Intrinsics.LJFF(this.singleSearchEcommerceModel, c650960Pg6.singleSearchEcommerceModel);
    }

    public int hashCode() {
        return (((((((((((this.searchCommonModel.hashCode() * 31) + this.searchInputModel.hashCode()) * 31) + this.searchVideoModel.hashCode()) * 31) + this.searchEventModel.hashCode()) * 31) + this.searchSessionModel.hashCode()) * 31) + this.searchEcommerceModel.hashCode()) * 31) + this.singleSearchEcommerceModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchImmutableData(searchCommonModel=");
        sbLIZ.append(this.searchCommonModel);
        sbLIZ.append(", searchInputModel=");
        sbLIZ.append(this.searchInputModel);
        sbLIZ.append(", searchVideoModel=");
        sbLIZ.append(this.searchVideoModel);
        sbLIZ.append(", searchEventModel=");
        sbLIZ.append(this.searchEventModel);
        sbLIZ.append(", searchSessionModel=");
        sbLIZ.append(this.searchSessionModel);
        sbLIZ.append(", searchEcommerceModel=");
        sbLIZ.append(this.searchEcommerceModel);
        sbLIZ.append(", singleSearchEcommerceModel=");
        sbLIZ.append(this.singleSearchEcommerceModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C650960Pg6(C664000Q2s c664000Q2s, C0Q8L c0q8l, C664030Q2v c664030Q2v, C650940Pg4 c650940Pg4, C0PYE c0pye, C669560QOc c669560QOc, C0QJN c0qjn) {
        this.searchCommonModel = c664000Q2s;
        this.searchInputModel = c0q8l;
        this.searchVideoModel = c664030Q2v;
        this.searchEventModel = c650940Pg4;
        this.searchSessionModel = c0pye;
        this.searchEcommerceModel = c669560QOc;
        this.singleSearchEcommerceModel = c0qjn;
    }
}
