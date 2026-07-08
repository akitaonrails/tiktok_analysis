package X;

import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuHeaderTopLabelsGroup;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.045i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10412045i extends LinearLayout {
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public SkuHeaderTopLabelsGroup LL;
    public final LinkedList<SmartImageView> LLILLJJLI;
    public final LinkedList<TuxTextView> LLILLL;

    public C10412045i(C19EG c19eg) {
        super(c19eg, null, 0);
        this.LLILLJJLI = new LinkedList<>();
        this.LLILLL = new LinkedList<>();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setOrientation(0);
        setGravity(17);
        int i = LLIZ;
        Integer numValueOf = Integer.valueOf(i);
        int i2 = LLILZLL;
        C426750GoL.LJIIL(this, numValueOf, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), 16);
    }
}
