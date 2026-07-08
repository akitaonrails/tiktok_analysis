package X;

import Y.AObserverS78S0201000_19;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225740i0C extends AbstractC1225770i0F {
    public final DialogInterfaceOnDismissListenerC1225880i0Q LLJIJIL;
    public Set<String> LLJILJIL;
    public final MutableLiveData<Integer> LLJILJILJ;

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224490hyB LJJJJIZL() {
        DialogInterfaceOnDismissListenerC1225880i0Q dialogInterfaceOnDismissListenerC1225880i0Q = this.LLJIJIL;
        final int i = dialogInterfaceOnDismissListenerC1225880i0Q.LLILZLL;
        final MutableLiveData<Integer> mutableLiveData = this.LLJILJILJ;
        final Function1<Boolean, Unit> function1 = dialogInterfaceOnDismissListenerC1225880i0Q.LLJILJIL;
        return new C1225700i08(this, i, mutableLiveData, function1) { // from class: X.0hzJ
            public final int LLILZ;
            public final LiveData<Integer> LLILZIL;
            public final Function1<Boolean, Unit> LLILZLL;

            @Override // X.C1225700i08, X.InterfaceC1224490hyB
            public final void LJIJ(C1224590hyL c1224590hyL) {
                C1224780hye c1224780hyeLJIILLIIL;
                List<C1224840hyk> list;
                DialogInterfaceOnDismissListenerC1225880i0Q dialogInterfaceOnDismissListenerC1225880i0Q2;
                Function1<C1915907ev, Unit> function12;
                Object c098200Yq;
                List<String> urlList;
                Object objLJJJLL;
                Object c098200Yq2;
                IMConversation iMConversation;
                List<String> memberIdList;
                Object c098200Yq3;
                Boolean boolValueOf;
                List<String> urlList2;
                Object objLJJJLL2;
                super.LJIJ(c1224590hyL);
                if (c1224590hyL.LIZ == EnumC1227730i3P.MAIN && !c1224590hyL.LJ && c1224590hyL.LIZIZ) {
                    InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                    if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
                        ArrayList arrayList = new ArrayList();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<C1224840hyk> it2 = list.iterator();
                        while (true) {
                            Object obj = null;
                            if (!it2.hasNext()) {
                                break;
                            }
                            C1224840hyk next = it2.next();
                            Object obj2 = "";
                            if (Intrinsics.LJFF(next.LLILLL, "private")) {
                                if (arrayList.size() < 3) {
                                    String str = next.LLILZLL;
                                    UrlModel urlModel = next.LLILZIL;
                                    if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                                        obj2 = objLJJJLL;
                                    }
                                    arrayList.add(new Pair(str, obj2));
                                }
                                try {
                                    c098200Yq = Long.valueOf(CastLongProtector.parseLong(next.LLILZ));
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                    obj = c098200Yq;
                                }
                                Long l = (Long) obj;
                                if (l != null) {
                                    long jLongValue = l.longValue();
                                    linkedHashSet.add(Long.valueOf(jLongValue));
                                    arrayList2.add(Long.valueOf(jLongValue));
                                }
                            } else {
                                if (arrayList.size() < 3) {
                                    String str2 = next.LLILZLL;
                                    UrlModel urlModel2 = next.LLILZIL;
                                    if (urlModel2 != null && (urlList2 = urlModel2.getUrlList()) != null && (objLJJJLL2 = C13LP.LJJJLL(urlList2)) != null) {
                                        obj2 = objLJJJLL2;
                                    }
                                    arrayList.add(new Pair(str2, obj2));
                                }
                                try {
                                    c098200Yq2 = Long.valueOf(CastLongProtector.parseLong(next.LLILZ));
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    c098200Yq2 = new C098200Yq(th2);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                                    c098200Yq2 = null;
                                }
                                Long l2 = (Long) c098200Yq2;
                                if (l2 != null) {
                                    arrayList3.add(Long.valueOf(l2.longValue()));
                                }
                                Object obj3 = next.LLJI.get("contact");
                                if ((obj3 instanceof IMConversation) && (iMConversation = (IMConversation) obj3) != null && (memberIdList = iMConversation.getMemberIdList()) != null) {
                                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(memberIdList, 10));
                                    Iterator<String> it3 = memberIdList.iterator();
                                    while (it3.hasNext()) {
                                        try {
                                            c098200Yq3 = Long.valueOf(CastLongProtector.parseLong(it3.next()));
                                            C189200o6.m2constructorimpl(c098200Yq3);
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                            c098200Yq3 = new C098200Yq(th3);
                                            C189200o6.m2constructorimpl(c098200Yq3);
                                        }
                                        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                                            c098200Yq3 = null;
                                        }
                                        Long l3 = (Long) c098200Yq3;
                                        if (l3 != null) {
                                            boolValueOf = Boolean.valueOf(linkedHashSet.add(Long.valueOf(l3.longValue())));
                                        } else {
                                            boolValueOf = null;
                                        }
                                        arrayList4.add(boolValueOf);
                                    }
                                }
                            }
                        }
                        AbstractC1225780i0G abstractC1225780i0GLJJJJLL = this.LLILLJJLI.LJJJJLL();
                        if ((abstractC1225780i0GLJJJJLL instanceof DialogInterfaceOnDismissListenerC1225880i0Q) && (dialogInterfaceOnDismissListenerC1225880i0Q2 = (DialogInterfaceOnDismissListenerC1225880i0Q) abstractC1225780i0GLJJJJLL) != null && (function12 = dialogInterfaceOnDismissListenerC1225880i0Q2.LLJ) != null) {
                            function12.invoke(new C1915907ev(C13LP.LLIIII(linkedHashSet), arrayList2, arrayList3, arrayList));
                        }
                    }
                    Function1<Boolean, Unit> function13 = this.LLILZLL;
                    if (function13 != null) {
                        function13.invoke(Boolean.TRUE);
                    }
                }
            }

            @Override // X.C1225700i08
            public final void LJJJJIZL(InterfaceC1226510i1R interfaceC1226510i1R) {
                this.LL.LIZ = interfaceC1226510i1R;
                AbsContactSelectorFragment fragment = interfaceC1226510i1R.getFragment();
                if (fragment != null) {
                    this.LLILZIL.observe(fragment, new AObserverS78S0201000_19(interfaceC1226510i1R, fragment, Math.max(this.LLILZ, 1), 2));
                }
            }

            {
                super(this, this.LLJIJIL.LLJJIJIL);
                this.LLILZ = i;
                this.LLILZIL = mutableLiveData;
                this.LLILZLL = function1;
            }
        };
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224330hxv LJJJJJL() {
        final C1224340hxw c1224340hxw = this.LLJIJIL.LLJJIJIIJIL;
        return new C1225800i0I(c1224340hxw) { // from class: X.0i0D
            @Override // X.C1225800i0I, X.InterfaceC1224330hxv
            public final boolean LJIIJJI(C1224840hyk c1224840hyk) {
                IMConversation iMConversation;
                List<String> memberIdList;
                C1225740i0C c1225740i0C = this.LLILZ;
                c1225740i0C.getClass();
                if (c1224840hyk.LLJILJIL) {
                    return false;
                }
                if (Intrinsics.LJFF(c1224840hyk.LLILLL, "private")) {
                    if (c1225740i0C.LLJILJIL.size() < c1225740i0C.LLJIJIL.LLILZIL || c1225740i0C.LLJILJIL.contains(c1224840hyk.LLILZ)) {
                        return false;
                    }
                    DialogInterfaceOnDismissListenerC1225880i0Q dialogInterfaceOnDismissListenerC1225880i0Q = c1225740i0C.LLJIJIL;
                    Function1<String, Unit> function1 = dialogInterfaceOnDismissListenerC1225880i0Q.LLJI;
                    int i = dialogInterfaceOnDismissListenerC1225880i0Q.LLILZIL;
                    function1.invoke(C20642515q3.LJ(2131755978, i, Integer.valueOf(i)));
                } else {
                    int size = c1225740i0C.LLJILJIL.size();
                    DialogInterfaceOnDismissListenerC1225880i0Q dialogInterfaceOnDismissListenerC1225880i0Q2 = c1225740i0C.LLJIJIL;
                    int i2 = dialogInterfaceOnDismissListenerC1225880i0Q2.LLILZIL;
                    if (size >= i2) {
                        dialogInterfaceOnDismissListenerC1225880i0Q2.LLJI.invoke(C20642515q3.LJ(2131755979, i2, Integer.valueOf(i2)));
                    } else {
                        Object obj = c1224840hyk.LLJI.get("contact");
                        if (!(obj instanceof IMConversation) || (iMConversation = (IMConversation) obj) == null || (memberIdList = iMConversation.getMemberIdList()) == null || c1225740i0C.LLJILJIL.size() + memberIdList.size() <= c1225740i0C.LLJIJIL.LLILZIL) {
                            return false;
                        }
                        Iterator<String> it2 = memberIdList.iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            if (!c1225740i0C.LLJILJIL.contains(it2.next())) {
                                i3++;
                            }
                        }
                        if (c1225740i0C.LLJILJIL.size() + i3 <= c1225740i0C.LLJIJIL.LLILZIL) {
                            return false;
                        }
                        DialogInterfaceOnDismissListenerC1225880i0Q dialogInterfaceOnDismissListenerC1225880i0Q3 = c1225740i0C.LLJIJIL;
                        Function1<String, Unit> function12 = dialogInterfaceOnDismissListenerC1225880i0Q3.LLJI;
                        int i4 = dialogInterfaceOnDismissListenerC1225880i0Q3.LLILZIL;
                        function12.invoke(C20642515q3.LJ(2131755979, i4, Integer.valueOf(i4)));
                    }
                }
                return true;
            }

            @Override // X.C1225800i0I, X.InterfaceC1224250hxn
            public final void LJJJ(C1224790hyf c1224790hyf) {
                IMConversation iMConversation;
                List<String> memberIdList;
                long jCurrentTimeMillis = System.currentTimeMillis();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList = new ArrayList();
                List<C1224840hyk> list = c1224790hyf.LIZIZ;
                if (list != null) {
                    for (C1224840hyk c1224840hyk : list) {
                        if (Intrinsics.LJFF(c1224840hyk.LLILLL, "private")) {
                            linkedHashSet.add(c1224840hyk.LLILZ);
                        } else {
                            arrayList.add(c1224840hyk.LLILZ);
                            Object obj = c1224840hyk.LLJI.get("contact");
                            if ((obj instanceof IMConversation) && (iMConversation = (IMConversation) obj) != null && (memberIdList = iMConversation.getMemberIdList()) != null) {
                                linkedHashSet.addAll(memberIdList);
                            }
                        }
                    }
                }
                C1225740i0C c1225740i0C = this.LLILZ;
                c1225740i0C.LLJILJIL = linkedHashSet;
                c1225740i0C.LLJILJILJ.postValue(Integer.valueOf(linkedHashSet.size()));
                Function2<String, String, Unit> function2 = this.LLILZ.LLJIJIL.LLJIJIL;
                if (function2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update num cost ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ.append("ms");
                    function2.invoke("SelectLiveVisibleScopeTemplate", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        };
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224410hy3 LJJJJL() {
        final C1224860hym c1224860hym = this.LLJIJIL.LLJJJ;
        return new C1225710i09(c1224860hym) { // from class: X.0i0B
            @Override // X.C1225710i09, X.InterfaceC1224410hy3
            public final void LJIL(EnumC1224880hyo enumC1224880hyo) {
                super.LJIL(enumC1224880hyo);
                Function1<Boolean, Unit> function1 = this.LLILZ.LLJIJIL.LLJILJIL;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
            }
        };
    }

    @Override // X.AbstractC1225770i0F
    public final C1224950hyv LJJJJLI() {
        return new C1225330hzX(this, (C1225890i0R) this.LLJIJIL.LLJJIJI.LIZIZ);
    }

    @Override // X.AbstractC1225770i0F
    public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
        return this.LLJIJIL;
    }

    public C1225740i0C(DialogInterfaceOnDismissListenerC1225880i0Q dialogInterfaceOnDismissListenerC1225880i0Q) {
        super(dialogInterfaceOnDismissListenerC1225880i0Q);
        this.LLJIJIL = dialogInterfaceOnDismissListenerC1225880i0Q;
        this.LLJILJIL = new LinkedHashSet();
        this.LLJILJILJ = new MutableLiveData<>(0);
    }
}
