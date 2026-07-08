package X;

import Y.ARunnableS122S0100000_22;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS24S0002000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0nTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436310nTp {
    public static boolean LIZIZ;
    public static C1436350nTt LIZJ;
    public static long LJI;
    public static WeakReference<Lifecycle> LJII;
    public static InterfaceC1436400nTy LJIIIIZZ;
    public static InterfaceC1436400nTy LJIIIZ;
    public static InterfaceC1436400nTy LJIIJ;
    public static InterfaceC1436400nTy LJIIJJI;
    public static InterfaceC1436400nTy LJIIL;
    public static ARunnableS122S0100000_22 LJIILJJIL;
    public static final C1436310nTp LIZ = new C1436310nTp();
    public static final CopyOnWriteArrayList<Function0<Unit>> LIZLLL = new CopyOnWriteArrayList<>();
    public static final NextLiveData<Boolean> LJ = new NextLiveData<>();
    public static final MutableLiveData<Boolean> LJFF = new MutableLiveData<>(Boolean.FALSE);
    public static final BPEAHandler LJIILIIL = new BPEAHandler(Looper.getMainLooper());
    public static Map<String, String> LJIILL = C2097608Jq.LJ();

    public static C1436390nTx LIZJ(List list) {
        C1436390nTx c1436390nTx = new C1436390nTx();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                SrcLiveVideoInfo srcLiveInfo = ((SingleImageData) obj).getSrcLiveInfo();
                if (srcLiveInfo != null) {
                    int i3 = C1413250msd.LIZ[srcLiveInfo.getLivePhotoPreviewMode().ordinal()];
                    if (i3 == 1) {
                        c1436390nTx.LIZ++;
                    } else if (i3 == 2) {
                        c1436390nTx.LIZIZ++;
                    } else {
                        if (i3 != 3) {
                            throw new C1954807lC();
                        }
                        c1436390nTx.LIZJ++;
                    }
                } else {
                    c1436390nTx.LIZLLL++;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return c1436390nTx;
    }

    public static Object LJFF(InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objLIZJ;
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo("SaveLocalDraftID", 0, null, 6, null), false, false, false, 14));
        if (awemeDraftLJI != null && (objLIZJ = C0CHQ.LIZ().LJI().LIZIZ().LIZJ(new C570330MYl(awemeDraftLJI, new C560950LzJ("save local", "deleteLegacySaveToLocalDraft"), ((Boolean) C0BNH.LIZ.getValue()).booleanValue(), null, null, 116), interfaceC1364105Vn)) == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel) {
        Workspace workspaceLIZ = C1436370nTv.LIZ(videoPublishEditModel);
        videoPublishEditModel.setOutputFile(workspaceLIZ.LJFF().getPath());
        videoPublishEditModel.setParallelUploadOutputFile(workspaceLIZ.LIZLLL().getPath());
    }

    public static void LJII(String str) {
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("edit_save_local_task", str);
    }

    public static final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        int i;
        EditSaveLocalModel editSaveLocalModel = videoPublishEditModel.creativeModel.editSaveLocalModel;
        if (editSaveLocalModel.isFromDMPanel) {
            str = "dm";
        } else {
            str = "save";
        }
        boolean z = editSaveLocalModel.withSaveTypeOption;
        boolean z2 = false;
        if (z && C1428470nHB.LJLIIL(videoPublishEditModel)) {
            i = 1;
        } else {
            i = 0;
        }
        String str2 = "default";
        if (!editSaveLocalModel.isFromQuickPublish && editSaveLocalModel.withSaveTypeOption) {
            str2 = editSaveLocalModel.forceSaveToVideo ? "video" : editSaveLocalModel.isChoosePhotos ? "choose_photo" : "current_photo";
        }
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            z2 = true;
        }
        C1402610mbT.LJJIIJ(videoPublishEditModel, z2, str, Integer.valueOf(z ? 1 : 0), Integer.valueOf(i), str2);
    }

    public static void LJIILIIL(final VideoPublishEditModel videoPublishEditModel) {
        C1436350nTt c1436350nTtLIZ = null;
        C1436350nTt c1436350nTtLIZ2 = null;
        String str = null;
        if (LIZIZ) {
            LJII("compiling so waiting");
            C1436350nTt c1436350nTt = LIZJ;
            if (c1436350nTt != null) {
                c1436350nTtLIZ2 = C1436350nTt.LIZ(c1436350nTt, null, false, null, true, null, 0, 4031);
            }
            LIZJ = c1436350nTtLIZ2;
            return;
        }
        C0CHQ.LIZ().getPublishService().LJJJLL();
        videoPublishEditModel.setSaveModel(C1431870nMf.LJIIJJI(videoPublishEditModel, 1, true, new InterfaceC1436300nTo() { // from class: X.0nUL
            @Override // X.InterfaceC1436300nTo
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1436300nTo
            public final boolean isEnabled() {
                return false;
            }
        }, true));
        AVUploadSaveModel saveModel = videoPublishEditModel.getSaveModel();
        int i = 0;
        if (saveModel != null) {
            saveModel.setWaterMark(false);
        }
        AVUploadSaveModel saveModel2 = videoPublishEditModel.getSaveModel();
        if (saveModel2 != null) {
            saveModel2.setSaveToAlbum(true);
        }
        C569390MUv.LIZJ(C1438710nXh.LIZIZ(videoPublishEditModel), new C1438680nXe(videoPublishEditModel), EnumC569430MUz.EDIT, EnumC569430MUz.SEND_REQUEST);
        Bundle bundle = new Bundle();
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            i = 11;
        }
        bundle.putInt("video_type", i);
        C786410Ut5.LJJIZ(bundle, "extra_video_publish_args", videoPublishEditModel);
        C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", -1);
        bundle.putInt("pre_publish_type", 2);
        bundle.putBoolean("isEditSave", true);
        LJII("start publisher");
        AbstractC1433570nPP abstractC1433570nPP = new AbstractC1433570nPP() { // from class: X.0nTr
            @Override // X.AbstractC1433570nPP
            public final void onProgress(int i2, Object obj) {
                C1436350nTt c1436350nTtLIZ3;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                C1436310nTp.LIZ.getClass();
                C1436350nTt c1436350nTt2 = C1436310nTp.LIZJ;
                if (c1436350nTt2 != null) {
                    c1436350nTtLIZ3 = C1436350nTt.LIZ(c1436350nTt2, null, false, null, false, null, i2, 2047);
                } else {
                    c1436350nTtLIZ3 = null;
                }
                C1436310nTp.LIZJ = c1436350nTtLIZ3;
                InterfaceC1436400nTy interfaceC1436400nTy = C1436310nTp.LJIIIIZZ;
                String str7 = "";
                if (interfaceC1436400nTy != null) {
                    C1436350nTt c1436350nTt3 = C1436310nTp.LIZJ;
                    if (c1436350nTt3 == null || (str6 = c1436350nTt3.LIZJ) == null) {
                        str6 = "";
                    }
                    interfaceC1436400nTy.z8(i2, str6);
                }
                InterfaceC1436400nTy interfaceC1436400nTy2 = C1436310nTp.LJIIIZ;
                if (interfaceC1436400nTy2 != null) {
                    C1436350nTt c1436350nTt4 = C1436310nTp.LIZJ;
                    if (c1436350nTt4 == null || (str5 = c1436350nTt4.LIZJ) == null) {
                        str5 = "";
                    }
                    interfaceC1436400nTy2.z8(i2, str5);
                }
                InterfaceC1436400nTy interfaceC1436400nTy3 = C1436310nTp.LJIIJJI;
                if (interfaceC1436400nTy3 != null) {
                    C1436350nTt c1436350nTt5 = C1436310nTp.LIZJ;
                    if (c1436350nTt5 == null || (str4 = c1436350nTt5.LIZJ) == null) {
                        str4 = "";
                    }
                    interfaceC1436400nTy3.z8(i2, str4);
                }
                InterfaceC1436400nTy interfaceC1436400nTy4 = C1436310nTp.LJIIL;
                if (interfaceC1436400nTy4 != null) {
                    C1436350nTt c1436350nTt6 = C1436310nTp.LIZJ;
                    if (c1436350nTt6 == null || (str3 = c1436350nTt6.LIZJ) == null) {
                        str3 = "";
                    }
                    interfaceC1436400nTy4.z8(i2, str3);
                }
                InterfaceC1436400nTy interfaceC1436400nTy5 = C1436310nTp.LJIIJ;
                if (interfaceC1436400nTy5 != null) {
                    C1436350nTt c1436350nTt7 = C1436310nTp.LIZJ;
                    if (c1436350nTt7 != null && (str2 = c1436350nTt7.LIZJ) != null) {
                        str7 = str2;
                    }
                    interfaceC1436400nTy5.z8(i2, str7);
                }
                ARunnableS122S0100000_22 aRunnableS122S0100000_22 = C1436310nTp.LJIILJJIL;
                if (aRunnableS122S0100000_22 != null) {
                    C1436310nTp.LJIILIIL.removeCallbacks(aRunnableS122S0100000_22);
                }
                ARunnableS122S0100000_22 aRunnableS122S0100000_222 = new ARunnableS122S0100000_22(this, 6);
                C786410Ut5.LJLIIL(1000L, C1436310nTp.LJIILIIL, aRunnableS122S0100000_222);
                C1436310nTp.LJIILJJIL = aRunnableS122S0100000_222;
            }

            @Override // X.AbstractC1433570nPP
            public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SaveLocalWithWatermark -> EditPageSaveLocalController -> onFinish, flowId = ");
                C1436310nTp c1436310nTp = C1436310nTp.LIZ;
                c1436310nTp.getClass();
                C1436350nTt c1436350nTt2 = C1436310nTp.LIZJ;
                if (c1436350nTt2 != null) {
                    str2 = c1436350nTt2.LIZJ;
                } else {
                    str2 = null;
                }
                sbLIZ.append(str2);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                ARunnableS122S0100000_22 aRunnableS122S0100000_22 = C1436310nTp.LJIILJJIL;
                if (aRunnableS122S0100000_22 != null) {
                    C1436310nTp.LJIILIIL.removeCallbacks(aRunnableS122S0100000_22);
                }
                InterfaceC1436400nTy interfaceC1436400nTy = C1436310nTp.LJIIIIZZ;
                String str8 = "";
                if (interfaceC1436400nTy != null) {
                    C1436350nTt c1436350nTt3 = C1436310nTp.LIZJ;
                    if (c1436350nTt3 == null || (str7 = c1436350nTt3.LIZJ) == null) {
                        str7 = "";
                    }
                    interfaceC1436400nTy.LJJJLIIL(str7);
                }
                InterfaceC1436400nTy interfaceC1436400nTy2 = C1436310nTp.LJIIIZ;
                if (interfaceC1436400nTy2 != null) {
                    C1436350nTt c1436350nTt4 = C1436310nTp.LIZJ;
                    if (c1436350nTt4 == null || (str6 = c1436350nTt4.LIZJ) == null) {
                        str6 = "";
                    }
                    interfaceC1436400nTy2.LJJJLIIL(str6);
                }
                InterfaceC1436400nTy interfaceC1436400nTy3 = C1436310nTp.LJIIJJI;
                if (interfaceC1436400nTy3 != null) {
                    C1436350nTt c1436350nTt5 = C1436310nTp.LIZJ;
                    if (c1436350nTt5 == null || (str5 = c1436350nTt5.LIZJ) == null) {
                        str5 = "";
                    }
                    interfaceC1436400nTy3.LJJJLIIL(str5);
                }
                InterfaceC1436400nTy interfaceC1436400nTy4 = C1436310nTp.LJIIL;
                if (interfaceC1436400nTy4 != null) {
                    C1436350nTt c1436350nTt6 = C1436310nTp.LIZJ;
                    if (c1436350nTt6 == null || (str4 = c1436350nTt6.LIZJ) == null) {
                        str4 = "";
                    }
                    interfaceC1436400nTy4.LJJJLIIL(str4);
                }
                InterfaceC1436400nTy interfaceC1436400nTy5 = C1436310nTp.LJIIJ;
                if (interfaceC1436400nTy5 != null) {
                    C1436350nTt c1436350nTt7 = C1436310nTp.LIZJ;
                    if (c1436350nTt7 != null && (str3 = c1436350nTt7.LIZJ) != null) {
                        str8 = str3;
                    }
                    interfaceC1436400nTy5.LJJJLIIL(str8);
                }
                c1436310nTp.LJIIL(videoPublishEditModel, abstractC1433460nPE);
            }
        };
        C1436350nTt c1436350nTt2 = LIZJ;
        if (c1436350nTt2 != null) {
            C1433730nPf c1433730nPf = C1433730nPf.LIZ;
            PublishModel publishModelLIZ = C1433610nPT.LIZ(bundle);
            c1433730nPf.getClass();
            C1433500nPI c1433500nPILJI = C1433730nPf.LJI(publishModelLIZ);
            c1433500nPILJI.LJZI(abstractC1433570nPP);
            if (C1433730nPf.LIZLLL.LIZ(c1433500nPILJI.LLILZIL)) {
                C1433730nPf.LJI.execute(c1433500nPILJI);
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PublishScheduler -> SaveLocalWithWatermark | startSaveLocalPublish creationId:");
                sbLIZ.append(publishModelLIZ.creationId);
                sbLIZ.append(" publishId:");
                sbLIZ.append(c1433500nPILJI.LLILZIL.LIZIZ);
                C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
                str = c1433500nPILJI.LLILZIL.LIZIZ;
            }
            c1436350nTtLIZ = C1436350nTt.LIZ(c1436350nTt2, str, false, null, false, null, 0, 4093);
        }
        LIZJ = c1436350nTtLIZ;
    }

    public final void LIZ(String str) {
        String str2;
        String str3;
        String str4;
        C1436350nTt c1436350nTt = LIZJ;
        String str5 = null;
        if (c1436350nTt != null) {
            str2 = c1436350nTt.LIZJ;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            C1436350nTt c1436350nTt2 = LIZJ;
            if (c1436350nTt2 != null) {
                str4 = c1436350nTt2.LIZJ;
            } else {
                str4 = null;
            }
            if (C123100dR.LIZ(str4) && Intrinsics.LJFF(LJFF.getValue(), Boolean.TRUE)) {
                LIZIZ(false);
                return;
            }
        }
        if (!Intrinsics.LJFF(LJFF.getValue(), Boolean.TRUE)) {
            return;
        }
        C1436350nTt c1436350nTt3 = LIZJ;
        if (c1436350nTt3 != null) {
            str3 = c1436350nTt3.LIZJ;
        } else {
            str3 = null;
        }
        if (!Intrinsics.LJFF(str, str3)) {
            return;
        }
        C1436350nTt c1436350nTt4 = LIZJ;
        if (c1436350nTt4 != null) {
            str5 = c1436350nTt4.LIZJ;
        }
        if (!C123100dR.LIZ(str5)) {
            return;
        }
        LIZIZ(true);
    }

    public final void LIZIZ(boolean z) {
        String str;
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG;
        C1433500nPI c1433500nPI;
        C1430790nKv c1430790nKv;
        VideoPublishEditModel videoPublishEditModel;
        long j;
        C1436350nTt c1436350nTt = LIZJ;
        C1436350nTt c1436350nTtLIZ = null;
        if (c1436350nTt != null && (str = c1436350nTt.LIZIZ) != null && str.length() != 0) {
            C1433530nPL c1433530nPLLIZLLL = C1433730nPf.LIZLLL.LIZLLL(str);
            if (c1433530nPLLIZLLL != null) {
                interfaceRunnableC1433480nPG = c1433530nPLLIZLLL.LJI;
            } else {
                interfaceRunnableC1433480nPG = null;
            }
            if ((interfaceRunnableC1433480nPG instanceof C1433500nPI) && (c1433500nPI = (C1433500nPI) interfaceRunnableC1433480nPG) != null && (c1430790nKv = c1433500nPI.LLJILJIL) != null && c1430790nKv.LIZ()) {
                if (c1433500nPI != null) {
                    C1433700nPc c1433700nPc = new C1433700nPc();
                    c1433700nPc.LIZ = "cancel_edit_page_save";
                    c1433500nPI.LJIILL(c1433700nPc.LIZ());
                }
                LJII("canceled edit save task");
                C1436350nTt c1436350nTt2 = LIZJ;
                if (c1436350nTt2 != null) {
                    videoPublishEditModel = c1436350nTt2.LJ;
                } else {
                    videoPublishEditModel = null;
                }
                if (c1436350nTt2 != null) {
                    j = c1436350nTt2.LJIIJ;
                } else {
                    j = 0;
                }
                getClass();
                LJIIJ(videoPublishEditModel, "cancel", j, false, null);
            }
            LJFF.postValue(Boolean.FALSE);
            C1436350nTt c1436350nTt3 = LIZJ;
            if (c1436350nTt3 != null) {
                c1436350nTtLIZ = C1436350nTt.LIZ(c1436350nTt3, null, false, null, z, null, 0, 4031);
            }
            LIZJ = c1436350nTtLIZ;
        }
    }

    public static void LIZLLL(int i, int i2) {
        List<Fragment> listLJJLIIIJL;
        Activity activityLIZIZ;
        Dialog dialog;
        FragmentManager fragmentManagerLJ;
        try {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ == null || (fragmentManagerLJ = abstractC1387200mCcLJ.LJ()) == null || (listLJJLIIIJL = fragmentManagerLJ.LJJLIIIJL()) == null) {
                listLJJLIIIJL = C13BV.INSTANCE;
            }
            boolean z = false;
            for (Fragment fragment : listLJJLIIIJL) {
                if ((fragment instanceof BaseSheet) && (dialog = ((BaseSheet) fragment).getDialog()) != null && dialog.isShowing()) {
                    Dialog dialog2 = ((BaseSheet) fragment).getDialog();
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(i);
                    creativeToastBuilder.acrossActivities(true);
                    C1390380mHk.LIZIZ(dialog2, i2, creativeToastBuilder);
                    z = true;
                }
            }
            if (!z && abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(i);
                creativeToastBuilder2.acrossActivities(true);
                C1390380mHk.LIZJ(activityLIZIZ, i2, creativeToastBuilder2);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJ(int i, int i2) {
        C0CNO.LIZLLL(0L, new AwS24S0002000_22(i, i2, 0));
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel, int i) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LIZ(C1428470nHB.LJJZZI(videoPublishEditModel) ? 1 : 0, "is_image_album");
        c0lab.LIZ(i, "error_code");
        C20684815ws.LJIILLIIL("click_save_local_error", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[PHI: r1
      0x002c: PHI (r1v4 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:11:0x0025, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(androidx.lifecycle.Lifecycle r1, X.InterfaceC1436400nTy r2) {
        /*
            X.C1436310nTp.LJIIIIZZ = r2
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            X.C1436310nTp.LJII = r0
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = X.C1436310nTp.LJFF
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2b
            X.0nTy r2 = X.C1436310nTp.LJIIIIZZ
            if (r2 == 0) goto L2b
            X.0nTt r0 = X.C1436310nTp.LIZJ
            if (r0 == 0) goto L23
            java.lang.String r1 = r0.LIZJ
            if (r1 != 0) goto L2c
        L23:
            java.lang.String r1 = ""
            if (r0 != 0) goto L2c
            r0 = 0
        L28:
            r2.e4(r0, r1)
        L2b:
            return
        L2c:
            int r0 = r0.LJIIJJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1436310nTp.LJIILL(androidx.lifecycle.Lifecycle, X.0nTy):void");
    }

    public final void LJIIL(VideoPublishEditModel videoPublishEditModel, Object obj) {
        int i;
        String str;
        C1436620nUK c1436620nUK;
        C1435220nS4 c1435220nS4;
        Throwable th;
        long j = 0;
        if (obj instanceof C492390JSr) {
            C1436350nTt c1436350nTt = LIZJ;
            if (c1436350nTt != null) {
                j = c1436350nTt.LJIIJ;
            }
            getClass();
            LJIIJ(videoPublishEditModel, "success", j, false, null);
            LJ.postValue(Boolean.TRUE);
            LJ(2131846807, 1004);
            C1DFB c1dfb = C0PEM.LIZJ;
            C23250099c.LIZLLL(C2296808zG.LIZ(c1dfb), null, null, new C858890Xmh(null), 3);
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "ai_fingerprint_server_switch", true, false)) {
                C1435570nSd c1435570nSd = C1435570nSd.LIZ;
                C054G c054gLIZ = C2296808zG.LIZ(c1dfb);
                c1435570nSd.getClass();
                C23250099c.LIZLLL(c054gLIZ, new C1466920oHC(CoroutineExceptionHandler.LJJLIL, 6), null, new C508601yW("", videoPublishEditModel, null), 2);
            }
            LJFF.postValue(Boolean.FALSE);
            for (Function0<Unit> function0 : LIZLLL) {
                if (function0 != null) {
                    function0.invoke();
                }
            }
            return;
        }
        if (obj instanceof C1433450nPD) {
            if (C1428520nHG.LJIJJLI(videoPublishEditModel) && (th = ((C1433450nPD) obj).LIZ.LIZLLL) != null && (((th instanceof C1435220nS4) && (((C1435220nS4) th).getT() instanceof C1900607cS)) || (th instanceof C1900607cS))) {
                LJ(2131846767, 1003);
            } else {
                C1433450nPD c1433450nPD = (C1433450nPD) obj;
                Throwable cause = c1433450nPD.LIZ.LIZLLL;
                while (true) {
                    if (cause == null) {
                        break;
                    }
                    if (cause instanceof C1433670nPZ) {
                        if (((C1433670nPZ) cause).getCode() == 100101) {
                            LJ(2131830703, 1003);
                        }
                    } else {
                        cause = cause.getCause();
                    }
                }
                if (Intrinsics.LJFF(c1433450nPD.LIZ.LIZIZ, EnumC1434770nRL.AIGC_AUTH.toString())) {
                    int i2 = c1433450nPD.LIZ.LJFF;
                    if (i2 == 706713) {
                        i = 2131846054;
                    } else if (i2 == 706714) {
                        i = 2131846055;
                    } else if (i2 == 706711) {
                        i = 2131826120;
                    } else if (i2 == 706712) {
                        i = 2131826121;
                    } else {
                        i = 2131826227;
                    }
                    C1436350nTt c1436350nTt2 = LIZJ;
                    if (c1436350nTt2 != null) {
                        str = c1436350nTt2.LIZ;
                    } else {
                        str = null;
                    }
                    C548590LfN.LIZ.getClass();
                    C548590LfN.LIZIZ().LJFF(videoPublishEditModel.creativeModel, c1433450nPD.LIZ.LJFF, str);
                    LJ(i, 1003);
                }
            }
            Throwable th2 = ((C1433450nPD) obj).LIZ.LIZLLL;
            if ((th2 instanceof C1435220nS4) && (c1435220nS4 = (C1435220nS4) th2) != null) {
                c1436620nUK = new C1436620nUK(c1435220nS4.getCode(), c1435220nS4.getExtraMsg());
            } else {
                c1436620nUK = new C1436620nUK(-1, null);
            }
            C1436350nTt c1436350nTt3 = LIZJ;
            if (c1436350nTt3 != null) {
                j = c1436350nTt3.LJIIJ;
            }
            getClass();
            LJIIJ(videoPublishEditModel, "fail", j, false, c1436620nUK);
            NextLiveData<Boolean> nextLiveData = LJ;
            Boolean bool = Boolean.FALSE;
            nextLiveData.postValue(bool);
            LJFF.postValue(bool);
        }
    }

    public static void LJIIJ(VideoPublishEditModel videoPublishEditModel, String str, long j, boolean z, C1436620nUK c1436620nUK) {
        String creationId;
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        SingleImageData singleImageData;
        SrcLiveVideoInfo srcLiveInfo;
        List<SingleImageData> imageList3;
        Integer numValueOf;
        if (videoPublishEditModel == null) {
            return;
        }
        String str2 = null;
        if (Intrinsics.LJFF(videoPublishEditModel.getCreationId(), "SaveLocalDraftID")) {
            C1436350nTt c1436350nTt = LIZJ;
            if (c1436350nTt != null) {
                creationId = c1436350nTt.LIZ;
            } else {
                creationId = null;
            }
        } else {
            creationId = videoPublishEditModel.getCreationId();
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LIZ(C1428470nHB.LJJZZI(videoPublishEditModel) ? 1 : 0, "is_image_album");
        c0lab.LIZ(z ? 1 : 0, "is_copy_draft");
        c0lab.LJ("event", str);
        c0lab.LIZIZ(System.currentTimeMillis() - j, "duration");
        c0lab.LIZ(C1428580nHM.LIZ(videoPublishEditModel.isEnterFromDM()) ? 1 : 0, "need_tns_review");
        LIZ.getClass();
        if (C1428470nHB.LJJZZI(videoPublishEditModel) || (C295810Bid.LIZ() && C0MUK.LIZLLL(videoPublishEditModel.creativeModel))) {
            for (Map.Entry<String, String> entry : LJIILL.entrySet()) {
                c0lab.LJ(entry.getKey(), entry.getValue());
            }
            EditSaveLocalModel editSaveLocalModel = videoPublishEditModel.creativeModel.editSaveLocalModel;
            if (editSaveLocalModel.forceSaveToVideo) {
                c0lab.LIZ(1, "is_change_to_video");
                ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData == null || (imageList3 = imageAlbumData.getImageList()) == null) {
                    imageList3 = C13BV.INSTANCE;
                }
                C1436390nTx c1436390nTxLIZJ = LIZJ(imageList3);
                c0lab.LIZ(c1436390nTxLIZJ.LIZ + c1436390nTxLIZJ.LIZIZ + c1436390nTxLIZJ.LIZJ + c1436390nTxLIZJ.LIZLLL, "save_pic_cnt");
                c0lab.LIZ(c1436390nTxLIZJ.LIZ, "save_livephoto_live_cnt");
                c0lab.LIZ(c1436390nTxLIZJ.LIZIZ, "save_livephoto_loop_cnt");
                c0lab.LIZ(c1436390nTxLIZJ.LIZJ, "save_livephoto_static_cnt");
                c0lab.LIZ(c1436390nTxLIZJ.LIZLLL, "save_normal_photo_cnt");
            } else if (!editSaveLocalModel.isChoosePhotos) {
                c0lab.LIZ(0, "is_change_to_video");
                c0lab.LIZ(1, "save_pic_cnt");
                ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData2 != null && (imageList2 = imageAlbumData2.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList2)) != null && (srcLiveInfo = singleImageData.getSrcLiveInfo()) != null) {
                    int i = C1413250msd.LIZ[srcLiveInfo.getLivePhotoPreviewMode().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                c0lab.LIZ(1, "save_normal_photo_cnt");
                            } else {
                                c0lab.LIZ(1, "save_livephoto_static_cnt");
                            }
                        } else {
                            c0lab.LIZ(1, "save_livephoto_loop_cnt");
                        }
                    } else {
                        c0lab.LIZ(1, "save_livephoto_live_cnt");
                    }
                }
            } else {
                c0lab.LIZ(0, "is_change_to_video");
                ImageAlbumData imageAlbumData3 = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData3 == null || (imageList = imageAlbumData3.getImageList()) == null) {
                    imageList = C13BV.INSTANCE;
                }
                C1436390nTx c1436390nTxLIZJ2 = LIZJ(imageList);
                c0lab.LIZ(c1436390nTxLIZJ2.LIZ + c1436390nTxLIZJ2.LIZIZ + c1436390nTxLIZJ2.LIZJ + c1436390nTxLIZJ2.LIZLLL, "save_pic_cnt");
                c0lab.LIZ(c1436390nTxLIZJ2.LIZ, "save_livephoto_live_cnt");
                c0lab.LIZ(c1436390nTxLIZJ2.LIZIZ, "save_livephoto_loop_cnt");
                c0lab.LIZ(c1436390nTxLIZJ2.LIZJ, "save_livephoto_static_cnt");
                c0lab.LIZ(c1436390nTxLIZJ2.LIZLLL, "save_normal_photo_cnt");
            }
        }
        if (Intrinsics.LJFF(str, "success")) {
            Integer num = videoPublishEditModel.creativeModel.editSaveLocalModel.moderationResult;
            if (num != null) {
                c0lab.LIZ(num.intValue(), "tns_review_check");
            }
        } else if (Intrinsics.LJFF(str, "fail")) {
            if (c1436620nUK != null) {
                numValueOf = Integer.valueOf(c1436620nUK.LIZ);
            } else {
                numValueOf = null;
            }
            c0lab.LIZLLL(numValueOf, "error_code");
            if (c1436620nUK != null) {
                str2 = c1436620nUK.LIZIZ;
            }
            c0lab.LJ("error_msg", str2);
        }
        C20684815ws.LJIILLIIL("save_local_stage", c0lab.LIZ);
    }

    public static void LJIILJJIL(C1436310nTp c1436310nTp, VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP, boolean z, boolean z2, int i) {
        NLEModel nLEModelDynamicCast;
        NLEModel nLEModelLIZ;
        boolean z3 = z2;
        boolean z4 = z;
        InterfaceC1452170ntP interfaceC1452170ntP2 = interfaceC1452170ntP;
        if ((i & 2) != 0) {
            interfaceC1452170ntP2 = null;
        }
        if ((i & 4) != 0) {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        c1436310nTp.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1436310nTp.getClass();
        LJIIJ(videoPublishEditModel, "start", jCurrentTimeMillis, false, null);
        LJIILL = C1413430msv.LJIIL(videoPublishEditModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click save local, stack: ");
        sbLIZ.append(C13SZ.LIZIZ(new Throwable()));
        LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1452170ntP2 != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP2)) != null) {
            nLEModelDynamicCast = NLEModel.dynamicCast(nLEModelLIZ.deepClone());
        } else {
            nLEModelDynamicCast = null;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1436340nTs(videoPublishEditModel, nLEModelDynamicCast, interfaceC1452170ntP2, z3, z4, null), 3);
    }
}
