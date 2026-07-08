package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14UV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14UV extends PthreadAsyncTask<Unit, Unit, Uri> {
    public final boolean LIZ;
    public final WeakReference<Activity> LIZIZ;
    public final WeakReference<C14VI> LIZJ;

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        C14VI c14vi = this.LIZJ.get();
        if (c14vi == null) {
            return;
        }
        c14vi.LIZIZ.LIZ(2, "Take photo cancelled");
    }

    public final Uri LIZ(Context context) throws IOException {
        String str = new SimpleDateFormat("yyyy-MMdd_HHmmss", Locale.ENGLISH).format(new Date());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Dou_fsm_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(".jpg");
            return C2400409as.LIZ(context, C2188811AlT.LIZIZ(sbLIZ2));
        }
        C2215208m6 c2215208m6LIZ = C2359009Me.LIZ();
        if (c2215208m6LIZ == null) {
            return null;
        }
        File fileCreateTempFile = File.createTempFile(strLIZIZ, ".jpg", c2215208m6LIZ);
        C14VI c14vi = this.LIZJ.get();
        if (c14vi != null) {
            c14vi.LJ = fileCreateTempFile.getAbsolutePath();
        }
        return C2431009fo.LIZIZ(context, fileCreateTempFile);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Activity activity = this.LIZIZ.get();
        if (activity != null) {
            try {
                return LIZ(activity);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) throws Throwable {
        Uri uri = (Uri) obj;
        C14VI c14vi = this.LIZJ.get();
        Activity activity = this.LIZIZ.get();
        if (c14vi != null && activity != null) {
            if (uri == null) {
                c14vi.LIZIZ.LIZ(1, "Take photo failed");
                return;
            }
            c14vi.LIZLLL = uri;
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (Intrinsics.LJFF(c14vi.LJFF, "front")) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                intent.putExtra("default_camera", "1");
                intent.putExtra("default_mode", "com.huawei.camera2.mode.photo.PhotoMode");
                intent.putExtra("camerafacing", "front");
                intent.putExtra("previous_mode", "front");
            }
            intent.putExtra("output", uri);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207965441);
            intent.addFlags(3);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIIZILJ(1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa3TmAmwzvRN+gH5SFTu/N6KCnrpiX2toUPNf2H975hDVH", null));
        }
    }

    public C14UV(Activity activity, C14VI c14vi, boolean z) {
        this.LIZ = z;
        this.LIZIZ = new WeakReference<>(activity);
        this.LIZJ = new WeakReference<>(c14vi);
    }
}
