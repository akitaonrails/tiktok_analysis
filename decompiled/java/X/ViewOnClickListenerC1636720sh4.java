package X;

import Y.ARunnableS106S0100000_6;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnClickListenerC1636720sh4 extends C1636260sgK<Effect> implements View.OnClickListener {
    public final InterfaceC1636390sgX LLILZIL;
    public final InterfaceC1624480sNK LLILZLL;
    public final InterfaceC1635560sfC LLIZ;
    public InterfaceC1631540sYi<Effect> LLIZLLLIL;
    public InterfaceC1625970sPj LLJ;
    public ObjectAnimator LLJI;
    public final C1322110kVd LLJIJIL;
    public final ImageView LLJILJIL;
    public final ImageView LLJILJILJ;

    public final void T5() {
        ObjectAnimator objectAnimator = this.LLJI;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        C786410Ut5.Cb(this.LLJILJIL, 0.0f);
        this.LLJILJIL.setImageDrawable(C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.ac4));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int adapterPosition;
        DATA data = this.LL;
        if (data == 0 || -1 == (adapterPosition = getAdapterPosition())) {
            return;
        }
        this.LLIZLLLIL.ax0(new C1629840sVy<>(data, adapterPosition, this.LLILLJJLI, false, false, null, null, new AwS569S0100000_25(this, 1168), null, 760));
    }

    @Override // X.C1636260sgK
    public final void L5(int i, Object obj) {
        List<String> urlList;
        String str;
        Effect effect = (Effect) obj;
        C786410Ut5.V4(this.LLJILJILJ, 0.0f);
        if (C1624570sNT.LJJIIJ(effect)) {
            UrlModel iconUrl = effect.getIconUrl();
            if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
                this.LLJIJIL.setImageAlpha(128);
                C1638230sjV c1638230sjV = C1638230sjV.LIZ;
                if (C1326470kcf.LIZJ()) {
                    c1638230sjV.LJFF(effect, this.LLJIJIL, -1, -1, Bitmap.Config.ARGB_8888, null, null, new AwS174S1100000_25(this, str, 19));
                } else {
                    C1324750kZt.LJIIIZ(this.LLJIJIL, str, -1, -1);
                }
            }
        } else {
            this.LLJIJIL.setImageResource(R.drawable.c3s);
        }
        this.LLIZ.LIZ(effect, new IIsTagNeedUpdatedListener() { // from class: X.0sh6
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedNotUpdate() {
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedUpdate() {
            }
        });
        this.itemView.setContentDescription(effect.getName());
        int i2 = this.LLILLJJLI;
        InterfaceC1625970sPj interfaceC1625970sPj = this.LLJ;
        if (interfaceC1625970sPj != null && interfaceC1625970sPj.LLIIIL(i2, i, effect)) {
            HandlerHook.viewPost(this.itemView, new ARunnableS106S0100000_6(this, 325));
        }
    }

    @Override // X.C1636260sgK
    public final void P5(float f, boolean z) {
        if (z) {
            this.itemView.setOnTouchListener(new ViewOnTouchListenerC1657570tEh(f, 100L, this.LLJIJIL));
        } else {
            this.itemView.setOnTouchListener(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1636260sgK
    public final void N5(int i, EnumC1641420soe enumC1641420soe, Integer num, Object obj) {
        String effectId;
        Effect effect = (Effect) obj;
        String effectId2 = effect.getEffectId();
        Effect effect2 = (Effect) this.LL;
        if (effect2 != null) {
            effectId = effect2.getEffectId();
        } else {
            effectId = null;
        }
        if (Intrinsics.LJFF(effectId2, effectId)) {
            int i2 = C1632160sZi.LIZ[enumC1641420soe.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            C786410Ut5.LJZI(0, this.LLJILJIL);
                            this.LLJILJIL.setImageDrawable(C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.ac5));
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJILJIL, "rotation", 0.0f, 360.0f);
                            objectAnimatorOfFloat.setDuration(800L);
                            objectAnimatorOfFloat.setRepeatMode(1);
                            objectAnimatorOfFloat.setRepeatCount(-1);
                            C786410Ut5.Pd(objectAnimatorOfFloat);
                            this.LLJI = objectAnimatorOfFloat;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        T5();
                        InterfaceC1636390sgX interfaceC1636390sgX = this.LLILZIL;
                        if (interfaceC1636390sgX != null && !interfaceC1636390sgX.LIZ((Effect) this.LL)) {
                            C786410Ut5.V4(this.LLJILJILJ, 0.0f);
                            this.LLJILJILJ.animate().alpha(1.0f).setDuration(150L).start();
                        }
                    }
                } else {
                    T5();
                }
            } else {
                C786410Ut5.LJZI(0, this.LLJILJIL);
            }
            if (C1625940sPg.LJIIL(this.LLILZLL, effect)) {
                this.LLJILJILJ.animate().alpha(1.0f).setDuration(150L).start();
            } else {
                this.LLJILJILJ.animate().alpha(0.0f).setDuration(150L).start();
            }
        }
    }

    public ViewOnClickListenerC1636720sh4(View view, InterfaceC1636390sgX interfaceC1636390sgX, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi<Effect> interfaceC1631540sYi) {
        super(view);
        this.LLILZIL = interfaceC1636390sgX;
        this.LLILZLL = interfaceC1624480sNK;
        this.LLIZ = interfaceC1635560sfC;
        this.LLIZLLLIL = interfaceC1631540sYi;
        this.LLJIJIL = (C1322110kVd) view.findViewById(R.id.khd);
        this.LLJILJIL = (ImageView) view.findViewById(R.id.khf);
        C786410Ut5.I7(this, view);
        this.LLJILJILJ = (ImageView) view.findViewById(R.id.khc);
    }
}
