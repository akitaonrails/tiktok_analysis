package X;

import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;

/* JADX INFO: renamed from: X.0ibA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248660ibA {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC1247880iZu LIZ(C1248700ibE c1248700ibE) {
        Integer num;
        if (c1248700ibE != null) {
            ProfileUIData profileUIData = c1248700ibE.LIZJ;
            if (profileUIData == null || (num = profileUIData.type) == null) {
                num = c1248700ibE.LJIIIZ;
            }
        } else {
            num = null;
        }
        int type = EnumC1248260iaW.ICON.getType();
        if (num != null && num.intValue() == type) {
            return new C1248680ibC(c1248700ibE);
        }
        int type2 = EnumC1248260iaW.TEXT.getType();
        if (num != null && num.intValue() == type2) {
            return new C1248690ibD(c1248700ibE);
        }
        int type3 = EnumC1248260iaW.ICON_TEXT.getType();
        if (num == null || num.intValue() != type3) {
            return null;
        }
        return new C1248670ibB(c1248700ibE);
    }
}
