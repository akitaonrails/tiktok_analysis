package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.FeedbackPage;
import com.bytedance.pipo.verify.base.model.RegexCheck;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.component.components.countrylist.MusCountryListSheetFragment;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.view.bizum.BizumPhoneInputBottomSheetFragment;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditAssem;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM;
import com.ss.android.ugc.aweme.publish.detail.EffectPublishNameAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.id.IDVerifyAssem;
import com.ss.android.ugc.aweme.verify.id.IDVerifyVM;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS112S0110000_26;
import kotlin.jvm.internal.AwS55S1000000_4;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0wJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775980wJg implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$10(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$11(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$12(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$13(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$10(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$11(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$12(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$13(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$7(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$8(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$9(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
            case 7:
                afterTextChanged$7(this, editable);
                break;
            case 8:
                afterTextChanged$8(this, editable);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                afterTextChanged$9(this, editable);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                afterTextChanged$10(this, editable);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                afterTextChanged$11(this, editable);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                afterTextChanged$12(this, editable);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                afterTextChanged$13(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                beforeTextChanged$9(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                beforeTextChanged$10(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                beforeTextChanged$11(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                beforeTextChanged$12(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                beforeTextChanged$13(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onTextChanged$9(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onTextChanged$10(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onTextChanged$11(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onTextChanged$12(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onTextChanged$13(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C1775980wJg(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C1775980wJg c1775980wJg, Editable editable) throws Throwable {
        ((C1748440vbG) c1775980wJg.l0).LJIIJJI();
    }

    public static final void afterTextChanged$1(C1775980wJg c1775980wJg, Editable editable) throws Throwable {
        C1748470vbJ c1748470vbJ = (C1748470vbJ) c1775980wJg.l0;
        if (c1748470vbJ.LLIZ) {
            c1748470vbJ.LJIIJJI();
        }
        ((C1748470vbJ) c1775980wJg.l0).LIZ();
    }

    public static final void afterTextChanged$10(C1775980wJg c1775980wJg, Editable editable) {
        ((C1735760vGo) c1775980wJg.l0).LJIIIIZZ();
        ((C1735760vGo) c1775980wJg.l0).LJIIJ();
        ((C1735760vGo) c1775980wJg.l0).LJIIJJI();
    }

    public static final void afterTextChanged$11(C1775980wJg c1775980wJg, Editable editable) {
        new C1722380uvE((C1722370uvD) ((MusCountryListSheetFragment) c1775980wJg.l0).SR().getAdapter()).filter(String.valueOf(editable));
    }

    public static final void afterTextChanged$12(C1775980wJg c1775980wJg, Editable editable) {
        String lowerCase = C2204961BRm.LLJILLL(((MusCountryListActivity) c1775980wJg.l0).LLILZIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpHJ2SBKxWLnFR5JWK42m+0VcdmO0LFixFJqKJ3EX54NmGV3", null)).toString().toLowerCase(Locale.getDefault());
        ((MusCountryListActivity) c1775980wJg.l0).LLILLL.clear();
        if (lowerCase.isEmpty()) {
            MusCountryListActivity musCountryListActivity = (MusCountryListActivity) c1775980wJg.l0;
            musCountryListActivity.LLILLL.addAll(musCountryListActivity.LLILZ);
        } else {
            for (Country country : ((MusCountryListActivity) c1775980wJg.l0).LLILZ) {
                if (country.name.toLowerCase(Locale.getDefault()).contains(lowerCase) || country.name.toLowerCase(Locale.getDefault()).contains(lowerCase)) {
                    Iterator<Country> it2 = ((MusCountryListActivity) c1775980wJg.l0).LLILLL.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().name.equals(country.name)) {
                                break;
                            }
                        } else {
                            ((MusCountryListActivity) c1775980wJg.l0).LLILLL.add(country);
                            break;
                        }
                    }
                }
            }
        }
        ((MusCountryListActivity) c1775980wJg.l0).LLIZLLLIL.notifyDataSetChanged();
    }

    public static final void afterTextChanged$13(C1775980wJg c1775980wJg, Editable editable) {
        ((BizumPhoneInputBottomSheetFragment) c1775980wJg.l0).MR();
    }

    public static final void afterTextChanged$2(C1775980wJg c1775980wJg, Editable editable) {
        PhoneNumberVM phoneNumberVMSo = ((PhoneNumberAssem) c1775980wJg.l0).So();
        if (!Intrinsics.LJFF(String.valueOf(editable), phoneNumberVMSo.LLJI)) {
            phoneNumberVMSo.LLJ = false;
        }
    }

    public static final void afterTextChanged$3(C1775980wJg c1775980wJg, Editable editable) {
        EffectEditVM effectEditVMUp = ((EffectEditAssem) c1775980wJg.l0).up();
        String strValueOf = String.valueOf(editable);
        effectEditVMUp.getClass();
        effectEditVMUp.setState(new AwS55S1000000_4(strValueOf, 1));
    }

    public static final void afterTextChanged$4(C1775980wJg c1775980wJg, Editable editable) {
        EffectEditV2VM effectEditV2VMMp = ((EffectEditV2Assem) c1775980wJg.l0).mp();
        String strValueOf = String.valueOf(editable);
        effectEditV2VMMp.getClass();
        effectEditV2VMMp.setState(new AwS76S1000000_26(strValueOf, 13));
    }

    public static final void afterTextChanged$5(C1775980wJg c1775980wJg, Editable editable) {
        String str;
        String str2;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("effect_publish_name_char_limit_hint", true)) {
            EffectPublishNameAssem effectPublishNameAssem = (EffectPublishNameAssem) c1775980wJg.l0;
            if (effectPublishNameAssem.LLJJJ) {
                return;
            }
            if (editable != null) {
                if (editable.length() > 25) {
                    effectPublishNameAssem.LLJJJ = true;
                    editable.delete(25, editable.length());
                    C1748440vbG c1748440vbG = effectPublishNameAssem.LLJJIJI;
                    if (c1748440vbG != null) {
                        c1748440vbG.LLJLILLLLZIIL.setText(editable.toString());
                    }
                    C1748440vbG c1748440vbG2 = effectPublishNameAssem.LLJJIJI;
                    if (c1748440vbG2 != null) {
                        c1748440vbG2.setSelection(editable.length());
                    }
                    effectPublishNameAssem.hp(true);
                    effectPublishNameAssem.LLJJJ = false;
                } else {
                    effectPublishNameAssem.hp(false);
                }
            }
        }
        AssemVMLazy assemVMLazy = ((EffectPublishNameAssem) c1775980wJg.l0).LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EffectPublishNameAssem.LLJJJJ;
        assemVMLazy.getValue().setState(new AwS55S1000000_4(String.valueOf(editable), 1));
        EffectEditVM effectEditVM = (EffectEditVM) ((EffectPublishNameAssem) c1775980wJg.l0).LLJJIJIL.getValue();
        String strValueOf = String.valueOf(editable);
        ArrayList arrayList = new ArrayList();
        if (C1735870vGz.LIZ(strValueOf)) {
            arrayList.add(1);
        }
        if (strValueOf.length() >= 25) {
            arrayList.add(3);
        }
        if (C1735870vGz.LIZIZ(strValueOf)) {
            arrayList.add(2);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        MobileEffectData mobileEffectDataYQ2 = effectEditVM.yQ2();
        if (mobileEffectDataYQ2 != null) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            String str3 = "";
            if (strLJJLIIIJ == null) {
                strLJJLIIIJ = "";
            }
            if (zIsEmpty) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("if_success", str);
            c0lab.LJ("error_code", strLJJLIIIJ);
            c0lab.LJ("creation_id", mobileEffectDataYQ2.creationId);
            c0lab.LJ("enter_from", mobileEffectDataYQ2.shootPageEnterFrom);
            c0lab.LJ("shoot_way", mobileEffectDataYQ2.shootWay);
            EffectPackageDataWrapper effectPackageDataWrapper = mobileEffectDataYQ2.publishData;
            if (effectPackageDataWrapper != null && (str2 = effectPackageDataWrapper.enterFrom) != null) {
                str3 = str2;
            }
            c0lab.LJ("ame_enter_from", str3);
            C1737910vKH.LIZ("ame_effect_name_check", c0lab.LIZ);
        }
    }

    public static final void afterTextChanged$6(C1775980wJg c1775980wJg, Editable editable) {
        if (editable != null && editable.length() == 0) {
            ((IDVerifyAssem) c1775980wJg.l0).Oo().setEnabled(false);
        }
        String str = ((IDVerifyAssem) c1775980wJg.l0).So().getState().LLILZ;
        if (str != null && str.length() > 0) {
            IDVerifyVM iDVerifyVMSo = ((IDVerifyAssem) c1775980wJg.l0).So();
            iDVerifyVMSo.withState(new AwS112S0110000_26(iDVerifyVMSo, true, 12));
        }
    }

    public static final void afterTextChanged$7(C1775980wJg c1775980wJg, Editable editable) {
        if (!TextUtils.isEmpty(editable)) {
            ((FeedbackPage) c1775980wJg.l0).LLJ = String.valueOf(editable);
        }
    }

    public static final void afterTextChanged$8(C1775980wJg c1775980wJg, Editable editable) {
        Function0<Unit> function0 = ((C1727920v4A) c1775980wJg.l0).LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void afterTextChanged$9(C1775980wJg c1775980wJg, Editable editable) throws Throwable {
        ((C1749260vca) c1775980wJg.l0).LIZIZ();
    }

    public static final void beforeTextChanged$2(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
        PhoneNumberVM phoneNumberVMSo = ((PhoneNumberAssem) c1775980wJg.l0).So();
        phoneNumberVMSo.withState(new AwS112S0110000_26(phoneNumberVMSo, true, 10));
    }

    public static final void beforeTextChanged$6(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && charSequence.length() == 0) {
            IDVerifyVM iDVerifyVMSo = ((IDVerifyAssem) c1775980wJg.l0).So();
            iDVerifyVMSo.withState(new AwS112S0110000_26(iDVerifyVMSo, true, 12));
        }
    }

    public static final void onTextChanged$2(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
        boolean zGo;
        C197039127h c197039127hLo = ((PhoneNumberAssem) c1775980wJg.l0).Lo();
        boolean z = true;
        if (charSequence != null && charSequence.length() != 0) {
            PhoneNumberAssem phoneNumberAssem = (PhoneNumberAssem) c1775980wJg.l0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((PhoneNumberAssem) c1775980wJg.l0).So().LLILZIL);
            sbLIZ.append('-');
            sbLIZ.append((Object) charSequence);
            zGo = phoneNumberAssem.Go(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            zGo = false;
        }
        c197039127hLo.setEnabled(zGo);
        if (charSequence == null) {
            ((PhoneNumberAssem) c1775980wJg.l0).So().LLIZLLLIL = false;
            return;
        }
        PhoneNumberVM phoneNumberVMSo = ((PhoneNumberAssem) c1775980wJg.l0).So();
        if (charSequence.length() <= 0) {
            z = false;
        }
        phoneNumberVMSo.LLIZLLLIL = z;
    }

    public static final void onTextChanged$6(C1775980wJg c1775980wJg, CharSequence charSequence, int i, int i2, int i3) {
        int length;
        boolean z;
        VerifyInfo verifyInfoLJIIIZ;
        VerifyDetail verifyDetail;
        List<RegexCheck> list;
        if (charSequence != null) {
            length = charSequence.length();
        } else {
            length = 0;
        }
        boolean z2 = true;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C1748440vbG c1748440vbGLo = ((IDVerifyAssem) c1775980wJg.l0).Lo();
        if (c1748440vbGLo != null) {
            c1748440vbGLo.LJIILLIIL(z);
        }
        C1713570uh1 c1713570uh1 = ((IDVerifyAssem) c1775980wJg.l0).Jo().LL;
        if (c1713570uh1 != null && (verifyInfoLJIIIZ = c1713570uh1.LJIIIZ()) != null && (verifyDetail = verifyInfoLJIIIZ.verifyDetail) != null && (list = verifyDetail.regexCheck) != null) {
            Iterator<RegexCheck> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().regex;
                if (str != null && !new Regex(str).matches(String.valueOf(charSequence))) {
                    z2 = false;
                }
            }
        }
        ((IDVerifyAssem) c1775980wJg.l0).Oo().setEnabled(z2);
    }
}
