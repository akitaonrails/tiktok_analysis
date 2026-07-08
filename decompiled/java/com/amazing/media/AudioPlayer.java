package com.amazing.media;

import android.media.MediaPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes30.dex */
public class AudioPlayer {
    public MediaPlayer LIZ = new MediaPlayer();
    public final String LIZIZ;

    public void destroy() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.LIZ.release();
            this.LIZ = null;
        }
    }

    public boolean isPlaying() {
        return this.LIZ.isPlaying();
    }

    public void pause() {
        this.LIZ.pause();
    }

    public void play() {
        this.LIZ.reset();
        if (prepare()) {
            this.LIZ.start();
        }
    }

    public boolean prepare() {
        try {
            this.LIZ.setDataSource(this.LIZIZ);
            this.LIZ.setAudioStreamType(3);
            this.LIZ.prepare();
            return true;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public void resume() {
        this.LIZ.start();
    }

    public void stop() {
        this.LIZ.stop();
    }

    public AudioPlayer(String str) {
        this.LIZIZ = str;
    }

    public void setLoop(boolean z) {
        this.LIZ.setLooping(z);
    }
}
