package X;

import android.content.Context;
import android.view.Surface;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0oMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470090oMJ extends AbsPlayer<C1470090oMJ> {
    public final Context LIZ;
    public InterfaceC1470080oMI LIZIZ;
    public final C1470310oMf LIZJ;
    public final C1470340oMi LIZLLL;
    public final C1470320oMg LJ;
    public final C1470350oMj LJFF;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        return this.LIZIZ.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return InterfaceC1470080oMI.class.getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        return new VideoInfo(this.LIZIZ.getVideoWidth(), this.LIZIZ.getVideoHeight(), this.LIZIZ.getDuration());
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() throws Exception {
        try {
            Class<?> cls = Class.forName("com.ss.ttm.player.x");
            Method method = cls.getMethod("setValue", Integer.TYPE, Boolean.TYPE);
            int iIntValue = ((Integer) cls.getField("KEY_IS_IPTTPLAYER_ON").get(0)).intValue();
            int iIntValue2 = ((Integer) cls.getField("KEY_IS_TTPLAYER_ON").get(0)).intValue();
            int iIntValue3 = ((Integer) cls.getField("KEY_IS_FORBID_CREATED_OS_PLAYER").get(0)).intValue();
            Boolean bool = Boolean.TRUE;
            method.invoke("", Integer.valueOf(iIntValue), bool);
            method.invoke("", Integer.valueOf(iIntValue2), bool);
            method.invoke("", Integer.valueOf(iIntValue3), bool);
            Object objInvoke = Class.forName("com.ss.ttm.player.u").getMethod("create", Context.class).invoke("", this.LIZ);
            if (objInvoke instanceof InterfaceC1470080oMI) {
                InterfaceC1470080oMI interfaceC1470080oMI = (InterfaceC1470080oMI) objInvoke;
                if (interfaceC1470080oMI != null && !interfaceC1470080oMI.LJFF()) {
                    this.LIZIZ = interfaceC1470080oMI;
                    interfaceC1470080oMI.LIZJ(36, 1);
                    this.LIZIZ.setOnPreparedListener(this.LIZJ);
                    this.LIZIZ.setOnErrorListener(this.LIZLLL);
                    this.LIZIZ.setOnCompletionListener(this.LJ);
                    this.LIZIZ.setOnInfoListener(this.LJFF);
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        throw new Exception("create ttplayer failure");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        return this.LIZIZ.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        this.LIZIZ.pause();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        this.LIZIZ.release();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        this.LIZIZ.reset();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        this.LIZIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        this.LIZIZ.stop();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        super.prepareAsync();
        this.LIZIZ.prepareAsync();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oMf] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oMi] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0oMg] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0oMj] */
    public C1470090oMJ(Context context) {
        super(context);
        this.LIZJ = new InterfaceC1470930oNf() { // from class: X.0oMf
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
                C1470090oMJ c1470090oMJ = this.LIZ;
                IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = c1470090oMJ.preparedListener;
                if (onPreparedListener != 0) {
                    onPreparedListener.onPrepared(c1470090oMJ.self);
                }
            }
        };
        this.LIZLLL = new InterfaceC1470910oNd() { // from class: X.0oMi
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
                C1470090oMJ c1470090oMJ = this.LIZ;
                IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c1470090oMJ.errorListener;
                if (onErrorListener != 0) {
                    onErrorListener.onError(c1470090oMJ.self, i, i2, "TTMediaPlayer on error");
                    return false;
                }
                return false;
            }
        };
        this.LJ = new InterfaceC1470900oNc() { // from class: X.0oMg
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
                C1470090oMJ c1470090oMJ = this.LIZ;
                IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c1470090oMJ.completionListener;
                if (onCompletionListener != 0) {
                    onCompletionListener.onCompletion(c1470090oMJ.self);
                }
            }
        };
        this.LJFF = new InterfaceC1470920oNe() { // from class: X.0oMj
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
                C1470090oMJ c1470090oMJ;
                IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener;
                if (i == 3 && (onFirstFrameListener = (c1470090oMJ = this.LIZ).firstFrameListener) != 0) {
                    onFirstFrameListener.onFirstFrame(c1470090oMJ.self);
                    return false;
                }
                return false;
            }
        };
        this.LIZ = context;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void seekTo(int i) {
        this.LIZIZ.seekTo(i);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        super.setDataSource(str);
        if (this.LIZIZ.isPlaying()) {
            this.LIZIZ.stop();
        }
        this.LIZIZ.reset();
        this.LIZIZ.LJIIIIZZ(this.LIZ, UriProtector.parse(str));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        this.LIZIZ.setLooping(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
        super.setScreenOnWhilePlaying(z);
        this.LIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        this.LIZIZ.setSurface(surface);
    }
}
