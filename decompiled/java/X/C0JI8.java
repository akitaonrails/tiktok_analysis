package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.ListSMBCourseVideosRequest;
import webcast.api.smb.ListSMBCourseVideosResponse;

/* JADX INFO: renamed from: X.0JI8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.data.schema.CourseMusicPeelSchemaHandler$handle$1$response$1", f = "CourseMusicPeelSchemaHandler.kt", l = {89}, m = "invokeSuspend")
public final class C0JI8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<ListSMBCourseVideosResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ListSMBCourseVideosRequest LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JI8(String str, ListSMBCourseVideosRequest listSMBCourseVideosRequest, InterfaceC1364105Vn<? super C0JI8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = listSMBCourseVideosRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JI8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CourseMusicPeelSchemaHandler@71ee.handle$1$response$1");
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
            String str = this.LLILLJJLI;
            C0JI9 c0ji9 = new C0JI9(this.LLILLL, null);
            this.LL = 1;
            obj = C1808280x9m.LIZ.LIZLLL(str, "/smb/course/video/list/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), c0ji9, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CourseMusicPeelSchemaHandler@71ee.handle$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CourseMusicPeelSchemaHandler@71ee.handle$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<ListSMBCourseVideosResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
