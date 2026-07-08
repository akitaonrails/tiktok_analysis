package X;

import android.content.Context;
import android.graphics.PointF;
import androidx.compose.ui.focus.FocusTargetNode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19597811lw implements InterfaceC19632111rT {
    public final InterfaceC19598011ly LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ C705930RmZ LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ InterfaceC19632811ra LLILZLL;
    public final /* synthetic */ C11NJ LLIZ;

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        return false;
    }

    @Override // X.InterfaceC19632111rT
    public final boolean Qb(InteractStickerStruct interactStickerStruct) {
        return LIZ(interactStickerStruct, 0, "A");
    }

    @Override // X.InterfaceC19632111rT
    public final boolean U4(InteractStickerStruct interactStickerStruct) {
        return LIZ(interactStickerStruct, 1, "B");
    }

    @Override // X.InterfaceC19632111rT
    public final boolean Ll(long j, String str) {
        if (str == null) {
            return false;
        }
        C1440005kM.LIZ(new C739420SzU(str, j));
        return true;
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(final InteractStickerStruct interactStickerStruct, PointF pointF) {
        String str;
        String str2;
        String str3;
        String pollStickerId;
        InterfaceC19595111lV interfaceC19595111lV;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        if (!this.LLILLJJLI) {
            return false;
        }
        final C259800zU c259800zU = new C259800zU();
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19EG c19eg = this.LLILLL;
        int type = interactStickerStruct.getType();
        final Context context = this.LLILZIL;
        C19582711jV c19582711jV = new C19582711jV(type, pointF, new InterfaceC19583711jf() { // from class: X.11lx
            @Override // X.InterfaceC19583711jf
            public final List<InterfaceC450850Hm7> actions() {
                String string;
                Context context2 = context;
                if (context2 == null || (string = context2.getString(2131847256)) == null) {
                    string = "";
                }
                return Collections.singletonList(C19583611je.LIZ(string, new AwS273S0300000_29((C259800zU) c259800zU, (C259800zU<C0P0T>) this, (C19597811lw) interactStickerStruct, (InteractStickerStruct) 9)));
            }
        }, new AwS608S0100000_29(c259800zU, (C259800zU<FocusTargetNode>) 231));
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(138);
        c19582611jU.getClass();
        C19582611jU.LJFF(c19eg, c19582711jV, aFwS273S0000000_29);
        C705930RmZ c705930RmZ = this.LLILZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str4 = null;
        if (c705930RmZ != null && (c0r604 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r604.LIZLLL;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        if (c705930RmZ != null && (c0r603 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r603.LIZJ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str2);
        if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
            str3 = c0r602.LJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", str3);
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str4 = c0r60.LIZ;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        StickerAttrStruct stickerAttrStructLIZ = C19580611jA.LIZ(interactStickerStruct);
        if (stickerAttrStructLIZ == null || (pollStickerId = stickerAttrStructLIZ.getPollStickerId()) == null) {
            pollStickerId = "";
        }
        c2344009Gk.LJIIIIZZ("prop_id", pollStickerId);
        C20684815ws.LJIILLIIL("poll_prop_click", c2344009Gk.LIZ);
        C705930RmZ c705930RmZ2 = this.LLILZ;
        if (c705930RmZ2 != null && (interfaceC19595111lV = c705930RmZ2.LJIILIIL) != null) {
            interactStickerStruct.getType();
            interfaceC19595111lV.LIZIZ(true);
        }
        return true;
    }

    public final boolean LIZ(InteractStickerStruct interactStickerStruct, int i, String str) {
        Long lValueOf;
        long optionId;
        String str2;
        String str3;
        String str4;
        String pollStickerId;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        String str5;
        String str6;
        String str7;
        Long lValueOf2;
        PollStruct.OptionsBean optionsBean;
        long pollCount;
        PollStruct.OptionsBean optionsBean2;
        PollStruct.OptionsBean optionsBean3;
        PollStruct.OptionsBean optionsBean4;
        String str8;
        C0R60 c0r605;
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19EG c19eg = this.LLILLL;
        C705930RmZ c705930RmZ = this.LLILZ;
        c19582611jU.getClass();
        String str9 = "";
        String str10 = null;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (c705930RmZ == null || (c0r605 = c705930RmZ.LJIIZILJ) == null || (str8 = c0r605.LIZ) == null) {
                str8 = "";
            }
            C0XPD.LIZIZ(c19eg, str8, "", null, null);
            return false;
        }
        PollStruct pollStruct = interactStickerStruct.getPollStruct();
        if (pollStruct == null) {
            return false;
        }
        InterfaceC19598011ly interfaceC19598011ly = this.LL;
        Long lValueOf3 = Long.valueOf(pollStruct.getPollId());
        List<PollStruct.OptionsBean> options = pollStruct.getOptions();
        if (options != null && (optionsBean4 = (PollStruct.OptionsBean) C13LP.LJJJLZIJ(i, options)) != null) {
            lValueOf = Long.valueOf(optionsBean4.getOptionId());
        } else {
            lValueOf = null;
        }
        C11NJ c11nj = this.LLIZ;
        if (lValueOf != null && lValueOf3 != null) {
            interfaceC19598011ly.LIZ(lValueOf3.longValue(), lValueOf.longValue()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19775112Yr(c11nj, 2));
        }
        List<PollStruct.OptionsBean> options2 = pollStruct.getOptions();
        long j = 0;
        if (options2 != null && (optionsBean3 = (PollStruct.OptionsBean) C13LP.LJJJLZIJ(i, options2)) != null) {
            optionId = optionsBean3.getOptionId();
        } else {
            optionId = 0;
        }
        pollStruct.setSelectOptionId(optionId);
        List<PollStruct.OptionsBean> options3 = pollStruct.getOptions();
        if (options3 != null && (optionsBean = (PollStruct.OptionsBean) C13LP.LJJJLZIJ(i, options3)) != null) {
            List<PollStruct.OptionsBean> options4 = pollStruct.getOptions();
            if (options4 != null && (optionsBean2 = (PollStruct.OptionsBean) C13LP.LJJJLZIJ(i, options4)) != null) {
                pollCount = optionsBean2.getPollCount();
            } else {
                pollCount = 0;
            }
            optionsBean.setPollCount(pollCount + 1);
        }
        C19EG c19eg2 = this.LLILLL;
        C705930RmZ c705930RmZ2 = this.LLILZ;
        if (c705930RmZ2 != null && (str5 = c705930RmZ2.LJI) != null && str5.length() != 0) {
            if (c705930RmZ2 != null) {
                str6 = c705930RmZ2.LJI;
                str7 = c705930RmZ2.LJII;
                lValueOf2 = Long.valueOf(c705930RmZ2.LJIIIIZZ);
            } else {
                str6 = null;
                str7 = null;
                lValueOf2 = null;
            }
            String strValueOf = String.valueOf(lValueOf2);
            if (c705930RmZ2 != null) {
                j = c705930RmZ2.LJIIIZ;
            }
            if (str6 != null && str6.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ad vote click event : ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                JSONObject jSONObject = new JSONObject();
                try {
                    C1029590ctp.LIZLLL().LJIJI(c19eg2, str6, jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LIZ(e);
                }
                JSONObject jSONObject2 = (JSONObject) jSONObject.opt("ad_extra_data");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                try {
                    jSONObject2.put("poll_click_area", str);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2344809Gs.LIZ(e2);
                }
                C716820S9w.LIZIZ(c19eg2, "poll_sticker_click", str7, strValueOf, j, jSONObject);
            }
        }
        C19582611jU c19582611jU2 = C19582611jU.LIZ;
        C705930RmZ c705930RmZ3 = this.LLILZ;
        c19582611jU2.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c705930RmZ3 != null && (c0r604 = c705930RmZ3.LJIIZILJ) != null) {
            str2 = c0r604.LIZLLL;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        if (c705930RmZ3 != null && (c0r603 = c705930RmZ3.LJIIZILJ) != null) {
            str3 = c0r603.LIZJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        if (c705930RmZ3 != null && (c0r602 = c705930RmZ3.LJIIZILJ) != null) {
            str4 = c0r602.LJ;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", str4);
        if (c705930RmZ3 != null && (c0r60 = c705930RmZ3.LJIIZILJ) != null) {
            str10 = c0r60.LIZ;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str10);
        StickerAttrStruct stickerAttrStructLIZ = C19580611jA.LIZ(interactStickerStruct);
        if (stickerAttrStructLIZ != null && (pollStickerId = stickerAttrStructLIZ.getPollStickerId()) != null) {
            str9 = pollStickerId;
        }
        c2344009Gk.LJIIIIZZ("prop_id", str9);
        C20684815ws.LJIILLIIL("guest_poll_click", c2344009Gk.LIZ);
        return true;
    }

    public C19597811lw(boolean z, Context context, C705930RmZ c705930RmZ, C19EG c19eg, InterfaceC19632811ra interfaceC19632811ra, C11NJ c11nj) {
        this.LLILLJJLI = z;
        this.LLILLL = c19eg;
        this.LLILZ = c705930RmZ;
        this.LLILZIL = context;
        this.LLILZLL = interfaceC19632811ra;
        this.LLIZ = c11nj;
        InterfaceC19598011ly.LIZ.getClass();
        this.LL = (InterfaceC19598011ly) C19598111lz.LIZIZ.createNewRetrofit(Api.LIZ).create(InterfaceC19598011ly.class);
    }
}
