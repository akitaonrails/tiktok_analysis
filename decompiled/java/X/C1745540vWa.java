package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745540vWa implements InterfaceC1743730vTf {
    public int LIZ = 1;
    public final /* synthetic */ CandHelper LIZIZ;
    public final /* synthetic */ AddressEditViewModel LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC1743730vTf
    public final void LIZ(int i) {
        int size;
        CandInputData candInputData;
        boolean z;
        Integer num;
        Address address;
        String str;
        Integer num2;
        String str2;
        AddressEditFragment addressEditFragment;
        Integer num3;
        int i2 = i;
        C1745560vWc c1745560vWc = this.LIZIZ.LJ;
        C1745560vWc c1745560vWc2 = null;
        if (c1745560vWc == null) {
            c1745560vWc = null;
        }
        List<CandInputData> list = c1745560vWc.LL;
        if (list != null && (size = list.size()) > 0 && i2 >= 0 && i2 < size) {
            C1745560vWc c1745560vWc3 = this.LIZIZ.LJ;
            if (c1745560vWc3 == null) {
                c1745560vWc3 = null;
            }
            List<CandInputData> list2 = c1745560vWc3.LL;
            if (list2 != null) {
                candInputData = (CandInputData) C13LP.LJJJLZIJ(i2, list2);
            } else {
                candInputData = null;
            }
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = 1;
            if (candInputData != null && (num3 = candInputData.suggestType) != null && num3.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            String str3 = "zipcode";
            if (z) {
                C1745560vWc c1745560vWc4 = this.LIZIZ.LJ;
                if (c1745560vWc4 == null) {
                    c1745560vWc4 = null;
                }
                List<CandInputData> list3 = c1745560vWc4.LL;
                if (list3 != null) {
                    Iterator<CandInputData> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        CandInputData next = it2.next();
                        if (next.LIZIZ == 1) {
                            if (next != null) {
                                return;
                            }
                        }
                    }
                }
                c118300cf.element = 0;
                candInputData.LIZIZ = 1;
                C1745560vWc c1745560vWc5 = this.LIZIZ.LJ;
                if (c1745560vWc5 == null) {
                    c1745560vWc5 = null;
                }
                c1745560vWc5.notifyItemChanged(i2);
                String str4 = this.LIZLLL;
                if (Intrinsics.LJFF(str4, "zipcode") || Intrinsics.LJFF(this.LIZLLL, "address_detail")) {
                    str4 = "address";
                }
                AddressEditViewModel addressEditViewModel = this.LIZJ;
                addressEditViewModel.wR2(str4, addressEditViewModel.tR2(addressEditViewModel.XR2(), true), this.LIZLLL, null, candInputData.autocompleteAddressId, null, new C1745550vWb(candInputData, this, this.LIZIZ, i2));
            } else {
                if ((C1745470vWT.LIZ(this.LIZLLL) || Intrinsics.LJFF(this.LIZLLL, "address_detail")) && candInputData != null && (num = candInputData.placeType) != null && num.intValue() == 0) {
                    AddressEditViewModel addressEditViewModel2 = this.LIZJ;
                    if (candInputData != null) {
                        address = candInputData.address;
                    } else {
                        address = null;
                    }
                    CandHelper candHelper = this.LIZIZ;
                    String str5 = candHelper.LJIIL;
                    if (candInputData != null) {
                        str = candInputData.autocompleteAddressId;
                        num2 = candInputData.placeType;
                    } else {
                        str = null;
                        num2 = null;
                    }
                    String str6 = this.LIZLLL;
                    if (candInputData != null) {
                        str2 = candInputData.placeDetailSource;
                    } else {
                        str2 = null;
                    }
                    AddressEditViewModel.dS2(addressEditViewModel2, address, str5, str, num2, str6, str2, null, new AwS235S0300000_26(addressEditViewModel2, candInputData, candHelper, 9), 64);
                } else {
                    if (!Intrinsics.LJFF(this.LIZLLL, "zipcode")) {
                        str3 = null;
                    }
                    if (candInputData != null && candInputData.address != null) {
                        AddressEditViewModel.tS2(this.LIZJ, candInputData.address, null, null, null, false, false, null, null, str3, null, 6142);
                    }
                }
                CandHelper candHelper2 = this.LIZIZ;
                candHelper2.LJIIJ = "sug";
                candHelper2.LJI = 0;
                AddressEditViewModel addressEditViewModel3 = this.LIZJ;
                addressEditViewModel3.LLJLIL = null;
                candHelper2.LIZ(addressEditViewModel3, this.LIZLLL);
            }
            int iLIZIZ = this.LIZIZ.LIZIZ();
            C1745560vWc c1745560vWc6 = this.LIZIZ.LJ;
            if (c1745560vWc6 != null) {
                c1745560vWc2 = c1745560vWc6;
            }
            if (c1745560vWc2.LLILZ) {
                i2--;
            }
            if (iLIZIZ > 0 && i2 >= 0 && (addressEditFragment = AddressEditFragment.LLLII) != null) {
                C1748720vbi.LIZIZ(addressEditFragment, new C1747730va7(), new C1745590vWf(this.LIZJ, this.LIZLLL, this, c118300cf, iLIZIZ, i2));
            }
            if (c118300cf.element == 1) {
                this.LIZ = 1;
                return;
            }
            return;
        }
        this.LIZIZ.LIZ(this.LIZJ, this.LIZLLL);
    }

    public C1745540vWa(CandHelper candHelper, AddressEditViewModel addressEditViewModel, String str) {
        this.LIZIZ = candHelper;
        this.LIZJ = addressEditViewModel;
        this.LIZLLL = str;
    }
}
