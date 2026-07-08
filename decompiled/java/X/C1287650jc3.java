package X;

import X.C1287650jc3;
import X.C1C7U;
import X.C2179971ATj;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import com.bef.effectsdk.OpenGLUtils;
import com.bef.effectsdk.game.BEFGameView$BEFGameContextFactory;
import com.bef.effectsdk.game.BEFGameView$MessageListener;
import com.bef.effectsdk.game.NativeInterface;
import com.bef.effectsdk.game.RenderTextureUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.Buffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: X.0jc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1287650jc3 extends GLSurfaceView implements GLSurfaceView.Renderer, NativeInterface.NativeMessageListener {
    public long mAnimationInterval;
    public Queue<Runnable> mCacheMessages;
    public double mCurrentFps;
    public int mDstTexture;
    public int mFBO;
    public boolean mFirstLoopGuard;
    public long mFps;
    public String mGameBundlePath;
    public int mGlMatrixHandle;
    public int mGlPosHandle;
    public int mGlProgram;
    public int mGlTextureSampleHandle;
    public int mGlUvHandle;
    public long mHandle;
    public long mLastTickInNanoSeconds;
    public HashSet<BEFGameView$MessageListener> mListeners;
    public float[] mMatrix;
    public boolean mMultipleTouchEnabled;
    public boolean mNativeInited;
    public int mSrcTexture;
    public long mStartTimeStampNanoSeconds;
    public boolean mSwallowTouches;
    public int[] mTouch_ids;
    public float[] mTouch_xs;
    public float[] mTouch_ys;

    public void deleteBuffers() {
        GLES20.glDeleteTextures(1, new int[]{this.mSrcTexture}, 0);
        GLES20.glDeleteTextures(1, new int[]{this.mDstTexture}, 0);
        GLES20.glDeleteBuffers(1, new int[]{this.mFBO}, 0);
    }

    public void destroyBEFGame() {
    }

    public synchronized double getCurrentFps() {
        return this.mCurrentFps;
    }

    public synchronized boolean getNativeInited() {
        return this.mNativeInited;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    public void initRenderObject() {
        int iLoadProgram = OpenGLUtils.loadProgram("attribute vec2 attUV;\nattribute vec2 attPosition;\nvarying vec2 textureCoord;\nuniform mat4 mvpMatrix;\n\nvoid main() {\n    gl_Position  = mvpMatrix * vec4(attPosition, 0.,1.);\n    textureCoord = attUV;\n}\n", "precision highp float;\n\nuniform sampler2D uTexture;\nvarying vec2 textureCoord;\nvoid main() {\n    gl_FragColor = texture2D(uTexture, textureCoord);\n}\n");
        this.mGlProgram = iLoadProgram;
        this.mGlUvHandle = GLES20.glGetAttribLocation(iLoadProgram, "attUV");
        this.mGlPosHandle = GLES20.glGetAttribLocation(this.mGlProgram, "attPosition");
        this.mGlMatrixHandle = GLES20.glGetUniformLocation(this.mGlProgram, "mvpMatrix");
        this.mGlTextureSampleHandle = GLES20.glGetUniformLocation(this.mGlProgram, "uTexture");
        getWidth();
        getHeight();
        this.mSrcTexture = RenderTextureUtils.generateBlankTexture(720, 1280);
        this.mDstTexture = RenderTextureUtils.generateBlankTexture(720, 1280);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i = iArr[0];
        this.mFBO = i;
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mDstTexture, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public void pauseGame() {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$3
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("BEFGameView@9f31.pauseGame$1");
                com_bef_effectsdk_game_BEFGameView$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("BEFGameView@9f31.pauseGame$1");
            }

            public void com_bef_effectsdk_game_BEFGameView$3__run$___twin___() {
                long j = this.this$0.mHandle;
                if (j != 0) {
                    NativeInterface.nativePause(j);
                }
            }

            public static void com_bef_effectsdk_game_BEFGameView$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$3 bEFGameView$3) {
                try {
                    bEFGameView$3.com_bef_effectsdk_game_BEFGameView$3__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public void resumeGame() {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$4
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("BEFGameView@9f31.resumeGame$1");
                com_bef_effectsdk_game_BEFGameView$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("BEFGameView@9f31.resumeGame$1");
            }

            public void com_bef_effectsdk_game_BEFGameView$4__run$___twin___() {
                long j = this.this$0.mHandle;
                if (j != 0) {
                    NativeInterface.nativeResume(j);
                }
            }

            public static void com_bef_effectsdk_game_BEFGameView$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$4 bEFGameView$4) {
                try {
                    bEFGameView$4.com_bef_effectsdk_game_BEFGameView$4__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public void renderTextureToView() {
        GLES20.glBindFramebuffer(36160, 0);
        int width = getWidth();
        int height = getHeight();
        GLES20.glViewport(0, 0, width, height);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glUseProgram(this.mGlProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.mDstTexture);
        GLES20.glUniform1i(this.mGlTextureSampleHandle, 0);
        Matrix.setIdentityM(this.mMatrix, 0);
        GLES20.glUniformMatrix4fv(this.mGlMatrixHandle, 1, false, this.mMatrix, 0);
        GLES20.glEnableVertexAttribArray(this.mGlPosHandle);
        float f = height / 2.0f;
        GLES20.glVertexAttribPointer(this.mGlPosHandle, 2, 5126, false, 0, (Buffer) RenderTextureUtils.getVertexBufferWithParams(-1.0f, 1.0f, ((((width * 1.0f) / 720.0f) * 1280.0f) - f) / f, -1.0f));
        GLES20.glEnableVertexAttribArray(this.mGlUvHandle);
        GLES20.glVertexAttribPointer(this.mGlUvHandle, 2, 5126, false, 0, (Buffer) RenderTextureUtils.getUVBuffer());
        GLES20.glDrawArrays(5, 0, 4);
    }

    public C1287650jc3(Context context) {
        super(context);
        this.mGameBundlePath = "";
        this.mMatrix = new float[16];
        this.mFirstLoopGuard = true;
        this.mMultipleTouchEnabled = true;
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderMediaOverlay(true);
        setEGLContextFactory(new BEFGameView$BEFGameContextFactory(this));
        setRenderer(this);
        setRenderMode(1);
        this.mListeners = new HashSet<>();
        this.mCacheMessages = new LinkedList();
        setFps(60L);
    }

    public int addMessageListener(BEFGameView$MessageListener bEFGameView$MessageListener) {
        if (bEFGameView$MessageListener == null) {
            return 3;
        }
        this.mListeners.add(bEFGameView$MessageListener);
        return 0;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (getNativeInited() && !this.mGameBundlePath.isEmpty()) {
            if (this.mFirstLoopGuard) {
                this.mStartTimeStampNanoSeconds = System.nanoTime();
                this.mLastTickInNanoSeconds = System.nanoTime();
            }
            if (!this.mFirstLoopGuard) {
                while (!this.mCacheMessages.isEmpty()) {
                    this.mCacheMessages.poll().run();
                }
            }
            render((System.nanoTime() - this.mStartTimeStampNanoSeconds) / 1.0E9d);
            if (System.nanoTime() - this.mLastTickInNanoSeconds < this.mAnimationInterval) {
                try {
                    Thread.sleep((long) (((r7 - r2) * 1.0d) / 1000000.0d));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            double dNanoTime = 1.0d / (((System.nanoTime() - this.mLastTickInNanoSeconds) * 1.0d) / 1.0E9d);
            this.mCurrentFps = dNanoTime;
            long j = this.mFps;
            if (dNanoTime >= j) {
                this.mCurrentFps = j;
            }
            this.mLastTickInNanoSeconds = System.nanoTime();
            this.mFirstLoopGuard = false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i = 0; i < pointerCount; i++) {
            this.mTouch_ids[i] = motionEvent.getPointerId(i);
            this.mTouch_xs[i] = motionEvent.getX(i);
            this.mTouch_ys[i] = motionEvent.getY(i);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 5) {
                        if (action == 6) {
                            int action2 = motionEvent.getAction() >> 8;
                            if (this.mMultipleTouchEnabled || action2 == 0) {
                                convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
                                final int[] iArr = {this.mTouch_ids[action2]};
                                final float[] fArr = {this.mTouch_xs[action2]};
                                final float[] fArr2 = {this.mTouch_ys[action2]};
                                queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$9
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        C1C7U.LIZ("BEFGameView@9f31.onTouchEvent$6");
                                        com_bef_effectsdk_game_BEFGameView$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                        C1C7U.LIZIZ("BEFGameView@9f31.onTouchEvent$6");
                                    }

                                    public void com_bef_effectsdk_game_BEFGameView$9__run$___twin___() {
                                        NativeInterface.nativeTouchesEnd(this.this$0.mHandle, iArr, fArr, fArr2);
                                    }

                                    public static void com_bef_effectsdk_game_BEFGameView$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$9 bEFGameView$9) {
                                        try {
                                            bEFGameView$9.com_bef_effectsdk_game_BEFGameView$9__run$___twin___();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            if (!C2179971ATj.LIZ(th)) {
                                                throw th;
                                            }
                                        }
                                    }
                                });
                                return true;
                            }
                        }
                    } else {
                        int action3 = motionEvent.getAction() >> 8;
                        if (this.mMultipleTouchEnabled || action3 == 0) {
                            convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
                            final int[] iArr2 = {this.mTouch_ids[action3]};
                            final float[] fArr3 = {this.mTouch_xs[action3]};
                            final float[] fArr4 = {this.mTouch_ys[action3]};
                            queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$5
                                @Override // java.lang.Runnable
                                public void run() {
                                    C1C7U.LIZ("BEFGameView@9f31.onTouchEvent$2");
                                    com_bef_effectsdk_game_BEFGameView$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                    C1C7U.LIZIZ("BEFGameView@9f31.onTouchEvent$2");
                                }

                                public void com_bef_effectsdk_game_BEFGameView$5__run$___twin___() {
                                    NativeInterface.nativeTouchesBegin(this.this$0.mHandle, iArr2, fArr3, fArr4);
                                }

                                public static void com_bef_effectsdk_game_BEFGameView$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$5 bEFGameView$5) {
                                    try {
                                        bEFGameView$5.com_bef_effectsdk_game_BEFGameView$5__run$___twin___();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        if (!C2179971ATj.LIZ(th)) {
                                            throw th;
                                        }
                                    }
                                }
                            });
                            return true;
                        }
                    }
                } else {
                    convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
                    if (!this.mMultipleTouchEnabled) {
                        final int[] iArr3 = {this.mTouch_ids[0]};
                        final float[] fArr5 = {this.mTouch_xs[0]};
                        final float[] fArr6 = {this.mTouch_ys[0]};
                        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$7
                            @Override // java.lang.Runnable
                            public void run() {
                                C1C7U.LIZ("BEFGameView@9f31.onTouchEvent$4");
                                com_bef_effectsdk_game_BEFGameView$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                C1C7U.LIZIZ("BEFGameView@9f31.onTouchEvent$4");
                            }

                            public void com_bef_effectsdk_game_BEFGameView$7__run$___twin___() {
                                NativeInterface.nativeTouchesMove(this.this$0.mHandle, iArr3, fArr5, fArr6);
                            }

                            public static void com_bef_effectsdk_game_BEFGameView$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$7 bEFGameView$7) {
                                try {
                                    bEFGameView$7.com_bef_effectsdk_game_BEFGameView$7__run$___twin___();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    if (!C2179971ATj.LIZ(th)) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    } else {
                        for (int i2 = 0; i2 < pointerCount; i2++) {
                            final int[] iArr4 = {this.mTouch_ids[i2]};
                            final float[] fArr7 = {this.mTouch_xs[i2]};
                            final float[] fArr8 = {this.mTouch_ys[i2]};
                            queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$8
                                @Override // java.lang.Runnable
                                public void run() {
                                    C1C7U.LIZ("BEFGameView@9f31.onTouchEvent$5");
                                    com_bef_effectsdk_game_BEFGameView$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                    C1C7U.LIZIZ("BEFGameView@9f31.onTouchEvent$5");
                                }

                                public void com_bef_effectsdk_game_BEFGameView$8__run$___twin___() {
                                    NativeInterface.nativeTouchesMove(this.this$0.mHandle, iArr4, fArr7, fArr8);
                                }

                                public static void com_bef_effectsdk_game_BEFGameView$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$8 bEFGameView$8) {
                                    try {
                                        bEFGameView$8.com_bef_effectsdk_game_BEFGameView$8__run$___twin___();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        if (!C2179971ATj.LIZ(th)) {
                                            throw th;
                                        }
                                    }
                                }
                            });
                        }
                        return true;
                    }
                }
                return this.mSwallowTouches;
            }
            convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, 1);
            final int[] iArr5 = {this.mTouch_ids[0]};
            final float[] fArr9 = {this.mTouch_xs[0]};
            final float[] fArr10 = {this.mTouch_ys[0]};
            queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$10
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("BEFGameView@9f31.onTouchEvent$1");
                    com_bef_effectsdk_game_BEFGameView$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("BEFGameView@9f31.onTouchEvent$1");
                }

                public void com_bef_effectsdk_game_BEFGameView$10__run$___twin___() {
                    NativeInterface.nativeTouchesEnd(this.this$0.mHandle, iArr5, fArr9, fArr10);
                }

                public static void com_bef_effectsdk_game_BEFGameView$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$10 bEFGameView$10) {
                    try {
                        bEFGameView$10.com_bef_effectsdk_game_BEFGameView$10__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
            return true;
        }
        convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, 1);
        final int[] iArr6 = {this.mTouch_ids[0]};
        final float[] fArr11 = {this.mTouch_xs[0]};
        final float[] fArr12 = {this.mTouch_ys[0]};
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$6
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("BEFGameView@9f31.onTouchEvent$3");
                com_bef_effectsdk_game_BEFGameView$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("BEFGameView@9f31.onTouchEvent$3");
            }

            public void com_bef_effectsdk_game_BEFGameView$6__run$___twin___() {
                NativeInterface.nativeTouchesBegin(this.this$0.mHandle, iArr6, fArr11, fArr12);
            }

            public static void com_bef_effectsdk_game_BEFGameView$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$6 bEFGameView$6) {
                try {
                    bEFGameView$6.com_bef_effectsdk_game_BEFGameView$6__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
        return true;
    }

    public int removeMessageListener(BEFGameView$MessageListener bEFGameView$MessageListener) {
        if (bEFGameView$MessageListener == null) {
            return 3;
        }
        this.mListeners.remove(bEFGameView$MessageListener);
        return 0;
    }

    public void render(double d) {
        NativeInterface.nativeSetSize(this.mHandle, 720, 1280);
        renderGameToTexture(d);
        renderTextureToView();
    }

    public void renderGameToTexture(double d) {
        GLES20.glBindFramebuffer(36160, this.mFBO);
        GLES20.glViewport(0, 0, 720, 1280);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        NativeInterface.nativeProcess(this.mHandle, this.mSrcTexture, this.mDstTexture, d);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public void setFps(long j) {
        if (j >= 60) {
            this.mFps = 60L;
        } else {
            this.mFps = j;
        }
        long j2 = this.mFps;
        this.mCurrentFps = j2;
        this.mAnimationInterval = (long) ((1.0f / j2) * 1.0E9f);
    }

    public void setGameBundlePath(final String str) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("BEFGameView@9f31.setGameBundlePath$2");
                com_bef_effectsdk_game_BEFGameView$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("BEFGameView@9f31.setGameBundlePath$2");
            }

            public void com_bef_effectsdk_game_BEFGameView$1__run$___twin___() {
                if (this.this$0.mGameBundlePath.equals(str)) {
                    return;
                }
                C1287650jc3 c1287650jc3 = this.this$0;
                c1287650jc3.mGameBundlePath = str;
                if (c1287650jc3.getNativeInited()) {
                    NativeInterface.nativeSetStickerPath(this.this$0.mHandle, str);
                    this.this$0.mFirstLoopGuard = true;
                }
            }

            public static void com_bef_effectsdk_game_BEFGameView$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$1 bEFGameView$1) {
                try {
                    bEFGameView$1.com_bef_effectsdk_game_BEFGameView$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public void setNativeInited(boolean z) {
        this.mNativeInited = z;
    }

    public void setSwallowTouches(boolean z) {
        this.mSwallowTouches = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.mStartTimeStampNanoSeconds = System.nanoTime();
        this.mLastTickInNanoSeconds = System.nanoTime();
        long[] jArr = new long[2];
        NativeInterface.nativeCreateHandle(jArr);
        long j = jArr[0];
        this.mHandle = j;
        NativeInterface.nativeInit(j, 720, 1280);
        NativeInterface.nativeAddMessageListener(this.mHandle, this);
        initRenderObject();
        setNativeInited(true);
        if (!this.mGameBundlePath.isEmpty()) {
            NativeInterface.nativeSetStickerPath(this.mHandle, this.mGameBundlePath);
        }
    }

    public void convertTouchesToNormalizedPos(float[] fArr, float[] fArr2, int i) {
        float width = getWidth();
        float f = ((width * 1.0f) / 720.0f) * 1280.0f;
        float height = getHeight() - f;
        for (int i2 = 0; i2 < i; i2++) {
            float f2 = fArr[i2];
            float f3 = fArr2[i2];
            fArr[i2] = ((f2 * 2.0f) / width) - 1.0f;
            fArr2[i2] = 1.0f - (((f3 - height) * 2.0f) / f);
        }
    }

    @Override // com.bef.effectsdk.game.NativeInterface.NativeMessageListener
    public int nativeOnMsgReceived(long j, long j2, long j3, String str) {
        Iterator<BEFGameView$MessageListener> it2 = this.mListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onMsgReceived(j, j2, j3, str);
        }
        return 0;
    }

    public int postMessage(final long j, final long j2, final long j3, final String str) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$2
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("BEFGameView@9f31.postMessage$1");
                com_bef_effectsdk_game_BEFGameView$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("BEFGameView@9f31.postMessage$1");
            }

            public void com_bef_effectsdk_game_BEFGameView$2__run$___twin___() {
                this.this$0.mCacheMessages.add(new Runnable() { // from class: com.bef.effectsdk.game.BEFGameView$2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C1C7U.LIZ("BEFGameView@9f31.postMessage$1$1");
                        com_bef_effectsdk_game_BEFGameView$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("BEFGameView@9f31.postMessage$1$1");
                    }

                    public void com_bef_effectsdk_game_BEFGameView$2$1__run$___twin___() {
                        BEFGameView$2 bEFGameView$2 = BEFGameView$2.this;
                        NativeInterface.nativePostMessage(bEFGameView$2.this$0.mHandle, j, j2, j3, str);
                    }

                    public static void com_bef_effectsdk_game_BEFGameView$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        try {
                            anonymousClass1.com_bef_effectsdk_game_BEFGameView$2$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            }

            public static void com_bef_effectsdk_game_BEFGameView$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BEFGameView$2 bEFGameView$2) {
                try {
                    bEFGameView$2.com_bef_effectsdk_game_BEFGameView$2__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
        return 0;
    }
}
