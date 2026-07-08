package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS150S0101000_10;

/* JADX INFO: renamed from: X.0PTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645510PTp extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C645550PTt LL;
    public final /* synthetic */ EnumC645610PTz LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ C0PUB LLIZ;
    public final /* synthetic */ ClickSearchViewModel LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C645510PTp(C645550PTt c645550PTt, EnumC645610PTz enumC645610PTz, String str, String str2, int i, Map<String, ? extends Object> map, C0PUB c0pub, ClickSearchViewModel clickSearchViewModel) {
        super(0);
        this.LL = c645550PTt;
        this.LLILLJJLI = enumC645610PTz;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = map;
        this.LLIZ = c0pub;
        this.LLIZLLLIL = clickSearchViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1202104n5.LIZ().LJIILIIL("fallbackCS", null, null);
        C645550PTt c645550PTt = this.LL;
        if (c645550PTt != null) {
            EnumC645610PTz enumC645610PTz = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            int i = this.LLILZIL;
            c645550PTt.LIZ(enumC645610PTz, str, str2, i, this.LLILZLL, new AwS150S0101000_10(this.LLIZLLLIL, i, 6), this.LLIZ, AFwS196S0000000_10.get$arr$(336));
        }
        return Unit.LIZ;
    }
}
