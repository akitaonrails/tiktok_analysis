package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1A6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.screenshot.ScreenShotMonitor$startListen$2", f = "ScreenShotMonitor.kt", l = {}, m = "invokeSuspend")
public final class C2174071A6r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WeakReference<Activity> LL;
    public final /* synthetic */ C2174091A6t LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2174071A6r(WeakReference<Activity> weakReference, C2174091A6t c2174091A6t, InterfaceC1364105Vn<? super C2174071A6r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = weakReference;
        this.LLILLJJLI = c2174091A6t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2174071A6r(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.1A6u] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.1A6u] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        String str;
        C2174111A6v c2174111A6v;
        boolean z;
        C1C7U.LIZ("ScreenShotMonitor@2fa1.startListen$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Activity activity = this.LL.get();
        if (activity != null) {
            C2174091A6t c2174091A6t = this.LLILLJJLI;
            C717590SCv c717590SCv = c2174091A6t.LJII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C2174091A6t.LJIIIZ;
            boolean z2 = false;
            c717590SCv.LIZIZ(activity);
            C20343314it c20343314it = C20343314it.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Activity[");
            sbLIZ.append(activity);
            sbLIZ.append("]: Try to start screen shot listener: isHasScreenShotListen: ");
            sbLIZ.append(c2174091A6t.LIZ);
            sbLIZ.append(" isHasScreenShotCaptureCallback: ");
            sbLIZ.append(c2174091A6t.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20343314it.getClass();
            C20343314it.LIZ(strLIZIZ);
            if (!c2174091A6t.LIZ && !c2174091A6t.LIZIZ) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    str = "android.permission.READ_MEDIA_IMAGES";
                } else {
                    str = "android.permission.READ_EXTERNAL_STORAGE";
                }
                try {
                    if (C838410Wul.LIZ(activity, str) == 0) {
                        c2174091A6t.LIZJ = new ContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, c2174091A6t.LJ) { // from class: X.1A6u
                            public final Uri LIZ;

                            @Override // android.database.ContentObserver
                            public final void onChange(boolean z3) {
                                super.onChange(z3);
                                C2360909Mx c2360909Mx = C2360909Mx.LIZ;
                                Uri uri = this.LIZ;
                                C717590SCv c717590SCv2 = this.LIZIZ.LJII;
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C2174091A6t.LJIIIZ;
                                Context context = (Context) c717590SCv2.LIZ();
                                Long lValueOf = Long.valueOf(this.LIZIZ.LJFF);
                                c2360909Mx.getClass();
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2360709Mv(context, uri, lValueOf, null), 3);
                            }

                            {
                                super(bPEAHandler);
                                this.LIZ = uri;
                            }
                        };
                        c2174091A6t.LIZLLL = new ContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, c2174091A6t.LJ) { // from class: X.1A6u
                            public final Uri LIZ;

                            @Override // android.database.ContentObserver
                            public final void onChange(boolean z3) {
                                super.onChange(z3);
                                C2360909Mx c2360909Mx = C2360909Mx.LIZ;
                                Uri uri = this.LIZ;
                                C717590SCv c717590SCv2 = this.LIZIZ.LJII;
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C2174091A6t.LJIIIZ;
                                Context context = (Context) c717590SCv2.LIZ();
                                Long lValueOf = Long.valueOf(this.LIZIZ.LJFF);
                                c2360909Mx.getClass();
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2360709Mv(context, uri, lValueOf, null), 3);
                            }

                            {
                                super(bPEAHandler);
                                this.LIZ = uri;
                            }
                        };
                        c2174091A6t.LIZ(System.currentTimeMillis());
                        C2174101A6u c2174101A6u = c2174091A6t.LIZJ;
                        if (c2174101A6u != null) {
                            ContentResolver contentResolver = C786410Ut5.L3(activity).getContentResolver();
                            Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                            if (i > 28) {
                                z = true;
                            } else {
                                z = false;
                            }
                            contentResolver.registerContentObserver(uri, z, c2174101A6u);
                        }
                        C2174101A6u c2174101A6u2 = c2174091A6t.LIZLLL;
                        if (c2174101A6u2 != null) {
                            ContentResolver contentResolver2 = C786410Ut5.L3(activity).getContentResolver();
                            Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            if (i > 28) {
                                z2 = true;
                            }
                            contentResolver2.registerContentObserver(uri2, z2, c2174101A6u2);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('[');
                        sbLIZ2.append(activity);
                        sbLIZ2.append("] start listen");
                        C20343314it.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        c2174091A6t.LIZ = true;
                    } else if (i >= 34 && (c2174111A6v = c2174091A6t.LJI) != null) {
                        activity.registerScreenCaptureCallback(activity.getMainExecutor(), c2174111A6v);
                        c2174091A6t.LIZIZ = true;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('[');
                        sbLIZ3.append(activity);
                        sbLIZ3.append("] start listen");
                        C20343314it.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20343314it c20343314it2 = C20343314it.LIZ;
                    String string = e.toString();
                    c20343314it2.getClass();
                    C20343314it.LIZ(string);
                }
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("ScreenShotMonitor@2fa1.startListen$2");
        return unit;
    }
}
