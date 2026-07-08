package X;

import android.util.Range;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679000QkE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TextView LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ = R.attr.bb;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ List<Position> LLILZLL;
    public final /* synthetic */ Range<Integer> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ Function1<String, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C679000QkE(TuxTextView tuxTextView, String str, String str2, boolean z, List list, Range range, boolean z2, int i, Function1 function1) {
        super(0);
        this.LL = tuxTextView;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZIL = z;
        this.LLILZLL = list;
        this.LLIZ = range;
        this.LLIZLLLIL = z2;
        this.LLJ = i;
        this.LLJI = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C678990QkD.LIZLLL(this.LL)) {
            C678990QkD.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, AbstractC19875512pd.copyOf((Collection) this.LLILZLL), this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
        }
        return Unit.LIZ;
    }
}
