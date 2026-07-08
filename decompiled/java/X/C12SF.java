package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12SF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C12SF extends C05YF {
    public static final C19758812Sk LJJJJIZL = new Object() { // from class: X.12Sk
    };

    void Cr2();

    void Di(InterfaceC352140DrI interfaceC352140DrI);

    void Io2();

    InterfaceC1446740nke JY0();

    @InterfaceC1294060jmO
    void K20(AudioRecorderParam audioRecorderParam);

    void LLJJJJ();

    void Mo(InterfaceC352140DrI interfaceC352140DrI);

    void Np1(InterfaceC352140DrI interfaceC352140DrI);

    void Nu2(C0EZA c0eza);

    void RD2(boolean z, int i, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function1);

    void Rt(boolean z, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function1);

    void TI0(AudioRecorderParam audioRecorderParam, AudioRecorderParam audioRecorderParam2, InterfaceC352140DrI interfaceC352140DrI);

    void VO0(InterfaceC2218151Brh interfaceC2218151Brh);

    void Vu0(String str);

    void Wj(boolean z);

    boolean Zo();

    void a42(boolean z);

    void gb2(Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Cert cert);

    boolean isPlaying();

    boolean isRecording();

    void rr1(Cert cert, Function0<Unit> function0);

    AudioRecorderParam s61();

    void tQ1(boolean z, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Function2<? super AudioRecorderParam, ? super AudioRecorderParam, Unit> function2);

    void uT(String str);

    void v6(boolean z);

    void vG(Function0<Unit> function0);

    boolean xo0();

    AudioRecorderParam xq();

    void yt2();

    @InterfaceC1294060jmO
    void zp(float f, float f2);
}
