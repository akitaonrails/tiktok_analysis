package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab.TabIndicatorItemData;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0w0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764260w0m extends TuxTextView {
    public TabIndicatorItemData LLJJJJ;
    public int LLJJJJJIL;

    public final int getSelfGroupIndex() {
        return this.LLJJJJJIL;
    }

    public C1764260w0m(Context context) {
        super(context, null, 0);
        setBackgroundResource(R.drawable.b2i);
        setTuxFont(92);
        setTextColor(C960203pA.LIZ(R.attr.ee, context));
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0);
        setGravity(17);
    }

    private final void setIsSelected(boolean z) {
        setSelected(z);
    }

    public final void setSelectIndex(C1764700w1U c1764700w1U) {
        boolean z;
        String str;
        List<String> list;
        String str2;
        if (c1764700w1U != null && c1764700w1U.LIZ == this.LLJJJJJIL) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "";
        if (z) {
            setIsSelected(true);
            TabIndicatorItemData tabIndicatorItemData = this.LLJJJJ;
            if (tabIndicatorItemData != null && (list = tabIndicatorItemData.items) != null && (str2 = (String) C13LP.LJJJLZIJ(c1764700w1U.LIZIZ, list)) != null) {
                str3 = str2;
            }
            setText(str3);
            return;
        }
        setIsSelected(false);
        TabIndicatorItemData tabIndicatorItemData2 = this.LLJJJJ;
        if (tabIndicatorItemData2 != null && (str = tabIndicatorItemData2.group) != null) {
            str3 = str;
        }
        setText(str3);
    }
}
