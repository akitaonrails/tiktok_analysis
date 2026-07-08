package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Krw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530900Krw implements InterfaceC529880KqI {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [REQUEST, X.0kbR] */
    public static void LIZIZ(C1322110kVd c1322110kVd, String str, int i, int i2) {
        Context context;
        if (str != null && c1322110kVd != 0 && (context = c1322110kVd.getContext()) != null) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LIZJ = C1324630kZh.LIZ(i, i2);
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            c1322110kVd.setImageRequest(LIZ);
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
            c1320810kTXLIZJ.LIZLLL = LIZ;
            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
            C1331070kk5 c1331070kk5 = (C1331070kk5) c1322110kVd.getHierarchy();
            if (c1331070kk5 != null) {
                c1331070kk5.LJIJ(C800330VaR.LIZIZ(context, R.drawable.a49), 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [REQUEST, X.0kbR] */
    @Override // X.InterfaceC529880KqI
    public final void LIZ(final C529750Kq5 c529750Kq5, Size size, final TikTokMediaModel tikTokMediaModel, InterfaceC529900KqK interfaceC529900KqK, final boolean z) {
        double d;
        Uri uri;
        EnumC1338240kve enumC1338240kve;
        int creativeRefineAlbumGroupStrategy = C0CHQ.LIZ().getAlbumService().getCreativeRefineAlbumGroupStrategy();
        if (creativeRefineAlbumGroupStrategy != 1) {
            if (creativeRefineAlbumGroupStrategy != 2) {
                d = 1.0d;
            } else {
                d = 0.6d;
            }
        } else {
            d = 0.8d;
        }
        String str = tikTokMediaModel.thumbnailOnlineUrl;
        if (str != null) {
            uri = UriProtector.parse(str);
        } else {
            uri = null;
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        c1325700kbQLIZLLL.LJIILL = true;
        c1325700kbQLIZLLL.LIZJ = new C1324630kZh((int) (((double) size.getWidth()) * d), (int) (((double) size.getHeight()) * d));
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.getClass();
        c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIILJJIL = c529750Kq5.LL.getController();
        c1320810kTXLIZJ.LIZLLL = LIZ;
        c1320810kTXLIZJ.LJIIIIZZ = new C581310Mr3(interfaceC529900KqK, 1);
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        ((AbstractC1321260kUG) C1322200kVm.LIZ().LJI(LIZ, this)).LIZJ(new AbstractC447090Hg3() { // from class: X.0Ks0
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                C433800Gzi c433800Gzi;
                if (bitmap != null) {
                    boolean z2 = z;
                    TikTokMediaModel tikTokMediaModel2 = tikTokMediaModel;
                    C529750Kq5 c529750Kq52 = c529750Kq5;
                    if (z2 && tikTokMediaModel2.LJIIJ() && C530950Ks1.LIZ(bitmap) && (c433800Gzi = c529750Kq52.LL) != null) {
                        c433800Gzi.LJIIIZ(tikTokMediaModel2, bitmap);
                    }
                }
            }
        }, C822700WPc.LL);
        c529750Kq5.LL.setPlaceholderImage(R.drawable.aku);
        C433800Gzi c433800Gzi = c529750Kq5.LL;
        if (C529990KqT.LIZ(tikTokMediaModel, z)) {
            enumC1338240kve = EnumC1338240kve.FIT_CENTER;
        } else {
            enumC1338240kve = EnumC1338240kve.CENTER_CROP;
        }
        c433800Gzi.setActualImageScaleType(enumC1338240kve);
        c529750Kq5.LL.getHierarchy().LJIJI(10);
        c529750Kq5.LLJLIL = abstractC1320710kTNLIZ;
        c529750Kq5.LL.setController(abstractC1320710kTNLIZ);
    }
}
