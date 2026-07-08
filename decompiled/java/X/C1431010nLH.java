package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageLivePhotoModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nLH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.ImageGroupWaveCompileTask$handleSaveLocal$1", f = "ImageGroupWaveCompileTask.kt", l = {440}, m = "invokeSuspend")
public final class C1431010nLH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1431100nLQ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ List<PublishImageModel> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431010nLH(C1431100nLQ c1431100nLQ, boolean z, List<PublishImageModel> list, InterfaceC1364105Vn<? super C1431010nLH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1431100nLQ;
        this.LLILLL = z;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1431010nLH(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> imageModeLocalPaths;
        String str;
        String str2;
        C1C7U.LIZ("ImageGroupWaveCompileTask@9fd4.handleSaveLocal$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        InterfaceC1431080nLO interfaceC1431080nLO = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C140D c140d = C140D.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI.LLJILJIL;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            this.LL = 1;
            if (c140d.LJJJI(videoPublishEditModel, false, this) == objLJFF) {
                C1C7U.LIZIZ("ImageGroupWaveCompileTask@9fd4.handleSaveLocal$1");
                return objLJFF;
            }
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLILLJJLI.LLJILJIL;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        if (!videoPublishEditModel2.isSaveLocal()) {
            this.LLILLJJLI.LLJ = true;
            InterfaceC1431080nLO interfaceC1431080nLO2 = this.LLILLJJLI.LLJILJILJ;
            if (interfaceC1431080nLO2 == null) {
                interfaceC1431080nLO2 = null;
            }
            interfaceC1431080nLO2.LIZ(new C1411860mqO(1.0f), EnumC2251001D8o.OUTER);
            C1431100nLQ c1431100nLQ = this.LLILLJJLI;
            c1431100nLQ.LJIL(c1431100nLQ.LJIIZILJ(), this.LLILLL);
        } else {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("upload", "image handleSaveLocal");
            final C1431100nLQ c1431100nLQ2 = this.LLILLJJLI;
            final List<PublishImageModel> list = this.LLILZ;
            final SynthetiseResult synthetiseResultLJIIZILJ = c1431100nLQ2.LJIIZILJ();
            final boolean z = this.LLILLL;
            if (c1431100nLQ2.LJJIFFI()) {
                if (!C295670BiP.LIZ()) {
                    VideoPublishEditModel videoPublishEditModel3 = c1431100nLQ2.LLJILJIL;
                    if (videoPublishEditModel3 == null) {
                        videoPublishEditModel3 = null;
                    }
                    AVUploadSaveModel saveModel = videoPublishEditModel3.getSaveModel();
                    if (saveModel != null) {
                        SaveLocalHelper saveLocalHelper = SaveLocalHelper.LIZ;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<PublishImageModel> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().path);
                        }
                        VideoPublishEditModel videoPublishEditModel4 = c1431100nLQ2.LLJILJIL;
                        if (videoPublishEditModel4 == null) {
                            videoPublishEditModel4 = null;
                        }
                        saveLocalHelper.getClass();
                        saveModel.setImageModeLocalPaths(SaveLocalHelper.LIZJ(videoPublishEditModel4, arrayList, false));
                    }
                } else {
                    VideoPublishEditModel videoPublishEditModel5 = c1431100nLQ2.LLJILJIL;
                    if (videoPublishEditModel5 == null) {
                        videoPublishEditModel5 = null;
                    }
                    AVUploadSaveModel saveModel2 = videoPublishEditModel5.getSaveModel();
                    if (saveModel2 != null) {
                        SaveLocalHelper saveLocalHelper2 = SaveLocalHelper.LIZ;
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<PublishImageModel> it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(it3.next().path);
                        }
                        VideoPublishEditModel videoPublishEditModel6 = c1431100nLQ2.LLJILJIL;
                        if (videoPublishEditModel6 == null) {
                            videoPublishEditModel6 = null;
                        }
                        saveLocalHelper2.getClass();
                        saveModel2.setImageModeLocalPaths(SaveLocalHelper.LIZJ(videoPublishEditModel6, arrayList2, false));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (PublishImageModel publishImageModel : list) {
                        PublishImageLivePhotoModel publishImageLivePhotoModel = publishImageModel.publishImageLivePhotoModel;
                        if (publishImageLivePhotoModel != null && publishImageLivePhotoModel.path != null && publishImageLivePhotoModel != null && (str2 = publishImageLivePhotoModel.path) != null && C1428270nGr.LIZ(str2)) {
                            arrayList3.add(publishImageModel);
                        }
                    }
                    SaveLocalHelper saveLocalHelper3 = SaveLocalHelper.LIZ;
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        PublishImageLivePhotoModel publishImageLivePhotoModel2 = ((PublishImageModel) it4.next()).publishImageLivePhotoModel;
                        if (publishImageLivePhotoModel2 == null || (str = publishImageLivePhotoModel2.path) == null) {
                            str = "";
                        }
                        arrayList4.add(str);
                    }
                    VideoPublishEditModel videoPublishEditModel7 = c1431100nLQ2.LLJILJIL;
                    if (videoPublishEditModel7 == null) {
                        videoPublishEditModel7 = null;
                    }
                    saveLocalHelper3.getClass();
                    List listLIZJ = SaveLocalHelper.LIZJ(videoPublishEditModel7, arrayList4, true);
                    if (!((ArrayList) listLIZJ).isEmpty()) {
                        VideoPublishEditModel videoPublishEditModel8 = c1431100nLQ2.LLJILJIL;
                        if (videoPublishEditModel8 == null) {
                            videoPublishEditModel8 = null;
                        }
                        AVUploadSaveModel saveModel3 = videoPublishEditModel8.getSaveModel();
                        if (saveModel3 != null && (imageModeLocalPaths = saveModel3.getImageModeLocalPaths()) != null) {
                            imageModeLocalPaths.addAll(listLIZJ);
                        }
                    }
                }
                InterfaceC1431080nLO interfaceC1431080nLO3 = c1431100nLQ2.LLJILJILJ;
                if (interfaceC1431080nLO3 == null) {
                    interfaceC1431080nLO3 = null;
                }
                interfaceC1431080nLO3.LIZ(new C1411860mqO(1.0f), EnumC2251001D8o.OUTER);
                c1431100nLQ2.LLJ = true;
                C1439880nZa c1439880nZa = C1439880nZa.LIZ;
                VideoPublishEditModel videoPublishEditModel9 = c1431100nLQ2.LLJILJIL;
                if (videoPublishEditModel9 == null) {
                    videoPublishEditModel9 = null;
                }
                c1439880nZa.getClass();
                if (C1439880nZa.LIZLLL(videoPublishEditModel9) || c1431100nLQ2.LJIJI()) {
                    VideoPublishEditModel videoPublishEditModel10 = c1431100nLQ2.LLJILJIL;
                    if (videoPublishEditModel10 == null) {
                        videoPublishEditModel10 = null;
                    }
                    c1431100nLQ2.LJIILL(C2489809pI.LIZLLL(videoPublishEditModel10).getPath(), true, list);
                }
                c1431100nLQ2.LJIL(synthetiseResultLJIIZILJ, z);
            } else {
                C15O7.LIZJ(new Callable() { // from class: X.0nLI
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("ImageGroupWaveCompileTask@9fd4.generateImageSaveLocal$3");
                        C1431100nLQ c1431100nLQ3 = c1431100nLQ2;
                        synchronized (c1431100nLQ3.LLJI) {
                            try {
                                if (c1431100nLQ3.LLIZLLLIL) {
                                    c1431100nLQ3.LLJI.wait();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (!c1431100nLQ2.LLJJI) {
                            VideoPublishEditModel videoPublishEditModel11 = c1431100nLQ2.LLJILJIL;
                            if (videoPublishEditModel11 == null) {
                                videoPublishEditModel11 = null;
                            }
                            c1431100nLQ2.LJIILL(C2489809pI.LIZLLL(videoPublishEditModel11).getPath(), false, list);
                            InterfaceC1431080nLO interfaceC1431080nLO4 = c1431100nLQ2.LLJILJILJ;
                            (interfaceC1431080nLO4 != null ? interfaceC1431080nLO4 : null).LIZ(new C1411860mqO(1.0f), EnumC2251001D8o.OUTER);
                            c1431100nLQ2.LLJ = true;
                            c1431100nLQ2.LJIL(synthetiseResultLJIIZILJ, z);
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ImageGroupWaveCompileTask@9fd4.generateImageSaveLocal$3");
                        return unit;
                    }
                });
            }
        }
        if (!this.LLILZ.isEmpty()) {
            InterfaceC1431080nLO interfaceC1431080nLO4 = this.LLILLJJLI.LLJILJILJ;
            if (interfaceC1431080nLO4 != null) {
                interfaceC1431080nLO = interfaceC1431080nLO4;
            }
            interfaceC1431080nLO.LIZ(new C1431030nLJ(((PublishImageModel) ListProtector.get(this.LLILZ, 0)).path), EnumC2251001D8o.OUTER);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageGroupWaveCompileTask@9fd4.handleSaveLocal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
