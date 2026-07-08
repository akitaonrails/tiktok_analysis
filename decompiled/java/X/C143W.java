package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS574S0100000_30;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.143W, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C143W implements InterfaceC201990141s {
    public static final /* synthetic */ int LJIJ = 0;
    public final MusicModel LIZ;
    public final InterfaceC202028143e LIZIZ;
    public final CountDownLatch LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final boolean LJI;
    public final Context LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final C13TD LJIIL;
    public boolean LJIILIIL;
    public long LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public C201989141r LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.143Y, X.143e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143W.LIZLLL():void");
    }

    @Override // X.InterfaceC201990141s
    public final void cancel() {
        C13TD c13td = this.LJIIL;
        String str = this.LJIIIIZZ;
        Integer num = c13td.LIZ.get(str);
        if (num != null) {
            int iIntValue = num.intValue();
            C844470XAv.LIZ.getClass();
            if (Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).isDownloading(iIntValue)) {
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).cancel(iIntValue);
            } else {
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).removeTaskSubListener(iIntValue);
            }
        }
        c13td.LIZ.remove(str);
        this.LIZIZ.onCancel();
        String str2 = this.LJ;
        String str3 = this.LJIIIIZZ;
        String str4 = this.LJIIIZ;
        boolean zIsNeedSetCookie = this.LIZ.isNeedSetCookie();
        boolean z = this.LJIILIIL;
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("trace", str2);
        c2241008qG.LIZ.put("music_id", str3);
        c2241008qG.LIZ.put("fileUrlList", str4);
        c2241008qG.LIZ.put("downloadStrategy", Integer.valueOf(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIJJI()));
        c2241008qG.LIZ.put("is_private", Boolean.valueOf(zIsNeedSetCookie));
        c2241008qG.LIZ.put("isUseTTPlayer", Boolean.FALSE);
        c2241008qG.LIZ.put("isHitCache", Boolean.valueOf(z));
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_music_download_error_rate", 1, jSONObjectLJ);
    }

    @Override // X.InterfaceC201990141s
    public final void release() {
        C13TD c13td = this.LJIIL;
        Iterator<Map.Entry<String, Integer>> it2 = c13td.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().getValue().intValue();
            C844470XAv.LIZ.getClass();
            if (Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).isDownloading(iIntValue)) {
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).cancel(iIntValue);
            } else {
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).removeTaskSubListener(iIntValue);
            }
        }
        c13td.LIZ.clear();
        this.LJIIZILJ = null;
    }

    public final C202035143l LIZ(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        return new C202035143l(iIntValue, this.LJII.getString(2131837756));
    }

    public final void LIZIZ(Integer num, String str, String str2, int i, long j, String str3, long j2) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        C202026143c.LIZ(iIntValue, str, this.LJIIIIZZ, this.LJIIIZ, this.LJ, str2, j, str3, i, this.LIZ.isNeedSetCookie(), this.LJIILIIL);
        C1492570owZ c1492570owZ = C1492570owZ.LIZ;
        String str4 = this.LJIIIIZZ;
        String str5 = this.LJ;
        String str6 = this.LJIIIZ;
        Long lValueOf = Long.valueOf(j2);
        c1492570owZ.getClass();
        C1492570owZ.LIZ(str4, str5, str6, str, lValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJ);
        sbLIZ.append(", MusicDownloadError: errocode=");
        sbLIZ.append(num);
        sbLIZ.append("errorMsg=");
        sbLIZ.append(str);
        sbLIZ.append("musicId=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", curUrl=");
        sbLIZ.append(str2);
        sbLIZ.append(" isPrivate=");
        sbLIZ.append(this.LIZ.isNeedSetCookie());
        sbLIZ.append(" fileMagic=");
        sbLIZ.append(str3);
        sbLIZ.append(" fileSize=");
        sbLIZ.append(j);
        sbLIZ.append(" veErrorCode=");
        sbLIZ.append(i);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C143W(Context context, MusicModel musicModel, C202043143t c202043143t, CountDownLatch countDownLatch, boolean z, boolean z2, String str, int i, boolean z3) {
        UrlModel url;
        boolean z4;
        this.LIZ = musicModel;
        this.LIZIZ = c202043143t;
        this.LIZJ = countDownLatch;
        this.LIZLLL = z2;
        this.LJ = str;
        this.LJFF = i;
        this.LJI = z3;
        this.LJII = C786410Ut5.N3(context);
        this.LJIIIIZZ = musicModel.getMusicId();
        if (musicModel.getMusicType() == 2) {
            url = musicModel.getReuseAudioPlayUrl();
        } else {
            url = musicModel.getUrl();
        }
        this.LJIIIZ = C1838950xxF.LIZIZ(url);
        this.LJIIJ = C1490520otG.LJFF().LIZ();
        if (!z && countDownLatch == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.LJIIJJI = z4;
        boolean z5 = C13TD.LIZIZ;
        this.LJIIL = C13TC.LIZIZ();
        this.LJIILJJIL = -1L;
        this.LJIILL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(321));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 307));
    }
}
