package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C582870MtZ extends C09AY implements Function0<Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C582870MtZ(int i, Aweme aweme) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryExposeOnPageScroll inspectIndex= ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAdOrPseudoAd= ");
        Aweme aweme = this.LLILLJJLI;
        sbLIZ.append(aweme != null ? Boolean.valueOf(C587350N1x.LIZJ(aweme)) : null);
        sbLIZ.append(", inspectAweme_desc= ");
        Aweme aweme2 = this.LLILLJJLI;
        sbLIZ.append(aweme2 != null ? aweme2.getDesc() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
