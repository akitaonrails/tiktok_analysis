package X;

import android.content.Context;
import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.a4;
import fyo.e;

/* JADX INFO: renamed from: X.0oMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470400oMo extends AbsPlayer<C1470400oMo> {
    public final String LIZ;
    public TTVideoEngine LIZIZ;
    public final C1470390oMn LIZJ;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJIL();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        C20441214yg.LJIIIZ(this.LIZ, "initMediaPlayer() called");
        TTVideoEngine tTVideoEngine = new TTVideoEngine(this.context, 0);
        this.LIZIZ = tTVideoEngine;
        tTVideoEngine.LIZJ(160, 1);
        TTVideoEngine tTVideoEngine2 = this.LIZIZ;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LIZJ(21, 1);
        }
        TTVideoEngine tTVideoEngine3 = this.LIZIZ;
        if (tTVideoEngine3 != null) {
            tTVideoEngine3.LLI(this.LIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        return tTVideoEngine != null && tTVideoEngine.LJJLIIIJILLIZJL() == 1;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.pause();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0oMo for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        /*
            r3 = this;
            java.lang.String r2 = r3.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "prepareAsync() called with player : ["
            r1.append(r0)
            com.ss.ttvideoengine.TTVideoEngine r0 = r3.LIZIZ
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r2, r0)
            com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer$OnPreparedListener<com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer<T extends com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer>> r0 = r3.preparedListener
            r0.onPrepared(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1470400oMo.prepareAsync():void");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.play();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return this.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oMn] */
    public C1470400oMo(Context context) {
        super(context);
        this.LIZ = "BgSoundsPlayer";
        this.LIZJ = new a4() { // from class: X.0oMn
            @Override // cxo.a4
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // cxo.a4
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
            }

            @Override // cxo.a4
            public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // cxo.a4
            public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // cxo.a4
            public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // cxo.a4
            public final void LJIJJLI(int i) {
            }

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
            @Override // cxo.a4
            public final void LJ(TTVideoEngine tTVideoEngine) {
                C1470400oMo c1470400oMo = this.LL;
                IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener = c1470400oMo.firstFrameListener;
                if (onFirstFrameListener != 0) {
                    onFirstFrameListener.onFirstFrame(c1470400oMo.self);
                }
            }

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
            @Override // cxo.a4
            public final void LJI(e eVar) {
                C1470400oMo c1470400oMo = this.LL;
                IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c1470400oMo.errorListener;
                if (onErrorListener != 0) {
                    onErrorListener.onError(c1470400oMo.self, eVar.LIZ, eVar.LIZIZ, eVar.LIZLLL);
                }
            }

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
            @Override // cxo.a4
            public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
                C1470400oMo c1470400oMo = this.LL;
                IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = c1470400oMo.preparedListener;
                if (onPreparedListener != 0) {
                    onPreparedListener.onPrepared(c1470400oMo.self);
                }
            }

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
            @Override // cxo.a4
            public final void LJIILL(TTVideoEngine tTVideoEngine) {
                String str = this.LL.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCompletion player : [");
                sbLIZ.append(this.LL.LIZIZ);
                sbLIZ.append(", ");
                sbLIZ.append(tTVideoEngine);
                sbLIZ.append(']');
                C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                C1470400oMo c1470400oMo = this.LL;
                IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c1470400oMo.completionListener;
                if (onCompletionListener != 0) {
                    onCompletionListener.onCompletion(c1470400oMo.self);
                }
            }
        };
        this.context = context;
        initMediaPlayer();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        String str2 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDataSource() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJIJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.setLooping(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurface() called with player : [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurface(surface);
        }
    }
}
