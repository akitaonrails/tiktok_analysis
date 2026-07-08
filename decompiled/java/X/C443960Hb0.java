package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Hb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443960Hb0 extends AbstractC21673619ry<C444090HbD<InterfaceC444050Hb9>> {
    public final LifecycleOwner LL;
    public final StickerPanelAssemViewModel LLILLJJLI;
    public final C449650HkB LLILLL;
    public final Function2<View, Integer, Boolean> LLILZ;
    public final Set<Long> LLILZIL;

    public C443960Hb0() {
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.Al();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        InterfaceC444050Hb9 interfaceC444050Hb9CQ2 = this.LLILLJJLI.CQ2(i);
        if (interfaceC444050Hb9CQ2 != null) {
            return interfaceC444050Hb9CQ2.LIZJ();
        }
        return 5;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        InterfaceC444050Hb9 interfaceC444050Hb9CQ2 = this.LLILLJJLI.CQ2(viewHolder.getAbsoluteAdapterPosition());
        if (interfaceC444050Hb9CQ2 != null && interfaceC444050Hb9CQ2.LIZJ() == 9) {
            C454640HsE c454640HsE = IMStickerApi.LIZ;
            Long lLIZIZ = c454640HsE.LIZIZ().getImStickerInputPanelService().LIZIZ(interfaceC444050Hb9CQ2);
            if (lLIZIZ != null) {
                long jLongValue = lLIZIZ.longValue();
                if (this.LLILZIL.add(Long.valueOf(jLongValue))) {
                    c454640HsE.LIZIZ().getImStickerAnalytics().LJIIZILJ(String.valueOf(jLongValue), C0I0B.LJFF.LIZIZ());
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C444090HbD c444090HbD = (C444090HbD) viewHolder;
        InterfaceC444050Hb9 interfaceC444050Hb9CQ2 = this.LLILLJJLI.CQ2(i);
        if (interfaceC444050Hb9CQ2 != null) {
            c444090HbD.I5(i, interfaceC444050Hb9CQ2);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C443970Hb1 c443970Hb1 = new C443970Hb1(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3s, viewGroup, false));
        try {
            View view = c443970Hb1.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c443970Hb1.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c443970Hb1.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C443970Hb1.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c443970Hb1.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c443970Hb1.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C443970Hb1.class.getName();
        return c443970Hb1;
    }

    public C443960Hb0(LifecycleOwner lifecycleOwner, StickerPanelAssemViewModel stickerPanelAssemViewModel, C449650HkB c449650HkB) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = stickerPanelAssemViewModel;
        this.LLILLL = c449650HkB;
        this.LLILZ = null;
        this.LLILZIL = new LinkedHashSet();
    }
}
