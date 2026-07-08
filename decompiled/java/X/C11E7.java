package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.11E7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11E7 implements Serializable {
    public static final C11E8 Companion = new Serializable() { // from class: X.11E8
    };
    public final int cursor;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11E7) && this.cursor == ((C11E7) obj).cursor;
    }

    public int hashCode() {
        return this.cursor;
    }

    public C11E7(int i) {
        this.cursor = i;
    }
}
