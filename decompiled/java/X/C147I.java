package X;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.recyclerview.widget.RecyclerView;
import com.zhihu.matisse.internal.ui.MediaSelectionFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.147I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C147I extends C147H<RecyclerView.ViewHolder> implements C147D {
    public final C201965140t LLILLL;
    public final C201963140r LLILZ = C20149313sh.LIZ;
    public MediaSelectionFragment LLILZIL;
    public MediaSelectionFragment LLILZLL;
    public final RecyclerView LLIZ;
    public int LLIZLLLIL;

    public final void LLLI() {
        notifyDataSetChanged();
        MediaSelectionFragment mediaSelectionFragment = this.LLILZIL;
        if (mediaSelectionFragment != null) {
            mediaSelectionFragment.d0();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:4)(2:5|(1:7)(7:11|14|29|15|(3:31|17|(3:19|22|(1:24)))|27|28))|33|8|(1:10)|14|29|15|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C2081408Dk.LIZ(r0);
        X.C2344809Gs.LIZ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r7, int r8) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147I.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public C147I(Context context, C201965140t c201965140t, RecyclerView recyclerView) {
        this.LLILLL = c201965140t;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bz6});
        typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLIZ = recyclerView;
    }
}
