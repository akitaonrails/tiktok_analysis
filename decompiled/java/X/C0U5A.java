package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS256S0300000_12;
import kotlin.jvm.internal.AwS413S0200000_12;

/* JADX INFO: renamed from: X.0U5A, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U5A extends C0U5B {
    public final DataChannel LLJ;
    public final boolean LLJI;
    public C0U58 LLJIJIL;

    @Override // X.C0U5B
    public final void LLLLLLZ() {
        if (this.LLJI) {
            int i = 0;
            for (Object obj : (ArrayList) this.LL) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                LiveEffect liveEffect = (LiveEffect) obj;
                if (liveEffect.LLJZ()) {
                    if (LLLLLLL(liveEffect)) {
                        if (i < ((ArrayList) this.LL).size()) {
                            notifyItemChanged(i, "item_lock");
                        }
                    } else if (i < ((ArrayList) this.LL).size()) {
                        notifyItemChanged(i, "item_unlock");
                    }
                }
                i = i2;
            }
        }
    }

    public final void LLLLZI(LiveEffect liveEffect) {
        UrlModel urlModel = LiveEffect.LIZLLL;
        if (!C0UCX.LIZ(this.LLILZLL, liveEffect)) {
            LLLJIL(this.LLILZLL);
            this.LLILZLL = liveEffect;
            if (liveEffect != null) {
                LLLILZLLLI(liveEffect);
            }
        }
    }

    @Override // X.C0U5B
    public final void LLLLLLLZIL(LiveEffect liveEffect, View view) {
        if (this.LLJI) {
            C1828990xhB c1828990xhB = C1828990xhB.LIZ;
            Context context = view.getContext();
            DataChannel dataChannel = this.LLJ;
            AwS256S0300000_12 awS256S0300000_12 = new AwS256S0300000_12(this, liveEffect, view, 15);
            c1828990xhB.getClass();
            C1828990xhB.LIZ(context, dataChannel, "background", liveEffect, awS256S0300000_12, null);
            return;
        }
        C0U58 c0u58 = this.LLJIJIL;
        if (c0u58 != null) {
            c0u58.LJFF(liveEffect);
        }
        if (liveEffect.LJIJJLI()) {
            LLLLLLLLLL(liveEffect);
        } else {
            LLLLLLIL(liveEffect);
        }
    }

    public final void LLLLZ(Context context, LiveEffect liveEffect) {
        if (this.LLJI) {
            C1828990xhB c1828990xhB = C1828990xhB.LIZ;
            DataChannel dataChannel = this.LLJ;
            AwS413S0200000_12 awS413S0200000_12 = new AwS413S0200000_12(this, liveEffect, 71);
            c1828990xhB.getClass();
            C1828990xhB.LIZ(context, dataChannel, "background", liveEffect, awS413S0200000_12, null);
            return;
        }
        C0U58 c0u58 = this.LLJIJIL;
        if (c0u58 != null) {
            c0u58.LJFF(liveEffect);
        }
        if (liveEffect.LJIJJLI()) {
            LLLLLLLLLL(liveEffect);
        } else {
            LLLLLLIL(liveEffect);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0U5C c0u5c = new C0U5C(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fzr, viewGroup, false));
        try {
            View view = c0u5c.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0u5c.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0u5c.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0U5C.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0u5c.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0u5c.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0U5C.class.getName();
        return c0u5c;
    }

    public C0U5A(DataChannel dataChannel, String str, BgEffectViewModel bgEffectViewModel) {
        super(dataChannel, bgEffectViewModel);
        this.LLJ = dataChannel;
        this.LLJI = C760940Tt6.LIZ(str);
    }

    public static final void LLLLLZ(C0U5A c0u5a, LiveEffect liveEffect, View view) {
        c0u5a.getClass();
        if (liveEffect.LJIJJLI()) {
            c0u5a.LLLLLLLLLL(liveEffect);
        } else {
            c0u5a.LLLLLLIL(liveEffect);
        }
    }

    public static final void LLLLLZIL(ImageModel imageModel, View view, ImageView imageView) {
        if (view != null && imageView != null) {
            C500260Jjc.LLFFF(view);
            C500260Jjc.LLFFF(imageView);
            C1324610kZf c1324610kZfLIZ = C1819620xS4.LIZ().LIZ(imageView.getWidth(), imageView.getHeight());
            c1324610kZfLIZ.LJJIIJZLJL = true;
            c1324610kZfLIZ.LJIIIZ(imageModel);
            c1324610kZfLIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLIZ.LJJ = Boolean.FALSE;
            c1324610kZfLIZ.LJJI(imageView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    @Override // X.AbstractC761920Tug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLL(int r9, androidx.recyclerview.widget.RecyclerView.ViewHolder r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U5A.LLLLLL(int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object):void");
    }
}
