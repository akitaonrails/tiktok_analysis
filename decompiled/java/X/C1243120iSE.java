package X;

import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iSE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243120iSE extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ MentionFavoriteVideoVM LL;
    public final /* synthetic */ MentionVideoShareModel LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243120iSE(MentionFavoriteVideoVM mentionFavoriteVideoVM, MentionVideoShareModel mentionVideoShareModel, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function03, int i, int i2) {
        super(2);
        this.LL = mentionFavoriteVideoVM;
        this.LLILLJJLI = mentionVideoShareModel;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = interfaceC1685750ty9;
        this.LLILZLL = function03;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1670140tYy.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1), this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
