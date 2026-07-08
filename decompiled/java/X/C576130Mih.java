package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.composer.CreationComposerDsl;
import com.ss.android.ugc.aweme.composer.model.MusicComposerModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.v2.assem.MusicCreateSongAssem;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IUIService;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Mih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.assem.MusicCreateSongAssem$createMemeSong$1$onLoad$1$1", f = "MusicCreateSongAssem.kt", l = {}, m = "invokeSuspend")
public final class C576130Mih extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MusicCreateSongAssem LL;
    public final /* synthetic */ MemeSongModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AsyncAVService LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ List<MemeSongModel> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C576130Mih(MusicCreateSongAssem musicCreateSongAssem, MemeSongModel memeSongModel, String str, AsyncAVService asyncAVService, C19EG c19eg, List<MemeSongModel> list, String str2, InterfaceC1364105Vn<? super C576130Mih> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = musicCreateSongAssem;
        this.LLILLJJLI = memeSongModel;
        this.LLILLL = str;
        this.LLILZ = asyncAVService;
        this.LLILZIL = c19eg;
        this.LLILZLL = list;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C576130Mih(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String templateId;
        C1C7U.LIZ("MusicCreateSongAssem@25ef.createMemeSong$1$onLoad$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IExternalService) ServiceManager.get().getService(IExternalService.class)).creativePathAdapter().genMusicPath("memesong"));
        sbLIZ.append(File.separator);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LL.getClass();
        String str = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US).format(Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(str);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C2354709Kn.LIZLLL(this.LLILLJJLI.getLocalSongPath(), strLIZIZ2);
        this.LLILLJJLI.setLocalSongPath(strLIZIZ2);
        MusicModel musicModelLJIILL = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIILL(this.LLILLJJLI.getLocalSongPath());
        MemeSongModel memeSongModel = this.LLILLJJLI;
        List<MemeSongModel> list = this.LLILZLL;
        musicModelLJIILL.setName((String) ListProtector.get(memeSongModel.getLyrics(), 0));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getNickName());
        sbLIZ3.append(" . ");
        musicModelLJIILL.setSinger(C2188811AlT.LIZIZ(sbLIZ3));
        musicModelLJIILL.setMusicType(6);
        musicModelLJIILL.setDownloadComplete(true);
        musicModelLJIILL.setMemeSong(memeSongModel);
        musicModelLJIILL.setMemeSongModels(list);
        this.LLILLJJLI.setSongDuration(musicModelLJIILL.getDuration());
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("resultType = ");
        sbLIZ4.append(this.LLILLL);
        sbLIZ4.append(" , selectedModel = ");
        MemeSongModel memeSongModel2 = this.LLILLJJLI;
        if (memeSongModel2 != null) {
            templateId = memeSongModel2.getTemplateId();
        } else {
            templateId = null;
        }
        sbLIZ4.append(templateId);
        C2188811AlT.LIZIZ(sbLIZ4);
        if (Intrinsics.LJFF(this.LLILLL, "MemeSongShare")) {
            IUIService iUIServiceUiService = this.LLILZ.uiService();
            C19EG c19eg = this.LLILZIL;
            CreationComposerDsl creationComposerDsl = new CreationComposerDsl();
            String str2 = this.LLIZ;
            MusicCreateSongAssem musicCreateSongAssem = this.LL;
            creationComposerDsl.basic(AFwS239S0000000_8.get$arr$(263));
            creationComposerDsl.musicShareStory(new AwS587S0100000_8(musicModelLJIILL, 591));
            creationComposerDsl.callback(new AwS587S0100000_8(musicCreateSongAssem, 592));
            int duration = musicModelLJIILL.getDuration();
            if (duration > 3000) {
                duration = LivePreCreateNextRoomPlayer.ENABLE;
            }
            creationComposerDsl.setMusic(new MusicComposerModel(str2, 0, duration, musicModelLJIILL));
            iUIServiceUiService.startCreation(c19eg, creationComposerDsl);
        } else if (Intrinsics.LJFF(this.LLILLL, "MemeSongDone")) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0L2Q(this.LLILZ, this.LLILZIL, this.LLIZ, musicModelLJIILL, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicCreateSongAssem@25ef.createMemeSong$1$onLoad$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
