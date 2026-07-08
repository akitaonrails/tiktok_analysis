package X;

import Y.ARunnableS131S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import com.zhiliaoapp.musically.R;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20689815xg extends FrameLayout {
    public C1840270xzN LL;
    public C21513519Hh LLILLJJLI;
    public C1336560ksw LLILLL;
    public Bitmap LLILZ;
    public Bitmap LLILZIL;
    public Rect LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;

    public final void setOriginBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            this.LLILZIL = bitmap;
            LIZ(0, bitmap);
        }
    }

    public final void setOriginData(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        this.LLILZIL = bitmapDecodeByteArray;
        LIZ(0, bitmapDecodeByteArray);
    }

    public final void setOriginPath(String str) {
        if (str == null) {
            return;
        }
        int pictureDegree = BitmapUtils.readPictureDegree(str);
        Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str, 1080, 1080);
        if (bitmapFromSD == null) {
            return;
        }
        LIZ(pictureDegree, bitmapFromSD);
    }

    public final void setOriginUri(final Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            final Bitmap bitmapDecodeBitmap = BitmapUtils.decodeBitmap(getContext().getContentResolver(), uri, 1080, 1080);
            if (bitmapDecodeBitmap == null) {
                C766270U4b.LIZLLL(2131851936);
            } else {
                C0WP3.LIZIZ(new PthreadAsyncTask<Uri, Unit, Integer>() { // from class: X.09mm
                    @Override // android.os.AsyncTask
                    public final Object doInBackground(Object[] objArr) throws Throwable {
                        boolean z;
                        FileDescriptor fileDescriptor;
                        String strLIZ = C09N9.LIZ(this.LIZ.getContext(), uri);
                        C20689815xg c20689815xg = this.LIZ;
                        Uri uri2 = uri;
                        int pictureDegree = 0;
                        if (strLIZ != null && !a0.LJJJIL(strLIZ)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            pictureDegree = BitmapUtils.readPictureDegree(strLIZ);
                        } else if (Build.VERSION.SDK_INT >= 24) {
                            c20689815xg.getClass();
                            try {
                                ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(c20689815xg.getContext().getContentResolver(), uri2, "r");
                                if (parcelFileDescriptorLIZLLL != null) {
                                    fileDescriptor = parcelFileDescriptorLIZLLL.getFileDescriptor();
                                } else {
                                    fileDescriptor = null;
                                }
                                if (fileDescriptor != null) {
                                    int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(new ExifInterface(fileDescriptor), 1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSPTPMSlr5NdB+38CPTk3gQ0dep", null));
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
                            pictureDegree = BitmapUtils.readPictureDegree(uri2.getPath());
                        }
                        return Integer.valueOf(pictureDegree);
                    }

                    @Override // android.os.AsyncTask
                    public final void onPostExecute(Object obj) {
                        Integer num = (Integer) obj;
                        if (num != null) {
                            this.LIZ.LIZ(num.intValue(), bitmapDecodeBitmap);
                        }
                    }
                }, uri);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C766270U4b.LIZLLL(2131851936);
        }
    }

    public C20689815xg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), R.layout.gfi, this);
        this.LL = (C1840270xzN) viewLJLLJ.findViewById(R.id.f_4);
        this.LLILLJJLI = (C21513519Hh) viewLJLLJ.findViewById(R.id.ld7);
        this.LLILLL = (C1336560ksw) viewLJLLJ.findViewById(R.id.ldv);
        C1840270xzN c1840270xzN = this.LL;
        c1840270xzN = c1840270xzN == null ? null : c1840270xzN;
        c1840270xzN.setBackgroundColor(C497740JfY.LJFF(R.color.a5r));
        c1840270xzN.setIntercepter(new C1831820xlk() { // from class: X.15xh
            @Override // X.InterfaceC1840280xzO
            public final void LJJJJ(MotionEvent motionEvent) {
                boolean z;
                if (motionEvent != null) {
                    if (motionEvent.getAction() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1336560ksw c1336560ksw = null;
                    if (z) {
                        C1336560ksw c1336560ksw2 = this.LIZ.LLILLL;
                        if (c1336560ksw2 != null) {
                            c1336560ksw = c1336560ksw2;
                        }
                        ValueAnimator valueAnimator = c1336560ksw.LLILLL;
                        if (valueAnimator != null && valueAnimator.isStarted()) {
                            c1336560ksw.LLILLL.cancel();
                        }
                        if (Math.abs(c1336560ksw.LLJ - 0.5f) >= Float.MIN_NORMAL) {
                            c1336560ksw.LLJ = 0.5f;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1336560ksw);
                            c1336560ksw.setAlpha(0.5f);
                            return;
                        }
                        return;
                    }
                    if (motionEvent == null || motionEvent.getAction() != 1) {
                        return;
                    }
                    C20689815xg c20689815xg = this.LIZ;
                    if (c20689815xg.LLILZLL == null) {
                        C1336560ksw c1336560ksw3 = c20689815xg.LLILLL;
                        if (c1336560ksw3 == null) {
                            c1336560ksw3 = null;
                        }
                        c20689815xg.LLILZLL = c1336560ksw3.getVisibleRect();
                    }
                    C1336560ksw c1336560ksw4 = this.LIZ.LLILLL;
                    if (c1336560ksw4 != null) {
                        c1336560ksw = c1336560ksw4;
                    }
                    c1336560ksw.LIZ();
                }
            }
        });
        C1336560ksw c1336560ksw = this.LLILLL;
        C1336560ksw c1336560ksw2 = c1336560ksw != null ? c1336560ksw : null;
        c1336560ksw2.LLILZIL = 0;
        c1336560ksw2.LLILZLL = 1.0f;
        c1336560ksw2.LLILZ = (int) C497740JfY.LIZIZ(16.0f);
        c1336560ksw2.addOnLayoutChangeListener(new C16HB(this, 13));
        HandlerHook.viewPostDelay(c1336560ksw2, new ARunnableS131S0100000_31(this, 212), 1000L);
        this.LLIZ = 256;
        this.LLIZLLLIL = 256;
    }

    public final void LIZ(int i, Bitmap bitmap) {
        Bitmap bitmapRotateBitmap = BitmapUtils.rotateBitmap(bitmap, i);
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
}
