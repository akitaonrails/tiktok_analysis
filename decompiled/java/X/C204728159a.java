package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.popup.dynamic.initialize.PopupMetaInfo;
import com.ss.android.ugc.feed.platform.popup.exp.DynamicPopupExp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.159a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.popup.dynamic.initialize.DynamicPopupInitializer$initialize$1$2", f = "DynamicPopupInitializer.kt", l = {42}, m = "invokeSuspend")
public final class C204728159a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<PopupMetaInfo> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204728159a(List<PopupMetaInfo> list, InterfaceC1364105Vn<? super C204728159a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C204728159a(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        List<String> list;
        C1C7U.LIZ("DynamicPopupInitializer@45a5.initialize$1$2");
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
            DynamicPopupExp dynamicPopupExp = (DynamicPopupExp) C204730159c.LIZ.getValue();
            if (dynamicPopupExp != null) {
                j = dynamicPopupExp.preloadImgColdStartDelay;
            } else {
                j = 5;
            }
            long j2 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j2, this) == objLJFF) {
                C1C7U.LIZIZ("DynamicPopupInitializer@45a5.initialize$1$2");
                return objLJFF;
            }
        }
        for (PopupMetaInfo popupMetaInfo : this.LLILLJJLI) {
            if (popupMetaInfo != null && (list = popupMetaInfo.preloadImageList) != null) {
                for (String str : list) {
                    if (str != null && str.length() != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("preloadImg:key=");
                        sbLIZ.append(popupMetaInfo.popupKey);
                        sbLIZ.append(" url=");
                        sbLIZ.append(str);
                        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                        C844470XAv.LIZ.getClass();
                        c1331670kl3LJIIIZ.LJJIJL(C844470XAv.LIZ());
                        c1331670kl3LJIIIZ.LJJIFFI();
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicPopupInitializer@45a5.initialize$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
