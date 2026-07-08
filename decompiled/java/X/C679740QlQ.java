package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QlQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679740QlQ extends AbstractC21673619ry<C679720QlO> {
    public final HistoryRecordPageVM LL;
    public final C1A3S LLILLJJLI;
    public ArrayList<C09HE> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        ArrayList<C09HE> arrayList = this.LLILLL;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public C679740QlQ(C1A3S c1a3s, HistoryRecordPageVM historyRecordPageVM) {
        this.LL = historyRecordPageVM;
        this.LLILLJJLI = c1a3s;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [REQUEST, X.0kbR] */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C09HE c09he;
        String imageUrl;
        C679720QlO c679720QlO = (C679720QlO) viewHolder;
        ArrayList<C09HE> arrayList = this.LLILLL;
        if (arrayList != null && (c09he = (C09HE) ListProtector.get(arrayList, i)) != null) {
            C09HE c09he2 = c679720QlO.LLILZIL;
            if (c09he2 != null) {
                imageUrl = c09he2.getImageUrl();
            } else {
                imageUrl = null;
            }
            if (!Intrinsics.LJFF(imageUrl, c09he.getImageUrl())) {
                String imageUrl2 = c09he.getImageUrl();
                int screenWidth = (int) (ScreenUtils.getScreenWidth(c679720QlO.LL.getContext()) / 4.0f);
                C09JS.LIZ.getClass();
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(C09JS.LIZ(imageUrl2)));
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(screenWidth, screenWidth);
                ?? LIZ = c1325700kbQLIZLLL.LIZ();
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = c679720QlO.LLILZ.getController();
                c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM();
                c1320810kTXLIZJ.LIZLLL = LIZ;
                c679720QlO.LLILZ.setController(c1320810kTXLIZJ.LIZ());
            }
            c679720QlO.LLILZIL = c09he;
            C786410Ut5.I7(new AjS65S0100000_10(c679720QlO, 29), c679720QlO.LLILZ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C679720QlO c679720QlO = new C679720QlO(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.br7, viewGroup, false), this.LL, this.LLILLJJLI);
        try {
            View view = c679720QlO.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c679720QlO.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c679720QlO.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C679720QlO.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c679720QlO.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c679720QlO.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C679720QlO.class.getName();
        return c679720QlO;
    }
}
