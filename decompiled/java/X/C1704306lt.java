package X;

import Y.ARunnableS102S0100000_2;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1704306lt implements InterfaceC882100Yj2 {
    public final C1491005sa LL = C1491005sa.LIZ;
    public final String LLILLJJLI = "ChatListChatHintUpdater";
    public final String LLILLL = "chat_hint_updater";
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1002));
    public final boolean LLILZIL = true;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(938));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(939));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(936));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(937));
    public final BPEAHandler LLJI = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU LJIILL(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, AbstractC1491605sg abstractC1491605sg, C1490405sU c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILLIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, Collection<? extends InterfaceC1491305sd> collection2, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIZILJ(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return (C884710YnF) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        ((ConcurrentHashMap) this.LLJ.getValue()).clear();
        ((ConcurrentHashMap) this.LLIZLLLIL.getValue()).clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLILZLL.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJ() {
        return (CopyOnWriteArrayList) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJ().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJ(final InterfaceC879010Ye3 interfaceC879010Ye3) {
        String str = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindPage key=");
        sbLIZ.append(interfaceC879010Ye3);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str);
        Observer observer = new Observer() { // from class: X.06kp
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                InterfaceC879010Ye3 interfaceC879010Ye32 = interfaceC879010Ye3;
                C1729806q0.LIZ(interfaceC879010Ye32, new C1697606ko(this, (List) obj, interfaceC879010Ye32, null));
            }
        };
        C786410Ut5.LJJZZIII(this.LLJI, new ARunnableS102S0100000_2(observer, 50));
        ((ConcurrentHashMap) this.LLIZLLLIL.getValue()).put(interfaceC879010Ye3, observer);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        Observer observer = (Observer) ((ConcurrentHashMap) this.LLIZLLLIL.getValue()).remove(interfaceC879010Ye3);
        if (observer != null) {
            C786410Ut5.LJJZZIII(this.LLJI, new ARunnableS102S0100000_2(observer, 51));
        }
        ((ConcurrentHashMap) this.LLJ.getValue()).remove(interfaceC879010Ye3);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJ().addAll(list);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
        Map map;
        if ((interfaceC1491305sd instanceof AnonymousClass0617) && interfaceC1491305sd != null && (map = (Map) ((ConcurrentHashMap) this.LLJ.getValue()).get(interfaceC879010Ye3)) != null) {
            map.remove(interfaceC1491305sd);
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, android.text.SpannableString, java.lang.Object] */
    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        C0Y8T c0y8t;
        Object objPutIfAbsent;
        C1704406lu c1704406lu = C1704406lu.LIZ;
        if (!Intrinsics.LJFF(abstractC1491605sg, c1704406lu)) {
            return null;
        }
        InterfaceC1490905sZ<?> interfaceC1490905sZ = c879540Yeu.LIZ;
        if (Intrinsics.LJFF(interfaceC1490905sZ, C1606306Qr.INSTANCE)) {
            InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
            if (!(interfaceC1491305sd instanceof AnonymousClass0617) || interfaceC1491305sd == null) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LLJ.getValue();
            Object linkedHashMap = concurrentHashMap.get(interfaceC879010Ye3);
            if (linkedHashMap == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC879010Ye3, (linkedHashMap = new LinkedHashMap()))) != null) {
                linkedHashMap = objPutIfAbsent;
            }
            ?? r0 = ((Map) linkedHashMap).get(interfaceC1491305sd);
            if (r0 == 0) {
                return null;
            }
            if (c1490405sU == null) {
                return new C1490405sU<>(c1704406lu, r0);
            }
            c1490405sU.LIZIZ = r0;
            return c1490405sU;
        }
        if (!Intrinsics.LJFF(interfaceC1490905sZ, C882110Yj3.INSTANCE)) {
            return null;
        }
        T t = c879540Yeu.LIZJ;
        if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null || !C882340YjQ.LJFF(c0y8t)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(C1383370m6R.LJIIJ(2131827469));
        sbLIZ.append("] ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ?? spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C1383370m6R.LJFF(R.attr.a04)), 0, strLIZIZ.length(), 33);
        if (c1490405sU == null) {
            return new C1490405sU<>(c1704406lu, spannableString);
        }
        c1490405sU.LIZIZ = spannableString;
        return c1490405sU;
    }
}
