package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSeaPdpPreloadCardModel;
import com.tiktok.myna.preload.MynaTemplatePreloadInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.utils.SeaPdpDynamicContainerPreloadUtil$executePreload$2", f = "SeaPdpDynamicContainerPreloadUtil.kt", l = {}, m = "invokeSuspend")
public final class C1757530vpv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<ECSeaPdpPreloadCardModel> LL;
    public final /* synthetic */ AbstractC21321718cJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757530vpv(List<ECSeaPdpPreloadCardModel> list, AbstractC21321718cJ abstractC21321718cJ, InterfaceC1364105Vn<? super C1757530vpv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = abstractC21321718cJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1757530vpv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpDynamicContainerPreloadUtil@4eb4.executePreload$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<ECSeaPdpPreloadCardModel> list = this.LL;
        AbstractC21321718cJ abstractC21321718cJ = this.LLILLJJLI;
        for (ECSeaPdpPreloadCardModel eCSeaPdpPreloadCardModel : list) {
            String str = eCSeaPdpPreloadCardModel.action;
            EnumC1757490vpr enumC1757490vpr = EnumC1757490vpr.PRE_DECODE;
            int iIntValue = 0;
            if (Intrinsics.LJFF(str, enumC1757490vpr.getValue())) {
                if (Intrinsics.LJFF(eCSeaPdpPreloadCardModel.containerType, EnumC1757810vqN.MYNA.getValue())) {
                    C1758180vqy c1758180vqy = C1758180vqy.LIZ;
                    String str2 = eCSeaPdpPreloadCardModel.type;
                    String str3 = eCSeaPdpPreloadCardModel.schema;
                    Integer num = eCSeaPdpPreloadCardModel.count;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    MynaTemplatePreloadInfo mynaTemplatePreloadInfo = new MynaTemplatePreloadInfo(str2, str3, iIntValue);
                    c1758180vqy.getClass();
                    C1758180vqy.LIZLLL(enumC1757490vpr, mynaTemplatePreloadInfo, abstractC21321718cJ);
                }
            } else {
                EnumC1757490vpr enumC1757490vpr2 = EnumC1757490vpr.PRE_CREATE;
                if (Intrinsics.LJFF(str, enumC1757490vpr2.getValue()) && Intrinsics.LJFF(eCSeaPdpPreloadCardModel.containerType, EnumC1757810vqN.MYNA.getValue())) {
                    C1758180vqy c1758180vqy2 = C1758180vqy.LIZ;
                    String str4 = eCSeaPdpPreloadCardModel.type;
                    String str5 = eCSeaPdpPreloadCardModel.schema;
                    Integer num2 = eCSeaPdpPreloadCardModel.count;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    }
                    MynaTemplatePreloadInfo mynaTemplatePreloadInfo2 = new MynaTemplatePreloadInfo(str4, str5, iIntValue);
                    c1758180vqy2.getClass();
                    C1758180vqy.LIZLLL(enumC1757490vpr2, mynaTemplatePreloadInfo2, abstractC21321718cJ);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpDynamicContainerPreloadUtil@4eb4.executePreload$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
