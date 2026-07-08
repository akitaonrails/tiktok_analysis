package X;

import android.text.InputFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailOTPLoginCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeSheetFragment;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266060j3E implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void run$10(C1266060j3E c1266060j3E) {
        ((Function0) c1266060j3E.l0).invoke();
    }

    @Override // X.InterfaceC781210Ukh
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
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
        }
    }

    public static final void run$0(C1266060j3E c1266060j3E) {
        ((Function0) c1266060j3E.l0).invoke();
    }

    public static final void run$1(C1266060j3E c1266060j3E) {
        ((TwoStepVerifyEmailFor2046Fragment) c1266060j3E.l0).AT().setEnabled(true);
        ((TwoStepVerifyEmailFor2046Fragment) c1266060j3E.l0).AT().setLoading(false);
    }

    public static final void run$11(C1266060j3E c1266060j3E) {
        ((TwoStepVerifyEmailFor2046Fragment) c1266060j3E.l0).oT();
    }

    public static final void run$12(C1266060j3E c1266060j3E) {
        ((TwoStepVerifySmsFor2046Fragment) c1266060j3E.l0).oT();
    }

    public static final void run$2(C1266060j3E c1266060j3E) {
        ((TwoStepVerifySmsFor2046Fragment) c1266060j3E.l0).AT().setEnabled(true);
        ((TwoStepVerifySmsFor2046Fragment) c1266060j3E.l0).AT().setLoading(false);
    }

    public static final void run$3(C1266060j3E c1266060j3E) {
        ((EmailOTPLoginCodeVerifyFragment) c1266060j3E.l0).oT();
    }

    public static final void run$4(C1266060j3E c1266060j3E) {
        C21407818qC c21407818qCIT = ((InputCodeSheetFragment) c1266060j3E.l0).iT();
        InputFilter[] inputFilterArr = ((InputCodeSheetFragment) c1266060j3E.l0).LLLLLLZ;
        if (inputFilterArr == null) {
            inputFilterArr = new InputFilter[0];
        }
        c21407818qCIT.setFilters(inputFilterArr);
        ((InputCodeSheetFragment) c1266060j3E.l0).LLLLLLLZIL = false;
    }

    public static final void run$5(C1266060j3E c1266060j3E) {
        C21407818qC c21407818qCIT = ((InputCodeSheetFragment) c1266060j3E.l0).iT();
        InputFilter[] inputFilterArr = ((InputCodeSheetFragment) c1266060j3E.l0).LLLLLLZ;
        if (inputFilterArr == null) {
            inputFilterArr = new InputFilter[0];
        }
        c21407818qCIT.setFilters(inputFilterArr);
        ((InputCodeSheetFragment) c1266060j3E.l0).LLLLLLLZIL = false;
    }

    public static final void run$6(C1266060j3E c1266060j3E) {
        ((InputCodeSheetFragment) c1266060j3E.l0).oT();
    }

    public static final void run$7(C1266060j3E c1266060j3E) {
        ((RecFeedShareComponentController) c1266060j3E.l0).LLILLJJLI = false;
    }

    public static final void run$8(C1266060j3E c1266060j3E) {
        int length;
        String string;
        C1252610ihX c1252610ihX = (C1252610ihX) c1266060j3E.l0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(c1252610ihX);
                objectOutputStream.flush();
                objectOutputStream.close();
                length = byteArrayOutputStream.toByteArray().length;
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZLLL(e2);
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                length = 0;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(length, "data_size");
            c2344009Gk.LJIIIIZZ("enter_from", ((C1252610ihX) c1266060j3E.l0).getEnterFrom());
            c2344009Gk.LJIIIIZZ("previous_page", ((C1252610ihX) c1266060j3E.l0).getPreviousPage());
            EnumC1260920iuw sceneType = ((C1252610ihX) c1266060j3E.l0).getSceneType();
            if (sceneType != null) {
                string = sceneType.toString();
            } else {
                string = null;
            }
            c2344009Gk.LJIIIIZZ("scene_type", string);
            c2344009Gk.LJIIIIZZ("to_user_id", ((C1252610ihX) c1266060j3E.l0).getToUserId());
            C20684815ws.LJIILLIIL("recommend_enter_profile_param_monitor", c2344009Gk.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e4) {
                TryCatchGuardChecker.doCheck(e4);
                throw th;
            }
        }
    }

    public static final void run$9(C1266060j3E c1266060j3E) {
        ((C1238900iLQ) c1266060j3E.l0).N5(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1266060j3E(Function0 function0, Function0<Unit> function02) {
        this.$t = function02;
        if (function02 != 0) {
            this.l0 = function0;
        } else {
            this.l0 = function0;
        }
    }

    public C1266060j3E(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
