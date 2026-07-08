package X;

import androidx.lifecycle.Observer;
import defpackage.d2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351770lHT<T> implements Observer {
    public static final C1351770lHT<T> LL = new C1351770lHT<>();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        d2.a aVar = (d2.a) obj;
        if (aVar instanceof d2.a.h) {
            C01GW c01gw = C1351800lHW.LIZ;
            C1351800lHW.LIZJ(C1383370m6R.LIZ, ((d2.a.h) aVar).LIZIZ);
            return;
        }
        if (aVar instanceof d2.a.g) {
            C01GW c01gw2 = C1351800lHW.LIZ;
            C1351800lHW.LIZJ(C1383370m6R.LIZ, false);
            return;
        }
        if (aVar instanceof d2.a.f) {
            C01GW c01gw3 = C1351800lHW.LIZ;
            String str = ((d2.a.f) aVar).LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAudioPaused: reason=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            if (!Intrinsics.LJFF(str, "audio_focus_changed")) {
                C19393310u3.LIZ.remove(C1351800lHW.LIZJ);
                C1351800lHW.LIZLLL.LIZ();
            }
            switch (str.hashCode()) {
                case -1938220840:
                    if (!str.equals("headset_disconnected")) {
                    }
                    C1351800lHW.LIZ().LIZ();
                    break;
                case -349675876:
                    if (!str.equals("click_pause_btn")) {
                    }
                    C1351800lHW.LIZ().LIZJ();
                    break;
                case -161821329:
                    if (!str.equals("comment_panel_dismiss")) {
                    }
                    C1351800lHW.LIZ().LIZJ();
                    break;
                case 63019646:
                    if (!str.equals("on_page_paused")) {
                    }
                    C1351800lHW.LIZ().LIZ();
                    break;
                case 802616882:
                    if (!str.equals("keyboard_dismiss")) {
                    }
                    C1351800lHW.LIZ().LIZJ();
                    break;
                case 1249745340:
                    if (!str.equals("comment_disslike_comment")) {
                    }
                    C1351800lHW.LIZ().LIZJ();
                    break;
                case 1641666283:
                    if (!str.equals("start_audio_recording")) {
                    }
                    C1351800lHW.LIZ().LIZ();
                    break;
                case 2121336228:
                    if (!str.equals("audio_focus_changed")) {
                    }
                    C1351800lHW.LIZ().LIZJ();
                    break;
            }
            return;
        }
        if (aVar instanceof d2.a.i) {
            C01GW c01gw4 = C1351800lHW.LIZ;
            C1351800lHW.LIZIZ(((d2.a.i) aVar).LIZLLL);
        } else if (aVar instanceof d2.a.c) {
            C1351800lHW.LIZIZ(null);
        } else {
            if (!(aVar instanceof d2.a.d)) {
                return;
            }
            C1351800lHW.LIZIZ(null);
        }
    }
}
