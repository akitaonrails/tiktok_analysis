package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.scene.Scene;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: renamed from: X.0b3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958800b3e implements InterfaceC954910axN {
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;

    @Override // X.InterfaceC954910axN
    public final void LIZ() {
        C20441214yg.LJIIIZ("RevenueInteraction", LJIIZILJ());
    }

    @Override // X.InterfaceC954910axN
    public final InterfaceC954910axN LJ() {
        C962950bAL c962950bAL = EnumC962960bAM.Companion;
        EnumC962960bAM enumC962960bAMDn0 = C915980Zwa.LIZIZ().Dn0();
        if (enumC962960bAMDn0 == EnumC962960bAM.UNKNOWN) {
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            c962950bAL.getClass();
            enumC962960bAMDn0 = C962950bAL.LIZLLL(enumC919170a1jXB0);
        }
        c962950bAL.getClass();
        LJIILIIL(C962950bAL.LIZJ(enumC962960bAMDn0), "type");
        return this;
    }

    public final String LJIIZILJ() {
        StringBuilder sb = new StringBuilder();
        if (C123100dR.LIZ(this.LIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("] ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('[');
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append('.');
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append("] ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        for (String str : (ArrayList) this.LJFF) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('[');
            sbLIZ3.append(str);
            sbLIZ3.append("] ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        sb.append("{ ");
        if (!((ArrayList) this.LJ).isEmpty()) {
            sb.append(C13LP.LJJLIIIJ(this.LJ, ";", null, null, 0, null, null, 62));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // X.InterfaceC954910axN
    public final void d() {
        C20441214yg.LIZIZ("RevenueInteraction", LJIIZILJ());
    }

    @Override // X.InterfaceC954910axN
    public final void LIZIZ(Function1 function1) {
        this.LIZIZ = "event_tracking";
        LJIIJ("event_tracking");
        function1.invoke(this);
        C20441214yg.LJIIIZ("RevenueInteraction", LJIIZILJ());
    }

    @Override // X.InterfaceC954910axN
    public final InterfaceC954910axN LJFF(InterfaceC954180awC interfaceC954180awC) {
        InterfaceC964790bDJ interfaceC964790bDJ;
        if (interfaceC954180awC != null) {
            List<LinkUser> listLJI = C948780anU.LJI(interfaceC954180awC);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
            for (LinkUser linkUser : listLJI) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{uid=");
                sbLIZ.append(linkUser.userId);
                sbLIZ.append(",linkmicId=");
                sbLIZ.append(linkUser.linkMicId);
                sbLIZ.append("},user_type=");
                sbLIZ.append(linkUser.linkUserType);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            List<LinkUser> listLJFF = C948780anU.LJFF(interfaceC954180awC);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
            for (LinkUser linkUser2 : listLJFF) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("{uid=");
                sbLIZ2.append(linkUser2.userId);
                sbLIZ2.append(",linkmicId=");
                sbLIZ2.append(linkUser2.linkMicId);
                sbLIZ2.append('}');
                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ2));
            }
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awC.LLIIJLIL();
            Object layoutId = null;
            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC964790bDJ) && (interfaceC964790bDJ = (InterfaceC964790bDJ) interfaceC937900aVwLLIIJLIL) != null) {
                layoutId = interfaceC964790bDJ.getLayoutId();
            }
            LJIILIIL(layoutId, "layout_id");
            LJIILIIL(arrayList, "linked_hosts");
            LJIILIIL(arrayList2, "linked_guests");
        }
        return this;
    }

    @Override // X.InterfaceC954910axN
    public final InterfaceC954910axN LJIIIIZZ(String str) {
        this.LIZJ = str;
        return this;
    }

    @Override // X.InterfaceC954910axN
    public final InterfaceC954910axN LJIIIZ(String str) {
        this.LIZLLL = str;
        return this;
    }

    @Override // X.InterfaceC954910axN
    public final InterfaceC954910axN LJIIJ(String... strArr) {
        C19719612Di.LJJII(this.LJFF, strArr);
        return this;
    }

    @Override // X.InterfaceC954910axN
    public final void LJIILJJIL(IMessage iMessage) {
        LJIIJJI(iMessage, null);
    }

    @Override // X.InterfaceC954910axN
    public final InterfaceC954910axN LJIILL(InterfaceC954180awC interfaceC954180awC) {
        if (interfaceC954180awC != null) {
            LJIILIIL(Integer.valueOf(interfaceC954180awC.scene()), Scene.SCENE_SERVICE);
            LJIILIIL(Integer.valueOf(interfaceC954180awC.LJJLIIIJLJLI()), "linker_mode");
            LJIILIIL(interfaceC954180awC.U3(), "channel_id");
            LJIILIIL(interfaceC954180awC.LLJJ().LJJJJLI(), "group_channel_id");
        }
        return this;
    }

    @Override // X.InterfaceC954910axN
    public final void d(String str) {
        LJII(str, null);
    }

    @Override // X.InterfaceC954910axN
    public final void LIZJ(Throwable th, Function1<? super InterfaceC954910axN, Unit> function1) {
        this.LIZIZ = "network_request_fail";
        LJIIJ("network");
        if (function1 != null) {
            function1.invoke(this);
        }
        C20441214yg.LJFF("RevenueInteraction", LJIIZILJ(), th);
    }

    @Override // X.InterfaceC954910axN
    public final void LJI(BaseResponse<?, ?> baseResponse, Function1<? super InterfaceC954910axN, Unit> function1) {
        Object obj;
        C1494850p0F c1494850p0F;
        URL url;
        String path;
        this.LIZIZ = "network_request_success";
        if (baseResponse != null && (c1494850p0F = baseResponse.LIZ) != null && (url = c1494850p0F.LJIIZILJ) != null && (path = url.getPath()) != null && path.length() > 0) {
            LJIILIIL(path, "end_point");
        }
        LJIIJ("network");
        if (function1 != null) {
            function1.invoke(this);
        }
        if (baseResponse != null) {
            obj = baseResponse.LIZIZ;
        } else {
            obj = null;
        }
        LJIILIIL(obj, "log_id");
        C20441214yg.LJIIIZ("RevenueInteraction", LJIIZILJ());
    }

    @Override // X.InterfaceC954910axN
    public final void LJII(String str, C958570b3H c958570b3H) {
        this.LIZIZ = str;
        this.LIZLLL = str;
        if (c958570b3H != null) {
            c958570b3H.invoke(this);
        }
        d();
    }

    @Override // X.InterfaceC954910axN
    public final void LJIIJJI(IMessage iMessage, AFwS250S0000000_15 aFwS250S0000000_15) {
        if (!(iMessage instanceof AbstractC1136060ffY)) {
            return;
        }
        this.LIZIZ = "network_im";
        LJIIJ("network_im");
        AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) iMessage;
        LJIILIIL(abstractC1136060ffY.getMessageType(), "message_type");
        LJIILIIL(abstractC1136060ffY.getMethodName(), "method_name");
        LJIILIIL(Long.valueOf(abstractC1136060ffY.getMessageId()), "message_id");
        if (aFwS250S0000000_15 != null) {
            aFwS250S0000000_15.invoke(this);
        }
        C20441214yg.LJIIIZ("RevenueInteraction", LJIIZILJ());
    }

    @Override // X.InterfaceC954910axN
    public final InterfaceC954910axN LJIILIIL(Object obj, String str) {
        List<String> list = this.LJ;
        if (obj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('=');
            sbLIZ.append(obj);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        ((ArrayList) list).add(str);
        return this;
    }

    @Override // X.InterfaceC954910axN
    public final void LJIILLIIL(String str, Function1<? super InterfaceC954910axN, Unit> function1) {
        LIZLLL(str, str, function1);
    }

    public C958800b3e(String str, String str2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = null;
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
    }

    @Override // X.InterfaceC954910axN
    public final void LIZLLL(String str, String str2, Function1<? super InterfaceC954910axN, Unit> function1) {
        this.LIZIZ = str;
        this.LIZLLL = str2;
        if (function1 != null) {
            function1.invoke(this);
        }
        C20441214yg.LJIIIZ("RevenueInteraction", LJIIZILJ());
    }

    @Override // X.InterfaceC954910axN
    public final void LJIIL(String str, String str2, Throwable th, Function1<? super InterfaceC954910axN, Unit> function1) {
        this.LIZIZ = str;
        this.LIZLLL = str2;
        if (function1 != null) {
            function1.invoke(this);
        }
        C20441214yg.LJFF("RevenueInteraction", LJIIZILJ(), th);
    }
}
