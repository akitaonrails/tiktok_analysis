package X;

import Y.ACListenerS90S0300000_26;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS79S0301000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vUG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744100vUG extends AbstractC2172971A2l<Image, C1744110vUH> {
    public static final C1744120vUI LLIZ = new AbstractC339510DSr<Image>() { // from class: X.0vUI
        @Override // X.AbstractC339510DSr
        public final /* bridge */ /* synthetic */ boolean LIZ(Image image, Image image2) {
            return true;
        }

        @Override // X.AbstractC339510DSr
        public final boolean LIZIZ(Image image, Image image2) {
            return Intrinsics.LJFF(image.getUri(), image2.getUri());
        }
    };
    public final String LLILLJJLI;
    public final AnonymousClass0446 LLILLL;
    public final String LLILZ;
    public final C1700260uLY LLILZIL;
    public InterfaceC1744130vUJ LLILZLL;

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int iIntValue;
        C1744110vUH c1744110vUH = (C1744110vUH) viewHolder;
        Image imageLLLFZ = LLLFZ(i);
        if (c1744110vUH != null) {
            SmartImageView smartImageView = (SmartImageView) c1744110vUH.LLILLL.getValue();
            if (smartImageView != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, smartImageView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -7829368;
                }
                smartImageView.setBackgroundColor(iIntValue);
                if (imageLLLFZ == null) {
                    C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                    C03IT c03it = new C03IT(C13BV.INSTANCE);
                    c1326790kdB.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03it);
                    c1331670kl3LIZLLL.LIZLLL(c1744110vUH.LL);
                    c1331670kl3LIZLLL.LJJ(smartImageView);
                } else {
                    ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                    if (imageLLLFZ.getRadio() == 1.0f) {
                        layoutParams.width = c1744110vUH.LLILLJJLI.LIZIZ();
                        layoutParams.height = c1744110vUH.LLILLJJLI.LIZJ();
                    } else {
                        layoutParams.width = c1744110vUH.LLILLJJLI.LIZIZ();
                        layoutParams.height = c1744110vUH.LLILLJJLI.LIZLLL();
                    }
                    C786410Ut5.G6(smartImageView, layoutParams);
                    C041G.LIZ(imageLLLFZ);
                    C1066100dqi c1066100dqi = new C1066100dqi();
                    c1066100dqi.LIZJ = "sku_head";
                    c1066100dqi.LIZ(-1);
                    c1066100dqi.LIZIZ(imageLLLFZ);
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageLLLFZ);
                    c1331670kl3LIZLLL2.LIZLLL(c1744110vUH.LL);
                    c1331670kl3LIZLLL2.LJJ(smartImageView);
                    c1331670kl3LIZLLL2.LJIIL(new C1776120wJu(c1066100dqi, 3));
                }
            }
            C786410Ut5.I7(new ACListenerS90S0300000_26(c1744110vUH, this, imageLLLFZ, 8), c1744110vUH.itemView);
            final AwS79S0301000_26 awS79S0301000_26 = new AwS79S0301000_26(c1744110vUH, i, this, imageLLLFZ, 0);
            C1700260uLY c1700260uLY = this.LLILZIL;
            if (c1700260uLY != null) {
                c1700260uLY.LIZLLL(new AbstractC1700220uLU() { // from class: X.0uLV
                    @Override // X.AbstractC1700220uLU
                    public final void LIZ() {
                        awS79S0301000_26.invoke();
                    }
                });
            } else {
                awS79S0301000_26.invoke();
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1744110vUH c1744110vUH = new C1744110vUH(new SmartImageView(viewGroup.getContext()), this.LLILLJJLI, this.LLILLL);
        C786410Ut5.W5(c1744110vUH.itemView, new ViewGroup.LayoutParams(-1, -2));
        try {
            View view = c1744110vUH.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1744110vUH.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1744110vUH.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1744110vUH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1744110vUH.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1744110vUH.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1744110vUH.class.getName();
        return c1744110vUH;
    }

    public C1744100vUG(AnonymousClass0446 anonymousClass0446, String str, C1700260uLY c1700260uLY) {
        super(LLIZ);
        this.LLILLJJLI = "SkuHeaderAssem_ImageViewHolder";
        this.LLILLL = anonymousClass0446;
        this.LLILZ = str;
        this.LLILZIL = c1700260uLY;
    }
}
