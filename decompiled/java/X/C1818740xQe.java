package X;

import android.graphics.RectF;
import com.bytedance.android.livesdk.model.BoardItemLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818740xQe {
    public float LIZ;
    public float LIZIZ;
    public final List<C448740Hii> LIZJ;

    public C1818740xQe() {
        float f = C488301vF.LJ;
        float f2 = C488301vF.LJ;
        this.LIZ = f2;
        this.LIZIZ = f2;
        this.LIZJ = new ArrayList();
    }

    public final void LIZIZ(long j) {
        C19719612Di.LJJIIJ(this.LIZJ, new C1818750xQf(j), true);
    }

    public final void LIZJ(RectF rectF, BoardItemLayout boardItemLayout, int i) {
        Pair pair;
        if (i > 7) {
            return;
        }
        List<C448740Hii> list = this.LIZJ;
        ArrayList<C448740Hii> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (RectF.intersects(rectF, ((C448740Hii) obj).LIZIZ)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        float fMin = this.LIZ;
        float fMin2 = this.LIZIZ;
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (C448740Hii c448740Hii : arrayList) {
            fMin = Math.min(fMin, c448740Hii.LIZIZ.left);
            fMin2 = Math.min(fMin2, c448740Hii.LIZIZ.top);
            fMax = Math.max(fMax, c448740Hii.LIZIZ.right);
            fMax2 = Math.max(fMax2, c448740Hii.LIZIZ.bottom);
        }
        float f = (boardItemLayout.defaultXSpacing / 100.0f) * this.LIZ;
        float f2 = (boardItemLayout.defaultYSpacing / 100.0f) * this.LIZIZ;
        int i2 = boardItemLayout.collisionResolve;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    pair = new Pair(Float.valueOf((fMin - rectF.width()) - f), Float.valueOf(rectF.top));
                } else {
                    pair = new Pair(Float.valueOf(fMax + f), Float.valueOf(rectF.top));
                }
            } else {
                pair = new Pair(Float.valueOf(rectF.left), Float.valueOf(fMax2 + f2));
            }
        } else {
            pair = new Pair(Float.valueOf(rectF.left), Float.valueOf((fMin2 - rectF.height()) - f2));
        }
        rectF.offsetTo(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        LIZJ(rectF, boardItemLayout, i + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Float, java.lang.Float> LIZ(long r9, float r11, float r12, com.bytedance.android.livesdk.model.BoardItemLayout r13) {
        /*
            r8 = this;
            int r0 = r13.verticalAnchor
            r7 = 2
            r6 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            if (r0 == 0) goto L6b
            if (r0 == r6) goto L64
            if (r0 != r7) goto L6b
            float r1 = r8.LIZIZ
            float r1 = r1 - r12
        L10:
            float r3 = r13.offsetY
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r4
            float r0 = r8.LIZIZ
            float r3 = r3 * r0
            float r1 = r1 + r3
            int r0 = r13.horizontalAnchor
            if (r0 == 0) goto L24
            if (r0 == r6) goto L5d
            if (r0 != r7) goto L24
            float r2 = r8.LIZ
            float r2 = r2 - r11
        L24:
            float r3 = r13.offsetX
            float r3 = r3 / r4
            float r0 = r8.LIZ
            float r3 = r3 * r0
            float r2 = r2 + r3
            android.graphics.RectF r3 = new android.graphics.RectF
            float r11 = r11 + r2
            float r12 = r12 + r1
            r3.<init>(r2, r1, r11, r12)
            boolean r0 = r13.forceLayout
            if (r0 != 0) goto L4b
            r0 = 0
            r8.LIZJ(r3, r13, r0)
            java.util.List<X.0Hii> r2 = r8.LIZJ
            X.0Hii r1 = new X.0Hii
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r3)
            r1.<init>(r9, r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r1)
        L4b:
            float r0 = r3.left
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            float r0 = r3.top
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L5d:
            float r2 = r8.LIZ
            float r2 = r2 / r5
            float r0 = r11 / r5
            float r2 = r2 - r0
            goto L24
        L64:
            float r1 = r8.LIZIZ
            float r1 = r1 / r5
            float r0 = r12 / r5
            float r1 = r1 - r0
            goto L10
        L6b:
            r1 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1818740xQe.LIZ(long, float, float, com.bytedance.android.livesdk.model.BoardItemLayout):kotlin.Pair");
    }
}
