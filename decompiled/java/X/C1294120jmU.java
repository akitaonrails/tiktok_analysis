package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.a4;
import fyo.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294120jmU extends FrameLayout {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public PlayerController LL;

    public C1294120jmU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        PlayerController playerController = this.LL;
        if (playerController != null) {
            playerController.detachAlphaView(this);
        }
        PlayerController playerController2 = this.LL;
        if (playerController2 != null) {
            playerController2.release();
        }
    }

    public final void LIZLLL() {
        PlayerController playerController = this.LL;
        if (playerController != null) {
            playerController.cancel();
        }
    }

    public final void setFirstFrameListener(final Function0<Unit> function0) {
        final PlayerController playerController = this.LL;
        if ((playerController instanceof PlayerController) && playerController != null) {
            playerController.setFirstGLFrameListener(new InterfaceC2247121CxK() { // from class: X.0jmV
                @Override // X.InterfaceC2247121CxK
                public final void LIZ() {
                    function0.invoke();
                    playerController.setFirstGLFrameListener(new InterfaceC2247121CxK() { // from class: X.0jmW
                        @Override // X.InterfaceC2247121CxK
                        public final void LIZ() {
                        }
                    });
                }
            });
        }
    }

    public final void LIZJ(DataSource dataSource, boolean z) {
        PlayerController playerController = this.LL;
        if (playerController != null) {
            playerController.startWithLastFrameHold(dataSource, z);
        }
    }

    public C1294120jmU(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final void LIZ(final Context context, LifecycleOwner lifecycleOwner, AlphaPlayerAction alphaPlayerAction, boolean z) {
        int i;
        IMediaPlayer c1470090oMJ;
        PlayerController playerController = this.LL;
        if (playerController != null) {
            playerController.detachAlphaView(this);
        }
        PlayerController playerController2 = this.LL;
        if (playerController2 != null) {
            playerController2.release();
        }
        Configuration configuration = new Configuration();
        configuration.setContext(context);
        configuration.setLifecycleOwner(lifecycleOwner);
        configuration.setAlphaVideoViewType(1);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        configuration.useVideoRendererVersion(i);
        try {
            if (((Number) C7887036f.LIZ.getValue()).intValue() == 0) {
                c1470090oMJ = new AbsPlayer<C1470300oMe>(context) { // from class: X.0oMe
                    public TTVideoEngine LIZ;
                    public String LIZIZ = "";
                    public final C1470330oMh LIZJ = new a4() { // from class: X.0oMh
                        @Override // cxo.a4
                        public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
                        }

                        @Override // cxo.a4
                        public final void LIZJ(TTVideoEngine tTVideoEngine, int i2) {
                        }

                        @Override // cxo.a4
                        public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
                        }

                        @Override // cxo.a4
                        public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
                        }

                        @Override // cxo.a4
                        public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i2, int i3) {
                        }

                        @Override // cxo.a4
                        public final void LJIIL(TTVideoEngine tTVideoEngine, int i2) {
                        }

                        @Override // cxo.a4
                        public final void LJIJ(TTVideoEngine tTVideoEngine, int i2) {
                        }

                        @Override // cxo.a4
                        public final void LJIJI(TTVideoEngine tTVideoEngine, int i2) {
                        }

                        @Override // cxo.a4
                        public final void LJIJJLI(int i2) {
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
                            C1470300oMe c1470300oMe = this.LL;
                            IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener = c1470300oMe.firstFrameListener;
                            if (onFirstFrameListener != 0) {
                                onFirstFrameListener.onFirstFrame(c1470300oMe.self);
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
                            C1470300oMe c1470300oMe = this.LL;
                            IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c1470300oMe.errorListener;
                            if (onErrorListener != 0) {
                                onErrorListener.onError(c1470300oMe.self, eVar.LIZ, eVar.LIZIZ, eVar.LIZLLL);
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
                            C1470300oMe c1470300oMe = this.LL;
                            IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = c1470300oMe.preparedListener;
                            if (onPreparedListener != 0) {
                                onPreparedListener.onPrepared(c1470300oMe.self);
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
                            C1470300oMe c1470300oMe = this.LL;
                            IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c1470300oMe.completionListener;
                            if (onCompletionListener != 0) {
                                onCompletionListener.onCompletion(c1470300oMe.self);
                            }
                        }
                    };

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void reset() {
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void setScreenOnWhilePlaying(boolean z2) {
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final int getCurrentPosition() {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        if (tTVideoEngine != null) {
                            return tTVideoEngine.LJJJIL();
                        }
                        return 0;
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final VideoInfo getVideoInfo() {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        int iLJJLJ = tTVideoEngine != null ? tTVideoEngine.LJJLJ() : 0;
                        TTVideoEngine tTVideoEngine2 = this.LIZ;
                        int iLJJLIIIJLLLLLLLZ = tTVideoEngine2 != null ? tTVideoEngine2.LJJLIIIJLLLLLLLZ() : 0;
                        TTVideoEngine tTVideoEngine3 = this.LIZ;
                        return new VideoInfo(iLJJLJ, iLJJLIIIJLLLLLLLZ, tTVideoEngine3 != null ? tTVideoEngine3.LJJJJL() : 0);
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void initMediaPlayer() throws Exception {
                        TTVideoEngine tTVideoEngine = new TTVideoEngine(this.context, 0);
                        if (tTVideoEngine.LJLIIL()) {
                            throw new Exception("create ttVideoEngine failure");
                        }
                        tTVideoEngine.LIZJ(7, 0);
                        this.LIZIZ = "TTEnginePlayerImpl_SOFT";
                        tTVideoEngine.LIZJ(4, 1);
                        tTVideoEngine.LIZJ(216, 1);
                        tTVideoEngine.LIZJ(610, 0);
                        tTVideoEngine.LLI(this.LIZJ);
                        tTVideoEngine.LIZJ(581, 1);
                        this.LIZ = tTVideoEngine;
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final boolean isPlaying() {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        return tTVideoEngine != null && tTVideoEngine.LJJLIIIJILLIZJL() == 1;
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void pause() {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.pause();
                        }
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0oMe for r1v1 'this'  java.lang.Object
                        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                        */
                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void prepareAsync() {
                        /*
                            r1 = this;
                            com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer$OnPreparedListener<com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer<T extends com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer>> r0 = r1.preparedListener
                            r0.onPrepared(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1470300oMe.prepareAsync():void");
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void release() {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.release();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void start() {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.play();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void stop() {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.stop();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final String getPlayerSimpleName() {
                        return this.LIZIZ;
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void setDataSource(String str) {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.LJIJ(str);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void setLooping(boolean z2) {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.setLooping(z2);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
                    public final void setSurface(Surface surface) {
                        TTVideoEngine tTVideoEngine = this.LIZ;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.setSurface(surface);
                        }
                    }
                };
            } else {
                c1470090oMJ = new C1470090oMJ(context);
            }
            this.LL = PlayerController.get(configuration, c1470090oMJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL = PlayerController.get(configuration, new DefaultSystemPlayer());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("use DefaultSystemPlayer, error: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        PlayerController playerController3 = this.LL;
        if (playerController3 != null) {
            playerController3.withVideoAction(alphaPlayerAction);
        }
    }
}
