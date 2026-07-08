package X;

import com.ss.android.ugc.profile.business.ur.platform.HeaderCTASocialEntranceComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0idO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1250040idO extends C2217421BqW implements Function1<Integer, Unit> {
    public C1250040idO(Object obj) {
        super(1, obj, HeaderCTASocialEntranceComponent.class, "updateIcon", "updateIcon(Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) this.receiver;
        abstractC738140SxQ.getClass();
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = abstractC738140SxQ.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.N90(num2, str);
        }
        return Unit.LIZ;
    }
}
