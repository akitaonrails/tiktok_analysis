package X;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS35S0310000_14;
import njp.a;

/* JADX INFO: renamed from: X.0You, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestBatchActionHandler$batchDelete$1$1", f = "MessageRequestBatchActionHandler.kt", l = {}, m = "invokeSuspend")
public final class C885740You extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C885760Yow LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885740You(C885760Yow c885760Yow, boolean z, List<String> list, InterfaceC1364105Vn<? super C885740You> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c885760Yow;
        this.LLILLJJLI = z;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885740You(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        int i;
        C1C7U.LIZ("MessageRequestBatchActionHandler@3f1f.batchDelete$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            C885760Yow c885760Yow = this.LL;
            boolean z = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            if (c885760Yow.LIZ.a1() == EnumC871430YGn.ALL_RISKY) {
                if (z) {
                    i = 2131846447;
                } else {
                    i = 2131846448;
                }
            } else if (z) {
                i = 2131846445;
            } else {
                i = 2131846446;
            }
            if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZIZ) != null) {
                C632670Orh.LIZIZ(activityLIZIZ, new C19719212De(-1562325482, new C1054010dXD(i, activityLIZIZ, c885760Yow, z, list), true));
            } else {
                C1397580mTM c1397580mTM = new C1397580mTM(activityLIZIZ);
                c1397580mTM.LJFF(i);
                c1397580mTM.LIZ(2131846444);
                C985403tE.LIZ(c1397580mTM, new AwS35S0310000_14(activityLIZIZ, c885760Yow, list, z, 1));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.batchDelete$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
