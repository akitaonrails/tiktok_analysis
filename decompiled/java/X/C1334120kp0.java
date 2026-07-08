package X;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334120kp0 extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1325710kbR LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ C1334110koz LLILZ;
    public final /* synthetic */ JSONObject LLILZIL;
    public final /* synthetic */ Number LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1334120kp0(boolean z, C1325710kbR c1325710kbR, Uri uri, C1334110koz c1334110koz, JSONObject jSONObject, Number number) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c1325710kbR;
        this.LLILLL = uri;
        this.LLILZ = c1334110koz;
        this.LLILZIL = jSONObject;
        this.LLILZLL = number;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPrefetch:");
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLJJLI.LJIL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLL.getPath());
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZ.LIZ);
        sbLIZ.append(' ');
        JSONObject jSONObject = this.LLILZIL;
        sbLIZ.append(jSONObject != null ? jSONObject.opt("image_monitor_data") : null);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
