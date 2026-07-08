package X;

import Y.AfS151S0200000_15;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.ThemeAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.platform.common.settings.LinkMicNonsupportElementTypesSetting;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiContainerInfo;
import com.bytedance.android.livesdk.sei.SeiTextHeaderExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aZM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940020aZM extends AbstractC939760aYw {
    public C940490aa7 LLILLJJLI;
    public MultiGuestSharedBgGuestViewModel LLIZ;
    public final C01GW LLJ;
    public C940320aZq LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;
    public ImageView LLJILLL;
    public C15P4 LLJJ;
    public SeiTextHeaderExtra LLJJI;
    public View LLJJIII;
    public boolean LLJJIJI;
    public final List<InterfaceC942030acb> LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public View LLJJJ;
    public final C01GW LLJJJIL;
    public InterfaceC964790bDJ LLJJJJ;
    public InterfaceC940060aZQ LLJJJJJIL;
    public SeiAppData LLJJJJLIIL;
    public Pair<Integer, Integer> LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public boolean LLJLIL;
    public InterfaceC940300aZo LLJLILLLLZIIL;
    public InterfaceC940230aZh LLJLL;
    public Function1<? super Rect, Unit> LLJLLIL;
    public final HashMap<String, Integer> LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C940050aZP LLLFFI;
    public final C942010acZ LLLFZ;
    public int LLILLL = 1;
    public int LLILZ = -1;
    public final String LLILZIL = "feed_new_layout";
    public final MutableLiveData<MultiGuestThemeViewModel> LLILZLL = new MutableLiveData<>();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(447));

    @Override // X.AbstractC939760aYw
    public final DataChannel LJII() {
        LiveWidget liveWidget;
        C940490aa7 c940490aa7 = this.LLILLJJLI;
        if (c940490aa7 == null) {
            return null;
        }
        LiveWidget liveWidget2 = c940490aa7.LJI;
        if (liveWidget2 != null) {
            if (liveWidget2.dataChannel != null) {
                if (c940490aa7 == null || (liveWidget = c940490aa7.LJI) == null) {
                    return null;
                }
                return liveWidget.dataChannel;
            }
            if (c940490aa7 == null) {
                return null;
            }
        }
        return c940490aa7.LJIILIIL;
    }

    @Override // X.AbstractC939760aYw
    public final FrameLayout LJIIIZ() {
        C940490aa7 c940490aa7 = this.LLILLJJLI;
        View view = c940490aa7 != null ? c940490aa7.LJIIL : null;
        if (view instanceof FrameLayout) {
            return (FrameLayout) view;
        }
        return null;
    }

    public final C940750aaX LJIJJ() {
        return (C940750aaX) this.LLJZIJLIL.getValue();
    }

    public final C938220aWS LJIJJLI() {
        return (C938220aWS) this.LLJJJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LJIL() {
        /*
            r3 = this;
            com.bytedance.android.livesdk.sei.SeiTextHeaderExtra r2 = r3.LLJJI
            r1 = 0
            if (r2 == 0) goto L1b
            java.lang.Integer r0 = r2.recommendOpt
            if (r0 == 0) goto L1b
            java.lang.Integer r0 = r2.recommendOpt
            if (r0 == 0) goto L19
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L19
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L19:
            r1 = 0
            goto L14
        L1b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940020aZM.LJIL():java.lang.Boolean");
    }

    public C940020aZM() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(446));
        this.LLJ = c01gwLIZIZ;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1080));
        this.LLJILJIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(449));
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1081));
        C948450amx c948450amx = C948450amx.LIZIZ;
        if (c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER") == null) {
            C937310aUz.LJII("feed_new_layout", "injector MULTI_GUEST_DATA_HOLDER");
            c948450amx.LJFF(c01gwLIZIZ.getValue(), "MULTI_GUEST_DATA_HOLDER");
        }
        this.LLJJJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1077));
        new Rect();
        this.LLJLLL = new HashMap<>();
        this.LLJZ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(445));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1076));
        this.LLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1079));
        this.LLLF = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1078));
        this.LLLFF = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(448));
        this.LLLFFI = new C940050aZP(this);
        this.LLLFZ = new C942010acZ(this);
    }

    @Override // X.AbstractC939760aYw
    public final C938220aWS LJI() {
        return LJIJJLI();
    }

    @Override // X.AbstractC939760aYw
    public final String LJIIIIZZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC939760aYw
    public final Pair<String, Map<EnumC939920aZC, List<EnumC939900aZA>>> LIZLLL(C957020b0m c957020b0m) {
        Integer numValueOf;
        C940490aa7 c940490aa7;
        C940490aa7 c940490aa72 = this.LLILLJJLI;
        if (c940490aa72 != null) {
            numValueOf = Integer.valueOf(c940490aa72.LJIILJJIL);
        } else {
            numValueOf = null;
        }
        Pair<String, Map<EnumC939920aZC, List<EnumC939900aZA>>> pairLJ = AbstractC939760aYw.LJ(this, c957020b0m, null, numValueOf, 2);
        if (pairLJ != null && (c940490aa7 = this.LLILLJJLI) != null) {
            int i = c940490aa7.LJIILJJIL;
            EnumC940090aZT enumC940090aZT = c940490aa7.LJFF;
            if (enumC940090aZT != null) {
                LinkMicNonsupportElementTypesSetting linkMicNonsupportElementTypesSetting = LinkMicNonsupportElementTypesSetting.INSTANCE;
                ArrayList arrayList = (ArrayList) C13LP.LJLIL(linkMicNonsupportElementTypesSetting.getPageTypeFilterList(enumC940090aZT.toString()), linkMicNonsupportElementTypesSetting.getRoomModeFilterList(i));
                if (!arrayList.isEmpty()) {
                    HashMap map = new HashMap();
                    for (Map.Entry<EnumC939920aZC, List<EnumC939900aZA>> entry : pairLJ.getSecond().entrySet()) {
                        List<EnumC939900aZA> value = entry.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : value) {
                            EnumC939900aZA enumC939900aZA = (EnumC939900aZA) obj;
                            boolean zContains = arrayList.contains(enumC939900aZA.getIdentifier());
                            if (zContains) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("getBizConfig roomMode:");
                                sbLIZ.append(i);
                                sbLIZ.append(" pageType:");
                                sbLIZ.append(enumC940090aZT);
                                sbLIZ.append(" filter ");
                                sbLIZ.append(enumC939900aZA.name());
                                C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
                                if (!zContains) {
                                }
                            }
                            arrayList2.add(obj);
                        }
                        map.put(entry.getKey(), arrayList2);
                    }
                    return new Pair<>(pairLJ.getFirst(), map);
                }
                return pairLJ;
            }
            return pairLJ;
        }
        return pairLJ;
    }

    @Override // X.AbstractC939760aYw
    public final void LJIIL(C957020b0m c957020b0m) {
        String str;
        PosIdentity posIdentity = c957020b0m.getPosIdentity();
        if (posIdentity != null && posIdentity.type == 1 && (str = posIdentity.value) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPosIdentityReady linkMicId=");
            sbLIZ.append(str);
            sbLIZ.append(" isAnchor=");
            sbLIZ.append(c957020b0m.LLJIJIL);
            C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
            C938220aWS c938220aWSLJIJJLI = LJIJJLI();
            if (c938220aWSLJIJJLI != null) {
                c938220aWSLJIJJLI.LIZJ(str, true, c957020b0m.LLJIJIL);
            }
        }
    }

    @Override // X.AbstractC939760aYw
    public final void LJIILLIIL(EnumC934000aPe enumC934000aPe) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchRole role=");
        sbLIZ.append(enumC934000aPe);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannelLJII = LJII();
        if (dataChannelLJII != null) {
            dataChannelLJII.zW(MultiGuestLayoutRenderV2.RoleChannel.class, Collections.singletonList(enumC934000aPe));
        }
    }

    public final void LJIJI(String str) {
        boolean z;
        DataChannel dataChannelLJII;
        C940170aZb c940170aZb;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dropLayoutOnly source=");
        sbLIZ.append(str);
        sbLIZ.append(" hasExternal=");
        if (this.LLJJJJJIL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        if (C943630afB.LIZ().addShowLog && (dataChannelLJII = LJII()) != null && (c940170aZb = (C940170aZb) dataChannelLJII.gg0(C956980b0i.class)) != null) {
            c940170aZb.LIZ = 0L;
            c940170aZb.LIZIZ = 0L;
            c940170aZb.LIZJ = 0L;
        }
        this.LLJL = null;
        this.LLJILJILJ = false;
        InterfaceC940060aZQ interfaceC940060aZQ = this.LLJJJJJIL;
        if (interfaceC940060aZQ != null && !interfaceC940060aZQ.isDestroyed()) {
            EnumC965630bEf enumC965630bEf = EnumC965630bEf.SEI_END;
            if (str == null) {
                str = "";
            }
            interfaceC940060aZQ.LJLLLL(enumC965630bEf, new C917100ZyO("feed_preview_drop", str));
        }
        C0C27.LIZ(new AwS559S0100000_15(this, 1075));
    }

    public final void LJJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideSharedBgIvAndClearData source:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("wws_test_layout", C2188811AlT.LIZIZ(sbLIZ));
        ImageView imageView = this.LLJILLL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
            imageView.setImageResource(0);
            imageView.setTag(R.id.v3e, "");
        }
    }

    public final void LJJIII(String str) {
        Rect rectLJJIIJZLJL;
        int size;
        boolean z;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int iIntValue;
        int iIntValue2;
        SeiContainerInfo seiContainerInfo;
        List<C957030b0n> listLJLLJ;
        InterfaceC940060aZQ interfaceC940060aZQ = this.LLJJJJJIL;
        Pair<Integer, Integer> pair = this.LLJJL;
        String str2 = null;
        if (interfaceC940060aZQ != null) {
            rectLJJIIJZLJL = interfaceC940060aZQ.LJJIIJZLJL();
        } else {
            rectLJJIIJZLJL = null;
        }
        if (interfaceC940060aZQ != null && (listLJLLJ = interfaceC940060aZQ.LJLLJ()) != null) {
            size = listLJLLJ.size();
        } else {
            size = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestLayoutRefresh reason=");
        sbLIZ.append(str);
        sbLIZ.append(" hasExternal=");
        if (interfaceC940060aZQ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" destroyed=");
        if (interfaceC940060aZQ != null) {
            boolValueOf = Boolean.valueOf(interfaceC940060aZQ.isDestroyed());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" initialized=");
        if (interfaceC940060aZQ != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC940060aZQ.LLIILII());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(" pendingLayoutRefresh=");
        sbLIZ.append(this.LLJLIL);
        sbLIZ.append(" streamSize=");
        if (pair != null) {
            iIntValue = pair.getFirst().intValue();
        } else {
            iIntValue = 0;
        }
        sbLIZ.append(iIntValue);
        sbLIZ.append('x');
        if (pair != null) {
            iIntValue2 = pair.getSecond().intValue();
        } else {
            iIntValue2 = 0;
        }
        sbLIZ.append(iIntValue2);
        sbLIZ.append(" spotCount=");
        sbLIZ.append(size);
        sbLIZ.append(" playerFrame=");
        sbLIZ.append(rectLJJIIJZLJL);
        sbLIZ.append(" latestLayoutKey=");
        SeiAppData seiAppData = this.LLJJJJLIIL;
        if (seiAppData != null && (seiContainerInfo = seiAppData.linkMicContainer) != null) {
            str2 = seiContainerInfo.layoutKey;
        }
        if (str2 == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC940060aZQ != null && !interfaceC940060aZQ.isDestroyed() && interfaceC940060aZQ.LLIILII()) {
            this.LLJLIL = false;
            interfaceC940060aZQ.LIZLLL(new C917100ZyO(str, ""));
        }
    }

    public final void LJJIIJ(InterfaceC940230aZh interfaceC940230aZh) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLinkActionCallback hasCallback=");
        if (interfaceC940230aZh != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLL = interfaceC940230aZh;
    }

    public final void LJJIIJZLJL(InterfaceC940300aZo interfaceC940300aZo) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLivePlayController hasController=");
        if (interfaceC940300aZo != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLILLLLZIIL = interfaceC940300aZo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940020aZM.LJJIIZ(java.lang.String):void");
    }

    public final void LJJIIZI(EnumC918830a1B enumC918830a1B) {
        int i = C917250Zyd.LIZIZ[enumC918830a1B.ordinal()];
        int i2 = 2;
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else {
                throw new C1954807lC();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncAudienceApplyUi applyState=");
        sbLIZ.append(enumC918830a1B);
        sbLIZ.append(" uiMode=");
        sbLIZ.append(i2);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannelLJII = LJII();
        if (dataChannelLJII != null) {
            dataChannelLJII.zW(MultiLiveUIChangeEvent.class, Integer.valueOf(i2));
        }
        DataChannel dataChannelLJII2 = LJII();
        if (dataChannelLJII2 != null) {
            if (i2 != 1) {
                z = false;
            }
            dataChannelLJII2.zW(IsViewerLimitedStatusChannel.class, Boolean.valueOf(z));
        }
    }

    public final void LJJIJ(C942080acg c942080acg) {
        C947470alN c947470alN;
        RectF rectF;
        Rect rect;
        InterfaceC940060aZQ interfaceC940060aZQ = this.LLJJJJJIL;
        if (interfaceC940060aZQ == null || (rect = interfaceC940060aZQ.LJJIIJZLJL()) == null) {
            if (c942080acg != null && (c947470alN = c942080acg.LIZ) != null && (rectF = c947470alN.LIZJ) != null) {
                rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            } else {
                return;
            }
        }
        Function1<? super Rect, Unit> function1 = this.LLJLLIL;
        if (function1 != null) {
            function1.invoke(rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d3  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(android.widget.FrameLayout r24) {
        /*
            Method dump skipped, instruction units count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940020aZM.LJJIJIIJI(android.widget.FrameLayout):void");
    }

    public final void LJJIJIIJIL(SeiTextHeaderExtra seiTextHeaderExtra) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTextHeader playInfo:");
        sbLIZ.append(seiTextHeaderExtra);
        sbLIZ.append(" textHeaderView:");
        sbLIZ.append(this.LLJJ);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        if (seiTextHeaderExtra == null || (str = seiTextHeaderExtra.font) == null) {
            str = "";
        }
        this.LLJJI = seiTextHeaderExtra;
        if (seiTextHeaderExtra != null && str.length() != 0) {
            C15P4 c15p4 = this.LLJJ;
            if (c15p4 != null) {
                int visibility = c15p4.getVisibility();
                c15p4.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c15p4);
            }
            C15P4 c15p42 = this.LLJJ;
            ViewGroup.LayoutParams layoutParams = null;
            if (c15p42 != null) {
                layoutParams = c15p42.getLayoutParams();
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (numLIZ = C931810aM7.LIZ(LJIL())) != null) {
                int iLIZ = C439101nJ.LIZ(numLIZ.intValue());
                marginLayoutParams.setMarginStart(iLIZ);
                marginLayoutParams.setMarginEnd(iLIZ);
                C15P4 c15p43 = this.LLJJ;
                if (c15p43 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c15p43);
                    c15p43.setLayoutParams(marginLayoutParams);
                }
            }
            C15P4 c15p44 = this.LLJJ;
            if (c15p44 != null) {
                c15p44.LJIIIIZZ(C972080bP4.LJII(seiTextHeaderExtra));
            }
            C19487311Lz.LIZJ(C20424314vx.LIZ(str), (C11NJ) this.LLJZ.getValue(), new AfS151S0200000_15(this, seiTextHeaderExtra, 64), new C09JN() { // from class: X.0aZZ
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("MultiGuestFeedLayoutRender@2c38.updateTextHeader$2");
                    C1C7U.LIZIZ("MultiGuestFeedLayoutRender@2c38.updateTextHeader$2");
                }
            }, 24);
            return;
        }
        C15P4 c15p45 = this.LLJJ;
        if (c15p45 == null) {
            return;
        }
        int visibility2 = c15p45.getVisibility();
        c15p45.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c15p45);
    }

    public final void LJJIFFI(String str, List list) {
        Boolean boolValueOf;
        C923110a85 c923110a85;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Integer>> c11pq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTalkVolumeSei source:");
        sbLIZ.append(str);
        sbLIZ.append(" data");
        sbLIZ.append(list);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InteractAudioVolumeInfo interactAudioVolumeInfo = (InteractAudioVolumeInfo) it2.next();
                int i = interactAudioVolumeInfo.volume;
                String str2 = interactAudioVolumeInfo.linkMicId;
                C938220aWS c938220aWSLJIJJLI = LJIJJLI();
                if (c938220aWSLJIJJLI != null && (c938230aWTLIZJ = c938220aWSLJIJJLI.LIZJ(str2, true, false)) != null && (c11pq = c938230aWTLIZJ.LJIILIIL) != null) {
                    c11pq.onNext(Collections.singletonList(Integer.valueOf(i)));
                }
                C940490aa7 c940490aa7 = this.LLILLJJLI;
                if (c940490aa7 != null) {
                    boolValueOf = Boolean.valueOf(C933980aPc.LJIIIZ(c940490aa7.LJIILJJIL));
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf) && (c923110a85 = (C923110a85) this.LLJJIJIL.getValue()) != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        InteractAudioVolumeInfo interactAudioVolumeInfo2 = (InteractAudioVolumeInfo) it3.next();
                        InterfaceC922070a6P interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(c923110a85.LLILZLL, InterfaceC922070a6P.class);
                        if (interfaceC922070a6P != null) {
                            interfaceC922070a6P.LJJIJIIJI(interactAudioVolumeInfo2.volume, interactAudioVolumeInfo2.linkMicId);
                        }
                    }
                }
            }
        }
    }

    public final void LJJII(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoStreamSizeChange size=");
        sbLIZ.append(i);
        sbLIZ.append('x');
        sbLIZ.append(i2);
        sbLIZ.append(" pendingLayoutRefresh=");
        sbLIZ.append(this.LLJLIL);
        C937310aUz.LJII("feed_new_layout", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJL = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.LLLFFI.LIZIZ(i, i2);
        if (this.LLJLIL) {
            LJJIII("video_size");
        }
    }

    @Override // X.AbstractC939760aYw
    public final C939730aYt LIZIZ(C957020b0m c957020b0m, FrameLayout frameLayout, Pair<String, ? extends Map<EnumC939920aZC, ? extends List<? extends EnumC939900aZA>>> pair) {
        DataChannel dataChannelLJII = LJII();
        if (dataChannelLJII == null) {
            C766270U4b.LJIIJJI("dataChannel is null,pls check");
            return null;
        }
        return new C939730aYt(C1834150xpV.LJIIJJI(c957020b0m.getContext()), dataChannelLJII, new WeakReference(LJIJJLI()), c957020b0m, frameLayout, pair, LJIJJ().LIZIZ, this.LLJJJJJIL, true);
    }

    public final void LJJI(MultiGuestThemeViewModel multiGuestThemeViewModel, InterfaceC665370Q7z interfaceC665370Q7z, LifecycleOwner lifecycleOwner) {
        if (interfaceC665370Q7z != null) {
            C1555540qa8.LIZ(interfaceC665370Q7z, new ThemeAbilityImpl(multiGuestThemeViewModel), IThemeAbility.class, null);
            multiGuestThemeViewModel.LL = true;
            multiGuestThemeViewModel.iT0(interfaceC665370Q7z);
        }
        multiGuestThemeViewModel.vQ2(new C2217371BqR() { // from class: X.0aYf
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C938810aXP) obj).LLILZ);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C938810aXP) obj).LLILZ = ((Number) obj2).intValue();
            }
        }, null, lifecycleOwner, new AwS594S0100000_15(this, 1083));
        this.LLILZLL.postValue(multiGuestThemeViewModel);
    }
}
