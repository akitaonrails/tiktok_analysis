package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$createSingleImagePrepareTaskFlow$flow$1", f = "ForwardOnThisDayEnvironment.kt", l = {761}, m = "invokeSuspend")
public final class C0MHZ extends C09AX implements Function2<InterfaceC346701Wf<? super C0MKF>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ ForwardMedia LLILZ;
    public final /* synthetic */ C0MMK LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MHZ(CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MMK c0mmk, Context context, InterfaceC1364105Vn<? super C0MHZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creativeInfo;
        this.LLILZ = forwardMedia;
        this.LLILZIL = c0mmk;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MHZ c0mhz = new C0MHZ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0mhz.LLILLJJLI = obj;
        return c0mhz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.createSingleImagePrepareTaskFlow$flow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            CreativeInfo creativeInfo = this.LLILLL;
            ForwardMedia forwardMedia = this.LLILZ;
            C0MMK c0mmk = this.LLILZIL;
            Pair pairLIZ = C0MUO.LIZ(this.LLILZLL);
            MediaModel mediaModel = this.LLILZ.localMedia;
            if (mediaModel != null) {
                C0MKF c0mkf = new C0MKF(creativeInfo, forwardMedia, c0mmk, pairLIZ, Collections.singletonList(mediaModel.LJFF()));
                this.LL = 1;
                if (interfaceC346701Wf.emit(c0mkf, this) == objLJFF) {
                    C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.createSingleImagePrepareTaskFlow$flow$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.createSingleImagePrepareTaskFlow$flow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0MKF> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
