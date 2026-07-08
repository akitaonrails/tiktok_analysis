package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mediaselector.mediahandler.preprocess.DownloadLiveRecordingsVideoTask$process$4$3$2", f = "DownloadLiveRecordingsVideoTask.kt", l = {140}, m = "invokeSuspend")
public final class C534470Kxh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C534440Kxe LLILLJJLI;
    public final /* synthetic */ C534490Kxj LLILLL;
    public final /* synthetic */ DownloadInfo LLILZ;
    public final /* synthetic */ LiveRecordingsRoomDatabase LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534470Kxh(C534440Kxe c534440Kxe, C534490Kxj c534490Kxj, DownloadInfo downloadInfo, LiveRecordingsRoomDatabase liveRecordingsRoomDatabase, InterfaceC1364105Vn<? super C534470Kxh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c534440Kxe;
        this.LLILLL = c534490Kxj;
        this.LLILZ = downloadInfo;
        this.LLILZIL = liveRecordingsRoomDatabase;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534470Kxh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadLiveRecordingsVideoTask@7993.process$4$3$2");
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
            C534440Kxe c534440Kxe = this.LLILLJJLI;
            C534490Kxj c534490Kxj = this.LLILLL;
            DownloadInfo downloadInfo = this.LLILZ;
            if (downloadInfo == null) {
                downloadInfo = new DownloadInfo();
                downloadInfo.setFailedException(new BaseException(0, "success"));
            }
            c534440Kxe.getClass();
            C534440Kxe.LIZLLL(c534490Kxj, true, downloadInfo);
            LiveRecordingsRoomDatabase liveRecordingsRoomDatabase = this.LLILZIL;
            if (liveRecordingsRoomDatabase != null) {
                C534490Kxj c534490Kxj2 = this.LLILLL;
                C533710KwT c533710KwT = new C533710KwT(c534490Kxj2.LIZ, c534490Kxj2.LIZIZ, c534490Kxj2.LIZIZ());
                this.LL = 1;
                if (liveRecordingsRoomDatabase.LIZ(c533710KwT, this) == objLJFF) {
                    C1C7U.LIZIZ("DownloadLiveRecordingsVideoTask@7993.process$4$3$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadLiveRecordingsVideoTask@7993.process$4$3$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
