package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EGC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0EGC {
    void T0();

    void U0();

    void V0(C357920E1m c357920E1m, VideoPublishEditModel videoPublishEditModel);

    void W0(C0EM3 c0em3);

    NLETrackSlot X0(AVMusic aVMusic, String str, long j, long j2, boolean z, EnumC356070Dxd enumC356070Dxd, boolean z2, boolean z3);

    void Y0(NLETrackSlot nLETrackSlot, boolean z, boolean z2);

    void Z0(C0EGP c0egp, C0EC6 c0ec6, AVMusic aVMusic, boolean z, Integer num);

    boolean a1();

    boolean b1();

    void c1(boolean z, boolean z2, boolean z3);

    void d1(AVMusic aVMusic, String str, String str2, boolean z, Long l, Integer num, Function0<Unit> function0, Function1<? super NLETrackSlot, Unit> function1);

    void e1(AVMusic aVMusic, boolean z, boolean z2, boolean z3, C0EM5 c0em5);

    void f1(C0EL0 c0el0);

    void g1();

    void h1(AwS549S0100000_5 awS549S0100000_5);

    void i1(AVMusic aVMusic, boolean z);

    void onDestroy();
}
