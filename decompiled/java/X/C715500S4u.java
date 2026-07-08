package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715500S4u extends C09AY implements Function0<IVideoCellAbility> {
    public final /* synthetic */ TranslationStatusAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C715500S4u(TranslationStatusAssem translationStatusAssem) {
        super(0);
        this.LL = translationStatusAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IVideoCellAbility invoke() {
        return C1558520qew.LIZ(this.LL.LLIIJLIL(), IVideoCellAbility.class, null);
    }
}
