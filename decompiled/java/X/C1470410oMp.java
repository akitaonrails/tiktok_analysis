package X;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.ttm.player.x;
import java.lang.reflect.Method;
import java.util.ArrayList;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470410oMp extends AbsPlayer<C1470410oMp> {
    public final Context LIZ;
    public C1470420oMq LIZIZ;
    public C1470460oMu LIZJ;
    public final C1470450oMt LIZLLL;
    public final C1470360oMk LJ;
    public final C1470370oMl LJFF;
    public final C1470380oMm LJI;

    /* JADX WARN: Type inference failed for: r0v42, types: [X.0oMu] */
    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        x.LJI(2, 1);
        x.LJI(1, 1);
        x.LJI(11, 1);
        Context context = this.LIZ;
        C1470420oMq c1470420oMq = new C1470420oMq();
        synchronized (C1470420oMq.class) {
            try {
                if (x.LJFF()) {
                    try {
                        Class<?> cls = Class.forName("com.ss.ttm.player.TTPlayerClient");
                        Method declaredMethod = cls.getDeclaredMethod("create", InterfaceC1470080oMI.class, Context.class);
                        declaredMethod.setAccessible(true);
                        c1470420oMq.LIZ = (AbstractC1470440oMs) declaredMethod.invoke(cls, c1470420oMq, context);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        th.toString();
                    }
                    if (c1470420oMq.LIZ == null) {
                        try {
                            Class<?> cls2 = Class.forName("com.ss.ttmplayer.player.TTPlayerClient");
                            Method declaredMethod2 = cls2.getDeclaredMethod("create", InterfaceC1470080oMI.class, Context.class);
                            declaredMethod2.setAccessible(true);
                            c1470420oMq.LIZ = (AbstractC1470440oMs) declaredMethod2.invoke(cls2, c1470420oMq, context);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            th2.toString();
                        }
                    }
                }
                if (c1470420oMq.LIZ == null) {
                    c1470420oMq.LIZ = C20547315ah.LJJIIZ(c1470420oMq);
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        this.LIZIZ = c1470420oMq;
        c1470420oMq.LIZJ(36, 1);
        if (Build.VERSION.SDK_INT > 23) {
            if (this.LIZJ == null) {
                this.LIZJ = new Object() { // from class: X.0oMu
                };
            }
            getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add("vivo X9");
            arrayList.add("VCE-AL00");
            arrayList.add("vivo Y79");
            arrayList.add("vivo X9s Plus");
            arrayList.add("OD1050");
            arrayList.add("vivo X21");
            arrayList.add("vivo X9s Plus L");
            arrayList.add("HUAWEI CAZ-AL10");
            arrayList.add("OPPO R9sk");
            arrayList.add("OPPO R11");
            arrayList.add("vivo X21A");
            arrayList.add("OPPO R9s");
            if (!arrayList.contains(Build.MODEL)) {
                this.LIZIZ.LIZJ(59, 1);
            }
        }
        this.LIZIZ.setOnPreparedListener(this.LIZLLL);
        this.LIZIZ.setOnErrorListener(this.LJ);
        this.LIZIZ.setOnCompletionListener(this.LJFF);
        this.LIZIZ.setOnInfoListener(this.LJI);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        C1470420oMq c1470420oMq = this.LIZIZ;
        if (c1470420oMq != null) {
            return c1470420oMq.getCurrentPosition();
        }
        LynxLog.e("x-alpha-video", "player is null when getCurrentPosition");
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return C1470410oMp.class.getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        return new VideoInfo(this.LIZIZ.getVideoWidth(), this.LIZIZ.getVideoHeight(), this.LIZIZ.getDuration());
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        return this.LIZIZ.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(e3.f);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.pause();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        super.prepareAsync();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareAsync() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(e3.f);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.prepareAsync();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(e3.f);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.release();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(e3.f);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.reset();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(e3.f);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(e3.f);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.stop();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oMt] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oMk] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0oMl] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0oMm] */
    public C1470410oMp(Context context) {
        super(context);
        this.LIZLLL = new InterfaceC1470930oNf() { // from class: X.0oMt
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
            @Override // X.InterfaceC1470930oNf
            public final void LIZJ(InterfaceC1470080oMI interfaceC1470080oMI) {
                if (this.LIZ.preparedListener != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Prepare success with player : [");
                    sbLIZ.append(this.LIZ.LIZIZ);
                    sbLIZ.append(e3.f);
                    LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
                    C1470410oMp c1470410oMp = this.LIZ;
                    c1470410oMp.preparedListener.onPrepared(c1470410oMp.self);
                }
            }
        };
        this.LJ = new InterfaceC1470910oNd() { // from class: X.0oMk
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
            @Override // X.InterfaceC1470910oNd
            public final boolean LIZLLL(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2) {
                C1470410oMp c1470410oMp = this.LIZ;
                IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c1470410oMp.errorListener;
                if (onErrorListener != 0) {
                    onErrorListener.onError(c1470410oMp.self, i, i2, "TTMediaPlayer on error");
                    return false;
                }
                return false;
            }
        };
        this.LJFF = new InterfaceC1470900oNc() { // from class: X.0oMl
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
            @Override // X.InterfaceC1470900oNc
            public final void LIZ(InterfaceC1470080oMI interfaceC1470080oMI) {
                C1470410oMp c1470410oMp = this.LIZ;
                IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c1470410oMp.completionListener;
                if (onCompletionListener != 0) {
                    onCompletionListener.onCompletion(c1470410oMp.self);
                }
            }
        };
        this.LJI = new InterfaceC1470920oNe() { // from class: X.0oMm
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
            @Override // X.InterfaceC1470920oNe
            public final boolean LIZIZ(InterfaceC1470080oMI interfaceC1470080oMI, int i, int i2) {
                C1470410oMp c1470410oMp;
                IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener;
                if (i == 3 && (onFirstFrameListener = (c1470410oMp = this.LIZ).firstFrameListener) != 0) {
                    onFirstFrameListener.onFirstFrame(c1470410oMp.self);
                    return false;
                }
                return false;
            }
        };
        this.LIZ = context;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void seekTo(int i) {
        super.seekTo(i);
        C1470420oMq c1470420oMq = this.LIZIZ;
        if (c1470420oMq != null) {
            c1470420oMq.seekTo(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        super.setDataSource(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDataSource() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(e3.f);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ.isPlaying()) {
            this.LIZIZ.stop();
        }
        this.LIZIZ.reset();
        this.LIZIZ.LJIIIIZZ(this.LIZ, UriProtector.parse(str));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLooping(");
        sbLIZ.append(z);
        sbLIZ.append(") called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(e3.f);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.setLooping(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
        super.setScreenOnWhilePlaying(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setScreenOnWhilePlaying(");
        sbLIZ.append(z);
        sbLIZ.append(") called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(e3.f);
        LynxLog.i("x-alpha-video", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        this.LIZIZ.setSurface(surface);
    }
}
