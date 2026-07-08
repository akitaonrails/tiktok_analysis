package Y;

import X.C0CHQ;
import X.C1403010mc7;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.InterfaceC1416880myU;
import android.app.Application;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.tools.draft.music.DraftStreamMusicProcessor;
import java.util.concurrent.Callable;
import kotlin.Unit;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS89S0400000_8 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0Mb0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS89S0400000_8 r14) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS89S0400000_8.call$0(Y.ACallableS89S0400000_8):java.lang.Object");
    }

    public static final Object call$1(ACallableS89S0400000_8 aCallableS89S0400000_8) {
        C1C7U.LIZ("DraftStreamMusicProcessor@cca2.musicHandler$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draft_stream_music_process, music file: ");
        sbLIZ.append(((AwemeDraft) aCallableS89S0400000_8.l0).LJII);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C201955140j.LIZ("draft_stream_music_process, music file not exist, begin fetch music detail");
        DraftStreamMusicProcessor draftStreamMusicProcessor = (DraftStreamMusicProcessor) aCallableS89S0400000_8.l1;
        String musicId = ((AVMusic) aCallableS89S0400000_8.l2).getMusicId();
        draftStreamMusicProcessor.getClass();
        AVMusic aVMusicVk = o.LJI.Vk(musicId);
        if (aVMusicVk != null) {
            ((DraftStreamMusicProcessor) aCallableS89S0400000_8.l1).getClass();
            if (C1403010mc7.LIZ.getMusicService().LJFF(aVMusicVk, C0CHQ.LIZ)) {
                C201955140j.LIZ("draft_stream_music_process, music valid, begin download");
                AVMusic aVMusic = (AVMusic) aCallableS89S0400000_8.l2;
                if (aVMusic.ignoreReuseAudio) {
                    aVMusic.musicType = aVMusicVk.musicType;
                    aVMusic.reuseAudioPlayUrl = aVMusicVk.reuseAudioPlayUrl;
                    aVMusic.setDuration(aVMusicVk.getDuration());
                    ((AVMusic) aCallableS89S0400000_8.l2).setShootDuration(aVMusicVk.getShootDuration());
                    ((AVMusic) aCallableS89S0400000_8.l2).path = aVMusicVk.path;
                } else {
                    int i = aVMusic.musicType;
                    if (i == 2) {
                        aVMusicVk.musicType = i;
                        aVMusicVk.reuseAudioPlayUrl = aVMusic.reuseAudioPlayUrl;
                        aVMusicVk.setDuration(aVMusic.getDuration());
                        aVMusicVk.setShootDuration(((AVMusic) aCallableS89S0400000_8.l2).getShootDuration());
                    }
                }
                IAnotherMusicService musicService = C1403010mc7.LIZ.getMusicService();
                Application application = C0CHQ.LIZ;
                final AwemeDraft awemeDraft = (AwemeDraft) aCallableS89S0400000_8.l0;
                final DraftStreamMusicProcessor draftStreamMusicProcessor2 = (DraftStreamMusicProcessor) aCallableS89S0400000_8.l1;
                final v7.o oVar = (v7.o) aCallableS89S0400000_8.l3;
                musicService.LJ("draft_stream", application, aVMusicVk, 0, true, new InterfaceC1416880myU() { // from class: X.0Mb1
                    @Override // X.InterfaceC1416880myU
                    public final void LIZJ(boolean z) {
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void onProgress(int i2) {
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void LIZ(Integer num, String str) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("draft_stream_music_process, music download fail, errorCode: ");
                        sbLIZ2.append(num);
                        sbLIZ2.append(", errorMsg: ");
                        sbLIZ2.append(str);
                        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                        draftStreamMusicProcessor2.LLILLL = false;
                        oVar.LIZJ(null);
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                        AwemeDraft awemeDraft2 = awemeDraft;
                        awemeDraft2.LJII = str;
                        if (musicWaveBean != null) {
                            AVMusic aVMusic2 = awemeDraft2.LJ;
                            if (aVMusic2 != null) {
                                aVMusic2.setMusicWaveData(musicWaveBean.getMusicWavePointArray());
                            }
                            MusicBuzModel musicBuzModel = awemeDraft2.LIZ.musicBuzModel;
                            float[] musicWavePointArray = musicWaveBean.getMusicWavePointArray();
                            Float[] fArr = new Float[musicWavePointArray.length];
                            int length = musicWavePointArray.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                fArr[i2] = Float.valueOf(musicWavePointArray[i2]);
                            }
                            musicBuzModel.musicWaveData = fArr;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("draft_stream_music_process, music download success, music file: ");
                        sbLIZ2.append(str);
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        draftStreamMusicProcessor2.LLILLL = true;
                        oVar.LIZJ(null);
                    }
                }, false);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DraftStreamMusicProcessor@cca2.musicHandler$1");
                return unit;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("draft_stream_music_process, not a valid music, id: ");
            sbLIZ2.append(((AVMusic) aCallableS89S0400000_8.l2).getMusicId());
            sbLIZ2.append(", can't download music");
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            C201955140j.LJ("draft_stream_music_process, new music model is null, can't download music");
        }
        ((DraftStreamMusicProcessor) aCallableS89S0400000_8.l1).LLILLL = false;
        ((v7.o) aCallableS89S0400000_8.l3).LIZJ(null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftStreamMusicProcessor@cca2.musicHandler$1");
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS89S0400000_8(Object obj, AwemeDraft awemeDraft, DraftStreamMusicProcessor draftStreamMusicProcessor, AVMusic aVMusic, v7.o<Unit> oVar) {
        this.$t = oVar;
        this.l0 = obj;
        this.l1 = awemeDraft;
        this.l2 = draftStreamMusicProcessor;
        this.l3 = aVMusic;
    }
}
