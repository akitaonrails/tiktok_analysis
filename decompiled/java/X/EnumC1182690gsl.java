package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gsl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class EnumC1182690gsl {
    public static final EnumC1182690gsl ANSWER_QUESTION;
    public static final EnumC1182690gsl HOME_PAGE;
    public static final /* synthetic */ EnumC1182690gsl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1182690gsl POI_PICK;

    public EnumC1182690gsl() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1182690gsl> getEntries() {
        return LLILLJJLI;
    }

    public void closePoiQuizCard(C1182710gsn c1182710gsn, boolean z) {
    }

    public void onClickBottomBtn(C1182710gsn c1182710gsn) {
    }

    public void onClickMapIconBtn(C1182710gsn c1182710gsn) {
    }

    public void onError(C1182710gsn c1182710gsn) {
    }

    public void onMarkerHighlight(C1182710gsn c1182710gsn, String str) {
    }

    public void onPoiListDataLoaded(C1182710gsn c1182710gsn, String str) {
    }

    public void onPoiListDataStart(C1182710gsn c1182710gsn) {
    }

    public void onRetry(C1182710gsn c1182710gsn) {
    }

    public abstract String toMobStateStr();

    static {
        EnumC1182690gsl enumC1182690gsl = new EnumC1182690gsl() { // from class: X.0gso
            @Override // X.EnumC1182690gsl
            public final String toMobStateStr() {
                return "initial";
            }

            @Override // X.EnumC1182690gsl
            public final void onClickBottomBtn(C1182710gsn c1182710gsn) {
                c1182710gsn.LIZIZ(EnumC1182690gsl.POI_PICK);
            }

            @Override // X.EnumC1182690gsl
            public final void onError(C1182710gsn c1182710gsn) {
                c1182710gsn.LIZIZ(this);
            }

            @Override // X.EnumC1182690gsl
            public final void onRetry(C1182710gsn c1182710gsn) {
                c1182710gsn.LIZIZ(this);
            }
        };
        HOME_PAGE = enumC1182690gsl;
        EnumC1182690gsl enumC1182690gsl2 = new EnumC1182690gsl() { // from class: X.0gsp
            @Override // X.EnumC1182690gsl
            public final String toMobStateStr() {
                return "initial";
            }

            @Override // X.EnumC1182690gsl
            public final void onClickBottomBtn(C1182710gsn c1182710gsn) {
                c1182710gsn.LIZIZ(EnumC1182690gsl.ANSWER_QUESTION);
            }

            @Override // X.EnumC1182690gsl
            public final void onClickMapIconBtn(C1182710gsn c1182710gsn) {
                c1182710gsn.LIZIZ(this);
            }

            @Override // X.EnumC1182690gsl
            public final void onError(C1182710gsn c1182710gsn) {
                c1182710gsn.LIZIZ(this);
            }

            @Override // X.EnumC1182690gsl
            public final void onRetry(C1182710gsn c1182710gsn) {
                c1182710gsn.LIZIZ(this);
            }

            @Override // X.EnumC1182690gsl
            public final void onMarkerHighlight(C1182710gsn c1182710gsn, String str) {
                c1182710gsn.LIZIZ(this);
            }
        };
        POI_PICK = enumC1182690gsl2;
        EnumC1182690gsl enumC1182690gsl3 = new EnumC1182690gsl() { // from class: X.0gsm
            @Override // X.EnumC1182690gsl
            public final String toMobStateStr() {
                return "initial";
            }

            /* JADX WARN: Removed duplicated region for block: B:61:0x00d1 A[PHI: r2
              0x00d1: PHI (r2v5 com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem) = 
              (r2v4 com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem)
              (r2v8 com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem)
              (r2v11 com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem)
             binds: [B:47:0x0095, B:54:0x00ba, B:60:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.EnumC1182690gsl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void closePoiQuizCard(X.C1182710gsn r11, boolean r12) {
                /*
                    Method dump skipped, instruction units count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1182700gsm.closePoiQuizCard(X.0gsn, boolean):void");
            }
        };
        ANSWER_QUESTION = enumC1182690gsl3;
        EnumC1182690gsl[] enumC1182690gslArr = {enumC1182690gsl, enumC1182690gsl2, enumC1182690gsl3};
        LL = enumC1182690gslArr;
        LLILLJJLI = new C2254308sP(enumC1182690gslArr);
    }

    public static EnumC1182690gsl[] values() {
        return (EnumC1182690gsl[]) LL.clone();
    }

    public static EnumC1182690gsl valueOf(String str) {
        return (EnumC1182690gsl) C08FF.LIZ(EnumC1182690gsl.class, str);
    }

    public EnumC1182690gsl(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
