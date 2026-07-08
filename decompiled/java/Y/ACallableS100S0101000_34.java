package Y;

import X.C0WZX;
import X.C1399860mX2;
import X.C1701330uNH;
import X.C1B58;
import X.C1BL7;
import X.C1BLC;
import X.C1C7U;
import X.C2199661B7c;
import X.C2199671B7d;
import X.C2204961BRm;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.ProgressDialogC1399850mX1;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes35.dex */
public class ACallableS100S0101000_34 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS100S0101000_34 aCallableS100S0101000_34) {
        Cursor cursorRawQuery;
        C1C7U.LIZ("SqlDownloadCache@494c.getDownloadInfo$1");
        C1B58 c1b58 = (C1B58) aCallableS100S0101000_34.l0;
        int i = aCallableS100S0101000_34.i1;
        c1b58.m1();
        DownloadInfo downloadInfoLJIJJ = null;
        if (C1B58.LLILZLL != null) {
            try {
                cursorRawQuery = C1B58.LLILZLL.rawQuery(C786410Ut5.j4("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloader", "_id"}), new String[]{Integer.toString(i)});
                try {
                    if (cursorRawQuery.moveToNext()) {
                        downloadInfoLJIJJ = C2199661B7c.LJIJJ(cursorRawQuery);
                        C2199671B7d.LJJIII(cursorRawQuery);
                    } else {
                        C2199671B7d.LJJIII(cursorRawQuery);
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C2199671B7d.LJJIII(cursorRawQuery);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C2199671B7d.LJJIII(cursorRawQuery);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursorRawQuery = null;
            }
        }
        C1C7U.LIZIZ("SqlDownloadCache@494c.getDownloadInfo$1");
        return downloadInfoLJIJJ;
    }

    public static final Object call$1(ACallableS100S0101000_34 aCallableS100S0101000_34) {
        C1BLC c1blc = (C1BLC) aCallableS100S0101000_34.l0;
        int i = aCallableS100S0101000_34.i1;
        C1C7U.LIZ("StateUpdatedInUIThreadImpl@c54f.onStateUpdate$1L");
        boolean z = c1blc.LJI.LJIIJ;
        C1399860mX2 c1399860mX2LIZIZ = C1399860mX2.LIZIZ();
        C1BL7 c1bl7 = c1blc.LJI.LJIIJJI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (z) {
                            c1399860mX2LIZIZ.LIZ();
                        }
                        if (c1bl7 != null) {
                            c1bl7.LJ();
                        }
                    }
                } else {
                    if (!c1blc.LJFF && z) {
                        c1399860mX2LIZIZ.LIZJ(c1blc.LJIIJJI, c1blc.LJIIJ);
                        if (c1399860mX2LIZIZ.LIZ != null && c1399860mX2LIZIZ.LIZ.LLILZIL != null) {
                            c1399860mX2LIZIZ.LIZ.setMessage(c1399860mX2LIZIZ.LIZ.getContext().getString(R.string.txr));
                        }
                    }
                    if (c1bl7 != null) {
                        c1bl7.LIZIZ();
                        c1bl7.LIZJ();
                    }
                }
            } else {
                if (!c1blc.LJFF && z) {
                    c1399860mX2LIZIZ.LIZJ(c1blc.LJIIJJI, c1blc.LJIIJ);
                }
                if (c1bl7 != null) {
                    c1bl7.LIZIZ();
                }
            }
        } else {
            if (!c1blc.LJFF && z) {
                c1399860mX2LIZIZ.getClass();
                String str = c1blc.LIZ;
                if (!c1399860mX2LIZIZ.LIZIZ) {
                    Activity validTopActivity = ActivityStack.getValidTopActivity();
                    if (validTopActivity != null) {
                        Intent intent = new Intent(validTopActivity, (Class<?>) DFInstallBlankActivity.class);
                        intent.putExtra("module_name", str);
                        intent.putExtra("is_hold_progress_dialog", true);
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(validTopActivity, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, validTopActivity);
                        C2204961BRm.LJIILLIIL(validTopActivity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOupYY/CyTWLEHdFYsp1PwXSO2QIF3fqHv5nvdaBNrPL58JIEiViSQiLHIv+jnS/Ohw=", null));
                        C786410Ut5.ae(0, validTopActivity, 0);
                        c1399860mX2LIZIZ.LIZIZ = true;
                    }
                } else if (c1399860mX2LIZIZ.LIZ != null && c1399860mX2LIZIZ.LIZ.LLILZIL != null && !c1399860mX2LIZIZ.LIZ.LLILZIL.isFinishing()) {
                    ProgressDialogC1399850mX1 progressDialogC1399850mX1 = c1399860mX2LIZIZ.LIZ;
                    progressDialogC1399850mX1.show();
                    C785410UrT.LIZIZ(progressDialogC1399850mX1);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(progressDialogC1399850mX1);
                    C816490W1f.LIZ(progressDialogC1399850mX1);
                }
            }
            if (c1bl7 != null) {
                c1bl7.LIZLLL();
            }
        }
        C1C7U.LIZIZ("StateUpdatedInUIThreadImpl@c54f.onStateUpdate$1L");
        return null;
    }

    public ACallableS100S0101000_34(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
