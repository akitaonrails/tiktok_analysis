package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E60, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E60 {
    public static final /* synthetic */ int LJI = 0;
    public final C0E48 LIZIZ;
    public final C358490E3r LIZJ;
    public long LJ;
    public NLETrackSlot LJFF;
    public String LIZ = "";
    public String LIZLLL = "";

    public final void LIZ() {
        C0E55 player;
        C350870DpF.LJIIIZ(this.LIZIZ, "set_Track_active", new C358830E4z());
        C0E48 c0e48 = this.LIZIZ;
        if (c0e48 == null || (player = c0e48.getPlayer()) == null) {
            return;
        }
        player.setActive(false);
    }

    public C0E60(C0E48 c0e48) {
        this.LIZIZ = c0e48;
        this.LIZJ = new C358490E3r(c0e48);
    }

    public static void LIZJ(boolean z) {
        InterfaceC361710EGb previewPanelApi;
        IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
        if (iPreviewServiceLIZ != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null) {
            if (z) {
                previewPanelApi.mi1(false, AFwS191S0000000_5.get$arr$(354));
            } else {
                previewPanelApi.XF1(true);
            }
        }
    }

    public final void LIZIZ(AbstractC356490DyJ abstractC356490DyJ, boolean z) {
        abstractC356490DyJ.LIZLLL();
        AwS406S0200000_5 awS406S0200000_5 = new AwS406S0200000_5(abstractC356490DyJ, this, 81);
        if (z) {
            C0E69.LIZ(this.LIZIZ, true, false, 16L, new AwS549S0100000_5(new AwS549S0100000_5(awS406S0200000_5, 815), 813), 4);
        } else {
            awS406S0200000_5.invoke();
        }
    }
}
