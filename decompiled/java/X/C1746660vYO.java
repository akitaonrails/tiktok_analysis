package X;

import Y.AObjectS537S0100000_26;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressModule;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PudoInfoItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746660vYO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LinearLayout LL;
    public final /* synthetic */ C1747210vZH LLILLJJLI;
    public final /* synthetic */ SmartImageView LLILLL;
    public final /* synthetic */ TuxTextView LLILZ;
    public final /* synthetic */ TuxTextView LLILZIL;
    public final /* synthetic */ PudoInfoItemViewHolder LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746660vYO(LinearLayout linearLayout, C1747210vZH c1747210vZH, SmartImageView smartImageView, TuxTextView tuxTextView, TuxTextView tuxTextView2, PudoInfoItemViewHolder pudoInfoItemViewHolder) {
        super(0);
        this.LL = linearLayout;
        this.LLILLJJLI = c1747210vZH;
        this.LLILLL = smartImageView;
        this.LLILZ = tuxTextView;
        this.LLILZIL = tuxTextView2;
        this.LLILZLL = pudoInfoItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        PudoAddress pudoAddress;
        Address address;
        List<ShippingAddressRichInfo> list;
        C786410Ut5.LJJJJJL(this.LL);
        PudoAddressModule pudoAddressModule = this.LLILLJJLI.LIZIZ;
        if (pudoAddressModule == null || (pudoAddress = pudoAddressModule.pudoAddress) == null || (address = pudoAddress.address) == null || (list = address.richInfoList) == null) {
            return null;
        }
        SmartImageView smartImageView = this.LLILLL;
        TuxTextView tuxTextView = this.LLILZ;
        TuxTextView tuxTextView2 = this.LLILZIL;
        PudoInfoItemViewHolder pudoInfoItemViewHolder = this.LLILZLL;
        LinearLayout linearLayout = this.LL;
        if (!list.isEmpty()) {
            ECRichText eCRichText = ((ShippingAddressRichInfo) ListProtector.get(list, 0)).title;
            if (eCRichText != null) {
                C03B0 c03b0 = new C03B0(tuxTextView, "address_pudo_info");
                C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
                tuxTextView.setText(c03b0.LIZJ);
            }
            List<ECRichText> list2 = ((ShippingAddressRichInfo) ListProtector.get(list, 0)).descriptionList;
            if (list2 == null || list2.size() <= 2) {
                C786410Ut5.LJLLLLLL(8, smartImageView);
            }
            List<ECRichText> list3 = ((ShippingAddressRichInfo) ListProtector.get(list, 0)).descriptionList;
            if (list3 != null) {
                Iterator<ECRichText> it2 = list3.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ECRichText next = it2.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    ECRichText eCRichText2 = next;
                    if (i == 0) {
                        C03B0 c03b02 = new C03B0(tuxTextView2, "address_pudo_info");
                        C03B0.LIZ(c03b02, eCRichText2, new AObjectS537S0100000_26(pudoInfoItemViewHolder, 1), null, false, null, null, 124);
                        tuxTextView2.setText(c03b02.LIZJ);
                    } else {
                        if (!pudoInfoItemViewHolder.W5().LLLLIIL) {
                            TuxTextView tuxTextView3 = new TuxTextView(pudoInfoItemViewHolder.itemView.getContext(), null, 6, 0);
                            C426750GoL.LJIIL(tuxTextView3, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
                            C03B0 c03b03 = new C03B0(tuxTextView3, "address_pudo_info");
                            C03B0.LIZ(c03b03, eCRichText2, null, null, false, null, null, 126);
                            tuxTextView3.setText(c03b03.LIZJ);
                            linearLayout.addView(tuxTextView3);
                            break;
                        }
                        TuxTextView tuxTextView4 = new TuxTextView(pudoInfoItemViewHolder.itemView.getContext(), null, 6, 0);
                        C426750GoL.LJIIL(tuxTextView4, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
                        C03B0 c03b04 = new C03B0(tuxTextView4, "address_pudo_info");
                        C03B0.LIZ(c03b04, eCRichText2, null, null, false, null, null, 126);
                        tuxTextView4.setText(c03b04.LIZJ);
                        linearLayout.addView(tuxTextView4);
                    }
                    i = i2;
                }
            }
        }
        return Unit.LIZ;
    }
}
