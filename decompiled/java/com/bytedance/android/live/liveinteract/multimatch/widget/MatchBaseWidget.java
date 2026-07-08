package com.bytedance.android.live.liveinteract.multimatch.widget;

import X.AbstractC977390bXd;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C915980Zwa;
import X.C945320ahu;
import X.C954460awe;
import X.C954930axP;
import X.C957640b1m;
import X.C969460bKq;
import X.C969470bKr;
import X.C969490bKt;
import X.C973660bRc;
import X.C974480bSw;
import X.C974540bT2;
import X.C975400bUQ;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import X.InterfaceC969510bKv;
import X.ViewOnClickListenerC986770bml;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.competition.widget.CompetitionAudienceWidget;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchStatusRestEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public abstract class MatchBaseWidget extends LiveRecyclableWidget {
    public View LL;
    public MultiCoHostWindowManager LLILLJJLI;
    public final List<AbstractC977390bXd> LLILLL = new ArrayList();
    public boolean LLILZ;
    public List<C954460awe> LLILZIL;
    public final AwS629S0100000_15 LLILZLL;
    public final AwS629S0100000_15 LLIZ;
    public final AwS629S0100000_15 LLIZLLLIL;
    public C969490bKt LLJ;

    public void B1(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
    }

    public void D1(C945320ahu c945320ahu, String str) {
    }

    public void E1(long j, String str) {
    }

    public void LJ() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public boolean z1() {
        return this instanceof CompetitionAudienceWidget;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        C20441214yg.LIZIZ("MatchBaseWidget", "onUnload");
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled() || !C500260Jjc.LJIIZILJ(this.dataChannel)) {
            C969490bKt c969490bKt = this.LLJ;
            if (c969490bKt != null) {
                Iterator<InterfaceC969510bKv> it2 = c969490bKt.LIZ.values().iterator();
                while (it2.hasNext()) {
                    it2.next().onCleared();
                }
                c969490bKt.LIZ.clear();
            }
            this.LLJ = null;
            this.LLILLJJLI = null;
            C915980Zwa.LJII().LJJLIIIJL(C954930axP.class, this.LLIZLLLIL);
            C915980Zwa.LJII().LJJLIIIJL(C969460bKq.class, this.LLILZLL);
            C915980Zwa.LJII().LJJLIIIJL(C957640b1m.class, this.LLIZ);
            C20441214yg.LJIIIZ("MatchBaseWidget", "unObserverLinkedListChanged");
            C973660bRc.LJLJJLL = null;
            C974540bT2.LJJIFFI = null;
            InterfaceC420801kM interfaceC420801kM = C974540bT2.LJJII;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            ((ArrayList) this.LLILLL).clear();
        }
        if (LiveMatchScoreTrackSetting.INSTANCE.enableTrack()) {
            C20441214yg.LIZIZ("MatchScoreAccuracyHelper", "onWidgetDestroyed: ");
            C975400bUQ.LIZIZ = null;
            C975400bUQ.LIZIZ(true);
        }
    }

    public final void A1() {
        C915980Zwa.LJII().LLLJIL(C954930axP.class, this.LLIZLLLIL);
        C915980Zwa.LJII().LLLJIL(C969460bKq.class, this.LLILZLL);
        C915980Zwa.LJII().LLLJIL(C957640b1m.class, this.LLIZ);
        C20441214yg.LJIIIZ("MatchBaseWidget", "observable UserListChangedMessage from co-host linked user list");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C20441214yg.LJIIIZ("MatchBaseWidget", "onPause: ");
        this.LLILZ = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C20441214yg.LJIIIZ("MatchBaseWidget", "onResume: ");
        this.LLILZ = true;
    }

    public MatchBaseWidget(View view) {
        this.LL = view;
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        if (iHostResource != null) {
            iHostResource.ud2("tiktok_live_match_resource");
        }
        C20441214yg.LIZIZ("MatchBaseWidget", "MatchBaseWidget init");
        this.LLILZIL = new ArrayList();
        this.LLILZLL = new AwS629S0100000_15(this, 43);
        this.LLIZ = new AwS629S0100000_15(this, 45);
        this.LLIZLLLIL = new AwS629S0100000_15(this, 44);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        C974480bSw.LIZIZ = true;
        if (!(this instanceof CompetitionAudienceWidget)) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            C973660bRc.LJLJJLL = (C969470bKr) y1(C969470bKr.class);
            ((LinkedHashMap) C973660bRc.LJLJLLL).clear();
            if (LiveMatchScoreTrackSetting.INSTANCE.enableTrack()) {
                C20441214yg.LJIIIZ("MatchScoreAccuracyHelper", "onWidgetCreated: ");
                C975400bUQ.LIZIZ = this;
            }
        }
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C974540bT2.LJJIFFI = (C969470bKr) y1(C969470bKr.class);
        C974540bT2.LJJII = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(new InterfaceC19562711gH() { // from class: X.0bKs
            @Override // X.InterfaceC19562711gH
            public final void LLF(Context context) {
            }

            @Override // X.InterfaceC19562711gH
            public final void LLLLIILLL(Context context) {
                C974540bT2 c974540bT22 = C974540bT2.LIZ;
                C974540bT2.LJIILLIIL = SystemClock.elapsedRealtime();
            }
        });
        this.LLILZIL = new ArrayList(C915980Zwa.LJII().LLILZLL(true));
        A1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, MatchStatusRestEvent.class, new AwS594S0100000_15(this, 523));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, MultiCoHostStateChannel.class, new AwS594S0100000_15(this, 524));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, BattleIsCurrentWinChannel.class, AFwS250S0000000_15.get$arr$(95));
        }
        C20441214yg.LIZIZ("MatchBaseWidget", "onLoad");
    }

    public final ViewOnClickListenerC986770bml x1(long j) {
        boolean z;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlLJ;
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("coHostWindowManager == null  =");
        if (this.LLILLJJLI == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("coHostWindowManager?.getWindowViewByLinkMicId  =");
        MultiCoHostWindowManager multiCoHostWindowManager = this.LLILLJJLI;
        String str5 = "";
        if (multiCoHostWindowManager != null) {
            C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(j);
            if (c954460aweLLILL == null || (str4 = c954460aweLLILL.LJIIJJI) == null) {
                str4 = "";
            }
            viewOnClickListenerC986770bmlLJ = multiCoHostWindowManager.LJ(str4);
        } else {
            viewOnClickListenerC986770bmlLJ = null;
        }
        sbLIZ2.append(viewOnClickListenerC986770bmlLJ);
        C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("linkMicId = ");
        C954460awe c954460aweLLILL2 = C915980Zwa.LJII().LLILL(j);
        if (c954460aweLLILL2 != null) {
            str = c954460aweLLILL2.LJIIJJI;
        } else {
            str = null;
        }
        sbLIZ3.append(str);
        sbLIZ3.append(",uid = ");
        sbLIZ3.append(j);
        sbLIZ3.append(", MultiCoHostUser = ");
        sbLIZ3.append(C915980Zwa.LJII().LLILL(j));
        sbLIZ3.append("  multiCoHostService.getCoHostUser(uid)?.linkMicId  = ");
        C954460awe c954460aweLLILL3 = C915980Zwa.LJII().LLILL(j);
        if (c954460aweLLILL3 != null) {
            str2 = c954460aweLLILL3.LJIIJJI;
        } else {
            str2 = null;
        }
        sbLIZ3.append(str2);
        C20441214yg.LIZIZ("MatchBaseWidget", C2188811AlT.LIZIZ(sbLIZ3));
        MultiCoHostWindowManager multiCoHostWindowManager2 = this.LLILLJJLI;
        if (multiCoHostWindowManager2 == null) {
            return null;
        }
        C954460awe c954460aweLLILL4 = C915980Zwa.LJII().LLILL(j);
        if (c954460aweLLILL4 != null && (str3 = c954460aweLLILL4.LJIIJJI) != null) {
            str5 = str3;
        }
        return multiCoHostWindowManager2.LJ(str5);
    }

    public final <T extends InterfaceC969510bKv> T y1(Class<T> cls) throws IllegalAccessException, InstantiationException {
        T t;
        if (this.LLJ == null) {
            this.LLJ = new C969490bKt();
        }
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "default";
        }
        if (!TextUtils.isEmpty(canonicalName)) {
            C969490bKt c969490bKt = this.LLJ;
            if (c969490bKt != null) {
                t = (T) c969490bKt.LIZ.get(canonicalName);
            } else {
                t = null;
            }
            if (cls.isInstance(t)) {
                return t;
            }
            T tNewInstance = cls.newInstance();
            InterfaceC969510bKv interfaceC969510bKvPut = this.LLJ.LIZ.put(canonicalName, tNewInstance);
            if (interfaceC969510bKvPut != null) {
                interfaceC969510bKvPut.onCleared();
            }
            return tNewInstance;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchBaseWidget getViewModel cls error ");
        sbLIZ.append(cls);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void C1(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkedAnchorChanged size=");
        sbLIZ.append(list.size());
        C20441214yg.LJIIIZ("MatchBaseWidget", C2188811AlT.LIZIZ(sbLIZ));
    }
}
