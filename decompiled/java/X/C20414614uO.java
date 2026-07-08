package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14uO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20414614uO extends AbstractC21673619ry<C20414714uP> {
    public final List<C20326414gA> LL;
    public final Function1<LiveEffect, Unit> LLILLJJLI;
    public final Function2<LiveEffect, EnumC993760by2, Unit> LLILLL;
    public int LLILZIL;
    public final int LLIZ;
    public String LLILZ = CardStruct.IStatusCode.DEFAULT;
    public final int LLILZLL = (int) C497740JfY.LIZIZ(56.0f);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public final int LLLFZ(LiveEffect liveEffect) {
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.LJFF(((C20326414gA) ListProtector.get(this.LL, i)).LIZ, liveEffect)) {
                return i;
            }
        }
        return -1;
    }

    public final void LLLI(int i, LiveEffect liveEffect) {
        int iLLLFZ = LLLFZ(liveEffect);
        if (iLLLFZ >= 0 && iLLLFZ < this.LL.size()) {
            C20326414gA c20326414gA = (C20326414gA) ListProtector.get(this.LL, iLLLFZ);
            c20326414gA.LIZ.LJLILLLLZI(true);
            c20326414gA.LIZIZ = i;
            notifyItemChanged(iLLLFZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, final int r10) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20414614uO.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C20414714uP c20414714uP = new C20414714uP(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g3t, viewGroup, false));
        try {
            View view = c20414714uP.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c20414714uP.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c20414714uP.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C20414714uP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c20414714uP.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c20414714uP.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C20414714uP.class.getName();
        return c20414714uP;
    }

    public C20414614uO(Context context, List list, AwS610S0100000_31 awS610S0100000_31, AwS645S0100000_31 awS645S0100000_31) {
        this.LL = list;
        this.LLILLJJLI = awS610S0100000_31;
        this.LLILLL = awS645S0100000_31;
        this.LLIZ = (C0JAI.LIZJ(context) - (((int) C497740JfY.LIZIZ(56.0f)) * 5)) / 6;
    }
}
