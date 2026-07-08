package X;

import android.widget.TextView;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860150yVR {
    public static final int LIZ = C1860220yVY.LIZ.LIZ();

    public static final Pair LIZ(int i, TextView textView, String str) {
        InterfaceC1842200y2U interfaceC1842200y2U;
        if (str.length() == 0) {
            return new Pair(0, 0);
        }
        if (i < 0) {
            i = 0;
        } else if (i >= str.length()) {
            i = str.length() - 1;
        }
        final int i2 = LIZ;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                final C1860130yVP c1860130yVP = null;
                if (i2 != 4) {
                    if (textView instanceof C1860130yVP) {
                        c1860130yVP = (C1860130yVP) textView;
                    }
                    interfaceC1842200y2U = new InterfaceC1842200y2U(c1860130yVP) { // from class: X.0yVS
                        public static final List<String> LIZJ = C1697810uHb.LJIILJJIL("。", "\\? ", "？", "\\! ", "！", "- ", "\\. ", "\\.{6}", "\\.{3}", "·{6}", "·{3}", "…{2}", "…{1}", "\n");
                        public final C1860130yVP LIZ;
                        public final List<C1860170yVT> LIZIZ = new ArrayList();

                        {
                            this.LIZ = c1860130yVP;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
                        /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
                        @Override // X.InterfaceC1842200y2U
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final kotlin.Pair LIZ(int r17, java.lang.String r18) {
                            /*
                                Method dump skipped, instruction units count: 342
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1860160yVS.LIZ(int, java.lang.String):kotlin.Pair");
                        }

                        public final Pair LIZIZ(int i3, String str2) {
                            int i4;
                            int length;
                            boolean z;
                            C1860140yVQ markwonContent;
                            int i5 = i3 - 1;
                            C1860170yVT c1860170yVT = (C1860170yVT) C13LP.LJJJLZIJ(i5, this.LIZIZ);
                            C1860170yVT c1860170yVT2 = (C1860170yVT) C13LP.LJJJLZIJ(i3, this.LIZIZ);
                            boolean z2 = false;
                            if (c1860170yVT != null) {
                                i4 = c1860170yVT.LIZ + 1;
                            } else {
                                i4 = 0;
                            }
                            if (c1860170yVT2 != null) {
                                length = c1860170yVT2.LIZ + 1;
                            } else {
                                length = str2.length();
                            }
                            if (a0.LJLIIIL(u.LJJIFFI(str2.substring(i4, length), "\n", "", false)).toString().length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C1860130yVP c1860130yVP2 = this.LIZ;
                            if (c1860130yVP2 != null && (markwonContent = c1860130yVP2.getMarkwonContent()) != null) {
                                if (((C448880Hiw[]) markwonContent.LIZ.getSpans(i4, length, C448880Hiw.class)).length == 0) {
                                    z2 = true;
                                }
                                z2 = !z2;
                            }
                            if (i3 > 0 && z && !z2) {
                                return LIZIZ(i5, str2);
                            }
                            return new Pair(c1860170yVT, c1860170yVT2);
                        }
                    };
                } else {
                    if (textView instanceof C1860130yVP) {
                        c1860130yVP = (C1860130yVP) textView;
                    }
                    interfaceC1842200y2U = new InterfaceC1842200y2U(c1860130yVP) { // from class: X.0yVS
                        public static final List<String> LIZJ = C1697810uHb.LJIILJJIL("。", "\\? ", "？", "\\! ", "！", "- ", "\\. ", "\\.{6}", "\\.{3}", "·{6}", "·{3}", "…{2}", "…{1}", "\n");
                        public final C1860130yVP LIZ;
                        public final List<C1860170yVT> LIZIZ = new ArrayList();

                        {
                            this.LIZ = c1860130yVP;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
                        /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
                        @Override // X.InterfaceC1842200y2U
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final kotlin.Pair LIZ(int r17, java.lang.String r18) {
                            /*
                                Method dump skipped, instruction units count: 342
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1860160yVS.LIZ(int, java.lang.String):kotlin.Pair");
                        }

                        public final Pair LIZIZ(int i3, String str2) {
                            int i4;
                            int length;
                            boolean z;
                            C1860140yVQ markwonContent;
                            int i5 = i3 - 1;
                            C1860170yVT c1860170yVT = (C1860170yVT) C13LP.LJJJLZIJ(i5, this.LIZIZ);
                            C1860170yVT c1860170yVT2 = (C1860170yVT) C13LP.LJJJLZIJ(i3, this.LIZIZ);
                            boolean z2 = false;
                            if (c1860170yVT != null) {
                                i4 = c1860170yVT.LIZ + 1;
                            } else {
                                i4 = 0;
                            }
                            if (c1860170yVT2 != null) {
                                length = c1860170yVT2.LIZ + 1;
                            } else {
                                length = str2.length();
                            }
                            if (a0.LJLIIIL(u.LJJIFFI(str2.substring(i4, length), "\n", "", false)).toString().length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C1860130yVP c1860130yVP2 = this.LIZ;
                            if (c1860130yVP2 != null && (markwonContent = c1860130yVP2.getMarkwonContent()) != null) {
                                if (((C448880Hiw[]) markwonContent.LIZ.getSpans(i4, length, C448880Hiw.class)).length == 0) {
                                    z2 = true;
                                }
                                z2 = !z2;
                            }
                            if (i3 > 0 && z && !z2) {
                                return LIZIZ(i5, str2);
                            }
                            return new Pair(c1860170yVT, c1860170yVT2);
                        }
                    };
                }
            } else {
                interfaceC1842200y2U = new InterfaceC1842200y2U() { // from class: X.0y2T
                    public int LIZ;
                    public int LIZIZ;

                    public static boolean LIZIZ(int i3) {
                        if (48 > i3) {
                            return false;
                        }
                        if (i3 >= 58) {
                            if (65 > i3) {
                                return false;
                            }
                            if (i3 >= 91 && (97 > i3 || i3 >= 123)) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override // X.InterfaceC1842200y2U
                    public final Pair LIZ(int i3, String str2) {
                        this.LIZ = i3;
                        this.LIZIZ = i3 + 1;
                        if (LIZIZ(str2.charAt(i3))) {
                            int i4 = this.LIZ;
                            if (i4 > 0) {
                                char cCharAt = str2.charAt(i4 - 1);
                                while (LIZIZ(cCharAt)) {
                                    int i5 = this.LIZ - 1;
                                    this.LIZ = i5;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    cCharAt = str2.charAt(i5 - 1);
                                }
                            }
                            if (this.LIZIZ < str2.length()) {
                                char cCharAt2 = str2.charAt(this.LIZIZ);
                                while (true) {
                                    if (!LIZIZ(cCharAt2)) {
                                        break;
                                    }
                                    int i6 = this.LIZIZ + 1;
                                    this.LIZIZ = i6;
                                    if (i6 >= str2.length()) {
                                        this.LIZIZ = str2.length();
                                        break;
                                    }
                                    cCharAt2 = str2.charAt(this.LIZIZ);
                                }
                            }
                            int length = str2.length();
                            int i7 = this.LIZIZ;
                            if (length > i7) {
                                length = i7;
                            }
                            this.LIZIZ = length;
                        }
                        return new Pair(Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ));
                    }
                };
            }
        } else {
            interfaceC1842200y2U = new InterfaceC1842200y2U(i2) { // from class: X.0y2S
                public final BreakIterator LIZ;

                {
                    BreakIterator wordInstance;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            wordInstance = null;
                        } else {
                            wordInstance = BreakIterator.getSentenceInstance(Locale.getDefault());
                        }
                    } else {
                        wordInstance = BreakIterator.getWordInstance(Locale.getDefault());
                    }
                    this.LIZ = wordInstance;
                }

                @Override // X.InterfaceC1842200y2U
                public final Pair LIZ(int i3, String str2) {
                    BreakIterator breakIterator = this.LIZ;
                    if (breakIterator == null) {
                        return new Pair(0, Integer.valueOf(str2.length()));
                    }
                    breakIterator.setText(str2);
                    int next = this.LIZ.next();
                    if (i3 >= 0 && i3 < next) {
                        return new Pair(0, Integer.valueOf(next));
                    }
                    while (next != -1) {
                        int next2 = this.LIZ.next();
                        if (next2 == -1) {
                            return new Pair(Integer.valueOf(next), Integer.valueOf(str2.length()));
                        }
                        if (i3 >= 0 && i3 < next2) {
                            return new Pair(Integer.valueOf(next), Integer.valueOf(next2));
                        }
                        next = next2;
                    }
                    return new Pair(0, Integer.valueOf(str2.length()));
                }
            };
        }
        Pair pairLIZ = interfaceC1842200y2U.LIZ(i, str);
        InterfaceC1860190yVV interfaceC1860190yVVLIZ = C1860290yVf.LIZ();
        if (interfaceC1860190yVVLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSelectPair, txt:");
            sbLIZ.append(str);
            sbLIZ.append(",index:");
            sbLIZ.append(i);
            sbLIZ.append(",strategyId:");
            sbLIZ.append(i2);
            sbLIZ.append(",pair:");
            sbLIZ.append(pairLIZ);
            interfaceC1860190yVVLIZ.i("DefaultSelectionController", C2188811AlT.LIZIZ(sbLIZ));
        }
        return pairLIZ;
    }
}
