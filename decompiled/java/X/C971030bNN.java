package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C971030bNN extends C2217421BqW implements Function0<Bitmap> {
    public C971030bNN(InterfaceC971180bNc interfaceC971180bNc) {
        super(0, interfaceC971180bNc, C971040bNO.class, "getCurSurfaceViewBitmap", "getCurSurfaceViewBitmap()Landroid/graphics/Bitmap;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bitmap invoke() {
        INLEMediaRuntime mediaRuntimeApi;
        C971040bNO c971040bNO = (C971040bNO) this.receiver;
        C1463860oCG c1463860oCG = c971040bNO.LIZJ;
        Bitmap currDisplayImage = (c1463860oCG == null || (mediaRuntimeApi = c1463860oCG.getMediaRuntimeApi()) == null) ? null : ((C1463950oCP) mediaRuntimeApi).getCurrDisplayImage(-1);
        MultiCanvasUtils.LIZ.getClass();
        return !MultiCanvasUtils.LJIIZILJ(currDisplayImage) ? c971040bNO.LJII(2) : currDisplayImage;
    }
}
