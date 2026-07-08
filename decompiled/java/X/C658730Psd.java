package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Psd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C658730Psd implements InterfaceC658750Psf {
    public static final /* synthetic */ int LLJILLL = 0;
    public final int LL;
    public final Aweme LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final float LLILZLL;
    public final int LLIZ;
    public final InterfaceC658750Psf LLIZLLLIL;
    public Function1<? super JSONObject, ? extends Map<String, String>> LLJ;
    public final boolean LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;

    public C658730Psd() {
        this(0, null, null, null, false, 0.0f, 0, null, false, 1023);
    }

    @Override // X.InterfaceC658750Psf
    public void Ck(JSONObject jSONObject) {
        ISearchContextAbility iSearchContextAbilityLIZJ;
        boolean zOptBoolean = jSONObject.optBoolean("isSuccess");
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null && (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) != null) {
            iSearchContextAbilityLIZJ.fe(new C641710PEz(zOptBoolean));
        }
        if (zOptBoolean || this.LLJI) {
            LIZ(true, jSONObject, true, this.LLILZIL);
        }
        InterfaceC658750Psf interfaceC658750Psf = this.LLIZLLLIL;
        if (interfaceC658750Psf != null) {
            interfaceC658750Psf.Ck(jSONObject);
        }
        C0Q50.LIZIZ(this.LL, jSONObject, zOptBoolean);
        int i = this.LL;
        int i2 = C04QM.LIZ;
        if (i2 > 0) {
            if (!zOptBoolean && (i2 != 2 || C1334270kpF.LIZ(jSONObject))) {
                C0Q45 c0q45 = C0Q45.COMMON;
                EnumC664420Q4i enumC664420Q4i = EnumC664420Q4i.IMAGE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("search image load failed, sensible, rank ");
                sbLIZ.append(i);
                C664410Q4h.LIZIZ(c0q45, enumC664420Q4i, null, C2188811AlT.LIZIZ(sbLIZ), C1334270kpF.LIZIZ(jSONObject), C2097608Jq.LJ(), "search");
            }
            Integer numValueOf = Integer.valueOf(jSONObject.optInt("duration"));
            if (numValueOf != null && numValueOf.intValue() > 1000) {
                C0Q45 c0q452 = C0Q45.COMMON;
                EnumC664420Q4i enumC664420Q4i2 = EnumC664420Q4i.IMAGE;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("search image load too long, sensible, rank ");
                sbLIZ2.append(i);
                sbLIZ2.append(" duration ");
                sbLIZ2.append(numValueOf);
                C664410Q4h.LIZIZ(c0q452, enumC664420Q4i2, null, C2188811AlT.LIZIZ(sbLIZ2), C1334270kpF.LIZIZ(jSONObject), C2097608Jq.LJ(), "search");
            }
        }
    }

    @Override // X.InterfaceC658750Psf
    public void onImageLoaded(boolean z, String str, JSONObject jSONObject) throws JSONException {
        String strOptString;
        Integer numValueOf;
        String strOptString2;
        if (((Boolean) C0BDJ.LIZ.getValue()).booleanValue() && jSONObject != null) {
            jSONObject.put("isSuccess", z);
        }
        LIZ(z, jSONObject, false, this.LLILZIL);
        if (jSONObject != null) {
            strOptString = jSONObject.optString("uri");
        } else {
            strOptString = null;
        }
        if (!C2093608Ic.LJ(strOptString)) {
            C1334280kpG.LIZ.getClass();
            ConcurrentLinkedDeque<String> concurrentLinkedDeque = C1334280kpG.LIZLLL;
            if (concurrentLinkedDeque != null) {
                if (concurrentLinkedDeque.size() >= C1334280kpG.LJ) {
                    concurrentLinkedDeque.removeFirst();
                    concurrentLinkedDeque.addLast(strOptString);
                } else {
                    concurrentLinkedDeque.addLast(strOptString);
                }
            }
        }
        InterfaceC658750Psf interfaceC658750Psf = this.LLIZLLLIL;
        if (interfaceC658750Psf != null) {
            interfaceC658750Psf.onImageLoaded(z, str, jSONObject);
        }
        if (C07HN.LIZ == 1 && jSONObject != null && (strOptString2 = jSONObject.optString("image_quality")) != null) {
            int iHashCode = strOptString2.hashCode();
            if (iHashCode != -2001690218) {
                if (iHashCode != -641650368) {
                    if (iHashCode == -260103383 && strOptString2.equals("transparent_suspected")) {
                        C0Q50.LIZ(new C666110QAv(205, "transparent_suspected"), jSONObject);
                    }
                } else if (strOptString2.equals("white_suspected")) {
                    C0Q50.LIZ(new C666110QAv(203, "white_suspected"), jSONObject);
                }
            } else if (strOptString2.equals("black_suspected")) {
                C0Q50.LIZ(new C666110QAv(204, "black_suspected"), jSONObject);
            }
        }
        int i = C04QM.LIZ;
        if (i > 0) {
            if (!z && (i != 2 || C1334270kpF.LIZ(jSONObject))) {
                C0Q45 c0q45 = C0Q45.COMMON;
                EnumC664420Q4i enumC664420Q4i = EnumC664420Q4i.IMAGE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("search image load failed, network loaded, requestId ");
                sbLIZ.append(str);
                C664410Q4h.LIZIZ(c0q45, enumC664420Q4i, null, C2188811AlT.LIZIZ(sbLIZ), C1334270kpF.LIZIZ(jSONObject), C2097608Jq.LJ(), "search");
            }
            if (jSONObject != null && (numValueOf = Integer.valueOf(jSONObject.optInt("duration"))) != null && numValueOf.intValue() > 1000) {
                C0Q45 c0q452 = C0Q45.COMMON;
                EnumC664420Q4i enumC664420Q4i2 = EnumC664420Q4i.IMAGE;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("search image load too long, network loaded, requestId ");
                sbLIZ2.append(str);
                sbLIZ2.append(", duration ");
                sbLIZ2.append(numValueOf);
                C664410Q4h.LIZIZ(c0q452, enumC664420Q4i2, null, C2188811AlT.LIZIZ(sbLIZ2), C1334270kpF.LIZIZ(jSONObject), C2097608Jq.LJ(), "search");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r35, org.json.JSONObject r36, boolean r37, boolean r38) {
        /*
            r34 = this;
            X.01GW r0 = X.C302000Bsc.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto Lbe
            r1 = 1
        L12:
            java.lang.String r24 = ""
            r0 = 0
            r17 = r38
            r16 = r37
            r11 = r36
            r10 = r35
            r8 = r34
            if (r1 != 0) goto L2a
            X.0kpG r1 = X.C1334280kpG.LIZ
            r1.getClass()
            boolean r1 = X.C1334280kpG.LIZIZ
            if (r1 == 0) goto L64
        L2a:
            X.0kpG r7 = X.C1334280kpG.LIZ
            int r12 = r8.LL
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.LLILLJJLI
            if (r1 == 0) goto L38
            java.lang.String r13 = r1.getAid()
            if (r13 != 0) goto L3a
        L38:
            r13 = r24
        L3a:
            java.lang.Integer r14 = r8.LLILLL
            java.lang.String r15 = r8.LLILZ
            float r6 = r8.LLILZLL
            int r5 = r8.LLIZ
            java.lang.String r4 = r8.LLJIJIL
            java.lang.String r3 = r8.LLJILJIL
            kotlin.jvm.functions.Function1<? super org.json.JSONObject, ? extends java.util.Map<java.lang.String, java.lang.String>> r1 = r8.LLJ
            if (r1 == 0) goto Lbc
            java.lang.Object r2 = r1.invoke(r11)
            java.util.Map r2 = (java.util.Map) r2
        L50:
            boolean r1 = r8.LLJILJILJ
            r7.getClass()
            r18 = r6
            r19 = r5
            r20 = r4
            r21 = r3
            r22 = r2
            r23 = r1
            X.C1334280kpG.LIZ(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L64:
            com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService r2 = X.C1255704vj.LIZ()
            if (r11 == 0) goto Lba
            java.lang.String r1 = "biz_tag"
            java.lang.String r1 = r11.optString(r1)
        L70:
            boolean r1 = r2.LJIJI(r1)
            if (r1 == 0) goto Lb9
            com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService r20 = X.C1255704vj.LIZ()
            int r9 = r8.LL
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.LLILLJJLI
            if (r1 == 0) goto L88
            java.lang.String r1 = r1.getAid()
            if (r1 == 0) goto L88
            r24 = r1
        L88:
            java.lang.Integer r7 = r8.LLILLL
            java.lang.String r6 = r8.LLILZ
            float r5 = r8.LLILZLL
            int r4 = r8.LLIZ
            java.lang.String r3 = r8.LLJIJIL
            java.lang.String r2 = r8.LLJILJIL
            kotlin.jvm.functions.Function1<? super org.json.JSONObject, ? extends java.util.Map<java.lang.String, java.lang.String>> r1 = r8.LLJ
            if (r1 == 0) goto L9e
            java.lang.Object r0 = r1.invoke(r11)
            java.util.Map r0 = (java.util.Map) r0
        L9e:
            r21 = r10
            r22 = r11
            r23 = r9
            r25 = r7
            r26 = r6
            r27 = r16
            r28 = r17
            r29 = r5
            r30 = r4
            r31 = r3
            r32 = r2
            r33 = r0
            r20.LJJII(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        Lb9:
            return
        Lba:
            r1 = r0
            goto L70
        Lbc:
            r2 = r0
            goto L50
        Lbe:
            r1 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C658730Psd.LIZ(boolean, org.json.JSONObject, boolean, boolean):void");
    }

    public C658730Psd(int i, Aweme aweme, Integer num, String str, boolean z, float f, int i2, InterfaceC658750Psf interfaceC658750Psf, boolean z2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        aweme = (i3 & 2) != 0 ? null : aweme;
        num = (i3 & 4) != 0 ? null : num;
        str = (i3 & 8) != 0 ? "" : str;
        z = (i3 & 16) != 0 ? false : z;
        f = (i3 & 32) != 0 ? 0.0f : f;
        i2 = (i3 & 64) != 0 ? 1 : i2;
        interfaceC658750Psf = (i3 & 128) != 0 ? null : interfaceC658750Psf;
        z2 = (i3 & 512) != 0 ? false : z2;
        this.LL = i;
        this.LLILLJJLI = aweme;
        this.LLILLL = num;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = f;
        this.LLIZ = i2;
        this.LLIZLLLIL = interfaceC658750Psf;
        this.LLJ = null;
        this.LLJI = z2;
        this.LLJIJIL = "";
        this.LLJILJIL = "";
    }
}
