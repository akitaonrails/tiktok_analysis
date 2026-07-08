package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: renamed from: X.0fwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146870fwz {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[PHI: r3
      0x0035: PHI (r3v2 android.graphics.drawable.Drawable) = (r3v0 android.graphics.drawable.Drawable), (r3v3 android.graphics.drawable.Drawable) binds: [B:29:0x0047, B:19:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.view.View r5, webcast.data.TouchPointBackground r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L4a
            com.bytedance.android.live.base.model.ImageModel r0 = r6.image
        L5:
            LIZ(r5, r0, r4)
            if (r6 == 0) goto L45
            com.bytedance.android.live.base.model.ImageModel r0 = r6.image
            if (r0 == 0) goto L46
            com.bytedance.android.live.base.model.ImageModel r0 = r6.image
            if (r0 == 0) goto L46
            java.util.List r0 = X.C842240X2g.LIZ(r0)
            if (r0 == 0) goto L46
            java.util.Iterator r2 = r0.iterator()
        L1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C500260Jjc.LJJIIZ(r0)
            if (r0 == 0) goto L1c
            if (r1 == 0) goto L46
            android.graphics.drawable.Drawable r3 = r5.getBackground()
        L35:
            webcast.data.TouchPointColor r0 = r6.color
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.light
            if (r0 == 0) goto L41
            android.graphics.drawable.Drawable r4 = X.C371620Ehc.LIZJ(r0)
        L41:
            if (r3 != 0) goto L4c
            if (r4 != 0) goto L4c
        L45:
            return
        L46:
            r3 = r4
            if (r6 == 0) goto L41
            goto L35
        L4a:
            r0 = r4
            goto L5
        L4c:
            r2 = 0
            r1 = 1
            if (r3 != 0) goto L5d
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r1]
            r0[r2] = r4
        L54:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
            r5.setBackground(r1)
            return
        L5d:
            if (r4 != 0) goto L64
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r1]
            r0[r2] = r3
            goto L54
        L64:
            r0 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            r0[r2] = r4
            r0[r1] = r3
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1146870fwz.LIZIZ(android.view.View, webcast.data.TouchPointBackground):void");
    }

    public static final void LIZ(View view, ImageModel imageModel, InterfaceC1142670fqD interfaceC1142670fqD) {
        List<String> listLIZ;
        if (imageModel != null && (listLIZ = C842240X2g.LIZ(imageModel)) != null && !listLIZ.isEmpty()) {
            boolean zLJFF = C426750GoL.LJFF();
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIL = imageModel.isAnimated();
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_START;
            c1324610kZfLJIIIZ.LJIIL = interfaceC1142670fqD;
            c1324610kZfLJIIIZ.LJIJJLI = new C1146880fx0(zLJFF);
            c1324610kZfLJIIIZ.LJJI(view);
        }
    }
}
