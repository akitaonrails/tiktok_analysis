package X;

import java.util.RandomAccess;

/* JADX INFO: renamed from: X.08sO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2254208sO extends AbstractC19974313Dh<Float> implements RandomAccess {
    public final /* synthetic */ float[] LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.length;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean isEmpty() {
        return this.LLILLJJLI.length == 0;
    }

    public C2254208sO(float[] fArr) {
        this.LLILLJJLI = fArr;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Float)) {
            return false;
        }
        float fFloatValue = ((Number) obj).floatValue();
        for (float f : this.LLILLJJLI) {
            if (Float.floatToIntBits(f) == Float.floatToIntBits(fFloatValue)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final Object get(int i) {
        return Float.valueOf(this.LLILLJJLI[i]);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Number) obj).floatValue();
        float[] fArr = this.LLILLJJLI;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(fFloatValue)) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Number) obj).floatValue();
        float[] fArr = this.LLILLJJLI;
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(fFloatValue)) {
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
