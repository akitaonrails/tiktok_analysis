package X;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.setting.model.RestrictInfo;

/* JADX INFO: renamed from: X.0R6J, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0R6J extends TuxTextView implements InterfaceC728650Si7 {
    public C728640Si6 LLJJJJ;
    public String LLJJJJJIL;

    @Override // X.InterfaceC728650Si7
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC728650Si7
    public final void LJJIJLIJ(RestrictInfo restrictInfo) {
        if (TextUtils.equals(restrictInfo.awemeId, this.LLJJJJJIL)) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            setText(C786410Ut5.j4("Review time:%s \nReview AllFriends:%s ", new Object[]{restrictInfo.reviewTime, restrictInfo.reviewResult}));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0R6K] */
    public C0R6J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        this.LLJJJJ = new C728640Si6(new AbstractC728630Si5<RestrictInfo>() { // from class: X.0R6K
        }, this);
    }
}
