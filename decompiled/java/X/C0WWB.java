package X;

import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.eventtracking.SmsRetrieverGoogleAvailabilityEvent;
import com.ss.android.ugc.aweme.account.eventtracking.SmsRetrieverInitiationEvent;
import com.ss.android.ugc.aweme.account.eventtracking.SmsVerifyHasSimEvent;

/* JADX INFO: renamed from: X.0WWB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WWB {
    public final Context LIZ;
    public C0WW9 LIZIZ;
    public final C833030Wm5 LIZJ;
    public boolean LJ;
    public int LJFF;
    public final MutableLiveData<String> LIZLLL = new MutableLiveData<>();
    public final boolean LJI = LIZ();

    public final boolean LIZ() {
        this.LJFF = C0WWA.LIZ(this.LIZ);
        this.LJ = C0VFU.LIZ(this.LIZ);
        if (this.LJFF == 0) {
            SmsRetrieverGoogleAvailabilityEvent smsRetrieverGoogleAvailabilityEvent = new SmsRetrieverGoogleAvailabilityEvent();
            smsRetrieverGoogleAvailabilityEvent.LJI(1, "availability");
            smsRetrieverGoogleAvailabilityEvent.LJIIIIZZ();
        } else {
            SmsRetrieverGoogleAvailabilityEvent smsRetrieverGoogleAvailabilityEvent2 = new SmsRetrieverGoogleAvailabilityEvent();
            smsRetrieverGoogleAvailabilityEvent2.LJI(0, "availability");
            smsRetrieverGoogleAvailabilityEvent2.LJIIIIZZ();
        }
        if (this.LJ) {
            SmsVerifyHasSimEvent smsVerifyHasSimEvent = new SmsVerifyHasSimEvent();
            smsVerifyHasSimEvent.LJI(1, "has_sim");
            smsVerifyHasSimEvent.LJIIIIZZ();
        } else {
            SmsVerifyHasSimEvent smsVerifyHasSimEvent2 = new SmsVerifyHasSimEvent();
            smsVerifyHasSimEvent2.LJI(0, "has_sim");
            smsVerifyHasSimEvent2.LJIIIIZZ();
        }
        return this.LJ && this.LJFF == 0;
    }

    public final void LIZIZ() {
        if (this.LJI) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new C0WW9(this.LIZ, this.LIZLLL);
            }
            C0WW9 c0ww9 = this.LIZIZ;
            c0ww9.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            try {
                C838410Wul.LJFF(c0ww9.LIZ, c0ww9, intentFilter, 2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZJ() {
        if (this.LJI) {
            C2204961BRm.LLLLLJIL(this.LIZJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk0a50yKw7ApG3//Z7irTj", null)).LIZIZ(new InterfaceC834580Woa() { // from class: X.0WWC
                @Override // X.InterfaceC834580Woa
                public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                    String strLIZ;
                    C0WWB c0wwb = this.LL;
                    c0wwb.getClass();
                    if (abstractC835450Wpz.LJIILJJIL()) {
                        SmsRetrieverInitiationEvent smsRetrieverInitiationEvent = new SmsRetrieverInitiationEvent();
                        smsRetrieverInitiationEvent.LJI(1, "is_success");
                        smsRetrieverInitiationEvent.LJIIIIZZ();
                        return;
                    }
                    Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                    String strLIZ2 = "";
                    if (excLJIIIZ == null) {
                        strLIZ = "";
                    } else {
                        strLIZ = C2210608lM.LIZ(excLJIIIZ);
                    }
                    SmsRetrieverInitiationEvent smsRetrieverInitiationEvent2 = new SmsRetrieverInitiationEvent();
                    smsRetrieverInitiationEvent2.LJI(0, "is_success");
                    smsRetrieverInitiationEvent2.LJI(strLIZ, "is_success");
                    smsRetrieverInitiationEvent2.LJIIIIZZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to start SMS Retriever, exception: ");
                    if (abstractC835450Wpz.LJIIIZ() != null) {
                        strLIZ2 = C2210608lM.LIZ(abstractC835450Wpz.LJIIIZ());
                    }
                    sbLIZ.append(strLIZ2);
                    C832090WkZ.LIZLLL(c0wwb.LJFF, C2188811AlT.LIZIZ(sbLIZ), false, c0wwb.LJ);
                }
            });
        } else {
            C832090WkZ.LIZLLL(this.LJFF, "Feature cannot be used", false, this.LJ);
        }
    }

    public C0WWB(Context context) {
        this.LIZ = context;
        this.LIZJ = new C833030Wm5(context);
    }
}
