package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeCommonModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeRecordModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0nht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445030nht {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public final ShortVideoContext LIZ;
    public final CreativeInfo LIZIZ;
    public volatile C1621680sIo LIZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1445030nht.class, "legacyFunction", "getLegacyFunction()Lcom/ss/android/ugc/aweme/im/creative/common/api/camera/IMLegacyFunction;", 0);
        C13LE.LIZ.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0sIo, X.0sIp] */
    public final InterfaceC1621690sIp LIZ() {
        C1621680sIo c1621680sIo = this.LIZJ;
        if (c1621680sIo == null) {
            synchronized (this) {
                c1621680sIo = this.LIZJ;
                if (c1621680sIo == null) {
                    final ShortVideoContext shortVideoContext = this.LIZ;
                    ?? r0 = new InterfaceC1621690sIp(shortVideoContext) { // from class: X.0sIo
                        public final ShortVideoContext LIZ;

                        {
                            this.LIZ = shortVideoContext;
                        }

                        @Override // X.InterfaceC1621690sIp
                        public final void LIZ(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK) {
                            C1621670sIn c1621670sIn = C1621670sIn.LIZ;
                            ShortVideoContext shortVideoContext2 = this.LIZ;
                            c1621670sIn.getClass();
                            C1621670sIn.LIZJ(shortVideoContext2, interfaceC1624480sNK, lifecycleOwner);
                        }

                        @Override // X.InterfaceC1621690sIp
                        public final C1625150sOP LIZIZ(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625220sOW interfaceC1625220sOW) {
                            return new C1625150sOP(interfaceC1624480sNK, interfaceC1625220sOW, this.LIZ.creativeModel);
                        }
                    };
                    this.LIZJ = r0;
                    return r0;
                }
            }
        }
        return c1621680sIo;
    }

    public C1445030nht(IMCreativeRecordModel iMCreativeRecordModel) {
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.shootWay = "chat_shoot";
        CreativeInfo creativeInfo = new CreativeInfo(iMCreativeRecordModel.creationId, 0, null, 6, null);
        shortVideoContext.creativeInfo = creativeInfo;
        CreativeModel creativeModelLIZIZ = CreativeModel.LIZIZ(shortVideoContext.creativeModel, null, null, creativeInfo, null, -1, -1, -131073, 2097151);
        shortVideoContext.creativeModel = creativeModelLIZIZ;
        IMCreativeCommonModel iMCreativeCommonModel = iMCreativeRecordModel.commonModel;
        String str = iMCreativeCommonModel.enterFrom;
        shortVideoContext.enterFrom = str == null ? "" : str;
        DMCameraModel dMCameraModel = creativeModelLIZIZ.initialModel.dmCameraModel;
        String str2 = iMCreativeCommonModel.enterDM;
        dMCameraModel.enterDM = str2 != null ? str2 : "";
        this.LIZ = shortVideoContext;
        this.LIZIZ = shortVideoContext.creativeInfo;
    }
}
