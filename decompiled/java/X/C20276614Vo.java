package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDVideoUploader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS574S0100000_30;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20276614Vo implements InterfaceC20277514Vx {
    public final WeakReference<Activity> LL;
    public final InterfaceC20276114Vj LLILLJJLI;
    public final InterfaceC20277014Vs LLILLL = new C20276714Vp().LIZ;
    public BDVideoUploader LLILZ;
    public boolean LLILZIL;

    public void LJ(int i, String str) {
        throw null;
    }

    public final BDVideoUploader LIZJ() {
        BDVideoUploader bDVideoUploader = this.LLILZ;
        if (bDVideoUploader != null) {
            return bDVideoUploader;
        }
        return null;
    }

    @Override // X.InterfaceC20277514Vx
    public final void cancelUpload() {
        try {
            LIZJ().stop();
            LIZJ().close();
            LIZLLL(0, "uploadCancel");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(int i, String str) {
        this.LLILLJJLI.LIZ(i, str);
    }

    public final void LJFF(final Function0 function0, boolean z) {
        String str = null;
        if (z) {
            final Activity activity = this.LL.get();
            if (activity != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    if (C14W2.LIZ(activity) == 0 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VIDEO") == 0) {
                        function0.invoke();
                        return;
                    }
                    if (i >= 34 && C14W2.LIZ(activity) == 0 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                        function0.invoke();
                        return;
                    }
                    TokenCert tokenCertWith = TokenCert.Companion.with("bpea-video_upload_camera_and_write_storage_permission");
                    String[] strArr = new String[3];
                    strArr[0] = "android.permission.READ_MEDIA_VIDEO";
                    strArr[1] = "android.permission.CAMERA";
                    if (i >= 34) {
                        str = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
                    }
                    strArr[2] = str;
                    C19771812Xk.LIZIZ(activity, tokenCertWith, (String[]) ((ArrayList) C13LQ.LJIJI(strArr)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14Vq
                        @Override // X.InterfaceC19772112Xn
                        public final void LIZ(int[] iArr, String[] strArr2) {
                            this.LIZIZ(activity, iArr, function0);
                        }
                    });
                    return;
                }
                if (C14W2.LIZ(activity) == 0 && C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    function0.invoke();
                    return;
                } else {
                    C19771812Xk.LIZIZ(activity, TokenCert.Companion.with("bpea-video_upload_camera_and_write_storage_permission"), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, new InterfaceC19772112Xn() { // from class: X.14Vr
                        @Override // X.InterfaceC19772112Xn
                        public final void LIZ(int[] iArr, String[] strArr2) {
                            this.LIZIZ(activity, iArr, function0);
                        }
                    });
                    return;
                }
            }
            return;
        }
        final Activity activity2 = this.LL.get();
        if (activity2 == null) {
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            if (C838410Wul.LIZ(activity2, "android.permission.READ_MEDIA_VIDEO") == 0) {
                function0.invoke();
                return;
            }
            if (i2 >= 34 && C838410Wul.LIZ(activity2, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                function0.invoke();
                return;
            }
            TokenCert tokenCertWith2 = TokenCert.Companion.with("bpea-video_upload_write_storage_permission");
            String[] strArr2 = new String[2];
            strArr2[0] = "android.permission.READ_MEDIA_VIDEO";
            if (i2 >= 34) {
                str = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
            }
            strArr2[1] = str;
            C19771812Xk.LIZIZ(activity2, tokenCertWith2, (String[]) ((ArrayList) C13LQ.LJIJI(strArr2)).toArray(new String[0]), new InterfaceC19772112Xn() { // from class: X.14Vm
                @Override // X.InterfaceC19772112Xn
                public final void LIZ(int[] iArr, String[] strArr3) {
                    if (iArr[0] == 0) {
                        function0.invoke();
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 34 && iArr.length == 2 && C838410Wul.LIZ(activity2, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                        function0.invoke();
                        return;
                    }
                    if (iArr[0] != 0) {
                        C1233040iBy c1233040iBy = new C1233040iBy(activity2);
                        c1233040iBy.LIZJ(activity2.getString(2131839204));
                        c1233040iBy.LIZLLL();
                    }
                    this.LLILLJJLI.LIZ(-1, "uploadFailed");
                }
            });
            return;
        }
        if (C838410Wul.LIZ(activity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            function0.invoke();
        } else {
            C19771812Xk.LIZIZ(activity2, TokenCert.Companion.with("bpea-video_upload_write_storage_permission"), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new InterfaceC19772112Xn() { // from class: X.14Vn
                @Override // X.InterfaceC19772112Xn
                public final void LIZ(int[] iArr, String[] strArr3) {
                    if (iArr[0] == 0) {
                        function0.invoke();
                        return;
                    }
                    C1233040iBy c1233040iBy = new C1233040iBy(activity2);
                    c1233040iBy.LIZJ(activity2.getString(2131839204));
                    c1233040iBy.LIZLLL();
                    this.LLILLJJLI.LIZ(-1, "uploadFailed");
                }
            });
        }
    }

    @Override // X.InterfaceC20277514Vx
    public final void handleJsInvoke(JSONObject jSONObject, boolean z) {
        int iOptInt = jSONObject.optInt("type");
        if (iOptInt != 700) {
            if (iOptInt == 800) {
                LJFF(new AwS574S0100000_30(this, 316), z);
                return;
            }
            return;
        }
        LJFF(new AwS574S0100000_30(this, 317), z);
    }

    public C20276614Vo(WeakReference weakReference, C20277714Vz c20277714Vz, AbstractC20277614Vy abstractC20277614Vy) {
        this.LL = weakReference;
        this.LLILLJJLI = abstractC20277614Vy;
    }

    public static void LIZ(Activity activity, int i, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkROTfE1WS0IWv5kdJfKfR84cPABf3wmBYh9", null));
    }

    public final void LIZIZ(Activity activity, int[] iArr, Function0<Unit> function0) {
        if (iArr[0] == 0 && iArr[1] == 0) {
            function0.invoke();
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && iArr.length == 3 && C838410Wul.LIZ(activity, "android.permission.CAMERA") == 0 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            function0.invoke();
            return;
        }
        if (iArr[0] != 0) {
            C1233040iBy c1233040iBy = new C1233040iBy(activity);
            c1233040iBy.LIZJ(activity.getString(2131839204));
            c1233040iBy.LIZLLL();
        }
        if (iArr[1] != 0) {
            C1233040iBy c1233040iBy2 = new C1233040iBy(activity);
            c1233040iBy2.LIZJ(activity.getString(2131839203));
            c1233040iBy2.LIZLLL();
        }
        this.LLILLJJLI.LIZ(-1, "uploadFailed");
    }
}
