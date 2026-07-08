package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.delegates.TranslationControlsAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rrq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709200Rrq extends C09AY implements Function0<TranslationControlsAbility> {
    public final /* synthetic */ C718770SHj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C709200Rrq(C718770SHj c718770SHj) {
        super(0);
        this.LL = c718770SHj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.aweme.translation.delegates.TranslationControlsAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final TranslationControlsAbility invoke() {
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        Aweme aweme = this.LL.LLLLIIL;
        c299210Bo7.getClass();
        if (C299210Bo7.LIZ(aweme, false)) {
            return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL.LL), TranslationControlsAbility.class, null);
        }
        return null;
    }
}
