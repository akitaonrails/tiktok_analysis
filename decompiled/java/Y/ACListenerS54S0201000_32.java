package Y;

import X.C0IJT;
import X.C0WZX;
import X.C1161920gLG;
import X.C20441214yg;
import X.C21148517pT;
import X.C21148717pV;
import X.C21374218km;
import X.C21374318kn;
import X.C21383018mC;
import X.C21383318mF;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C474500IjA;
import X.C786410Ut5;
import X.InterfaceC21374418ko;
import X.InterfaceC331230Cyf;
import android.text.Editable;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class ACListenerS54S0201000_32 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS54S0201000_32 aCListenerS54S0201000_32, View view) throws Throwable {
        ((C21383018mC) aCListenerS54S0201000_32.l0).LLILLJJLI.z1(aCListenerS54S0201000_32.i2);
        Editable editableLLJILLL = C2204961BRm.LLJILLL(((C21383318mF) aCListenerS54S0201000_32.l1).LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6Zp7a0yCxoGMK+Gc17indfW/FOXw2uAU8eXbItoX+94DuXi8=", null));
        if (editableLLJILLL != null) {
            ((C21383318mF) aCListenerS54S0201000_32.l1).LL.setSelection(editableLLJILLL.toString().length());
        }
    }

    public static final void onClick$1(ACListenerS54S0201000_32 aCListenerS54S0201000_32, View view) {
        C786410Ut5.LJZI(8, ((C21383318mF) aCListenerS54S0201000_32.l0).LLILZIL);
        C786410Ut5.LLD(0, ((C21383318mF) aCListenerS54S0201000_32.l0).LLILZ);
        ((C21383318mF) aCListenerS54S0201000_32.l0).LLILZ.playAnimation();
        ((C21383018mC) aCListenerS54S0201000_32.l1).LLILLJJLI.y1(aCListenerS54S0201000_32.i2);
    }

    public static final void onClick$2(ACListenerS54S0201000_32 aCListenerS54S0201000_32, View view) {
        InterfaceC21374418ko interfaceC21374418ko;
        Room roomLJIIIIZZ;
        String string;
        C21374318kn c21374318kn = (C21374318kn) aCListenerS54S0201000_32.l0;
        int i = aCListenerS54S0201000_32.i2;
        C21148517pT c21148517pT = (C21148517pT) aCListenerS54S0201000_32.l1;
        c21374318kn.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderClick, position: ");
        sbLIZ.append(i);
        sbLIZ.append(", data: ");
        sbLIZ.append(c21148517pT);
        C20441214yg.LIZIZ("LiveViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC331230Cyf interfaceC331230CyfK31 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).K31();
        if (interfaceC331230CyfK31 != null) {
            interfaceC331230CyfK31.LIZ(c21374318kn.LL.LL, c21374318kn.itemView.getContext(), c21148517pT.LIZ, c21374318kn.LL.LLLFZ());
            C21148517pT c21148517pT2 = c21374318kn.LLILLJJLI;
            if (c21148517pT2 != null && (interfaceC21374418ko = c21148517pT2.LIZ) != null && (roomLJIIIIZZ = interfaceC21374418ko.LJIIIIZZ()) != null) {
                Map<String, String> logExtra = c21148517pT2.LIZ.getLogExtra();
                HashMap map = new HashMap();
                User owner = roomLJIIIIZZ.getOwner();
                String str = "";
                if (owner == null || (string = Long.valueOf(owner.getId()).toString()) == null) {
                    string = "";
                }
                map.put("anchor_id", string);
                map.put("room_id", String.valueOf(roomLJIIIIZZ.getId()));
                String str2 = logExtra.get("tag_name");
                if (str2 == null) {
                    str2 = "";
                }
                map.put("game_name", str2);
                map.put("page_type", "bottombar_feed");
                String str3 = logExtra.get("bottombar_content_type");
                if (str3 == null) {
                    str3 = "";
                }
                map.put("bottom_bar_type", str3);
                String str4 = logExtra.get("bottombar_content");
                if (str4 == null) {
                    str4 = "";
                }
                map.put("bottombar_content", str4);
                String str5 = logExtra.get("related_from_request_id");
                if (str5 == null) {
                    str5 = "";
                }
                map.put("related_from_request_id", str5);
                String str6 = logExtra.get("related_from_video_id");
                if (str6 != null) {
                    str = str6;
                }
                map.put("related_from_video_id", str);
                map.put("btn_name", "live_room");
                map.put("is_live", "1");
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bottombar_live_rec_click");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
            }
        }
    }

    public static final void onClick$3(ACListenerS54S0201000_32 aCListenerS54S0201000_32, View view) {
        ((C21374218km) aCListenerS54S0201000_32.l0).L5(aCListenerS54S0201000_32.i2, (C21148717pV) aCListenerS54S0201000_32.l1);
    }

    public static final void onClick$4(ACListenerS54S0201000_32 aCListenerS54S0201000_32, View view) {
        ((C21374218km) aCListenerS54S0201000_32.l0).L5(aCListenerS54S0201000_32.i2, (C21148717pV) aCListenerS54S0201000_32.l1);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS54S0201000_32(int r2, X.C21383318mF r3, X.C21383018mC r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.i2 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.i2 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS54S0201000_32.<init>(int, X.18mF, X.18mC, int):void");
    }

    public ACListenerS54S0201000_32(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
