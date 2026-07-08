package com.bytedance.android.live.rank.impl.sticker.dialog;

import X.C1119060fE8;
import X.C1119210fEN;
import X.C16F5;
import X.C1782380wU0;
import X.C1826520xdC;
import X.C20736316Cj;
import X.C21594519fD;
import X.C497740JfY;
import X.C743710TFh;
import X.C786410Ut5;
import X.InterfaceC1846850y9z;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankStickerFaqUrlSettings;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import wh6.AbS329S0300000_17;
import wh6.AbS507S0200000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class TabRankStickerDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/HELIOSZjY4ICw4LTdiLSYyJCorZxsyKhctJyQAPCwvIiohDCwtJSA0";
    public final int LL;
    public final String LLILLJJLI;
    public final RankTypeV2 LLILLL;
    public LinearLayout LLILZ;
    public LinearLayout LLILZIL;
    public LiveIconView LLILZLL;
    public LiveIconView LLIZ;
    public LiveIconView LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public C1826520xdC LLJILJILJ;
    public C21594519fD LLJILLL;
    public int LLJJ;
    public C743710TFh LLJJIJIIJIL;
    public final List<RankTypeV2> LLJJI = new ArrayList();
    public final List<RankStickerPreviewFragment> LLJJIII = new ArrayList();
    public final List<C1782380wU0> LLJJIJI = new ArrayList();
    public C1119060fE8 LLJJIJIL = new C1119060fE8();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C16F5 MR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.exo) : null;
            this.LLJIJIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C21594519fD NR() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.view_pager) : null;
            this.LLJILLL = (C21594519fD) viewFindViewById;
        }
        return (C21594519fD) viewFindViewById;
    }

    public final C1826520xdC OR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ujx) : null;
            this.LLJILJILJ = (C1826520xdC) viewFindViewById;
        }
        return (C1826520xdC) viewFindViewById;
    }

    public final String RR() {
        return this.LLJJ >= ((ArrayList) this.LLJJI).size() ? "" : LiveRankStickerFaqUrlSettings.INSTANCE.obtainRankFaqUrl(String.valueOf(((RankTypeV2) ListProtector.get(this.LLJJI, this.LLJJ)).type));
    }

    public final void SR() {
        if (this.LLJJ >= ((ArrayList) this.LLJJI).size()) {
            return;
        }
        RankTypeV2 rankTypeV2 = (RankTypeV2) ListProtector.get(this.LLJJI, this.LLJJ);
        C1119210fEN c1119210fEN = C1119210fEN.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c1119210fEN.getClass();
        InterfaceC1846850y9z interfaceC1846850y9zLIZIZ = C1119210fEN.LIZIZ(dataChannel, rankTypeV2);
        if (interfaceC1846850y9zLIZIZ != null) {
            if (interfaceC1846850y9zLIZIZ.LJIIIZ()) {
                MR().setText(C497740JfY.LJIJI(2131855492));
                MR().setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, getContext()));
                MR().setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey_, getContext()));
                C786410Ut5.I7(new AbS507S0200000_17(interfaceC1846850y9zLIZIZ, this, 1), MR());
                return;
            }
            MR().setText(C497740JfY.LJIJI(2131851984));
            MR().setTextColor(C20736316Cj.LIZIZ(R.attr.eyw, getContext()));
            MR().setBackgroundColor(C20736316Cj.LIZIZ(R.attr.eya, getContext()));
            C786410Ut5.I7(new AbS329S0300000_17(interfaceC1846850y9zLIZIZ, this, rankTypeV2, 0), MR());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r6 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            r5 = 0
            if (r1 == 0) goto L62
            java.lang.Class<com.bytedance.android.livesdk.rank.impl.AnchorStickerRankTypeListData> r0 = com.bytedance.android.livesdk.rank.impl.AnchorStickerRankTypeListData.class
            java.lang.Object r0 = r1.gg0(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L62
            int r0 = r0.size()
            r4 = 1
            if (r0 != r4) goto L62
        L16:
            X.0Jkm r3 = new X.0Jkm
            r0 = 2131567766(0x7f0d2496, float:1.8761111E38)
            r3.<init>(r0)
            r0 = 2131887705(0x7f120659, float:1.9410025E38)
            r3.LIZJ = r0
            r0 = 80
            r3.LJII = r0
            if (r4 == 0) goto L60
            r0 = 1056964608(0x3f000000, float:0.5)
        L2b:
            r3.LJI = r0
            r0 = -1
            r3.LJIIIZ = r0
            int r2 = r6.LL
            if (r2 > 0) goto L53
            android.content.Context r0 = r6.getContext()
            int r0 = X.C465640INu.LIZIZ(r0)
            int r2 = r0 * 622
            android.content.Context r0 = r6.getContext()
            int r0 = X.C465640INu.LIZ(r0)
            float r1 = (float) r0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r0
            int r1 = (int) r1
            r0 = 375(0x177, float:5.25E-43)
            if (r0 > r1) goto L52
            r1 = 375(0x177, float:5.25E-43)
        L52:
            int r2 = r2 / r1
        L53:
            if (r4 == 0) goto L5c
            r0 = 1115160576(0x42780000, float:62.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r5 = (int) r0
        L5c:
            int r2 = r2 - r5
            r3.LJIIJ = r2
            return r3
        L60:
            r0 = 0
            goto L2b
        L62:
            r4 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.sticker.dialog.TabRankStickerDialog.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJIJIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
    }

    public final RankTypeV2 PR(int i) {
        if (i >= ((ArrayList) this.LLJJI).size()) {
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            return RankTypeV2.LJJIJIIJI;
        }
        return (RankTypeV2) ListProtector.get(this.LLJJI, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b0  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.sticker.dialog.TabRankStickerDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public TabRankStickerDialog(int i, String str, RankTypeV2 rankTypeV2) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = rankTypeV2;
    }
}
