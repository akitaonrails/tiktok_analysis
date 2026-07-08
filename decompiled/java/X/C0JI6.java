package X;

import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import webcast.api.smb.ListSMBCourseVideosRequest;
import webcast.api.smb.ListSMBCourseVideosResponse;

/* JADX INFO: renamed from: X.0JI6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.data.schema.CourseMusicPeelSchemaHandler$handle$1", f = "CourseMusicPeelSchemaHandler.kt", l = {88}, m = "invokeSuspend")
public final class C0JI6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JI6(Function0<Unit> function0, Function0<Unit> function02, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C0JI6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JI6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jLongValue;
        long jLongValue2;
        C1C7U.LIZ("CourseMusicPeelSchemaHandler@71ee.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        SMBCourseVideo sMBCourseVideo = null;
        boolean z = false;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                ListSMBCourseVideosRequest listSMBCourseVideosRequest = new ListSMBCourseVideosRequest();
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                String str3 = this.LLILZLL;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                long jLongValue3 = -1;
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                listSMBCourseVideosRequest.anchorId = jLongValue;
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str2);
                if (lLJIILIIL2 != null) {
                    jLongValue2 = lLJIILIIL2.longValue();
                } else {
                    jLongValue2 = -1;
                }
                listSMBCourseVideosRequest.courseId = jLongValue2;
                listSMBCourseVideosRequest.scene = 1;
                listSMBCourseVideosRequest.offset = 0;
                listSMBCourseVideosRequest.count = 0;
                Long[] lArr = new Long[1];
                Long lLJIILIIL3 = C2095008Iq.LJIILIIL(str3);
                if (lLJIILIIL3 != null) {
                    jLongValue3 = lLJIILIIL3.longValue();
                }
                lArr[0] = C2286608xc.LJFF(jLongValue3);
                listSMBCourseVideosRequest.videoIdList = C1697810uHb.LJIILJJIL(lArr);
                C1DFB c1dfb = C0PEM.LIZJ;
                C0JI8 c0ji8 = new C0JI8(this.LLIZ, listSMBCourseVideosRequest, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c0ji8);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CourseMusicPeelSchemaHandler@71ee.handle$1");
                    return objLJFF;
                }
            }
            List<SMBCourseVideo> list = ((ListSMBCourseVideosResponse.Data) ((C470590Icr) obj).data).videoList;
            String str4 = this.LLILZLL;
            Iterator<SMBCourseVideo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SMBCourseVideo next = it2.next();
                if (Intrinsics.LJFF(String.valueOf(next.videoId), str4)) {
                    sMBCourseVideo = next;
                    break;
                }
            }
            SMBCourseVideo sMBCourseVideo2 = sMBCourseVideo;
            if (sMBCourseVideo2 != null && sMBCourseVideo2.needConfirmAudio) {
                z = true;
            }
            if (z) {
                this.LLILLJJLI.invoke();
            } else {
                this.LLILLL.invoke();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CourseMusicPeelSchemaHandler@71ee.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
