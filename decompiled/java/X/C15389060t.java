package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.060t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15389060t implements InterfaceC15414061s {
    public static C062Z LLILLJJLI;
    public static final C15389060t LL = new C15389060t();
    public static final C15388060s LLILLL = new InterfaceC1890940zJ6() { // from class: X.060s
        @Override // X.InterfaceC1890940zJ6
        public final void LIZ(C062Z c062z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBannerClose ");
            sbLIZ.append(c062z);
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.InterfaceC1890940zJ6
        public final void LIZJ(C062Z c062z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBannerShow ");
            sbLIZ.append(c062z);
            C2188811AlT.LIZIZ(sbLIZ);
            C15408061m c15408061m = C15408061m.LIZ;
            C15389060t c15389060t = C15389060t.LL;
            c15408061m.getClass();
            C15408061m.LIZIZ.LJ(c15389060t);
            C15389060t.LLILLJJLI = c062z;
        }

        @Override // X.InterfaceC1890940zJ6
        public final void LIZIZ(Context context, C062Z c062z, String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBannerClick ");
            sbLIZ.append(c062z);
            C2188811AlT.LIZIZ(sbLIZ);
            if (context != null) {
                C888370Yt9.LIZ.getClass();
                C1503105uX.LIZ(new C060I(context, "inbox_guide_banner", "notification_page", false));
            }
        }
    };

    @Override // X.InterfaceC15414061s
    public final void Ap2(List<IMAIBotInfo> list) {
    }

    @Override // X.InterfaceC15414061s
    public final void ez0(List<IMAIBotInfo> list) {
        Function0<Unit> function0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBotCreateOrUpdate ");
        sbLIZ.append(list);
        C2188811AlT.LIZIZ(sbLIZ);
        C062Z c062z = LLILLJJLI;
        if (c062z != null && (function0 = c062z.LIZJ) != null) {
            function0.invoke();
        }
    }
}
