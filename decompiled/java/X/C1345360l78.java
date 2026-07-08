package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;

/* JADX INFO: renamed from: X.0l78, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345360l78 {
    public static CommentImageUploadAuth LIZ;
    public static String LIZIZ = C1345310l73.LIZ();

    public final void LIZ(AudioCommentModel audioCommentModel, final CommentImageUploadAuth commentImageUploadAuth, final InterfaceC1355180lMy interfaceC1355180lMy, final long j) {
        if (commentImageUploadAuth == null) {
            interfaceC1355180lMy.LIZIZ(-1L, 0L, System.currentTimeMillis() - j, "upload error auth is null!");
        } else {
            C11NZ.LJIJJLI(new C1402320mb0(audioCommentModel, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.1B1v
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CommentAudioUploadController@7d6e.doAudioUpload$2");
                    final String str = (String) obj;
                    boolean zEnableBoe = false;
                    if (str != null && str.length() != 0) {
                        C1345360l78 c1345360l78 = this;
                        CommentImageUploadAuth commentImageUploadAuth2 = commentImageUploadAuth;
                        final InterfaceC1355180lMy interfaceC1355180lMy2 = interfaceC1355180lMy;
                        final long j2 = j;
                        c1345360l78.getClass();
                        final BDVideoUploader bDVideoUploader = new BDVideoUploader();
                        bDVideoUploader.setUploadDomain(commentImageUploadAuth2.getUploadDomain());
                        bDVideoUploader.setSpaceName(commentImageUploadAuth2.getServiceId());
                        bDVideoUploader.setBusinessTag("comment_audio");
                        bDVideoUploader.setTopSecretKey(commentImageUploadAuth2.getSecretKey());
                        bDVideoUploader.setTopAccessKey(commentImageUploadAuth2.getAccessKey());
                        bDVideoUploader.setTopSessionToken(commentImageUploadAuth2.getSessionToken());
                        bDVideoUploader.setEnableLogCallBack(true);
                        bDVideoUploader.setPathName(str);
                        LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
                        if (localTestApi != null) {
                            zEnableBoe = localTestApi.enableBoe();
                        }
                        bDVideoUploader.setOpenBoe(zEnableBoe);
                        bDVideoUploader.setListener(new BDVideoUploaderListener() { // from class: X.0lMx
                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final String getStringFromExtern(int i) {
                                return "";
                            }

                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final void onLog(int i, int i2, String str2) {
                            }

                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final void onUploadVideoStage(int i, long j3) {
                            }

                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final int videoUploadCheckNetState(int i, int i2) {
                                return 0;
                            }

                            @Override // com.ss.bduploader.BDVideoUploaderListener
                            public final void onNotify(int i, long j3, BDVideoInfo bDVideoInfo) {
                                String str2;
                                Long lValueOf;
                                String str3;
                                Long lValueOf2;
                                String strLIZIZ;
                                String str4 = null;
                                if (i != 0) {
                                    long j4 = 0;
                                    if (i != 2) {
                                        if (i == 3) {
                                            InterfaceC1355180lMy interfaceC1355180lMy3 = interfaceC1355180lMy2;
                                            if (bDVideoInfo != null) {
                                                j4 = bDVideoInfo.mErrorCode;
                                            }
                                            interfaceC1355180lMy3.LIZIZ(1007L, j4, System.currentTimeMillis() - j2, "upload cancelled");
                                            bDVideoUploader.close();
                                            return;
                                        }
                                        return;
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("upload fail, code: ");
                                    if (bDVideoInfo != null) {
                                        lValueOf = Long.valueOf(bDVideoInfo.mErrorCode);
                                    } else {
                                        lValueOf = null;
                                    }
                                    sbLIZ.append(lValueOf);
                                    sbLIZ.append(" msg: ");
                                    if (bDVideoInfo != null) {
                                        str3 = bDVideoInfo.mErrorMsg;
                                    } else {
                                        str3 = null;
                                    }
                                    sbLIZ.append(str3);
                                    sbLIZ.append(' ');
                                    C1344030l4z.LIZJ("CommentAudioUploadController", C2188811AlT.LIZIZ(sbLIZ));
                                    InterfaceC1355180lMy interfaceC1355180lMy4 = interfaceC1355180lMy2;
                                    if (bDVideoInfo == null || (strLIZIZ = bDVideoInfo.mErrorMsg) == null) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("upload failed inner code: ");
                                        if (bDVideoInfo != null) {
                                            lValueOf2 = Long.valueOf(bDVideoInfo.mErrorCode);
                                        } else {
                                            lValueOf2 = null;
                                        }
                                        sbLIZ2.append(lValueOf2);
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                    }
                                    if (bDVideoInfo != null) {
                                        j4 = bDVideoInfo.mErrorCode;
                                    }
                                    interfaceC1355180lMy4.LIZIZ(1006L, j4, System.currentTimeMillis() - j2, strLIZIZ);
                                    if (bDVideoInfo != null && bDVideoInfo.mErrorCode == 100013) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("cmt_audio_auth_");
                                        CommentImageUploadAuth commentImageUploadAuth3 = C1345360l78.LIZ;
                                        sbLIZ3.append(C1345310l73.LIZ());
                                        C0TSK.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                        C1345360l78.LIZ = null;
                                    }
                                    bDVideoUploader.close();
                                    return;
                                }
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("upload complete, vid: ");
                                if (bDVideoInfo != null) {
                                    str4 = bDVideoInfo.mVideoId;
                                }
                                sbLIZ4.append(str4);
                                C1344030l4z.LIZJ("CommentAudioUploadController", C2188811AlT.LIZIZ(sbLIZ4));
                                C1352710lIz c1352710lIz = C1352710lIz.LIZ;
                                String str5 = str;
                                c1352710lIz.getClass();
                                C1352710lIz.LIZJ(str5);
                                InterfaceC1355180lMy interfaceC1355180lMy5 = interfaceC1355180lMy2;
                                if (bDVideoInfo == null || (str2 = bDVideoInfo.mVideoId) == null) {
                                    str2 = "";
                                }
                                interfaceC1355180lMy5.LIZ(System.currentTimeMillis() - j2, str2);
                                bDVideoUploader.close();
                            }
                        });
                        try {
                            bDVideoUploader.start();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("start upload failed: ");
                            sbLIZ.append(e.getMessage());
                            interfaceC1355180lMy2.LIZIZ(1008L, 0L, System.currentTimeMillis() - j2, C2188811AlT.LIZIZ(sbLIZ));
                            bDVideoUploader.close();
                        }
                    } else {
                        interfaceC1355180lMy.LIZIZ(1009L, 0L, System.currentTimeMillis() - j, "trimAndCompress failed, path is empty");
                    }
                    C1C7U.LIZIZ("CommentAudioUploadController@7d6e.doAudioUpload$2");
                }
            }, new C09JN() { // from class: X.0l77
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CommentAudioUploadController@7d6e.doAudioUpload$3");
                    Throwable th = (Throwable) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("trimAndCompress error: ");
                    sbLIZ.append(th.getMessage());
                    C1344030l4z.LIZ("CommentAudioUploadController", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1355180lMy interfaceC1355180lMy2 = interfaceC1355180lMy;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "trimAndCompress failed";
                    }
                    interfaceC1355180lMy2.LIZIZ(1010L, 0L, System.currentTimeMillis() - j, message);
                    C1C7U.LIZIZ("CommentAudioUploadController@7d6e.doAudioUpload$3");
                }
            });
        }
    }
}
