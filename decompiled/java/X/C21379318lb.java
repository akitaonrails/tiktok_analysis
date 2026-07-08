package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.google.gson.reflect.TypeToken;
import com.larus.business.markdown.api.model.CodeBlockConfig;
import com.larus.business.markdown.api.model.CodeStyle;
import com.larus.business.markdown.api.model.TableConfig;
import com.larus.business.markdown.api.model.TaskListConfig;
import com.larus.business.markdown.api.model.TitleStyle;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.taghandler.datahandler.CommonTagItem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.taghandler.datahandler.SmartReplySourceItem;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21379318lb {
    public static C21419418s4 LIZ;
    public static C21419418s4 LIZIZ;
    public static C21419418s4 LIZJ;
    public static C21419418s4 LIZLLL;
    public static final AFwS245S0000000_12 LJ = AFwS245S0000000_12.get$arr$(259);
    public static final AFwS296S0000000_12 LJFF = AFwS296S0000000_12.get$arr$(19);
    public static final AFwS296S0000000_12 LJI = AFwS296S0000000_12.get$arr$(20);
    public static final int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(327));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(328));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(326));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(329));

    public static C21419418s4 LIZ(C21419418s4 c21419418s4) {
        return C21419418s4.LIZ(c21419418s4, null, 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, 0, false, false, 0, false, null, null, false, null, new CodeBlockConfig(null, null, 15, false, "", false, null, TitleStyle.NORMAL, CodeStyle.NORMAL, null, null, null, 0, null, false, false, null, null, null, null, 1.5f), null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, 16777183);
    }

    public static C21419418s4 LIZLLL(C21419418s4 c21419418s4) {
        return C21419418s4.LIZ(c21419418s4, null, 0, false, 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.4d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), null, null, null, null, null, null, false, null, 0, false, false, 0, false, null, null, false, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -28673, 16777215);
    }

    public static C21419418s4 LJ(C21419418s4 c21419418s4) {
        return C21419418s4.LIZ(c21419418s4, null, 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, 0, false, false, 0, false, null, null, false, null, null, null, false, false, true, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, 16776703);
    }

    public static C21419418s4 LJII(C21419418s4 c21419418s4, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_tick_circle_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_circle;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1p);
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        return C21419418s4.LIZ(c21419418s4, null, 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, 0, false, false, 0, false, null, null, false, null, null, null, false, false, false, null, null, null, new TaskListConfig(tuxIconDrawableLIZ, c419910GdJ2.LIZ(context), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, false, null, null, false, false, false, false, null, -1, 16769023);
    }

    public static C21419418s4 LJIIIIZZ(Context context, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Context contextLIZIZ = context;
        if (contextLIZIZ != null || ((abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (contextLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null)) {
            if (((Boolean) C137300fj.LIZ.getValue()).booleanValue()) {
                return C21419418s4.LIZ(LJ(LJI(LJII(LIZIZ(LIZ(LIZLLL(LIZJ(LJFF(new C21419418s4(0, 0.0f, false, 1.3f, 0, 0, 0, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, -2049, 16777215), contextLIZIZ, z), contextLIZIZ, z))), contextLIZIZ, z), contextLIZIZ), contextLIZIZ, z)), Collections.singletonList(new AbstractC21434218uS() { // from class: X.18sY
                    public final Set<InterfaceC1839770xyZ> LIZ = C13LQ.LJLIIL(new InterfaceC1839770xyZ[]{new InterfaceC1839770xyZ() { // from class: X.0xyX
                        @Override // X.InterfaceC1839770xyZ
                        public final boolean LIZ(InterfaceC21435018ua interfaceC21435018ua) {
                            return true;
                        }

                        @Override // X.InterfaceC1839770xyZ
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1839770xyZ
                        public final String getDataType() {
                            return "smart-reply-sources";
                        }

                        @Override // X.InterfaceC1839770xyZ
                        public final ReplacementSpan LIZIZ(InterfaceC21435018ua interfaceC21435018ua, Map<String, ? extends Object> map) {
                            long jCurrentTimeMillis;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            String str = interfaceC21435018ua.LIZLLL().get("value");
                            if (str != null) {
                                try {
                                    List list = (List) C09EF.LIZ.LJIIIIZZ(str, new TypeToken<List<? extends SmartReplySourceItem>>() { // from class: X.0xyV
                                    }.getType());
                                    if (list != null) {
                                        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                                    } else {
                                        jCurrentTimeMillis = -1;
                                    }
                                    C1499405tw.LIZIZ(jCurrentTimeMillis, "parse_data", "smart-reply-sources");
                                    if (list != null) {
                                        return new C1839720xyU(list, map);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            return null;
                        }
                    }, new InterfaceC1839770xyZ() { // from class: X.0xyY
                        @Override // X.InterfaceC1839770xyZ
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1839770xyZ
                        public final String getDataType() {
                            return "smart-reply-common-tag";
                        }

                        public static CommonTagItem LIZLLL(InterfaceC21435018ua interfaceC21435018ua) {
                            long jCurrentTimeMillis;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            String str = interfaceC21435018ua.LIZLLL().get("value");
                            if (str == null) {
                                return null;
                            }
                            try {
                                CommonTagItem commonTagItem = (CommonTagItem) C09EF.LIZ.LJIIIIZZ(str, new TypeToken<CommonTagItem>() { // from class: X.0xya
                                }.getType());
                                if (commonTagItem != null) {
                                    jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                                } else {
                                    jCurrentTimeMillis = -1;
                                }
                                C1499405tw.LIZIZ(jCurrentTimeMillis, "parse_data", "smart-reply-common-tag");
                                return commonTagItem;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return null;
                            }
                        }

                        @Override // X.InterfaceC1839770xyZ
                        public final boolean LIZ(InterfaceC21435018ua interfaceC21435018ua) {
                            CommonTagItem commonTagItemLIZLLL = LIZLLL(interfaceC21435018ua);
                            if (commonTagItemLIZLLL == null) {
                                return false;
                            }
                            String str = commonTagItemLIZLLL.schema;
                            if (str != null && a0.LJJIIZI(str, "//im/smart_reply/instructions", false) && ((Number) C108700b7.LIZ.getValue()).intValue() != 1) {
                                return false;
                            }
                            return true;
                        }

                        @Override // X.InterfaceC1839770xyZ
                        public final ReplacementSpan LIZIZ(InterfaceC21435018ua interfaceC21435018ua, Map<String, ? extends Object> map) {
                            CommonTagItem commonTagItemLIZLLL = LIZLLL(interfaceC21435018ua);
                            if (commonTagItemLIZLLL == null) {
                                return null;
                            }
                            String str = commonTagItemLIZLLL.title;
                            if (str == null) {
                                str = "";
                            }
                            return new C1839740xyW(str, commonTagItemLIZLLL, map);
                        }
                    }});

                    @Override // X.AbstractC21434218uS
                    public final Collection LIZJ() {
                        return Collections.singleton("custom-inline-view");
                    }

                    public final InterfaceC1839770xyZ LJ(InterfaceC21435018ua interfaceC21435018ua) {
                        Object next;
                        Iterator<T> it2 = this.LIZ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((InterfaceC1839770xyZ) next).getDataType(), interfaceC21435018ua.LIZLLL().get("type"))) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        return (InterfaceC1839770xyZ) next;
                    }

                    @Override // X.AbstractC21434218uS
                    public final CharSequence LIZIZ(AbstractC21434718uX abstractC21434718uX, C21423618sk c21423618sk) {
                        InterfaceC1839770xyZ interfaceC1839770xyZLJ = LJ(abstractC21434718uX);
                        if (interfaceC1839770xyZLJ != null) {
                            interfaceC1839770xyZLJ.LIZJ();
                        }
                        c21423618sk.getClass();
                        String strLIZ = C21423618sk.LIZ(abstractC21434718uX);
                        if (strLIZ == null || strLIZ.length() == 0) {
                            return " ";
                        }
                        return strLIZ;
                    }

                    @Override // X.AbstractC21434218uS
                    public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, C21433418uK c21433418uK, InterfaceC21435018ua interfaceC21435018ua) {
                        Map<String, ? extends Object> map;
                        InterfaceC1839770xyZ interfaceC1839770xyZLJ = LJ(interfaceC21435018ua);
                        if (interfaceC1839770xyZLJ == null) {
                            return;
                        }
                        if (!interfaceC1839770xyZLJ.LIZ(interfaceC21435018ua)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("precheck failed handler ");
                            sbLIZ.append(interfaceC1839770xyZLJ.getClass());
                            sbLIZ.append(", tag ");
                            sbLIZ.append(interfaceC21435018ua);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return;
                        }
                        Object objLIZJ = interfaceC21427218tK.LJIL().LIZJ(C21379618le.LIZLLL);
                        if (objLIZJ instanceof Map) {
                            map = (Map) objLIZJ;
                        } else {
                            map = null;
                        }
                        C21423918sn.LJI(interfaceC21427218tK.builder(), interfaceC1839770xyZLJ.LIZIZ(interfaceC21435018ua, map), interfaceC21435018ua.start(), interfaceC21435018ua.end());
                    }
                }), 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, 0, false, false, 0, false, null, null, false, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -5, 16777215);
            }
            return LJ(LJI(LJII(LIZIZ(LIZ(LIZLLL(LIZJ(LJFF(new C21419418s4(0, 0.0f, false, 1.3f, 0, 0, 0, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, -2049, 16777215), contextLIZIZ, z), contextLIZIZ, z))), contextLIZIZ, z), contextLIZIZ), contextLIZIZ, z));
        }
        return new C21419418s4(0, 0.0f, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, -1, 16777215);
    }

    public static C21419418s4 LJIIIZ(Context context, boolean z) {
        boolean zLIZ = C467860IWi.LIZ(context);
        if (zLIZ && z) {
            C21419418s4 c21419418s4 = LIZ;
            if (c21419418s4 == null) {
                C21419418s4 c21419418s4LJIIIIZZ = LJIIIIZZ(context, true);
                LIZ = c21419418s4LJIIIIZZ;
                return c21419418s4LJIIIIZZ;
            }
            return c21419418s4;
        }
        if (zLIZ) {
            if (!z) {
                C21419418s4 c21419418s42 = LIZIZ;
                if (c21419418s42 != null) {
                    return c21419418s42;
                }
                C21419418s4 c21419418s4LJIIIIZZ2 = LJIIIIZZ(context, false);
                LIZIZ = c21419418s4LJIIIIZZ2;
                return c21419418s4LJIIIIZZ2;
            }
        } else if (z) {
            C21419418s4 c21419418s43 = LIZJ;
            if (c21419418s43 != null) {
                return c21419418s43;
            }
            C21419418s4 c21419418s4LJIIIIZZ3 = LJIIIIZZ(context, true);
            LIZJ = c21419418s4LJIIIIZZ3;
            return c21419418s4LJIIIIZZ3;
        }
        C21419418s4 c21419418s44 = LIZLLL;
        if (c21419418s44 != null) {
            return c21419418s44;
        }
        C21419418s4 c21419418s4LJIIIIZZ4 = LJIIIIZZ(context, false);
        LIZLLL = c21419418s4LJIIIIZZ4;
        return c21419418s4LJIIIIZZ4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21419418s4 LIZIZ(X.C21419418s4 r44, android.content.Context r45, boolean r46) {
        /*
            r2 = 0
            r3 = 0
            r5 = 0
            X.14S0 r9 = new X.14S0
            r0 = 2131100566(0x7f060396, float:1.7813517E38)
            r1 = r45
            if (r46 == 0) goto L86
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L91
            int r10 = r0.intValue()
        L16:
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r11 = X.C814420VxA.LIZIZ(r0)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r12 = X.C814420VxA.LIZIZ(r0)
            r13 = 1
            r14 = r13
            r9.<init>(r10, r11, r12, r13, r14)
            r45 = -32769(0xffffffffffff7fff, float:NaN)
            r46 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r44
            r4 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r3
            r16 = r2
            r17 = r3
            r18 = r3
            r19 = r3
            r20 = r3
            r21 = r3
            r22 = r2
            r23 = r2
            r24 = r3
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r3
            r29 = r3
            r30 = r3
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r3
            r37 = r3
            r38 = r2
            r39 = r2
            r40 = r3
            r41 = r3
            r42 = r3
            r43 = r3
            r44 = r2
            X.18s4 r0 = X.C21419418s4.LIZ(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return r0
        L86:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L91
            int r10 = r0.intValue()
            goto L16
        L91:
            r10 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21379318lb.LIZIZ(X.18s4, android.content.Context, boolean):X.18s4");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21419418s4 LIZJ(X.C21419418s4 r45, android.content.Context r46, boolean r47) {
        /*
            r3 = 0
            r4 = 0
            r6 = 0
            r0 = 2131100628(0x7f0603d4, float:1.7813643E38)
            r1 = r46
            if (r47 == 0) goto L75
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L80
            int r21 = r0.intValue()
        L14:
            X.01GW r0 = X.C21379318lb.LJIIJ
            java.lang.Object r1 = r0.getValue()
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            X.01GW r0 = X.C21379318lb.LJIIIZ
            java.lang.Object r0 = r0.getValue()
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r46 = 1073741823(0x3fffffff, float:1.9999999)
            r47 = 16777209(0xfffff9, float:2.3509877E-38)
            r2 = r45
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r3
            r11 = r3
            r12 = r3
            r13 = r3
            r14 = r3
            r15 = r3
            r16 = r4
            r17 = r3
            r18 = r4
            r19 = r4
            r20 = r4
            r22 = r4
            r23 = r1
            r24 = r0
            r25 = r4
            r26 = r3
            r27 = r3
            r28 = r3
            r29 = r4
            r30 = r4
            r31 = r4
            r32 = r3
            r33 = r3
            r34 = r3
            r35 = r3
            r36 = r3
            r37 = r4
            r38 = r4
            r39 = r3
            r40 = r3
            r41 = r4
            r42 = r4
            r43 = r4
            r44 = r4
            r45 = r3
            X.18s4 r0 = X.C21419418s4.LIZ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            return r0
        L75:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L80
            int r21 = r0.intValue()
            goto L14
        L80:
            r21 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21379318lb.LIZJ(X.18s4, android.content.Context, boolean):X.18s4");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21419418s4 LJFF(X.C21419418s4 r48, android.content.Context r49, boolean r50) {
        /*
            r6 = 0
            r7 = 0
            r9 = 0
            X.18lm r3 = new X.18lm
            r4 = 2131100624(0x7f0603d0, float:1.7813635E38)
            r5 = r49
            if (r50 == 0) goto L89
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r4, r5)
            if (r0 == 0) goto L94
            int r2 = r0.intValue()
        L16:
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r4, r5)
            if (r0 == 0) goto L87
            int r0 = r0.intValue()
        L2e:
            r3.<init>(r2, r1, r0, r7)
            r49 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r50 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r48
            r8 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r7
            r20 = r3
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r6
            r27 = r6
            r28 = r7
            r29 = r6
            r30 = r6
            r31 = r6
            r32 = r7
            r33 = r7
            r34 = r7
            r35 = r6
            r36 = r6
            r37 = r6
            r38 = r6
            r39 = r6
            r40 = r7
            r41 = r7
            r42 = r6
            r43 = r6
            r44 = r7
            r45 = r7
            r46 = r7
            r47 = r7
            r48 = r6
            X.18s4 r0 = X.C21419418s4.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return r0
        L87:
            r0 = 0
            goto L2e
        L89:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r4, r5)
            if (r0 == 0) goto L94
            int r2 = r0.intValue()
            goto L16
        L94:
            r2 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21379318lb.LJFF(X.18s4, android.content.Context, boolean):X.18s4");
    }

    public static C21419418s4 LJI(C21419418s4 c21419418s4, Context context, boolean z) {
        C689270R1x c689270R1x = new C689270R1x();
        c689270R1x.LIZLLL = ((Number) LJFF.invoke(context, Boolean.valueOf(z))).intValue();
        c689270R1x.LIZ = ((Number) LJI.invoke(context, Boolean.valueOf(z))).intValue();
        int i = LJII;
        c689270R1x.LIZIZ = i;
        return C21419418s4.LIZ(c21419418s4, null, 0, false, 0.0f, 0, 0, 0, null, new C21408418qI(c689270R1x, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0, C418440Gaw.LIZIZ(15), C418440Gaw.LIZIZ(12), 0.0f, 0.0f, ((Number) LJ.invoke(context)).intValue(), new C1860120yVO(), 0, true, false, (Typeface) LJIIIIZZ.getValue(), (Typeface) LJIIJJI.getValue(), 1, 0, 2234816), null, null, null, null, false, null, 0, false, false, 0, false, null, null, false, null, null, new TableConfig(false, null, null, null, null, null, null, null, null, "", null, null, null, null, null, null, false, null, false, true, TitleStyle.LARGE, null, null, true), false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -131073, 16777151);
    }
}
