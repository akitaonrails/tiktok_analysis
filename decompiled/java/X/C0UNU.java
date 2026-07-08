package X;

import com.bytedance.android.livesdk.qa.QuestionEx;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UNU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNU extends C09AY implements Function1<List<QuestionEx>, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function1<List<QuestionEx>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0UNU(int i, int i2, int i3, Function1<? super List<QuestionEx>, Unit> function1) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<QuestionEx> list) {
        C0UNT.LIZ.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL + 1, this.LLILZ);
        return Unit.LIZ;
    }
}
