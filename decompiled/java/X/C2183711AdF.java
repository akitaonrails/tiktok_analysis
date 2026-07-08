package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import njp.a;

/* JADX INFO: renamed from: X.1AdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.perf.MessageListFPSMonitor$doReport$1", f = "MessageListFPSMonitor.kt", l = {}, m = "invokeSuspend")
public final class C2183711AdF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2183701AdE LL;
    public final /* synthetic */ C2183681AdC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183711AdF(C2183701AdE c2183701AdE, C2183681AdC c2183681AdC, InterfaceC1364105Vn<? super C2183711AdF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2183701AdE;
        this.LLILLJJLI = c2183681AdC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2183711AdF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        int i2;
        Object obj3;
        Object obj4;
        C1C7U.LIZ("MessageListFPSMonitor@16f6.doReport$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set setLLIIJI = C13LP.LLIIJI(this.LL.LJII);
        Set<C2183721AdG> setLJII = C15442062u.LJII(C13LP.LLIIJI(this.LL.LJIIIIZZ), setLLIIJI);
        AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(setLJII, (Set<C2183721AdG>) 130);
        AwS612S0100000_33 awS612S0100000_332 = new AwS612S0100000_33(setLJII, (Set<C2183721AdG>) 131);
        C2183701AdE c2183701AdE = this.LL;
        C2183681AdC c2183681AdC = this.LLILLJJLI;
        C13DA c13da = new C13DA();
        c13da.put("scroll_scene", "im_message_list");
        c13da.put("scroll_fps", String.valueOf(c2183701AdE.LIZIZ));
        c13da.put("scroll_duration", String.valueOf(c2183701AdE.LJI - c2183701AdE.LJFF));
        c13da.put("scroll_hitch_count", String.valueOf(c2183701AdE.LIZJ));
        c13da.put("scroll_drop3_count", String.valueOf(c2183701AdE.LIZLLL));
        c13da.put("scroll_drop7_count", String.valueOf(c2183701AdE.LJ));
        c13da.put("timestamp", String.valueOf(c2183701AdE.LJI));
        boolean zIsSingleChat = c2183681AdC.LL.isSingleChat();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (!zIsSingleChat) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("conversation_type", obj2);
        c13da.put("cell_count", String.valueOf(setLJII.size()));
        c13da.put(Scene.SCENE_SERVICE, C13LP.LJJLIIIJ(setLJII, ",", ",", ",", 0, null, AFwS279S0000000_33.get$arr$(293), 24));
        c13da.put("message_type", C13LP.LJJLIIIJ(setLJII, ",", ",", ",", 0, null, AFwS279S0000000_33.get$arr$(294), 24));
        boolean z = setLJII instanceof Collection;
        if (z && setLJII.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = setLJII.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((C2183721AdG) it2.next()).LIZJ && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c13da.put("lynx_count", String.valueOf(i));
        if (z && setLJII.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 0;
            for (C2183721AdG c2183721AdG : setLJII) {
                if (c2183721AdG.LIZJ && !c2183721AdG.LIZLLL && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c13da.put("lynx_un_reuse_count", String.valueOf(i2));
        c13da.put("text_count", awS612S0100000_33.invoke(C2286608xc.LJ(7)));
        c13da.put("aweme_count", awS612S0100000_33.invoke(C2286608xc.LJ(1809)));
        c13da.put("sticker_count", awS612S0100000_33.invoke(C2286608xc.LJ(1805)));
        c13da.put("dm_camera_count", awS612S0100000_332.invoke(C1697810uHb.LJIIJJI(C2286608xc.LJ(1803), C2286608xc.LJ(1802))));
        c13da.put("fortune_cookie_count", awS612S0100000_33.invoke(C2286608xc.LJ(1814)));
        C458620Hye c458620Hye = C458620Hye.LIZ;
        if (c458620Hye.LIZLLL().isRecording()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("dm_voice_message_record", obj3);
        if (c458620Hye.LJII().LIZJ()) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("dm_voice_message_play", obj4);
        c13da.put("voice_message_count", awS612S0100000_33.invoke(C2286608xc.LJ(1813)));
        c13da.put("quick_live_react_message_count", awS612S0100000_33.invoke(C2286608xc.LJ(1818)));
        if (!(setLLIIJI instanceof Collection) || !setLLIIJI.isEmpty()) {
            Iterator it3 = setLLIIJI.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((C2183721AdG) it3.next()).LJ) {
                    str = "1";
                    break;
                }
            }
        }
        c13da.put("live_player_playing", str);
        c13da.putAll(c2183681AdC.LLJ);
        this.LLILLJJLI.LLILZIL.invoke(c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageListFPSMonitor@16f6.doReport$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
