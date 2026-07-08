package X;

import Y.ACListenerS127S0200000_25;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tOS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663620tOS extends AbstractC21673619ry<C1663630tOT> {
    public final Function2<Integer, AbstractC1663570tON, Unit> LL;
    public final Function2<Integer, AbstractC1663570tON, Unit> LLILLJJLI;
    public final Function0<AbstractC1663570tON> LLILLL;
    public final int LLILZ = R.layout.wq;
    public final int LLILZIL = R.layout.wp;
    public final int LLILZLL = 1;
    public final int LLIZ = 2;
    public final CopyOnWriteArrayList<AbstractC1663570tON> LLIZLLLIL = new CopyOnWriteArrayList<>();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZLLLIL.size();
    }

    public final int LLLFZ(AbstractC1663570tON abstractC1663570tON) {
        int i = 0;
        if (abstractC1663570tON instanceof C1663580tOO) {
            return 0;
        }
        Iterator<AbstractC1663570tON> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            if (!C1663610tOR.LIZJ(it2.next(), abstractC1663570tON)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LLIZLLLIL.get(i) instanceof C1663580tOO) {
            return this.LLIZ;
        }
        return this.LLILZLL;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1663630tOT c1663630tOT = (C1663630tOT) viewHolder;
        if (i >= 0 && i < getItemCount()) {
            AbstractC1663570tON abstractC1663570tON = this.LLIZLLLIL.get(i);
            c1663630tOT.getClass();
            if (abstractC1663570tON instanceof InterfaceC1663600tOQ) {
                String str = (String) C13LP.LJJJLL(C1663610tOR.LIZ(abstractC1663570tON).getIconUrl().getUrlList());
                if (str != null) {
                    C1324750kZt.LJ((C1322110kVd) c1663630tOT.LLILLJJLI.getValue(), UriProtector.parse(str), -1, -1, new AbstractC1291220jho() { // from class: X.0jhp
                        @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
                        public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
                            int width;
                            if (bitmap.getWidth() >= bitmap.getHeight()) {
                                width = bitmap.getHeight();
                            } else {
                                width = bitmap.getWidth();
                            }
                            int i2 = (int) (((double) width) / 1.2d);
                            int i3 = (width - i2) / 2;
                            return C1323050kX9.LJFF(abstractC1301670jyf.LIZJ(Bitmap.createBitmap(bitmap, i3, i3, i2, i2, (Matrix) null, false)));
                        }
                    }, Bitmap.Config.RGB_565, null, null);
                }
                ((TextView) c1663630tOT.LLILLL.getValue()).setText(C1663610tOR.LIZ(abstractC1663570tON).getName());
            }
            C786410Ut5.I7(new ACListenerS127S0200000_25(c1663630tOT, this, 2), c1663630tOT.itemView);
            this.LLILLJJLI.invoke(Integer.valueOf(i), this.LLIZLLLIL.get(i));
            c1663630tOT.itemView.setTag(this.LLIZLLLIL.get(i));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1663630tOT c1663630tOT;
        if (i == this.LLIZ) {
            c1663630tOT = new C1663630tOT(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), this.LLILZIL, viewGroup, false), this.LLILLL);
        } else {
            c1663630tOT = new C1663630tOT(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), this.LLILZ, viewGroup, false), this.LLILLL);
        }
        try {
            View view = c1663630tOT.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1663630tOT.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1663630tOT.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1663630tOT.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1663630tOT.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1663630tOT.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1663630tOT.class.getName();
        return c1663630tOT;
    }

    public C1663620tOS(C1663920tOw c1663920tOw, C1663640tOU c1663640tOU, C1664050tP9 c1664050tP9) {
        this.LL = c1663920tOw;
        this.LLILLJJLI = c1663640tOU;
        this.LLILLL = c1664050tP9;
    }
}
