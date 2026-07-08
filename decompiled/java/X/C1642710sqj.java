package X;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642710sqj extends AbstractC2172971A2l<EffectCategoryModel, C1642700sqi> {
    public String LLILLJJLI;
    public final /* synthetic */ C1642630sqb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642710sqj(C1642630sqb c1642630sqb) {
        super(new AbstractC339510DSr<EffectCategoryModel>() { // from class: X.0sqk
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(EffectCategoryModel effectCategoryModel, EffectCategoryModel effectCategoryModel2) {
                return Intrinsics.LJFF(effectCategoryModel.getName(), effectCategoryModel2.getName());
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(EffectCategoryModel effectCategoryModel, EffectCategoryModel effectCategoryModel2) {
                return Intrinsics.LJFF(effectCategoryModel.getName(), effectCategoryModel2.getName());
            }
        });
        this.LLILLL = c1642630sqb;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean zLJFF;
        float f;
        C1642700sqi c1642700sqi = (C1642700sqi) viewHolder;
        EffectCategoryModel effectCategoryModelLLLFZ = LLLFZ(i);
        String str = this.LLILLJJLI;
        if (str == null) {
            this.LLILLJJLI = effectCategoryModelLLLFZ.getName();
            zLJFF = true;
        } else {
            zLJFF = Intrinsics.LJFF(str, effectCategoryModelLLLFZ.getName());
        }
        c1642700sqi.LL.setText(effectCategoryModelLLLFZ.getName());
        TextView textView = c1642700sqi.LL;
        if (zLJFF) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.S4(f, textView);
        if (zLJFF) {
            TextView textView2 = c1642700sqi.LL;
            textView2.setTypeface(textView2.getTypeface(), 1);
        } else {
            Typeface typefaceLIZ = C19736612Jw.LIZ(C12MF.MEDIUM.getFONT_NAME());
            if (typefaceLIZ != null) {
                c1642700sqi.LL.setTypeface(typefaceLIZ);
            } else {
                TextView textView3 = c1642700sqi.LL;
                textView3.setTypeface(textView3.getTypeface(), 0);
            }
        }
        c1642700sqi.itemView.setSelected(zLJFF);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1642700sqi c1642700sqi = new C1642700sqi(this, (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.tv, viewGroup, false));
        try {
            View view = c1642700sqi.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1642700sqi.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1642700sqi.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1642700sqi.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1642700sqi.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1642700sqi.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1642700sqi.class.getName();
        return c1642700sqi;
    }
}
