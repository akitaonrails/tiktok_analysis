package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS41S0301000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Tu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761560Tu6 extends AbstractC21673619ry<C761570Tu7> {
    public final Function1<LiveEffect, Unit> LL;
    public final List<LiveEffect> LLILLJJLI = new ArrayList();
    public LiveEffect LLILLL;
    public LiveEffect LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C761560Tu6(AwS591S0100000_12 awS591S0100000_12) {
        this.LL = awS591S0100000_12;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLFZ, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C761570Tu7 c761570Tu7, int i) {
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LLILLJJLI, i);
        UrlModel icon = liveEffect.getIcon();
        if (icon != null) {
            C0JSS.LJ(c761570Tu7.LL, icon.LIZ(), 0);
        }
        c761570Tu7.LLILZIL.setText(liveEffect.getName());
        UrlModel urlModel = LiveEffect.LIZLLL;
        c761570Tu7.I5(C0UCX.LIZ(this.LLILZ, liveEffect));
        C500260Jjc.LJIILIIL(c761570Tu7.LLILZLL);
        C500260Jjc.LJIILIIL(c761570Tu7.LLILLL);
        C500260Jjc.LJIILIIL(c761570Tu7.LLILZ);
        C500260Jjc.LJLIIIL(500L, c761570Tu7.LLILLJJLI, new AwS41S0301000_12(this, c761570Tu7.getAdapterPosition(), liveEffect, c761570Tu7, 0));
    }

    public final void LLLI(int i, LiveEffect liveEffect) {
        if (i >= 0 && i < ((ArrayList) this.LLILLJJLI).size()) {
            UrlModel urlModel = LiveEffect.LIZLLL;
            if (!C0UCX.LIZ(this.LLILZ, liveEffect)) {
                this.LLILLL = this.LLILZ;
                this.LLILZ = liveEffect;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C761570Tu7 c761570Tu7 = new C761570Tu7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gez, viewGroup, false));
        try {
            View view = c761570Tu7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c761570Tu7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c761570Tu7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C761570Tu7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c761570Tu7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c761570Tu7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C761570Tu7.class.getName();
        return c761570Tu7;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C761570Tu7 c761570Tu7 = (C761570Tu7) viewHolder;
        super.onBindViewHolder(c761570Tu7, i, list);
        onBindViewHolder(c761570Tu7, i);
    }
}
