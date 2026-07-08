package X;

import Y.AComparatorS34S0000000_15;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutWindowExtra;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTakeStageLayoutAnimationDelayInterval;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionLayoutNewEventSetting;
import com.bytedance.android.livesdk.model.message.CohostLayoutUpdateMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.CohostTypeLayoutExtra;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0axX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955010axX {
    public static volatile boolean LJIIJ;
    public static volatile boolean LJIIJJI;
    public static volatile boolean LJIIL;
    public final boolean LIZ;
    public final DataChannel LIZIZ;
    public volatile boolean LIZJ;
    public final C955000axW LIZLLL;
    public boolean LJ;
    public final List<InterfaceC956570b03> LJFF;
    public final List<InterfaceC956560b02> LJI;
    public final List<InterfaceC957080b0s> LJII;
    public C443120HZe<Long, ? extends AbstractC957950b2H, ? extends List<Long>> LJIIIIZZ;
    public final C952030asj LJIIIZ;

    public final C955320ay2 LJFF() {
        if (this.LIZLLL != null) {
            return C955000axW.LIZJ();
        }
        return null;
    }

    public final C956040azC LJI() {
        RectF rectF;
        C947470alN c947470alN;
        C947470alN c947470alN2;
        List<C957020b0m> list;
        String str;
        List<LinkUser> listLIZLLL;
        LinkUser next;
        C947470alN c947470alN3;
        List<C957020b0m> list2;
        C947470alN c947470alN4;
        C955300ay0 c955300ay0;
        String str2 = null;
        C955320ay2 c955320ay2LIZJ = this.LIZLLL != null ? C955000axW.LIZJ() : null;
        C942080acg c942080acgLIZLLL = this.LIZLLL != null ? C955000axW.LIZLLL() : null;
        if (c955320ay2LIZJ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CohostTypeLayoutExtra cohostTypeLayoutExtraLJIIL = C957830b25.LJIIL((c942080acgLIZLLL == null || (c947470alN4 = c942080acgLIZLLL.LIZ) == null || (c955300ay0 = c947470alN4.LJ) == null) ? null : c955300ay0.LIZIZ);
        int i = 0;
        int i2 = 1;
        boolean z = (cohostTypeLayoutExtraLJIIL != null ? cohostTypeLayoutExtraLJIIL.isEnlargeMode : 0) != 0;
        if (c942080acgLIZLLL != null && (c947470alN3 = c942080acgLIZLLL.LIZ) != null && (list2 = c947470alN3.LIZLLL) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C957020b0m c957020b0m : list2) {
                arrayList2.add(new Pair(Long.valueOf(c957020b0m.getSpotId()), c957020b0m.getShapeDescriptor().LIZ));
            }
        }
        long jLJ = C950220apo.LJ();
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null && (listLIZLLL = interfaceC954180awCLJIIIZ.LIZLLL()) != null) {
            Iterator<LinkUser> it2 = listLIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Long l = next.userId;
                if (l != null && l.longValue() == jLJ) {
                    break;
                }
            }
            LinkUser linkUser = next;
            if (linkUser != null) {
                str2 = linkUser.linkMicId;
            }
        }
        if (c942080acgLIZLLL != null && (c947470alN2 = c942080acgLIZLLL.LIZ) != null && (list = c947470alN2.LIZLLL) != null) {
            for (C957020b0m c957020b0m2 : list) {
                c957020b0m2.getShapeDescriptor();
                PosIdentity posIdentity = c957020b0m2.getPosIdentity();
                boolean z2 = posIdentity != null && posIdentity.type == 0;
                PosIdentity posIdentity2 = c957020b0m2.getPosIdentity();
                if (posIdentity2 == null || (str = posIdentity2.value) == null) {
                    str = "";
                }
                boolean z3 = this.LIZ ? c957020b0m2.LLJILJIL : str2 != null && Intrinsics.LJFF(str2, c957020b0m2.getLinkMicId());
                PosIdentity posIdentity3 = c957020b0m2.getPosIdentity();
                if (posIdentity3 == null || posIdentity3.type != i2) {
                    PosIdentity posIdentity4 = c957020b0m2.getPosIdentity();
                    if (posIdentity4 == null || posIdentity4.type != 2) {
                        PosIdentity posIdentity5 = c957020b0m2.getPosIdentity();
                        if (posIdentity5 != null && posIdentity5.type == 0) {
                            RectF rectF2 = c942080acgLIZLLL.LIZ.LIZJ;
                            if (rectF2 == null) {
                                rectF2 = new RectF();
                            }
                            long spotId = c957020b0m2.getSpotId();
                            int iMax = Math.max(((int) c957020b0m2.getSpotId()) - 1, 0);
                            Rect rect = c957020b0m2.getShapeDescriptor().LIZ;
                            int i3 = c957020b0m2.getShapeDescriptor().LIZIZ;
                            String linkMicId = c957020b0m2.getLinkMicId();
                            PosIdentity posIdentity6 = c957020b0m2.getPosIdentity();
                            boolean z4 = posIdentity6 != null && posIdentity6.type == 2;
                            String streamId = c957020b0m2.getStreamId();
                            EnumC918810a19 enumC918810a19LIZ = C955240axu.LIZ(c957020b0m2.getWinState());
                            PosIdentity posIdentity7 = c957020b0m2.getPosIdentity();
                            boolean z5 = posIdentity7 != null && posIdentity7.type == 0;
                            if (!z2) {
                                str = "";
                            }
                            i = 0;
                            arrayList.add(new C955080axe(c957020b0m2, rectF2, z3, spotId, iMax, rect, i3, 3, linkMicId, z4, streamId, enumC918810a19LIZ, z5, str, C957830b25.LJIILIIL(c957020b0m2.getCohostSpotExtra()), z, false, null));
                        }
                        i2 = 1;
                    } else {
                        RectF rectF3 = c942080acgLIZLLL.LIZ.LIZJ;
                        if (rectF3 == null) {
                            rectF3 = new RectF();
                        }
                        long spotId2 = c957020b0m2.getSpotId();
                        int iMax2 = Math.max(((int) c957020b0m2.getSpotId()) - 1, 0);
                        Rect rect2 = c957020b0m2.getShapeDescriptor().LIZ;
                        int i4 = c957020b0m2.getShapeDescriptor().LIZIZ;
                        String linkMicId2 = c957020b0m2.getLinkMicId();
                        PosIdentity posIdentity8 = c957020b0m2.getPosIdentity();
                        boolean z6 = posIdentity8 != null && posIdentity8.type == 2;
                        String streamId2 = c957020b0m2.getStreamId();
                        EnumC918810a19 enumC918810a19LIZ2 = C955240axu.LIZ(c957020b0m2.getWinState());
                        PosIdentity posIdentity9 = c957020b0m2.getPosIdentity();
                        boolean z7 = posIdentity9 != null && posIdentity9.type == 0;
                        if (!z2) {
                            str = "";
                        }
                        arrayList.add(new C955080axe(c957020b0m2, rectF3, z3, spotId2, iMax2, rect2, i4, 2, linkMicId2, z6, streamId2, enumC918810a19LIZ2, z7, str, C957830b25.LJIILIIL(c957020b0m2.getCohostSpotExtra()), z, false, null));
                    }
                } else {
                    RectF rectF4 = c942080acgLIZLLL.LIZ.LIZJ;
                    if (rectF4 == null) {
                        rectF4 = new RectF();
                    }
                    int iMax3 = Math.max(((int) c957020b0m2.getSpotId()) - 1, i);
                    long spotId3 = c957020b0m2.getSpotId();
                    Rect rect3 = c957020b0m2.getShapeDescriptor().LIZ;
                    int i5 = c957020b0m2.getShapeDescriptor().LIZIZ;
                    String linkMicId3 = c957020b0m2.getLinkMicId();
                    PosIdentity posIdentity10 = c957020b0m2.getPosIdentity();
                    boolean z8 = posIdentity10 != null && posIdentity10.type == 2;
                    String streamId3 = c957020b0m2.getStreamId();
                    EnumC918810a19 enumC918810a19LIZ3 = C955240axu.LIZ(c957020b0m2.getWinState());
                    PosIdentity posIdentity11 = c957020b0m2.getPosIdentity();
                    boolean z9 = posIdentity11 != null && posIdentity11.type == 0;
                    if (!z2) {
                        str = "";
                    }
                    arrayList.add(new C955080axe(c957020b0m2, rectF4, z3, spotId3, iMax3, rect3, i5, 1, linkMicId3, z8, streamId3, enumC918810a19LIZ3, z9, str, C957830b25.LJIILIIL(c957020b0m2.getCohostSpotExtra()), z, false, null));
                }
                i = 0;
                i2 = 1;
            }
        }
        if (c942080acgLIZLLL == null || (c947470alN = c942080acgLIZLLL.LIZ) == null || (rectF = c947470alN.LIZJ) == null) {
            rectF = new RectF();
        }
        return new C956040azC(arrayList, rectF, C957830b25.LJIIJJI(c955320ay2LIZJ.LIZLLL), C957830b25.LJIIL(c955320ay2LIZJ.LIZLLL));
    }

    public final C942080acg LJII() {
        if (this.LIZLLL != null) {
            return C955000axW.LIZLLL();
        }
        return null;
    }

    public final List<C957030b0n> LJIIIIZZ() {
        if (this.LIZLLL != null) {
            return C955000axW.LJ();
        }
        return null;
    }

    public final Rect LJIIJJI() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        if (this.LIZLLL == null) {
            return null;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ != null ? interfaceC954180awCLJIIIZ.LLIIJLIL() : null;
        if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null) {
            return null;
        }
        return interfaceC940060aZQ.LJJIJIIJI();
    }

    public final boolean LJIIL() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        if (this.LIZLLL == null) {
            return false;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        EnumC965730bEp enumC965730bEpLJJLL = null;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ != null ? interfaceC954180awCLJIIIZ.LLIIJLIL() : null;
        if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
            enumC965730bEpLJJLL = interfaceC940060aZQ.LJJLL();
        }
        return enumC965730bEpLJJLL == EnumC965730bEp.CROSS;
    }

    public final void LJJ() {
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        C955000axW c955000axW = this.LIZLLL;
        if (c955000axW != null) {
            c955000axW.LJI = new AwS224S0300000_15(c259800zU, (C259800zU<String>) c259800zU2, (C259800zU<String>) this, (C955010axX) 54);
        }
        C955000axW c955000axW2 = this.LIZLLL;
        if (c955000axW2 != null) {
            c955000axW2.LJFF = new AwS594S0100000_15(this, 1034);
        }
        C955000axW c955000axW3 = this.LIZLLL;
        if (c955000axW3 != null) {
            c955000axW3.LJ = new AwS594S0100000_15(this, 1035);
        }
        C955000axW c955000axW4 = this.LIZLLL;
        if (c955000axW4 != null) {
            c955000axW4.LJIIIIZZ = new AwS594S0100000_15(this, 1036);
        }
        C955000axW c955000axW5 = this.LIZLLL;
        if (c955000axW5 != null) {
            c955000axW5.LJII = new AwS224S0300000_15(c259800zU, (C259800zU<String>) c259800zU2, (C259800zU<String>) this, (C955010axX) 55);
        }
        C955000axW c955000axW6 = this.LIZLLL;
        if (c955000axW6 != null) {
            c955000axW6.LIZJ = new AwS594S0100000_15(this, 1037);
        }
        C955000axW c955000axW7 = this.LIZLLL;
        if (c955000axW7 != null) {
            c955000axW7.LIZLLL = new AwS594S0100000_15(this, 1038);
        }
    }

    public final List<String> LJIIIZ() {
        List<C955080axe> list;
        C956040azC c956040azCLJI = LJI();
        if (c956040azCLJI != null && (list = c956040azCLJI.LIZ) != null) {
            ArrayList arrayList = new ArrayList();
            for (C955080axe c955080axe : list) {
                C955080axe c955080axe2 = c955080axe;
                if (c955080axe2.LJII == 1 && C123100dR.LIZ(c955080axe2.LJIIIIZZ)) {
                    arrayList.add(c955080axe);
                }
            }
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS34S0000000_15(16), arrayList);
            if (listLJLLLL != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listLJLLLL.iterator();
                while (it2.hasNext()) {
                    String str = ((C955080axe) it2.next()).LJIIIIZZ;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                return arrayList2;
            }
        }
        return C13BV.INSTANCE;
    }

    public static C955200axq LJ(long j) throws JSONException {
        boolean z;
        long jLIZJ;
        C981500beG c981500beG;
        C986210blr.LIZ.getClass();
        String str = C986210blr.LJ;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = "DefaultStageTransiton";
        }
        String str2 = C986210blr.LIZLLL;
        if (str2.length() <= 0) {
            str2 = "";
        }
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null && (c981500beG = c981480beEM91.LJJIJIIJI) != null) {
            jLIZJ = c981500beG.LIZJ(j);
        } else {
            jLIZJ = 0;
        }
        String strLJ = C982410bfj.LJ((int) jLIZJ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("flash_color", strLJ);
        jSONObject.put("delay_time_in_ms", LinkMicTakeStageLayoutAnimationDelayInterval.getValue());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("effect_type", 1);
        jSONObject2.put("sticker_panel", "live_take_stage");
        return new C955200axq(str, str2, jSONObject, jSONObject2);
    }

    public static void LJIILIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerServerLayoutSourcesIfNeeded: ");
        sbLIZ.append(str);
        sbLIZ.append(" registered");
        C20441214yg.LJIIIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(C964110bCD c964110bCD) {
        synchronized (this.LJI) {
            try {
                ((ArrayList) this.LJI).add(c964110bCD);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C955080axe LJIIJ(String str) {
        List<C955080axe> list;
        C956040azC c956040azCLJI = LJI();
        C955080axe c955080axe = null;
        if (c956040azCLJI == null || (list = c956040azCLJI.LIZ) == null) {
            return null;
        }
        Iterator<C955080axe> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C955080axe next = it2.next();
            C955080axe c955080axe2 = next;
            if (Intrinsics.LJFF(c955080axe2.LJIIIIZZ, str) && c955080axe2.LJII == 1) {
                c955080axe = next;
                break;
            }
        }
        return c955080axe;
    }

    public final void LJIILL(InterfaceC956570b03 interfaceC956570b03) {
        synchronized (this.LJFF) {
            try {
                ((ArrayList) this.LJFF).remove(interfaceC956570b03);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILLIIL(C964110bCD c964110bCD) {
        synchronized (this.LJI) {
            try {
                ((ArrayList) this.LJI).remove(c964110bCD);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIZILJ(int i) {
        InterfaceC940060aZQ interfaceC940060aZQ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cohost_layout_main requestUpdateLayout, scene:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
        String strLJ = C952490atT.LJ();
        if (this.LIZLLL != null) {
            C917100ZyO c917100ZyO = new C917100ZyO(String.valueOf(i), strLJ);
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = null;
            if (interfaceC954180awCLJIIIZ != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
            }
            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                interfaceC940060aZQ.LIZLLL(c917100ZyO);
            }
        }
    }

    public final void LJIJ(boolean z) {
        C955000axW c955000axW;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cohost_layout_main resetLayoutWhenCoHostEnd, isUnionSession:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (!z && (c955000axW = this.LIZLLL) != null) {
            c955000axW.LIZJ = null;
            c955000axW.LIZLLL = null;
            c955000axW.LJ = null;
            c955000axW.LJFF = null;
            c955000axW.LJI = null;
            c955000axW.LJII = null;
        }
        if (this.LIZLLL != null) {
            C955000axW.LIZ(z, new C917100ZyO("resetLayoutWhenCoHostEnd", C952490atT.LJ()));
        }
        this.LJIIIIZZ = null;
    }

    public final void LJJI(AbstractC957950b2H abstractC957950b2H) {
        if (LJIIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cohost_layout_main switchNewLayout blocked: server layout is active, local switch skipped (scene=");
            sbLIZ.append(C13LE.LIZ(abstractC957950b2H.getClass()).LJI());
            sbLIZ.append(')');
            C20441214yg.LJIIIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("switchNewLayout triggerScene=");
        sbLIZ2.append(C13LE.LIZ(abstractC957950b2H.getClass()).LJI());
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ2));
        if (C915980Zwa.LJII().LJJIJ().size() < 2 && !(abstractC957950b2H instanceof C957790b21) && !(abstractC957950b2H instanceof C957810b23)) {
            C20441214yg.LIZIZ("CoHostLayoutAdapter", "linkedList size <2, just return");
            return;
        }
        C955270axx c955270axxLIZ = abstractC957950b2H.LIZ(null);
        C955320ay2 c955320ay2 = c955270axxLIZ.LIZ;
        List<C956260azY> list = c955270axxLIZ.LIZIZ;
        if (list.isEmpty()) {
            C20441214yg.LIZIZ("CoHostLayoutAdapter", "switchNewLayout cohost_layout_main spotList is empty");
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("switchNewLayout cohost_layout_main layoutState=");
        sbLIZ3.append(C1058250de3.LIZLLL(c955320ay2));
        sbLIZ3.append(" spotList=");
        sbLIZ3.append(C1058250de3.LIZLLL(list));
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ3));
        C955250axv c955250axv = new C955250axv(c955320ay2, list, c955270axxLIZ.LIZJ, c955270axxLIZ.LIZLLL);
        this.LJIIIIZZ = new C443120HZe<>(Long.valueOf(System.currentTimeMillis()), abstractC957950b2H, null);
        String strLJ = C952490atT.LJ();
        if (InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled) {
            ArrayList arrayList = new ArrayList();
            Iterator<C956260azY> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZIZ);
            }
            if (this.LIZ) {
                EnumC955050axb enumC955050axb = EnumC955050axb.PIPELINE_TRIGGER;
                String strValueOf = String.valueOf(abstractC957950b2H.LIZ);
                getClass();
                LJIJI(enumC955050axb, c955320ay2, arrayList, strValueOf, strLJ, null);
            } else {
                EnumC955060axc enumC955060axc = EnumC955060axc.PIPELINE_TRIGGER;
                String strValueOf2 = String.valueOf(abstractC957950b2H.LIZ);
                getClass();
                LJIJJLI(enumC955060axc, c955320ay2, arrayList, strValueOf2, strLJ, null);
            }
        }
        C955000axW c955000axW = this.LIZLLL;
        if (c955000axW != null) {
            c955000axW.LJI(c955250axv, abstractC957950b2H, strLJ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0asj] */
    public C955010axX(DataChannel dataChannel, boolean z) {
        RoomLinkInfo.LinkmicLayoutConfig linkmicLayoutConfig;
        boolean z2;
        boolean z3;
        Room room;
        RoomLinkInfo linkMicInfo;
        this.LIZ = z;
        this.LIZIZ = dataChannel;
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJI = arrayList2;
        this.LJII = new ArrayList();
        new ArrayList();
        this.LJIIIZ = new OnIMMessageListener() { // from class: X.0asj
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "CoHostLayoutAdapter";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                String str;
                if (iMessage instanceof CohostLayoutUpdateMessage) {
                    C20441214yg.LJIIIZ("CoHostLayoutAdapter", "cohostLayoutUpdateIMListener: received CohostLayoutUpdateMessage, dispatching to handler");
                    CohostLayoutUpdateMessage cohostLayoutUpdateMessage = (CohostLayoutUpdateMessage) iMessage;
                    C952090asp.LIZ.getClass();
                    C952040ask c952040ask = C952090asp.LIZLLL;
                    if (c952040ask != null) {
                        long jLongValue = c952040ask.LIZ.invoke().longValue();
                        boolean zBooleanValue = c952040ask.LIZIZ.invoke().booleanValue();
                        boolean zBooleanValue2 = c952040ask.LIZJ.invoke().booleanValue();
                        Text text = cohostLayoutUpdateMessage.toastDisplayText;
                        if (text != null) {
                            str = text.defaultPattern;
                        } else {
                            str = null;
                        }
                        String string = C1133830fbx.LJIILIIL(text, str).toString();
                        if (!zBooleanValue && !TextUtils.isEmpty(string)) {
                            C766270U4b.LJIIJJI(string);
                        }
                        if (!zBooleanValue && !zBooleanValue2) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onCohostLayoutUpdateMessage: skip layout apply, roomId=");
                            sbLIZ.append(jLongValue);
                            sbLIZ.append(" isAnchor=");
                            sbLIZ.append(zBooleanValue);
                            sbLIZ.append(" isSelfGuest=");
                            sbLIZ.append(zBooleanValue2);
                            sbLIZ.append(" crossRoomLayout=");
                            sbLIZ.append(cohostLayoutUpdateMessage.crossRoomLayout);
                            sbLIZ.append(" toastDisplayText=");
                            sbLIZ.append(cohostLayoutUpdateMessage.toastDisplayText);
                            C20441214yg.LJIIIZ("CohostLayoutUpdateMsgHandler", C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onCohostLayoutUpdateMessage: roomId=");
                        sbLIZ2.append(jLongValue);
                        sbLIZ2.append(" isAnchor=");
                        sbLIZ2.append(zBooleanValue);
                        sbLIZ2.append(" isSelfGuest=");
                        sbLIZ2.append(zBooleanValue2);
                        sbLIZ2.append(" crossRoomLayout=");
                        sbLIZ2.append(cohostLayoutUpdateMessage.crossRoomLayout);
                        sbLIZ2.append(" toastDisplayText=");
                        sbLIZ2.append(cohostLayoutUpdateMessage.toastDisplayText);
                        C20441214yg.LJIIIZ("CohostLayoutUpdateMsgHandler", C2188811AlT.LIZIZ(sbLIZ2));
                        C952060asm.LIZIZ(C949540aoi.LIZ(EnumC918980a1Q.COHOST_LAYOUT_UPDATE_IM, jLongValue, cohostLayoutUpdateMessage.crossRoomLayout), "CohostLayoutUpdateMsgHandler", "");
                    }
                }
            }
        };
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (linkMicInfo = room.getLinkMicInfo()) != null) {
            linkmicLayoutConfig = linkMicInfo.layoutConfig;
        } else {
            linkmicLayoutConfig = null;
        }
        if (linkmicLayoutConfig != null && linkmicLayoutConfig.cohostServerLayoutEnabled) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJIIJ = z2;
        if (linkmicLayoutConfig != null && linkmicLayoutConfig.cohostEnlargeEnabled) {
            z3 = true;
        } else {
            z3 = false;
        }
        LJIIJJI = z3;
        LJIIL = linkmicLayoutConfig != null && linkmicLayoutConfig.cohostMatchEnlargeEnabled;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLayoutSettings source=");
        sbLIZ.append("cohost_layout_adapter_init");
        sbLIZ.append(" serverLayoutEnabled=");
        sbLIZ.append(LJIIJ);
        sbLIZ.append(", enlargeEnabled=");
        sbLIZ.append(LJIIJJI);
        sbLIZ.append(", matchEnlargeEnabled=");
        sbLIZ.append(LJIIL);
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (dataChannel != null) {
            this.LIZLLL = new C955000axW(dataChannel, z);
        } else {
            this.LIZLLL = null;
            C1AF0.LIZJ("CoHostLayoutAdapter init with null dataChannel");
        }
        InterfaceC956570b03 interfaceC956570b03 = new InterfaceC956570b03() { // from class: X.0azR
            /* JADX WARN: Removed duplicated region for block: B:107:0x02cf A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:3:0x0009, B:4:0x0013, B:6:0x0019, B:8:0x0024, B:10:0x002e, B:12:0x0032, B:20:0x0098, B:22:0x009c, B:23:0x00a0, B:26:0x00a8, B:28:0x00be, B:30:0x00c4, B:38:0x00ef, B:31:0x00cf, B:33:0x00e4, B:34:0x00e8, B:41:0x0100, B:43:0x0178, B:47:0x0189, B:49:0x019a, B:50:0x019e, B:52:0x01a4, B:56:0x01b1, B:61:0x01bc, B:64:0x01c2, B:66:0x01c6, B:68:0x01eb, B:70:0x01f2, B:71:0x01f6, B:73:0x01fc, B:75:0x0209, B:77:0x020d, B:79:0x0211, B:80:0x0215, B:82:0x0227, B:86:0x023d, B:92:0x0252, B:84:0x022f, B:89:0x0247, B:93:0x0257, B:95:0x02a6, B:96:0x02ab, B:98:0x02af, B:100:0x02b9, B:105:0x02cb, B:107:0x02cf, B:108:0x02d4, B:110:0x02d8, B:112:0x02dc, B:113:0x02e1, B:115:0x02e5, B:116:0x02f1, B:118:0x02f5, B:102:0x02bd, B:104:0x02c1, B:25:0x00a4), top: B:123:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x02d8 A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:3:0x0009, B:4:0x0013, B:6:0x0019, B:8:0x0024, B:10:0x002e, B:12:0x0032, B:20:0x0098, B:22:0x009c, B:23:0x00a0, B:26:0x00a8, B:28:0x00be, B:30:0x00c4, B:38:0x00ef, B:31:0x00cf, B:33:0x00e4, B:34:0x00e8, B:41:0x0100, B:43:0x0178, B:47:0x0189, B:49:0x019a, B:50:0x019e, B:52:0x01a4, B:56:0x01b1, B:61:0x01bc, B:64:0x01c2, B:66:0x01c6, B:68:0x01eb, B:70:0x01f2, B:71:0x01f6, B:73:0x01fc, B:75:0x0209, B:77:0x020d, B:79:0x0211, B:80:0x0215, B:82:0x0227, B:86:0x023d, B:92:0x0252, B:84:0x022f, B:89:0x0247, B:93:0x0257, B:95:0x02a6, B:96:0x02ab, B:98:0x02af, B:100:0x02b9, B:105:0x02cb, B:107:0x02cf, B:108:0x02d4, B:110:0x02d8, B:112:0x02dc, B:113:0x02e1, B:115:0x02e5, B:116:0x02f1, B:118:0x02f5, B:102:0x02bd, B:104:0x02c1, B:25:0x00a4), top: B:123:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x02f5 A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:3:0x0009, B:4:0x0013, B:6:0x0019, B:8:0x0024, B:10:0x002e, B:12:0x0032, B:20:0x0098, B:22:0x009c, B:23:0x00a0, B:26:0x00a8, B:28:0x00be, B:30:0x00c4, B:38:0x00ef, B:31:0x00cf, B:33:0x00e4, B:34:0x00e8, B:41:0x0100, B:43:0x0178, B:47:0x0189, B:49:0x019a, B:50:0x019e, B:52:0x01a4, B:56:0x01b1, B:61:0x01bc, B:64:0x01c2, B:66:0x01c6, B:68:0x01eb, B:70:0x01f2, B:71:0x01f6, B:73:0x01fc, B:75:0x0209, B:77:0x020d, B:79:0x0211, B:80:0x0215, B:82:0x0227, B:86:0x023d, B:92:0x0252, B:84:0x022f, B:89:0x0247, B:93:0x0257, B:95:0x02a6, B:96:0x02ab, B:98:0x02af, B:100:0x02b9, B:105:0x02cb, B:107:0x02cf, B:108:0x02d4, B:110:0x02d8, B:112:0x02dc, B:113:0x02e1, B:115:0x02e5, B:116:0x02f1, B:118:0x02f5, B:102:0x02bd, B:104:0x02c1, B:25:0x00a4), top: B:123:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00be A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:3:0x0009, B:4:0x0013, B:6:0x0019, B:8:0x0024, B:10:0x002e, B:12:0x0032, B:20:0x0098, B:22:0x009c, B:23:0x00a0, B:26:0x00a8, B:28:0x00be, B:30:0x00c4, B:38:0x00ef, B:31:0x00cf, B:33:0x00e4, B:34:0x00e8, B:41:0x0100, B:43:0x0178, B:47:0x0189, B:49:0x019a, B:50:0x019e, B:52:0x01a4, B:56:0x01b1, B:61:0x01bc, B:64:0x01c2, B:66:0x01c6, B:68:0x01eb, B:70:0x01f2, B:71:0x01f6, B:73:0x01fc, B:75:0x0209, B:77:0x020d, B:79:0x0211, B:80:0x0215, B:82:0x0227, B:86:0x023d, B:92:0x0252, B:84:0x022f, B:89:0x0247, B:93:0x0257, B:95:0x02a6, B:96:0x02ab, B:98:0x02af, B:100:0x02b9, B:105:0x02cb, B:107:0x02cf, B:108:0x02d4, B:110:0x02d8, B:112:0x02dc, B:113:0x02e1, B:115:0x02e5, B:116:0x02f1, B:118:0x02f5, B:102:0x02bd, B:104:0x02c1, B:25:0x00a4), top: B:123:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:3:0x0009, B:4:0x0013, B:6:0x0019, B:8:0x0024, B:10:0x002e, B:12:0x0032, B:20:0x0098, B:22:0x009c, B:23:0x00a0, B:26:0x00a8, B:28:0x00be, B:30:0x00c4, B:38:0x00ef, B:31:0x00cf, B:33:0x00e4, B:34:0x00e8, B:41:0x0100, B:43:0x0178, B:47:0x0189, B:49:0x019a, B:50:0x019e, B:52:0x01a4, B:56:0x01b1, B:61:0x01bc, B:64:0x01c2, B:66:0x01c6, B:68:0x01eb, B:70:0x01f2, B:71:0x01f6, B:73:0x01fc, B:75:0x0209, B:77:0x020d, B:79:0x0211, B:80:0x0215, B:82:0x0227, B:86:0x023d, B:92:0x0252, B:84:0x022f, B:89:0x0247, B:93:0x0257, B:95:0x02a6, B:96:0x02ab, B:98:0x02af, B:100:0x02b9, B:105:0x02cb, B:107:0x02cf, B:108:0x02d4, B:110:0x02d8, B:112:0x02dc, B:113:0x02e1, B:115:0x02e5, B:116:0x02f1, B:118:0x02f5, B:102:0x02bd, B:104:0x02c1, B:25:0x00a4), top: B:123:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0188  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x019a A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:3:0x0009, B:4:0x0013, B:6:0x0019, B:8:0x0024, B:10:0x002e, B:12:0x0032, B:20:0x0098, B:22:0x009c, B:23:0x00a0, B:26:0x00a8, B:28:0x00be, B:30:0x00c4, B:38:0x00ef, B:31:0x00cf, B:33:0x00e4, B:34:0x00e8, B:41:0x0100, B:43:0x0178, B:47:0x0189, B:49:0x019a, B:50:0x019e, B:52:0x01a4, B:56:0x01b1, B:61:0x01bc, B:64:0x01c2, B:66:0x01c6, B:68:0x01eb, B:70:0x01f2, B:71:0x01f6, B:73:0x01fc, B:75:0x0209, B:77:0x020d, B:79:0x0211, B:80:0x0215, B:82:0x0227, B:86:0x023d, B:92:0x0252, B:84:0x022f, B:89:0x0247, B:93:0x0257, B:95:0x02a6, B:96:0x02ab, B:98:0x02af, B:100:0x02b9, B:105:0x02cb, B:107:0x02cf, B:108:0x02d4, B:110:0x02d8, B:112:0x02dc, B:113:0x02e1, B:115:0x02e5, B:116:0x02f1, B:118:0x02f5, B:102:0x02bd, B:104:0x02c1, B:25:0x00a4), top: B:123:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x01b0  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x01eb A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:3:0x0009, B:4:0x0013, B:6:0x0019, B:8:0x0024, B:10:0x002e, B:12:0x0032, B:20:0x0098, B:22:0x009c, B:23:0x00a0, B:26:0x00a8, B:28:0x00be, B:30:0x00c4, B:38:0x00ef, B:31:0x00cf, B:33:0x00e4, B:34:0x00e8, B:41:0x0100, B:43:0x0178, B:47:0x0189, B:49:0x019a, B:50:0x019e, B:52:0x01a4, B:56:0x01b1, B:61:0x01bc, B:64:0x01c2, B:66:0x01c6, B:68:0x01eb, B:70:0x01f2, B:71:0x01f6, B:73:0x01fc, B:75:0x0209, B:77:0x020d, B:79:0x0211, B:80:0x0215, B:82:0x0227, B:86:0x023d, B:92:0x0252, B:84:0x022f, B:89:0x0247, B:93:0x0257, B:95:0x02a6, B:96:0x02ab, B:98:0x02af, B:100:0x02b9, B:105:0x02cb, B:107:0x02cf, B:108:0x02d4, B:110:0x02d8, B:112:0x02dc, B:113:0x02e1, B:115:0x02e5, B:116:0x02f1, B:118:0x02f5, B:102:0x02bd, B:104:0x02c1, B:25:0x00a4), top: B:123:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x01f2 A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:3:0x0009, B:4:0x0013, B:6:0x0019, B:8:0x0024, B:10:0x002e, B:12:0x0032, B:20:0x0098, B:22:0x009c, B:23:0x00a0, B:26:0x00a8, B:28:0x00be, B:30:0x00c4, B:38:0x00ef, B:31:0x00cf, B:33:0x00e4, B:34:0x00e8, B:41:0x0100, B:43:0x0178, B:47:0x0189, B:49:0x019a, B:50:0x019e, B:52:0x01a4, B:56:0x01b1, B:61:0x01bc, B:64:0x01c2, B:66:0x01c6, B:68:0x01eb, B:70:0x01f2, B:71:0x01f6, B:73:0x01fc, B:75:0x0209, B:77:0x020d, B:79:0x0211, B:80:0x0215, B:82:0x0227, B:86:0x023d, B:92:0x0252, B:84:0x022f, B:89:0x0247, B:93:0x0257, B:95:0x02a6, B:96:0x02ab, B:98:0x02af, B:100:0x02b9, B:105:0x02cb, B:107:0x02cf, B:108:0x02d4, B:110:0x02d8, B:112:0x02dc, B:113:0x02e1, B:115:0x02e5, B:116:0x02f1, B:118:0x02f5, B:102:0x02bd, B:104:0x02c1, B:25:0x00a4), top: B:123:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x02a6 A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:3:0x0009, B:4:0x0013, B:6:0x0019, B:8:0x0024, B:10:0x002e, B:12:0x0032, B:20:0x0098, B:22:0x009c, B:23:0x00a0, B:26:0x00a8, B:28:0x00be, B:30:0x00c4, B:38:0x00ef, B:31:0x00cf, B:33:0x00e4, B:34:0x00e8, B:41:0x0100, B:43:0x0178, B:47:0x0189, B:49:0x019a, B:50:0x019e, B:52:0x01a4, B:56:0x01b1, B:61:0x01bc, B:64:0x01c2, B:66:0x01c6, B:68:0x01eb, B:70:0x01f2, B:71:0x01f6, B:73:0x01fc, B:75:0x0209, B:77:0x020d, B:79:0x0211, B:80:0x0215, B:82:0x0227, B:86:0x023d, B:92:0x0252, B:84:0x022f, B:89:0x0247, B:93:0x0257, B:95:0x02a6, B:96:0x02ab, B:98:0x02af, B:100:0x02b9, B:105:0x02cb, B:107:0x02cf, B:108:0x02d4, B:110:0x02d8, B:112:0x02dc, B:113:0x02e1, B:115:0x02e5, B:116:0x02f1, B:118:0x02f5, B:102:0x02bd, B:104:0x02c1, B:25:0x00a4), top: B:123:0x0009 }] */
            @Override // X.InterfaceC956570b03
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.List<X.C955090axf> r18) {
                /*
                    Method dump skipped, instruction units count: 773
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C956190azR.LIZ(java.util.List):void");
            }
        };
        InterfaceC956560b02 interfaceC956560b02 = new InterfaceC956560b02() { // from class: X.0axZ
            /* JADX WARN: Removed duplicated region for block: B:101:0x0193  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0172  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0188  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x018b  */
            @Override // X.InterfaceC956560b02
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.List<X.C955080axe> r30) {
                /*
                    Method dump skipped, instruction units count: 409
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C955030axZ.LIZ(java.util.List):void");
            }
        };
        arrayList.add(interfaceC956570b03);
        arrayList2.add(interfaceC956560b02);
    }

    public final void LIZ(InterfaceC956570b03 interfaceC956570b03, int i) {
        synchronized (this.LJFF) {
            try {
                if (i == 2) {
                    ((ArrayList) this.LJFF).add(0, interfaceC956570b03);
                } else {
                    ((ArrayList) this.LJFF).add(interfaceC956570b03);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(LayoutData layoutData, int i) {
        List<Long> listLJ;
        String str;
        InterfaceC940060aZQ interfaceC940060aZQ;
        CohostTypeLayoutExtra cohostTypeLayoutExtra;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cohost_layout_main applyServerDrivenLayout sceneValue=");
        sbLIZ.append(i);
        sbLIZ.append(" spots=");
        sbLIZ.append(layoutData.spotList.size());
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (C915980Zwa.LJII().LJJIJ().size() < 2 && i != 2 && i != 16) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cohost_layout_main applyServerDrivenLayout skip: linkedSize < 2 scene=");
            sbLIZ2.append(i);
            C20441214yg.LJIIIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        String strLJ = C952490atT.LJ();
        boolean z = true;
        if (i != 2 && i != 16) {
            listLJ = C13BV.INSTANCE;
        } else {
            listLJ = C1697810uHb.LJ(Long.valueOf(EnumC955260axw.UI_RENDER.getValue()));
        }
        LayoutState layoutState = layoutData.layout;
        if (layoutState == null || (cohostTypeLayoutExtra = layoutState.cohostLayoutExtra) == null || cohostTypeLayoutExtra.isEnlargeMode == 0) {
            z = false;
        }
        this.LIZJ = z;
        if (this.LIZJ) {
            C20441214yg.LJIIIZ("CoHostLayoutAdapter", "[Enlarge] pendingEnlargeMode=true scene=" + i);
        }
        C20441214yg.LJIIIZ("CoHostLayoutAdapter", "cohost_layout_main applyServerDrivenLayout calling delegate.applyServerDrivenLayoutData scene=" + i + " isAnchor=" + this.LIZ);
        C955000axW c955000axW = this.LIZLLL;
        if (c955000axW != null) {
            c955000axW.LJII(Collections.emptyList(), layoutData.spotList);
            LayoutState layoutState2 = layoutData.layout;
            if (layoutState2 == null || (str = layoutState2.layoutId) == null) {
                str = "";
            }
            c955000axW.LJIIIZ(str, layoutData.spotList);
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = null;
            if (interfaceC954180awCLJIIIZ != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
            }
            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                byte[] bArrLJ = C1516000pYM.LJ(layoutData);
                if (bArrLJ == null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("cohost_layout_main, applyServerDrivenLayoutData skip: failed to serialize LayoutData (sceneValue=");
                    sbLIZ3.append(i);
                    sbLIZ3.append(')');
                    C20441214yg.LJIIL("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                C917100ZyO c917100ZyO = new C917100ZyO(String.valueOf(i), strLJ);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("cohost_layout_main, applyServerDrivenLayoutData calling updateLayoutData sceneValue=");
                sbLIZ4.append(i);
                sbLIZ4.append(" bytes=");
                sbLIZ4.append(bArrLJ.length);
                sbLIZ4.append(" consumerList=");
                sbLIZ4.append(listLJ);
                C20441214yg.LJIIIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ4));
                interfaceC940060aZQ.LJLI(EnumC965730bEp.CROSS, bArrLJ, c917100ZyO, listLJ);
                return;
            }
            C20441214yg.LJIIL("CoHostLayoutAdapter", "cohost_layout_main, applyServerDrivenLayoutData skip: newLayoutInterface is null");
        }
    }

    public final void LJJIFFI(AbstractC957950b2H abstractC957950b2H, List<Long> list) throws JSONException {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        long jLongValue;
        InterfaceC955150axl interfaceC955150axlLLJJJIL;
        InterfaceC955150axl interfaceC955150axlLLJJJIL2;
        if (LJIIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cohost_layout_main switchNewLayoutTakeStage blocked: server layout is active, local switch skipped (scene=");
            sbLIZ.append(C13LE.LIZ(abstractC957950b2H.getClass()).LJI());
            sbLIZ.append(')');
            C20441214yg.LJIIIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("switchNewLayoutTakeStage triggerScene=");
        sbLIZ2.append(C13LE.LIZ(abstractC957950b2H.getClass()).LJI());
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ2));
        if (C915980Zwa.LJII().LJJIJ().size() < 2) {
            return;
        }
        Long l = (Long) C13LP.LJJJLZIJ(0, list);
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        InterfaceC937900aVw interfaceC937900aVw = null;
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
        } else {
            interfaceC937900aVwLLIIJLIL = null;
        }
        if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) {
            interfaceC937900aVw = interfaceC937900aVwLLIIJLIL;
        }
        C955270axx c955270axxLIZ = abstractC957950b2H.LIZ(list);
        C955320ay2 c955320ay2 = c955270axxLIZ.LIZ;
        List<C956260azY> list2 = c955270axxLIZ.LIZIZ;
        if (list2.isEmpty()) {
            C20441214yg.LIZIZ("CoHostLayoutAdapter", "switchNewLayoutTakeStage cohost_layout_main spotList is empty");
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("switchNewLayoutWithBusinessUserList cohost_layout_main layoutManager=");
        sbLIZ3.append(interfaceC937900aVwLLIIJLIL);
        sbLIZ3.append(", newLayoutInterface=");
        sbLIZ3.append(interfaceC937900aVw);
        sbLIZ3.append(", layoutState=");
        sbLIZ3.append(C1058250de3.LIZLLL(c955320ay2));
        sbLIZ3.append(" spotList=");
        sbLIZ3.append(C1058250de3.LIZLLL(list2));
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ3));
        this.LJIIIIZZ = new C443120HZe<>(Long.valueOf(System.currentTimeMillis()), abstractC957950b2H, list);
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 != null && (interfaceC955150axlLLJJJIL2 = interfaceC954180awCLJIIIZ2.LLJJJIL()) != null) {
            interfaceC955150axlLLJJJIL2.LIZLLL(new C955140axk("switchNewLayoutTakeStage"));
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C955200axq c955200axqLJ = LJ(jLongValue);
        C20441214yg.LIZIZ("CoHostLayoutAdapter", "switchNewLayoutTakeStage, startLayoutAnimation");
        String strLJ = C952490atT.LJ();
        if (InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled) {
            ArrayList arrayList = new ArrayList();
            Iterator<C956260azY> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZIZ);
            }
            if (this.LIZ) {
                EnumC955050axb enumC955050axb = EnumC955050axb.PIPELINE_TRIGGER;
                String strValueOf = String.valueOf(abstractC957950b2H.LIZ);
                getClass();
                LJIJI(enumC955050axb, c955320ay2, arrayList, strValueOf, strLJ, null);
            } else {
                EnumC955060axc enumC955060axc = EnumC955060axc.PIPELINE_TRIGGER;
                String strValueOf2 = String.valueOf(abstractC957950b2H.LIZ);
                getClass();
                LJIJJLI(enumC955060axc, c955320ay2, arrayList, strValueOf2, strLJ, null);
            }
        }
        C955000axW c955000axW = this.LIZLLL;
        if (c955000axW != null) {
            List<PosIdentity> list3 = c955270axxLIZ.LIZJ;
            String str = c955200axqLJ.LIZ;
            String str2 = c955200axqLJ.LIZIZ;
            JSONObject jSONObject = c955200axqLJ.LIZJ;
            JSONObject jSONObject2 = c955200axqLJ.LIZLLL;
            c955000axW.LJII(list2, Collections.emptyList());
            c955000axW.LJIIIIZZ(c955320ay2, list2);
            ArrayList arrayList2 = new ArrayList();
            Iterator<C956260azY> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LIZIZ);
            }
            C955340ay4 c955340ay4 = new C955340ay4(c955320ay2, arrayList2, list3, EnumC955260axw.ALL);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("cohost_layout_main, switchLayoutAnimation layoutData=");
            sbLIZ4.append(C1058250de3.LIZLLL(c955340ay4));
            C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ4));
            InterfaceC954180awC interfaceC954180awCLJIIIZ3 = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ3 != null && (interfaceC955150axlLLJJJIL = interfaceC954180awCLJIIIZ3.LLJJJIL()) != null) {
                interfaceC955150axlLLJJJIL.LJIILIIL(EnumC965730bEp.CROSS, c955340ay4, str, str2, C1533950q1J.LJ(str2), jSONObject, jSONObject2);
            }
            if (C958370b2x.LIZIZ()) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new Pair("time", C955000axW.LIZIZ()));
                arrayList3.add(new Pair("desc", "trigger switch layout(take stage)"));
                arrayList3.add(new Pair("func", "switchLayoutAnimation"));
                arrayList3.add(new Pair("param scene", String.valueOf(abstractC957950b2H.LIZ)));
                String strLIZLLL = C1058250de3.LIZLLL(c955340ay4);
                if (strLIZLLL == null) {
                    strLIZLLL = "";
                }
                arrayList3.add(new Pair("param layoutInfo", strLIZLLL));
                C956230azV.LIZ().LIZ(arrayList3);
            }
        }
    }

    public final void LJJII(AbstractC957950b2H abstractC957950b2H, List<Long> list) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if (LJIIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cohost_layout_main switchNewLayoutWithBusinessUserList blocked: server layout is active, local switch skipped (scene=");
            sbLIZ.append(C13LE.LIZ(abstractC957950b2H.getClass()).LJI());
            sbLIZ.append(')');
            C20441214yg.LJIIIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("switchNewLayoutWithBusinessUserList triggerScene=");
        sbLIZ2.append(C13LE.LIZ(abstractC957950b2H.getClass()).LJI());
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ2));
        if (C915980Zwa.LJII().LJJIJ().size() < 2) {
            return;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        InterfaceC937900aVw interfaceC937900aVw = null;
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
        } else {
            interfaceC937900aVwLLIIJLIL = null;
        }
        if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) {
            interfaceC937900aVw = interfaceC937900aVwLLIIJLIL;
        }
        C955270axx c955270axxLIZ = abstractC957950b2H.LIZ(list);
        C955320ay2 c955320ay2 = c955270axxLIZ.LIZ;
        List<C956260azY> list2 = c955270axxLIZ.LIZIZ;
        if (list2.isEmpty()) {
            C20441214yg.LIZIZ("CoHostLayoutAdapter", "switchNewLayoutWithBusinessUserList cohost_layout_main spotList is empty");
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("switchNewLayoutWithBusinessUserList cohost_layout_main layoutManager=");
        sbLIZ3.append(interfaceC937900aVwLLIIJLIL);
        sbLIZ3.append(", newLayoutInterface=");
        sbLIZ3.append(interfaceC937900aVw);
        sbLIZ3.append(", layoutState=");
        sbLIZ3.append(C1058250de3.LIZLLL(c955320ay2));
        sbLIZ3.append(" spotList=");
        sbLIZ3.append(C1058250de3.LIZLLL(list2));
        sbLIZ3.append(", businessUserList=");
        sbLIZ3.append(C1058250de3.LIZLLL(list));
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ3));
        this.LJIIIIZZ = new C443120HZe<>(Long.valueOf(System.currentTimeMillis()), abstractC957950b2H, list);
        String strLJ = C952490atT.LJ();
        if (InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled) {
            ArrayList arrayList = new ArrayList();
            Iterator<C956260azY> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZIZ);
            }
            if (this.LIZ) {
                EnumC955050axb enumC955050axb = EnumC955050axb.PIPELINE_TRIGGER;
                String strValueOf = String.valueOf(abstractC957950b2H.LIZ);
                getClass();
                LJIJI(enumC955050axb, c955320ay2, arrayList, strValueOf, strLJ, null);
            } else {
                EnumC955060axc enumC955060axc = EnumC955060axc.PIPELINE_TRIGGER;
                String strValueOf2 = String.valueOf(abstractC957950b2H.LIZ);
                getClass();
                LJIJJLI(enumC955060axc, c955320ay2, arrayList, strValueOf2, strLJ, null);
            }
        }
        C955000axW c955000axW = this.LIZLLL;
        if (c955000axW != null) {
            c955000axW.LJI(new C955250axv(c955320ay2, list2, c955270axxLIZ.LIZJ, EnumC955260axw.ALL), abstractC957950b2H, strLJ);
        }
    }

    public final void LIZLLL(LayoutData layoutData, int i, String str, List<C957030b0n> list) throws JSONException {
        long jLongValue;
        String str2;
        InterfaceC955150axl interfaceC955150axlLLJJJIL;
        InterfaceC955150axl interfaceC955150axlLLJJJIL2;
        C981500beG c981500beG;
        List<Long> list2;
        Long l;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cohost_layout_main applyServerDrivenLayoutWithAnimation sceneValue=");
        sbLIZ.append(i);
        sbLIZ.append(" layoutKey=");
        sbLIZ.append(str);
        sbLIZ.append(" spots=");
        ArrayList arrayList = (ArrayList) list;
        sbLIZ.append(arrayList.size());
        sbLIZ.append(" protoSpots=");
        sbLIZ.append(layoutData.spotList.size());
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null && (c981500beG = c981480beEM91.LJJIJIIJI) != null && (list2 = c981500beG.LJI) != null && (l = (Long) C13LP.LJJJLZIJ(0, list2)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C955200axq c955200axqLJ = LJ(jLongValue);
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null && (interfaceC955150axlLLJJJIL2 = interfaceC954180awCLJIIIZ.LLJJJIL()) != null) {
            interfaceC955150axlLLJJJIL2.LIZLLL(new C955140axk("applyServerDrivenLayoutWithAnimation"));
        }
        String strLJ = C952490atT.LJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cohost_layout_main applyServerDrivenLayoutWithAnimation calling switchLayoutAnimation effectId=");
        sbLIZ2.append(c955200axqLJ.LIZ);
        C20441214yg.LJIIIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ2));
        C955000axW c955000axW = this.LIZLLL;
        if (c955000axW != null) {
            String str3 = c955200axqLJ.LIZ;
            String str4 = c955200axqLJ.LIZIZ;
            JSONObject jSONObject = c955200axqLJ.LIZJ;
            JSONObject jSONObject2 = c955200axqLJ.LIZLLL;
            c955000axW.LJII(Collections.emptyList(), layoutData.spotList);
            LayoutState layoutState = layoutData.layout;
            if (layoutState == null || (str2 = layoutState.layoutId) == null) {
                str2 = "";
            }
            c955000axW.LJIIIZ(str2, layoutData.spotList);
            byte[] bArrLJ = C1516000pYM.LJ(layoutData);
            if (bArrLJ == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("cohost_layout_main, switchLayoutAnimation skip: failed to serialize LayoutData (sceneValue=");
                sbLIZ3.append(i);
                sbLIZ3.append(" layoutKey=");
                sbLIZ3.append(str);
                sbLIZ3.append(')');
                C20441214yg.LJIIL("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            C917100ZyO c917100ZyO = new C917100ZyO(String.valueOf(i), strLJ);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("cohost_layout_main, switchLayoutAnimation(bytes) sceneValue=");
            sbLIZ4.append(i);
            sbLIZ4.append(" layoutKey=");
            sbLIZ4.append(str);
            sbLIZ4.append(" spots=");
            sbLIZ4.append(arrayList.size());
            sbLIZ4.append(" bytes=");
            sbLIZ4.append(bArrLJ.length);
            sbLIZ4.append(" effectId=");
            sbLIZ4.append(str3);
            C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ4));
            InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ2 == null || (interfaceC955150axlLLJJJIL = interfaceC954180awCLJIIIZ2.LLJJJIL()) == null) {
                return;
            }
            interfaceC955150axlLLJJJIL.LJIILJJIL(EnumC965730bEp.CROSS, bArrLJ, str, list, str3, str4, C1533950q1J.LJ(str4), jSONObject, jSONObject2, c917100ZyO);
        }
    }

    public static void LJIJI(EnumC955050axb enumC955050axb, C955320ay2 c955320ay2, List list, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String strLIZLLL;
        Integer numValueOf;
        String str7;
        List<LinkUser> listLLLLIILL = C915980Zwa.LJII().LLLLIILL();
        ArrayList arrayList = new ArrayList();
        String strLIZLLL2 = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C957030b0n c957030b0n = (C957030b0n) it2.next();
                CohostLayoutWindowExtra cohostLayoutWindowExtraLJIILJJIL = C957830b25.LJIILJJIL(c957030b0n.LIZLLL);
                if (cohostLayoutWindowExtraLJIILJJIL != null) {
                    strLIZLLL = C1058250de3.LIZLLL(cohostLayoutWindowExtraLJIILJJIL);
                } else {
                    strLIZLLL = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c957030b0n.LIZ);
                sbLIZ.append(':');
                PosIdentity posIdentity = c957030b0n.LIZIZ;
                if (posIdentity != null) {
                    numValueOf = Integer.valueOf(posIdentity.type);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(':');
                PosIdentity posIdentity2 = c957030b0n.LIZIZ;
                if (posIdentity2 != null) {
                    str7 = posIdentity2.value;
                } else {
                    str7 = null;
                }
                sbLIZ.append(str7);
                sbLIZ.append(':');
                sbLIZ.append(strLIZLLL);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (c955320ay2 != null) {
            str4 = c955320ay2.LIZLLL;
        } else {
            str4 = null;
        }
        CohostLayoutExtra cohostLayoutExtraLJIIJJI = C957830b25.LJIIJJI(str4);
        if (cohostLayoutExtraLJIIJJI != null) {
            strLIZLLL2 = C1058250de3.LIZLLL(cohostLayoutExtraLJIIJJI);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str3 != null) {
            linkedHashMap.put("fail_reason", str3);
        }
        linkedHashMap.put("linked_count", String.valueOf(listLLLLIILL.size()));
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        String str8 = "";
        if (c955320ay2 == null || (str5 = c955320ay2.LIZIZ) == null) {
            str5 = "";
        }
        linkedHashMap.put("layout_key", str5);
        linkedHashMap.put("spot_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        if (c955320ay2 != null && (str6 = c955320ay2.LIZ) != null) {
            str8 = str6;
        }
        linkedHashMap.put("layout_id", str8);
        if (strLIZLLL2 != null) {
            linkedHashMap.put("layout_extra", strLIZLLL2);
        }
        linkedHashMap.put("source_id", str2);
        C952490atT.LIZ.LIZIZ(str2, enumC955050axb, linkedHashMap);
    }

    public static void LJIJJLI(EnumC955060axc enumC955060axc, C955320ay2 c955320ay2, List list, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String strLIZLLL;
        Integer numValueOf;
        String str7;
        String str8 = str3;
        List<LinkUser> listLLLLIILL = C915980Zwa.LJII().LLLLIILL();
        ArrayList arrayList = new ArrayList();
        String strLIZLLL2 = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C957030b0n c957030b0n = (C957030b0n) it2.next();
                CohostLayoutWindowExtra cohostLayoutWindowExtraLJIILJJIL = C957830b25.LJIILJJIL(c957030b0n.LIZLLL);
                if (cohostLayoutWindowExtraLJIILJJIL != null) {
                    strLIZLLL = C1058250de3.LIZLLL(cohostLayoutWindowExtraLJIILJJIL);
                } else {
                    strLIZLLL = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c957030b0n.LIZ);
                sbLIZ.append(':');
                PosIdentity posIdentity = c957030b0n.LIZIZ;
                if (posIdentity != null) {
                    numValueOf = Integer.valueOf(posIdentity.type);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(':');
                PosIdentity posIdentity2 = c957030b0n.LIZIZ;
                if (posIdentity2 != null) {
                    str7 = posIdentity2.value;
                } else {
                    str7 = null;
                }
                sbLIZ.append(str7);
                sbLIZ.append(':');
                sbLIZ.append(strLIZLLL);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (c955320ay2 != null) {
            str4 = c955320ay2.LIZLLL;
        } else {
            str4 = null;
        }
        CohostLayoutExtra cohostLayoutExtraLJIIJJI = C957830b25.LJIIJJI(str4);
        if (cohostLayoutExtraLJIIJJI != null) {
            strLIZLLL2 = C1058250de3.LIZLLL(cohostLayoutExtraLJIIJJI);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("fail_reason", str8);
        linkedHashMap.put("linked_count", String.valueOf(listLLLLIILL.size()));
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        if (c955320ay2 == null || (str5 = c955320ay2.LIZIZ) == null) {
            str5 = "";
        }
        linkedHashMap.put("layout_key", str5);
        linkedHashMap.put("spot_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        if (c955320ay2 == null || (str6 = c955320ay2.LIZ) == null) {
            str6 = "";
        }
        linkedHashMap.put("layout_id", str6);
        if (strLIZLLL2 == null) {
            strLIZLLL2 = "";
        }
        linkedHashMap.put("layout_extra", strLIZLLL2);
        linkedHashMap.put("source_id", str2);
        C952490atT.LIZ.LIZJ(str2, enumC955060axc, linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0289, code lost:
    
        if (kotlin.text.a0.LJJIIZI(r15, "P2PGroupChange", true) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, java.lang.String r27, int r28, java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955010axX.LJIILJJIL(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, java.lang.String, java.lang.String):void");
    }
}
