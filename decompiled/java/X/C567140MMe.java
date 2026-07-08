package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.serviceimpl.MediaDownloadHelper$downloadSourceMedia$1", f = "MediaDownloadHelper.kt", l = {79, 85}, m = "invokeSuspend")
public final class C567140MMe extends C09AX implements Function2<InterfaceC346701Wf<? super C0MMH>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C567320MMw LLILLL;
    public final /* synthetic */ ForwardMedia LLILZ;
    public final /* synthetic */ C0MML LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567140MMe(C567320MMw c567320MMw, ForwardMedia forwardMedia, C0MML c0mml, CreativeInfo creativeInfo, Context context, InterfaceC1364105Vn<? super C567140MMe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c567320MMw;
        this.LLILZ = forwardMedia;
        this.LLILZIL = c0mml;
        this.LLILZLL = creativeInfo;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567140MMe c567140MMe = new C567140MMe(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c567140MMe.LLILLJJLI = obj;
        return c567140MMe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        InterfaceC346701Wf interfaceC346701Wf;
        ForwardMediaDownloader.DownloadConfig downloadConfigLIZ;
        Object objLIZ = obj;
        C1C7U.LIZ("MediaDownloadHelper@6562.downloadSourceMedia$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MediaDownloadHelper@6562.downloadSourceMedia$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            this.LLILLL.getClass();
            C567320MMw.LIZIZ("Starting source media download");
            C567250MMp c567250MMp = new C567250MMp();
            C567320MMw c567320MMw = this.LLILLL;
            ForwardMedia forwardMedia = this.LLILZ;
            C0MML c0mml = this.LLILZIL;
            c567320MMw.getClass();
            if (c0mml.getUseStreamingEntry()) {
                downloadConfigLIZ = C567120MMc.LIZ(forwardMedia.video, false, true, 2);
            } else if (((Number) C0B0X.LIZ.getValue()).intValue() != 0 && !forwardMedia.isStory()) {
                long jIntValue = ((long) ((Number) C0B0Y.LIZ.getValue()).intValue()) * 1000;
                Pair pairLIZIZ = C567120MMc.LIZIZ(forwardMedia.video);
                String str = (String) pairLIZIZ.getFirst();
                String str2 = (String) pairLIZIZ.getSecond();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                downloadConfigLIZ = new ForwardMediaDownloader.DownloadConfig(str, str2, C2188811AlT.LIZIZ(sbLIZ), true, jIntValue, false);
            } else {
                downloadConfigLIZ = C567120MMc.LIZ(forwardMedia.video, false, false, 2);
            }
            C567230MMn c567230MMn = new C567230MMn(this.LLILZ.video, downloadConfigLIZ);
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            objLIZ = C1D7S.LIZ(c567250MMp, c567230MMn, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("MediaDownloadHelper@6562.downloadSourceMedia$1");
                return objLJFF;
            }
        }
        C567180MMi c567180MMi = (C567180MMi) objLIZ;
        this.LLILLL.getClass();
        if (c567180MMi.LIZ.length() == 0) {
            Exception exc = c567180MMi.LIZIZ;
            if (exc == null) {
                throw new IllegalStateException("result path is empty");
            }
            throw exc;
        }
        C0MMH c0mmh = new C0MMH(c567180MMi.LIZ, this.LLILLL.LIZ(this.LLIZ, this.LLILZLL, this.LLILZ, this.LLILZIL), 2);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(c0mmh, this) == objLJFF) {
            C1C7U.LIZIZ("MediaDownloadHelper@6562.downloadSourceMedia$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaDownloadHelper@6562.downloadSourceMedia$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0MMH> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
