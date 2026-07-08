package X;

import android.app.Activity;
import android.net.Uri;
import android.view.ViewStub;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.NoticeData;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.NoticeType;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.PhotoNoticeResponse;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.PostStatistics;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl$showFloatingNoticePhaseII$1", f = "EducatePhotoModeServiceImpl.kt", l = {199, 237}, m = "invokeSuspend")
public final class C1260660iuW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ EducatePhotoModeServiceImpl LLILLL;
    public final /* synthetic */ ViewStub LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Activity LLILZLL;
    public final /* synthetic */ C1257230ioz LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260660iuW(EducatePhotoModeServiceImpl educatePhotoModeServiceImpl, ViewStub viewStub, int i, Activity activity, C1257230ioz c1257230ioz, InterfaceC1364105Vn<? super C1260660iuW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = educatePhotoModeServiceImpl;
        this.LLILZ = viewStub;
        this.LLILZIL = i;
        this.LLILZLL = activity;
        this.LLIZ = c1257230ioz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1260660iuW(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PhotoNoticeResponse photoNoticeResponse;
        NoticeType noticeType;
        Double dLIZJ;
        Double dLIZJ2;
        Double dLIZJ3;
        Double dLIZJ4;
        PostStatistics postStatistics;
        PostStatistics postStatistics2;
        PostStatistics postStatistics3;
        PostStatistics postStatistics4;
        long j;
        Object objLIZ = obj;
        C1C7U.LIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseII$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        String str = null;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error fetching notice data - ");
            sbLIZ.append(e.getMessage());
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
            photoNoticeResponse = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseII$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.LL;
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            long time = new Date().getTime();
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            j = time / j2;
            InterfaceC1260680iuY.LIZ.getClass();
            InterfaceC1260680iuY value = C1260690iuZ.LIZIZ.getValue();
            Long lLJFF = C2286608xc.LJFF(this.LLILLL.LJFF.LIZ.getLong(C1260640iuU.LIZ("timestamp_generic_notice"), -1L) / j2);
            this.LL = j;
            this.LLILLJJLI = 1;
            objLIZ = value.LIZ(0, lLJFF, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseII$1");
                return objLJFF;
            }
        }
        photoNoticeResponse = (PhotoNoticeResponse) objLIZ;
        if (photoNoticeResponse == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseII$1");
            return unit2;
        }
        C1260700iua c1260700iua = NoticeType.Companion;
        int i2 = photoNoticeResponse.notice_type;
        c1260700iua.getClass();
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    noticeType = NoticeType.GENERIC;
                } else {
                    noticeType = NoticeType.BAD_PERF;
                }
            } else {
                noticeType = NoticeType.GOOD_PERF;
            }
        } else {
            noticeType = NoticeType.GENERIC;
        }
        if (noticeType == NoticeType.GENERIC) {
            this.LLILLL.LJFF.LIZ.storeLong(C1260640iuU.LIZ("timestamp_first_photo_mode_publish_since_generic_notice"), -1L);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseII$1");
            return unit3;
        }
        Uri.Builder builder = (Uri.Builder) this.LLILLL.LJ.getValue();
        builder.appendQueryParameter("notice_type", String.valueOf(photoNoticeResponse.notice_type));
        NoticeData noticeData = photoNoticeResponse.notice_data;
        if (noticeData != null && (postStatistics4 = noticeData.post_statistics) != null) {
            dLIZJ = C2286608xc.LIZJ(postStatistics4.comments);
        } else {
            dLIZJ = null;
        }
        builder.appendQueryParameter("comments", String.valueOf(dLIZJ));
        NoticeData noticeData2 = photoNoticeResponse.notice_data;
        if (noticeData2 != null && (postStatistics3 = noticeData2.post_statistics) != null) {
            dLIZJ2 = C2286608xc.LIZJ(postStatistics3.likes);
        } else {
            dLIZJ2 = null;
        }
        builder.appendQueryParameter("likes", String.valueOf(dLIZJ2));
        NoticeData noticeData3 = photoNoticeResponse.notice_data;
        if (noticeData3 != null && (postStatistics2 = noticeData3.post_statistics) != null) {
            dLIZJ3 = C2286608xc.LIZJ(postStatistics2.new_followers);
        } else {
            dLIZJ3 = null;
        }
        builder.appendQueryParameter("new_followers", String.valueOf(dLIZJ3));
        NoticeData noticeData4 = photoNoticeResponse.notice_data;
        if (noticeData4 != null && (postStatistics = noticeData4.post_statistics) != null) {
            dLIZJ4 = C2286608xc.LIZJ(postStatistics.views);
        } else {
            dLIZJ4 = null;
        }
        builder.appendQueryParameter("views", String.valueOf(dLIZJ4));
        NoticeData noticeData5 = photoNoticeResponse.notice_data;
        if (noticeData5 != null) {
            str = noticeData5.item_id;
        }
        builder.appendQueryParameter("item_id", String.valueOf(str));
        builder.appendQueryParameter("retrieval_time", String.valueOf(j));
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1260650iuV c1260650iuV = new C1260650iuV(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLL, noticeType, photoNoticeResponse, j, null);
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1260650iuV) == objLJFF) {
            C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseII$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.showFloatingNoticePhaseII$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
