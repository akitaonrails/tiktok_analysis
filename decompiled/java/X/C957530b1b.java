package X;

import com.bytedance.android.livesdk.chatroom.model.interact.SubtitleSettings;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957530b1b implements InterfaceC1141530foN {
    public static final C957530b1b LL;
    public static WeakReference<InterfaceC957540b1c> LLILLJJLI;
    public static SubtitleSettings LLILLL;

    static {
        C957530b1b c957530b1b = new C957530b1b();
        LL = c957530b1b;
        C1548820qPI.LIZLLL("LiveCohostSettingUpdatedEvent", c957530b1b);
        LLILLL = new SubtitleSettings();
    }

    public static final void LIZ(boolean z) {
        int i;
        InterfaceC957540b1c interfaceC957540b1c;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        if (LLILLL.enable == i) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateEnable: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("CoHostAnchorSubtitleSettingHolder", C2188811AlT.LIZIZ(sbLIZ));
        LLILLL.enable = i;
        WeakReference<InterfaceC957540b1c> weakReference = LLILLJJLI;
        if (weakReference != null && (interfaceC957540b1c = weakReference.get()) != null) {
            interfaceC957540b1c.LIZIZ(z);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC957540b1c interfaceC957540b1c;
        boolean z;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "LiveCohostSettingUpdatedEvent")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null) {
            C20441214yg.LIZIZ("CoHostAnchorSubtitleSettingHolder", "onReceiveJsEvent: params is null");
            return;
        }
        InterfaceC1107590evd interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "subtitle_settings");
        if (interfaceC1107590evdLJ == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent subtitle_settings=");
        sbLIZ.append(interfaceC1107590evdLJ);
        C20441214yg.LIZIZ("CoHostAnchorSubtitleSettingHolder", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1107590evdLJ.hasKey("enable")) {
            if (interfaceC1107590evdLJ.getInt("enable") != 0) {
                z = true;
                InterfaceC960800b6s.LLLLLLIL.LJFF(Boolean.TRUE);
            } else {
                z = false;
            }
            LIZ(z);
        }
        if (interfaceC1107590evdLJ.hasKey("target_language")) {
            String string = interfaceC1107590evdLJ.getString("target_language");
            if (!Intrinsics.LJFF(LLILLL.targetLanguage, string)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateTargetLanguage: ");
                sbLIZ2.append(string);
                C20441214yg.LIZIZ("CoHostAnchorSubtitleSettingHolder", C2188811AlT.LIZIZ(sbLIZ2));
                LLILLL.targetLanguage = string;
                WeakReference<InterfaceC957540b1c> weakReference = LLILLJJLI;
                if (weakReference != null && (interfaceC957540b1c = weakReference.get()) != null) {
                    interfaceC957540b1c.LIZJ();
                }
            }
        }
    }
}
