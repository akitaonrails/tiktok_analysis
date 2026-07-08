package X;

import Y.AfS142S0200000_6;
import Y.AkS468S0100000_3;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinFullScreenGamePlayAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicHeaderBackgroundAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639020P4q implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onCanceled$1(C639020P4q c639020P4q) {
    }

    public static final void onFailed$1(C639020P4q c639020P4q, Throwable th) {
    }

    public static final void onProgress$0(C639020P4q c639020P4q, float f) {
    }

    public static final void onProgress$1(C639020P4q c639020P4q, float f) {
    }

    public static final void onProgress$2(C639020P4q c639020P4q, float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
            case 2:
                onCanceled$2(this);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            case 2:
                onFailed$2(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
            case 2:
                onProgress$2(this, f);
                break;
        }
    }

    public static final void onCanceled$0(C639020P4q c639020P4q) {
        C0OPX.LJIIIIZZ("GamePlay background load canceled");
        ((BulletinFullScreenGamePlayAssem) c639020P4q.l0).No().LLIZLLLIL = false;
    }

    public static final void onCanceled$2(C639020P4q c639020P4q) {
        Function0 function0 = (Function0) c639020P4q.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$0(C639020P4q c639020P4q, Bitmap bitmap) {
        BulletinFullScreenGamePlayAssem bulletinFullScreenGamePlayAssem = (BulletinFullScreenGamePlayAssem) c639020P4q.l0;
        bulletinFullScreenGamePlayAssem.LLJJ = bitmap;
        bulletinFullScreenGamePlayAssem.LLJILLL = true;
        C0OPX.LJII("GamePlay background loaded on demand");
        ((Function0) c639020P4q.l1).invoke();
    }

    public static final void LIZ$1(C639020P4q c639020P4q, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        AssemVMLazy assemVMLazy = ((MusicHeaderBackgroundAssem) c639020P4q.l0).LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicHeaderBackgroundAssem.LLJJIJIIJIL;
        if (((MusicDetailViewModel) assemVMLazy.getValue()).LLJJJJ) {
            C786410Ut5.T4((View) c639020P4q.l1, 0.0f);
        }
        MusicHeaderBackgroundAssem musicHeaderBackgroundAssem = (MusicHeaderBackgroundAssem) c639020P4q.l0;
        View view = (View) c639020P4q.l1;
        musicHeaderBackgroundAssem.getClass();
        C11NZ.LJJJJZ(0).LJJJLZIJ(C11S5.LIZIZ).LJJJJZI(new AkS468S0100000_3(bitmap, 11)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS142S0200000_6(view, musicHeaderBackgroundAssem, 6), new C09JN() { // from class: X.00OY
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MusicHeaderBackgroundAssem@a0fc.getMainColorAndSetBackground$ignore$3");
                C1C7U.LIZIZ("MusicHeaderBackgroundAssem@a0fc.getMainColorAndSetBackground$ignore$3");
            }
        });
    }

    public static final void LIZ$2(C639020P4q c639020P4q, Bitmap bitmap) {
        Function0 function0 = (Function0) c639020P4q.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onFailed$0(C639020P4q c639020P4q, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GamePlay background load failed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        ((BulletinFullScreenGamePlayAssem) c639020P4q.l0).No().LLIZLLLIL = false;
    }

    public static final void onFailed$2(C639020P4q c639020P4q, Throwable th) {
        Function0 function0 = (Function0) c639020P4q.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C639020P4q(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
