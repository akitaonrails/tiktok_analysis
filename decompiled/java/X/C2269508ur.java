package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2269508ur extends C09AY implements Function0<String> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Set<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2269508ur(VideoPublishEditModel videoPublishEditModel, String str, Set<String> set, String str2, String str3) {
        super(0);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = str;
        this.LLILLL = set;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C2262608tk> listLIZ = C0MH3.LIZ(this.LL, Intrinsics.LJFF(this.LLILLJJLI, "list"));
        if (listLIZ != null) {
            return C23250099c.LJ(C23271099x.INSTANCE, new C2269308up(listLIZ, this.LL, this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, jCurrentTimeMillis, null));
        }
        return null;
    }
}
