package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761720TuM extends AbstractC761920Tug<C421210GfP, LiveEffect> {
    public final DataChannel LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final KaraokeViewModel LLILZ;
    public LiveEffect LLILZIL;

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C421210GfP c421210GfP = new C421210GfP(viewGroup);
        try {
            View view = c421210GfP.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c421210GfP.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c421210GfP.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C421210GfP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c421210GfP.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c421210GfP.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C421210GfP.class.getName();
        return c421210GfP;
    }

    public C761720TuM(DataChannel dataChannel, LifecycleOwner lifecycleOwner, KaraokeViewModel karaokeViewModel) {
        this.LLILLJJLI = dataChannel;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = karaokeViewModel;
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C421210GfP c421210GfP = (C421210GfP) viewHolder;
        C500260Jjc.LLFFF(c421210GfP.LLILLL);
        TextView textView = c421210GfP.LLILLJJLI;
        if (textView != null) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
        TextView textView2 = c421210GfP.LLILLJJLI;
        if (textView2 != null) {
            textView2.setSelected(true);
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C421210GfP c421210GfP = (C421210GfP) viewHolder;
        C500260Jjc.LJIILLIIL(c421210GfP.LLILLL);
        TextView textView = c421210GfP.LLILLJJLI;
        if (textView != null) {
            textView.setEllipsize(null);
        }
        TextView textView2 = c421210GfP.LLILLJJLI;
        if (textView2 != null) {
            textView2.setSelected(false);
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        ImageModel imageModelLIZ;
        C421210GfP c421210GfP = (C421210GfP) viewHolder;
        LiveEffect liveEffect = (LiveEffect) obj;
        C1324610kZf c1324610kZfLJFF = C1819620xS4.LIZ().LJFF(Boolean.FALSE);
        c1324610kZfLJFF.LJIIIZ = R.drawable.f04;
        UrlModel icon = liveEffect.getIcon();
        if (icon != null) {
            imageModelLIZ = icon.LIZ();
        } else {
            imageModelLIZ = null;
        }
        c1324610kZfLJFF.LJIIIZ(imageModelLIZ);
        c1324610kZfLJFF.LJJI(c421210GfP.itemView.findViewById(R.id.lkw));
        TextView textView = c421210GfP.LLILLJJLI;
        if (textView != null) {
            textView.setText(liveEffect.getName());
        }
        C500260Jjc.LJLIIIL(500L, c421210GfP.itemView, new AwS378S0200000_12(this, liveEffect, 119));
        if (Intrinsics.LJFF(liveEffect, this.LLILZIL)) {
            C500260Jjc.LLFFF(c421210GfP.LLILLL);
            TextView textView2 = c421210GfP.LLILLJJLI;
            if (textView2 != null) {
                textView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            }
            TextView textView3 = c421210GfP.LLILLJJLI;
            if (textView3 != null) {
                textView3.setSelected(true);
                return;
            }
            return;
        }
        C500260Jjc.LJIILLIIL(c421210GfP.LLILLL);
        TextView textView4 = c421210GfP.LLILLJJLI;
        if (textView4 != null) {
            textView4.setEllipsize(null);
        }
        TextView textView5 = c421210GfP.LLILLJJLI;
        if (textView5 == null) {
            return;
        }
        textView5.setSelected(false);
    }
}
