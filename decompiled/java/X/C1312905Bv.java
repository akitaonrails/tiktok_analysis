package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.df.GroupNotifyContainerFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05Bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.df.GroupNotifyContainerFragment$onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1", f = "GroupChatNotifySheetLauncher.kt", l = {150}, m = "invokeSuspend")
public final class C1312905Bv extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ GroupNotifyContainerFragment LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ GroupNotifyContainerFragment LLILZIL;
    public final /* synthetic */ Bundle LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312905Bv(String str, InterfaceC1364105Vn interfaceC1364105Vn, GroupNotifyContainerFragment groupNotifyContainerFragment, View view, GroupNotifyContainerFragment groupNotifyContainerFragment2, Bundle bundle) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = groupNotifyContainerFragment;
        this.LLILZ = view;
        this.LLILZIL = groupNotifyContainerFragment2;
        this.LLILZLL = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1312905Bv(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFH c1dfh = C0PEM.LIZ;
            C1312805Bu c1312805Bu = new C1312805Bu(this.LLILLJJLI, null, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, c1312805Bu);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1");
        return obj;
    }
}
