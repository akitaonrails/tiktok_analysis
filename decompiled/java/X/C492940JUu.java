package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.UserEmotesResponse;

/* JADX INFO: renamed from: X.0JUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492940JUu extends C09AY implements Function1<C492830JUj, C492830JUj> {
    public final /* synthetic */ List<AbstractC492880JUo> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C470590Icr<UserEmotesResponse.ResponseData> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492940JUu(List<AbstractC492880JUo> list, int i, C118300cf c118300cf, C013C c013c, C470590Icr<UserEmotesResponse.ResponseData> c470590Icr) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = c118300cf;
        this.LLILZ = c013c;
        this.LLILZIL = c470590Icr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C492830JUj invoke(C492830JUj c492830JUj) {
        return C492830JUj.LIZ(c492830JUj, this.LL, new Pair(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILLL.element)), this.LLILZ.element, null, null, null, new C291001Au(this.LLILZIL.data.hostInfo), 56);
    }
}
