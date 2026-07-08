package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QN7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QN7 extends C0OHF {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        C19EG c19egLIZIZ;
        C0QN8 c0qn8 = (C0QN8) xBaseParamModel;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null && (c19egLIZIZ = C640260P9k.LIZIZ(view)) != null && c19egLIZIZ.getBaseContext() != null) {
                ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
                C653660PkS c653660PkS = new C653660PkS();
                c653660PkS.LJFF = ((C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ()).LLIZLLLIL;
                c653660PkS.LJIIJJI = c0qn8.getImprId();
                c653660PkS.LJJJJLI = c0qn8.getEnterGroupId();
                c653660PkS.LJI = c0qn8.getSearchPosition();
                Word word = new Word();
                word.setWordPosition(c0qn8.getWordsPosition().intValue());
                word.setId(c0qn8.getGroupId());
                word.setWord(c0qn8.getWordsContent());
                String reportType = c0qn8.getReportType();
                if (reportType == null) {
                    reportType = C0QN9.CS.getReportType();
                }
                for (C0QN9 c0qn9 : C0QN9.values()) {
                    if (Intrinsics.LJFF(c0qn9.getReportType(), reportType)) {
                        C670730QSp.LIZIZ(view, view.getContext(), c653660PkS, word, c0qn8.getWordsSource(), null, c0qn9, null, null, null);
                        return;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "search open schema fail";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
