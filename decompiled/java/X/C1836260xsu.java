package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836260xsu extends C09AY implements Function1<DownloadInfo, Unit> {
    public final /* synthetic */ C207209166l LL;
    public final /* synthetic */ DialogC1390150mHN LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1836330xt1 LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1836260xsu(C207209166l c207209166l, DialogC1390150mHN dialogC1390150mHN, String str, C1836330xt1 c1836330xt1, Context context, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(1);
        this.LL = c207209166l;
        this.LLILLJJLI = dialogC1390150mHN;
        this.LLILLL = str;
        this.LLILZ = c1836330xt1;
        this.LLILZIL = context;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = str7;
        this.LLJILJIL = str8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DownloadInfo downloadInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download onSuccess,");
        sbLIZ.append(C771370UNr.LIZLLL(this.LL));
        C20441214yg.LIZIZ("LiveReplayVideoClip", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LJJLL(100.0f, false);
        C786410Ut5.LJIIJJI(this.LLILLJJLI);
        C1836170xsl c1836170xsl = C1836170xsl.LIZ;
        String str = this.LLILLL;
        String str2 = this.LLILZ.LIZ;
        c1836170xsl.getClass();
        String str3 = "";
        C1836170xsl.LIZIZ(0, "finish", "", str, str2);
        String str4 = this.LLILZ.LIZ;
        String str5 = this.LLILLL;
        if (str4.length() != 0) {
            str5 = str4;
        }
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
        Context context = this.LLILZIL;
        String strLIZLLL = C771370UNr.LIZLLL(this.LL);
        String str6 = this.LLILZLL;
        C1836330xt1 c1836330xt1 = this.LLILZ;
        String str7 = c1836330xt1.LIZIZ;
        String str8 = c1836330xt1.LIZJ;
        String str9 = this.LLIZ;
        String str10 = c1836330xt1.LIZLLL;
        String str11 = this.LLIZLLLIL;
        if (str11 == null) {
            str11 = "";
        }
        String str12 = this.LLJ;
        if (str12 != null) {
            str3 = str12;
        }
        iHostCreativeTool.Gq2(context, strLIZLLL, str6, str5, 0, str7, str8, str9, str10, str11, str3, "", this.LLJI, null, this.LLJIJIL, this.LLJILJIL, null);
        return Unit.LIZ;
    }
}
