package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.UserInteractionRecord;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.069T, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C069T extends C09AY implements Function0<C06HX> {
    public C069T() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.06HX] */
    @Override // kotlin.jvm.functions.Function0
    public final C06HX invoke() {
        return new C06F1() { // from class: X.06HX
            @Override // X.C06F1
            public final Pair<Boolean, UserInteractionRecord> LIZIZ(UserInteractionRecord userInteractionRecord) {
                return ((C06HY) C06HZ.LIZ.getValue()).LIZIZ(userInteractionRecord);
            }

            @Override // X.C06F1
            public final void LIZLLL(List<UserInteractionRecord> list) {
                ((C06HY) C06HZ.LIZ.getValue()).LIZLLL(list);
            }

            @Override // X.C06F1
            public final List<UserInteractionRecord> LIZJ(int i, List<? extends C06G4> list) {
                return ((C06HY) C06HZ.LIZ.getValue()).LIZJ(i, list);
            }

            @Override // X.C06F1
            public final UserInteractionRecord LIZ(String str, C06G4 c06g4, EnumC1581606He enumC1581606He) {
                return ((C06HY) C06HZ.LIZ.getValue()).LIZ(str, c06g4, enumC1581606He);
            }
        };
    }
}
