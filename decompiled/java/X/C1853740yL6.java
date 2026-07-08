package X;

/* JADX INFO: renamed from: X.0yL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853740yL6 {
    public static final int LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return 5;
            }
            if (num.intValue() == 2) {
                return 6;
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Integer LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -684497878:
                if (!str.equals("image_2_image")) {
                    return null;
                }
                return 1;
            case -672608438:
                if (!str.equals("image_2_video")) {
                    return null;
                }
                return 2;
            case 1975979516:
                if (!str.equals("text_2_image")) {
                    return null;
                }
                return 1;
            case 1987868956:
                if (!str.equals("text_2_video")) {
                    return null;
                }
                return 2;
            default:
                return null;
        }
    }

    public static final String LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() != 1 && num.intValue() != 4) {
                if (num.intValue() != 2 && num.intValue() != 5) {
                    if (num.intValue() == 3) {
                        return "text_generation";
                    }
                    return null;
                }
                return "video_generation";
            }
            return "image_generation";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r1.equals("image_2_image") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r1.equals("text_2_image") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        return X.EnumC1854550yMP.EDIT_IMAGE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r1.equals("image_2_video") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r1.equals("text_2_video") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        return X.EnumC1854550yMP.IMAGE_TO_VIDEO;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC1854550yMP LIZLLL(X.C1853460yKe r1) {
        /*
            if (r1 == 0) goto Lf
            java.lang.String r1 = r1.getTaskType()
            if (r1 == 0) goto Lf
            int r0 = r1.hashCode()
            switch(r0) {
                case -684497878: goto L12;
                case -672608438: goto L26;
                case 1975979516: goto L1b;
                case 1987868956: goto L2f;
                default: goto Lf;
            }
        Lf:
            X.0yMP r0 = X.EnumC1854550yMP.NONE
            return r0
        L12:
            java.lang.String r0 = "image_2_image"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            goto Lf
        L1b:
            java.lang.String r0 = "text_2_image"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
        L23:
            X.0yMP r0 = X.EnumC1854550yMP.EDIT_IMAGE
            return r0
        L26:
            java.lang.String r0 = "image_2_video"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L38
            goto Lf
        L2f:
            java.lang.String r0 = "text_2_video"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L38
            goto Lf
        L38:
            X.0yMP r0 = X.EnumC1854550yMP.IMAGE_TO_VIDEO
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1853740yL6.LIZLLL(X.0yKe):X.0yMP");
    }

    public static final String LJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "image_2_image";
            }
            if (num.intValue() == 2) {
                return "image_2_video";
            }
            if (num.intValue() == 3) {
                return "text_2_text";
            }
            if (num.intValue() == 4) {
                return "text_2_image";
            }
            if (num.intValue() == 5) {
                return "text_2_video";
            }
            return null;
        }
        return null;
    }

    public static final String LJFF(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "image_2_image";
            }
            if (num.intValue() == 2) {
                return "image_2_video";
            }
            return null;
        }
        return null;
    }
}
