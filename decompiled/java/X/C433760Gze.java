package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Gze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433760Gze implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C433760Gze(ConstraintLayout constraintLayout, SmartImageView smartImageView, TuxTextView tuxTextView, View view) {
        this.LL = constraintLayout;
        this.LLILLJJLI = smartImageView;
        this.LLILLL = tuxTextView;
        this.LLILZ = view;
    }
}
