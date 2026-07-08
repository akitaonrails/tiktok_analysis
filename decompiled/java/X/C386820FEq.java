package X;

import Y.ARunnableS105S0100000_5;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS67S0500000_5;

/* JADX INFO: renamed from: X.0FEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386820FEq {
    public DialogC19728412Gs LIZ;
    public Activity LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler();

    public final void LIZ() {
        Activity activity = this.LIZIZ;
        if (activity == null || !activity.isFinishing()) {
            Activity activity2 = this.LIZIZ;
            if (activity2 == null || !activity2.isDestroyed()) {
                DialogC19728412Gs dialogC19728412Gs = this.LIZ;
                if (dialogC19728412Gs != null && dialogC19728412Gs.isShowing()) {
                    DialogC19728412Gs dialogC19728412Gs2 = this.LIZ;
                    dialogC19728412Gs2.dismiss();
                    C785410UrT.LIZ(dialogC19728412Gs2);
                }
                this.LIZJ.removeCallbacksAndMessages(null);
            }
        }
    }

    public final void LIZLLL(VideoPublishEditModel videoPublishEditModel, InterfaceC377040EqM interfaceC377040EqM) {
        Activity activity;
        Activity activity2 = this.LIZIZ;
        if (activity2 != null && !activity2.isFinishing()) {
            if (this.LIZ == null && (activity = this.LIZIZ) != null) {
                InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
                if (interfaceC20597015iiLIZJ != null) {
                    interfaceC20597015iiLIZJ.Ss("getIntent", new AwS67S0500000_5(activity, interfaceC20597015iiLIZJ, interfaceC377040EqM, this, videoPublishEditModel, 2));
                } else {
                    LIZIZ(activity, videoPublishEditModel, interfaceC377040EqM);
                }
            }
            DialogC19728412Gs dialogC19728412Gs = this.LIZ;
            if (dialogC19728412Gs != null && (!dialogC19728412Gs.isShowing())) {
                C786410Ut5.LJLIIL(0L, this.LIZJ, new ARunnableS105S0100000_5(dialogC19728412Gs, 124));
            }
        }
    }

    public final void LIZIZ(final Context context, VideoPublishEditModel videoPublishEditModel, final InterfaceC377040EqM interfaceC377040EqM) {
        DialogC19728412Gs dialogC19728412Gs;
        if (C365940EWi.LIZ(videoPublishEditModel)) {
            DialogC386800FEo dialogC386800FEo = new DialogC386800FEo(context, C365940EWi.LIZ(videoPublishEditModel));
            dialogC386800FEo.LLILLL = interfaceC377040EqM;
            dialogC19728412Gs = dialogC386800FEo;
        } else {
            dialogC19728412Gs = new DialogC19728412Gs(context, interfaceC377040EqM) { // from class: X.0FEp
                public final InterfaceC377040EqM LL;
                public final C1295960jpS LLILLJJLI;
                public boolean LLILLL;

                @Override // android.app.Dialog, android.content.DialogInterface
                public final void dismiss() {
                    this.LLILLJJLI.cancelAnimation();
                    this.LLILLL = false;
                    super.dismiss();
                    this.LL.LIZIZ();
                }

                @Override // X.DialogC19728412Gs, android.app.Dialog
                public final void show() throws Throwable {
                    Object obj;
                    if (!this.LLILLL) {
                        this.LLILLJJLI.playAnimation();
                        this.LLILLL = true;
                    }
                    C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhn9fRx58JAPnz3qargnbVRwTuIRVTaLNgkizwaQCGult1m0fNIMwhFXVNNNgNDfzN010=", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = new Object[0];
                    C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
                        return;
                    }
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    DialogC19728412Gs dialogC19728412Gs2 = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
                    super.show();
                    c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs2, c0wzw, true);
                }

                {
                    this.LL = interfaceC377040EqM;
                    setContentView(R.layout.d9j);
                    C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.lj4);
                    this.LLILLJJLI = c1295960jpS;
                    setCancelable(false);
                    setCanceledOnTouchOutside(false);
                    c1295960jpS.setAnimation("stickpoint_switch_music_loading.json");
                    c1295960jpS.getAnimation();
                    c1295960jpS.setRepeatCount(-1);
                }
            };
        }
        this.LIZ = dialogC19728412Gs;
    }

    public final void LIZJ(Context context, VideoPublishEditModel videoPublishEditModel, InterfaceC377040EqM interfaceC377040EqM) {
        Activity activityLIZ;
        Activity activity;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        this.LIZIZ = activityLIZ;
        if (activityLIZ != null && !activityLIZ.isFinishing() && (activity = this.LIZIZ) != null) {
            InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
            if (interfaceC20597015iiLIZJ != null) {
                interfaceC20597015iiLIZJ.Ss("getIntent", new AwS67S0500000_5(activity, interfaceC20597015iiLIZJ, interfaceC377040EqM, this, videoPublishEditModel, 1));
            } else {
                LIZIZ(activity, videoPublishEditModel, interfaceC377040EqM);
            }
        }
    }
}
