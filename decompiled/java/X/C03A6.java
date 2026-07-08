package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03A6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03A6 extends AbstractC2172971A2l<Image, C03A7> {
    public final boolean LLILLJJLI;

    public C03A6() {
        super(new AbstractC339510DSr<Image>() { // from class: X.03A8
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(Image image, Image image2) {
                return Intrinsics.LJFF(image, image2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(Image image, Image image2) {
                return Intrinsics.LJFF(Image.class, Image.class);
            }
        });
        this.LLILLJJLI = true;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C03IT imageUrlModel;
        C03A7 c03a7 = (C03A7) viewHolder;
        if (i < getItemCount()) {
            try {
                Image imageLLLFZ = LLLFZ(i);
                if (imageLLLFZ != null && (imageUrlModel = imageLLLFZ.toImageUrlModel()) != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                    c1331670kl3LIZLLL.LJJIII = EnumC1334360kpO.HIGH;
                    c1331670kl3LIZLLL.LIZLLL("aggregate_image_tag");
                    c1331670kl3LIZLLL.LJJ(c03a7.LL);
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                }
                c03a7.LL.setColorFilter(134217728);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (this.LLILLJJLI) {
            i2 = R.layout.apg;
        } else {
            i2 = R.layout.apo;
        }
        C03A7 c03a7 = new C03A7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i2, viewGroup, false));
        try {
            View view = c03a7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c03a7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c03a7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C03A7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c03a7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c03a7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C03A7.class.getName();
        return c03a7;
    }
}
