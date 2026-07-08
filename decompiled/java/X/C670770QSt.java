package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QSt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670770QSt extends C09AY implements Function1<AbstractC343940De4, Unit> {
    public final /* synthetic */ Word LL;
    public final /* synthetic */ C653660PkS LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C670770QSt(Word word, C653660PkS c653660PkS, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = word;
        this.LLILLJJLI = c653660PkS;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC343940De4 abstractC343940De4) {
        C0QEB c0qeb = C0QEB.LIZ;
        Word word = this.LL;
        C653660PkS c653660PkS = this.LLILLJJLI;
        String value = EnumC670740QSq.CANCEL.getValue();
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        String str4 = this.LLILZLL;
        c0qeb.getClass();
        C0QEB.LIZJ(word, c653660PkS, value, str, str2, str3, str4);
        return Unit.LIZ;
    }
}
