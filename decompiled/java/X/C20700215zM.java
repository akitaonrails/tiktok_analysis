package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.translation.service.IDefaultDNTController;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15zM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20700215zM implements IDefaultDNTController {
    public List<? extends ContentLanguage> LIZ;

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void clearDefaultDNTLangsAndSetHasUserManuallyModifiedDNTs() {
        Keva keva = C20700315zN.LIZ;
        Keva keva2 = C20700315zN.LIZ;
        keva2.storeString("key_default_dnt_lang", null);
        keva2.storeBoolean("key_has_user_manually_modified_dnt", true);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void clearHasShownDNTEditToastForLang() {
        Keva keva = C20700315zN.LIZ;
        C20700315zN.LIZ.storeStringArray("key_has_shown_edit_dnt_lang_code", new String[0]);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final List<ContentLanguage> getDoNotTranslateList() {
        if (this.LIZ == null) {
            ArrayList arrayList = null;
            String[] stringArray = C20700315zN.LIZ.getStringArray("key_all_dnt_languages", null);
            if (stringArray != null) {
                arrayList = new ArrayList();
                for (String str : stringArray) {
                    String str2 = (String) C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
                    String str3 = (String) C13LP.LJJJLZIJ(1, a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
                    if (str2 != null && str3 != null) {
                        ContentLanguage contentLanguage = new ContentLanguage();
                        contentLanguage.setLanguageCode(str2);
                        contentLanguage.setLocalName(str3);
                        arrayList.add(contentLanguage);
                    }
                }
            }
            this.LIZ = arrayList;
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final String[] getPredictedDNTLangs() {
        String[] stringArray;
        Keva keva = C20700315zN.LIZ;
        return (!C294270Bg9.LIZ() || (stringArray = C20700315zN.LIZ.getStringArray("key_predicted_dnt_langs", null)) == null) ? new String[0] : stringArray;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final boolean hasDismissedDNTNote() {
        Keva keva = C20700315zN.LIZ;
        return C20700315zN.LIZ.getBoolean("key_has_dismissed_dnt_note", false);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void markDismissedDNTNote() {
        Keva keva = C20700315zN.LIZ;
        C20700315zN.LIZ.storeBoolean("key_has_dismissed_dnt_note", true);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void resetDismissedDNTNoteCacheValue() {
        Keva keva = C20700315zN.LIZ;
        C20700315zN.LIZ.storeBoolean("key_has_dismissed_dnt_note", false);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final String[] getDefaultDNTLangs() {
        return C20700315zN.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final boolean getHasUserManuallyModifiedDNT() {
        return C20700315zN.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final String[] getSelectedDoNotTranslateLanguageCodes() {
        return C20700315zN.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void markShowEditDNTToastForLang(String str) {
        String[] strArr;
        Set set = (Set) C20700315zN.LIZLLL.getValue();
        if (set != null) {
            set.add(str);
        }
        Keva keva = C20700315zN.LIZ;
        if (set != null) {
            strArr = (String[]) set.toArray(new String[0]);
        } else {
            strArr = null;
        }
        keva.storeStringArray("key_has_shown_edit_dnt_lang_code", strArr);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void setDNTHasBeenManuallyModified(boolean z) {
        Keva keva = C20700315zN.LIZ;
        C20700315zN.LIZ.storeBoolean("key_has_user_manually_modified_dnt", z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void setDefaultDNTLangs(String[] strArr) {
        C20700315zN.LIZLLL(strArr);
        C20700315zN.LIZ.storeStringArray("key_default_dnt_lang", strArr);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void setDoNotTranslateList(List<? extends ContentLanguage> list) {
        List<? extends ContentLanguage> listLLIIII;
        if (list != null) {
            listLLIIII = C13LP.LLIIII(list);
        } else {
            listLLIIII = null;
        }
        this.LIZ = listLLIIII;
        if (list != null) {
            Keva keva = C20700315zN.LIZ;
            ArrayList<ContentLanguage> arrayList = new ArrayList();
            for (ContentLanguage contentLanguage : list) {
                String languageCode = contentLanguage.getLanguageCode();
                if (languageCode != null && languageCode.length() != 0) {
                    arrayList.add(contentLanguage);
                }
            }
            Keva keva2 = C20700315zN.LIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (ContentLanguage contentLanguage2 : arrayList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(contentLanguage2.getLanguageCode());
                sbLIZ.append(',');
                sbLIZ.append(contentLanguage2.getLocalName());
                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            keva2.storeStringArray("key_all_dnt_languages", (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void setPredictedDNTLangs(String[] strArr) {
        Keva keva = C20700315zN.LIZ;
        C20700315zN.LIZ.storeStringArray("key_predicted_dnt_langs", strArr);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void setSelectedDoNotTranslateLanguageCodes(String[] strArr) {
        C20700315zN.LIZ.storeStringArray("key_selected_do_not_translate_language_codes", strArr);
        if (C294270Bg9.LIZ()) {
            C20700315zN.LIZLLL(strArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final boolean shouldShowDNTToastForLang(String str) {
        String[] stringArray;
        Set set;
        if (C746760TRa.LIZ().LJLILLLLZI()) {
            Keva keva = C20700315zN.LIZ;
            if (C294270Bg9.LIZ() && (stringArray = C20700315zN.LIZ.getStringArray("key_predicted_dnt_langs", null)) != null && C13LQ.LJJIJIIJI(str, stringArray) >= 0 && !C20700315zN.LIZIZ() && ((set = (Set) C20700315zN.LIZLLL.getValue()) == null || !set.contains(str))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final String[] findRemovedLanguages(String[] strArr, String[] strArr2) {
        return (String[]) C13LP.LJLLLLLL(C13LQ.LJLIIL(strArr), C13LQ.LJLIIL(strArr2)).toArray(new String[0]);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void onPushSettingUpdated(List<? extends ContentLanguage> list, List<? extends ContentLanguage> list2, boolean z) {
        if (!C294270Bg9.LIZ()) {
            return;
        }
        ContentLanguage[] contentLanguageArrLIZ = C07MP.LIZ();
        ArrayList arrayList = new ArrayList(contentLanguageArrLIZ.length);
        for (ContentLanguage contentLanguage : contentLanguageArrLIZ) {
            arrayList.add(contentLanguage.getLanguageCode());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<? extends ContentLanguage> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().getLanguageCode());
            }
            if (arrayList3.contains(obj)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            C1839820xye.LIZ().LJIIIIZZ().setPredictedDNTLangs((String[]) arrayList2.toArray(new String[0]));
        }
        if (!z && !(!list.isEmpty())) {
            setDNTHasBeenManuallyModified(false);
            if (!arrayList.isEmpty()) {
                setDefaultDNTLangs((String[]) arrayList2.toArray(new String[0]));
                return;
            }
            return;
        }
        clearDefaultDNTLangsAndSetHasUserManuallyModifiedDNTs();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.IDefaultDNTController
    public final void showEditDNTBottomToast(final Aweme aweme, final Fragment fragment, final C19EG c19eg, String str, int i, final String str2) {
        String aid;
        C20703515zt.LIZ.getClass();
        String strLJII = C20703515zt.LJII(str);
        C1389910mGz c1389910mGz = new C1389910mGz(fragment);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZ.LIZIZ = 4;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_languages;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1389910mGz.LJIIL(c419910GdJ);
        c1389910mGz.LJIIJ(C786410Ut5.j4(C20642515q3.LJI(2131832337), Arrays.copyOf(new Object[]{strLJII}, 1)));
        c1389910mGz.LIZ.LIZLLL = 3;
        c1389910mGz.LIZ.LJ = new AwS583S0100000_4(fragment, 353);
        c1389910mGz.LIZIZ(i);
        c1389910mGz.LJIIIIZZ(true);
        c1389910mGz.LJII(false);
        c1389910mGz.LIZ.LJIIIIZZ = new View.OnClickListener() { // from class: X.15z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context = fragment.getContext();
                if (context != null) {
                    C20698615z6.LIZIZ.LIZ(aweme, context, null, c19eg, str2, "FEED_DNT_TOAST");
                }
            }
        };
        c1389910mGz.LJIIJJI();
        markShowEditDNTToastForLang(str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        String authorUid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        C20684815ws.LJIILLIIL("feed_dnt_toast_show", c2344009Gk.LIZ);
    }
}
