package X;

import Y.ARunnableS9S1200000_3;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C538920LBq extends C2217421BqW implements Function2<InterfaceC539120LCk, InnerPushMessage, C20663815tU> {
    public C538920LBq(C538790LBd c538790LBd) {
        super(2, c538790LBd, C538790LBd.class, "updateViewByMessage", "updateViewByMessage(Lcom/ss/android/ugc/aweme/innerpush/api/iface/IInnerPushWindowController;Lcom/ss/android/ugc/aweme/innerpush/api/model/InnerPushMessage;)Lcom/ss/android/ugc/aweme/innerpush/api/model/CustomInnerPushBanner;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C20663815tU invoke(InterfaceC539120LCk interfaceC539120LCk, InnerPushMessage innerPushMessage) {
        Activity activityLIZIZ;
        boolean z;
        String str;
        View view;
        String str2;
        boolean z2;
        final String str3;
        InterfaceC539120LCk interfaceC539120LCk2 = interfaceC539120LCk;
        InnerPushMessage innerPushMessage2 = innerPushMessage;
        C538790LBd c538790LBd = (C538790LBd) this.receiver;
        c538790LBd.getClass();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
            if (innerPushMessage2.getType() != 2397 && innerPushMessage2.getType() != 2449) {
                C419540Gci c419540Gci = new C419540Gci(activityLIZIZ);
                AIGCPushMessage aIGCPushMessageLIZ = C538800LBe.LIZ(innerPushMessage2.getBizExtraJsonStr());
                InnerPushUITemplate uiTemplate = innerPushMessage2.getUiTemplate();
                if (uiTemplate == null || (str2 = uiTemplate.content) == null || !Boolean.valueOf(!a0.LJJJIL(str2)).booleanValue()) {
                    InnerPushUITemplate uiTemplate2 = innerPushMessage2.getUiTemplate();
                    if (uiTemplate2 != null) {
                        str2 = uiTemplate2.title;
                    } else {
                        str2 = null;
                    }
                }
                c419540Gci.setShowString(str2);
                if (innerPushMessage2.getType() != 2500 ? !(aIGCPushMessageLIZ == null || aIGCPushMessageLIZ.statusCode != 3) : !(aIGCPushMessageLIZ == null || aIGCPushMessageLIZ.statusCode != 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c419540Gci.setMessageType(z2);
                if (aIGCPushMessageLIZ != null && (str3 = aIGCPushMessageLIZ.creationId) != null) {
                    C538810LBf c538810LBf = (C538810LBf) ((LinkedHashMap) c538790LBd.LLILLJJLI).get(str3);
                    if (c538810LBf != null) {
                        new C1438570nXT("CheckPointServiceImpl");
                        VideoPublishEditModel videoPublishEditModelLIZJ = C1438570nXT.LIZJ(c538810LBf.LIZIZ, false);
                        C563650M8t c563650M8t = C563650M8t.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateViewByMessage: type=");
                        sbLIZ.append(innerPushMessage2.getType());
                        sbLIZ.append(", isSuccess=");
                        sbLIZ.append(z2);
                        sbLIZ.append(", status=");
                        sbLIZ.append(c538810LBf.LIZ);
                        sbLIZ.append(", creationId=");
                        sbLIZ.append(str3);
                        C201955140j.LIZLLL(c563650M8t, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
                        c538810LBf.LIZLLL = C1416310mxZ.LJJIJ(videoPublishEditModelLIZJ, true);
                        c538810LBf.LJ = C1416310mxZ.LJJIJIIJI(videoPublishEditModelLIZJ, null, true);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateViewByMessage: template id: ");
                        sbLIZ2.append(c538810LBf.LIZLLL);
                        sbLIZ2.append(", template type: ");
                        sbLIZ2.append(c538810LBf.LJ);
                        C201955140j.LIZLLL(c563650M8t, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ2));
                        C538790LBd.LJIILJJIL(c538810LBf);
                        if (innerPushMessage2.getType() == 2500) {
                            final SmartImageView coverImg = c419540Gci.getCoverImg();
                            AwemeDraft awemeDraft = c538810LBf.LIZIZ;
                            Bitmap bitmapLJIILJJIL = C1429670nJ7.LJIILJJIL(videoPublishEditModelLIZJ);
                            if (bitmapLJIILJJIL != null && !bitmapLJIILJJIL.isRecycled()) {
                                coverImg.setImageBitmap(bitmapLJIILJJIL);
                            } else if (awemeDraft != null) {
                                coverImg.setTag(str3);
                                int dimensionPixelOffset = coverImg.getResources().getDimensionPixelOffset(R.dimen.to);
                                C0MZ9.LJIIIIZZ(awemeDraft, new VideoCoverConfig(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888), new IEffectService.OnVideoCoverCallback() { // from class: X.08ls
                                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                                    public final void onGetVideoCoverFailed(int i) {
                                        C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("applyAutoPickCoverToView: loadThumbCover failed, errorCode=");
                                        sbLIZ3.append(i);
                                        sbLIZ3.append(", creationId=");
                                        sbLIZ3.append(str3);
                                        C201955140j.LIZLLL(c563650M8t2, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ3));
                                    }

                                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                                    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                                        SmartImageView smartImageView = coverImg;
                                        HandlerHook.viewPost(smartImageView, new ARunnableS9S1200000_3(bitmap, smartImageView, str3, 1));
                                    }
                                });
                            }
                        } else {
                            c419540Gci.getCoverImg().setImageBitmap(C1429670nJ7.LJIILJJIL(videoPublishEditModelLIZJ));
                        }
                    } else {
                        return null;
                    }
                }
                c419540Gci.setClickAction(new AwS252S0300000_8(innerPushMessage2, aIGCPushMessageLIZ, c538790LBd, 27));
                c419540Gci.setDismissAction(new AwS587S0100000_8(interfaceC539120LCk2, 548));
                view = c419540Gci;
            } else {
                C419310GcL c419310GcL = new C419310GcL(innerPushMessage2.getType(), activityLIZIZ);
                AIGCPushMessage aIGCPushMessageLIZ2 = C538800LBe.LIZ(innerPushMessage2.getBizExtraJsonStr());
                if (aIGCPushMessageLIZ2 != null && aIGCPushMessageLIZ2.statusCode == 3) {
                    z = true;
                } else {
                    z = false;
                }
                c419310GcL.setMessageType(z);
                if (aIGCPushMessageLIZ2 != null && (str = aIGCPushMessageLIZ2.creationId) != null) {
                    C538810LBf c538810LBf2 = (C538810LBf) ((LinkedHashMap) c538790LBd.LLILLJJLI).get(str);
                    if (c538810LBf2 != null) {
                        new C1438570nXT("CheckPointServiceImpl");
                        VideoPublishEditModel videoPublishEditModelLIZJ2 = C1438570nXT.LIZJ(c538810LBf2.LIZIZ, false);
                        c538810LBf2.LIZLLL = C1416310mxZ.LJJIJ(videoPublishEditModelLIZJ2, true);
                        c538810LBf2.LJ = C1416310mxZ.LJJIJIIJI(videoPublishEditModelLIZJ2, null, true);
                        C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("updateViewByMessage: template id: ");
                        sbLIZ3.append(c538810LBf2.LIZLLL);
                        sbLIZ3.append(", template type: ");
                        sbLIZ3.append(c538810LBf2.LJ);
                        C201955140j.LIZLLL(c563650M8t2, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ3));
                        C538790LBd.LJIILJJIL(c538810LBf2);
                        c419310GcL.getCoverImg().setImageBitmap(C1429670nJ7.LJIILJJIL(videoPublishEditModelLIZJ2));
                    } else {
                        return null;
                    }
                }
                c419310GcL.setClickAction(new AwS252S0300000_8(innerPushMessage2, aIGCPushMessageLIZ2, c538790LBd, 26));
                c419310GcL.setDismissAction(new AwS587S0100000_8(interfaceC539120LCk2, 547));
                view = c419310GcL;
            }
            return new C20663815tU(0, view);
        }
        return null;
    }
}
