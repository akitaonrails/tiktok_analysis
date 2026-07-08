package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.BackFromDetailProvider;

/* JADX INFO: renamed from: X.0R40, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R40 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C0R40(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
        this.l3 = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onLayoutChange$0(X.C0R40 r13, android.view.View r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0R40.onLayoutChange$0(X.0R40, android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public static final void onLayoutChange$1(C0R40 c0r40, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0r40);
        ((BackFromDetailProvider) c0r40.l0).LIZJ((Aweme) c0r40.l1, Integer.valueOf(((C639140P5c) c0r40.l2).LIZ), (C0PBZ) c0r40.l3);
    }
}
