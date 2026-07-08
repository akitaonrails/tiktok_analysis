package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS2S0000002_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19671511xp extends i<InterfaceC1461680o8k, C12DV, C19672011xu, C19671911xt> implements InterfaceC1461680o8k, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC19672111xv LLJJ;
    public final Function0<C19672011xu> LLJJI;
    public final Function0<C19671911xt> LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public GestureInteractItem LLJJJIL;
    public Bitmap LLJJJJ;
    public Bitmap LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public C196925122x LLJJL;
    public final InterfaceC1737690vJv LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19671511xp.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19671511xp.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/editSticker/text/als/EditTextStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19671511xp.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19671511xp.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    private final InterfaceC1461390o8H k5() {
        return (InterfaceC1461390o8H) this.LLJJJ.getValue(this, LLJL[3]);
    }

    private final VideoPublishEditModel n5() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJL[2]);
    }

    private final C122Q v5() {
        return (C122Q) this.LLJJIJIIJIL.getValue(this, LLJL[1]);
    }

    private final Rect x5() {
        return (Rect) this.LLJJJJLIIL.getValue();
    }

    public final InterfaceC1455860nzM d5() {
        return (InterfaceC1455860nzM) this.LLJJIJI.getValue(this, LLJL[0]);
    }

    private final void t5() {
        Bitmap currDisplayImage;
        View viewFindViewById;
        ImageSurfaceData surfaceData;
        Bitmap bitmapCreateBitmap = null;
        if (C1428470nHB.LJJZZI(n5())) {
            this.LLJJ.LIZIZ();
            ImageAlbumData imageAlbumData = n5().getImageAlbumData();
            if (imageAlbumData != null && (surfaceData = imageAlbumData.getSurfaceData()) != null) {
                H5(surfaceData);
            }
            currDisplayImage = this.LLJJ.LIZ(n5());
        } else {
            InterfaceC1452170ntP value = d5().g().getValue();
            currDisplayImage = value != null ? value.getCurrDisplayImage() : null;
        }
        this.LLJJJJJIL = currDisplayImage;
        this.LLJJJJ = null;
        if (C1428470nHB.LJJZZI(n5())) {
            viewFindViewById = this.LLJJ.LIZJ();
            if (viewFindViewById == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            viewFindViewById = C1664590tQ1.LJII(this).findViewById(R.id.grj);
        }
        Window window = C1664590tQ1.LJII(this).getWindow();
        final AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 54);
        if (Build.VERSION.SDK_INT >= 26) {
            final Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(viewFindViewById.getWidth(), viewFindViewById.getHeight(), Bitmap.Config.ARGB_8888, true);
            PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0oth
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    if (i == 0) {
                        awS643S0100000_29.invoke(bitmapCreateBitmap2, Boolean.TRUE);
                    } else {
                        awS643S0100000_29.invoke(null, Boolean.FALSE);
                    }
                }
            };
            int[] iArr = new int[2];
            viewFindViewById.getLocationInWindow(iArr);
            try {
                int i = iArr[0];
                C1322890kWt.LJ(window, new Rect(i, iArr[1], viewFindViewById.getWidth() + i, iArr[1] + viewFindViewById.getHeight()), bitmapCreateBitmap2, onPixelCopyFinishedListener, new BPEAHandler(Looper.getMainLooper()), CertProviderManagerKt.findCert("bpea-take_shot_to_pick_color", 1476435970));
                return;
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                onPixelCopyFinishedListener.onPixelCopyFinished(1);
                return;
            }
        }
        viewFindViewById.setDrawingCacheEnabled(true);
        viewFindViewById.setDrawingCacheQuality(1048576);
        try {
            Bitmap bitmapLJ = C842150X1x.LJ(viewFindViewById, true, CertProviderManagerKt.findCert("bpea-color_picker", 1476435980));
            if (bitmapLJ != null && !bitmapLJ.isRecycled()) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapLJ);
            }
        } catch (C838130WuJ e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ColorPickerUtils -> createBitmapFromView -> errorCode = ");
            sbLIZ.append(e2.getErrorCode());
            sbLIZ.append(";errorMsg = ");
            sbLIZ.append(e2.getErrorMsg());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        viewFindViewById.destroyDrawingCache();
        viewFindViewById.setDrawingCacheEnabled(false);
        awS643S0100000_29.invoke(bitmapCreateBitmap, Boolean.valueOf(bitmapCreateBitmap != null));
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        InterfaceC1461390o8H interfaceC1461390o8HK5 = k5();
        GestureInteractItem gestureInteractItem = this.LLJJJIL;
        if (gestureInteractItem == null) {
            gestureInteractItem = null;
        }
        interfaceC1461390o8HK5.LIZ(gestureInteractItem);
        C1447800nmM.LIZIZ(this.LLJILJILJ).LLLLLLLZIL(this.LLJJLIIIJLLLLLLLZ);
        C122Q c122qV5 = v5();
        if (c122qV5 != null) {
            c122qV5.fv0(false);
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19672011xu> o2() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19671911xt> w2() {
        return this.LLJJIII;
    }

    private final void C5(int i) {
        i3(new AwS41S0001000_29(i, 26));
        C196925122x c196925122x = this.LLJJL;
        if (c196925122x != null) {
            c196925122x.LJJIIJ(c196925122x.getCurMode(), i, c196925122x.getCurAlignTxt(), c196925122x.getCurFontType());
        }
    }

    private final Pair<Boolean, Integer> P4(PointF pointF) {
        Bitmap bitmap = this.LLJJJJJIL;
        if (bitmap == null) {
            return new Pair<>(Boolean.FALSE, 0);
        }
        if (C1428470nHB.LJJZZI(n5())) {
            return O4(pointF, bitmap);
        }
        return T4(pointF, bitmap);
    }

    private final Pair<Boolean, Integer> Z4(PointF pointF) {
        Bitmap bitmap = this.LLJJJJ;
        boolean z = false;
        if (bitmap == null) {
            return new Pair<>(Boolean.FALSE, 0);
        }
        int iLIZ = C2252608s8.LIZ(C814420VxA.LIZIZ(pointF.x), C814420VxA.LIZIZ(pointF.y), bitmap);
        if (((iLIZ >> 24) & 255) != 255) {
            z = true;
        }
        return new Pair<>(Boolean.valueOf(!z), Integer.valueOf(iLIZ));
    }

    public final void D5(PointF pointF) {
        Pair<Boolean, Integer> pairZ4 = Z4(pointF);
        boolean zBooleanValue = pairZ4.getFirst().booleanValue();
        int iIntValue = pairZ4.getSecond().intValue();
        if (zBooleanValue) {
            C5(iIntValue);
            return;
        }
        Pair<Boolean, Integer> pairP4 = P4(pointF);
        boolean zBooleanValue2 = pairP4.getFirst().booleanValue();
        int iIntValue2 = pairP4.getSecond().intValue();
        if (zBooleanValue2) {
            C5(iIntValue2);
        }
    }

    public final void E5(GestureLayout$OnGestureListener gestureLayout$OnGestureListener) {
        this.LLJJJIL = new GestureInteractItem(10000, gestureLayout$OnGestureListener);
    }

    public final void H5(ImageSurfaceData imageSurfaceData) {
        int i;
        if (C1450870nrJ.LIZIZ > 0 && (i = C1450870nrJ.LIZ) > 0) {
            imageSurfaceData.setSurfaceViewHeight(i);
            imageSurfaceData.setSurfaceViewWidth(C1450870nrJ.LIZIZ);
        } else {
            C201955140j.LJIIZILJ("refreshing invalid surface data");
        }
    }

    @Override // X.InterfaceC1461680o8k
    public void fF(C196925122x c196925122x) {
        super.show();
        this.LLJJL = c196925122x;
        C1447800nmM.LIZIZ(this.LLJILJILJ).LLLIILIL(this, this.LLJJLIIIJLLLLLLLZ);
        C1456140nzo.LIZIZ(d5(), false, false, false, false, 8);
        InterfaceC1461390o8H interfaceC1461390o8HK5 = k5();
        GestureInteractItem gestureInteractItem = this.LLJJJIL;
        if (gestureInteractItem == null) {
            gestureInteractItem = null;
        }
        interfaceC1461390o8HK5.LIZIZ(gestureInteractItem);
        t5();
    }

    private final boolean F4(int i, int i2) {
        Rect rectLIZLLL = this.LLJJ.LIZLLL();
        if (rectLIZLLL != null) {
            return rectLIZLLL.contains(i, i2);
        }
        return false;
    }

    private final boolean H4(int i, int i2) {
        return x5().contains(i, i2);
    }

    private final Pair<Boolean, Integer> O4(PointF pointF, Bitmap bitmap) {
        int iLIZ;
        if (F4(C814420VxA.LIZIZ(pointF.x), C814420VxA.LIZIZ(pointF.y))) {
            Rect rectLIZLLL = this.LLJJ.LIZLLL();
            if (rectLIZLLL == null) {
                return new Pair<>(Boolean.FALSE, 0);
            }
            int i = rectLIZLLL.top;
            float width = bitmap.getWidth() / rectLIZLLL.width();
            iLIZ = C2252608s8.LIZ(C814420VxA.LIZIZ((pointF.x - rectLIZLLL.left) * width), C814420VxA.LIZIZ((pointF.y - i) * width), bitmap);
        } else {
            iLIZ = -16777216;
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(iLIZ));
    }

    private final Pair<Boolean, Integer> T4(PointF pointF, Bitmap bitmap) {
        int iLIZ;
        if (H4(C814420VxA.LIZIZ(pointF.x), C814420VxA.LIZIZ(pointF.y))) {
            int i = d5().ej().topMargin;
            float width = bitmap.getWidth() / d5().k52();
            iLIZ = C2252608s8.LIZ(C814420VxA.LIZIZ((pointF.x - d5().ej().getMarginStart()) * width), C814420VxA.LIZIZ((pointF.y - i) * width), bitmap);
        } else {
            iLIZ = -16777216;
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(iLIZ));
    }

    public final void K4(float f, float f2) {
        i3(new AwS2S0000002_29(f, f2, 0));
        C196925122x c196925122x = this.LLJJL;
        if (c196925122x != null) {
            Integer num = T2().LIZLLL;
            InterfaceC196910122i interfaceC196910122i = c196925122x.LLJJIJIIJIL.LIZ;
            if (interfaceC196910122i != null) {
                interfaceC196910122i.LJ(c196925122x, true, num);
            }
        } else {
            C122Q c122qV5 = v5();
            if (c122qV5 != null) {
                c122qV5.co2(null, T2().LIZLLL);
            }
        }
        C1462830oAb c1462830oAb = C1462830oAb.LIZ;
        String strLJIILIIL = C1428470nHB.LJIILIIL(n5());
        String creationId = n5().getCreationId();
        String str = n5().mShootWay;
        String strLJIILL = C1428470nHB.LJIILL(n5());
        String enterFrom = n5().getEnterFrom();
        c1462830oAb.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("content_source", strLJIILIIL);
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        if (strLJIILL == null) {
            strLJIILL = "";
        }
        c2344009Gk.LJIIIIZZ("content_type", strLJIILL);
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("shoot_way", str);
        if (enterFrom == null) {
            enterFrom = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        C20684815ws.LJIILLIIL("apply_color_dropper", c2344009Gk.LIZ);
        this.LLJJL = null;
    }

    public C19671511xp(C19A3 c19a3, C1DRG c1drg, InterfaceC19672111xv interfaceC19672111xv) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = interfaceC19672111xv;
        this.LLJJI = AFwS218S0000000_29.get$arr$(260);
        this.LLJJIII = new AwS573S0100000_29(this, 606);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C122Q.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 439));
        this.LLJJLIIIJLLLLLLLZ = new C19775212Ys(this, 4);
    }
}
