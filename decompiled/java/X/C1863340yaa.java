package X;

import com.ss.android.ugc.aweme.tako.ccl.model.ActionDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.BotDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863340yaa {
    public Integer LJII;
    public Map<String, String> LJIIJ;
    public boolean LJIIJJI;
    public final ArrayList<Message> LIZ = new ArrayList<>();
    public final C1863810ybL LIZIZ = new C1863810ybL(null);
    public final C20242614Im LIZJ = new C20242614Im(null);
    public final C1863220yaO LIZLLL = new C1863220yaO(0);
    public final C1861790yY5 LJ = new C1861790yY5(0);
    public final C1861800yY6 LJFF = new C1861800yY6(null);
    public final C144L LJI = new C144L(null);
    public final ActionDoc LJIIIIZZ = new ActionDoc(0, "");
    public final BotDoc LJIIIZ = new BotDoc(0, "", -1);

    public final void LIZ(Function1<? super Message, Unit> function1) {
        Message message = new Message(null, null, null, null, null, null, false, null, 0L, 0L, null, 0, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 0, null, 0L, 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -1, 2097151, null);
        function1.invoke(message);
        this.LIZ.add(message);
    }

    public final void LIZIZ(Function1<? super C1861790yY5, Unit> function1) {
        function1.invoke(this.LJ);
    }
}
