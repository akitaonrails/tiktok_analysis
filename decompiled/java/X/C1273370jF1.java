package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference;
import com.ss.lyrax.video.TTLHTarsSdkConfigs;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import java.nio.ByteBuffer;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0jF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273370jF1 implements InterfaceC1272840jEA, InterfaceC1269980j9Y {
    public volatile long LL = System.currentTimeMillis();
    public final C1269300j8S LLILLJJLI;
    public final C1268970j7v LLILLL;
    public volatile boolean LLILZ;
    public final TTLHTarsSdkConfigs LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final TarsWrapperInference LLJ;
    public final String LLJI;
    public ByteBuffer LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public Bitmap LLJILLL;
    public final Handler LLJJ;
    public C1273350jEz LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final boolean LLJJJ;

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
        this.LLILZLL = 0;
        TarsWrapperInference tarsWrapperInference = this.LLJ;
        if (tarsWrapperInference != null) {
            tarsWrapperInference.LIZIZ(this.LLJI, new InterfaceC1273460jFA() { // from class: X.0jF7
                @Override // X.InterfaceC1273460jFA
                public final void LIZ(Exception exc) {
                }

                @Override // X.InterfaceC1273460jFA
                public final void onSuccess(Object obj) {
                }
            });
        }
        TarsWrapperInference tarsWrapperInference2 = this.LLJ;
        if (tarsWrapperInference2 != null) {
            tarsWrapperInference2.release(this.LLJI);
        }
        Bitmap bitmap = this.LLJILLL;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLJILLL = null;
    }

    public final void LIZ() {
        TarsWrapperInference tarsWrapperInference = this.LLJ;
        if (tarsWrapperInference == null || !tarsWrapperInference.LIZ()) {
            TarsWrapperInference tarsWrapperInference2 = this.LLJ;
            if (tarsWrapperInference2 != null) {
                tarsWrapperInference2.LIZIZ(this.LLJI, new InterfaceC1273460jFA() { // from class: X.0jF2
                    @Override // X.InterfaceC1273460jFA
                    public final void LIZ(Exception exc) throws JSONException {
                        C1269300j8S c1269300j8S = this.LIZ.LLILLJJLI;
                        if (c1269300j8S != null) {
                            c1269300j8S.LIZ("tars_detect", "pitaya_observer", "fail", exc.toString());
                        }
                    }

                    @Override // X.InterfaceC1273460jFA
                    public final void onSuccess(Object obj) throws JSONException {
                        C1269300j8S c1269300j8S = this.LIZ.LLILLJJLI;
                        if (c1269300j8S != null) {
                            c1269300j8S.LIZ("tars_detect", "pitaya_observer", "success", String.valueOf(obj));
                        }
                        C1273370jF1 c1273370jF1 = this.LIZ;
                        c1273370jF1.LLILZLL = 1;
                        TarsWrapperInference tarsWrapperInference3 = c1273370jF1.LLJ;
                        if (tarsWrapperInference3 != null) {
                            tarsWrapperInference3.LIZJ(c1273370jF1.LLJI, new C1273390jF3(c1273370jF1));
                        }
                    }
                });
                return;
            }
            return;
        }
        this.LLILZLL = 1;
        TarsWrapperInference tarsWrapperInference3 = this.LLJ;
        if (tarsWrapperInference3 != null) {
            tarsWrapperInference3.LIZJ(this.LLJI, new C1273390jF3(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1273370jF1(X.C1267500j5Y r4) {
        /*
            r3 = this;
            r3.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r3.LL = r0
            X.0jE7 r1 = r4.LIZJ
            java.lang.Class<X.0j8S> r0 = X.C1269300j8S.class
            X.0jEA r0 = r1.getService(r0)
            X.0j8S r0 = (X.C1269300j8S) r0
            r3.LLILLJJLI = r0
            X.0jE7 r1 = r4.LIZJ
            java.lang.Class<X.0j7v> r0 = X.C1268970j7v.class
            X.0jEA r0 = r1.getService(r0)
            X.0j7v r0 = (X.C1268970j7v) r0
            r3.LLILLL = r0
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r4.LIZ
            com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs r0 = r0.ttlhABSettingsConfigs
            com.ss.lyrax.video.TTLHTarsSdkConfigs r1 = r0.LJIIZILJ()
            r3.LLILZIL = r1
            X.0jF8 r0 = com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference r0 = X.C1273440jF8.LIZIZ
            r3.LLJ = r0
            java.lang.String r0 = r1.scene
            r3.LLJI = r0
            r0 = 224(0xe0, float:3.14E-43)
            r3.LLJJIJIIJIL = r0
            r3.LLJJIJIL = r0
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r4.LIZ
            boolean r0 = r0.LJIIJ()
            r3.LLJJJ = r0
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r4.LIZ
            boolean r0 = r0.LJIIIZ()
            if (r0 == 0) goto L6d
            X.0jE7 r1 = r4.LIZJ
            java.lang.Class<X.0j7U> r0 = X.C1268700j7U.class
            X.0jEA r0 = r1.getService(r0)
            X.0j7U r0 = (X.C1268700j7U) r0
            if (r0 == 0) goto L7c
            android.os.Handler r2 = r0.LIZIZ()
        L5e:
            r3.LLJJ = r2
            if (r2 == 0) goto L7e
            Y.ARunnableS120S0100000_20 r1 = new Y.ARunnableS120S0100000_20
            r0 = 332(0x14c, float:4.65E-43)
            r1.<init>(r3, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
            return
        L6d:
            X.0jE7 r1 = r4.LIZJ
            java.lang.Class<X.0j7X> r0 = X.C1268730j7X.class
            X.0jEA r0 = r1.getService(r0)
            X.0j7X r0 = (X.C1268730j7X) r0
            if (r0 == 0) goto L7c
            android.os.Handler r2 = r0.LL
            goto L5e
        L7c:
            r2 = 0
            goto L5e
        L7e:
            r3.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1273370jF1.<init>(X.0j5Y):void");
    }

    public final void LIZJ(int i, int i2) {
        if (this.LLJIJIL == null || this.LLJILJIL != i || this.LLJILJILJ != i2) {
            this.LLJIJIL = ByteBuffer.allocateDirect(i * i2 * 4);
        }
        this.LLJILJIL = i;
        this.LLJILJILJ = i2;
        Bitmap bitmap = this.LLJILLL;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (bitmap == null) {
            this.LLJILLL = Bitmap.createBitmap(i, i2, config);
        } else {
            if (bitmap.getWidth() == this.LLJILJIL && bitmap.getHeight() == this.LLJILJILJ) {
                return;
            }
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            this.LLJILLL = Bitmap.createBitmap(this.LLJILJIL, this.LLJILJILJ, config);
        }
    }

    @Override // X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) throws CloneNotSupportedException {
        boolean z;
        boolean z2;
        InterfaceC1271560jC6 interfaceC1271560jC6;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (videoFrame.getBuffer().getBufferType() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (videoFrame.getBuffer().getBufferType() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return;
        }
        int width = buffer.getWidth();
        int height = buffer.getHeight();
        int textureId = buffer.getTextureId();
        Matrix transformMatrix = null;
        if (this.LLJJJ) {
            VideoFrame.Buffer buffer2 = videoFrame.getBuffer();
            if ((buffer2 instanceof InterfaceC1271560jC6) && (interfaceC1271560jC6 = (InterfaceC1271560jC6) buffer2) != null) {
                Object objClone = interfaceC1271560jC6.getTransformMatrixArray().clone();
                if (!bundle.getBoolean("flip_in_crop_and_scale", false)) {
                    float[] fArr = (float[]) objClone;
                    android.opengl.Matrix.multiplyMM(fArr, 0, fArr, 0, C1267770j5z.LIZ, 0);
                }
                transformMatrix = C1273010jER.LIZJ(0, (float[]) objClone);
            }
        } else if (!z) {
            transformMatrix = ((InterfaceC1271560jC6) buffer).getTransformMatrix();
        }
        LIZIZ(textureId, width, height, z2, videoFrame, transformMatrix);
    }

    public final void LIZIZ(final int i, final int i2, final int i3, final boolean z, final InterfaceC1272490jDb interfaceC1272490jDb, final Matrix matrix) {
        if (this.LLILZIL.enable && this.LLILZLL == 3) {
            if ((this.LLIZ || this.LLIZLLLIL) && this.LLJ != null && !this.LLILZ && this.LLJ.LIZ()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.LL >= this.LLILZIL.interval) {
                    this.LL = jCurrentTimeMillis;
                    this.LLILZ = true;
                    Runnable runnable = new Runnable() { // from class: X.0jF6
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
                        /* JADX WARN: Type inference failed for: r0v21, types: [X.0jF5] */
                        /* JADX WARN: Type inference failed for: r9v2, types: [X.0jEz] */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 254
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1273420jF6.run():void");
                        }
                    };
                    interfaceC1272490jDb.retain("tars_inference");
                    Handler handler = this.LLJJ;
                    if (handler != null && C786410Ut5.LJJZZIII(handler, runnable)) {
                        return;
                    }
                    interfaceC1272490jDb.release("tars_inference");
                    this.LLILZ = false;
                }
            }
        }
    }
}
