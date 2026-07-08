package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SFI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFI extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<C0SJL<C719000SIg>> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SFI(int i, int i2, List list, int i3, int i4, int i5) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = list;
        this.LLILZLL = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb = new StringBuilder("tryEllipsisWithHashTagTruncated truncate components [");
        sb.append(this.LL);
        sb.append(", ");
        sb.append(this.LLILLJJLI);
        sb.append("], text index [");
        sb.append(this.LLILLL);
        sb.append(", ");
        sb.append(this.LLILZ);
        sb.append("], contents ");
        List<C0SJL<C719000SIg>> listSubList = this.LLILZIL.subList(this.LL, this.LLILLJJLI + 1);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator<C0SJL<C719000SIg>> it2 = listSubList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ());
        }
        sb.append(arrayList);
        sb.append("\ntruncate at ");
        sb.append(this.LLILZLL);
        return sb.toString();
    }
}
