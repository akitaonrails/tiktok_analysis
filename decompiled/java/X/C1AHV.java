package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1AHV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHV extends C1AHY {
    public static final /* synthetic */ int LLJJ = 0;
    public final View LL;
    public final View LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final C1324720kZq LLIZLLLIL;
    public final C16F5 LLJ;
    public final View LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;
    public ValueAnimator LLJILLL;

    public C1AHV(View view) {
        super(view);
        this.LL = view.findViewById(R.id.vw_queue_order);
        this.LLILLJJLI = view.findViewById(R.id.vw_queue_order_swipe_delete);
        this.LLILLL = (C1324720kZq) view.findViewById(R.id.vw_queue_order_gift);
        this.LLILZ = (C16F5) view.findViewById(R.id.vw_queue_order_num);
        this.LLILZIL = (C16F5) view.findViewById(R.id.vw_queue_order_text);
        this.LLILZLL = view.findViewById(R.id.vw_queue_order_priority_icon);
        this.LLIZ = view.findViewById(R.id.vw_queue_order_self_tag);
        this.LLIZLLLIL = (C1324720kZq) view.findViewById(R.id.vw_queue_order_avatar);
        this.LLJ = (C16F5) view.findViewById(R.id.vw_queue_order_username);
        this.LLJI = view.findViewById(R.id.vw_queue_order_divider);
    }
}
