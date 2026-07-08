package X;

/* JADX INFO: renamed from: X.0HgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447370HgV {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.widget.ImageView r4, int r5) {
        /*
            r0 = 2
            X.0HgU[] r2 = new X.EnumC447360HgU[r0]
            X.0HgU r1 = X.EnumC447360HgU.START
            r0 = 0
            r2[r0] = r1
            X.0HgU r0 = X.EnumC447360HgU.END
            r3 = 1
            r2[r3] = r0
            X.C13LQ.LJLIIL(r2)
            android.content.Context r1 = r4.getContext()
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r0 = r1.getTheme()
            if (r0 == 0) goto L51
            boolean r0 = r0.resolveAttribute(r5, r2, r3)
            if (r0 != r3) goto L51
            int r0 = r2.resourceId
            if (r0 == 0) goto L40
            android.content.res.ColorStateList r1 = X.C838410Wul.LIZIZ(r0, r1)
            if (r1 == 0) goto L40
        L2f:
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r0.mutate()
            X.C16GF.LJII(r0, r1)
            r4.setImageDrawable(r0)
        L3f:
            return
        L40:
            int r1 = r2.type
            r0 = 28
            if (r0 > r1) goto L51
            r0 = 32
            if (r1 >= r0) goto L51
            int r0 = r2.data
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
            goto L2f
        L51:
            r1 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447370HgV.LIZ(android.widget.ImageView, int):void");
    }
}
