package X;

import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0jo5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295110jo5 extends AbstractC1294520jn8<C1295620jou, C1295620jou> {
    @Override // X.InterfaceC1294490jn5
    public final AbstractC1295190joD<C1295620jou, C1295620jou> LIZ() {
        final List<C1294810jnb<V>> list = this.LIZ;
        return new AbstractC1295610jot<C1295620jou>(list) { // from class: X.0jo6
            public final C1295620jou LJIIIIZZ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                super(list);
                C1295620jou c1295620jou = (C1295620jou) ((C1294810jnb) ListProtector.get(list, 0)).LIZIZ;
                int length = c1295620jou != null ? c1295620jou.LIZIZ.length : 0;
                this.LJIIIIZZ = new C1295620jou(new float[length], new int[length]);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1295190joD
            public final Object LJI(C1294810jnb c1294810jnb, float f) {
                C1295620jou c1295620jou = this.LJIIIIZZ;
                C1295620jou c1295620jou2 = (C1295620jou) c1294810jnb.LIZIZ;
                C1295620jou c1295620jou3 = (C1295620jou) c1294810jnb.LIZJ;
                c1295620jou.getClass();
                if (c1295620jou2.LIZIZ.length == c1295620jou3.LIZIZ.length) {
                    int i = 0;
                    while (true) {
                        int[] iArr = c1295620jou2.LIZIZ;
                        if (i < iArr.length) {
                            float[] fArr = c1295620jou.LIZ;
                            float f2 = c1295620jou2.LIZ[i];
                            float f3 = c1295620jou3.LIZ[i];
                            PointF pointF = C1295100jo4.LIZ;
                            fArr[i] = f2 + ((f3 - f2) * f);
                            c1295620jou.LIZIZ[i] = C1295790jpB.LIZJ(f, iArr[i], c1295620jou3.LIZIZ[i]);
                            i++;
                        } else {
                            return this.LJIIIIZZ;
                        }
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot interpolate between gradients. Lengths vary (");
                    sbLIZ.append(c1295620jou2.LIZIZ.length);
                    sbLIZ.append(" vs ");
                    sbLIZ.append(c1295620jou3.LIZIZ.length);
                    sbLIZ.append(")");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1295110jo5(List<C1294810jnb<C1295620jou>> list) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            C1294810jnb c1294810jnb = (C1294810jnb) ListProtector.get(list, i);
            C1295620jou c1295620jou = (C1295620jou) c1294810jnb.LIZIZ;
            C1295620jou c1295620jou2 = (C1295620jou) c1294810jnb.LIZJ;
            if (c1295620jou != null && c1295620jou2 != null) {
                float[] fArr = c1295620jou.LIZ;
                int length = fArr.length;
                float[] fArr2 = c1295620jou2.LIZ;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i2 = 0;
                    for (int i3 = 0; i3 < length2; i3++) {
                        float f2 = fArr3[i3];
                        if (f2 != f) {
                            fArr3[i2] = f2;
                            i2++;
                            f = fArr3[i3];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i2);
                    c1294810jnb = new C1294810jnb(c1295620jou.LIZ(fArrCopyOfRange), c1295620jou2.LIZ(fArrCopyOfRange));
                }
            }
            ListProtector.set(list, i, c1294810jnb);
        }
        super(list);
    }
}
