package X;

import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356940Dz2 extends C0EH9 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1664740tQG LLJILJIL;
    public final ArrayList<String> LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C356940Dz2.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0EHG
    public final boolean LJ(C361980EHc c361980EHc) {
        return this.LLJILJILJ.contains(c361980EHc.LJI);
    }

    public C356940Dz2(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg, R.id.gcw);
        this.LLJILJIL = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        this.LLJILJILJ = C1697810uHb.LJ("bottom_item_edit_adjust_opacity", "bottom_item_text_edit_adjust_opacity", "bottom_item_captions_edit_adjust_opacity", "bottom_item_sticker_edit_adjust_opacity", "bottom_item_overlay_edit_adjust_opacity");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C0EHG
    public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
        C0E48 c0e48LJIIJ;
        C0EY2 c0ey2;
        VideoPublishEditModel editModel;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String uuid;
        NLECommit head;
        if (!c361980EHc.LJII || C0OBG.LIZIZ(LJIIIZ().findViewById(this.LLILLL)) || (c0e48LJIIJ = LJIIJ()) == null || (c0ey2 = (C0EY2) this.LLJILJIL.getValue(this, LLJILLL[0])) == null || (editModel = c0ey2.getEditModel()) == null || (nLETrackSlotLLLLLLIL = c0e48LJIIJ.LLLLLLIL()) == null) {
            return;
        }
        NLEBranch branch = c0e48LJIIJ.LLFII().LJI().getBranch();
        if (branch == null || (head = branch.getHead()) == null || (uuid = head.getUUID()) == null) {
            uuid = "";
        }
        C363780EOa c363780EOa = new C363780EOa(c361980EHc.LJI, nLETrackSlotLLLLLLIL, uuid, c0e48LJIIJ);
        String str = c361980EHc.LJI;
        switch (str.hashCode()) {
            case -1758702551:
                if (!str.equals("bottom_item_overlay_edit_adjust_opacity")) {
                    return;
                }
                break;
            case -808300842:
                if (!str.equals("bottom_item_captions_edit_adjust_opacity")) {
                    return;
                }
                break;
            case -280382824:
                if (!str.equals("bottom_item_edit_adjust_opacity")) {
                    return;
                }
                break;
            case 1025400982:
                if (!str.equals("bottom_item_sticker_edit_adjust_opacity")) {
                    return;
                }
                break;
            case 1936411830:
                if (!str.equals("bottom_item_text_edit_adjust_opacity")) {
                    return;
                }
                break;
            default:
                return;
        }
        C375820EoO.LIZ(this.LL, c0e48LJIIJ, C365300ETw.class, c363780EOa, 16);
        C361680EFy.LJJJI("opacity", editModel, c0e48LJIIJ, null, false, Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_overlay_edit_adjust_opacity"), null, null, 888);
        C20684815ws.LJIILLIIL("opacity_panel_show", C361680EFy.LJFF(-1L, editModel, c0e48LJIIJ, new Pair(-1, -1)).LIZ);
    }
}
