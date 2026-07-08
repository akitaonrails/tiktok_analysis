package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C207100qz extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<Aweme> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C207100qz(int i, int i2, String str, List<? extends Aweme> list) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb = new StringBuilder("replace legacy at ");
        sb.append(this.LL);
        sb.append(' ');
        sb.append(this.LLILLJJLI);
        sb.append(" by ");
        sb.append(this.LLILLL);
        sb.append(' ');
        List<Aweme> list = this.LLILZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        sb.append(arrayList);
        sb.append(' ');
        return sb.toString();
    }
}
