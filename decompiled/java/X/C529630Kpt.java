package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Kpt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529630Kpt extends C529180KpA {
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
    public static final int LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));

    public C529630Kpt(C0L9H c0l9h) {
        super(c0l9h);
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        boolean z;
        C529640Kpu c529640Kpu = (C529640Kpu) viewHolder;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(this.LL, i);
        c529640Kpu.T5(tikTokMediaModel, c529640Kpu, i);
        C786410Ut5.LLLLZLL(c529640Kpu.LLILZIL, 8);
        TuxTextView tuxTextView = c529640Kpu.LLJJJIL;
        C529630Kpt c529630Kpt = c529640Kpu.LLJJJJJIL;
        if (C580130Mp9.LIZ(c529630Kpt.LLILLJJLI) || i < 0 || i >= c529630Kpt.LLILLJJLI.size() || (str = ((CutSameVideoImageExtraData) ListProtector.get(c529630Kpt.LLILLJJLI, i)).extraDesc) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        if (c529640Kpu.LLJJJJJIL.LLLLIIIILLL(tikTokMediaModel)) {
            c529640Kpu.LLJJJIL.setTextColorRes(R.attr.a1k);
            C339190DRl.LIZIZ(c529640Kpu.LLJJJJ);
            return;
        }
        c529640Kpu.LLJJJIL.setTextColorRes(R.attr.a1h);
        View view = c529640Kpu.LLJJJJ;
        if (c529640Kpu.LLJJJIL.getText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        C1428310nGv.LJIIIIZZ(view, z);
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C529640Kpu c529640Kpu = new C529640Kpu(this, viewGroup);
        try {
            View view = c529640Kpu.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c529640Kpu.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c529640Kpu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C529640Kpu.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c529640Kpu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c529640Kpu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C529640Kpu.class.getName();
        return c529640Kpu;
    }
}
