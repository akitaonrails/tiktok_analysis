package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0hwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.invitepeople.LiveInviteSearchDataSourceProtocol$onSearch$2$1", f = "LiveInviteSearchDataSourceProtocol.kt", l = {}, m = "invokeSuspend")
public final class C1223690hwt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr>, Object> {
    public final /* synthetic */ C1224940hyu LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<C1224840hyk> LLILLL;
    public final /* synthetic */ List<C1224840hyk> LLILZ;
    public final /* synthetic */ List<C1224840hyk> LLILZIL;
    public final /* synthetic */ List<C1224840hyk> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223690hwt(C1224940hyu c1224940hyu, String str, List<C1224840hyk> list, List<C1224840hyk> list2, List<C1224840hyk> list3, List<C1224840hyk> list4, InterfaceC1364105Vn<? super C1223690hwt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1224940hyu;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = list3;
        this.LLILZLL = list4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1223690hwt(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveInviteSearchDataSourceProtocol@86f8.onSearch$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1224940hyu c1224940hyu = this.LL;
        String str = this.LLILLJJLI;
        List<C1224840hyk> list = this.LLILLL;
        List<C1224840hyk> list2 = this.LLILZ;
        List<C1224840hyk> list3 = this.LLILZIL;
        List<C1224840hyk> list4 = this.LLILZLL;
        c1224940hyu.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<C1224840hyk> it2 = list.iterator();
        while (true) {
            String str2 = "";
            if (!it2.hasNext()) {
                break;
            }
            C1224840hyk next = it2.next();
            String str3 = next.LLILZLL;
            if (str3 != null) {
                str2 = str3;
            }
            Locale locale = Locale.ROOT;
            if (a0.LJJIIZI(str2.toLowerCase(locale), str.toLowerCase(locale), false)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C1224840hyk c1224840hyk : list2) {
            String str4 = c1224840hyk.LLILZLL;
            if (str4 == null) {
                str4 = "";
            }
            Locale locale2 = Locale.ROOT;
            if (a0.LJJIIZI(str4.toLowerCase(locale2), str.toLowerCase(locale2), false)) {
                arrayList2.add(c1224840hyk);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (C1224840hyk c1224840hyk2 : list3) {
            String str5 = c1224840hyk2.LLILZLL;
            if (str5 == null) {
                str5 = "";
            }
            Locale locale3 = Locale.ROOT;
            if (a0.LJJIIZI(str5.toLowerCase(locale3), str.toLowerCase(locale3), false)) {
                arrayList3.add(c1224840hyk2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (C1224840hyk c1224840hyk3 : list4) {
            String str6 = c1224840hyk3.LLILZLL;
            if (str6 == null) {
                str6 = "";
            }
            Locale locale4 = Locale.ROOT;
            if (a0.LJJIIZI(str6.toLowerCase(locale4), str.toLowerCase(locale4), false)) {
                arrayList4.add(c1224840hyk3);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList5.add(C1224940hyu.LJJJJIZL(c1224940hyu, (C1224840hyk) it3.next(), str, c1224940hyu.LJJJJJ()));
        }
        ArrayList<C1224840hyk> arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList6.add(C1224940hyu.LJJJJIZL(c1224940hyu, (C1224840hyk) it4.next(), str, c1224940hyu.LJJJJJ()));
        }
        ArrayList<C1224840hyk> arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            arrayList7.add(C1224940hyu.LJJJJIZL(c1224940hyu, (C1224840hyk) it5.next(), str, c1224940hyu.LJJJJJ()));
        }
        ArrayList<C1224840hyk> arrayList8 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            arrayList8.add(C1224940hyu.LJJJJIZL(c1224940hyu, (C1224840hyk) it6.next(), str, c1224940hyu.LJJJJJ()));
        }
        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList9.add(((C1224840hyk) it7.next()).LLILZ);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList9);
        ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList10.add(((C1224840hyk) it8.next()).LLILZ);
        }
        Set setLLIIJI2 = C13LP.LLIIJI(arrayList10);
        ArrayList arrayList11 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            arrayList11.add(((C1224840hyk) it9.next()).LLILZ);
        }
        Set setLLIIJI3 = C13LP.LLIIJI(arrayList11);
        ArrayList arrayList12 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it10 = arrayList3.iterator();
        while (it10.hasNext()) {
            arrayList12.add(((C1224840hyk) it10.next()).LLILZ);
        }
        Set setLLIIJI4 = C13LP.LLIIJI(arrayList12);
        Set<String> set = c1224940hyu.LLILZIL;
        set.clear();
        set.addAll(setLLIIJI);
        ArrayList arrayList13 = new ArrayList();
        arrayList13.addAll(arrayList5);
        for (C1224840hyk c1224840hyk4 : arrayList6) {
            if (!c1224940hyu.LLILZIL.contains(c1224840hyk4.LLILZ)) {
                arrayList13.add(c1224840hyk4);
            }
        }
        c1224940hyu.LLILZIL.addAll(setLLIIJI2);
        for (C1224840hyk c1224840hyk5 : arrayList7) {
            if (!c1224940hyu.LLILZIL.contains(c1224840hyk5.LLILZ)) {
                arrayList13.add(c1224840hyk5);
            }
        }
        c1224940hyu.LLILZIL.addAll(setLLIIJI3);
        for (C1224840hyk c1224840hyk6 : arrayList8) {
            if (!c1224940hyu.LLILZIL.contains(c1224840hyk6.LLILZ)) {
                arrayList13.add(c1224840hyk6);
            }
        }
        c1224940hyu.LLILZIL.addAll(setLLIIJI4);
        ArrayList arrayList14 = new ArrayList();
        arrayList14.addAll(arrayList13);
        C1223660hwq c1223660hwq = new C1223660hwq(arrayList14, false, "remote_search_cursor");
        C1C7U.LIZIZ("LiveInviteSearchDataSourceProtocol@86f8.onSearch$2$1");
        return c1223660hwq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
