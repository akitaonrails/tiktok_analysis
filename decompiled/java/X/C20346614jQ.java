package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14jQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20346614jQ extends C09AY implements Function0<String> {
    public final /* synthetic */ CellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20346614jQ(CellAdaptionComponentV2 cellAdaptionComponentV2) {
        super(0);
        this.LL = cellAdaptionComponentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Aweme awemeKp = this.LL.kp();
        return String.valueOf(awemeKp != null ? awemeKp.getAid() : null);
    }
}
