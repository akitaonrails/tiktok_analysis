package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0PV1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PV1 extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener {
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public final TuxTextView LL;
    public ISearchContextAbility LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public RelatedWord LLILZIL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public C0PV1(TuxTextView tuxTextView) {
        float f;
        super(tuxTextView);
        if (C0PJ4.LIZ()) {
            f = 6.0f;
        } else {
            f = 8.0f;
        }
        C0Q72.LIZ(tuxTextView, f);
        tuxTextView.addOnAttachStateChangeListener(this);
        this.LL = (TuxTextView) tuxTextView.findViewById(R.id.uaa);
        this.LLILLL = -1;
        this.LLILZ = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e A[PHI: r4
      0x012e: PHI (r4v1 X.0PWx) = (r4v0 X.0PWx), (r4v3 X.0PWx) binds: [B:77:0x012a, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PV1.onViewAttachedToWindow(android.view.View):void");
    }
}
