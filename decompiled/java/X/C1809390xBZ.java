package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviStaticImage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xBZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809390xBZ extends AbstractC21673619ry<C1809400xBa> {
    public List<C111S> LL = C13BV.INSTANCE;
    public Function2<? super Integer, ? super C111S, Unit> LLILLJJLI;
    public Integer LLILLL;
    public Integer LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        int i2;
        UrlModel urlModel;
        C1809400xBa c1809400xBa = (C1809400xBa) viewHolder;
        Context context = c1809400xBa.itemView.getContext();
        final C111S c111s = (C111S) ListProtector.get(this.LL, i);
        ProfileNaviStaticImage profileNaviStaticImage = c111s.LIZLLL;
        if (profileNaviStaticImage != null && (urlModel = profileNaviStaticImage.thumbnailUrl) != null) {
            C1324750kZt.LJFF(c1809400xBa.LLILLJJLI, urlModel);
        }
        Integer num = this.LLILLL;
        if (num != null && num.intValue() == i) {
            i2 = R.drawable.cp6;
        } else {
            i2 = R.drawable.cp5;
        }
        c1809400xBa.LL.setBackground(C800330VaR.LIZIZ(context, i2));
        Integer num2 = this.LLILZ;
        if (num2 != null && num2.intValue() == i) {
            C786410Ut5.LJZI(0, c1809400xBa.LLILLL);
            c1809400xBa.LLILLL.startAnimation(AnimationUtils.loadAnimation(context, R.anim.gi));
        } else {
            C786410Ut5.LJZI(8, c1809400xBa.LLILLL);
            c1809400xBa.LLILLL.clearAnimation();
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0xBb
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view) {
                Function2<? super Integer, ? super C111S, Unit> function2 = this.LLILZ.LLILLJJLI;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i), c111s);
                }
            }
        }, c1809400xBa.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1809400xBa c1809400xBa = new C1809400xBa(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.drx, viewGroup, false));
        try {
            View view = c1809400xBa.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1809400xBa.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1809400xBa.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1809400xBa.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1809400xBa.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1809400xBa.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1809400xBa.class.getName();
        return c1809400xBa;
    }
}
