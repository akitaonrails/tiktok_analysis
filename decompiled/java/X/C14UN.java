package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v7.o;

/* JADX INFO: renamed from: X.14UN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14UN implements InterfaceC20273614Uk {
    public static boolean LJIIL;
    public static int LJIILIIL = 216;
    public static int LJIILJJIL = 384;
    public static int LJIILL = 100;
    public final WeakReference<Activity> LIZ;
    public final C14UF LIZIZ;
    public final ExecutorService LIZJ;
    public final ExecutorService LIZLLL;
    public Uri LJ;
    public String LJFF;
    public String LJI;
    public C14UT LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.14UT, android.os.AsyncTask] */
    public final void LIZ(final Activity activity) {
        C14UT c14ut = this.LJII;
        if (c14ut != null) {
            c14ut.cancel(false);
        }
        final boolean z = this.LJIIJ;
        ?? r2 = new PthreadAsyncTask<Unit, Unit, Uri>(activity, this, z) { // from class: X.14UT
            public final boolean LIZ;
            public final WeakReference<Activity> LIZIZ;
            public final WeakReference<C14UN> LIZJ;

            @Override // android.os.AsyncTask
            public final void onCancelled() {
                C14UN c14un = this.LIZJ.get();
                if (c14un == null) {
                    return;
                }
                c14un.LIZIZ.LIZ(-7, "Take photo cancelled");
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
                C2359209Mg.LIZ.getClass();
                File fileCreateTempFile = File.createTempFile(strLIZIZ, ".jpg", C2359209Mg.LIZJ());
                C14UN c14un = this.LIZJ.get();
                if (c14un != null) {
                    c14un.LJFF = fileCreateTempFile.getAbsolutePath();
                }
                return C2431009fo.LIZIZ(context, fileCreateTempFile);
            }

            @Override // android.os.AsyncTask
            public final Object doInBackground(Object[] objArr) {
                Activity activity2 = this.LIZIZ.get();
                if (activity2 != null) {
                    try {
                        return LIZ(activity2);
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
                C14UN c14un = this.LIZJ.get();
                Activity activity2 = this.LIZIZ.get();
                if (c14un != null && activity2 != null) {
                    if (uri == null) {
                        c14un.LIZIZ.LIZ(0, "Take photo failed");
                        return;
                    }
                    c14un.LJ = uri;
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    if (Intrinsics.LJFF(c14un.LJI, "front")) {
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
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Activity_startActivityForResult_2");
                    C1701330uNH.LIZ(intent, activity2);
                    C2204961BRm.LJIIZILJ(1, activity2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GAxDAg0EhgGtxkHDIi6Xb3iTsCKEWUGYwsQJyjd8z7GBhzJaAmHYuwfa1jNQ==", null));
                }
            }

            {
                this.LIZ = z;
                this.LIZIZ = new WeakReference<>(activity);
                this.LIZJ = new WeakReference<>(this);
            }
        };
        C0WP3.LIZLLL(r2, this.LIZJ, new Unit[0]);
        this.LJII = r2;
    }

    public C14UN(WeakReference weakReference, C20272914Ud c20272914Ud) {
        this.LIZ = weakReference;
        this.LIZIZ = c20272914Ud;
        C0WQX c0wqx = C0WQX.SERIAL;
        C2123408To c2123408To = new C2123408To(c0wqx);
        c2123408To.LIZIZ = "takePhoto";
        this.LIZJ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
        C2123408To c2123408To2 = new C2123408To(c0wqx);
        c2123408To2.LIZIZ = "compressPhoto";
        this.LIZLLL = C823050WQl.LIZ(new C2123508Tp(c2123408To2));
    }

    public static boolean LIZIZ(Activity activity, String str) {
        if (C838410Wul.LIZ(activity, str) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20273614Uk
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        long jLongValue;
        String strLIZ;
        if (i2 == 0) {
            this.LIZIZ.LIZ(-7, "User cancel");
            return;
        }
        if (this.LJIIJJI == 0 && this.LJIIIIZZ) {
            this.LJIIJJI = 1;
        }
        if (i2 == -1) {
            int i3 = this.LJIIJJI;
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                String strValueOf = this.LJFF;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(this.LJ);
                }
                Long lLIZ = C09N2.LIZ(contextLIZ, UriProtector.parse(strValueOf));
                if (lLIZ != null) {
                    jLongValue = lLIZ.longValue();
                } else {
                    jLongValue = 0;
                }
                String strValueOf2 = this.LJFF;
                if (strValueOf2 == null) {
                    strValueOf2 = String.valueOf(this.LJ);
                }
                C14UM c14um = new C14UM(jLongValue, strValueOf2, "image");
                C2359209Mg c2359209Mg = C2359209Mg.LIZ;
                String strValueOf3 = this.LJFF;
                if (strValueOf3 == null) {
                    strValueOf3 = String.valueOf(this.LJ);
                }
                c2359209Mg.getClass();
                c14um.LJ = C2359209Mg.LIZIZ(strValueOf3);
                if (this.LJIIIZ) {
                    Activity activity = this.LIZ.get();
                    if (activity != null) {
                        String strValueOf4 = this.LJFF;
                        if (strValueOf4 == null) {
                            strValueOf4 = String.valueOf(this.LJ);
                        }
                        strLIZ = C142G.LIZ(activity, strValueOf4);
                    } else {
                        strLIZ = null;
                    }
                    c14um.LIZLLL = strLIZ;
                }
                List<C14UM> listSingletonList = Collections.singletonList(c14um);
                C14UF c14uf = this.LIZIZ;
                C14UE c14ue = new C14UE();
                c14ue.LIZ = listSingletonList;
                c14uf.LIZIZ(c14ue);
                return;
            }
            ExecutorService executorService = this.LIZLLL;
            final WeakReference<Activity> weakReference = this.LIZ;
            final String strValueOf5 = this.LJFF;
            if (strValueOf5 == null) {
                strValueOf5 = String.valueOf(this.LJ);
            }
            final C14UF c14uf2 = this.LIZIZ;
            final boolean z = this.LJIIIZ;
            final int i4 = this.LJIIJJI;
            executorService.execute(new Runnable(weakReference, strValueOf5, c14uf2, z, i4) { // from class: X.14UG
                public final WeakReference<Activity> LL;
                public final boolean LLILLJJLI;
                public final int LLILLL;
                public final String LLILZ;
                public final WeakReference<C14UF> LLILZIL;

                public final void LIZ() throws Throwable {
                    String strLIZ2;
                    Activity activity2;
                    Activity activity3;
                    String str = this.LLILZ;
                    if (str == null) {
                        return;
                    }
                    if (C14UN.LJIIL) {
                        strLIZ2 = (this.LL.get() == null || (activity3 = this.LL.get()) == null) ? null : C09MZ.LIZ(this.LLILZ, C14UN.LJIILIIL, C14UN.LJIILJJIL, C14UN.LJIILL, activity3);
                    } else {
                        final o oVar = new o();
                        try {
                            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().processService().compressPhoto(str, 216, 384, new IAVProcessService.IProcessCallback<String>() { // from class: X.14UH
                                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
                                public final void finish(String str2) {
                                    oVar.LJ(str2);
                                }
                            });
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            oVar.LJ(null);
                        }
                        C15O7<TResult> c15o7 = oVar.LIZ;
                        try {
                            c15o7.LJIJJLI();
                        } catch (InterruptedException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        strLIZ2 = (String) c15o7.LJIIL();
                    }
                    int i5 = this.LLILLL;
                    String str2 = (i5 == 1 || i5 == 3) ? strLIZ2 : this.LLILZ;
                    if (str2 != null) {
                        C844470XAv.LIZ.getClass();
                        Long lLIZ2 = C09N2.LIZ(C844470XAv.LIZ(), UriProtector.parse(str2));
                        C14UM c14um2 = new C14UM(lLIZ2 != null ? lLIZ2.longValue() : 0L, str2, "image");
                        C2359209Mg.LIZ.getClass();
                        c14um2.LJ = C2359209Mg.LIZIZ(str2);
                        if (this.LLILLJJLI && (activity2 = this.LL.get()) != null) {
                            int i6 = this.LLILLL;
                            if (i6 == 1 || i6 == 2) {
                                c14um2.LIZLLL = strLIZ2 != null ? C142G.LIZ(activity2, strLIZ2) : null;
                            } else if (i6 == 3) {
                                c14um2.LIZLLL = C142G.LIZ(activity2, this.LLILZ);
                            }
                        }
                        List<C14UM> listSingletonList2 = Collections.singletonList(c14um2);
                        C14UF c14uf3 = this.LLILZIL.get();
                        if (c14uf3 != null) {
                            C14UE c14ue2 = new C14UE();
                            c14ue2.LIZ = listSingletonList2;
                            c14uf3.LIZIZ(c14ue2);
                            if (Unit.LIZ != null) {
                                return;
                            }
                        }
                    }
                    C14UF c14uf4 = this.LLILZIL.get();
                    if (c14uf4 != null) {
                        c14uf4.LIZ(0, "CompressFilePath is null");
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("IDLXTakePhotoFeature$GenerateResponseTask@9fc5.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("IDLXTakePhotoFeature$GenerateResponseTask@9fc5.run");
                }

                {
                    this.LL = weakReference;
                    this.LLILLJJLI = z;
                    this.LLILLL = i4;
                    this.LLILZ = strValueOf5;
                    this.LLILZIL = new WeakReference<>(c14uf2);
                }
            });
        }
    }
}
