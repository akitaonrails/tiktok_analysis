package X;

import Y.AObjectS374S0100000_31;
import Y.AObjectS405S0100000_31;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.UUID;

/* JADX INFO: renamed from: X.15Py, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20516815Py extends SimpleServiceLoadCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C1394510mOP LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ C20516915Pz LJFF;

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        DialogC1389620mGW dialogC1389620mGW = this.LJFF.LIZ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        String str;
        boolean z;
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.anchorExtra(this.LJFF.LJIIL);
        builder.enterFrom(this.LJFF.LJ);
        builder.creationId(UUID.randomUUID().toString());
        builder.shootWay(this.LIZ);
        builder.recordFromFeed(this.LJFF.LJI);
        ShootExtraData shootExtraData = this.LJFF.LJIIJJI;
        if (shootExtraData != null) {
            builder.shootExtraData(shootExtraData);
        }
        String str2 = this.LIZIZ;
        String strLIZIZ = C2222691Bz1.LIZIZ();
        C1394510mOP c1394510mOP = this.LIZJ;
        String str3 = null;
        if (c1394510mOP == null) {
            str = null;
        } else {
            str = c1394510mOP.LIZ;
            str3 = c1394510mOP.LIZIZ;
        }
        if (c1394510mOP == null) {
            z = false;
        } else {
            z = c1394510mOP.LIZJ;
        }
        StickerDownloadConfig stickerDownloadConfig = new StickerDownloadConfig(str2, strLIZIZ, str, str3, Boolean.valueOf(z));
        stickerDownloadConfig.setType(Integer.valueOf(this.LIZLLL));
        stickerDownloadConfig.setSourceId(this.LJ);
        int i = this.LJFF.LJII;
        if (i == 2) {
            stickerDownloadConfig.setEnterFromType(10002);
        } else if (i == 3) {
            stickerDownloadConfig.setEnterFromType(10003);
        } else if (i == 1) {
            stickerDownloadConfig.setEnterFromType(10001);
        }
        if (!TextUtils.isEmpty(this.LJFF.LJIIIZ)) {
            builder.enterMethod(this.LJFF.LJIIIZ);
        }
        if (!TextUtils.isEmpty(this.LJFF.LJIIJ)) {
            builder.relationEnterMethod(this.LJFF.LJIIJ);
        }
        stickerDownloadConfig.setOnFail(new AObjectS374S0100000_31(this, 3));
        stickerDownloadConfig.setOnSuccess(new AObjectS405S0100000_31(this, 11));
        RecordConfig recordConfigBuild = builder.build();
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        C20516915Pz c20516915Pz = this.LJFF;
        iRecordServiceRecordService.clickMvAnchorOpenAlbumDirectly(c20516915Pz.LIZIZ, recordConfigBuild, stickerDownloadConfig, c20516915Pz.LIZLLL, recordConfigBuild.getAnchorExtra());
    }

    public C20516815Py(C20516915Pz c20516915Pz, String str, String str2, C1394510mOP c1394510mOP, int i, int i2) {
        this.LJFF = c20516915Pz;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c1394510mOP;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
