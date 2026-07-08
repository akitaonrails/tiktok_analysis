package X;

import Y.ARunnableS125S0100000_25;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import irm.AkS92S0100000_25;
import java.util.List;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1664300tPY extends RecyclerView.ViewHolder {
    public final FrameLayout LL;
    public final ImageView LLILLJJLI;
    public final C19470511Fn LLILLL;
    public final View LLILZ;
    public final InterfaceC1664290tPX LLILZIL;
    public AbstractC1664270tPV LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;

    public void S5(boolean z) {
    }

    public void T5(int i) {
    }

    public void V5(int i) {
    }

    public void N5() {
        C19470511Fn c19470511Fn = this.LLILLL;
        if (c19470511Fn != null) {
            Context context = c19470511Fn.getContext();
            c19470511Fn.setText(context != null ? context.getString(R.string.m8s) : null);
        }
        C19470511Fn c19470511Fn2 = this.LLILLL;
        if (c19470511Fn2 != null) {
            c19470511Fn2.LIZIZ(C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.c49));
        }
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        U5(false);
    }

    public AbstractC1664270tPV R5() {
        return this.LLILZLL;
    }

    public void I5(C1664150tPJ c1664150tPJ) {
        if (c1664150tPJ.LJ == 1 || c1664150tPJ.LJFF == 1) {
            C786410Ut5.T4(this.itemView, 0.34f);
        } else {
            C786410Ut5.T4(this.itemView, 1.0f);
        }
        if (c1664150tPJ.LIZJ) {
            N5();
        } else {
            L5(c1664150tPJ.LIZ);
        }
        U5(c1664150tPJ.LJII);
        int i = c1664150tPJ.LJI;
        C19470511Fn c19470511Fn = this.LLILLL;
        if (c19470511Fn != null) {
            c19470511Fn.setIconImagePadding(i);
        }
        V5(c1664150tPJ.LJIIIIZZ);
        T5(c1664150tPJ.LJIIIZ);
        S5(c1664150tPJ.LJIIJ);
    }

    public void L5(Effect effect) {
        int iIntValue;
        Context context;
        if (effect == null) {
            return;
        }
        C19470511Fn c19470511Fn = this.LLILLL;
        if (c19470511Fn != null) {
            c19470511Fn.setText(effect.getName());
        }
        R5().LIZLLL();
        List<String> urlList = effect.getIconUrl().getUrlList();
        int i = 1;
        if (!urlList.isEmpty()) {
            if (C352370Drf.LIZJ(effect)) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ListProtector.get(urlList, 0));
                if (numLJIIJJI != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                C19470511Fn c19470511Fn2 = this.LLILLL;
                if (c19470511Fn2 != null && (context = c19470511Fn2.getContext()) != null) {
                    this.LLILLL.LIZIZ(C800330VaR.LIZIZ(context, iIntValue));
                }
            } else {
                C19470511Fn c19470511Fn3 = this.LLILLL;
                if (c19470511Fn3 != null) {
                    c19470511Fn3.LJ((String) ListProtector.get(urlList, 0));
                }
            }
        }
        C2296208zA.LIZ().getClass();
        if (!C2299808zk.LIZ(effect) && !C1664460tPo.LJFF(effect)) {
            i = 0;
        }
        P5(i);
    }

    public final void P5(int i) {
        int i2 = this.LLIZ;
        if (i == i2) {
            return;
        }
        this.LLIZ = i;
        R5().LIZJ = this.LLIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                } else {
                    this.LLIZLLLIL = System.currentTimeMillis();
                    R5().LIZJ(new AwS604S0100000_25(this, 520));
                    return;
                }
            } else {
                if (2 == i2 && this.LLIZLLLIL > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZLLLIL;
                    if (jCurrentTimeMillis >= 100) {
                        R5().LJ();
                        return;
                    } else {
                        HandlerHook.viewPostDelay(this.itemView, new ARunnableS125S0100000_25(this, 71), ((long) 100) - jCurrentTimeMillis);
                        return;
                    }
                }
                R5().LJ();
                return;
            }
        }
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.c3u);
        }
        ImageView imageView2 = this.LLILLJJLI;
        if (imageView2 != null) {
            C786410Ut5.LJZI(0, imageView2);
        }
        R5().LIZ();
    }

    public void U5(boolean z) {
        int i;
        C19470511Fn c19470511Fn = this.LLILLL;
        if (c19470511Fn != null) {
            c19470511Fn.LJFF(z);
        }
        R5().LIZIZ(z);
        View view = this.LLILZ;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public C1664300tPY(FrameLayout frameLayout, View view, C1664160tPK c1664160tPK, C19670811xi c19670811xi) {
        super(frameLayout);
        this.LL = frameLayout;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = view;
        this.LLILZIL = c1664160tPK;
        this.LLILZLL = new C1664280tPW(view);
        this.LLIZ = -1;
        C786410Ut5.I7(new AkS92S0100000_25(this, 13), this.itemView);
    }
}
