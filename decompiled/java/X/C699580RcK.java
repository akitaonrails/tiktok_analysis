package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699580RcK extends C09AY implements Function0<String> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C699060RbU LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C699580RcK(Aweme aweme, String str, String str2, String str3, C699060RbU c699060RbU) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = c699060RbU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("internalMobComponentShow execute aid=");
        Aweme aweme = this.LL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(" component=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" handled=true async=");
        sbLIZ.append(this.LLILZIL.LJJIIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
