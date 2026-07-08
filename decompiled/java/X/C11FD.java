package X;

/* JADX INFO: renamed from: X.11FD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11FD {
    public static final int LIZ(C11FA c11fa, boolean z, boolean z2) {
        int position;
        switch (C11FB.LIZ[c11fa.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return c11fa.getPosition();
            case 4:
                if (C0A1V.LIZ(z2)) {
                    C1911780zqi.LIZ.getClass();
                    if (C1911780zqi.LIZ()) {
                        return 0;
                    }
                }
                return c11fa.getPosition();
            case 5:
                C11FE.LIZ.getClass();
                int iLIZ = C11FE.LIZ(z2);
                C1911780zqi.LIZ.getClass();
                if (C1911780zqi.LIZIZ(z2)) {
                    return iLIZ + 3;
                }
                return iLIZ + 2;
            case 6:
                C11FE.LIZ.getClass();
                int iLIZ2 = C11FE.LIZ(z2);
                if (z) {
                    C1911780zqi.LIZ.getClass();
                    if (C1911780zqi.LIZIZ(z2)) {
                        position = c11fa.getPosition();
                    } else {
                        return iLIZ2 + 3;
                    }
                } else {
                    position = c11fa.getPosition();
                }
                return position + iLIZ2;
            case 7:
                if (C0A1V.LIZ(z2)) {
                    C1911780zqi.LIZ.getClass();
                    if (C1911780zqi.LIZ()) {
                        return 1;
                    }
                }
                return c11fa.getPosition();
            default:
                throw new C1954807lC();
        }
    }

    public static final C11FA LIZIZ(int i, boolean z, boolean z2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return C11FA.DEFAULT;
                        }
                        if (!C0A1V.LIZ(z2) && C11FE.LIZIZ(z2)) {
                            C1911780zqi.LIZ.getClass();
                            if (!C1911780zqi.LIZ()) {
                                if (z) {
                                    if (C1911780zqi.LIZIZ(z2)) {
                                        return C11FA.TAB_TYPE_LOCAL;
                                    }
                                    return C11FA.TAB_TYPE_MORE;
                                }
                                return C11FA.DEFAULT;
                            }
                        }
                        return C11FA.DEFAULT;
                    }
                    if (!C0A1V.LIZ(z2) && C11FE.LIZIZ(z2)) {
                        if (z) {
                            C1911780zqi.LIZ.getClass();
                            if (C1911780zqi.LIZ()) {
                                return C11FA.TAB_TYPE_LOCAL;
                            }
                        }
                        return C11FA.TAB_TYPE_MORE;
                    }
                    if (z) {
                        if (C11FE.LIZIZ(z2) && C0A1V.LIZ(z2)) {
                            C1911780zqi.LIZ.getClass();
                            if (C1911780zqi.LIZ()) {
                                return C11FA.DEFAULT;
                            }
                        }
                        C1911780zqi.LIZ.getClass();
                        if (C1911780zqi.LIZIZ(z2)) {
                            return C11FA.TAB_TYPE_LOCAL;
                        }
                        return C11FA.TAB_TYPE_MORE;
                    }
                    return C11FA.DEFAULT;
                }
                if (C11FE.LIZIZ(z2)) {
                    if (C0A1V.LIZ(z2)) {
                        C1911780zqi.LIZ.getClass();
                        if (C1911780zqi.LIZ()) {
                            if (z) {
                                return C11FA.TAB_TYPE_LOCAL;
                            }
                            return C11FA.DEFAULT;
                        }
                    }
                    return C11FA.TAB_TYPE_UNLIMITED_MUSIC;
                }
                C1911780zqi.LIZ.getClass();
                if (C1911780zqi.LIZIZ(z2)) {
                    return C11FA.TAB_TYPE_MORE;
                }
                if (z) {
                    return C11FA.TAB_TYPE_LOCAL;
                }
                if (C1911780zqi.LIZJ(z2)) {
                    return C11FA.TAB_TYPE_MORE;
                }
                return C11FA.DEFAULT;
            }
            if (C0A1V.LIZ(z2)) {
                C1911780zqi.LIZ.getClass();
                if (C1911780zqi.LIZ() && C11FE.LIZIZ(z2)) {
                    return C11FA.TAB_TYPE_UNLIMITED_MUSIC;
                }
            }
            return C11FA.TAB_TYPE_COLLECT;
        }
        if (C1911780zqi.LIZJ(z2)) {
            return C11FA.TAB_TYPE_FOR_YOU;
        }
        if (C0A1V.LIZ(z2)) {
            C1911780zqi.LIZ.getClass();
            if (C1911780zqi.LIZ()) {
                return C11FA.TAB_TYPE_COLLECT;
            }
        }
        return C11FA.TAB_TYPE_DISCOVER;
    }
}
