package X;

import Y.AcS496S0100000_15;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ayo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955800ayo extends AbstractC936750aU5 {
    public static final /* synthetic */ int LIZJ = 0;
    public final C956000az8 LIZIZ;

    @Override // X.AbstractC936750aU5, X.InterfaceC943940afg
    public final String tag() {
        return "MultiCoHostExclusiveDialog";
    }

    @Override // X.InterfaceC943940afg
    public final void show() {
        LinkerInfo linkerInfo;
        List<UserInfo> list;
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(this.LIZIZ.LIZIZ.getButtonResId());
        c755620TkW.LIZJ = new AcS496S0100000_15(this, 78);
        C0TZ2 c0tz2 = new C0TZ2(c755620TkW);
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131851837);
        c755630TkX.LIZJ = new AcS496S0100000_15(this, 77);
        C0TZ3 c0tz3 = new C0TZ3(c755630TkX);
        C494720Jag c494720Jag = new C494720Jag();
        c494720Jag.LIZIZ = 2;
        c494720Jag.LIZ(c0tz2);
        c494720Jag.LIZ(c0tz3);
        C494730Jah c494730Jah = new C494730Jah(c494720Jag);
        C782110Um9 c782110Um9 = new C782110Um9(this.LIZIZ.LIZ);
        c782110Um9.LIZJ = C497740JfY.LJIJI(this.LIZIZ.LIZIZ.getTitleResId());
        c782110Um9.LJIIIZ(C497740JfY.LJIJI(this.LIZIZ.LIZIZ.getContentResId()));
        c782110Um9.LIZJ(c494730Jah);
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        String label = this.LIZIZ.LIZIZ.getLabel();
        HashMap map = new HashMap();
        map.put("withdraw_type", label);
        map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        if (Intrinsics.LJFF(label, EnumC955790ayn.APPLY_INVITE.getLabel()) || Intrinsics.LJFF(label, EnumC955790ayn.APPLY_PAIR.getLabel())) {
            Room roomLJJIFFI = C915980Zwa.LJI().LIZ().LJJIFFI();
            Long lValueOf = roomLJJIFFI != null ? Long.valueOf(roomLJJIFFI.getOwnerUserId()) : null;
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(lValueOf);
            RivalExtraInfo rivalExtraInfoLJJIII = C915980Zwa.LJI().LIZ().LJJIII();
            if (rivalExtraInfoLJJIII != null && (linkerInfo = rivalExtraInfoLJJIII.linkerInfo) != null && (list = linkerInfo.linkedUsers) != null) {
                ArrayList arrayList = new ArrayList();
                for (UserInfo userInfo : list) {
                    long j = userInfo.user_id;
                    if (lValueOf == null || j != lValueOf.longValue()) {
                        arrayList.add(userInfo);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    listLJIILJJIL.add(Long.valueOf(((UserInfo) it2.next()).user_id));
                }
            }
            map.put("uid_list", listLJIILJJIL.toString());
        } else {
            C955400ayA.LJIILJJIL(map);
        }
        C955400ayA.LJIIJ(map, false);
        C955400ayA.LLIILII("livesdk_connection_switch_popup_show", map);
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LIZ = liveDialogLIZ;
        C786410Ut5.B4(liveDialogLIZ);
    }

    public C955800ayo(C956000az8 c956000az8) {
        this.LIZIZ = c956000az8;
    }
}
