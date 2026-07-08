package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03rC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C972803rC implements InterfaceC972703rB {
    @Override // X.InterfaceC972703rB
    public final void LLLLLLLLL(boolean z, View view, Address address) {
        if (!(view instanceof C972903rD)) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fk8);
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        View viewFindViewById = view.findViewById(R.id.fk8);
        if (viewFindViewById != null) {
            C0H1U.LIZIZ(viewFindViewById);
        }
        C972903rD c972903rD = (C972903rD) view;
        String strLJI = address.LJI("name");
        String str = "";
        if (strLJI == null) {
            strLJI = "";
        }
        c972903rD.setNameText(strLJI);
        List listLJIIJJI = C1697810uHb.LJIIJJI(address.LJI("phone"), address.LJI("alternate_phone"));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (C123100dR.LIZ((String) obj)) {
                arrayList.add(obj);
            }
        }
        c972903rD.setPhoneList(arrayList);
        String strLJI2 = address.LJI("email");
        if (strLJI2 == null) {
            strLJI2 = "";
        }
        c972903rD.setEmailText(strLJI2);
        c972903rD.setAddressDetailText(address.LIZJ());
        c972903rD.setRegionText(Address.LIZLLL(address, false, 3));
        String strLJI3 = address.LJI("zipcode");
        if (strLJI3 != null) {
            str = strLJI3;
        }
        c972903rD.setZipcodeText(str);
    }

    @Override // X.InterfaceC972703rB
    public final void X3(boolean z, View view, ShippingAddressRichInfo shippingAddressRichInfo, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        if (!(view instanceof C972903rD)) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.qa_);
        if (viewFindViewById != null) {
            C0H1U.LIZIZ(viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.gy5);
        if (viewFindViewById2 != null) {
            C0H1U.LIZIZ(viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.ags);
        if (viewFindViewById3 != null) {
            C0H1U.LIZIZ(viewFindViewById3);
        }
        View viewFindViewById4 = view.findViewById(R.id.t3d);
        if (viewFindViewById4 != null) {
            C0H1U.LIZIZ(viewFindViewById4);
        }
        View viewFindViewById5 = view.findViewById(R.id.zipcode);
        if (viewFindViewById5 != null) {
            C0H1U.LIZIZ(viewFindViewById5);
        }
        View viewFindViewById6 = view.findViewById(R.id.fk8);
        if (viewFindViewById6 != null) {
            C12ES.LJIILL(0, viewFindViewById6);
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fk8);
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        C972903rD c972903rD = (C972903rD) view;
        TuxTextView nameFromXml = c972903rD.getNameFromXml();
        if (nameFromXml != null) {
            C12ES.LJIILL(0, nameFromXml);
        }
        C03C9.LIZIZ(c972903rD.getNameFromXml(), shippingAddressRichInfo.title, z, R.attr.a1p, "AddressRichTextRenderDefaultImpl", null, false);
        List<ECRichText> list = shippingAddressRichInfo.descriptionList;
        if (list != null) {
            for (ECRichText eCRichText : list) {
                TuxTextView tuxTextView = new TuxTextView(c972903rD.getContext(), null, 6, 0);
                C426750GoL.LJIIL(tuxTextView, 0, Integer.valueOf(C0H9H.LIZIZ(4)), 0, 0, 16);
                tuxTextView.setMaxLines(2);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setGravity(8388611);
                tuxTextView.setTextAlignment(5);
                C03C9.LIZIZ(tuxTextView, eCRichText, z, R.attr.a1p, "AddressRichTextRenderDefaultImpl", interfaceC1631620sYq, true);
                LinearLayout defaultRichInfoListLayoutFromXml = c972903rD.getDefaultRichInfoListLayoutFromXml();
                if (defaultRichInfoListLayoutFromXml != null) {
                    defaultRichInfoListLayoutFromXml.addView(tuxTextView);
                }
            }
        }
    }
}
