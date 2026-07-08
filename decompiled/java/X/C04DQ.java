package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.04DQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04DQ extends RecyclerView {
    public static final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public final C01GW LL;

    private final C04DP getListAdapter() {
        return (C04DP) this.LL.getValue();
    }

    public final void LIZJ(C1055304At c1055304At) {
        setItemAnimator(null);
        setNestedScrollingEnabled(false);
        setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        addItemDecoration(new C04JC(0));
        setAdapter(getListAdapter());
        getListAdapter().LLILLJJLI = c1055304At;
    }

    public C04DQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C04DQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(106));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(int r18, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r19, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04DQ.LIZLLL(int, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo, java.lang.String, java.lang.String):boolean");
    }
}
