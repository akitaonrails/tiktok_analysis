package Y;

import X.C09AJ;
import X.C09JN;
import X.C0MPB;
import X.C0MPC;
import X.C0VSJ;
import X.C0VSV;
import X.C11JF;
import X.C1320810kTX;
import X.C1322110kVd;
import X.C1322200kVm;
import X.C1324630kZh;
import X.C1325700kbQ;
import X.C1325880kbi;
import X.C1398350mUb;
import X.C13LP;
import X.C1C7U;
import X.C201955140j;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C238400w2;
import X.C259800zU;
import X.C418440Gaw;
import X.C423140GiW;
import X.C529690Kpz;
import X.C552700Lm0;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEMediaParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class AfS104S0300000_8 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS104S0300000_8 afS104S0300000_8, Object obj) {
        C11JF c11jf;
        C1C7U.LIZ("MvNetModule@b8bc.submitRequest$4");
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MvNetModule submitRequest errToast=");
        sbLIZ.append((String) ((C259800zU) afS104S0300000_8.l0).element);
        sbLIZ.append(", throwable ");
        sbLIZ.append(C201955140j.LJIIJJI((Throwable) obj));
        C201955140j.LJIJI(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        ((C0MPC) afS104S0300000_8.l1).LIZIZ((String) ((C259800zU) afS104S0300000_8.l0).element, ((C0MPB) afS104S0300000_8.l2).LJ);
        C11JF c11jf2 = ((C0MPB) afS104S0300000_8.l2).LIZLLL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = ((C0MPB) afS104S0300000_8.l2).LIZLLL) != null) {
            c11jf.dispose();
        }
        C1C7U.LIZIZ("MvNetModule@b8bc.submitRequest$4");
    }

    public static final void accept$1(AfS104S0300000_8 afS104S0300000_8, Object obj) {
        C1C7U.LIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$1$disposable$1");
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchAiMediaModel next:");
        sbLIZ.append(obj);
        C201955140j.LJIILL(c552700Lm0, "AlbumAiContentRepository", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = (ArrayList) afS104S0300000_8.l0;
        C238400w2 c238400w2 = (C238400w2) afS104S0300000_8.l1;
        C09AJ c09aj = (C09AJ) afS104S0300000_8.l2;
        synchronized (arrayList) {
            try {
                arrayList.add(obj);
                if (System.currentTimeMillis() - c238400w2.element > 2000) {
                    c09aj.onNext(C13LP.LLIIII(arrayList));
                    arrayList.clear();
                    c238400w2.element = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$1$disposable$1");
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [REQUEST, X.0kbR] */
    public static final void accept$2(AfS104S0300000_8 afS104S0300000_8, Object obj) {
        C1C7U.LIZ("VideoTemplateSlotMixedView$VideoTemplateSlotMixedAdapter@e4e2.VideoTemplateSlotMixedViewHolder$bindClippedVideoCoverData$1$4");
        Bitmap bitmapLIZ = (Bitmap) obj;
        C529690Kpz c529690Kpz = (C529690Kpz) afS104S0300000_8.l0;
        C1322110kVd c1322110kVd = c529690Kpz.LLILZIL;
        if (c1322110kVd != null) {
            C529690Kpz c529690Kpz2 = (C529690Kpz) afS104S0300000_8.l2;
            c1322110kVd.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (bitmapLIZ != null) {
                int i = 1;
                if (bitmapLIZ.getWidth() / bitmapLIZ.getHeight() != c1322110kVd.getWidth() / c1322110kVd.getHeight() || (bitmapLIZ = C423140GiW.LIZ(bitmapLIZ, (C418440Gaw.LIZIZ(Float.valueOf(2.0f)) / c1322110kVd.getWidth()) * bitmapLIZ.getWidth(), (C418440Gaw.LIZIZ(Float.valueOf(2.0f)) / c1322110kVd.getHeight()) * bitmapLIZ.getHeight())) != null) {
                    Context context = c529690Kpz.itemView.getContext();
                    c529690Kpz2.getClass();
                    File fileW2 = C786410Ut5.w2(context);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("frame_");
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append(".jpg");
                    C0VSJ c0vsj = new C0VSJ(fileW2, C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        C0VSV c0vsv = new C0VSV(c0vsj);
                        Throwable th = null;
                        try {
                            bitmapLIZ.compress(Bitmap.CompressFormat.JPEG, 90, c0vsv);
                            C2107108Nh.LIZ(c0vsv, null);
                            Uri uri = C1325880kbi.LIZ;
                            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(Uri.fromFile(c0vsj));
                            int width = c1322110kVd.getWidth();
                            if (width < 1) {
                                width = 1;
                            }
                            int height = c1322110kVd.getHeight();
                            if (height >= 1) {
                                i = height;
                            }
                            c1325700kbQLIZLLL.LIZJ = C1324630kZh.LIZ(width, i);
                            ?? LIZ = c1325700kbQLIZLLL.LIZ();
                            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
                            c1320810kTXLIZJ.LIZLLL = LIZ;
                            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
                            ((VEMediaParser) afS104S0300000_8.l1).release();
                        } finally {
                            try {
                                try {
                                } catch (Throwable th2) {
                                    while (true) {
                                    }
                                }
                            } catch (Throwable th3) {
                            }
                        }
                    } catch (FileNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException("Failed to create temporary file for bitmap", e);
                    }
                }
            }
        } else {
            ((VEMediaParser) afS104S0300000_8.l1).release();
        }
        C1C7U.LIZIZ("VideoTemplateSlotMixedView$VideoTemplateSlotMixedAdapter@e4e2.VideoTemplateSlotMixedViewHolder$bindClippedVideoCoverData$1$4");
    }

    public AfS104S0300000_8(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
