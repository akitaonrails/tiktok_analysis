package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabIcon;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0wHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774470wHF extends AbstractC1774490wHH<AbstractC1774570wHP> {
    public boolean LLILZIL;
    public float LLILZLL;
    public C1774510wHJ LLIZ;
    public C1774500wHI LLIZLLLIL;
    public AwS605S0100000_26 LLJ;
    public List<TabItem> LLILZ = C13BV.INSTANCE;
    public String LLJI = "";

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        TabIcon tabIcon;
        List<String> list;
        String str;
        List<String> list2;
        String str2;
        TabItem tabItem = (TabItem) ListProtector.get(this.LLILZ, i);
        if (this.LLILZIL) {
            tabIcon = tabItem.darkIcon;
        } else {
            tabIcon = tabItem.icon;
        }
        if (tabIcon != null && (list2 = tabIcon.urlList) != null && (str2 = (String) C13LP.LJJJLL(list2)) != null && !TextUtils.isEmpty(str2)) {
            return 1;
        }
        TabIcon tabIcon2 = tabItem.icon;
        if (tabIcon2 != null && (list = tabIcon2.urlList) != null && (str = (String) C13LP.LJJJLL(list)) != null && !TextUtils.isEmpty(str)) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        AwS605S0100000_26 awS605S0100000_26;
        AbstractC1774570wHP abstractC1774570wHP = (AbstractC1774570wHP) viewHolder;
        super.onViewAttachedToWindow(abstractC1774570wHP);
        if ((abstractC1774570wHP instanceof C1774580wHQ) && abstractC1774570wHP != null && (awS605S0100000_26 = this.LLJ) != null) {
            awS605S0100000_26.invoke(abstractC1774570wHP);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029e A[PHI: r1 r2
      0x029e: PHI (r1v7 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabIcon) = 
      (r1v6 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabIcon)
      (r1v21 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabIcon)
      (r1v21 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabIcon)
     binds: [B:126:0x029c, B:72:0x0165, B:74:0x0169] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v15 java.lang.String), (r2v15 java.lang.String) binds: [B:126:0x029c, B:72:0x0165, B:74:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a3 A[PHI: r2 r8
      0x02a3: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v11 java.lang.String) binds: [B:128:0x029f, B:77:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r8v2 float) = (r8v1 float), (r8v9 float) binds: [B:128:0x029f, B:77:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f A[PHI: r1 r2 r8
      0x016f: PHI (r1v16 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabIcon) = 
      (r1v7 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabIcon)
      (r1v21 com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.TabIcon)
     binds: [B:128:0x029f, B:75:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r2v11 java.lang.String) = (r2v4 java.lang.String), (r2v15 java.lang.String) binds: [B:128:0x029f, B:75:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r8v9 float) = (r8v1 float), (r8v10 float) binds: [B:128:0x029f, B:75:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    @Override // X.AbstractC1774490wHH
    /* JADX INFO: renamed from: LLLFZ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.AbstractC1774570wHP r26, int r27) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1774470wHF.onBindViewHolder(X.0wHP, int):void");
    }

    @Override // X.AbstractC1774490wHH, X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((AbstractC1774570wHP) viewHolder, i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1774550wHN;
        if (i == 1) {
            c1774550wHN = new C1774540wHM(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bq3, viewGroup, false));
        } else {
            c1774550wHN = new C1774550wHN(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bq4, viewGroup, false));
        }
        try {
            View view = c1774550wHN.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1774550wHN.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1774550wHN.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1774550wHN.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1774550wHN.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1774550wHN.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1774550wHN.getClass().getName();
        return c1774550wHN;
    }
}
