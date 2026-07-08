package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1586780rOW extends InterfaceC1584770rLH {
    ArrayList<Integer> LIZ();

    void LIZJ();

    CopyOnWriteArrayList<SingleTabCounter> LIZLLL();

    void LJ(Aweme aweme, List list);

    void LJFF(Throwable th, EnumC1586970rOp enumC1586970rOp);

    void LJI(boolean z);

    void LJII();

    C1582080rGw LJIIIIZZ();

    ArrayList<Integer> LJIIIZ();

    void LJIIJ(NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp);

    C1586930rOl LJIIJJI();

    void LJIIL(String str, String str2);

    ArrayList LJIILIIL();

    InterfaceC1584860rLQ LJIILJJIL();

    void LJIILL(String str);

    ArrayList<Integer> LJIILLIIL(String str);

    boolean LJIIZILJ();

    Pair<Boolean, String> LJIJ(EnumC1586970rOp enumC1586970rOp);

    int LJIJI(String str);

    CopyOnWriteArrayList<SingleTabCounter> LJIJJ();

    boolean LJIJJLI();

    int LJIL(String str);

    C1587230rPF getSocialTabNoticeData();

    void removeRedDotByUid(String str, EnumC1392960mLu enumC1392960mLu);
}
