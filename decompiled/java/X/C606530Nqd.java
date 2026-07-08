package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606530Nqd extends C09AY implements Function0<String> {
    public final /* synthetic */ List<Aweme> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C606500Nqa LLILZ;
    public final /* synthetic */ C606560Nqg LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C606530Nqd(List<? extends Aweme> list, int i, int i2, C606500Nqa c606500Nqa, C606560Nqg c606560Nqg) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c606500Nqa;
        this.LLILZIL = c606560Nqg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb = new StringBuilder("replace ");
        List<Aweme> list = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        sb.append(arrayList);
        sb.append(" at ");
        sb.append(this.LLILLJJLI);
        sb.append(' ');
        sb.append(this.LLILLL);
        sb.append(" by ");
        sb.append(this.LLILZ.LIZ);
        sb.append(", result=");
        sb.append(this.LLILZIL.LIZ);
        return sb.toString();
    }
}
