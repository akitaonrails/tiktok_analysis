package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0cTY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013300cTY extends RecyclerView.ViewHolder implements InterfaceC497601wk {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final /* synthetic */ C054G LL;
    public final InterfaceC1013160cTK LLILLJJLI;
    public final C01S9<C1013200cTO> LLILLL;
    public final SmartImageView LLILZ;
    public final FrameLayout LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxIconView LLIZ;
    public int LLIZLLLIL;
    public C1013460cTo LLJ;
    public final boolean LLJI;

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    public C1013300cTY(View view, InterfaceC1013160cTK interfaceC1013160cTK, AnonymousClass0950 anonymousClass0950) {
        int i;
        super(view);
        this.LL = C2296808zG.LIZIZ();
        this.LLILLJJLI = interfaceC1013160cTK;
        this.LLILLL = anonymousClass0950;
        this.LLILZ = (SmartImageView) view.findViewById(R.id.gd4);
        this.LLILZIL = (FrameLayout) view.findViewById(R.id.qtu);
        C12P4 c12p4 = (C12P4) view.findViewById(R.id.video_mask);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.video_title);
        this.LLIZ = (TuxIconView) view.findViewById(R.id.video_arrow);
        this.LLIZLLLIL = -1;
        boolean zLIZ = C06ZK.LIZ(view.getContext());
        this.LLJI = zLIZ;
        C23250099c.LIZLLL(this, null, null, new C06ZH(this, null), 3);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (zLIZ) {
            i = 142;
        } else {
            i = 207;
        }
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1697930uHn.LIZIZ(zLIZ))));
        C786410Ut5.W5(view, layoutParams);
        C12P5 c12p5 = new C12P5();
        c12p5.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1697930uHn.LIZIZ(C06ZK.LIZ(this.itemView.getContext())))));
        c12p5.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(94));
        c12p5.LIZLLL = Integer.valueOf(R.attr.e1);
        c12p5.LJ = Float.valueOf(0.0f);
        c12p5.LJFF = Float.valueOf(0.9f);
        c12p5.LJII = EnumC197015126j.LINEAR;
        c12p5.LJI = C12KQ.VERTICAL;
        c12p4.setTuxDarkLayer(c12p5);
    }
}
