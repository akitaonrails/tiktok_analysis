package X;

import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DPY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DPY extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ EnumC337870DMj LL;
    public final /* synthetic */ EnumC337830DMf LLILLJJLI;
    public final /* synthetic */ C1245860iWe LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ EnumC338610DPf LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ SchoolMutualStruct LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DPY(EnumC337870DMj enumC337870DMj, EnumC337830DMf enumC337830DMf, C1245860iWe c1245860iWe, boolean z, EnumC338610DPf enumC338610DPf, String str, SchoolMutualStruct schoolMutualStruct) {
        super(1);
        this.LL = enumC337870DMj;
        this.LLILLJJLI = enumC337830DMf;
        this.LLILLL = c1245860iWe;
        this.LLILZ = z;
        this.LLILZIL = enumC338610DPf;
        this.LLILZLL = str;
        this.LLIZ = schoolMutualStruct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        C062P<InterfaceC111300bX> c062p2 = c062p;
        c062p2.LIZ = new C337950DMr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        c062p2.LIZJ = C13LE.LIZ(C337950DMr.class);
        return Unit.LIZ;
    }
}
