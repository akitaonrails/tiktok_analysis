package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.preview.BulletinPreviewDomainAllowlistViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinNewsAllowlistResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01VV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.preview.BulletinPreviewDomainAllowlistViewModel$getNewsDomainAllowlist$1", f = "BulletinPreviewDomainAllowlistViewModel.kt", l = {31}, m = "invokeSuspend")
public final class C01VV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BulletinPreviewDomainAllowlistViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01VV(BulletinPreviewDomainAllowlistViewModel bulletinPreviewDomainAllowlistViewModel, String str, InterfaceC1364105Vn<? super C01VV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bulletinPreviewDomainAllowlistViewModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01VV c01vv = new C01VV(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c01vv.LLILLJJLI = obj;
        return c01vv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        List<String> domainAllowlist;
        C1C7U.LIZ("BulletinPreviewDomainAllowlistViewModel@750c.getNewsDomainAllowlist$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                BulletinPreviewDomainAllowlistViewModel bulletinPreviewDomainAllowlistViewModel = this.LLILLL;
                String str = this.LLILZ;
                InterfaceC150100hn interfaceC150100hn = (InterfaceC150100hn) bulletinPreviewDomainAllowlistViewModel.LL.getValue().getOperator();
                this.LL = 1;
                obj = interfaceC150100hn.LJIIJJI(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinPreviewDomainAllowlistViewModel@750c.getNewsDomainAllowlist$1");
                    return objLJFF;
                }
            }
            c098200Yq = (BulletinNewsAllowlistResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            BulletinNewsAllowlistResponse bulletinNewsAllowlistResponse = (BulletinNewsAllowlistResponse) c098200Yq;
            if (bulletinNewsAllowlistResponse == null || (domainAllowlist = bulletinNewsAllowlistResponse.getDomainAllowlist()) == null) {
                domainAllowlist = C13BV.INSTANCE;
            }
            Keva repo = Keva.getRepo("bulletin_preview_domain_allowlist_repo");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("allowlist_");
            sbLIZ.append(str2);
            repo.storeStringArray(C2188811AlT.LIZIZ(sbLIZ), (String[]) domainAllowlist.toArray(new String[0]));
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0OPX.LJII("BulletinPreviewDomainAllowlistViewModel getNewsDomainAllowlist error: " + thM5exceptionOrNullimpl.getMessage() + ' ');
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPreviewDomainAllowlistViewModel@750c.getNewsDomainAllowlist$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
