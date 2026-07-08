package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720550SOf {
    public final C0SRL LIZ;
    public final View LIZIZ;
    public final ViewGroup LIZJ;
    public final C0SBA LIZLLL;
    public Pair<? extends View, ? extends Runnable> LJ;
    public final C01GW LJFF;

    public C720550SOf(C0SRL c0srl) throws Throwable {
        C2252321DDq c2252321DDqLJIIJ;
        this.LIZ = c0srl;
        C0S5S c0s5s = null;
        View viewLIZIZ = C21146717pB.LIZIZ(c0srl.LIZLLL(), R.layout.ea5, null, false);
        this.LIZIZ = viewLIZIZ;
        ViewGroup viewGroupLJIIIIZZ = c0srl.LJIIIIZZ();
        this.LIZJ = viewGroupLJIIIIZZ;
        C0SBA c0sbaDk = c0srl.LJIIL.Dk();
        this.LIZLLL = c0sbaDk;
        LifecycleCoroutineScope lifecycleCoroutineScopeLJIILJJIL = c0srl.LJIILJJIL();
        this.LJFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1559));
        if (viewGroupLJIIIIZZ != null) {
            viewGroupLJIIIIZZ.addView(viewLIZIZ);
        }
        if (C281410B1f.LIZ()) {
            if (c0sbaDk != null) {
                if (c0sbaDk.LJIIJ() != null) {
                    C23250099c.LIZLLL(lifecycleCoroutineScopeLJIILJJIL, null, null, new C0SC7(this, null), 3);
                    return;
                }
                if (c0sbaDk != null) {
                    c0s5s = (C0S5S) c2252321DDqLJIIJ.getValue();
                }
            }
        } else if (c0sbaDk != null && (c2252321DDqLJIIJ = c0sbaDk.LJIIJ()) != null) {
            c0s5s = (C0S5S) c2252321DDqLJIIJ.getValue();
        }
        LIZ(c0s5s);
    }

    public final void LIZ(C0S5S c0s5s) throws Throwable {
        boolean z;
        boolean z2;
        Aweme aweme;
        PhotoModeImageInfo photoModeImageInfo;
        String title;
        String descLanguage;
        Float f;
        TuxTextView tuxTextView = (TuxTextView) this.LIZIZ.findViewById(R.id.rli);
        if (tuxTextView == null) {
            return;
        }
        if (C07CO.LIZ()) {
            if (((Number) C07CO.LIZ.getValue()).intValue() >= 2) {
                tuxTextView.setTuxFont(32);
            } else {
                tuxTextView.setTuxFont(33);
            }
            C426750GoL.LJIIL(tuxTextView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 23);
        }
        if (C07QQ.LIZ() >= 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C426750GoL.LJIIL(tuxTextView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 23);
        }
        if (C07QQ.LIZ() >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = null;
        if (z2) {
            Map<String, String> map = C2273381Dya.LIZ;
            float textSize = tuxTextView.getTextSize();
            Aweme aweme2 = this.LIZ.LIZJ;
            if (aweme2 == null || (descLanguage = aweme2.getPhotoTitleLanguageCode()) == null) {
                Aweme aweme3 = this.LIZ.LIZJ;
                if (aweme3 != null) {
                    descLanguage = aweme3.getDescLanguage();
                } else {
                    descLanguage = null;
                }
            }
            C0SUE c0sueLIZ = C2273381Dya.LIZ(descLanguage);
            if (c0sueLIZ != null && (f = c0sueLIZ.LIZ) != null) {
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(textSize * f.floatValue()));
                if (numValueOf.intValue() > 0) {
                    C21382118m3.LJFF(tuxTextView, numValueOf.intValue());
                }
            }
        }
        if (c0s5s == null || !c0s5s.LIZIZ ? (aweme = this.LIZ.LIZJ) == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (title = photoModeImageInfo.getTitle()) == null : (title = c0s5s.LIZ) == null) {
            title = "";
        }
        if (!TextUtils.isEmpty(title)) {
            tuxTextView.setText(title);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            C439870HMr.LIZJ(tuxTextView, null);
            C0SX4 c0sx4 = (C0SX4) this.LJFF.getValue();
            if (c0sx4 != null) {
                c0sx4.LIZ(tuxTextView);
            }
            if (!this.LIZ.LJIJ()) {
                C0SXC.LIZ.getClass();
                boolean zLJ = C0SXC.LJ(title);
                PostModeDetailParams postModeDetailParams = this.LIZ.LJII;
                if (postModeDetailParams != null) {
                    str = postModeDetailParams.eventType;
                }
                this.LJ = C0SXC.LJIIIIZZ(tuxTextView, zLJ, str);
                return;
            }
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }
}
