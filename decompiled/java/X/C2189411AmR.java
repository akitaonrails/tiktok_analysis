package X;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1AmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2189411AmR extends C1DN3 {
    public static final String LJIJ = C2189411AmR.class.getSimpleName();
    public C2189401AmQ LJIILIIL;
    public int LJIILJJIL;
    public final SurfaceTexture LJIILL;
    public byte[][] LJIILLIIL;
    public int LJIIZILJ;

    @Override // X.C1DN3
    public final Surface LIZJ() {
        return null;
    }

    @Override // X.C1DN3
    public final void LJIILL() {
    }

    public final byte[][] LJJIFFI() {
        TEFrameSizei tEFrameSizei = this.LJFF;
        int i = ((tEFrameSizei.width * tEFrameSizei.height) * 3) / 2;
        int i2 = C2187451AjH.LIZ;
        String str = LJIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBuffers current bufferSize: ");
        sbLIZ.append(i);
        sbLIZ.append(" mCallbackBytebufferSize:");
        sbLIZ.append(this.LJIIZILJ);
        C2183341Ace.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        int i3 = this.LJIIZILJ;
        if (i > i3 || i3 == 0) {
            this.LJIILLIIL = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, i);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("new mCallbackBytebuffer size :");
            sbLIZ2.append(i);
            C2183341Ace.LIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
            this.LJIIZILJ = i;
        }
        return this.LJIILLIIL;
    }

    @Override // X.C1DN3
    public final SurfaceTexture LJI() {
        return this.LJIILL;
    }

    @Override // X.C1DN3
    public final EnumC2186221AhI LJIIJJI() {
        return EnumC2186221AhI.PROVIDER_TYPE_BUFFER_CALLBACK;
    }

    public C2189411AmR(C1DJM c1djm, C1DJK c1djk) {
        super(c1djm, c1djk);
        this.LJIILL = c1djm.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1AmQ] */
    @Override // X.C1DN3
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (((ArrayList) list).size() > 0) {
            this.LJFF = C2183321Acc.LIZIZ(list, tEFrameSizei, this.LJI.LIZIZ().LLLZ);
        }
        SurfaceTexture surfaceTexture = this.LJIILL;
        TEFrameSizei tEFrameSizei2 = this.LJFF;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        this.LJIILIIL = new Camera.PreviewCallback() { // from class: X.1AmQ
            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                int length;
                TEFrameSizei tEFrameSizei3;
                int i;
                C2189411AmR c2189411AmR = this.LL;
                c2189411AmR.getClass();
                if (bArr != null && (length = bArr.length) > 0 && (tEFrameSizei3 = c2189411AmR.LJFF) != null && (i = c2189411AmR.LJIILJJIL) < 3) {
                    c2189411AmR.LJIILJJIL = i + 1;
                    int i2 = tEFrameSizei3.width * tEFrameSizei3.height;
                    if (i2 > length) {
                        int i3 = C2187451AjH.LIZ;
                        String str = C2189411AmR.LJIJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("checkPreviewData failed: mSize: ");
                        sbLIZ.append(c2189411AmR.LJFF);
                        sbLIZ.append(", length: ");
                        sbLIZ.append(length);
                        C2183341Ace.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        int i4 = i2 / DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                        int i5 = i4 / 2;
                        byte b = bArr[0];
                        byte b2 = bArr[i2];
                        int i6 = 0;
                        do {
                            int i7 = i6 * i4;
                            int i8 = (i6 * i5) + i2;
                            if (i7 >= length || i8 >= length) {
                                break;
                            }
                            if (b == bArr[i7] && b2 == bArr[i8]) {
                                i6++;
                            } else {
                                TEFrameSizei tEFrameSizei4 = this.LL.LJFF;
                                TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei4.width, tEFrameSizei4.height, System.currentTimeMillis() * 1000);
                                tECameraFrame.initBufferFrame(bArr, this.LL.LJI.LJIIZILJ(), TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21, this.LL.LJI.LIZIZ().LLILZ);
                                this.LL.LJIILJJIL(tECameraFrame);
                                break;
                            }
                        } while (i6 < 300);
                    }
                } else {
                    TEFrameSizei tEFrameSizei42 = this.LL.LJFF;
                    TECameraFrame tECameraFrame2 = new TECameraFrame(tEFrameSizei42.width, tEFrameSizei42.height, System.currentTimeMillis() * 1000);
                    tECameraFrame2.initBufferFrame(bArr, this.LL.LJI.LJIIZILJ(), TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21, this.LL.LJI.LIZIZ().LLILZ);
                    this.LL.LJIILJJIL(tECameraFrame2);
                    break;
                }
                if (camera != null) {
                    camera.addCallbackBuffer(bArr);
                }
            }
        };
    }
}
