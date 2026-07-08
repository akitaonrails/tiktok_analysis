package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.api.params.MaskParam;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ENS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENS implements InterfaceC357170DzP, InterfaceC350420DoW {
    public final /* synthetic */ C363550ENd LIZ;

    @Override // X.InterfaceC357170DzP
    public final void LIZJ(EnumC357140DzM enumC357140DzM) {
    }

    @Override // X.InterfaceC350420DoW
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC350420DoW
    public final void LIZ() {
        C363550ENd c363550ENd = this.LIZ;
        C0E48 c0e48F4 = c363550ENd.F4();
        c363550ENd.k7(c0e48F4 != null ? c0e48F4.LLLLLLIL() : null);
        C363550ENd c363550ENd2 = this.LIZ;
        C0E48 c0e48F42 = c363550ENd2.F4();
        c363550ENd2.W6(c0e48F42 != null ? c0e48F42.LLLLLLIL() : null);
    }

    public C0ENS(C363550ENd c363550ENd) {
        this.LIZ = c363550ENd;
    }

    @Override // X.InterfaceC357170DzP
    public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        String str;
        boolean z2;
        String str2;
        String str3;
        NLETrackSlot nLETrackSlotLLLLLLIL3;
        MaskParam maskParamLIZIZ;
        C363550ENd c363550ENd = this.LIZ;
        C0E48 c0e48F4 = c363550ENd.F4();
        if (c0e48F4 != null) {
            nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        c363550ENd.k7(nLETrackSlotLLLLLLIL);
        C363550ENd c363550ENd2 = this.LIZ;
        C0E48 c0e48F42 = c363550ENd2.F4();
        if (c0e48F42 != null) {
            nLETrackSlotLLLLLLIL2 = c0e48F42.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL2 = null;
        }
        c363550ENd2.W6(nLETrackSlotLLLLLLIL2);
        AbstractC363520ENa abstractC363520ENa = this.LIZ.T2().LIZIZ;
        if (abstractC363520ENa == null || (maskParamLIZIZ = C0ENT.LIZIZ(abstractC363520ENa)) == null || (str = maskParamLIZIZ.maskType) == null) {
            str = "none";
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
        C0E48 c0e48F43 = this.LIZ.F4();
        boolean z3 = false;
        if (enumC357140DzM == EnumC357140DzM.UNDO) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (videoPublishEditModelLJJJLIIL != null) {
            if (c0e48F43 != null && (nLETrackSlotLLLLLLIL3 = c0e48F43.LLLLLLIL()) != null) {
                NLETrack trackBySlot = C350870DpF.LJI(c0e48F43).getTrackBySlot(nLETrackSlotLLLLLLIL3);
                if (trackBySlot != null && trackBySlot.getMainTrack()) {
                    z3 = true;
                }
                z3 = !z3;
            }
            String str4 = "1";
            if (videoPublishEditModelLJJJLIIL.creativeModel.pugcTemplateData.isFromCreateTemplate) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F43, new Pair(-1, -1));
            if (!z3) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJFF.LJ("is_from_pip", str4);
            c0labLJFF.LJ("is_from_create_template", str2);
            c0labLJFF.LJ("mask_type", str);
            if (z2) {
                str3 = "undo";
            } else {
                str3 = "redo";
            }
            c0labLJFF.LJ("action", str3);
            C20684815ws.LJIILLIIL("click_mask_undo_redo", c0labLJFF.LIZ);
        }
    }
}
