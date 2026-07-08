package X;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import java.io.IOException;

/* JADX INFO: renamed from: X.1CxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247221CxU extends AbsPlayer<C2247221CxU> {
    public MediaPlayer LIZ;
    public String LIZIZ;
    public C2247041CxC LIZLLL;
    public boolean LJ;
    public final MediaMetadataRetriever LIZJ = new MediaMetadataRetriever();
    public final C2247151CxN LJFF = new MediaPlayer.OnCompletionListener() { // from class: X.1CxN
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
        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            C2247221CxU c2247221CxU = this.LL;
            IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c2247221CxU.completionListener;
            if (onCompletionListener != 0) {
                onCompletionListener.onCompletion(c2247221CxU.self);
            } else {
                C20441214yg.LJ("DefaultSystemPlayerKt", "system player onCompletion but completionListener is null");
            }
        }
    };
    public final C2247161CxO LJI = new MediaPlayer.OnPreparedListener() { // from class: X.1CxO
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
        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            C2247221CxU c2247221CxU = this.LL;
            IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = c2247221CxU.preparedListener;
            if (onPreparedListener != 0) {
                onPreparedListener.onPrepared(c2247221CxU.self);
            } else {
                C20441214yg.LJ("DefaultSystemPlayerKt", "system player onPrepared but preparedListener is null");
            }
        }
    };
    public final C2247011Cx9 LJII = new MediaPlayer.OnErrorListener() { // from class: X.1Cx9
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
        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            boolean z;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("system player onError, what=");
            sbLIZ.append(i);
            sbLIZ.append(", extra=");
            sbLIZ.append(i2);
            sbLIZ.append(", hasListener=");
            if (this.LL.errorListener != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C20441214yg.LJ("DefaultSystemPlayerKt", C2188811AlT.LIZIZ(sbLIZ));
            C2247221CxU c2247221CxU = this.LL;
            IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c2247221CxU.errorListener;
            if (onErrorListener != 0) {
                onErrorListener.onError(c2247221CxU.self, i, i2, "");
            }
            return false;
        }
    };
    public final C2247171CxP LJIIIIZZ = new MediaPlayer.OnInfoListener() { // from class: X.1CxP
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
        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i == 3) {
                if (this.LL.firstFrameListener != null) {
                    C20441214yg.LJIIIZ("DefaultSystemPlayerKt", "system player firstFrame");
                    C2247221CxU c2247221CxU = this.LL;
                    c2247221CxU.firstFrameListener.onFirstFrame(c2247221CxU.self);
                    return false;
                }
                C20441214yg.LJ("DefaultSystemPlayerKt", "system player firstFrame but firstFrameListener is null");
                return false;
            }
            return false;
        }
    };

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return "DefaultSystemPlayerKt";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() throws Exception {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            throw new Exception("dataSource is null, please set setDataSource firstly");
        }
        C2247041CxC c2247041CxC = this.LIZLLL;
        if (c2247041CxC != null) {
            return c2247041CxC;
        }
        MediaPlayer mediaPlayer = this.LIZ;
        int videoWidth = mediaPlayer != null ? mediaPlayer.getVideoWidth() : 0;
        MediaPlayer mediaPlayer2 = this.LIZ;
        int videoHeight = mediaPlayer2 != null ? mediaPlayer2.getVideoHeight() : 0;
        MediaPlayer mediaPlayer3 = this.LIZ;
        C2247041CxC c2247041CxC2 = new C2247041CxC(videoWidth, videoHeight, mediaPlayer3 != null ? mediaPlayer3.getDuration() : 0);
        this.LIZLLL = c2247041CxC2;
        return c2247041CxC2;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.LIZ = mediaPlayer2;
        mediaPlayer2.setOnCompletionListener(this.LJFF);
        MediaPlayer mediaPlayer3 = this.LIZ;
        if (mediaPlayer3 != null) {
            mediaPlayer3.setOnPreparedListener(this.LJI);
        }
        MediaPlayer mediaPlayer4 = this.LIZ;
        if (mediaPlayer4 != null) {
            mediaPlayer4.setOnErrorListener(this.LJII);
        }
        MediaPlayer mediaPlayer5 = this.LIZ;
        if (mediaPlayer5 != null) {
            mediaPlayer5.setOnInfoListener(this.LJIIIIZZ);
        }
        if (!this.LJ || (mediaPlayer = this.LIZ) == null) {
            return;
        }
        mediaPlayer.setVolume(0.0f, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        this.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void seekTo(int i) {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                mediaPlayer.seekTo(i, 3);
            } else {
                mediaPlayer.seekTo(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) throws IOException {
        this.LIZIZ = str;
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.setDataSource(str);
        }
        MediaMetadataRetriever mediaMetadataRetriever = this.LIZJ;
        if (mediaMetadataRetriever != null) {
            mediaMetadataRetriever.setDataSource(str);
        }
        this.LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.setScreenOnWhilePlaying(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }
}
