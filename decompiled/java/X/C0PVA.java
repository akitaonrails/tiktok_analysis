package X;

import Y.ATListenerS338S0200000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0PVA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PVA extends AbstractC21673619ry<C0PV9> {
    public List<EcClickSearchWord> LL = C13BV.INSTANCE;
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public String LLILZ = "";
    public EnumC1986407qI LLILZIL;
    public EnumC645610PTz LLILZLL;
    public ISearchContextAbility LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0PVA() {
        this.LLILZIL = ((Number) C1842007Ji.LIZ.getValue()).intValue() == 1 ? EnumC1986407qI.TEXT : EnumC1986407qI.IMAGE;
        this.LLILZLL = EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0PV9 c0pv9 = (C0PV9) viewHolder;
        EcClickSearchWord ecClickSearchWord = (EcClickSearchWord) ListProtector.get(this.LL, i);
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        EnumC645610PTz enumC645610PTz = this.LLILZLL;
        ISearchContextAbility iSearchContextAbility = this.LLIZ;
        if (ecClickSearchWord == null) {
            c0pv9.getClass();
            return;
        }
        c0pv9.LL = ecClickSearchWord;
        c0pv9.LLILLJJLI = str;
        c0pv9.LLILLL = str2;
        c0pv9.LLILZ = str3;
        c0pv9.LLILZIL = enumC645610PTz;
        c0pv9.LLILZLL = iSearchContextAbility;
        View view = c0pv9.itemView;
        final Context context = view.getContext();
        C0PVJ c0pvj = new C0PVJ(context) { // from class: X.0PVE
            @Override // X.C0PVJ
            public final void LIZ(boolean z) {
            }
        };
        c0pvj.LLIZ = new ATListenerS338S0200000_10(c0pv9, ecClickSearchWord, 6);
        view.setOnTouchListener(c0pvj);
        View view2 = c0pv9.itemView;
        IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
        String str4 = ecClickSearchWord.imageUrl;
        if (str4 == null) {
            str4 = "";
        }
        String strLJJJJLI = iEcomSearchService.LJJJJLI(str4, EnumC1769850w9n.GENERAL_SEARCH_EC_CS_CARD_PRODUCT);
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strLJJJJLI);
        c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) view2.findViewById(R.id.gfu));
        c1331670kl3LIZLLL.LJIIJ(new C0R4N(1));
        ((TextView) view2.findViewById(R.id.gfv)).setText(ecClickSearchWord.word);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C0PV9.LLIZ;
        EnumC1986407qI enumC1986407qI = this.LLILZIL;
        View viewSd = C786410Ut5.Sd(R.layout.bok, C786410Ut5.ne(viewGroup.getContext()), null);
        C0Q72.LIZ(viewSd, C418440Gaw.LIZIZ(2));
        int i3 = C1986507qJ.LIZ[enumC1986407qI.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                C786410Ut5.LLFF(8, (SmartImageView) viewSd.findViewById(R.id.gfu));
            } else {
                throw new C1954807lC();
            }
        } else {
            C0Q72.LIZ(viewSd.findViewById(R.id.gfu), C418440Gaw.LIZIZ(1));
        }
        C0PV9 c0pv9 = new C0PV9(viewSd);
        try {
            View view = c0pv9.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0pv9.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0pv9.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0PV9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0pv9.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0pv9.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0PV9.class.getName();
        return c0pv9;
    }
}
