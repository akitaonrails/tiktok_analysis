package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03Bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C803003Bs implements InterfaceC972703rB {
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC972703rB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLLLL(boolean r13, android.view.View r14, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r15) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C803003Bs.LLLLLLLLL(boolean, android.view.View, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address):void");
    }

    @Override // X.InterfaceC972703rB
    public final void X3(boolean z, View view, ShippingAddressRichInfo shippingAddressRichInfo, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        View viewFindViewById = view.findViewById(R.id.tjr);
        if (viewFindViewById != null) {
            C12ES.LJIILL(0, viewFindViewById);
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.tjr);
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        View viewFindViewById2 = view.findViewById(R.id.fpv);
        if (viewFindViewById2 != null) {
            C0H1U.LIZIZ(viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.w0_);
        if (viewFindViewById3 != null) {
            C0H1U.LIZIZ(viewFindViewById3);
        }
        View viewFindViewById4 = view.findViewById(R.id.p0o);
        if (viewFindViewById4 != null) {
            C12ES.LJIILL(0, viewFindViewById4);
        }
        C03C9.LIZIZ((TextView) view.findViewById(R.id.p09), shippingAddressRichInfo.title, z, R.attr.a1k, "AddressRichTextRenderUSImpl", null, false);
        TextView textView = (TextView) view.findViewById(R.id.p09);
        if (textView != null) {
            textView.setTextColor(-16776961);
        }
        List<ECRichText> list = shippingAddressRichInfo.descriptionList;
        if (list != null) {
            for (ECRichText eCRichText : list) {
                TuxTextView tuxTextView = new TuxTextView(view.getContext(), null, 6, 0);
                C426750GoL.LJIIL(tuxTextView, 0, Integer.valueOf(C0H9H.LIZIZ(4)), 0, 0, 16);
                tuxTextView.setMaxLines(2);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                C03C9.LIZIZ(tuxTextView, eCRichText, z, R.attr.a1k, "AddressRichTextRenderUSImpl", interfaceC1631620sYq, true);
                tuxTextView.setTextAlignment(5);
                tuxTextView.setGravity(8388611);
                ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.tjr);
                if (viewGroup != null) {
                    viewGroup.addView(tuxTextView);
                }
            }
        }
    }
}
