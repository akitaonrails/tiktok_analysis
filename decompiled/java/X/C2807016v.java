package X;

import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfTranslationsEndEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfTranslationsStartEvent;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2807016v implements C162U {
    public final C00I7 LIZ;
    public final C0278007o LIZIZ;
    public final Function0<Long> LIZJ;
    public Function0<Unit> LIZLLL;
    public Function1<? super Integer, Unit> LJ;
    public Long LJFF;
    public final C017C LJI;

    @Override // X.C162U
    public final String LIZLLL() {
        return this.LIZIZ.LLILLJJLI;
    }

    public final int LJ() {
        Long l = this.LJFF;
        if (l == null) {
            return 0;
        }
        return (int) (this.LIZJ.invoke().longValue() - l.longValue());
    }

    @Override // X.C162U
    public final void onStart() {
        this.LJFF = this.LIZJ.invoke();
        C207069161b.LJ(ClaPerfTranslationsStartEvent.class, this.LJI, new AnonymousClass0175(), null, 24);
        C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadStart, awemeId: ");
        C00I7 c00i7 = this.LIZ;
        sbLIZ.append(c00i7 != null ? c00i7.LL : null);
        sbLIZ.append(", commonParams: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", overallStartParams: ");
        sbLIZ.append(this.LIZIZ);
        C0SZC.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        Function0<Unit> function0 = this.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
        if (C017O.LIZ()) {
            this.LIZLLL = null;
        }
    }

    @Override // X.C162U
    public final void LIZ(C162V c162v) {
        String str;
        if (this.LJFF != null) {
            final int value = c162v.getValue();
            final int iLJ = LJ();
            InterfaceC0241006d interfaceC0241006d = new InterfaceC0241006d(value, iLJ) { // from class: X.003Y
                public final int LL;
                public final int LLILLJJLI;

                @Override // X.InterfaceC1282004zy
                public final boolean checkExtraParamKey() {
                    return false;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C003Y)) {
                        return false;
                    }
                    C003Y c003y = (C003Y) obj;
                    return this.LL == c003y.LL && this.LLILLJJLI == c003y.LLILLJJLI;
                }

                public final int hashCode() {
                    return (this.LL * 31) + this.LLILLJJLI;
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> keyParams() {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("result_code", Integer.valueOf(this.LL));
                    linkedHashMap.put("duration", Integer.valueOf(this.LLILLJJLI));
                    return linkedHashMap;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PerfOverallTranslationEndParams(resultCode=");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(", duration=");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> filteredParams() {
                    return keyParams();
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> getExtraParam() {
                    return C2097608Jq.LJ();
                }

                {
                    this.LL = value;
                    this.LLILLJJLI = iLJ;
                }
            };
            this.LJI.LIZIZ(interfaceC0241006d);
            C207069161b.LJ(ClaPerfTranslationsEndEvent.class, this.LJI, new AnonymousClass0175(), null, 24);
            C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadEnd, awemeId: ");
            C00I7 c00i7 = this.LIZ;
            if (c00i7 != null) {
                str = c00i7.LL;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(", commonParams: ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", overallStartParams: ");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", perfOverallTranslationEndParams: ");
            sbLIZ.append(interfaceC0241006d);
            C0SZC.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            Function1<? super Integer, Unit> function1 = this.LJ;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(LJ()));
            }
            if (C017O.LIZ()) {
                this.LJ = null;
            }
        }
    }

    public C2807016v(C00I7 c00i7, C0278007o c0278007o, C162G c162g, Function0 function0, Function1 function1) {
        this.LIZ = c00i7;
        this.LIZIZ = c0278007o;
        this.LIZJ = c162g;
        this.LIZLLL = function0;
        this.LJ = function1;
        C017C c017c = new C017C();
        c017c.LIZIZ(c00i7);
        c017c.LIZIZ(c0278007o);
        this.LJI = c017c;
    }

    @Override // X.C162U
    public final void LIZJ(EnumC207100162g enumC207100162g, EnumC1782690wUV enumC1782690wUV, final String str, final Integer num, final String str2, final String str3) {
        final Long lLJIILIIL;
        switch (C207103162j.LIZ[enumC207100162g.ordinal()]) {
            case 1:
                C017C c017c = this.LJI;
                final int value = enumC1782690wUV.getValue();
                c017c.LIZIZ(new InterfaceC0241006d(str, value) { // from class: X.004Y
                    public final String LL;
                    public final int LLILLJJLI;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C004Y)) {
                            return false;
                        }
                        C004Y c004y = (C004Y) obj;
                        return Intrinsics.LJFF(this.LL, c004y.LL) && this.LLILLJJLI == c004y.LLILLJJLI;
                    }

                    public final int hashCode() {
                        String str4 = this.LL;
                        return ((str4 == null ? 0 : str4.hashCode()) * 31) + this.LLILLJJLI;
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("caption_original_language", this.LL);
                        linkedHashMap.put("realtime_caption_stat", Integer.valueOf(this.LLILLJJLI));
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfRTCaptionTranslationStartParams(originalLang=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", status=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str;
                        this.LLILLJJLI = value;
                    }
                });
                break;
            case 2:
                C017C c017c2 = this.LJI;
                final int value2 = enumC1782690wUV.getValue();
                c017c2.LIZIZ(new InterfaceC0241006d(str, value2) { // from class: X.004X
                    public final String LL;
                    public final int LLILLJJLI;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C004X)) {
                            return false;
                        }
                        C004X c004x = (C004X) obj;
                        return Intrinsics.LJFF(this.LL, c004x.LL) && this.LLILLJJLI == c004x.LLILLJJLI;
                    }

                    public final int hashCode() {
                        String str4 = this.LL;
                        return ((str4 == null ? 0 : str4.hashCode()) * 31) + this.LLILLJJLI;
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("caption_original_language", this.LL);
                        linkedHashMap.put("offline_caption_stat", Integer.valueOf(this.LLILLJJLI));
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfOfflineCaptionTranslationStartParams(originalLang=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", status=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str;
                        this.LLILLJJLI = value2;
                    }
                });
                break;
            case 3:
                C017C c017c3 = this.LJI;
                final int value3 = enumC1782690wUV.getValue();
                c017c3.LIZIZ(new InterfaceC0241006d(str, value3, num) { // from class: X.00Fy
                    public final String LL;
                    public final int LLILLJJLI;
                    public final Integer LLILLL;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C049600Fy)) {
                            return false;
                        }
                        C049600Fy c049600Fy = (C049600Fy) obj;
                        return Intrinsics.LJFF(this.LL, c049600Fy.LL) && this.LLILLJJLI == c049600Fy.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c049600Fy.LLILLL);
                    }

                    public final int hashCode() {
                        String str4 = this.LL;
                        int iHashCode = (((str4 == null ? 0 : str4.hashCode()) * 31) + this.LLILLJJLI) * 31;
                        Integer num2 = this.LLILLL;
                        return iHashCode + (num2 != null ? num2.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("desc_original_language", this.LL);
                        linkedHashMap.put("desc_stat", Integer.valueOf(this.LLILLJJLI));
                        linkedHashMap.put("desc_original_size", this.LLILLL);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfDescTranslationStartParams(originalLang=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", status=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", originalSize=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str;
                        this.LLILLJJLI = value3;
                        this.LLILLL = num;
                    }
                });
                break;
            case 4:
                C017C c017c4 = this.LJI;
                final int value4 = enumC1782690wUV.getValue();
                c017c4.LIZIZ(new InterfaceC0241006d(str, value4, num) { // from class: X.00Fx
                    public final String LL;
                    public final int LLILLJJLI;
                    public final Integer LLILLL;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C049500Fx)) {
                            return false;
                        }
                        C049500Fx c049500Fx = (C049500Fx) obj;
                        return Intrinsics.LJFF(this.LL, c049500Fx.LL) && this.LLILLJJLI == c049500Fx.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c049500Fx.LLILLL);
                    }

                    public final int hashCode() {
                        String str4 = this.LL;
                        int iHashCode = (((str4 == null ? 0 : str4.hashCode()) * 31) + this.LLILLJJLI) * 31;
                        Integer num2 = this.LLILLL;
                        return iHashCode + (num2 != null ? num2.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("sticker_original_language", this.LL);
                        linkedHashMap.put("sticker_stat", Integer.valueOf(this.LLILLJJLI));
                        linkedHashMap.put("sticker_original_size", this.LLILLL);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfStickerTranslationStartParams(originalLang=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", status=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", originalSize=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str;
                        this.LLILLJJLI = value4;
                        this.LLILLL = num;
                    }
                });
                break;
            case 5:
                C017C c017c5 = this.LJI;
                final int value5 = enumC1782690wUV.getValue();
                c017c5.LIZIZ(new InterfaceC0241006d(str, value5, num) { // from class: X.00Fz
                    public final String LL;
                    public final int LLILLJJLI;
                    public final Integer LLILLL;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C049700Fz)) {
                            return false;
                        }
                        C049700Fz c049700Fz = (C049700Fz) obj;
                        return Intrinsics.LJFF(this.LL, c049700Fz.LL) && this.LLILLJJLI == c049700Fz.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c049700Fz.LLILLL);
                    }

                    public final int hashCode() {
                        String str4 = this.LL;
                        int iHashCode = (((str4 == null ? 0 : str4.hashCode()) * 31) + this.LLILLJJLI) * 31;
                        Integer num2 = this.LLILLL;
                        return iHashCode + (num2 != null ? num2.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("photo_title_original_language", this.LL);
                        linkedHashMap.put("photo_title_stat", Integer.valueOf(this.LLILLJJLI));
                        linkedHashMap.put("photo_title_original_size", this.LLILLL);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfPhotoTitleTranslationStartParams(originalLang=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", status=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", originalSize=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str;
                        this.LLILLJJLI = value5;
                        this.LLILLL = num;
                    }
                });
                break;
            case 6:
                C017C c017c6 = this.LJI;
                final int value6 = enumC1782690wUV.getValue();
                c017c6.LIZIZ(new InterfaceC0241006d(value6) { // from class: X.003W
                    public final int LL;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C003W) && this.LL == ((C003W) obj).LL;
                    }

                    public final int hashCode() {
                        return this.LL;
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("comments_stat", Integer.valueOf(this.LL));
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfCommentTranslationStartParams(status=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = value6;
                    }
                });
                break;
            case 7:
                C017C c017c7 = this.LJI;
                final int value7 = enumC1782690wUV.getValue();
                c017c7.LIZIZ(new InterfaceC0241006d(str, value7) { // from class: X.0040
                    public final String LL;
                    public final int LLILLJJLI;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof AnonymousClass0040)) {
                            return false;
                        }
                        AnonymousClass0040 anonymousClass0040 = (AnonymousClass0040) obj;
                        return Intrinsics.LJFF(this.LL, anonymousClass0040.LL) && this.LLILLJJLI == anonymousClass0040.LLILLJJLI;
                    }

                    public final int hashCode() {
                        String str4 = this.LL;
                        return ((str4 == null ? 0 : str4.hashCode()) * 31) + this.LLILLJJLI;
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("photo_text_original_language", this.LL);
                        linkedHashMap.put("photo_text_offline_stat", Integer.valueOf(this.LLILLJJLI));
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfPhotoTextTranslationStartParams(photoTextOriginalLang=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", status=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str;
                        this.LLILLJJLI = value7;
                    }
                });
                break;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                C017C c017c8 = this.LJI;
                if (str2 != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                } else {
                    lLJIILIIL = null;
                }
                final Integer numValueOf = Integer.valueOf(enumC1782690wUV.getValue());
                c017c8.LIZIZ(new InterfaceC0241006d(lLJIILIIL, str3, numValueOf) { // from class: X.003U
                    public final Long LL;
                    public final String LLILLJJLI;
                    public final Integer LLILLL;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C003U)) {
                            return false;
                        }
                        C003U c003u = (C003U) obj;
                        return Intrinsics.LJFF(this.LL, c003u.LL) && Intrinsics.LJFF(this.LLILLJJLI, c003u.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c003u.LLILLL);
                    }

                    public final int hashCode() {
                        Long l = this.LL;
                        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
                        String str4 = this.LLILLJJLI;
                        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
                        Integer num2 = this.LLILLL;
                        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("ad_id", this.LL);
                        linkedHashMap.put("creative_id", this.LLILLJJLI);
                        linkedHashMap.put("ads_component_stat", this.LLILLL);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfAdsComponentTranslationStartParams(adId=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", creativeId=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", status=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = lLJIILIIL;
                        this.LLILLJJLI = str3;
                        this.LLILLL = numValueOf;
                    }
                });
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C017C c017c9 = this.LJI;
                final Integer numValueOf2 = Integer.valueOf(enumC1782690wUV.getValue());
                final String etName = enumC207100162g.getEtName();
                c017c9.LIZIZ(new InterfaceC0241006d(str2, str, numValueOf2, etName) { // from class: X.0072
                    public final String LL;
                    public final String LLILLJJLI;
                    public final Integer LLILLL;
                    public final String LLILZ;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof AnonymousClass0072)) {
                            return false;
                        }
                        AnonymousClass0072 anonymousClass0072 = (AnonymousClass0072) obj;
                        return Intrinsics.LJFF(this.LL, anonymousClass0072.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0072.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, anonymousClass0072.LLILLL) && Intrinsics.LJFF(this.LLILZ, anonymousClass0072.LLILZ);
                    }

                    public final int hashCode() {
                        String str4 = this.LL;
                        int iHashCode = (str4 == null ? 0 : str4.hashCode()) * 31;
                        String str5 = this.LLILLJJLI;
                        int iHashCode2 = (iHashCode + (str5 == null ? 0 : str5.hashCode())) * 31;
                        Integer num2 = this.LLILLL;
                        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                        String str6 = this.LLILZ;
                        return iHashCode3 + (str6 != null ? str6.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("biz_comp_id", this.LL);
                        linkedHashMap.put("biz_comp_original_lang", this.LLILLJJLI);
                        linkedHashMap.put("biz_comp_stat", this.LLILLL);
                        linkedHashMap.put("biz_comp_scene", this.LLILZ);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfBizCompTranslationStartParams(id=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", originalLang=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", status=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(", scene=");
                        sbLIZ.append(this.LLILZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str2;
                        this.LLILLJJLI = str;
                        this.LLILLL = numValueOf2;
                        this.LLILZ = etName;
                    }
                });
                break;
        }
    }

    @Override // X.C162U
    public final void LIZIZ(EnumC207100162g enumC207100162g, boolean z, boolean z2, final Integer num, final String str, final Integer num2, final String str2, final Integer num3, final Integer num4, String str3, final String str4, final String str5, Boolean bool, final String str6) {
        final Long lLJIILIIL = null;
        str = null;
        String str7 = null;
        str = null;
        final String str8 = null;
        str = null;
        String str9 = null;
        str = null;
        String str10 = null;
        str = null;
        final String str11 = null;
        int i = 2;
        switch (C207103162j.LIZ[enumC207100162g.ordinal()]) {
            case 1:
                C017C c017c = this.LJI;
                if (z) {
                    i = 1;
                }
                int iLJ = LJ();
                if (str3 != null && str3.length() != 0) {
                    str7 = str3;
                }
                final Integer numValueOf = Integer.valueOf(i);
                final Integer numValueOf2 = Integer.valueOf(iLJ);
                final Integer numValueOf3 = Integer.valueOf(z2 ? 1 : 0);
                final String str12 = str7;
                c017c.LIZIZ(new InterfaceC0241006d(str, num, numValueOf, str2, str12, numValueOf2, num2, numValueOf3, num3, num4) { // from class: X.016y
                    public final Integer LL;
                    public final Integer LLILLJJLI;
                    public final Integer LLILLL;
                    public final String LLILZ;
                    public final Integer LLILZIL;
                    public final Integer LLILZLL;
                    public final String LLIZ;
                    public final Integer LLIZLLLIL;
                    public final Integer LLJ;
                    public final String LLJI;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C2810016y)) {
                            return false;
                        }
                        C2810016y c2810016y = (C2810016y) obj;
                        return Intrinsics.LJFF(this.LL, c2810016y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2810016y.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2810016y.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2810016y.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2810016y.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2810016y.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2810016y.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2810016y.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c2810016y.LLJ) && Intrinsics.LJFF(this.LLJI, c2810016y.LLJI);
                    }

                    public final int hashCode() {
                        Integer num5 = this.LL;
                        int iHashCode = (num5 == null ? 0 : num5.hashCode()) * 31;
                        Integer num6 = this.LLILLJJLI;
                        int iHashCode2 = (iHashCode + (num6 == null ? 0 : num6.hashCode())) * 31;
                        Integer num7 = this.LLILLL;
                        int iHashCode3 = (iHashCode2 + (num7 == null ? 0 : num7.hashCode())) * 31;
                        String str13 = this.LLILZ;
                        int iHashCode4 = (iHashCode3 + (str13 == null ? 0 : str13.hashCode())) * 31;
                        Integer num8 = this.LLILZIL;
                        int iHashCode5 = (iHashCode4 + (num8 == null ? 0 : num8.hashCode())) * 31;
                        Integer num9 = this.LLILZLL;
                        int iHashCode6 = (iHashCode5 + (num9 == null ? 0 : num9.hashCode())) * 31;
                        String str14 = this.LLIZ;
                        int iHashCode7 = (iHashCode6 + (str14 == null ? 0 : str14.hashCode())) * 31;
                        Integer num10 = this.LLIZLLLIL;
                        int iHashCode8 = (iHashCode7 + (num10 == null ? 0 : num10.hashCode())) * 31;
                        Integer num11 = this.LLJ;
                        int iHashCode9 = (iHashCode8 + (num11 == null ? 0 : num11.hashCode())) * 31;
                        String str15 = this.LLJI;
                        return iHashCode9 + (str15 != null ? str15.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("realtime_caption_translated_size", this.LL);
                        linkedHashMap.put("realtime_caption_result", this.LLILLJJLI);
                        linkedHashMap.put("realtime_caption_duration", this.LLILLL);
                        linkedHashMap.put("realtime_caption_msg", this.LLILZ);
                        linkedHashMap.put("realtime_caption_error_code", this.LLILZIL);
                        linkedHashMap.put("realtime_caption_hit_preload", this.LLILZLL);
                        linkedHashMap.put("realtime_caption_hit_cache", this.LLIZ);
                        linkedHashMap.put("realtime_caption_server_duration", this.LLIZLLLIL);
                        linkedHashMap.put("realtime_caption_ailab_duration", this.LLJ);
                        linkedHashMap.put("realtime_caption_variant", this.LLJI);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfRTCaptionTranslationEndParams(translatedSize=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", result=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", duration=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(", failureMsg=");
                        sbLIZ.append(this.LLILZ);
                        sbLIZ.append(", errorCode=");
                        sbLIZ.append(this.LLILZIL);
                        sbLIZ.append(", hitPreload=");
                        sbLIZ.append(this.LLILZLL);
                        sbLIZ.append(", hitCacheType=");
                        sbLIZ.append(this.LLIZ);
                        sbLIZ.append(", serverDuration=");
                        sbLIZ.append(this.LLIZLLLIL);
                        sbLIZ.append(", ailabDuration=");
                        sbLIZ.append(this.LLJ);
                        sbLIZ.append(", variant=");
                        sbLIZ.append(this.LLJI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = num;
                        this.LLILLJJLI = numValueOf;
                        this.LLILLL = numValueOf2;
                        this.LLILZ = str;
                        this.LLILZIL = num2;
                        this.LLILZLL = numValueOf3;
                        this.LLIZ = str2;
                        this.LLIZLLLIL = num3;
                        this.LLJ = num4;
                        this.LLJI = str12;
                    }
                });
                break;
            case 2:
                C017C c017c2 = this.LJI;
                if (str3 != null && str3.length() != 0) {
                    str8 = str3;
                }
                c017c2.LIZIZ(new InterfaceC0241006d(str8) { // from class: X.003V
                    public final String LL;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C003V) && Intrinsics.LJFF(this.LL, ((C003V) obj).LL);
                    }

                    public final int hashCode() {
                        String str13 = this.LL;
                        if (str13 == null) {
                            return 0;
                        }
                        return str13.hashCode();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("offline_caption_variant", this.LL);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfOfflineCaptionTranslationEndParams(variant=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str8;
                    }
                });
                break;
            case 3:
                C017C c017c3 = this.LJI;
                if (z) {
                    i = 1;
                }
                int iLJ2 = LJ();
                if (str3 != null && str3.length() != 0) {
                    str9 = str3;
                }
                final Integer numValueOf4 = Integer.valueOf(i);
                final Integer numValueOf5 = Integer.valueOf(iLJ2);
                final Integer numValueOf6 = Integer.valueOf(z2 ? 1 : 0);
                final String str13 = str9;
                c017c3.LIZIZ(new InterfaceC0241006d(str, num, numValueOf4, str13, str2, numValueOf5, num2, num3, num4, numValueOf6) { // from class: X.016z
                    public final Integer LL;
                    public final Integer LLILLJJLI;
                    public final Integer LLILLL;
                    public final String LLILZ;
                    public final Integer LLILZIL;
                    public final String LLILZLL;
                    public final String LLIZ;
                    public final Integer LLIZLLLIL;
                    public final Integer LLJ;
                    public final Integer LLJI;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C2811016z)) {
                            return false;
                        }
                        C2811016z c2811016z = (C2811016z) obj;
                        return Intrinsics.LJFF(this.LL, c2811016z.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2811016z.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2811016z.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2811016z.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2811016z.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2811016z.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2811016z.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2811016z.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c2811016z.LLJ) && Intrinsics.LJFF(this.LLJI, c2811016z.LLJI);
                    }

                    public final int hashCode() {
                        Integer num5 = this.LL;
                        int iHashCode = (num5 == null ? 0 : num5.hashCode()) * 31;
                        Integer num6 = this.LLILLJJLI;
                        int iHashCode2 = (iHashCode + (num6 == null ? 0 : num6.hashCode())) * 31;
                        Integer num7 = this.LLILLL;
                        int iHashCode3 = (iHashCode2 + (num7 == null ? 0 : num7.hashCode())) * 31;
                        String str14 = this.LLILZ;
                        int iHashCode4 = (iHashCode3 + (str14 == null ? 0 : str14.hashCode())) * 31;
                        Integer num8 = this.LLILZIL;
                        int iHashCode5 = (iHashCode4 + (num8 == null ? 0 : num8.hashCode())) * 31;
                        String str15 = this.LLILZLL;
                        int iHashCode6 = (iHashCode5 + (str15 == null ? 0 : str15.hashCode())) * 31;
                        String str16 = this.LLIZ;
                        int iHashCode7 = (iHashCode6 + (str16 == null ? 0 : str16.hashCode())) * 31;
                        Integer num9 = this.LLIZLLLIL;
                        int iHashCode8 = (iHashCode7 + (num9 == null ? 0 : num9.hashCode())) * 31;
                        Integer num10 = this.LLJ;
                        int iHashCode9 = (iHashCode8 + (num10 == null ? 0 : num10.hashCode())) * 31;
                        Integer num11 = this.LLJI;
                        return iHashCode9 + (num11 != null ? num11.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("desc_translated_size", this.LL);
                        linkedHashMap.put("desc_result", this.LLILLJJLI);
                        linkedHashMap.put("description_duration", this.LLILLL);
                        linkedHashMap.put("description_msg", this.LLILZ);
                        linkedHashMap.put("desc_error_code", this.LLILZIL);
                        linkedHashMap.put("desc_variant", this.LLILZLL);
                        linkedHashMap.put("desc_hit_cache", this.LLIZ);
                        linkedHashMap.put("desc_server_duration", this.LLIZLLLIL);
                        linkedHashMap.put("desc_ailab_duration", this.LLJ);
                        linkedHashMap.put("desc_hit_preload", this.LLJI);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfDescTranslationEndParams(translatedSize=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", result=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", duration=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(", failureMsg=");
                        sbLIZ.append(this.LLILZ);
                        sbLIZ.append(", errorCode=");
                        sbLIZ.append(this.LLILZIL);
                        sbLIZ.append(", variant=");
                        sbLIZ.append(this.LLILZLL);
                        sbLIZ.append(", hitCacheType=");
                        sbLIZ.append(this.LLIZ);
                        sbLIZ.append(", serverDuration=");
                        sbLIZ.append(this.LLIZLLLIL);
                        sbLIZ.append(", ailabDuration=");
                        sbLIZ.append(this.LLJ);
                        sbLIZ.append(", hitPreload=");
                        sbLIZ.append(this.LLJI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = num;
                        this.LLILLJJLI = numValueOf4;
                        this.LLILLL = numValueOf5;
                        this.LLILZ = str;
                        this.LLILZIL = num2;
                        this.LLILZLL = str13;
                        this.LLIZ = str2;
                        this.LLIZLLLIL = num3;
                        this.LLJ = num4;
                        this.LLJI = numValueOf6;
                    }
                });
                break;
            case 4:
                C017C c017c4 = this.LJI;
                if (z) {
                    i = 1;
                }
                int iLJ3 = LJ();
                if (str3 != null && str3.length() != 0) {
                    str10 = str3;
                }
                final Integer numValueOf7 = Integer.valueOf(i);
                final Integer numValueOf8 = Integer.valueOf(iLJ3);
                final String str14 = str10;
                c017c4.LIZIZ(new InterfaceC0241006d(num, numValueOf7, numValueOf8, str, num2, str2, num3, num4, str14) { // from class: X.0171
                    public final Integer LL;
                    public final Integer LLILLJJLI;
                    public final Integer LLILLL;
                    public final String LLILZ;
                    public final Integer LLILZIL;
                    public final String LLILZLL;
                    public final Integer LLIZ;
                    public final Integer LLIZLLLIL;
                    public final String LLJ;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof AnonymousClass0171)) {
                            return false;
                        }
                        AnonymousClass0171 anonymousClass0171 = (AnonymousClass0171) obj;
                        return Intrinsics.LJFF(this.LL, anonymousClass0171.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0171.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, anonymousClass0171.LLILLL) && Intrinsics.LJFF(this.LLILZ, anonymousClass0171.LLILZ) && Intrinsics.LJFF(this.LLILZIL, anonymousClass0171.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, anonymousClass0171.LLILZLL) && Intrinsics.LJFF(this.LLIZ, anonymousClass0171.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, anonymousClass0171.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, anonymousClass0171.LLJ);
                    }

                    public final int hashCode() {
                        Integer num5 = this.LL;
                        int iHashCode = (num5 == null ? 0 : num5.hashCode()) * 31;
                        Integer num6 = this.LLILLJJLI;
                        int iHashCode2 = (iHashCode + (num6 == null ? 0 : num6.hashCode())) * 31;
                        Integer num7 = this.LLILLL;
                        int iHashCode3 = (iHashCode2 + (num7 == null ? 0 : num7.hashCode())) * 31;
                        String str15 = this.LLILZ;
                        int iHashCode4 = (iHashCode3 + (str15 == null ? 0 : str15.hashCode())) * 31;
                        Integer num8 = this.LLILZIL;
                        int iHashCode5 = (iHashCode4 + (num8 == null ? 0 : num8.hashCode())) * 31;
                        String str16 = this.LLILZLL;
                        int iHashCode6 = (iHashCode5 + (str16 == null ? 0 : str16.hashCode())) * 31;
                        Integer num9 = this.LLIZ;
                        int iHashCode7 = (iHashCode6 + (num9 == null ? 0 : num9.hashCode())) * 31;
                        Integer num10 = this.LLIZLLLIL;
                        int iHashCode8 = (iHashCode7 + (num10 == null ? 0 : num10.hashCode())) * 31;
                        String str17 = this.LLJ;
                        return iHashCode8 + (str17 != null ? str17.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("sticker_translated_size", this.LL);
                        linkedHashMap.put("sticker_result", this.LLILLJJLI);
                        linkedHashMap.put("sticker_duration", this.LLILLL);
                        linkedHashMap.put("sticker_msg", this.LLILZ);
                        linkedHashMap.put("sticker_error_code", this.LLILZIL);
                        linkedHashMap.put("sticker_hit_cache", this.LLILZLL);
                        linkedHashMap.put("sticker_server_duration", this.LLIZ);
                        linkedHashMap.put("sticker_ailab_duration", this.LLIZLLLIL);
                        linkedHashMap.put("sticker_variant", this.LLJ);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfStickerTranslationEndParams(translatedSize=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", result=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", duration=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(", failureMsg=");
                        sbLIZ.append(this.LLILZ);
                        sbLIZ.append(", errorCode=");
                        sbLIZ.append(this.LLILZIL);
                        sbLIZ.append(", hitCacheType=");
                        sbLIZ.append(this.LLILZLL);
                        sbLIZ.append(", serverDuration=");
                        sbLIZ.append(this.LLIZ);
                        sbLIZ.append(", ailabDuration=");
                        sbLIZ.append(this.LLIZLLLIL);
                        sbLIZ.append(", variant=");
                        sbLIZ.append(this.LLJ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = num;
                        this.LLILLJJLI = numValueOf7;
                        this.LLILLL = numValueOf8;
                        this.LLILZ = str;
                        this.LLILZIL = num2;
                        this.LLILZLL = str2;
                        this.LLIZ = num3;
                        this.LLIZLLLIL = num4;
                        this.LLJ = str14;
                    }
                });
                break;
            case 5:
                C017C c017c5 = this.LJI;
                if (z) {
                    i = 1;
                }
                int iLJ4 = LJ();
                if (str3 != null && str3.length() != 0) {
                    str11 = str3;
                }
                final Integer numValueOf9 = Integer.valueOf(i);
                final Integer numValueOf10 = Integer.valueOf(iLJ4);
                final Integer numValueOf11 = Integer.valueOf(z2 ? 1 : 0);
                c017c5.LIZIZ(new InterfaceC0241006d(str, num, numValueOf9, str2, str11, numValueOf10, num2, num3, num4, numValueOf11) { // from class: X.0170
                    public final Integer LL;
                    public final Integer LLILLJJLI;
                    public final Integer LLILLL;
                    public final String LLILZ;
                    public final Integer LLILZIL;
                    public final String LLILZLL;
                    public final Integer LLIZ;
                    public final Integer LLIZLLLIL;
                    public final Integer LLJ;
                    public final String LLJI;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof AnonymousClass0170)) {
                            return false;
                        }
                        AnonymousClass0170 anonymousClass0170 = (AnonymousClass0170) obj;
                        return Intrinsics.LJFF(this.LL, anonymousClass0170.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0170.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, anonymousClass0170.LLILLL) && Intrinsics.LJFF(this.LLILZ, anonymousClass0170.LLILZ) && Intrinsics.LJFF(this.LLILZIL, anonymousClass0170.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, anonymousClass0170.LLILZLL) && Intrinsics.LJFF(this.LLIZ, anonymousClass0170.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, anonymousClass0170.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, anonymousClass0170.LLJ) && Intrinsics.LJFF(this.LLJI, anonymousClass0170.LLJI);
                    }

                    public final int hashCode() {
                        Integer num5 = this.LL;
                        int iHashCode = (num5 == null ? 0 : num5.hashCode()) * 31;
                        Integer num6 = this.LLILLJJLI;
                        int iHashCode2 = (iHashCode + (num6 == null ? 0 : num6.hashCode())) * 31;
                        Integer num7 = this.LLILLL;
                        int iHashCode3 = (iHashCode2 + (num7 == null ? 0 : num7.hashCode())) * 31;
                        String str15 = this.LLILZ;
                        int iHashCode4 = (iHashCode3 + (str15 == null ? 0 : str15.hashCode())) * 31;
                        Integer num8 = this.LLILZIL;
                        int iHashCode5 = (iHashCode4 + (num8 == null ? 0 : num8.hashCode())) * 31;
                        String str16 = this.LLILZLL;
                        int iHashCode6 = (iHashCode5 + (str16 == null ? 0 : str16.hashCode())) * 31;
                        Integer num9 = this.LLIZ;
                        int iHashCode7 = (iHashCode6 + (num9 == null ? 0 : num9.hashCode())) * 31;
                        Integer num10 = this.LLIZLLLIL;
                        int iHashCode8 = (iHashCode7 + (num10 == null ? 0 : num10.hashCode())) * 31;
                        Integer num11 = this.LLJ;
                        int iHashCode9 = (iHashCode8 + (num11 == null ? 0 : num11.hashCode())) * 31;
                        String str17 = this.LLJI;
                        return iHashCode9 + (str17 != null ? str17.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("photo_title_translated_size", this.LL);
                        linkedHashMap.put("photo_title_result", this.LLILLJJLI);
                        linkedHashMap.put("photo_title_duration", this.LLILLL);
                        linkedHashMap.put("photo_title_msg", this.LLILZ);
                        linkedHashMap.put("photo_title_error_code", this.LLILZIL);
                        linkedHashMap.put("photo_title_hit_cache", this.LLILZLL);
                        linkedHashMap.put("photo_title_server_duration", this.LLIZ);
                        linkedHashMap.put("photo_title_ailab_duration", this.LLIZLLLIL);
                        linkedHashMap.put("photo_title_hit_preload", this.LLJ);
                        linkedHashMap.put("photo_title_variant", this.LLJI);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfPhotoTitleTranslationEndParams(translatedSize=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", result=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", duration=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(", failureMsg=");
                        sbLIZ.append(this.LLILZ);
                        sbLIZ.append(", errorCode=");
                        sbLIZ.append(this.LLILZIL);
                        sbLIZ.append(", hitCacheType=");
                        sbLIZ.append(this.LLILZLL);
                        sbLIZ.append(", serverDuration=");
                        sbLIZ.append(this.LLIZ);
                        sbLIZ.append(", ailabDuration=");
                        sbLIZ.append(this.LLIZLLLIL);
                        sbLIZ.append(", hitPreload=");
                        sbLIZ.append(this.LLJ);
                        sbLIZ.append(", variant=");
                        sbLIZ.append(this.LLJI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = num;
                        this.LLILLJJLI = numValueOf9;
                        this.LLILLL = numValueOf10;
                        this.LLILZ = str;
                        this.LLILZIL = num2;
                        this.LLILZLL = str2;
                        this.LLIZ = num3;
                        this.LLIZLLLIL = num4;
                        this.LLJ = numValueOf11;
                        this.LLJI = str11;
                    }
                });
                break;
            case 6:
                C017C c017c6 = this.LJI;
                if (z) {
                    i = 1;
                }
                final Integer numValueOf12 = Integer.valueOf(i);
                c017c6.LIZIZ(new InterfaceC0241006d(str, numValueOf12) { // from class: X.003g
                    public final String LL;
                    public final Integer LLILLJJLI;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0166003g)) {
                            return false;
                        }
                        C0166003g c0166003g = (C0166003g) obj;
                        return Intrinsics.LJFF(this.LL, c0166003g.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0166003g.LLILLJJLI);
                    }

                    public final int hashCode() {
                        String str15 = this.LL;
                        int iHashCode = (str15 == null ? 0 : str15.hashCode()) * 31;
                        Integer num5 = this.LLILLJJLI;
                        return iHashCode + (num5 != null ? num5.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("coomments_msg", this.LL);
                        linkedHashMap.put("comments_result", this.LLILLJJLI);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfCommentTranslationEndParams(failureMsg=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", result=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str;
                        this.LLILLJJLI = numValueOf12;
                    }
                });
                break;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                C017C c017c7 = this.LJI;
                if (str4 != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(str4);
                }
                if (z) {
                    i = 1;
                }
                final Integer numValueOf13 = Integer.valueOf(i);
                final Integer numValueOf14 = Integer.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0);
                c017c7.LIZIZ(new InterfaceC0241006d(lLJIILIIL, str5, numValueOf13, numValueOf14) { // from class: X.003T
                    public final Long LL;
                    public final String LLILLJJLI;
                    public final Integer LLILLL;
                    public final Integer LLILZ;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C003T)) {
                            return false;
                        }
                        C003T c003t = (C003T) obj;
                        return Intrinsics.LJFF(this.LL, c003t.LL) && Intrinsics.LJFF(this.LLILLJJLI, c003t.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c003t.LLILLL) && Intrinsics.LJFF(this.LLILZ, c003t.LLILZ);
                    }

                    public final int hashCode() {
                        Long l = this.LL;
                        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
                        String str15 = this.LLILLJJLI;
                        int iHashCode2 = (iHashCode + (str15 == null ? 0 : str15.hashCode())) * 31;
                        Integer num5 = this.LLILLL;
                        int iHashCode3 = (iHashCode2 + (num5 == null ? 0 : num5.hashCode())) * 31;
                        Integer num6 = this.LLILZ;
                        return iHashCode3 + (num6 != null ? num6.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("ad_id", this.LL);
                        linkedHashMap.put("creative_id", this.LLILLJJLI);
                        linkedHashMap.put("ads_component_result", this.LLILLL);
                        linkedHashMap.put("ads_component_multi_partial_error", this.LLILZ);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfAdsComponentTranslationEndParams(adId=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", creativeId=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", result=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(", multiPartialError=");
                        sbLIZ.append(this.LLILZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = lLJIILIIL;
                        this.LLILLJJLI = str5;
                        this.LLILLL = numValueOf13;
                        this.LLILZ = numValueOf14;
                    }
                });
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C017C c017c8 = this.LJI;
                if (z) {
                    i = 1;
                }
                final Integer numValueOf15 = Integer.valueOf(i);
                final String etName = enumC207100162g.getEtName();
                c017c8.LIZIZ(new InterfaceC0241006d(numValueOf15, num2, str4, etName, str, str6) { // from class: X.00sr
                    public final String LL;
                    public final Integer LLILLJJLI;
                    public final String LLILLL;
                    public final Integer LLILZ;
                    public final String LLILZIL;
                    public final String LLILZLL;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C218700sr)) {
                            return false;
                        }
                        C218700sr c218700sr = (C218700sr) obj;
                        return Intrinsics.LJFF(this.LL, c218700sr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c218700sr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c218700sr.LLILLL) && Intrinsics.LJFF(this.LLILZ, c218700sr.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c218700sr.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c218700sr.LLILZLL);
                    }

                    public final int hashCode() {
                        String str15 = this.LL;
                        int iHashCode = (str15 == null ? 0 : str15.hashCode()) * 31;
                        Integer num5 = this.LLILLJJLI;
                        int iHashCode2 = (iHashCode + (num5 == null ? 0 : num5.hashCode())) * 31;
                        String str16 = this.LLILLL;
                        int iHashCode3 = (iHashCode2 + (str16 == null ? 0 : str16.hashCode())) * 31;
                        Integer num6 = this.LLILZ;
                        int iHashCode4 = (iHashCode3 + (num6 == null ? 0 : num6.hashCode())) * 31;
                        String str17 = this.LLILZIL;
                        int iHashCode5 = (iHashCode4 + (str17 == null ? 0 : str17.hashCode())) * 31;
                        String str18 = this.LLILZLL;
                        return iHashCode5 + (str18 != null ? str18.hashCode() : 0);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("biz_comp_id", this.LL);
                        linkedHashMap.put("biz_comp_result", this.LLILLJJLI);
                        linkedHashMap.put("biz_comp_scene", this.LLILLL);
                        linkedHashMap.put("biz_comp_error_code", this.LLILZ);
                        linkedHashMap.put("biz_comp_msg", this.LLILZIL);
                        linkedHashMap.put("biz_comp_detected_src_lang", this.LLILZLL);
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PerfBizCompTranslationEndParams(id=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", result=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(", scene=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(", errorCode=");
                        sbLIZ.append(this.LLILZ);
                        sbLIZ.append(", failureMsg=");
                        sbLIZ.append(this.LLILZIL);
                        sbLIZ.append(", detectedSrcLang=");
                        sbLIZ.append(this.LLILZLL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = str4;
                        this.LLILLJJLI = numValueOf15;
                        this.LLILLL = etName;
                        this.LLILZ = num2;
                        this.LLILZIL = str;
                        this.LLILZLL = str6;
                    }
                });
                break;
        }
    }
}
