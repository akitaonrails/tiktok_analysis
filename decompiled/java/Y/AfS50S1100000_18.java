package Y;

import X.AbstractC1155890gBX;
import X.AbstractC1159230gGv;
import X.AbstractC1387200mCc;
import X.C09JN;
import X.C0XIR;
import X.C0XQ7;
import X.C1159180gGq;
import X.C1159190gGr;
import X.C1159240gGw;
import X.C1159250gGx;
import X.C1167750gUf;
import X.C1169160gWw;
import X.C1180170goh;
import X.C11RK;
import X.C1202200hOE;
import X.C1258160iqU;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397720mTa;
import X.C1614260s6q;
import X.C1906580ziK;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.C343970De7;
import X.C985403tE;
import X.EnumC1181510gqr;
import X.InterfaceC1167830gUn;
import X.InterfaceC1167840gUo;
import X.InterfaceC1181380gqe;
import android.app.Activity;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.purchasepanel.fragment.PurchasePanelFragment;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public class AfS50S1100000_18 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS50S1100000_18 afS50S1100000_18, Object obj) {
        List<MixStruct> mixList;
        int size;
        List<MixStruct> mixList2;
        C1C7U.LIZ("AddFeedVideoToMixHelper@fc03.getFirstMixList$result$1");
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null) {
            String str = afS50S1100000_18.s0;
            InterfaceC1167830gUn interfaceC1167830gUn = (InterfaceC1167830gUn) afS50S1100000_18.l1;
            C1167750gUf.LIZ.getClass();
            C1167750gUf.LIZIZ = mixListResponse;
            C0XQ7.LJ();
            boolean zLJFF = Intrinsics.LJFF(C0XQ7.LIZ.LJIIJ().getCurUserId(), str);
            int size2 = 0;
            if (zLJFF) {
                MixListResponse mixListResponse2 = C1167750gUf.LIZIZ;
                if (mixListResponse2 != null && (mixList2 = mixListResponse2.getMixList()) != null) {
                    size = mixList2.size();
                } else {
                    size = 0;
                }
                C1167750gUf.LJ(size);
            }
            MixListResponse mixListResponse3 = C1167750gUf.LIZIZ;
            if (mixListResponse3 != null && (mixList = mixListResponse3.getMixList()) != null) {
                size2 = mixList.size();
            }
            interfaceC1167830gUn.LIZ(size2, true);
        }
        C1C7U.LIZIZ("AddFeedVideoToMixHelper@fc03.getFirstMixList$result$1");
    }

    public static final void accept$1(AfS50S1100000_18 afS50S1100000_18, Object obj) {
        int size;
        List<MixStruct> mixList;
        C1C7U.LIZ("AddFeedVideoToMixHelper@fc03.getMixListNumber$result$1");
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null) {
            String str = afS50S1100000_18.s0;
            InterfaceC1167840gUo interfaceC1167840gUo = (InterfaceC1167840gUo) afS50S1100000_18.l1;
            C1167750gUf.LIZ.getClass();
            C1167750gUf.LIZIZ = mixListResponse;
            C0XQ7.LJ();
            if (Intrinsics.LJFF(C0XQ7.LIZ.LJIIJ().getCurUserId(), str)) {
                MixListResponse mixListResponse2 = C1167750gUf.LIZIZ;
                if (mixListResponse2 != null && (mixList = mixListResponse2.getMixList()) != null) {
                    size = mixList.size();
                } else {
                    size = 0;
                }
                C1167750gUf.LJ(size);
            }
            if (mixListResponse.status_code == 0) {
                ((C1258160iqU) interfaceC1167840gUo).LIZ(true, C1167750gUf.LIZIZ);
            } else {
                ((C1258160iqU) interfaceC1167840gUo).LIZ(false, C1167750gUf.LIZIZ);
            }
        }
        C1C7U.LIZIZ("AddFeedVideoToMixHelper@fc03.getMixListNumber$result$1");
    }

    public static final void accept$2(AfS50S1100000_18 afS50S1100000_18, Object obj) {
        C1C7U.LIZ("EditPlayListNameEditTextVM@688c.changePlaylistName$1$2");
        ((EditPlayListNameEditTextVM) afS50S1100000_18.l1).setState(new AwS597S0100000_18((ManageResponse) obj, 131));
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        EditPlayListNameEditTextVM editPlayListNameEditTextVM = (EditPlayListNameEditTextVM) afS50S1100000_18.l1;
        String str = editPlayListNameEditTextVM.LL;
        String str2 = editPlayListNameEditTextVM.LLILLJJLI;
        String str3 = afS50S1100000_18.s0;
        Integer num = editPlayListNameEditTextVM.LLILZ;
        int i = editPlayListNameEditTextVM.LLILLL;
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        Integer numValueOf = Integer.valueOf(i2);
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str3);
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "playlist_post_cnt");
        }
        if (numValueOf != null) {
            c2344009Gk.LIZJ(numValueOf.intValue(), "is_sub_only_playlist");
        }
        C20684815ws.LJIILLIIL("post_rename_playlist", c2344009Gk.LIZ);
        C1C7U.LIZIZ("EditPlayListNameEditTextVM@688c.changePlaylistName$1$2");
    }

    public static final void accept$3(AfS50S1100000_18 afS50S1100000_18, Object obj) {
        C1C7U.LIZ("MarketplacePaymentService@820f.makePurchase$1");
        C11RK<AbstractC1159230gGv> c11rk = C1614260s6q.LIZLLL;
        final String str = afS50S1100000_18.s0;
        final PurchaseOptionWithPrice purchaseOptionWithPrice = (PurchaseOptionWithPrice) afS50S1100000_18.l1;
        c11rk.onNext(new AbstractC1159230gGv(str, purchaseOptionWithPrice) { // from class: X.0gGx
            public final String LIZIZ;
            public final PurchaseOptionWithPrice LIZJ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1159250gGx)) {
                    return false;
                }
                C1159250gGx c1159250gGx = (C1159250gGx) obj2;
                return Intrinsics.LJFF(this.LIZIZ, c1159250gGx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1159250gGx.LIZJ);
            }

            public final int hashCode() {
                return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LoadingOrder(productId=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", purchaseOption=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1159230gGv
            public final String LIZ() {
                return this.LIZIZ;
            }

            {
                super(str);
                this.LIZIZ = str;
                this.LIZJ = purchaseOptionWithPrice;
            }
        });
        C1C7U.LIZIZ("MarketplacePaymentService@820f.makePurchase$1");
    }

    public static final void accept$4(AfS50S1100000_18 afS50S1100000_18, Object obj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        Activity activityLIZIZ2;
        Activity activityLIZ2;
        Activity activityLIZIZ3;
        Activity activityLIZIZ4;
        C1C7U.LIZ("MarketplacePaymentService@820f.makePurchase$7");
        final Throwable th = (Throwable) obj;
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            if (c0xir.getErrorCode() == 3004063) {
                C1614260s6q.LIZ.getClass();
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null && (activityLIZIZ4 = abstractC1387200mCcLJ.LIZIZ()) != null) {
                    String string = activityLIZIZ4.getString(2131835147);
                    String string2 = activityLIZIZ4.getString(2131835145);
                    String string3 = activityLIZIZ4.getString(2131835144);
                    String string4 = activityLIZIZ4.getString(2131835146);
                    C1397580mTM c1397580mTM = new C1397580mTM(activityLIZIZ4);
                    c1397580mTM.LJI(string);
                    c1397580mTM.LIZIZ(string2);
                    C1397720mTa.LIZ(c1397580mTM, string3, new AwS597S0100000_18((Context) activityLIZIZ4, 972));
                    C985403tE.LIZ(c1397580mTM, new AwS69S1000000_18(string4, 26));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
            } else {
                C1614260s6q c1614260s6q = C1614260s6q.LIZ;
                String errorMsg = c0xir.getErrorMsg();
                c1614260s6q.getClass();
                AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ2 != null && (activityLIZIZ3 = abstractC1387200mCcLJ2.LIZIZ()) != null) {
                    if (!(!a0.LJJJIL(errorMsg))) {
                        errorMsg = activityLIZIZ3.getResources().getString(2131847431);
                    }
                    Activity activityLIZ3 = C1388190mED.LIZ(activityLIZIZ3);
                    if (activityLIZ3 != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ3);
                        c1389890mGx.LJIIJ(errorMsg);
                        c1389890mGx.LJIIJJI();
                    }
                }
            }
        } else if (th instanceof C1202200hOE) {
            C1614260s6q.LIZ.getClass();
            AbstractC1387200mCc abstractC1387200mCcLJ3 = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ3 != null && (activityLIZIZ2 = abstractC1387200mCcLJ3.LIZIZ()) != null && (activityLIZ2 = C1388190mED.LIZ(activityLIZIZ2)) != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                c1389890mGx2.LJIIIZ(2131847499);
                c1389890mGx2.LJIIJJI();
            }
        } else {
            C1614260s6q.LIZ.getClass();
            AbstractC1387200mCc abstractC1387200mCcLJ4 = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ4 != null && (activityLIZIZ = abstractC1387200mCcLJ4.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ);
                c1389890mGx3.LJIIIZ(2131847498);
                c1389890mGx3.LJIIJJI();
            }
        }
        C1614260s6q.LIZLLL.onNext(new C1159190gGr(new AbstractC1155890gBX(th) { // from class: X.0gBW
            public final Throwable LIZ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C1155880gBW) && Intrinsics.LJFF(this.LIZ, ((C1155880gBW) obj2).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error(throwable=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = th;
            }
        }, afS50S1100000_18.s0, (PurchaseOptionWithPrice) afS50S1100000_18.l1));
        C1C7U.LIZIZ("MarketplacePaymentService@820f.makePurchase$7");
    }

    public static final void accept$5(AfS50S1100000_18 afS50S1100000_18, Object obj) {
        C1C7U.LIZ("PurchasePanelFragment@fc7c.onViewCreated$1$1");
        AbstractC1159230gGv abstractC1159230gGv = (AbstractC1159230gGv) obj;
        if ((Intrinsics.LJFF(abstractC1159230gGv.LIZ(), afS50S1100000_18.s0) || ((PurchasePanelFragment) afS50S1100000_18.l1).isResumed()) && !(abstractC1159230gGv instanceof C1159250gGx)) {
            if (abstractC1159230gGv instanceof C1159180gGq) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF((PurchasePanelFragment) afS50S1100000_18.l1, C343970De7.LIZ);
            } else if (!(abstractC1159230gGv instanceof C1159240gGw)) {
            }
        }
        C1C7U.LIZIZ("PurchasePanelFragment@fc7c.onViewCreated$1$1");
    }

    public static final void accept$6(AfS50S1100000_18 afS50S1100000_18, Object obj) {
        InterfaceC1181380gqe interfaceC1181380gqe;
        C1C7U.LIZ("SlashDataProcessor@f64e.realRequest$1$1");
        SlashApiResponse slashApiResponse = (SlashApiResponse) obj;
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(slashApiResponse, 2722));
        InterfaceC1181380gqe interfaceC1181380gqe2 = (InterfaceC1181380gqe) afS50S1100000_18.l1;
        if (interfaceC1181380gqe2 != null) {
            interfaceC1181380gqe2.a9(slashApiResponse, afS50S1100000_18.s0);
        }
        if (slashApiResponse != null && (interfaceC1181380gqe = (InterfaceC1181380gqe) afS50S1100000_18.l1) != null) {
            interfaceC1181380gqe.up(slashApiResponse, afS50S1100000_18.s0);
        }
        C1C7U.LIZIZ("SlashDataProcessor@f64e.realRequest$1$1");
    }

    public static final void accept$7(AfS50S1100000_18 afS50S1100000_18, Object obj) {
        C1C7U.LIZ("SlashVm@ffe6.update$4");
        Throwable th = (Throwable) obj;
        InterfaceC1181380gqe interfaceC1181380gqe = (InterfaceC1181380gqe) afS50S1100000_18.l1;
        if (interfaceC1181380gqe != null) {
            interfaceC1181380gqe.JC(th, EnumC1181510gqr.UPDATE, afS50S1100000_18.s0);
        }
        C1C7U.LIZIZ("SlashVm@ffe6.update$4");
    }

    public AfS50S1100000_18(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
