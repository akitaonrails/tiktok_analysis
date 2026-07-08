package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIT extends C09AY implements Function1<Boolean, C719090SIp> {
    public final /* synthetic */ C718770SHj LL;
    public final /* synthetic */ C718800SHm LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SIT(C718770SHj c718770SHj, C718800SHm c718800SHm, int i, Aweme aweme, boolean z, boolean z2) {
        super(1);
        this.LL = c718770SHj;
        this.LLILLJJLI = c718800SHm;
        this.LLILLL = i;
        this.LLILZ = aweme;
        this.LLILZIL = z;
        this.LLILZLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C719090SIp invoke(Boolean bool) {
        boolean z;
        boolean zBooleanValue = bool.booleanValue();
        C718770SHj c718770SHj = this.LL;
        C718800SHm c718800SHm = this.LLILLJJLI;
        int i = this.LLILLL;
        Aweme aweme = this.LLILZ;
        boolean z2 = this.LLILZIL;
        if (!this.LLILZLL && !zBooleanValue) {
            z = false;
        } else {
            z = true;
        }
        return c718770SHj.LJLLILLLL(c718800SHm, i, aweme, z2, z);
    }
}
