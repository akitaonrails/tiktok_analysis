package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898730ZNn {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZLLL(boolean z) {
        String string;
        String string2;
        boolean z2;
        String str = null;
        try {
            if (z) {
                string = C2213981Bky.LIZIZ.getApplicationContext().getResources().getQuantityString(2131755381, 2);
            } else {
                string = C2213981Bky.LIZIZ.getApplicationContext().getString(2131835972);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            string = null;
        }
        if (string != null && (string2 = a0.LJLIIIL(string).toString()) != null) {
            if (string2.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str = string2;
            }
        }
        if (str == null) {
            if (z) {
                return "[Photos]";
            }
            return "[Video]";
        }
        return str;
    }

    public static C050R LIZ(C869590Y9l c869590Y9l, String str) {
        AwemeCardTemplate awemeCardTemplate;
        boolean z;
        boolean z2;
        String string;
        String strLIZIZ;
        boolean z3;
        boolean z4;
        String strLIZJ;
        String str2;
        String string2;
        String str3;
        if (C0ZDX.LJJJJIZL(c869590Y9l) || c869590Y9l.getMsgType() != 1809) {
            return null;
        }
        String scene = c869590Y9l.getScene();
        if (Intrinsics.LJFF(scene, EnumC896390ZEn.STORY.getScene()) || Intrinsics.LJFF(scene, EnumC896390ZEn.HIGHLIGHT_STORY.getScene()) || Intrinsics.LJFF(scene, EnumC896390ZEn.HIGHLIGHT_STORY_COLLECTION.getScene()) || Intrinsics.LJFF(scene, EnumC896390ZEn.TEXT_MODE.getScene())) {
            return null;
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "share_im_inapp_share_inbox_preview_components", true);
        EnumC898750ZNp.Companion.getClass();
        EnumC898750ZNp enumC898750ZNp = EnumC898750ZNp.V1;
        if (iLJIJ != enumC898750ZNp.getLibraValue()) {
            enumC898750ZNp = EnumC898750ZNp.V2;
            if (iLJIJ != enumC898750ZNp.getLibraValue()) {
                enumC898750ZNp = EnumC898750ZNp.V3;
                if (iLJIJ != enumC898750ZNp.getLibraValue()) {
                    enumC898750ZNp = EnumC898750ZNp.V4;
                    if (iLJIJ != enumC898750ZNp.getLibraValue()) {
                        enumC898750ZNp = EnumC898750ZNp.CONTROL;
                    }
                }
            }
        }
        if (enumC898750ZNp == EnumC898750ZNp.CONTROL || (awemeCardTemplate = (AwemeCardTemplate) C0Z2Z.LIZ(c869590Y9l, AwemeCardTemplate.class)) == null) {
            return null;
        }
        if (c869590Y9l.getConversationType() == AbstractC1711506n3.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJFF = Intrinsics.LJFF(c869590Y9l.getScene(), EnumC896390ZEn.PHOTO_MODE.getScene());
        if (C2242711CqD.LIZIZ(awemeCardTemplate.fallbackInfo) == null && !C2242571Cpz.LIZ(awemeCardTemplate)) {
            z2 = false;
        } else {
            z2 = true;
        }
        TextComponent textComponent = awemeCardTemplate.baseUserComponent.nickname;
        if (textComponent != null && (str3 = textComponent.text) != null) {
            string = a0.LJLIIIL(str3).toString();
        } else {
            string = null;
        }
        String str4 = "";
        if (string == null) {
            string = "";
        }
        TextComponent textComponent2 = awemeCardTemplate.baseUserComponent.description;
        if (textComponent2 != null && (str2 = textComponent2.text) != null && (string2 = a0.LJLIIIL(str2).toString()) != null) {
            str4 = string2;
        }
        String string3 = a0.LJLIIIL(str).toString();
        int i = C898740ZNo.LIZ[enumC898750ZNp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return null;
                        }
                        throw new C1954807lC();
                    }
                    if (z2) {
                        return null;
                    }
                    if (string3.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (string.length() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                        if (z4) {
                            return null;
                        }
                        strLIZJ = LIZJ(string, zLJFF);
                    } else {
                        if (z4) {
                            return null;
                        }
                        if (z) {
                            strLIZJ = LIZIZ(zLJFF, 2131835977, 2131755386, new String[]{string3, string});
                        } else {
                            strLIZJ = LIZJ(string, zLJFF);
                        }
                    }
                    if (strLIZJ == null || strLIZJ.length() == 0) {
                        return null;
                    }
                    return new C050R(strLIZJ);
                }
                if (z2 || str4.length() == 0) {
                    return null;
                }
                if (z && string3.length() > 0) {
                    strLIZIZ = LIZIZ(zLJFF, 2131835975, 2131755384, new String[]{string3, str4});
                } else {
                    strLIZIZ = LIZIZ(zLJFF, 2131835976, 2131755385, new String[]{str4});
                }
                if (strLIZIZ == null) {
                    return null;
                }
                return new C050R(strLIZIZ);
            }
            if (!z2 && string.length() != 0) {
                if (str4.length() == 0) {
                    String strLIZJ2 = LIZJ(string, zLJFF);
                    if (strLIZJ2 == null) {
                        return null;
                    }
                    return new C050R(strLIZJ2);
                }
                String strLIZIZ2 = LIZIZ(zLJFF, 2131835974, 2131755383, new String[]{string, str4});
                if (strLIZIZ2 == null) {
                    return null;
                }
                return new C050R(strLIZIZ2);
            }
            return new C050R(LIZLLL(zLJFF));
        }
        if (!z2 && str4.length() != 0) {
            String strLIZIZ3 = LIZIZ(zLJFF, 2131835973, 2131755382, new String[]{str4});
            if (strLIZIZ3 == null) {
                return null;
            }
            return new C050R(strLIZIZ3);
        }
        return new C050R(LIZLLL(zLJFF));
    }

    public static String LIZJ(String str, boolean z) {
        return LIZIZ(z, 2131835978, 2131755387, new String[]{str});
    }

    public static String LIZIZ(boolean z, int i, int i2, Object[] objArr) {
        boolean z2;
        if (!z) {
            try {
                if (objArr.length != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return C2213981Bky.LIZIZ.getApplicationContext().getString(i);
                }
                return C2213981Bky.LIZIZ.getApplicationContext().getString(i, Arrays.copyOf(objArr, objArr.length));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        try {
            return C2213981Bky.LIZIZ.getApplicationContext().getResources().getQuantityString(i2, 2, Arrays.copyOf(objArr, objArr.length));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
