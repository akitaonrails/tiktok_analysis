package X;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.chathint.ChatListChatHintUpdater$getApplyInfoObserver$1$1", f = "ChatListChatHintUpdater.kt", l = {}, m = "invokeSuspend")
public final class C1697606ko extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1704306lt LL;
    public final /* synthetic */ List<Long> LLILLJJLI;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697606ko(C1704306lt c1704306lt, List<Long> list, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1364105Vn<? super C1697606ko> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1704306lt;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC879010Ye3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1697606ko(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.StringBuilder] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        ?? LIZIZ;
        int iLIZJ;
        AbstractC1387200mCc abstractC1387200mCcLJFF;
        Activity activityLIZIZ;
        Object objPutIfAbsent;
        C1C7U.LIZ("ChatListChatHintUpdater@4eb2.getApplyInfoObserver$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newApplyComes size=");
        List<Long> list = this.LLILLJJLI;
        if (list != null) {
            numLJ = C2286608xc.LJ(list.size());
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        sbLIZ.append(", page=");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LL.LLJ.getValue();
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        Object linkedHashMap = concurrentHashMap.get(interfaceC879010Ye3);
        if (linkedHashMap == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC879010Ye3, (linkedHashMap = new LinkedHashMap()))) != null) {
            linkedHashMap = objPutIfAbsent;
        }
        Map map = (Map) linkedHashMap;
        ArrayList arrayList = new ArrayList();
        List<Long> list2 = this.LLILLJJLI;
        if (list2 != null) {
            C1704306lt c1704306lt = this.LL;
            Iterator<Long> it2 = list2.iterator();
            while (it2.hasNext()) {
                long jLongValue = it2.next().longValue();
                AnonymousClass0617 anonymousClass0617 = new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, String.valueOf(jLongValue));
                C0Z2V.LIZ.getClass();
                if (C0ZFW.LIZ.LJIIJJI(String.valueOf(jLongValue)) && (iLIZJ = C0Z5O.LIZ.LIZJ(jLongValue)) > 0 && (abstractC1387200mCcLJFF = C1906580ziK.LJFF()) != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('[');
                    sbLIZ2.append(activityLIZIZ.getResources().getQuantityString(2131755236, iLIZJ, Integer.valueOf(iLIZJ)));
                    sbLIZ2.append("] ");
                    LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, activityLIZIZ);
                    if (numLIZJ != null) {
                        int iIntValue = numLIZJ.intValue();
                        SpannableString spannableString = new SpannableString(LIZIZ);
                        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, LIZIZ.length(), 33);
                        C786410Ut5.p2(spannableString, new C444920HcY(51, false), 0, LIZIZ.length(), 33);
                        LIZIZ = spannableString;
                    }
                } else {
                    LIZIZ = "";
                }
                map.put(anonymousClass0617, LIZIZ);
                String str2 = c1704306lt.LLILLJJLI;
                ?? LIZ = C2188811AlT.LIZ();
                LIZ.append("newApplyComes shortId=");
                LIZ.append(jLongValue);
                LIZ.append(", chatHint=");
                LIZ.append(LIZIZ);
                C2188811AlT.LIZIZ(LIZ);
                C309160C9y.LIZLLL(str2);
                arrayList.add(anonymousClass0617);
            }
        }
        CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJIJJ = this.LL.LJIJJ();
        InterfaceC879010Ye3 interfaceC879010Ye32 = this.LLILLL;
        C1704306lt c1704306lt2 = this.LL;
        Iterator<InterfaceC1482905rH> it3 = copyOnWriteArrayListLJIJJ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZ(interfaceC879010Ye32, arrayList, c1704306lt2.LIZIZ(), c1704306lt2.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListChatHintUpdater@4eb2.getApplyInfoObserver$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
