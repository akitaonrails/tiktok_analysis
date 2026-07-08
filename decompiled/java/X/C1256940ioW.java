package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.profile.survey.SurveyAnswer;
import com.ss.android.ugc.profile.business.profile.survey.SurveyData;

/* JADX INFO: renamed from: X.0ioW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256940ioW {
    public static volatile C1256940ioW LIZIZ;
    public C1257000ioc LIZ;

    public static C1256940ioW LIZ() {
        if (LIZIZ == null) {
            synchronized (C1256940ioW.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1256940ioW();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZJ() {
        InterfaceC1256950ioX interfaceC1256950ioX = C306860C1c.LIZ;
        boolean zLJI = MethodIDManager.LJI(137944);
        try {
            C15O7<SurveyData> c15o7LIZ = C306860C1c.LIZ.LIZ();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            if (c15o7LIZ != null) {
                c15o7LIZ.LIZLLL(new C1266160j3O(this, 13));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public C1256940ioW() {
        if (LIZIZ != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    public static void LIZIZ(SurveyAnswer surveyAnswer) {
        try {
            C15O7<Object> c15o7LIZIZ = C306860C1c.LIZ.LIZIZ(surveyAnswer.actionType, surveyAnswer.dialogId, surveyAnswer.originalId);
            if (c15o7LIZIZ != null) {
                c15o7LIZIZ.LIZLLL(new InterfaceC2385309Wh() { // from class: X.0N1Z
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C1C7U.LIZ("SurveyManager@516d.recordAnswer$1L");
                        C1C7U.LIZIZ("SurveyManager@516d.recordAnswer$1L");
                        return null;
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
