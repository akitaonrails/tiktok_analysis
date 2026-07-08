package X;

import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Z9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Z9 extends C09AY implements Function1<C09Z8, C09Z8> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ BlockStruct LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09Z9(String str, BlockStruct blockStruct, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = blockStruct;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C09Z8 invoke(C09Z8 c09z8) {
        return C09Z8.LIZ(c09z8, this.LL, this.LLILLJJLI, null, this.LLILLL, 4);
    }
}
