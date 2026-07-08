package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EAK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0EAK extends C2217421BqW implements Function0<Unit> {
    public C0EAK(C0EAU c0eau) {
        super(0, c0eau, C0EAU.class, "onRemoveAutoRetouchClicked", "onRemoveAutoRetouchClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0EAU c0eau = (C0EAU) this.receiver;
        c0eau.getClass();
        C0EAE c0eae = C0EAE.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = c0eau.LJII.LJJJLIIL();
        c0eae.getClass();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobClickAutoRetouchOff clickFrom = ");
        sbLIZ.append(C0EAE.LIZJ);
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLIZJ = C0EAE.LIZJ(videoPublishEditModelLJJJLIIL, C0EAE.LIZIZ);
        c0labLIZJ.LJ("click_from", C0EAE.LIZJ);
        C20684815ws.LJIILLIIL("click_auto_retouch_off", c0labLIZJ.LIZ);
        for (NLETrackSlot nLETrackSlot : c0eau.LJII.LLLLLLIL()) {
            for (C351390Dq5 c351390Dq5 : (ArrayList) C351220Dpo.LJIIIZ(nLETrackSlot)) {
                C0E48 c0e48Invoke = c0eau.LJI.invoke();
                if (c0e48Invoke != null && (interfaceC351350Dq1LLFII = c0e48Invoke.LLFII()) != null) {
                    interfaceC351350Dq1LLFII.LLJILJIL(nLETrackSlot, EnumC356070Dxd.COMMIT, c351390Dq5.LIZIZ);
                }
            }
            nLETrackSlot.setExtra("is_beauty_auto_retouch_off", "true");
        }
        c0eau.LJII.LIZ(new AwS584S0100000_5(c0eau, 1149));
        c0eau.LJII.LIZIZ(C0E1V.REMOVE_AUTO_RETOUCH.getNameId(), c0eau.LIZ.getString(2131834154));
        return Unit.LIZ;
    }
}
