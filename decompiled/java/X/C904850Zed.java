package X;

import com.bytedance.ies.powerlist.PowerCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Zed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904850Zed implements InterfaceC904590ZeD<Enum<Object>, InterfaceC1891350zJl> {
    public final C898660ZNg LL;
    public final C904860Zee LLILLJJLI;
    public final /* synthetic */ InterfaceC904870Zef<Enum<Object>, InterfaceC1891350zJl> LLILLL;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<InterfaceC1891350zJl> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC904610ZeF
    public final InterfaceC904620ZeG<Enum<Object>> convert() {
        return new C904580ZeC(this);
    }

    @Override // X.InterfaceC904590ZeD
    public final Enum<Object> getInterceptOrdering() {
        return this.LLILLL.getInterceptOrdering();
    }

    @Override // X.InterfaceC904590ZeD, X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<InterfaceC1891350zJl>> getWithCell() {
        return this.LLILLL.getWithCell();
    }

    @Override // X.InterfaceC904590ZeD
    public final InterfaceC607860Nsm<InterfaceC1891350zJl> LLLLIILLL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC904590ZeD
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Zee] */
    public C904850Zed(final InterfaceC904870Zef<Enum<Object>, InterfaceC1891350zJl> interfaceC904870Zef) {
        this.LLILLL = interfaceC904870Zef;
        this.LL = new C898660ZNg(new AwS593S0100000_14(interfaceC904870Zef, (InterfaceC904870Zef<Enum<Object>, InterfaceC1891350zJl>) 259));
        this.LLILLJJLI = new InterfaceC607860Nsm<InterfaceC1891350zJl>() { // from class: X.0Zee
            @Override // X.InterfaceC607860Nsm
            public final InterfaceC1891350zJl LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i, String str) {
                InterfaceC904940Zem<T> interfaceC904940ZemLLLLIILLL = interfaceC904870Zef.LLLLIILLL();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<? extends C869590Y9l> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C898770ZNr(it2.next()));
                }
                return interfaceC904940ZemLLLLIILLL.LIZ(new C898770ZNr(c869590Y9l));
            }
        };
    }

    @Override // X.InterfaceC904590ZeD
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        InterfaceC904870Zef<Enum<Object>, InterfaceC1891350zJl> interfaceC904870Zef = this.LLILLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends C869590Y9l> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C898770ZNr(it2.next()));
        }
        List<C898770ZNr> listIntercept = interfaceC904870Zef.intercept(arrayList);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listIntercept, 10));
        Iterator<C898770ZNr> it3 = listIntercept.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().LIZ);
        }
        return arrayList2;
    }
}
