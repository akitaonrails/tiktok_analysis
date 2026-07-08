package X;

import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18K4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18K4 extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Activity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18K4(Activity activity, String str) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(": activity: ");
        sbLIZ.append(C13LE.LIZ(this.LLILLJJLI.getClass()).LJI());
        sbLIZ.append('#');
        sbLIZ.append(this.LLILLJJLI.hashCode());
        sbLIZ.append(" --- page_id: ");
        C18KJ.LIZ.getClass();
        sbLIZ.append(C18KJ.LIZIZ.get(this.LLILLJJLI));
        sbLIZ.append('\n');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
