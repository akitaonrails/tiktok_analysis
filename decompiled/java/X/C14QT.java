package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.ViewObject;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14QT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14QT {
    public final ConcurrentHashMap<String, C14QU> LIZ = new ConcurrentHashMap<>();

    public C14QT(final InterfaceC293701Bv interfaceC293701Bv) {
        LIZIZ(new C14QP(this));
        LIZIZ(new C14QU(this) { // from class: X.14QO
            public final C14QT LIZ;

            @Override // X.C14QU
            public final String LIZ() {
                return "view";
            }

            {
                this.LIZ = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
            @Override // X.C14QU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View LIZIZ(android.content.Context r12, com.ss.android.ugc.aweme.model.ViewObject r13, com.ss.android.ugc.aweme.model.CommonLogParams r14, X.C01BK r15) {
                /*
                    Method dump skipped, instruction units count: 295
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C14QO.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.model.ViewObject, com.ss.android.ugc.aweme.model.CommonLogParams, X.01BK):android.view.View");
            }
        });
        LIZIZ(new C14QU() { // from class: X.14QV
            @Override // X.C14QU
            public final String LIZ() {
                return "image";
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
            @Override // X.C14QU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View LIZIZ(android.content.Context r14, com.ss.android.ugc.aweme.model.ViewObject r15, com.ss.android.ugc.aweme.model.CommonLogParams r16, X.C01BK r17) {
                /*
                    Method dump skipped, instruction units count: 382
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C14QV.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.model.ViewObject, com.ss.android.ugc.aweme.model.CommonLogParams, X.01BK):android.view.View");
            }
        });
        LIZIZ(new C14QU() { // from class: X.14QN
            @Override // X.C14QU
            public final String LIZ() {
                return "tux-price";
            }

            @Override // X.C14QU
            public final View LIZIZ(Context context, ViewObject viewObject, CommonLogParams commonLogParams, C01BK c01bk) {
                Object obj;
                Map map;
                Object obj2;
                Map map2;
                boolean zLJFF;
                Object obj3;
                String str;
                String str2;
                Map<String, Object> map3 = viewObject.props;
                C041W c041w = new C041W();
                if (map3 != null) {
                    Object obj4 = map3.get("formatPriceNumber");
                    if (obj4 != null && (obj3 = map3.get("displayCurrency")) != null) {
                        boolean zLJFF2 = Intrinsics.LJFF(map3.get("symbolPosition"), 0);
                        if (obj4 instanceof String) {
                            str = (String) obj4;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (!(obj3 instanceof String) || (str2 = (String) obj3) == null) {
                            str2 = "";
                        }
                        c041w.LIZJ(zLJFF2 ? 1 : 0, str, str2, "");
                    }
                    obj = map3.get("salePriceStyle");
                } else {
                    obj = null;
                }
                if (obj instanceof Map) {
                    map = (Map) obj;
                } else {
                    map = null;
                }
                if (map3 != null) {
                    obj2 = map3.get("saleCurrencyStyle");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof Map) {
                    map2 = (Map) obj2;
                } else {
                    map2 = null;
                }
                Integer numLJFF = C2272811Dxf.LJFF(map2);
                Integer numLJFF2 = C2272811Dxf.LJFF(map);
                if (numLJFF != null) {
                    if (numLJFF2 != null) {
                        int iIntValue = numLJFF.intValue();
                        int iIntValue2 = numLJFF2.intValue();
                        c041w.LJ = iIntValue;
                        c041w.LJFF = iIntValue2;
                    } else {
                        int iIntValue3 = numLJFF.intValue();
                        int iIntValue4 = numLJFF.intValue();
                        c041w.LJ = iIntValue3;
                        c041w.LJFF = iIntValue4;
                    }
                } else if (numLJFF2 != null) {
                    int iIntValue5 = numLJFF2.intValue();
                    int iIntValue6 = numLJFF2.intValue();
                    c041w.LJ = iIntValue5;
                    c041w.LJFF = iIntValue6;
                }
                c041w.LJI = Integer.valueOf(C2272811Dxf.LJIIL(context, C2272811Dxf.LIZLLL(context, "UIText1"), map));
                if (map != null) {
                    zLJFF = Intrinsics.LJFF(map.get("hasStrikeThrough"), Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                if (zLJFF) {
                    c041w.LJIIIIZZ = true;
                }
                CharSequence charSequenceLIZIZ = c041w.LIZIZ(context);
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setText(charSequenceLIZIZ);
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                C14S9.LIZ(tuxTextView, viewObject, commonLogParams, c01bk);
                return tuxTextView;
            }
        });
        LIZIZ(new C14QU() { // from class: X.14QS
            @Override // X.C14QU
            public final String LIZ() {
                return "text";
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
            @Override // X.C14QU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View LIZIZ(android.content.Context r7, com.ss.android.ugc.aweme.model.ViewObject r8, com.ss.android.ugc.aweme.model.CommonLogParams r9, X.C01BK r10) {
                /*
                    Method dump skipped, instruction units count: 218
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C14QS.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.model.ViewObject, com.ss.android.ugc.aweme.model.CommonLogParams, X.01BK):android.view.View");
            }
        });
        LIZIZ(new C14QU(this, interfaceC293701Bv) { // from class: X.14QQ
            public final C14QT LIZ;
            public final InterfaceC293701Bv LIZIZ;

            @Override // X.C14QU
            public final String LIZ() {
                return "view-flipper";
            }

            {
                this.LIZ = this;
                this.LIZIZ = interfaceC293701Bv;
            }

            /* JADX WARN: Removed duplicated region for block: B:57:0x00fd A[PHI: r2
              0x00fd: PHI (r2v10 java.lang.String) = (r2v9 java.lang.String), (r2v11 java.lang.String) binds: [B:56:0x00fb, B:52:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C14QU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View LIZIZ(android.content.Context r15, com.ss.android.ugc.aweme.model.ViewObject r16, com.ss.android.ugc.aweme.model.CommonLogParams r17, X.C01BK r18) {
                /*
                    Method dump skipped, instruction units count: 355
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C14QQ.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.model.ViewObject, com.ss.android.ugc.aweme.model.CommonLogParams, X.01BK):android.view.View");
            }
        });
        LIZIZ(new C14QU(this) { // from class: X.14QM
            public final C14QT LIZ;

            @Override // X.C14QU
            public final String LIZ() {
                return "flex-layout";
            }

            {
                this.LIZ = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0181  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x021c  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x0251  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
            /* JADX WARN: Type inference failed for: r4v0, types: [X.14L3, android.view.View, android.view.ViewGroup, java.lang.Object] */
            @Override // X.C14QU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View LIZIZ(android.content.Context r19, com.ss.android.ugc.aweme.model.ViewObject r20, com.ss.android.ugc.aweme.model.CommonLogParams r21, X.C01BK r22) {
                /*
                    Method dump skipped, instruction units count: 912
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C14QM.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.model.ViewObject, com.ss.android.ugc.aweme.model.CommonLogParams, X.01BK):android.view.View");
            }
        });
        LIZIZ(new C14QU(interfaceC293701Bv) { // from class: X.14QR
            public final InterfaceC293701Bv LIZ;

            @Override // X.C14QU
            public final String LIZ() {
                return "marquee-text";
            }

            {
                this.LIZ = interfaceC293701Bv;
            }

            @Override // X.C14QU
            public final View LIZIZ(Context context, ViewObject viewObject, CommonLogParams commonLogParams, C01BK c01bk) {
                Object obj;
                String str;
                Object obj2;
                Boolean bool;
                boolean zBooleanValue;
                Object obj3;
                float fFloatValue;
                Object obj4;
                int iIntValue;
                Map map;
                int iIntValue2;
                Number number;
                Number number2;
                Map<String, Object> map2 = viewObject.props;
                C418480Gb0 c418480Gb0 = new C418480Gb0(context);
                Object obj5 = null;
                if (map2 != null) {
                    obj = map2.get("content");
                } else {
                    obj = null;
                }
                if (!(obj instanceof String) || (str = (String) obj) == null) {
                    str = "";
                }
                c418480Gb0.setText(str);
                if (map2 != null) {
                    obj2 = map2.get("autoStart");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof Boolean) {
                    bool = (Boolean) obj2;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                c418480Gb0.setAutoStart(zBooleanValue);
                if (map2 != null) {
                    obj3 = map2.get("speed");
                } else {
                    obj3 = null;
                }
                if ((obj3 instanceof Number) && (number2 = (Number) obj3) != null) {
                    fFloatValue = number2.floatValue();
                } else {
                    fFloatValue = 20.0f;
                }
                c418480Gb0.setSpeedDpPerSec(fFloatValue);
                if (map2 != null) {
                    obj4 = map2.get("marqueeRepeatLimit");
                } else {
                    obj4 = null;
                }
                if ((obj4 instanceof Number) && (number = (Number) obj4) != null) {
                    iIntValue = number.intValue();
                } else {
                    iIntValue = -1;
                }
                c418480Gb0.setRepeatLimit(iIntValue);
                if (map2 != null) {
                    obj5 = map2.get("style");
                }
                if ((obj5 instanceof Map) && (map = (Map) obj5) != null) {
                    int iLJIIL = C2272811Dxf.LJIIL(context, 0, map);
                    if (iLJIIL != 0) {
                        c418480Gb0.setTextColor(iLJIIL);
                    }
                    if (map.get("font") != null) {
                        Integer numLJFF = C2272811Dxf.LJFF(map);
                        if (numLJFF != null) {
                            iIntValue2 = numLJFF.intValue();
                        } else {
                            iIntValue2 = 61;
                        }
                        c418480Gb0.setTuxFont(iIntValue2);
                    }
                }
                InterfaceC655280Pn4 interfaceC655280Pn4 = new InterfaceC655280Pn4(c418480Gb0) { // from class: X.0Gb1
                    public final C418480Gb0 LIZ;

                    @Override // X.InterfaceC655280Pn4
                    public final void start() {
                        this.LIZ.LIZ();
                    }

                    @Override // X.InterfaceC655280Pn4
                    public final void stop() {
                        C418480Gb0 c418480Gb02 = this.LIZ;
                        ValueAnimator valueAnimator = c418480Gb02.LLJILJIL;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        c418480Gb02.LLJ = 0.0f;
                        c418480Gb02.LLJILJILJ = false;
                        c418480Gb02.invalidate();
                    }

                    {
                        this.LIZ = c418480Gb0;
                    }
                };
                InterfaceC293701Bv interfaceC293701Bv2 = this.LIZ;
                if (interfaceC293701Bv2 != null) {
                    interfaceC293701Bv2.LIZLLL(C13LE.LIZ(InterfaceC655280Pn4.class), interfaceC655280Pn4);
                }
                if (viewObject.events != null) {
                    C14S9.LIZ(c418480Gb0, viewObject, commonLogParams, c01bk);
                }
                return c418480Gb0;
            }
        });
    }

    public final void LIZIZ(C14QU c14qu) {
        this.LIZ.put(c14qu.LIZ(), c14qu);
    }

    public final View LIZ(Context context, ViewObject viewObject, CommonLogParams commonLogParams, C01BK c01bk) {
        C14QU c14qu;
        if (viewObject == null || (c14qu = this.LIZ.get(viewObject.name)) == null) {
            return null;
        }
        return c14qu.LIZIZ(context, viewObject, commonLogParams, c01bk);
    }
}
