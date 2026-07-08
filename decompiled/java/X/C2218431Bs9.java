package X;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS160S0400000_34;
import kotlin.jvm.internal.AwS435S0200000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bs9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218431Bs9 {
    public final Context LIZ;
    public final C2218501BsG LIZIZ;
    public final C1075050e59 LIZJ;
    public final Function1<String, String> LIZLLL;

    /* JADX WARN: Type inference failed for: r0v49, types: [X.1BsB] */
    public final List<C1075020e56> LIZ() {
        Cert certFindCert;
        Cursor cursorLIZ;
        final C2218471BsD c2218471BsD = new C2218471BsD();
        C1075050e59 c1075050e59 = this.LIZJ;
        c1075050e59.getClass();
        Integer num = (Integer) ((LinkedHashMap) C1074230e3p.LIZ).get(c1075050e59.LIZ);
        int iIntValue = num != null ? num.intValue() : 1;
        if (iIntValue == 0) {
            int i = C1074250e3r.LIZ[c1075050e59.LIZ.ordinal()];
            certFindCert = i != 1 ? i != 5 ? i != 6 ? i != 7 ? i != 8 ? i != 15 ? i != 16 ? CertProviderManagerKt.findCert("bpea-contact_reader_find_friends_positive", 1476431889) : CertProviderManagerKt.findCert("bpea-contact_reader_other_following_list_positive", 1476431879) : CertProviderManagerKt.findCert("bpea-contact_reader_self_profile_positive", 1476431876) : CertProviderManagerKt.findCert("bpea-contact_reader_friends_tab_positive", 1476431881) : CertProviderManagerKt.findCert("bpea-contact_reader_following_list_positive", 1476431880) : CertProviderManagerKt.findCert("bpea-contact_reader_user_profile_positive", 1476431877) : CertProviderManagerKt.findCert("bpea-contact_inbox_positive", 1476431878) : CertProviderManagerKt.findCert("bpea-contact_reader_find_friends_positive", 1476431889);
        } else if (iIntValue == 1) {
            switch (C1074250e3r.LIZ[c1075050e59.LIZ.ordinal()]) {
                case 1:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_find_friends", 1476431889);
                    break;
                case 2:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_sign_up", 1476431874);
                    break;
                case 3:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_login", 1476431875);
                    break;
                case 4:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_new_version", 1476431885);
                    break;
                case 5:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_inbox", 1476431878);
                    break;
                case 6:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_user_profile", 1476431877);
                    break;
                case 7:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_following_list", 1476431880);
                    break;
                case 8:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_friends_tab", 1476431881);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_invite_panel", 1476431890);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_setting_privacy", 1476431887);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_suggest_account", 1476431886);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_homepage_follow", 1476431884);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_homepage_hot", 1476431882);
                    break;
                case 14:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_cold_start", 1476431873);
                    break;
                case 15:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_self_profile", 1476431876);
                    break;
                case 16:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_other_following_list", 1476431879);
                    break;
                default:
                    certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_find_friends", 1476431889);
                    break;
            }
        } else {
            int i2 = C1074250e3r.LIZ[c1075050e59.LIZ.ordinal()];
            if (i2 == 12) {
                certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_homepage_follow_only_read", 1476431884);
            } else if (i2 == 13) {
                certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_homepage_hot_only_read", 1476431882);
            } else if (i2 == 15) {
                certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_self_profile_only_read", 1476431876);
            } else if (i2 != 16) {
                switch (i2) {
                    case 1:
                        certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_find_friends_only_read", 1476431889);
                        break;
                    case 2:
                        certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_sign_up_only_read", 1476431874);
                        break;
                    case 3:
                        certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_login_only_read", 1476431875);
                        break;
                    case 4:
                        certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_new_version_only_read", 1476431885);
                        break;
                    case 5:
                        certFindCert = CertProviderManagerKt.findCert("bpea-contact_inbox_only_read", 1476431878);
                        break;
                    case 6:
                        certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_user_profile_only_read", 1476431877);
                        break;
                    case 7:
                        certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_following_list_only_read", 1476431880);
                        break;
                    default:
                        certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_find_friends_only_read", 1476431889);
                        break;
                }
            } else {
                certFindCert = CertProviderManagerKt.findCert("bpea-contact_reader_other_following_list_only_read", 1476431879);
            }
        }
        String strCertToken = certFindCert.certToken();
        if (strCertToken != null) {
            this.LIZIZ.LJJIL = strCertToken;
        }
        try {
            cursorLIZ = C20145113s1.LIZ(this.LIZ.getContentResolver(), ContactsContract.Data.CONTENT_URI, certFindCert, new InterfaceC20145213s2<InterfaceC19865712o3, Cursor>() { // from class: X.1BsB
                @Override // X.InterfaceC20145213s2
                public final Object LIZ(C20145013s0 c20145013s0, JSONObject jSONObject) {
                    boolean zOptBoolean;
                    boolean zOptBoolean2;
                    boolean zOptBoolean3;
                    boolean zOptBoolean4;
                    boolean zOptBoolean5;
                    boolean zOptBoolean6;
                    boolean z = true;
                    if (jSONObject != null) {
                        boolean zOptBoolean7 = jSONObject.optBoolean("is_display_name", true);
                        zOptBoolean2 = jSONObject.optBoolean("is_phone_number", true);
                        zOptBoolean3 = jSONObject.optBoolean("is_photo_thumbnail", true);
                        zOptBoolean4 = jSONObject.optBoolean("is_email", true);
                        zOptBoolean5 = jSONObject.optBoolean("is_note", true);
                        zOptBoolean6 = jSONObject.optBoolean("is_birthday", true);
                        zOptBoolean = jSONObject.optBoolean("is_website", true);
                        z = zOptBoolean7;
                    } else {
                        zOptBoolean = true;
                        zOptBoolean2 = true;
                        zOptBoolean3 = true;
                        zOptBoolean4 = true;
                        zOptBoolean5 = true;
                        zOptBoolean6 = true;
                    }
                    C2218471BsD c2218471BsD2 = c2218471BsD;
                    c2218471BsD2.LIZ = z;
                    c2218471BsD2.LIZIZ = zOptBoolean2;
                    c2218471BsD2.LIZJ = zOptBoolean3;
                    c2218471BsD2.LIZLLL = zOptBoolean4;
                    c2218471BsD2.LJ = zOptBoolean5;
                    c2218471BsD2.LJFF = zOptBoolean6;
                    c2218471BsD2.LJI = zOptBoolean;
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL("contact_id", "mimetype");
                    if (z) {
                        listLJIILJJIL.add("display_name");
                    }
                    if (zOptBoolean2) {
                        listLJIILJJIL.add("data1");
                    }
                    if (zOptBoolean3) {
                        listLJIILJJIL.add("photo_thumb_uri");
                    }
                    if (zOptBoolean4 && C0BU9.LIZ()) {
                        listLJIILJJIL.add("data1");
                    }
                    if (zOptBoolean5) {
                        listLJIILJJIL.add("data1");
                    }
                    if (zOptBoolean6) {
                        listLJIILJJIL.add("data2");
                        listLJIILJJIL.add("data1");
                    }
                    if (zOptBoolean) {
                        listLJIILJJIL.add("data1");
                    }
                    listLJIILJJIL.add("starred");
                    listLJIILJJIL.add("custom_ringtone");
                    listLJIILJJIL.add("send_to_voicemail");
                    listLJIILJJIL.add("times_contacted");
                    if (C0BU9.LIZ()) {
                        return c20145013s0.LIZ(null, (String[]) listLJIILJJIL.toArray(new String[0]), null);
                    }
                    return c20145013s0.LIZ("has_phone_number=?", (String[]) listLJIILJJIL.toArray(new String[0]), new String[]{"1"});
                }
            });
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            C2338609Ei.LIZ.getClass();
            C2338609Ei.LIZ(209, null, null, "", "", "");
            cursorLIZ = null;
        }
        if (cursorLIZ == null || cursorLIZ.getCount() == 0) {
            C2338609Ei.LIZ.getClass();
            C2338609Ei.LIZ(200, null, null, "", "", "");
            if (cursorLIZ != null) {
                cursorLIZ.close();
            }
            return C13BV.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorLIZ.moveToNext()) {
            try {
                String string = cursorLIZ.getString(cursorLIZ.getColumnIndex("contact_id"));
                if (string != null) {
                    C2218461BsC c2218461BsC = (C2218461BsC) linkedHashMap.get(string);
                    if (c2218461BsC == null) {
                        c2218461BsC = new C2218461BsC(null);
                        linkedHashMap.put(string, c2218461BsC);
                    }
                    C2218501BsG c2218501BsG = this.LIZIZ;
                    AwS160S0400000_34 awS160S0400000_34 = new AwS160S0400000_34(this, cursorLIZ, c2218461BsC, c2218471BsD, 1);
                    c2218501BsG.getClass();
                    Pair pairLIZLLL = C2218501BsG.LIZLLL(awS160S0400000_34);
                    pairLIZLLL.getFirst();
                    c2218501BsG.LJIIIZ = ((Number) pairLIZLLL.getSecond()).longValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("normalized cost: ");
                    sbLIZ.append(c2218501BsG.LJIIIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                this.LIZIZ.LJIIZILJ++;
                C2338609Ei c2338609Ei = C2338609Ei.LIZ;
                String message = e2.getMessage();
                c2338609Ei.getClass();
                C2338609Ei.LIZ(205, message, null, "", "", "");
            }
        }
        cursorLIZ.close();
        this.LIZIZ.LJIJJLI = linkedHashMap.values().size();
        C2218501BsG c2218501BsG2 = this.LIZIZ;
        AwS435S0200000_34 awS435S0200000_34 = new AwS435S0200000_34((Map) linkedHashMap, (Map<String, C2218461BsC>) this, (C2218431Bs9) 30);
        c2218501BsG2.getClass();
        Pair pairLIZLLL2 = C2218501BsG.LIZLLL(awS435S0200000_34);
        Object first = pairLIZLLL2.getFirst();
        c2218501BsG2.LJIIJ = ((Number) pairLIZLLL2.getSecond()).longValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("parsed cost: ");
        sbLIZ2.append(c2218501BsG2.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ2);
        return (List) first;
    }

    public C2218431Bs9(C2218501BsG c2218501BsG, C1075050e59 c1075050e59) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C1056490dbD c1056490dbD = new C1056490dbD(C1726420v1k.LIZ);
        this.LIZ = contextLIZ;
        this.LIZIZ = c2218501BsG;
        this.LIZJ = c1075050e59;
        this.LIZLLL = c1056490dbD;
    }
}
