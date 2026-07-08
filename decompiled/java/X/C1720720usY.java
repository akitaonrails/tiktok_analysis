package X;

import Y.ARunnableS95S0200000_26;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.adapter.internal.StellarLottieAdapter;
import com.bytedance.pipo.stellar.base.fragment.StellarCardHostAbility;
import com.bytedance.pipo.stellar.base.fragment.StellarCardHostAbilityKt$createStellarCardHostAbility$1;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0usY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720720usY extends LinearLayout {
    public static final /* synthetic */ int LLIZ = 0;
    public ViewGroup LL;
    public C1720710usX LLILLJJLI;
    public Map<String, ? extends StellarCardAdapter<?>> LLILLL;
    public C1720760usc LLILZ;
    public boolean LLILZIL;
    public final List<WeakReference<InterfaceC1720770usd>> LLILZLL;

    public final void LIZJ() {
        Iterator<WeakReference<InterfaceC1720770usd>> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            InterfaceC1720770usd interfaceC1720770usd = it2.next().get();
            if (interfaceC1720770usd != null) {
                interfaceC1720770usd.LIZJ();
            }
        }
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        ViewGroup viewGroup = this.LL;
        if (viewGroup instanceof ViewOnAttachStateChangeListenerC20604515jv) {
            return (ViewOnAttachStateChangeListenerC20604515jv) viewGroup;
        }
        return null;
    }

    public C1720720usY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = C2097608Jq.LJ();
        this.LLILZLL = new ArrayList();
        C786410Ut5.Sd(R.layout.d3s, C786410Ut5.ne(getContext()), this);
    }

    public final InterfaceC1720770usd LIZ(CardDO cardDO, Fragment fragment) {
        int iIntValue;
        if (this.LLILZIL) {
            Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
            AwS270S0300000_26 awS270S0300000_26 = new AwS270S0300000_26(this, cardDO, fragment, 6);
            ThreadLocal<Integer> threadLocal = C1720940usu.LIZIZ;
            Integer num = threadLocal.get();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            threadLocal.set(Integer.valueOf(iIntValue + 1));
            try {
                Object objInvoke = awS270S0300000_26.invoke();
                if (iIntValue != 0) {
                    threadLocal.set(Integer.valueOf(iIntValue));
                } else {
                    threadLocal.remove();
                }
                return (InterfaceC1720770usd) objInvoke;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (iIntValue == 0) {
                    C1720940usu.LIZIZ.remove();
                    throw th;
                }
                C1720940usu.LIZIZ.set(Integer.valueOf(iIntValue));
                throw th;
            }
        }
        Map<String, WeakReference<C1721420utg>> map2 = C1720940usu.LIZ;
        return C1720940usu.LIZ(getContext(), this.LLILZ, cardDO, fragment);
    }

    public final void LIZLLL(Fragment fragment, List list) {
        View viewLIZIZ;
        ViewGroup viewGroup;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        StellarCardAdapter<InterfaceC1720550usH> stellarCardAdapterIs2;
        try {
            ViewGroup viewGroup2 = this.LL;
            if ((viewGroup2 instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewGroup2 instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewGroup2) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    CardDO cardDO = (CardDO) it2.next();
                    C1720710usX c1720710usX = this.LLILLJJLI;
                    if (c1720710usX != null && (stellarCardAdapterIs2 = c1720710usX.is2(cardDO.getType())) != null) {
                        C1721300utU.LIZ.getClass();
                        InterfaceC1720550usH interfaceC1720550usHLJII = C1721300utU.LJII(stellarCardAdapterIs2, cardDO);
                        if (interfaceC1720550usHLJII != null) {
                            if (Intrinsics.LJFF(cardDO.getCardShow(), "1")) {
                                arrayList.add(interfaceC1720550usHLJII);
                            }
                            if (stellarCardAdapterIs2 instanceof StellarLottieAdapter) {
                                ((ArrayList) this.LLILZLL).add(new WeakReference(((StellarLottieAdapter) stellarCardAdapterIs2).LLIZLLLIL));
                            }
                        }
                    }
                }
                C1720710usX c1720710usX2 = this.LLILLJJLI;
                if (c1720710usX2 != null) {
                    c1720710usX2.LLILLL = arrayList;
                    c1720710usX2.LLILLJJLI.getState().LJIILL(arrayList, null);
                } else {
                    viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
                }
            } else {
                if (viewGroup2 != null) {
                    C786410Ut5.LJJJJI(viewGroup2);
                }
                if (list.size() == 1 && (Intrinsics.LJFF(((CardDO) list.get(0)).getType(), EnumC1720960usw.CARD_CAROUSEL.getValue()) || Intrinsics.LJFF(((CardDO) list.get(0)).getType(), EnumC1720960usw.CARD_CAROUSEL_V2.getValue()))) {
                    if (getParent() != null) {
                        HandlerHook.viewPost(this, new ARunnableS95S0200000_26(this, list, 41));
                    }
                } else {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        InterfaceC1720770usd interfaceC1720770usdLIZ = LIZ((CardDO) it3.next(), fragment);
                        if (interfaceC1720770usdLIZ instanceof C1721420utg) {
                            ((ArrayList) this.LLILZLL).add(new WeakReference(interfaceC1720770usdLIZ));
                        }
                        if (interfaceC1720770usdLIZ != null && (viewLIZIZ = interfaceC1720770usdLIZ.LIZIZ()) != null && (viewGroup = this.LL) != null) {
                            viewGroup.addView(viewLIZIZ);
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(final C1720720usY c1720720usY, C1720760usc c1720760usc, EnumC1720740usa enumC1720740usa, InterfaceC1720700usW interfaceC1720700usW, boolean z, int i) {
        C1720710usX c1720710usX;
        C1720710usX c1720710usX2;
        if ((i & 4) != 0) {
            interfaceC1720700usW = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if (c1720720usY.LL == null) {
            c1720720usY.LLILZ = c1720760usc;
            c1720720usY.LLILZIL = z;
            c1720720usY.LL = null;
            c1720720usY.LLILLJJLI = null;
            c1720720usY.LLILLL = C2097608Jq.LJ();
            int i2 = C1720730usZ.LIZ[enumC1720740usa.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ViewStub viewStub = (ViewStub) c1720720usY.findViewById(R.id.rn0);
                        if (viewStub != null) {
                            C786410Ut5.LJLLLL(viewStub);
                        }
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) c1720720usY.findViewById(R.id.rn4);
                        if (viewOnAttachStateChangeListenerC20604515jv != null) {
                            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(c1720720usY.getContext(), 1, false));
                            List listLIZ = C1720970usx.LIZ();
                            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLIZ, 10));
                            if (iLIZIZ < 16) {
                                iLIZIZ = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                            for (Object obj : listLIZ) {
                                linkedHashMap.put(((StellarCardAdapter) obj).LLFII().toUpperCase(Locale.ROOT), obj);
                            }
                            c1720720usY.LLILLL = linkedHashMap;
                            Iterator it2 = listLIZ.iterator();
                            while (it2.hasNext()) {
                                ((StellarCardAdapter) it2.next()).U5(viewOnAttachStateChangeListenerC20604515jv);
                            }
                            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                        } else {
                            viewOnAttachStateChangeListenerC20604515jv = null;
                        }
                        c1720720usY.LL = viewOnAttachStateChangeListenerC20604515jv;
                        if (interfaceC1720700usW == null) {
                            interfaceC1720700usW = new InterfaceC1720700usW() { // from class: X.0urS
                                public final C1720760usc LL;
                                public final Map<String, String> LLILLJJLI = new LinkedHashMap();

                                @Override // X.InterfaceC1720700usW
                                public final String Qw() {
                                    return null;
                                }

                                @Override // X.InterfaceC1720700usW
                                public final C1716280ulO xK() {
                                    return null;
                                }

                                @Override // X.InterfaceC1720700usW
                                public final C1720760usc Ka1() {
                                    return this.LL;
                                }

                                @Override // X.InterfaceC1720700usW
                                public final Map<String, String> Ye0() {
                                    return this.LLILLJJLI;
                                }

                                {
                                    this.LL = this.LLILLL.LLILZ;
                                }

                                @Override // X.InterfaceC1720700usW
                                public final StellarCardAdapter<InterfaceC1720550usH> is2(String str) {
                                    String upperCase;
                                    if (str == null || (upperCase = str.toUpperCase(Locale.ROOT)) == null) {
                                        return null;
                                    }
                                    PowerCell powerCell = this.LLILLL.LLILLL.get(upperCase);
                                    if (!(powerCell instanceof StellarCardAdapter)) {
                                        return null;
                                    }
                                    return (StellarCardAdapter) powerCell;
                                }

                                @Override // X.InterfaceC1720700usW
                                public final void ZN1(String str, String str2, Map<String, ? extends Object> map) {
                                    C1720280urq.LIZIZ(this, str, str2, map);
                                }

                                @Override // X.InterfaceC1720050urT
                                public final void bL(StellarActionDO stellarActionDO, C1720250urn c1720250urn, Fragment fragment) {
                                    InterfaceC1720050urT interfaceC1720050urT;
                                    C1720760usc c1720760usc2 = this.LL;
                                    if (c1720760usc2 != null && (interfaceC1720050urT = c1720760usc2.LIZIZ) != null) {
                                        interfaceC1720050urT.bL(stellarActionDO, c1720250urn, fragment);
                                    }
                                }

                                @Override // X.InterfaceC1720700usW
                                public final void Hw0(Long l, String str, Long l2, Long l3) {
                                    C1720280urq.LIZ(this, str, l, l2, l3);
                                }

                                @Override // X.InterfaceC1720700usW
                                public final void KH2(InterfaceC1720550usH interfaceC1720550usH, long j, long j2, long j3, Long l) {
                                    C1720280urq.LIZJ(this, interfaceC1720550usH, j, j2, j3, l);
                                }

                                @Override // X.InterfaceC1720700usW
                                public final void We0(String str, Boolean bool, String str2, Long l, Boolean bool2, String str3) {
                                    C1720280urq.LIZLLL(this, str, str2, l, bool, bool2, str3);
                                }
                            };
                        }
                        if (viewOnAttachStateChangeListenerC20604515jv != null) {
                            c1720710usX = new C1720710usX(viewOnAttachStateChangeListenerC20604515jv, interfaceC1720700usW);
                        } else {
                            c1720710usX = null;
                        }
                        c1720720usY.LLILLJJLI = c1720710usX;
                        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(FragmentManager.LJJJJLL(c1720720usY), null);
                        StellarCardHostAbility stellarCardHostAbilityKt$createStellarCardHostAbility$1 = (StellarCardHostAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, StellarCardHostAbility.class, null);
                        if (stellarCardHostAbilityKt$createStellarCardHostAbility$1 == null) {
                            stellarCardHostAbilityKt$createStellarCardHostAbility$1 = new StellarCardHostAbilityKt$createStellarCardHostAbility$1(new AwS570S0100000_26(c1720720usY, 1460));
                            C1558520qew.LJII(interfaceC665370Q7zLJFF, stellarCardHostAbilityKt$createStellarCardHostAbility$1, StellarCardHostAbility.class, null, null);
                        }
                        if (viewOnAttachStateChangeListenerC20604515jv != null && (c1720710usX2 = c1720720usY.LLILLJJLI) != null) {
                            stellarCardHostAbilityKt$createStellarCardHostAbility$1.Bz1(viewOnAttachStateChangeListenerC20604515jv, c1720710usX2);
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                ViewStub viewStub2 = (ViewStub) c1720720usY.findViewById(R.id.u2i);
                if (viewStub2 != null) {
                    C786410Ut5.LJLLLL(viewStub2);
                }
                c1720720usY.LL = (ViewGroup) c1720720usY.findViewById(R.id.u32);
                return;
            }
            c1720720usY.LL = (ViewGroup) c1720720usY.findViewById(R.id.tsc);
        }
    }
}
