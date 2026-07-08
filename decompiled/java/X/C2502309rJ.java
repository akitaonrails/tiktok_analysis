package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.music.model.SuggestedQueryList;
import com.ss.android.ugc.aweme.music.model.SuggestedQueryStruct;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09rJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2502309rJ implements InterfaceC1478005qU {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Integer> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
        }
    }

    public C2502309rJ(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void subscribe$0(C2502309rJ c2502309rJ, C09AJ c09aj) {
        C1C7U.LIZ("LottieFileManager@13c.unzipFileObservable$1");
        try {
            if (u.LJIIZILJ(c2502309rJ.s0, ".zip", false)) {
                C2111308Ox.LIZIZ(new C0VSJ(c2502309rJ.s0), new C0VSJ(c2502309rJ.s0.substring(0, a0.LJJJJI(c2502309rJ.s0, ".zip", 0, 6))));
                c09aj.onNext(1);
            } else {
                c09aj.onError(new Throwable("file Path not ended with .zip!"));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c09aj.onError(e);
        }
        C1C7U.LIZIZ("LottieFileManager@13c.unzipFileObservable$1");
    }

    public static final void subscribe$1(C2502309rJ c2502309rJ, C09AJ c09aj) {
        C1C7U.LIZ("LottieFileManager@375d.unzipFileObservable$1");
        try {
            if (u.LJIIZILJ(c2502309rJ.s0, ".zip", false)) {
                C08SA.LIZJ(new C0VSJ(c2502309rJ.s0), new C0VSJ(c2502309rJ.s0.substring(0, a0.LJJJJI(c2502309rJ.s0, ".zip", 0, 6))));
                c09aj.onNext(1);
            } else {
                c09aj.onError(new Throwable("file Path not ended with .zip!"));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c09aj.onError(e);
        }
        C1C7U.LIZIZ("LottieFileManager@375d.unzipFileObservable$1");
    }

    public static final void subscribe$2(C2502309rJ c2502309rJ, C09AJ c09aj) {
        C1C7U.LIZ("AISuggestedQueryManager@ba11.getAISuggestedQueries$1");
        ChooseMusicApi.LIZ.LJIIZILJ(c2502309rJ.s0).LIZLLL(new InterfaceC2385309Wh() { // from class: X.09Up
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                Object obj;
                SuggestedQueryStruct suggestedQueryStruct;
                C1C7U.LIZ("AISuggestedQueryManager@ba11.getAISuggestedQueries$1$task$1");
                SuggestedQueryList suggestedQueryList = (SuggestedQueryList) c15o7.LJIIL();
                if (!c15o7.LJIILIIL() && !c15o7.LJIILL() && c15o7.LJIILJJIL()) {
                    if (suggestedQueryList == null || (suggestedQueryStruct = suggestedQueryList.searchQuery) == null || (obj = suggestedQueryStruct.searchQueries) == null) {
                        obj = C13BV.INSTANCE;
                    }
                } else {
                    obj = null;
                }
                C1C7U.LIZIZ("AISuggestedQueryManager@ba11.getAISuggestedQueries$1$task$1");
                return obj;
            }
        }).LIZLLL(new C2501509rB((C19482611Ke) c09aj, 23));
        C1C7U.LIZIZ("AISuggestedQueryManager@ba11.getAISuggestedQueries$1");
    }
}
