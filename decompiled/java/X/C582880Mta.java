package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C582880Mta extends C09AY implements Function0<Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C582880Mta(int i, Aweme aweme) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inspectOnPageSelect selectedIndex= ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAdOrPseudoAd= ");
        sbLIZ.append(C587350N1x.LIZJ(this.LLILLJJLI));
        sbLIZ.append(", selectedAweme_desc= ");
        sbLIZ.append(this.LLILLJJLI.getDesc());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
