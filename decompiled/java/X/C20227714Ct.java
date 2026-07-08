package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14Ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper$updateAwemeSuccessAndNext$2$2", f = "ReplaceMusicWithMovieHelper.kt", l = {}, m = "invokeSuspend")
public final class C20227714Ct extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ReplaceMusicWithMovieHelper LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20227714Ct(ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper, Aweme aweme, long j, InterfaceC1364105Vn<? super C20227714Ct> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = replaceMusicWithMovieHelper;
        this.LLILLJJLI = aweme;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20227714Ct(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceMusicWithMovieHelper@8c47.updateAwemeSuccessAndNext$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper = this.LL;
        replaceMusicWithMovieHelper.LLJJIJI = null;
        final Aweme aweme = this.LLILLJJLI;
        final long j = this.LLILLL;
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithOutPanel("replace_music", new IExternalService.ServiceLoadCallback() { // from class: X.14DC
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                ReplaceMusicWithMovieHelper.LIZJ(replaceMusicWithMovieHelper);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                String muteDetailUrl;
                EnumC20226614Ci enumC20226614Ci;
                AwemeStatus.VideoMuteInfo videoMuteInfo;
                ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper2 = replaceMusicWithMovieHelper;
                String str = replaceMusicWithMovieHelper2.LLIZ;
                Activity activity = null;
                if (str == null) {
                    str = null;
                }
                String str2 = replaceMusicWithMovieHelper2.LLIZLLLIL;
                if (str2 == null) {
                    str2 = null;
                }
                String str3 = replaceMusicWithMovieHelper2.LLJ;
                if (str3 == null) {
                    str3 = null;
                }
                String str4 = replaceMusicWithMovieHelper2.LLJI;
                String str5 = replaceMusicWithMovieHelper2.LLJIJIL;
                CreativeInfo creativeInfo = replaceMusicWithMovieHelper2.LLJJ;
                MusicBuzModel musicBuzModel = replaceMusicWithMovieHelper2.LLJILJILJ;
                AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
                if (statusSafety != null && (videoMuteInfo = statusSafety.getVideoMuteInfo()) != null) {
                    muteDetailUrl = videoMuteInfo.getMuteDetailUrl();
                } else {
                    muteDetailUrl = null;
                }
                ChangeBanMusicConfig changeBanMusicConfig = new ChangeBanMusicConfig(str, str2, str3, str4, str5, creativeInfo, musicBuzModel, muteDetailUrl, replaceMusicWithMovieHelper.LLJILJIL);
                changeBanMusicConfig.setOutputDir(replaceMusicWithMovieHelper.LLJJI);
                C1510705vl c1510705vl = replaceMusicWithMovieHelper.LLILLJJLI;
                if (c1510705vl != null && (enumC20226614Ci = c1510705vl.LIZ) != null) {
                    int i = C20226814Ck.LIZ[enumC20226614Ci.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper3 = replaceMusicWithMovieHelper;
                                C23250099c.LIZLLL(replaceMusicWithMovieHelper3, null, null, new C14DD(asyncAVService, aweme, replaceMusicWithMovieHelper3, j, changeBanMusicConfig, null), 3);
                                return;
                            }
                        } else {
                            ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper4 = replaceMusicWithMovieHelper;
                            C23250099c.LIZLLL(replaceMusicWithMovieHelper4, null, null, new C14DE(asyncAVService, aweme, replaceMusicWithMovieHelper4, j, changeBanMusicConfig, null), 3);
                            return;
                        }
                    } else {
                        changeBanMusicConfig.setPreviousMusic(replaceMusicWithMovieHelper.LLJILLL);
                        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
                        Aweme aweme2 = aweme;
                        ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper5 = replaceMusicWithMovieHelper;
                        Activity activity2 = replaceMusicWithMovieHelper5.LL;
                        if (activity2 != null) {
                            activity = activity2;
                        }
                        long j3 = j;
                        UIServiceCallback uIServiceCallback = (UIServiceCallback) replaceMusicWithMovieHelper5.LLJJIJIL.invoke(aweme2, Long.valueOf(j3));
                        ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper6 = replaceMusicWithMovieHelper;
                        iRecordServiceRecordService.startChangeBanMusic(aweme2, activity, j3, changeBanMusicConfig, uIServiceCallback, replaceMusicWithMovieHelper6.LLILLL, replaceMusicWithMovieHelper6.LLILZ);
                        return;
                    }
                }
                C1647306ch.LIZJ("unknown target page");
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.updateAwemeSuccessAndNext$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
