package X;

import android.text.Editable;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveDetailWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewLiveDetailSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragmentSheet;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0UsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewOnFocusChangeListenerC785970UsN implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) throws Throwable {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
            case 4:
                onFocusChange$4(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC785970UsN(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC785970UsN viewOnFocusChangeListenerC785970UsN, View view, boolean z) throws Throwable {
        LiveMode liveMode;
        LiveMode liveMode2;
        Boolean boolValueOf;
        LiveMode liveMode3;
        LiveMode liveMode4;
        String string;
        boolean z2;
        boolean z3 = false;
        Boolean boolValueOf2 = null;
        LiveEditText liveEditText = null;
        if (z) {
            PreviewLiveDetailWidget previewLiveDetailWidget = (PreviewLiveDetailWidget) viewOnFocusChangeListenerC785970UsN.l0;
            Editable editableLLLFZ = C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoXPrRM20YF4DTC149RpKzZ", null));
            if (editableLLLFZ != null) {
                if (editableLLLFZ.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            } else {
                boolValueOf = null;
            }
            boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf);
            previewLiveDetailWidget.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_title_click");
            c474500IjALIZ.LJIJJLI(previewLiveDetailWidget.dataChannel);
            DataChannel dataChannel = previewLiveDetailWidget.dataChannel;
            if (dataChannel == null || (liveMode3 = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            c474500IjALIZ.LJJII(C354201Zc.LIZ(liveMode3), "live_type");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zLJJIFFI)) ? 1 : 0), "is_customized");
            c474500IjALIZ.LIZ();
            ((PreviewLiveDetailWidget) viewOnFocusChangeListenerC785970UsN.l0).LLIZLLLIL = String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoXPrRM20YF4DTC149RpKzZ", null)));
            PreviewLiveDetailWidget previewLiveDetailWidget2 = (PreviewLiveDetailWidget) viewOnFocusChangeListenerC785970UsN.l0;
            previewLiveDetailWidget2.getClass();
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_title_click");
            c474500IjALIZ2.LJIJJLI(previewLiveDetailWidget2.dataChannel);
            c474500IjALIZ2.LJJII("outside", "position");
            DataChannel dataChannel2 = previewLiveDetailWidget2.dataChannel;
            if (dataChannel2 == null || (liveMode4 = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) == null) {
                liveMode4 = LiveMode.VIDEO;
            }
            c474500IjALIZ2.LJJII(C354201Zc.LIZ(liveMode4), "live_type");
            c474500IjALIZ2.LIZ();
            PreviewLiveDetailWidget previewLiveDetailWidget3 = (PreviewLiveDetailWidget) viewOnFocusChangeListenerC785970UsN.l0;
            LiveEditText liveEditText2 = previewLiveDetailWidget3.LLILZIL;
            if (liveEditText2 == null) {
                liveEditText2 = null;
            }
            Editable editableLLLFZ2 = C2204961BRm.LLLFZ(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoXPrRM20YF4DTC149RpKzZ", null));
            if (editableLLLFZ2 != null && (string = editableLLLFZ2.toString()) != null && string.length() > 0) {
                LiveEditText liveEditText3 = previewLiveDetailWidget3.LLILZIL;
                if (liveEditText3 != null) {
                    liveEditText = liveEditText3;
                }
                liveEditText.setText(string.substring(0, string.length() - 1));
                return;
            }
            return;
        }
        ((PreviewLiveDetailWidget) viewOnFocusChangeListenerC785970UsN.l0).H1(String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoXPrRM20YF4DTC149RpKzZ", null))));
        PreviewLiveDetailWidget previewLiveDetailWidget4 = (PreviewLiveDetailWidget) viewOnFocusChangeListenerC785970UsN.l0;
        boolean z4 = !Intrinsics.LJFF(previewLiveDetailWidget4.LLIZLLLIL, String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoXPrRM20YF4DTC149RpKzZ", null))));
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_takepage_title_submit");
        c474500IjALIZ3.LJIJJLI(previewLiveDetailWidget4.dataChannel);
        DataChannel dataChannel3 = previewLiveDetailWidget4.dataChannel;
        if (dataChannel3 == null || (liveMode = (LiveMode) dataChannel3.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZ3.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZ3.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z4)) ? 1 : 0), "is_revised");
        c474500IjALIZ3.LIZ();
        Editable editableLLLFZ3 = C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoXPrRM20YF4DTC149RpKzZ", null));
        if (editableLLLFZ3 != null) {
            if (editableLLLFZ3.length() == 0) {
                z3 = true;
            }
            boolValueOf2 = Boolean.valueOf(z3);
        }
        if (!C500260Jjc.LJJIFFI(boolValueOf2)) {
            return;
        }
        PreviewLiveDetailWidget previewLiveDetailWidget5 = (PreviewLiveDetailWidget) viewOnFocusChangeListenerC785970UsN.l0;
        previewLiveDetailWidget5.getClass();
        C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_anchor_title_modify_over");
        c474500IjALIZ4.LJIJJLI(previewLiveDetailWidget5.dataChannel);
        DataChannel dataChannel4 = previewLiveDetailWidget5.dataChannel;
        if (dataChannel4 == null || (liveMode2 = (LiveMode) dataChannel4.gg0(LiveModeChannel.class)) == null) {
            liveMode2 = LiveMode.VIDEO;
        }
        c474500IjALIZ4.LJJII(C354201Zc.LIZ(liveMode2), "live_type");
        c474500IjALIZ4.LJJII("outside", "position");
        c474500IjALIZ4.LIZ();
    }

    public static final void onFocusChange$1(ViewOnFocusChangeListenerC785970UsN viewOnFocusChangeListenerC785970UsN, View view, boolean z) throws Throwable {
        LiveMode liveMode;
        LiveMode liveMode2;
        Boolean boolValueOf;
        LiveMode liveMode3;
        LiveMode liveMode4;
        String string;
        boolean z2;
        boolean z3 = false;
        Boolean boolValueOf2 = null;
        LiveEditText liveEditText = null;
        if (z) {
            PreviewTitleWidget previewTitleWidget = (PreviewTitleWidget) viewOnFocusChangeListenerC785970UsN.l0;
            Editable editableLLLFZ = C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null));
            if (editableLLLFZ != null) {
                if (editableLLLFZ.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            } else {
                boolValueOf = null;
            }
            boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf);
            previewTitleWidget.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_title_click");
            c474500IjALIZ.LJIJJLI(previewTitleWidget.dataChannel);
            DataChannel dataChannel = previewTitleWidget.dataChannel;
            if (dataChannel == null || (liveMode3 = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            c474500IjALIZ.LJJII(C354201Zc.LIZ(liveMode3), "live_type");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zLJJIFFI)) ? 1 : 0), "is_customized");
            c474500IjALIZ.LIZ();
            ((PreviewTitleWidget) viewOnFocusChangeListenerC785970UsN.l0).LLIZ = String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null)));
            PreviewTitleWidget previewTitleWidget2 = (PreviewTitleWidget) viewOnFocusChangeListenerC785970UsN.l0;
            previewTitleWidget2.getClass();
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_title_click");
            c474500IjALIZ2.LJIJJLI(previewTitleWidget2.dataChannel);
            c474500IjALIZ2.LJJII("outside", "position");
            DataChannel dataChannel2 = previewTitleWidget2.dataChannel;
            if (dataChannel2 == null || (liveMode4 = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) == null) {
                liveMode4 = LiveMode.VIDEO;
            }
            c474500IjALIZ2.LJJII(C354201Zc.LIZ(liveMode4), "live_type");
            c474500IjALIZ2.LIZ();
            PreviewTitleWidget previewTitleWidget3 = (PreviewTitleWidget) viewOnFocusChangeListenerC785970UsN.l0;
            LiveEditText liveEditText2 = previewTitleWidget3.LLILZLL;
            if (liveEditText2 == null) {
                liveEditText2 = null;
            }
            Editable editableLLLFZ2 = C2204961BRm.LLLFZ(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null));
            if (editableLLLFZ2 != null && (string = editableLLLFZ2.toString()) != null && string.length() > 0) {
                LiveEditText liveEditText3 = previewTitleWidget3.LLILZLL;
                if (liveEditText3 != null) {
                    liveEditText = liveEditText3;
                }
                liveEditText.setText(string.substring(0, string.length() - 1));
                return;
            }
            return;
        }
        ((PreviewTitleWidget) viewOnFocusChangeListenerC785970UsN.l0).I1(String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null))));
        PreviewTitleWidget previewTitleWidget4 = (PreviewTitleWidget) viewOnFocusChangeListenerC785970UsN.l0;
        boolean z4 = !Intrinsics.LJFF(previewTitleWidget4.LLIZ, String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null))));
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_takepage_title_submit");
        c474500IjALIZ3.LJIJJLI(previewTitleWidget4.dataChannel);
        DataChannel dataChannel3 = previewTitleWidget4.dataChannel;
        if (dataChannel3 == null || (liveMode = (LiveMode) dataChannel3.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZ3.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZ3.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z4)) ? 1 : 0), "is_revised");
        c474500IjALIZ3.LIZ();
        Editable editableLLLFZ3 = C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null));
        if (editableLLLFZ3 != null) {
            if (editableLLLFZ3.length() == 0) {
                z3 = true;
            }
            boolValueOf2 = Boolean.valueOf(z3);
        }
        if (!C500260Jjc.LJJIFFI(boolValueOf2)) {
            return;
        }
        PreviewTitleWidget previewTitleWidget5 = (PreviewTitleWidget) viewOnFocusChangeListenerC785970UsN.l0;
        previewTitleWidget5.getClass();
        C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_anchor_title_modify_over");
        c474500IjALIZ4.LJIJJLI(previewTitleWidget5.dataChannel);
        DataChannel dataChannel4 = previewTitleWidget5.dataChannel;
        if (dataChannel4 == null || (liveMode2 = (LiveMode) dataChannel4.gg0(LiveModeChannel.class)) == null) {
            liveMode2 = LiveMode.VIDEO;
        }
        c474500IjALIZ4.LJJII(C354201Zc.LIZ(liveMode2), "live_type");
        c474500IjALIZ4.LJJII("outside", "position");
        c474500IjALIZ4.LIZ();
    }

    public static final void onFocusChange$2(ViewOnFocusChangeListenerC785970UsN viewOnFocusChangeListenerC785970UsN, View view, boolean z) throws Throwable {
        LiveMode liveMode;
        LiveMode liveMode2;
        Boolean boolValueOf;
        LiveMode liveMode3;
        LiveMode liveMode4;
        boolean z2 = false;
        Boolean boolValueOf2 = null;
        if (z) {
            PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet = (PreviewTitleCoverFragmentSheet) viewOnFocusChangeListenerC785970UsN.l0;
            Editable editableLLLFZ = C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2EptGjZhFZ", null));
            if (editableLLLFZ != null) {
                if (editableLLLFZ.length() == 0) {
                    z2 = true;
                }
                boolValueOf = Boolean.valueOf(z2);
            } else {
                boolValueOf = null;
            }
            boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf);
            previewTitleCoverFragmentSheet.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_title_click");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(previewTitleCoverFragmentSheet));
            DataChannel dataChannelLJ = C475510Ikn.LJ(previewTitleCoverFragmentSheet);
            if (dataChannelLJ == null || (liveMode3 = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            c474500IjALIZ.LJJII(C354201Zc.LIZ(liveMode3), "live_type");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zLJJIFFI)) ? 1 : 0), "is_customized");
            c474500IjALIZ.LIZ();
            ((PreviewTitleCoverFragmentSheet) viewOnFocusChangeListenerC785970UsN.l0).LLLF = String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2EptGjZhFZ", null)));
            PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet2 = (PreviewTitleCoverFragmentSheet) viewOnFocusChangeListenerC785970UsN.l0;
            previewTitleCoverFragmentSheet2.getClass();
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_title_click");
            c474500IjALIZ2.LJIJJLI(C475510Ikn.LJ(previewTitleCoverFragmentSheet2));
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(previewTitleCoverFragmentSheet2);
            if (dataChannelLJ2 == null || (liveMode4 = (LiveMode) dataChannelLJ2.gg0(LiveModeChannel.class)) == null) {
                liveMode4 = LiveMode.VIDEO;
            }
            c474500IjALIZ2.LJJII(C354201Zc.LIZ(liveMode4), "live_type");
            c474500IjALIZ2.LJJII("settings", "position");
            c474500IjALIZ2.LIZ();
            return;
        }
        ((PreviewTitleCoverFragmentSheet) viewOnFocusChangeListenerC785970UsN.l0).uS(String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2EptGjZhFZ", null))));
        PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet3 = (PreviewTitleCoverFragmentSheet) viewOnFocusChangeListenerC785970UsN.l0;
        boolean z3 = !Intrinsics.LJFF(previewTitleCoverFragmentSheet3.LLLF, String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2EptGjZhFZ", null))));
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_takepage_title_submit");
        c474500IjALIZ3.LJIJJLI(C475510Ikn.LJ(previewTitleCoverFragmentSheet3));
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(previewTitleCoverFragmentSheet3);
        if (dataChannelLJ3 == null || (liveMode = (LiveMode) dataChannelLJ3.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZ3.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZ3.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0), "is_revised");
        c474500IjALIZ3.LIZ();
        Editable editableLLLFZ2 = C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2EptGjZhFZ", null));
        if (editableLLLFZ2 != null) {
            if (editableLLLFZ2.length() == 0) {
                z2 = true;
            }
            boolValueOf2 = Boolean.valueOf(z2);
        }
        if (!C500260Jjc.LJJIFFI(boolValueOf2)) {
            return;
        }
        PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet4 = (PreviewTitleCoverFragmentSheet) viewOnFocusChangeListenerC785970UsN.l0;
        previewTitleCoverFragmentSheet4.getClass();
        C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_anchor_title_modify_over");
        c474500IjALIZ4.LJIJJLI(C475510Ikn.LJ(previewTitleCoverFragmentSheet4));
        DataChannel dataChannelLJ4 = C475510Ikn.LJ(previewTitleCoverFragmentSheet4);
        if (dataChannelLJ4 == null || (liveMode2 = (LiveMode) dataChannelLJ4.gg0(LiveModeChannel.class)) == null) {
            liveMode2 = LiveMode.VIDEO;
        }
        c474500IjALIZ4.LJJII(C354201Zc.LIZ(liveMode2), "live_type");
        c474500IjALIZ4.LJJII("setting", "position");
        c474500IjALIZ4.LIZ();
    }

    public static final void onFocusChange$3(ViewOnFocusChangeListenerC785970UsN viewOnFocusChangeListenerC785970UsN, View view, boolean z) throws Throwable {
        LiveMode liveMode;
        Editable editableLLLFZ;
        Boolean boolValueOf;
        LiveMode liveMode2;
        LiveMode liveMode3;
        Editable editableLLLFZ2;
        String string;
        LiveEditText liveEditText;
        boolean z2;
        if (z) {
            C20441214yg.LIZIZ("Simplify", "get focus");
            ((PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0).getClass();
            PreviewLiveDetailSheet previewLiveDetailSheet = (PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0;
            Editable editableLLLFZ3 = C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCqBTNZOxQEDp8F7nrSJv4g==", null));
            if (editableLLLFZ3 != null) {
                if (editableLLLFZ3.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            } else {
                boolValueOf = null;
            }
            boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf);
            previewLiveDetailSheet.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_title_click");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(previewLiveDetailSheet));
            DataChannel dataChannelLJ = C475510Ikn.LJ(previewLiveDetailSheet);
            if (dataChannelLJ == null || (liveMode2 = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) == null) {
                liveMode2 = LiveMode.VIDEO;
            }
            c474500IjALIZ.LJJII(C354201Zc.LIZ(liveMode2), "live_type");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zLJJIFFI)) ? 1 : 0), "is_customized");
            c474500IjALIZ.LIZ();
            ((PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0).LLLII = String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCqBTNZOxQEDp8F7nrSJv4g==", null)));
            PreviewLiveDetailSheet previewLiveDetailSheet2 = (PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0;
            previewLiveDetailSheet2.getClass();
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_title_click");
            c474500IjALIZ2.LJIJJLI(C475510Ikn.LJ(previewLiveDetailSheet2));
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(previewLiveDetailSheet2);
            if (dataChannelLJ2 == null || (liveMode3 = (LiveMode) dataChannelLJ2.gg0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            c474500IjALIZ2.LJJII(C354201Zc.LIZ(liveMode3), "live_type");
            c474500IjALIZ2.LJJII("live_detail", "position");
            c474500IjALIZ2.LIZ();
            PreviewLiveDetailSheet previewLiveDetailSheet3 = (PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0;
            LiveEditText liveEditText2 = previewLiveDetailSheet3.LLLFF;
            if (liveEditText2 != null && (editableLLLFZ2 = C2204961BRm.LLLFZ(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCqBTNZOxQEDp8F7nrSJv4g==", null))) != null && (string = editableLLLFZ2.toString()) != null && string.length() > 0 && (liveEditText = previewLiveDetailSheet3.LLLFF) != null) {
                liveEditText.setText(string.substring(0, string.length() - 1));
                return;
            }
            return;
        }
        C20441214yg.LIZIZ("Simplify", "lose focus");
        LiveEditText liveEditText3 = ((PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0).LLLFF;
        if (liveEditText3 != null && (editableLLLFZ = C2204961BRm.LLLFZ(liveEditText3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCqBTNZOxQEDp8F7nrSJv4g==", null))) != null && (!a0.LJJJIL(editableLLLFZ))) {
            ((PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0).getClass();
        }
        ((PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0).wS(String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCqBTNZOxQEDp8F7nrSJv4g==", null))));
        PreviewLiveDetailSheet previewLiveDetailSheet4 = (PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0;
        boolean z3 = !Intrinsics.LJFF(previewLiveDetailSheet4.LLLII, String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCqBTNZOxQEDp8F7nrSJv4g==", null))));
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_takepage_title_submit");
        c474500IjALIZ3.LJIJJLI(C475510Ikn.LJ(previewLiveDetailSheet4));
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(previewLiveDetailSheet4);
        if (dataChannelLJ3 == null || (liveMode = (LiveMode) dataChannelLJ3.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZ3.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZ3.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0), "is_revised");
        c474500IjALIZ3.LIZ();
        PreviewLiveDetailSheet previewLiveDetailSheet5 = (PreviewLiveDetailSheet) viewOnFocusChangeListenerC785970UsN.l0;
        LiveEditText liveEditText4 = previewLiveDetailSheet5.LLLFF;
        if (liveEditText4 == null) {
            return;
        }
        liveEditText4.clearFocus();
        KeyBoardUtil.LIZJ(previewLiveDetailSheet5.getContext(), liveEditText4);
    }

    public static final void onFocusChange$4(ViewOnFocusChangeListenerC785970UsN viewOnFocusChangeListenerC785970UsN, View view, boolean z) throws Throwable {
        LiveMode liveMode;
        LiveMode liveMode2;
        Boolean boolValueOf;
        LiveMode liveMode3;
        LiveMode liveMode4;
        boolean z2 = false;
        Boolean boolValueOf2 = null;
        if (z) {
            PreviewTitleCoverFragment previewTitleCoverFragment = (PreviewTitleCoverFragment) viewOnFocusChangeListenerC785970UsN.l0;
            Editable editableLLLFZ = C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2Epg==", null));
            if (editableLLLFZ != null) {
                if (editableLLLFZ.length() == 0) {
                    z2 = true;
                }
                boolValueOf = Boolean.valueOf(z2);
            } else {
                boolValueOf = null;
            }
            boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf);
            previewTitleCoverFragment.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_title_click");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(previewTitleCoverFragment));
            DataChannel dataChannelLJ = C475510Ikn.LJ(previewTitleCoverFragment);
            if (dataChannelLJ == null || (liveMode3 = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) == null) {
                liveMode3 = LiveMode.VIDEO;
            }
            c474500IjALIZ.LJJII(C354201Zc.LIZ(liveMode3), "live_type");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zLJJIFFI)) ? 1 : 0), "is_customized");
            c474500IjALIZ.LIZ();
            ((PreviewTitleCoverFragment) viewOnFocusChangeListenerC785970UsN.l0).LLIZ = String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2Epg==", null)));
            PreviewTitleCoverFragment previewTitleCoverFragment2 = (PreviewTitleCoverFragment) viewOnFocusChangeListenerC785970UsN.l0;
            previewTitleCoverFragment2.getClass();
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_title_click");
            c474500IjALIZ2.LJIJJLI(C475510Ikn.LJ(previewTitleCoverFragment2));
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(previewTitleCoverFragment2);
            if (dataChannelLJ2 == null || (liveMode4 = (LiveMode) dataChannelLJ2.gg0(LiveModeChannel.class)) == null) {
                liveMode4 = LiveMode.VIDEO;
            }
            c474500IjALIZ2.LJJII(C354201Zc.LIZ(liveMode4), "live_type");
            c474500IjALIZ2.LJJII("settings", "position");
            c474500IjALIZ2.LIZ();
            return;
        }
        ((PreviewTitleCoverFragment) viewOnFocusChangeListenerC785970UsN.l0).NR(String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2Epg==", null))));
        PreviewTitleCoverFragment previewTitleCoverFragment3 = (PreviewTitleCoverFragment) viewOnFocusChangeListenerC785970UsN.l0;
        boolean z3 = !Intrinsics.LJFF(previewTitleCoverFragment3.LLIZ, String.valueOf(C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2Epg==", null))));
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_takepage_title_submit");
        c474500IjALIZ3.LJIJJLI(C475510Ikn.LJ(previewTitleCoverFragment3));
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(previewTitleCoverFragment3);
        if (dataChannelLJ3 == null || (liveMode = (LiveMode) dataChannelLJ3.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZ3.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZ3.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0), "is_revised");
        c474500IjALIZ3.LIZ();
        Editable editableLLLFZ2 = C2204961BRm.LLLFZ((LiveEditText) viewOnFocusChangeListenerC785970UsN.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCrhTN5qQZlv+/EDD/ubh0w2Epg==", null));
        if (editableLLLFZ2 != null) {
            if (editableLLLFZ2.length() == 0) {
                z2 = true;
            }
            boolValueOf2 = Boolean.valueOf(z2);
        }
        if (!C500260Jjc.LJJIFFI(boolValueOf2)) {
            return;
        }
        PreviewTitleCoverFragment previewTitleCoverFragment4 = (PreviewTitleCoverFragment) viewOnFocusChangeListenerC785970UsN.l0;
        previewTitleCoverFragment4.getClass();
        C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_anchor_title_modify_over");
        c474500IjALIZ4.LJIJJLI(C475510Ikn.LJ(previewTitleCoverFragment4));
        DataChannel dataChannelLJ4 = C475510Ikn.LJ(previewTitleCoverFragment4);
        if (dataChannelLJ4 == null || (liveMode2 = (LiveMode) dataChannelLJ4.gg0(LiveModeChannel.class)) == null) {
            liveMode2 = LiveMode.VIDEO;
        }
        c474500IjALIZ4.LJJII(C354201Zc.LIZ(liveMode2), "live_type");
        c474500IjALIZ4.LJJII("setting", "position");
        c474500IjALIZ4.LIZ();
    }
}
