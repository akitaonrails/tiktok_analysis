package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.df.GroupNotifyContainerFragment;
import com.ss.android.ugc.aweme.df.IGroupNotifyPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.df.GroupNotifyContainerFragment$onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1$1", f = "GroupChatNotifySheetLauncher.kt", l = {151, 153}, m = "invokeSuspend")
public final class C1312805Bu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ GroupNotifyContainerFragment LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ GroupNotifyContainerFragment LLILZIL;
    public final /* synthetic */ Bundle LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312805Bu(String str, InterfaceC1364105Vn interfaceC1364105Vn, GroupNotifyContainerFragment groupNotifyContainerFragment, View view, GroupNotifyContainerFragment groupNotifyContainerFragment2, Bundle bundle) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = groupNotifyContainerFragment;
        this.LLILZ = view;
        this.LLILZIL = groupNotifyContainerFragment2;
        this.LLILZLL = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1312805Bu(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZLLL = obj;
        C1C7U.LIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZLLL);
                    C1C7U.LIZIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
                    return objLIZLLL;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZLLL);
        } else {
            C155000ia.LIZIZ(objLIZLLL);
            C1311205Be c1311205Be = C1311205Be.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            c1311205Be.getClass();
            objLIZLLL = C1311205Be.LIZLLL(IGroupNotifyPage.class, str, this);
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1320405Es c1320405Es = new C1320405Es(objLIZLLL, null, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        this.LL = 2;
        objLIZLLL = C23250099c.LJI(this, abstractC2238408pq, c1320405Es);
        if (objLIZLLL == objLJFF) {
            C1C7U.LIZIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1$1");
        return objLIZLLL;
    }
}
