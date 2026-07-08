package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelIcon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21375518kz {
    public static final int LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;

    static {
        int iIntValue = ((Number) C268810AgB.LIZ.getValue()).intValue();
        LIZ = iIntValue;
        LIZIZ = iIntValue == 3;
        LIZJ = iIntValue == 3;
    }

    public static C426370Gnj LIZ(List list, EnumC21376018l4 enumC21376018l4) {
        int iLIZIZ;
        Image image;
        Image image2;
        C21376318l7 c21376318l7;
        CustomColor customColor;
        CustomColor customColor2;
        Image image3;
        Image image4;
        Image image5;
        Image image6;
        CustomColor customColor3;
        CustomColor customColor4;
        Icon iconLIZIZ;
        CustomColor customColor5;
        CustomColor customColor6;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PromotionLabel promotionLabel = (PromotionLabel) it2.next();
            int i = promotionLabel.type;
            String str = "";
            if (i != 8) {
                if (i != 104) {
                    LabelIcon labelIcon = promotionLabel.icon;
                    if (labelIcon != null) {
                        iconLIZIZ = LIZIZ(labelIcon.lightIcon, labelIcon.darkIcon);
                    } else {
                        iconLIZIZ = null;
                    }
                    String str2 = promotionLabel.text;
                    if (str2 != null) {
                        str = str2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (iconLIZIZ != null) {
                        arrayList2.add(new C21375618l0(EnumC1779610wPX.TAG_ICON, new C21375418ky(enumC21376018l4, iconLIZIZ), LIZJ, false, 0, 24));
                    }
                    arrayList2.add(new C21375618l0(EnumC1779610wPX.TAG_TEXT, new C21375918l3(enumC21376018l4, str, new CustomColor("#FFFFCDCE", "#FFE10543")), LIZJ, false, 0, 24));
                    List listSingletonList = Collections.singletonList(new C21376418l8(arrayList2));
                    int i2 = LIZ;
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            customColor5 = new CustomColor("#57FE2C55", "#1FFE2C55");
                        } else {
                            customColor5 = new CustomColor("#00000000", "#00000000");
                        }
                    } else {
                        customColor5 = new CustomColor("#47FE2C55", "#1FFE2C55");
                    }
                    if (i2 == 2) {
                        customColor6 = new CustomColor("#1FFFB7C5", "#1AE10543");
                    } else {
                        customColor6 = null;
                    }
                    c21376318l7 = new C21376318l7(listSingletonList, enumC21376018l4, null, null, customColor5, customColor6, 12);
                } else {
                    int i3 = LIZ;
                    if (i3 > 0) {
                        LabelIcon labelIcon2 = promotionLabel.icon;
                        if (labelIcon2 != null) {
                            image5 = labelIcon2.lightIcon;
                            image6 = labelIcon2.darkIcon;
                        } else {
                            image5 = null;
                            image6 = null;
                        }
                        Icon iconLIZIZ2 = LIZIZ(image5, image6);
                        String str3 = promotionLabel.text;
                        if (str3 != null) {
                            str = str3;
                        }
                        EnumC1779610wPX enumC1779610wPX = EnumC1779610wPX.TAG_ICON;
                        C21375418ky c21375418ky = new C21375418ky(enumC21376018l4, iconLIZIZ2);
                        boolean z = LIZJ;
                        List listSingletonList2 = Collections.singletonList(new C21376418l8(C1697810uHb.LJIIJJI(new C21375618l0(enumC1779610wPX, c21375418ky, z, false, 0, 24), new C21375618l0(EnumC1779610wPX.TAG_TEXT, new C21375918l3(enumC21376018l4, str, new CustomColor("#FFF3E0C0", "#FF895109")), z, false, 0, 24))));
                        if (i3 == 1) {
                            customColor3 = new CustomColor("#1FCB670B", "#4DCB670B");
                        } else {
                            customColor3 = new CustomColor("#00000000", "#00000000");
                        }
                        if (i3 == 2) {
                            customColor4 = new CustomColor("#26F4E8C6", "#26895109");
                        } else {
                            customColor4 = null;
                        }
                        c21376318l7 = new C21376318l7(listSingletonList2, enumC21376018l4, null, null, customColor3, customColor4);
                    } else {
                        LabelIcon labelIcon3 = promotionLabel.icon;
                        if (labelIcon3 != null) {
                            image3 = labelIcon3.lightIcon;
                            image4 = labelIcon3.darkIcon;
                        } else {
                            image3 = null;
                            image4 = null;
                        }
                        Icon iconLIZIZ3 = LIZIZ(image3, image4);
                        String str4 = promotionLabel.text;
                        if (str4 != null) {
                            str = str4;
                        }
                        c21376318l7 = new C21376318l7(Collections.singletonList(new C21376418l8(C1697810uHb.LJIIJJI(new C21375618l0(EnumC1779610wPX.TAG_TILE_IMAGE, new C21375318kx(enumC21376018l4, iconLIZIZ3), true, false, 0, 24), new C21375618l0(EnumC1779610wPX.TAG_TEXT, new C21375918l3(enumC21376018l4, str, new CustomColor("#FFE4B284", "#FF895109")), false, true, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-3)), 4)))), enumC21376018l4, new CustomColor("#FF744C21", "#FFFFF0D5"), new CustomColor("#FF41260B", "#FFFFE3B9"), null, null, 48);
                    }
                }
            } else {
                LabelIcon labelIcon4 = promotionLabel.icon;
                if (labelIcon4 != null) {
                    image = labelIcon4.lightIcon;
                    image2 = labelIcon4.darkIcon;
                } else {
                    image = null;
                    image2 = null;
                }
                Icon iconLIZIZ4 = LIZIZ(image, image2);
                String str5 = promotionLabel.text;
                if (str5 != null) {
                    str = str5;
                }
                CustomColor customColor7 = new CustomColor("#FFA8E7E7", "#FF007B7B");
                EnumC1779610wPX enumC1779610wPX2 = EnumC1779610wPX.TAG_ICON;
                C21375418ky c21375418ky2 = new C21375418ky(enumC21376018l4, iconLIZIZ4);
                boolean z2 = LIZJ;
                List listSingletonList3 = Collections.singletonList(new C21376418l8(C1697810uHb.LJIIJJI(new C21375618l0(enumC1779610wPX2, c21375418ky2, z2, false, 0, 24), new C21375618l0(EnumC1779610wPX.TAG_TEXT, new C21375918l3(enumC21376018l4, str, customColor7), z2, false, 0, 24))));
                int i4 = LIZ;
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3) {
                        customColor = new CustomColor("#5700B8B9", "#1F00B8B9");
                    } else {
                        customColor = new CustomColor("#00000000", "#00000000");
                    }
                } else {
                    customColor = new CustomColor("#5700B8B9", "#1F00B8B9");
                }
                if (i4 == 2) {
                    customColor2 = new CustomColor("#24A8E7E7", "#24007B7B");
                } else {
                    customColor2 = null;
                }
                c21376318l7 = new C21376318l7(listSingletonList3, enumC21376018l4, null, null, customColor, customColor2, 12);
            }
            arrayList.add(c21376318l7);
        }
        if (LIZ == 3) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        } else {
            iLIZIZ = C426370Gnj.LIZLLL;
        }
        return new C426370Gnj(arrayList, iLIZIZ, LIZJ);
    }

    public static Icon LIZIZ(Image image, Image image2) {
        return new Icon(image, image2, null, null, null, null, null, null, null);
    }
}
