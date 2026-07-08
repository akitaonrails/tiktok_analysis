package X;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: renamed from: X.10fD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19301310fD implements Serializable {
    public final Date defaultDate;
    public final int descType;
    public final boolean editable;
    public final Boolean hasAge;
    public final int type;
    public final Date upperBound;

    public C19301310fD() {
        this(-1, -1, null, null, null, false);
    }

    public C19301310fD(int i, int i2, Date date, Date date2, Boolean bool, boolean z) {
        this.type = i;
        this.descType = i2;
        this.defaultDate = date;
        this.upperBound = date2;
        this.hasAge = bool;
        this.editable = z;
    }
}
