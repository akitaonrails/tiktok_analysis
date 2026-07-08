package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.api.AnchorAutoSelectionResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ov8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634800Ov8 extends AbstractC602320Njq {
    public final C19EG LIZJ(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZJ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void LIZLLL(final InterfaceC634810Ov9 interfaceC634810Ov9) {
        Integer numValueOf;
        String anchorSourceType;
        final String extra;
        if (interfaceC634810Ov9 != null) {
            Number actionType = interfaceC634810Ov9.getActionType();
            if (actionType != null) {
                numValueOf = Integer.valueOf(actionType.intValue());
            } else {
                numValueOf = null;
                if (interfaceC634810Ov9 == null) {
                    anchorSourceType = null;
                    extra = null;
                }
                if (numValueOf == null && numValueOf.intValue() == 1 && C123100dR.LIZ(anchorSourceType)) {
                    C312890COh c312890COh = InterfaceC860020XoW.LIZ;
                    String clientKey = interfaceC634810Ov9.getClientKey();
                    c312890COh.getClass();
                    C312890COh.LIZIZ.LIZ(clientKey, extra, anchorSourceType, 4, null).LJ(new InterfaceC2385309Wh() { // from class: X.11i0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r7v0, types: [T, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder] */
                        /* JADX WARN: Type inference failed for: r8v4, types: [T, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder] */
                        @Override // X.InterfaceC2385309Wh
                        public final Object then(C15O7 c15o7) {
                            List<String> list;
                            String str;
                            int iIntValue;
                            Context context;
                            IExternalService iExternalService;
                            boolean zBooleanValue;
                            Integer num;
                            Integer num2;
                            C1C7U.LIZ("ShareOpenPlatformMethod@6e00.process$1");
                            AnchorAutoSelectionResponse anchorAutoSelectionResponse = (AnchorAutoSelectionResponse) c15o7.LJIIL();
                            if (anchorAutoSelectionResponse.status == 0) {
                                CreateAnchorInfo createAnchorInfo = anchorAutoSelectionResponse.anchor;
                                UrlModel urlModel = new UrlModel();
                                com.ss.android.ugc.aweme.api.UrlModel urlModel2 = anchorAutoSelectionResponse.addedIcon;
                                String keyword = null;
                                if (urlModel2 != null) {
                                    list = urlModel2.urlList;
                                } else {
                                    list = null;
                                }
                                urlModel.setUrlList(list);
                                com.ss.android.ugc.aweme.api.UrlModel urlModel3 = anchorAutoSelectionResponse.addedIcon;
                                if (urlModel3 != null) {
                                    str = urlModel3.uri;
                                } else {
                                    str = null;
                                }
                                urlModel.setUri(str);
                                com.ss.android.ugc.aweme.api.UrlModel urlModel4 = anchorAutoSelectionResponse.addedIcon;
                                int iIntValue2 = 0;
                                if (urlModel4 != null && (num2 = urlModel4.width) != null) {
                                    iIntValue = num2.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                urlModel.setWidth(iIntValue);
                                com.ss.android.ugc.aweme.api.UrlModel urlModel5 = anchorAutoSelectionResponse.addedIcon;
                                if (urlModel5 != null && (num = urlModel5.height) != null) {
                                    iIntValue2 = num.intValue();
                                }
                                urlModel.setHeight(iIntValue2);
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("shoot_way", "jsb");
                                c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
                                c2344009Gk.LJIIIIZZ("anchor_type", "game");
                                if (createAnchorInfo != null) {
                                    keyword = createAnchorInfo.getKeyword();
                                }
                                c2344009Gk.LJIIIIZZ("anchor_entry", keyword);
                                C20684815ws.LJIILLIIL("choose_anchor", c2344009Gk.LIZ);
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                C201955140j.LJIILJJIL(C20102213l6.LIZIZ, "click to open camera");
                                C19573611i2.LIZ = System.currentTimeMillis();
                                C259800zU c259800zU = new C259800zU();
                                ?? builder = new RecordConfig.Builder();
                                builder.creationId(UUID.randomUUID().toString());
                                builder.shootWay("direct_shoot");
                                builder.groupId(C1398110mUD.LIZIZ);
                                builder.fromMain(true);
                                builder.startRecordTime(jCurrentTimeMillis);
                                builder.musicType(1);
                                builder.translationType(C298070BmH.LIZ());
                                builder.enterFrom(interfaceC634810Ov9.getEnterFrom());
                                builder.enterMethod(interfaceC634810Ov9.getEnterMethod());
                                c259800zU.element = builder;
                                if (createAnchorInfo != null) {
                                    String str2 = extra;
                                    InterfaceC634810Ov9 interfaceC634810Ov92 = interfaceC634810Ov9;
                                    int type = createAnchorInfo.getType();
                                    String content = createAnchorInfo.getContent();
                                    String keyword2 = createAnchorInfo.getKeyword();
                                    String url = createAnchorInfo.getUrl();
                                    String extra2 = createAnchorInfo.getExtra();
                                    Boolean bool = anchorAutoSelectionResponse.canRemove;
                                    if (bool != null) {
                                        zBooleanValue = bool.booleanValue();
                                    } else {
                                        zBooleanValue = true;
                                    }
                                    AnchorTransData anchorTransData = new AnchorTransData(type, content, keyword2, "", 4, "", urlModel, zBooleanValue, url, "", Long.MAX_VALUE, extra2, "", true, null, null, null, null, 0, -1, null, null);
                                    ?? r8 = (RecordConfig.Builder) c259800zU.element;
                                    r8.setAutoSelectedAnchor(anchorTransData);
                                    r8.setOpenPlatformExtra(str2);
                                    r8.setOpenPlatformClientKey(interfaceC634810Ov92.getClientKey());
                                    c259800zU.element = r8;
                                }
                                C634800Ov8 c634800Ov8 = this;
                                RecordConfig.Builder builder2 = (RecordConfig.Builder) c259800zU.element;
                                String str3 = extra;
                                InterfaceC634810Ov9 interfaceC634810Ov93 = interfaceC634810Ov9;
                                c634800Ov8.getClass();
                                if (createAnchorInfo == null && Intrinsics.LJFF(interfaceC634810Ov93.getEnterMethod(), "game_reward_plan_page")) {
                                    builder2.setOpenPlatformExtra(str3);
                                    builder2.shootWay(interfaceC634810Ov93.getEnterFrom());
                                }
                                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                                if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) != null) {
                                    iExternalService.asyncServiceForMainRecordService(context, "direct_shoot", new C1620680sHC(this, context, c259800zU, 3));
                                }
                            }
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("ShareOpenPlatformMethod@6e00.process$1");
                            return unit;
                        }
                    }, C15O7.LJIIIIZZ, null);
                    return;
                }
                return;
            }
            anchorSourceType = interfaceC634810Ov9.getAnchorSourceType();
            extra = interfaceC634810Ov9.getExtra();
            if (numValueOf == null) {
            }
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC634810Ov9 interfaceC634810Ov9 = (InterfaceC634810Ov9) xBaseParamModel;
        if (!C0XQ7.LJFF().isLogin()) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZ = activityLIZLLL;
                c0xqs.LIZIZ = interfaceC634810Ov9.getEnterFrom();
                c0xqs.LIZJ = interfaceC634810Ov9.getEnterMethod();
                c0xqs.LJ = new C638930P4h(this, interfaceC634810Ov9, 1);
                C0XQ7.LIZJ().showLoginAndRegisterView(c0xqs.LIZ());
                return;
            }
            return;
        }
        LIZLLL(interfaceC634810Ov9);
    }
}
