package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;
import webcast.api.smb.ListSMBCourseVideosRequest;
import webcast.api.smb.ListSMBCourseVideosResponse;

/* JADX INFO: renamed from: X.0JI9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.data.schema.CourseMusicPeelSchemaHandler$handle$1$response$1$1", f = "CourseMusicPeelSchemaHandler.kt", l = {92}, m = "invokeSuspend")
public final class C0JI9 extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<ListSMBCourseVideosResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ ListSMBCourseVideosRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JI9(ListSMBCourseVideosRequest listSMBCourseVideosRequest, InterfaceC1364105Vn<? super C0JI9> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = listSMBCourseVideosRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JI9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<ListSMBCourseVideosResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CourseMusicPeelSchemaHandler@71ee.handle$1$response$1$1");
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
            C480460Ism.LIZ().getClass();
            PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
            ListSMBCourseVideosRequest listSMBCourseVideosRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = pcsApi.loadCourseVideos(listSMBCourseVideosRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CourseMusicPeelSchemaHandler@71ee.handle$1$response$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CourseMusicPeelSchemaHandler@71ee.handle$1$response$1$1");
        return obj;
    }
}
