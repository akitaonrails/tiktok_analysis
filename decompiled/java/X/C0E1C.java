package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E1C, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E1C {
    public final Function0<C0EDF> LIZ;
    public final Function0<C0ED1> LIZIZ;
    public final Function0<String> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final Function0<Activity> LJFF;
    public final Function0<Context> LJI;
    public final C0E48 LJII;
    public boolean LJIIL;
    public Pair<? extends NLETrackSlot, ? extends NLETrackSlot> LJIILIIL;
    public ResourceItem LJIILJJIL;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1234));
    public final String LJIIIZ = "";
    public final List<Integer> LJIIJ = new ArrayList();
    public boolean LJIIJJI = true;
    public final int LJIILL = C0FU0.LIZ(4.0f);

    public static VideoPublishEditModel LIZIZ() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final void LIZJ() {
        VideoPublishEditModel videoPublishEditModelLIZIZ = LIZIZ();
        if (videoPublishEditModelLIZIZ != null) {
            C1413450msx c1413450msx = C1413450msx.LIZ;
            String strInvoke = this.LIZJ.invoke();
            c1413450msx.getClass();
            C1413450msx.LJIIIIZZ(videoPublishEditModelLIZIZ, C1413450msx.LJFF(strInvoke), true, 1, videoPublishEditModelLIZIZ.creativeModel.pugcTemplateData.isFromCreateTemplate);
        }
    }

    public static Integer LIZ(Context context, Integer num) {
        if (num == null) {
            return null;
        }
        return C1308910kAL.LIZJ(num.intValue(), context);
    }

    public final void LIZLLL(ResourceItem resourceItem, int i) {
        NLETrack nLETrackPt;
        boolean z = false;
        if (i == 0 && resourceItem.getEffectId().length() == 0) {
            return;
        }
        C1413450msx c1413450msx = C1413450msx.LIZ;
        String strInvoke = this.LIZJ.invoke();
        c1413450msx.getClass();
        String strLJFF = C1413450msx.LJFF(strInvoke);
        VideoPublishEditModel videoPublishEditModelLIZIZ = LIZIZ();
        if (videoPublishEditModelLIZIZ != null) {
            String effectId = resourceItem.getEffectId();
            int i2 = i - 1;
            int i3 = resourceItem.source;
            String str = resourceItem.designerId;
            String str2 = this.LJIIIZ;
            C0E48 c0e48 = this.LJII;
            if (c0e48 != null && (nLETrackPt = c0e48.Pt()) != null && nLETrackPt.getMainTrack()) {
                z = true;
            }
            C1413450msx.LJIIZILJ(c1413450msx, videoPublishEditModelLIZIZ, effectId, strLJFF, i2, true, true, null, Integer.valueOf(i3), str, null, str2, null, null, new C1413460msy(111, null, "editor_pro_animation", null), !z, 6720);
        }
    }

    public final void LJ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, ResourceItem resourceItem) {
        C0E1X c0e1x;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        VecNLETrackSPtr tracks;
        NLETrack next;
        C0E48 c0e48 = this.LJII;
        NLEEditor nLEEditorLJI = null;
        if (c0e48 != null && (tracks = C350870DpF.LJI(c0e48).getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C351220Dpo.LLLLILI(next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack = next;
            if (nLETrack != null) {
                nLETrack.setExtra("last_selected_anim_proxy_uuid", nLETrackSlot2.getUUID());
            }
        }
        C0E48 c0e482 = this.LJII;
        if (c0e482 != null) {
            c0e482.S7().LIZIZ(new C358740E4q(nLETrackSlot2, 0, null, false, 0, 254), "select_slot_event", false);
        }
        if (this.LJ) {
            c0e1x = new C0E1X(C0E1V.ADD_VIDEO_EFFECT.getNameId(), null, null, null, null, 30);
        } else {
            c0e1x = new C0E1X(C0E1V.REPLACE_VIDEO_EFFECT.getNameId(), null, null, null, null, 30);
        }
        C0E48 c0e483 = this.LJII;
        if (c0e483 != null) {
            nLEEditorLJI = c0e483.LLFII().LJI();
        }
        C350410DoV.LIZLLL(nLEEditorLJI, true, C051R.LIZIZ(c0e1x), false, true);
        C350800Dp8 c350800Dp8 = new C350800Dp8(nLETrackSlot, this.LIZJ.invoke());
        C0E48 c0e484 = this.LJII;
        if (c0e484 != null && (interfaceC351350Dq1LLFII = c0e484.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LIZ(c350800Dp8);
        }
        C0EDF c0edfInvoke = this.LIZ.invoke();
        if (c0edfInvoke != null) {
            C0EDF.LJIIL(c0edfInvoke, resourceItem.getResourceId(), C0E17.DIRECT_SCROLL, 8);
        }
    }

    public C0E1C(AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, AwS549S0100000_5 awS549S0100000_53, boolean z, boolean z2, AwS549S0100000_5 awS549S0100000_54, AwS549S0100000_5 awS549S0100000_55, C0E48 c0e48) {
        this.LIZ = awS549S0100000_5;
        this.LIZIZ = awS549S0100000_52;
        this.LIZJ = awS549S0100000_53;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = awS549S0100000_54;
        this.LJI = awS549S0100000_55;
        this.LJII = c0e48;
    }
}
