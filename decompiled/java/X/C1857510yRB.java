package X;

import Y.AgS307S0100000_27;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.otherpage.share.api.DMMsgContent;
import com.ss.android.ugc.aweme.tako.otherpage.share.api.ShareMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM$shareMessage$2", f = "TakoMultipleSelectVM.kt", l = {325, 334}, m = "invokeSuspend")
public final class C1857510yRB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoMultipleSelectVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857510yRB(TakoMultipleSelectVM takoMultipleSelectVM, String str, Map<String, String> map, InterfaceC1364105Vn<? super C1857510yRB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoMultipleSelectVM;
        this.LLILLL = str;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1857510yRB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJJII = obj;
        C1C7U.LIZ("TakoMultipleSelectVM@4cd6.shareMessage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJJII);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoMultipleSelectVM@4cd6.shareMessage$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJJII);
        } else {
            C155000ia.LIZIZ(objLJJII);
            InterfaceC1165180gQW interfaceC1165180gQW = (InterfaceC1165180gQW) this.LLILLJJLI.LLILZIL.getValue().getOperator();
            String str = this.LLILLL;
            TakoMultipleSelectVM takoMultipleSelectVM = this.LLILLJJLI;
            takoMultipleSelectVM.getClass();
            Gson gson = C7740030o.LIZ().getGson();
            List<C326880Cre> listDQ2 = takoMultipleSelectVM.DQ2();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listDQ2, 10));
            Iterator<C326880Cre> it2 = listDQ2.iterator();
            while (it2.hasNext()) {
                Message message = it2.next().LLILLL;
                arrayList.add(new ShareMessage(message.msgId, message.selectedAnswerIndex));
            }
            String json = GsonProtectorUtils.toJson(gson, arrayList);
            TakoMultipleSelectVM takoMultipleSelectVM2 = this.LLILLJJLI;
            String str2 = this.LLILLL;
            Map<String, String> map = this.LLILZ;
            takoMultipleSelectVM2.getClass();
            Gson gson2 = C7740030o.LIZ().getGson();
            String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(takoMultipleSelectVM2.DQ2(), 3), "\n", null, null, 0, null, new AwS606S0100000_27(takoMultipleSelectVM2, 586), 30);
            Map mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJI(new Pair("share_id", str2), new Pair("user_name", TakoMultipleSelectVM.CQ2())), map);
            String strLIZIZ = "//tako/share/page";
            if (!mapLJIIL.isEmpty()) {
                String strLJJLIIIJ2 = C13LP.LJJLIIIJ(((LinkedHashMap) mapLJIIL).entrySet(), "&", null, null, 0, null, AnonymousClass0207.get$arr$(149), 30);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme:");
                sbLIZ.append("//tako/share/page");
                sbLIZ.append('?');
                sbLIZ.append(strLJJLIIIJ2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            String json2 = GsonProtectorUtils.toJson(gson2, new DMMsgContent(strLJJLIIIJ, "TikTok Tako", strLIZIZ, "Tako_sharePage_chatHistory_title", TakoMultipleSelectVM.CQ2()));
            this.LL = 1;
            objLJJII = interfaceC1165180gQW.LJJII(str, json, json2);
            if (objLJJII == objLJFF) {
                C1C7U.LIZIZ("TakoMultipleSelectVM@4cd6.shareMessage$2");
                return objLJFF;
            }
        }
        C2501109r7 c2501109r7 = new C2501109r7(new C1857520yRC(this.LLILLJJLI, null), (InterfaceC346201Wa) objLJJII, 0);
        AgS307S0100000_27 agS307S0100000_27 = new AgS307S0100000_27(this.LLILLJJLI, 34);
        this.LL = 2;
        if (c2501109r7.collect(agS307S0100000_27, this) == objLJFF) {
            C1C7U.LIZIZ("TakoMultipleSelectVM@4cd6.shareMessage$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoMultipleSelectVM@4cd6.shareMessage$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
