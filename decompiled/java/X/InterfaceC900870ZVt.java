package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import java.util.List;

/* JADX INFO: renamed from: X.0ZVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC900870ZVt<T extends BaseTemplate> {
    EnumC900890ZVv LIZ();

    List<InterfaceC900840ZVq> LIZIZ(Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, T t, boolean z, String str, boolean z2);

    C0ZW8 LIZJ(Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, T t);

    List<InterfaceC900840ZVq> LIZLLL();

    T LJ(C869590Y9l c869590Y9l);

    boolean LJFF(C869590Y9l c869590Y9l);

    List<String> LJI(C869590Y9l c869590Y9l, T t);

    String LJII(T t);

    boolean LJIIIIZZ();

    C0ZW4 LJIIIZ(C869590Y9l c869590Y9l, boolean z);

    void LJIIJ(View view, Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, BaseTemplate baseTemplate);

    C2242281CpW LJIIJJI(T t);

    ResolutionComponent LJIIL(C869590Y9l c869590Y9l, T t);

    boolean LJIILIIL();

    String getScene();
}
