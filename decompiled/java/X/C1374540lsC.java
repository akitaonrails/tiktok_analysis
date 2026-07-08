package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0lsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374540lsC {
    public static List LIZ() {
        return C349190DmX.LIZ.getValue();
    }

    public static void LIZIZ(C1371600lnS c1371600lnS, boolean z, final Activity activity, boolean z2, boolean z3) {
        String string;
        String str;
        Bundle bundle;
        InterfaceC1378050lxr interfaceC1378050lxr = new InterfaceC1378050lxr() { // from class: X.0lsK
            @Override // X.InterfaceC1378050lxr
            public final Activity get() {
                return activity;
            }
        };
        C1374660lsO.LIZ.getClass();
        ArrayList<String> arrayList = C1374660lsO.LIZJ;
        C1377070lwH c1377070lwH = new C1377070lwH(interfaceC1378050lxr, AFwS259S0000000_21.get$arr$(421));
        if (z2) {
            C1374800lsc.LIZ.getClass();
            C1374800lsc.LIZ("snapchat", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("instagram", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("instagram_story", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("whatsapp_status", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("facebook", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("facebook_lite", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("facebook_group", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("messenger", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("messenger_lite", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("sms", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("twitter", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("viber", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("vk", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("whatsapp", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("line", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("band", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("email", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("imgur", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("kakao_story", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("kakaotalk", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("zalo", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("telegram", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("reddit", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("discord", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("whatsapp_business", c1377070lwH, c1371600lnS);
            C1374800lsc.LIZ("google_messages", c1377070lwH, c1371600lnS);
            List<String> list = (List) C1374750lsX.LIZJ.getValue();
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (String str2 : list) {
                    C1374800lsc.LIZ.getClass();
                    arrayList2.add(Boolean.valueOf(C1374800lsc.LIZ(str2, c1377070lwH, c1371600lnS)));
                }
            }
        }
        BaseSharePackage baseSharePackage = c1371600lnS.LJJIIJ;
        if (baseSharePackage == null || (bundle = baseSharePackage.extras) == null || (string = bundle.getString("panel_source")) == null) {
            string = "share_panel";
        }
        c1371600lnS.LJJIIJZLJL = true;
        c1371600lnS.LJJIII = R.string.f1_;
        c1371600lnS.LJIIZILJ = true;
        c1371600lnS.LIZ(new C790120Uz4(string));
        BaseSharePackage baseSharePackage2 = c1371600lnS.LJJIIJ;
        if (baseSharePackage2 == null || (str = baseSharePackage2.itemType) == null) {
            str = "";
        }
        c1371600lnS.LJFF(new C1372180loO(str, 8));
        c1371600lnS.LJIL = new AwS635S0100000_21(arrayList, (ArrayList<String>) 177);
        if (z) {
            c1371600lnS.LIZLLL("instagram");
            c1371600lnS.LIZLLL("instagram_story");
            c1371600lnS.LIZLLL("snapchat");
            if (!((Boolean) C262460AQi.LIZ.getValue()).booleanValue()) {
                c1371600lnS.LIZLLL("whatsapp_status");
            }
        }
        if (z3) {
            c1371600lnS.LIZLLL("copy");
            c1371600lnS.LIZLLL("instagram_dm");
            c1371600lnS.LIZLLL("snapchat_chats");
        }
        if (z2) {
            if (!z) {
                c1371600lnS.LIZIZ(new CopyLinkChannel(false));
            }
            C1374800lsc.LIZ.getClass();
            C1374800lsc.LIZ("more", c1377070lwH, c1371600lnS);
        }
        C1369770lkV.LIZIZ(c1371600lnS);
        C1369770lkV.LJFF(c1371600lnS);
        C1369770lkV.LJI(c1371600lnS);
    }
}
