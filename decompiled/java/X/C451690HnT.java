package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451690HnT {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.Object r6, X.C1322100kVc r7) {
        /*
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.base.model.UrlModel
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = (com.ss.android.ugc.aweme.base.model.UrlModel) r6
            java.util.List r0 = r6.getUrlList()
            if (r0 == 0) goto L14
            java.lang.Object r6 = X.C13LP.LJJJLL(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L16
        L14:
            java.lang.String r6 = ""
        L16:
            java.lang.String r0 = "/"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            r3 = 0
            java.util.List r6 = kotlin.text.a0.LJJLIIIJILLIZJL(r6, r1, r3, r0)
            java.util.Iterator r2 = r6.iterator()
            r5 = 0
        L27:
            boolean r0 = r2.hasNext()
            r4 = 1
            if (r0 == 0) goto L81
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = "avatar"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L27
            int r0 = r6.indexOf(r1)
            int r1 = r0 + 2
            int r0 = r6.size()
            if (r1 >= r0) goto L27
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r1)
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L27
            r5 = 1
            goto L27
        L54:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L5b
            java.lang.String r6 = (java.lang.String) r6
            goto L16
        L5b:
            boolean r0 = r6 instanceof X.C03IT
            if (r0 == 0) goto L6e
            X.03IT r6 = (X.C03IT) r6
            java.util.List<java.lang.String> r0 = r6.LIZ
            if (r0 == 0) goto L14
            java.lang.Object r6 = X.C13LP.LJJJLL(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L16
            goto L14
        L6e:
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.base.ImageUrlModel
            if (r0 == 0) goto L14
            com.ss.android.ugc.aweme.base.ImageUrlModel r6 = (com.ss.android.ugc.aweme.base.ImageUrlModel) r6
            java.util.List r0 = r6.getUrls()
            java.lang.Object r6 = X.C13LP.LJJJLL(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L16
            goto L14
        L81:
            boolean r0 = r7 instanceof X.C417390GYf
            if (r0 == 0) goto L8d
            r1 = r7
            X.0GYf r1 = (X.C417390GYf) r1
            r0 = r5 ^ 1
            r1.setShouldDrawBorder(r0)
        L8d:
            if (r7 == 0) goto La1
            X.0kMM r0 = r7.getHierarchy()
            X.0kk5 r0 = (X.C1331070kk5) r0
            if (r0 == 0) goto La1
            X.0kk8 r2 = r0.LIZJ
            if (r2 == 0) goto La1
            if (r5 == 0) goto La2
            r2.LIZIZ = r3
            r2.LJFF = r3
        La1:
            return
        La2:
            r2.LIZIZ = r4
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZJ()
            android.content.Context r1 = X.C894660Z7w.LIZ()
            r0 = 2131100103(0x7f0601c7, float:1.7812578E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto Lba
            int r3 = r0.intValue()
        Lba:
            r2.LJFF = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451690HnT.LIZ(java.lang.Object, X.0kVc):void");
    }

    public static Drawable LIZIZ(C1322110kVd c1322110kVd, int i, boolean z) {
        Context contextLIZ;
        Integer numLIZJ;
        C1331070kk5 hierarchy;
        if (c1322110kVd == null || (contextLIZ = c1322110kVd.getContext()) == null) {
            C0I0B.LJFF.LIZJ();
            contextLIZ = C894660Z7w.LIZ();
        }
        if (i > 0) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            return c419910GdJ.LIZ(contextLIZ);
        }
        if (c1322110kVd != null && (hierarchy = c1322110kVd.getHierarchy()) != null && hierarchy.LJIILJJIL()) {
            return null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (z && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, contextLIZ)) != null) {
            gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), numLIZJ.intValue());
        }
        gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, contextLIZ);
        if (numLIZJ2 == null) {
            return gradientDrawable;
        }
        gradientDrawable.setColor(numLIZJ2.intValue());
        return gradientDrawable;
    }

    public static C1331670kl3 LIZLLL(SmartAvatarImageView smartAvatarImageView, ImageUrlModel imageUrlModel, int i, int i2) {
        SmartAvatarImageView smartAvatarImageView2 = null;
        if (smartAvatarImageView instanceof SmartImageView) {
            smartAvatarImageView2 = smartAvatarImageView;
        }
        LIZ(imageUrlModel, smartAvatarImageView2);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
        c1331670kl3LJIIIIZZ.LJJ(smartAvatarImageView);
        c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
        c1331670kl3LJIIIIZZ.LJIIIZ = i2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = 2130971789;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i2;
        c1331670kl3LJIIIIZZ.LJIL(c419910GdJ.LIZ(smartAvatarImageView.getContext()));
        Integer num = 0;
        if (num.intValue() > 0) {
            num.intValue();
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = 0;
            c1331670kl3LJIIIIZZ.LJJIIZI(c419910GdJ2.LIZ(smartAvatarImageView.getContext()));
        }
        return c1331670kl3LJIIIIZZ;
    }

    public static C1331670kl3 LJFF(SmartAvatarImageView smartAvatarImageView, ImageUrlModel imageUrlModel, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        SmartAvatarImageView smartAvatarImageView2 = null;
        if (smartAvatarImageView instanceof C1322100kVc) {
            smartAvatarImageView2 = smartAvatarImageView;
        }
        LIZ(imageUrlModel, smartAvatarImageView2);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
        c1331670kl3LJIIIIZZ.LJJ(smartAvatarImageView);
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() > 0) {
            numValueOf.intValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c1331670kl3LJIIIIZZ.LJIL(c419910GdJ.LIZ(smartAvatarImageView.getContext()));
        }
        Integer num = 0;
        if (num.intValue() > 0) {
            num.intValue();
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = 0;
            c1331670kl3LJIIIIZZ.LJJIIZI(c419910GdJ2.LIZ(smartAvatarImageView.getContext()));
        }
        return c1331670kl3LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1331670kl3 LIZJ(InterfaceC1334290kpH interfaceC1334290kpH, String str, int i, int i2, int i3, int i4, boolean z) {
        C1322100kVc c1322100kVc;
        C1322110kVd c1322110kVd = null;
        if (interfaceC1334290kpH instanceof SmartImageView) {
            c1322100kVc = (C1322100kVc) interfaceC1334290kpH;
        } else {
            c1322100kVc = null;
        }
        LIZ(str, c1322100kVc);
        if (interfaceC1334290kpH instanceof C1322110kVd) {
            c1322110kVd = (C1322110kVd) interfaceC1334290kpH;
        }
        Drawable drawableLIZIZ = LIZIZ(c1322110kVd, i4, z);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(interfaceC1334290kpH);
        c1331670kl3LJIIIZ.LJIIIIZZ = i;
        c1331670kl3LJIIIZ.LJIIIZ = i2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i3;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i2;
        c1331670kl3LJIIIZ.LJIL(c419910GdJ.LIZ(((View) interfaceC1334290kpH).getContext()));
        c1331670kl3LJIIIZ.LJJIIZI(drawableLIZIZ);
        return c1331670kl3LJIIIZ;
    }

    public static void LJ(C1322110kVd c1322110kVd, UrlModel urlModel, String str, int i, int i2, C0ZKC c0zkc, int i3) {
        C0ZKC c0zkc2 = c0zkc;
        if ((i3 & 64) != 0) {
            c0zkc2 = null;
        }
        LIZ(urlModel, c1322110kVd);
        C0I98.LJI(c1322110kVd, urlModel, str, i, i2, null, c0zkc2, 0, 0, null, false, 1024);
    }
}
