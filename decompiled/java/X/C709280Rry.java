package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709280Rry extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C718770SHj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C709280Rry(C718770SHj c718770SHj) {
        super(0);
        this.LL = c718770SHj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
        VideoItemParams item = this.LL.LLILLJJLI.getItem();
        return Boolean.valueOf(c1599640rjG.Pu(item != null ? item.fragment : null));
    }
}
