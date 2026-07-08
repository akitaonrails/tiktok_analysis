package X;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatHistorySearchAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iNT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ui.cell.delegate.phase2.IMSearchMessageHistoryCellDelegate$cellClickHandler2$1$1", f = "IMSearchMessageHistoryCellDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1240170iNT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1240110iNN LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240170iNT(C1240110iNN c1240110iNN, View view, InterfaceC1364105Vn<? super C1240170iNT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1240110iNN;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1240170iNT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Map<String, String> map;
        C1C7U.LIZ("IMSearchMessageHistoryCellDelegate@1106.cellClickHandler2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLIZLLL = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZLLL(this.LL.LIZLLL);
        if (c869590Y9lLIZLLL != null) {
            long index = c869590Y9lLIZLLL.getIndex();
            int msgType = c869590Y9lLIZLLL.getMsgType();
            IIMChatHistorySearchAnalytics iIMChatHistorySearchAnalytics = (IIMChatHistorySearchAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMChatHistorySearchAnalytics.class, false, false, false, 14, null);
            if (iIMChatHistorySearchAnalytics != null && (map = this.LL.LJIILIIL) != null) {
                iIMChatHistorySearchAnalytics.LIZ("ttsocial_chat_search_result_cell_click", new LinkedHashMap(map), C0I0B.LJFF.LIZIZ());
            }
            C1240110iNN c1240110iNN = this.LL;
            if (c1240110iNN.LJI) {
                C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
                View view = this.LLILLJJLI;
                C0Y8T c0y8t = c1240110iNN.LJII;
                Long lLJFF = C2286608xc.LJFF(index);
                C1240110iNN c1240110iNN2 = this.LL;
                String str = c1240110iNN2.LJIIIZ;
                EnumC1240610iOB enumC1240610iOB = EnumC1240610iOB.MESSAGE;
                EnumC1240620iOC enumC1240620iOC = c1240110iNN2.LIZIZ;
                if (msgType != 7) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1240230iNZ.LIZLLL(view, c0y8t, null, lLJFF, str, enumC1240610iOB, enumC1240620iOC, z2);
            } else {
                C1240230iNZ c1240230iNZ2 = C1240230iNZ.LIZIZ;
                View view2 = this.LLILLJJLI;
                IMUser iMUser = c1240110iNN.LJIIJ;
                C0Y8T c0y8t2 = c1240110iNN.LJII;
                Long lLJFF2 = C2286608xc.LJFF(index);
                C1240110iNN c1240110iNN3 = this.LL;
                String str2 = c1240110iNN3.LJIIIZ;
                EnumC1240610iOB enumC1240610iOB2 = EnumC1240610iOB.MESSAGE;
                EnumC1240620iOC enumC1240620iOC2 = c1240110iNN3.LIZIZ;
                if (msgType != 7) {
                    z = true;
                } else {
                    z = false;
                }
                c1240230iNZ2.LIZJ(view2, iMUser, c0y8t2, null, lLJFF2, str2, enumC1240610iOB2, enumC1240620iOC2, z);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMSearchMessageHistoryCellDelegate@1106.cellClickHandler2$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMSearchMessageHistoryCellDelegate@1106.cellClickHandler2$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
