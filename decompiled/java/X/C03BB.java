package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03BB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03BB extends AbstractC21673619ry<C03BC> {
    public List<C443120HZe<Image, Integer, String>> LL;
    public Function0<Unit> LLILLJJLI;
    public boolean LLILLL;

    public C03BB() {
        this(null);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C443120HZe<Image, Integer, String>> list = this.LL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C03BB(Object obj) {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = true;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int size;
        List<C443120HZe<Image, Integer, String>> list;
        float f;
        String strLIZIZ;
        C03BC c03bc = (C03BC) viewHolder;
        List<C443120HZe<Image, Integer, String>> list2 = this.LL;
        if (list2 != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        if (i < size && (list = this.LL) != null) {
            C443120HZe c443120HZe = (C443120HZe) ListProtector.get(list, i);
            boolean z = this.LLILLL;
            c03bc.getClass();
            Image image = (Image) c443120HZe.getFirst();
            SmartImageView smartImageView = (SmartImageView) c03bc.LL.findViewById(R.id.puk);
            C03IT imageUrlModel = image.toImageUrlModel();
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
            c1331670kl3LIZLLL.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LIZLLL.LIZLLL("product_image_tag");
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            SmartImageView smartImageView2 = (SmartImageView) c03bc.LL.findViewById(R.id.puk);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            C786410Ut5.u5(smartImageView2, f);
            if (((Number) c443120HZe.getSecond()).intValue() <= 1) {
                strLIZIZ = "";
            } else if (C426750GoL.LIZLLL(c03bc.LL.getContext())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((Number) c443120HZe.getSecond()).intValue());
                sbLIZ.append('x');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('x');
                sbLIZ2.append(((Number) c443120HZe.getSecond()).intValue());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (z) {
                C0H1U.LJIIL((TextView) c03bc.LL.findViewById(R.id.pum), strLIZIZ, true);
            } else {
                C0H1U.LIZIZ(c03bc.LL.findViewById(R.id.pum));
            }
            if (C703302op.LIZ((String) c443120HZe.getThird()) && z) {
                C12ES.LJIILL(0, c03bc.LL.findViewById(R.id.puh));
                C0H1U.LJIIL((TextView) c03bc.LL.findViewById(R.id.puh), (CharSequence) c443120HZe.getThird(), true);
            } else {
                C0H1U.LIZIZ(c03bc.LL.findViewById(R.id.puh));
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        View viewLIZJ = C03XA.LIZJ(context, R.layout.apk, viewGroup, false);
        C786410Ut5.I7(new AjS60S0100000_1(this, 10), viewLIZJ);
        C03BC c03bc = new C03BC(viewLIZJ);
        try {
            View view = c03bc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c03bc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c03bc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C03BC.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c03bc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c03bc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C03BC.class.getName();
        return c03bc;
    }
}
