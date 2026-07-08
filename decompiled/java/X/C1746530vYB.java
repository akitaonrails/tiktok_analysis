package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AEPOptimizeConfig;

/* JADX INFO: renamed from: X.0vYB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746530vYB {
    public static final boolean LIZ = ((AEPOptimizeConfig) C1747560vZq.LIZIZ.getValue()).enableCache;
    public static final C04F7 LIZIZ = new C098K<String, C1747600vZu>() { // from class: X.04F7
    };

    public static void LIZ(String str, InputItemData inputItemData) {
        ClientConfig clientConfig;
        if (!LIZ) {
            return;
        }
        C1746550vYD.LIZ.getClass();
        String strLIZ = C1746550vYD.LIZ(str);
        ClientConfig clientConfig2 = inputItemData.config;
        if (clientConfig2 != null) {
            clientConfig = new ClientConfig(clientConfig2.enableDistrictTab, clientConfig2.enableNewUi, clientConfig2.singleStageSelectorKeys, clientConfig2.disableRegionCodeChange, clientConfig2.phonePrefixCheckCountry, null, clientConfig2.addressDistrictLength, clientConfig2.addressDistrictInCompleteError, clientConfig2.enableConcatenateAddressCheck, clientConfig2.concatenateAddressRule, clientConfig2.concatenateAddressError, clientConfig2.concatenateAddressKeys, clientConfig2.concatenateAddressErrorStarlingKey, clientConfig2.concatenateNameError, clientConfig2.concatenateNameRule, clientConfig2.concatenateNameKeys, clientConfig2.concatenateNameErrorStarlingKey, clientConfig2.singleLineNameKeys, clientConfig2.districtsConcatenateKeys, clientConfig2.enableSingleLineRegion, clientConfig2.enableDistrictReverseOrder, clientConfig2.numberKeyboardKeys, clientConfig2.enableDefocusCandidateKeys, clientConfig2.enableFocusCandidateKeys, clientConfig2.enableEditCandidateKeys, clientConfig2.disableCandidateKeys, clientConfig2.disableCheckKeys, clientConfig2.geoItemKeys, clientConfig2.districtItemKeys, clientConfig2._prefetchCandidateKeys, clientConfig2.snStreetNumberRule, clientConfig2.normalizedSnStreetNumber, clientConfig2.geoAssociatedValidationItemKeys, clientConfig2.separatorForDistricts, clientConfig2.uiStyle, clientConfig2.showLocationPermissionPopup, clientConfig2.authRequiredForLocationUseBar, clientConfig2._ignoreKeysWhenSave, clientConfig2._searchConcatenateKeys, clientConfig2._foldItemKeys, clientConfig2.recAddrUnRewriteItems, clientConfig2.needPreVerifyItems, clientConfig2.autoRecommendZipcodeByDistrictList);
        } else {
            clientConfig = null;
        }
        InputItemData inputItemData2 = new InputItemData(inputItemData.inputItems, inputItemData.regionInfo, clientConfig, inputItemData.privacyPolicyStatement, inputItemData.addressLocation, inputItemData.addressRight, inputItemData.deliveryInstruction, inputItemData.regionSelections, inputItemData.title, inputItemData.topText, inputItemData.enablePromotionPopup, inputItemData.address, inputItemData.pudoAddressModule, inputItemData.locationUseBar, inputItemData.noticeBubble);
        C1747600vZu c1747600vZu = new C1747600vZu(inputItemData2);
        if (!C756302xN.LIZ(inputItemData2.inputItems)) {
            return;
        }
        LIZIZ.LIZJ(strLIZ, c1747600vZu);
    }
}
