package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorCropBitmapDecodeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCameraSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20689515xd extends FrameLayout {
    public static final float LLILZLL;
    public C1840270xzN LL;
    public C21513519Hh LLILLJJLI;
    public C1336570ksx LLILLL;
    public Bitmap LLILZ;
    public Rect LLILZIL;

    static {
        LLILZLL = LiveCoverCameraSetting.INSTANCE.enable() ? 0.0f : 16.0f;
    }

    public final void LIZ(Function1<? super String, Unit> function1) {
        C21513519Hh c21513519Hh = this.LLILLJJLI;
        if (c21513519Hh == null) {
            c21513519Hh = null;
        }
        if (c21513519Hh.getPinchMode() == 0) {
            C15O7.LIZJ(new Callable() { // from class: X.0bOY
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Pair pair;
                    Pair pair2;
                    C1C7U.LIZ("CropView@a214.startCrop$1");
                    C20689515xd c20689515xd = this.LL;
                    c20689515xd.getClass();
                    EnumC771350UNp enumC771350UNp = EnumC771350UNp.CROP_VIEW;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("crop_");
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append(".png");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C21513519Hh c21513519Hh2 = c20689515xd.LLILLJJLI;
                    String absolutePath = null;
                    if (c21513519Hh2 == null) {
                        c21513519Hh2 = null;
                    }
                    Bitmap bitmap = c20689515xd.LLILZ;
                    if (bitmap == null) {
                        bitmap = null;
                    }
                    RectF rectFLIZLLL = c21513519Hh2.LIZLLL(null);
                    if (c20689515xd.LLILZIL == null) {
                        pair = new Pair(bitmap, 2131851936);
                    } else {
                        float width = bitmap.getWidth() / rectFLIZLLL.width();
                        float height = bitmap.getHeight() / rectFLIZLLL.height();
                        int i = (int) ((r4.left - rectFLIZLLL.left) * width);
                        if (i < 0) {
                            i = 0;
                        }
                        int i2 = (int) ((r4.top - rectFLIZLLL.top) * height);
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        int iWidth = (int) (r4.width() * width);
                        int width2 = bitmap.getWidth() - i;
                        if (iWidth > width2) {
                            iWidth = width2;
                        }
                        int iHeight = (int) (r4.height() * height);
                        int height2 = bitmap.getHeight() - i2;
                        if (iHeight > height2) {
                            iHeight = height2;
                        }
                        if (iWidth < 0 || iHeight < 0) {
                            pair = new Pair(null, 2131855121);
                        } else {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i, i2, iWidth, iHeight);
                            int width3 = bitmapCreateBitmap.getWidth();
                            int width4 = bitmap.getWidth() - i;
                            if (width3 <= width4) {
                                width4 = width3;
                            }
                            int height3 = bitmapCreateBitmap.getHeight();
                            int height4 = bitmap.getHeight() - i2;
                            if (height3 <= height4) {
                                height4 = height3;
                            }
                            loop0: for (int i3 = 0; i3 < width4; i3++) {
                                int i4 = height4 - 10;
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                                while (i4 < height4) {
                                    try {
                                    } catch (IllegalArgumentException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    } catch (IllegalStateException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                    }
                                    if (bitmap.getPixel(i + i3, i2 + i4) != bitmapCreateBitmap.getPixel(i3, i4)) {
                                        break loop0;
                                    }
                                    i4++;
                                }
                            }
                            pair = new Pair(bitmapCreateBitmap, 2131851936);
                        }
                    }
                    Bitmap bitmap2 = (Bitmap) pair.getFirst();
                    if (bitmap2 == null) {
                        pair2 = new Pair(null, pair.getSecond());
                    } else {
                        C0VSJ c0vsjLIZIZ = C207206166i.LIZIZ(new C207207166j(strLIZIZ, enumC771350UNp, bitmap2, false, null, 0, 972));
                        if (c0vsjLIZIZ != null && c0vsjLIZIZ.exists()) {
                            absolutePath = c0vsjLIZIZ.getAbsolutePath();
                        }
                        pair2 = new Pair(absolutePath, 2131851936);
                    }
                    C1C7U.LIZIZ("CropView@a214.startCrop$1");
                    return pair2;
                }
            }).LJ(new C2501509rB(function1, 3), C15O7.LJIIIIZZ, null);
        }
    }

    public final void setOriginPath(String str) throws Throwable {
        if (str == null) {
            return;
        }
        int pictureDegree = BitmapUtils.readPictureDegree(str);
        Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str, 1080, 1080);
        if (bitmapFromSD == null) {
            return;
        }
        Bitmap bitmapRotateBitmap = BitmapUtils.rotateBitmap(bitmapFromSD, pictureDegree);
        this.LLILZ = bitmapRotateBitmap;
        C21513519Hh c21513519Hh = this.LLILLJJLI;
        if (c21513519Hh == null) {
            c21513519Hh = null;
        }
        if (bitmapRotateBitmap == null) {
            bitmapRotateBitmap = null;
        }
        c21513519Hh.setImageBitmap(bitmapRotateBitmap);
    }

    public final void setOriginUri(Uri uri) throws Throwable {
        Bitmap bitmapDecodeBitmap;
        boolean z;
        FileDescriptor fileDescriptor;
        if (uri == null) {
            return;
        }
        try {
            if (LiveAnchorCropBitmapDecodeSetting.INSTANCE.getValue()) {
                C20441214yg.LJ("CropView", "get bitmap from Url");
                IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                if ((iHostAction == null || (bitmapDecodeBitmap = iHostAction.getBitmapFromUrl(uri.toString())) == null) && (bitmapDecodeBitmap = BitmapUtils.decodeBitmap(getContext().getContentResolver(), uri, 1080, 1080)) == null) {
                    C766270U4b.LIZLLL(2131851936);
                    return;
                }
            } else {
                bitmapDecodeBitmap = BitmapUtils.decodeBitmap(getContext().getContentResolver(), uri, 1080, 1080);
                if (bitmapDecodeBitmap == null) {
                    C766270U4b.LIZLLL(2131851936);
                    return;
                }
            }
            String strLIZ = C09N9.LIZ(getContext(), uri);
            int pictureDegree = 0;
            if (strLIZ != null && !a0.LJJJIL(strLIZ)) {
                z = false;
            } else {
                z = true;
            }
            Bitmap bitmap = null;
            if (!z) {
                pictureDegree = BitmapUtils.readPictureDegree(strLIZ);
            } else if (Build.VERSION.SDK_INT >= 24) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(getContext().getContentResolver(), uri, "r");
                    if (parcelFileDescriptorLIZLLL != null && (fileDescriptor = parcelFileDescriptorLIZLLL.getFileDescriptor()) != null) {
                        int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(new ExifInterface(fileDescriptor), 1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU99VCpNrddWPoW7yymeg==", null));
                        if (iLJLILLLLZI != 3) {
                            if (iLJLILLLLZI != 6) {
                                if (iLJLILLLLZI == 8) {
                                    pictureDegree = 270;
                                }
                            } else {
                                pictureDegree = 90;
                            }
                        } else {
                            pictureDegree = 180;
                        }
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                pictureDegree = BitmapUtils.readPictureDegree(uri.getPath());
            }
            Bitmap bitmapRotateBitmap = BitmapUtils.rotateBitmap(bitmapDecodeBitmap, pictureDegree);
            this.LLILZ = bitmapRotateBitmap;
            C21513519Hh c21513519Hh = this.LLILLJJLI;
            if (c21513519Hh == null) {
                c21513519Hh = null;
            }
            if (bitmapRotateBitmap != null) {
                bitmap = bitmapRotateBitmap;
            }
            c21513519Hh.setImageBitmap(bitmap);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C766270U4b.LIZLLL(2131851936);
        }
    }

    public C20689515xd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), R.layout.g41, this);
        this.LL = (C1840270xzN) viewLJLLJ.findViewById(R.id.f_4);
        this.LLILLJJLI = (C21513519Hh) viewLJLLJ.findViewById(R.id.ld7);
        this.LLILLL = (C1336570ksx) viewLJLLJ.findViewById(R.id.ldv);
        C1840270xzN c1840270xzN = this.LL;
        c1840270xzN = c1840270xzN == null ? null : c1840270xzN;
        c1840270xzN.setBackgroundColor(C497740JfY.LJFF(R.color.a5r));
        c1840270xzN.setIntercepter(new C1831820xlk() { // from class: X.15xc
            @Override // X.InterfaceC1840280xzO
            public final void LJJJJ(MotionEvent motionEvent) {
                boolean z;
                if (motionEvent != null) {
                    if (motionEvent.getAction() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1336570ksx c1336570ksx = null;
                    if (z) {
                        C1336570ksx c1336570ksx2 = this.LIZ.LLILLL;
                        if (c1336570ksx2 != null) {
                            c1336570ksx = c1336570ksx2;
                        }
                        ValueAnimator valueAnimator = c1336570ksx.LLILLL;
                        if (valueAnimator != null && valueAnimator.isStarted()) {
                            c1336570ksx.LLILLL.cancel();
                        }
                        if (Math.abs(c1336570ksx.LLJ - 0.5f) >= Float.MIN_NORMAL) {
                            c1336570ksx.LLJ = 0.5f;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1336570ksx);
                            c1336570ksx.setAlpha(0.5f);
                            return;
                        }
                        return;
                    }
                    if (motionEvent == null || motionEvent.getAction() != 1) {
                        return;
                    }
                    C20689515xd c20689515xd = this.LIZ;
                    if (c20689515xd.LLILZIL == null) {
                        C1336570ksx c1336570ksx3 = c20689515xd.LLILLL;
                        if (c1336570ksx3 == null) {
                            c1336570ksx3 = null;
                        }
                        c20689515xd.LLILZIL = c1336570ksx3.getVisibleRect();
                    }
                    C1336570ksx c1336570ksx4 = this.LIZ.LLILLL;
                    if (c1336570ksx4 != null) {
                        c1336570ksx = c1336570ksx4;
                    }
                    c1336570ksx.LIZ();
                }
            }
        });
    }
}
