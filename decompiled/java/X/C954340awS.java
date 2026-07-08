package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupResult;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0awS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954340awS extends AbstractC957580b1g<C954600aws, InviteGroupResult> {
    public final C784440Upu LIZIZ;
    public final long LIZJ;
    public final InterfaceC954310awP LIZLLL;
    public final InterfaceC954190awD LJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C954340awS(C784440Upu c784440Upu, long j, C964640bD4 c964640bD4) {
        super(null);
        C0TW8 c0tw8 = C0TW8.LIZ;
        this.LIZIZ = c784440Upu;
        this.LIZJ = j;
        this.LIZLLL = c0tw8;
        this.LJ = c964640bD4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC957580b1g
    public final boolean LIZ(C954600aws c954600aws, AbstractC915270ZvR abstractC915270ZvR, InterfaceC920680a4A<InviteGroupResult> interfaceC920680a4A) {
        Integer num;
        C954600aws c954600aws2 = c954600aws;
        int iIntValue = 0;
        if (!Intrinsics.LJFF(abstractC915270ZvR, C915280ZvS.LIZ)) {
            AbstractC957580b1g<DATA, RESULT> abstractC957580b1g = this.LIZ;
            if (abstractC957580b1g == 0) {
                return false;
            }
            return abstractC957580b1g.LIZ((DATA) c954600aws2, abstractC915270ZvR, (InterfaceC920680a4A<RESULT>) interfaceC920680a4A);
        }
        Map<String, Object> map = c954600aws2.LJIIIIZZ;
        if (map != null) {
            Object obj = map.get("BATTLE_INVITE_TYPE_DIRECT_BATTLE");
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                iIntValue = num.intValue();
            }
        }
        C975600bUk c975600bUk = new C975600bUk(iIntValue, EnumC919170a1j.MATCH_TYPE_1V1, Collections.singletonList(Long.valueOf(this.LIZJ)), Collections.singletonList(Long.valueOf(c954600aws2.LIZIZ)), new C954360awU(new AwS594S0100000_15(interfaceC920680a4A, (InterfaceC920680a4A<InviteGroupResult>) 819), new AwS224S0300000_15(this, (C954340awS) c954600aws2, (C954600aws) interfaceC920680a4A, (InterfaceC920680a4A<InviteGroupResult>) 50)), new C957560b1e(c954600aws2.LJFF.sourceType, c954600aws2.LIZJ));
        InterfaceC954310awP interfaceC954310awP = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sent battle invite to Match service. request=");
        sbLIZ.append(c975600bUk);
        interfaceC954310awP.d("QuickBattleInvite", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.LIZIZ(c975600bUk);
        return true;
    }
}
