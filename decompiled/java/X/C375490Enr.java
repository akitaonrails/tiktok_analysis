package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS1S0200004_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Enr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375490Enr extends AbstractC381020Ewm<InterfaceC374990En3> implements InterfaceC374990En3, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LLILLL;
    public final View LLILZ;
    public final AppCompatImageView LLILZIL;
    public Pair<Integer, Integer> LLILZLL;
    public float[] LLIZ;
    public Pair<Integer, Integer> LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public int LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C375490Enr.class, "nleApi", "getNleApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/common/api/NLECropApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = 8;
    }

    public InterfaceC374990En3 X1() {
        return this;
    }

    @Override // X.InterfaceC374990En3
    public void EY() {
        G2(-this.LLJI);
    }

    @Override // X.InterfaceC374990En3
    public void Ur() {
        C786410Ut5.LLILIL(this.LLILZIL, 8);
        C786410Ut5.LJLLLLLL(0, this.LLILZ);
    }

    @Override // X.InterfaceC374990En3
    public void YD1() {
        SurfaceView surfaceViewLJIJJLI;
        PairIntInt pairIntInt;
        INLEMediaRuntime mediaRuntimeApi;
        INLEMediaRuntime mediaRuntimeApi2;
        float measuredWidth = this.LLILZ.getMeasuredWidth() / this.LLILZ.getMeasuredHeight();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || measuredWidth <= 0.0f || (surfaceViewLJIJJLI = c0e48W1.LJIJJLI()) == null) {
            return;
        }
        int width = surfaceViewLJIJJLI.getWidth();
        int height = surfaceViewLJIJJLI.getHeight();
        int i = (int) (width / measuredWidth);
        INLEMediaSession iNLEMediaSessionF1 = c0e48W1.f1();
        if (iNLEMediaSessionF1 == null || (mediaRuntimeApi2 = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (pairIntInt = mediaRuntimeApi2.getInitSize()) == null) {
            pairIntInt = new PairIntInt(0, 0);
        }
        if (pairIntInt.getFirst() == 0 || pairIntInt.getSecond() == 0) {
            return;
        }
        INLEMediaSession iNLEMediaSessionF12 = c0e48W1.f1();
        PairIntInt canvasSize = (iNLEMediaSessionF12 == null || (mediaRuntimeApi = iNLEMediaSessionF12.getMediaRuntimeApi()) == null) ? null : mediaRuntimeApi.getCanvasSize();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initSize ");
        sbLIZ.append(pairIntInt.getFirst());
        sbLIZ.append('-');
        sbLIZ.append(pairIntInt.getSecond());
        sbLIZ.append(" oldCanvasSize ");
        sbLIZ.append(canvasSize != null ? Integer.valueOf(canvasSize.getFirst()) : null);
        sbLIZ.append('-');
        sbLIZ.append(canvasSize != null ? Integer.valueOf(canvasSize.getSecond()) : null);
        sbLIZ.append(" surfaceSize: ");
        sbLIZ.append(width);
        sbLIZ.append('-');
        sbLIZ.append(height);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJI = (height - i) / 2;
        c0e48W1.setCanvasSize(width, i);
    }

    public final InterfaceC374920Emw Z1() {
        return (InterfaceC374920Emw) this.LLJ.getValue(this, LLJIJIL[0]);
    }

    @Override // X.InterfaceC374990En3
    public void bb1() {
        INLEMediaRuntime mediaRuntimeApi;
        PairIntInt initSize;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        this.LLILZLL = c0e48W1.getCanvasSize();
        this.LLIZ = c0e48W1.getPlayer().LLJLLIL();
        INLEMediaSession iNLEMediaSessionF1 = c0e48W1.f1();
        this.LLIZLLLIL = (iNLEMediaSessionF1 == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (initSize = mediaRuntimeApi.getInitSize()) == null) ? null : new Pair<>(Integer.valueOf(initSize.getFirst()), Integer.valueOf(initSize.getSecond()));
    }

    @Override // X.InterfaceC374990En3
    public void sO() {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        Pair<Integer, Integer> pair = this.LLILZLL;
        if (pair != null) {
            c0e48W1.setCanvasSize(pair.getFirst().intValue(), pair.getSecond().intValue());
        }
        float[] fArr = this.LLIZ;
        if (fArr != null) {
            o2(fArr[0], fArr[1], fArr[2], fArr[3]);
        }
        c0e48W1.getPlayer().prepare();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    private final void G2(int i) {
        PairIntInt pairIntInt;
        int width;
        INLEMediaRuntime mediaRuntimeApi;
        INLEMediaRuntime mediaRuntimeApi2;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        INLEMediaSession iNLEMediaSessionF1 = c0e48W1.f1();
        int height = 0;
        if (iNLEMediaSessionF1 == null || (mediaRuntimeApi2 = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (pairIntInt = mediaRuntimeApi2.getInitSize()) == null) {
            pairIntInt = new PairIntInt(0, 0);
        }
        if (pairIntInt.getFirst() != 0 && pairIntInt.getSecond() != 0) {
            SurfaceView surfaceViewLJIJJLI = c0e48W1.LJIJJLI();
            if (surfaceViewLJIJJLI != null) {
                width = surfaceViewLJIJJLI.getWidth();
            } else {
                width = 0;
            }
            SurfaceView surfaceViewLJIJJLI2 = c0e48W1.LJIJJLI();
            if (surfaceViewLJIJJLI2 != null) {
                height = surfaceViewLJIJJLI2.getHeight();
            }
            PointF pointF = new PointF(width / 2.0f, height / 2.0f);
            float f = -i;
            if (Intrinsics.LJFF(C0E5G.LIZ(EnumC357850E1f.ENABLE_SURFACE_VIEW_PROPERTY_API), Boolean.TRUE)) {
                SurfaceView surfaceViewLJIJJLI3 = c0e48W1.LJIJJLI();
                if (surfaceViewLJIJJLI3 != null) {
                    AwS1S0200004_5 awS1S0200004_5 = new AwS1S0200004_5(surfaceViewLJIJJLI3, pointF, f, 1);
                    if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                        C1524705y1.LIZJ(new AwS549S0100000_5(awS1S0200004_5, 711));
                        return;
                    } else {
                        awS1S0200004_5.invoke();
                        return;
                    }
                }
                return;
            }
            INLEMediaSession iNLEMediaSessionF12 = c0e48W1.f1();
            if (iNLEMediaSessionF12 == null || (mediaRuntimeApi = iNLEMediaSessionF12.getMediaRuntimeApi()) == null) {
                return;
            }
            mediaRuntimeApi.setDisplayState(1.0f, 1.0f, 0.0f, (int) 0.0f, (int) f);
        }
    }

    @Override // X.InterfaceC374990En3
    public void pO0(boolean z, Function0<Unit> function0) {
        if (!z) {
            w2(null, function0);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C375500Ens(this, function0, null), 3);
        }
    }

    public final void w2(Bitmap bitmap, Function0<Unit> function0) {
        AppCompatImageView appCompatImageView = this.LLILZIL;
        if (bitmap == null) {
            C786410Ut5.LLILIL(appCompatImageView, 0);
            C372570Ej9.LIZIZ(appCompatImageView, new AwS549S0100000_5(function0, (Function0<Unit>) 709));
        } else {
            appCompatImageView.setImageBitmap(bitmap);
            C786410Ut5.LLILIL(appCompatImageView, 0);
            C372570Ej9.LIZIZ(appCompatImageView, new AwS549S0100000_5(function0, (Function0<Unit>) 710));
        }
    }

    public C375490Enr(C1DRG c1drg, View view, AppCompatImageView appCompatImageView) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = view;
        this.LLILZIL = appCompatImageView;
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374920Emw.class, null);
    }

    private final void o2(float f, float f2, float f3, float f4) {
        Pair<Integer, Integer> pair;
        int width;
        INLEMediaRuntime mediaRuntimeApi;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (pair = this.LLIZLLLIL) != null && pair.getFirst().intValue() != 0 && pair.getSecond().intValue() != 0 && this.LLIZ != null) {
            float fIntValue = f3 / pair.getFirst().intValue();
            float fIntValue2 = f4 / pair.getSecond().intValue();
            SurfaceView surfaceViewLJIJJLI = c0e48W1.LJIJJLI();
            int height = 0;
            if (surfaceViewLJIJJLI != null) {
                width = surfaceViewLJIJJLI.getWidth();
            } else {
                width = 0;
            }
            SurfaceView surfaceViewLJIJJLI2 = c0e48W1.LJIJJLI();
            if (surfaceViewLJIJJLI2 != null) {
                height = surfaceViewLJIJJLI2.getHeight();
            }
            PointF pointF = new PointF(width / 2.0f, height / 2.0f);
            float f5 = 2;
            float f6 = -((pointF.x - (f3 / f5)) - f);
            float f7 = (pointF.y - (f4 / f5)) - f2;
            if (Intrinsics.LJFF(C0E5G.LIZ(EnumC357850E1f.ENABLE_SURFACE_VIEW_PROPERTY_API), Boolean.TRUE)) {
                SurfaceView surfaceViewLJIJJLI3 = c0e48W1.LJIJJLI();
                if (surfaceViewLJIJJLI3 != null) {
                    AwS1S0200004_5 awS1S0200004_5 = new AwS1S0200004_5(fIntValue, fIntValue2, surfaceViewLJIJJLI3, pointF, f7, f6, 0);
                    if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                        C1524705y1.LIZJ(new AwS549S0100000_5(awS1S0200004_5, 708));
                        return;
                    } else {
                        awS1S0200004_5.invoke();
                        return;
                    }
                }
                return;
            }
            INLEMediaSession iNLEMediaSessionF1 = c0e48W1.f1();
            if (iNLEMediaSessionF1 == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null) {
                return;
            }
            mediaRuntimeApi.setDisplayState(fIntValue, fIntValue2, 0.0f, (int) f6, (int) f7);
        }
    }
}
