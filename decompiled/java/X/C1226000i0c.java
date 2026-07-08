package X;

import Y.AObserverS78S0201000_19;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226000i0c extends AbstractC1225770i0F {
    public final DialogInterfaceOnDismissListenerC1226010i0d LLJIJIL;
    public Set<String> LLJILJIL;
    public final MutableLiveData<Integer> LLJILJILJ;

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224490hyB LJJJJIZL() {
        DialogInterfaceOnDismissListenerC1226010i0d dialogInterfaceOnDismissListenerC1226010i0d = this.LLJIJIL;
        final int i = dialogInterfaceOnDismissListenerC1226010i0d.LLJIJIL;
        final MutableLiveData<Integer> mutableLiveData = this.LLJILJILJ;
        final Function1<Boolean, Unit> function1 = dialogInterfaceOnDismissListenerC1226010i0d.LLJJI;
        return new C1225700i08(this, i, mutableLiveData, function1) { // from class: X.0i0h
            public final int LLILZ;
            public final LiveData<Integer> LLILZIL;
            public final Function1<Boolean, Unit> LLILZLL;

            /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
            @Override // X.C1225700i08, X.InterfaceC1224490hyB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIJ(X.C1224590hyL r14) {
                /*
                    Method dump skipped, instruction units count: 282
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1226050i0h.LJIJ(X.0hyL):void");
            }

            @Override // X.C1225700i08, X.InterfaceC1224250hxn
            public final void LJJJ(C1224790hyf c1224790hyf) {
                InterfaceC1226510i1R interfaceC1226510i1R;
                String strLIZIZ;
                DialogInterfaceOnDismissListenerC1226010i0d dialogInterfaceOnDismissListenerC1226010i0d2;
                String str;
                DialogInterfaceOnDismissListenerC1226010i0d dialogInterfaceOnDismissListenerC1226010i0d3;
                List<C1224840hyk> list = c1224790hyf.LIZIZ;
                if (list != null && (interfaceC1226510i1R = this.LL.LIZ) != null) {
                    EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
                    Boolean boolValueOf = Boolean.valueOf(!list.isEmpty());
                    String str2 = "Confirm";
                    if (list.isEmpty()) {
                        AbstractC1225780i0G abstractC1225780i0GLJJJJLL = this.LLILLJJLI.LJJJJLL();
                        if ((abstractC1225780i0GLJJJJLL instanceof DialogInterfaceOnDismissListenerC1226010i0d) && (dialogInterfaceOnDismissListenerC1226010i0d3 = (DialogInterfaceOnDismissListenerC1226010i0d) abstractC1225780i0GLJJJJLL) != null && (strLIZIZ = dialogInterfaceOnDismissListenerC1226010i0d3.LLILZLL) != null) {
                        }
                        interfaceC1226510i1R.LJIIJJI(new C1224600hyM(enumC1227730i3P, boolValueOf, str2, Boolean.TRUE, (Boolean) null), false);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    AbstractC1225780i0G abstractC1225780i0GLJJJJLL2 = this.LLILLJJLI.LJJJJLL();
                    if ((abstractC1225780i0GLJJJJLL2 instanceof DialogInterfaceOnDismissListenerC1226010i0d) && (dialogInterfaceOnDismissListenerC1226010i0d2 = (DialogInterfaceOnDismissListenerC1226010i0d) abstractC1225780i0GLJJJJLL2) != null && (str = dialogInterfaceOnDismissListenerC1226010i0d2.LLILZLL) != null) {
                        str2 = str;
                    }
                    sbLIZ.append(str2);
                    sbLIZ.append('(');
                    sbLIZ.append(list.size());
                    sbLIZ.append(')');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    str2 = strLIZIZ;
                    interfaceC1226510i1R.LJIIJJI(new C1224600hyM(enumC1227730i3P, boolValueOf, str2, Boolean.TRUE, (Boolean) null), false);
                }
            }

            @Override // X.C1225700i08
            public final void LJJJJIZL(InterfaceC1226510i1R interfaceC1226510i1R) {
                this.LL.LIZ = interfaceC1226510i1R;
                AbsContactSelectorFragment fragment = interfaceC1226510i1R.getFragment();
                if (fragment != null) {
                    this.LLILZIL.observe(fragment, new AObserverS78S0201000_19(interfaceC1226510i1R, this, Math.max(this.LLILZ, 1), 1));
                }
            }

            {
                super(this, this.LLJIJIL.LLJJJJ);
                this.LLILZ = i;
                this.LLILZIL = mutableLiveData;
                this.LLILZLL = function1;
            }
        };
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224330hxv LJJJJJL() {
        final C1224340hxw c1224340hxw = this.LLJIJIL.LLJJJIL;
        return new C1225800i0I(c1224340hxw) { // from class: X.0i0b
            @Override // X.C1225800i0I, X.InterfaceC1224330hxv
            public final boolean LJIIJJI(C1224840hyk c1224840hyk) {
                IMConversation iMConversation;
                List<String> memberIdList;
                C1226000i0c c1226000i0c = this.LLILZ;
                c1226000i0c.getClass();
                if (c1224840hyk.LLJILJIL) {
                    return false;
                }
                int size = c1226000i0c.LLJILJIL.size();
                DialogInterfaceOnDismissListenerC1226010i0d dialogInterfaceOnDismissListenerC1226010i0d = c1226000i0c.LLJIJIL;
                if (size >= dialogInterfaceOnDismissListenerC1226010i0d.LLJI) {
                    dialogInterfaceOnDismissListenerC1226010i0d.LLJILLL.invoke(dialogInterfaceOnDismissListenerC1226010i0d.LLIZ);
                } else {
                    Object obj = c1224840hyk.LLJI.get("contact");
                    if (!(obj instanceof IMConversation) || (iMConversation = (IMConversation) obj) == null || (memberIdList = iMConversation.getMemberIdList()) == null || c1226000i0c.LLJILJIL.size() + memberIdList.size() <= c1226000i0c.LLJIJIL.LLJI) {
                        return false;
                    }
                    Iterator<String> it2 = memberIdList.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        if (!c1226000i0c.LLJILJIL.contains(it2.next())) {
                            i++;
                        }
                    }
                    if (c1226000i0c.LLJILJIL.size() + i <= c1226000i0c.LLJIJIL.LLJI) {
                        return false;
                    }
                    DialogInterfaceOnDismissListenerC1226010i0d dialogInterfaceOnDismissListenerC1226010i0d2 = c1226000i0c.LLJIJIL;
                    Function1<String, Unit> function1 = dialogInterfaceOnDismissListenerC1226010i0d2.LLJILLL;
                    int i2 = dialogInterfaceOnDismissListenerC1226010i0d2.LLJI;
                    function1.invoke(C20642515q3.LJ(2131755979, i2, Integer.valueOf(i2)));
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
                C1226000i0c c1226000i0c = this.LLILZ;
                c1226000i0c.LLJILJIL = linkedHashSet;
                c1226000i0c.LLJILJILJ.postValue(Integer.valueOf(linkedHashSet.size()));
                Function2<String, String, Unit> function2 = this.LLILZ.LLJIJIL.LLJJ;
                if (function2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update num cost ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ.append("ms");
                    function2.invoke("LiveInviteFriendsTemplate", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        };
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224410hy3 LJJJJL() {
        final C1224860hym c1224860hym = this.LLJIJIL.LLJJJJJIL;
        return new C1225710i09(c1224860hym) { // from class: X.0i0e
            @Override // X.C1225710i09, X.InterfaceC1224410hy3
            public final void LJIL(EnumC1224880hyo enumC1224880hyo) {
                super.LJIL(enumC1224880hyo);
                Function1<Boolean, Unit> function1 = this.LLILZ.LLJIJIL.LLJJI;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
            }
        };
    }

    @Override // X.AbstractC1225770i0F
    public final C1224950hyv LJJJJLI() {
        return new C1225300hzU(this, (C1225370hzb) this.LLJIJIL.LLJJJ.LIZIZ);
    }

    @Override // X.AbstractC1225770i0F
    public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
        return this.LLJIJIL;
    }

    public C1226000i0c(DialogInterfaceOnDismissListenerC1226010i0d dialogInterfaceOnDismissListenerC1226010i0d) {
        super(dialogInterfaceOnDismissListenerC1226010i0d);
        this.LLJIJIL = dialogInterfaceOnDismissListenerC1226010i0d;
        this.LLJILJIL = new LinkedHashSet();
        this.LLJILJILJ = new MutableLiveData<>(0);
    }
}
