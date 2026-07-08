package X;

import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OB0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OB0 extends C09AY implements Function1<MultiTranslationResult, C615190OAz> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OB0(long j, String str, String str2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C615190OAz invoke(MultiTranslationResult multiTranslationResult) throws C07U9 {
        List<TranslationResult> list;
        TranslationResult translationResult;
        String str;
        MultiTranslationResult multiTranslationResult2 = multiTranslationResult;
        if (multiTranslationResult2 != null && (list = multiTranslationResult2.results) != null && (translationResult = (TranslationResult) C13LP.LJJJLL(list)) != null && (str = translationResult.translatedContent) != null && str.length() != 0 && str != null) {
            return new C615190OAz(this.LL, this.LLILLJJLI, this.LLILLL, str);
        }
        throw new C07U9("translate failed, null result");
    }
}
