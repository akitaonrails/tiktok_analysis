package Y;

import X.C1344030l4z;
import X.C1370970lmR;
import X.C13LP;
import X.C1C7U;
import X.C2188811AlT;
import X.C2208181Bbc;
import X.InterfaceC1361990lXx;
import X.InterfaceC1362600lYw;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS25S1200000_21 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String strLIZIZ;
        HashMap<String, String> map = new HashMap<>();
        map.put("share_platform", "chat");
        List list = (List) this.l1;
        if (list != null) {
            for (IMContact iMContact : (ArrayList) C13LP.LJJJJLI(list)) {
                if (!(iMContact instanceof IMUser)) {
                    map.put("share_platform", "chat_merge");
                }
                ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
                if (contactFeatureLIZ == null || (strLIZIZ = contactFeatureLIZ.LJIIIZ(iMContact)) == null) {
                    strLIZIZ = "";
                }
                String strValueOf = String.valueOf(iMContact.displayPosition);
                IInternalShareApi.LIZ.getClass();
                String strLJIL = C1370970lmR.LIZ().LIZJ().LJIL(iMContact, "");
                if (strLJIL.length() == 0) {
                    strLJIL = "-1";
                }
                String strValueOf2 = iMContact instanceof IMUser ? String.valueOf(((IMUser) iMContact).getFollowStatus()) : "-1";
                String str = map.get("to_user_id");
                if (!(str == null || str.length() == 0)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(',');
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                map.put("to_user_id", strLIZIZ);
                String str2 = map.get("rank_index");
                if (str2 != null && str2.length() != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append(',');
                    sbLIZ2.append(strValueOf);
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
                }
                map.put("rank_index", strValueOf);
                String str3 = map.get("share_relation_type");
                if (str3 != null && str3.length() != 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str3);
                    sbLIZ3.append(',');
                    sbLIZ3.append(strLJIL);
                    strLJIL = C2188811AlT.LIZIZ(sbLIZ3);
                }
                map.put("share_relation_type", strLJIL);
                String str4 = map.get("share_follow_status");
                if (str4 != null && str4.length() != 0) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str4);
                    sbLIZ4.append(',');
                    sbLIZ4.append(strValueOf2);
                    strValueOf2 = C2188811AlT.LIZIZ(sbLIZ4);
                }
                map.put("share_follow_status", strValueOf2);
            }
        }
        String str5 = this.s0;
        map.put("panel_source", str5 != null ? str5 : "");
        ((InterfaceC1361990lXx) this.l2).LIZIZ(map);
    }

    public final void LIZ$1() {
        String strLIZIZ;
        IMUser iMUser;
        String string;
        HashMap<String, String> map = new HashMap<>();
        map.put("share_platform", "chat");
        for (IMContact iMContact : (List) this.l1) {
            if (!(iMContact instanceof IMUser)) {
                map.put("share_platform", "chat_merge");
            }
            ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
            if (contactFeatureLIZ == null || (strLIZIZ = contactFeatureLIZ.LJIIIZ(iMContact)) == null) {
                strLIZIZ = "";
            }
            String strValueOf = String.valueOf(iMContact.displayPosition);
            IInternalShareApi.LIZ.getClass();
            String strLJIL = C1370970lmR.LIZ().LIZJ().LJIL(iMContact, "");
            if (!(strLJIL.length() > 0)) {
                strLJIL = null;
            }
            String strLIZIZ2 = "-1";
            if (strLJIL == null) {
                strLJIL = "-1";
            }
            if ((iMContact instanceof IMUser) && (iMUser = (IMUser) iMContact) != null && (string = Integer.valueOf(iMUser.getFollowStatus()).toString()) != null) {
                strLIZIZ2 = string;
            }
            String str = map.get("to_user_id");
            if (!(str == null || str.length() == 0)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(map.get("to_user_id"));
                sbLIZ.append(',');
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            map.put("to_user_id", strLIZIZ);
            String str2 = map.get("rank_index");
            if (str2 != null && str2.length() != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(map.get("rank_index"));
                sbLIZ2.append(',');
                sbLIZ2.append(strValueOf);
                strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
            }
            map.put("rank_index", strValueOf);
            String str3 = map.get("share_relation_type");
            if (str3 != null && str3.length() != 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(map.get("share_relation_type"));
                sbLIZ3.append(',');
                sbLIZ3.append(strLJIL);
                strLJIL = C2188811AlT.LIZIZ(sbLIZ3);
            }
            map.put("share_relation_type", strLJIL);
            String str4 = map.get("share_follow_status");
            if (str4 != null && str4.length() != 0) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(map.get("share_follow_status"));
                sbLIZ4.append(',');
                sbLIZ4.append(strLIZIZ2);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            }
            map.put("share_follow_status", strLIZIZ2);
        }
        String str5 = CardStruct.IStatusCode.DEFAULT;
        map.put("is_picture_share", CardStruct.IStatusCode.DEFAULT);
        String str6 = this.s0;
        if (str6 != null && str6.length() > 0) {
            str5 = "1";
        }
        map.put("is_with_message", str5);
        map.put("panel_source", "shot_in_app");
        InterfaceC1362600lYw interfaceC1362600lYw = (InterfaceC1362600lYw) this.l2;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LIZIZ(map);
        }
    }

    public static final void run$0(ARunnableS25S1200000_21 aRunnableS25S1200000_21) {
        boolean zLIZ;
        C1C7U.LIZ("ShareHelper@c333.onShareV2$1");
        try {
            aRunnableS25S1200000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareHelper@c333.onShareV2$1");
    }

    public static final void run$1(ARunnableS25S1200000_21 aRunnableS25S1200000_21) {
        boolean zLIZ;
        C1C7U.LIZ("ShareMessageCompatHelper@9a73.sendLiveShareV2$1");
        try {
            aRunnableS25S1200000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareMessageCompatHelper@9a73.sendLiveShareV2$1");
    }

    public static final void run$2(ARunnableS25S1200000_21 aRunnableS25S1200000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentImageUploadController@efe6.startLivePhotoWatchdog$runnable$1");
        try {
            if (((C2208181Bbc) aRunnableS25S1200000_21.l1).LJ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("live photo upload watchdog timeout, msg: ");
                sbLIZ.append(aRunnableS25S1200000_21.s0);
                C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
                ((Function0) aRunnableS25S1200000_21.l2).invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentImageUploadController@efe6.startLivePhotoWatchdog$runnable$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS25S1200000_21(Object obj, List<? extends IMContact> list, String str, InterfaceC1361990lXx interfaceC1361990lXx) {
        this.$t = interfaceC1361990lXx;
        this.l1 = obj;
        this.s0 = list;
        this.l2 = str;
    }
}
