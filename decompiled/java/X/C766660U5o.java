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

/* JADX INFO: renamed from: X.0U5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C766660U5o extends AbstractC761920Tug<C766670U5p, LiveEffect> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public RunnableC781530UlD LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public InterfaceC766680U5q LLILZIL;
    public final C01GW LLILZLL;
    public final C766630U5l LLIZ;

    public void LLLLLLL(int i, C766670U5p c766670U5p, LiveEffect liveEffect) {
        throw null;
    }

    public void LLLLLLZ(int i, LiveEffect liveEffect) {
        throw null;
    }

    public final Handler LLLLLLIL() {
        return (Handler) this.LLILZLL.getValue();
    }

    public final boolean LLLLLLLLL() {
        RunnableC781530UlD runnableC781530UlD;
        RunnableC781530UlD runnableC781530UlD2 = this.LLILLJJLI;
        if (runnableC781530UlD2 != null) {
            return runnableC781530UlD2.getScrollState() != 0 || ((runnableC781530UlD = this.LLILLJJLI) != null && runnableC781530UlD.isComputingLayout());
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0U5l] */
    public C766660U5o() {
        this.LLILLL = LiveAIBeautySetting.INSTANCE.enableDialogUpdate() ? R.layout.ges : R.layout.ger;
        this.LLILZLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(489));
        this.LLIZ = new C0U45() { // from class: X.0U5l
            @Override // X.C0U45
            public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
            }

            @Override // X.C0U45
            public final void LIZJ(LiveEffect liveEffect) {
            }

            @Override // X.C0U45
            public final void LIZ(LiveEffect liveEffect) {
                if (liveEffect != null) {
                    liveEffect.LJLILLLLZI(false);
                    liveEffect.LJJLIL(true);
                }
                int iIndexOf = ((ArrayList) this.LIZ.LL).indexOf(liveEffect);
                if (iIndexOf >= 0 && iIndexOf < ((ArrayList) this.LIZ.LL).size()) {
                    C786410Ut5.LJJZZIII(this.LIZ.LLLLLLIL(), new ARunnableS23S0101000_12(iIndexOf, this.LIZ, 29));
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

    public static void LLLLLLLLLL(C766670U5p c766670U5p) {
        if (LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) {
            c766670U5p.LLILZIL.setBackgroundResource(R.drawable.dm3);
        } else {
            c766670U5p.LLILZIL.setBackgroundResource(R.drawable.dm2);
            c766670U5p.LLILLL.setTextColor(C20736316Cj.LIZIZ(R.attr.eya, c766670U5p.itemView.getContext()));
        }
        c766670U5p.LLILLL.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c766670U5p.LLILLL.setSelected(true);
        C1119920fFW.LJI(500, c766670U5p.LLILLL);
    }

    public static void LLLLLLLZIL(C766670U5p c766670U5p) {
        c766670U5p.LLILZIL.setBackgroundResource(R.drawable.dm4);
        c766670U5p.LLILLL.setTextColor(C20736316Cj.LIZIZ(R.attr.c6c, c766670U5p.itemView.getContext()));
        c766670U5p.LLILLL.setEllipsize(null);
        c766670U5p.LLILLL.setSelected(false);
        C1119920fFW.LJI(400, c766670U5p.LLILLL);
        c766670U5p.LLILLL.setGravity(17);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLIILLL(RecyclerView.ViewHolder viewHolder, Object obj) {
        C500260Jjc.LJLJLJ(((C766670U5p) viewHolder).LL, false);
    }

    public final void LLLLLLZZ(int i, List list) {
        if (i != -1) {
            this.LLILZ = i;
        }
        C21342318fd.LIZ(new C0U5Y(this.LL, list), true).LIZJ(this);
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C766670U5p c766670U5p = new C766670U5p(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), this.LLILLL, viewGroup, false));
        try {
            View view = c766670U5p.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c766670U5p.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c766670U5p.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C766670U5p.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c766670U5p.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c766670U5p.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C766670U5p.class.getName();
        return c766670U5p;
    }

    @Override // X.AbstractC761920Tug
    public final void LLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C786410Ut5.LJZI(8, ((C766670U5p) viewHolder).LLILZLL);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C786410Ut5.LJZI(0, ((C766670U5p) viewHolder).LLILZLL);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLIIIILLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C786410Ut5.LJZI(8, ((C766670U5p) viewHolder).LLILZLL);
    }

    @Override // X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLLLLL((C766670U5p) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLLZIL((C766670U5p) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C766670U5p c766670U5p = (C766670U5p) viewHolder;
        LiveEffect liveEffect = (LiveEffect) obj;
        if (liveEffect.LJ()) {
            c766670U5p.LLILZ.setImageResource(liveEffect.LJJJ());
            c766670U5p.LLILZ.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else {
            UrlModel icon = liveEffect.getIcon();
            if (icon != null) {
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(new ImageModel(icon.uri, icon.urlList));
                c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
                c1324610kZfLJIIIZ.LJJI(c766670U5p.LLILZ);
            }
        }
        c766670U5p.LLILLL.setText(liveEffect.getName());
        LLLLLLL(i, c766670U5p, liveEffect);
        C786410Ut5.I7(new ACListenerS79S0300000_12(c766670U5p, this, liveEffect, 25), c766670U5p.itemView);
    }
}
