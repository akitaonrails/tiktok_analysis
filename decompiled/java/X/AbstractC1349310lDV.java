package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS463S0200000_28;

/* JADX INFO: renamed from: X.0lDV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1349310lDV extends FrameLayout {
    public void LIZ(AwS429S0200000_28 awS429S0200000_28) {
    }

    public void LIZIZ(AwS429S0200000_28 awS429S0200000_28) {
    }

    public abstract void LIZJ(Comment comment, Aweme aweme, RecyclerView.ViewHolder viewHolder, String str, String str2, Integer num, Long l, C1349350lDZ c1349350lDZ);

    public abstract void LIZLLL(String str, String str2, String str3);

    public abstract void LJFF(AwS463S0200000_28 awS463S0200000_28);

    public AbstractC1349310lDV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
