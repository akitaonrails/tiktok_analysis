package X;

import android.app.Activity;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS2S1410000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Yor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestBatchActionHandler$doBatchAcceptToPrimary$1", f = "MessageRequestBatchActionHandler.kt", l = {}, m = "invokeSuspend")
public final class C885710Yor extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ C885760Yow LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Activity LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885710Yor(List<String> list, C885760Yow c885760Yow, boolean z, boolean z2, Activity activity, InterfaceC1364105Vn<? super C885710Yor> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c885760Yow;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885710Yor(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Yov] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final Long lLJFF;
        C1C7U.LIZ("MessageRequestBatchActionHandler@3f1f.doBatchAcceptToPrimary$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final List<String> listLJI = this.LL;
        if (listLJI == null) {
            listLJI = this.LLILLJJLI.LIZ.LJI(false);
        }
        if (listLJI.isEmpty()) {
            this.LLILLJJLI.LIZ.Ka("");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.doBatchAcceptToPrimary$1");
            return unit;
        }
        if (listLJI.size() > 99) {
            this.LLILLJJLI.LIZ.Ka(C20642515q3.LJI(2131830238));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.doBatchAcceptToPrimary$1");
            return unit2;
        }
        if (this.LLILLL) {
            lLJFF = C2286608xc.LJFF(SystemClock.elapsedRealtime());
        } else {
            lLJFF = null;
        }
        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
        for (String str : listLJI) {
            arrayList.add(new Pair(C2286608xc.LJFF(C0YNP.LJII(str)), str));
        }
        final List<AbstractC885540Yoa<?>> listLIZ = this.LLILLJJLI.LIZ.LIZ();
        final String strLIZLLL = this.LLILLJJLI.LIZ.LIZLLL();
        InterfaceC878180Yci interfaceC878180YciLIZ = C876470YZx.LIZ();
        EnumC868530Y5j enumC868530Y5j = EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_PRIMARY;
        final C885760Yow c885760Yow = this.LLILLJJLI;
        final Activity activity = this.LLILZIL;
        final boolean z = this.LLILZ;
        interfaceC878180YciLIZ.LJIIJJI(arrayList, enumC868530Y5j, new InterfaceC863600XuI<List<? extends String>>() { // from class: X.0Yov
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                c885760Yow.LIZ.Ka("");
                Long l = lLJFF;
                if (l != null) {
                    C885760Yow c885760Yow2 = c885760Yow;
                    List<Pair<Long, String>> list = arrayList;
                    long jLongValue = l.longValue();
                    C885310YoD c885310YoD = C885310YoD.LIZ;
                    String strLIZIZ = c885760Yow2.LIZ.LIZIZ();
                    int size = list.size();
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
                    c885310YoD.getClass();
                    C885310YoD.LJJIII(size, strLIZIZ, jElapsedRealtime);
                }
                C885760Yow c885760Yow3 = c885760Yow;
                Activity activity2 = activity;
                List<String> list2 = listLJI;
                boolean z2 = z;
                String str2 = strLIZLLL;
                c885760Yow3.getClass();
                C0CNO.LIZLLL(0L, new C891930Yyt(list2, activity2, c885760Yow3, z2, str2));
            }

            @Override // X.InterfaceC863600XuI
            public final void onSuccess(List<? extends String> list) {
                List<? extends String> list2 = list;
                c885760Yow.LIZ.Ka("");
                Long l = lLJFF;
                if (l != null) {
                    C885760Yow c885760Yow2 = c885760Yow;
                    List<Pair<Long, String>> list3 = arrayList;
                    long jLongValue = l.longValue();
                    C885310YoD c885310YoD = C885310YoD.LIZ;
                    String strLIZIZ = c885760Yow2.LIZ.LIZIZ();
                    int size = list3.size();
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
                    c885310YoD.getClass();
                    C885310YoD.LJJIII(size, strLIZIZ, jElapsedRealtime);
                }
                if (list2 != null && list2.size() == arrayList.size()) {
                    C885760Yow c885760Yow3 = c885760Yow;
                    Activity activity2 = activity;
                    List<String> list4 = listLJI;
                    List<AbstractC885540Yoa<?>> list5 = listLIZ;
                    boolean z2 = z;
                    String str2 = strLIZLLL;
                    c885760Yow3.getClass();
                    C0CNO.LIZLLL(0L, new AwS2S1410000_14((List) list4, (List<String>) activity2, (Activity) c885760Yow3, (C885760Yow) z2, (boolean) list5, (List<? extends AbstractC885540Yoa<?>>) str2, (String) 0));
                    return;
                }
                List<String> list6 = listLJI;
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : list6) {
                    if (list2 == null || !list2.contains(str3)) {
                        arrayList2.add(str3);
                    }
                }
                C885760Yow c885760Yow4 = c885760Yow;
                Activity activity3 = activity;
                boolean z3 = z;
                String str4 = strLIZLLL;
                c885760Yow4.getClass();
                C0CNO.LIZLLL(0L, new C891930Yyt(arrayList2, activity3, c885760Yow4, z3, str4));
            }
        });
        if (this.LL == null) {
            C885260Yo8.LIZIZ(listLJI, listLIZ, this.LLILZ, false, strLIZLLL, this.LLILLJJLI.LIZ.LIZIZ(), this.LLILLJJLI.LIZ.a1());
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.doBatchAcceptToPrimary$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
