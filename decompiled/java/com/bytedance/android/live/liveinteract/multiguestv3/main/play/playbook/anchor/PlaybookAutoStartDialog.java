package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.C01GW;
import X.C0JBN;
import X.C1324720kZq;
import X.C16FS;
import X.C20359414lU;
import X.C20361214lm;
import X.C20365714mV;
import X.C20365914mX;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C292401Bi;
import X.C426750GoL;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.C915190ZvJ;
import X.C978360bZC;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookAutoStartDialog extends LiveSheetFragment {
    public static final int LLLILZJ = C439101nJ.LIZ(56);
    public static final int LLLILZLLLI = C439101nJ.LIZ(72);
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZhUgKDYxJyonCDonJxY4KD0nDCwtJSA0";
    public View LLJLLL;
    public TextView LLJZ;
    public TextView LLJZIJLIL;
    public TextView LLL;
    public LiveIconView LLLF;
    public C1324720kZq LLLFF;
    public C16FS LLLFFI;
    public final C01GW LLLFZ = C292401Bi.LIZ(new C20365914mX());
    public Function1<? super Context, Unit> LLLI;
    public C20361214lm LLLII;
    public C20359414lU LLLIIII;
    public BasePlaybookViewModel LLLIIIIL;
    public String LLLIIIL;
    public Function0<Unit> LLLIIL;
    public DataChannel LLLIILIL;
    public Long LLLIL;
    public CountDownTimer LLLILZ;

    public final int uS() {
        return this.LLLII == null ? 2131855244 : 2131855246;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.LLLILZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        CountDownTimer countDownTimer = this.LLLILZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C16FS c16fs = this.LLLFFI;
        if (c16fs != null) {
            int iUS = uS();
            Object[] objArr = new Object[1];
            Long l = this.LLLIL;
            objArr[0] = Long.valueOf((l != null ? l.longValue() : 10000L) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            c16fs.setText(C497740JfY.LJIJJ(iUS, objArr));
        }
        Long l2 = this.LLLIL;
        final long jLongValue = l2 != null ? l2.longValue() : 10000L;
        this.LLLILZ = new CountDownTimer(jLongValue) { // from class: X.14mg
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                PlaybookAutoStartDialog playbookAutoStartDialog = this.LIZ;
                C16FS c16fs2 = playbookAutoStartDialog.LLLFFI;
                if (c16fs2 != null) {
                    c16fs2.setText(C497740JfY.LJIJJ(playbookAutoStartDialog.uS(), 0));
                }
                this.LIZ.wS(true);
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                PlaybookAutoStartDialog playbookAutoStartDialog;
                C16FS c16fs2;
                long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (j2 > 0 && (c16fs2 = (playbookAutoStartDialog = this.LIZ).LLLFFI) != null) {
                    c16fs2.setText(C497740JfY.LJIJJ(playbookAutoStartDialog.uS(), Long.valueOf(j2)));
                }
            }
        }.start();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        CountDownTimer countDownTimer = this.LLLILZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void wS(boolean z) {
        String str;
        String str2;
        int iDQ2;
        long j;
        Playbook playbook;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        MutableLiveData<ActivePlaybook> mutableLiveData2;
        ActivePlaybook value2;
        Playbook playbook2;
        Context context = getContext();
        if (context != null) {
            close(1);
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            DataChannel dataChannel = this.LLLIILIL;
            if (z) {
                str = "auto_step_countdown";
            } else {
                str = "auto_step_click";
            }
            C20361214lm c20361214lm = this.LLLII;
            if (c20361214lm == null || (str2 = c20361214lm.LIZ) == null) {
                str2 = "empty_feature";
            }
            BasePlaybookViewModel basePlaybookViewModel = this.LLLIIIIL;
            if (basePlaybookViewModel != null) {
                iDQ2 = basePlaybookViewModel.DQ2(c20361214lm);
            } else {
                iDQ2 = -1;
            }
            int i = iDQ2 + 1;
            BasePlaybookViewModel basePlaybookViewModel2 = this.LLLIIIIL;
            if (basePlaybookViewModel2 != null && (mutableLiveData2 = basePlaybookViewModel2.LLILLJJLI) != null && (value2 = mutableLiveData2.getValue()) != null && (playbook2 = value2.playbook) != null) {
                j = playbook2.playbookId;
            } else {
                j = 0;
            }
            BasePlaybookViewModel basePlaybookViewModel3 = this.LLLIIIIL;
            PlayRule playRule = null;
            if (basePlaybookViewModel3 != null && (mutableLiveData = basePlaybookViewModel3.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
                playbook = value.playbook;
            } else {
                playbook = null;
            }
            C20361214lm c20361214lm2 = this.LLLII;
            if (c20361214lm2 != null) {
                playRule = c20361214lm2.LIZLLL;
            }
            C978360bZC.LJIILJJIL(dataChannel, str, str2, i, j, true, "", playbook, playRule, true, 1024);
            Function1<? super Context, Unit> function1 = this.LLLI;
            if (function1 != null) {
                function1.invoke(context);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function0<Unit> function0 = this.LLLIIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015e  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h9m, viewGroup, false);
    }

    public final void yS(C0JBN c0jbn, int i, C20365714mV c20365714mV) {
        Boolean boolValueOf;
        ImageView.ScaleType scaleType;
        if (i != 0) {
            c0jbn.LJIIL(new ColorDrawable(C20736316Cj.LIZIZ(i, getContext())));
        }
        if (c20365714mV.LIZLLL > 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadDesc: ratio");
            sbLIZ.append(c20365714mV.LIZLLL);
            sbLIZ.append(" height:");
            int i2 = LLLILZLLLI;
            sbLIZ.append(i2);
            C20441214yg.LIZIZ("PlaybookAutoStartDialog", C2188811AlT.LIZIZ(sbLIZ));
            c0jbn.LIZ(C814420VxA.LIZIZ(i2 * c20365714mV.LIZLLL), i2);
            c0jbn.LJIIZILJ(ImageView.ScaleType.CENTER_CROP);
            return;
        }
        Context context = getContext();
        if (context != null) {
            boolValueOf = Boolean.valueOf(C426750GoL.LIZLLL(context));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            scaleType = ImageView.ScaleType.FIT_END;
        } else {
            scaleType = ImageView.ScaleType.FIT_START;
        }
        c0jbn.LJIIZILJ(scaleType);
    }
}
