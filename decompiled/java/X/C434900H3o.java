package X;

import Y.ACListenerS41S0201000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434900H3o extends AbstractC2172971A2l<Image, C434910H3p> {
    public InterfaceC434930H3r LLILLJJLI;
    public int LLILLL;

    public C434900H3o() {
        super(new AbstractC339510DSr<Image>() { // from class: X.0H3q
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(Image image, Image image2) {
                return Intrinsics.LJFF(image, image2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(Image image, Image image2) {
                Image image3 = image;
                Image image4 = image2;
                if (!Intrinsics.LJFF(image3.getThumbUri(), image4.getThumbUri()) && !Intrinsics.LJFF(image3.getUri(), image4.getUri())) {
                    return false;
                }
                return true;
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SmartImageView smartImageView;
        C434910H3p c434910H3p = (C434910H3p) viewHolder;
        Image imageLLLFZ = LLLFZ(i);
        int i2 = this.LLILLL;
        if (c434910H3p.LLILLJJLI != i2 && i2 > 0) {
            c434910H3p.LLILLJJLI = i2;
            C786410Ut5.W5(c434910H3p.itemView, new RecyclerView.LayoutParams(C434910H3p.LLILLL, i2));
        }
        View view = c434910H3p.itemView;
        if ((view instanceof SmartImageView) && (smartImageView = (SmartImageView) view) != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(imageLLLFZ);
            c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.a03, c434910H3p.LL));
            c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJ.LJJ(smartImageView);
            c1331670kl3LJ.LJIIJJI();
        }
        InterfaceC434930H3r interfaceC434930H3r = this.LLILLJJLI;
        if (interfaceC434930H3r != null) {
            interfaceC434930H3r.LIZIZ();
        }
        C786410Ut5.I7(new ACListenerS41S0201000_6(this, c434910H3p, i, imageLLLFZ, 0), c434910H3p.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C434910H3p c434910H3p = new C434910H3p(viewGroup.getContext());
        try {
            View view = c434910H3p.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c434910H3p.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c434910H3p.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C434910H3p.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c434910H3p.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c434910H3p.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C434910H3p.class.getName();
        return c434910H3p;
    }
}
