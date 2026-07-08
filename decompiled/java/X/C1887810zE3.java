package X;

import com.ss.android.ugc.aweme.inbox.shop.ShopFullMigrationWidget;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zE3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1887810zE3 extends C2217421BqW implements Function0<Unit> {
    public C1887810zE3(Object obj) {
        super(0, obj, ShopFullMigrationWidget.class, "clearWidget", "clearWidget()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ShopFullMigrationWidget shopFullMigrationWidget = (ShopFullMigrationWidget) this.receiver;
        ((ArrayList) shopFullMigrationWidget.LLJ).clear();
        shopFullMigrationWidget.Co(C1889340zGW.LIZ);
        return Unit.LIZ;
    }
}
