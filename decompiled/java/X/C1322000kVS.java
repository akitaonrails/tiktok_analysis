package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322000kVS {
    public final Context LIZ;
    public Uri LJ;
    public ImageModel LJFF;
    public C1324630kZh LJI;
    public boolean LJIIJJI;
    public ViewOnAttachStateChangeListenerC1322010kVT LIZIZ = null;
    public InterfaceC1320380kSq LJII = C1331090kk7.LJIJI;
    public PointF LJIIIIZZ = null;
    public C1331100kk8 LJIIIZ = null;
    public boolean LJIIJ = false;
    public InterfaceC1320650kTH LIZLLL = null;
    public C1320770kTT<InterfaceC1316360kMM> LIZJ = null;

    public final void LJ() {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new C1331100kk8();
        }
        this.LJIIIZ.LIZIZ = true;
    }

    public C1322000kVS(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }

    public static C1322000kVS LJFF(Context context) {
        if (context != null) {
            return new C1322000kVS(context);
        }
        throw new IllegalArgumentException("appContext == null");
    }

    public final void LIZ(ImageView.ScaleType scaleType) {
        InterfaceC1320380kSq interfaceC1320380kSq = C1331090kk7.LJIJI;
        switch (C340200DVi.LIZ[scaleType.ordinal()]) {
            case 1:
                interfaceC1320380kSq = InterfaceC1320380kSq.LJ;
                break;
            case 2:
                interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
                break;
            case 3:
                interfaceC1320380kSq = InterfaceC1320380kSq.LJFF;
                break;
            case 4:
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
                break;
            case 5:
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZIZ;
                break;
            case 6:
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZLLL;
                break;
            case 7:
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZ;
                break;
            case 8:
                interfaceC1320380kSq = InterfaceC1320380kSq.LJII;
                break;
        }
        this.LJII = interfaceC1320380kSq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(View view) {
        if (view == null) {
            return;
        }
        if (this.LJ == null && this.LJFF == null) {
            return;
        }
        if (this.LIZJ == null) {
            Object objLIZ = C1863607Rq.LIZ(view, "DraweeHolder");
            if (objLIZ instanceof C1320770kTT) {
                this.LIZJ = (C1320770kTT) objLIZ;
            }
        }
        if (this.LJI == null && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            this.LJI = new C1324630kZh(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        C1320770kTT<InterfaceC1316360kMM> c1320770kTT = this.LIZJ;
        if (c1320770kTT == null) {
            view.getContext();
            this.LIZJ = new C1320770kTT<>(null);
            if (this.LIZIZ == null) {
                this.LIZIZ = new ViewOnAttachStateChangeListenerC1322010kVT(this);
            }
            C1331090kk7 c1331090kk7 = new C1331090kk7(view.getResources());
            c1331090kk7.LJIILIIL = this.LJIIIIZZ;
            c1331090kk7.LJIIL = this.LJII;
            c1331090kk7.LJIIZILJ = this.LJIIIZ;
            this.LIZJ.LJIIIZ(c1331090kk7.LIZ());
            C1325710kbR[] c1325710kbRArrLIZIZ = LIZIZ(this.LJ, this.LJFF, this.LJI, this.LJIIJJI);
            if (c1325710kbRArrLIZIZ != 0 && c1325710kbRArrLIZIZ.length != 0) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIIJJI = this.LJIIJ;
                c1320810kTXLIZJ.LJIIIIZZ = this.LIZLLL;
                c1320810kTXLIZJ.LJIILJJIL = this.LIZJ.LLILZIL;
                c1320810kTXLIZJ.LJIIL = false;
                c1320810kTXLIZJ.LJIIJ = false;
                if (!C1322020kVU.LIZ()) {
                    c1320810kTXLIZJ.LJFF(c1325710kbRArrLIZIZ, true);
                } else if (c1325710kbRArrLIZIZ.length == 1) {
                    c1320810kTXLIZJ.LIZLLL = c1325710kbRArrLIZIZ[0];
                } else {
                    c1320810kTXLIZJ.LJFF(c1325710kbRArrLIZIZ, false);
                }
                this.LIZJ.LJIIIIZZ(c1320810kTXLIZJ.LIZ());
                if (view.isAttachedToWindow()) {
                    this.LIZIZ.onViewAttachedToWindow(view);
                }
                view.addOnAttachStateChangeListener(this.LIZIZ);
                view.setOnTouchListener(this.LIZIZ);
                C1863607Rq.LIZIZ(view, "DraweeHolder", this.LIZJ);
            } else {
                return;
            }
        } else {
            c1320770kTT.LJI();
            C1331090kk7 c1331090kk72 = new C1331090kk7(view.getResources());
            c1331090kk72.LJIILIIL = this.LJIIIIZZ;
            c1331090kk72.LJIIL = this.LJII;
            c1331090kk72.LJIIZILJ = this.LJIIIZ;
            this.LIZJ.LJIIIZ(c1331090kk72.LIZ());
            C1325710kbR[] c1325710kbRArrLIZIZ2 = LIZIZ(this.LJ, this.LJFF, this.LJI, this.LJIIJJI);
            if (c1325710kbRArrLIZIZ2 == 0 || c1325710kbRArrLIZIZ2.length == 0) {
                return;
            }
            C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
            c1320810kTXLIZJ2.LJIIJJI = this.LJIIJ;
            c1320810kTXLIZJ2.LJIIIIZZ = this.LIZLLL;
            c1320810kTXLIZJ2.LJIILJJIL = this.LIZJ.LLILZIL;
            c1320810kTXLIZJ2.LJIIL = false;
            c1320810kTXLIZJ2.LJIIJ = false;
            if (!C1322020kVU.LIZ()) {
                c1320810kTXLIZJ2.LJFF(c1325710kbRArrLIZIZ2, true);
            } else if (c1325710kbRArrLIZIZ2.length == 1) {
                c1320810kTXLIZJ2.LIZLLL = c1325710kbRArrLIZIZ2[0];
            } else {
                c1320810kTXLIZJ2.LJFF(c1325710kbRArrLIZIZ2, false);
            }
            this.LIZJ.LJIIIIZZ(c1320810kTXLIZJ2.LIZ());
            this.LIZJ.LJFF();
        }
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(this.LIZJ.LIZLLL());
        } else {
            view.setBackground(this.LIZJ.LIZLLL());
        }
    }

    public final void LIZLLL(String str) {
        this.LJ = UriProtector.parse(str);
    }

    public static C1325710kbR[] LIZIZ(Uri uri, ImageModel imageModel, C1324630kZh c1324630kZh, boolean z) {
        if (uri == null && (imageModel == null || C0IKQ.LIZ(imageModel.getUrls()))) {
            return new C1325710kbR[0];
        }
        ArrayList arrayList = new ArrayList();
        if (uri != null) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            if (c1324630kZh != null) {
                c1325700kbQLIZLLL.LIZJ = c1324630kZh;
            }
            if (z) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            }
            C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
            if (c1325710kbRLIZ != null) {
                arrayList.add(c1325710kbRLIZ);
            }
        }
        if (imageModel != null && !C0IKQ.LIZ(imageModel.getUrls())) {
            C1335920kru c1335920kru = new C1335920kru();
            for (String str : imageModel.getUrls()) {
                if (!C2093608Ic.LJ(str)) {
                    C1325700kbQ c1325700kbQLIZLLL2 = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                    if (c1324630kZh != null) {
                        c1325700kbQLIZLLL2.LIZJ = c1324630kZh;
                    }
                    if (z) {
                        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder2 = new ImageDecodeOptionsBuilder();
                        imageDecodeOptionsBuilder2.setBitmapConfig(Bitmap.Config.RGB_565);
                        c1325700kbQLIZLLL2.LJFF = new C1329360khK(imageDecodeOptionsBuilder2);
                    }
                    c1335920kru.LIZIZ++;
                    c1325700kbQLIZLLL2.LJIIZILJ = c1335920kru;
                    C1325710kbR c1325710kbRLIZ2 = c1325700kbQLIZLLL2.LIZ();
                    if (!arrayList.contains(c1325710kbRLIZ2)) {
                        arrayList.add(c1325710kbRLIZ2);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            return new C1325710kbR[0];
        }
        return (C1325710kbR[]) arrayList.toArray(new C1325710kbR[arrayList.size()]);
    }
}
