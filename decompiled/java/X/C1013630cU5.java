package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.zhiliaoapp.musically.R;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cU5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013630cU5 extends RecyclerView.ViewHolder implements InterfaceC497601wk {
    public final /* synthetic */ C054G LL;
    public final InterfaceC1013420cTk LLILLJJLI;
    public final C01S9<C1013200cTO> LLILLL;
    public final FrameLayout LLILZ;
    public final SmartImageView LLILZIL;
    public C1013450cTn LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public AnoleMultiContentItemModel LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final C01GW LLJILJIL;

    public final void N5() {
        if (!this.itemView.isAttachedToWindow()) {
            C1022620cia.LIZ("MultiContentVideoItemViewHolder", "tryAdaptionSize isAttachedToWindow = fale");
            return;
        }
        if (I5(this.LLJ, false)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        C786410Ut5.a6(this.LLILZ, layoutParams);
        this.LLJI = -1;
        this.LLJIJIL = -1;
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    public final boolean I5(AnoleMultiContentItemModel anoleMultiContentItemModel, boolean z) {
        Integer videoWith;
        float fLIZIZ;
        if (anoleMultiContentItemModel == null) {
            return false;
        }
        try {
            int measuredWidth = this.LLILZ.getMeasuredWidth();
            int measuredHeight = this.LLILZ.getMeasuredHeight();
            if (this.LLIZ) {
                measuredWidth = this.itemView.getMeasuredWidth();
                measuredHeight = this.itemView.getMeasuredHeight();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("component adaptionContainerSize containerWidth = ");
            sbLIZ.append(measuredWidth);
            sbLIZ.append(", containerHeight=");
            sbLIZ.append(measuredHeight);
            sbLIZ.append(", fromLayoutChanged = ");
            sbLIZ.append(z);
            C1022620cia.LIZ("MultiContentVideoItemViewHolder", C2188811AlT.LIZIZ(sbLIZ));
            if (measuredWidth > 0 && measuredHeight > 0 && (videoWith = anoleMultiContentItemModel.getVideoWith()) != null) {
                int iIntValue = videoWith.intValue();
                Integer videoHeight = anoleMultiContentItemModel.getVideoHeight();
                if (videoHeight != null) {
                    int iIntValue2 = videoHeight.intValue();
                    C0RG7 c0rg7LJIIJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJIIJ();
                    if (c0rg7LJIIJ != null) {
                        C533990Kwv c533990Kwv = new C533990Kwv(iIntValue, iIntValue2, measuredWidth, measuredHeight);
                        if (c0rg7LJIIJ.LIZLLL()) {
                            C533990Kwv c533990KwvLIZIZ = c0rg7LJIIJ.LIZIZ(c533990Kwv);
                            if (L5(c533990KwvLIZIZ.LIZJ, c533990KwvLIZIZ.LIZLLL)) {
                                return true;
                            }
                        }
                    }
                    if (this.LLIZ) {
                        fLIZIZ = Float.MAX_VALUE;
                    } else {
                        fLIZIZ = C0RG1.LIZIZ();
                    }
                    VideoAdaptionResult videoAdaptionResultLIZIZ = C20563515dJ.LIZIZ(measuredWidth, measuredHeight, iIntValue, iIntValue2, C20563515dJ.LIZ(fLIZIZ, Float.MAX_VALUE, measuredWidth, measuredHeight, iIntValue, iIntValue2));
                    return L5(videoAdaptionResultLIZIZ.getWidth(), videoAdaptionResultLIZIZ.getHeight());
                }
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public final boolean L5(int i, int i2) {
        try {
            if (i2 == this.LLJIJIL && i == this.LLJI) {
                return true;
            }
            ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = i;
            C786410Ut5.a6(this.LLILZ, layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.LLILZIL.getLayoutParams();
            layoutParams2.height = i2;
            layoutParams2.width = i;
            C786410Ut5.G6(this.LLILZIL, layoutParams2);
            this.LLJI = i;
            this.LLJIJIL = i2;
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public C1013630cU5(View view, InterfaceC1013420cTk interfaceC1013420cTk, AnonymousClass0950 anonymousClass0950) {
        super(view);
        this.LL = C2296808zG.LIZIZ();
        this.LLILLJJLI = interfaceC1013420cTk;
        this.LLILLL = anonymousClass0950;
        this.LLILZ = (FrameLayout) view.findViewById(R.id.video_pager_player_container);
        this.LLILZIL = (SmartImageView) view.findViewById(R.id.oo2);
        this.LLIZLLLIL = -1;
        this.LLJI = -1;
        this.LLJIJIL = -1;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 9));
        C23250099c.LIZLLL(this, null, null, new C06ZJ(this, null), 3);
    }
}
