package X;

import Y.AfS196S0100000_27;
import Y.AkS471S0100000_7;
import Y.AkS488S0100000_27;
import com.bytedance.globalpayment.iap.common.ability.api.IapFlowApi;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.storesubs.IAPStoreSubRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wk2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792320wk2 extends AbstractC1794360wnK {
    public final C1792240wju LIZLLL;
    public final InterfaceC1791550win LJ;
    public C11NZ<C1792260wjw> LJFF;
    public List<? extends AbstractC1794600wni> LJI;
    public final C1792230wjt LJII;
    public final C1792310wk1 LJIIIIZZ;

    @Override // X.AbstractC1794360wnK
    public final EnumC1794620wnk LIZJ() {
        return EnumC1794620wnk.Precheck;
    }

    public static C1791560wio LIZLLL(C1792220wjs c1792220wjs, int i) {
        String str;
        String str2;
        if (c1792220wjs != null) {
            str = c1792220wjs.LJ;
        } else {
            str = null;
        }
        int iLIZLLL = C1792840wks.LIZLLL(i, str);
        if (c1792220wjs == null || (str2 = c1792220wjs.LJ) == null) {
            str2 = "";
        }
        return new C1791560wio(i, iLIZLLL, str2);
    }

    public final void LJ(C1792220wjs c1792220wjs, int i) {
        C1791560wio c1791560wioLIZLLL = LIZLLL(c1792220wjs, i);
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
        if (C1795410wp1.LJFF()) {
            C1792050wjb.LIZ(c1791560wioLIZLLL);
        }
        this.LJII.LJFF(c1791560wioLIZLLL, this.LIZLLL);
        this.LJ.LIZ(Collections.singletonList(c1791560wioLIZLLL));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0wk1] */
    public C1792320wk2(C1792240wju c1792240wju, InterfaceC1791550win interfaceC1791550win, InterfaceC1794400wnO interfaceC1794400wnO) {
        super(interfaceC1794400wnO);
        this.LIZLLL = c1792240wju;
        this.LJ = interfaceC1791550win;
        this.LJFF = C11IR.LL;
        this.LJI = C13BV.INSTANCE;
        this.LJII = new C1792230wjt(c1792240wju);
        this.LJIIIIZZ = new InterfaceC1794730wnv() { // from class: X.0wk1
            @Override // X.InterfaceC1794730wnv
            public final void LIZ() {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LIZJ(EnumC1791830wjF enumC1791830wjF, String str) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJ(C1792840wks c1792840wks, List list) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJI(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJII(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks) {
            }

            @Override // X.InterfaceC1794730wnv
            public final void LJIIIZ(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJIIJ(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List list) {
            }

            @Override // X.InterfaceC1794730wnv
            public final void LJIIIIZZ(C1792840wks c1792840wks, List list) {
                int i;
                if (c1792840wks != null && c1792840wks.LIZIZ()) {
                    C1792320wk2 c1792320wk2 = this.LIZ;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    c1792320wk2.LJI = list;
                    if (true ^ list.isEmpty()) {
                        C1792340wk4 c1792340wk4 = new C1792340wk4(list);
                        C1792350wk5 c1792350wk5 = c1792340wk4.LIZIZ;
                        c1792350wk5.getClass();
                        c1792350wk5.LIZLLL(new JSONObject());
                        C118300cf c118300cf = new C118300cf();
                        String str = EnumC1791830wjF.GOOGLE.channelName;
                        List<AbstractC1794600wni> list2 = c1792340wk4.LIZ;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<AbstractC1794600wni> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().LJFF);
                        }
                        c1792320wk2.LJFF = ((IapFlowApi) ((C1791570wip) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJI()).LIZ(IapFlowApi.class)).checkStoreSubStatus(new IAPStoreSubRequest(str, arrayList)).LJL(C11S5.LIZ()).LJJJJZI(new AkS488S0100000_27(c1792340wk4, 6)).LJJLIIIJLJLI(new AkS471S0100000_7(c118300cf, 11)).LJJLIIIIJ(new AkS488S0100000_27(c1792340wk4, 7)).LJJIJIIJIL(new AfS196S0100000_27(c1792340wk4, 42));
                    }
                    C1792240wju c1792240wju2 = c1792320wk2.LIZLLL;
                    C1792290wjz c1792290wjz = new C1792290wjz(c1792240wju2);
                    C118300cf c118300cf2 = new C118300cf();
                    C1792300wk0 c1792300wk0 = c1792290wjz.LIZ;
                    c1792300wk0.getClass();
                    c1792300wk0.LIZLLL(new JSONObject());
                    C11JN c11jnLJJIJIIJIL = ((IapFlowApi) ((C1791570wip) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJI()).LIZ(IapFlowApi.class)).checkContractStatus(c1792240wju2.LIZIZ, c1792240wju2.LIZ, c1792240wju2.LIZJ, c1792240wju2.LIZLLL).LJL(C11S5.LIZ()).LJJJJZI(new AkS488S0100000_27(c1792290wjz, 4)).LJJLIIIJLJLI(new AkS471S0100000_7(c118300cf2, 10)).LJJLIIIIJ(new AkS488S0100000_27(c1792290wjz, 5)).LJJIJIIJIL(new AfS196S0100000_27(c1792290wjz, 41));
                    C1792270wjx c1792270wjx = new C1792270wjx(null, null);
                    C1701890uOB.LIZ(c1792270wjx, "defaultItem is null");
                    C19490411Ne c19490411NeLJLI = c11jnLJJIJIIJIL.LJLI(C11NZ.LJJJJZ(c1792270wjx));
                    C11NZ<C1792260wjw> c11nz = c1792320wk2.LJFF;
                    C1792260wjw c1792260wjw = new C1792260wjw(null, null);
                    c11nz.getClass();
                    C1701890uOB.LIZ(c1792260wjw, "defaultItem is null");
                    C11NZ.LJLLILLLL(c19490411NeLJLI, c11nz.LJLI(C11NZ.LJJJJZ(c1792260wjw)), new InterfaceC500500Jk0() { // from class: X.0wk3
                        @Override // X.InterfaceC500500Jk0
                        public final Object apply(Object obj, Object obj2) {
                            return new C1792280wjy((C1792270wjx) obj, (C1792260wjw) obj2);
                        }
                    }).LJJLJLI(new AfS196S0100000_27(c1792320wk2, 20));
                    return;
                }
                C1792320wk2 c1792320wk22 = this.LIZ;
                if (c1792840wks != null) {
                    i = c1792840wks.LIZ;
                } else {
                    c1792320wk22.getClass();
                    i = 201;
                }
                c1792320wk22.LJ(c1792840wks, i);
            }
        };
    }
}
