package X;

import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.HeaderView;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PanelButtons;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupElementsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupFiltersConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19208510Ct implements InterfaceC888860Ytw {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public boolean LIZIZ;
    public boolean LIZJ;

    @Override // X.InterfaceC888860Ytw
    public final EnumC610450Nwx getType() {
        return EnumC610450Nwx.GUIDE_OPEN_PUSH_PERMISSION;
    }

    public static boolean LIZ(Map map) {
        Integer num;
        Integer num2;
        if (map == null || (num = (Integer) map.get("in_app_im_msg_req_push")) == null || num.intValue() != 1 || (num2 = (Integer) map.get("in_app_im_push")) == null || num2.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static void LIZJ(Context context) {
        C19EG c19eg;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            C1481605r4.LIZIZ(new ARunnableS112S0100000_12(c19eg, 419));
        }
    }

    @Override // X.InterfaceC888860Ytw
    public final void LJI(Context context) {
        if (this.LIZIZ) {
            boolean z = this.LIZJ;
            this.LIZJ = false;
            this.LIZIZ = false;
            if (C824390WVp.LIZJ(context)) {
                C23250099c.LIZLLL(this.LIZ, null, null, new C10DG(z, this, context, null), 3);
                return;
            }
            if (z) {
                LIZJ(context);
                return;
            }
            IIMErrorUtils.LIZ.getClass();
            IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
            if (iIMErrorUtilsLIZ == null) {
                return;
            }
            iIMErrorUtilsLIZ.LIZIZ(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.10D1] */
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
    @Override // X.InterfaceC888860Ytw
    public final void LJII(final Context context) {
        UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ;
        PopupInstanceConfig popupInstanceConfig;
        View viewSd = C786410Ut5.Sd(R.layout.cqn, C786410Ut5.ne(context), null);
        TextView textView = (TextView) viewSd.findViewById(R.id.o90);
        if (textView != null) {
            textView.setText(context.getResources().getQuantityText(2131755129, 1));
        }
        View viewFindViewById = viewSd.findViewById(R.id.o8z);
        if (viewFindViewById != null) {
            viewFindViewById.measure(0, 0);
            if (viewFindViewById.getMeasuredWidth() > viewFindViewById.getMinimumWidth()) {
                viewFindViewById.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), viewSd.getPaddingTop(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), viewSd.getPaddingBottom());
            }
        }
        if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
            IUniAuthGuidePopupApi iUniAuthGuidePopupApi = (IUniAuthGuidePopupApi) PluggableExtentionKt.pluggableSpi$default(IUniAuthGuidePopupApi.class, false, false, false, 14, null);
            if (iUniAuthGuidePopupApi != null && (unifiedAuthPopupConfigLIZJ = iUniAuthGuidePopupApi.LIZJ("im_message_request")) != null) {
                unifiedAuthPopupConfigLIZJ.setSceneId("im_message_request");
                unifiedAuthPopupConfigLIZJ.setEnterFrom("non_filtered_message_request");
                List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                    popupInstanceConfig.setPopupCombinationType(1);
                    if (Intrinsics.LJFF(popupInstanceConfig.panelType, "customized_ui")) {
                        PopupElementsConfig popupElementsConfig = popupInstanceConfig.popupElementsConfig;
                        popupElementsConfig.setTitle(C1383370m6R.LJIIJ(2131828211));
                        popupElementsConfig.setDescription(C1383370m6R.LJIIJ(2131828208));
                        popupElementsConfig.setSubtitle("");
                        HeaderView headerView = new HeaderView(-1, null, 0.2f, null, -1, -2, -1.0d, 48, null);
                        headerView.setCustomizedView(viewSd);
                        popupElementsConfig.setHeader(headerView);
                        popupElementsConfig.setButtons(new PanelButtons(C1383370m6R.LJIIJ(2131828209), C1383370m6R.LJIIJ(2131828210), false));
                        popupElementsConfig.setShowCloseIcon(true);
                        popupElementsConfig.setHideDetailIcon(true);
                        popupElementsConfig.setUsersList(null);
                    }
                    PopupFiltersConfig popupFiltersConfig = popupInstanceConfig.popupFiltersConfig;
                    popupFiltersConfig.setPushSysPermissionStatusCheck(-1);
                    popupFiltersConfig.setEnableUnifiedFreqCtrlSettings(false);
                }
                IUniAuthGuidePopupApi iUniAuthGuidePopupApi2 = (IUniAuthGuidePopupApi) PluggableExtentionKt.pluggableSpi$default(IUniAuthGuidePopupApi.class, false, false, false, 14, null);
                if (iUniAuthGuidePopupApi2 != null) {
                    iUniAuthGuidePopupApi2.LIZLLL(context, new C10DS() { // from class: X.10D0
                        @Override // X.C10DS
                        public final void LIZ(String str) {
                        }

                        @Override // X.C10DS
                        public final void onShow(int i) {
                        }

                        @Override // X.C10DS
                        public final void LIZIZ(int i, AbstractC343940De4 abstractC343940De4) {
                            long jCurrentTimeMillis;
                            C10CX c10cx = C10CX.LIZ;
                            if (Intrinsics.LJFF(abstractC343940De4, c10cx)) {
                                jCurrentTimeMillis = Long.MAX_VALUE;
                            } else {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            C12859051l.LIZIZ(jCurrentTimeMillis);
                            if (Intrinsics.LJFF(abstractC343940De4, c10cx)) {
                                if (C824390WVp.LIZJ(context)) {
                                    C19208510Ct c19208510Ct = this;
                                    C23250099c.LIZLLL(c19208510Ct.LIZ, null, null, new C10DH(c19208510Ct, context, null), 3);
                                } else {
                                    C19208510Ct c19208510Ct2 = this;
                                    C23250099c.LIZLLL(c19208510Ct2.LIZ, null, null, new C10DJ(c19208510Ct2, null), 3);
                                    this.LIZIZ = true;
                                }
                            }
                        }
                    }, unifiedAuthPopupConfigLIZJ);
                    return;
                }
                return;
            }
            return;
        }
        C19212010Ec.LIZJ.LLFF(context, new C1917290zzb(null, "non_filtered_message_request", null, "im_message_request", null, null, new C10CT(C1383370m6R.LJIIJ(2131828211), C1383370m6R.LJIIJ(2131828208), new C10CU(0, viewSd, new C19M3(-1), -1.0d, 48), true, new C10CZ(C1383370m6R.LJIIJ(2131828209), C1383370m6R.LJIIJ(2131828210)), 40), new C1917340zzg(true, true), null, 6645), new C10DS() { // from class: X.10D1
            @Override // X.C10DS
            public final void LIZ(String str) {
            }

            @Override // X.C10DS
            public final void onShow(int i) {
            }

            @Override // X.C10DS
            public final void LIZIZ(int i, AbstractC343940De4 abstractC343940De4) {
                long jCurrentTimeMillis;
                C10CX c10cx = C10CX.LIZ;
                if (Intrinsics.LJFF(abstractC343940De4, c10cx)) {
                    jCurrentTimeMillis = Long.MAX_VALUE;
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                C12859051l.LIZIZ(jCurrentTimeMillis);
                if (Intrinsics.LJFF(abstractC343940De4, c10cx)) {
                    if (C824390WVp.LIZJ(context)) {
                        C19208510Ct c19208510Ct = this;
                        C23250099c.LIZLLL(c19208510Ct.LIZ, null, null, new C10DI(c19208510Ct, context, null), 3);
                    } else {
                        C19208510Ct c19208510Ct2 = this;
                        C23250099c.LIZLLL(c19208510Ct2.LIZ, null, null, new C10DK(c19208510Ct2, null), 3);
                        this.LIZIZ = true;
                    }
                }
            }
        });
    }

    public static boolean LIZIZ(Context context, Map map) {
        Integer num;
        Integer num2;
        Integer num3;
        if (map == null || (num = (Integer) map.get("im_msg_req_push")) == null || num.intValue() != 1 || (num2 = (Integer) map.get("im_push")) == null || num2.intValue() != 1 || (num3 = (Integer) map.get("im_push_select")) == null || num3.intValue() != 0 || !C824390WVp.LIZJ(context)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC888860Ytw
    public final Object LJIIIIZZ(Context context, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean z;
        long jCurrentTimeMillis;
        Long lLJIILIIL;
        C061D c061dLJIILIIL;
        if (C888810Ytr.LIZ(this)) {
            return true;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "message_request_push_settings_page_on", true, false)) {
            C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
            if (c19328310jZ.LIZLLL("im_msg_req_push") != 0) {
                z = true;
            } else {
                z = false;
            }
            if (c19328310jZ.LIZLLL("in_app_im_msg_req_push") == 0 && !z) {
                if (AnonymousClass0610.LIZ()) {
                    IIMBusinessChatService.LIZ.getClass();
                    IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
                    if (iIMBusinessChatService == null || (c061dLJIILIIL = iIMBusinessChatService.LJIILIIL()) == null || !c061dLJIILIIL.LIZ(C061C.MESSAGE_REQUEST_PUSH_GUIDE_POPUP)) {
                        return false;
                    }
                } else {
                    IMContactApi.LIZ.getClass();
                    C1BGS c1bgsLJ = C069P.LIZ().LJ();
                    String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    if (!C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJFF().LJI(c1bgsLJ.LJ(curUserId, null))) {
                        return false;
                    }
                }
                String[] stringArray = C12859051l.LIZ().getStringArray("message_request_push_turn_on_guide_ignore_timestamp", new String[0]);
                if (stringArray.length < 2) {
                    String str = (String) C13LQ.LJJJJIZL(stringArray);
                    if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                        jCurrentTimeMillis = System.currentTimeMillis() - lLJIILIIL.longValue();
                    } else {
                        jCurrentTimeMillis = Long.MAX_VALUE;
                    }
                    if (jCurrentTimeMillis >= TimeUnit.DAYS.toMillis(14L)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
