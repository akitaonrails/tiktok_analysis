package X;

import java.util.RandomAccess;

/* JADX INFO: renamed from: X.0qQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549740qQm extends AbstractC19974313Dh<Integer> implements RandomAccess {
    public final /* synthetic */ int[] LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.length;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean isEmpty() {
        return this.LLILLJJLI.length == 0;
    }

    public C1549740qQm(int[] iArr) {
        this.LLILLJJLI = iArr;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return C13LQ.LJIILJJIL(((Number) obj).intValue(), this.LLILLJJLI);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.LLILLJJLI[i]);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return C13LQ.LJJIJ(((Number) obj).intValue(), this.LLILLJJLI);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.LLILLJJLI;
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }
}
