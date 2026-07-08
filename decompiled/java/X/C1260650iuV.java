package X;

import Y.ACListenerS122S0200000_19;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.NoticeData;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.NoticeType;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.PhotoNoticeResponse;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.PostStatistics;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0iuV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl$showFloatingNoticePhaseII$1$2", f = "EducatePhotoModeServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1260650iuV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ViewStub LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ C1257230ioz LLILZ;
    public final /* synthetic */ EducatePhotoModeServiceImpl LLILZIL;
    public final /* synthetic */ NoticeType LLILZLL;
    public final /* synthetic */ PhotoNoticeResponse LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260650iuV(ViewStub viewStub, int i, Activity activity, C1257230ioz c1257230ioz, EducatePhotoModeServiceImpl educatePhotoModeServiceImpl, NoticeType noticeType, PhotoNoticeResponse photoNoticeResponse, long j, InterfaceC1364105Vn<? super C1260650iuV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = viewStub;
        this.LLILLJJLI = i;
        this.LLILLL = activity;
        this.LLILZ = c1257230ioz;
        this.LLILZIL = educatePhotoModeServiceImpl;
        this.LLILZLL = noticeType;
        this.LLIZ = photoNoticeResponse;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1260650iuV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        View viewFindViewById;
        PostStatistics postStatistics;
        double d;
        View viewFindViewById2;
        PostStatistics postStatistics2;
        C1C7U.LIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseII$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ViewStub viewStub = this.LL;
        int i = this.LLILLJJLI;
        Activity activity = this.LLILLL;
        C1257230ioz c1257230ioz = this.LLILZ;
        C1260670iuX c1260670iuX = new C1260670iuX(viewStub, i, activity, c1257230ioz);
        NoticeType noticeType = this.LLILZLL;
        PhotoNoticeResponse photoNoticeResponse = this.LLIZ;
        long j2 = this.LLIZLLLIL;
        if (noticeType == NoticeType.GOOD_PERF) {
            if (c1257230ioz != null) {
                C20515215Pi c20515215Pi = c1257230ioz.LIZ;
                c20515215Pi.LJI(new AwS583S0100000_4(c1260670iuX, 270));
                c20515215Pi.LIZ.LJ = activity.getString(2131839823);
                Object[] objArr = new Object[1];
                Object[] objArr2 = new Object[1];
                NoticeData noticeData = photoNoticeResponse.notice_data;
                if (noticeData != null && (postStatistics2 = noticeData.post_statistics) != null) {
                    d = postStatistics2.views_percentage;
                } else {
                    d = 0.0d;
                }
                objArr2[0] = Double.valueOf(d * 100.0d);
                objArr[0] = C786410Ut5.j4("%.1f", Arrays.copyOf(objArr2, 1));
                c20515215Pi.LIZ.LJFF = C1260670iuX.LIZIZ(2131839822, activity, objArr);
                c20515215Pi.LJ();
                C20514915Pf c20514915Pf = c20515215Pi.LJ;
                if (c20514915Pf != null && (viewFindViewById2 = c20514915Pf.findViewById(R.id.evm)) != null) {
                    viewFindViewById2.setClickable(true);
                    C786410Ut5.I7(new ACListenerS122S0200000_19(c1260670iuX, c20515215Pi, 50), viewFindViewById2);
                }
                c1260670iuX.LIZ(photoNoticeResponse, j2);
                C1260670iuX.LJ(c1260670iuX, null, "second", "better_perf", null, null, 121);
            }
        } else if (c1257230ioz != null) {
            C20515215Pi c20515215Pi2 = c1257230ioz.LIZ;
            c20515215Pi2.LJI(new AwS583S0100000_4(c1260670iuX, 268));
            Object[] objArr3 = new Object[1];
            NoticeData noticeData2 = photoNoticeResponse.notice_data;
            if (noticeData2 != null && (postStatistics = noticeData2.post_statistics) != null) {
                j = (long) postStatistics.views;
            } else {
                j = 0;
            }
            objArr3[0] = C1843500y4a.LIZIZ(j);
            c20515215Pi2.LIZ.LJ = activity.getString(2131839821, objArr3);
            c20515215Pi2.LIZ.LJFF = C1260670iuX.LIZIZ(2131839820, activity, new Object[0]);
            c20515215Pi2.LJ();
            C20514915Pf c20514915Pf2 = c20515215Pi2.LJ;
            if (c20514915Pf2 != null && (viewFindViewById = c20514915Pf2.findViewById(R.id.evm)) != null) {
                viewFindViewById.setClickable(true);
                C786410Ut5.I7(new ACListenerS122S0200000_19(c1260670iuX, c20515215Pi2, 48), viewFindViewById);
            }
            c1260670iuX.LIZ(photoNoticeResponse, j2);
            C1260670iuX.LJ(c1260670iuX, null, "second", "worse_perf", null, null, 121);
        }
        C1260640iuU c1260640iuU = this.LLILZIL.LJFF;
        c1260640iuU.LIZ.storeInt(C1260640iuU.LIZ("number_of_times_performance_notice_shown"), c1260640iuU.LIZ.getInt(C1260640iuU.LIZ("number_of_times_performance_notice_shown"), 0) + 1);
        c1260640iuU.LIZ.storeLong(C1260640iuU.LIZ("timestamp_performance_notice"), new Date().getTime());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseII$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
