package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.sug.core.ui.SugLiveLottieDrawable;

/* JADX INFO: renamed from: X.0QMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669080QMg extends RecyclerView.ViewHolder implements InterfaceC669260QMy, InterfaceC487330J9f {
    public static final /* synthetic */ int LLLF = 0;
    public final String LL;
    public final InterfaceC669220QMu LLILLJJLI;
    public final C0QN6 LLILLL;
    public long LLILZ;
    public final C21415018rM LLILZIL;
    public final LinearLayout LLILZLL;
    public final C21415018rM LLIZ;
    public final TuxIconView LLIZLLLIL;
    public final TuxIconView LLJ;
    public final C1610670s13 LLJI;
    public final C1610770s1D LLJIJIL;
    public SugLiveLottieDrawable LLJILJIL;
    public final FrameLayout LLJILJILJ;
    public C1608510rxZ LLJILLL;
    public long LLJJ;
    public final FrameLayout LLJJI;
    public final SmartImageView LLJJIII;
    public SearchSugEntity LLJJIJI;
    public SearchHistory LLJJIJIIJIL;
    public int LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public C0QK1 LLJJJJ;
    public int LLJJJJJIL;
    public String LLJJJJLIIL;
    public boolean LLJJL;
    public C0QN2 LLJJLIIIJLLLLLLLZ;
    public C669100QMi LLJL;
    public final float LLJLIL;
    public final int LLJLILLLLZIIL;
    public final int LLJLL;
    public final TuxIconDrawable LLJLLIL;
    public final TuxIconDrawable LLJLLL;
    public final C01GW LLJZ;
    public final TuxIconDrawable LLJZIJLIL;
    public final TuxIconDrawable LLL;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5() {
        /*
            r17 = this;
            r3 = r17
            java.lang.String r4 = r3.LLJJJ
            int r5 = r3.LLJJJJJIL
            com.ss.android.ugc.aweme.search.model.SearchSugEntity r6 = r3.LLJJIJI
            java.lang.String r7 = X.C0QNF.LIZLLL(r6)
            java.lang.String r8 = r3.LL
            int r9 = r3.LLJLL
            android.view.View r0 = r3.itemView
            androidx.fragment.app.Fragment r10 = X.C946803n0.LIZ(r0)
            android.view.View r0 = r3.itemView
            android.content.Context r0 = r0.getContext()
            X.19EG r11 = X.C1388190mED.LIZIZ(r0)
            com.ss.android.ugc.aweme.search.model.SearchHistory r0 = r3.LLJJIJIIJIL
            r2 = 0
            if (r0 == 0) goto L4b
            java.lang.String r12 = r0.musicId
            boolean r1 = r0.isOriginalMusic
            r0 = 1
            if (r1 != r0) goto L4c
            java.lang.String r13 = "1"
        L2e:
            X.0QK1 r0 = r3.LLJJJJ
            java.lang.String r15 = X.C668470QJx.LIZIZ(r0)
            if (r15 != 0) goto L42
            com.ss.android.ugc.aweme.search.model.SearchSugEntity r0 = r3.LLJJIJI
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r0.mWord
            if (r0 == 0) goto L49
            java.lang.String r15 = r0.getWordsLabel()
        L42:
            r14 = 0
            r16 = 1024(0x400, float:1.435E-42)
            X.C0QJY.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L49:
            r15 = r2
            goto L42
        L4b:
            r12 = r2
        L4c:
            java.lang.String r13 = "0"
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C669080QMg.N5():void");
    }

    @Override // X.InterfaceC669260QMy
    public final void onViewDetachedFromWindow() {
        SugExtraInfo sugExtraInfo;
        SugLiveLottieDrawable sugLiveLottieDrawable = this.LLJILJIL;
        if (sugLiveLottieDrawable != null) {
            sugLiveLottieDrawable.LIZ();
        }
        this.LLJILJIL = null;
        if (C0QNF.LIZJ(this.LLJJIJI)) {
            C1608510rxZ c1608510rxZ = this.LLJILLL;
            if (c1608510rxZ != null) {
                c1608510rxZ.LJIIIIZZ();
            }
            C1608510rxZ c1608510rxZ2 = this.LLJILLL;
            if (c1608510rxZ2 != null) {
                c1608510rxZ2.LJII();
            }
            SearchSugEntity searchSugEntity = this.LLJJIJI;
            if (searchSugEntity != null && (sugExtraInfo = searchSugEntity.sugExtraInfo) != null && sugExtraInfo.isLiveQuery()) {
                C1610670s13 c1610670s13 = this.LLJI;
                if (c1610670s13 != null) {
                    c1610670s13.LJFF(false);
                }
                C1610770s1D c1610770s1D = this.LLJIJIL;
                if (c1610770s1D != null) {
                    C786410Ut5.Y(c1610770s1D, 8);
                }
                this.LLJILLL = null;
            }
        }
        if (C0FNT.LIZ(this.itemView.getContext()) != null) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // X.InterfaceC669260QMy
    public final void onViewAttachedToWindow() {
        boolean zLJI = MethodIDManager.LJI(72074);
        N5();
        Activity activityLIZ = C0FNT.LIZ(this.itemView.getContext());
        if (activityLIZ != null) {
            C487280J9a.LIZ(activityLIZ.hashCode(), this);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[PHI: r16
      0x0073: PHI (r16v1 X.0QWe) = (r16v3 X.0QWe), (r16v6 X.0QWe) binds: [B:22:0x0071, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.search.model.SearchSugEntity r22) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C669080QMg.I5(com.ss.android.ugc.aweme.search.model.SearchSugEntity):void");
    }

    public final void L5(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh highlight ");
        SearchSugEntity searchSugEntity = this.LLJJIJI;
        Boolean boolValueOf = null;
        if (searchSugEntity != null) {
            str2 = searchSugEntity.content;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(" history ");
        SearchSugEntity searchSugEntity2 = this.LLJJIJI;
        if (searchSugEntity2 != null) {
            boolValueOf = Boolean.valueOf(searchSugEntity2.LIZJ());
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        SearchSugEntity searchSugEntity3 = this.LLJJIJI;
        if (searchSugEntity3 != null) {
            searchSugEntity3.LJI = str;
            I5(searchSugEntity3);
        }
    }

    @Override // X.InterfaceC669260QMy
    public final void onVisibilityChanged(boolean z) {
        SugLiveLottieDrawable sugLiveLottieDrawable = this.LLJILJIL;
        if (sugLiveLottieDrawable != null) {
            sugLiveLottieDrawable.onVisibilityChanged(z);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        if (C1820507Bb.LIZIZ) {
            Context context = this.itemView.getContext();
            if (context != null) {
                C669090QMh.LIZ.getClass();
                C669090QMh.LJIIIZ = ((C12ES.LJIIJ(context) - C669090QMh.LIZIZ) - C669090QMh.LJ) - C669090QMh.LJII;
            }
            SearchSugEntity searchSugEntity = this.LLJJIJI;
            if (searchSugEntity != null) {
                I5(searchSugEntity);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C669080QMg(android.view.View r10, java.lang.String r11, com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew r12, X.C669210QMt r13, X.InterfaceC668720QKw r14) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C669080QMg.<init>(android.view.View, java.lang.String, com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew, X.0QMt, X.0QKw):void");
    }
}
