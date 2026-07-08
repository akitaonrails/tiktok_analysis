package Y;

import X.AnonymousClass0956;
import X.C09JN;
import X.C0PEM;
import X.C1164330gP9;
import X.C1440005kM;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C324040Cn4;
import X.C589140N8u;
import X.InterfaceC420801kM;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.live.liveshare.LiveShareStickerViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class AfS33S1300000_4 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void accept$0(AfS33S1300000_4 afS33S1300000_4, Object obj) {
        Object obj2;
        long jLongValue;
        Long lValueOf;
        C1C7U.LIZ("LiveShareStickerViewModel@53d1.getRoomInfoByRoomId$3");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            obj2 = baseResponse.data;
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getRoomInfoByRoomId success,  ownerName: ");
            sbLIZ.append(afS33S1300000_4.s0);
            sbLIZ.append(", json info : ");
            Room room = (Room) baseResponse.data;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
            ((LiveShareStickerViewModel) afS33S1300000_4.l1).LLILLJJLI.setValue(baseResponse.data);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getRoomInfoByRoomId empty: ");
            sbLIZ2.append((Long) afS33S1300000_4.l2);
            sbLIZ2.append(",  ownerName: ");
            sbLIZ2.append(afS33S1300000_4.s0);
            C20441214yg.LJ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ2));
            ((LiveShareStickerViewModel) afS33S1300000_4.l1).LLILLJJLI.setValue(null);
        }
        if (!Intrinsics.LJFF((Boolean) afS33S1300000_4.l3, Boolean.TRUE)) {
            LiveShareStickerViewModel liveShareStickerViewModel = (LiveShareStickerViewModel) afS33S1300000_4.l1;
            Long l = (Long) afS33S1300000_4.l2;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            String str = afS33S1300000_4.s0;
            AnonymousClass0956 anonymousClass0956 = liveShareStickerViewModel.LLILLL;
            if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                liveShareStickerViewModel.LLILLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C324040Cn4(liveShareStickerViewModel, jLongValue, str, null), 3);
            }
        }
        C1C7U.LIZIZ("LiveShareStickerViewModel@53d1.getRoomInfoByRoomId$3");
    }

    public static final void accept$1(AfS33S1300000_4 afS33S1300000_4, Object obj) {
        C1C7U.LIZ("PlaylistManageRepo@fa57.deletePlaylist$1");
        com.ss.android.ugc.aweme.base.api.BaseResponse baseResponse = (com.ss.android.ugc.aweme.base.api.BaseResponse) obj;
        if (baseResponse.status_code == 0) {
            Function0 function0 = (Function0) afS33S1300000_4.l1;
            if (function0 != null) {
                function0.invoke();
            }
            C1440005kM.LIZ(new C1164330gP9(null, afS33S1300000_4.s0));
            C589140N8u.LJ.LJIJI(afS33S1300000_4.s0, "success");
        } else {
            Function1 function1 = (Function1) afS33S1300000_4.l2;
            if (function1 != null) {
                function1.invoke(new Exception(baseResponse.message));
            }
            C589140N8u c589140N8u = C589140N8u.LJ;
            String str = afS33S1300000_4.s0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed, error message: ");
            sbLIZ.append(baseResponse.message);
            c589140N8u.LJIJI(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS33S1300000_4.l3).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("PlaylistManageRepo@fa57.deletePlaylist$1");
    }

    public AfS33S1300000_4(String str, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
