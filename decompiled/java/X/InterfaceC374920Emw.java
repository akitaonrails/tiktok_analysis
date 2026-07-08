package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Emw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC374920Emw extends C05YF {
    long Jh();

    NLEEditor LF2();

    void ba(long j, INLEListenerSeek iNLEListenerSeek);

    INLEMediaSession fD1();

    void gP(INLEMediaSession iNLEMediaSession, String str, long j);

    @InterfaceC1294060jmO
    void ib1();

    INLEMediaSession jk0();

    void lY0(INLEMediaSession iNLEMediaSession, String str, long j, Function0<Unit> function0);

    void mS0(C0FDF c0fdf);

    void pause();

    void play();

    void prepare();

    long qq();

    void release();

    void resume();

    void skipNextSeek(boolean z);
}
