package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.PreviewConfig;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinResponseV2;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0i7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1230380i7g extends C2217421BqW implements Function0<Unit> {
    public C1230380i7g(Object obj) {
        super(0, obj, C1692806k2.class, "handleTryJoin", "handleTryJoin()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C19EG activity;
        Map<String, String> mapLJ;
        Fragment fragment;
        final C1692806k2 c1692806k2 = (C1692806k2) this.receiver;
        C1600706On c1600706On = c1692806k2.LLILZ;
        final Context context = c1600706On.LIZJ;
        if (context != null && ((activity = c1600706On.LIZLLL) != null || ((fragment = c1600706On.LJ) != null && (activity = fragment.getActivity()) != null))) {
            SessionInfo sessionInfo = c1692806k2.LLILZ.LJI;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(sessionInfo.getConversationId());
            if (lLJIILIIL != null) {
                final long jLongValue = lLJIILIIL.longValue();
                C1230520i7u c1230520i7u = C899340ZPw.LIZIZ.get(Long.valueOf(jLongValue));
                if (c1230520i7u != null) {
                    Set<String> set = C06KF.LIZ;
                    PreviewConfig previewConfig = sessionInfo.getPreviewConfig();
                    if (previewConfig == null || (mapLJ = previewConfig.previewMobParams) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    C830490Whz c830490WhzLIZ = C06KF.LIZ(sessionInfo);
                    c830490WhzLIZ.put("enter_from", "group_preview_page");
                    c830490WhzLIZ.put("enter_method", "preview_join_btn");
                    String str = mapLJ.get("enter_from");
                    if (str == null) {
                        str = "";
                    }
                    c830490WhzLIZ.put("previous_page", str);
                    C06KF.LIZIZ("ttsocial_group_join_btn_click", c830490WhzLIZ);
                    new C1230060i7A(context, c1230520i7u.LIZIZ, null, c1230520i7u.LIZJ, c1230520i7u.LIZ).LIZJ(new AbstractC1230100i7E() { // from class: X.0i7h
                        @Override // X.AbstractC1230100i7E
                        public final void LIZJ() {
                        }

                        @Override // X.AbstractC1230100i7E
                        public final void LIZ(String str2, C0YMW c0ymw) {
                            if (str2 == null || !(!a0.LJJJIL(str2))) {
                                str2 = context.getString(2131835079);
                            }
                            C1389890mGx c1389890mGx = new C1389890mGx(activity);
                            c1389890mGx.LJIIJ(str2);
                            c1389890mGx.LJIIJJI();
                        }

                        @Override // X.AbstractC1230100i7E
                        public final void LIZIZ(EnumC1229960i70 enumC1229960i70, GroupJoinResponseV2 groupJoinResponseV2) {
                            C1706506mF c1706506mF;
                            PopupDisplayMeta popupDisplayMeta = groupJoinResponseV2.popupMeta;
                            InterfaceC1230340i7c interfaceC1230340i7c = C899340ZPw.LIZ.get(Long.valueOf(popupDisplayMeta.groupInfo.convShortId));
                            if (interfaceC1230340i7c != null) {
                                interfaceC1230340i7c.LIZ(popupDisplayMeta);
                            }
                            int i = C1230600i82.LIZ[enumC1229960i70.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    String string = groupJoinResponseV2.toastMeta.text;
                                    if (!(!a0.LJJJIL(string)) || string == null) {
                                        string = context.getString(2131835079);
                                    }
                                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                    c1389890mGx.LJIIJ(string);
                                    c1389890mGx.LJIIJJI();
                                    return;
                                }
                                C899340ZPw.LIZIZ.remove(Long.valueOf(jLongValue));
                                C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                                c1389890mGx2.LJIIJ(activity.getString(2131830202));
                                c1389890mGx2.LJIIJJI();
                                View view = c1692806k2.LLILLL;
                                if (!(view instanceof C1706506mF) || (c1706506mF = (C1706506mF) view) == null) {
                                    return;
                                }
                                c1706506mF.h0();
                                return;
                            }
                            C899340ZPw.LIZIZ.remove(Long.valueOf(jLongValue));
                            C1692806k2 c1692806k22 = c1692806k2;
                            c1692806k22.getClass();
                            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJFF(c1692806k22.LLILZ.LJI.getConversationId());
                            IMWebSocketBridgeApi.LIZ.getClass();
                            IMWebSocketBridgeApi iMWebSocketBridgeApiLIZ = C892310YzV.LIZ();
                            if (iMWebSocketBridgeApiLIZ == null) {
                                return;
                            }
                            iMWebSocketBridgeApiLIZ.LIZ();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(null);
                        }
                    });
                }
            }
        }
        return Unit.LIZ;
    }
}
