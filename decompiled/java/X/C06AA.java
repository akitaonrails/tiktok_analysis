package X;

import com.bytedance.im.core.proto.MediaURLStruct;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06AA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.preload.MediaPreloadManager$onMediaAvailable$1", f = "MediaPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C06AA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C870370YCl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AA(C870370YCl c870370YCl, InterfaceC1364105Vn<? super C06AA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c870370YCl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06AA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YC6 next;
        MediaURLStruct mediaURLStruct;
        List<String> list;
        C1C7U.LIZ("MediaPreloadManager@9282.onMediaAvailable$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(this.LL.LIZIZ);
        if (c869590Y9lLJJJ != null) {
            Iterator<C0YC6> it2 = c869590Y9lLJJJ.getAttachments().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.displayType, "play")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0YC6 c0yc6 = next;
            if (c0yc6 != null && (mediaURLStruct = c0yc6.mediaUrlStruct) != null && (list = mediaURLStruct.url_list) != null && C866950Xzh.LIZIZ(list)) {
                IMCameraBridgeApi.LIZ.getClass();
                IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
                if (iMCameraBridgeApiLIZ != null) {
                    iMCameraBridgeApiLIZ.LJIJJ(iMCameraBridgeApiLIZ.LJIILIIL(c869590Y9lLJJJ, null));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPreloadManager@9282.onMediaAvailable$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
