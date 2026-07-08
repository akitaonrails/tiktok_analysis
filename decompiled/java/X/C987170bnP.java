package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0bnP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987170bnP implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Bitmap> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
            case 2:
                subscribe$2(this, interfaceC2329309At);
                break;
            case 3:
                subscribe$3(this, interfaceC2329309At);
                break;
            case 4:
                subscribe$4(this, interfaceC2329309At);
                break;
            case 5:
                subscribe$5(this, interfaceC2329309At);
                break;
            case 6:
                subscribe$6(this, interfaceC2329309At);
                break;
        }
    }

    public C987170bnP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C987170bnP c987170bnP, InterfaceC2329309At interfaceC2329309At) {
        Bitmap currDisplayImage;
        INLEMediaRuntime mediaRuntimeApi;
        C1463860oCG c1463860oCG = ((C971050bNP) c987170bnP.l0).LIZLLL;
        if (c1463860oCG != null && (mediaRuntimeApi = c1463860oCG.getMediaRuntimeApi()) != null) {
            currDisplayImage = ((C1463950oCP) mediaRuntimeApi).getCurrDisplayImage(-1);
        } else {
            currDisplayImage = null;
        }
        MultiCanvasUtils.LIZ.getClass();
        if (MultiCanvasUtils.LJIIZILJ(currDisplayImage)) {
            if (currDisplayImage != null) {
                interfaceC2329309At.onSuccess(currDisplayImage);
                return;
            }
            return;
        }
        Bitmap bitmapLJI = ((C971050bNP) c987170bnP.l0).LJI(2);
        if (MultiCanvasUtils.LJIIZILJ(bitmapLJI)) {
            if (bitmapLJI == null) {
                return;
            }
            interfaceC2329309At.onSuccess(bitmapLJI);
            return;
        }
        interfaceC2329309At.onError(new RuntimeException("Fail to generate bitmap"));
    }

    public static final void subscribe$1(C987170bnP c987170bnP, InterfaceC2329309At interfaceC2329309At) {
        Bitmap currDisplayImage;
        INLEMediaRuntime mediaRuntimeApi;
        C1463860oCG c1463860oCG = ((C971050bNP) c987170bnP.l0).LIZLLL;
        if (c1463860oCG != null && (mediaRuntimeApi = c1463860oCG.getMediaRuntimeApi()) != null) {
            currDisplayImage = ((C1463950oCP) mediaRuntimeApi).getCurrDisplayImage(-1);
        } else {
            currDisplayImage = null;
        }
        MultiCanvasUtils.LIZ.getClass();
        if (MultiCanvasUtils.LJIIZILJ(currDisplayImage)) {
            if (currDisplayImage != null) {
                interfaceC2329309At.onSuccess(currDisplayImage);
                return;
            }
            return;
        }
        Bitmap bitmapLJI = ((C971050bNP) c987170bnP.l0).LJI(2);
        if (MultiCanvasUtils.LJIIZILJ(bitmapLJI)) {
            if (bitmapLJI == null) {
                return;
            }
            interfaceC2329309At.onSuccess(bitmapLJI);
            return;
        }
        interfaceC2329309At.onError(new RuntimeException("Fail to generate bitmap"));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0au6, X.0avq] */
    public static final void subscribe$2(C987170bnP c987170bnP, InterfaceC2329309At interfaceC2329309At) {
        final Pair pair = (Pair) c987170bnP.l0;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        final ?? r2 = new InterfaceC952880au6() { // from class: X.0avq
            @Override // X.InterfaceC952880au6
            public final void onSuccess() {
                c11kt.onSuccess(pair);
            }

            @Override // X.InterfaceC952880au6
            public final void LIZ(Throwable th) {
                c11kt.onError(th);
            }
        };
        C953230auf.LIZ.getClass();
        C953230auf.LIZLLL(2, r2);
        interfaceC2329309At.setCancellable(new C11KX() { // from class: X.0avr
            @Override // X.C11KX
            public final void cancel() {
                C953230auf c953230auf = C953230auf.LIZ;
                C953960avq c953960avq = r2;
                c953230auf.getClass();
                C953230auf.LJIILL(c953960avq);
            }
        });
    }

    public static final void subscribe$3(C987170bnP c987170bnP, InterfaceC2329309At interfaceC2329309At) {
        C953770avX c953770avXLJFF = C953760avW.LIZIZ.LIZ().LJFF(((C916750Zxp) c987170bnP.l0).LIZJ);
        if (c953770avXLJFF == null) {
            C20441214yg.LJIIIZ("CommonDraftItemManager", "Local draft item not found");
            interfaceC2329309At.onError(new C953850avf());
        } else {
            C20441214yg.LJIIIZ("CommonDraftItemManager", "Found local draft item");
            interfaceC2329309At.onSuccess(c953770avXLJFF);
        }
    }

    public static final void subscribe$4(C987170bnP c987170bnP, InterfaceC2329309At interfaceC2329309At) {
        C916750Zxp c916750Zxp = (C916750Zxp) c987170bnP.l0;
        if (c916750Zxp.LIZ == 1) {
            ConcurrentHashMap<Long, C917840Zza> concurrentHashMap = CloudDraftItemManager.LIZLLL;
            if (concurrentHashMap.get(Long.valueOf(c916750Zxp.LIZIZ)) == null) {
                C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", "Not found record in CloudDraftItemManager by templateId");
                interfaceC2329309At.onError(new C294201Ca() { // from class: X.0avg
                    public static final int $stable = 8;
                });
                return;
            }
            C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", "Found record in CloudDraftItemManager by templateId");
            C917840Zza c917840Zza = concurrentHashMap.get(Long.valueOf(((C916750Zxp) c987170bnP.l0).LIZIZ));
            if (c917840Zza == null) {
                return;
            }
            interfaceC2329309At.onSuccess(c917840Zza);
            return;
        }
        ConcurrentHashMap<String, C917840Zza> concurrentHashMap2 = CloudDraftItemManager.LIZIZ;
        if (concurrentHashMap2.get(c916750Zxp.LIZJ) == null) {
            C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", "Not found record in CloudDraftItemManager by mediaNodeId");
            interfaceC2329309At.onError(new C294201Ca() { // from class: X.0avg
                public static final int $stable = 8;
            });
            return;
        }
        C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", "Found record in CloudDraftItemManager by mediaNodeId");
        C917840Zza c917840Zza2 = concurrentHashMap2.get(((C916750Zxp) c987170bnP.l0).LIZJ);
        if (c917840Zza2 == null) {
            return;
        }
        interfaceC2329309At.onSuccess(c917840Zza2);
    }

    public static final void subscribe$5(C987170bnP c987170bnP, InterfaceC2329309At interfaceC2329309At) {
        NLEEditor nLEEditor = new NLEEditor();
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        String str = ((C917840Zza) c987170bnP.l0).LIZ;
        multiCanvasUtils.getClass();
        MultiCanvasUtils.LIZ(nLEEditor, str);
        nLEEditor.commit();
        nLEEditor.done();
        interfaceC2329309At.onSuccess(nLEEditor);
    }

    public static final void subscribe$6(C987170bnP c987170bnP, InterfaceC2329309At interfaceC2329309At) {
        C953770avX c953770avXLJFF = C953760avW.LIZIZ.LIZ().LJFF(((C916750Zxp) c987170bnP.l0).LIZJ);
        if (c953770avXLJFF == null) {
            interfaceC2329309At.onError(new C953850avf());
        } else {
            interfaceC2329309At.onSuccess(c953770avXLJFF);
        }
    }
}
