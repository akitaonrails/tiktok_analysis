package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS19S1200000_15;
import Y.AfS5S0100100_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.TopLiveSkylightTransYChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestHostTagUiOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatAvatarSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicFixListByTypeParams;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCardOverdrawOptSetting;
import com.bytedance.android.livesdk.sei.LinkMicSei;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiInfos;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS37S1400000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940390aZx implements InterfaceC940380aZw {
    public long LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public View LLIZ;
    public boolean LLIZLLLIL;
    public C940490aa7 LLJILLL;
    public InterfaceC937900aVw LLJJ;
    public final C01GW LL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(434));
    public final Map<String, LinkPlayerInfo> LLILZIL = new LinkedHashMap();
    public final Map<String, Integer> LLILZLL = new LinkedHashMap();
    public final C01GW LLJ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(436));
    public final C01GW LLJI = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(437));
    public final C01GW LLJIJIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(439));
    public final C01GW LLJILJIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(438));
    public final C01GW LLJILJILJ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(435));

    @Override // X.InterfaceC940380aZw
    public final void LJIIL(InterfaceC940230aZh interfaceC940230aZh) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJIJL(C2180891AWx c2180891AWx) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJJI() {
    }

    @Override // X.InterfaceC958970b3v
    public final boolean LJJJIL() {
        return true;
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIIIL(Map map) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJJJ() {
    }

    @Override // X.InterfaceC940380aZw
    public final void LLJJJIL() {
        this.LLIZLLLIL = true;
    }

    @Override // X.InterfaceC940380aZw
    public final void LLJJJJJIL(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLLL(List list, boolean z) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLJ(LinkUser linkUser) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
    }

    @Override // X.InterfaceC940380aZw
    public final void LLLLLJIL(C945320ahu c945320ahu) {
    }

    public final CopyOnWriteArrayList<AbstractC940410aZz> LIZ() {
        return (CopyOnWriteArrayList) this.LLJ.getValue();
    }

    @Override // X.InterfaceC940380aZw
    public final void release() {
        InterfaceC937900aVw interfaceC937900aVw = this.LLJJ;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.V4(true);
        }
        this.LLJJ = null;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this, 1067));
    }

    public final void LIZLLL(InterfaceC937840aVq interfaceC937840aVq) {
        String str;
        AbstractC940410aZz abstractC940410aZz;
        Object next;
        int i = C917150ZyT.LIZ[interfaceC937840aVq.state().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4 && i != 5) {
                throw new C1954807lC();
            }
            CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayListLIZ = LIZ();
            ArrayList arrayList = new ArrayList();
            for (AbstractC940410aZz abstractC940410aZz2 : copyOnWriteArrayListLIZ) {
                if (abstractC940410aZz2 instanceof C940400aZy) {
                    arrayList.add(abstractC940410aZz2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                abstractC940410aZz = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    C940400aZy c940400aZy = (C940400aZy) next;
                    if (Intrinsics.LJFF(c940400aZy.LLILZIL, interfaceC937840aVq.LJ()) && c940400aZy.LLILLL && Intrinsics.LJFF(c940400aZy.LLILLJJLI, interfaceC937840aVq.LJJIIJ())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C940400aZy c940400aZy2 = (C940400aZy) next;
            if (c940400aZy2 != null) {
                LJ(c940400aZy2, "onWindowStateChanged");
                return;
            }
            String strLJ = interfaceC937840aVq.LJ();
            if (strLJ == null) {
                return;
            }
            C940400aZy c940400aZy3 = new C940400aZy(strLJ);
            C786410Ut5.LJJJJIZL(interfaceC937840aVq.LJJIIJ());
            c940400aZy3.LJII(interfaceC937840aVq.LJJIIJ());
            Iterator<AbstractC940410aZz> it3 = LIZ().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AbstractC940410aZz next2 = it3.next();
                if (Intrinsics.LJFF(next2.LIZ(), strLJ)) {
                    abstractC940410aZz = next2;
                    break;
                }
            }
            AbstractC940410aZz abstractC940410aZz3 = abstractC940410aZz;
            if (abstractC940410aZz3 != null) {
                LIZ().remove(abstractC940410aZz3);
                ((ConcurrentHashMap) this.LLJI.getValue()).remove(abstractC940410aZz3.LIZ());
            }
            LIZ().add(c940400aZy3);
            ((ConcurrentHashMap) this.LLJI.getValue()).put(strLJ, c940400aZy3);
            LJ(c940400aZy3, "");
            return;
        }
        if (!this.LLIZLLLIL && (str = this.LLILZ) != null) {
            C940420aa0 c940420aa0 = new C940420aa0(str);
            C786410Ut5.LJJJJIZL(interfaceC937840aVq.LJJIIJ());
            c940420aa0.LJII(interfaceC937840aVq.LJJIIJ());
            if (LiveAbLabelSetting.INSTANCE.getBooleanValue("linkmic_sdk_layout_refactor_voice") && LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().optFeedLeak) {
                return;
            }
            LIZ().add(c940420aa0);
        }
    }

    @Override // X.InterfaceC940380aZw
    public final void LJJZZIII(LinkMicSei linkMicSei) {
        List<SeiInfos> list;
        C940400aZy c940400aZy;
        if (!this.LLIZLLLIL && linkMicSei != null && (list = linkMicSei.infos) != null) {
            for (SeiInfos seiInfos : list) {
                String str = seiInfos.linkMicId;
                Integer num = seiInfos.vol;
                if (str != null && num != null) {
                    Object obj = ((ConcurrentHashMap) this.LLJI.getValue()).get(str);
                    if ((obj instanceof C940400aZy) && (c940400aZy = (C940400aZy) obj) != null) {
                        c940400aZy.LJIIL(num.intValue());
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC940380aZw
    public final void LLLLJI(InterfaceC940430aa1 interfaceC940430aa1) {
        long jLongValue;
        String str;
        boolean z;
        boolean z2;
        char c;
        C940400aZy c940400aZy;
        C940400aZy c940400aZy2;
        C940490aa7 c940490aa7;
        Long l;
        C940490aa7 c940490aa72;
        String string;
        long j;
        Long l2;
        Long lLJIILIIL;
        String strU3 = interfaceC940430aa1.U3();
        long jLongValue2 = 0;
        if (strU3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        this.LLILLJJLI = jLongValue;
        this.LLILLL = interfaceC940430aa1.LIZIZ();
        SeiDsl seiDslLJII = interfaceC940430aa1.LJII();
        if (seiDslLJII != null) {
            str = seiDslLJII.layoutId;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(this.LLILZ, str)) {
            this.LLILZ = str;
            CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayListLIZ = LIZ();
            ArrayList arrayList = new ArrayList();
            for (AbstractC940410aZz abstractC940410aZz : copyOnWriteArrayListLIZ) {
                if (abstractC940410aZz instanceof C940400aZy) {
                    arrayList.add(abstractC940410aZz);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LJ((C940400aZy) it2.next(), "");
            }
        }
        HashMap map = new HashMap();
        boolean z3 = false;
        for (Map.Entry<String, Integer> entry : interfaceC940430aa1.LIZJ().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
            if (!((HashMap) this.LLJILJILJ.getValue()).containsKey(entry.getKey())) {
                z3 = true;
            }
        }
        ((HashMap) this.LLJILJILJ.getValue()).clear();
        ((HashMap) this.LLJILJILJ.getValue()).putAll(map);
        if (z3 && (c940490aa7 = this.LLJILLL) != null && (l = c940490aa7.LIZIZ) != null) {
            l.longValue();
            if (this.LLILLJJLI != 0 && ((c940490aa72 = this.LLJILLL) == null || (c940490aa72.LIZ != 0 && ((l2 = c940490aa72.LIZIZ) == null || l2.longValue() != 0)))) {
                long jLIZIZ = C963140bAe.LIZIZ();
                List listSingletonList = Collections.singletonList(1);
                if (LinkMicFixListByTypeParams.isEnable()) {
                    string = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, listSingletonList, new TypeToken<List<? extends Integer>>() { // from class: X.04X2
                    }.getType());
                } else {
                    string = listSingletonList.toString();
                }
                C480460Ism.LIZ().getClass();
                MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
                C940490aa7 c940490aa73 = this.LLJILLL;
                if (c940490aa73 != null) {
                    j = c940490aa73.LIZ;
                    Long l3 = c940490aa73.LIZIZ;
                    if (l3 != null) {
                        jLongValue2 = l3.longValue();
                    }
                } else {
                    j = 0;
                }
                C19487311Lz.LIZJ(multiLiveApi.getListByType(j, jLongValue2, this.LLILLJJLI, string, 1, 0, 9, 0, 0L, null).LJFF(new C0UO0()), (C11NJ) this.LL.getValue(), new AfS5S0100100_15(jLIZIZ, this, 10), new AfS5S0100100_15(jLIZIZ, this, 11), 24);
            }
        }
        if (this.LLIZLLLIL) {
            return;
        }
        for (Map.Entry<String, C940690aaR> entry2 : interfaceC940430aa1.LJI().entrySet()) {
            C940690aaR value = entry2.getValue();
            if (value.LIZ > 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z4 = !z;
            if (value.LIZIZ > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = 2;
            if (z4) {
                if (z2) {
                    c = 3;
                } else {
                    c = 1;
                }
            } else if (z2) {
                c = 4;
            } else {
                c = 2;
            }
            if (value.LIZJ == 2) {
                if (c == 2 || c == 3 || c == 4) {
                    i = 3;
                }
            } else if (c != 2 && c != 3 && c != 4) {
                i = 0;
            } else {
                i = 1;
            }
            Integer num = (Integer) ((LinkedHashMap) this.LLILZLL).get(entry2.getKey());
            if (num == null || i != num.intValue()) {
                Object obj = ((ConcurrentHashMap) this.LLJI.getValue()).get(entry2.getKey());
                if ((obj instanceof C940400aZy) && (c940400aZy = (C940400aZy) obj) != null) {
                    c940400aZy.LJIIJJI(i);
                }
            }
            Object obj2 = ((ConcurrentHashMap) this.LLJI.getValue()).get(entry2.getKey());
            if ((obj2 instanceof C940400aZy) && (c940400aZy2 = (C940400aZy) obj2) != null) {
                c940400aZy2.LJIIL(entry2.getValue().LIZLLL);
            }
            this.LLILZLL.put(entry2.getKey(), Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LIZJ(int i, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LIZLLL((InterfaceC937840aVq) it2.next());
        }
    }

    public final void LJ(final C940400aZy c940400aZy, String str) {
        User user;
        EnumC940090aZT enumC940090aZT;
        User user2;
        final String str2;
        C940490aa7 c940490aa7;
        EnumC940090aZT enumC940090aZT2;
        View viewFindViewById;
        C940450aa3 c940450aa3;
        final ViewGroup viewGroup;
        TextView textView;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        View viewFindViewById7;
        View viewFindViewById8;
        View viewFindViewById9;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceChatFeedHandler#updateExistMask#");
        sbLIZ.append(c940400aZy.LLILZIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(((LinkedHashMap) this.LLILZIL).get(c940400aZy.LLILZIL));
        sbLIZ2.append(' ');
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) ((LinkedHashMap) this.LLILZIL).get(c940400aZy.LLILZIL);
        C939680aYo c939680aYo = null;
        if (linkPlayerInfo != null) {
            user = linkPlayerInfo.mUser;
        } else {
            user = null;
        }
        sbLIZ2.append(user);
        sbLIZ2.append(' ');
        sbLIZ2.append(this.LLILZ);
        sbLIZ2.append(' ');
        C940490aa7 c940490aa72 = this.LLJILLL;
        if (c940490aa72 != null) {
            enumC940090aZT = c940490aa72.LJFF;
        } else {
            enumC940090aZT = null;
        }
        sbLIZ2.append(enumC940090aZT);
        C20441214yg.LIZIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) ((LinkedHashMap) this.LLILZIL).get(c940400aZy.LLILZIL);
        if (linkPlayerInfo2 != null && (user2 = linkPlayerInfo2.mUser) != null && (str2 = this.LLILZ) != null && (c940490aa7 = this.LLJILLL) != null && (enumC940090aZT2 = c940490aa7.LJFF) != null) {
            boolean zLJFF = Intrinsics.LJFF(c940400aZy.LLILZIL, this.LLILLL);
            C939680aYo c939680aYo2 = new C939680aYo(user2.getId(), c940400aZy.LLILZIL, C0KVU.LIZ(user2));
            ImageModel avatarThumb = user2.getAvatarThumb();
            C940450aa3 c940450aa32 = new C940450aa3(enumC940090aZT2, zLJFF, str2, avatarThumb, c939680aYo2);
            if (zLJFF) {
                ViewGroup viewGroup2 = c940400aZy.LL;
                if (viewGroup2 != null && (viewFindViewById9 = viewGroup2.findViewById(R.id.pmy)) != null) {
                    C12ES.LJIILL(0, viewFindViewById9);
                    if (LiveSdkMultiGuestHostTagUiOptSetting.INSTANCE.isOpt()) {
                        View viewFindViewById10 = viewFindViewById9.findViewById(R.id.js2);
                        if (viewFindViewById10 != null) {
                            viewFindViewById10.setBackgroundResource(0);
                        }
                        View viewFindViewById11 = viewFindViewById9.findViewById(R.id.js4);
                        if (viewFindViewById11 != null) {
                            C439101nJ.LJI(viewFindViewById11);
                        }
                        View viewFindViewById12 = viewFindViewById9.findViewById(R.id.js5);
                        if (viewFindViewById12 != null) {
                            viewFindViewById12.setPaddingRelative(viewFindViewById12.getPaddingStart(), viewFindViewById12.getPaddingTop(), (int) C12ES.LIZJ(4.0f, viewFindViewById9.getContext()), viewFindViewById12.getPaddingBottom());
                        }
                    } else {
                        View viewFindViewById13 = viewFindViewById9.findViewById(R.id.js2);
                        if (viewFindViewById13 != null) {
                            viewFindViewById13.setBackgroundResource(R.drawable.dut);
                        }
                        View viewFindViewById14 = viewFindViewById9.findViewById(R.id.js4);
                        if (viewFindViewById14 != null) {
                            C12ES.LJIILL(0, viewFindViewById14);
                        }
                        LiveIconView liveIconView = (LiveIconView) viewFindViewById9.findViewById(R.id.js4);
                        if (liveIconView != null) {
                            liveIconView.setIconTintAttr(R.attr.c9i);
                        }
                        View viewFindViewById15 = viewFindViewById9.findViewById(R.id.js5);
                        if (viewFindViewById15 != null) {
                            viewFindViewById15.setPaddingRelative(viewFindViewById15.getPaddingStart(), viewFindViewById15.getPaddingTop(), (int) C12ES.LIZJ(6.0f, viewFindViewById9.getContext()), viewFindViewById15.getPaddingBottom());
                        }
                    }
                }
            } else {
                ViewGroup viewGroup3 = c940400aZy.LL;
                if (viewGroup3 != null && (viewFindViewById = viewGroup3.findViewById(R.id.pmy)) != null) {
                    C439101nJ.LJI(viewFindViewById);
                }
            }
            if (enumC940090aZT2 == EnumC940090aZT.SEARCH) {
                ViewGroup viewGroup4 = c940400aZy.LL;
                if (viewGroup4 != null && (viewFindViewById8 = viewGroup4.findViewById(R.id.pmy)) != null) {
                    C439101nJ.LJI(viewFindViewById8);
                }
                ViewGroup viewGroup5 = c940400aZy.LL;
                if (viewGroup5 != null && (viewFindViewById7 = viewGroup5.findViewById(R.id.pn3)) != null) {
                    C439101nJ.LJI(viewFindViewById7);
                }
                ViewGroup viewGroup6 = c940400aZy.LL;
                if (viewGroup6 != null && (viewFindViewById6 = viewGroup6.findViewById(R.id.q3s)) != null) {
                    C439101nJ.LJI(viewFindViewById6);
                }
                ViewGroup viewGroup7 = c940400aZy.LL;
                if (viewGroup7 != null && (viewFindViewById5 = viewGroup7.findViewById(R.id.pnc)) != null) {
                    C439101nJ.LJI(viewFindViewById5);
                }
                ViewGroup viewGroup8 = c940400aZy.LL;
                if (viewGroup8 != null && (viewFindViewById4 = viewGroup8.findViewById(R.id.bxf)) != null) {
                    C439101nJ.LJI(viewFindViewById4);
                }
                ViewGroup viewGroup9 = c940400aZy.LL;
                if (viewGroup9 != null && (viewFindViewById3 = viewGroup9.findViewById(R.id.gvn)) != null) {
                    C439101nJ.LJI(viewFindViewById3);
                }
                ViewGroup viewGroup10 = c940400aZy.LL;
                if (viewGroup10 != null && (viewFindViewById2 = viewGroup10.findViewById(R.id.p95)) != null) {
                    C439101nJ.LJI(viewFindViewById2);
                }
            }
            boolean z = !Intrinsics.LJFF(c940400aZy.LLJI, str2);
            C940450aa3 c940450aa33 = c940400aZy.LLILZLL;
            if (c940450aa33 != null) {
                c939680aYo = c940450aa33.LJ;
            }
            if (!Intrinsics.LJFF(c939680aYo2, c939680aYo)) {
                ViewGroup viewGroup11 = c940400aZy.LL;
                if (viewGroup11 != null && (textView = (TextView) viewGroup11.findViewById(R.id.p9_)) != null) {
                    textView.setText(c939680aYo2.LIZJ);
                }
                ViewGroup viewGroup12 = c940400aZy.LLILLJJLI;
                if (viewGroup12 != null) {
                    c940450aa3 = c940450aa32;
                    AwS37S1400000_15 awS37S1400000_15 = new AwS37S1400000_15(viewGroup12, str2, c940400aZy, c940450aa32, avatarThumb, 2);
                    if (BugFixVoiceChatAvatarSetting.INSTANCE.enable()) {
                        if (viewGroup12.isLaidOut() && !viewGroup12.isLayoutRequested()) {
                            awS37S1400000_15.invoke();
                        } else {
                            viewGroup12.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986920bn0(awS37S1400000_15, 10));
                        }
                    } else {
                        C930540aK4.LJJJ(viewGroup12, new ARunnableS104S0100000_4((Object) awS37S1400000_15, 146));
                    }
                } else {
                    c940450aa3 = c940450aa32;
                }
            } else {
                c940450aa3 = c940450aa32;
                if (z && enumC940090aZT2 == EnumC940090aZT.FEED && LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().optFeedWave && Intrinsics.LJFF(str, "onWindowStateChanged") && (viewGroup = c940400aZy.LLILLJJLI) != null) {
                    c940400aZy.LLJI = str2;
                    if (BugFixVoiceChatAvatarSetting.INSTANCE.enable()) {
                        if (viewGroup.isLaidOut() && !viewGroup.isLayoutRequested()) {
                            c940400aZy.LJIIJ((int) (viewGroup.getWidth() * C933980aPc.LIZJ(str2)), viewGroup);
                        } else {
                            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0aa2
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                    view.removeOnLayoutChangeListener(this);
                                    c940400aZy.LJIIJ((int) (viewGroup.getWidth() * C933980aPc.LIZJ(str2)), viewGroup);
                                }
                            });
                        }
                    } else {
                        C930540aK4.LJJJ(viewGroup, new ARunnableS19S1200000_15(viewGroup, str2, c940400aZy, 2));
                    }
                }
            }
            c940400aZy.LLILZLL = c940450aa3;
            Integer num = (Integer) ((LinkedHashMap) this.LLILZLL).get(c940400aZy.LLILZIL);
            if (num != null) {
                c940400aZy.LJIIJJI(num.intValue());
            }
        }
    }

    @Override // X.InterfaceC940380aZw
    public final void LLIIJI(FrameLayout frameLayout, Pair<Integer, Integer> pair) {
        float fFloatValue;
        if (this.LLIZ == null) {
            View view = new View(frameLayout.getContext());
            C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, -1));
            view.setBackgroundColor(-16777216);
            this.LLIZ = view;
            InterfaceC937900aVw interfaceC937900aVw = this.LLJJ;
            if (interfaceC937900aVw != null) {
                Float f = (Float) DataChannelGlobal.LLILZ.gg0(TopLiveSkylightTransYChannel.class);
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                interfaceC937900aVw.LJJJJLI(frameLayout, null, pair, "voice_chat_feed", null, fFloatValue);
            }
        }
        frameLayout.setClipChildren(false);
        Iterator<View> it2 = new C09RD(frameLayout).iterator();
        boolean z = false;
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            View view2 = (View) c09re.next();
            if (view2 instanceof C0IF5) {
                if (LiveCardOverdrawOptSetting.INSTANCE.enableOverdrawOptForVoiceChat()) {
                    C786410Ut5.LJLLLLLL(8, view2);
                    C20441214yg.LJIIIZ("live_overdraw_opt", "onLiveFeedContainerSet and enableOverdrawOpt");
                }
                z = true;
            }
        }
        if (z) {
            if (!Intrinsics.LJFF(frameLayout.getChildAt(1), this.LLIZ) && LiveCardOverdrawOptSetting.INSTANCE.disableOverdrawOptForVoiceChat()) {
                View view3 = this.LLIZ;
                if (view3 != null) {
                    C930540aK4.LJJIJL(view3);
                }
                View view4 = this.LLIZ;
                if (view4 != null) {
                    C930540aK4.LJJIL(1, view4, frameLayout);
                }
                C20441214yg.LJIIIZ("live_overdraw_opt", "onLiveFeedContainerSet and disableOverdrawOpt");
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(frameLayout.getChildAt(0), this.LLIZ)) {
            return;
        }
        View view5 = this.LLIZ;
        if (view5 != null) {
            C930540aK4.LJJIJL(view5);
        }
        View view6 = this.LLIZ;
        if (view6 == null) {
            return;
        }
        C930540aK4.LJJIL(0, view6, frameLayout);
    }

    public final void LIZIZ(C940490aa7 c940490aa7, InterfaceC937900aVw interfaceC937900aVw, C919770a2h c919770a2h, InterfaceC958990b3x interfaceC958990b3x) {
        this.LLJILLL = c940490aa7;
        CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayListLIZ = LIZ();
        ArrayList arrayList = new ArrayList();
        for (AbstractC940410aZz abstractC940410aZz : copyOnWriteArrayListLIZ) {
            if (abstractC940410aZz instanceof C940400aZy) {
                arrayList.add(abstractC940410aZz);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJ((C940400aZy) it2.next(), "");
        }
        this.LLJJ = interfaceC937900aVw;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.O2(false);
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
        LIZLLL(interfaceC937840aVq);
    }
}
