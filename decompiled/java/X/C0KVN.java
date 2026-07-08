package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.CommentReply;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0KVN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KVN extends RecyclerView.ViewHolder {
    public final View LL;
    public final LifecycleOwner LLILLJJLI;
    public final Context LLILLL;
    public final LiveIconView LLILZ;
    public final LiveIconView LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final C16F5 LLIZLLLIL;
    public final C054G LLJ;
    public final C21658019pS LLJI;
    public C0KVL LLJIJIL;

    public final void I5(CommentReply commentReply) {
        int i = commentReply.anchorFeedbackStatus;
        if (i != 1) {
            if (i != 2) {
                this.LLILZ.setIcon(C20736316Cj.LIZLLL(R.attr.ejk, this.LLILLL));
                this.LLILZIL.setIcon(C20736316Cj.LIZLLL(R.attr.eji, this.LLILLL));
                return;
            } else {
                LiveIconView liveIconView = this.LLILZ;
                if (liveIconView != null) {
                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.ejk, this.LLILLL));
                }
                this.LLILZIL.setIcon(C20736316Cj.LIZLLL(R.attr.ejj, this.LLILLL));
                return;
            }
        }
        this.LLILZ.setIcon(C20736316Cj.LIZLLL(R.attr.ejl, this.LLILLL));
        this.LLILZIL.setIcon(C20736316Cj.LIZLLL(R.attr.eji, this.LLILLL));
        this.LLILZ.setIconTint(C20736316Cj.LIZIZ(R.attr.ezt, this.LLILLL));
    }

    public C0KVN(View view, View view2, LifecycleOwner lifecycleOwner) {
        super(view);
        this.LL = view2;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = view.getContext();
        this.LLILZ = (LiveIconView) view.findViewById(R.id.lxr);
        this.LLILZIL = (LiveIconView) view.findViewById(R.id.lxq);
        this.LLILZLL = (C16F5) view.findViewById(R.id.zh8);
        this.LLIZ = (C16F5) view.findViewById(R.id.tv_title);
        this.LLIZLLLIL = (C16F5) view.findViewById(R.id.zf0);
        this.LLJ = C2296808zG.LIZ(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).getCoroutineContext());
        this.LLJI = new C21658019pS(view2, view, new AwS551S0100000_7(this, 566));
    }
}
