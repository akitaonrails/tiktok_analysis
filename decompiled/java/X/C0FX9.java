package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FX9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX9 implements IFetchEffectListListener {
    public final int $t;
    public Object l0;

    public static final void onFail$2(C0FX9 c0fx9, ExceptionResult exceptionResult) {
    }

    public static final void onFail$3(C0FX9 c0fx9, ExceptionResult exceptionResult) {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                break;
            case 1:
                onFail$1(this, exceptionResult);
                break;
            case 2:
                onFail$2(this, exceptionResult);
                break;
            case 3:
                onFail$3(this, exceptionResult);
                break;
            case 4:
                onFail$4(this, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) throws Throwable {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, list);
                break;
            case 1:
                onSuccess$1(this, list);
                break;
            case 2:
                onSuccess$2(this, list);
                break;
            case 3:
                onSuccess$3(this, list);
                break;
            case 4:
                onSuccess$4(this, list);
                break;
        }
    }

    public C0FX9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(C0FX9 c0fx9, ExceptionResult exceptionResult) {
        ((C0FJU) ((C0FX7) c0fx9.l0).l0).LIZ(C0FJS.DOWNLOAD, exceptionResult);
    }

    public static final void onFail$1(C0FX9 c0fx9, ExceptionResult exceptionResult) {
        Exception runtimeException;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c0fx9.l0;
        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
            runtimeException = new RuntimeException("unknown error");
        }
        C098200Yq c098200Yq = new C098200Yq(runtimeException);
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C189200o6.m2constructorimpl(c189200o6M1boximpl);
        interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
    }

    public static final void onFail$4(C0FX9 c0fx9, ExceptionResult exceptionResult) {
        C0E0S.LIZ.getClass();
        C0E0S.LIZJ();
        C1524705y1.LIZJ(AFwS191S0000000_5.get$arr$(377));
    }

    public static final void onSuccess$0(C0FX9 c0fx9, Object obj) {
        ((C0FJU) ((C0FX7) c0fx9.l0).l0).LIZIZ(C0FJT.DOWNLOADED);
    }

    public static final void onSuccess$1(C0FX9 c0fx9, Object obj) {
        if (obj == null) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c0fx9.l0;
            C098200Yq c098200Yq = new C098200Yq(new RuntimeException("response null"));
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
            C189200o6.m2constructorimpl(c189200o6M1boximpl);
            interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
            return;
        }
        InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c0fx9.l0;
        C189200o6.m2constructorimpl(obj);
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(obj);
        C189200o6.m2constructorimpl(c189200o6M1boximpl2);
        interfaceC1364105Vn2.resumeWith(c189200o6M1boximpl2);
    }

    public static final void onSuccess$2(C0FX9 c0fx9, Object obj) throws Throwable {
        InterfaceC353240Dt4 interfaceC353240Dt4Ie;
        File fileLJFF;
        String path;
        C0E48 c0e48 = (C0E48) c0fx9.l0;
        for (Effect effect : (List) obj) {
            if (Intrinsics.LJFF(effect.getResourceId(), "7488302528199660033")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cutout_alg_model");
                String str = File.separator;
                sbLIZ.append(str);
                sbLIZ.append("saliency_matting");
                sbLIZ.append(str);
                C0VSJ c0vsjLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.CUTOUT, C2188811AlT.LIZIZ(sbLIZ), true);
                String path2 = c0vsjLJIIJ.getPath();
                File[] fileArrListFiles = c0vsjLJIIJ.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    String unzipPath = effect.getUnzipPath();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(path2);
                    sbLIZ2.append(str);
                    C2286708xd.LJ(unzipPath, C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (c0e48 != null && (interfaceC353240Dt4Ie = c0e48.Ie()) != null && (fileLJFF = interfaceC353240Dt4Ie.LJFF()) != null && (path = fileLJFF.getPath()) != null) {
                    C354090DuR.LIZJ = path;
                    C354090DuR.LJII.storeString("ep_video_cutout_res_inner_path", path);
                    if (c0e48 != null) {
                        c0e48.S7().LIZIZ(Boolean.TRUE, "editing_matting_task_ready", false);
                    }
                }
            }
        }
    }

    public static final void onSuccess$3(C0FX9 c0fx9, Object obj) {
        for (Effect effect : (List) obj) {
            if (Intrinsics.LJFF(effect.getResourceId(), "7301210488958882306")) {
                if (!((Boolean) C284660BDs.LIZ.getValue()).booleanValue()) {
                    CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
                    String unzipPath = effect.getUnzipPath();
                    C354090DuR.LIZJ = unzipPath;
                    C354090DuR.LJII.storeString("ep_video_cutout_res_inner_path", unzipPath);
                }
            } else if (Intrinsics.LJFF(effect.getResourceId(), "7328289135402160641")) {
                CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet2 = C354090DuR.LIZ;
                String unzipPath2 = effect.getUnzipPath();
                C354090DuR.LIZLLL = unzipPath2;
                C354090DuR.LJII.storeString("ep_video_cutout_res_blend_path", unzipPath2);
            }
        }
        if (!((Boolean) C284660BDs.LIZ.getValue()).booleanValue()) {
            C0E48 c0e48 = (C0E48) c0fx9.l0;
            if (c0e48 != null) {
                c0e48.S7().LIZIZ(Boolean.TRUE, "editing_matting_task_ready", false);
                return;
            }
            return;
        }
        if (C301700Bs8.LIZ()) {
            return;
        }
        C569610MVr.LIZIZ().LJIIJ(C1697810uHb.LJ("7488302528199660033"), "editor_pro_cutout", true, new C0FX9((C0E48) c0fx9.l0, 2));
    }

    public static final void onSuccess$4(C0FX9 c0fx9, Object obj) throws Throwable {
        String path;
        File fileLJFF;
        C0E48 c0e48 = (C0E48) c0fx9.l0;
        for (Effect effect : (List) obj) {
            String resourceId = effect.getResourceId();
            if (Intrinsics.LJFF(resourceId, "7301210488958882306")) {
                InterfaceC353240Dt4 interfaceC353240Dt4Ie = c0e48.Ie();
                if (interfaceC353240Dt4Ie == null || (fileLJFF = interfaceC353240Dt4Ie.LJFF()) == null || (path = fileLJFF.getPath()) == null) {
                    path = "";
                }
                String unzipPath = effect.getUnzipPath();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(path);
                sbLIZ.append(File.separator);
                C2286708xd.LJ(unzipPath, C2188811AlT.LIZIZ(sbLIZ));
                C354090DuR.LIZJ = path;
                C354090DuR.LJII.storeString("ep_video_cutout_res_inner_path", path);
            } else if (Intrinsics.LJFF(resourceId, "7328289135402160641")) {
                CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
                String unzipPath2 = effect.getUnzipPath();
                C354090DuR.LIZLLL = unzipPath2;
                C354090DuR.LJII.storeString("ep_video_cutout_res_blend_path", unzipPath2);
            }
        }
        C569610MVr.LIZIZ().LJIIJ(C1697810uHb.LJ("7488302528199660033", "7550959958905328144", "7550979354717590017"), "editor_pro_cutout", true, new IFetchEffectListListener() { // from class: X.0DtW
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                C0E0S.LIZ.getClass();
                C0E0S.LIZJ();
                C1524705y1.LIZJ(AFwS191S0000000_5.get$arr$(378));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list) throws Throwable {
                for (Effect effect2 : list) {
                    String resourceId2 = effect2.getResourceId();
                    int iHashCode = resourceId2.hashCode();
                    if (iHashCode != -2059524994) {
                        if (iHashCode != -1251423154) {
                            if (iHashCode == -157841641 && resourceId2.equals("7550979354717590017")) {
                                CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet2 = C354090DuR.LIZ;
                                String unzipPath3 = effect2.getUnzipPath();
                                C354090DuR.LJ = unzipPath3;
                                C354090DuR.LJII.storeString("ep_video_cutout_preview_path", unzipPath3);
                            }
                        } else if (resourceId2.equals("7488302528199660033")) {
                            C0E0S.LIZ.getClass();
                            if (Intrinsics.LJFF(effect2.getResourceId(), "7488302528199660033")) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("cutout_alg_model");
                                String str = File.separator;
                                sbLIZ2.append(str);
                                sbLIZ2.append("saliency_matting");
                                sbLIZ2.append(str);
                                C0VSJ c0vsjLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.CUTOUT, C2188811AlT.LIZIZ(sbLIZ2), true);
                                String path2 = c0vsjLJIIJ.getPath();
                                File[] fileArrListFiles = c0vsjLJIIJ.listFiles();
                                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                                    String unzipPath4 = effect2.getUnzipPath();
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(path2);
                                    sbLIZ3.append(str);
                                    C2286708xd.LJ(unzipPath4, C2188811AlT.LIZIZ(sbLIZ3));
                                }
                            }
                        }
                    } else if (resourceId2.equals("7550959958905328144")) {
                        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet3 = C354090DuR.LIZ;
                        String unzipPath5 = effect2.getUnzipPath();
                        C354090DuR.LJFF = unzipPath5;
                        C354090DuR.LJII.storeString("ep_video_mask_preview_path", unzipPath5);
                    }
                }
                C0E0S.LIZ.getClass();
                C0E0S.LIZJ();
                C1524705y1.LIZJ(AFwS191S0000000_5.get$arr$(379));
            }
        });
    }
}
