package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637730sih extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1638170sjP LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637730sih(C1638170sjP c1638170sjP, String str, Effect effect, String str2) {
        super(0);
        this.LL = c1638170sjP;
        this.LLILLJJLI = str;
        this.LLILLL = effect;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1324750kZt.LJIIJJI(this.LL.LL.getImageView(), this.LLILLJJLI, -1, -1, null, null, new C1636130sg7(this.LLILLL), this.LLILZ);
        return Unit.LIZ;
    }
}
