package X;

import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoExternalVideoSei;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.bytertc.engine.avclient.LyraxAVAudioPlayer;
import com.ss.bytertc.engine.avclient.LyraxAVAudioSource;
import java.nio.ByteBuffer;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0jzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1302070jzJ {
    boolean LIZ(boolean z);

    boolean LIZIZ();

    boolean LJFF();

    void LJI(Message message);

    C05YD<Boolean> LJII();

    void LJIIJ(int i, String str);

    boolean LJIIJJI(EnumC1284940jXg enumC1284940jXg);

    boolean LJIILIIL(String str);

    boolean LJIIZILJ(String str);

    void LJJ(LyraxAVAudioPlayer lyraxAVAudioPlayer);

    boolean LJJIFFI();

    int LJJIIJ(ByteBuffer byteBuffer, int i, int i2, long j, int i3, TakoExternalVideoSei takoExternalVideoSei);

    Object LJJIIZI(InterfaceC497601wk interfaceC497601wk, C1279700jPE c1279700jPE, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    LyraxAVAudioPlayer createAudioPlayer(LyraxAVAudioSource lyraxAVAudioSource);

    void destroyClient();

    boolean sendUserMessage(String str, String str2);

    boolean startAudioCapture();

    boolean stopAudioCapture();
}
