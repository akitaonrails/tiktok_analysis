package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EAL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0EAL extends C2217421BqW implements Function0<Unit> {
    public C0EAL(C0EAU c0eau) {
        super(0, c0eau, C0EAU.class, "resetAll", "resetAll()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0E55 player;
        C0EAU c0eau = (C0EAU) this.receiver;
        C0E48 c0e48Invoke = c0eau.LJI.invoke();
        if (c0e48Invoke != null && (player = c0e48Invoke.getPlayer()) != null) {
            player.pause(false);
        }
        c0eau.LIZ();
        Iterator<NLETrackSlot> it2 = c0eau.LJII.LLLLLLIL().iterator();
        while (it2.hasNext()) {
            it2.next().setExtra("is_beauty_auto_retouch_off", "true");
        }
        c0eau.LJII.LIZIZ(C0E1V.RETOUCH_RESET.getNameId(), c0eau.LIZ.getString(2131834169));
        c0eau.LJII.LIZ(new AwS584S0100000_5(c0eau, 1150));
        C0EAE c0eae = C0EAE.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = c0eau.LJII.LJJJLIIL();
        c0eae.getClass();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobRetouchReset clickFrom = ");
        sbLIZ.append(C0EAE.LIZJ);
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLIZJ = C0EAE.LIZJ(videoPublishEditModelLJJJLIIL, C0EAE.LIZIZ);
        c0labLIZJ.LJ("click_from", C0EAE.LIZJ);
        C20684815ws.LJIILLIIL("retouch_reset", c0labLIZJ.LIZ);
        return Unit.LIZ;
    }
}
