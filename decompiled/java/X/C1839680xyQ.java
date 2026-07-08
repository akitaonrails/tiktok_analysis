package X;

import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;

/* JADX INFO: renamed from: X.0xyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839680xyQ implements InterfaceC1839510xy9 {
    public final /* synthetic */ InterfaceC1839690xyR LL;

    public C1839680xyQ(InterfaceC1839690xyR interfaceC1839690xyR) {
        this.LL = interfaceC1839690xyR;
    }

    @Override // X.InterfaceC1839510xy9
    public final void LIZIZ(boolean z) {
        InterfaceC1839690xyR interfaceC1839690xyR = this.LL;
        C1839660xyO.Companion.getClass();
        interfaceC1839690xyR.LIZ(C1839660xyO.EFFECT_DOWNLOAD_FAILED);
    }

    @Override // X.InterfaceC1839510xy9
    public final void LIZ(BoardTextFontStyleData boardTextFontStyleData, boolean z) {
        this.LL.onSuccess();
    }
}
