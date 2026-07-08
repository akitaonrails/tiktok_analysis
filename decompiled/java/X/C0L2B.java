package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0L2B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2B {
    public static final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final C01GW<InterfaceC1337805Lk> LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(197));

    /* JADX WARN: Type inference failed for: r0v4, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v6, types: [REQUEST, X.0kbR] */
    public static void LIZ(SmartImageView smartImageView, SocMediaResource socMediaResource) {
        EnumC1338240kve enumC1338240kve;
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0Hhk
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str, Throwable th) {
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final /* bridge */ /* synthetic */ void LJ(String str, Object obj, Animatable animatable) {
            }
        };
        Bitmap.Config config = Bitmap.Config.RGB_565;
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        Uri uriLJIILIIL = C2471909mP.LJIILIIL(socMediaResource.LIZ());
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uriLJIILIIL);
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
        c1325700kbQLIZLLL.LJIIZILJ = new C1320270kSf();
        c1320810kTXLIZJ.LJ = c1325700kbQLIZLLL.LIZ();
        C1325700kbQ c1325700kbQLIZLLL2 = C1325700kbQ.LIZLLL(uriLJIILIIL);
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder2 = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder2.setBitmapConfig(config);
        c1325700kbQLIZLLL2.LJFF = new C1329360khK(imageDecodeOptionsBuilder2);
        c1320810kTXLIZJ.LIZLLL = c1325700kbQLIZLLL2.LIZ();
        c1320810kTXLIZJ.LJIILJJIL = smartImageView.getController();
        c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
        smartImageView.setController(c1320810kTXLIZJ.LIZ());
        if (C567840MOw.LIZ(socMediaResource)) {
            enumC1338240kve = EnumC1338240kve.FIT_CENTER;
        } else {
            enumC1338240kve = EnumC1338240kve.CENTER_CROP;
        }
        smartImageView.setActualImageScaleType(enumC1338240kve);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC420801kM LIZIZ(X.C433800Gzi r8, com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r9, android.util.Size r10, X.InterfaceC529900KqK r11) {
        /*
            android.content.Context r4 = r8.getContext()
            boolean r0 = X.C23214097s.LIZ()
            if (r0 == 0) goto L26
            android.util.Size r3 = new android.util.Size
            int r0 = r10.getWidth()
            float r1 = (float) r0
            float r0 = X.C274430ApF.LIZ()
            float r1 = r1 * r0
            int r2 = (int) r1
            int r0 = r10.getHeight()
            float r1 = (float) r0
            float r0 = X.C274430ApF.LIZ()
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.<init>(r2, r0)
            r10 = r3
        L26:
            r0 = 2130969876(0x7f040514, float:1.7548446E38)
            android.graphics.drawable.Drawable r0 = X.C800330VaR.LIZIZ(r4, r0)
            if (r0 == 0) goto L32
            r8.setImageDrawable(r0)
        L32:
            r11.LIZIZ()
            boolean r0 = X.C0L2G.LIZJ()
            if (r0 == 0) goto Lb2
            X.0L2G r0 = X.C0L2G.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.experiment.StoryAlbumEnterEditOptConfig r0 = X.C0L2G.LIZIZ()
            boolean r0 = r0.albumBindPrefetchDecodeBoundsEnabled
            if (r0 == 0) goto Lb2
            X.09mP r0 = X.C2471909mP.LIZ
            r0.getClass()
            boolean r0 = X.C2471909mP.LJIILLIIL
            if (r0 == 0) goto Lb2
            r3 = 1
        L52:
            boolean r0 = X.C0L2G.LIZJ()
            if (r0 == 0) goto Lb0
            X.0L2G r0 = X.C0L2G.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.experiment.StoryAlbumEnterEditOptConfig r0 = X.C0L2G.LIZIZ()
            boolean r0 = r0.albumBindPrefetchVeMetadataEnabled
            if (r0 == 0) goto Lb0
            boolean r0 = X.C2179408gK.LIZ
            if (r0 == 0) goto Lb0
            r4 = 1
        L6a:
            r6 = r9
            if (r3 != 0) goto L99
            if (r4 != 0) goto L99
        L6f:
            boolean r0 = X.C0LJ5.LIZJ()
            if (r0 == 0) goto Lb4
            X.097r r0 = X.C23212097q.LIZ
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r0 = r6.tiktokMediaModel
            android.graphics.Bitmap r1 = X.C23212097q.LIZLLL(r0, r10)
            if (r1 == 0) goto Lb4
            boolean r0 = X.C23212097q.LIZJ(r1, r10)
            if (r0 == 0) goto Lb4
            r8.setImageBitmap(r1)
            kotlin.Pair r0 = X.C0L21.LIZIZ(r6, r1)
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r0 = r6.tiktokMediaModel
            r8.LJIIIZ(r0, r1)
        L93:
            r11.LIZ()
            X.11JT r0 = X.C11JT.INSTANCE
            return r0
        L99:
            java.lang.String r5 = r6.LIZ()
            boolean r0 = kotlin.text.a0.LJJJIL(r5)
            if (r0 != 0) goto L6f
            X.054G r1 = X.C0L2B.LIZ
            X.09Lf r2 = new X.09Lf
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r7, r7, r2, r0)
            goto L6f
        Lb0:
            r4 = 0
            goto L6a
        Lb2:
            r3 = 0
            goto L52
        Lb4:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r2 = r6.tiktokMediaModel
            X.097u r0 = X.C23215097t.LIZ
            kotlin.jvm.internal.AwS286S0300000_8 r1 = new kotlin.jvm.internal.AwS286S0300000_8
            r0 = 3
            r1.<init>(r6, r8, r11, r0)
            X.01kM r0 = X.C23215097t.LIZLLL(r8, r2, r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L2B.LIZIZ(X.0Gzi, com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource, android.util.Size, X.0KqK):X.01kM");
    }
}
