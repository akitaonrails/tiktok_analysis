package X;

import Y.AfS172S0100000_3;
import Y.AfS197S0100000_28;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadTokenParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadTokenResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS63S0100100_3;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.Video;

/* JADX INFO: renamed from: X.157q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204692157q {
    public static final C204692157q LIZ = new C204692157q();

    public static String LIZLLL(Video video) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(video.vid);
        sbLIZ.append(".mp4");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZ(Context context, String str) {
        Boolean boolValueOf;
        boolean z;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C2112608Pk.LJII(context));
        sbLIZ2.append("/linkmic_avatar/");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(str);
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).exists();
    }

    public static boolean LIZIZ(Context context, Avatar avatar) {
        String strLIZLLL;
        Video video = avatar.videoDynamic;
        String strLIZLLL2 = null;
        if (video != null) {
            strLIZLLL = LIZLLL(video);
        } else {
            strLIZLLL = null;
        }
        if (LIZ(context, strLIZLLL)) {
            Video video2 = avatar.videoStatic;
            if (video2 != null) {
                strLIZLLL2 = LIZLLL(video2);
            }
            if (LIZ(context, strLIZLLL2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJ(String str, InterfaceC1631620sYq interfaceC1631620sYq) {
        Boolean boolValueOf;
        long id;
        long jLongValue;
        String strU3;
        C238400w2 c238400w2 = new C238400w2();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C142M c142m = new C142M(str, c238400w2, interfaceC1631620sYq, jCurrentTimeMillis);
        GetUploadTokenResponse.ResponseData responseData = C1870330ylr.LIZ;
        Object c098200Yq = null;
        if (responseData != null) {
            boolean z = false;
            if (responseData.accessKey.length() > 0 && responseData.secretKey.length() > 0 && responseData.sessionToken.length() > 0 && C158B.LIZJ() < responseData.expiredTime) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            c142m.invoke();
            return;
        }
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(c142m, 765);
        AwS63S0100100_3 awS63S0100100_3 = new AwS63S0100100_3(jCurrentTimeMillis, interfaceC1631620sYq, 1);
        GetUploadTokenParams getUploadTokenParams = new GetUploadTokenParams();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        getUploadTokenParams.roomId = id;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null) {
                c098200Yq = Long.valueOf(CastLongProtector.parseLong(strU3));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            Long l = (Long) c098200Yq;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            getUploadTokenParams.channelId = jLongValue;
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            getUploadTokenParams.channelId = 0L;
        }
        getUploadTokenParams.scene = 1;
        C20441214yg.LIZIZ("ImageUploadUtil", "getUploadToken");
        C480460Ism.LIZ().getClass();
        ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).getUploadToken(getUploadTokenParams).LJFF(new C0UO0()).LJJIIZ(new AfS197S0100000_28(awS572S0100000_28, 72), new AfS172S0100000_3(awS63S0100100_3, 46));
    }

    public static Object LIZJ(final int i, final AbstractC1529700puS abstractC1529700puS, final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2, final AtomicInteger atomicInteger3, final AtomicReference atomicReference, InterfaceC1364105Vn interfaceC1364105Vn, final Video video) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (video == null) {
            C189200o6.m2constructorimpl(false);
            c23260099m.resumeWith(false);
        } else {
            Context contextLJII = C497740JfY.LJII();
            LIZ.getClass();
            if (LIZ(contextLJII, LIZLLL(video))) {
                if (i == 0) {
                    atomicInteger.set(100);
                } else {
                    atomicInteger2.set(100);
                }
                C189200o6.m2constructorimpl(true);
                c23260099m.resumeWith(true);
            } else {
                DownloadTask downloadTaskWith = C2200151B8z.with(contextLJII);
                downloadTaskWith.url(video.url);
                downloadTaskWith.name(LIZLLL(video));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C2112608Pk.LJII(contextLJII));
                sbLIZ.append("/linkmic_avatar/");
                downloadTaskWith.savePath(C2188811AlT.LIZIZ(sbLIZ));
                downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.0puR
                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onProgress(DownloadInfo downloadInfo) {
                        super.onProgress(downloadInfo);
                        if (i == 0) {
                            atomicInteger.set(downloadInfo.getDownloadProcess());
                        } else {
                            atomicInteger2.set(downloadInfo.getDownloadProcess());
                        }
                        int i2 = (atomicInteger.get() + atomicInteger2.get()) / 2;
                        AbstractC1529700puS abstractC1529700puS2 = abstractC1529700puS;
                        if (abstractC1529700puS2 != null) {
                            abstractC1529700puS2.LIZIZ(i2);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("on progress vid=");
                        sbLIZ2.append(video.vid);
                        sbLIZ2.append(" ,total=");
                        sbLIZ2.append(i2);
                        C20441214yg.LIZIZ("AvatarResourceManager", C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        super.onSuccessed(downloadInfo);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("on successes vid=");
                        sbLIZ2.append(video.vid);
                        C20441214yg.LIZIZ("AvatarResourceManager", C2188811AlT.LIZIZ(sbLIZ2));
                        if (i == 0) {
                            atomicInteger.set(100);
                        } else {
                            atomicInteger2.set(100);
                        }
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn2.resumeWith(bool);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        super.onFailed(downloadInfo, baseException);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("on fail code=");
                        sbLIZ2.append(baseException.getErrorCode());
                        sbLIZ2.append(" msg=");
                        sbLIZ2.append(baseException.getErrorMessage());
                        C20441214yg.LJ("AvatarResourceManager", C2188811AlT.LIZIZ(sbLIZ2));
                        atomicInteger3.set(baseException.getErrorCode());
                        atomicReference.set(baseException.getErrorMessage());
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                        Boolean bool = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn2.resumeWith(bool);
                    }
                });
                downloadTaskWith.download();
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
