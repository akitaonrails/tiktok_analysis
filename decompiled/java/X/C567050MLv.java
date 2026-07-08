package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.service.DmtInternalPublishServiceImpl$extractForwardCanvasCoverFallback$1", f = "DmtInternalPublishServiceImpl.kt", l = {346}, m = "invokeSuspend")
public final class C567050MLv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ForwardVideo LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567050MLv(ForwardVideo forwardVideo, String str, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0, InterfaceC1364105Vn<? super C567050MLv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = forwardVideo;
        this.LLILZ = str;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567050MLv c567050MLv = new C567050MLv(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c567050MLv.LLILLJJLI = obj;
        return c567050MLv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        ForwardVideoPlayerCacheProvider forwardVideoPlayerCacheProviderLIZIZ;
        InterfaceC566960MLm storyService;
        Object c098200Yq;
        Object objLIZJ = obj;
        C1C7U.LIZ("DmtInternalPublishServiceImpl@9f14.extractForwardCanvasCoverFallback$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZJ);
            } else {
                C155000ia.LIZIZ(objLIZJ);
                Object obj2 = this.LLILLJJLI;
                int sourceWidth = this.LLILLL.getSourceWidth();
                int sourceHeight = this.LLILLL.getSourceHeight();
                float f = 1.0f;
                if (sourceWidth > 0 && sourceHeight > 0) {
                    float fMin = Math.min(sourceWidth / 256.0f, sourceHeight / 256.0f);
                    if (fMin >= 1.0f) {
                        f = fMin;
                    }
                }
                int i3 = 256;
                if (sourceWidth > 0) {
                    i = (int) (sourceWidth / f);
                } else {
                    i = 256;
                }
                if (sourceHeight > 0) {
                    i3 = (int) (sourceHeight / f);
                }
                String str = this.LLILZ;
                ForwardMedia forwardMedia = new ForwardMedia(null, 0, null, null, null, this.LLILLL, 0.0f, null, null, null, 0L, 0, null, false, null, null, null, null, false, null, null, null, null, null, null, 33554399, null);
                IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null);
                if (iAVServiceProxy != null && (storyService = iAVServiceProxy.getStoryService()) != null) {
                    forwardVideoPlayerCacheProviderLIZIZ = storyService.LIZIZ();
                } else {
                    forwardVideoPlayerCacheProviderLIZIZ = null;
                }
                C567060MLw c567060MLw = new C567060MLw(new C0MN0(str, forwardMedia, i, i3, forwardVideoPlayerCacheProviderLIZIZ), null);
                this.LLILLJJLI = obj2;
                this.LL = 1;
                objLIZJ = C099A.LIZJ(3000L, c567060MLw, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("DmtInternalPublishServiceImpl@9f14.extractForwardCanvasCoverFallback$1");
                    return objLJFF;
                }
            }
            Bitmap bitmap = (Bitmap) objLIZJ;
            if (bitmap == null) {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("forward cover fallback: bitmap null/timeout, creationId=");
                sbLIZ.append(this.LLILZIL.getCreationId());
                C201955140j.LJIJJ(c830690WiJ, "DmtInternalPublishServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C0MH8 c0mh8 = C0MH8.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
                c0mh8.getClass();
                String strLJI = C0MH8.LJI(videoPublishEditModel, 1);
                try {
                    C0VSJ c0vsj = new C0VSJ(strLJI);
                    File parentFile = c0vsj.getParentFile();
                    if (parentFile != null) {
                        Boolean.valueOf(parentFile.mkdirs());
                    }
                    c098200Yq = Boolean.valueOf(C1319770kRr.LJ(100, Bitmap.CompressFormat.PNG, bitmap, c0vsj));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = false;
                }
                if (((Boolean) c098200Yq).booleanValue()) {
                    this.LLILZIL.setVideoCoverPath(strLJI);
                    C201955140j.LJIILL(C830690WiJ.LIZIZ, "DmtInternalPublishServiceImpl", "forward cover fallback: saved, creationId=" + this.LLILZIL.getCreationId());
                } else {
                    C201955140j.LJIJJ(C830690WiJ.LIZIZ, "DmtInternalPublishServiceImpl", "forward cover fallback: save failed, creationId=" + this.LLILZIL.getCreationId());
                }
            }
        } finally {
            try {
            } catch (Throwable th2) {
            }
        }
        this.LLILZLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DmtInternalPublishServiceImpl@9f14.extractForwardCanvasCoverFallback$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
