package X;

import Y.ARunnableS125S0100000_25;
import android.app.Activity;
import android.app.Application;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.11Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class DialogC19470111Fj extends DialogC19728412Gs {
    public static final /* synthetic */ int LLJJIII = 0;
    public final Effect LL;
    public final C1662140tM4 LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public C1688850u39 LLILZLL;
    public C1322110kVd LLIZ;
    public C1473870oSP LLIZLLLIL;
    public VideoViewComponent LLJ;
    public TextView LLJI;
    public Video LLJIJIL;
    public C19470211Fk LLJILJIL;
    public Handler LLJILJILJ;
    public AppCompatTextView LLJILLL;
    public AppCompatTextView LLJJ;
    public View LLJJI;

    public static void LJJLIIIJLLLLLLLZ(DialogC19728412Gs dialogC19728412Gs, C0WZX c0wzx) throws Throwable {
        Object obj;
        DialogC19728412Gs dialogC19728412Gs2 = dialogC19728412Gs;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", dialogC19728412Gs2, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs2, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            dialogC19728412Gs2 = (DialogC19728412Gs) obj;
        }
        super.show();
        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs2, c0wzw, true);
    }

    public final void LJJLIIJ() {
        C1662140tM4 c1662140tM4;
        VideoViewComponent videoViewComponent;
        C1482640ogY c1482640ogYLJIIIIZZ = C1482640ogY.LJIIIIZZ(this.LLIZLLLIL);
        VideoViewComponent videoViewComponent2 = new VideoViewComponent();
        this.LLJ = videoViewComponent2;
        videoViewComponent2.LJIILJJIL(this.LLIZLLLIL);
        this.LLJ.LIZ(this.LLJILJIL);
        if (this.LLILZ && (videoViewComponent = this.LLJ) != null) {
            videoViewComponent.LLJILJILJ = false;
        }
        c1482640ogYLJIIIIZZ.Dn(new InterfaceC1473950oSX() { // from class: X.11Fl
            @Override // X.InterfaceC1473950oSX
            public final void LLF(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLILLIZIL(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LIZ() {
                C1322110kVd c1322110kVd = this.LL.LLIZ;
                if (c1322110kVd != null) {
                    C786410Ut5.LLZZLLIL(c1322110kVd, 0);
                }
            }
        });
        if (this.LLJ == null || (c1662140tM4 = this.LLILLJJLI) == null || TextUtils.isEmpty(c1662140tM4.LIZIZ())) {
            return;
        }
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new Video();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setBytevc1(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.LLILLJJLI.LIZIZ());
            videoUrlModel.setUrlList(arrayList);
            videoUrlModel.setUrlKey(this.LLILLJJLI.LIZIZ);
            videoUrlModel.setUri(this.LLILLJJLI.LIZIZ);
            this.LLJIJIL.setPlayAddr(videoUrlModel);
            this.LLJIJIL.setSourceId(this.LLILLJJLI.LIZIZ);
        }
        LJJLJLI(true);
        this.LLJ.LJIIL(this.LLJIJIL);
        Handler handler = this.LLJILJILJ;
        if (handler != null) {
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, handler, new ARunnableS125S0100000_25(this, 107));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Activity ownerActivity;
        VideoViewComponent videoViewComponent = this.LLJ;
        if (videoViewComponent != null) {
            C19470211Fk c19470211Fk = this.LLJILJIL;
            if (c19470211Fk != null) {
                videoViewComponent.H1(c19470211Fk);
            }
            this.LLJ.release();
        }
        Activity ownerActivity2 = getOwnerActivity();
        if (ownerActivity2 == null || ownerActivity2.isFinishing() || (ownerActivity = getOwnerActivity()) == null || ownerActivity.isDestroyed()) {
            return;
        }
        super.dismiss();
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        if (this.LL != null && this.LLILLL && !this.LLILZIL) {
            Application application = C0CHQ.LIZ;
            C1403010mc7.LIZ.getSpService().getClass();
            C1637780sim c1637780simLIZ = C1637770sil.LIZ(application, "guide");
            String str = c1637780simLIZ.LIZ.getString("upload_pic_sticker_show", "") + this.LL.getEffectId() + ',';
            if (c1637780simLIZ.LIZIZ == null) {
                c1637780simLIZ.LIZIZ = c1637780simLIZ.LIZ.edit();
            }
            c1637780simLIZ.LIZIZ.putString("upload_pic_sticker_show", str).apply();
        }
        boolean z = C1624200sMs.LIZLLL(this.LL) && (C1621890sJ9.LIZIZ() || C1621890sJ9.LIZJ());
        Scene currentScene = C0CHQ.LIZ().LJIJJ().getCurrentScene(getOwnerActivity());
        boolean z2 = currentScene != null && C0CHQ.LIZ().LJIJJ().LJIIIZ(currentScene);
        if (!z) {
            LJJLIIIJLLLLLLLZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT85rrg3SYhCtcVgsbbhM7rH438oTPGqgbUGum8V5abGkmxSJEOO63DCUdwv8q+2DTv6XzmljTUuP4/Us=", null));
        } else if (z2) {
            LJJLIIIJLLLLLLLZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT85rrg3SYhCtcVgsbbhM7rH438oTPGqgbUGum8V5abGkmxSJEOO63DCUdwv8q+2DTv6XzmljTUuP4/Us=", null));
        }
    }

    public final void LJJLJ(int i) {
        AppCompatTextView appCompatTextView = this.LLJILLL;
        if (appCompatTextView != null) {
            C786410Ut5.LLILL(appCompatTextView, i);
        }
        AppCompatTextView appCompatTextView2 = this.LLJJ;
        if (appCompatTextView2 != null) {
            C786410Ut5.LLILL(appCompatTextView2, i);
        }
        View view = this.LLJJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void LJJLJLI(boolean z) {
        int i;
        C1688850u39 c1688850u39 = this.LLILZLL;
        if (c1688850u39 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.E1(c1688850u39, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0250  */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.11Fk] */
    /* JADX WARN: Type inference failed for: r0v96, types: [X.11Fk] */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC19470111Fj.onCreate(android.os.Bundle):void");
    }

    public DialogC19470111Fj(C19GS c19gs, Effect effect, C1662140tM4 c1662140tM4, boolean z, boolean z2, boolean z3) {
        super(c19gs, R.style.ki);
        this.LL = effect;
        this.LLILLJJLI = c1662140tM4;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
    }
}
