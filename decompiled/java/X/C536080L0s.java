package X;

import Y.ACListenerS143S0100000_8;
import Y.ARunnableS105S0100000_5;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS148S0101000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0L0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536080L0s implements InterfaceC522520KeQ {
    public final Activity LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public List<? extends MediaModel> LLILZ;
    public ShortVideoContext LLILZIL;
    public ProgressDialog LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public volatile InterfaceC2357009Lk LLJI;
    public volatile AnonymousClass0956 LLJIJIL;
    public CreativeInfo LLILZLL = new CreativeInfo(null, 0, null, 7, null);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 255));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 254));

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    public final void LIZLLL() {
        ProgressDialog progressDialog = this.LLIZ;
        if (progressDialog == null || !Boolean.valueOf(progressDialog.isShowing()).booleanValue()) {
            return;
        }
        ProgressDialog progressDialog2 = this.LLIZ;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
            C785410UrT.LIZ(progressDialog2);
        }
        C194353111z.LIZ.LIZIZ(1010, C0MVY.DISMISS, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_VISIBLE_5S);
    }

    public final void LJFF() {
        ProgressDialog progressDialogLIZJ;
        Activity activity = this.LL;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        ProgressDialog progressDialog = this.LLIZ;
        if (progressDialog == null || !progressDialog.isShowing()) {
            if (((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
                Activity activity2 = this.LL;
                progressDialogLIZJ = ProgressDialogC1397790mTh.LIZIZ(activity2, activity2.getString(R.string.txr));
                ACListenerS143S0100000_8 aCListenerS143S0100000_8 = new ACListenerS143S0100000_8(this, 58);
                TuxIconView tuxIconView = (TuxIconView) progressDialogLIZJ.findViewById(R.id.jz7);
                if (tuxIconView != null) {
                    C786410Ut5.a9(tuxIconView, aCListenerS143S0100000_8);
                }
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, (Handler) this.LLJILJIL.getValue(), new ARunnableS105S0100000_5(progressDialogLIZJ, 17));
                LJI(0);
            } else {
                Activity activity3 = this.LL;
                progressDialogLIZJ = ProgressDialogC1397800mTi.LIZJ(activity3, activity3.getString(R.string.txr));
                progressDialogLIZJ.setIndeterminate(true);
            }
            this.LLIZ = progressDialogLIZJ;
            C194353111z.LIZ.LIZIZ(1010, C0MVY.SHOW, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_VISIBLE_5S);
        }
    }

    public final void LJI(int i) {
        if (((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
            C0CNO.LIZLLL(0L, new AwS148S0101000_8(this, i, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0089 -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r17, X.InterfaceC1364105Vn<? super java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536080L0s.LIZJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r11, X.InterfaceC1364105Vn<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536080L0s.LJ(java.util.List, X.05Vn):java.lang.Object");
    }

    public C536080L0s(Activity activity, long j, long j2) {
        this.LL = activity;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) {
        boolean z;
        String str;
        boolean z2;
        if (i2 != -1 || i != 2) {
            return;
        }
        if (intent.getIntExtra("key_choose_scene", -1) == 13) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null) {
            this.LLILZ = parcelableArrayListExtra;
            if (intent.hasExtra("creation_id")) {
                this.LLILZLL = C537520L6g.LIZ(intent);
            }
            ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
            this.LLILZIL = shortVideoContext;
            if (shortVideoContext != null) {
                this.LLILZLL = shortVideoContext.creativeInfo;
            }
            List<? extends MediaModel> list = this.LLILZ;
            if (list == null) {
                list = null;
            }
            C528230Knd c528230KndLIZ = C523870Kgb.LIZ(intent);
            int i3 = C530180Kqm.LIZIZ;
            C443120HZe c443120HZeLIZ = C530180Kqm.LIZ(this.LL, list, this.LLILLJJLI, this.LLILLL);
            boolean zBooleanValue = ((Boolean) c443120HZeLIZ.getFirst()).booleanValue();
            int iIntValue = ((Number) c443120HZeLIZ.getSecond()).intValue();
            long jLongValue = ((Number) c443120HZeLIZ.getThird()).longValue();
            if (zBooleanValue) {
                ShortVideoContext shortVideoContext2 = this.LLILZIL;
                String str2 = "video";
                if (list.size() > 1) {
                    str = "multiple_content";
                } else {
                    str = "single_content";
                }
                int size = list.size() - iIntValue;
                String strLIZ = C560460LyW.LIZ(iIntValue, list.size() - iIntValue);
                if (list.size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z3 = false;
                C528210Knb c528210Knb = new C528210Knb(shortVideoContext2, str2, str, iIntValue, size, strLIZ, z2, C525670KjV.LIZ(list), z3, z3, z3, C530690Krb.LIZ(list), list, c528230KndLIZ, 1792);
                c528210Knb.LIZIZ((int) jLongValue);
                c528210Knb.LIZIZ.LIZ(1, "is_add_more");
                c528210Knb.LIZLLL(this.LLILZIL);
                c528210Knb.LIZ();
                this.LLJ = 0;
                AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLJIJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2358209Lw(this, list, null), 3);
            }
        }
    }
}
