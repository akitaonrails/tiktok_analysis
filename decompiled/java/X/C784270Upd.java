package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget;
import com.bytedance.android.livesdk.livesetting.other.OptimizeLiveTextViewHostSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Upd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784270Upd extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<C784280Upe> LL = new ArrayList();
    public C784220UpY LLILLJJLI;
    public final /* synthetic */ PreviewLiveModeWidget LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public C784270Upd(PreviewLiveModeWidget previewLiveModeWidget) {
        this.LLILLL = previewLiveModeWidget;
    }

    public final void LLLFZ(List<C784280Upe> list) {
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
        C784220UpY c784220UpY = this.LLILLJJLI;
        if (c784220UpY != null) {
            c784220UpY.LL.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return C500260Jjc.LJJJI(Boolean.valueOf(C354201Zc.LJFF(((C784280Upe) ListProtector.get(this.LL, i + (-1))).LJ))) ? 1 : 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Drawable drawable;
        float f;
        if (!(viewHolder instanceof C784300Upg) && !(viewHolder instanceof C784290Upf)) {
            return;
        }
        C784280Upe c784280Upe = (C784280Upe) ListProtector.get(this.LL, i);
        Context context = viewHolder.itemView.getContext();
        String str = c784280Upe.LIZIZ;
        if (c784280Upe.LIZ) {
            i2 = c784280Upe.LIZJ;
            drawable = c784280Upe.LJI;
            f = 0.9f;
        } else {
            i2 = c784280Upe.LIZLLL;
            drawable = c784280Upe.LJII;
            f = 0.5f;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C784270Upd.class.getSimpleName());
        sbLIZ.append(" onBindViewHolder pos:");
        sbLIZ.append(i);
        sbLIZ.append(" show:");
        sbLIZ.append(c784280Upe.LJFF);
        C20441214yg.LIZIZ("voice_chat", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = viewHolder instanceof C784300Upg;
        int i3 = R.attr.c9j;
        if (z) {
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(C198000pW.LIZ(c784280Upe.LJ), context);
            if (c20743516FdLIZLLL != null && c784280Upe.LJ != LiveMode.LIVE_MANAGER) {
                C784300Upg c784300Upg = (C784300Upg) viewHolder;
                ImageView imageView = c784300Upg.LLILLJJLI;
                if (!c784280Upe.LIZ) {
                    i3 = R.attr.c9l;
                }
                c20743516FdLIZLLL.setTint(C20736316Cj.LIZJ(i3, imageView));
                c784300Upg.LLILLJJLI.setImageDrawable(c20743516FdLIZLLL);
                c784300Upg.LLILLJJLI.setBackgroundResource(0);
                C786410Ut5.V4(c784300Upg.LLILLJJLI, f);
            } else if (drawable != null) {
                C784300Upg c784300Upg2 = (C784300Upg) viewHolder;
                c784300Upg2.LLILLJJLI.setImageDrawable(drawable);
                c784300Upg2.LLILLJJLI.setBackgroundResource(0);
            } else {
                if (i2 != -1) {
                    ((C784300Upg) viewHolder).LLILLJJLI.setBackgroundResource(i2);
                }
                ((C784300Upg) viewHolder).LLILLJJLI.setImageDrawable(null);
            }
            C784300Upg c784300Upg3 = (C784300Upg) viewHolder;
            c784300Upg3.LL.setText(str);
            C786410Ut5.k5(c784300Upg3.LL, f);
            if (!OptimizeLiveTextViewHostSetting.INSTANCE.enable()) {
                c784300Upg3.LL.LJJJI(R.style.r6);
            }
            RedDotExtensionKt.LJIILJJIL(C0UX6.LIVE_BROADCAST_PREVIEW_VOICE_CHAT, c784300Upg3.LLILLL, c784280Upe.LJFF);
            return;
        }
        if (!(viewHolder instanceof C784290Upf)) {
            return;
        }
        C20743516Fd c20743516FdLIZLLL2 = C20736316Cj.LIZLLL(C198000pW.LIZ(c784280Upe.LJ), context);
        if (c20743516FdLIZLLL2 != null) {
            C784290Upf c784290Upf = (C784290Upf) viewHolder;
            ImageView imageView2 = c784290Upf.LLILLJJLI;
            if (!c784280Upe.LIZ) {
                i3 = R.attr.c9l;
            }
            c20743516FdLIZLLL2.setTint(C20736316Cj.LIZJ(i3, imageView2));
            c784290Upf.LLILLJJLI.setImageDrawable(c20743516FdLIZLLL2);
            C786410Ut5.V4(c784290Upf.LLILLJJLI, f);
        } else {
            ((C784290Upf) viewHolder).LLILLJJLI.setBackgroundResource(i2);
        }
        C784290Upf c784290Upf2 = (C784290Upf) viewHolder;
        c784290Upf2.LL.setText(str);
        C786410Ut5.k5(c784290Upf2.LL, f);
        if (!OptimizeLiveTextViewHostSetting.INSTANCE.enable()) {
            c784290Upf2.LL.LJJJI(R.style.r6);
        }
        RedDotExtensionKt.LJIILJJIL(C0UX6.LIVE_BROADCAST_PREVIEW_VOICE_CHAT, c784290Upf2.LLILZ, c784280Upe.LJFF);
        c784290Upf2.LLILLL.setFragment(this.LLILLL.widgetCallback.getFragment());
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c784300Upg;
        if (i == 1) {
            c784300Upg = new C784290Upf(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i29, viewGroup, false));
        } else {
            c784300Upg = new C784300Upg(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i28, viewGroup, false));
        }
        try {
            View view = c784300Upg.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c784300Upg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c784300Upg.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c784300Upg.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c784300Upg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c784300Upg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c784300Upg.getClass().getName();
        return c784300Upg;
    }
}
