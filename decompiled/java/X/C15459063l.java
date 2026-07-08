package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager$readAudioC2PAWithTimeOut$result$1", f = "C2PAAIGCManager.kt", l = {506}, m = "invokeSuspend")
public final class C15459063l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AIGCInfo>, Object> {
    public int LL;
    public final /* synthetic */ MediaModel LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15459063l(MediaModel mediaModel, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C15459063l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mediaModel;
        this.LLILLL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15459063l(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String creationId;
        C1C7U.LIZ("C2PAAIGCManager@54f1.readAudioC2PAWithTimeOut$result$1");
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
            C140D c140d = C140D.LIZ;
            MediaModel mediaModel = this.LLILLJJLI;
            CreativeInfo creativeInfo = this.LLILLL;
            if (creativeInfo != null) {
                creationId = creativeInfo.getCreationId();
            } else {
                creationId = null;
            }
            C15464063q c15464063q = new C15464063q(creationId);
            this.LL = 1;
            obj = c140d.LJJIJ(mediaModel, c15464063q, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("C2PAAIGCManager@54f1.readAudioC2PAWithTimeOut$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("C2PAAIGCManager@54f1.readAudioC2PAWithTimeOut$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AIGCInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
