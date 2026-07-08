package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0ghQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175660ghQ implements Serializable {
    public static final C1175670ghR Companion = new Object() { // from class: X.0ghR
    };
    public String localServiceKeyCategory;

    public C1175660ghQ() {
        this(null);
    }

    public final C1175660ghQ copy(String str) {
        return new C1175660ghQ(str);
    }

    public int hashCode() {
        String str = this.localServiceKeyCategory;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapDetailCategoryStatus(localServiceKeyCategory=");
        sbLIZ.append(this.localServiceKeyCategory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1175660ghQ(String str) {
        this.localServiceKeyCategory = str;
        if (str == null || str.length() == 0) {
            this.localServiceKeyCategory = "popular";
        }
    }

    public final void setLocalServiceKeyCategory(String str) {
        this.localServiceKeyCategory = str;
    }
}
