package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
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
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Or5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632290Or5 extends AbstractC602340Njs {
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;

    public final C19EG LIZJ(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZJ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void LIZLLL(InterfaceC602360Nju interfaceC602360Nju) {
        int iIntValue = interfaceC602360Nju.getActionType().intValue();
        String anchorSourceType = interfaceC602360Nju.getAnchorSourceType();
        final String extra = interfaceC602360Nju.getExtra();
        if (iIntValue == 1 && C123100dR.LIZ(anchorSourceType)) {
            C312890COh c312890COh = InterfaceC860020XoW.LIZ;
            String str = this.LLILZIL;
            c312890COh.getClass();
            final C15O7<AnchorAutoSelectionResponse> c15o7LIZ = C312890COh.LIZIZ.LIZ(str, extra, anchorSourceType, 4, null);
            c15o7LIZ.LJ(new InterfaceC2385309Wh() { // from class: X.11hz
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v0, types: [T, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder] */
                /* JADX WARN: Type inference failed for: r9v3, types: [T, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder] */
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    List<String> list;
                    String str2;
                    int iIntValue2;
                    int iIntValue3;
                    boolean z;
                    Context context;
                    boolean zBooleanValue;
                    Integer num;
                    Integer num2;
                    C1C7U.LIZ("ShareOpenPlatformMethod@e00d.process$1");
                    AnchorAutoSelectionResponse anchorAutoSelectionResponseLJIIL = c15o7LIZ.LJIIL();
                    if (anchorAutoSelectionResponseLJIIL.status == 0) {
                        CreateAnchorInfo createAnchorInfo = anchorAutoSelectionResponseLJIIL.anchor;
                        UrlModel urlModel = new UrlModel();
                        com.ss.android.ugc.aweme.api.UrlModel urlModel2 = anchorAutoSelectionResponseLJIIL.addedIcon;
                        String keyword = null;
                        if (urlModel2 != null) {
                            list = urlModel2.urlList;
                        } else {
                            list = null;
                        }
                        urlModel.setUrlList(list);
                        com.ss.android.ugc.aweme.api.UrlModel urlModel3 = anchorAutoSelectionResponseLJIIL.addedIcon;
                        if (urlModel3 != null) {
                            str2 = urlModel3.uri;
                        } else {
                            str2 = null;
                        }
                        urlModel.setUri(str2);
                        com.ss.android.ugc.aweme.api.UrlModel urlModel4 = anchorAutoSelectionResponseLJIIL.addedIcon;
                        if (urlModel4 != null && (num2 = urlModel4.width) != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        urlModel.setWidth(iIntValue2);
                        com.ss.android.ugc.aweme.api.UrlModel urlModel5 = anchorAutoSelectionResponseLJIIL.addedIcon;
                        if (urlModel5 != null && (num = urlModel5.height) != null) {
                            iIntValue3 = num.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        urlModel.setHeight(iIntValue3);
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
                        builder.enterFrom(this.LLILLL);
                        builder.enterMethod(this.LLILZ);
                        c259800zU.element = builder;
                        if (createAnchorInfo != null) {
                            String str3 = extra;
                            C632290Or5 c632290Or5 = this;
                            int type = createAnchorInfo.getType();
                            String content = createAnchorInfo.getContent();
                            String keyword2 = createAnchorInfo.getKeyword();
                            String url = createAnchorInfo.getUrl();
                            String extra2 = createAnchorInfo.getExtra();
                            Boolean bool = anchorAutoSelectionResponseLJIIL.canRemove;
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = true;
                            }
                            z = false;
                            AnchorTransData anchorTransData = new AnchorTransData(type, content, keyword2, "", 4, "", urlModel, zBooleanValue, url, "", Long.MAX_VALUE, extra2, "", true, null, null, null, null, 0, -1, null, null);
                            ?? r9 = (RecordConfig.Builder) c259800zU.element;
                            r9.setAutoSelectedAnchor(anchorTransData);
                            r9.setOpenPlatformExtra(str3);
                            r9.setOpenPlatformClientKey(c632290Or5.LLILZIL);
                            c259800zU.element = r9;
                        } else {
                            z = false;
                        }
                        C632290Or5 c632290Or52 = this;
                        RecordConfig.Builder builder2 = (RecordConfig.Builder) c259800zU.element;
                        String str4 = extra;
                        if (createAnchorInfo != null) {
                            c632290Or52.getClass();
                        } else if (u.LJIJI(c632290Or52.LLILZ, "game_reward_plan_page", z)) {
                            builder2.setOpenPlatformExtra(str4);
                            builder2.shootWay(c632290Or52.LLILLL);
                        }
                        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                            C632290Or5 c632290Or53 = this;
                            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                            if (iExternalService != null) {
                                iExternalService.asyncServiceForMainRecordService(context, "direct_shoot", new C1620680sHC(c632290Or53, context, c259800zU, 1));
                            }
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ShareOpenPlatformMethod@e00d.process$1");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC602360Nju interfaceC602360Nju = (InterfaceC602360Nju) xBaseParamModel;
        try {
            this.LLILZIL = interfaceC602360Nju.getClientKey();
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            this.LLILLL = interfaceC602360Nju.getEnterFrom();
            this.LLILZ = interfaceC602360Nju.getEnterMethod();
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (!C0XQ7.LJFF().isLogin()) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZ = activityLIZLLL;
                c0xqs.LIZIZ = this.LLILLL;
                c0xqs.LIZJ = this.LLILZ;
                c0xqs.LJ = new C638930P4h(this, interfaceC602360Nju, 0);
                C0XQ7.LIZJ().showLoginAndRegisterView(c0xqs.LIZ());
                return;
            }
            return;
        }
        LIZLLL(interfaceC602360Nju);
    }
}
