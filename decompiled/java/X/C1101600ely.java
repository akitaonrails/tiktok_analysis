package X;

import Y.ARunnableS86S0200000_17;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.model.ShortTouchBusiness;
import com.bytedance.android.livesdk.chatroom.model.ShortTouchConfig;
import com.bytedance.android.livesdk.dataChannel.ShortTouchContainerLoaded;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import com.bytedance.android.livesdk.model.ShortTouchTemplateData;
import com.bytedance.android.livesdk.model.message.CustomPayload;
import com.bytedance.android.livesdk.model.message.ShortTouchMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.internal.AwS666S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ely, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101600ely implements OnIMMessageListener {
    public Context LLILLJJLI;
    public DataChannel LLILLL;
    public LifecycleOwner LLILZ;
    public C1101810emJ LLILZIL;
    public C1101730emB LLILZLL;
    public InterfaceC1102010emd LLIZ;
    public InterfaceC1101890emR LLIZLLLIL;
    public List<C1101960emY> LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC420801kM LLJILLL;
    public boolean LLJJIII;
    public List<ShortTouchMessage> LLJJIJI;
    public final String LL = "ShortTouchManager";
    public final Map<String, AbstractC1086990eOP> LLJ = new LinkedHashMap();
    public final Queue<AbstractC1101760emE> LLJI = new LinkedList();
    public final BPEAHandler LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
    public final Map<String, ShortTouchConfig> LLJJ = new LinkedHashMap();
    public boolean LLJJI = true;

    public final void LIZLLL() {
        this.LLJILJIL = false;
        LJFF();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "short_touch";
    }

    public final void LJFF() {
        List<C1101960emY> list;
        C1101960emY c1101960emY;
        if (this.LLJILJIL || (list = this.LLJIJIL) == null || !(!((ArrayList) list).isEmpty()) || this.LLIZ == null || this.LLIZLLLIL == null) {
            return;
        }
        this.LLJILJIL = true;
        List<C1101960emY> list2 = this.LLJIJIL;
        if (list2 == null || (c1101960emY = (C1101960emY) ListProtector.remove(list2, 0)) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LLJILJILJ, new ARunnableS86S0200000_17(c1101960emY, this, 72));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final void LIZ(AbstractC1101760emE abstractC1101760emE) {
        boolean zLJFF;
        InterfaceC1101720emA interfaceC1101720emA;
        String strSr;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add short touch: type: ");
        sbLIZ.append(abstractC1101760emE.LJIILL());
        sbLIZ.append(",endTime: ");
        sbLIZ.append(abstractC1101760emE.LJ());
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        String strLJIILL = abstractC1101760emE.LJIILL();
        System.currentTimeMillis();
        C1101820emK c1101820emK = new C1101820emK(strLJIILL);
        if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
            Map<String, C1101820emK> map = C1101900emS.LIZ;
            map.put(abstractC1101760emE.LJII(), c1101820emK);
            if ((abstractC1101760emE instanceof C1101620em0) && (interfaceC1101720emA = ((C1101620em0) abstractC1101760emE).LLIZ) != null && (strSr = interfaceC1101720emA.Sr()) != null) {
                map.put(strSr, c1101820emK);
            }
        }
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(abstractC1101760emE.LJII());
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LIZIZ = System.currentTimeMillis();
            c1101820emKLIZIZ.LJII = ((LinkedList) this.LLJI).size();
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel != null) {
                zLJFF = Intrinsics.LJFF(dataChannel.gg0(ShortTouchContainerLoaded.class), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            c1101820emKLIZIZ.LJIJ = zLJFF;
        }
        ((LinkedList) this.LLJI).offer(abstractC1101760emE);
        List<C1101960emY> list = this.LLJIJIL;
        if (list != null) {
            ((ArrayList) list).add(new C1101960emY(EnumC1101700em8.Add, abstractC1101760emE));
        }
        abstractC1101760emE.LJIIIZ();
        LJFF();
        if (this.LLJJI) {
            this.LLJJI = false;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_shorttouch_interaction_container_load");
            c474500IjALIZ.LJIIIIZZ();
            if (C01C5.LIZ(this.LLILLL)) {
                c474500IjALIZ.LJJII("moderator", "user_type");
            }
            c474500IjALIZ.LJJII(abstractC1101760emE.LJIILL(), "interact_type");
            c474500IjALIZ.LJJII("base_container", "container_type");
            c474500IjALIZ.LIZ();
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_shorttouch_interaction_accept");
        c474500IjALIZ2.LJIIIIZZ();
        c474500IjALIZ2.LJJII(abstractC1101760emE.LJIILL(), "interact_type");
        if (C01C5.LIZ(this.LLILLL)) {
            c474500IjALIZ2.LJJII("moderator", "user_type");
        }
        c474500IjALIZ2.LIZ();
    }

    public final void LJ(ShortTouchMessage shortTouchMessage) throws JSONException {
        Integer numValueOf;
        String strLJIILL;
        String str = shortTouchMessage.subBusinessType;
        ((LinkedHashMap) this.LLJ).get(str);
        ShortTouchTemplateData shortTouchTemplateData = shortTouchMessage.templateData;
        Lifecycle lifecycle = null;
        if (shortTouchTemplateData != null && (numValueOf = Integer.valueOf(shortTouchTemplateData.status)) != null) {
            if (numValueOf.intValue() == 1) {
                try {
                    if (!this.LLJJIII) {
                        if (this.LLJJIJI == null) {
                            this.LLJJIJI = new ArrayList();
                        }
                        List<ShortTouchMessage> list = this.LLJJIJI;
                        if (list != null) {
                            ((ArrayList) list).add(shortTouchMessage);
                            return;
                        }
                        return;
                    }
                    ShortTouchBusiness shortTouchBusiness = new ShortTouchBusiness();
                    shortTouchBusiness.subBusinessType = str;
                    shortTouchBusiness.businessType = shortTouchMessage.businessType;
                    CustomPayload customPayload = shortTouchMessage.customPayload;
                    if (customPayload == null || (strLJIILL = C19748512Ol.LIZIZ.LJIILL(customPayload)) == null) {
                        strLJIILL = "";
                    }
                    shortTouchBusiness.customPayload = strLJIILL;
                    shortTouchBusiness.templateData = shortTouchMessage.templateData;
                    ShortTouchConfig shortTouchConfig = (ShortTouchConfig) ((LinkedHashMap) this.LLJJ).get(shortTouchMessage.subBusinessType);
                    if (shortTouchConfig != null) {
                        Context context = this.LLILLJJLI;
                        LifecycleOwner lifecycleOwner = this.LLILZ;
                        if (lifecycleOwner != null) {
                            lifecycle = lifecycleOwner.getLifecycle();
                        }
                        LIZIZ(shortTouchBusiness, shortTouchConfig, context, lifecycle);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJI(this.LL, th);
                    return;
                }
            }
            if (numValueOf.intValue() == 2) {
                LJII(shortTouchMessage.subBusinessType, shortTouchMessage.templateData, shortTouchMessage.customPayload);
            } else if (numValueOf.intValue() == 3) {
                LJI(EnumC1101860emO.NAME, shortTouchMessage.subBusinessType, "ShortTouchMessage");
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) throws JSONException {
        if (!(iMessage instanceof ShortTouchMessage)) {
            return;
        }
        LJ((ShortTouchMessage) iMessage);
    }

    public final AbstractC1101760emE LIZJ(EnumC1101860emO enumC1101860emO, String str) {
        Object next;
        boolean zLJFF;
        Iterator<T> it2 = this.LLJI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AbstractC1101760emE abstractC1101760emE = (AbstractC1101760emE) next;
                int i = C1101670em5.LIZ[enumC1101860emO.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        zLJFF = Intrinsics.LJFF(abstractC1101760emE.LJIILL(), str);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    zLJFF = Intrinsics.LJFF(abstractC1101760emE.LIZJ(), str);
                }
                if (zLJFF) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (AbstractC1101760emE) next;
    }

    public final void LJI(EnumC1101860emO enumC1101860emO, String str, String str2) {
        Iterator<C1101960emY> it2;
        String strLIZJ;
        String str3 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove short touch: identify: ");
        sbLIZ.append(enumC1101860emO);
        sbLIZ.append(",value: ");
        sbLIZ.append(str);
        sbLIZ.append(",from: ");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1101760emE abstractC1101760emELIZJ = LIZJ(enumC1101860emO, str);
        List<C1101960emY> list = this.LLJIJIL;
        if (list != null && (it2 = list.iterator()) != null) {
            while (it2.hasNext()) {
                C1101960emY next = it2.next();
                if (next.LIZ == EnumC1101700em8.Add) {
                    AbstractC1101760emE abstractC1101760emE = next.LIZIZ;
                    String strLIZJ2 = null;
                    if (abstractC1101760emE != null) {
                        strLIZJ = abstractC1101760emE.LIZJ();
                    } else {
                        strLIZJ = null;
                    }
                    if (abstractC1101760emELIZJ != null) {
                        strLIZJ2 = abstractC1101760emELIZJ.LIZJ();
                    }
                    if (Intrinsics.LJFF(strLIZJ, strLIZJ2)) {
                        it2.remove();
                        if (abstractC1101760emELIZJ != null) {
                            ((LinkedList) this.LLJI).remove(abstractC1101760emELIZJ);
                            abstractC1101760emELIZJ.LJIILIIL();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        List<C1101960emY> list2 = this.LLJIJIL;
        if (list2 != null) {
            list2.add(new C1101960emY(EnumC1101700em8.Remove, LIZJ(enumC1101860emO, str)));
        }
        LJFF();
    }

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
    public final void LJII(String str, ShortTouchTemplateData shortTouchTemplateData, Object obj) throws JSONException {
        AbstractC1101760emE next;
        InterfaceC1085330eLj interfaceC1085330eLj;
        C1101730emB c1101730emB = this.LLILZLL;
        if (c1101730emB != null) {
            Iterator<AbstractC1101760emE> it2 = c1101730emB.LIZIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LJIILL(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC1101760emE abstractC1101760emE = next;
            if (abstractC1101760emE != null && shortTouchTemplateData != null && (interfaceC1085330eLj = abstractC1101760emE.LLILZIL) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", 2);
                jSONObject.put("short_touch_name", abstractC1101760emE.LJIILL());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("count", shortTouchTemplateData.businessCount);
                jSONObject2.put("has_interacted", shortTouchTemplateData.hasInteracted);
                jSONObject2.put("end_time", shortTouchTemplateData.endTime);
                jSONObject2.put("send_user_id", shortTouchTemplateData.sendUserId);
                jSONObject2.put("log_params", shortTouchTemplateData.logParams);
                jSONObject2.put("business_data", obj);
                jSONObject.put("dynamic_data", jSONObject2);
                interfaceC1085330eLj.JG1("lynx_short_touch_state_event", jSONObject);
            }
        }
    }

    public final void LIZIZ(ShortTouchBusiness shortTouchBusiness, ShortTouchConfig shortTouchConfig, Context context, Lifecycle lifecycle) {
        Room roomLJJLIIIIJ;
        AbstractC1086990eOP abstractC1086990eOP = (AbstractC1086990eOP) ((LinkedHashMap) this.LLJ).get(shortTouchBusiness.subBusinessType);
        if (abstractC1086990eOP != null && abstractC1086990eOP.LIZ()) {
            return;
        }
        AbstractC1086990eOP abstractC1086990eOP2 = (AbstractC1086990eOP) ((LinkedHashMap) this.LLJ).get(shortTouchBusiness.subBusinessType);
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        } else {
            roomLJJLIIIIJ = null;
        }
        LIZ(new C1100170ejf(shortTouchBusiness, shortTouchConfig, context, lifecycle, abstractC1086990eOP2, roomLJJLIIIIJ, new AwS666S0100000_17(this, 3)));
    }
}
