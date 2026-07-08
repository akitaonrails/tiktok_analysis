package X;

import com.bytedance.android.starship.trace.span.Span;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0k9E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308220k9E implements InterfaceC1308250k9H {
    public final InterfaceC1308240k9G LIZ = new InterfaceC1308240k9G() { // from class: X.0k9F
        public final String LIZ = "starship_interstellar_trace";

        @Override // X.InterfaceC1308240k9G
        public final void LIZ(Span span) {
            AppLogNewUtils.LJI(this.LIZ, C2097608Jq.LJIIJ(new Pair("span", GsonProtectorUtils.toJson(C1306320k6A.LIZ, span))));
        }
    };

    @Override // X.InterfaceC1308250k9H
    public final void LIZ(Span span) {
        this.LIZ.LIZ(span);
    }
}
