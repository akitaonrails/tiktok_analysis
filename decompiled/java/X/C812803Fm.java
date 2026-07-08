package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS4S0201000_1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03Fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C812803Fm extends PagerAdapter {
    public final List<UserRightDetail> LLILLJJLI;
    public final HashMap<String, Object> LLILLL;
    public final HashMap<String, Object> LLILZ;
    public int LLILZIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        boolean z;
        Image icon;
        int i2;
        int iIntValue;
        HashMap<String, Object> map;
        UserRightDesc userRightDesc;
        C03IT imageUrlModel;
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        View viewLIZJ = C03XA.LIZJ(context, R.layout.ami, viewGroup, false);
        SmartImageView smartImageView = (SmartImageView) viewLIZJ.findViewById(R.id.wms);
        TuxTextView tuxTextView = (TuxTextView) viewLIZJ.findViewById(R.id.wmt);
        TuxIconView tuxIconView = (TuxIconView) viewLIZJ.findViewById(R.id.wmr);
        int size = i % this.LLILLJJLI.size();
        Context context2 = viewGroup.getContext();
        if (context2 != null && C960203pA.LIZIZ(context2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Icon icon2 = ((UserRightDetail) ListProtector.get(this.LLILLJJLI, size)).icon;
            if (icon2 != null) {
                icon = icon2.getIconDark();
                if (icon != null && (imageUrlModel = icon.toImageUrlModel()) != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                    c1331670kl3LIZLLL.LJJ(smartImageView);
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                }
            }
        } else {
            Icon icon3 = ((UserRightDetail) ListProtector.get(this.LLILLJJLI, size)).icon;
            if (icon3 != null) {
                icon = icon3.getIcon();
                if (icon != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageUrlModel);
                    c1331670kl3LIZLLL2.LJJ(smartImageView);
                    C786410Ut5.h3(c1331670kl3LIZLLL2);
                }
            }
        }
        Context context3 = viewGroup.getContext();
        Integer num = ((UserRightDetail) ListProtector.get(this.LLILLJJLI, size)).rightStyle;
        if (num != null && num.intValue() == 2) {
            i2 = R.attr.fy;
        } else {
            i2 = R.attr.g4;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i2, context3);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        smartImageView.setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN));
        tuxTextView.setTextColor(iIntValue);
        String str = ((UserRightDetail) ListProtector.get(this.LLILLJJLI, size)).schema;
        if (str != null && !a0.LJJJIL(str)) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            tuxIconView.setTintColor(iIntValue);
            C786410Ut5.I7(new AjS4S0201000_1(this, viewGroup, size, 5), tuxTextView);
        } else {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            C786410Ut5.h9(tuxTextView, null);
        }
        List<UserRightDesc> list = ((UserRightDetail) ListProtector.get(this.LLILLJJLI, size)).userRightDesc;
        if (list != null && (userRightDesc = (UserRightDesc) C13LP.LJJJLL(list)) != null) {
            C0H1U.LJIIL(tuxTextView, userRightDesc.description, true);
        }
        viewGroup.addView(viewLIZJ);
        if (this.LLILZIL < this.LLILLJJLI.size() && (map = this.LLILLL) != null && Intrinsics.LJFF(map.get("is_first_enter"), Boolean.TRUE)) {
            List<UserRightDetail> list2 = this.LLILLJJLI;
            int i3 = this.LLILZIL;
            this.LLILZIL = i3 + 1;
            C1748720vbi.LIZLLL(viewGroup, new C049G(), new AwS367S0200000_1(this, (UserRightDetail) ListProtector.get(list2, i3), 381));
        }
        return viewLIZJ;
    }

    public final void LJJIJIL(HashMap<String, Object> map, UserRightDetail userRightDetail) {
        Object obj;
        Object obj2;
        HashMap<String, Object> map2 = this.LLILLL;
        Object obj3 = null;
        if (map2 != null) {
            obj = map2.get("page_name");
        } else {
            obj = null;
        }
        map.put("page_name", obj);
        HashMap<String, Object> map3 = this.LLILLL;
        if (map3 != null) {
            obj2 = map3.get("previous_page");
        } else {
            obj2 = null;
        }
        map.put("previous_page", obj2);
        map.put("banner_name", "rights_text");
        HashMap<String, Object> map4 = this.LLILLL;
        if (map4 != null) {
            obj3 = map4.get("banner_position");
        }
        map.put("banner_position", obj3);
        map.put("banner_text", userRightDetail.nameEn);
        map.put("order_rights_id", userRightDetail.id);
    }

    public C812803Fm(List<UserRightDetail> list, HashMap<String, Object> map, HashMap<String, Object> map2) {
        this.LLILLJJLI = list;
        this.LLILLL = map;
        this.LLILZ = map2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
    }
}
