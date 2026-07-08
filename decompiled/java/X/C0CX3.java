package X;

import Y.ARunnableS104S0100000_4;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CX3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CX3 implements C0CX5 {
    public static final C0CX3 LIZ = new C0CX3();

    @Override // X.C0CX5
    public final void LIZ(List<? extends Aweme> list) {
        C0CX8.LIZIZ(this, list);
    }

    @Override // X.C0CX9
    public final void LIZIZ(String str) {
        Long lValueOf;
        UserStory userStory;
        List<Aweme> listLJJLIIIJ;
        UserStory userStory2;
        List<Aweme> stories;
        UserStory userStory3;
        if (((Boolean) C0AWA.LIZ.getValue()).booleanValue()) {
            C0CXA.LIZ(str, C0CX6.LIZ);
            return;
        }
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        Aweme awemeLJIIIZ = c1618440sDa.LJJLIIIJLJLI().LJIIIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadStory: uid = ");
        sbLIZ.append(str);
        sbLIZ.append(", curPosition = ");
        Integer numValueOf = null;
        if (awemeLJIIIZ != null && (userStory3 = awemeLJIIIZ.getUserStory()) != null) {
            lValueOf = Long.valueOf(userStory3.getCurrentPosition());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(",size =  ");
        if (awemeLJIIIZ != null && (userStory2 = awemeLJIIIZ.getUserStory()) != null && (stories = userStory2.getStories()) != null) {
            numValueOf = Integer.valueOf(stories.size());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (awemeLJIIIZ == null || (userStory = awemeLJIIIZ.getUserStory()) == null || userStory.getStories() == null || (listLJJLIIIJ = c1618440sDa.LJJLIIIJ(((Number) C0BNY.LIZ.getValue()).intValue(), awemeLJIIIZ)) == null) {
            return;
        }
        for (Aweme aweme : listLJJLIIIJ) {
            if (aweme != null) {
                C823050WQl.LIZLLL().execute(new ARunnableS104S0100000_4(aweme, 86));
            }
        }
    }

    @Override // X.C0CX5
    public final List LIZJ(final Integer num, final List list) {
        int iIntValue;
        if (!C0CN5.LJII()) {
            C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0CX2
                public final String LL = C0XQ7.LJFF().getCurUserId();

                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                    C1602200rnO c1602200rnO3 = c1602200rnO2;
                    if (!Intrinsics.LJFF(this.LL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                    } else {
                        if (!c1602200rnO3.LIZJ()) {
                            return;
                        }
                        C0CX3.LIZ.LIZJ(num, list);
                        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                    }
                }
            });
            return null;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = ((Number) C0AW7.LIZ.getValue()).intValue();
        }
        return C0CX8.LIZ(list, Integer.valueOf(iIntValue));
    }
}
