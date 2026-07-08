package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699140Rbc extends C09AY implements Function0<String> {
    public final /* synthetic */ C699060RbU LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C699090RbX<ComponentPriorityProtocol> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C699140Rbc(C699060RbU c699060RbU, String str, String str2, String str3, C699090RbX<ComponentPriorityProtocol> c699090RbX) {
        super(0);
        this.LL = c699060RbU;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = c699090RbX;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("internalMobComponentShow prepare aid=");
        Aweme aweme = this.LL.LLJILLL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(" component=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append("  handled=");
        sbLIZ.append(this.LLILZIL.LLJI.get());
        sbLIZ.append(" async=");
        sbLIZ.append(this.LL.LJJIIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
