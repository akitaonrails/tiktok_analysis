package X;

import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterNativePageRenew;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorWhiteBox2Setting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterApiOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterSparkLiteABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab;
import tikcast.api.anchor_data.RealtimeLiveCenterViolationRecordInfo;
import webcast.data.ColdStartStatData;
import webcast.data.RealtimeLLM;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeLiveCenterShopData;
import webcast.data.RealtimeViolationRecord;
import webcast.data.WhiteBoxData;

/* JADX INFO: renamed from: X.1AH2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AH2 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C1AHD LL;
    public final /* synthetic */ C1AH6 LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        int baseFunctionCount = this.LLILLJJLI.getBaseFunctionCount();
        List<RealtimeLiveCenterLayoutTab> list = this.LLILLJJLI.LLJ;
        return baseFunctionCount + (list != null ? list.size() : 0);
    }

    public final C1AH3 LLLFZ(int i) {
        String str;
        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getItemConfig#");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveCenterMainView", C2188811AlT.LIZIZ(sbLIZ));
        HashMap<String, C1AH3> map = C1AH6.LLLLLILLIL;
        HashMap<String, C1AH3> map2 = C1AH6.LLLLLILLIL;
        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab2 = (RealtimeLiveCenterLayoutTab) C13LP.LJJJLZIJ(i, this.LLILLJJLI.LLJJIII);
        String str2 = null;
        if (realtimeLiveCenterLayoutTab2 != null) {
            str = realtimeLiveCenterLayoutTab2.layoutName;
        } else {
            str = null;
        }
        C1AH3 c1ah3 = map2.get(str);
        if (c1ah3 == null) {
            C1AH6 c1ah6 = this.LLILLJJLI;
            List<RealtimeLiveCenterLayoutTab> list = c1ah6.LLJ;
            if (list != null && (realtimeLiveCenterLayoutTab = (RealtimeLiveCenterLayoutTab) C13LP.LJJJLZIJ(i - c1ah6.getBaseFunctionCount(), list)) != null) {
                str2 = realtimeLiveCenterLayoutTab.layoutName;
            }
            return map2.get(str2);
        }
        return c1ah3;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        String str;
        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab;
        if (LiveCenterNativePageRenew.INSTANCE.isEnable()) {
            C1AH3 c1ah3LLLFZ = LLLFZ(i);
            if (c1ah3LLLFZ == null) {
                return 0;
            }
            return c1ah3LLLFZ.getType();
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    C1AH6 c1ah6 = this.LLILLJJLI;
                    List<RealtimeLiveCenterLayoutTab> list = c1ah6.LLJ;
                    if (list != null && (realtimeLiveCenterLayoutTab = (RealtimeLiveCenterLayoutTab) C13LP.LJJJLZIJ(i - c1ah6.getBaseFunctionCount(), list)) != null) {
                        str = realtimeLiveCenterLayoutTab.layoutName;
                    } else {
                        str = null;
                    }
                    C1AH3 c1ah3 = C1AH3.PUNISH;
                    if (Intrinsics.LJFF(str, c1ah3.getLayoutName())) {
                        return c1ah3.getType();
                    }
                    C1AH3 c1ah32 = C1AH3.GROWTH;
                    if (Intrinsics.LJFF(str, c1ah32.getLayoutName())) {
                        return c1ah32.getType();
                    }
                    C1AH3 c1ah33 = C1AH3.TIPS;
                    if (Intrinsics.LJFF(str, c1ah33.getLayoutName())) {
                        return c1ah33.getType();
                    }
                    C1AH3 c1ah34 = C1AH3.PC_WEBSITE;
                    if (Intrinsics.LJFF(str, c1ah34.getLayoutName())) {
                        return c1ah34.getType();
                    }
                    C1AH3 c1ah35 = C1AH3.LIVE_JOURNEY;
                    if (Intrinsics.LJFF(str, c1ah35.getLayoutName())) {
                        return c1ah35.getType();
                    }
                    C1AH3 c1ah36 = C1AH3.LOP;
                    if (Intrinsics.LJFF(str, c1ah36.getLayoutName())) {
                        return c1ah36.getType();
                    }
                    C1AH3 c1ah37 = C1AH3.PLAY_BOOK;
                    if (Intrinsics.LJFF(str, c1ah37.getLayoutName())) {
                        return c1ah37.getType();
                    }
                    C1AH3 c1ah38 = C1AH3.FLARE_CARD;
                    if (Intrinsics.LJFF(str, c1ah38.getLayoutName())) {
                        return c1ah38.getType();
                    }
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }
                return C1AH3.DATA_BOARD.getType();
            }
            return C1AH3.STATUS.getType();
        }
        return C1AH3.TITLE.getType();
    }

    public C1AH2(C1AH6 c1ah6, C1AH8 c1ah8) {
        this.LLILLJJLI = c1ah6;
        this.LL = c1ah8;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1AHE c1ahe;
        if ((viewHolder instanceof C1AHE) && (c1ahe = (C1AHE) viewHolder) != null) {
            c1ahe.P5(i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1ahj;
        View viewLJIILL;
        final View viewLJIILL2;
        if (i == C1AH3.TITLE.getType()) {
            final View viewLJIILL3 = C500260Jjc.LJIILL(LiveCenterNativePageRenew.INSTANCE.getTitleLayoutId(), viewGroup, false);
            c1ahj = new RecyclerView.ViewHolder(viewLJIILL3) { // from class: X.1AH4
            };
        } else if (i == C1AH3.STATUS.getType()) {
            c1ahj = new C1AHC(C500260Jjc.LJIILL(LiveCenterNativePageRenew.INSTANCE.getStatusLayoutId(), viewGroup, false), this.LL);
        } else if (i == C1AH3.DATA_BOARD.getType()) {
            if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                final View viewTd = C786410Ut5.Td(this.LLILLJJLI.getDarkInflater(), LiveCenterNativePageRenew.INSTANCE.getDataBoardLayoutId(), viewGroup, false);
                final C1AHD c1ahd = this.LL;
                c1ahj = new C1AHE(viewTd, c1ahd) { // from class: X.1AH9
                    public final boolean LLILLJJLI;
                    public C16F5 LLILLL;
                    public C16F5 LLILZ;
                    public C16F5 LLILZIL;
                    public C16F5 LLILZLL;
                    public C16F5 LLIZ;
                    public C16F5 LLIZLLLIL;
                    public ViewGroup LLJ;
                    public C16F5 LLJI;
                    public C16F5 LLJIJIL;
                    public ViewGroup LLJILJIL;
                    public C16F5 LLJILJILJ;
                    public C16F5 LLJILLL;
                    public ViewGroup LLJJ;
                    public C16F5 LLJJI;
                    public C16F5 LLJJIII;
                    public ViewGroup LLJJIJI;
                    public boolean LLJJIJIIJIL;
                    public final ViewStub LLJJIJIL;
                    public final FrameLayout LLJJJ;
                    public final ConstraintLayout LLJJJIL;
                    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJJ;
                    public InterfaceC1541990qEH LLJJJJJIL;
                    public C16F5 LLJJJJLIIL;
                    public final View LLJJL;
                    public ViewGroup LLJJLIIIJLLLLLLLZ;

                    public final void S5() {
                        if (this.LLJJIJIIJIL) {
                            return;
                        }
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL5 = L5();
                        if ((realtimeLiveCenterDetailDataL5 != null ? realtimeLiveCenterDetailDataL5.hideOverviewDiamond : false) && this.LLILLJJLI) {
                            this.LLJJIJIL.setLayoutResource(LiveCenterNativePageRenew.INSTANCE.getDataBoardLinearLayout());
                            this.LLJJIJIL.setInflatedId(R.id.px5);
                            C786410Ut5.LJLLLL(this.LLJJIJIL);
                            R5(this.itemView);
                            C16F5 c16f5 = this.LLILLL;
                            if (c16f5 != null) {
                                c16f5.setText(2131842898);
                            }
                            C16F5 c16f52 = this.LLILZIL;
                            if (c16f52 != null) {
                                c16f52.setText(2131842895);
                            }
                            C16F5 c16f53 = this.LLJI;
                            if (c16f53 != null) {
                                c16f53.setText(2131842896);
                            }
                        } else {
                            this.LLJJIJIL.setLayoutResource(LiveCenterNativePageRenew.INSTANCE.getDataBoardGridLayout());
                            this.LLJJIJIL.setInflatedId(R.id.px5);
                            C786410Ut5.LJLLLL(this.LLJJIJIL);
                            R5(this.itemView);
                            C16F5 c16f54 = this.LLILLL;
                            if (c16f54 != null) {
                                c16f54.setText(2131842898);
                            }
                            C16F5 c16f55 = this.LLILZIL;
                            if (c16f55 != null) {
                                c16f55.setText(2131842895);
                            }
                            if (this.LLILLJJLI) {
                                if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                                    C16F5 c16f56 = this.LLIZ;
                                    if (c16f56 != null) {
                                        c16f56.setText(2131853419);
                                    }
                                    ViewGroup viewGroup2 = this.LLJJLIIIJLLLLLLLZ;
                                    if (viewGroup2 != null) {
                                        C786410Ut5.LJJJLZIJ(this.LLJJ, viewGroup2);
                                    }
                                    ViewGroup viewGroup3 = this.LLJJLIIIJLLLLLLLZ;
                                    if (viewGroup3 != null) {
                                        C786410Ut5.LJJJLZIJ(this.LLJJIJI, viewGroup3);
                                    }
                                } else {
                                    C16F5 c16f57 = this.LLIZ;
                                    if (c16f57 != null) {
                                        c16f57.setText(2131842894);
                                    }
                                    C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dw4, getContext());
                                    if (c20743516FdLIZLLL != null) {
                                        c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
                                        c20743516FdLIZLLL.setTint(C497740JfY.LIZLLL(R.attr.c9l, getContext()));
                                    } else {
                                        c20743516FdLIZLLL = null;
                                    }
                                    C16F5 c16f58 = this.LLIZ;
                                    if (c16f58 != null) {
                                        c16f58.setCompoundDrawablesRelative(null, null, c20743516FdLIZLLL, null);
                                    }
                                    C500260Jjc.LJIILIIL(this.LLJJ);
                                    C500260Jjc.LJIILIIL(this.LLJJIJI);
                                }
                                C16F5 c16f59 = this.LLIZ;
                                if (c16f59 != null) {
                                    C786410Ut5.l8(c16f59, new ACListenerS167S0100000_33(this, 85));
                                }
                                C16F5 c16f510 = this.LLJI;
                                if (c16f510 != null) {
                                    c16f510.setText(2131842896);
                                }
                            } else {
                                C16F5 c16f511 = this.LLJILJILJ;
                                if (c16f511 != null) {
                                    c16f511.setText(2131842893);
                                }
                                if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                                    C500260Jjc.LJIILIIL(this.LLJ);
                                    ViewGroup viewGroup4 = this.LLJJLIIIJLLLLLLLZ;
                                    if (viewGroup4 != null) {
                                        C786410Ut5.LJJJLZIJ(this.LLJJIJI, viewGroup4);
                                    }
                                    ViewGroup viewGroup5 = this.LLJJLIIIJLLLLLLLZ;
                                    if (viewGroup5 != null) {
                                        C786410Ut5.LJJJLZIJ(this.LLJILJIL, viewGroup5);
                                    }
                                } else {
                                    C16F5 c16f512 = this.LLJJI;
                                    if (c16f512 != null) {
                                        c16f512.setText(2131842897);
                                    }
                                    C500260Jjc.LJIILIIL(this.LLJ);
                                    C500260Jjc.LJIILIIL(this.LLJILJIL);
                                }
                            }
                        }
                        this.LLJJIJIIJIL = true;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
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
                    @Override // X.C1AHE
                    public final void P5(int i2) throws JSONException {
                        Integer numValueOf;
                        WhiteBoxData whiteBoxData;
                        boolean z;
                        String str;
                        String str2;
                        String strJ3;
                        View viewE1;
                        FrameLayout frameLayout;
                        InterfaceC1540940qCa interfaceC1540940qCa;
                        SparkContext sparkContext;
                        View viewE12;
                        FrameLayout frameLayout2;
                        LynxView lynxView;
                        LynxView lynxView2;
                        String str3;
                        RealtimeLLM realtimeLLM;
                        ColdStartStatData coldStartStatData;
                        RealtimeLiveCenterBaseData realtimeLiveCenterBaseData;
                        if (L5() != null) {
                            S5();
                        }
                        if (C500260Jjc.LJJJIL(getDataChannel())) {
                            return;
                        }
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL5 = L5();
                        if (realtimeLiveCenterDetailDataL5 != null && (realtimeLiveCenterBaseData = realtimeLiveCenterDetailDataL5.baseInfo) != null) {
                            C16F5 c16f5 = this.LLILZ;
                            if (c16f5 != null) {
                                c16f5.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveWatchCnt));
                            }
                            C16F5 c16f52 = this.LLILZLL;
                            if (c16f52 != null) {
                                c16f52.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveNewFansUcnt));
                            }
                            if (this.LLILLJJLI) {
                                C16F5 c16f53 = this.LLIZLLLIL;
                                if (c16f53 != null) {
                                    c16f53.setText(C010F.LIZ(realtimeLiveCenterBaseData.totalScore));
                                }
                                C16F5 c16f54 = this.LLJIJIL;
                                if (c16f54 != null) {
                                    c16f54.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveConsumeUcnt));
                                }
                            } else {
                                C16F5 c16f55 = this.LLJILLL;
                                if (c16f55 != null) {
                                    c16f55.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveCommentCnt));
                                }
                                C16F5 c16f56 = this.LLJJIII;
                                if (c16f56 != null) {
                                    c16f56.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveLikeCnt));
                                }
                            }
                        }
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI = this.LL.LJIIJJI();
                        if (realtimeLiveCenterDetailDataLJIIJJI != null && (coldStartStatData = realtimeLiveCenterDetailDataLJIIJJI.coldStartStatData) != null) {
                            numValueOf = Integer.valueOf(coldStartStatData.status);
                        } else {
                            numValueOf = null;
                        }
                        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTabLIZIZ = this.LL.LIZIZ(C1AH3.TRAFFIC_GRAPH.getLayoutName());
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI2 = this.LL.LJIIJJI();
                        if (realtimeLiveCenterDetailDataLJIIJJI2 != null) {
                            whiteBoxData = realtimeLiveCenterDetailDataLJIIJJI2.whiteBoxData;
                        } else {
                            whiteBoxData = null;
                        }
                        if (whiteBoxData != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str4 = "";
                        if (realtimeLiveCenterLayoutTabLIZIZ == null || (str = realtimeLiveCenterLayoutTabLIZIZ.lynxUrl) == null) {
                            str = "";
                        }
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL52 = L5();
                        if (realtimeLiveCenterDetailDataL52 != null && (realtimeLLM = realtimeLiveCenterDetailDataL52.llm) != null) {
                            str2 = realtimeLLM.suggest;
                        } else {
                            str2 = null;
                        }
                        if (realtimeLiveCenterLayoutTabLIZIZ != null && (str3 = realtimeLiveCenterLayoutTabLIZIZ.lynxInitData) != null) {
                            str4 = str3;
                        }
                        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                            strJ3 = C786410Ut5.J3(C1887430zDR.LIZ(i2, str4, C2097908Jt.LIZJ(new Pair("duration_after_live_take", Integer.valueOf((int) I5())))));
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("lynx_data", str4);
                            jSONObject2.put("module_position", i2 - 1);
                            jSONObject2.put("duration_after_live_take", (int) I5());
                            jSONObject.put("initial_data", jSONObject2);
                            strJ3 = C786410Ut5.J3(jSONObject);
                        }
                        C20441214yg.LIZIZ("LiveCenterCards", "trafficGraph initData: ".concat(strJ3));
                        C20441214yg.LIZIZ("LiveCenterCards", "bindGraph: " + numValueOf + ", container: " + this.LLJJJ + ", schema: " + str + "&back_opacity=1");
                        if (C500260Jjc.LJJIIZ(str) && ((numValueOf != null && numValueOf.intValue() == 1) || (z && LiveAnchorWhiteBox2Setting.INSTANCE.enable()))) {
                            ConstraintLayout constraintLayout = this.LLJJJIL;
                            if (constraintLayout != null) {
                                C500260Jjc.LJLJLJ(constraintLayout, false);
                            }
                            View view = this.LLJJL;
                            if (view != null) {
                                C786410Ut5.LJLLLLLL(4, view);
                            }
                            C500260Jjc.LJLJLJ(this.LLJJJ, true);
                            C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind: " + i2 + ", " + I5() + ", " + str + "&back_opacity=1");
                            if (LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                                if (this.LLJJJJJIL == null) {
                                    T5(str.concat("&back_opacity=1&live_center_exp=1"), strJ3);
                                }
                                InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJJJJIL;
                                if (interfaceC1541990qEH != 0) {
                                    this.LL.LJIILJJIL(interfaceC1541990qEH);
                                    if ((!LiveCenterApiOpt.INSTANCE.enable() || Intrinsics.LJFF(this.LL.getDataSource(), "api")) && (interfaceC1541990qEH instanceof LynxView) && (lynxView2 = (LynxView) interfaceC1541990qEH) != null) {
                                        lynxView2.updateData(strJ3);
                                    }
                                    C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind-updateParam: " + i2 + ", " + str);
                                    return;
                                }
                                return;
                            }
                            if (this.LLJJJJ == null) {
                                U5(str.concat("&back_opacity=1&live_center_exp=1"), strJ3);
                            }
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJJ;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
                                return;
                            }
                            this.LL.LJIIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                            if (!LiveCenterApiOpt.INSTANCE.enable() || Intrinsics.LJFF(this.LL.getDataSource(), "api")) {
                                Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
                                if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                                    lynxView.updateData(strJ3);
                                }
                            }
                            C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind-updateParam: " + i2 + ", " + str);
                            return;
                        }
                        if (numValueOf != null && numValueOf.intValue() == 2) {
                            if (C500260Jjc.LJJIIZ(str2)) {
                                if (LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                                    InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLJJJJJIL;
                                    if (interfaceC1541990qEH2 != null && (viewE12 = interfaceC1541990qEH2.e1()) != null && (frameLayout2 = this.LLJJJ) != null) {
                                        C786410Ut5.LJJJZ(viewE12, frameLayout2);
                                    }
                                    InterfaceC1541990qEH interfaceC1541990qEH3 = this.LLJJJJJIL;
                                    if (interfaceC1541990qEH3 != null) {
                                        interfaceC1541990qEH3.LLD(true);
                                    }
                                    this.LLJJJJJIL = null;
                                } else {
                                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJJJ;
                                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                                        FrameLayout frameLayout3 = this.LLJJJ;
                                        if (frameLayout3 != null) {
                                            C786410Ut5.LJJJZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, frameLayout3);
                                        }
                                        boolean z2 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJ(true);
                                    }
                                    this.LLJJJJ = null;
                                }
                                C500260Jjc.LJLJLJ(this.LLJJJ, false);
                                ConstraintLayout constraintLayout2 = this.LLJJJIL;
                                if (constraintLayout2 != null) {
                                    C500260Jjc.LJLJLJ(constraintLayout2, true);
                                }
                                View view2 = this.LLJJL;
                                if (view2 != null) {
                                    C786410Ut5.LJLLLLLL(0, view2);
                                }
                                C16F5 c16f57 = this.LLJJJJLIIL;
                                if (c16f57 == null) {
                                    return;
                                }
                                c16f57.setText(str2);
                                return;
                            }
                            C500260Jjc.LJLJLJ(this.LLJJJ, true);
                            if (LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                                if (this.LLJJJJJIL == null && C500260Jjc.LJJIIZ(str)) {
                                    T5(str.concat("&back_opacity=1&live_center_exp=1"), strJ3);
                                    InterfaceC1541990qEH interfaceC1541990qEH4 = this.LLJJJJJIL;
                                    if (interfaceC1541990qEH4 != null) {
                                        this.LL.LJIILJJIL(interfaceC1541990qEH4);
                                        C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind-updateParam: " + i2 + ", " + str);
                                        C1537480q70 hybridContext = interfaceC1541990qEH4.getHybridContext();
                                        if ((hybridContext instanceof SparkContext) && (sparkContext = (SparkContext) hybridContext) != null) {
                                            sparkContext.LJJJLZIJ((int) I5(), "duration_after_live_take");
                                        }
                                        if ((interfaceC1541990qEH4 instanceof InterfaceC1105930esx) && (interfaceC1540940qCa = (InterfaceC1540940qCa) interfaceC1541990qEH4) != null) {
                                            interfaceC1540940qCa.LJIILIIL(interfaceC1540940qCa.LJIILJJIL());
                                        }
                                    }
                                }
                            } else if (this.LLJJJJ == null && C500260Jjc.LJJIIZ(str)) {
                                U5(str.concat("&back_opacity=1&live_center_exp=1"), strJ3);
                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LLJJJJ;
                                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                                    this.LL.LJIIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3);
                                    C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind-updateParam: " + i2 + ", " + str);
                                    SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getSparkContext();
                                    if (sparkContext2 != null) {
                                        sparkContext2.LJJJLZIJ((int) I5(), "duration_after_live_take");
                                    }
                                    C0J39.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3);
                                }
                            }
                            ConstraintLayout constraintLayout3 = this.LLJJJIL;
                            if (constraintLayout3 != null) {
                                C500260Jjc.LJLJLJ(constraintLayout3, false);
                            }
                            View view3 = this.LLJJL;
                            if (view3 == null) {
                                return;
                            }
                            C786410Ut5.LJLLLLLL(0, view3);
                            return;
                        }
                        if (C500260Jjc.LJJIIZ(str2)) {
                            ConstraintLayout constraintLayout4 = this.LLJJJIL;
                            if (constraintLayout4 != null) {
                                C500260Jjc.LJLJLJ(constraintLayout4, true);
                            }
                            View view4 = this.LLJJL;
                            if (view4 != null) {
                                C786410Ut5.LJLLLLLL(0, view4);
                            }
                            C16F5 c16f58 = this.LLJJJJLIIL;
                            if (c16f58 != null) {
                                c16f58.setText(str2);
                            }
                        } else {
                            ConstraintLayout constraintLayout5 = this.LLJJJIL;
                            if (constraintLayout5 != null) {
                                C500260Jjc.LJLJLJ(constraintLayout5, false);
                            }
                            View view5 = this.LLJJL;
                            if (view5 != null) {
                                C786410Ut5.LJLLLLLL(4, view5);
                            }
                        }
                        if (LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                            InterfaceC1541990qEH interfaceC1541990qEH5 = this.LLJJJJJIL;
                            if (interfaceC1541990qEH5 != null && (viewE1 = interfaceC1541990qEH5.e1()) != null && (frameLayout = this.LLJJJ) != null) {
                                C786410Ut5.LJJJZ(viewE1, frameLayout);
                            }
                            InterfaceC1541990qEH interfaceC1541990qEH6 = this.LLJJJJJIL;
                            if (interfaceC1541990qEH6 != null) {
                                interfaceC1541990qEH6.LLD(true);
                            }
                            this.LL.LJIILJJIL(null);
                            this.LLJJJJJIL = null;
                        } else {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LLJJJJ;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null) {
                                FrameLayout frameLayout4 = this.LLJJJ;
                                if (frameLayout4 != null) {
                                    C786410Ut5.LJJJZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4, frameLayout4);
                                }
                                boolean z3 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LJJ(true);
                            }
                            this.LL.LJIIJ(null);
                            this.LLJJJJ = null;
                        }
                        C500260Jjc.LJLJLJ(this.LLJJJ, false);
                    }

                    public final void R5(View view) {
                        C16F5 c16f5;
                        C16F5 c16f52;
                        C16F5 c16f53;
                        C16F5 c16f54;
                        C16F5 c16f55;
                        C16F5 c16f56;
                        C16F5 c16f57;
                        C16F5 c16f58;
                        C16F5 c16f59;
                        C16F5 c16f510;
                        C16F5 c16f511;
                        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                            this.LLJJLIIIJLLLLLLLZ = (ViewGroup) view.findViewById(R.id.px6);
                        }
                        View viewFindViewById = view.findViewById(R.id.l4z);
                        C16F5 c16f512 = null;
                        if (viewFindViewById != null) {
                            c16f5 = (C16F5) viewFindViewById.findViewById(R.id.l1u);
                        } else {
                            c16f5 = null;
                        }
                        this.LLILLL = c16f5;
                        if (viewFindViewById != null) {
                            c16f52 = (C16F5) viewFindViewById.findViewById(R.id.l1t);
                        } else {
                            c16f52 = null;
                        }
                        this.LLILZ = c16f52;
                        View viewFindViewById2 = view.findViewById(R.id.l24);
                        if (viewFindViewById2 != null) {
                            c16f53 = (C16F5) viewFindViewById2.findViewById(R.id.l1u);
                        } else {
                            c16f53 = null;
                        }
                        this.LLILZIL = c16f53;
                        if (viewFindViewById2 != null) {
                            c16f54 = (C16F5) viewFindViewById2.findViewById(R.id.l1t);
                        } else {
                            c16f54 = null;
                        }
                        this.LLILZLL = c16f54;
                        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.l1v);
                        this.LLJ = viewGroup2;
                        if (viewGroup2 != null) {
                            c16f55 = (C16F5) viewGroup2.findViewById(R.id.l1u);
                        } else {
                            c16f55 = null;
                        }
                        this.LLIZ = c16f55;
                        ViewGroup viewGroup3 = this.LLJ;
                        if (viewGroup3 != null) {
                            c16f56 = (C16F5) viewGroup3.findViewById(R.id.l1t);
                        } else {
                            c16f56 = null;
                        }
                        this.LLIZLLLIL = c16f56;
                        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.l25);
                        this.LLJILJIL = viewGroup4;
                        if (viewGroup4 != null) {
                            c16f57 = (C16F5) viewGroup4.findViewById(R.id.l1u);
                        } else {
                            c16f57 = null;
                        }
                        this.LLJI = c16f57;
                        ViewGroup viewGroup5 = this.LLJILJIL;
                        if (viewGroup5 != null) {
                            c16f58 = (C16F5) viewGroup5.findViewById(R.id.l1t);
                        } else {
                            c16f58 = null;
                        }
                        this.LLJIJIL = c16f58;
                        ViewGroup viewGroup6 = (ViewGroup) view.findViewById(R.id.l1l);
                        this.LLJJ = viewGroup6;
                        if (viewGroup6 != null) {
                            c16f59 = (C16F5) viewGroup6.findViewById(R.id.l1u);
                        } else {
                            c16f59 = null;
                        }
                        this.LLJILJILJ = c16f59;
                        ViewGroup viewGroup7 = this.LLJJ;
                        if (viewGroup7 != null) {
                            c16f510 = (C16F5) viewGroup7.findViewById(R.id.l1t);
                        } else {
                            c16f510 = null;
                        }
                        this.LLJILLL = c16f510;
                        ViewGroup viewGroup8 = (ViewGroup) view.findViewById(R.id.l2n);
                        this.LLJJIJI = viewGroup8;
                        if (viewGroup8 != null) {
                            c16f511 = (C16F5) viewGroup8.findViewById(R.id.l1u);
                        } else {
                            c16f511 = null;
                        }
                        this.LLJJI = c16f511;
                        ViewGroup viewGroup9 = this.LLJJIJI;
                        if (viewGroup9 != null) {
                            c16f512 = (C16F5) viewGroup9.findViewById(R.id.l1t);
                        }
                        this.LLJJIII = c16f512;
                        this.LLJJJJLIIL = (C16F5) view.findViewById(R.id.px4);
                    }

                    {
                        Boolean boolValueOf;
                        RoomAuthStatus roomAuthStatus;
                        super(viewTd, c1ahd);
                        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(getDataChannel());
                        if (roomLJJLIIIIJ != null && (roomAuthStatus = roomLJJLIIIIJ.getRoomAuthStatus()) != null) {
                            boolValueOf = Boolean.valueOf(roomAuthStatus.enableGift);
                        } else {
                            boolValueOf = null;
                        }
                        this.LLILLJJLI = C500260Jjc.LJJJI(boolValueOf);
                        this.LLJJIJIL = (ViewStub) viewTd.findViewById(R.id.px7);
                        this.LLJJJ = (FrameLayout) viewTd.findViewById(R.id.px9);
                        this.LLJJJIL = (ConstraintLayout) viewTd.findViewById(R.id.px1);
                        this.LLJJL = viewTd.findViewById(R.id.px2);
                        if (C500260Jjc.LJJJIL(getDataChannel())) {
                            S5();
                        }
                        N5();
                    }

                    public final void T5(String str, String str2) {
                        LifecycleOwner lifecycleOwner;
                        View viewE1;
                        FrameLayout frameLayout;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("replaceSparkView: ");
                        sbLIZ.append(str);
                        C20441214yg.LIZIZ("LiveCenterCards", C2188811AlT.LIZIZ(sbLIZ));
                        IHybridContainerService iHybridContainerServiceLJIILIIL = C781270Ukn.LJIILIIL();
                        Context context = getContext();
                        DataChannel dataChannel = getDataChannel();
                        if (dataChannel != null) {
                            lifecycleOwner = dataChannel.LLILZ;
                        } else {
                            lifecycleOwner = null;
                        }
                        InterfaceC1541990qEH interfaceC1541990qEHNN = iHybridContainerServiceLJIILIIL.NN(context, str, lifecycleOwner, false, AFwS279S0000000_33.get$arr$(367));
                        if (interfaceC1541990qEHNN != null) {
                            C1537480q70 hybridContext = interfaceC1541990qEHNN.getHybridContext();
                            if (hybridContext != null) {
                                hybridContext.initData = str2;
                            }
                            interfaceC1541990qEHNN.load();
                        }
                        FrameLayout frameLayout2 = this.LLJJJ;
                        if (frameLayout2 != null) {
                            C786410Ut5.LJJJJIZL(frameLayout2);
                        }
                        if (interfaceC1541990qEHNN != null && (viewE1 = interfaceC1541990qEHNN.e1()) != null && (frameLayout = this.LLJJJ) != null) {
                            frameLayout.addView(viewE1, -1, -2);
                        }
                        this.LLJJJJJIL = interfaceC1541990qEHNN;
                    }

                    public final void U5(String str, String str2) {
                        LifecycleOwner lifecycleOwner;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("replaceSparkView: ");
                        sbLIZ.append(str);
                        C20441214yg.LIZIZ("LiveCenterCards", C2188811AlT.LIZIZ(sbLIZ));
                        IHybridContainerService iHybridContainerServiceLJIILIIL = C781270Ukn.LJIILIIL();
                        Context context = getContext();
                        DataChannel dataChannel = getDataChannel();
                        if (dataChannel != null) {
                            lifecycleOwner = dataChannel.LLILZ;
                        } else {
                            lifecycleOwner = null;
                        }
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = iHybridContainerServiceLJIILIIL.DU1(context, str, lifecycleOwner, false, AFwS279S0000000_33.get$arr$(368));
                        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.getSparkContext();
                        if (sparkContext != null) {
                            sparkContext.initData = str2;
                        }
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.LJIIIIZZ();
                        FrameLayout frameLayout = this.LLJJJ;
                        if (frameLayout != null) {
                            C786410Ut5.LJJJJIZL(frameLayout);
                        }
                        FrameLayout frameLayout2 = this.LLJJJ;
                        if (frameLayout2 != null) {
                            frameLayout2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -2);
                        }
                        this.LLJJJJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                    }
                };
            } else {
                final View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, LiveCenterNativePageRenew.INSTANCE.getDataBoardLayoutId(), viewGroup, false, null, false, 60);
                final C1AHD c1ahd2 = this.LL;
                c1ahj = new C1AHE(viewLJFF, c1ahd2) { // from class: X.1AH9
                    public final boolean LLILLJJLI;
                    public C16F5 LLILLL;
                    public C16F5 LLILZ;
                    public C16F5 LLILZIL;
                    public C16F5 LLILZLL;
                    public C16F5 LLIZ;
                    public C16F5 LLIZLLLIL;
                    public ViewGroup LLJ;
                    public C16F5 LLJI;
                    public C16F5 LLJIJIL;
                    public ViewGroup LLJILJIL;
                    public C16F5 LLJILJILJ;
                    public C16F5 LLJILLL;
                    public ViewGroup LLJJ;
                    public C16F5 LLJJI;
                    public C16F5 LLJJIII;
                    public ViewGroup LLJJIJI;
                    public boolean LLJJIJIIJIL;
                    public final ViewStub LLJJIJIL;
                    public final FrameLayout LLJJJ;
                    public final ConstraintLayout LLJJJIL;
                    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJJ;
                    public InterfaceC1541990qEH LLJJJJJIL;
                    public C16F5 LLJJJJLIIL;
                    public final View LLJJL;
                    public ViewGroup LLJJLIIIJLLLLLLLZ;

                    public final void S5() {
                        if (this.LLJJIJIIJIL) {
                            return;
                        }
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL5 = L5();
                        if ((realtimeLiveCenterDetailDataL5 != null ? realtimeLiveCenterDetailDataL5.hideOverviewDiamond : false) && this.LLILLJJLI) {
                            this.LLJJIJIL.setLayoutResource(LiveCenterNativePageRenew.INSTANCE.getDataBoardLinearLayout());
                            this.LLJJIJIL.setInflatedId(R.id.px5);
                            C786410Ut5.LJLLLL(this.LLJJIJIL);
                            R5(this.itemView);
                            C16F5 c16f5 = this.LLILLL;
                            if (c16f5 != null) {
                                c16f5.setText(2131842898);
                            }
                            C16F5 c16f52 = this.LLILZIL;
                            if (c16f52 != null) {
                                c16f52.setText(2131842895);
                            }
                            C16F5 c16f53 = this.LLJI;
                            if (c16f53 != null) {
                                c16f53.setText(2131842896);
                            }
                        } else {
                            this.LLJJIJIL.setLayoutResource(LiveCenterNativePageRenew.INSTANCE.getDataBoardGridLayout());
                            this.LLJJIJIL.setInflatedId(R.id.px5);
                            C786410Ut5.LJLLLL(this.LLJJIJIL);
                            R5(this.itemView);
                            C16F5 c16f54 = this.LLILLL;
                            if (c16f54 != null) {
                                c16f54.setText(2131842898);
                            }
                            C16F5 c16f55 = this.LLILZIL;
                            if (c16f55 != null) {
                                c16f55.setText(2131842895);
                            }
                            if (this.LLILLJJLI) {
                                if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                                    C16F5 c16f56 = this.LLIZ;
                                    if (c16f56 != null) {
                                        c16f56.setText(2131853419);
                                    }
                                    ViewGroup viewGroup2 = this.LLJJLIIIJLLLLLLLZ;
                                    if (viewGroup2 != null) {
                                        C786410Ut5.LJJJLZIJ(this.LLJJ, viewGroup2);
                                    }
                                    ViewGroup viewGroup3 = this.LLJJLIIIJLLLLLLLZ;
                                    if (viewGroup3 != null) {
                                        C786410Ut5.LJJJLZIJ(this.LLJJIJI, viewGroup3);
                                    }
                                } else {
                                    C16F5 c16f57 = this.LLIZ;
                                    if (c16f57 != null) {
                                        c16f57.setText(2131842894);
                                    }
                                    C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dw4, getContext());
                                    if (c20743516FdLIZLLL != null) {
                                        c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
                                        c20743516FdLIZLLL.setTint(C497740JfY.LIZLLL(R.attr.c9l, getContext()));
                                    } else {
                                        c20743516FdLIZLLL = null;
                                    }
                                    C16F5 c16f58 = this.LLIZ;
                                    if (c16f58 != null) {
                                        c16f58.setCompoundDrawablesRelative(null, null, c20743516FdLIZLLL, null);
                                    }
                                    C500260Jjc.LJIILIIL(this.LLJJ);
                                    C500260Jjc.LJIILIIL(this.LLJJIJI);
                                }
                                C16F5 c16f59 = this.LLIZ;
                                if (c16f59 != null) {
                                    C786410Ut5.l8(c16f59, new ACListenerS167S0100000_33(this, 85));
                                }
                                C16F5 c16f510 = this.LLJI;
                                if (c16f510 != null) {
                                    c16f510.setText(2131842896);
                                }
                            } else {
                                C16F5 c16f511 = this.LLJILJILJ;
                                if (c16f511 != null) {
                                    c16f511.setText(2131842893);
                                }
                                if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                                    C500260Jjc.LJIILIIL(this.LLJ);
                                    ViewGroup viewGroup4 = this.LLJJLIIIJLLLLLLLZ;
                                    if (viewGroup4 != null) {
                                        C786410Ut5.LJJJLZIJ(this.LLJJIJI, viewGroup4);
                                    }
                                    ViewGroup viewGroup5 = this.LLJJLIIIJLLLLLLLZ;
                                    if (viewGroup5 != null) {
                                        C786410Ut5.LJJJLZIJ(this.LLJILJIL, viewGroup5);
                                    }
                                } else {
                                    C16F5 c16f512 = this.LLJJI;
                                    if (c16f512 != null) {
                                        c16f512.setText(2131842897);
                                    }
                                    C500260Jjc.LJIILIIL(this.LLJ);
                                    C500260Jjc.LJIILIIL(this.LLJILJIL);
                                }
                            }
                        }
                        this.LLJJIJIIJIL = true;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
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
                    @Override // X.C1AHE
                    public final void P5(int i2) throws JSONException {
                        Integer numValueOf;
                        WhiteBoxData whiteBoxData;
                        boolean z;
                        String str;
                        String str2;
                        String strJ3;
                        View viewE1;
                        FrameLayout frameLayout;
                        InterfaceC1540940qCa interfaceC1540940qCa;
                        SparkContext sparkContext;
                        View viewE12;
                        FrameLayout frameLayout2;
                        LynxView lynxView;
                        LynxView lynxView2;
                        String str3;
                        RealtimeLLM realtimeLLM;
                        ColdStartStatData coldStartStatData;
                        RealtimeLiveCenterBaseData realtimeLiveCenterBaseData;
                        if (L5() != null) {
                            S5();
                        }
                        if (C500260Jjc.LJJJIL(getDataChannel())) {
                            return;
                        }
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL5 = L5();
                        if (realtimeLiveCenterDetailDataL5 != null && (realtimeLiveCenterBaseData = realtimeLiveCenterDetailDataL5.baseInfo) != null) {
                            C16F5 c16f5 = this.LLILZ;
                            if (c16f5 != null) {
                                c16f5.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveWatchCnt));
                            }
                            C16F5 c16f52 = this.LLILZLL;
                            if (c16f52 != null) {
                                c16f52.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveNewFansUcnt));
                            }
                            if (this.LLILLJJLI) {
                                C16F5 c16f53 = this.LLIZLLLIL;
                                if (c16f53 != null) {
                                    c16f53.setText(C010F.LIZ(realtimeLiveCenterBaseData.totalScore));
                                }
                                C16F5 c16f54 = this.LLJIJIL;
                                if (c16f54 != null) {
                                    c16f54.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveConsumeUcnt));
                                }
                            } else {
                                C16F5 c16f55 = this.LLJILLL;
                                if (c16f55 != null) {
                                    c16f55.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveCommentCnt));
                                }
                                C16F5 c16f56 = this.LLJJIII;
                                if (c16f56 != null) {
                                    c16f56.setText(C010F.LIZ(realtimeLiveCenterBaseData.liveLikeCnt));
                                }
                            }
                        }
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI = this.LL.LJIIJJI();
                        if (realtimeLiveCenterDetailDataLJIIJJI != null && (coldStartStatData = realtimeLiveCenterDetailDataLJIIJJI.coldStartStatData) != null) {
                            numValueOf = Integer.valueOf(coldStartStatData.status);
                        } else {
                            numValueOf = null;
                        }
                        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTabLIZIZ = this.LL.LIZIZ(C1AH3.TRAFFIC_GRAPH.getLayoutName());
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI2 = this.LL.LJIIJJI();
                        if (realtimeLiveCenterDetailDataLJIIJJI2 != null) {
                            whiteBoxData = realtimeLiveCenterDetailDataLJIIJJI2.whiteBoxData;
                        } else {
                            whiteBoxData = null;
                        }
                        if (whiteBoxData != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str4 = "";
                        if (realtimeLiveCenterLayoutTabLIZIZ == null || (str = realtimeLiveCenterLayoutTabLIZIZ.lynxUrl) == null) {
                            str = "";
                        }
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL52 = L5();
                        if (realtimeLiveCenterDetailDataL52 != null && (realtimeLLM = realtimeLiveCenterDetailDataL52.llm) != null) {
                            str2 = realtimeLLM.suggest;
                        } else {
                            str2 = null;
                        }
                        if (realtimeLiveCenterLayoutTabLIZIZ != null && (str3 = realtimeLiveCenterLayoutTabLIZIZ.lynxInitData) != null) {
                            str4 = str3;
                        }
                        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                            strJ3 = C786410Ut5.J3(C1887430zDR.LIZ(i2, str4, C2097908Jt.LIZJ(new Pair("duration_after_live_take", Integer.valueOf((int) I5())))));
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("lynx_data", str4);
                            jSONObject2.put("module_position", i2 - 1);
                            jSONObject2.put("duration_after_live_take", (int) I5());
                            jSONObject.put("initial_data", jSONObject2);
                            strJ3 = C786410Ut5.J3(jSONObject);
                        }
                        C20441214yg.LIZIZ("LiveCenterCards", "trafficGraph initData: ".concat(strJ3));
                        C20441214yg.LIZIZ("LiveCenterCards", "bindGraph: " + numValueOf + ", container: " + this.LLJJJ + ", schema: " + str + "&back_opacity=1");
                        if (C500260Jjc.LJJIIZ(str) && ((numValueOf != null && numValueOf.intValue() == 1) || (z && LiveAnchorWhiteBox2Setting.INSTANCE.enable()))) {
                            ConstraintLayout constraintLayout = this.LLJJJIL;
                            if (constraintLayout != null) {
                                C500260Jjc.LJLJLJ(constraintLayout, false);
                            }
                            View view = this.LLJJL;
                            if (view != null) {
                                C786410Ut5.LJLLLLLL(4, view);
                            }
                            C500260Jjc.LJLJLJ(this.LLJJJ, true);
                            C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind: " + i2 + ", " + I5() + ", " + str + "&back_opacity=1");
                            if (LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                                if (this.LLJJJJJIL == null) {
                                    T5(str.concat("&back_opacity=1&live_center_exp=1"), strJ3);
                                }
                                InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJJJJIL;
                                if (interfaceC1541990qEH != 0) {
                                    this.LL.LJIILJJIL(interfaceC1541990qEH);
                                    if ((!LiveCenterApiOpt.INSTANCE.enable() || Intrinsics.LJFF(this.LL.getDataSource(), "api")) && (interfaceC1541990qEH instanceof LynxView) && (lynxView2 = (LynxView) interfaceC1541990qEH) != null) {
                                        lynxView2.updateData(strJ3);
                                    }
                                    C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind-updateParam: " + i2 + ", " + str);
                                    return;
                                }
                                return;
                            }
                            if (this.LLJJJJ == null) {
                                U5(str.concat("&back_opacity=1&live_center_exp=1"), strJ3);
                            }
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJJ;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
                                return;
                            }
                            this.LL.LJIIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                            if (!LiveCenterApiOpt.INSTANCE.enable() || Intrinsics.LJFF(this.LL.getDataSource(), "api")) {
                                Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
                                if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                                    lynxView.updateData(strJ3);
                                }
                            }
                            C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind-updateParam: " + i2 + ", " + str);
                            return;
                        }
                        if (numValueOf != null && numValueOf.intValue() == 2) {
                            if (C500260Jjc.LJJIIZ(str2)) {
                                if (LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                                    InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLJJJJJIL;
                                    if (interfaceC1541990qEH2 != null && (viewE12 = interfaceC1541990qEH2.e1()) != null && (frameLayout2 = this.LLJJJ) != null) {
                                        C786410Ut5.LJJJZ(viewE12, frameLayout2);
                                    }
                                    InterfaceC1541990qEH interfaceC1541990qEH3 = this.LLJJJJJIL;
                                    if (interfaceC1541990qEH3 != null) {
                                        interfaceC1541990qEH3.LLD(true);
                                    }
                                    this.LLJJJJJIL = null;
                                } else {
                                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJJJ;
                                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                                        FrameLayout frameLayout3 = this.LLJJJ;
                                        if (frameLayout3 != null) {
                                            C786410Ut5.LJJJZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, frameLayout3);
                                        }
                                        boolean z2 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJ(true);
                                    }
                                    this.LLJJJJ = null;
                                }
                                C500260Jjc.LJLJLJ(this.LLJJJ, false);
                                ConstraintLayout constraintLayout2 = this.LLJJJIL;
                                if (constraintLayout2 != null) {
                                    C500260Jjc.LJLJLJ(constraintLayout2, true);
                                }
                                View view2 = this.LLJJL;
                                if (view2 != null) {
                                    C786410Ut5.LJLLLLLL(0, view2);
                                }
                                C16F5 c16f57 = this.LLJJJJLIIL;
                                if (c16f57 == null) {
                                    return;
                                }
                                c16f57.setText(str2);
                                return;
                            }
                            C500260Jjc.LJLJLJ(this.LLJJJ, true);
                            if (LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                                if (this.LLJJJJJIL == null && C500260Jjc.LJJIIZ(str)) {
                                    T5(str.concat("&back_opacity=1&live_center_exp=1"), strJ3);
                                    InterfaceC1541990qEH interfaceC1541990qEH4 = this.LLJJJJJIL;
                                    if (interfaceC1541990qEH4 != null) {
                                        this.LL.LJIILJJIL(interfaceC1541990qEH4);
                                        C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind-updateParam: " + i2 + ", " + str);
                                        C1537480q70 hybridContext = interfaceC1541990qEH4.getHybridContext();
                                        if ((hybridContext instanceof SparkContext) && (sparkContext = (SparkContext) hybridContext) != null) {
                                            sparkContext.LJJJLZIJ((int) I5(), "duration_after_live_take");
                                        }
                                        if ((interfaceC1541990qEH4 instanceof InterfaceC1105930esx) && (interfaceC1540940qCa = (InterfaceC1540940qCa) interfaceC1541990qEH4) != null) {
                                            interfaceC1540940qCa.LJIILIIL(interfaceC1540940qCa.LJIILJJIL());
                                        }
                                    }
                                }
                            } else if (this.LLJJJJ == null && C500260Jjc.LJJIIZ(str)) {
                                U5(str.concat("&back_opacity=1&live_center_exp=1"), strJ3);
                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LLJJJJ;
                                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                                    this.LL.LJIIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3);
                                    C20441214yg.LIZIZ("LiveCenterCards", "lynxVH onBind-updateParam: " + i2 + ", " + str);
                                    SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getSparkContext();
                                    if (sparkContext2 != null) {
                                        sparkContext2.LJJJLZIJ((int) I5(), "duration_after_live_take");
                                    }
                                    C0J39.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3);
                                }
                            }
                            ConstraintLayout constraintLayout3 = this.LLJJJIL;
                            if (constraintLayout3 != null) {
                                C500260Jjc.LJLJLJ(constraintLayout3, false);
                            }
                            View view3 = this.LLJJL;
                            if (view3 == null) {
                                return;
                            }
                            C786410Ut5.LJLLLLLL(0, view3);
                            return;
                        }
                        if (C500260Jjc.LJJIIZ(str2)) {
                            ConstraintLayout constraintLayout4 = this.LLJJJIL;
                            if (constraintLayout4 != null) {
                                C500260Jjc.LJLJLJ(constraintLayout4, true);
                            }
                            View view4 = this.LLJJL;
                            if (view4 != null) {
                                C786410Ut5.LJLLLLLL(0, view4);
                            }
                            C16F5 c16f58 = this.LLJJJJLIIL;
                            if (c16f58 != null) {
                                c16f58.setText(str2);
                            }
                        } else {
                            ConstraintLayout constraintLayout5 = this.LLJJJIL;
                            if (constraintLayout5 != null) {
                                C500260Jjc.LJLJLJ(constraintLayout5, false);
                            }
                            View view5 = this.LLJJL;
                            if (view5 != null) {
                                C786410Ut5.LJLLLLLL(4, view5);
                            }
                        }
                        if (LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                            InterfaceC1541990qEH interfaceC1541990qEH5 = this.LLJJJJJIL;
                            if (interfaceC1541990qEH5 != null && (viewE1 = interfaceC1541990qEH5.e1()) != null && (frameLayout = this.LLJJJ) != null) {
                                C786410Ut5.LJJJZ(viewE1, frameLayout);
                            }
                            InterfaceC1541990qEH interfaceC1541990qEH6 = this.LLJJJJJIL;
                            if (interfaceC1541990qEH6 != null) {
                                interfaceC1541990qEH6.LLD(true);
                            }
                            this.LL.LJIILJJIL(null);
                            this.LLJJJJJIL = null;
                        } else {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LLJJJJ;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null) {
                                FrameLayout frameLayout4 = this.LLJJJ;
                                if (frameLayout4 != null) {
                                    C786410Ut5.LJJJZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4, frameLayout4);
                                }
                                boolean z3 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LJJ(true);
                            }
                            this.LL.LJIIJ(null);
                            this.LLJJJJ = null;
                        }
                        C500260Jjc.LJLJLJ(this.LLJJJ, false);
                    }

                    public final void R5(View view) {
                        C16F5 c16f5;
                        C16F5 c16f52;
                        C16F5 c16f53;
                        C16F5 c16f54;
                        C16F5 c16f55;
                        C16F5 c16f56;
                        C16F5 c16f57;
                        C16F5 c16f58;
                        C16F5 c16f59;
                        C16F5 c16f510;
                        C16F5 c16f511;
                        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                            this.LLJJLIIIJLLLLLLLZ = (ViewGroup) view.findViewById(R.id.px6);
                        }
                        View viewFindViewById = view.findViewById(R.id.l4z);
                        C16F5 c16f512 = null;
                        if (viewFindViewById != null) {
                            c16f5 = (C16F5) viewFindViewById.findViewById(R.id.l1u);
                        } else {
                            c16f5 = null;
                        }
                        this.LLILLL = c16f5;
                        if (viewFindViewById != null) {
                            c16f52 = (C16F5) viewFindViewById.findViewById(R.id.l1t);
                        } else {
                            c16f52 = null;
                        }
                        this.LLILZ = c16f52;
                        View viewFindViewById2 = view.findViewById(R.id.l24);
                        if (viewFindViewById2 != null) {
                            c16f53 = (C16F5) viewFindViewById2.findViewById(R.id.l1u);
                        } else {
                            c16f53 = null;
                        }
                        this.LLILZIL = c16f53;
                        if (viewFindViewById2 != null) {
                            c16f54 = (C16F5) viewFindViewById2.findViewById(R.id.l1t);
                        } else {
                            c16f54 = null;
                        }
                        this.LLILZLL = c16f54;
                        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.l1v);
                        this.LLJ = viewGroup2;
                        if (viewGroup2 != null) {
                            c16f55 = (C16F5) viewGroup2.findViewById(R.id.l1u);
                        } else {
                            c16f55 = null;
                        }
                        this.LLIZ = c16f55;
                        ViewGroup viewGroup3 = this.LLJ;
                        if (viewGroup3 != null) {
                            c16f56 = (C16F5) viewGroup3.findViewById(R.id.l1t);
                        } else {
                            c16f56 = null;
                        }
                        this.LLIZLLLIL = c16f56;
                        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.l25);
                        this.LLJILJIL = viewGroup4;
                        if (viewGroup4 != null) {
                            c16f57 = (C16F5) viewGroup4.findViewById(R.id.l1u);
                        } else {
                            c16f57 = null;
                        }
                        this.LLJI = c16f57;
                        ViewGroup viewGroup5 = this.LLJILJIL;
                        if (viewGroup5 != null) {
                            c16f58 = (C16F5) viewGroup5.findViewById(R.id.l1t);
                        } else {
                            c16f58 = null;
                        }
                        this.LLJIJIL = c16f58;
                        ViewGroup viewGroup6 = (ViewGroup) view.findViewById(R.id.l1l);
                        this.LLJJ = viewGroup6;
                        if (viewGroup6 != null) {
                            c16f59 = (C16F5) viewGroup6.findViewById(R.id.l1u);
                        } else {
                            c16f59 = null;
                        }
                        this.LLJILJILJ = c16f59;
                        ViewGroup viewGroup7 = this.LLJJ;
                        if (viewGroup7 != null) {
                            c16f510 = (C16F5) viewGroup7.findViewById(R.id.l1t);
                        } else {
                            c16f510 = null;
                        }
                        this.LLJILLL = c16f510;
                        ViewGroup viewGroup8 = (ViewGroup) view.findViewById(R.id.l2n);
                        this.LLJJIJI = viewGroup8;
                        if (viewGroup8 != null) {
                            c16f511 = (C16F5) viewGroup8.findViewById(R.id.l1u);
                        } else {
                            c16f511 = null;
                        }
                        this.LLJJI = c16f511;
                        ViewGroup viewGroup9 = this.LLJJIJI;
                        if (viewGroup9 != null) {
                            c16f512 = (C16F5) viewGroup9.findViewById(R.id.l1t);
                        }
                        this.LLJJIII = c16f512;
                        this.LLJJJJLIIL = (C16F5) view.findViewById(R.id.px4);
                    }

                    {
                        Boolean boolValueOf;
                        RoomAuthStatus roomAuthStatus;
                        super(viewLJFF, c1ahd2);
                        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(getDataChannel());
                        if (roomLJJLIIIIJ != null && (roomAuthStatus = roomLJJLIIIIJ.getRoomAuthStatus()) != null) {
                            boolValueOf = Boolean.valueOf(roomAuthStatus.enableGift);
                        } else {
                            boolValueOf = null;
                        }
                        this.LLILLJJLI = C500260Jjc.LJJJI(boolValueOf);
                        this.LLJJIJIL = (ViewStub) viewLJFF.findViewById(R.id.px7);
                        this.LLJJJ = (FrameLayout) viewLJFF.findViewById(R.id.px9);
                        this.LLJJJIL = (ConstraintLayout) viewLJFF.findViewById(R.id.px1);
                        this.LLJJL = viewLJFF.findViewById(R.id.px2);
                        if (C500260Jjc.LJJJIL(getDataChannel())) {
                            S5();
                        }
                        N5();
                    }

                    public final void T5(String str, String str2) {
                        LifecycleOwner lifecycleOwner;
                        View viewE1;
                        FrameLayout frameLayout;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("replaceSparkView: ");
                        sbLIZ.append(str);
                        C20441214yg.LIZIZ("LiveCenterCards", C2188811AlT.LIZIZ(sbLIZ));
                        IHybridContainerService iHybridContainerServiceLJIILIIL = C781270Ukn.LJIILIIL();
                        Context context = getContext();
                        DataChannel dataChannel = getDataChannel();
                        if (dataChannel != null) {
                            lifecycleOwner = dataChannel.LLILZ;
                        } else {
                            lifecycleOwner = null;
                        }
                        InterfaceC1541990qEH interfaceC1541990qEHNN = iHybridContainerServiceLJIILIIL.NN(context, str, lifecycleOwner, false, AFwS279S0000000_33.get$arr$(367));
                        if (interfaceC1541990qEHNN != null) {
                            C1537480q70 hybridContext = interfaceC1541990qEHNN.getHybridContext();
                            if (hybridContext != null) {
                                hybridContext.initData = str2;
                            }
                            interfaceC1541990qEHNN.load();
                        }
                        FrameLayout frameLayout2 = this.LLJJJ;
                        if (frameLayout2 != null) {
                            C786410Ut5.LJJJJIZL(frameLayout2);
                        }
                        if (interfaceC1541990qEHNN != null && (viewE1 = interfaceC1541990qEHNN.e1()) != null && (frameLayout = this.LLJJJ) != null) {
                            frameLayout.addView(viewE1, -1, -2);
                        }
                        this.LLJJJJJIL = interfaceC1541990qEHNN;
                    }

                    public final void U5(String str, String str2) {
                        LifecycleOwner lifecycleOwner;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("replaceSparkView: ");
                        sbLIZ.append(str);
                        C20441214yg.LIZIZ("LiveCenterCards", C2188811AlT.LIZIZ(sbLIZ));
                        IHybridContainerService iHybridContainerServiceLJIILIIL = C781270Ukn.LJIILIIL();
                        Context context = getContext();
                        DataChannel dataChannel = getDataChannel();
                        if (dataChannel != null) {
                            lifecycleOwner = dataChannel.LLILZ;
                        } else {
                            lifecycleOwner = null;
                        }
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = iHybridContainerServiceLJIILIIL.DU1(context, str, lifecycleOwner, false, AFwS279S0000000_33.get$arr$(368));
                        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.getSparkContext();
                        if (sparkContext != null) {
                            sparkContext.initData = str2;
                        }
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.LJIIIIZZ();
                        FrameLayout frameLayout = this.LLJJJ;
                        if (frameLayout != null) {
                            C786410Ut5.LJJJJIZL(frameLayout);
                        }
                        FrameLayout frameLayout2 = this.LLJJJ;
                        if (frameLayout2 != null) {
                            frameLayout2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -2);
                        }
                        this.LLJJJJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                    }
                };
            }
        } else if (i == C1AH3.TIPS.getType()) {
            c1ahj = new C1AHA(C0J3Y.LJFF(C0J3Y.LIZ, LiveCenterNativePageRenew.INSTANCE.getTipsLayoutId(), viewGroup, false, null, false, 60), this.LL);
        } else if (i == C1AH3.PUNISH.getType()) {
            if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                viewLJIILL2 = C786410Ut5.Td(this.LLILLJJLI.getDarkInflater(), LiveCenterNativePageRenew.INSTANCE.getPunishLayoutId(), viewGroup, false);
            } else {
                viewLJIILL2 = C500260Jjc.LJIILL(LiveCenterNativePageRenew.INSTANCE.getPunishLayoutId(), viewGroup, false);
            }
            final C1AHD c1ahd3 = this.LL;
            c1ahj = new C1AHE(viewLJIILL2, c1ahd3) { // from class: X.1AGu
                public final RecyclerView LLILLJJLI;

                @Override // X.C1AHE
                public final void P5(int i2) {
                    Object objGg0;
                    DataChannel dataChannel = getDataChannel();
                    if (dataChannel != null) {
                        objGg0 = dataChannel.gg0(LiveModeChannel.class);
                    } else {
                        objGg0 = null;
                    }
                    if (objGg0 == LiveMode.LIVE_STUDIO) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_monitor_performance_module");
                        c474500IjALIZ.LJIJJLI(getDataChannel());
                        c474500IjALIZ.LJJII("live_studio", "live_type");
                        c474500IjALIZ.LJJII("anchor", "user_type");
                        c474500IjALIZ.LJJII("show", "action_type");
                        c474500IjALIZ.LJJII("violation_record", "module_name");
                        c474500IjALIZ.LIZ();
                    }
                }

                {
                    AbstractC21674919sB abstractC21674919sB;
                    long j;
                    RealtimeLiveCenterViolationRecordInfo realtimeLiveCenterViolationRecordInfo;
                    List<RealtimeViolationRecord> list;
                    RealtimeLiveCenterViolationRecordInfo realtimeLiveCenterViolationRecordInfo2;
                    super(viewLJIILL2, c1ahd3);
                    this.LLILLJJLI = (RecyclerView) viewLJIILL2.findViewById(R.id.si5);
                    List arrayList = null;
                    if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL5 = L5();
                        if (realtimeLiveCenterDetailDataL5 != null && (realtimeLiveCenterViolationRecordInfo2 = realtimeLiveCenterDetailDataL5.violationRecordInfo) != null) {
                            j = realtimeLiveCenterViolationRecordInfo2.keepShowingTime;
                        } else {
                            j = 180000;
                        }
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL52 = L5();
                        if (realtimeLiveCenterDetailDataL52 != null && (realtimeLiveCenterViolationRecordInfo = realtimeLiveCenterDetailDataL52.violationRecordInfo) != null && (list = realtimeLiveCenterViolationRecordInfo.violationRecords) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (RealtimeViolationRecord realtimeViolationRecord : list) {
                                RealtimeViolationRecord realtimeViolationRecord2 = realtimeViolationRecord;
                                if (realtimeViolationRecord2.endTime <= 0 || System.currentTimeMillis() - (realtimeViolationRecord2.endTime * 1000) <= j) {
                                    arrayList2.add(realtimeViolationRecord);
                                }
                            }
                            arrayList = new ArrayList(arrayList2);
                        }
                    } else {
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL53 = L5();
                        if (realtimeLiveCenterDetailDataL53 != null) {
                            arrayList = realtimeLiveCenterDetailDataL53.violationRecords;
                        }
                    }
                    C2176721AGw c2176721AGw = new C2176721AGw(viewLJIILL2.getContext(), getDataChannel(), arrayList);
                    c1ahd3.LIZJ(c2176721AGw);
                    AbstractC21673719rz itemAnimator = this.LLILLJJLI.getItemAnimator();
                    if ((itemAnimator instanceof C423520Gj8) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                        abstractC21674919sB.LLIZ = false;
                    }
                    this.LLILLJJLI.setAdapter(c2176721AGw);
                    this.LLILLJJLI.setLayoutManager(new LinearLayoutManager(getContext()));
                    if (LiveCenterNativePageRenew.INSTANCE.isEnable()) {
                        this.LLILLJJLI.addItemDecoration(new C476680Img(2));
                    }
                    C500260Jjc.LJLJLJ(viewLJIILL2.findViewById(R.id.y25), true);
                    C500260Jjc.LJLJLJ(viewLJIILL2.findViewById(R.id.y1r), false);
                    if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                        C500260Jjc.LLFFF(viewLJIILL2.findViewById(R.id.det));
                        TextView textView = (TextView) viewLJIILL2.findViewById(R.id.dey);
                        if (textView != null) {
                            textView.setText(C497740JfY.LJIJI(2131844159));
                        }
                        C16F5 c16f5 = (C16F5) viewLJIILL2.findViewById(R.id.dev);
                        if (c16f5 != null) {
                            C500260Jjc.LLFFF(c16f5);
                            C786410Ut5.l8(c16f5, new ACListenerS167S0100000_33(this, 86));
                        }
                    }
                }
            };
        } else if (i == C1AH3.GROWTH.getType()) {
            c1ahj = new C2176551AGf(C500260Jjc.LJIILL(LiveCenterNativePageRenew.INSTANCE.getGrowthLayoutId(), viewGroup, false), this.LL);
        } else if (i == C1AH3.LIVE_JOURNEY.getType()) {
            c1ahj = new C1888810zFf(C786410Ut5.Td(C1834150xpV.LIZJ(C786410Ut5.ne(viewGroup.getContext())), LiveCenterNativePageRenew.INSTANCE.getLiveJourneyLayoutId(), viewGroup, false), this.LL);
        } else if (i == C1AH3.LOP.getType()) {
            c1ahj = new C1AH7(C786410Ut5.Td(this.LLILLJJLI.getDarkInflater(), LiveCenterNativePageRenew.INSTANCE.getLiveLopLayoutId(), viewGroup, false), this.LL);
        } else if (i == C1AH3.PLAY_BOOK.getType()) {
            final View viewTd2 = C786410Ut5.Td(this.LLILLJJLI.getDarkInflater(), LiveCenterNativePageRenew.INSTANCE.getPlayBookLayoutId(), viewGroup, false);
            final C1AHD c1ahd4 = this.LL;
            c1ahj = new C1AHE(viewTd2, c1ahd4) { // from class: X.1AGt
                public final View LLILLJJLI;
                public final ViewGroup LLILLL;

                @Override // X.C1AHE
                public final void P5(int i2) {
                    AbstractC20368114mt abstractC20368114mtLJFF;
                    ViewGroup viewGroup2;
                    ViewGroup viewGroup3 = this.LLILLL;
                    if (viewGroup3 == null || viewGroup3.getChildCount() != 0 || this.LL.LJFF() == null || !(this.LL.LJFF() instanceof View) || (abstractC20368114mtLJFF = this.LL.LJFF()) == null) {
                        return;
                    }
                    if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                        abstractC20368114mtLJFF.LL.add(new AwS612S0100000_33(this, 178));
                    }
                    if (abstractC20368114mtLJFF.getParent() != this.LLILLL) {
                        ViewParent parent = abstractC20368114mtLJFF.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                            C786410Ut5.LJJJLZIJ(abstractC20368114mtLJFF, viewGroup2);
                        }
                        ViewGroup viewGroup4 = this.LLILLL;
                        if (viewGroup4 != null) {
                            viewGroup4.addView(abstractC20368114mtLJFF);
                        }
                    }
                }

                {
                    super(viewTd2, c1ahd4);
                    this.LLILLJJLI = viewTd2;
                    N5();
                    this.LLILLL = (ViewGroup) viewTd2.findViewById(R.id.qm9);
                }
            };
        } else if (i == C1AH3.PC_WEBSITE.getType()) {
            final C16F5 c16f5 = new C16F5(viewGroup.getContext(), null);
            C786410Ut5.y6(c16f5, new ViewGroup.LayoutParams(-1, -2));
            c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.c9l, viewGroup.getContext()));
            c16f5.LJJJI(R.style.rl);
            if (!LiveCenterNativePageRenew.INSTANCE.isEnable()) {
                c16f5.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
            }
            final C1AHD c1ahd5 = this.LL;
            c1ahj = new C1AHE(c16f5, c1ahd5) { // from class: X.1AGr
                public final C16F5 LLILLJJLI;

                @Override // X.C1AHE
                public final void P5(int i2) {
                    String str;
                    RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL5 = L5();
                    String str2 = null;
                    if (realtimeLiveCenterDetailDataL5 != null) {
                        str = realtimeLiveCenterDetailDataL5.webInstructions;
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C16F5 c16f52 = this.LLILLJJLI;
                        C786410Ut5.LLJJJJ(c16f52, 0);
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL52 = L5();
                        if (realtimeLiveCenterDetailDataL52 != null) {
                            str2 = realtimeLiveCenterDetailDataL52.webInstructions;
                        }
                        c16f52.setText(str2);
                        return;
                    }
                    C786410Ut5.LLJJJJ(this.LLILLJJLI, 8);
                }

                {
                    super(c16f5, c1ahd5);
                    this.LLILLJJLI = c16f5;
                }
            };
        } else if (i == C1AH3.TIKTOK_SHOP.getType()) {
            final View viewLJIILL4 = C500260Jjc.LJIILL(LiveCenterNativePageRenew.INSTANCE.getTiktokShopLayoutId(), viewGroup, false);
            final C1AHD c1ahd6 = this.LL;
            c1ahj = new C1AHE(viewLJIILL4, c1ahd6) { // from class: X.1AGv
                public final boolean LLILLJJLI;
                public final ViewStub LLILLL;
                public C16F5 LLILZ;
                public C16F5 LLILZIL;
                public C16F5 LLILZLL;
                public C16F5 LLIZ;
                public C16F5 LLIZLLLIL;
                public C16F5 LLJ;
                public boolean LLJI;

                @Override // X.C1AHE
                public final void P5(int i2) {
                    Boolean boolValueOf;
                    RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL5;
                    RealtimeLiveCenterShopData realtimeLiveCenterShopData;
                    long j;
                    RealtimeLiveCenterShopData realtimeLiveCenterShopData2;
                    Boolean boolValueOf2;
                    C16F5 c16f52;
                    C16F5 c16f53;
                    C16F5 c16f54;
                    C16F5 c16f55;
                    C16F5 c16f56;
                    C16F5 c16f57;
                    boolean z;
                    RealtimeLiveCenterShopData realtimeLiveCenterShopData3;
                    if (L5() != null) {
                        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL52 = L5();
                        if (realtimeLiveCenterDetailDataL52 != null && (realtimeLiveCenterShopData3 = realtimeLiveCenterDetailDataL52.shopInfo) != null) {
                            boolValueOf2 = Boolean.valueOf(realtimeLiveCenterShopData3.showShopData);
                        } else {
                            boolValueOf2 = null;
                        }
                        C500260Jjc.LJLJLJ(null, C500260Jjc.LJJJI(boolValueOf2));
                        if (!this.LLJI) {
                            if (LiveCenterNativePageRenew.INSTANCE.isEnable()) {
                                RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL53 = L5();
                                if (realtimeLiveCenterDetailDataL53 != null) {
                                    z = realtimeLiveCenterDetailDataL53.hideOverviewDiamond;
                                } else {
                                    z = false;
                                }
                                if (z && this.LLILLJJLI) {
                                    ViewStub viewStub = this.LLILLL;
                                    if (viewStub != null) {
                                        viewStub.setLayoutResource(R.layout.h13);
                                    }
                                    ViewStub viewStub2 = this.LLILLL;
                                    if (viewStub2 != null) {
                                        viewStub2.setInflatedId(R.id.v6f);
                                    }
                                    ViewStub viewStub3 = this.LLILLL;
                                    if (viewStub3 != null) {
                                        C786410Ut5.LJLLLL(viewStub3);
                                    }
                                } else {
                                    ViewStub viewStub4 = this.LLILLL;
                                    if (viewStub4 != null) {
                                        viewStub4.setLayoutResource(R.layout.h12);
                                    }
                                    ViewStub viewStub5 = this.LLILLL;
                                    if (viewStub5 != null) {
                                        viewStub5.setInflatedId(R.id.v6f);
                                    }
                                    ViewStub viewStub6 = this.LLILLL;
                                    if (viewStub6 != null) {
                                        C786410Ut5.LJLLLL(viewStub6);
                                    }
                                }
                            }
                            this.LLJI = true;
                            View view = this.itemView;
                            View viewFindViewById = view.findViewById(R.id.l3h);
                            if (viewFindViewById != null) {
                                c16f52 = (C16F5) viewFindViewById.findViewById(R.id.l1u);
                            } else {
                                c16f52 = null;
                            }
                            this.LLILZ = c16f52;
                            if (viewFindViewById != null) {
                                c16f53 = (C16F5) viewFindViewById.findViewById(R.id.l1t);
                            } else {
                                c16f53 = null;
                            }
                            this.LLILZIL = c16f53;
                            View viewFindViewById2 = view.findViewById(R.id.l3x);
                            if (viewFindViewById2 != null) {
                                c16f54 = (C16F5) viewFindViewById2.findViewById(R.id.l1u);
                            } else {
                                c16f54 = null;
                            }
                            this.LLILZLL = c16f54;
                            if (viewFindViewById2 != null) {
                                c16f55 = (C16F5) viewFindViewById2.findViewById(R.id.l1t);
                            } else {
                                c16f55 = null;
                            }
                            this.LLIZ = c16f55;
                            View viewFindViewById3 = view.findViewById(R.id.l1a);
                            if (viewFindViewById3 != null) {
                                c16f56 = (C16F5) viewFindViewById3.findViewById(R.id.l1u);
                            } else {
                                c16f56 = null;
                            }
                            this.LLIZLLLIL = c16f56;
                            if (viewFindViewById3 != null) {
                                c16f57 = (C16F5) viewFindViewById3.findViewById(R.id.l1t);
                            } else {
                                c16f57 = null;
                            }
                            this.LLJ = c16f57;
                            C16F5 c16f58 = this.LLILZ;
                            if (c16f58 != null) {
                                c16f58.setText(2131840612);
                            }
                            C16F5 c16f59 = this.LLILZLL;
                            if (c16f59 != null) {
                                c16f59.setText(2131840611);
                            }
                            C16F5 c16f510 = this.LLIZLLLIL;
                            if (c16f510 != null) {
                                c16f510.setText(2131840610);
                            }
                        }
                    }
                    RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataL54 = L5();
                    if (realtimeLiveCenterDetailDataL54 != null && (realtimeLiveCenterShopData2 = realtimeLiveCenterDetailDataL54.shopInfo) != null) {
                        boolValueOf = Boolean.valueOf(realtimeLiveCenterShopData2.showShopData);
                    } else {
                        boolValueOf = null;
                    }
                    boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                    C500260Jjc.LJLJLJ(null, zLJJJI);
                    if (zLJJJI && (realtimeLiveCenterDetailDataL5 = L5()) != null && (realtimeLiveCenterShopData = realtimeLiveCenterDetailDataL5.shopInfo) != null) {
                        C16F5 c16f511 = this.LLILZIL;
                        if (c16f511 != null) {
                            try {
                                j = CastLongProtector.parseLong(realtimeLiveCenterShopData.revenueAmount);
                            } catch (NumberFormatException e) {
                                TryCatchGuardChecker.doCheck(e);
                                j = 0;
                            }
                            c16f511.setText(C010F.LIZ(j));
                        }
                        C16F5 c16f512 = this.LLIZ;
                        if (c16f512 != null) {
                            c16f512.setText(C010F.LIZ(realtimeLiveCenterShopData.unitSales));
                        }
                        C16F5 c16f513 = this.LLJ;
                        if (c16f513 != null) {
                            c16f513.setText(C010F.LIZ(realtimeLiveCenterShopData.buyers));
                        }
                    }
                }

                {
                    Boolean boolValueOf;
                    RoomAuthStatus roomAuthStatus;
                    super(viewLJIILL4, c1ahd6);
                    Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(getDataChannel());
                    if (roomLJJLIIIIJ != null && (roomAuthStatus = roomLJJLIIIIJ.getRoomAuthStatus()) != null) {
                        boolValueOf = Boolean.valueOf(roomAuthStatus.enableGift);
                    } else {
                        boolValueOf = null;
                    }
                    this.LLILLJJLI = C500260Jjc.LJJJI(boolValueOf);
                    this.LLILLL = (ViewStub) viewLJIILL4.findViewById(R.id.v6g);
                    N5();
                }
            };
        } else if (i == C1AH3.FLARE_CARD.getType()) {
            if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                viewLJIILL = C786410Ut5.Td(this.LLILLJJLI.getDarkInflater(), LiveCenterNativePageRenew.INSTANCE.getPropsLayoutId(), viewGroup, false);
            } else {
                viewLJIILL = C500260Jjc.LJIILL(LiveCenterNativePageRenew.INSTANCE.getPropsLayoutId(), viewGroup, false);
            }
            c1ahj = new C1AHJ(viewLJIILL, this.LL);
        } else {
            final View viewLJIILL5 = C500260Jjc.LJIILL(LiveCenterNativePageRenew.INSTANCE.getLynxLayoutId(), viewGroup, false);
            final C1AHD c1ahd7 = this.LL;
            c1ahj = new C1AHE(viewLJIILL5, c1ahd7) { // from class: X.1AHB
                public final FrameLayout LLILLJJLI;
                public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLL;
                public InterfaceC1541990qEH LLILZ;

                @Override // X.C1AHE
                public final void P5(int i2) throws JSONException {
                    String strLIZIZ;
                    String strJ3;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                    LifecycleOwner lifecycleOwner;
                    View viewE1;
                    LynxView lynxView;
                    LynxView lynxView2;
                    RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTabLJIILIIL = this.LL.LJIILIIL(i2);
                    if (realtimeLiveCenterLayoutTabLJIILIIL == null) {
                        return;
                    }
                    if (LiveCenterNativePageRenew.INSTANCE.isEnable()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(realtimeLiveCenterLayoutTabLJIILIIL.lynxUrl);
                        sbLIZ.append("&live_center_exp=1");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strLIZIZ = realtimeLiveCenterLayoutTabLJIILIIL.lynxUrl;
                    }
                    String str = realtimeLiveCenterLayoutTabLJIILIIL.layoutName;
                    String str2 = realtimeLiveCenterLayoutTabLJIILIIL.lynxInitData;
                    Object objGg0 = null;
                    if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                        strJ3 = C786410Ut5.J3(C1887430zDR.LIZ(i2, str2, null));
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("lynx_data", str2);
                        jSONObject2.put("module_position", i2 - 1);
                        jSONObject.put("initial_data", jSONObject2);
                        strJ3 = C786410Ut5.J3(jSONObject);
                    }
                    C20441214yg.LIZIZ("LiveCenterCards", "initData: ".concat(strJ3));
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILLL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                        Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView();
                        if ((kitView instanceof LynxView) && (lynxView2 = (LynxView) kitView) != null) {
                            lynxView2.updateData(strJ3);
                        }
                    } else {
                        Object obj = this.LLILZ;
                        if (obj != null) {
                            if ((obj instanceof LynxView) && (lynxView = (LynxView) obj) != null) {
                                lynxView.updateData(strJ3);
                            }
                        } else if (LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                            IHybridContainerService iHybridContainerServiceLJIILIIL = C781270Ukn.LJIILIIL();
                            Context context = getContext();
                            DataChannel dataChannel = getDataChannel();
                            if (dataChannel != null) {
                                lifecycleOwner = dataChannel.LLILZ;
                            } else {
                                lifecycleOwner = null;
                            }
                            InterfaceC1541990qEH interfaceC1541990qEHNN = iHybridContainerServiceLJIILIIL.NN(context, strLIZIZ, lifecycleOwner, false, AFwS279S0000000_33.get$arr$(366));
                            if (interfaceC1541990qEHNN != null) {
                                C1537480q70 hybridContext = interfaceC1541990qEHNN.getHybridContext();
                                if (hybridContext != null) {
                                    hybridContext.initData = strJ3;
                                }
                                interfaceC1541990qEHNN.load();
                            }
                            C786410Ut5.LJJJJIZL(this.LLILLJJLI);
                            if (interfaceC1541990qEHNN != null && (viewE1 = interfaceC1541990qEHNN.e1()) != null) {
                                this.LLILLJJLI.addView(viewE1, -1, -2);
                            }
                            this.LL.LIZLLL(this.LLILZ, interfaceC1541990qEHNN);
                            this.LLILZ = interfaceC1541990qEHNN;
                        } else if (Intrinsics.LJFF(str, "decoupling_live_reward") && C12OR.LIZ) {
                            C1537060q6K c1537060q6K = C1529590puH.LIZ;
                            InterfaceC1540940qCa interfaceC1540940qCaLJ = C1537060q6K.LJ(getContext(), strLIZIZ, "live_slr_diamonds", null, 24);
                            if ((interfaceC1540940qCaLJ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1540940qCaLJ) != null) {
                                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                                if (sparkContext != null) {
                                    sparkContext.initData = strJ3;
                                }
                                C786410Ut5.LJJJJIZL(this.LLILLJJLI);
                                this.LLILLJJLI.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, -1, -2);
                                this.LL.LIZ(this.LLILLL, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                                this.LLILLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                            } else {
                                R5(strLIZIZ, strJ3);
                            }
                        } else {
                            R5(strLIZIZ, strJ3);
                        }
                    }
                    if (Intrinsics.LJFF(realtimeLiveCenterLayoutTabLJIILIIL.layoutName, C1AH3.FLARE_CARD.getLayoutName())) {
                        DataChannel dataChannel2 = getDataChannel();
                        if (dataChannel2 != null) {
                            objGg0 = dataChannel2.gg0(LiveModeChannel.class);
                        }
                        if (objGg0 == LiveMode.LIVE_STUDIO) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_monitor_performance_module");
                            c474500IjALIZ.LJIJJLI(getDataChannel());
                            c474500IjALIZ.LJJII("live_studio", "live_type");
                            c474500IjALIZ.LJJII("anchor", "user_type");
                            c474500IjALIZ.LJJII("show", "action_type");
                            c474500IjALIZ.LJJII("flash", "module_name");
                            c474500IjALIZ.LIZ();
                        }
                    }
                }

                {
                    super(viewLJIILL5, c1ahd7);
                    this.LLILLJJLI = (FrameLayout) viewLJIILL5.findViewById(R.id.nua);
                }

                public final void R5(String str, String str2) {
                    LifecycleOwner lifecycleOwner;
                    IHybridContainerService iHybridContainerServiceLJIILIIL = C781270Ukn.LJIILIIL();
                    Context context = getContext();
                    DataChannel dataChannel = getDataChannel();
                    if (dataChannel != null) {
                        lifecycleOwner = dataChannel.LLILZ;
                    } else {
                        lifecycleOwner = null;
                    }
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = iHybridContainerServiceLJIILIIL.DU1(context, str, lifecycleOwner, false, AFwS279S0000000_33.get$arr$(365));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("lynxVH replaceSparkView: ");
                    sbLIZ.append(str);
                    C20441214yg.LIZIZ("LiveCenterCards", C2188811AlT.LIZIZ(sbLIZ));
                    SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.getSparkContext();
                    if (sparkContext != null) {
                        sparkContext.initData = str2;
                    }
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.LJIIIIZZ();
                    C786410Ut5.LJJJJIZL(this.LLILLJJLI);
                    this.LLILLJJLI.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -2);
                    this.LL.LIZ(this.LLILLL, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1);
                    this.LLILLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                }
            };
        }
        try {
            View view = c1ahj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1ahj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1ahj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1ahj.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1ahj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1ahj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1ahj.getClass().getName();
        return c1ahj;
    }
}
