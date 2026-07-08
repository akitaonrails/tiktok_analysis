package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: renamed from: X.0f7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114860f7M extends AbstractC1114930f7T {
    public final LifecycleOwner LL;
    public final TextView LLILLJJLI;
    public final /* synthetic */ C1114840f7K LLILLL;

    @Override // X.AbstractC1114930f7T
    public final void I5(AbstractC1114930f7T abstractC1114930f7T, int i) {
        final String str;
        if (!(abstractC1114930f7T instanceof C1114860f7M)) {
            return;
        }
        final C1114880f7O c1114880f7O = (C1114880f7O) ListProtector.get(this.LLILLL.LLILLJJLI, i);
        C195900pB c195900pB = this.LLILLL.LLILLL;
        if (c195900pB != null) {
            str = c195900pB.LIZLLL;
        } else {
            str = null;
        }
        if (c1114880f7O.LIZ.text == null) {
            return;
        }
        C1115360f8A c1115360f8A = C1115380f8C.LIZ;
        C1115380f8C.LIZLLL(new SpannableStringBuilder(c1114880f7O.LIZ.text), abstractC1114930f7T.itemView.getResources(), this.LL, new AwS631S0100000_17(abstractC1114930f7T, 5));
        View view = abstractC1114930f7T.itemView;
        final QuickCommentWidget quickCommentWidget = this.LLILLL.LLILZ;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0f7J
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r12) {
                /*
                    Method dump skipped, instruction units count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1114830f7J.onClick(android.view.View):void");
            }
        }, view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1114860f7M(C1114840f7K c1114840f7K, View view, LifecycleOwner lifecycleOwner) {
        super(view);
        this.LLILLL = c1114840f7K;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = (TextView) view.findViewById(R.id.smh);
    }
}
