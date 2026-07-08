package X;

import android.util.Size;
import com.bytedance.ies.nle.editor_jni.NLECompileLevel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0nLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430940nLA extends AbstractC1430950nLB {
    public final /* synthetic */ VideoPublishEditModel LJ;
    public final /* synthetic */ C1432320nNO LJFF;
    public final /* synthetic */ Function2<ImageSynthesisResult, Integer, Unit> LJI;
    public final /* synthetic */ Function1<List<ImageSynthesisResult>, Unit> LJII;
    public final /* synthetic */ C118300cf LJIIIIZZ;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Exception, String, Unit> LJIIIZ;
    public final /* synthetic */ Function1<InterfaceC574560MgA, Object> LJIIJ;
    public final /* synthetic */ Function1<Float, Unit> LJIIJJI;

    @Override // X.AbstractC1430950nLB
    public final void LIZIZ(ImageSynthesisResult imageSynthesisResult) {
        String path;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcImageInfo srcImageInfo;
        List<SingleImageData> imageList2;
        SingleImageData singleImageData2;
        ImageSynthesisResult imageSynthesisResultCopy;
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[canvas] skip compile, result: ");
        sbLIZ.append(imageSynthesisResult);
        c1437510nVlLJJLIIIJ.LIZJ("compile", C2188811AlT.LIZIZ(sbLIZ));
        ImageAlbumData imageAlbumData = this.LJ.getImageAlbumData();
        if (imageAlbumData != null && (imageList2 = imageAlbumData.getImageList()) != null && (singleImageData2 = (SingleImageData) C13LP.LJJJLL(imageList2)) != null) {
            if (C296170BjD.LIZ()) {
                C1432320nNO c1432320nNO = this.LJFF;
                String path2 = imageSynthesisResult.getPath();
                c1432320nNO.getClass();
                imageSynthesisResultCopy = imageSynthesisResult.copy(C1432320nNO.LIZJ(path2), imageSynthesisResult.width, imageSynthesisResult.height, imageSynthesisResult.compileLevel, imageSynthesisResult.key, imageSynthesisResult.duration, imageSynthesisResult.liveVideo, imageSynthesisResult.remoteUri, imageSynthesisResult.watermarkPath);
            } else {
                imageSynthesisResultCopy = imageSynthesisResult;
            }
            singleImageData2.setSynthesisData(imageSynthesisResultCopy);
        }
        ImageAlbumData imageAlbumData2 = this.LJ.getImageAlbumData();
        if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList)) != null && (srcImageInfo = singleImageData.getSrcImageInfo()) != null) {
            path = srcImageInfo.getPath();
        } else {
            path = null;
        }
        imageSynthesisResult.setKey(path);
        Function2<ImageSynthesisResult, Integer, Unit> function2 = this.LJI;
        if (function2 != null) {
            function2.invoke(imageSynthesisResult, 0);
        }
        Function1<List<ImageSynthesisResult>, Unit> function1 = this.LJII;
        if (function1 != null) {
            function1.invoke(Collections.singletonList(imageSynthesisResult));
        }
    }

    @Override // X.InterfaceC574560MgA
    public final void onCompileProgress(float f) {
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[canvas] on compile, progress: ");
        sbLIZ.append(f);
        c1437510nVlLJJLIIIJ.LIZJ("compile", C2188811AlT.LIZIZ(sbLIZ));
        Function1<Float, Unit> function1 = this.LJIIJJI;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430940nLA(final SrcImageInfo srcImageInfo, final Size size, final String str, VideoPublishEditModel videoPublishEditModel, C1432320nNO c1432320nNO, Function2 function2, Function1 function1, C118300cf c118300cf, InterfaceC1631620sYq interfaceC1631620sYq, AwS388S0200000_22 awS388S0200000_22, Function1 function12, final C1434710nRF c1434710nRF) {
        new InterfaceC574560MgA(srcImageInfo, size, str, c1434710nRF) { // from class: X.0nLB
            public final SrcImageInfo LIZ;
            public final Size LIZIZ;
            public final String LIZJ;
            public final Function2<String, Size, ImageSynthesisResult> LIZLLL;

            public abstract void LIZIZ(ImageSynthesisResult imageSynthesisResult);

            @Override // X.InterfaceC574560MgA
            public final void onCompileDone() {
                LIZIZ(new ImageSynthesisResult(this.LIZJ, this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), null, null, null, null, null, null, 504, null));
            }

            {
                this.LIZ = srcImageInfo;
                this.LIZIZ = size;
                this.LIZJ = str;
                this.LIZLLL = c1434710nRF;
            }

            @Override // X.InterfaceC574560MgA
            public final void onCompileError(int i, int i2, float f, String str2) {
                ImageSynthesisResult imageSynthesisResultInvoke;
                String str3 = str2;
                if (i2 == -558) {
                    Function2<String, Size, ImageSynthesisResult> function22 = this.LIZLLL;
                    if (function22 != null && (imageSynthesisResultInvoke = function22.invoke(this.LIZJ, this.LIZIZ)) != null) {
                        LIZIZ(imageSynthesisResultInvoke);
                        return;
                    } else {
                        LIZIZ(new ImageSynthesisResult(this.LIZ.getPath(), this.LIZ.getWidth(), this.LIZ.getHeight(), Integer.valueOf(NLECompileLevel.NLECompileLevelPicUploadDirectly.swigValue()), null, null, null, null, null, 496, null));
                        return;
                    }
                }
                C1430940nLA c1430940nLA = (C1430940nLA) this;
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[canvas] compile failed, failedCount: ");
                sbLIZ.append(c1430940nLA.LJIIIIZZ.element);
                sbLIZ.append(", error: ");
                sbLIZ.append(i);
                sbLIZ.append(", ext: ");
                sbLIZ.append(i2);
                sbLIZ.append(", f: ");
                sbLIZ.append(f);
                sbLIZ.append(", msg: ");
                sbLIZ.append(str3);
                c1437510nVlLJJLIIIJ.LIZJ("compile", C2188811AlT.LIZIZ(sbLIZ));
                if (c1430940nLA.LJIIIIZZ.element >= 0) {
                    C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZJ("compile", "[canvas] compile failed, retry to max count");
                    c1430940nLA.LJFF.LIZIZ();
                    InterfaceC1631620sYq<Integer, Exception, String, Unit> interfaceC1631620sYq2 = c1430940nLA.LJIIIZ;
                    if (interfaceC1631620sYq2 != null) {
                        Integer numValueOf = Integer.valueOf(i);
                        if (str3 == null) {
                            str3 = "";
                        }
                        interfaceC1631620sYq2.invoke(numValueOf, null, str3);
                        return;
                    }
                    return;
                }
                if (C0C2U.LIZ(Integer.valueOf(i))) {
                    c1430940nLA.LJIIIIZZ.element++;
                    c1430940nLA.LJIIJ.invoke(c1430940nLA);
                    return;
                }
                C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[canvas] compile failed, error code(");
                sbLIZ2.append(i);
                sbLIZ2.append(") is not in allow list");
                c1437510nVlLJJLIIIJ2.LIZJ("compile", C2188811AlT.LIZIZ(sbLIZ2));
                c1430940nLA.LJFF.LIZIZ();
                InterfaceC1631620sYq<Integer, Exception, String, Unit> interfaceC1631620sYq3 = c1430940nLA.LJIIIZ;
                if (interfaceC1631620sYq3 == null) {
                    return;
                }
                Integer numValueOf2 = Integer.valueOf(i);
                if (str3 == null) {
                    str3 = "";
                }
                interfaceC1631620sYq3.invoke(numValueOf2, null, str3);
            }
        };
        this.LJ = videoPublishEditModel;
        this.LJFF = c1432320nNO;
        this.LJI = function2;
        this.LJII = function1;
        this.LJIIIIZZ = c118300cf;
        this.LJIIIZ = interfaceC1631620sYq;
        this.LJIIJ = awS388S0200000_22;
        this.LJIIJJI = function12;
    }
}
