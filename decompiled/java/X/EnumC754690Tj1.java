package X;

import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC754690Tj1 {
    public static final C754670Tiz Companion;
    public static final EnumC754690Tj1 LIVE_VOICE;
    public static final /* synthetic */ EnumC754690Tj1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC754690Tj1 SCREEN_RECORD;
    public static final EnumC754690Tj1 THIRD_PARTY;
    public static final EnumC754690Tj1 VIDEO;

    public static InterfaceC2044707zh<EnumC754690Tj1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC754690Tj1 enumC754690Tj1 = new EnumC754690Tj1("VIDEO", 0);
        VIDEO = enumC754690Tj1;
        EnumC754690Tj1 enumC754690Tj12 = new EnumC754690Tj1("SCREEN_RECORD", 1);
        SCREEN_RECORD = enumC754690Tj12;
        EnumC754690Tj1 enumC754690Tj13 = new EnumC754690Tj1("THIRD_PARTY", 2);
        THIRD_PARTY = enumC754690Tj13;
        EnumC754690Tj1 enumC754690Tj14 = new EnumC754690Tj1("LIVE_VOICE", 3);
        LIVE_VOICE = enumC754690Tj14;
        EnumC754690Tj1[] enumC754690Tj1Arr = {enumC754690Tj1, enumC754690Tj12, enumC754690Tj13, enumC754690Tj14};
        LL = enumC754690Tj1Arr;
        LLILLJJLI = new C2254308sP(enumC754690Tj1Arr);
        Companion = new C754670Tiz();
    }

    public static EnumC754690Tj1[] values() {
        return (EnumC754690Tj1[]) LL.clone();
    }

    public final GameTag getGameTag() {
        GameTag gameTag;
        int i = C754680Tj0.LIZ[ordinal()];
        GameTag gameTag2 = null;
        if (i == 1) {
            gameTag = C754700Tj2.LIZIZ;
            if (gameTag == null) {
                String strLIZIZ = InterfaceC772390URp.o.LIZIZ();
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    gameTag2 = (GameTag) C1516000pYM.LIZ(GameTag.class, strLIZIZ);
                }
                C754700Tj2.LIZIZ = gameTag2;
                return gameTag2;
            }
        } else {
            if (i == 2) {
                return C754700Tj2.LIZIZ();
            }
            if (i == 3) {
                gameTag = C754700Tj2.LIZLLL;
                if (gameTag == null) {
                    String strLIZIZ2 = InterfaceC465660INw.Wc.LIZIZ();
                    if (strLIZIZ2 != null && strLIZIZ2.length() != 0) {
                        gameTag2 = (GameTag) C1516000pYM.LIZ(GameTag.class, strLIZIZ2);
                    }
                    C754700Tj2.LIZLLL = gameTag2;
                    return gameTag2;
                }
            } else {
                if (i != 4) {
                    throw new C1954807lC();
                }
                gameTag = C754700Tj2.LJII;
                if (gameTag == null) {
                    String strLIZIZ3 = InterfaceC1106030et7.r5.LIZIZ();
                    if (strLIZIZ3 != null && strLIZIZ3.length() != 0) {
                        gameTag2 = (GameTag) C1516000pYM.LIZ(GameTag.class, strLIZIZ3);
                    }
                    C754700Tj2.LJII = gameTag2;
                    return gameTag2;
                }
            }
        }
        return gameTag;
    }

    public final Hashtag getHashtag() {
        Hashtag hashtag;
        int i = C754680Tj0.LIZ[ordinal()];
        if (i == 1) {
            return C754700Tj2.LIZJ();
        }
        Hashtag hashtag2 = null;
        if (i == 2) {
            if (getGameTag() == null) {
                return null;
            }
            return C754700Tj2.LIZ();
        }
        if (i == 3) {
            hashtag = C754700Tj2.LIZJ;
            if (hashtag == null) {
                String strLIZIZ = InterfaceC465660INw.Vc.LIZIZ();
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    hashtag2 = (Hashtag) C1516000pYM.LIZ(Hashtag.class, strLIZIZ);
                }
                C754700Tj2.LIZJ = hashtag2;
                return hashtag2;
            }
        } else {
            if (i != 4) {
                throw new C1954807lC();
            }
            hashtag = C754700Tj2.LJI;
            if (hashtag == null) {
                String strLIZIZ2 = InterfaceC1106030et7.q5.LIZIZ();
                if (strLIZIZ2 != null && strLIZIZ2.length() != 0) {
                    hashtag2 = (Hashtag) C1516000pYM.LIZ(Hashtag.class, strLIZIZ2);
                }
                C754700Tj2.LJI = hashtag2;
                return hashtag2;
            }
        }
        return hashtag;
    }

    public final boolean isSelectFinish() {
        Hashtag hashtag;
        Long l;
        int i = C754680Tj0.LIZ[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new C1954807lC();
                }
                return true;
            }
            Hashtag hashtag2 = getHashtag();
            Long l2 = hashtag2 != null ? hashtag2.id : null;
            Hashtag hashtagLIZ = C754700Tj2.LIZ();
            if (Intrinsics.LJFF(l2, hashtagLIZ != null ? hashtagLIZ.id : null)) {
                if (getGameTag() != null) {
                    return true;
                }
            } else if (getHashtag() != null && ((hashtag = getHashtag()) == null || (l = hashtag.id) == null || l.longValue() != 0)) {
                return true;
            }
        } else if (getGameTag() != null) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hashtag = ");
        sbLIZ.append(getHashtag());
        sbLIZ.append(",gameTag = ");
        sbLIZ.append(getGameTag());
        sbLIZ.append(" ,isSelectFinish = ");
        sbLIZ.append(isSelectFinish());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static EnumC754690Tj1 valueOf(String str) {
        return (EnumC754690Tj1) C08FF.LIZ(EnumC754690Tj1.class, str);
    }

    public EnumC754690Tj1(String str, int i) {
    }

    public final void updateHashTagGameTag(Hashtag hashtag, GameTag gameTag) {
        Long l;
        Long l2;
        String strLIZLLL;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        String strLIZLLL2;
        String strLIZLLL3;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        String strLIZLLL4;
        String strLIZLLL5;
        Long l11;
        Long l12;
        int i = C754680Tj0.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Hashtag hashtagLIZ = C754700Tj2.LIZ();
                        if (hashtagLIZ != null) {
                            l9 = hashtagLIZ.id;
                        } else {
                            l9 = null;
                        }
                        if (hashtag != null) {
                            l10 = hashtag.id;
                        } else {
                            l10 = null;
                        }
                        if (Intrinsics.LJFF(l9, l10) && gameTag == null) {
                            return;
                        }
                        C754700Tj2.LJI = hashtag;
                        C20337914i1<String> c20337914i1 = InterfaceC1106030et7.q5;
                        if (hashtag == null || (strLIZLLL4 = C1516000pYM.LIZLLL(hashtag)) == null) {
                            strLIZLLL4 = "";
                        }
                        c20337914i1.LJFF(strLIZLLL4);
                        C754700Tj2.LJII = gameTag;
                        C20337914i1<String> c20337914i12 = InterfaceC1106030et7.r5;
                        if (gameTag == null || (strLIZLLL5 = C1516000pYM.LIZLLL(gameTag)) == null) {
                            strLIZLLL5 = "";
                        }
                        c20337914i12.LJFF(strLIZLLL5);
                        if (gameTag != null) {
                            if (hashtag != null) {
                                l11 = hashtag.id;
                            } else {
                                l11 = null;
                            }
                            Hashtag hashtagLIZ2 = C754700Tj2.LIZ();
                            if (hashtagLIZ2 != null) {
                                l12 = hashtagLIZ2.id;
                            } else {
                                l12 = null;
                            }
                            if (!Intrinsics.LJFF(l11, l12)) {
                                C754700Tj2.LJII = null;
                                c20337914i12.LJFF("");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                Hashtag hashtagLIZ3 = C754700Tj2.LIZ();
                if (hashtagLIZ3 != null) {
                    l5 = hashtagLIZ3.id;
                } else {
                    l5 = null;
                }
                if (hashtag != null) {
                    l6 = hashtag.id;
                } else {
                    l6 = null;
                }
                if (Intrinsics.LJFF(l5, l6) && gameTag == null) {
                    return;
                }
                C754700Tj2.LIZJ = hashtag;
                C20337914i1<String> c20337914i13 = InterfaceC465660INw.Vc;
                if (hashtag == null || (strLIZLLL2 = C1516000pYM.LIZLLL(hashtag)) == null) {
                    strLIZLLL2 = "";
                }
                c20337914i13.LJFF(strLIZLLL2);
                C754700Tj2.LIZLLL = gameTag;
                C20337914i1<String> c20337914i14 = InterfaceC465660INw.Wc;
                if (gameTag == null || (strLIZLLL3 = C1516000pYM.LIZLLL(gameTag)) == null) {
                    strLIZLLL3 = "";
                }
                c20337914i14.LJFF(strLIZLLL3);
                if (gameTag != null) {
                    if (hashtag != null) {
                        l7 = hashtag.id;
                    } else {
                        l7 = null;
                    }
                    Hashtag hashtagLIZ4 = C754700Tj2.LIZ();
                    if (hashtagLIZ4 != null) {
                        l8 = hashtagLIZ4.id;
                    } else {
                        l8 = null;
                    }
                    if (!Intrinsics.LJFF(l7, l8)) {
                        C754700Tj2.LIZLLL = null;
                        c20337914i14.LJFF("");
                        return;
                    }
                    return;
                }
                return;
            }
            C754700Tj2.LIZLLL(gameTag);
            return;
        }
        Hashtag hashtagLIZ5 = C754700Tj2.LIZ();
        if (hashtagLIZ5 != null) {
            l = hashtagLIZ5.id;
        } else {
            l = null;
        }
        if (hashtag != null) {
            l2 = hashtag.id;
        } else {
            l2 = null;
        }
        if (Intrinsics.LJFF(l, l2) && gameTag == null) {
            return;
        }
        C754700Tj2.LJ(hashtag);
        C754700Tj2.LIZIZ = gameTag;
        C20337914i1<String> c20337914i15 = InterfaceC772390URp.o;
        if (gameTag == null || (strLIZLLL = C1516000pYM.LIZLLL(gameTag)) == null) {
            strLIZLLL = "";
        }
        c20337914i15.LJFF(strLIZLLL);
        if (gameTag != null) {
            if (hashtag != null) {
                l3 = hashtag.id;
            } else {
                l3 = null;
            }
            Hashtag hashtagLIZ6 = C754700Tj2.LIZ();
            if (hashtagLIZ6 != null) {
                l4 = hashtagLIZ6.id;
            } else {
                l4 = null;
            }
            if (!Intrinsics.LJFF(l3, l4)) {
                C754700Tj2.LIZIZ = null;
                c20337914i15.LJFF("");
            }
        }
    }
}
