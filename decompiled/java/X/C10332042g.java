package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.042g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10332042g extends TuxTextView {
    public Pair<Icon, ? extends Drawable> LLJJJJ;
    public Pair<Icon, ? extends Drawable> LLJJJJJIL;

    public C10332042g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public C10332042g(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final void LJJJJJ(Icon icon, Pair<Icon, ? extends Drawable> pair, Function1<? super Drawable, Unit> function1) {
        Icon first;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        if (Intrinsics.LJFF(first, icon) && pair.getSecond() != null) {
            function1.invoke(pair.getSecond());
            return;
        }
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image imageRequireImage = icon.requireImage(getContext());
        c1326790kdB.getClass();
        C1326790kdB.LIZLLL(imageRequireImage).LJJIIJ(new C1077104Jd(function1, this, 0));
    }

    public static void LJJJJL(C10332042g c10332042g, LinkRichText linkRichText, int i, int i2) {
        int i3 = i;
        if ((i2 & 2) != 0) {
            i3 = 0;
        }
        if (linkRichText == null) {
            c10332042g.getClass();
            return;
        }
        c10332042g.setGravity(17);
        c10332042g.setText(RichTextUtil.LJ(RichTextUtil.LIZ, c10332042g.getContext(), linkRichText, null, 0, false, null, null, null, null, false, false, null, null, null, 8188));
        int iLIZIZ = linkRichText.LIZIZ(c10332042g.getContext());
        if (iLIZIZ != -1) {
            c10332042g.setTextColor(iLIZIZ);
        } else {
            c10332042g.setTextColorRes(R.attr.a04);
        }
        c10332042g.setCompoundDrawablePadding(i3);
        c10332042g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        Icon icon = linkRichText.suffixIcon;
        if (icon != null) {
            c10332042g.LJJJJJ(icon, c10332042g.LLJJJJ, new AwS367S0200000_1(c10332042g, icon, 231));
        }
        Icon icon2 = linkRichText.prefixIcon;
        if (icon2 == null) {
            return;
        }
        c10332042g.LJJJJJ(icon2, c10332042g.LLJJJJJIL, new AwS367S0200000_1(c10332042g, icon2, 232));
    }
}
