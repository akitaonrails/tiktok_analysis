package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0TtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761190TtV {
    public static EnumC587420N2e LIZ;
    public static EnumC587420N2e LIZIZ;
    public static EnumC587420N2e LIZJ;

    static {
        EnumC587420N2e enumC587420N2e = EnumC587420N2e.NONE;
        LIZ = enumC587420N2e;
        LIZIZ = enumC587420N2e;
        LIZJ = enumC587420N2e;
    }

    public static EnumC771230UNd LIZ() {
        LiveEffect liveEffect;
        if (!LiveBeautySwitchSetting.INSTANCE.inExperiment()) {
            return EnumC771230UNd.APPLYING;
        }
        Integer numLIZIZ = InterfaceC766480U4w.LIZ.LIZIZ();
        if (numLIZIZ == null || numLIZIZ.intValue() != 0) {
            LIZJ = EnumC587420N2e.APPLYING;
        } else {
            LIZJ = EnumC587420N2e.NONE;
        }
        if (InterfaceC766480U4w.LJJIII.LIZIZ().booleanValue()) {
            LIZ = EnumC587420N2e.APPLYING;
        } else {
            LIZ = EnumC587420N2e.NONE;
        }
        Iterator<LiveEffect> it2 = C0UA1.LIZ().qr(C0UD4.LJFF).iterator();
        while (true) {
            liveEffect = null;
            if (!it2.hasNext()) {
                break;
            }
            LiveEffect next = it2.next();
            String strLJLL = next.LJLL();
            if (C500260Jjc.LJJJI(strLJLL != null ? Boolean.valueOf(u.LJJIIJZLJL(strLJLL, "makeup", false)) : null)) {
                liveEffect = next;
                break;
            }
        }
        LiveEffect liveEffect2 = liveEffect;
        if (liveEffect2 == null || liveEffect2.LJJIJIIJI()) {
            LIZIZ = EnumC587420N2e.NONE;
        } else {
            LIZIZ = EnumC587420N2e.APPLYING;
        }
        EnumC587420N2e enumC587420N2e = LIZ;
        EnumC587420N2e enumC587420N2e2 = EnumC587420N2e.APPLYING;
        return (enumC587420N2e == enumC587420N2e2 || LIZIZ == enumC587420N2e2 || LIZJ == enumC587420N2e2) ? EnumC771230UNd.APPLYING : EnumC771230UNd.APPLY_FINISH;
    }
}
