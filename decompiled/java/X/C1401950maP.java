package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;

/* JADX INFO: renamed from: X.0maP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401950maP implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1401950maP(Object obj, BaseCommentCell<T> baseCommentCell) {
        this.$t = baseCommentCell;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C1401950maP c1401950maP, CompoundButton compoundButton, boolean z) {
        ((BaseCommentCell) c1401950maP.l0).a7(z);
    }

    public static final void onCheckedChanged$1(C1401950maP c1401950maP, CompoundButton compoundButton, boolean z) {
        ((BaseCommentCell) c1401950maP.l0).a7(z);
    }

    public static final void onCheckedChanged$2(C1401950maP c1401950maP, CompoundButton compoundButton, boolean z) {
        ((C1391840mK6) c1401950maP.l0).LJ.setValue(Boolean.valueOf(z));
    }
}
