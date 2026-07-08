package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.absetting.EffectIconWhiteOverlayBugfixKillSwitch;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0noU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449120noU extends RecyclerView.ViewHolder {
    public Effect LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C1324800kZy LLILZ;
    public final /* synthetic */ C1449130noV LLILZIL;

    public final void I5() {
        int position = getPosition();
        this.LLILZIL.LLILLJJLI.C0().LJIIIZ();
        int i = position >= 0 ? position : 0;
        this.LLILZIL.LLILLJJLI.C0().LJJLIIIJILLIZJL(i);
        C1449130noV c1449130noV = this.LLILZIL;
        C23250099c.LIZLLL(c1449130noV.LLIZLLLIL, null, null, new C1449110noT(this, c1449130noV, i, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449120noU(C1449130noV c1449130noV, View view) {
        Object c098200Yq;
        float fLIZIZ;
        super(view);
        this.LLILZIL = c1449130noV;
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.gwv);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.video_posted);
        C1324800kZy c1324800kZy = (C1324800kZy) view.findViewById(R.id.gx9);
        if (EffectIconWhiteOverlayBugfixKillSwitch.INSTANCE.isEnabled()) {
            c1324800kZy.LLJILJIL = true;
            try {
                c098200Yq = Float.valueOf(c1324800kZy.getContext().getResources().getDimension(R.dimen.b5));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Float f = (Float) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
            if (f != null) {
                fLIZIZ = f.floatValue();
            } else {
                fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            c1324800kZy.setRectFRadius(fLIZIZ);
            int i = C1324800kZy.LLJILLL;
            c1324800kZy.setClipStyle(1);
        }
        this.LLILZ = c1324800kZy;
        View viewFindViewById = view.findViewById(R.id.use_effect);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
        C0R06.LIZ(c1324800kZy, R.dimen.b5);
    }
}
