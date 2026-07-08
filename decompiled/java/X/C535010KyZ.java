package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigcAnchor;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

/* JADX INFO: renamed from: X.0KyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C535010KyZ implements InterfaceC524600Khm {
    @Override // X.InterfaceC524600Khm
    public final TikTokMediaModel LIZ(C535020Kya c535020Kya) {
        Integer num;
        Integer num2;
        String str;
        if (c535020Kya.LJIILL == 1) {
            return null;
        }
        int i = c535020Kya.LIZLLL;
        if (i != 1) {
            if (i == 2) {
                num = 4;
            }
            return null;
        }
        num = 1;
        if (num != null) {
            int iIntValue = num.intValue();
            int i2 = c535020Kya.LIZJ;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                num2 = 7;
                            }
                            return null;
                        }
                        num2 = 6;
                    } else {
                        num2 = 4;
                    }
                } else {
                    num2 = 2;
                }
            } else {
                num2 = 3;
            }
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                String str2 = c535020Kya.LJII;
                if (str2 == null || !C538760LBa.LIZ(str2)) {
                    return null;
                }
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("time=");
                sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(c535020Kya.LJIILJJIL)));
                sbLIZ.append(", content=");
                sbLIZ.append(c535020Kya);
                C201955140j.LIZLLL(c552700Lm0, "DefaultTikTokMediaModelResolver", C2188811AlT.LIZIZ(sbLIZ));
                TikTokMediaModel tikTokMediaModelLIZIZ = LIZIZ(c535020Kya.LIZ);
                tikTokMediaModelLIZIZ.width = c535020Kya.LJ;
                tikTokMediaModelLIZIZ.height = c535020Kya.LJFF;
                tikTokMediaModelLIZIZ.duration = c535020Kya.LJI;
                tikTokMediaModelLIZIZ.newFlag = c535020Kya.LJIIIZ;
                tikTokMediaModelLIZIZ.LJIILL(str2);
                tikTokMediaModelLIZIZ.type = iIntValue;
                tikTokMediaModelLIZIZ.subType = iIntValue2;
                tikTokMediaModelLIZIZ.isResized = true;
                long j = c535020Kya.LJIILJJIL;
                tikTokMediaModelLIZIZ.modify = j;
                tikTokMediaModelLIZIZ.date = j / 1000;
                int i3 = c535020Kya.LIZJ;
                if (i3 == 5) {
                    str = c535020Kya.LIZIZ;
                } else {
                    str = c535020Kya.LIZ;
                }
                Integer numValueOf = Integer.valueOf(i3);
                String str3 = c535020Kya.LJIIJ;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = c535020Kya.LJIIJJI;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = c535020Kya.LJIIL;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = c535020Kya.LJIILIIL;
                if (str7 != null) {
                    str4 = str7;
                }
                tikTokMediaModelLIZIZ.aigcInfo = new AIGCInfo(0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, Collections.singletonList(new AlbumAigc(str, numValueOf, new AlbumAigcAnchor(str3, str5, str6, str4))), false, 98303, null);
                return tikTokMediaModelLIZIZ;
            }
            return null;
        }
        return null;
    }

    public TikTokMediaModel LIZIZ(String str) {
        return new TikTokMediaModel(str, EnumC538220L8y.AI, 4);
    }
}
