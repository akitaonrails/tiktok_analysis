package X;

import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M50, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishCallback$handleDraftAndTnsOnPublishSuccess$1", f = "ShortVideoPublishCallback.kt", l = {121, 160, 184, 187}, m = "invokeSuspend")
public final class C0M50 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ CreateBaseAwemeResponse LLILLL;
    public final /* synthetic */ PublishModel LLILZ;
    public final /* synthetic */ C1439630nZB LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M50(VideoPublishEditModel videoPublishEditModel, CreateBaseAwemeResponse createBaseAwemeResponse, PublishModel publishModel, C1439630nZB c1439630nZB, InterfaceC1364105Vn<? super C0M50> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = createBaseAwemeResponse;
        this.LLILZ = publishModel;
        this.LLILZIL = c1439630nZB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M50(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
