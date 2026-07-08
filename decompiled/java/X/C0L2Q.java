package X;

import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.assem.MusicCreateSongAssem$createMemeSong$1$onLoad$1$1$2", f = "MusicCreateSongAssem.kt", l = {}, m = "invokeSuspend")
public final class C0L2Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AsyncAVService LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ MusicModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L2Q(AsyncAVService asyncAVService, C19EG c19eg, String str, MusicModel musicModel, InterfaceC1364105Vn<? super C0L2Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = asyncAVService;
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
        this.LLILZ = musicModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L2Q(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicCreateSongAssem@25ef.createMemeSong$1$onLoad$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IRecordService iRecordServiceRecordService = this.LL.uiService().recordService();
        C19EG c19eg = this.LLILLJJLI;
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("single_song");
        builder.enterFrom("single_song");
        builder.musicOrigin("create_or_edit_meme_song");
        builder.musicDownloadComplete(true);
        builder.musicPath(this.LLILLL);
        builder.musicModel(this.LLILZ);
        iRecordServiceRecordService.startRecord(c19eg, builder.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicCreateSongAssem@25ef.createMemeSong$1$onLoad$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
