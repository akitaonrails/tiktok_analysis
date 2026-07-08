package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score;

import X.C01K8;
import X.C11NJ;
import X.C16F5;
import X.C310501Ih;
import X.C477501tV;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C951190arN;
import X.EnumC312001Iw;
import X.RunnableC781530UlD;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: loaded from: classes.dex */
public final class CountDownForAllV2ScoreDialog extends BaseSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTxiHELIOSKiAmJjEoJjg9Lio+KCM/PndiKiA+JSoiZzo6ZjYvJj02ZgYjPCEnDCo7Jwk8OgQgJRlhGyYjOyoXISQgJig=";
    public final C01K8 LLL;
    public final int LLLF;
    public CountdownForAllContent LLLFF;
    public int LLLFFI;
    public C16F5 LLLFZ;
    public View LLLI;
    public View LLLII;
    public C477501tV LLLIIII;
    public RunnableC781530UlD LLLIIIIL;
    public View LLLIIIL;
    public LiveDialog LLLIIL;
    public final C11NJ LLLIILIL;
    public final C951190arN LLLIL;
    public EnumC312001Iw LLLILZ;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.hci;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zS() {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score.CountDownForAllV2ScoreDialog.zS():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C01K8 c01k8 = this.LLL;
        if (c01k8 != null) {
            c01k8.onDismiss();
        }
        this.LLLIILIL.LJ();
        this.LLLIL.LLLIIIIL();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(1, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLFZ = (C16F5) view.findViewById(R.id.ezh);
        this.LLLI = view.findViewById(R.id.ezd);
        this.LLLII = view.findViewById(R.id.eze);
        this.LLLIIII = (C477501tV) view.findViewById(R.id.ezg);
        this.LLLIIIIL = (RunnableC781530UlD) view.findViewById(R.id.ezf);
        this.LLLIIIL = view.findViewById(R.id.ezc);
        View view2 = this.LLLI;
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new C5183020f(this, 167));
        }
        if (this.LLLF == 2) {
            C16F5 c16f5 = this.LLLFZ;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131851945));
            }
        } else {
            C16F5 c16f52 = this.LLLFZ;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131853920));
            }
        }
        zS();
        C310501Ih.LJ(null, "show", null);
    }

    public CountDownForAllV2ScoreDialog(DataChannel dataChannel, C01K8 c01k8, int i, CountdownForAllContent countdownForAllContent, int i2) {
        super(dataChannel);
        this.LLL = c01k8;
        this.LLLF = i;
        this.LLLFF = countdownForAllContent;
        this.LLLFFI = i2;
        this.LLLIILIL = new C11NJ();
        this.LLLIL = new C951190arN();
        this.LLLILZ = EnumC312001Iw.OTHER;
    }
}
