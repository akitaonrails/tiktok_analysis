package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.method.ImageChooseActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.Intrinsics;
import v7.o;

/* JADX INFO: renamed from: X.14UB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14UB implements InterfaceC20273614Uk {
    public static boolean LJIIL;
    public final WeakReference<Activity> LIZ;
    public final C14UF LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public final ExecutorService LJIIIZ;
    public static int LJIIJ = 216;
    public static int LJIIJJI = 384;
    public static int LJIILIIL = 100;
    public int LIZJ = 1;
    public float LJI = 1.0f;

    public static void LIZLLL(Activity activity) {
        if (!Intrinsics.LJFF("mounted", C786410Ut5.X3())) {
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.PICK");
        C2429209fW.LIZ().appendDataFlowId(intent, 1207965186);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(10003, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GAxDAg0EhgGtxkHDIi6Xb3iTsCKEWUGYwsQJyjc8TzFhhzJe7TjDFD+Bny8Q==", null));
    }

    public final void LIZIZ(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) ImageChooseActivity.class);
        intent.putExtra("maxSelectNum", this.LIZJ);
        intent.putExtra("enter_from", "");
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(10003, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GAxDAg0EhgGtxkHDIi6Xb3iTsCKEWUGYwsQJyjc8TzFhhzJe7TjDFD+Bny8Q==", null));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "");
        C20684815ws.LJIILLIIL("enter_image_choose", c2344009Gk.LIZ);
    }

    public C14UB(WeakReference weakReference, C20272914Ud c20272914Ud) {
        this.LIZ = weakReference;
        this.LIZIZ = c20272914Ud;
        C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
        c2123408To.LIZIZ = "compressPhoto";
        this.LJIIIZ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
    }

    public final void LIZJ(final Activity activity, List<? extends Uri> list) {
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator<? extends Uri> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (C2093608Ic.LJ(it2.next().toString())) {
                    }
                }
            }
            if (this.LJII == 0 && this.LIZLLL) {
                this.LJII = 1;
            }
            final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends Uri> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().toString());
            }
            int i = this.LJII;
            if (i != 1 && i != 2 && i != 3) {
                LIZ(activity, arrayList, null, arrayList);
                return;
            }
            ExecutorService executorService = this.LJIIIZ;
            final C14UF c14uf = this.LIZIZ;
            final AwS239S0300000_30 awS239S0300000_30 = new AwS239S0300000_30(this, (C14UB) activity, (Activity) arrayList, (List<String>) 13);
            executorService.execute(new Runnable(activity, arrayList, c14uf, awS239S0300000_30) { // from class: X.14UA
                public final Activity LL;
                public final List<String> LLILLJJLI;
                public final Function1<List<String>, Unit> LLILLL;

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                public final void LIZ() {
                    if (C14UB.LJIIL) {
                        this.LLILLL.invoke(C09MZ.LIZIZ(this.LLILLJJLI, C14UB.LJIIJ, C14UB.LJIIJJI, C14UB.LJIILIIL, this.LL));
                        return;
                    }
                    final List<String> list2 = this.LLILLJJLI;
                    final o oVar = new o();
                    try {
                        IAVProcessService iAVProcessServiceProcessService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().processService();
                        final ArrayList arrayList2 = new ArrayList();
                        Iterator<String> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            iAVProcessServiceProcessService.compressPhoto(it4.next(), Integer.valueOf(C14UB.LJIIJ), Integer.valueOf(C14UB.LJIIJJI), new IAVProcessService.IProcessCallback<String>() { // from class: X.0Mgi
                                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
                                public final void finish(String str) {
                                    arrayList2.add(str);
                                    if (arrayList2.size() == list2.size()) {
                                        oVar.LJ(arrayList2);
                                    }
                                }
                            });
                        }
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
                    this.LLILLL.invoke((List<String>) c15o7.LJIIL());
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("IDLXPickPhotoFeature$GenerateMultiResponseTask@c983.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("IDLXPickPhotoFeature$GenerateMultiResponseTask@c983.run");
                }

                {
                    this.LL = activity;
                    this.LLILLJJLI = arrayList;
                    this.LLILLL = awS239S0300000_30;
                    new WeakReference(c14uf);
                }
            });
            return;
        }
        this.LIZIZ.LIZ(0, "Path empty");
    }

    @Override // X.InterfaceC20273614Uk
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayListLJ;
        if (i2 != 0 && intent != null) {
            Activity activity = this.LIZ.get();
            if (activity == null) {
                this.LIZIZ.LIZ(0, "Activity not found");
                return;
            }
            if (this.LJFF) {
                Uri data = intent.getData();
                if (data != null && !C2093608Ic.LJ(data.toString())) {
                    String string = data.toString();
                    if (i != 10003) {
                        if (i == 10004) {
                            LIZJ(activity, Collections.singletonList(data));
                            return;
                        }
                        return;
                    }
                    C2277881EDy.LIZIZ.gotoCropActivity(activity, string, false, this.LJI, (int) C12ES.LIZJ(16.0f, activity), 10004, 0, 0, -1, false);
                    return;
                }
                this.LIZIZ.LIZ(0, "Path empty");
                return;
            }
            if (i2 == 41312) {
                String[] stringArrayExtra = intent.getStringArrayExtra("images");
                if (stringArrayExtra != null) {
                    arrayListLJ = new ArrayList(stringArrayExtra.length);
                    for (String str : stringArrayExtra) {
                        arrayListLJ.add(UriProtector.parse(str));
                    }
                } else {
                    arrayListLJ = new ArrayList();
                }
            } else {
                arrayListLJ = C1697810uHb.LJ(intent.getData());
            }
            LIZJ(activity, arrayListLJ);
            return;
        }
        this.LIZIZ.LIZ(-7, "User cancelled");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.app.Activity r14, java.util.List<java.lang.String> r15, java.util.List<java.lang.String> r16, java.util.List<java.lang.String> r17) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14UB.LIZ(android.app.Activity, java.util.List, java.util.List, java.util.List):void");
    }
}
