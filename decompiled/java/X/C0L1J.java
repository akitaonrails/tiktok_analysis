package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0L1J, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L1J {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(0, 3, 52, 55, 40, 4);
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(10, 14);
    public static final List<Integer> LIZJ = Collections.singletonList(43);

    public static final String LIZ(int i, String str) {
        if (C123100dR.LIZ(str)) {
            return str;
        }
        if (LIZ.contains(Integer.valueOf(i))) {
            return C0L9O.VIDEO_SHOOT_PAGE.getValue();
        }
        if (LIZIZ.contains(Integer.valueOf(i))) {
            return C0L9O.VIDEO_EDIT_PAGE.getValue();
        }
        if (LIZJ.contains(Integer.valueOf(i))) {
            return C0L9O.VIDEO_POST_PAGE.getValue();
        }
        if (i == 65) {
            return EnumC538190L8v.CREATE_VIDEO.getValue();
        }
        return "";
    }

    public static final String LIZIZ(int i, String str) {
        if (str.length() > 0) {
            return str;
        }
        if (i != 0) {
            if (i != 10) {
                if (i != 14) {
                    if (i != 43) {
                        if (i != 48) {
                            if (i != 52) {
                                if (i != 55) {
                                    if (i != 65) {
                                        if (i != 3 && i != 4) {
                                            if (i != 39) {
                                                if (i != 40) {
                                                    return "";
                                                }
                                            } else {
                                                return EnumC538190L8v.ADD_PHOTO.getValue();
                                            }
                                        } else {
                                            return EnumC538190L8v.PROP_UPLOAD.getValue();
                                        }
                                    } else {
                                        return EnumC538190L8v.CREATE_VIDEO.getValue();
                                    }
                                } else {
                                    return EnumC538190L8v.LAYOUT_CELL.getValue();
                                }
                            }
                            return EnumC538190L8v.CREATE_TAB.getValue();
                        }
                        return EnumC538190L8v.REPLACE_PHOTO.getValue();
                    }
                    return EnumC538190L8v.CHANGE_COVER.getValue();
                }
                return EnumC538190L8v.EP_UPLOAD.getValue();
            }
            return EnumC538190L8v.STICKER_UPLOAD.getValue();
        }
        return EnumC538190L8v.SHOOT_PAGE.getValue();
    }
}
