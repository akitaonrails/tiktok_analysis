package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.common.model.GroupLayoutDataRequestBody;
import com.ss.android.ugc.aweme.im.common.model.GroupLayoutDataResponse;
import com.ss.android.ugc.aweme.im.common.model.QRCodeGroupChatLayout;
import com.ss.android.ugc.aweme.im.common.model.QRCodeGroupChatLayoutOpt;
import com.ss.android.ugc.aweme.msg.qrcode.QRGroupCreationMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS608S0100000_29;
import njp.a;

/* JADX INFO: renamed from: X.0mpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.msg.qrcode.QRGroupCreationMessageVM$tryGetLayoutData$1", f = "QRGroupCreationMessageVM.kt", l = {215, 219, 224}, m = "invokeSuspend")
public final class C1411140mpE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ QRGroupCreationMessageVM LLILLL;
    public final /* synthetic */ InterfaceC1409110mlx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411140mpE(String str, QRGroupCreationMessageVM qRGroupCreationMessageVM, InterfaceC1409110mlx interfaceC1409110mlx, InterfaceC1364105Vn<? super C1411140mpE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = qRGroupCreationMessageVM;
        this.LLILZ = interfaceC1409110mlx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1411140mpE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        QRCodeGroupChatLayout qRCodeGroupChatLayout;
        C1C7U.LIZ("QRGroupCreationMessageVM@baf9.tryGetLayoutData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("QRGroupCreationMessageVM@baf9.tryGetLayoutData$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(this.LLILLJJLI);
            if (c0y8tLJIL == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("QRGroupCreationMessageVM@baf9.tryGetLayoutData$1");
                return unit2;
            }
            GroupLayoutDataRequestBody groupLayoutDataRequestBody = new GroupLayoutDataRequestBody(C2286608xc.LJFF(c0y8tLJIL.getConversationShortId()), new QRCodeGroupChatLayoutOpt(true, true, true));
            this.LL = 1;
            obj = C1477105qL.LIZJ().getGroupLayout("application/json", groupLayoutDataRequestBody, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("QRGroupCreationMessageVM@baf9.tryGetLayoutData$1");
                return objLJFF;
            }
        }
        GroupLayoutDataResponse groupLayoutDataResponse = (GroupLayoutDataResponse) obj;
        if (groupLayoutDataResponse != null && groupLayoutDataResponse.status_code == 0 && (qRCodeGroupChatLayout = groupLayoutDataResponse.layout) != null) {
            QRGroupCreationMessageVM qRGroupCreationMessageVM = this.LLILLL;
            qRGroupCreationMessageVM.LLILZLL = qRCodeGroupChatLayout;
            ((Keva) qRGroupCreationMessageVM.LL.getValue()).storeString(qRGroupCreationMessageVM.xQ2(), GsonProtectorUtils.toJson((Gson) qRGroupCreationMessageVM.LLILZIL.getValue(), qRCodeGroupChatLayout));
            QRGroupCreationMessageVM qRGroupCreationMessageVM2 = this.LLILLL;
            EnumC1411170mpH enumC1411170mpH = EnumC1411170mpH.LOAD_SUCCESS;
            qRGroupCreationMessageVM2.getClass();
            qRGroupCreationMessageVM2.setState(new AwS608S0100000_29(enumC1411170mpH, 548));
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1409100mlw c1409100mlw = new C1409100mlw(this.LLILZ, groupLayoutDataResponse, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1409100mlw) == objLJFF) {
                C1C7U.LIZIZ("QRGroupCreationMessageVM@baf9.tryGetLayoutData$1");
                return objLJFF;
            }
        } else {
            QRGroupCreationMessageVM qRGroupCreationMessageVM3 = this.LLILLL;
            EnumC1411170mpH enumC1411170mpH2 = EnumC1411170mpH.LOAD_FAIL;
            qRGroupCreationMessageVM3.getClass();
            qRGroupCreationMessageVM3.setState(new AwS608S0100000_29(enumC1411170mpH2, 548));
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C1409090mlv c1409090mlv = new C1409090mlv(this.LLILZ, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq2, c1409090mlv) == objLJFF) {
                C1C7U.LIZIZ("QRGroupCreationMessageVM@baf9.tryGetLayoutData$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("QRGroupCreationMessageVM@baf9.tryGetLayoutData$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
