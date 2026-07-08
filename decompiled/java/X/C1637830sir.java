package X;

import com.ss.android.ugc.gamora.recorder.sticker.popup.RecordStickerPanelPopupScreenScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@InterfaceC20647615qs("disturbing_sticker_warning_popup")
public final class C1637830sir extends AbstractC20660815t0 {
    public static long LLILLJJLI;
    public static final /* synthetic */ int LLILLL = 0;
    public final Function1<C20656615sK, Unit> LL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public C1637830sir(RecordStickerPanelPopupScreenScene recordStickerPanelPopupScreenScene, Function1 function1) {
        super(recordStickerPanelPopupScreenScene);
        this.LL = function1;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        this.LL.invoke(c20656615sK);
    }
}
