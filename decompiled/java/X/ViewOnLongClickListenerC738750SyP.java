package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;

/* JADX INFO: renamed from: X.0SyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ViewOnLongClickListenerC738750SyP implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC738750SyP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC738750SyP viewOnLongClickListenerC738750SyP, View view) {
        ((VideoCommentAssem) viewOnLongClickListenerC738750SyP.l0).Tp();
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC738750SyP viewOnLongClickListenerC738750SyP, View view) {
        return ((VideoDiggAssem) viewOnLongClickListenerC738750SyP.l0).Jp(view);
    }
}
