package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0snk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640860snk extends C09AY implements Function1<C1640840sni, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI = true;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640860snk(boolean z, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1640840sni c1640840sni) {
        C1640840sni c1640840sni2 = c1640840sni;
        c1640840sni2.LIZ = this.LL;
        c1640840sni2.LIZIZ = this.LLILLJJLI;
        c1640840sni2.LJI = new C1640740snY(AFwS266S0000000_25.get$arr$(267), 7);
        c1640840sni2.LJIIL = this.LLILLL;
        c1640840sni2.LJIIJJI = new C1640880snm(507);
        c1640840sni2.LIZJ = !InterfaceC1103404Tg.LJIILJJIL.isDowngrade();
        c1640840sni2.LJIILIIL = true;
        ArrayList arrayList = new ArrayList();
        String strLJJLIIJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLIIJ();
        if (strLJJLIIJ != null) {
            arrayList.add(strLJJLIIJ);
        }
        c1640840sni2.LJIILJJIL = (String) C13LP.LJJJLL(arrayList);
        return Unit.LIZ;
    }
}
