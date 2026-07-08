package X;

import android.view.KeyEvent;

/* JADX INFO: renamed from: X.1ERp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2281431ERp {
    public static final C2281401ERm LIZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1ERl] */
    static {
        final C20098113kR c20098113kR = C20098113kR.LL;
        LIZ = new C2281401ERm(new InterfaceC1694760uCg() { // from class: X.1ERl
            @Override // X.InterfaceC1694760uCg
            public final EnumC2281371ERj LIZ(KeyEvent keyEvent) {
                if (c20098113kR.invoke(new C1209870hab(keyEvent)).booleanValue() && keyEvent.isShiftPressed()) {
                    if (C20069013fk.LIZ(C634390OuT.LIZ(keyEvent.getKeyCode()), C2281411ERn.LJI)) {
                        return EnumC2281371ERj.REDO;
                    }
                    return null;
                }
                if (c20098113kR.invoke(new C1209870hab(keyEvent)).booleanValue()) {
                    long jLIZ = C634390OuT.LIZ(keyEvent.getKeyCode());
                    if (!C20069013fk.LIZ(jLIZ, C2281411ERn.LIZIZ) && !C20069013fk.LIZ(jLIZ, C2281411ERn.LJIILLIIL)) {
                        if (C20069013fk.LIZ(jLIZ, C2281411ERn.LIZLLL)) {
                            return EnumC2281371ERj.PASTE;
                        }
                        if (C20069013fk.LIZ(jLIZ, C2281411ERn.LJFF)) {
                            return EnumC2281371ERj.CUT;
                        }
                        if (C20069013fk.LIZ(jLIZ, C2281411ERn.LIZ)) {
                            return EnumC2281371ERj.SELECT_ALL;
                        }
                        if (C20069013fk.LIZ(jLIZ, C2281411ERn.LJ)) {
                            return EnumC2281371ERj.REDO;
                        }
                        if (C20069013fk.LIZ(jLIZ, C2281411ERn.LJI)) {
                            return EnumC2281371ERj.UNDO;
                        }
                        return null;
                    }
                    return EnumC2281371ERj.COPY;
                }
                if (!keyEvent.isCtrlPressed()) {
                    if (keyEvent.isShiftPressed()) {
                        long jLIZ2 = C634390OuT.LIZ(keyEvent.getKeyCode());
                        if (C20069013fk.LIZ(jLIZ2, C2281411ERn.LJIIIIZZ)) {
                            return EnumC2281371ERj.SELECT_LEFT_CHAR;
                        }
                        if (C20069013fk.LIZ(jLIZ2, C2281411ERn.LJIIIZ)) {
                            return EnumC2281371ERj.SELECT_RIGHT_CHAR;
                        }
                        if (C20069013fk.LIZ(jLIZ2, C2281411ERn.LJIIJ)) {
                            return EnumC2281371ERj.SELECT_UP;
                        }
                        if (C20069013fk.LIZ(jLIZ2, C2281411ERn.LJIIJJI)) {
                            return EnumC2281371ERj.SELECT_DOWN;
                        }
                        if (C20069013fk.LIZ(jLIZ2, C2281411ERn.LJIIL)) {
                            return EnumC2281371ERj.SELECT_PAGE_UP;
                        }
                        if (C20069013fk.LIZ(jLIZ2, C2281411ERn.LJIILIIL)) {
                            return EnumC2281371ERj.SELECT_PAGE_DOWN;
                        }
                        if (C20069013fk.LIZ(jLIZ2, C2281411ERn.LJIILJJIL)) {
                            return EnumC2281371ERj.SELECT_LINE_START;
                        }
                        if (C20069013fk.LIZ(jLIZ2, C2281411ERn.LJIILL)) {
                            return EnumC2281371ERj.SELECT_LINE_END;
                        }
                        if (C20069013fk.LIZ(jLIZ2, C2281411ERn.LJIILLIIL)) {
                            return EnumC2281371ERj.PASTE;
                        }
                        return null;
                    }
                    long jLIZ3 = C634390OuT.LIZ(keyEvent.getKeyCode());
                    if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIIIIZZ)) {
                        return EnumC2281371ERj.LEFT_CHAR;
                    }
                    if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIIIZ)) {
                        return EnumC2281371ERj.RIGHT_CHAR;
                    }
                    if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIIJ)) {
                        return EnumC2281371ERj.UP;
                    }
                    if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIIJJI)) {
                        return EnumC2281371ERj.DOWN;
                    }
                    if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIIL)) {
                        return EnumC2281371ERj.PAGE_UP;
                    }
                    if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIILIIL)) {
                        return EnumC2281371ERj.PAGE_DOWN;
                    }
                    if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIILJJIL)) {
                        return EnumC2281371ERj.LINE_START;
                    }
                    if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIILL)) {
                        return EnumC2281371ERj.LINE_END;
                    }
                    if (!C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIIZILJ) && !C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIJ)) {
                        if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIJI)) {
                            return EnumC2281371ERj.DELETE_PREV_CHAR;
                        }
                        if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIJJ)) {
                            return EnumC2281371ERj.DELETE_NEXT_CHAR;
                        }
                        if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIJJLI)) {
                            return EnumC2281371ERj.PASTE;
                        }
                        if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJIL)) {
                            return EnumC2281371ERj.CUT;
                        }
                        if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJJ)) {
                            return EnumC2281371ERj.COPY;
                        }
                        if (C20069013fk.LIZ(jLIZ3, C2281411ERn.LJJI)) {
                            return EnumC2281371ERj.TAB;
                        }
                        return null;
                    }
                    return EnumC2281371ERj.NEW_LINE;
                }
                return null;
            }
        });
    }
}
