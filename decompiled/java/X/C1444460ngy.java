package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.highlight.LiveEnableMileStoneHighlightPublishCheckerSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveHighLighteningPublisherService;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PublishParams;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ngy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444460ngy {
    public final PostConfigModel LIZ;
    public final Fragment LIZIZ;
    public final C19EG LIZJ;
    public Bitmap LIZLLL;
    public Object LJ;
    public int LJFF;
    public int LJI;

    public static C0VSJ LIZIZ() throws Throwable {
        Object obj;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = contextLIZ.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (!(obj instanceof Application)) {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(th.getMessage());
                    sbLIZ2.append(":");
                    sbLIZ2.append(C08RN.LIZJ());
                    sbLIZ2.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ2));
                }
                applicationContext = ((Application) obj).getApplicationContext();
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Application context obtained through ActivityThread: ");
                sbLIZ3.append(applicationContext);
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                if (applicationContext != null) {
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                }
                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                sbLIZ22.append(th.getMessage());
                sbLIZ22.append(":");
                sbLIZ22.append(C08RN.LIZJ());
                sbLIZ22.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ22));
            }
            file = C786450Ut9.LIZJ;
        }
        C0VSJ c0vsj = new C0VSJ(file, "fansmilestone");
        C2354709Kn.LJI(c0vsj);
        return c0vsj;
    }

    public static void LIZ(File file) {
        File[] fileArrListFiles;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LIZ(file2);
                    file2.delete();
                } else if (file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    public C1444460ngy(PostConfigModel postConfigModel, Fragment fragment, C19EG c19eg) {
        this.LIZ = postConfigModel;
        this.LIZIZ = fragment;
        this.LIZJ = c19eg;
    }

    public final boolean LIZJ(int i, String str, String str2, String str3, String str4) {
        C1444350ngn c1444350ngnLIZIZ;
        Map<String, String> map;
        PublishParams publishParams;
        List<String> list;
        PublishParams publishParams2;
        List<C1444390ngr> list2;
        if (str2 != null) {
            String str5 = null;
            if (!TextUtils.isEmpty(str2)) {
                ArrayList arrayList = new ArrayList();
                PostConfigModel postConfigModel = this.LIZ;
                if (postConfigModel != null && (publishParams2 = postConfigModel.publishParams) != null && (list2 = publishParams2.userTags) != null) {
                    for (C1444390ngr c1444390ngr : list2) {
                        arrayList.add(new C1444390ngr(0, c1444390ngr.LIZIZ, c1444390ngr.LIZJ, c1444390ngr.LIZLLL));
                    }
                }
                PostConfigModel postConfigModel2 = this.LIZ;
                if (postConfigModel2 != null && (publishParams = postConfigModel2.publishParams) != null && (list = publishParams.challenges) != null) {
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C1444390ngr(1, it2.next(), "", ""));
                    }
                }
                ILiveHighLighteningPublisherService iLiveHighLighteningPublisherService = (ILiveHighLighteningPublisherService) PluggableExtentionKt.pluggableSpi$default(ILiveHighLighteningPublisherService.class, false, false, false, 14, null);
                if (iLiveHighLighteningPublisherService != null) {
                    c1444350ngnLIZIZ = iLiveHighLighteningPublisherService.LIZIZ(this.LIZIZ, this.LIZJ, LiveEnableMileStoneHighlightPublishCheckerSetting.INSTANCE.enable());
                } else {
                    c1444350ngnLIZIZ = null;
                }
                this.LJ = c1444350ngnLIZIZ;
                ILiveHighLighteningPublisherService iLiveHighLighteningPublisherService2 = (ILiveHighLighteningPublisherService) PluggableExtentionKt.pluggableSpi$default(ILiveHighLighteningPublisherService.class, false, false, false, 14, null);
                if (iLiveHighLighteningPublisherService2 != null) {
                    Object obj = this.LJ;
                    int i2 = this.LJFF;
                    int i3 = this.LJI;
                    PostConfigModel postConfigModel3 = this.LIZ;
                    if (postConfigModel3 != null) {
                        map = postConfigModel3.reportParams;
                        PublishParams publishParams3 = postConfigModel3.publishParams;
                        if (publishParams3 != null) {
                            str5 = publishParams3.musicId;
                        }
                    } else {
                        map = null;
                    }
                    iLiveHighLighteningPublisherService2.LIZ(obj, str2, str, arrayList, i, i2, i3, map, str3, str4, str5, new C1119460fEm(C1119450fEl.LIZ));
                }
                return true;
            }
        }
        return false;
    }
}
