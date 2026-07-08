package X;

import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0S5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5Z extends C09AY implements Function1<C715570S5b, Unit> {
    public final /* synthetic */ TranslationStatusViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S5Z(TranslationStatusViewModel translationStatusViewModel) {
        super(1);
        this.LL = translationStatusViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C715570S5b c715570S5b) {
        this.LL.setState(new AwS590S0100000_11(c715570S5b, 279));
        return Unit.LIZ;
    }
}
