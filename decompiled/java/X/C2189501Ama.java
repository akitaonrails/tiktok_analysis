package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager;
import com.ss.android.ugc.aweme.im.ui.recyclerview.InnerChatLinearLayoutManager;

/* JADX INFO: renamed from: X.1Ama, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189501Ama extends C21674119s3 {
    public final int $t;
    public Object l0;

    public static final int LJIILL$0(C2189501Ama c2189501Ama) {
        return -1;
    }

    public static final int LJIILL$1(C2189501Ama c2189501Ama) {
        return 1;
    }

    @Override // X.AbstractC21674019s2
    public final PointF LIZ(int i) {
        return this.$t != 0 ? super.LIZ(i) : LIZ$0(this, i);
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        return 1 - this.$t != 0 ? super.LJIIJJI(displayMetrics) : LJIIJJI$0(this, displayMetrics);
    }

    @Override // X.C21674119s3
    public final int LJIILL() {
        switch (this.$t) {
            case 0:
                return LJIILL$0(this);
            case 1:
                return LJIILL$1(this);
            default:
                return super.LJIILL();
        }
    }

    public static final PointF LIZ$0(C2189501Ama c2189501Ama, int i) {
        int i2;
        if (c2189501Ama.LIZIZ() == 0) {
            return null;
        }
        if (i < ((SpannedGridLayoutManager) c2189501Ama.l0).LJIILJJIL()) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        return new PointF(0.0f, i2);
    }

    public static final float LJIIJJI$0(C2189501Ama c2189501Ama, DisplayMetrics displayMetrics) {
        float f;
        float f2;
        InnerChatLinearLayoutManager innerChatLinearLayoutManager = (InnerChatLinearLayoutManager) c2189501Ama.l0;
        if (innerChatLinearLayoutManager.LLILZLL) {
            innerChatLinearLayoutManager.LLILZLL = false;
            f = displayMetrics.densityDpi;
            f2 = 50.0f;
        } else {
            f = displayMetrics.densityDpi;
            f2 = 25.0f;
        }
        return f2 / f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2189501Ama(Object obj, Context context, int i) {
        super(context);
        this.$t = i;
        this.l0 = obj;
    }
}
