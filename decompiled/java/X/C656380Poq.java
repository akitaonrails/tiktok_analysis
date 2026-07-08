package X;

import Y.ACListenerS145S0100000_10;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Poq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656380Poq extends AbstractViewOnAttachStateChangeListenerC654600Ply {
    public static final /* synthetic */ int LLJIJIL = 0;
    public Challenge LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final C197039127h LLJI;

    public C656380Poq(View view) {
        super(view);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.zcw);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.tv_post_count);
        C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.d7z);
        this.LLJI = c197039127h;
        View viewFindViewById = this.itemView.findViewById(R.id.jzc);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
        viewFindViewById.setBackground(c384050F3z.LIZ(getContext()));
        C786410Ut5.I7(new ACListenerS145S0100000_10(this, 55), this.itemView);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS145S0100000_10(this, 56));
        }
    }
}
