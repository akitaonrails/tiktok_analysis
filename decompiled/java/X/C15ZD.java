package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.15ZD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZD implements Serializable {
    public final int endHour;
    public final int endMinute;
    public final int startHour;
    public final int startMinute;
    public final int status;
    public final int weekDay;

    public C15ZD() {
        this(0, 0, 0, 0, 0, 0);
    }

    public C15ZD(int i, int i2, int i3, int i4, int i5, int i6) {
        this.weekDay = i;
        this.startHour = i2;
        this.startMinute = i3;
        this.endHour = i4;
        this.endMinute = i5;
        this.status = i6;
    }
}
