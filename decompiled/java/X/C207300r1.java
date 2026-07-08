package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00r1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C207300r1 extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207300r1(int i, String str, Aweme aweme) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete legacy at ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" by ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLL.getAid());
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
