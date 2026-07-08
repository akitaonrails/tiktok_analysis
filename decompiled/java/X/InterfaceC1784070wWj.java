package X;

import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0wWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1784070wWj {
    void LIZ(EnumC1784010wWd enumC1784010wWd);

    void LIZIZ(C1784040wWg c1784040wWg);

    void LIZJ(List<IMQuickReply> list);

    List<C1784040wWg> getData();

    void setActionListener(Function2<? super EnumC1784170wWt, ? super IMQuickReply, Unit> function2);

    void setData(List<C1784040wWg> list);

    void setOnViewAttachLister(Function0<Unit> function0);
}
