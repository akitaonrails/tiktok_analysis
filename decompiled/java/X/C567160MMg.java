package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.serviceimpl.MediaDownloadHelper$downloadSourceMediaFromDM$1", f = "MediaDownloadHelper.kt", l = {112, 118}, m = "invokeSuspend")
public final class C567160MMg extends C09AX implements Function2<InterfaceC346701Wf<? super C0MMH>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C567320MMw LLILLL;
    public final /* synthetic */ ForwardMediaDownloader.DownloadConfig LLILZ;
    public final /* synthetic */ ForwardMedia LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567160MMg(C567320MMw c567320MMw, ForwardMediaDownloader.DownloadConfig downloadConfig, ForwardMedia forwardMedia, InterfaceC1364105Vn<? super C567160MMg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c567320MMw;
        this.LLILZ = downloadConfig;
        this.LLILZIL = forwardMedia;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567160MMg c567160MMg = new C567160MMg(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c567160MMg.LLILLJJLI = obj;
        return c567160MMg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("MediaDownloadHelper@6562.downloadSourceMediaFromDM$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MediaDownloadHelper@6562.downloadSourceMediaFromDM$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            this.LLILLL.getClass();
            C567320MMw.LIZIZ("Starting DM media download");
            ForwardMediaDownloader.DownloadConfig downloadConfigLIZ = this.LLILZ;
            if (downloadConfigLIZ == null) {
                downloadConfigLIZ = C567120MMc.LIZ(this.LLILZIL.video, false, false, 6);
            }
            C567200MMk c567200MMk = new C567200MMk();
            List<String> playAddressList = this.LLILZIL.video.getPlayAddressList();
            ForwardVideo forwardVideo = this.LLILZIL.video;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = c567200MMk.LIZJ(playAddressList, downloadConfigLIZ, forwardVideo, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MediaDownloadHelper@6562.downloadSourceMediaFromDM$1");
                return objLJFF;
            }
        }
        C0MMH c0mmh = new C0MMH((String) obj, null, 6);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(c0mmh, this) == objLJFF) {
            C1C7U.LIZIZ("MediaDownloadHelper@6562.downloadSourceMediaFromDM$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaDownloadHelper@6562.downloadSourceMediaFromDM$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0MMH> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
