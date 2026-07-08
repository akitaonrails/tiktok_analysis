package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.ContactSelectVM;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15m2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20617615m2 extends C09AY implements Function1<C20617115lx, C20617115lx> {
    public final /* synthetic */ ContactSelectVM LL;
    public final /* synthetic */ List<IMContact> LLILLJJLI;
    public final /* synthetic */ Map<String, EnumC20616515lr> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20617615m2(ContactSelectVM contactSelectVM, List<? extends IMContact> list, Map<String, ? extends EnumC20616515lr> map, boolean z, int i, boolean z2) {
        super(1);
        this.LL = contactSelectVM;
        this.LLILLJJLI = list;
        this.LLILLL = map;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C20617115lx invoke(C20617115lx c20617115lx) {
        return C20617115lx.LIZ(c20617115lx, this.LL.vQ2("", this.LLILLJJLI, this.LLILLL), this.LLILZ, false, this.LLILZIL, null, this.LLILZLL, true, 144);
    }
}
