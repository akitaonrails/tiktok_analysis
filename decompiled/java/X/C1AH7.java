package X;

import Y.ACListenerS135S0200000_33;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import webcast.data.RealtimeLiveCenterLopInfo;

/* JADX INFO: renamed from: X.1AH7, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AH7 extends C1AHE {
    public final View LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    public final void R5() {
        for (View view : (List) this.LLJIJIL.getValue()) {
            if (view != null) {
                int visibility = view.getVisibility();
                view.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, view);
            }
        }
        for (View view2 : (List) this.LLIZ.getValue()) {
            if (view2 != null) {
                int visibility2 = view2.getVisibility();
                view2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, view2);
            }
        }
    }

    public static void S5(Context context) {
        C781380Uky.LIZ.getClass();
        ArrayList arrayList = (ArrayList) C781380Uky.LIZJ;
        if (arrayList.isEmpty()) {
            C781380Uky.LJ();
        }
        int i = 0;
        String str = "";
        String str2 = "";
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                RealtimeLiveCenterLopInfo.FeatureGuidance featureGuidance = (RealtimeLiveCenterLopInfo.FeatureGuidance) obj;
                if (i == 0) {
                    str = featureGuidance.key;
                } else if (i == 1) {
                    str2 = featureGuidance.key;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C781380Uky.LIZ.getClass();
        C781380Uky.LIZIZ("show", str, str2, "");
        C781380Uky.LIZLLL(context, str, str2);
    }

    @Override // X.C1AHE
    public final void P5(int i) throws Throwable {
        RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo;
        Object objValueOf;
        RealtimeLiveCenterLopInfo.Task task;
        ImageModel imageModel;
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI = this.LL.LJIIJJI();
        if (realtimeLiveCenterDetailDataLJIIJJI != null && (realtimeLiveCenterLopInfo = realtimeLiveCenterDetailDataLJIIJJI.lopInfo) != null) {
            C781380Uky.LIZ.getClass();
            C781380Uky.LJFF(realtimeLiveCenterLopInfo);
            int i2 = 8;
            Throwable th = null;
            int i3 = 0;
            if (realtimeLiveCenterLopInfo.status == 3) {
                T5(true);
                if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                    TextView textView = (TextView) this.LLILZIL.getValue();
                    if (textView != null) {
                        textView.setText(realtimeLiveCenterLopInfo.title);
                    }
                } else {
                    TextView textView2 = (TextView) this.LLIZLLLIL.getValue();
                    if (textView2 != null) {
                        textView2.setText(realtimeLiveCenterLopInfo.title);
                    }
                    TextView textView3 = (TextView) this.LLJ.getValue();
                    if (textView3 != null) {
                        textView3.setText(realtimeLiveCenterLopInfo.subtitle);
                    }
                }
                C1143680frq.LJ((View) this.LLJI.getValue(), "tiktok_live_broadcast_demand_8", "ttlive_lop_upgrade_refresh.png", ImageView.ScaleType.CENTER_CROP);
                R5();
                ArrayList arrayList = (ArrayList) C781380Uky.LIZJ;
                if (arrayList.isEmpty()) {
                    C781380Uky.LJ();
                }
                int i4 = 0;
                for (Object obj : arrayList) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        RealtimeLiveCenterLopInfo.FeatureGuidance featureGuidance = (RealtimeLiveCenterLopInfo.FeatureGuidance) obj;
                        View view = (View) C13LP.LJJJLZIJ(i4, (List) this.LLJIJIL.getValue());
                        if (view != null) {
                            int visibility = view.getVisibility();
                            view.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, view);
                        }
                        C0UUA c0uua = (C0UUA) C13LP.LJJJLZIJ(i4, (List) this.LLJIJIL.getValue());
                        if (c0uua != null) {
                            DataChannel dataChannel = this.LL.getDataChannel();
                            if (featureGuidance == null) {
                                int visibility2 = c0uua.getVisibility();
                                c0uua.setVisibility(8);
                                C1602160rnK.LIZIZ(visibility2, 8, c0uua);
                            } else {
                                c0uua.LLILZIL = featureGuidance;
                                c0uua.LLILZLL = i4;
                                c0uua.LLIZ = dataChannel;
                                C16F5 c16f5 = c0uua.LLILLL;
                                if (c16f5 != null) {
                                    c16f5.setText(featureGuidance.title);
                                }
                                C16F5 c16f52 = c0uua.LLILLJJLI;
                                if (c16f52 != null) {
                                    c16f52.setText(featureGuidance.subtitle);
                                }
                                C16F5 c16f53 = c0uua.LLILZ;
                                if (c16f53 != null) {
                                    c16f53.setText(featureGuidance.jumpText);
                                }
                                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                                RealtimeLiveCenterLopInfo.FeatureGuidance featureGuidance2 = c0uua.LLILZIL;
                                if (featureGuidance2 != null) {
                                    imageModel = featureGuidance2.icon;
                                } else {
                                    imageModel = null;
                                }
                                C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(imageModel);
                                c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_XY;
                                c1324610kZfLJIIIZ.LJJI(c0uua.LL);
                                int visibility3 = c0uua.getVisibility();
                                c0uua.setVisibility(0);
                                C1602160rnK.LIZIZ(visibility3, 0, c0uua);
                            }
                        }
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                if (this.LLILLL == 1) {
                    S5(getContext());
                    this.LLILLL = 2;
                    return;
                }
                return;
            }
            this.LLILLL = 1;
            T5(false);
            if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                TextView textView4 = (TextView) this.LLILZIL.getValue();
                if (textView4 != null) {
                    textView4.setText(realtimeLiveCenterLopInfo.title);
                }
            } else {
                TextView textView5 = (TextView) this.LLILZ.getValue();
                if (textView5 != null) {
                    textView5.setText(realtimeLiveCenterLopInfo.title);
                }
            }
            TextView textView6 = (TextView) this.LLILZLL.getValue();
            if (textView6 != null) {
                textView6.setText(realtimeLiveCenterLopInfo.subtitle);
            }
            R5();
            int i6 = 0;
            for (RealtimeLiveCenterLopInfo.Task task2 : realtimeLiveCenterLopInfo.taskList) {
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    RealtimeLiveCenterLopInfo.Task task3 = task2;
                    View view2 = (View) C13LP.LJJJLZIJ(i6, (List) this.LLIZ.getValue());
                    if (view2 != null) {
                        int visibility4 = view2.getVisibility();
                        view2.setVisibility(i3);
                        C1602160rnK.LIZIZ(visibility4, i3, view2);
                    }
                    C1AHF c1ahf = (C1AHF) C13LP.LJJJLZIJ(i6, (List) this.LLIZ.getValue());
                    if (c1ahf != null && task3 != null) {
                        c1ahf.LL = task3;
                        C16F5 c16f54 = c1ahf.LLILLJJLI;
                        if (c16f54 != null) {
                            c16f54.setText(task3.title);
                        }
                        LiveCenterStructureOpt liveCenterStructureOpt = LiveCenterStructureOpt.INSTANCE;
                        if (!liveCenterStructureOpt.isEnable()) {
                            RealtimeLiveCenterLopInfo.Task task4 = c1ahf.LL;
                            if (task4 != null) {
                                objValueOf = Long.valueOf(task4.targetNum);
                            } else {
                                objValueOf = th;
                            }
                            RealtimeLiveCenterLopInfo.Task task5 = c1ahf.LL;
                            Object objValueOf2 = th;
                            if (task5 != null) {
                                objValueOf2 = Long.valueOf(task5.currentNum);
                            }
                            if (!Intrinsics.LJFF(objValueOf, objValueOf2) || ((task = c1ahf.LL) != null && task.targetNum == 0)) {
                                LiveIconView liveIconView = c1ahf.LLILLL;
                                if (liveIconView != null) {
                                    C786410Ut5.LLJJIJIL(liveIconView, i2);
                                }
                            } else {
                                LiveIconView liveIconView2 = c1ahf.LLILLL;
                                if (liveIconView2 != null) {
                                    C786410Ut5.LLJJIJIL(liveIconView2, i3);
                                }
                                C1143680frq.LJ(c1ahf.LLILLL, "tiktok_live_broadcast_demand_8", "ttlive_lop_upgrade.png", ImageView.ScaleType.CENTER_CROP);
                            }
                        }
                        RealtimeLiveCenterLopInfo.Task task6 = c1ahf.LL;
                        if (task6 != null) {
                            if (liveCenterStructureOpt.isEnable()) {
                                ProgressBar progressBar = c1ahf.LLILZ;
                                if (progressBar != null) {
                                    C786410Ut5.LLIIJLIL(progressBar, i3);
                                }
                                long j = task6.currentNum;
                                if ((j == 0 && task6.targetNum == 0) || (j == 1 && task6.targetNum == 1)) {
                                    C16F5 c16f55 = c1ahf.LLILZIL;
                                    if (c16f55 != null) {
                                        C500260Jjc.LJLJLJ(c16f55, !Intrinsics.LJFF(task6.key, "age_verify"));
                                    }
                                    ProgressBar progressBar2 = c1ahf.LLILZ;
                                    if (progressBar2 != null) {
                                        progressBar2.setProgress(((int) task6.currentNum) * 100);
                                    }
                                } else {
                                    C16F5 c16f56 = c1ahf.LLILZIL;
                                    if (c16f56 != null) {
                                        C786410Ut5.LLJJJJ(c16f56, 0);
                                    }
                                    float f = (task6.currentNum / task6.targetNum) * 100 * 1.0f;
                                    ProgressBar progressBar3 = c1ahf.LLILZ;
                                    if (progressBar3 != null) {
                                        progressBar3.setProgress((int) f);
                                    }
                                }
                                if (liveCenterStructureOpt.isEnable()) {
                                    C16F5 c16f57 = c1ahf.LLILZIL;
                                    if (c16f57 != null) {
                                        c16f57.setText(task6.currentNum + " / " + task6.targetNum);
                                    }
                                } else {
                                    C16F5 c16f58 = c1ahf.LLILZIL;
                                    if (c16f58 != null) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(task6.currentNum);
                                        sb.append('/');
                                        sb.append(task6.targetNum);
                                        c16f58.setText(sb.toString());
                                    }
                                }
                            } else {
                                long j2 = task6.currentNum;
                                if ((j2 == 0 && task6.targetNum == 0) || (j2 == 1 && task6.targetNum == 1)) {
                                    ProgressBar progressBar4 = c1ahf.LLILZ;
                                    if (progressBar4 != null) {
                                        C786410Ut5.LLIIJLIL(progressBar4, 8);
                                    }
                                    C16F5 c16f59 = c1ahf.LLILZIL;
                                    if (c16f59 != null) {
                                        C786410Ut5.LLJJJJ(c16f59, 8);
                                    }
                                } else {
                                    ProgressBar progressBar5 = c1ahf.LLILZ;
                                    if (progressBar5 != null) {
                                        C786410Ut5.LLIIJLIL(progressBar5, 0);
                                    }
                                    C16F5 c16f510 = c1ahf.LLILZIL;
                                    if (c16f510 != null) {
                                        C786410Ut5.LLJJJJ(c16f510, 0);
                                    }
                                    float f2 = (task6.currentNum / task6.targetNum) * 100 * 1.0f;
                                    ProgressBar progressBar6 = c1ahf.LLILZ;
                                    if (progressBar6 != null) {
                                        progressBar6.setProgress((int) f2);
                                    }
                                    if (liveCenterStructureOpt.isEnable()) {
                                        C16F5 c16f511 = c1ahf.LLILZIL;
                                        if (c16f511 != null) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(task6.currentNum);
                                            sbLIZ.append(" / ");
                                            sbLIZ.append(task6.targetNum);
                                            c16f511.setText(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    } else {
                                        C16F5 c16f512 = c1ahf.LLILZIL;
                                        if (c16f512 != null) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(task6.currentNum);
                                            sbLIZ2.append('/');
                                            sbLIZ2.append(task6.targetNum);
                                            c16f512.setText(C2188811AlT.LIZIZ(sbLIZ2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i2 = 8;
                    i3 = 0;
                    i6 = i7;
                    th = null;
                } else {
                    C1697810uHb.LJIJI();
                    throw th;
                }
            }
        }
    }

    public final void T5(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
            return;
        }
        C16F5 c16f5 = (C16F5) this.LLILZ.getValue();
        int i5 = 8;
        if (c16f5 != null) {
            if (z) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            C786410Ut5.LLJJJJ(c16f5, i4);
        }
        C16F5 c16f52 = (C16F5) this.LLIZLLLIL.getValue();
        if (c16f52 != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LLJJJJ(c16f52, i3);
        }
        C16F5 c16f53 = (C16F5) this.LLJ.getValue();
        if (c16f53 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLJJJJ(c16f53, i2);
        }
        C16F5 c16f54 = (C16F5) this.LLILZLL.getValue();
        if (c16f54 != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLJJJJ(c16f54, i);
        }
        LiveIconView liveIconView = (LiveIconView) this.LLJI.getValue();
        if (liveIconView != null) {
            if (z) {
                i5 = 0;
            }
            C786410Ut5.LLJJIJIL(liveIconView, i5);
        }
    }

    public C1AH7(View view, C1AHD c1ahd) {
        super(view, c1ahd);
        this.LLILLJJLI = view;
        this.LLILZ = C292401Bi.LIZ(new AwS577S0100000_33(this, 3893));
        this.LLILZIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 3896));
        this.LLILZLL = C292401Bi.LIZ(new AwS577S0100000_33(this, 3892));
        this.LLIZ = C292401Bi.LIZ(new AwS577S0100000_33(this, 3897));
        this.LLIZLLLIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 3895));
        this.LLJ = C292401Bi.LIZ(new AwS577S0100000_33(this, 3894));
        C01GW c01gwLIZ = C292401Bi.LIZ(new AwS577S0100000_33(this, 3891));
        this.LLJI = c01gwLIZ;
        this.LLJIJIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 3890));
        N5();
        LiveIconView liveIconView = (LiveIconView) c01gwLIZ.getValue();
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS135S0200000_33(c1ahd, this, 12));
        }
    }
}
