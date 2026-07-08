package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.18Tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21291518Tx implements InterfaceC528120KnS {
    public static final C21291518Tx LIZ = new C21291518Tx();

    @Override // X.InterfaceC528120KnS
    public final String LIZ() {
        return LJ(EnumC21291418Tw.FUNCTION_NAME_IN_EDITOR_TAB, new Object[0]);
    }

    @Override // X.InterfaceC528120KnS
    public final String LIZIZ() {
        return LJ(EnumC21291418Tw.ANCHOR_GENERATE_BUTTON_TEXT, new Object[0]);
    }

    @Override // X.InterfaceC528120KnS
    public final String LIZJ() {
        return LJ(EnumC21291418Tw.PRIVACY_POST_ANCHOR_DISCLAIMER_HINT, new Object[0]);
    }

    public static String LJFF(Integer num) {
        int iIntValue;
        C21291618Ty c21291618Ty = EnumC21291418Tw.Companion;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2131825606;
        }
        c21291618Ty.getClass();
        return LJ(C21291618Ty.LIZ(iIntValue), new Object[0]);
    }

    @Override // X.InterfaceC528120KnS
    public final String LIZLLL(boolean z) {
        EnumC21291418Tw enumC21291418Tw;
        if (z) {
            enumC21291418Tw = EnumC21291418Tw.ALBUM_SELECT_IMAGE_PROMPT_HINT_SINGLE;
        } else {
            enumC21291418Tw = EnumC21291418Tw.ALBUM_SELECT_IMAGE_PROMPT_HINT_MULTI;
        }
        return LJ(enumC21291418Tw, new Object[0]);
    }

    public static String LJ(EnumC21291418Tw enumC21291418Tw, Object... objArr) {
        return C555520LqY.LIZ(C0C9P.AI_IMAGINE, enumC21291418Tw.getResId(), enumC21291418Tw.getLibraKey(), Arrays.copyOf(objArr, objArr.length));
    }
}
