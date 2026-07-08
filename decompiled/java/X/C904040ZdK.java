package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904040ZdK extends FrameLayout {
    public Animator LL;
    public final LinearLayout LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public boolean LLILZIL;
    public Animator LLILZLL;

    public C904040ZdK(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.ckj, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.nel);
        this.LLILLJJLI = linearLayout;
        this.LLILLL = (TuxTextView) findViewById(R.id.gzz);
        this.LLILZ = (TuxTextView) findViewById(R.id.sti);
        setClipChildren(false);
        setClipToPadding(false);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        linearLayout.setBackground(C426210GnT.LIZ(context));
    }

    public final void LIZ(MessageReactionsState.ReactionList.Count count) {
        boolean z = count instanceof MessageReactionsState.ReactionList.Count.Show;
        if (z) {
            this.LLILZIL = true;
            C786410Ut5.LLLLZLL(this.LLILZ, 0);
            this.LLILZ.setText(((MessageReactionsState.ReactionList.Count.Show) count).getFormatCount());
        } else if (count instanceof MessageReactionsState.ReactionList.Count.Hidden) {
            this.LLILZIL = false;
            C786410Ut5.LLLLZLL(this.LLILZ, 8);
        } else {
            throw new C1954807lC();
        }
        if (z) {
            if (Build.VERSION.SDK_INT <= 23 || this.LLILLJJLI.getGravity() != 16) {
                this.LLILLJJLI.setGravity(16);
                this.LLILLJJLI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                LinearLayout linearLayout = this.LLILLJJLI;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -2;
                    C786410Ut5.W5(linearLayout, layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            return;
        }
        if (Build.VERSION.SDK_INT > 23 && this.LLILLJJLI.getGravity() == 16) {
            return;
        }
        this.LLILLJJLI.setGravity(17);
        this.LLILLJJLI.setPadding(0, 0, 0, 0);
        LinearLayout linearLayout2 = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            C786410Ut5.W5(linearLayout2, layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
