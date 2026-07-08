package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfoList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel$onRefresh$2$conversationInfoListAsync$1", f = "SellerMessageListViewModel.kt", l = {234, 241}, m = "invokeSuspend")
public final class C1751240vfm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends ConversationInfoList>>, Object> {
    public int LL;
    public final /* synthetic */ C1751260vfo LLILLJJLI;
    public final /* synthetic */ SellerMessageListViewModel LLILLL;
    public final /* synthetic */ C1751300vfs LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751240vfm(C1751260vfo c1751260vfo, SellerMessageListViewModel sellerMessageListViewModel, C1751300vfs c1751300vfs, InterfaceC1364105Vn<? super C1751240vfm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1751260vfo;
        this.LLILLL = sellerMessageListViewModel;
        this.LLILZ = c1751300vfs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1751240vfm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SellerMessageListViewModel@16a7.onRefresh$2$conversationInfoListAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI != null) {
                this.LLILLL.LLILLJJLI = null;
                C1751300vfs c1751300vfs = this.LLILZ;
                C1751260vfo c1751260vfo = this.LLILLJJLI;
                int i2 = c1751260vfo.LIZIZ;
                int i3 = c1751260vfo.LIZ;
                int i4 = c1751260vfo.LIZJ;
                this.LL = 1;
                obj = InterfaceC1243950iTZ.LIZ.LIZ(c1751300vfs, i2, i3, i4, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onRefresh$2$conversationInfoListAsync$1");
                    return objLJFF;
                }
            } else {
                C1751300vfs c1751300vfs2 = this.LLILZ;
                this.LL = 2;
                obj = C1751250vfn.LIZ(c1751300vfs2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onRefresh$2$conversationInfoListAsync$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onRefresh$2$conversationInfoListAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends ConversationInfoList>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
