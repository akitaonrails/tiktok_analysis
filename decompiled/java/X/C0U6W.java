package X;

import Y.ACListenerS79S0300000_12;
import Y.ARunnableS23S0101000_12;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0U6W, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U6W extends AbstractC761920Tug<C0U6Z, LiveEffect> {
    public RecyclerView LLILLJJLI;
    public C0U78 LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public InterfaceC766800U6c LLILZLL;
    public final C01GW LLIZ;
    public final C766780U6a LLIZLLLIL;

    public void LLLLLLIL(int i, C0U6Z c0u6z, LiveEffect liveEffect) {
        throw null;
    }

    public void LLLLLLLLLL(int i, LiveEffect liveEffect) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0U6a] */
    public C0U6W() {
        this.LLILZ = LiveAIBeautySetting.INSTANCE.enableDialogUpdate() ? R.layout.ges : R.layout.ger;
        this.LLIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(490));
        this.LLIZLLLIL = new C0U45() { // from class: X.0U6a
            @Override // X.C0U45
            public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
            }

            @Override // X.C0U45
            public final void LIZJ(LiveEffect liveEffect) {
            }

            @Override // X.C0U45
            public final void LIZ(LiveEffect liveEffect) {
                int iIndexOf = ((ArrayList) this.LIZ.LL).indexOf(liveEffect);
                if (iIndexOf >= 0 && iIndexOf < ((ArrayList) this.LIZ.LL).size()) {
                    C786410Ut5.LJJZZIII((Handler) this.LIZ.LLIZ.getValue(), new ARunnableS23S0101000_12(iIndexOf, this.LIZ, 30));
                }
            }

            @Override // X.C0U45
            public final void LJ(LiveEffect liveEffect, ExceptionResult exceptionResult) {
                if (liveEffect != null) {
                    liveEffect.LJLILLLLZI(false);
                    liveEffect.LJJLIL(false);
                }
            }
        };
    }

    public static void LLLLLLL(C0U6Z c0u6z) {
        if (LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) {
            c0u6z.LLILLL.setBackgroundResource(R.drawable.dm3);
        } else {
            c0u6z.LLILLL.setBackgroundResource(R.drawable.dm2);
            c0u6z.LL.setTextColor(C20736316Cj.LIZIZ(R.attr.eya, c0u6z.itemView.getContext()));
        }
        c0u6z.LL.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c0u6z.LL.setSelected(true);
        C1119920fFW.LJI(500, c0u6z.LL);
    }

    public static void LLLLLLLLL(C0U6Z c0u6z) {
        c0u6z.LLILLL.setBackgroundResource(R.drawable.dm4);
        c0u6z.LL.setTextColor(C20736316Cj.LIZJ(R.attr.c9j, c0u6z.itemView));
        c0u6z.LL.setEllipsize(null);
        c0u6z.LL.setSelected(false);
        C1119920fFW.LJI(400, c0u6z.LL);
        c0u6z.LL.setGravity(17);
    }

    public final void LLLLLLLZIL(int i, List list) {
        if (i != -1) {
            this.LLILZIL = i;
        }
        C21342318fd.LIZ(new C0U5Y(this.LL, list), true).LIZJ(this);
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0U6Z c0u6z = new C0U6Z(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), this.LLILZ, viewGroup, false));
        try {
            View view = c0u6z.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0u6z.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0u6z.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0U6Z.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0u6z.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0u6z.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0U6Z.class.getName();
        return c0u6z;
    }

    @Override // X.AbstractC761920Tug
    public final void LLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C786410Ut5.LJZI(8, ((C0U6Z) viewHolder).LLILZ);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C786410Ut5.LJZI(0, ((C0U6Z) viewHolder).LLILZ);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLIIIILLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C786410Ut5.LJZI(8, ((C0U6Z) viewHolder).LLILZ);
    }

    @Override // X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLL((C0U6Z) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLLLL((C0U6Z) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U6Z c0u6z = (C0U6Z) viewHolder;
        LiveEffect liveEffect = (LiveEffect) obj;
        if (liveEffect.LJ()) {
            c0u6z.LLILLJJLI.setImageResource(liveEffect.LJJJ());
            c0u6z.LLILLJJLI.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else {
            UrlModel icon = liveEffect.getIcon();
            if (icon != null) {
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(new ImageModel(icon.uri, icon.urlList));
                c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
                c1324610kZfLJIIIZ.LJJI(c0u6z.LLILLJJLI);
            }
        }
        c0u6z.LL.setText(liveEffect.getName());
        LLLLLLIL(i, c0u6z, liveEffect);
        C786410Ut5.I7(new ACListenerS79S0300000_12(c0u6z, this, liveEffect, 26), c0u6z.itemView);
    }
}
