package Y;

import X.ActivityC2186501Ahk;
import X.C09UZ;
import X.C0IVT;
import X.C1222580hv6;
import X.C1264230j0H;
import X.C1264240j0I;
import X.C1264250j0J;
import X.C1C7U;
import X.C212374189c;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C994003uc;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.ss.android.ugc.profile.business.avatar.OtherProfileAvatarAssem;
import com.ss.android.ugc.profile.business.ur.edit.InstagramPresenter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS24S1100000_19 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Set<Long> setKeySet = C1222580hv6.LLJIJIL.keySet();
        C1222580hv6 c1222580hv6 = (C1222580hv6) this.l1;
        String str = this.s0;
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            ((Number) it2.next()).longValue();
            c1222580hv6.LLJ.removeCallbacksAndMessages(str);
        }
        ((C1222580hv6) this.l1).LLIZLLLIL.remove(this.s0);
        ((C1222580hv6) this.l1).LLJI.remove(this.s0);
        ((C1222580hv6) this.l1).LIZLLL();
    }

    public final void LIZ$1() {
        C1264240j0I c1264240j0I = new C1264240j0I((ActivityC2186501Ahk) this.l1);
        int i = ((ActivityC2186501Ahk) this.l1).LLJILJILJ;
        C1264250j0J c1264250j0J = c1264240j0I.LIZ;
        c1264250j0J.LJ = i;
        c1264250j0J.LIZIZ = 1600L;
        String str = this.s0;
        c1264250j0J.LIZ = str;
        Context context = c1264240j0I.LIZIZ;
        View view = c1264240j0I.LIZJ;
        if (context == null || view == null || str == null || str.length() <= 0) {
            return;
        }
        C1264230j0H c1264230j0H = new C1264230j0H(context, view, c1264240j0I.LIZ);
        try {
            C1264250j0J c1264250j0J2 = c1264230j0H.LLILZIL;
            System.currentTimeMillis();
            c1264250j0J2.getClass();
            c1264230j0H.LL.measure(0, 0);
            c1264230j0H.showAtLocation(c1264230j0H.LLILZ, 80, 0, 0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(c1264230j0H);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            c1264230j0H.LJJIIJ(true);
            C786410Ut5.LJLIIL(c1264230j0H.LLILZIL.LIZIZ, new BPEAHandler(Looper.getMainLooper()), new ARunnableS119S0100000_19(c1264230j0H, 212));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void run$0(ARunnableS24S1100000_19 aRunnableS24S1100000_19) {
        String message;
        String str;
        InstagramPresenter instagramPresenter = (InstagramPresenter) aRunnableS24S1100000_19.l1;
        String str2 = aRunnableS24S1100000_19.s0;
        instagramPresenter.getClass();
        C1C7U.LIZ("InstagramPresenter@53ed.onAuthResult$1L");
        instagramPresenter.LLILZLL = true;
        try {
            HashMap map = new HashMap();
            map.put("code", Uri.encode(str2));
            map.put("new_flow", "true");
            str = instagramPresenter.LLILZIL.doPost(InstagramPresenter.LLIZ, map).get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            message = e.getMessage();
        }
        if (!TextUtils.isEmpty(str)) {
            String string = JSONObjectProtectorUtils.getString(new JSONObject(str), "status_code");
            if (TextUtils.equals(string, CardStruct.IStatusCode.DEFAULT)) {
                instagramPresenter.LLILZ.LJJII(instagramPresenter.LLILLL);
                C1C7U.LIZIZ("InstagramPresenter@53ed.onAuthResult$1L");
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failure response, status: ");
                sbLIZ.append(string);
                message = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            message = "Empty response";
        }
        instagramPresenter.LIZ(message, "send_token_to_sever");
        if (instagramPresenter.LL != null) {
            C09UZ.LIZJ(new ARunnableS119S0100000_19(instagramPresenter, 3));
        }
        C1C7U.LIZIZ("InstagramPresenter@53ed.onAuthResult$1L");
    }

    public static final void run$1(ARunnableS24S1100000_19 aRunnableS24S1100000_19) {
        boolean zLIZ;
        C1C7U.LIZ("LiveQuickPostProgressView@21a3.removePostConfigModel$2");
        try {
            aRunnableS24S1100000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveQuickPostProgressView@21a3.removePostConfigModel$2");
    }

    public static final void run$2(ARunnableS24S1100000_19 aRunnableS24S1100000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AutoScrollComponent@e5d4.eventInit$1$1");
        try {
            ((AutoScrollComponent) aRunnableS24S1100000_19.l1).onPlayCompleted(aRunnableS24S1100000_19.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoScrollComponent@e5d4.eventInit$1$1");
    }

    public static final void run$3(ARunnableS24S1100000_19 aRunnableS24S1100000_19) {
        boolean zLIZ;
        C1C7U.LIZ("OtherProfileAvatarAssem@a27e.addAvatarOnClickListener$2$1");
        try {
            ((OtherProfileAvatarAssem) aRunnableS24S1100000_19.l1).LLLL = C0IVT.LIZIZ(aRunnableS24S1100000_19.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OtherProfileAvatarAssem@a27e.addAvatarOnClickListener$2$1");
    }

    public static final void run$4(ARunnableS24S1100000_19 aRunnableS24S1100000_19) {
        boolean zLIZ;
        C1C7U.LIZ("BaseOcrActivity@6669.showErrorToast$1");
        try {
            aRunnableS24S1100000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseOcrActivity@6669.showErrorToast$1");
    }

    public static final void run$5(ARunnableS24S1100000_19 aRunnableS24S1100000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorBusinessApiImpl@f0d7.initPreloadAndReUseForPreloadIfHitRules$1$task$1");
        try {
            C212374189c.LIZ((Context) aRunnableS24S1100000_19.l1, aRunnableS24S1100000_19.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorBusinessApiImpl@f0d7.initPreloadAndReUseForPreloadIfHitRules$1$task$1");
    }

    public ARunnableS24S1100000_19(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
