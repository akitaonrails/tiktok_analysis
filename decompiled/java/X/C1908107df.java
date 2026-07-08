package X;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1908107df extends C09AY implements Function0<String> {
    public final /* synthetic */ Uri LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1908107df(Uri uri, long j, long j2, long j3) {
        super(0);
        this.LL = uri;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new loop ");
        Uri uri = this.LL;
        sbLIZ.append(uri != null ? uri.getPath() : null);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
