package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0klv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332210klv implements InterfaceC1335780krg {
    public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS208S0000000_20.get$arr$(103));
    public boolean LIZIZ;

    public static EnumC1338240kve LJII(ImageView.ScaleType scaleType) {
        switch (C340210DVj.LIZ[scaleType.ordinal()]) {
            case 1:
                return EnumC1338240kve.FIT_XY;
            case 2:
                return EnumC1338240kve.FIT_CENTER;
            case 3:
                return EnumC1338240kve.CENTER_CROP;
            case 4:
                return EnumC1338240kve.CENTER_INSIDE;
            case 5:
                return EnumC1338240kve.CENTER;
            case 6:
                return EnumC1338240kve.FIT_END;
            case 7:
                return EnumC1338240kve.FIT_START;
            default:
                return EnumC1338240kve.FOCUS_CROP;
        }
    }

    @Override // X.InterfaceC1335780krg
    public final void init(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init: ");
        sbLIZ.append(this.LIZIZ);
        C1706630uVp.LIZ("ImageLoader", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ) {
            return;
        }
        C786410Ut5.N3(context);
        C1332170klr c1332170klr = new C1332170klr(context);
        c1332170klr.LJII = Bitmap.Config.ARGB_8888;
        c1332170klr.LIZJ = new C0VSJ(C786410Ut5.w2(context).getAbsolutePath(), "image");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        c1332170klr.LJ = ((long) (displayMetrics.widthPixels * displayMetrics.heightPixels)) * 4;
        c1332170klr.LJIIIIZZ = 1;
        c1332170klr.LJIILJJIL = true;
        c1332170klr.LJIILIIL = new InterfaceC1335580krM() { // from class: X.0klb
            @Override // X.InterfaceC1335580krM
            public final void onCleared() {
                C1331980klY.LIZ.getClass();
            }

            @Override // X.InterfaceC1335580krM
            public final void LIZ(C1331240kkM c1331240kkM) {
                C1331980klY.LIZ.getClass();
            }

            @Override // X.InterfaceC1335580krM
            public final void LIZIZ(C1331240kkM c1331240kkM) {
                C1331980klY.LIZ.getClass();
            }

            @Override // X.InterfaceC1335580krM
            public final void LIZJ(C1331240kkM c1331240kkM) {
                C1331980klY.LIZ.getClass();
            }

            @Override // X.InterfaceC1335580krM
            public final void LIZLLL(C1331240kkM c1331240kkM) {
                C1331980klY.LIZ.getClass();
            }

            @Override // X.InterfaceC1335580krM
            public final void LJ(C1331240kkM c1331240kkM) {
                C1331980klY.LIZ.getClass();
            }

            @Override // X.InterfaceC1335580krM
            public final void LJFF(C1331240kkM c1331240kkM) {
                C1331980klY.LIZ.getClass();
            }

            @Override // X.InterfaceC1335580krM
            public final void LJI(Object obj) {
                InterfaceC1332030kld interfaceC1332030kld;
                if ((obj instanceof InterfaceC1332030kld) && (interfaceC1332030kld = (InterfaceC1332030kld) obj) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("on write success cache key: ");
                    sbLIZ2.append(interfaceC1332030kld.getCacheKey());
                    C1706630uVp.LIZ("ImageLoader", C2188811AlT.LIZIZ(sbLIZ2));
                    C1331980klY.LIZ.LJI(interfaceC1332030kld);
                }
            }
        };
        c1332170klr.LJIILLIIL = true;
        c1332170klr.LJIILL = true;
        c1332170klr.LJIIZILJ = new String[0];
        c1332170klr.LJIIIZ = false;
        c1332170klr.LJIIJ = false;
        C1331660kl2.LJ(new C1332160klq(c1332170klr));
        this.LIZIZ = true;
    }

    @Override // X.InterfaceC1335780krg
    public final void LIZ(String str, C0UDA c0uda, Function1<? super Bitmap, Unit> function1) {
        C1331660kl2.LJII(new C0VSJ(str)).LJJII(new C1339370kxT(function1, 3));
    }

    @Override // X.InterfaceC1335780krg
    public final void LIZIZ(Context context, C0VSJ c0vsj, ImageView imageView, C0UDA c0uda) {
        Object tag = imageView.getTag(R.id.dui);
        if (!(tag instanceof String)) {
            tag = null;
        }
        if (Intrinsics.LJFF(tag, c0vsj.getPath())) {
            return;
        }
        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(c0vsj);
        c1331670kl3LJII.LJJI(imageView);
        Integer num = c0uda.LIZLLL;
        if (num != null) {
            c1331670kl3LJII.LJJIIZ(num.intValue());
        }
        c1331670kl3LJII.LJIILJJIL = c0uda.LJI;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = 0;
        c1331670kl3LJII.LJJI = new C1331730kl9(c1331750klB);
        ImageView.ScaleType scaleType = c0uda.LJ;
        if (scaleType != null) {
            c1331670kl3LJII.LJJ = LJII(scaleType);
        }
        c1331670kl3LJII.LJIIJ(new C346180Dhg(imageView, c0vsj, 1));
    }

    @Override // X.InterfaceC1335780krg
    public final void LIZLLL(Context context, final String str, ImageView imageView, C0UDA c0uda) {
        Uri uriFromFile;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String strLIZ;
        if (u.LJJIIJZLJL(str, "/", false)) {
            if (u.LJIIZILJ(str.toLowerCase(Locale.US), ".heic", false)) {
                strLIZ = C2479509nd.LIZ(str, C1335810krj.LIZJ(C1335810krj.LIZ, a0.LJJLJLI(str, "/", str)), 0.0f, 0, null, 44);
            } else {
                strLIZ = str;
            }
            uriFromFile = Uri.fromFile(new C0VSJ(strLIZ));
        } else {
            uriFromFile = UriProtector.parse(str);
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriFromFile);
        c1331670kl3LJI.LJJI(imageView);
        c1331670kl3LJI.LIZLLL = c0uda.LJFF;
        Integer num = c0uda.LIZLLL;
        if (num != null) {
            c1331670kl3LJI.LJJIIZ(num.intValue());
        }
        Drawable drawable = c0uda.LJIIIIZZ;
        if (drawable != null) {
            c1331670kl3LJI.LJJIIZI(drawable);
        }
        Bitmap.Config config = c0uda.LIZJ;
        if (config == null) {
            config = Bitmap.Config.RGB_565;
        }
        c1331670kl3LJI.LJIL = config;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = 0;
        c1331670kl3LJI.LJJI = new C1331730kl9(c1331750klB);
        ImageView.ScaleType scaleType = c0uda.LJ;
        if (scaleType != null) {
            c1331670kl3LJI.LJJ = LJII(scaleType);
        }
        Integer num2 = c0uda.LIZ;
        int iIntValue4 = -1;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = -1;
        }
        Integer num3 = c0uda.LIZIZ;
        if (num3 != null) {
            iIntValue2 = num3.intValue();
        } else {
            iIntValue2 = -1;
        }
        c1331670kl3LJI.LJIIJJI = iIntValue;
        c1331670kl3LJI.LJIIL = iIntValue2;
        Integer num4 = c0uda.LIZ;
        if (num4 != null) {
            iIntValue3 = num4.intValue();
        } else {
            iIntValue3 = -1;
        }
        Integer num5 = c0uda.LIZIZ;
        if (num5 != null) {
            iIntValue4 = num5.intValue();
        }
        c1331670kl3LJI.LJIIIIZZ = iIntValue3;
        c1331670kl3LJI.LJIIIZ = iIntValue4;
        c1331670kl3LJI.LJIIJ(new C1332250klz() { // from class: X.0klx
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailed: ");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C1706630uVp.LIZ("ImageLoader", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
    }

    @Override // X.InterfaceC1335780krg
    public final void LJ(Context context, final String str, C0UDA c0uda, final Function1<? super String, Unit> function1) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ame_enable_image_loader_opt", true)) {
            C0A10.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start download v2, url: ");
            sbLIZ.append(str);
            C1706630uVp.LIZ("ImageLoader", C2188811AlT.LIZIZ(sbLIZ));
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LIZLLL("EffectCreator");
            Bitmap.Config config = c0uda.LIZJ;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            c1331670kl3LJIIIZ.LJIL = config;
            c1331670kl3LJIIIZ.LJIILJJIL(new AbstractC2350809Ja() { // from class: X.0kly
                @Override // X.InterfaceC605070NoH
                public final void LIZ(File file) {
                    if (file == null) {
                        onFailed(null);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("download succ, url ");
                    sbLIZ2.append(str);
                    C1706630uVp.LIZ("ImageLoader", C2188811AlT.LIZIZ(sbLIZ2));
                    function1.invoke(file.getAbsolutePath());
                }

                @Override // X.InterfaceC605070NoH
                public final void onFailed(Throwable th) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("download fail, url ");
                    sbLIZ2.append(str);
                    C1706630uVp.LIZLLL("ImageLoader", C2188811AlT.LIZIZ(sbLIZ2), th);
                    function1.invoke(null);
                }
            });
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start download url: ");
        sbLIZ2.append(str);
        C1706630uVp.LIZ("ImageLoader", C2188811AlT.LIZIZ(sbLIZ2));
        C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ2.LIZLLL("EffectCreator");
        Bitmap.Config config2 = c0uda.LIZJ;
        if (config2 == null) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        c1331670kl3LJIIIZ2.LJIL = config2;
        c1331670kl3LJIIIZ2.LJJII(new C1766706vx(this, function1, 1));
    }

    @Override // X.InterfaceC1335780krg
    public final void LJFF(Context context, String str, C0UDA c0uda, Function1<? super Bitmap, Unit> function1) {
        Uri uriFromFile;
        if (u.LJJIIJZLJL(str, "/", false)) {
            uriFromFile = Uri.fromFile(new C0VSJ(str));
        } else {
            uriFromFile = UriProtector.parse(str);
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriFromFile);
        c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJI.LJJII(new C1339370kxT(function1, 2));
    }

    @Override // X.InterfaceC1335780krg
    public final void LJI(Context context, String str, ImageView imageView, C0UDA c0uda) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LIZLLL = true;
        Integer num = c0uda.LIZLLL;
        if (num != null) {
            c1331670kl3LJIIIZ.LJJIIZ(num.intValue());
        }
        ImageView.ScaleType scaleType = c0uda.LJ;
        if (scaleType != null) {
            c1331670kl3LJIIIZ.LJJ = LJII(scaleType);
        }
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIZ.LJJI(imageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1335780krg
    public final void LIZJ(Context context, final String str, final ImageView imageView, C0UDA c0uda, final Function1<? super Boolean, Unit> function1) {
        Uri uriFromFile;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String strLIZ;
        Object tag = imageView.getTag(R.id.dui);
        if (!(tag instanceof String)) {
            tag = null;
        }
        if (Intrinsics.LJFF(tag, str) && !c0uda.LJII) {
            return;
        }
        if (Intrinsics.LJFF(str, "")) {
            imageView.setTag(R.id.dui, str);
        }
        if (!a0.LJJIIZI(str, "://", false)) {
            if (u.LJIIZILJ(str.toLowerCase(Locale.US), ".gif", false) && !c0uda.LJFF) {
                strLIZ = C2479509nd.LIZ(str, C1335810krj.LIZJ(C1335810krj.LIZ, a0.LJJLJLI(str, "/", str)), 0.0f, 0, null, 44);
            } else {
                strLIZ = str;
            }
            uriFromFile = Uri.fromFile(new C0VSJ(strLIZ));
        } else {
            uriFromFile = UriProtector.parse(str);
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriFromFile);
        if (imageView instanceof SmartImageView) {
            C1706630uVp.LIZ("ImageLoader", "into smart image view");
            c1331670kl3LJI.LJJ((InterfaceC1334290kpH) imageView);
        } else {
            c1331670kl3LJI.LJJI(imageView);
        }
        c1331670kl3LJI.LIZLLL = c0uda.LJFF;
        Integer num = c0uda.LIZ;
        int iIntValue4 = -1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        Integer num2 = c0uda.LIZIZ;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = -1;
        }
        c1331670kl3LJI.LJIIJJI = iIntValue;
        c1331670kl3LJI.LJIIL = iIntValue2;
        Integer num3 = c0uda.LIZ;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = -1;
        }
        Integer num4 = c0uda.LIZIZ;
        if (num4 != null) {
            iIntValue4 = num4.intValue();
        }
        c1331670kl3LJI.LJIIIIZZ = iIntValue3;
        c1331670kl3LJI.LJIIIZ = iIntValue4;
        c1331670kl3LJI.LJJIJL(context);
        Integer num5 = c0uda.LIZLLL;
        if (num5 != null) {
            c1331670kl3LJI.LJJIIZ(num5.intValue());
        }
        Bitmap.Config config = c0uda.LIZJ;
        if (config != null) {
            c1331670kl3LJI.LJIL = config;
        }
        c1331670kl3LJI.LJIILJJIL = c0uda.LJI;
        Integer num6 = 0;
        if (num6.intValue() > 0) {
            float fIntValue = num6.intValue();
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = fIntValue;
            c1331670kl3LJI.LJJI = new C1331730kl9(c1331750klB);
        }
        ImageView.ScaleType scaleType = c0uda.LJ;
        if (scaleType != null) {
            c1331670kl3LJI.LJJ = LJII(scaleType);
        }
        c1331670kl3LJI.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0klw
            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                imageView.setTag(R.id.dui, str);
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
            }
        });
    }
}
