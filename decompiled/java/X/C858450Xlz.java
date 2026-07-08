package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0Xlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858450Xlz extends AbstractC857980XlE<AVTextExtraStruct> {
    public static final /* synthetic */ int LIZJ = 0;
    public final C857960XlC LIZIZ;

    public C858450Xlz(C857960XlC c857960XlC) {
        this.LIZIZ = c857960XlC;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJ(AbstractC858390Xlt abstractC858390Xlt) {
        this.LIZ.addLast(abstractC858390Xlt);
    }

    @Override // X.AbstractC857980XlE
    public final /* bridge */ /* synthetic */ C858450Xlz LIZIZ(CharSequence charSequence, Iterable iterable) {
        LJI(charSequence, iterable);
        return this;
    }

    @Override // X.AbstractC857980XlE
    public final List<AbstractC858320Xlm<AVTextExtraStruct>> LIZJ(CharSequence charSequence, List<? extends AVTextExtraStruct> list) {
        try {
            return new C858460Xm0(charSequence, list, this.LIZIZ).LJ(false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markupText: ");
            sbLIZ.append((Object) charSequence);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("TiktokLexicalTextBlockFactory", strLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("metadata: ");
            sbLIZ2.append(GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), list));
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("TiktokLexicalTextBlockFactory", C2188811AlT.LIZIZ(sbLIZ2));
            C857510XkT.Companion.getClass();
            throw new C857510XkT(strLIZIZ, e);
        }
    }

    public final void LJI(CharSequence charSequence, Iterable iterable) {
        this.LIZ.clear();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        for (Object obj : iterable) {
            int i4 = i3 + 1;
            AbstractC858390Xlt abstractC858390Xlt = null;
            abstractC858390Xlt = null;
            abstractC858390Xlt = null;
            if (i3 >= 0) {
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
                if (i >= i2) {
                    i2 = -1;
                }
                if (LJFF(i, aVTextExtraStruct.start, i2, charSequence)) {
                    i = aVTextExtraStruct.start;
                }
                if (aVTextExtraStruct.isTransient()) {
                    i2 = aVTextExtraStruct.end;
                    int i5 = aVTextExtraStruct.subType;
                    if (i5 != 1 && i5 != 2 && i5 != 16) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported transient text block type(subType=");
                        sbLIZ.append(aVTextExtraStruct.subType);
                        sbLIZ.append("), struct=");
                        sbLIZ.append(aVTextExtraStruct);
                        throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ), null);
                    }
                } else {
                    int i6 = aVTextExtraStruct.type;
                    String str = "";
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 != 5) {
                                if (i6 == 6553) {
                                    if (aVTextExtraStruct.subType == 18) {
                                        int i7 = aVTextExtraStruct.start;
                                        int i8 = aVTextExtraStruct.end;
                                        C858350Xlp c858350Xlp = new C858350Xlp(i7, i8, charSequence.subSequence(i7, i8));
                                        c858350Xlp.LJIIJ = 18;
                                        abstractC858390Xlt = c858350Xlp;
                                    } else {
                                        C858590XmD c858590XmD = new C858590XmD(aVTextExtraStruct.start, aVTextExtraStruct.end);
                                        c858590XmD.LJIIIZ = charSequence.subSequence(aVTextExtraStruct.start, aVTextExtraStruct.end).toString();
                                        c858590XmD.LJIIJ = aVTextExtraStruct.subType;
                                        abstractC858390Xlt = c858590XmD;
                                    }
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Unsupported text block type(type=");
                                    sbLIZ2.append(aVTextExtraStruct.type);
                                    sbLIZ2.append("), struct=");
                                    sbLIZ2.append(aVTextExtraStruct);
                                    throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ2), null);
                                }
                            } else {
                                int i9 = aVTextExtraStruct.start;
                                int i10 = aVTextExtraStruct.end;
                                String str2 = aVTextExtraStruct.awemeId;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str3 = aVTextExtraStruct.userId;
                                if (str3 != null) {
                                    str = str3;
                                }
                                C858500Xm4 c858500Xm4 = new C858500Xm4(i9, i10, str2, new C858610XmF(str, aVTextExtraStruct.getSecUid()), aVTextExtraStruct.commentId);
                                c858500Xm4.LJIILIIL = charSequence.subSequence(aVTextExtraStruct.start + 1, aVTextExtraStruct.end).toString();
                                c858500Xm4.LJIIL = aVTextExtraStruct.subType;
                                abstractC858390Xlt = c858500Xm4;
                            }
                        } else {
                            C858540Xm8 c858540Xm8 = new C858540Xm8(aVTextExtraStruct.start, aVTextExtraStruct.end);
                            c858540Xm8.LJIIJ = aVTextExtraStruct.hashTagName;
                            c858540Xm8.LJIIIZ = aVTextExtraStruct.subType;
                            abstractC858390Xlt = c858540Xm8;
                        }
                    } else {
                        int i11 = aVTextExtraStruct.subType;
                        if (i11 != 1 && i11 != 1) {
                            C858470Xm1 c858470Xm1 = new C858470Xm1(aVTextExtraStruct.start, aVTextExtraStruct.end, new C858610XmF(aVTextExtraStruct.userId, aVTextExtraStruct.getSecUid()));
                            c858470Xm1.LJIIL = charSequence.subSequence(aVTextExtraStruct.start + 1, aVTextExtraStruct.end).toString();
                            c858470Xm1.LJIIJ = aVTextExtraStruct.subType;
                            abstractC858390Xlt = c858470Xm1;
                        } else {
                            int i12 = aVTextExtraStruct.start;
                            int i13 = aVTextExtraStruct.end;
                            String str4 = aVTextExtraStruct.awemeId;
                            if (str4 == null) {
                                str4 = "";
                            }
                            String str5 = aVTextExtraStruct.userId;
                            if (str5 != null) {
                                str = str5;
                            }
                            C858500Xm4 c858500Xm42 = new C858500Xm4(i12, i13, str4, new C858610XmF(str, aVTextExtraStruct.getSecUid()), aVTextExtraStruct.commentId);
                            c858500Xm42.LJIILIIL = charSequence.subSequence(aVTextExtraStruct.start + 1, aVTextExtraStruct.end).toString();
                            abstractC858390Xlt = c858500Xm42;
                        }
                    }
                }
                LIZLLL(abstractC858390Xlt, aVTextExtraStruct, false);
                if (!aVTextExtraStruct.isTransient()) {
                    i = aVTextExtraStruct.end;
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LJFF(i, charSequence.length(), i2, charSequence);
    }

    public final void LIZLLL(AbstractC858390Xlt abstractC858390Xlt, AVTextExtraStruct aVTextExtraStruct, boolean z) {
        int i;
        AbstractC858390Xlt c858420Xlw;
        C0W3U c0w3u;
        C0W3U c0w3u2;
        C0W3U c0w3u3;
        AbstractC858390Xlt c858420Xlw2;
        if (abstractC858390Xlt == null) {
            if (aVTextExtraStruct != null) {
                int i2 = aVTextExtraStruct.subType;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 16) {
                            c858420Xlw2 = new C858430Xlx();
                        } else {
                            return;
                        }
                    } else {
                        c858420Xlw2 = new C858400Xlu(0);
                    }
                } else if (aVTextExtraStruct.isDuet()) {
                    c858420Xlw2 = new C858410Xlv(0);
                } else {
                    c858420Xlw2 = new C858420Xlw(0);
                }
                c858420Xlw2.LJII = C0W3U.LTR;
                LJ(c858420Xlw2);
                return;
            }
            throw new C857510XkT("Metadata of transient text block should not be null", null);
        }
        if (z) {
            LJ(abstractC858390Xlt);
            return;
        }
        if (aVTextExtraStruct != null) {
            i = aVTextExtraStruct.subType;
        } else {
            i = 0;
        }
        AbstractC858320Xlm abstractC858320Xlm = (AbstractC858320Xlm) this.LIZ.LJIIIIZZ();
        if (abstractC858320Xlm != null && abstractC858320Xlm.LIZ(abstractC858390Xlt)) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 6) {
                        if (i != 16) {
                            LJ(abstractC858390Xlt);
                            return;
                        }
                        C858430Xlx c858430Xlx = new C858430Xlx();
                        if (!c858430Xlx.LIZ(abstractC858390Xlt)) {
                            throw new C857510XkT("type is PostCommentTextBlock but not accepting! there might be something wrong.", null);
                        }
                        while (true) {
                            C0W3U c0w3u4 = c858430Xlx.LJII;
                            c0w3u3 = C0W3U.RTL;
                            if (c0w3u4 != c0w3u3 || !(!this.LIZ.isEmpty()) || !c858430Xlx.LIZ((AbstractC858320Xlm) this.LIZ.last())) {
                                break;
                            } else {
                                this.LIZ.removeLast();
                            }
                        }
                        if (c858430Xlx.LJIIJJI()) {
                            c858430Xlx.LJII = c0w3u3;
                        }
                        LJ(c858430Xlx);
                        return;
                    }
                } else {
                    C858400Xlu c858400Xlu = new C858400Xlu(0);
                    if (!c858400Xlu.LIZ(abstractC858390Xlt)) {
                        throw new C857510XkT("type is ReplyCommentChain Block but not accepting! there may be something wrong.", null);
                    }
                    while (true) {
                        C0W3U c0w3u5 = c858400Xlu.LJII;
                        c0w3u2 = C0W3U.RTL;
                        if (c0w3u5 != c0w3u2 || !(!this.LIZ.isEmpty()) || !c858400Xlu.LIZ((AbstractC858320Xlm) this.LIZ.last())) {
                            break;
                        } else {
                            this.LIZ.removeLast();
                        }
                    }
                    if (c858400Xlu.LJIIJJI()) {
                        c858400Xlu.LJII = c0w3u2;
                    }
                    LJ(c858400Xlu);
                    return;
                }
            } else {
                if (aVTextExtraStruct == null) {
                    return;
                }
                if (aVTextExtraStruct.isDuet()) {
                    c858420Xlw = new C858410Xlv(0);
                } else {
                    c858420Xlw = new C858420Xlw(0);
                }
                if (!c858420Xlw.LIZ(abstractC858390Xlt)) {
                    throw new C857510XkT("type is DuetChain Block but not accepting! there might be something wrong.", null);
                }
                while (true) {
                    C0W3U c0w3u6 = c858420Xlw.LJII;
                    c0w3u = C0W3U.RTL;
                    if (c0w3u6 != c0w3u || !(!this.LIZ.isEmpty()) || !c858420Xlw.LIZ((AbstractC858320Xlm) this.LIZ.last())) {
                        break;
                    } else {
                        this.LIZ.removeLast();
                    }
                }
                if (c858420Xlw.LJIIJJI()) {
                    c858420Xlw.LJII = c0w3u;
                }
                LJ(c858420Xlw);
                return;
            }
        }
        AbstractC858320Xlm abstractC858320Xlm2 = (AbstractC858320Xlm) this.LIZ.LJIIIIZZ();
        if (abstractC858320Xlm2 != null && !abstractC858320Xlm2.LJIIJJI()) {
            AbstractC858320Xlm abstractC858320Xlm3 = (AbstractC858320Xlm) this.LIZ.last();
            if (abstractC858320Xlm3.LIZ(abstractC858390Xlt)) {
                abstractC858320Xlm3.LJIIJJI();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last text block(type=");
            sbLIZ.append(abstractC858320Xlm3.getClass().getSimpleName());
            sbLIZ.append(") is uncomplete, but it also didn't accept current text block(type=");
            sbLIZ.append(abstractC858390Xlt.getClass().getSimpleName());
            sbLIZ.append(')');
            throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ), null);
        }
        LJ(abstractC858390Xlt);
    }

    public final boolean LJFF(int i, int i2, int i3, CharSequence charSequence) {
        boolean z;
        boolean z2 = false;
        if (i >= i2) {
            return false;
        }
        if (i + 1 <= i3 && i3 < i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZLLL(new C858350Xlp(i, i3, charSequence.subSequence(i, i3)), null, false);
            LIZLLL(new C858350Xlp(i3, i2, charSequence.subSequence(i3, i2)), null, true);
        } else {
            C858350Xlp c858350Xlp = new C858350Xlp(i, i2, charSequence.subSequence(i, i2));
            if (i2 > i3) {
                z2 = true;
            }
            LIZLLL(c858350Xlp, null, z2);
        }
        return true;
    }
}
