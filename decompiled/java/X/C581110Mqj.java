package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import lth.o;

/* JADX INFO: renamed from: X.0Mqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581110Mqj implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<C535020Kya> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.0956] */
    public static final void subscribe$0(C581110Mqj c581110Mqj, InterfaceC2329309At interfaceC2329309At) {
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(": resolve begin: ");
        sbLIZ.append((C535020Kya) c581110Mqj.l0);
        sbLIZ.append(' ');
        C201955140j.LIZLLL(c552700Lm0, "AiEffectCRR", C2188811AlT.LIZIZ(sbLIZ));
        C581270Mqz c581270Mqz = new C581270Mqz(CoroutineExceptionHandler.LJJLIL, (C11KT) interfaceC2329309At, 6);
        ((C259800zU) c581110Mqj.l1).element = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), c581270Mqz, null, new C535760Kzm((C535020Kya) c581110Mqj.l0, (C0LPJ) c581110Mqj.l2, interfaceC2329309At, null), 2);
    }

    public static final void subscribe$1(C581110Mqj c581110Mqj, InterfaceC2329309At interfaceC2329309At) {
        boolean z;
        String path;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcImageInfo srcImageInfo;
        Object c098200Yq;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        Object obj = null;
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C201955140j.LIZIZ("LoadCoverHelper", "VE plugin not installed, load existing cover from draft without re-extract");
            C0MVV.LIZ.getClass();
            AwemeDraft awemeDraftLJIIIIZZ = o.LJIL.LJIIJ().LJIIIIZZ();
            if (awemeDraftLJIIIIZZ == null) {
                interfaceC2329309At.tryOnError(new NullPointerException("draft is null"));
                return;
            }
            new C1438570nXT("CheckPointServiceImpl");
            VideoPublishEditModel videoPublishEditModelLIZJ = C1438570nXT.LIZJ(awemeDraftLJIIIIZZ, false);
            try {
                c098200Yq = C0MH8.LIZ.LJII(videoPublishEditModelLIZJ, -1);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            String str = (String) obj;
            if (str != null && str.length() != 0 && C2286708xd.LIZJ(str)) {
                interfaceC2329309At.onSuccess(C0MVT.LIZIZ(str));
                return;
            }
            String str2 = videoPublishEditModelLIZJ.creativeModel.text2ImageModel.coverPath;
            if (str2 != null && str2.length() != 0 && C2286708xd.LIZJ(str2)) {
                interfaceC2329309At.onSuccess(C0MVT.LIZIZ(str2));
                return;
            }
            String str3 = awemeDraftLJIIIIZZ.LIZ.editorProDraftModel.canvasCoverPath;
            if (str3 != null && str3.length() != 0 && C2286708xd.LIZJ(str3)) {
                interfaceC2329309At.onSuccess(C0MVT.LIZIZ(str3));
                return;
            } else {
                C201955140j.LIZIZ("LoadCoverHelper", "loadExistingCoverFromDraftWithoutVE: no existing cover found in draft");
                interfaceC2329309At.tryOnError(new NullPointerException("no existing cover in draft"));
                return;
            }
        }
        int iLIZ = C1439190nYT.LIZ();
        if (iLIZ != 0 && iLIZ != 3) {
            if (iLIZ != 5) {
                C0MVV c0mvv = C0MVV.LIZ;
                WeakReference weakReference = (WeakReference) c581110Mqj.l1;
                c0mvv.getClass();
                C0MVV.LJ((C11KT) interfaceC2329309At, weakReference);
                return;
            }
            C0MVV c0mvv2 = C0MVV.LIZ;
            WeakReference weakReference2 = (WeakReference) c581110Mqj.l1;
            c0mvv2.getClass();
            AwemeDraft awemeDraftLJIIIIZZ2 = o.LJIL.LJIIJ().LJIIIIZZ();
            if (awemeDraftLJIIIIZZ2 == null) {
                interfaceC2329309At.tryOnError(new NullPointerException());
                return;
            }
            new C1438570nXT("CheckPointServiceImpl");
            VideoPublishEditModel videoPublishEditModelLIZJ2 = C1438570nXT.LIZJ(awemeDraftLJIIIIZZ2, false);
            ImageAlbumData imageAlbumData = videoPublishEditModelLIZJ2.creativeModel.imageAlbumModel;
            if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList)) == null || (srcImageInfo = singleImageData.getSrcImageInfo()) == null || (path = srcImageInfo.getPath()) == null) {
                path = videoPublishEditModelLIZJ2.creativeModel.text2ImageModel.coverPath;
            }
            if (C2286708xd.LIZJ(path)) {
                interfaceC2329309At.onSuccess(C0MVT.LIZIZ(path));
                return;
            } else {
                C0MVV.LJ((C11KT) interfaceC2329309At, weakReference2);
                return;
            }
        }
        C0MVV c0mvv3 = C0MVV.LIZ;
        final RecordScene recordSceneLIZIZ = (RecordScene) c581110Mqj.l0;
        c0mvv3.getClass();
        if (recordSceneLIZIZ == null) {
            recordSceneLIZIZ = C1439190nYT.LIZIZ();
        }
        VERecordData vERecordDataCreate = VERecordData.create(new AbstractC2239611ClD() { // from class: X.0MVM
            @Override // X.AbstractC2239611ClD
            public final String LIZJ() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIIJ(recordSceneLIZIZ.creativeInfo, "", true);
            }

            {
                super("");
            }
        }, false);
        o.LJFF(C2216131BoR.LIZ());
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        VEUtils.getVideoFrames(((VERecordData.VERecordSegmentData) ListProtector.get(vERecordDataCreate.getSegmentData(), 0)).mVideo, new int[]{0}, new InterfaceC1286300jZs() { // from class: X.0MVN
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) throws Throwable {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                C0MVV c0mvv4 = C0MVV.LIZ;
                CreativeInfo creativeInfo = recordSceneLIZIZ.creativeInfo;
                c0mvv4.getClass();
                String strLJJIFFI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIFFI(creativeInfo);
                if (!C2354709Kn.LIZIZ(strLJJIFFI)) {
                    new C0VSJ(strLJJIFFI).mkdirs();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJIFFI);
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append("_cover_img.jpg");
                C0MVV.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1319770kRr.LJ(70, Bitmap.CompressFormat.JPEG, bitmapCreateBitmap, new C0VSJ(C0MVV.LIZIZ));
                C0MVT.LIZIZ(C0MVV.LIZIZ);
                c11kt.onSuccess(C0MVT.LIZIZ(C0MVV.LIZIZ));
                return false;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C581110Mqj(Object obj, RecordScene recordScene, WeakReference<SmartImageView> weakReference, LifecycleOwner lifecycleOwner) {
        this.$t = lifecycleOwner;
        this.l0 = obj;
        this.l1 = recordScene;
        this.l2 = weakReference;
    }
}
