package X;

import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452910nub implements INLEPurePlayer.INLEPurePlayerInfoListener {
    public final Function0<Boolean> LIZ;
    public final InterfaceC1452170ntP LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
    public final void onPlayEnd() {
        C01TT.LIZIZ(1500L, new AwS566S0100000_22(this, 831));
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
    public final void onFirstFrameRender() {
        INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onFirstFrameRender(this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
    public final void onPlayerPause() {
        INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayerPause(this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
    public final void onPrepared() {
        INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPrepared(this);
    }

    public C1452910nub(InterfaceC1452170ntP interfaceC1452170ntP, Function0 function0) {
        this.LIZ = function0;
        this.LIZIZ = interfaceC1452170ntP;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
    public final void onPlayTime(int i, long j) {
        INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayTime(this, i, j);
    }
}
