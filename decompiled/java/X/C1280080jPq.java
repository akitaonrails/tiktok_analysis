package X;

import android.os.Handler;
import com.ss.ttlivestreamer.core.engine.VideoEncoderFactory;
import com.ss.ttlivestreamer.core.opengl.GLThread;

/* JADX INFO: renamed from: X.0jPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1280080jPq extends VideoEncoderFactory {
    public GLThread LL;
    public Handler LLILLJJLI;
    public InterfaceC1272820jE8 LLILLL;

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory
    public final String GetSupportedFormats() {
        return "video_type=video/avc,video_enable_accelera=true,oes_texture_frame=true:video_type=video/bytevc1,video_enable_accelera=true,oes_texture_frame=true";
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        GLThread gLThread = this.LL;
        this.LL = null;
        C1273730jFb.LIZLLL(gLThread);
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final void finalize() {
        release();
        super.finalize();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.ttlivestreamer.core.engine.VideoEncoder CreateVideoEncoder(java.lang.String r12, boolean r13) {
        /*
            r11 = this;
            r2 = 0
            if (r13 != 0) goto L4
            return r2
        L4:
            java.lang.String r0 = ","
            java.lang.String[] r8 = r12.split(r0)
            int r7 = r8.length
            r6 = 0
            java.lang.String r4 = ""
            r5 = 0
            r10 = 0
        L10:
            if (r5 >= r7) goto L40
            r1 = r8[r5]
            java.lang.String r0 = "="
            java.lang.String[] r9 = r1.split(r0)
            int r0 = r9.length
            r3 = 1
            if (r0 <= r3) goto L2a
            r1 = r9[r6]
            java.lang.String r0 = "video_type"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L2d
            r4 = r9[r3]
        L2a:
            int r5 = r5 + 1
            goto L10
        L2d:
            r1 = r9[r6]
            java.lang.String r0 = "oes_texture_frame"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L2a
            r1 = r9[r3]
            java.lang.String r0 = "true"
            boolean r10 = r1.equalsIgnoreCase(r0)
            goto L2a
        L40:
            if (r10 != 0) goto L5d
            com.ss.ttlivestreamer.core.opengl.GLThread r0 = r11.LL
            if (r0 != 0) goto L51
            java.lang.String r0 = "HardWareEncodeThread"
            com.ss.ttlivestreamer.core.opengl.GLThread r0 = X.C1273730jFb.LIZ(r6, r0)
            r11.LL = r0
            r0.start()
        L51:
            android.os.Handler r0 = r11.LLILLJJLI
            if (r0 != 0) goto L5d
            com.ss.ttlivestreamer.core.opengl.GLThread r0 = r11.LL
            android.os.Handler r0 = r0.getHandler()
            r11.LLILLJJLI = r0
        L5d:
            java.lang.String r3 = "video/bytevc1"
            if (r10 == 0) goto L74
            X.0jTT r1 = new X.0jTT
            boolean r0 = r4.equalsIgnoreCase(r3)
            r1.<init>(r0)
            boolean r0 = r1.LLJILJILJ()
            if (r0 != 0) goto La6
            r1.release()
        L73:
            return r2
        L74:
            java.lang.String r0 = "video/avc"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L8d
            X.0jTV r1 = new X.0jTV
            android.os.Handler r0 = r11.LLILLJJLI
            r1.<init>(r0)
            boolean r0 = r1.LLJILJILJ()
            if (r0 != 0) goto La4
            r1.release()
            return r2
        L8d:
            boolean r0 = r4.equalsIgnoreCase(r3)
            if (r0 == 0) goto L73
            X.0jTU r1 = new X.0jTU
            android.os.Handler r0 = r11.LLILLJJLI
            r1.<init>(r0)
            boolean r0 = r1.LLJILJILJ()
            if (r0 != 0) goto La4
            r1.release()
            return r2
        La4:
            r2 = r1
            goto La7
        La6:
            r2 = r1
        La7:
            X.0jE8 r1 = r11.LLILLL
            if (r1 == 0) goto L73
            java.lang.Class<X.0j9U> r0 = X.C1269940j9U.class
            X.0jEA r0 = r1.getService(r0)
            X.0j9U r0 = (X.C1269940j9U) r0
            r2.LLLI = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1280080jPq.CreateVideoEncoder(java.lang.String, boolean):com.ss.ttlivestreamer.core.engine.VideoEncoder");
    }
}
